package com.ankamagames.wakfu.client.core.game.characterInfo.occupation;

import org.apache.log4j.*;
import com.ankamagames.wakfu.client.ui.protocol.frame.*;
import com.ankamagames.wakfu.common.game.skill.*;
import com.ankamagames.wakfu.client.core.game.skill.*;
import com.ankamagames.baseImpl.graphics.alea.mobile.*;
import com.ankamagames.wakfu.common.game.characterInfo.*;
import com.ankamagames.wakfu.client.core.game.actor.*;
import com.ankamagames.framework.kernel.core.maths.*;
import com.ankamagames.wakfu.client.network.protocol.message.game.clientToServer.occupation.*;
import com.ankamagames.wakfu.client.core.*;
import com.ankamagames.framework.kernel.core.common.message.*;

public class PlantOccupation extends AbstractOccupation
{
    protected static final Logger m_logger;
    private ActionVisual m_visual;
    private long m_duration;
    private int m_craftId;
    private final Point3 m_targetPosition;
    
    public PlantOccupation(final int x, final int y) {
        super();
        this.m_targetPosition = new Point3(x, y);
    }
    
    public long getDuration() {
        return this.m_duration;
    }
    
    public void setDuration(final long duration) {
        this.m_duration = duration;
    }
    
    public void setCraftId(final int craftId) {
        this.m_craftId = craftId;
    }
    
    @Override
    public short getOccupationTypeId() {
        return 2;
    }
    
    @Override
    public boolean isAllowed() {
        return true;
    }
    
    @Override
    public void begin() {
        PlantOccupation.m_logger.info((Object)"Lancement occupation PLANT");
        UISeedInteractionFrame.getInstance().deleteTimeOut();
        this.m_localPlayer.cancelCurrentOccupation(false, true);
        final ActionVisual actionVisual = ActionVisualManager.getInstance().get(this.m_visual.getVisualId());
        if (actionVisual != null) {
            final CharacterActor actor = this.m_localPlayer.getActor();
            final Direction8 neededDirection = actor.getWorldCoordinates().getDirection4To(this.m_targetPosition);
            actor.setDirection(neededDirection);
            ActionVisualHelper.applyActionVisual(actor, actionVisual);
        }
        this.m_localPlayer.getActionInProgress().startSeedAction(this.m_duration, this.m_craftId);
        this.m_localPlayer.setCurrentOccupation(this);
    }
    
    @Override
    public boolean cancel(final boolean fromServer, final boolean sendMessage) {
        this.finishOccupation((byte)3, sendMessage);
        return true;
    }
    
    @Override
    public boolean finish() {
        this.finishOccupation((byte)2, true);
        return true;
    }
    
    private void finishOccupation(final byte modifType, final boolean sendMessage) {
        UISeedInteractionFrame.getInstance().deleteTimeOut();
        if (sendMessage) {
            final OccupationModificationInformationMessage netMsg = new OccupationModificationInformationMessage();
            netMsg.setModificationType(modifType);
            netMsg.setOccupationType((short)2);
            WakfuGameEntity.getInstance().getNetworkEntity().sendMessage(netMsg);
        }
        final CharacterActor localActor = this.m_localPlayer.getActor();
        if (localActor.getCurrentPath() == null) {
            ActionVisualHelper.applyActionVisual(localActor, this.m_visual, true);
        }
        PlantOccupation.m_logger.info((Object)"On termine l'occupation PLANT");
        this.m_localPlayer.getActionInProgress().endAction();
    }
    
    public void setVisual(final ActionVisual visual) {
        this.m_visual = visual;
    }
    
    static {
        m_logger = Logger.getLogger((Class)PlantOccupation.class);
    }
}

package org.yaml.snakeyaml.emitter;

import org.yaml.snakeyaml.events.*;
import java.io.*;

public interface Emitable
{
    void emit(Event p0) throws IOException;
}

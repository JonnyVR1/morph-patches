package p149l;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface pe3 {
    void getBox(WritableByteChannel writableByteChannel) throws IOException;

    o06 getParent();

    long getSize();

    String getType();

    void setParent(o06 o06Var);
}

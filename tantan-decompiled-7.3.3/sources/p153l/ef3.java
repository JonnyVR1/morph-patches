package p153l;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface ef3 {
    void getBox(WritableByteChannel writableByteChannel) throws IOException;

    t16 getParent();

    long getSize();

    String getType();

    void setParent(t16 t16Var);
}

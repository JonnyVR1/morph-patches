package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class zoj0 extends vi2 {

    /* JADX INFO: renamed from: e */
    private static Logger f204126e = Logger.getLogger(zoj0.class.getName());

    /* JADX INFO: renamed from: d */
    private ByteBuffer f204127d;

    @Override // p149l.vi2
    /* JADX INFO: renamed from: e */
    public void mo106861e(ByteBuffer byteBuffer) throws IOException {
        this.f204127d = (ByteBuffer) byteBuffer.slice().limit(m198493c());
    }

    @Override // p149l.vi2
    public String toString() {
        return "UnknownDescriptor{tag=" + this.f181547a + ", sizeOfInstance=" + this.f181548b + ", data=" + this.f204127d + '}';
    }
}

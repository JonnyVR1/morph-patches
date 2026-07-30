package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class cyj0 extends cj2 {

    /* JADX INFO: renamed from: e */
    private static Logger f84384e = Logger.getLogger(cyj0.class.getName());

    /* JADX INFO: renamed from: d */
    private ByteBuffer f84385d;

    @Override // p153l.cj2
    /* JADX INFO: renamed from: e */
    public void mo98560e(ByteBuffer byteBuffer) throws IOException {
        this.f84385d = (ByteBuffer) byteBuffer.slice().limit(m110049c());
    }

    @Override // p153l.cj2
    public String toString() {
        return "UnknownDescriptor{tag=" + this.f82096a + ", sizeOfInstance=" + this.f82097b + ", data=" + this.f84385d + '}';
    }
}

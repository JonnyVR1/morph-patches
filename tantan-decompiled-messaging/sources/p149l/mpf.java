package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
@eud(tags = {19})
public class mpf extends vi2 {

    /* JADX INFO: renamed from: d */
    byte[] f135044d;

    @Override // p149l.vi2
    /* JADX INFO: renamed from: e */
    public void mo106861e(ByteBuffer byteBuffer) throws IOException {
        if (m198491a() > 0) {
            byte[] bArr = new byte[m198491a()];
            this.f135044d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // p149l.vi2
    public String toString() {
        StringBuilder sb = new StringBuilder("ExtensionDescriptor{bytes=");
        byte[] bArr = this.f135044d;
        sb.append(bArr == null ? "null" : qzk.m177232a(bArr));
        sb.append('}');
        return sb.toString();
    }
}

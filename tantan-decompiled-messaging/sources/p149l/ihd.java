package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@eud(tags = {5})
public class ihd extends vi2 {

    /* JADX INFO: renamed from: d */
    byte[] f113232d;

    @Override // p149l.vi2
    /* JADX INFO: renamed from: e */
    public void mo106861e(ByteBuffer byteBuffer) throws IOException {
        int i = this.f181548b;
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.f113232d = bArr;
            byteBuffer.get(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f113232d, ((ihd) obj).f113232d);
    }

    public int hashCode() {
        byte[] bArr = this.f113232d;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    @Override // p149l.vi2
    public String toString() {
        StringBuilder sb = new StringBuilder("DecoderSpecificInfo{bytes=");
        byte[] bArr = this.f113232d;
        sb.append(bArr == null ? "null" : qzk.m177232a(bArr));
        sb.append('}');
        return sb.toString();
    }
}

package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@svd(tags = {5})
public class oid extends cj2 {

    /* JADX INFO: renamed from: d */
    byte[] f147524d;

    @Override // p153l.cj2
    /* JADX INFO: renamed from: e */
    public void mo98560e(ByteBuffer byteBuffer) throws IOException {
        int i = this.f82097b;
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.f147524d = bArr;
            byteBuffer.get(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f147524d, ((oid) obj).f147524d);
    }

    public int hashCode() {
        byte[] bArr = this.f147524d;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    @Override // p153l.cj2
    public String toString() {
        StringBuilder sb = new StringBuilder("DecoderSpecificInfo{bytes=");
        byte[] bArr = this.f147524d;
        sb.append(bArr == null ? "null" : g2l.m128633a(bArr));
        sb.append('}');
        return sb.toString();
    }
}

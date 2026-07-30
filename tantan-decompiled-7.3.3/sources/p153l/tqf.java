package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
@svd(tags = {19})
public class tqf extends cj2 {

    /* JADX INFO: renamed from: d */
    byte[] f175704d;

    @Override // p153l.cj2
    /* JADX INFO: renamed from: e */
    public void mo98560e(ByteBuffer byteBuffer) throws IOException {
        if (m110047a() > 0) {
            byte[] bArr = new byte[m110047a()];
            this.f175704d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // p153l.cj2
    public String toString() {
        StringBuilder sb = new StringBuilder("ExtensionDescriptor{bytes=");
        byte[] bArr = this.f175704d;
        sb.append(bArr == null ? "null" : g2l.m128633a(bArr));
        sb.append('}');
        return sb.toString();
    }
}

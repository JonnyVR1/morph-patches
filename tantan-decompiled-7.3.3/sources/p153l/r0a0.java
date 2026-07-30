package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
@svd(tags = {20})
public class r0a0 extends cj2 {

    /* JADX INFO: renamed from: d */
    int f160602d;

    @Override // p153l.cj2
    /* JADX INFO: renamed from: e */
    public void mo98560e(ByteBuffer byteBuffer) throws IOException {
        this.f160602d = y0q.m213898n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f160602d == ((r0a0) obj).f160602d;
    }

    public int hashCode() {
        return this.f160602d;
    }

    @Override // p153l.cj2
    public String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.f160602d) + '}';
    }
}

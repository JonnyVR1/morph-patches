package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
@svd(tags = {6})
public class ctd0 extends cj2 {

    /* JADX INFO: renamed from: d */
    int f83688d;

    @Override // p153l.cj2
    /* JADX INFO: renamed from: e */
    public void mo98560e(ByteBuffer byteBuffer) throws IOException {
        this.f83688d = y0q.m213898n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f83688d == ((ctd0) obj).f83688d;
    }

    public int hashCode() {
        return this.f83688d;
    }

    @Override // p153l.cj2
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.f83688d + '}';
    }
}

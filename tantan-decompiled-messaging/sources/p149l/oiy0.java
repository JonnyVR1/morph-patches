package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class oiy0 extends zku0 {

    /* JADX INFO: renamed from: i */
    @Nullable
    public int[] f144207i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public int[] f144208j;

    @Override // p149l.qju0
    /* JADX INFO: renamed from: a */
    public final void mo132014a(ByteBuffer byteBuffer) {
        int[] iArr = this.f144208j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM219206d = m219206d(((iLimit - iPosition) / this.f203569b.f102819d) * this.f203570c.f102819d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM219206d.putShort(byteBuffer.getShort(i + i + iPosition));
            }
            iPosition += this.f203569b.f102819d;
        }
        byteBuffer.position(iLimit);
        byteBufferM219206d.flip();
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: c */
    public final ghu0 mo150391c(ghu0 ghu0Var) throws zzds {
        int[] iArr = this.f144207i;
        if (iArr == null) {
            return ghu0.f102815e;
        }
        if (ghu0Var.f102818c != 2) {
            throw new zzds("Unhandled input format:", ghu0Var);
        }
        boolean z = ghu0Var.f102817b != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new ghu0(ghu0Var.f102816a, length, 2) : ghu0.f102815e;
            }
            int i2 = iArr[i];
            if (i2 >= ghu0Var.f102817b) {
                throw new zzds("Unhandled input format:", ghu0Var);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: e */
    public final void mo150392e() {
        this.f144208j = this.f144207i;
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: g */
    public final void mo150394g() {
        this.f144208j = null;
        this.f144207i = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m164583i(@Nullable int[] iArr) {
        this.f144207i = iArr;
    }
}

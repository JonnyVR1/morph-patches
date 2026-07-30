package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class ury0 extends fuu0 {

    /* JADX INFO: renamed from: i */
    @Nullable
    public int[] f180717i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public int[] f180718j;

    @Override // p153l.wsu0
    /* JADX INFO: renamed from: a */
    public final void mo165047a(ByteBuffer byteBuffer) {
        int[] iArr = this.f180718j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM127543d = m127543d(((iLimit - iPosition) / this.f100948b.f138279d) * this.f100949c.f138279d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM127543d.putShort(byteBuffer.getShort(i + i + iPosition));
            }
            iPosition += this.f100948b.f138279d;
        }
        byteBuffer.position(iLimit);
        byteBufferM127543d.flip();
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: c */
    public final mqu0 mo127542c(mqu0 mqu0Var) throws zzds {
        int[] iArr = this.f180717i;
        if (iArr == null) {
            return mqu0.f138275e;
        }
        if (mqu0Var.f138278c != 2) {
            throw new zzds("Unhandled input format:", mqu0Var);
        }
        boolean z = mqu0Var.f138277b != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new mqu0(mqu0Var.f138276a, length, 2) : mqu0.f138275e;
            }
            int i2 = iArr[i];
            if (i2 >= mqu0Var.f138277b) {
                throw new zzds("Unhandled input format:", mqu0Var);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: e */
    public final void mo127544e() {
        this.f180718j = this.f180717i;
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: g */
    public final void mo127546g() {
        this.f180718j = null;
        this.f180717i = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m197670i(@Nullable int[] iArr) {
        this.f180717i = iArr;
    }
}

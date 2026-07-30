package p153l;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final class ulx0 extends wlx0 {
    public ulx0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: a */
    public final byte mo196629a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: b */
    public final double mo196630b(Object obj, long j) {
        return Double.longBitsToDouble(this.f189747a.getLong(obj, j));
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: c */
    public final float mo196631c(Object obj, long j) {
        return Float.intBitsToFloat(this.f189747a.getInt(obj, j));
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: d */
    public final void mo196632d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: e */
    public final void mo196633e(Object obj, long j, boolean z) {
        if (xlx0.f195031i) {
            xlx0.m211694g(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            xlx0.m211695h(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: f */
    public final void mo196634f(Object obj, long j, byte b) {
        if (xlx0.f195031i) {
            xlx0.m211694g(obj, j, b);
        } else {
            xlx0.m211695h(obj, j, b);
        }
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: g */
    public final void mo196635g(Object obj, long j, double d) {
        this.f189747a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: h */
    public final void mo196636h(Object obj, long j, float f) {
        this.f189747a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: i */
    public final boolean mo196637i(Object obj, long j) {
        return xlx0.f195031i ? xlx0.m211684E(obj, j) : xlx0.m211685F(obj, j);
    }
}

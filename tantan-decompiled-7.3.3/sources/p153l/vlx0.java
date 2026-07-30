package p153l;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final class vlx0 extends wlx0 {
    public vlx0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p153l.wlx0
    /* JADX INFO: renamed from: a */
    public final byte mo196629a(long j) {
        return Memory.peekByte(j);
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
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* JADX WARN: Failed to inline method: l.xlx0.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: l.xlx0.t(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: l.xlx0.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: l.xlx0.t(java.lang.Object, long, boolean):void */
    @Override // p153l.wlx0
    /* JADX INFO: renamed from: e */
    public final void mo196633e(Object obj, long j, boolean z) {
        if (xlx0.f195031i) {
            xlx0.m211706s(obj, j, z);
        } else {
            xlx0.m211707t(obj, j, z);
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

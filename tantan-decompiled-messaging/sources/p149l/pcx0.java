package p149l;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final class pcx0 extends qcx0 {
    public pcx0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p149l.qcx0
    /* JADX INFO: renamed from: a */
    public final byte mo163622a(long j) {
        return Memory.peekByte(j);
    }

    @Override // p149l.qcx0
    /* JADX INFO: renamed from: b */
    public final double mo163623b(Object obj, long j) {
        return Double.longBitsToDouble(this.f153846a.getLong(obj, j));
    }

    @Override // p149l.qcx0
    /* JADX INFO: renamed from: c */
    public final float mo163624c(Object obj, long j) {
        return Float.intBitsToFloat(this.f153846a.getInt(obj, j));
    }

    @Override // p149l.qcx0
    /* JADX INFO: renamed from: d */
    public final void mo163625d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* JADX WARN: Failed to inline method: l.rcx0.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: l.rcx0.t(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: l.rcx0.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: l.rcx0.t(java.lang.Object, long, boolean):void */
    @Override // p149l.qcx0
    /* JADX INFO: renamed from: e */
    public final void mo163626e(Object obj, long j, boolean z) {
        if (rcx0.f158840i) {
            rcx0.m178841s(obj, j, z);
        } else {
            rcx0.m178842t(obj, j, z);
        }
    }

    @Override // p149l.qcx0
    /* JADX INFO: renamed from: f */
    public final void mo163627f(Object obj, long j, byte b) {
        if (rcx0.f158840i) {
            rcx0.m178829g(obj, j, b);
        } else {
            rcx0.m178830h(obj, j, b);
        }
    }

    @Override // p149l.qcx0
    /* JADX INFO: renamed from: g */
    public final void mo163628g(Object obj, long j, double d) {
        this.f153846a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p149l.qcx0
    /* JADX INFO: renamed from: h */
    public final void mo163629h(Object obj, long j, float f) {
        this.f153846a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p149l.qcx0
    /* JADX INFO: renamed from: i */
    public final boolean mo163630i(Object obj, long j) {
        return rcx0.f158840i ? rcx0.m178819E(obj, j) : rcx0.m178820F(obj, j);
    }
}

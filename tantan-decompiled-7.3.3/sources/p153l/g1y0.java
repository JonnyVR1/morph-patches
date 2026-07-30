package p153l;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final class g1y0 extends k1y0 {
    public g1y0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p153l.k1y0
    /* JADX INFO: renamed from: a */
    public final double mo101513a(Object obj, long j) {
        return Double.longBitsToDouble(this.f123560a.getLong(obj, j));
    }

    @Override // p153l.k1y0
    /* JADX INFO: renamed from: b */
    public final float mo101514b(Object obj, long j) {
        return Float.intBitsToFloat(this.f123560a.getInt(obj, j));
    }

    /* JADX WARN: Failed to inline method: l.q1y0.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: l.q1y0.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: l.q1y0.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: l.q1y0.o(java.lang.Object, long, boolean):void */
    @Override // p153l.k1y0
    /* JADX INFO: renamed from: c */
    public final void mo101515c(Object obj, long j, boolean z) {
        if (q1y0.f155238h) {
            q1y0.m174948n(obj, j, z);
        } else {
            q1y0.m174949o(obj, j, z);
        }
    }

    @Override // p153l.k1y0
    /* JADX INFO: renamed from: d */
    public final void mo101516d(Object obj, long j, byte b) {
        if (q1y0.f155238h) {
            q1y0.m174938d(obj, j, b);
        } else {
            q1y0.m174939e(obj, j, b);
        }
    }

    @Override // p153l.k1y0
    /* JADX INFO: renamed from: e */
    public final void mo101517e(Object obj, long j, double d) {
        this.f123560a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p153l.k1y0
    /* JADX INFO: renamed from: f */
    public final void mo101518f(Object obj, long j, float f) {
        this.f123560a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p153l.k1y0
    /* JADX INFO: renamed from: g */
    public final boolean mo101519g(Object obj, long j) {
        return q1y0.f155238h ? q1y0.m174959y(obj, j) : q1y0.m174960z(obj, j);
    }
}

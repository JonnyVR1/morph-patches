package p149l;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final class asx0 extends esx0 {
    public asx0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p149l.esx0
    /* JADX INFO: renamed from: a */
    public final double mo98632a(Object obj, long j) {
        return Double.longBitsToDouble(this.f93064a.getLong(obj, j));
    }

    @Override // p149l.esx0
    /* JADX INFO: renamed from: b */
    public final float mo98633b(Object obj, long j) {
        return Float.intBitsToFloat(this.f93064a.getInt(obj, j));
    }

    @Override // p149l.esx0
    /* JADX INFO: renamed from: c */
    public final void mo98634c(Object obj, long j, boolean z) {
        if (ksx0.f124522h) {
            ksx0.m147112d(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            ksx0.m147113e(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p149l.esx0
    /* JADX INFO: renamed from: d */
    public final void mo98635d(Object obj, long j, byte b) {
        if (ksx0.f124522h) {
            ksx0.m147112d(obj, j, b);
        } else {
            ksx0.m147113e(obj, j, b);
        }
    }

    @Override // p149l.esx0
    /* JADX INFO: renamed from: e */
    public final void mo98636e(Object obj, long j, double d) {
        this.f93064a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p149l.esx0
    /* JADX INFO: renamed from: f */
    public final void mo98637f(Object obj, long j, float f) {
        this.f93064a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p149l.esx0
    /* JADX INFO: renamed from: g */
    public final boolean mo98638g(Object obj, long j) {
        return ksx0.f124522h ? ksx0.m147133y(obj, j) : ksx0.m147134z(obj, j);
    }
}

package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class suf0 extends vzi {

    /* JADX INFO: renamed from: b */
    public final long f166466b;

    public suf0(tqf tqfVar, long j) {
        super(tqfVar);
        p11.m167007a(tqfVar.getPosition() >= j);
        this.f166466b = j;
    }

    @Override // p149l.vzi, p149l.tqf
    public long getLength() {
        return super.getLength() - this.f166466b;
    }

    @Override // p149l.vzi, p149l.tqf
    public long getPosition() {
        return super.getPosition() - this.f166466b;
    }

    @Override // p149l.vzi, p149l.tqf
    /* JADX INFO: renamed from: k */
    public long mo150659k() {
        return super.mo150659k() - this.f166466b;
    }
}

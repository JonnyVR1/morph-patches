package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class b3g0 extends q2j {

    /* JADX INFO: renamed from: b */
    public final long f74770b;

    public b3g0(asf asfVar, long j) {
        super(asfVar);
        w11.m204365a(asfVar.getPosition() >= j);
        this.f74770b = j;
    }

    @Override // p153l.q2j, p153l.asf
    public long getLength() {
        return super.getLength() - this.f74770b;
    }

    @Override // p153l.q2j, p153l.asf
    public long getPosition() {
        return super.getPosition() - this.f74770b;
    }

    @Override // p153l.q2j, p153l.asf
    /* JADX INFO: renamed from: k */
    public long mo99903k() {
        return super.mo99903k() - this.f74770b;
    }
}

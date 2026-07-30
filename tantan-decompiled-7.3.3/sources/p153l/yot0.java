package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class yot0 implements eyu0 {

    /* JADX INFO: renamed from: a */
    public final ont0 f201012a;

    /* JADX INFO: renamed from: b */
    public final ept0 f201013b;

    /* JADX INFO: renamed from: c */
    public Long f201014c;

    /* JADX INFO: renamed from: d */
    public String f201015d;

    public /* synthetic */ yot0(ont0 ont0Var, ept0 ept0Var, xot0 xot0Var) {
        this.f201012a = ont0Var;
        this.f201013b = ept0Var;
    }

    @Override // p153l.eyu0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ eyu0 mo123268a(long j) {
        this.f201014c = Long.valueOf(j);
        return this;
    }

    @Override // p153l.eyu0
    public final /* synthetic */ eyu0 zza(String str) {
        str.getClass();
        this.f201015d = str;
        return this;
    }

    @Override // p153l.eyu0
    public final fyu0 zzc() {
        cqx0.m112000c(this.f201014c, Long.class);
        cqx0.m112000c(this.f201015d, String.class);
        return new apt0(this.f201012a, this.f201013b, this.f201014c, this.f201015d, null);
    }
}

package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class sft0 implements you0 {

    /* JADX INFO: renamed from: a */
    public final iet0 f164336a;

    /* JADX INFO: renamed from: b */
    public final yft0 f164337b;

    /* JADX INFO: renamed from: c */
    public Long f164338c;

    /* JADX INFO: renamed from: d */
    public String f164339d;

    public /* synthetic */ sft0(iet0 iet0Var, yft0 yft0Var, rft0 rft0Var) {
        this.f164336a = iet0Var;
        this.f164337b = yft0Var;
    }

    @Override // p149l.you0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ you0 mo183997a(long j) {
        this.f164338c = Long.valueOf(j);
        return this;
    }

    @Override // p149l.you0
    public final /* synthetic */ you0 zza(String str) {
        str.getClass();
        this.f164339d = str;
        return this;
    }

    @Override // p149l.you0
    public final zou0 zzc() {
        wgx0.m203090c(this.f164338c, Long.class);
        wgx0.m203090c(this.f164339d, String.class);
        return new uft0(this.f164336a, this.f164337b, this.f164338c, this.f164339d, null);
    }
}

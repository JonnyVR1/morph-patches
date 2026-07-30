package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class rny0 implements lny0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f164135a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f164136b;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        f164135a = asx0VarM100005e.m100004d("measurement.gbraid_campaign.gbraid.client", true);
        f164136b = asx0VarM100005e.m100004d("measurement.gbraid_campaign.gbraid.service", true);
    }

    @Override // p153l.lny0
    public final boolean zza() {
        return true;
    }

    @Override // p153l.lny0
    public final boolean zzb() {
        return f164135a.m187571b().booleanValue();
    }

    @Override // p153l.lny0
    public final boolean zzc() {
        return f164136b.m187571b().booleanValue();
    }
}

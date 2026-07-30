package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ypy0 implements aqy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f201145a;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        asx0VarM100005e.m100004d("measurement.collection.enable_session_stitching_token.client.dev", true);
        asx0VarM100005e.m100004d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f201145a = asx0VarM100005e.m100004d("measurement.session_stitching_token_enabled", false);
        asx0VarM100005e.m100004d("measurement.link_sst_to_sid", true);
    }

    @Override // p153l.aqy0
    public final boolean zza() {
        return true;
    }

    @Override // p153l.aqy0
    public final boolean zzb() {
        return f201145a.m187571b().booleanValue();
    }
}

package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class apy0 implements cpy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f72764a;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        asx0VarM100005e.m100004d("measurement.sdk.collection.enable_extend_user_property_size", true);
        asx0VarM100005e.m100004d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f72764a = asx0VarM100005e.m100004d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        asx0VarM100005e.m100002b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // p153l.cpy0
    public final boolean zza() {
        return f72764a.m187571b().booleanValue();
    }
}

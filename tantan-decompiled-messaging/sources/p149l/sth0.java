package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes10.dex */
public class sth0 {

    /* JADX INFO: renamed from: c */
    public static final sth0 f166354c = new sth0();

    /* JADX INFO: renamed from: a */
    public C22393b<roj0> f166355a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public User f166356b;

    /* JADX INFO: renamed from: b */
    public static sth0 m185950b() {
        return f166354c;
    }

    /* JADX INFO: renamed from: a */
    public void m185951a() {
        this.f166356b = null;
    }

    /* JADX INFO: renamed from: c */
    public User m185952c() {
        return this.f166356b;
    }

    /* JADX INFO: renamed from: d */
    public C22393b<roj0> m185953d() {
        return this.f166355a;
    }

    /* JADX INFO: renamed from: e */
    public void m185954e(User user) {
        this.f166356b = user.riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + user.f56011id));
    }
}

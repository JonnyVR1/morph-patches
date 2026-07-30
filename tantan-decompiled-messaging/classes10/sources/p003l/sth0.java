package p003l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.roj0;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sth0 {

    /* JADX INFO: renamed from: c */
    public static final sth0 f7460c = new sth0();

    /* JADX INFO: renamed from: a */
    public b<roj0> f7461a = b.b();

    /* JADX INFO: renamed from: b */
    public User f7462b;

    /* JADX INFO: renamed from: b */
    public static sth0 m9484b() {
        return f7460c;
    }

    /* JADX INFO: renamed from: a */
    public void m9485a() {
        this.f7462b = null;
    }

    /* JADX INFO: renamed from: c */
    public User m9486c() {
        return this.f7462b;
    }

    /* JADX INFO: renamed from: d */
    public b<roj0> m9487d() {
        return this.f7461a;
    }

    /* JADX INFO: renamed from: e */
    public void m9488e(User user) {
        this.f7462b = user.riskAuditUser(CoreModule.c.e0.Pa("fake_risk_audit_default_" + ((DbObject) user).id));
    }
}

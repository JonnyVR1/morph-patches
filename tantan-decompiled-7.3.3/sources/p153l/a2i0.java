package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes12.dex */
public class a2i0 {

    /* JADX INFO: renamed from: c */
    public static final a2i0 f67997c = new a2i0();

    /* JADX INFO: renamed from: a */
    public C22508b<uxj0> f67998a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public User f67999b;

    /* JADX INFO: renamed from: b */
    public static a2i0 m95674b() {
        return f67997c;
    }

    /* JADX INFO: renamed from: a */
    public void m95675a() {
        this.f67999b = null;
    }

    /* JADX INFO: renamed from: c */
    public User m95676c() {
        return this.f67999b;
    }

    /* JADX INFO: renamed from: d */
    public C22508b<uxj0> m95677d() {
        return this.f67998a;
    }

    /* JADX INFO: renamed from: e */
    public void m95678e(User user) {
        this.f67999b = user.riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + user.f56859id));
    }
}

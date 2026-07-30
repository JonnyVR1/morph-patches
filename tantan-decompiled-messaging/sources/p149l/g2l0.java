package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartAct;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g2l0 {
    private d30 errorHandler;
    private h30<String, String, Throwable, String> failedTrace;
    private g2l0 nextChecker;
    private f30<String, String> successTrace;
    private String trackType = "";

    /* JADX INFO: renamed from: a */
    public void mo94566a(Act act) {
        gkh0.m126627j("videoChat", "current checker execute:" + mo94567f());
    }

    /* JADX INFO: renamed from: b */
    public void m124166b(String str) {
        m124168d(null, str);
    }

    /* JADX INFO: renamed from: c */
    public void m124167c(Throwable th) {
        m124168d(th, "");
    }

    /* JADX INFO: renamed from: d */
    public final void m124168d(Throwable th, String str) {
        gkh0.m126627j("videoChat", "current checker execute error");
        h30<String, String, Throwable, String> h30Var = this.failedTrace;
        if (h30Var != null) {
            h30Var.mo105798b(this.trackType, mo94567f(), th, str);
        }
        d30 d30Var = this.errorHandler;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m124169e(Act act) {
        f30<String, String> f30Var = this.successTrace;
        if (f30Var != null) {
            f30Var.call(this.trackType, mo94567f());
        }
        if (this.nextChecker != null) {
            if (!TextUtils.isEmpty(this.trackType)) {
                this.nextChecker.m124173j(this.trackType);
            }
            this.nextChecker.mo94566a(act);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo94567f();

    /* JADX INFO: renamed from: g */
    public void m124170g(String str) {
        this.trackType = str;
    }

    /* JADX INFO: renamed from: h */
    public g2l0 m124171h(d30 d30Var) {
        this.errorHandler = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m124172i(g2l0 g2l0Var) {
        this.nextChecker = g2l0Var;
    }

    /* JADX INFO: renamed from: j */
    public g2l0 m124173j(String str) {
        this.trackType = str;
        this.successTrace = new f30() { // from class: l.e2l0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                VChatStartAct.m69227s2((String) obj, (String) obj2);
            }
        };
        this.failedTrace = new h30() { // from class: l.f2l0
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                VChatStartAct.m69226r2((String) obj, (String) obj2, (Throwable) obj3, (String) obj4);
            }
        };
        return this;
    }
}

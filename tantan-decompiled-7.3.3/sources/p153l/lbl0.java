package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartAct;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lbl0 {
    private x20 errorHandler;
    private b30<String, String, Throwable, String> failedTrace;
    private lbl0 nextChecker;
    private z20<String, String> successTrace;
    private String trackType = "";

    /* JADX INFO: renamed from: a */
    public void mo96996a(Act act) {
        nsh0.m164608j("videoChat", "current checker execute:" + mo96997f());
    }

    /* JADX INFO: renamed from: b */
    public void m153580b(String str) {
        m153582d(null, str);
    }

    /* JADX INFO: renamed from: c */
    public void m153581c(Throwable th) {
        m153582d(th, "");
    }

    /* JADX INFO: renamed from: d */
    public final void m153582d(Throwable th, String str) {
        nsh0.m164608j("videoChat", "current checker execute error");
        b30<String, String, Throwable, String> b30Var = this.failedTrace;
        if (b30Var != null) {
            b30Var.mo102266b(this.trackType, mo96997f(), th, str);
        }
        x20 x20Var = this.errorHandler;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m153583e(Act act) {
        z20<String, String> z20Var = this.successTrace;
        if (z20Var != null) {
            z20Var.call(this.trackType, mo96997f());
        }
        if (this.nextChecker != null) {
            if (!TextUtils.isEmpty(this.trackType)) {
                this.nextChecker.m153587j(this.trackType);
            }
            this.nextChecker.mo96996a(act);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo96997f();

    /* JADX INFO: renamed from: g */
    public void m153584g(String str) {
        this.trackType = str;
    }

    /* JADX INFO: renamed from: h */
    public lbl0 m153585h(x20 x20Var) {
        this.errorHandler = x20Var;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m153586i(lbl0 lbl0Var) {
        this.nextChecker = lbl0Var;
    }

    /* JADX INFO: renamed from: j */
    public lbl0 m153587j(String str) {
        this.trackType = str;
        this.successTrace = new z20() { // from class: l.jbl0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                VChatStartAct.m70410u2((String) obj, (String) obj2);
            }
        };
        this.failedTrace = new b30() { // from class: l.kbl0
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                VChatStartAct.m70409s2((String) obj, (String) obj2, (Throwable) obj3, (String) obj4);
            }
        };
        return this;
    }
}

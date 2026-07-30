package p153l;

import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes10.dex */
public class ad00 implements hqq {

    /* JADX INFO: renamed from: a */
    public final tc00 f69774a = new tc00();

    /* JADX INFO: renamed from: b */
    public final PutongAct f69775b;

    /* JADX INFO: renamed from: c */
    public final MKWebView f69776c;

    public ad00(@NonNull PutongAct putongAct, @NonNull MKWebView mKWebView) {
        this.f69775b = putongAct;
        this.f69776c = mKWebView;
    }

    @Override // p153l.hqq
    /* JADX INFO: renamed from: a */
    public void mo97003a(String str) {
        if (m97008f()) {
            return;
        }
        this.f69774a.m190413f(this.f69776c, str);
    }

    @Override // p153l.hqq
    /* JADX INFO: renamed from: b */
    public void mo97004b(String str, String... strArr) {
        if (m97008f()) {
            return;
        }
        this.f69774a.m190416i(this.f69776c, str, strArr);
    }

    /* JADX INFO: renamed from: c */
    public void m97005c(String str, y20<String> y20Var, String... strArr) {
        if (m97008f()) {
            return;
        }
        this.f69774a.m190417j(this.f69776c, str, y20Var, strArr);
    }

    /* JADX INFO: renamed from: d */
    public void m97006d(String str, String... strArr) {
        if (m97008f()) {
            return;
        }
        this.f69774a.m190418k(this.f69776c, str, strArr);
    }

    /* JADX INFO: renamed from: e */
    public void m97007e(String str, String... strArr) {
        if (m97008f()) {
            return;
        }
        this.f69774a.m190419l(this.f69776c, str, strArr);
    }

    /* JADX INFO: renamed from: f */
    public boolean m97008f() {
        return this.f69775b.isFinishing();
    }
}

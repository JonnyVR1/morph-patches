package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.app.PutongAct;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class i400 implements hoq {

    /* JADX INFO: renamed from: a */
    public final w300 f14391a = new w300();

    /* JADX INFO: renamed from: b */
    public final PutongAct f14392b;

    /* JADX INFO: renamed from: c */
    public final MKWebView f14393c;

    public i400(@NonNull PutongAct putongAct, @NonNull MKWebView mKWebView) {
        this.f14392b = putongAct;
        this.f14393c = mKWebView;
    }

    @Override // p009l.hoq
    /* JADX INFO: renamed from: a */
    public void mo15129a(String str) {
        if (m16179f()) {
            return;
        }
        this.f14391a.m23788f(this.f14393c, str);
    }

    @Override // p009l.hoq
    /* JADX INFO: renamed from: b */
    public void mo15130b(String str, String... strArr) {
        if (m16179f()) {
            return;
        }
        this.f14391a.m23791i(this.f14393c, str, strArr);
    }

    /* JADX INFO: renamed from: c */
    public void m16176c(String str, e30<String> e30Var, String... strArr) {
        if (m16179f()) {
            return;
        }
        this.f14391a.m23792j(this.f14393c, str, e30Var, strArr);
    }

    /* JADX INFO: renamed from: d */
    public void m16177d(String str, String... strArr) {
        if (m16179f()) {
            return;
        }
        this.f14391a.m23793k(this.f14393c, str, strArr);
    }

    /* JADX INFO: renamed from: e */
    public void m16178e(String str, String... strArr) {
        if (m16179f()) {
            return;
        }
        this.f14391a.m23794l(this.f14393c, str, strArr);
    }

    /* JADX INFO: renamed from: f */
    public boolean m16179f() {
        return this.f14392b.isFinishing();
    }
}

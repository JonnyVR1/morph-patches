package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes11.dex */
public class i400 implements hoq {

    /* JADX INFO: renamed from: a */
    public final w300 f111392a = new w300();

    /* JADX INFO: renamed from: b */
    public final PutongAct f111393b;

    /* JADX INFO: renamed from: c */
    public final MKWebView f111394c;

    public i400(@NonNull PutongAct putongAct, @NonNull MKWebView mKWebView) {
        this.f111393b = putongAct;
        this.f111394c = mKWebView;
    }

    @Override // p149l.hoq
    /* JADX INFO: renamed from: a */
    public void mo127284a(String str) {
        if (m134314f()) {
            return;
        }
        this.f111392a.m201239f(this.f111394c, str);
    }

    @Override // p149l.hoq
    /* JADX INFO: renamed from: b */
    public void mo127285b(String str, String... strArr) {
        if (m134314f()) {
            return;
        }
        this.f111392a.m201242i(this.f111394c, str, strArr);
    }

    /* JADX INFO: renamed from: c */
    public void m134311c(String str, e30<String> e30Var, String... strArr) {
        if (m134314f()) {
            return;
        }
        this.f111392a.m201243j(this.f111394c, str, e30Var, strArr);
    }

    /* JADX INFO: renamed from: d */
    public void m134312d(String str, String... strArr) {
        if (m134314f()) {
            return;
        }
        this.f111392a.m201244k(this.f111394c, str, strArr);
    }

    /* JADX INFO: renamed from: e */
    public void m134313e(String str, String... strArr) {
        if (m134314f()) {
            return;
        }
        this.f111392a.m201245l(this.f111394c, str, strArr);
    }

    /* JADX INFO: renamed from: f */
    public boolean m134314f() {
        return this.f111393b.isFinishing();
    }
}

package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes2.dex */
public class vhw {

    /* JADX INFO: renamed from: b */
    private static final vhw f181535b = new vhw();

    /* JADX INFO: renamed from: a */
    private lul f181536a = new vwv();

    private vhw() {
    }

    /* JADX INFO: renamed from: d */
    public static vhw m198471d() {
        return f181535b;
    }

    /* JADX INFO: renamed from: a */
    public void m198472a(String str, String str2, MKWebView.C14912e c14912e) {
        try {
            this.f181536a.mo151773k(str, str2, c14912e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m198473b(String str) {
        this.f181536a.mo151767a(str);
    }

    /* JADX INFO: renamed from: c */
    public void m198474c(String str) {
        this.f181536a.mo100111i(str);
    }

    /* JADX INFO: renamed from: e */
    public jxv m198475e(String str) {
        return this.f181536a.mo100110g(str);
    }

    /* JADX INFO: renamed from: f */
    public void m198476f(AbstractC20803w5 abstractC20803w5) {
        try {
            this.f181536a.mo151770f(abstractC20803w5);
        } catch (Exception e) {
            mxv.m156927b("log Error", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m198477g(@NonNull ve3 ve3Var) {
        try {
            this.f181536a.mo151769e(ve3Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m198478h(@NonNull xe3 xe3Var) {
        try {
            this.f181536a.mo151771h(xe3Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m198479i(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        this.f181536a.mo151772j(str, str2);
    }

    /* JADX INFO: renamed from: j */
    public void m198480j() {
        this.f181536a.mo170340c();
    }

    /* JADX INFO: renamed from: k */
    public void m198481k() {
        this.f181536a.mo170339b();
    }

    /* JADX INFO: renamed from: l */
    public void m198482l(Runnable runnable) {
        this.f181536a.mo151768d(runnable);
    }
}

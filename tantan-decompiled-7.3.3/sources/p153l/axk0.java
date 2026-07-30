package p153l;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.floatview.assist.FxGravity;
import com.p051p1.mobile.putong.live.external.internal.vchat.window.VChatWindowView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class axk0 implements iam<zwk0> {

    /* JADX INFO: renamed from: c */
    public static String f73865c = "VChatWindowViewModel";

    /* JADX INFO: renamed from: a */
    public VChatWindowView f73866a;

    /* JADX INFO: renamed from: b */
    public boolean f73867b = false;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m100775b() {
        if (this.f73866a == null || !this.f73867b) {
            return;
        }
        lul lulVarM217314c = yti.m217314c(f73865c);
        if (lulVarM217314c instanceof udj) {
            ((udj) lulVarM217314c).m195484d();
        }
        if (lulVarM217314c != null) {
            lulVarM217314c.cancel();
        }
        this.f73867b = false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m100776c(View.OnClickListener onClickListener, String str) {
        boolean z = true;
        if (this.f73867b) {
            return true;
        }
        try {
            Application application = zrv.f205803e;
            VChatWindowView vChatWindowView = this.f73866a;
            if (vChatWindowView == null) {
                this.f73866a = (VChatWindowView) View.inflate(application, xec0.f193789I1, null);
            } else {
                ViewParent parent = vChatWindowView.getParent();
                if (NullChecker.m82486a(parent)) {
                    ((ViewGroup) parent).removeView(this.f73866a);
                }
            }
            this.f73866a.setWindowData(str);
            yti.m217315f(sdj.m185465b().m185472s(application).m200977i(this.f73866a).m200978j(new FrameLayout.LayoutParams(qa00.m175859d(70.0f), qa00.m175859d(124.0f))).m200976h(FxGravity.RIGHT_OR_TOP).m200974f(qa00.m175859d(10.0f)).m200973e(qa00.m175859d(44.0f), 0.0f, qa00.m175859d(56.0f), 0.0f).m200980l(onClickListener).m200975g(true).m185473t(f73865c).m200972d().m185470q());
            try {
                this.f73867b = true;
                return true;
            } catch (Exception e) {
                e = e;
                CrashHelper.m82479c(e);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    @Override // p153l.iam
    public void destroy() {
        m100775b();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return this.f73866a != null && this.f73867b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zwk0 zwk0Var) {
    }
}

package p149l;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.floatview.assist.FxGravity;
import com.p046p1.mobile.putong.live.external.internal.vchat.window.VChatWindowView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class unk0 implements s7m<tnk0> {

    /* JADX INFO: renamed from: c */
    public static String f177393c = "VChatWindowViewModel";

    /* JADX INFO: renamed from: a */
    public VChatWindowView f177394a;

    /* JADX INFO: renamed from: b */
    public boolean f177395b = false;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m194455b() {
        if (this.f177394a == null || !this.f177395b) {
            return;
        }
        xrl xrlVarM108369c = cri.m108369c(f177393c);
        if (xrlVarM108369c instanceof abj) {
            ((abj) xrlVarM108369c).m95656d();
        }
        if (xrlVarM108369c != null) {
            xrlVarM108369c.cancel();
        }
        this.f177395b = false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m194456c(View.OnClickListener onClickListener, String str) {
        boolean z = true;
        if (this.f177395b) {
            return true;
        }
        try {
            Application application = ypv.f199497e;
            VChatWindowView vChatWindowView = this.f177394a;
            if (vChatWindowView == null) {
                this.f177394a = (VChatWindowView) View.inflate(application, s6c0.f162675I1, null);
            } else {
                ViewParent parent = vChatWindowView.getParent();
                if (NullChecker.m81303a(parent)) {
                    ((ViewGroup) parent).removeView(this.f177394a);
                }
            }
            this.f177394a.setWindowData(str);
            cri.m108370f(yaj.m213843b().m213849s(application).m100968i(this.f177394a).m100969j(new FrameLayout.LayoutParams(t100.m186890d(70.0f), t100.m186890d(124.0f))).m100967h(FxGravity.RIGHT_OR_TOP).m100965f(t100.m186890d(10.0f)).m100964e(t100.m186890d(44.0f), 0.0f, t100.m186890d(56.0f), 0.0f).m100971l(onClickListener).m100966g(true).m213850t(f177393c).m100963d().m213847q());
            try {
                this.f177395b = true;
                return true;
            } catch (Exception e) {
                e = e;
                CrashHelper.m81296c(e);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        m194455b();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return this.f177394a != null && this.f177395b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tnk0 tnk0Var) {
    }
}

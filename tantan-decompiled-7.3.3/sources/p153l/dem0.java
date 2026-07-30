package p153l;

import android.app.Application;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.floatview.assist.FxGravity;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.OnExitPopupView;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VVirtualVoiceWindowView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class dem0 {

    /* JADX INFO: renamed from: a */
    public uam f88051a;

    /* JADX INFO: renamed from: b */
    public boolean f88052b = false;

    /* JADX INFO: renamed from: c */
    public OnExitPopupView f88053c;

    /* JADX INFO: renamed from: l.dem0$a */
    public class C16508a extends cej {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f88054a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pcj f88055b;

        public C16508a(x20 x20Var, pcj pcjVar) {
            this.f88054a = x20Var;
            this.f88055b = pcjVar;
        }

        @Override // p153l.cej, p153l.mul
        /* JADX INFO: renamed from: a */
        public void mo109369a(View view, @NonNull MotionEvent motionEvent, float f, float f2) {
            super.mo109369a(view, motionEvent, f, f2);
            if (dem0.this.f88053c == null && ((Boolean) this.f88055b.call()).booleanValue()) {
                dem0.this.m115440g(view.getContext());
            }
            if (dem0.this.f88053c != null) {
                if (!dem0.this.f88053c.m76779d()) {
                    Act act = Act.foreground_() != null ? (Act) Act.foreground_().f16062a.get() : null;
                    if (NullChecker.m82486a(act) && act.lifecycle_().equals(C4470c.f16267i)) {
                        dem0.this.f88053c.m76782g((ViewGroup) act.getWindow().getDecorView());
                    }
                    if (yti.m217314c("virtual_voice_window_view") != null) {
                        yti.m217314c("virtual_voice_window_view").getManagerView().bringToFront();
                    }
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int height = iArr[1] + view.getHeight();
                dem0.this.f88053c.getExitAreaView().getLocationOnScreen(iArr);
                int i = iArr[1];
                dem0 dem0Var = dem0.this;
                if (height > i) {
                    dem0Var.f88053c.m76783h();
                } else {
                    dem0Var.f88053c.m76784i();
                }
            }
        }

        @Override // p153l.cej, p153l.mul
        /* JADX INFO: renamed from: c */
        public void mo109371c(View view) {
            super.mo109371c(view);
            if (dem0.this.f88053c == null || !dem0.this.f88053c.m76779d()) {
                return;
            }
            dem0.this.f88053c.m76778c();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int height = iArr[1] + view.getHeight();
            dem0.this.f88053c.getExitAreaView().getLocationOnScreen(iArr);
            int height2 = dem0.this.f88053c.getHeight() - dem0.this.f88053c.getExitAreaView().getHeight();
            if (height2 <= 0 || height <= height2) {
                dem0.this.f88053c.m76784i();
            } else {
                this.f88054a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.dem0$b */
    public class C16509b extends eej {
        public C16509b() {
        }

        @Override // p153l.eej, p153l.nul
        /* JADX INFO: renamed from: d */
        public void mo115443d() {
            super.mo115443d();
            if (dem0.this.f88051a == null || !((VVirtualVoiceWindowView) dem0.this.f88051a).mo76792e()) {
                return;
            }
            dem0.this.f88051a.mo76790c();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m115437d() {
        m115438e();
        this.f88051a = null;
    }

    /* JADX INFO: renamed from: e */
    public void m115438e() {
        if (this.f88051a == null || !this.f88052b) {
            return;
        }
        jul julVarM217314c = yti.m217314c("virtual_voice_window_view");
        if (julVarM217314c != null) {
            julVarM217314c.cancel();
        }
        this.f88052b = false;
    }

    /* JADX INFO: renamed from: f */
    public uam m115439f() {
        return this.f88051a;
    }

    /* JADX INFO: renamed from: g */
    public final void m115440g(Context context) {
        if (this.f88053c == null) {
            this.f88053c = new OnExitPopupView(context);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m115441h() {
        return this.f88051a != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m115442i(View.OnClickListener onClickListener, pcj<Boolean> pcjVar, x20 x20Var) {
        boolean z = true;
        if (this.f88052b) {
            return true;
        }
        try {
            Application application = zrv.f205803e;
            Object obj = this.f88051a;
            if (obj == null) {
                this.f88051a = (VVirtualVoiceWindowView) View.inflate(application, yec0.f198974X6, null);
            } else {
                ViewParent parent = ((View) obj).getParent();
                if (NullChecker.m82486a(parent)) {
                    ((ViewGroup) parent).removeView((View) this.f88051a);
                }
            }
            yti.m217315f(sdj.m185465b().m185472s(application).m200977i((View) this.f88051a).m200978j(new FrameLayout.LayoutParams(qa00.m175859d(75.0f), qa00.m175859d(76.0f))).m200976h(FxGravity.RIGHT_OR_TOP).m200973e(qa00.m175859d(44.0f), 0.0f, qa00.m175859d(56.0f), 0.0f).m200980l(onClickListener).m200983p(new C16509b()).m200982o(new C16508a(x20Var, pcjVar)).m200975g(true).m185473t("virtual_voice_window_view").m200972d().m185470q());
            try {
                this.f88052b = true;
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
}

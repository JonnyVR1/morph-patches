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
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.OnExitPopupView;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.VoiceWindowView;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualVoiceWindowView;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class smp0 {

    /* JADX INFO: renamed from: a */
    public uam f169597a;

    /* JADX INFO: renamed from: b */
    public boolean f169598b = false;

    /* JADX INFO: renamed from: c */
    public OnExitPopupView f169599c;

    /* JADX INFO: renamed from: l.smp0$a */
    public class C20107a extends cej {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f169600a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pcj f169601b;

        public C20107a(x20 x20Var, pcj pcjVar) {
            this.f169600a = x20Var;
            this.f169601b = pcjVar;
        }

        @Override // p153l.cej, p153l.mul
        /* JADX INFO: renamed from: a */
        public void mo109369a(View view, @NonNull MotionEvent motionEvent, float f, float f2) {
            super.mo109369a(view, motionEvent, f, f2);
            if (smp0.this.f169599c == null && ((Boolean) this.f169601b.call()).booleanValue()) {
                smp0.this.m186827g(view.getContext());
            }
            if (smp0.this.f169599c != null) {
                if (!smp0.this.f169599c.m76779d()) {
                    Act act = Act.foreground_() != null ? (Act) Act.foreground_().f16062a.get() : null;
                    if (NullChecker.m82486a(act) && act.lifecycle_().equals(C4470c.f16267i)) {
                        smp0.this.f169599c.m76782g((ViewGroup) act.getWindow().getDecorView());
                    }
                    if (yti.m217314c("virtual_voice_window_view") != null) {
                        yti.m217314c("virtual_voice_window_view").getManagerView().bringToFront();
                    }
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int height = iArr[1] + view.getHeight();
                smp0.this.f169599c.getExitAreaView().getLocationOnScreen(iArr);
                int i = iArr[1];
                smp0 smp0Var = smp0.this;
                if (height > i) {
                    smp0Var.f169599c.m76783h();
                } else {
                    smp0Var.f169599c.m76784i();
                }
            }
        }

        @Override // p153l.cej, p153l.mul
        /* JADX INFO: renamed from: c */
        public void mo109371c(View view) {
            super.mo109371c(view);
            if (smp0.this.f169599c == null || !smp0.this.f169599c.m76779d()) {
                return;
            }
            smp0.this.f169599c.m76778c();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int height = iArr[1] + view.getHeight();
            smp0.this.f169599c.getExitAreaView().getLocationOnScreen(iArr);
            int height2 = smp0.this.f169599c.getHeight() - smp0.this.f169599c.getExitAreaView().getHeight();
            if (height2 <= 0 || height <= height2) {
                smp0.this.f169599c.m76784i();
            } else {
                this.f169600a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.smp0$b */
    public class C20108b extends eej {
        public C20108b() {
        }

        @Override // p153l.eej, p153l.nul
        /* JADX INFO: renamed from: d */
        public void mo115443d() {
            super.mo115443d();
            if (smp0.this.f169597a == null || !smp0.this.f169597a.mo76792e()) {
                return;
            }
            smp0.this.f169597a.mo76790c();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m186824d() {
        m186825e();
        this.f169597a = null;
    }

    /* JADX INFO: renamed from: e */
    public void m186825e() {
        if (this.f169597a == null || !this.f169598b) {
            return;
        }
        jul julVarM217314c = yti.m217314c("virtual_voice_window_view");
        if (julVarM217314c != null) {
            julVarM217314c.cancel();
        }
        this.f169598b = false;
    }

    /* JADX INFO: renamed from: f */
    public uam m186826f() {
        return this.f169597a;
    }

    /* JADX INFO: renamed from: g */
    public final void m186827g(Context context) {
        if (this.f169599c == null) {
            OnExitPopupView onExitPopupView = new OnExitPopupView(context);
            this.f169599c = onExitPopupView;
            onExitPopupView.setExitText(context.getString(R$string.f47893Wf));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m186828h(Context context, View.OnClickListener onClickListener, pcj<Boolean> pcjVar, x20 x20Var) {
        Object obj = this.f169597a;
        if (obj != null) {
            ViewParent parent = ((View) obj).getParent();
            if (NullChecker.m82486a(parent)) {
                ((ViewGroup) parent).removeView((View) this.f169597a);
                return;
            }
            return;
        }
        if (IntlCountryCodeController.m29120q()) {
            this.f169597a = (VirtualVoiceWindowView) View.inflate(context, yec0.f199232r7, null);
        } else {
            this.f169597a = (VoiceWindowView) View.inflate(context, yec0.f199249sb, null);
        }
        this.f169597a.init();
        this.f169597a.mo76789b(onClickListener);
        this.f169597a.setShowExitAreaFunc(pcjVar);
    }

    /* JADX INFO: renamed from: i */
    public boolean m186829i() {
        return this.f169597a != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m186830j(View.OnClickListener onClickListener, pcj<Boolean> pcjVar, x20 x20Var) {
        boolean z = true;
        if (this.f169598b) {
            return true;
        }
        try {
            Application application = zrv.f205803e;
            m186828h(application, onClickListener, pcjVar, x20Var);
            yti.m217315f(sdj.m185465b().m185472s(application).m200977i((View) this.f169597a).m200978j(new FrameLayout.LayoutParams(qa00.m175859d(75.0f), qa00.m175859d(76.0f))).m200976h(FxGravity.RIGHT_OR_TOP).m200973e(qa00.m175859d(44.0f), 0.0f, qa00.m175859d(56.0f), 0.0f).m200980l(onClickListener).m200983p(new C20108b()).m200982o(new C20107a(x20Var, pcjVar)).m200975g(true).m185473t("virtual_voice_window_view").m200972d().m185470q());
            try {
                this.f169598b = true;
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

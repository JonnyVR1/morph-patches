package p149l;

import android.app.Application;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.floatview.assist.FxGravity;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.other.voicewindow.OnExitPopupView;
import com.p046p1.mobile.putong.live.livingroom.other.voicewindow.VoiceWindowView;
import com.p046p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualVoiceWindowView;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class odp0 {

    /* JADX INFO: renamed from: a */
    public e8m f143225a;

    /* JADX INFO: renamed from: b */
    public boolean f143226b = false;

    /* JADX INFO: renamed from: c */
    public OnExitPopupView f143227c;

    /* JADX INFO: renamed from: l.odp0$a */
    public class C18900a extends ibj {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f143228a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ v9j f143229b;

        public C18900a(d30 d30Var, v9j v9jVar) {
            this.f143228a = d30Var;
            this.f143229b = v9jVar;
        }

        @Override // p149l.ibj, p149l.yrl
        /* JADX INFO: renamed from: a */
        public void mo135255a(View view, @NonNull MotionEvent motionEvent, float f, float f2) {
            super.mo135255a(view, motionEvent, f, f2);
            if (odp0.this.f143227c == null && ((Boolean) this.f143229b.call()).booleanValue()) {
                odp0.this.m163707g(view.getContext());
            }
            if (odp0.this.f143227c != null) {
                if (!odp0.this.f143227c.m75596d()) {
                    Act act = Act.foreground_() != null ? (Act) Act.foreground_().f15343a.get() : null;
                    if (NullChecker.m81303a(act) && act.lifecycle_().equals(C4319c.f15548i)) {
                        odp0.this.f143227c.m75599g((ViewGroup) act.getWindow().getDecorView());
                    }
                    if (cri.m108369c("virtual_voice_window_view") != null) {
                        cri.m108369c("virtual_voice_window_view").getManagerView().bringToFront();
                    }
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int height = iArr[1] + view.getHeight();
                odp0.this.f143227c.getExitAreaView().getLocationOnScreen(iArr);
                int i = iArr[1];
                odp0 odp0Var = odp0.this;
                if (height > i) {
                    odp0Var.f143227c.m75600h();
                } else {
                    odp0Var.f143227c.m75601i();
                }
            }
        }

        @Override // p149l.ibj, p149l.yrl
        /* JADX INFO: renamed from: c */
        public void mo135257c(View view) {
            super.mo135257c(view);
            if (odp0.this.f143227c == null || !odp0.this.f143227c.m75596d()) {
                return;
            }
            odp0.this.f143227c.m75595c();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int height = iArr[1] + view.getHeight();
            odp0.this.f143227c.getExitAreaView().getLocationOnScreen(iArr);
            int height2 = odp0.this.f143227c.getHeight() - odp0.this.f143227c.getExitAreaView().getHeight();
            if (height2 <= 0 || height <= height2) {
                odp0.this.f143227c.m75601i();
            } else {
                this.f143228a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.odp0$b */
    public class C18901b extends kbj {
        public C18901b() {
        }

        @Override // p149l.kbj, p149l.zrl
        /* JADX INFO: renamed from: d */
        public void mo145305d() {
            super.mo145305d();
            if (odp0.this.f143225a == null || !odp0.this.f143225a.mo75609e()) {
                return;
            }
            odp0.this.f143225a.mo75607c();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m163704d() {
        m163705e();
        this.f143225a = null;
    }

    /* JADX INFO: renamed from: e */
    public void m163705e() {
        if (this.f143225a == null || !this.f143226b) {
            return;
        }
        vrl vrlVarM108369c = cri.m108369c("virtual_voice_window_view");
        if (vrlVarM108369c != null) {
            vrlVarM108369c.cancel();
        }
        this.f143226b = false;
    }

    /* JADX INFO: renamed from: f */
    public e8m m163706f() {
        return this.f143225a;
    }

    /* JADX INFO: renamed from: g */
    public final void m163707g(Context context) {
        if (this.f143227c == null) {
            OnExitPopupView onExitPopupView = new OnExitPopupView(context);
            this.f143227c = onExitPopupView;
            onExitPopupView.setExitText(context.getString(R$string.f47045Wf));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m163708h(Context context, View.OnClickListener onClickListener, v9j<Boolean> v9jVar, d30 d30Var) {
        Object obj = this.f143225a;
        if (obj != null) {
            ViewParent parent = ((View) obj).getParent();
            if (NullChecker.m81303a(parent)) {
                ((ViewGroup) parent).removeView((View) this.f143225a);
                return;
            }
            return;
        }
        if (IntlCountryCodeController.m28121q()) {
            this.f143225a = (VirtualVoiceWindowView) View.inflate(context, t6c0.f168500r7, null);
        } else {
            this.f143225a = (VoiceWindowView) View.inflate(context, t6c0.f168517sb, null);
        }
        this.f143225a.init();
        this.f143225a.mo75606b(onClickListener);
        this.f143225a.setShowExitAreaFunc(v9jVar);
    }

    /* JADX INFO: renamed from: i */
    public boolean m163709i() {
        return this.f143225a != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m163710j(View.OnClickListener onClickListener, v9j<Boolean> v9jVar, d30 d30Var) {
        boolean z = true;
        if (this.f143226b) {
            return true;
        }
        try {
            Application application = ypv.f199497e;
            m163708h(application, onClickListener, v9jVar, d30Var);
            cri.m108370f(yaj.m213843b().m213849s(application).m100968i((View) this.f143225a).m100969j(new FrameLayout.LayoutParams(t100.m186890d(75.0f), t100.m186890d(76.0f))).m100967h(FxGravity.RIGHT_OR_TOP).m100964e(t100.m186890d(44.0f), 0.0f, t100.m186890d(56.0f), 0.0f).m100971l(onClickListener).m100974p(new C18901b()).m100973o(new C18900a(d30Var, v9jVar)).m100966g(true).m213850t("virtual_voice_window_view").m100963d().m213847q());
            try {
                this.f143226b = true;
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
}

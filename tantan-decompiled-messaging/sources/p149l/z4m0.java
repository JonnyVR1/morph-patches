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
import com.p046p1.mobile.putong.live.livingroom.other.voicewindow.OnExitPopupView;
import com.p046p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VVirtualVoiceWindowView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class z4m0 {

    /* JADX INFO: renamed from: a */
    public e8m f201615a;

    /* JADX INFO: renamed from: b */
    public boolean f201616b = false;

    /* JADX INFO: renamed from: c */
    public OnExitPopupView f201617c;

    /* JADX INFO: renamed from: l.z4m0$a */
    public class C21622a extends ibj {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f201618a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ v9j f201619b;

        public C21622a(d30 d30Var, v9j v9jVar) {
            this.f201618a = d30Var;
            this.f201619b = v9jVar;
        }

        @Override // p149l.ibj, p149l.yrl
        /* JADX INFO: renamed from: a */
        public void mo135255a(View view, @NonNull MotionEvent motionEvent, float f, float f2) {
            super.mo135255a(view, motionEvent, f, f2);
            if (z4m0.this.f201617c == null && ((Boolean) this.f201619b.call()).booleanValue()) {
                z4m0.this.m217111g(view.getContext());
            }
            if (z4m0.this.f201617c != null) {
                if (!z4m0.this.f201617c.m75596d()) {
                    Act act = Act.foreground_() != null ? (Act) Act.foreground_().f15343a.get() : null;
                    if (NullChecker.m81303a(act) && act.lifecycle_().equals(C4319c.f15548i)) {
                        z4m0.this.f201617c.m75599g((ViewGroup) act.getWindow().getDecorView());
                    }
                    if (cri.m108369c("virtual_voice_window_view") != null) {
                        cri.m108369c("virtual_voice_window_view").getManagerView().bringToFront();
                    }
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int height = iArr[1] + view.getHeight();
                z4m0.this.f201617c.getExitAreaView().getLocationOnScreen(iArr);
                int i = iArr[1];
                z4m0 z4m0Var = z4m0.this;
                if (height > i) {
                    z4m0Var.f201617c.m75600h();
                } else {
                    z4m0Var.f201617c.m75601i();
                }
            }
        }

        @Override // p149l.ibj, p149l.yrl
        /* JADX INFO: renamed from: c */
        public void mo135257c(View view) {
            super.mo135257c(view);
            if (z4m0.this.f201617c == null || !z4m0.this.f201617c.m75596d()) {
                return;
            }
            z4m0.this.f201617c.m75595c();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int height = iArr[1] + view.getHeight();
            z4m0.this.f201617c.getExitAreaView().getLocationOnScreen(iArr);
            int height2 = z4m0.this.f201617c.getHeight() - z4m0.this.f201617c.getExitAreaView().getHeight();
            if (height2 <= 0 || height <= height2) {
                z4m0.this.f201617c.m75601i();
            } else {
                this.f201618a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.z4m0$b */
    public class C21623b extends kbj {
        public C21623b() {
        }

        @Override // p149l.kbj, p149l.zrl
        /* JADX INFO: renamed from: d */
        public void mo145305d() {
            super.mo145305d();
            if (z4m0.this.f201615a == null || !((VVirtualVoiceWindowView) z4m0.this.f201615a).mo75609e()) {
                return;
            }
            z4m0.this.f201615a.mo75607c();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m217108d() {
        m217109e();
        this.f201615a = null;
    }

    /* JADX INFO: renamed from: e */
    public void m217109e() {
        if (this.f201615a == null || !this.f201616b) {
            return;
        }
        vrl vrlVarM108369c = cri.m108369c("virtual_voice_window_view");
        if (vrlVarM108369c != null) {
            vrlVarM108369c.cancel();
        }
        this.f201616b = false;
    }

    /* JADX INFO: renamed from: f */
    public e8m m217110f() {
        return this.f201615a;
    }

    /* JADX INFO: renamed from: g */
    public final void m217111g(Context context) {
        if (this.f201617c == null) {
            this.f201617c = new OnExitPopupView(context);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m217112h() {
        return this.f201615a != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m217113i(View.OnClickListener onClickListener, v9j<Boolean> v9jVar, d30 d30Var) {
        boolean z = true;
        if (this.f201616b) {
            return true;
        }
        try {
            Application application = ypv.f199497e;
            Object obj = this.f201615a;
            if (obj == null) {
                this.f201615a = (VVirtualVoiceWindowView) View.inflate(application, t6c0.f168242X6, null);
            } else {
                ViewParent parent = ((View) obj).getParent();
                if (NullChecker.m81303a(parent)) {
                    ((ViewGroup) parent).removeView((View) this.f201615a);
                }
            }
            cri.m108370f(yaj.m213843b().m213849s(application).m100968i((View) this.f201615a).m100969j(new FrameLayout.LayoutParams(t100.m186890d(75.0f), t100.m186890d(76.0f))).m100967h(FxGravity.RIGHT_OR_TOP).m100964e(t100.m186890d(44.0f), 0.0f, t100.m186890d(56.0f), 0.0f).m100971l(onClickListener).m100974p(new C21623b()).m100973o(new C21622a(d30Var, v9jVar)).m100966g(true).m213850t("virtual_voice_window_view").m100963d().m213847q());
            try {
                this.f201616b = true;
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

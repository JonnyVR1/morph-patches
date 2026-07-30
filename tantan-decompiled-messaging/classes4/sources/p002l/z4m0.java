package p002l;

import android.app.Application;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.other.voicewindow.OnExitPopupView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.floatview.assist.FxGravity;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.cri;
import l.d30;
import l.ibj;
import l.kbj;
import l.t100;
import l.v9j;
import l.vrl;
import l.yaj;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z4m0 {

    /* JADX INFO: renamed from: a */
    public e8m f23243a;

    /* JADX INFO: renamed from: b */
    public boolean f23244b = false;

    /* JADX INFO: renamed from: c */
    public OnExitPopupView f23245c;

    /* JADX INFO: renamed from: l.z4m0$a */
    public class C0935a extends ibj {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f23246a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ v9j f23247b;

        public C0935a(d30 d30Var, v9j v9jVar) {
            this.f23246a = d30Var;
            this.f23247b = v9jVar;
        }

        /* JADX INFO: renamed from: a */
        public void m27075a(View view, @NonNull MotionEvent motionEvent, float f, float f2) {
            super.a(view, motionEvent, f, f2);
            if (z4m0.this.f23245c == null && ((Boolean) this.f23247b.call()).booleanValue()) {
                z4m0.this.m27072g(view.getContext());
            }
            if (z4m0.this.f23245c != null) {
                if (!z4m0.this.f23245c.m9237d()) {
                    Act act = Act.foreground_() != null ? (Act) Act.foreground_().a.get() : null;
                    if (NullChecker.a(act) && act.lifecycle_().equals(c.i)) {
                        z4m0.this.f23245c.m9240g((ViewGroup) act.getWindow().getDecorView());
                    }
                    if (cri.c("virtual_voice_window_view") != null) {
                        cri.c("virtual_voice_window_view").a().bringToFront();
                    }
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int height = iArr[1] + view.getHeight();
                z4m0.this.f23245c.getExitAreaView().getLocationOnScreen(iArr);
                int i = iArr[1];
                z4m0 z4m0Var = z4m0.this;
                if (height > i) {
                    z4m0Var.f23245c.m9241h();
                } else {
                    z4m0Var.f23245c.m9242i();
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m27076c(View view) {
            super.c(view);
            if (z4m0.this.f23245c == null || !z4m0.this.f23245c.m9237d()) {
                return;
            }
            z4m0.this.f23245c.m9236c();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int height = iArr[1] + view.getHeight();
            z4m0.this.f23245c.getExitAreaView().getLocationOnScreen(iArr);
            int height2 = z4m0.this.f23245c.getHeight() - z4m0.this.f23245c.getExitAreaView().getHeight();
            if (height2 <= 0 || height <= height2) {
                z4m0.this.f23245c.m9242i();
            } else {
                this.f23246a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.z4m0$b */
    public class C0936b extends kbj {
        public C0936b() {
        }

        /* JADX INFO: renamed from: d */
        public void m27077d() {
            super.d();
            if (z4m0.this.f23243a == null || !z4m0.this.f23243a.e()) {
                return;
            }
            z4m0.this.f23243a.m12269c();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m27069d() {
        m27070e();
        this.f23243a = null;
    }

    /* JADX INFO: renamed from: e */
    public void m27070e() {
        if (this.f23243a == null || !this.f23244b) {
            return;
        }
        vrl vrlVarC = cri.c("virtual_voice_window_view");
        if (vrlVarC != null) {
            vrlVarC.cancel();
        }
        this.f23244b = false;
    }

    /* JADX INFO: renamed from: f */
    public e8m m27071f() {
        return this.f23243a;
    }

    /* JADX INFO: renamed from: g */
    public final void m27072g(Context context) {
        if (this.f23245c == null) {
            this.f23245c = new OnExitPopupView(context);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m27073h() {
        return this.f23243a != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m27074i(View.OnClickListener onClickListener, v9j<Boolean> v9jVar, d30 d30Var) {
        boolean z = true;
        if (this.f23244b) {
            return true;
        }
        try {
            Application application = ypv.e;
            Object obj = this.f23243a;
            if (obj == null) {
                this.f23243a = View.inflate(application, t6c0.f19738X6, null);
            } else {
                ViewParent parent = ((View) obj).getParent();
                if (NullChecker.a(parent)) {
                    ((ViewGroup) parent).removeView((View) this.f23243a);
                }
            }
            cri.f(((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) yaj.b().s(application).i((View) this.f23243a)).j(new FrameLayout.LayoutParams(t100.d(75.0f), t100.d(76.0f)))).h(FxGravity.RIGHT_OR_TOP)).e(t100.d(44.0f), 0.0f, t100.d(56.0f), 0.0f)).l(onClickListener)).p(new C0936b())).o(new C0935a(d30Var, v9jVar))).g(true)).t("virtual_voice_window_view").d()).q());
            try {
                this.f23244b = true;
                return true;
            } catch (Exception e) {
                e = e;
                CrashHelper.c(e);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }
}

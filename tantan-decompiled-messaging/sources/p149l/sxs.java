package p149l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.floatview.assist.FxGravity;
import com.p046p1.mobile.putong.floatview.view.FxManagerView;
import com.p046p1.mobile.putong.live.livingroom.common.window.inApp.LiveInAppFloatView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class sxs implements s7m<oxs> {

    /* JADX INFO: renamed from: e */
    public static String f166818e = "LiveInAppFloatView";

    /* JADX INFO: renamed from: a */
    public oxs f166819a;

    /* JADX INFO: renamed from: b */
    public LiveInAppFloatView f166820b;

    /* JADX INFO: renamed from: c */
    public boolean f166821c = false;

    /* JADX INFO: renamed from: d */
    public GestureDetector f166822d = new GestureDetector(ypv.f199497e, new C20064a());

    /* JADX INFO: renamed from: l.sxs$a */
    public class C20064a extends GestureDetector.SimpleOnGestureListener {
        public C20064a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@NonNull MotionEvent motionEvent) {
            if (sxs.this.f166820b == null) {
                return true;
            }
            sxs.this.f166820b.m73345h();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.sxs$b */
    public class C20065b extends ibj {
        public C20065b() {
        }

        @Override // p149l.ibj, p149l.yrl
        /* JADX INFO: renamed from: d */
        public void mo135258d(@NonNull MotionEvent motionEvent) {
            sxs.this.f166822d.onTouchEvent(motionEvent);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(oxs oxsVar) {
        this.f166819a = oxsVar;
    }

    /* JADX INFO: renamed from: c */
    public void m186535c(boolean z) {
        FxManagerView fxManagerViewMo95654a = cri.m108369c(f166818e).getManagerView();
        if (fxManagerViewMo95654a != null) {
            xdl0.m208344M(fxManagerViewMo95654a, z);
            fld0<hdv> fld0Var = fld0.f98150e;
            dqd0 dqd0Var = ((hdv) ypv.m215673l(fld0Var)).f107313s;
            hpd0 hpd0Var = ((hdv) ypv.m215673l(fld0Var)).f107314t;
            if (dqd0Var.m113005f() && z) {
                fxManagerViewMo95654a.m67120s((float) dqd0Var.m113003d(), (float) dqd0Var.m113004e(), true);
                LiveInAppFloatView liveInAppFloatView = this.f166820b;
                if (liveInAppFloatView != null) {
                    liveInAppFloatView.setVoiceSelected(!hpd0Var.get().booleanValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m186536d() {
        if (this.f166821c) {
            m186538f();
        }
        this.f166820b = null;
    }

    @Override // p149l.s7m
    public void destroy() {
        m186536d();
        this.f166820b = null;
    }

    /* JADX INFO: renamed from: e */
    public LiveInAppFloatView m186537e() {
        return this.f166820b;
    }

    /* JADX INFO: renamed from: f */
    public void m186538f() {
        try {
            vrl vrlVarM108369c = cri.m108369c(f166818e);
            if (vrlVarM108369c != null) {
                vrlVarM108369c.cancel();
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        this.f166821c = false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m186539i() {
        return this.f166820b != null && this.f166821c;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m186540j() {
        this.f166820b.m73341d(this.f166819a.f146242i);
    }

    /* JADX INFO: renamed from: k */
    public boolean m186541k() {
        boolean z = true;
        if (this.f166821c) {
            return true;
        }
        try {
            if (this.f166820b == null) {
                this.f166820b = (LiveInAppFloatView) View.inflate(ypv.f199497e, t6c0.f168430m2, null);
            }
            if (this.f166820b.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f166820b.getParent()).removeView(this.f166820b);
            }
            int[] iArrM219853a = zqi.m219853a(this.f166819a.m166589s());
            int i = iArrM219853a[0];
            int i2 = iArrM219853a[1];
            this.f166820b.getPlayerContainer().setLayoutParams(new FrameLayout.LayoutParams(i, i2));
            cri.m108370f(yaj.m213843b().m213849s(this.f166820b.getContext()).m100968i(this.f166820b).m100969j(new FrameLayout.LayoutParams(i, i2)).m100967h(FxGravity.RIGHT_OR_TOP).m100964e(t100.m186890d(44.0f), 0.0f, t100.m186890d(56.0f), 0.0f).m100966g(true).m213850t(f166818e).m100963d().m100972n(new C20066c()).m100973o(new C20065b()).m213847q());
            try {
                this.f166821c = true;
                m186540j();
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

    /* JADX INFO: renamed from: l */
    public void m186542l(int i, int i2) {
        vrl vrlVarM108369c = cri.m108369c(f166818e);
        if (this.f166820b == null || vrlVarM108369c == null || vrlVarM108369c.getManagerView() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = vrlVarM108369c.getManagerView().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            vrlVarM108369c.getManagerView().setLayoutParams(layoutParams);
        }
        if (this.f166820b.getPlayerContainer() != null) {
            this.f166820b.getPlayerContainer().setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        }
    }

    /* JADX INFO: renamed from: l.sxs$c */
    public class C20066c implements wrl {
        public C20066c() {
        }

        @Override // p149l.wrl
        /* JADX INFO: renamed from: a */
        public void mo110645a(float f, float f2) {
            ((hdv) ypv.m215673l(fld0.f98150e)).f107313s.m113006g(f, f2, "");
        }

        @Override // p149l.wrl
        public float getX() {
            return (float) ((hdv) ypv.m215673l(fld0.f98150e)).f107313s.m113003d();
        }

        @Override // p149l.wrl
        public float getY() {
            return (float) ((hdv) ypv.m215673l(fld0.f98150e)).f107313s.m113004e();
        }

        @Override // p149l.wrl
        public boolean hasConfig() {
            return ((hdv) ypv.m215673l(fld0.f98150e)).f107313s.m113005f();
        }

        @Override // p149l.wrl
        public void clear() {
        }
    }
}

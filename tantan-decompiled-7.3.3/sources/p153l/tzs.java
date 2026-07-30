package p153l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.floatview.assist.FxGravity;
import com.p051p1.mobile.putong.floatview.view.FxManagerView;
import com.p051p1.mobile.putong.live.livingroom.common.window.inApp.LiveInAppFloatView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class tzs implements iam<pzs> {

    /* JADX INFO: renamed from: e */
    public static String f176800e = "LiveInAppFloatView";

    /* JADX INFO: renamed from: a */
    public pzs f176801a;

    /* JADX INFO: renamed from: b */
    public LiveInAppFloatView f176802b;

    /* JADX INFO: renamed from: c */
    public boolean f176803c = false;

    /* JADX INFO: renamed from: d */
    public GestureDetector f176804d = new GestureDetector(zrv.f205803e, new C20433a());

    /* JADX INFO: renamed from: l.tzs$a */
    public class C20433a extends GestureDetector.SimpleOnGestureListener {
        public C20433a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@NonNull MotionEvent motionEvent) {
            if (tzs.this.f176802b == null) {
                return true;
            }
            tzs.this.f176802b.m74528h();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.tzs$b */
    public class C20434b extends cej {
        public C20434b() {
        }

        @Override // p153l.cej, p153l.mul
        /* JADX INFO: renamed from: d */
        public void mo109372d(@NonNull MotionEvent motionEvent) {
            tzs.this.f176804d.onTouchEvent(motionEvent);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(pzs pzsVar) {
        this.f176801a = pzsVar;
    }

    /* JADX INFO: renamed from: c */
    public void m193727c(boolean z) {
        FxManagerView fxManagerViewMo155944a = yti.m217314c(f176800e).getManagerView();
        if (fxManagerViewMo155944a != null) {
            bnl0.m105524M(fxManagerViewMo155944a, z);
            htd0<ifv> htd0Var = htd0.f111523e;
            fyd0 fyd0Var = ((ifv) zrv.m221194l(htd0Var)).f114710s;
            jxd0 jxd0Var = ((ifv) zrv.m221194l(htd0Var)).f114711t;
            if (fyd0Var.m128085f() && z) {
                fxManagerViewMo155944a.m68303s((float) fyd0Var.m128083d(), (float) fyd0Var.m128084e(), true);
                LiveInAppFloatView liveInAppFloatView = this.f176802b;
                if (liveInAppFloatView != null) {
                    liveInAppFloatView.setVoiceSelected(!jxd0Var.get().booleanValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m193728d() {
        if (this.f176803c) {
            m193730f();
        }
        this.f176802b = null;
    }

    @Override // p153l.iam
    public void destroy() {
        m193728d();
        this.f176802b = null;
    }

    /* JADX INFO: renamed from: e */
    public LiveInAppFloatView m193729e() {
        return this.f176802b;
    }

    /* JADX INFO: renamed from: f */
    public void m193730f() {
        try {
            jul julVarM217314c = yti.m217314c(f176800e);
            if (julVarM217314c != null) {
                julVarM217314c.cancel();
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        this.f176803c = false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m193731i() {
        return this.f176802b != null && this.f176803c;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m193732j() {
        this.f176802b.m74524d(this.f176801a.f154971i);
    }

    /* JADX INFO: renamed from: k */
    public boolean m193733k() {
        boolean z = true;
        if (this.f176803c) {
            return true;
        }
        try {
            if (this.f176802b == null) {
                this.f176802b = (LiveInAppFloatView) View.inflate(zrv.f205803e, yec0.f199162m2, null);
            }
            if (this.f176802b.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f176802b.getParent()).removeView(this.f176802b);
            }
            int[] iArrM202673a = vti.m202673a(this.f176801a.m174609s());
            int i = iArrM202673a[0];
            int i2 = iArrM202673a[1];
            this.f176802b.getPlayerContainer().setLayoutParams(new FrameLayout.LayoutParams(i, i2));
            yti.m217315f(sdj.m185465b().m185472s(this.f176802b.getContext()).m200977i(this.f176802b).m200978j(new FrameLayout.LayoutParams(i, i2)).m200976h(FxGravity.RIGHT_OR_TOP).m200973e(qa00.m175859d(44.0f), 0.0f, qa00.m175859d(56.0f), 0.0f).m200975g(true).m185473t(f176800e).m200972d().m200981n(new C20435c()).m200982o(new C20434b()).m185470q());
            try {
                this.f176803c = true;
                m193732j();
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

    /* JADX INFO: renamed from: l */
    public void m193734l(int i, int i2) {
        jul julVarM217314c = yti.m217314c(f176800e);
        if (this.f176802b == null || julVarM217314c == null || julVarM217314c.getManagerView() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = julVarM217314c.getManagerView().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            julVarM217314c.getManagerView().setLayoutParams(layoutParams);
        }
        if (this.f176802b.getPlayerContainer() != null) {
            this.f176802b.getPlayerContainer().setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        }
    }

    /* JADX INFO: renamed from: l.tzs$c */
    public class C20435c implements kul {
        public C20435c() {
        }

        @Override // p153l.kul
        /* JADX INFO: renamed from: a */
        public void mo151558a(float f, float f2) {
            ((ifv) zrv.m221194l(htd0.f111523e)).f114710s.m128086g(f, f2, "");
        }

        @Override // p153l.kul
        public float getX() {
            return (float) ((ifv) zrv.m221194l(htd0.f111523e)).f114710s.m128083d();
        }

        @Override // p153l.kul
        public float getY() {
            return (float) ((ifv) zrv.m221194l(htd0.f111523e)).f114710s.m128084e();
        }

        @Override // p153l.kul
        public boolean hasConfig() {
            return ((ifv) zrv.m221194l(htd0.f111523e)).f114710s.m128085f();
        }

        @Override // p153l.kul
        public void clear() {
        }
    }
}

package p002l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.window.inApp.LiveInAppFloatView;
import com.p1.mobile.putong.floatview.assist.FxGravity;
import com.p1.mobile.putong.floatview.view.FxManagerView;
import com.tantanapp.common.utils.CrashHelper;
import l.cri;
import l.dqd0;
import l.fld0;
import l.hdv;
import l.hpd0;
import l.ibj;
import l.s7m;
import l.t100;
import l.vrl;
import l.wrl;
import l.xdl0;
import l.yaj;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sxs implements s7m<oxs> {

    /* JADX INFO: renamed from: e */
    public static String f19322e = "LiveInAppFloatView";

    /* JADX INFO: renamed from: a */
    public oxs f19323a;

    /* JADX INFO: renamed from: b */
    public LiveInAppFloatView f19324b;

    /* JADX INFO: renamed from: c */
    public boolean f19325c = false;

    /* JADX INFO: renamed from: d */
    public GestureDetector f19326d = new GestureDetector(ypv.e, new C0829a());

    /* JADX INFO: renamed from: l.sxs$a */
    public class C0829a extends GestureDetector.SimpleOnGestureListener {
        public C0829a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@NonNull MotionEvent motionEvent) {
            if (sxs.this.f19324b == null) {
                return true;
            }
            sxs.this.f19324b.m6881h();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.sxs$b */
    public class C0830b extends ibj {
        public C0830b() {
        }

        /* JADX INFO: renamed from: d */
        public void m22755d(@NonNull MotionEvent motionEvent) {
            sxs.this.f19326d.onTouchEvent(motionEvent);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22744C0() {
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m22751i1(oxs oxsVar) {
        this.f19323a = oxsVar;
    }

    /* JADX INFO: renamed from: c */
    public void m22746c(boolean z) {
        FxManagerView fxManagerViewA = cri.c(f19322e).a();
        if (fxManagerViewA != null) {
            xdl0.M(fxManagerViewA, z);
            fld0 fld0Var = fld0.e;
            dqd0 dqd0Var = ((hdv) ypv.l(fld0Var)).s;
            hpd0 hpd0Var = ((hdv) ypv.l(fld0Var)).t;
            if (dqd0Var.f() && z) {
                fxManagerViewA.s((float) dqd0Var.d(), (float) dqd0Var.e(), true);
                LiveInAppFloatView liveInAppFloatView = this.f19324b;
                if (liveInAppFloatView != null) {
                    liveInAppFloatView.setVoiceSelected(!((Boolean) hpd0Var.get()).booleanValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m22747d() {
        if (this.f19325c) {
            m22749f();
        }
        this.f19324b = null;
    }

    public void destroy() {
        m22747d();
        this.f19324b = null;
    }

    /* JADX INFO: renamed from: e */
    public LiveInAppFloatView m22748e() {
        return this.f19324b;
    }

    /* JADX INFO: renamed from: f */
    public void m22749f() {
        try {
            vrl vrlVarC = cri.c(f19322e);
            if (vrlVarC != null) {
                vrlVarC.cancel();
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        this.f19325c = false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m22750i() {
        return this.f19324b != null && this.f19325c;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m22752j() {
        this.f19324b.m6877d(this.f19323a.f16900i);
    }

    /* JADX INFO: renamed from: k */
    public boolean m22753k() {
        boolean z = true;
        if (this.f19325c) {
            return true;
        }
        try {
            if (this.f19324b == null) {
                this.f19324b = (LiveInAppFloatView) View.inflate(ypv.e, t6c0.f19926m2, null);
            }
            if (this.f19324b.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f19324b.getParent()).removeView(this.f19324b);
            }
            int[] iArrM27502a = zqi.m27502a(this.f19323a.m19887s());
            int i = iArrM27502a[0];
            int i2 = iArrM27502a[1];
            this.f19324b.getPlayerContainer().setLayoutParams(new FrameLayout.LayoutParams(i, i2));
            cri.f(((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) ((yaj.a) yaj.b().s(this.f19324b.getContext()).i(this.f19324b)).j(new FrameLayout.LayoutParams(i, i2))).h(FxGravity.RIGHT_OR_TOP)).e(t100.d(44.0f), 0.0f, t100.d(56.0f), 0.0f)).g(true)).t(f19322e).d()).n(new C0831c())).o(new C0830b())).q());
            try {
                this.f19325c = true;
                m22752j();
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

    /* JADX INFO: renamed from: l */
    public void m22754l(int i, int i2) {
        vrl vrlVarC = cri.c(f19322e);
        if (this.f19324b == null || vrlVarC == null || vrlVarC.a() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = vrlVarC.a().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            vrlVarC.a().setLayoutParams(layoutParams);
        }
        if (this.f19324b.getPlayerContainer() != null) {
            this.f19324b.getPlayerContainer().setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        }
    }

    /* JADX INFO: renamed from: l.sxs$c */
    public class C0831c implements wrl {
        public C0831c() {
        }

        /* JADX INFO: renamed from: a */
        public void m22756a(float f, float f2) {
            ((hdv) ypv.l(fld0.e)).s.g(f, f2, "");
        }

        public float getX() {
            return (float) ((hdv) ypv.l(fld0.e)).s.d();
        }

        public float getY() {
            return (float) ((hdv) ypv.l(fld0.e)).s.e();
        }

        public boolean hasConfig() {
            return ((hdv) ypv.l(fld0.e)).s.f();
        }

        public void clear() {
        }
    }
}

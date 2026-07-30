package p006l;

import android.animation.ObjectAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.main.DailyPaperAct;
import com.p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.aoq;
import l.hpd0;
import l.jkp0;
import l.lsi0;
import l.olp0;
import l.sw3;
import p006l.u0c;
import v.VIcon;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class v0c<P extends u0c> extends olp0<u0c> implements View.OnClickListener {

    /* JADX INFO: renamed from: F */
    public ObjectAnimator f23845F;

    /* JADX INFO: renamed from: G */
    public boolean f23846G;

    /* JADX INFO: renamed from: H */
    public hpd0 f23847H;

    /* JADX INFO: renamed from: I */
    public View f23848I;

    /* JADX INFO: renamed from: J */
    public VIcon f23849J;

    /* JADX INFO: renamed from: l.v0c$a */
    public class ViewOnClickListenerC1363a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DailyPaperAct f23850a;

        public ViewOnClickListenerC1363a(DailyPaperAct dailyPaperAct) {
            this.f23850a = dailyPaperAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23850a.g2();
        }
    }

    public v0c(PutongAct putongAct) {
        super(putongAct);
        this.f23847H = new hpd0("firstin_daily_paper_slidding_guide" + CoreModule.m1850H().userId(), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: A */
    public void m25645A(Map<String, String> map) {
        ((olp0) this).d.setLayerType(1, null);
        ((u0c) ((olp0) this).i).m24897n0();
    }

    /* JADX INFO: renamed from: Q */
    public boolean m25646Q(boolean z) {
        View view = this.f23848I;
        if (!z) {
            if (!NullChecker.a(view)) {
                return false;
            }
            ((FrameLayout) f().getWindow().getDecorView()).removeView(this.f23848I);
            this.f23848I = null;
            return true;
        }
        if (view != null || !((Boolean) this.f23847H.get()).booleanValue()) {
            return false;
        }
        this.f23847H.put(Boolean.FALSE);
        this.f23848I = f().inflater().inflate(f6c0.f12061Xc, (ViewGroup) null);
        ((FrameLayout) f().getWindow().getDecorView()).addView(this.f23848I);
        this.f23848I.setOnClickListener(this);
        return true;
    }

    /* JADX INFO: renamed from: R */
    public void m25647R() {
        f().getSupportActionBar().x(20);
        f().getSupportActionBar().C(f().getAppTheme().c());
        f().getSupportActionBar().z(true);
        f().getSupportActionBar().u(f().getResources().getDrawable(x2c0.f27006pr));
        f().getSupportActionBar().A(0.0f);
        f().toolbar().setElevation(0.0f);
        CoreModule.f1534c.m3411l3();
        f().toolbar().setTitleTextColor(f().getAppTheme().f());
        ((olp0) this).g.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: S */
    public void m25648S() {
        if (f() instanceof DailyPaperAct) {
            ((olp0) this).b.B();
            DailyPaperAct dailyPaperActF = f();
            Drawable drawable = dailyPaperActF.getResources().getDrawable(x2c0.f27038qr);
            drawable.mutate();
            drawable.setColorFilter(dailyPaperActF.getResources().getColor(v0c0.f23855c), PorterDuff.Mode.SRC_ATOP);
            VIcon vIcon = new VIcon(dailyPaperActF);
            this.f23849J = vIcon;
            vIcon.setIconStyle(4);
            this.f23849J.setImageDrawable(drawable);
            this.f23849J.setOnClickListener(new ViewOnClickListenerC1363a(dailyPaperActF));
            ((olp0) this).b.z(new View[]{this.f23849J});
        }
    }

    /* JADX INFO: renamed from: T */
    public void m25649T(String str, String str2) {
        ((olp0) this).A.d().b(str2, new String[]{str});
    }

    /* JADX INFO: renamed from: U */
    public void m25650U() {
        if (f().getIntent() != null && this.f23846G) {
            m25645A(null);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m25651V(boolean z) {
        if (!z) {
            if (NullChecker.a(this.f23845F)) {
                this.f23845F.cancel();
            }
        } else {
            ObjectAnimator duration = ObjectAnimator.ofFloat(((olp0) this).h, "rotation", 0.0f, 360.0f).setDuration(700L);
            this.f23845F = duration;
            duration.setRepeatCount(-1);
            this.f23845F.setRepeatMode(1);
            this.f23845F.start();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m25652W() {
        this.f23846G = true;
        m25651V(false);
        ((olp0) this).g.setVisibility(0);
        ((olp0) this).e.setVisibility(8);
        lsi0.y("网络错误");
    }

    /* JADX INFO: renamed from: X */
    public void m25653X(AuthData authData) {
        this.f23846G = false;
        ((olp0) this).A = new aoq(f(), authData.accessToken, ((olp0) this).d);
        HashMap map = new HashMap();
        if (jkp0.d(q())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        ((olp0) this).d.setOverScrollMode(2);
        super.A(map);
    }

    /* JADX INFO: renamed from: Y */
    public void m25654Y(boolean z) {
        VIcon vIcon = this.f23849J;
        if (vIcon != null) {
            vIcon.setVisibility(z ? 0 : 8);
        }
    }

    public void destroy() {
        super.destroy();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == ((olp0) this).g) {
            m25651V(true);
            m25650U();
        } else if (view == this.f23848I) {
            m25646Q(false);
        }
    }

    /* JADX INFO: renamed from: v */
    public sw3.a m25655v() {
        return new C1364b();
    }

    /* JADX INFO: renamed from: y */
    public void m25656y() {
        super.y();
        m25648S();
    }

    /* JADX INFO: renamed from: l.v0c$b */
    public class C1364b implements sw3.a {
        public C1364b() {
        }

        /* JADX INFO: renamed from: a */
        public void m25657a(String str) {
            v0c.this.f23846G = true;
            v0c.this.m25651V(false);
            ((olp0) v0c.this).g.setVisibility(8);
            ((olp0) v0c.this).e.setVisibility(8);
            v0c.this.m25646Q(true);
        }

        /* JADX INFO: renamed from: c */
        public void m25659c(int i, String str, String str2) {
            v0c.this.f23846G = true;
            v0c.this.m25651V(false);
            ((olp0) v0c.this).g.setVisibility(0);
            lsi0.y("网络错误");
        }

        /* JADX INFO: renamed from: b */
        public void m25658b(String str) {
        }
    }
}

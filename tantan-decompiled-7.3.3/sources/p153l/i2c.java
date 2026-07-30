package p153l;

import android.animation.ObjectAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.main.DailyPaperAct;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p151v.VIcon;
import p153l.h2c;

/* JADX INFO: loaded from: classes12.dex */
public class i2c<P extends h2c> extends sup0<h2c> implements View.OnClickListener {

    /* JADX INFO: renamed from: F */
    public ObjectAnimator f112597F;

    /* JADX INFO: renamed from: G */
    public boolean f112598G;

    /* JADX INFO: renamed from: H */
    public jxd0 f112599H;

    /* JADX INFO: renamed from: I */
    public View f112600I;

    /* JADX INFO: renamed from: J */
    public VIcon f112601J;

    /* JADX INFO: renamed from: l.i2c$a */
    public class ViewOnClickListenerC17621a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DailyPaperAct f112602a;

        public ViewOnClickListenerC17621a(DailyPaperAct dailyPaperAct) {
            this.f112602a = dailyPaperAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f112602a.m48513h2();
        }
    }

    public i2c(PutongAct putongAct) {
        super(putongAct);
        this.f112599H = new jxd0("firstin_daily_paper_slidding_guide" + CoreModule.m30929H().userId(), Boolean.TRUE);
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: A */
    public void mo115145A(Map<String, String> map) {
        this.f170715d.setLayerType(1, null);
        ((h2c) this.f170720i).m133380n0();
    }

    /* JADX INFO: renamed from: Q */
    public boolean m138176Q(boolean z) {
        View view = this.f112600I;
        if (!z) {
            if (!NullChecker.m82486a(view)) {
                return false;
            }
            ((FrameLayout) act().getWindow().getDecorView()).removeView(this.f112600I);
            this.f112600I = null;
            return true;
        }
        if (view != null || !this.f112599H.get().booleanValue()) {
            return false;
        }
        this.f112599H.put(Boolean.FALSE);
        this.f112600I = act().inflater().inflate(kec0.f125818ed, (ViewGroup) null);
        ((FrameLayout) act().getWindow().getDecorView()).addView(this.f112600I);
        this.f112600I.setOnClickListener(this);
        return true;
    }

    /* JADX INFO: renamed from: R */
    public void m138177R() {
        act().getSupportActionBar().mo102197x(20);
        act().getSupportActionBar().mo102170C(act().getAppTheme().mo134823c());
        act().getSupportActionBar().mo102199z(true);
        act().getSupportActionBar().mo102194u(act().getResources().getDrawable(dbc0.f86935ds));
        act().getSupportActionBar().mo102168A(0.0f);
        act().toolbar().setElevation(0.0f);
        CoreModule.f18264c.m32484l3();
        act().toolbar().setTitleTextColor(act().getAppTheme().mo134826f());
        this.f170718g.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: S */
    public void m138178S() {
        if (act() instanceof DailyPaperAct) {
            this.f170713b.m224830B();
            DailyPaperAct dailyPaperAct = (DailyPaperAct) act();
            Drawable drawable = dailyPaperAct.getResources().getDrawable(dbc0.f86968es);
            drawable.mutate();
            drawable.setColorFilter(dailyPaperAct.getResources().getColor(b9c0.f75557c), PorterDuff.Mode.SRC_ATOP);
            VIcon vIcon = new VIcon(dailyPaperAct);
            this.f112601J = vIcon;
            vIcon.setIconStyle(4);
            this.f112601J.setImageDrawable(drawable);
            this.f112601J.setOnClickListener(new ViewOnClickListenerC17621a(dailyPaperAct));
            this.f170713b.m224835z(this.f112601J);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m138179T(String str, String str2) {
        this.f170707A.m220919d().mo97004b(str2, str);
    }

    /* JADX INFO: renamed from: U */
    public void m138180U() {
        if (act().getIntent() != null && this.f112598G) {
            mo115145A(null);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m138181V(boolean z) {
        if (!z) {
            if (NullChecker.m82486a(this.f112597F)) {
                this.f112597F.cancel();
            }
        } else {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f170719h, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f).setDuration(700L);
            this.f112597F = duration;
            duration.setRepeatCount(-1);
            this.f112597F.setRepeatMode(1);
            this.f112597F.start();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m138182W() {
        this.f112598G = true;
        m138181V(false);
        this.f170718g.setVisibility(0);
        this.f170716e.setVisibility(8);
        o1j0.m165651y("网络错误");
    }

    /* JADX INFO: renamed from: X */
    public void m138183X(AuthData authData) {
        this.f112598G = false;
        this.f170707A = new zpq(act(), authData.accessToken, this.f170715d);
        HashMap map = new HashMap();
        if (ntp0.m164746d(m188067q())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f170715d.setOverScrollMode(2);
        super.mo115145A(map);
    }

    /* JADX INFO: renamed from: Y */
    public void m138184Y(boolean z) {
        VIcon vIcon = this.f112601J;
        if (vIcon != null) {
            vIcon.setVisibility(z ? 0 : 8);
        }
    }

    @Override // p153l.sup0, p153l.iam
    public void destroy() {
        super.destroy();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f170718g) {
            m138181V(true);
            m138180U();
        } else if (view == this.f112600I) {
            m138176Q(false);
        }
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: v */
    public rx3.InterfaceC19928a mo98402v() {
        return new C17622b();
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: y */
    public void mo115155y() {
        super.mo115155y();
        m138178S();
    }

    /* JADX INFO: renamed from: l.i2c$b */
    public class C17622b implements rx3.InterfaceC19928a {
        public C17622b() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            i2c.this.f112598G = true;
            i2c.this.m138181V(false);
            i2c.this.f170718g.setVisibility(8);
            i2c.this.f170716e.setVisibility(8);
            i2c.this.m138176Q(true);
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            i2c.this.f112598G = true;
            i2c.this.m138181V(false);
            i2c.this.f170718g.setVisibility(0);
            o1j0.m165651y("网络错误");
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
        }
    }
}

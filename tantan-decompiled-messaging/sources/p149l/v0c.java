package p149l;

import android.animation.ObjectAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.main.DailyPaperAct;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p147v.VIcon;
import p149l.u0c;

/* JADX INFO: loaded from: classes9.dex */
public class v0c<P extends u0c> extends olp0<u0c> implements View.OnClickListener {

    /* JADX INFO: renamed from: F */
    public ObjectAnimator f179086F;

    /* JADX INFO: renamed from: G */
    public boolean f179087G;

    /* JADX INFO: renamed from: H */
    public hpd0 f179088H;

    /* JADX INFO: renamed from: I */
    public View f179089I;

    /* JADX INFO: renamed from: J */
    public VIcon f179090J;

    /* JADX INFO: renamed from: l.v0c$a */
    public class ViewOnClickListenerC20554a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DailyPaperAct f179091a;

        public ViewOnClickListenerC20554a(DailyPaperAct dailyPaperAct) {
            this.f179091a = dailyPaperAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f179091a.m47330g2();
        }
    }

    public v0c(PutongAct putongAct) {
        super(putongAct);
        this.f179088H = new hpd0("firstin_daily_paper_slidding_guide" + CoreModule.m29931H().userId(), Boolean.TRUE);
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: A */
    public void mo135219A(Map<String, String> map) {
        this.f144530d.setLayerType(1, null);
        ((u0c) this.f144535i).m191338n0();
    }

    /* JADX INFO: renamed from: Q */
    public boolean m196484Q(boolean z) {
        View view = this.f179089I;
        if (!z) {
            if (!NullChecker.m81303a(view)) {
                return false;
            }
            ((FrameLayout) act().getWindow().getDecorView()).removeView(this.f179089I);
            this.f179089I = null;
            return true;
        }
        if (view != null || !this.f179088H.get().booleanValue()) {
            return false;
        }
        this.f179088H.put(Boolean.FALSE);
        this.f179089I = act().inflater().inflate(f6c0.f95647Xc, (ViewGroup) null);
        ((FrameLayout) act().getWindow().getDecorView()).addView(this.f179089I);
        this.f179089I.setOnClickListener(this);
        return true;
    }

    /* JADX INFO: renamed from: R */
    public void m196485R() {
        act().getSupportActionBar().mo134137x(20);
        act().getSupportActionBar().mo134113C(act().getAppTheme().mo103044c());
        act().getSupportActionBar().mo134139z(true);
        act().getSupportActionBar().mo134134u(act().getResources().getDrawable(x2c0.f190470pr));
        act().getSupportActionBar().mo134111A(0.0f);
        act().toolbar().setElevation(0.0f);
        CoreModule.f17545c.m31481l3();
        act().toolbar().setTitleTextColor(act().getAppTheme().mo103046f());
        this.f144533g.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: S */
    public void m196486S() {
        if (act() instanceof DailyPaperAct) {
            this.f144528b.m223584B();
            DailyPaperAct dailyPaperAct = (DailyPaperAct) act();
            Drawable drawable = dailyPaperAct.getResources().getDrawable(x2c0.f190502qr);
            drawable.mutate();
            drawable.setColorFilter(dailyPaperAct.getResources().getColor(v0c0.f179096c), PorterDuff.Mode.SRC_ATOP);
            VIcon vIcon = new VIcon(dailyPaperAct);
            this.f179090J = vIcon;
            vIcon.setIconStyle(4);
            this.f179090J.setImageDrawable(drawable);
            this.f179090J.setOnClickListener(new ViewOnClickListenerC20554a(dailyPaperAct));
            this.f144528b.m223589z(this.f179090J);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m196487T(String str, String str2) {
        this.f144522A.m97924d().mo127285b(str2, str);
    }

    /* JADX INFO: renamed from: U */
    public void m196488U() {
        if (act().getIntent() != null && this.f179087G) {
            mo135219A(null);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m196489V(boolean z) {
        if (!z) {
            if (NullChecker.m81303a(this.f179086F)) {
                this.f179086F.cancel();
            }
        } else {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f144534h, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f).setDuration(700L);
            this.f179086F = duration;
            duration.setRepeatCount(-1);
            this.f179086F.setRepeatMode(1);
            this.f179086F.start();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m196490W() {
        this.f179087G = true;
        m196489V(false);
        this.f144533g.setVisibility(0);
        this.f144531e.setVisibility(8);
        lsi0.m151595y("网络错误");
    }

    /* JADX INFO: renamed from: X */
    public void m196491X(AuthData authData) {
        this.f179087G = false;
        this.f144522A = new aoq(act(), authData.accessToken, this.f144530d);
        HashMap map = new HashMap();
        if (jkp0.m141904d(m164980q())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f144530d.setOverScrollMode(2);
        super.mo135219A(map);
    }

    /* JADX INFO: renamed from: Y */
    public void m196492Y(boolean z) {
        VIcon vIcon = this.f179090J;
        if (vIcon != null) {
            vIcon.setVisibility(z ? 0 : 8);
        }
    }

    @Override // p149l.olp0, p149l.s7m
    public void destroy() {
        super.destroy();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f144533g) {
            m196489V(true);
            m196488U();
        } else if (view == this.f179089I) {
            m196484Q(false);
        }
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: v */
    public sw3.InterfaceC20043a mo135231v() {
        return new C20555b();
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: y */
    public void mo135232y() {
        super.mo135232y();
        m196486S();
    }

    /* JADX INFO: renamed from: l.v0c$b */
    public class C20555b implements sw3.InterfaceC20043a {
        public C20555b() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            v0c.this.f179087G = true;
            v0c.this.m196489V(false);
            v0c.this.f144533g.setVisibility(8);
            v0c.this.f144531e.setVisibility(8);
            v0c.this.m196484Q(true);
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            v0c.this.f179087G = true;
            v0c.this.m196489V(false);
            v0c.this.f144533g.setVisibility(0);
            lsi0.m151595y("网络错误");
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
        }
    }
}

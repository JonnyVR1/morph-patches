package p153l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CityCBanner;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverView1;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverView2;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverView3;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverView4;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class n55 extends pej0 {

    /* JADX INFO: renamed from: f */
    public Act f140284f;

    /* JADX INFO: renamed from: g */
    public String f140285g;

    /* JADX INFO: renamed from: h */
    public l4g0 f140286h;

    /* JADX INFO: renamed from: i */
    public CityCoverView1 f140287i;

    /* JADX INFO: renamed from: j */
    public CityCoverView2 f140288j;

    /* JADX INFO: renamed from: k */
    public CityCoverView3 f140289k;

    /* JADX INFO: renamed from: l */
    public CityCoverView4 f140290l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f140291m;

    /* JADX INFO: renamed from: n */
    public VText f140292n;

    /* JADX INFO: renamed from: o */
    public VText f140293o;

    /* JADX INFO: renamed from: p */
    public VImage f140294p;

    /* JADX INFO: renamed from: q */
    public int f140295q;

    /* JADX INFO: renamed from: r */
    public int f140296r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public CityCData f140297s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public CityCBanner f140298t;

    /* JADX INFO: renamed from: l.n55$a */
    public class ViewOnClickListenerC18796a implements View.OnClickListener {
        public ViewOnClickListenerC18796a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n55 n55Var = n55.this;
            int i = n55Var.f140296r;
            if (i == 0) {
                n55Var.dismiss();
            } else {
                n55Var.m161674K(i, n55Var.f140297s, n55Var.f140298t);
                n55.this.f140296r = 0;
            }
        }
    }

    /* JADX INFO: renamed from: l.n55$b */
    public class ViewOnClickListenerC18797b implements View.OnClickListener {
        public ViewOnClickListenerC18797b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n55 n55Var = n55.this;
            n55Var.f140296r = n55Var.f140295q;
            n55Var.m161677N();
        }
    }

    /* JADX INFO: renamed from: l.n55$c */
    public class C18798c implements x20 {
        public C18798c() {
        }

        @Override // p153l.x20
        public void call() {
            n55.this.f140287i.m46411h();
            n55 n55Var = n55.this;
            n55Var.m161675L(5, n55Var.f140297s, n55Var.f140298t, false);
        }
    }

    /* JADX INFO: renamed from: l.n55$d */
    public class C18799d implements x20 {
        public C18799d() {
        }

        @Override // p153l.x20
        public void call() {
            n55 n55Var = n55.this;
            n55Var.m161675L(5, n55Var.f140297s, n55Var.f140298t, false);
        }
    }

    /* JADX INFO: renamed from: l.n55$e */
    public class C18800e implements x20 {
        public C18800e() {
        }

        @Override // p153l.x20
        public void call() {
            if (n55.this.f140284f != null) {
                n55.this.f140284f.startActivity(ProfileAct.m51905A2(n55.this.f140284f, n55.this.f140297s.userId, "from_city_center_boost_cover", true, false, true));
            }
        }
    }

    public n55(@NonNull Act act, String str) {
        super(act, agc0.f71117c);
        this.f140295q = 0;
        this.f140296r = 0;
        this.f140284f = act;
        this.f140285g = str;
        setCancelable(true);
    }

    /* JADX INFO: renamed from: G */
    private void m161667G() {
        final Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setState(3);
            frameLayout.setBackgroundResource(dbc0.f87503v5);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C18801f(bottomSheetBehaviorFrom));
        }
        l51.m152887G(new Runnable() { // from class: l.m55
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(agc0.f71125k);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    private void m161668J() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m161672H() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m161673I(Boolean bool) {
        if (bool.booleanValue()) {
            dismiss();
            s75.m184964l().m184971o();
            new p55(this.f140284f, "").show();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m161674K(int i, @Nullable CityCData cityCData, @Nullable CityCBanner cityCBanner) {
        m161675L(i, cityCData, cityCBanner, true);
    }

    /* JADX INFO: renamed from: L */
    public final void m161675L(int i, @Nullable CityCData cityCData, @Nullable CityCBanner cityCBanner, boolean z) {
        super.show();
        if (z) {
            m161667G();
        }
        this.f140295q = i;
        this.f140297s = cityCData;
        this.f140298t = cityCBanner;
        if (i == 1) {
            m161678O();
        } else if (i == 2) {
            m161680Q();
        } else if (i == 3) {
            m161679P();
        } else if (i == 4) {
            m161677N();
        } else if (i == 5) {
            m161676M();
        }
        int i2 = this.f140295q;
        if (i2 == 2) {
            this.f140286h.m152781p(jyb.m147494Y("city_cover_uid", CoreModule.m30929H().userId()));
        } else {
            l4g0 l4g0Var = this.f140286h;
            if (i2 == 3) {
                l4g0Var.m152781p(jyb.m147494Y("city_cover_uid", cityCData != null ? cityCData.userId : ""));
            } else {
                l4g0Var.m152781p(jyb.m147494Y("", ""));
            }
        }
        this.f140286h.m152768c();
        this.f140286h.m152783r();
    }

    /* JADX INFO: renamed from: M */
    public final void m161676M() {
        bnl0.m105524M(this.f140287i, false);
        bnl0.m105524M(this.f140288j, false);
        bnl0.m105524M(this.f140289k, false);
        bnl0.m105524M(this.f140290l, true);
        bnl0.m105524M(this.f140294p, true);
        bnl0.m105524M(this.f140291m, false);
        this.f140290l.m46441t(new y20() { // from class: l.k55
            @Override // p153l.y20
            public final void call(Object obj) {
                i4g0.m138523u("e_city_cover_before_pay_confirm", "p_city_cover_before_pay", jyb.m147494Y("pay_confirm_result", (String) obj));
            }
        }, new y20() { // from class: l.l55
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130067a.m161673I((Boolean) obj);
            }
        });
        this.f140293o.setText("城市封面");
        this.f140286h = w1e.m204399c("p_city_cover_before_pay", getClass().getName());
    }

    /* JADX INFO: renamed from: N */
    public final void m161677N() {
        bnl0.m105524M(this.f140287i, false);
        bnl0.m105524M(this.f140288j, false);
        bnl0.m105524M(this.f140289k, false);
        bnl0.m105524M(this.f140290l, false);
        bnl0.m105524M(this.f140294p, false);
        bnl0.m105524M(this.f140291m, true);
        this.f140293o.setText("功能说明");
        int iM184963i = s75.m184963i();
        if (iM184963i <= 0) {
            iM184963i = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
        }
        this.f140292n.setText(String.format("1、登顶城市封面后，24小时内全城女性登录探探看到的首卡都是你；\n2、城市封面用户将以专属名片置顶出现在同城女性的消息页顶部，独享全城聚光灯；\n3、登顶1次城市封面需花费%s探探币；\n4、本功能当前处于内测阶段，后续将逐步开放；\n5、城市封面购买后立即生效，暂不支持退款。如有任何购买或体验问题，请联系探探客服（入口：我-更多-我的客服）。", Integer.valueOf(iM184963i)));
    }

    /* JADX INFO: renamed from: O */
    public final void m161678O() {
        bnl0.m105524M(this.f140287i, true);
        bnl0.m105524M(this.f140288j, false);
        bnl0.m105524M(this.f140289k, false);
        bnl0.m105524M(this.f140290l, false);
        bnl0.m105524M(this.f140294p, true);
        bnl0.m105524M(this.f140291m, false);
        this.f140293o.setText("城市封面");
        this.f140287i.m46413j(this.f140298t, new C18798c());
        this.f140286h = w1e.m204399c("p_city_cover_feature_show", getClass().getName());
    }

    /* JADX INFO: renamed from: P */
    public final void m161679P() {
        bnl0.m105524M(this.f140287i, false);
        bnl0.m105524M(this.f140288j, false);
        bnl0.m105524M(this.f140289k, true);
        bnl0.m105524M(this.f140290l, false);
        bnl0.m105524M(this.f140294p, true);
        bnl0.m105524M(this.f140291m, false);
        this.f140293o.setText("城市封面");
        this.f140289k.m46421b(this.f140297s, new C18799d(), new C18800e());
        this.f140286h = w1e.m204399c("p_city_cover_desc_show_someone", getClass().getName());
    }

    /* JADX INFO: renamed from: Q */
    public final void m161680Q() {
        bnl0.m105524M(this.f140287i, false);
        bnl0.m105524M(this.f140288j, true);
        bnl0.m105524M(this.f140289k, false);
        bnl0.m105524M(this.f140290l, false);
        bnl0.m105524M(this.f140294p, true);
        bnl0.m105524M(this.f140291m, false);
        this.f140293o.setText("城市封面");
        this.f140288j.setData(this.f140297s);
        this.f140288j.m46418d();
        this.f140286h = w1e.m204399c("p_city_cover_desc_show_someone", getClass().getName());
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f140286h.m152776k();
        this.f140286h.m152775j();
        getWindow().setWindowAnimations(agc0.f71115a);
        l51.m152887G(new Runnable() { // from class: l.j55
            @Override // java.lang.Runnable
            public final void run() {
                this.f118367a.m161672H();
            }
        });
        this.f140287i.m46411h();
        this.f140288j.m46417c();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f140284f).inflate(kec0.f125992p1, (ViewGroup) null, false), new FrameLayout.LayoutParams(-1, -1));
        m161668J();
        findViewById(adc0.f69806A1).setOnClickListener(new ViewOnClickListenerC18796a());
        findViewById(adc0.f70014M5).setOnClickListener(new ViewOnClickListenerC18797b());
        this.f140293o = (VText) findViewById(adc0.f70280c3);
        this.f140294p = (VImage) findViewById(adc0.f70014M5);
        this.f140287i = (CityCoverView1) findViewById(adc0.f70549s1);
        this.f140288j = (CityCoverView2) findViewById(adc0.f70566t1);
        this.f140289k = (CityCoverView3) findViewById(adc0.f70583u1);
        this.f140290l = (CityCoverView4) findViewById(adc0.f70600v1);
        this.f140291m = (FrameLayout) findViewById(adc0.f69962J4);
        this.f140292n = (VText) findViewById(adc0.f69979K4);
        this.f140293o.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // android.app.Dialog
    @Deprecated
    public void show() {
    }

    /* JADX INFO: renamed from: l.n55$f */
    public class C18801f extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f140304a;

        public C18801f(BottomSheetBehavior bottomSheetBehavior) {
            this.f140304a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f140304a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                n55.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

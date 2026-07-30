package p003l;

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
import com.p000p1.mobile.putong.core.data.CityCBanner;
import com.p000p1.mobile.putong.core.data.CityCData;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverView1;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverView2;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverView3;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverView4;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.f6c0;
import l.i0e;
import l.j760;
import l.l5j0;
import l.r65;
import l.u4c0;
import l.v7c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m45 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f6247f;

    /* JADX INFO: renamed from: g */
    public String f6248g;

    /* JADX INFO: renamed from: h */
    public cwf0 f6249h;

    /* JADX INFO: renamed from: i */
    public CityCoverView1 f6250i;

    /* JADX INFO: renamed from: j */
    public CityCoverView2 f6251j;

    /* JADX INFO: renamed from: k */
    public CityCoverView3 f6252k;

    /* JADX INFO: renamed from: l */
    public CityCoverView4 f6253l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f6254m;

    /* JADX INFO: renamed from: n */
    public VText f6255n;

    /* JADX INFO: renamed from: o */
    public VText f6256o;

    /* JADX INFO: renamed from: p */
    public VImage f6257p;

    /* JADX INFO: renamed from: q */
    public int f6258q;

    /* JADX INFO: renamed from: r */
    public int f6259r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public CityCData f6260s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public CityCBanner f6261t;

    /* JADX INFO: renamed from: l.m45$a */
    public class ViewOnClickListenerC3367a implements View.OnClickListener {
        public ViewOnClickListenerC3367a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m45 m45Var = m45.this;
            int i = m45Var.f6259r;
            if (i == 0) {
                m45Var.dismiss();
            } else {
                m45Var.m7966K(i, m45Var.f6260s, m45Var.f6261t);
                m45.this.f6259r = 0;
            }
        }
    }

    /* JADX INFO: renamed from: l.m45$b */
    public class ViewOnClickListenerC3368b implements View.OnClickListener {
        public ViewOnClickListenerC3368b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m45 m45Var = m45.this;
            m45Var.f6259r = m45Var.f6258q;
            m45Var.m7969N();
        }
    }

    /* JADX INFO: renamed from: l.m45$c */
    public class C3369c implements d30 {
        public C3369c() {
        }

        public void call() {
            m45.this.f6250i.m2545h();
            m45 m45Var = m45.this;
            m45Var.m7967L(5, m45Var.f6260s, m45Var.f6261t, false);
        }
    }

    /* JADX INFO: renamed from: l.m45$d */
    public class C3370d implements d30 {
        public C3370d() {
        }

        public void call() {
            m45 m45Var = m45.this;
            m45Var.m7967L(5, m45Var.f6260s, m45Var.f6261t, false);
        }
    }

    /* JADX INFO: renamed from: l.m45$e */
    public class C3371e implements d30 {
        public C3371e() {
        }

        public void call() {
            if (m45.this.f6247f != null) {
                m45.this.f6247f.startActivity(ProfileAct.z2(m45.this.f6247f, m45.this.f6260s.userId, "from_city_center_boost_cover", true, false, true));
            }
        }
    }

    public m45(@NonNull Act act, String str) {
        super(act, v7c0.c);
        this.f6258q = 0;
        this.f6259r = 0;
        this.f6247f = act;
        this.f6248g = str;
        setCancelable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private void m7959G() {
        final Window window = getWindow();
        if (NullChecker.a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.o2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setState(3);
            frameLayout.setBackgroundResource(x2c0.u5);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C3372f(bottomSheetBehaviorFrom));
        }
        e51.G(new Runnable() { // from class: l.l45
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.k);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    private void m7960J() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7964H() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7965I(Boolean bool) {
        if (bool.booleanValue()) {
            dismiss();
            r65.l().o();
            new o45(this.f6247f, "").show();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m7966K(int i, @Nullable CityCData cityCData, @Nullable CityCBanner cityCBanner) {
        m7967L(i, cityCData, cityCBanner, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final void m7967L(int i, @Nullable CityCData cityCData, @Nullable CityCBanner cityCBanner, boolean z) {
        super/*android.app.Dialog*/.show();
        if (z) {
            m7959G();
        }
        this.f6258q = i;
        this.f6260s = cityCData;
        this.f6261t = cityCBanner;
        if (i == 1) {
            m7970O();
        } else if (i == 2) {
            m7972Q();
        } else if (i == 3) {
            m7971P();
        } else if (i == 4) {
            m7969N();
        } else if (i == 5) {
            m7968M();
        }
        int i2 = this.f6258q;
        if (i2 == 2) {
            this.f6249h.p(new j760[]{vwb.Y("city_cover_uid", CoreModule.H().userId())});
        } else {
            cwf0 cwf0Var = this.f6249h;
            if (i2 == 3) {
                cwf0Var.p(new j760[]{vwb.Y("city_cover_uid", cityCData != null ? cityCData.userId : "")});
            } else {
                cwf0Var.p(new j760[]{vwb.Y("", "")});
            }
        }
        this.f6249h.c();
        this.f6249h.r();
    }

    /* JADX INFO: renamed from: M */
    public final void m7968M() {
        xdl0.M(this.f6250i, false);
        xdl0.M(this.f6251j, false);
        xdl0.M(this.f6252k, false);
        xdl0.M(this.f6253l, true);
        xdl0.M(this.f6257p, true);
        xdl0.M(this.f6254m, false);
        this.f6253l.m2577t(new e30() { // from class: l.j45
            public final void call(Object obj) {
                zvf0.u("e_city_cover_before_pay_confirm", "p_city_cover_before_pay", new j760[]{vwb.Y("pay_confirm_result", (String) obj)});
            }
        }, new e30() { // from class: l.k45
            public final void call(Object obj) {
                this.f5433a.m7965I((Boolean) obj);
            }
        });
        this.f6256o.setText("城市封面");
        this.f6249h = i0e.c("p_city_cover_before_pay", getClass().getName());
    }

    /* JADX INFO: renamed from: N */
    public final void m7969N() {
        xdl0.M(this.f6250i, false);
        xdl0.M(this.f6251j, false);
        xdl0.M(this.f6252k, false);
        xdl0.M(this.f6253l, false);
        xdl0.M(this.f6257p, false);
        xdl0.M(this.f6254m, true);
        this.f6256o.setText("功能说明");
        int i = r65.i();
        if (i <= 0) {
            i = 50000;
        }
        this.f6255n.setText(String.format("1、登顶城市封面后，24小时内全城女性登录探探看到的首卡都是你；\n2、城市封面用户将以专属名片置顶出现在同城女性的消息页顶部，独享全城聚光灯；\n3、登顶1次城市封面需花费%s探探币；\n4、本功能当前处于内测阶段，后续将逐步开放；\n5、城市封面购买后立即生效，暂不支持退款。如有任何购买或体验问题，请联系探探客服（入口：我-更多-我的客服）。", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: O */
    public final void m7970O() {
        xdl0.M(this.f6250i, true);
        xdl0.M(this.f6251j, false);
        xdl0.M(this.f6252k, false);
        xdl0.M(this.f6253l, false);
        xdl0.M(this.f6257p, true);
        xdl0.M(this.f6254m, false);
        this.f6256o.setText("城市封面");
        this.f6250i.m2547j(this.f6261t, new C3369c());
        this.f6249h = i0e.c("p_city_cover_feature_show", getClass().getName());
    }

    /* JADX INFO: renamed from: P */
    public final void m7971P() {
        xdl0.M(this.f6250i, false);
        xdl0.M(this.f6251j, false);
        xdl0.M(this.f6252k, true);
        xdl0.M(this.f6253l, false);
        xdl0.M(this.f6257p, true);
        xdl0.M(this.f6254m, false);
        this.f6256o.setText("城市封面");
        this.f6252k.m2557b(this.f6260s, new C3370d(), new C3371e());
        this.f6249h = i0e.c("p_city_cover_desc_show_someone", getClass().getName());
    }

    /* JADX INFO: renamed from: Q */
    public final void m7972Q() {
        xdl0.M(this.f6250i, false);
        xdl0.M(this.f6251j, true);
        xdl0.M(this.f6252k, false);
        xdl0.M(this.f6253l, false);
        xdl0.M(this.f6257p, true);
        xdl0.M(this.f6254m, false);
        this.f6256o.setText("城市封面");
        this.f6251j.setData(this.f6260s);
        this.f6251j.m2554d();
        this.f6249h = i0e.c("p_city_cover_desc_show_someone", getClass().getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        this.f6249h.k();
        this.f6249h.j();
        getWindow().setWindowAnimations(v7c0.a);
        e51.G(new Runnable() { // from class: l.i45
            @Override // java.lang.Runnable
            public final void run() {
                this.f4987a.m7964H();
            }
        });
        this.f6250i.m2545h();
        this.f6251j.m2553c();
    }

    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f6247f).inflate(f6c0.p1, (ViewGroup) null, false), new FrameLayout.LayoutParams(-1, -1));
        m7960J();
        findViewById(u4c0.A1).setOnClickListener(new ViewOnClickListenerC3367a());
        findViewById(u4c0.K5).setOnClickListener(new ViewOnClickListenerC3368b());
        this.f6256o = findViewById(u4c0.a3);
        this.f6257p = findViewById(u4c0.K5);
        this.f6250i = (CityCoverView1) findViewById(u4c0.s1);
        this.f6251j = (CityCoverView2) findViewById(u4c0.t1);
        this.f6252k = (CityCoverView3) findViewById(u4c0.u1);
        this.f6253l = (CityCoverView4) findViewById(u4c0.v1);
        this.f6254m = (FrameLayout) findViewById(u4c0.H4);
        this.f6255n = findViewById(u4c0.I4);
        this.f6256o.setTypeface(eqh0.c(3), 1);
    }

    @Deprecated
    public void show() {
    }

    /* JADX INFO: renamed from: l.m45$f */
    public class C3372f extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f6267a;

        public C3372f(BottomSheetBehavior bottomSheetBehavior) {
            this.f6267a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f6267a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                m45.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

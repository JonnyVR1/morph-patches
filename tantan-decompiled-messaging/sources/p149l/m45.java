package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CityCBanner;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverView1;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverView2;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverView3;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverView4;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m45 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f131228f;

    /* JADX INFO: renamed from: g */
    public String f131229g;

    /* JADX INFO: renamed from: h */
    public cwf0 f131230h;

    /* JADX INFO: renamed from: i */
    public CityCoverView1 f131231i;

    /* JADX INFO: renamed from: j */
    public CityCoverView2 f131232j;

    /* JADX INFO: renamed from: k */
    public CityCoverView3 f131233k;

    /* JADX INFO: renamed from: l */
    public CityCoverView4 f131234l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f131235m;

    /* JADX INFO: renamed from: n */
    public VText f131236n;

    /* JADX INFO: renamed from: o */
    public VText f131237o;

    /* JADX INFO: renamed from: p */
    public VImage f131238p;

    /* JADX INFO: renamed from: q */
    public int f131239q;

    /* JADX INFO: renamed from: r */
    public int f131240r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public CityCData f131241s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public CityCBanner f131242t;

    /* JADX INFO: renamed from: l.m45$a */
    public class ViewOnClickListenerC18388a implements View.OnClickListener {
        public ViewOnClickListenerC18388a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m45 m45Var = m45.this;
            int i = m45Var.f131240r;
            if (i == 0) {
                m45Var.dismiss();
            } else {
                m45Var.m153003K(i, m45Var.f131241s, m45Var.f131242t);
                m45.this.f131240r = 0;
            }
        }
    }

    /* JADX INFO: renamed from: l.m45$b */
    public class ViewOnClickListenerC18389b implements View.OnClickListener {
        public ViewOnClickListenerC18389b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m45 m45Var = m45.this;
            m45Var.f131240r = m45Var.f131239q;
            m45Var.m153006N();
        }
    }

    /* JADX INFO: renamed from: l.m45$c */
    public class C18390c implements d30 {
        public C18390c() {
        }

        @Override // p149l.d30
        public void call() {
            m45.this.f131231i.m45228h();
            m45 m45Var = m45.this;
            m45Var.m153004L(5, m45Var.f131241s, m45Var.f131242t, false);
        }
    }

    /* JADX INFO: renamed from: l.m45$d */
    public class C18391d implements d30 {
        public C18391d() {
        }

        @Override // p149l.d30
        public void call() {
            m45 m45Var = m45.this;
            m45Var.m153004L(5, m45Var.f131241s, m45Var.f131242t, false);
        }
    }

    /* JADX INFO: renamed from: l.m45$e */
    public class C18392e implements d30 {
        public C18392e() {
        }

        @Override // p149l.d30
        public void call() {
            if (m45.this.f131228f != null) {
                m45.this.f131228f.startActivity(ProfileAct.m50746z2(m45.this.f131228f, m45.this.f131241s.userId, "from_city_center_boost_cover", true, false, true));
            }
        }
    }

    public m45(@NonNull Act act, String str) {
        super(act, v7c0.f180356c);
        this.f131239q = 0;
        this.f131240r = 0;
        this.f131228f = act;
        this.f131229g = str;
        setCancelable(true);
    }

    /* JADX INFO: renamed from: G */
    private void m152996G() {
        final Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setState(3);
            frameLayout.setBackgroundResource(x2c0.f190608u5);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C18393f(bottomSheetBehaviorFrom));
        }
        e51.m114742G(new Runnable() { // from class: l.l45
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f180364k);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    private void m152997J() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m153001H() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m153002I(Boolean bool) {
        if (bool.booleanValue()) {
            dismiss();
            r65.m178034l().m178041o();
            new o45(this.f131228f, "").show();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m153003K(int i, @Nullable CityCData cityCData, @Nullable CityCBanner cityCBanner) {
        m153004L(i, cityCData, cityCBanner, true);
    }

    /* JADX INFO: renamed from: L */
    public final void m153004L(int i, @Nullable CityCData cityCData, @Nullable CityCBanner cityCBanner, boolean z) {
        super.show();
        if (z) {
            m152996G();
        }
        this.f131239q = i;
        this.f131241s = cityCData;
        this.f131242t = cityCBanner;
        if (i == 1) {
            m153007O();
        } else if (i == 2) {
            m153009Q();
        } else if (i == 3) {
            m153008P();
        } else if (i == 4) {
            m153006N();
        } else if (i == 5) {
            m153005M();
        }
        int i2 = this.f131239q;
        if (i2 == 2) {
            this.f131230h.m109040p(vwb.m200311Y("city_cover_uid", CoreModule.m29931H().userId()));
        } else {
            cwf0 cwf0Var = this.f131230h;
            if (i2 == 3) {
                cwf0Var.m109040p(vwb.m200311Y("city_cover_uid", cityCData != null ? cityCData.userId : ""));
            } else {
                cwf0Var.m109040p(vwb.m200311Y("", ""));
            }
        }
        this.f131230h.m109027c();
        this.f131230h.m109042r();
    }

    /* JADX INFO: renamed from: M */
    public final void m153005M() {
        xdl0.m208344M(this.f131231i, false);
        xdl0.m208344M(this.f131232j, false);
        xdl0.m208344M(this.f131233k, false);
        xdl0.m208344M(this.f131234l, true);
        xdl0.m208344M(this.f131238p, true);
        xdl0.m208344M(this.f131235m, false);
        this.f131234l.m45258t(new e30() { // from class: l.j45
            @Override // p149l.e30
            public final void call(Object obj) {
                zvf0.m220399u("e_city_cover_before_pay_confirm", "p_city_cover_before_pay", vwb.m200311Y("pay_confirm_result", (String) obj));
            }
        }, new e30() { // from class: l.k45
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120945a.m153002I((Boolean) obj);
            }
        });
        this.f131237o.setText("城市封面");
        this.f131230h = i0e.m133794c("p_city_cover_before_pay", getClass().getName());
    }

    /* JADX INFO: renamed from: N */
    public final void m153006N() {
        xdl0.m208344M(this.f131231i, false);
        xdl0.m208344M(this.f131232j, false);
        xdl0.m208344M(this.f131233k, false);
        xdl0.m208344M(this.f131234l, false);
        xdl0.m208344M(this.f131238p, false);
        xdl0.m208344M(this.f131235m, true);
        this.f131237o.setText("功能说明");
        int iM178033i = r65.m178033i();
        if (iM178033i <= 0) {
            iM178033i = 50000;
        }
        this.f131236n.setText(String.format("1、登顶城市封面后，24小时内全城女性登录探探看到的首卡都是你；\n2、城市封面用户将以专属名片置顶出现在同城女性的消息页顶部，独享全城聚光灯；\n3、登顶1次城市封面需花费%s探探币；\n4、本功能当前处于内测阶段，后续将逐步开放；\n5、城市封面购买后立即生效，暂不支持退款。如有任何购买或体验问题，请联系探探客服（入口：我-更多-我的客服）。", Integer.valueOf(iM178033i)));
    }

    /* JADX INFO: renamed from: O */
    public final void m153007O() {
        xdl0.m208344M(this.f131231i, true);
        xdl0.m208344M(this.f131232j, false);
        xdl0.m208344M(this.f131233k, false);
        xdl0.m208344M(this.f131234l, false);
        xdl0.m208344M(this.f131238p, true);
        xdl0.m208344M(this.f131235m, false);
        this.f131237o.setText("城市封面");
        this.f131231i.m45230j(this.f131242t, new C18390c());
        this.f131230h = i0e.m133794c("p_city_cover_feature_show", getClass().getName());
    }

    /* JADX INFO: renamed from: P */
    public final void m153008P() {
        xdl0.m208344M(this.f131231i, false);
        xdl0.m208344M(this.f131232j, false);
        xdl0.m208344M(this.f131233k, true);
        xdl0.m208344M(this.f131234l, false);
        xdl0.m208344M(this.f131238p, true);
        xdl0.m208344M(this.f131235m, false);
        this.f131237o.setText("城市封面");
        this.f131233k.m45238b(this.f131241s, new C18391d(), new C18392e());
        this.f131230h = i0e.m133794c("p_city_cover_desc_show_someone", getClass().getName());
    }

    /* JADX INFO: renamed from: Q */
    public final void m153009Q() {
        xdl0.m208344M(this.f131231i, false);
        xdl0.m208344M(this.f131232j, true);
        xdl0.m208344M(this.f131233k, false);
        xdl0.m208344M(this.f131234l, false);
        xdl0.m208344M(this.f131238p, true);
        xdl0.m208344M(this.f131235m, false);
        this.f131237o.setText("城市封面");
        this.f131232j.setData(this.f131241s);
        this.f131232j.m45235d();
        this.f131230h = i0e.m133794c("p_city_cover_desc_show_someone", getClass().getName());
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f131230h.m109035k();
        this.f131230h.m109034j();
        getWindow().setWindowAnimations(v7c0.f180354a);
        e51.m114742G(new Runnable() { // from class: l.i45
            @Override // java.lang.Runnable
            public final void run() {
                this.f111407a.m153001H();
            }
        });
        this.f131231i.m45228h();
        this.f131232j.m45234c();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f131228f).inflate(f6c0.f95938p1, (ViewGroup) null, false), new FrameLayout.LayoutParams(-1, -1));
        m152997J();
        findViewById(u4c0.f173718A1).setOnClickListener(new ViewOnClickListenerC18388a());
        findViewById(u4c0.f173892K5).setOnClickListener(new ViewOnClickListenerC18389b());
        this.f131237o = (VText) findViewById(u4c0.f174155a3);
        this.f131238p = (VImage) findViewById(u4c0.f173892K5);
        this.f131231i = (CityCoverView1) findViewById(u4c0.f174458s1);
        this.f131232j = (CityCoverView2) findViewById(u4c0.f174475t1);
        this.f131233k = (CityCoverView3) findViewById(u4c0.f174492u1);
        this.f131234l = (CityCoverView4) findViewById(u4c0.f174509v1);
        this.f131235m = (FrameLayout) findViewById(u4c0.f173840H4);
        this.f131236n = (VText) findViewById(u4c0.f173857I4);
        this.f131237o.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // android.app.Dialog
    @Deprecated
    public void show() {
    }

    /* JADX INFO: renamed from: l.m45$f */
    public class C18393f extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f131248a;

        public C18393f(BottomSheetBehavior bottomSheetBehavior) {
            this.f131248a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f131248a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                m45.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

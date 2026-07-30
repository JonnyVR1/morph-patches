package p149l;

import android.R;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.marry.audit.MarryInfoAuditStatusAct;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class qfh0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f154110f;

    /* JADX INFO: renamed from: g */
    public String f154111g;

    /* JADX INFO: renamed from: h */
    public Act f154112h;

    /* JADX INFO: renamed from: i */
    public VLinear f154113i;

    /* JADX INFO: renamed from: j */
    public VLinear f154114j;

    /* JADX INFO: renamed from: k */
    public VImage f154115k;

    /* JADX INFO: renamed from: l */
    public VImage f154116l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f154117m;

    /* JADX INFO: renamed from: n */
    public cwf0 f154118n;

    /* JADX INFO: renamed from: o */
    public BottomSheetBehavior.BottomSheetCallback f154119o;

    /* JADX INFO: renamed from: l.qfh0$a */
    public class ViewOnClickListenerC19480a implements View.OnClickListener {
        public ViewOnClickListenerC19480a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode)) {
                CoreModule.f17545c.f19639e0.f149321Z3.put(UserHomeMode.loveMode);
                CoreModule.f17545c.f19639e0.f149170F1.m132487l(roj0.f160388a);
                Act act = qfh0.this.f154112h;
                if (act instanceof NewMainAct) {
                    ((NewMainAct) act).m39786N5(TabName.Card);
                    osi0.m165783g("已切换为想恋爱模式");
                }
                qfh0.this.f154116l.setBackgroundResource(x2c0.f190565sq);
                qfh0.this.f154115k.setBackgroundResource(x2c0.f190533rq);
                qfh0.this.m101651T();
                CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode);
                zvf0.m220399u("e_mode_sidebar", qfh0.this.m174315D(), vwb.m200311Y("mode_select", "love"));
            }
        }
    }

    /* JADX INFO: renamed from: l.qfh0$b */
    public class ViewOnClickListenerC19481b implements View.OnClickListener {
        public ViewOnClickListenerC19481b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode)) {
                return;
            }
            zvf0.m220399u("e_mode_sidebar", qfh0.this.m174315D(), vwb.m200311Y("mode_select", "marry"));
            qfh0.this.m101651T();
            if (!CoreModule.f17545c.f19639e0.f149173F4.get().booleanValue() || !CoreModule.f17545c.f19639e0.m169472b8(false) || (CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup() != null && CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup().marriage != null && CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup().marriage.closeMode)) {
                Intent intentM47401Z1 = MarryInfoAuditStatusAct.m47401Z1(qfh0.this.f154112h, "mode_switching");
                MarryInfoAuditStatusAct.m47402c2(intentM47401Z1);
                qfh0.this.f154112h.startActivity(intentM47401Z1);
                return;
            }
            CoreModule.f17545c.f19639e0.f149321Z3.put(UserHomeMode.marryMode);
            CoreModule.f17545c.f19639e0.f149170F1.m132487l(roj0.f160388a);
            Act act = qfh0.this.f154112h;
            if (act instanceof NewMainAct) {
                ((NewMainAct) act).m39786N5(TabName.Card);
                osi0.m165783g("已切换为想结婚模式");
            }
            qfh0.this.f154115k.setBackgroundResource(x2c0.f190565sq);
            qfh0.this.f154116l.setBackgroundResource(x2c0.f190533rq);
        }
    }

    public qfh0(@NonNull Act act, String str) {
        super(act, v7c0.f180372s);
        this.f154111g = "";
        this.f154119o = new C19482c();
        this.f154112h = act;
        setCancelable(false);
        this.f154118n = i0e.m133794c("p_mode_sidebar_pop", getClass().getName());
        this.f154111g = str;
        setContentView(f6c0.f95741d7);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2);
        frameLayout.setBackgroundResource(R.color.transparent);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f154117m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f154117m.setSkipCollapsed(true);
        this.f154117m.setBottomSheetCallback(this.f154119o);
        this.f154110f = findViewById(u4c0.f174047T7);
        this.f154113i = (VLinear) findViewById(u4c0.f173860I7);
        this.f154114j = (VLinear) findViewById(u4c0.f174063U7);
        this.f154115k = (VImage) findViewById(u4c0.f174589zd);
        this.f154116l = (VImage) findViewById(u4c0.f173730Ad);
        boolean zEquals = CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode);
        VImage vImage = this.f154115k;
        if (zEquals) {
            vImage.setBackgroundResource(x2c0.f190565sq);
            this.f154116l.setBackgroundResource(x2c0.f190533rq);
        } else {
            vImage.setBackgroundResource(x2c0.f190533rq);
            this.f154116l.setBackgroundResource(x2c0.f190565sq);
        }
        xdl0.m208329E0(this.f154110f, new View.OnClickListener() { // from class: l.pfh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148559a.m174316E(view);
            }
        });
        xdl0.m208329E0(this.f154113i, new ViewOnClickListenerC19480a());
        xdl0.m208329E0(this.f154114j, new ViewOnClickListenerC19481b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public String m174315D() {
        return "p_mode_sidebar_pop";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m174316E(View view) {
        m101651T();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: g */
    public void mo20866g(uc80 uc80Var) {
        super.mo20866g(uc80Var);
        if (NullChecker.m81303a(this.f154118n)) {
            this.f154118n.m109035k();
            this.f154118n.m109034j();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (NullChecker.m81303a(this.f154118n)) {
            this.f154118n.m109027c();
            this.f154118n.m109042r();
        }
        zvf0.m220368A("e_mode_sidebar", m174315D(), vwb.m200311Y("mode_select", CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode) ? "marry" : "love"));
    }

    /* JADX INFO: renamed from: l.qfh0$c */
    public class C19482c extends BottomSheetBehavior.BottomSheetCallback {
        public C19482c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                qfh0.this.f154117m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

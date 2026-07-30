package p153l;

import android.R;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.marry.audit.MarryInfoAuditStatusAct;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class ynh0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public View f200875f;

    /* JADX INFO: renamed from: g */
    public String f200876g;

    /* JADX INFO: renamed from: h */
    public Act f200877h;

    /* JADX INFO: renamed from: i */
    public VLinear f200878i;

    /* JADX INFO: renamed from: j */
    public VLinear f200879j;

    /* JADX INFO: renamed from: k */
    public VImage f200880k;

    /* JADX INFO: renamed from: l */
    public VImage f200881l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f200882m;

    /* JADX INFO: renamed from: n */
    public l4g0 f200883n;

    /* JADX INFO: renamed from: o */
    public BottomSheetBehavior.BottomSheetCallback f200884o;

    /* JADX INFO: renamed from: l.ynh0$a */
    public class ViewOnClickListenerC21647a implements View.OnClickListener {
        public ViewOnClickListenerC21647a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode)) {
                CoreModule.f18264c.f20381e0.f89178Z3.put(UserHomeMode.loveMode);
                CoreModule.f18264c.f20381e0.f89027F1.m137019l(uxj0.f181467a);
                Act act = ynh0.this.f200877h;
                if (act instanceof NewMainAct) {
                    ((NewMainAct) act).m40796R5(TabName.Card);
                    r1j0.m179420g("已切换为想恋爱模式");
                }
                ynh0.this.f200881l.setBackgroundResource(dbc0.f87033gr);
                ynh0.this.f200880k.setBackgroundResource(dbc0.f87000fr);
                ynh0.this.m176562T();
                CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode);
                i4g0.m138523u("e_mode_sidebar", ynh0.this.m216865D(), jyb.m147494Y("mode_select", "love"));
            }
        }
    }

    /* JADX INFO: renamed from: l.ynh0$b */
    public class ViewOnClickListenerC21648b implements View.OnClickListener {
        public ViewOnClickListenerC21648b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode)) {
                return;
            }
            i4g0.m138523u("e_mode_sidebar", ynh0.this.m216865D(), jyb.m147494Y("mode_select", "marry"));
            ynh0.this.m176562T();
            if (!CoreModule.f18264c.f20381e0.f89030F4.get().booleanValue() || !CoreModule.f18264c.f20381e0.m116545b8(false) || (CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup() != null && CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup().marriage != null && CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup().marriage.closeMode)) {
                Intent intentM48584a2 = MarryInfoAuditStatusAct.m48584a2(ynh0.this.f200877h, "mode_switching");
                MarryInfoAuditStatusAct.m48585d2(intentM48584a2);
                ynh0.this.f200877h.startActivity(intentM48584a2);
                return;
            }
            CoreModule.f18264c.f20381e0.f89178Z3.put(UserHomeMode.marryMode);
            CoreModule.f18264c.f20381e0.f89027F1.m137019l(uxj0.f181467a);
            Act act = ynh0.this.f200877h;
            if (act instanceof NewMainAct) {
                ((NewMainAct) act).m40796R5(TabName.Card);
                r1j0.m179420g("已切换为想结婚模式");
            }
            ynh0.this.f200880k.setBackgroundResource(dbc0.f87033gr);
            ynh0.this.f200881l.setBackgroundResource(dbc0.f87000fr);
        }
    }

    public ynh0(@NonNull Act act, String str) {
        super(act, agc0.f71133s);
        this.f200876g = "";
        this.f200884o = new C21649c();
        this.f200877h = act;
        setCancelable(false);
        this.f200883n = w1e.m204399c("p_mode_sidebar_pop", getClass().getName());
        this.f200876g = str;
        setContentView(kec0.f125812e7);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2);
        frameLayout.setBackgroundResource(R.color.transparent);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f200882m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f200882m.setSkipCollapsed(true);
        this.f200882m.setBottomSheetCallback(this.f200884o);
        this.f200875f = findViewById(adc0.f70169V7);
        this.f200878i = (VLinear) findViewById(adc0.f69982K7);
        this.f200879j = (VLinear) findViewById(adc0.f70186W7);
        this.f200880k = (VImage) findViewById(adc0.f69835Bd);
        this.f200881l = (VImage) findViewById(adc0.f69852Cd);
        boolean zEquals = CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode);
        VImage vImage = this.f200880k;
        if (zEquals) {
            vImage.setBackgroundResource(dbc0.f87033gr);
            this.f200881l.setBackgroundResource(dbc0.f87000fr);
        } else {
            vImage.setBackgroundResource(dbc0.f87000fr);
            this.f200881l.setBackgroundResource(dbc0.f87033gr);
        }
        bnl0.m105509E0(this.f200875f, new View.OnClickListener() { // from class: l.xnh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195397a.m216866E(view);
            }
        });
        bnl0.m105509E0(this.f200878i, new ViewOnClickListenerC21647a());
        bnl0.m105509E0(this.f200879j, new ViewOnClickListenerC21648b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public String m216865D() {
        return "p_mode_sidebar_pop";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m216866E(View view) {
        m176562T();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: g */
    public void mo21865g(al80 al80Var) {
        super.mo21865g(al80Var);
        if (NullChecker.m82486a(this.f200883n)) {
            this.f200883n.m152776k();
            this.f200883n.m152775j();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (NullChecker.m82486a(this.f200883n)) {
            this.f200883n.m152768c();
            this.f200883n.m152783r();
        }
        i4g0.m138492A("e_mode_sidebar", m216865D(), jyb.m147494Y("mode_select", CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode) ? "marry" : "love"));
    }

    /* JADX INFO: renamed from: l.ynh0$c */
    public class C21649c extends BottomSheetBehavior.BottomSheetCallback {
        public C21649c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                ynh0.this.f200882m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

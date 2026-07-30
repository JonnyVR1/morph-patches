package p009l;

import android.R;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.marry.audit.MarryInfoAuditStatusAct;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.f6c0;
import l.j760;
import l.l5j0;
import l.osi0;
import l.roj0;
import l.u4c0;
import l.uc80;
import l.v7c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qfh0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f19209f;

    /* JADX INFO: renamed from: g */
    public String f19210g;

    /* JADX INFO: renamed from: h */
    public Act f19211h;

    /* JADX INFO: renamed from: i */
    public VLinear f19212i;

    /* JADX INFO: renamed from: j */
    public VLinear f19213j;

    /* JADX INFO: renamed from: k */
    public VImage f19214k;

    /* JADX INFO: renamed from: l */
    public VImage f19215l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f19216m;

    /* JADX INFO: renamed from: n */
    public cwf0 f19217n;

    /* JADX INFO: renamed from: o */
    public BottomSheetBehavior.BottomSheetCallback f19218o;

    /* JADX INFO: renamed from: l.qfh0$a */
    public class ViewOnClickListenerC1139a implements View.OnClickListener {
        public ViewOnClickListenerC1139a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((String) CoreModule.c.e0.Z3.get()).equals("marryMode")) {
                CoreModule.c.e0.Z3.put("loveMode");
                CoreModule.c.e0.F1.onNext(roj0.a);
                NewMainAct newMainAct = qfh0.this.f19211h;
                if (newMainAct instanceof NewMainAct) {
                    newMainAct.m3862N5(TabName.Card);
                    osi0.g("已切换为想恋爱模式");
                }
                qfh0.this.f19215l.setBackgroundResource(x2c0.sq);
                qfh0.this.f19214k.setBackgroundResource(x2c0.rq);
                qfh0.this.dismiss();
                ((String) CoreModule.c.e0.Z3.get()).equals("marryMode");
                zvf0.u("e_mode_sidebar", qfh0.this.m20958D(), new j760[]{vwb.Y("mode_select", "love")});
            }
        }
    }

    /* JADX INFO: renamed from: l.qfh0$b */
    public class ViewOnClickListenerC1140b implements View.OnClickListener {
        public ViewOnClickListenerC1140b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((String) CoreModule.c.e0.Z3.get()).equals("marryMode")) {
                return;
            }
            zvf0.u("e_mode_sidebar", qfh0.this.m20958D(), new j760[]{vwb.Y("mode_select", "marry")});
            qfh0.this.dismiss();
            if (!((Boolean) CoreModule.c.e0.F4.get()).booleanValue() || !CoreModule.c.e0.b8(false) || (CoreModule.c.e0.p9().settings.getSettingGroup() != null && CoreModule.c.e0.p9().settings.getSettingGroup().marriage != null && CoreModule.c.e0.p9().settings.getSettingGroup().marriage.closeMode)) {
                Intent intentZ1 = MarryInfoAuditStatusAct.Z1(qfh0.this.f19211h, "mode_switching");
                MarryInfoAuditStatusAct.c2(intentZ1);
                qfh0.this.f19211h.startActivity(intentZ1);
                return;
            }
            CoreModule.c.e0.Z3.put("marryMode");
            CoreModule.c.e0.F1.onNext(roj0.a);
            NewMainAct newMainAct = qfh0.this.f19211h;
            if (newMainAct instanceof NewMainAct) {
                newMainAct.m3862N5(TabName.Card);
                osi0.g("已切换为想结婚模式");
            }
            qfh0.this.f19214k.setBackgroundResource(x2c0.sq);
            qfh0.this.f19215l.setBackgroundResource(x2c0.rq);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qfh0(@NonNull Act act, String str) {
        super(act, v7c0.s);
        this.f19210g = "";
        this.f19218o = new C1141c();
        this.f19211h = act;
        setCancelable(false);
        this.f19217n = i0e.m16062c("p_mode_sidebar_pop", getClass().getName());
        this.f19210g = str;
        setContentView(f6c0.d7);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.o2);
        frameLayout.setBackgroundResource(R.color.transparent);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f19216m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f19216m.setSkipCollapsed(true);
        this.f19216m.setBottomSheetCallback(this.f19218o);
        this.f19209f = findViewById(u4c0.T7);
        this.f19212i = findViewById(u4c0.I7);
        this.f19213j = findViewById(u4c0.U7);
        this.f19214k = findViewById(u4c0.zd);
        this.f19215l = findViewById(u4c0.Ad);
        boolean zEquals = ((String) CoreModule.c.e0.Z3.get()).equals("marryMode");
        VImage vImage = this.f19214k;
        if (zEquals) {
            vImage.setBackgroundResource(x2c0.sq);
            this.f19215l.setBackgroundResource(x2c0.rq);
        } else {
            vImage.setBackgroundResource(x2c0.rq);
            this.f19215l.setBackgroundResource(x2c0.sq);
        }
        xdl0.E0(this.f19209f, new View.OnClickListener() { // from class: l.pfh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18524a.m20959E(view);
            }
        });
        xdl0.E0(this.f19212i, new ViewOnClickListenerC1139a());
        xdl0.E0(this.f19213j, new ViewOnClickListenerC1140b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public String m20958D() {
        return "p_mode_sidebar_pop";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m20959E(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public void m20963g(uc80 uc80Var) {
        super/*l.l0m*/.g(uc80Var);
        if (NullChecker.a(this.f19217n)) {
            this.f19217n.k();
            this.f19217n.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        if (NullChecker.a(this.f19217n)) {
            this.f19217n.c();
            this.f19217n.r();
        }
        zvf0.A("e_mode_sidebar", m20958D(), new j760[]{vwb.Y("mode_select", ((String) CoreModule.c.e0.Z3.get()).equals("marryMode") ? "marry" : "love")});
    }

    /* JADX INFO: renamed from: l.qfh0$c */
    public class C1141c extends BottomSheetBehavior.BottomSheetCallback {
        public C1141c() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                qfh0.this.f19216m.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

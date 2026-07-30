package p006l;

import android.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.a5c0;
import l.cwf0;
import l.d30;
import l.e51;
import l.i0e;
import l.j760;
import l.l5j0;
import l.n3c0;
import l.t100;
import l.vwb;
import l.z7c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ip20 extends l5j0 {

    /* JADX INFO: renamed from: n */
    public static String f14609n = "from_boost_guide_red_dot";

    /* JADX INFO: renamed from: f */
    public lq20 f14610f;

    /* JADX INFO: renamed from: g */
    public wq20 f14611g;

    /* JADX INFO: renamed from: h */
    public int f14612h;

    /* JADX INFO: renamed from: i */
    public Act f14613i;

    /* JADX INFO: renamed from: j */
    public ViewGroup f14614j;

    /* JADX INFO: renamed from: k */
    public cwf0 f14615k;

    /* JADX INFO: renamed from: l */
    public String f14616l;

    /* JADX INFO: renamed from: m */
    public d30 f14617m;

    public ip20(@NonNull @NotNull Act act, int i) {
        super(act, z7c0.b);
        this.f14616l = "user_click";
        this.f14612h = i;
        this.f14613i = act;
        m16773A();
        setCancelable(false);
        this.f14615k = i0e.c("p_advanced_filter_page", getClass().getName());
    }

    /* JADX INFO: renamed from: A */
    private void m16773A() {
        this.f14610f = new lq20(this.f14613i, this);
        wq20 wq20Var = new wq20(this.f14613i);
        this.f14611g = wq20Var;
        this.f14610f.C(wq20Var);
    }

    /* JADX INFO: renamed from: C */
    private void m16774C() {
        this.f14610f.m18940S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m16775D() {
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private void m16776G() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: I */
    public static void m16777I(Act act, int i) {
        new ip20(act, i).show();
    }

    /* JADX INFO: renamed from: J */
    public static void m16778J(Act act, String str, d30 d30Var) {
        new ip20(act).m16785H(str).m16784F(d30Var).show();
    }

    /* JADX INFO: renamed from: K */
    private void m16779K() {
        if (CoreModule.m1854P().m11711g().m7021xj()) {
            this.f14611g.m26621R();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private void m16782z() {
        final Window window = getWindow();
        if (NullChecker.a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(a5c0.m);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(n3c0.X);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0852a(bottomSheetBehaviorFrom));
        }
        e51.G(new Runnable() { // from class: l.hp20
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(z7c0.c);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m16783E() {
        this.f14611g.m26617M(this.f14612h);
    }

    /* JADX INFO: renamed from: F */
    public ip20 m16784F(d30 d30Var) {
        this.f14617m = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public ip20 m16785H(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f14616l = str;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        this.f14615k.k();
        this.f14615k.j();
        getWindow().setWindowAnimations(z7c0.a);
        e51.G(new Runnable() { // from class: l.gp20
            @Override // java.lang.Runnable
            public final void run() {
                this.f13421a.m16775D();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*android.app.Dialog*/.onBackPressed();
        this.f14610f.m18952g0();
    }

    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        this.f14614j = (ViewGroup) this.f14611g.inflateView(this.f14613i.getLayoutInflater(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setContentView(this.f14614j, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.d(10.0f);
        m16776G();
    }

    public void onStart() {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onStart();
        this.f14615k.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(CoreModule.f1534c.f3628e0.m21490p9().isVIP())), vwb.Y("filter_page_show_from", this.f14616l)});
        this.f14615k.p(new j760[]{vwb.Y("filter_page", "p_suggest_users_home_view")});
        this.f14615k.c();
        this.f14615k.r();
        m16774C();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f14614j.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        this.f14610f.m18955j0(this.f14616l);
        this.f14610f.m18954i0(this.f14617m);
        super/*android.app.Dialog*/.show();
        m16782z();
        m16783E();
        m16779K();
    }

    public ip20(@NonNull @NotNull Act act) {
        this(act, 0);
    }

    /* JADX INFO: renamed from: l.ip20$a */
    public class C0852a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f14618a;

        public C0852a(BottomSheetBehavior bottomSheetBehavior) {
            this.f14618a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f14618a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                ip20.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

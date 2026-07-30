package p153l;

import android.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class sx20 extends pej0 {

    /* JADX INFO: renamed from: n */
    public static String f171069n = "from_boost_guide_red_dot";

    /* JADX INFO: renamed from: f */
    public vy20 f171070f;

    /* JADX INFO: renamed from: g */
    public gz20 f171071g;

    /* JADX INFO: renamed from: h */
    public int f171072h;

    /* JADX INFO: renamed from: i */
    public Act f171073i;

    /* JADX INFO: renamed from: j */
    public ViewGroup f171074j;

    /* JADX INFO: renamed from: k */
    public l4g0 f171075k;

    /* JADX INFO: renamed from: l */
    public String f171076l;

    /* JADX INFO: renamed from: m */
    public x20 f171077m;

    public sx20(@NonNull @NotNull Act act, int i) {
        super(act, egc0.f93914b);
        this.f171076l = "user_click";
        this.f171072h = i;
        this.f171073i = act;
        m188419A();
        setCancelable(false);
        this.f171075k = w1e.m204399c("p_advanced_filter_page", getClass().getName());
    }

    /* JADX INFO: renamed from: A */
    private void m188419A() {
        this.f171070f = new vy20(this.f171073i, this);
        gz20 gz20Var = new gz20(this.f171073i);
        this.f171071g = gz20Var;
        this.f171070f.mo52715C(gz20Var);
    }

    /* JADX INFO: renamed from: C */
    private void m188420C() {
        this.f171070f.m203932S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m188421D() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: G */
    private void m188422G() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: I */
    public static void m188423I(Act act, int i) {
        new sx20(act, i).show();
    }

    /* JADX INFO: renamed from: J */
    public static void m188424J(Act act, String str, x20 x20Var) {
        new sx20(act).m188431H(str).m188430F(x20Var).show();
    }

    /* JADX INFO: renamed from: K */
    private void m188425K() {
        if (CoreModule.m30933P().m143410g().mo36087xj()) {
            this.f171071g.m133068R();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m188428z() {
        final Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(gdc0.f103685m);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(tbc0.f172874X);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C20174a(bottomSheetBehaviorFrom));
        }
        l51.m152887G(new Runnable() { // from class: l.rx20
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(egc0.f93915c);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m188429E() {
        this.f171071g.m133064M(this.f171072h);
    }

    /* JADX INFO: renamed from: F */
    public sx20 m188430F(x20 x20Var) {
        this.f171077m = x20Var;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public sx20 m188431H(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f171076l = str;
        }
        return this;
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f171075k.m152776k();
        this.f171075k.m152775j();
        getWindow().setWindowAnimations(egc0.f93913a);
        l51.m152887G(new Runnable() { // from class: l.qx20
            @Override // java.lang.Runnable
            public final void run() {
                this.f160004a.m188421D();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        this.f171070f.m203944g0();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f171074j = (ViewGroup) this.f171071g.inflateView(this.f171073i.getLayoutInflater(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setContentView(this.f171074j, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = qa00.m175859d(10.0f);
        m188422G();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f171075k.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(CoreModule.f18264c.f20381e0.m116600p9().isVIP())), jyb.m147494Y("filter_page_show_from", this.f171076l));
        this.f171075k.m152781p(jyb.m147494Y("filter_page", "p_suggest_users_home_view"));
        this.f171075k.m152768c();
        this.f171075k.m152783r();
        m188420C();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f171074j.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        this.f171070f.m203947j0(this.f171076l);
        this.f171070f.m203946i0(this.f171077m);
        super.show();
        m188428z();
        m188429E();
        m188425K();
    }

    public sx20(@NonNull @NotNull Act act) {
        this(act, 0);
    }

    /* JADX INFO: renamed from: l.sx20$a */
    public class C20174a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f171078a;

        public C20174a(BottomSheetBehavior bottomSheetBehavior) {
            this.f171078a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f171078a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                sx20.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

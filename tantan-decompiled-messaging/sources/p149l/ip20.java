package p149l;

import android.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class ip20 extends l5j0 {

    /* JADX INFO: renamed from: n */
    public static String f114252n = "from_boost_guide_red_dot";

    /* JADX INFO: renamed from: f */
    public lq20 f114253f;

    /* JADX INFO: renamed from: g */
    public wq20 f114254g;

    /* JADX INFO: renamed from: h */
    public int f114255h;

    /* JADX INFO: renamed from: i */
    public Act f114256i;

    /* JADX INFO: renamed from: j */
    public ViewGroup f114257j;

    /* JADX INFO: renamed from: k */
    public cwf0 f114258k;

    /* JADX INFO: renamed from: l */
    public String f114259l;

    /* JADX INFO: renamed from: m */
    public d30 f114260m;

    public ip20(@NonNull @NotNull Act act, int i) {
        super(act, z7c0.f201999b);
        this.f114259l = "user_click";
        this.f114255h = i;
        this.f114256i = act;
        m137438A();
        setCancelable(false);
        this.f114258k = i0e.m133794c("p_advanced_filter_page", getClass().getName());
    }

    /* JADX INFO: renamed from: A */
    private void m137438A() {
        this.f114253f = new lq20(this.f114256i, this);
        wq20 wq20Var = new wq20(this.f114256i);
        this.f114254g = wq20Var;
        this.f114253f.mo51532C(wq20Var);
    }

    /* JADX INFO: renamed from: C */
    private void m137439C() {
        this.f114253f.m150943S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m137440D() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: G */
    private void m137441G() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: I */
    public static void m137442I(Act act, int i) {
        new ip20(act, i).show();
    }

    /* JADX INFO: renamed from: J */
    public static void m137443J(Act act, String str, d30 d30Var) {
        new ip20(act).m137450H(str).m137449F(d30Var).show();
    }

    /* JADX INFO: renamed from: K */
    private void m137444K() {
        if (CoreModule.m29935P().m94656g().mo35084xj()) {
            this.f114254g.m204996R();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m137447z() {
        final Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(a5c0.f67690m);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(n3c0.f136959X);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17596a(bottomSheetBehaviorFrom));
        }
        e51.m114742G(new Runnable() { // from class: l.hp20
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(z7c0.f202000c);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m137448E() {
        this.f114254g.m204992M(this.f114255h);
    }

    /* JADX INFO: renamed from: F */
    public ip20 m137449F(d30 d30Var) {
        this.f114260m = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public ip20 m137450H(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f114259l = str;
        }
        return this;
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f114258k.m109035k();
        this.f114258k.m109034j();
        getWindow().setWindowAnimations(z7c0.f201998a);
        e51.m114742G(new Runnable() { // from class: l.gp20
            @Override // java.lang.Runnable
            public final void run() {
                this.f103756a.m137440D();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        this.f114253f.m150955g0();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f114257j = (ViewGroup) this.f114254g.inflateView(this.f114256i.getLayoutInflater(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setContentView(this.f114257j, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.m186890d(10.0f);
        m137441G();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f114258k.m109040p(vwb.m200311Y("is_privileged", Boolean.valueOf(CoreModule.f17545c.f19639e0.m169527p9().isVIP())), vwb.m200311Y("filter_page_show_from", this.f114259l));
        this.f114258k.m109040p(vwb.m200311Y("filter_page", "p_suggest_users_home_view"));
        this.f114258k.m109027c();
        this.f114258k.m109042r();
        m137439C();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f114257j.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        this.f114253f.m150958j0(this.f114259l);
        this.f114253f.m150957i0(this.f114260m);
        super.show();
        m137447z();
        m137448E();
        m137444K();
    }

    public ip20(@NonNull @NotNull Act act) {
        this(act, 0);
    }

    /* JADX INFO: renamed from: l.ip20$a */
    public class C17596a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f114261a;

        public C17596a(BottomSheetBehavior bottomSheetBehavior) {
            this.f114261a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f114261a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                ip20.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

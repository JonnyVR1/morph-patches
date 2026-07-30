package p006l;

import android.app.Dialog;
import android.view.View;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.b3c0;
import l.cwf0;
import l.e30;
import l.i0e;
import l.j760;
import l.k6c0;
import l.o6j0;
import l.p4c0;
import l.t100;
import l.vwb;
import l.x4c0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VSwitchButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class g6m0 extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public VImage f13083a;

    /* JADX INFO: renamed from: b */
    public VImage f13084b;

    /* JADX INFO: renamed from: c */
    public VSwitchButton f13085c;

    /* JADX INFO: renamed from: d */
    public TextView f13086d;

    /* JADX INFO: renamed from: e */
    public TextView f13087e;

    /* JADX INFO: renamed from: f */
    public TextView f13088f;

    /* JADX INFO: renamed from: g */
    public e30<Boolean> f13089g;

    /* JADX INFO: renamed from: h */
    public Act f13090h;

    /* JADX INFO: renamed from: i */
    public BottomSheetBehavior f13091i;

    /* JADX INFO: renamed from: j */
    public boolean f13092j;

    /* JADX INFO: renamed from: k */
    public cwf0 f13093k;

    /* JADX INFO: renamed from: l */
    public View f13094l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior.BottomSheetCallback f13095m;

    public g6m0(@NonNull Act act, @StyleRes int i, boolean z) {
        super(act, i);
        this.f13092j = true;
        this.f13095m = new C0750a();
        this.f13092j = z;
        m15618v(act);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    private void m15618v(Act act) {
        this.f13090h = act;
        cwf0 cwf0VarC = i0e.c(CoreModule.m1854P().m11706a().m5386Y9() ? "p_my_visitor_setting" : "p_moment_visitor_set", Dialog.class.getName());
        this.f13093k = cwf0VarC;
        cwf0VarC.o(o6j0.b(new o6j0.a[]{o6j0.a.h("is_full", "0")}));
        setContentView(k6c0.X1);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f13083a = findViewById(x4c0.C);
        this.f13084b = findViewById(x4c0.m);
        this.f13085c = findViewById(x4c0.H);
        this.f13086d = (TextView) findViewById(x4c0.g);
        this.f13087e = (TextView) findViewById(x4c0.F);
        this.f13088f = (TextView) findViewById(x4c0.I);
        this.f13094l = findViewById(x4c0.w);
        m15619w();
        m15621u();
    }

    /* JADX INFO: renamed from: w */
    private void m15619w() {
        if (ura.m25555e().m25559d().m5759f()) {
            this.f13086d.setText("我的访客设置");
            this.f13087e.setText("关闭后，无法查看谁看了你；同时，你查看他人时不会留下记录。");
            this.f13088f.setText("开启我的访客");
            if (gr9.m15940i()) {
                xdl0.U(this.f13094l, t100.E);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        if (NullChecker.a(this.f13089g)) {
            this.f13089g.call(Boolean.valueOf(this.f13092j));
        }
        super/*android.app.Dialog*/.dismiss();
        cwf0 cwf0Var = this.f13093k;
        if (cwf0Var != null) {
            cwf0Var.k();
            this.f13093k.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        this.f13091i = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f13090h.getResources().getDrawable(b3c0.k));
        this.f13091i.setState(3);
        this.f13091i.setBottomSheetCallback(this.f13095m);
        cwf0 cwf0Var = this.f13093k;
        if (cwf0Var != null) {
            cwf0Var.i();
            this.f13093k.l();
        }
    }

    /* JADX INFO: renamed from: t */
    public g6m0 m15620t(e30<Boolean> e30Var) {
        this.f13089g = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final void m15621u() {
        xdl0.E0(this.f13083a, new View.OnClickListener() { // from class: l.e6m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10828a.m15622x(view);
            }
        });
        this.f13085c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.f6m0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f12538a.m15623y(compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m15622x(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m15623y(CompoundButton compoundButton, boolean z) {
        boolean z2 = this.f13092j;
        this.f13092j = !z2;
        VImage vImage = this.f13084b;
        if (z2) {
            vImage.setImageResource(b3c0.L5);
        } else {
            vImage.setImageResource(b3c0.M5);
        }
        if (!CoreModule.m1854P().m11706a().m5386Y9()) {
            zvf0.r(this.f13092j ? "e_moment_visitor_set_on" : "e_moment_visitor_set_off", "p_moment_visitor_set");
        }
        zvf0.u("e_my_visitor_setting_status", "p_my_visitor_setting", new j760[]{vwb.Y("action", this.f13092j ? "open" : "close")});
    }

    /* JADX INFO: renamed from: l.g6m0$a */
    public class C0750a extends BottomSheetBehavior.BottomSheetCallback {
        public C0750a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                g6m0.this.f13091i.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VSwitchButton;

/* JADX INFO: loaded from: classes9.dex */
public class g6m0 extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public VImage f101279a;

    /* JADX INFO: renamed from: b */
    public VImage f101280b;

    /* JADX INFO: renamed from: c */
    public VSwitchButton f101281c;

    /* JADX INFO: renamed from: d */
    public TextView f101282d;

    /* JADX INFO: renamed from: e */
    public TextView f101283e;

    /* JADX INFO: renamed from: f */
    public TextView f101284f;

    /* JADX INFO: renamed from: g */
    public e30<Boolean> f101285g;

    /* JADX INFO: renamed from: h */
    public Act f101286h;

    /* JADX INFO: renamed from: i */
    public BottomSheetBehavior f101287i;

    /* JADX INFO: renamed from: j */
    public boolean f101288j;

    /* JADX INFO: renamed from: k */
    public cwf0 f101289k;

    /* JADX INFO: renamed from: l */
    public View f101290l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior.BottomSheetCallback f101291m;

    public g6m0(@NonNull Act act, @StyleRes int i, boolean z) {
        super(act, i);
        this.f101288j = true;
        this.f101291m = new C17013a();
        this.f101288j = z;
        m124608v(act);
    }

    /* JADX INFO: renamed from: v */
    private void m124608v(Act act) {
        this.f101286h = act;
        cwf0 cwf0VarM133794c = i0e.m133794c(CoreModule.m29935P().m94651a().mo33449Y9() ? "p_my_visitor_setting" : "p_moment_visitor_set", Dialog.class.getName());
        this.f101289k = cwf0VarM133794c;
        cwf0VarM133794c.m109039o(o6j0.m162858b(o6j0.C18854a.m162878h("is_full", "0")));
        setContentView(k6c0.f121350X1);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f101279a = (VImage) findViewById(x4c0.f190968C);
        this.f101280b = (VImage) findViewById(x4c0.f191002m);
        this.f101281c = (VSwitchButton) findViewById(x4c0.f190973H);
        this.f101282d = (TextView) findViewById(x4c0.f190996g);
        this.f101283e = (TextView) findViewById(x4c0.f190971F);
        this.f101284f = (TextView) findViewById(x4c0.f190974I);
        this.f101290l = findViewById(x4c0.f191012w);
        m124609w();
        m124611u();
    }

    /* JADX INFO: renamed from: w */
    private void m124609w() {
        if (ura.m195053e().m195057d().mo33822f()) {
            this.f101282d.setText("我的访客设置");
            this.f101283e.setText("关闭后，无法查看谁看了你；同时，你查看他人时不会留下记录。");
            this.f101284f.setText("开启我的访客");
            if (gr9.m127684i()) {
                xdl0.m208357U(this.f101290l, t100.f167230E);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (NullChecker.m81303a(this.f101285g)) {
            this.f101285g.call(Boolean.valueOf(this.f101288j));
        }
        super.dismiss();
        cwf0 cwf0Var = this.f101289k;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            this.f101289k.m109034j();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        this.f101287i = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f101286h.getResources().getDrawable(b3c0.f73082k));
        this.f101287i.setState(3);
        this.f101287i.setBottomSheetCallback(this.f101291m);
        cwf0 cwf0Var = this.f101289k;
        if (cwf0Var != null) {
            cwf0Var.m109033i();
            this.f101289k.m109036l();
        }
    }

    /* JADX INFO: renamed from: t */
    public g6m0 m124610t(e30<Boolean> e30Var) {
        this.f101285g = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final void m124611u() {
        xdl0.m208329E0(this.f101279a, new View.OnClickListener() { // from class: l.e6m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89626a.m124612x(view);
            }
        });
        this.f101281c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.f6m0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f96152a.m124613y(compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m124612x(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m124613y(CompoundButton compoundButton, boolean z) {
        boolean z2 = this.f101288j;
        this.f101288j = !z2;
        VImage vImage = this.f101280b;
        if (z2) {
            vImage.setImageResource(b3c0.f72903L5);
        } else {
            vImage.setImageResource(b3c0.f72910M5);
        }
        if (!CoreModule.m29935P().m94651a().mo33449Y9()) {
            zvf0.m220396r(this.f101288j ? "e_moment_visitor_set_on" : "e_moment_visitor_set_off", "p_moment_visitor_set");
        }
        zvf0.m220399u("e_my_visitor_setting_status", "p_my_visitor_setting", vwb.m200311Y("action", this.f101288j ? "open" : "close"));
    }

    /* JADX INFO: renamed from: l.g6m0$a */
    public class C17013a extends BottomSheetBehavior.BottomSheetCallback {
        public C17013a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                g6m0.this.f101287i.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

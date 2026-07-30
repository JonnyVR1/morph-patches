package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VSwitchButton;

/* JADX INFO: loaded from: classes12.dex */
public class kfm0 extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public VImage f126446a;

    /* JADX INFO: renamed from: b */
    public VImage f126447b;

    /* JADX INFO: renamed from: c */
    public VSwitchButton f126448c;

    /* JADX INFO: renamed from: d */
    public TextView f126449d;

    /* JADX INFO: renamed from: e */
    public TextView f126450e;

    /* JADX INFO: renamed from: f */
    public TextView f126451f;

    /* JADX INFO: renamed from: g */
    public y20<Boolean> f126452g;

    /* JADX INFO: renamed from: h */
    public Act f126453h;

    /* JADX INFO: renamed from: i */
    public BottomSheetBehavior f126454i;

    /* JADX INFO: renamed from: j */
    public boolean f126455j;

    /* JADX INFO: renamed from: k */
    public l4g0 f126456k;

    /* JADX INFO: renamed from: l */
    public View f126457l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior.BottomSheetCallback f126458m;

    public kfm0(@NonNull Act act, @StyleRes int i, boolean z) {
        super(act, i);
        this.f126455j = true;
        this.f126458m = new C18152a();
        this.f126455j = z;
        m149570v(act);
    }

    /* JADX INFO: renamed from: v */
    private void m149570v(Act act) {
        this.f126453h = act;
        l4g0 l4g0VarM204399c = w1e.m204399c(CoreModule.m30933P().m143405a().mo34452Y9() ? "p_my_visitor_setting" : "p_moment_visitor_set", Dialog.class.getName());
        this.f126456k = l4g0VarM204399c;
        l4g0VarM204399c.m152780o(sfj0.m185595b(sfj0.C20032a.m185615h("is_full", "0")));
        setContentView(pec0.f151958X1);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f126446a = (VImage) findViewById(ddc0.f87873C);
        this.f126447b = (VImage) findViewById(ddc0.f87907m);
        this.f126448c = (VSwitchButton) findViewById(ddc0.f87878H);
        this.f126449d = (TextView) findViewById(ddc0.f87901g);
        this.f126450e = (TextView) findViewById(ddc0.f87876F);
        this.f126451f = (TextView) findViewById(ddc0.f87879I);
        this.f126457l = findViewById(ddc0.f87917w);
        m149571w();
        m149573u();
    }

    /* JADX INFO: renamed from: w */
    private void m149571w() {
        if (gta.m132210e().m132214d().mo34825f()) {
            this.f126449d.setText("我的访客设置");
            this.f126450e.setText("关闭后，无法查看谁看了你；同时，你查看他人时不会留下记录。");
            this.f126451f.setText("开启我的访客");
            if (rs9.m182940i()) {
                bnl0.m105537U(this.f126457l, qa00.f156292E);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (NullChecker.m82486a(this.f126452g)) {
            this.f126452g.call(Boolean.valueOf(this.f126455j));
        }
        super.dismiss();
        l4g0 l4g0Var = this.f126456k;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            this.f126456k.m152775j();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        this.f126454i = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f126453h.getResources().getDrawable(gbc0.f103333k));
        this.f126454i.setState(3);
        this.f126454i.setBottomSheetCallback(this.f126458m);
        l4g0 l4g0Var = this.f126456k;
        if (l4g0Var != null) {
            l4g0Var.m152774i();
            this.f126456k.m152777l();
        }
    }

    /* JADX INFO: renamed from: t */
    public kfm0 m149572t(y20<Boolean> y20Var) {
        this.f126452g = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final void m149573u() {
        bnl0.m105509E0(this.f126446a, new View.OnClickListener() { // from class: l.ifm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114679a.m149574x(view);
            }
        });
        this.f126448c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.jfm0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f120601a.m149575y(compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m149574x(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m149575y(CompoundButton compoundButton, boolean z) {
        boolean z2 = this.f126455j;
        this.f126455j = !z2;
        VImage vImage = this.f126447b;
        if (z2) {
            vImage.setImageResource(gbc0.f103154L5);
        } else {
            vImage.setImageResource(gbc0.f103161M5);
        }
        if (!CoreModule.m30933P().m143405a().mo34452Y9()) {
            i4g0.m138520r(this.f126455j ? "e_moment_visitor_set_on" : "e_moment_visitor_set_off", "p_moment_visitor_set");
        }
        i4g0.m138523u("e_my_visitor_setting_status", "p_my_visitor_setting", jyb.m147494Y("action", this.f126455j ? "open" : "close"));
    }

    /* JADX INFO: renamed from: l.kfm0$a */
    public class C18152a extends BottomSheetBehavior.BottomSheetCallback {
        public C18152a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                kfm0.this.f126454i.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

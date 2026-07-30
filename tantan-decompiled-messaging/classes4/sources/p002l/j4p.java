package p002l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import l.cwf0;
import l.e30;
import l.i0e;
import l.i0g0;
import l.k4p;
import l.l5j0;
import l.p4c0;
import l.qib0;
import l.roj0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j4p extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f13559f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f13560g;

    /* JADX INFO: renamed from: h */
    public VIcon f13561h;

    /* JADX INFO: renamed from: i */
    public View f13562i;

    /* JADX INFO: renamed from: j */
    public VText f13563j;

    /* JADX INFO: renamed from: k */
    public VText f13564k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f13565l;

    /* JADX INFO: renamed from: m */
    public VText f13566m;

    /* JADX INFO: renamed from: n */
    public VText f13567n;

    /* JADX INFO: renamed from: o */
    public cwf0 f13568o;

    /* JADX INFO: renamed from: p */
    public e30<roj0> f13569p;

    /* JADX INFO: renamed from: q */
    public final String f13570q;

    public j4p(@NonNull Context context) {
        super(context);
        this.f13570q = "p_edit_profile_save_drainage_notice";
        m15649E(context);
    }

    /* JADX INFO: renamed from: E */
    private void m15649E(Context context) {
        setContentView(m15658C(LayoutInflater.from(context), null));
    }

    /* JADX INFO: renamed from: F */
    private void m15650F() {
        qib0.G.L0(this.f13565l, m15659D());
        xdl0.E0(this.f13561h, new View.OnClickListener() { // from class: l.g4p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10776a.m15651G(view);
            }
        });
        xdl0.E0(this.f13566m, new View.OnClickListener() { // from class: l.h4p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11873a.m15652H(view);
            }
        });
        xdl0.E0(this.f13567n, new View.OnClickListener() { // from class: l.i4p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13047a.m15653I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m15651G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m15652H(View view) {
        zvf0.r("e_edit_drainage_alert_cancel_btn", "p_edit_profile_save_drainage_notice");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m15653I(View view) {
        zvf0.r("e_edit_drainage_alert_submit_btn", "p_edit_profile_save_drainage_notice");
        e30<roj0> e30Var = this.f13569p;
        if (e30Var != null) {
            e30Var.call(roj0.a);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m15654J(DialogInterface dialogInterface) {
        i0e.e(this.f13568o);
    }

    /* JADX INFO: renamed from: C */
    public View m15658C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k4p.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: D */
    public final String m15659D() {
        String strY = i0g0.y();
        strY.getClass();
        switch (strY) {
            case "id-ID":
                return "https://auto.tancdn.com/v1/raw/d2c74a5a-72a0-4785-8d3d-55348728304f14.webp";
            case "zh-CN":
                return "https://auto.tancdn.com/v1/raw/5f30b78d-ac36-40c1-afdc-f1d428ee54ed14.webp";
            case "zh-TW":
                return "https://auto.tancdn.com/v1/raw/2751fa70-454b-4c09-adc0-1bc0d355b24d14.webp";
            default:
                return "https://auto.tancdn.com/v1/raw/4dd7e1eb-c1d2-4c27-93ba-e8a237a8bb5814.webp";
        }
    }

    /* JADX INFO: renamed from: K */
    public void m15660K(e30<roj0> e30Var) {
        this.f13569p = e30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior.from(frameLayout).setState(3);
        m15650F();
        if (this.f13568o == null) {
            this.f13568o = i0e.c("p_edit_profile_save_drainage_notice", j4p.class.getSimpleName());
        }
        i0e.f(this.f13568o);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f4p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f10122a.m15654J(dialogInterface);
            }
        });
    }
}

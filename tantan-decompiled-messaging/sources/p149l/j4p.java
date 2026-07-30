package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class j4p extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f116214f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f116215g;

    /* JADX INFO: renamed from: h */
    public VIcon f116216h;

    /* JADX INFO: renamed from: i */
    public View f116217i;

    /* JADX INFO: renamed from: j */
    public VText f116218j;

    /* JADX INFO: renamed from: k */
    public VText f116219k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f116220l;

    /* JADX INFO: renamed from: m */
    public VText f116221m;

    /* JADX INFO: renamed from: n */
    public VText f116222n;

    /* JADX INFO: renamed from: o */
    public cwf0 f116223o;

    /* JADX INFO: renamed from: p */
    public e30<roj0> f116224p;

    /* JADX INFO: renamed from: q */
    public final String f116225q;

    public j4p(@NonNull Context context) {
        super(context);
        this.f116225q = "p_edit_profile_save_drainage_notice";
        m139686E(context);
    }

    /* JADX INFO: renamed from: E */
    private void m139686E(Context context) {
        setContentView(m139695C(LayoutInflater.from(context), null));
    }

    /* JADX INFO: renamed from: F */
    private void m139687F() {
        qib0.f154691G.m102331L0(this.f116220l, m139696D());
        xdl0.m208329E0(this.f116216h, new View.OnClickListener() { // from class: l.g4p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100579a.m139688G(view);
            }
        });
        xdl0.m208329E0(this.f116221m, new View.OnClickListener() { // from class: l.h4p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105864a.m139689H(view);
            }
        });
        xdl0.m208329E0(this.f116222n, new View.OnClickListener() { // from class: l.i4p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111474a.m139690I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m139688G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m139689H(View view) {
        zvf0.m220396r("e_edit_drainage_alert_cancel_btn", "p_edit_profile_save_drainage_notice");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m139690I(View view) {
        zvf0.m220396r("e_edit_drainage_alert_submit_btn", "p_edit_profile_save_drainage_notice");
        e30<roj0> e30Var = this.f116224p;
        if (e30Var != null) {
            e30Var.call(roj0.f160388a);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m139691J(DialogInterface dialogInterface) {
        i0e.m133796e(this.f116223o);
    }

    /* JADX INFO: renamed from: C */
    public View m139695C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k4p.m144500b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: D */
    public final String m139696D() {
        String strM133885y = i0g0.m133885y();
        strM133885y.getClass();
        switch (strM133885y) {
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
    public void m139697K(e30<roj0> e30Var) {
        this.f116224p = e30Var;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior.from(frameLayout).setState(3);
        m139687F();
        if (this.f116223o == null) {
            this.f116223o = i0e.m133794c("p_edit_profile_save_drainage_notice", j4p.class.getSimpleName());
        }
        i0e.m133797f(this.f116223o);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f4p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f94861a.m139691J(dialogInterface);
            }
        });
    }
}

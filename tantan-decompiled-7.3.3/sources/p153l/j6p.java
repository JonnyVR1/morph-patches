package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class j6p extends pej0 {

    /* JADX INFO: renamed from: f */
    public View f118577f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f118578g;

    /* JADX INFO: renamed from: h */
    public VIcon f118579h;

    /* JADX INFO: renamed from: i */
    public View f118580i;

    /* JADX INFO: renamed from: j */
    public VText f118581j;

    /* JADX INFO: renamed from: k */
    public VText f118582k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f118583l;

    /* JADX INFO: renamed from: m */
    public VText f118584m;

    /* JADX INFO: renamed from: n */
    public VText f118585n;

    /* JADX INFO: renamed from: o */
    public l4g0 f118586o;

    /* JADX INFO: renamed from: p */
    public y20<uxj0> f118587p;

    /* JADX INFO: renamed from: q */
    public final String f118588q;

    public j6p(@NonNull Context context) {
        super(context);
        this.f118588q = "p_edit_profile_save_drainage_notice";
        m143678E(context);
    }

    /* JADX INFO: renamed from: E */
    private void m143678E(Context context) {
        setContentView(m143687C(LayoutInflater.from(context), null));
    }

    /* JADX INFO: renamed from: F */
    private void m143679F() {
        uqb0.f180374G.m127115L0(this.f118583l, m143688D());
        bnl0.m105509E0(this.f118579h, new View.OnClickListener() { // from class: l.g6p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102471a.m143680G(view);
            }
        });
        bnl0.m105509E0(this.f118584m, new View.OnClickListener() { // from class: l.h6p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108043a.m143681H(view);
            }
        });
        bnl0.m105509E0(this.f118585n, new View.OnClickListener() { // from class: l.i6p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113178a.m143682I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m143680G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m143681H(View view) {
        i4g0.m138520r("e_edit_drainage_alert_cancel_btn", "p_edit_profile_save_drainage_notice");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m143682I(View view) {
        i4g0.m138520r("e_edit_drainage_alert_submit_btn", "p_edit_profile_save_drainage_notice");
        y20<uxj0> y20Var = this.f118587p;
        if (y20Var != null) {
            y20Var.call(uxj0.f181467a);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m143683J(DialogInterface dialogInterface) {
        w1e.m204401e(this.f118586o);
    }

    /* JADX INFO: renamed from: C */
    public View m143687C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k6p.m148533b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: D */
    public final String m143688D() {
        String strM175820y = q8g0.m175820y();
        strM175820y.getClass();
        switch (strM175820y) {
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
    public void m143689K(y20<uxj0> y20Var) {
        this.f118587p = y20Var;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior.from(frameLayout).setState(3);
        m143679F();
        if (this.f118586o == null) {
            this.f118586o = w1e.m204399c("p_edit_profile_save_drainage_notice", j6p.class.getSimpleName());
        }
        w1e.m204402f(this.f118586o);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f6p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f97436a.m143683J(dialogInterface);
            }
        });
    }
}

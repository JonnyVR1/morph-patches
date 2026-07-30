package p003l;

import android.R;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e16;
import l.i0e;
import l.i5c0;
import l.l5j0;
import l.n3c0;
import l.qqf0;
import l.v7c0;
import l.x2c0;
import l.xdl0;
import l.zch0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gwp extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f4743f;

    /* JADX INFO: renamed from: g */
    public VImage f4744g;

    /* JADX INFO: renamed from: h */
    public VImage f4745h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f4746i;

    /* JADX INFO: renamed from: j */
    public VText f4747j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f4748k;

    /* JADX INFO: renamed from: l */
    public Act f4749l;

    /* JADX INFO: renamed from: m */
    public cwf0 f4750m;

    public gwp(@NonNull Act act) {
        super(act, v7c0.c);
        this.f4749l = act;
        setCancelable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m6828E() {
        Window window = getWindow();
        this.f4743f.post(new Runnable() { // from class: l.dwp
            @Override // java.lang.Runnable
            public final void run() {
                this.f4234a.m6830G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C3336a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m6829F() {
        setContentView(m6837D(LayoutInflater.from(this.f4749l), null));
        v(new qqf0());
        SpannableString spannableString = new SpannableString("  " + this.f4749l.getResources().getString(com.p1.mobile.putong.core.R.string.iq));
        Drawable drawableE = e16.e(this.f4749l, x2c0.Zc);
        if (drawableE != null) {
            drawableE.setBounds(0, 0, drawableE.getIntrinsicWidth(), drawableE.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(drawableE, 1), 0, 1, 17);
        }
        this.f4747j.setText(spannableString);
        xdl0.E0(this.f4744g, new View.OnClickListener() { // from class: l.ewp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4361a.m6831H(view);
            }
        });
        xdl0.E0(this.f4748k, new View.OnClickListener() { // from class: l.fwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4521a.m6832I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m6830G() {
        getBehavior().setPeekHeight(this.f4743f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m6831H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m6832I(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m6833J(DialogInterface dialogInterface) {
        i0e.e(this.f4750m);
        zch0.a().j(false, "IntrRiskBottomSheetDialog");
    }

    /* JADX INFO: renamed from: D */
    public View m6837D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hwp.m7085b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m6829F();
        cwf0 cwf0VarC = i0e.c("", Dialog.class.getName());
        this.f4750m = cwf0VarC;
        i0e.f(cwf0VarC);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bwp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f3481a.m6833J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.cwp
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.a().j(true, "IntrRiskBottomSheetDialog");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m6828E();
    }

    /* JADX INFO: renamed from: l.gwp$a */
    public class C3336a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f4751a;

        public C3336a(BottomSheetBehavior bottomSheetBehavior) {
            this.f4751a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f4751a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                gwp.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

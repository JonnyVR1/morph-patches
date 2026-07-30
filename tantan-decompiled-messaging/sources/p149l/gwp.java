package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gwp extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f104755f;

    /* JADX INFO: renamed from: g */
    public VImage f104756g;

    /* JADX INFO: renamed from: h */
    public VImage f104757h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f104758i;

    /* JADX INFO: renamed from: j */
    public VText f104759j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f104760k;

    /* JADX INFO: renamed from: l */
    public Act f104761l;

    /* JADX INFO: renamed from: m */
    public cwf0 f104762m;

    public gwp(@NonNull Act act) {
        super(act, v7c0.f180356c);
        this.f104761l = act;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: E */
    private void m128487E() {
        Window window = getWindow();
        this.f104755f.post(new Runnable() { // from class: l.dwp
            @Override // java.lang.Runnable
            public final void run() {
                this.f88197a.m128489G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17183a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m128488F() {
        setContentView(m128496D(LayoutInflater.from(this.f104761l), null));
        m148650v(new qqf0());
        SpannableString spannableString = new SpannableString("  " + this.f104761l.getResources().getString(R$string.f18619iq));
        Drawable drawableM114377e = e16.m114377e(this.f104761l, x2c0.f189947Zc);
        if (drawableM114377e != null) {
            drawableM114377e.setBounds(0, 0, drawableM114377e.getIntrinsicWidth(), drawableM114377e.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(drawableM114377e, 1), 0, 1, 17);
        }
        this.f104759j.setText(spannableString);
        xdl0.m208329E0(this.f104756g, new View.OnClickListener() { // from class: l.ewp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93522a.m128490H(view);
            }
        });
        xdl0.m208329E0(this.f104760k, new View.OnClickListener() { // from class: l.fwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99676a.m128491I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m128489G() {
        getBehavior().setPeekHeight(this.f104755f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m128490H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m128491I(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m128492J(DialogInterface dialogInterface) {
        i0e.m133796e(this.f104762m);
        zch0.m218024a().m218033j(false, "IntrRiskBottomSheetDialog");
    }

    /* JADX INFO: renamed from: D */
    public View m128496D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hwp.m133261b(this, layoutInflater, viewGroup);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m128488F();
        cwf0 cwf0VarM133794c = i0e.m133794c("", Dialog.class.getName());
        this.f104762m = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bwp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f77639a.m128492J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.cwp
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.m218024a().m218033j(true, "IntrRiskBottomSheetDialog");
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m128487E();
    }

    /* JADX INFO: renamed from: l.gwp$a */
    public class C17183a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f104763a;

        public C17183a(BottomSheetBehavior bottomSheetBehavior) {
            this.f104763a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f104763a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                gwp.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

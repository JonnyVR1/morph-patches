package p149l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m17 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public cwf0 f130807f;

    public m17(@NonNull Context context) {
        super(context, g8c0.f101491b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m152576D(DialogInterface dialogInterface) {
        i0e.m133796e(this.f130807f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m152577E() {
        getBehavior().setPeekHeight(mo121175G().getHeight());
    }

    /* JADX INFO: renamed from: A */
    public cwf0 m152580A() {
        return this.f130807f;
    }

    /* JADX INFO: renamed from: C */
    public abstract boolean mo121173C();

    /* JADX INFO: renamed from: F */
    public abstract String mo121174F();

    /* JADX INFO: renamed from: G */
    public abstract View mo121175G();

    /* JADX INFO: renamed from: H */
    public abstract boolean mo121176H();

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        if (mo121181z()) {
            dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        setCancelable(mo121176H());
        super.onCreate(bundle);
        i0e.m133797f(this.f130807f);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.k17
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f120542a.m152576D(dialogInterface);
            }
        });
        if (mo121181z()) {
            m148650v(new qqf0());
        }
    }

    @Override // android.app.Dialog
    public void show() {
        this.f130807f = i0e.m133794c(mo121174F(), Dialog.class.getName());
        super.show();
        Window window = getWindow();
        window.setDimAmount(0.3f);
        mo121175G().post(new Runnable() { // from class: l.l17
            @Override // java.lang.Runnable
            public final void run() {
                this.f125618a.m152577E();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C18366a(bottomSheetBehaviorFrom));
            if (mo121173C()) {
                window.setNavigationBarColor(-1);
                if (Build.VERSION.SDK_INT >= 26) {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 16);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public abstract boolean mo121181z();

    /* JADX INFO: renamed from: l.m17$a */
    public class C18366a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f130808a;

        public C18366a(BottomSheetBehavior bottomSheetBehavior) {
            this.f130808a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                if (m17.this.mo121176H()) {
                    return;
                }
                this.f130808a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                m17.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

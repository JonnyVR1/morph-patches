package p153l;

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
import com.p051p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q27 extends pej0 {

    /* JADX INFO: renamed from: f */
    public l4g0 f155300f;

    public q27(@NonNull Context context) {
        super(context, lgc0.f131951b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m175011D(DialogInterface dialogInterface) {
        w1e.m204401e(this.f155300f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m175012E() {
        getBehavior().setPeekHeight(mo125593G().getHeight());
    }

    /* JADX INFO: renamed from: A */
    public l4g0 m175015A() {
        return this.f155300f;
    }

    /* JADX INFO: renamed from: C */
    public abstract boolean mo125591C();

    /* JADX INFO: renamed from: F */
    public abstract String mo125592F();

    /* JADX INFO: renamed from: G */
    public abstract View mo125593G();

    /* JADX INFO: renamed from: H */
    public abstract boolean mo125594H();

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        if (mo125599z()) {
            dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        setCancelable(mo125594H());
        super.onCreate(bundle);
        w1e.m204402f(this.f155300f);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.o27
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f144724a.m175011D(dialogInterface);
            }
        });
        if (mo125599z()) {
            m172033v(new zyf0());
        }
    }

    @Override // android.app.Dialog
    public void show() {
        this.f155300f = w1e.m204399c(mo125592F(), Dialog.class.getName());
        super.show();
        Window window = getWindow();
        window.setDimAmount(0.3f);
        mo125593G().post(new Runnable() { // from class: l.p27
            @Override // java.lang.Runnable
            public final void run() {
                this.f150246a.m175012E();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C19506a(bottomSheetBehaviorFrom));
            if (mo125591C()) {
                window.setNavigationBarColor(-1);
                if (Build.VERSION.SDK_INT >= 26) {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 16);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public abstract boolean mo125599z();

    /* JADX INFO: renamed from: l.q27$a */
    public class C19506a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f155301a;

        public C19506a(BottomSheetBehavior bottomSheetBehavior) {
            this.f155301a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                if (q27.this.mo125594H()) {
                    return;
                }
                this.f155301a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                q27.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

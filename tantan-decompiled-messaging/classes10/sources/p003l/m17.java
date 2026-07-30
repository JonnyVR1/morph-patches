package p003l;

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
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.g8c0;
import l.i0e;
import l.i5c0;
import l.l5j0;
import l.n3c0;
import l.qqf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public abstract class m17 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public cwf0 f6239f;

    public m17(@NonNull Context context) {
        super(context, g8c0.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m7938D(DialogInterface dialogInterface) {
        i0e.e(this.f6239f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m7939E() {
        getBehavior().setPeekHeight(m7945G().getHeight());
    }

    /* JADX INFO: renamed from: A */
    public cwf0 m7942A() {
        return this.f6239f;
    }

    /* JADX INFO: renamed from: C */
    public abstract boolean m7943C();

    /* JADX INFO: renamed from: F */
    public abstract String m7944F();

    /* JADX INFO: renamed from: G */
    public abstract View m7945G();

    /* JADX INFO: renamed from: H */
    public abstract boolean m7946H();

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*android.app.Dialog*/.onBackPressed();
        if (m7947z()) {
            dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        setCancelable(m7946H());
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        i0e.f(this.f6239f);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.k17
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f5411a.m7938D(dialogInterface);
            }
        });
        if (m7947z()) {
            v(new qqf0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        this.f6239f = i0e.c(m7944F(), Dialog.class.getName());
        super/*android.app.Dialog*/.show();
        Window window = getWindow();
        window.setDimAmount(0.3f);
        m7945G().post(new Runnable() { // from class: l.l17
            @Override // java.lang.Runnable
            public final void run() {
                this.f5743a.m7939E();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C3366a(bottomSheetBehaviorFrom));
            if (m7943C()) {
                window.setNavigationBarColor(-1);
                if (Build.VERSION.SDK_INT >= 26) {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 16);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public abstract boolean m7947z();

    /* JADX INFO: renamed from: l.m17$a */
    public class C3366a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f6240a;

        public C3366a(BottomSheetBehavior bottomSheetBehavior) {
            this.f6240a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                if (m17.this.m7946H()) {
                    return;
                }
                this.f6240a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                m17.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

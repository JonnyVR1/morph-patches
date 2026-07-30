package p006l;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.a5c0;
import l.cwf0;
import l.e51;
import l.i0e;
import l.l5j0;
import l.n3c0;
import l.t100;
import l.z7c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hno extends l5j0 {

    /* JADX INFO: renamed from: f */
    public eoo f13978f;

    /* JADX INFO: renamed from: g */
    public ioo f13979g;

    /* JADX INFO: renamed from: h */
    public Act f13980h;

    /* JADX INFO: renamed from: i */
    public ViewGroup f13981i;

    /* JADX INFO: renamed from: j */
    public cwf0 f13982j;

    public hno(@NonNull @NotNull Act act) {
        super(act, z7c0.b);
        this.f13980h = act;
        m16289A();
        setCancelable(false);
        this.f13982j = i0e.c("p_intl_swipe_setting", getClass().getName());
    }

    /* JADX INFO: renamed from: A */
    private void m16289A() {
        this.f13978f = new eoo(this.f13980h, this);
        ioo iooVar = new ioo(this.f13980h);
        this.f13979g = iooVar;
        this.f13978f.C(iooVar);
    }

    /* JADX INFO: renamed from: C */
    private void m16290C() {
        this.f13978f.m14738I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m16291E() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: F */
    public static void m16292F(Act act) {
        new hno(act).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private void m16295z() {
        final Window window = getWindow();
        if (NullChecker.a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(a5c0.m);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(n3c0.X);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0809a(bottomSheetBehaviorFrom));
        }
        e51.G(new Runnable() { // from class: l.gno
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(z7c0.c);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m16296D() {
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        this.f13982j.k();
        this.f13982j.j();
        getWindow().setWindowAnimations(z7c0.a);
        e51.G(new Runnable() { // from class: l.fno
            @Override // java.lang.Runnable
            public final void run() {
                this.f12800a.m16296D();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*android.app.Dialog*/.onBackPressed();
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        this.f13981i = (ViewGroup) this.f13979g.inflateView(this.f13980h.getLayoutInflater(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setContentView(this.f13981i, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.d(10.0f);
        m16291E();
    }

    public void onStart() {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onStart();
        m16290C();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f13981i.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
        this.f13982j.c();
        this.f13982j.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m16295z();
    }

    /* JADX INFO: renamed from: l.hno$a */
    public class C0809a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f13983a;

        public C0809a(BottomSheetBehavior bottomSheetBehavior) {
            this.f13983a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f13983a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                hno.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

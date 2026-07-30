package p149l;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class hno extends l5j0 {

    /* JADX INFO: renamed from: f */
    public eoo f108644f;

    /* JADX INFO: renamed from: g */
    public ioo f108645g;

    /* JADX INFO: renamed from: h */
    public Act f108646h;

    /* JADX INFO: renamed from: i */
    public ViewGroup f108647i;

    /* JADX INFO: renamed from: j */
    public cwf0 f108648j;

    public hno(@NonNull @NotNull Act act) {
        super(act, z7c0.f201999b);
        this.f108646h = act;
        m131950A();
        setCancelable(false);
        this.f108648j = i0e.m133794c("p_intl_swipe_setting", getClass().getName());
    }

    /* JADX INFO: renamed from: A */
    private void m131950A() {
        this.f108644f = new eoo(this.f108646h, this);
        ioo iooVar = new ioo(this.f108646h);
        this.f108645g = iooVar;
        this.f108644f.mo51532C(iooVar);
    }

    /* JADX INFO: renamed from: C */
    private void m131951C() {
        this.f108644f.m117446I();
    }

    /* JADX INFO: renamed from: E */
    private void m131952E() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: F */
    public static void m131953F(Act act) {
        new hno(act).show();
    }

    /* JADX INFO: renamed from: z */
    private void m131956z() {
        final Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(a5c0.f67690m);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(n3c0.f136959X);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17349a(bottomSheetBehaviorFrom));
        }
        e51.m114742G(new Runnable() { // from class: l.gno
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(z7c0.f202000c);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m131957D() {
        super.dismiss();
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f108648j.m109035k();
        this.f108648j.m109034j();
        getWindow().setWindowAnimations(z7c0.f201998a);
        e51.m114742G(new Runnable() { // from class: l.fno
            @Override // java.lang.Runnable
            public final void run() {
                this.f98438a.m131957D();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        dismiss();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108647i = (ViewGroup) this.f108645g.inflateView(this.f108646h.getLayoutInflater(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setContentView(this.f108647i, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.m186890d(10.0f);
        m131952E();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        m131951C();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f108647i.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
        this.f108648j.m109027c();
        this.f108648j.m109042r();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m131956z();
    }

    /* JADX INFO: renamed from: l.hno$a */
    public class C17349a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f108649a;

        public C17349a(BottomSheetBehavior bottomSheetBehavior) {
            this.f108649a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f108649a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                hno.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

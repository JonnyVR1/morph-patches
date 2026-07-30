package p153l;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class hpo extends pej0 {

    /* JADX INFO: renamed from: f */
    public eqo f111033f;

    /* JADX INFO: renamed from: g */
    public iqo f111034g;

    /* JADX INFO: renamed from: h */
    public Act f111035h;

    /* JADX INFO: renamed from: i */
    public ViewGroup f111036i;

    /* JADX INFO: renamed from: j */
    public l4g0 f111037j;

    public hpo(@NonNull @NotNull Act act) {
        super(act, egc0.f93914b);
        this.f111035h = act;
        m136566A();
        setCancelable(false);
        this.f111037j = w1e.m204399c("p_intl_swipe_setting", getClass().getName());
    }

    /* JADX INFO: renamed from: A */
    private void m136566A() {
        this.f111033f = new eqo(this.f111035h, this);
        iqo iqoVar = new iqo(this.f111035h);
        this.f111034g = iqoVar;
        this.f111033f.mo52715C(iqoVar);
    }

    /* JADX INFO: renamed from: C */
    private void m136567C() {
        this.f111033f.m121980I();
    }

    /* JADX INFO: renamed from: E */
    private void m136568E() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: F */
    public static void m136569F(Act act) {
        new hpo(act).show();
    }

    /* JADX INFO: renamed from: z */
    private void m136572z() {
        final Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(gdc0.f103685m);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(tbc0.f172874X);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17532a(bottomSheetBehaviorFrom));
        }
        l51.m152887G(new Runnable() { // from class: l.gpo
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(egc0.f93915c);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m136573D() {
        super.dismiss();
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f111037j.m152776k();
        this.f111037j.m152775j();
        getWindow().setWindowAnimations(egc0.f93913a);
        l51.m152887G(new Runnable() { // from class: l.fpo
            @Override // java.lang.Runnable
            public final void run() {
                this.f100207a.m136573D();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        dismiss();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f111036i = (ViewGroup) this.f111034g.inflateView(this.f111035h.getLayoutInflater(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setContentView(this.f111036i, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = qa00.m175859d(10.0f);
        m136568E();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        m136567C();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f111036i.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
        this.f111037j.m152768c();
        this.f111037j.m152783r();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m136572z();
    }

    /* JADX INFO: renamed from: l.hpo$a */
    public class C17532a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f111038a;

        public C17532a(BottomSheetBehavior bottomSheetBehavior) {
            this.f111038a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f111038a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                hpo.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

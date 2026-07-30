package p153l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes3.dex */
public class i5x extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f113110f;

    /* JADX INFO: renamed from: g */
    public VImage f113111g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f113112h;

    /* JADX INFO: renamed from: i */
    public Act f113113i;

    /* JADX INFO: renamed from: j */
    public Runnable f113114j;

    public i5x(@NonNull Act act, Runnable runnable) {
        super(act, agc0.f71117c);
        this.f113113i = act;
        this.f113114j = runnable;
    }

    /* JADX INFO: renamed from: C */
    private void m138781C() {
        Window window = getWindow();
        this.f113110f.post(new Runnable() { // from class: l.h5x
            @Override // java.lang.Runnable
            public final void run() {
                this.f107982a.m138789E();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.3f);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17655a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: D */
    private void m138782D() {
        setContentView(m138788A(LayoutInflater.from(this.f113113i), null));
        bnl0.m105509E0(this.f113111g, new View.OnClickListener() { // from class: l.f5x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97348a.m138783F(view);
            }
        });
        bnl0.m105509E0(this.f113112h, new View.OnClickListener() { // from class: l.g5x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102364a.m138784G(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m138783F(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m138784G(View view) {
        if (NullChecker.m82486a(this.f113114j)) {
            this.f113114j.run();
            CoreModule.f18264c.f20381e0.f89030F4.put(Boolean.TRUE);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public View m138788A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j5x.m143595b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m138789E() {
        getBehavior().setPeekHeight(this.f113110f.getHeight());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m138782D();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m138781C();
    }

    /* JADX INFO: renamed from: l.i5x$a */
    public class C17655a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f113115a;

        public C17655a(BottomSheetBehavior bottomSheetBehavior) {
            this.f113115a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f113115a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                i5x.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

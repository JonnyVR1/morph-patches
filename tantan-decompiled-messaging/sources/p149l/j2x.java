package p149l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes3.dex */
public class j2x extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f115977f;

    /* JADX INFO: renamed from: g */
    public VImage f115978g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f115979h;

    /* JADX INFO: renamed from: i */
    public Act f115980i;

    /* JADX INFO: renamed from: j */
    public Runnable f115981j;

    public j2x(@NonNull Act act, Runnable runnable) {
        super(act, v7c0.f180356c);
        this.f115980i = act;
        this.f115981j = runnable;
    }

    /* JADX INFO: renamed from: C */
    private void m139498C() {
        Window window = getWindow();
        this.f115977f.post(new Runnable() { // from class: l.i2x
            @Override // java.lang.Runnable
            public final void run() {
                this.f110598a.m139506E();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.3f);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17675a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: D */
    private void m139499D() {
        setContentView(m139505A(LayoutInflater.from(this.f115980i), null));
        xdl0.m208329E0(this.f115978g, new View.OnClickListener() { // from class: l.g2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100313a.m139500F(view);
            }
        });
        xdl0.m208329E0(this.f115979h, new View.OnClickListener() { // from class: l.h2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105568a.m139501G(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m139500F(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m139501G(View view) {
        if (NullChecker.m81303a(this.f115981j)) {
            this.f115981j.run();
            CoreModule.f17545c.f19639e0.f149173F4.put(Boolean.TRUE);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public View m139505A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k2x.m144354b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m139506E() {
        getBehavior().setPeekHeight(this.f115977f.getHeight());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m139499D();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m139498C();
    }

    /* JADX INFO: renamed from: l.j2x$a */
    public class C17675a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f115982a;

        public C17675a(BottomSheetBehavior bottomSheetBehavior) {
            this.f115982a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f115982a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                j2x.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

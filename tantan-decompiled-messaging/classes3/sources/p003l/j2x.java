package p003l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import l.i5c0;
import l.k2x;
import l.l5j0;
import l.n3c0;
import l.v7c0;
import l.xdl0;
import p028v.VImage;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class j2x extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f4556f;

    /* JADX INFO: renamed from: g */
    public VImage f4557g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f4558h;

    /* JADX INFO: renamed from: i */
    public Act f4559i;

    /* JADX INFO: renamed from: j */
    public Runnable f4560j;

    public j2x(@NonNull Act act, Runnable runnable) {
        super(act, v7c0.c);
        this.f4559i = act;
        this.f4560j = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    private void m5301C() {
        Window window = getWindow();
        this.f4556f.post(new Runnable() { // from class: l.i2x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4329a.m5309E();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.3f);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0351a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: D */
    private void m5302D() {
        setContentView(m5308A(LayoutInflater.from(this.f4559i), null));
        xdl0.E0(this.f4557g, new View.OnClickListener() { // from class: l.g2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3793a.m5303F(view);
            }
        });
        xdl0.E0(this.f4558h, new View.OnClickListener() { // from class: l.h2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4101a.m5304G(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m5303F(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m5304G(View view) {
        if (NullChecker.a(this.f4560j)) {
            this.f4560j.run();
            CoreModule.c.e0.F4.put(Boolean.TRUE);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public View m5308A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k2x.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m5309E() {
        getBehavior().setPeekHeight(this.f4556f.getHeight());
    }

    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m5302D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m5301C();
    }

    /* JADX INFO: renamed from: l.j2x$a */
    public class C0351a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f4561a;

        public C0351a(BottomSheetBehavior bottomSheetBehavior) {
            this.f4561a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f4561a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                j2x.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

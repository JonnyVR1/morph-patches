package p003l;

import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.i5c0;
import l.l5j0;
import l.n3c0;
import l.qib0;
import l.qqf0;
import l.v7c0;
import l.xdl0;
import l.zch0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bj4 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VFrame f3386f;

    /* JADX INFO: renamed from: g */
    public VFrame f3387g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f3388h;

    /* JADX INFO: renamed from: i */
    public VImage f3389i;

    /* JADX INFO: renamed from: j */
    public VText f3390j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f3391k;

    /* JADX INFO: renamed from: l */
    public VImage f3392l;

    /* JADX INFO: renamed from: m */
    public final Act f3393m;

    /* JADX INFO: renamed from: n */
    public final User f3394n;

    public bj4(Act act, User user) {
        super(act, v7c0.c);
        this.f3393m = act;
        this.f3394n = user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m5726E() {
        Window window = getWindow();
        this.f3386f.post(new Runnable() { // from class: l.wi4
            @Override // java.lang.Runnable
            public final void run() {
                this.f8192a.m5728G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C3303a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m5727F() {
        setContentView(m5734D(LayoutInflater.from(this.f3393m), null));
        v(new qqf0());
        xdl0.E0(this.f3392l, new View.OnClickListener() { // from class: l.zi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9259a.m5729H(view);
            }
        });
        xdl0.E0(this.f3391k, new View.OnClickListener() { // from class: l.aj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2792a.m5730I(view);
            }
        });
        if (NullChecker.a(this.f3394n)) {
            qib0.G.J0(this.f3388h, this.f3394n.fp().profileMiddle(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m5728G() {
        getBehavior().setPeekHeight(this.f3386f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m5729H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m5730I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m5734D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cj4.m5952b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m5727F();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xi4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zch0.a().j(false, "CardCertificationDialog");
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.yi4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.a().j(true, "CardCertificationDialog");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m5726E();
    }

    /* JADX INFO: renamed from: l.bj4$a */
    public class C3303a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f3395a;

        public C3303a(BottomSheetBehavior bottomSheetBehavior) {
            this.f3395a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f3395a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                bj4.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

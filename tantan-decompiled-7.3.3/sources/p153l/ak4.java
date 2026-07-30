package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ak4 extends pej0 {

    /* JADX INFO: renamed from: f */
    public VFrame f71959f;

    /* JADX INFO: renamed from: g */
    public VFrame f71960g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f71961h;

    /* JADX INFO: renamed from: i */
    public VImage f71962i;

    /* JADX INFO: renamed from: j */
    public VText f71963j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f71964k;

    /* JADX INFO: renamed from: l */
    public VImage f71965l;

    /* JADX INFO: renamed from: m */
    public final Act f71966m;

    /* JADX INFO: renamed from: n */
    public final User f71967n;

    public ak4(Act act, User user) {
        super(act, agc0.f71117c);
        this.f71966m = act;
        this.f71967n = user;
    }

    /* JADX INFO: renamed from: E */
    private void m98549E() {
        Window window = getWindow();
        this.f71959f.post(new Runnable() { // from class: l.vj4
            @Override // java.lang.Runnable
            public final void run() {
                this.f184352a.m98551G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C15733a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m98550F() {
        setContentView(m98557D(LayoutInflater.from(this.f71966m), null));
        m172033v(new zyf0());
        bnl0.m105509E0(this.f71965l, new View.OnClickListener() { // from class: l.yj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200270a.m98552H(view);
            }
        });
        bnl0.m105509E0(this.f71964k, new View.OnClickListener() { // from class: l.zj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204640a.m98553I(view);
            }
        });
        if (NullChecker.m82486a(this.f71967n)) {
            uqb0.f180374G.m127111J0(this.f71961h, this.f71967n.m61308fp().profileMiddle(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m98551G() {
        getBehavior().setPeekHeight(this.f71959f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m98552H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m98553I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m98557D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bk4.m104794b(this, layoutInflater, viewGroup);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m98550F();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wj4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hlh0.m135741a().m135750j(false, "CardCertificationDialog");
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.xj4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                hlh0.m135741a().m135750j(true, "CardCertificationDialog");
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m98549E();
    }

    /* JADX INFO: renamed from: l.ak4$a */
    public class C15733a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f71968a;

        public C15733a(BottomSheetBehavior bottomSheetBehavior) {
            this.f71968a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f71968a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                ak4.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

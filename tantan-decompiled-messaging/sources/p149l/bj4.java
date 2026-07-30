package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bj4 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VFrame f75865f;

    /* JADX INFO: renamed from: g */
    public VFrame f75866g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f75867h;

    /* JADX INFO: renamed from: i */
    public VImage f75868i;

    /* JADX INFO: renamed from: j */
    public VText f75869j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f75870k;

    /* JADX INFO: renamed from: l */
    public VImage f75871l;

    /* JADX INFO: renamed from: m */
    public final Act f75872m;

    /* JADX INFO: renamed from: n */
    public final User f75873n;

    public bj4(Act act, User user) {
        super(act, v7c0.f180356c);
        this.f75872m = act;
        this.f75873n = user;
    }

    /* JADX INFO: renamed from: E */
    private void m102153E() {
        Window window = getWindow();
        this.f75865f.post(new Runnable() { // from class: l.wi4
            @Override // java.lang.Runnable
            public final void run() {
                this.f186500a.m102155G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C15874a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m102154F() {
        setContentView(m102161D(LayoutInflater.from(this.f75872m), null));
        m148650v(new qqf0());
        xdl0.m208329E0(this.f75871l, new View.OnClickListener() { // from class: l.zi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203292a.m102156H(view);
            }
        });
        xdl0.m208329E0(this.f75870k, new View.OnClickListener() { // from class: l.aj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70085a.m102157I(view);
            }
        });
        if (NullChecker.m81303a(this.f75873n)) {
            qib0.f154691G.m102327J0(this.f75867h, this.f75873n.m60124fp().profileMiddle(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m102155G() {
        getBehavior().setPeekHeight(this.f75865f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m102156H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m102157I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m102161D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cj4.m107107b(this, layoutInflater, viewGroup);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m102154F();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xi4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zch0.m218024a().m218033j(false, "CardCertificationDialog");
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.yi4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.m218024a().m218033j(true, "CardCertificationDialog");
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m102153E();
    }

    /* JADX INFO: renamed from: l.bj4$a */
    public class C15874a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f75874a;

        public C15874a(BottomSheetBehavior bottomSheetBehavior) {
            this.f75874a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f75874a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                bj4.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

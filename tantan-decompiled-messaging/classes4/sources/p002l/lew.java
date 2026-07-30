package p002l;

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
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.i0e;
import l.i5c0;
import l.l5j0;
import l.lqa;
import l.mew;
import l.n3c0;
import l.qib0;
import l.qqf0;
import l.t100;
import l.xdl0;
import l.z7c0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lew extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f14813f;

    /* JADX INFO: renamed from: g */
    public VImage f14814g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f14815h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f14816i;

    /* JADX INFO: renamed from: j */
    public VText_Bold f14817j;

    /* JADX INFO: renamed from: k */
    public final Act f14818k;

    /* JADX INFO: renamed from: l */
    public cwf0 f14819l;

    /* JADX INFO: renamed from: m */
    public final Runnable f14820m;

    /* JADX INFO: renamed from: n */
    public final Runnable f14821n;

    public lew(@NonNull Act act, @NonNull Runnable runnable, @NonNull Runnable runnable2) {
        super(act, z7c0.b);
        this.f14818k = act;
        this.f14820m = runnable;
        this.f14821n = runnable2;
        setCancelable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m17166E() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f14813f.post(new Runnable() { // from class: l.gew
            @Override // java.lang.Runnable
            public final void run() {
                this.f11391a.m17168G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0658a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m17167F() {
        setContentView(m17176D(LayoutInflater.from(this.f14818k), null));
        v(new qqf0());
        qib0.G.L0(this.f14815h, CoreModule.c.e0.p9().isFemale() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlhVQlVJRERCNlRKN1VPSEoyWVlQVlRDTEdLRDRCNDE0IiwidyI6ODg1LCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5OTAwNDg3NzYzMTA4MDgyNzcyfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IllCUlE1SFgyS0dBN05NSFpITlZIUFlDNlEzM0JYTjE0IiwidyI6ODg1LCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDc3NzkwNDMxMzYyOTI3MzQyOH0.png");
        xdl0.C0(this.f14815h, ((xdl0.y0() - t100.d(80.0f)) * 256) / 295);
        xdl0.E0(this.f14814g, new View.OnClickListener() { // from class: l.iew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13188a.m17169H(view);
            }
        });
        xdl0.E0(this.f14816i, new View.OnClickListener() { // from class: l.jew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13718a.m17170I(view);
            }
        });
        xdl0.E0(this.f14817j, new View.OnClickListener() { // from class: l.kew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14304a.m17171J(view);
            }
        });
        if (lqa.w()) {
            xdl0.M(this.f14816i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m17168G() {
        getBehavior().setPeekHeight(this.f14813f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m17169H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m17170I(View view) {
        this.f14820m.run();
        zvf0.r("e_upload_video", "p_highqualityphoto_guide_popup");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m17171J(View view) {
        this.f14821n.run();
        zvf0.r("e_upload_photos", "p_highqualityphoto_guide_popup");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m17172K(DialogInterface dialogInterface) {
        i0e.e(this.f14819l);
    }

    /* JADX INFO: renamed from: D */
    public View m17176D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mew.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m17167F();
        cwf0 cwf0VarC = i0e.c("p_highqualityphoto_guide_popup", Dialog.class.getName());
        this.f14819l = cwf0VarC;
        i0e.f(cwf0VarC);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hew
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f12005a.m17172K(dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m17166E();
    }

    /* JADX INFO: renamed from: l.lew$a */
    public class C0658a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f14822a;

        public C0658a(BottomSheetBehavior bottomSheetBehavior) {
            this.f14822a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f14822a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                lew.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

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
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class lew extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f127757f;

    /* JADX INFO: renamed from: g */
    public VImage f127758g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f127759h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f127760i;

    /* JADX INFO: renamed from: j */
    public VText_Bold f127761j;

    /* JADX INFO: renamed from: k */
    public final Act f127762k;

    /* JADX INFO: renamed from: l */
    public cwf0 f127763l;

    /* JADX INFO: renamed from: m */
    public final Runnable f127764m;

    /* JADX INFO: renamed from: n */
    public final Runnable f127765n;

    public lew(@NonNull Act act, @NonNull Runnable runnable, @NonNull Runnable runnable2) {
        super(act, z7c0.f201999b);
        this.f127762k = act;
        this.f127764m = runnable;
        this.f127765n = runnable2;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: E */
    private void m149604E() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f127757f.post(new Runnable() { // from class: l.gew
            @Override // java.lang.Runnable
            public final void run() {
                this.f102310a.m149606G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C18208a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m149605F() {
        setContentView(m149614D(LayoutInflater.from(this.f127762k), null));
        m148650v(new qqf0());
        qib0.f154691G.m102331L0(this.f127759h, CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlhVQlVJRERCNlRKN1VPSEoyWVlQVlRDTEdLRDRCNDE0IiwidyI6ODg1LCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5OTAwNDg3NzYzMTA4MDgyNzcyfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IllCUlE1SFgyS0dBN05NSFpITlZIUFlDNlEzM0JYTjE0IiwidyI6ODg1LCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDc3NzkwNDMxMzYyOTI3MzQyOH0.png");
        xdl0.m208325C0(this.f127759h, ((xdl0.m208412y0() - t100.m186890d(80.0f)) * 256) / 295);
        xdl0.m208329E0(this.f127758g, new View.OnClickListener() { // from class: l.iew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112930a.m149607H(view);
            }
        });
        xdl0.m208329E0(this.f127760i, new View.OnClickListener() { // from class: l.jew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117612a.m149608I(view);
            }
        });
        xdl0.m208329E0(this.f127761j, new View.OnClickListener() { // from class: l.kew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122875a.m149609J(view);
            }
        });
        if (lqa.m150985w()) {
            xdl0.m208344M(this.f127760i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m149606G() {
        getBehavior().setPeekHeight(this.f127757f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m149607H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m149608I(View view) {
        this.f127764m.run();
        zvf0.m220396r("e_upload_video", "p_highqualityphoto_guide_popup");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m149609J(View view) {
        this.f127765n.run();
        zvf0.m220396r("e_upload_photos", "p_highqualityphoto_guide_popup");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m149610K(DialogInterface dialogInterface) {
        i0e.m133796e(this.f127763l);
    }

    /* JADX INFO: renamed from: D */
    public View m149614D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mew.m154315b(this, layoutInflater, viewGroup);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m149605F();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_highqualityphoto_guide_popup", Dialog.class.getName());
        this.f127763l = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hew
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f107413a.m149610K(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m149604E();
    }

    /* JADX INFO: renamed from: l.lew$a */
    public class C18208a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f127766a;

        public C18208a(BottomSheetBehavior bottomSheetBehavior) {
            this.f127766a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f127766a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                lew.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

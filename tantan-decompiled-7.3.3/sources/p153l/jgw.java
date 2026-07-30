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
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class jgw extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f120773f;

    /* JADX INFO: renamed from: g */
    public VImage f120774g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f120775h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f120776i;

    /* JADX INFO: renamed from: j */
    public VText_Bold f120777j;

    /* JADX INFO: renamed from: k */
    public final Act f120778k;

    /* JADX INFO: renamed from: l */
    public l4g0 f120779l;

    /* JADX INFO: renamed from: m */
    public final Runnable f120780m;

    /* JADX INFO: renamed from: n */
    public final Runnable f120781n;

    public jgw(@NonNull Act act, @NonNull Runnable runnable, @NonNull Runnable runnable2) {
        super(act, egc0.f93914b);
        this.f120778k = act;
        this.f120780m = runnable;
        this.f120781n = runnable2;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: E */
    private void m144807E() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f120773f.post(new Runnable() { // from class: l.egw
            @Override // java.lang.Runnable
            public final void run() {
                this.f93979a.m144809G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17949a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m144808F() {
        setContentView(m144817D(LayoutInflater.from(this.f120778k), null));
        m172033v(new zyf0());
        uqb0.f180374G.m127115L0(this.f120775h, CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlhVQlVJRERCNlRKN1VPSEoyWVlQVlRDTEdLRDRCNDE0IiwidyI6ODg1LCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5OTAwNDg3NzYzMTA4MDgyNzcyfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IllCUlE1SFgyS0dBN05NSFpITlZIUFlDNlEzM0JYTjE0IiwidyI6ODg1LCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDc3NzkwNDMxMzYyOTI3MzQyOH0.png");
        bnl0.m105505C0(this.f120775h, ((bnl0.m105592y0() - qa00.m175859d(80.0f)) * 256) / 295);
        bnl0.m105509E0(this.f120774g, new View.OnClickListener() { // from class: l.ggw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104051a.m144810H(view);
            }
        });
        bnl0.m105509E0(this.f120776i, new View.OnClickListener() { // from class: l.hgw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109445a.m144811I(view);
            }
        });
        bnl0.m105509E0(this.f120777j, new View.OnClickListener() { // from class: l.igw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114824a.m144812J(view);
            }
        });
        if (xra.m212804w()) {
            bnl0.m105524M(this.f120776i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m144809G() {
        getBehavior().setPeekHeight(this.f120773f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m144810H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m144811I(View view) {
        this.f120780m.run();
        i4g0.m138520r("e_upload_video", "p_highqualityphoto_guide_popup");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m144812J(View view) {
        this.f120781n.run();
        i4g0.m138520r("e_upload_photos", "p_highqualityphoto_guide_popup");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m144813K(DialogInterface dialogInterface) {
        w1e.m204401e(this.f120779l);
    }

    /* JADX INFO: renamed from: D */
    public View m144817D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kgw.m149763b(this, layoutInflater, viewGroup);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m144808F();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_highqualityphoto_guide_popup", Dialog.class.getName());
        this.f120779l = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fgw
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f98983a.m144813K(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m144807E();
    }

    /* JADX INFO: renamed from: l.jgw$a */
    public class C17949a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f120782a;

        public C17949a(BottomSheetBehavior bottomSheetBehavior) {
            this.f120782a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f120782a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                jgw.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

package p153l;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VButton;
import p151v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class hre0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public Context f111334f;

    /* JADX INFO: renamed from: g */
    public VImage f111335g;

    /* JADX INFO: renamed from: h */
    public VButton f111336h;

    /* JADX INFO: renamed from: i */
    public l4g0 f111337i;

    /* JADX INFO: renamed from: j */
    public View f111338j;

    public hre0(@NonNull @NotNull Context context) {
        super(context, agc0.f71117c);
        this.f111334f = context;
        this.f111337i = w1e.m204399c("p_marriage_user_complete_profile", getClass().getName());
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m136833C() {
        gw90.m132584d();
        gw90.m132589i();
    }

    /* JADX INFO: renamed from: D */
    private void m136834D() {
        final Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(dbc0.f86866bo);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17563a(bottomSheetBehaviorFrom));
        }
        l51.m152887G(new Runnable() { // from class: l.ere0
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(agc0.f71125k);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private void m136835E() {
        this.f111338j = p9r.m171370a(this.f111334f).inflate(kec0.f125652Ub, (ViewGroup) null);
        setContentView(this.f111338j, new FrameLayout.LayoutParams(-1, -1));
        this.f111335g = (VImage) this.f111338j.findViewById(adc0.f69806A1);
        this.f111336h = (VButton) this.f111338j.findViewById(adc0.f70450m4);
        setCancelable(true);
        bnl0.m105509E0(this.f111335g, new View.OnClickListener() { // from class: l.cre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83318a.m136837G(view);
            }
        });
        bnl0.m105509E0(this.f111336h, new View.OnClickListener() { // from class: l.dre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90383a.m136838H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m136836F() {
        super.m176562T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m136837G(View view) {
        m176562T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m136838H(View view) {
        i4g0.m138520r("e_marriage_user_compelete_profile", "p_marriage_user_complete_profile");
        Context context = this.f111334f;
        if (context instanceof Act) {
            ((Act) this.f111334f).startActivityForResult(ProfileInfoLoopEditAct.m52690Z1(context, LoopFragmentFactory.LoopCreateEntryType.ENTRY_SERIOUS_DIALOG, null, CoreModule.f18264c.f20381e0.m116600p9().mo225055clone(), CoreStaticData.SeriousPurposeDlgType.SERIOUS_PURPOSE_DIALOG), 3500);
            ((Act) this.f111334f).overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
            m176562T();
        }
    }

    /* JADX INFO: renamed from: J */
    private void m136839J() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: I */
    public final void m136843I() {
        l51.m152919y(new Runnable() { // from class: l.gre0
            @Override // java.lang.Runnable
            public final void run() {
                hre0.m136833C();
            }
        });
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m176562T() {
        this.f111337i.m152776k();
        this.f111337i.m152775j();
        getWindow().setWindowAnimations(agc0.f71115a);
        l51.m152887G(new Runnable() { // from class: l.fre0
            @Override // java.lang.Runnable
            public final void run() {
                this.f100411a.m136836F();
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m136835E();
        m136839J();
        m136843I();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f111337i.m152768c();
        this.f111337i.m152783r();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f111338j.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m136834D();
    }

    /* JADX INFO: renamed from: l.hre0$a */
    public class C17563a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f111339a;

        public C17563a(BottomSheetBehavior bottomSheetBehavior) {
            this.f111339a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f111339a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                hre0.this.m176562T();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

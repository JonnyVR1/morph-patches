package p006l;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.ProfileInfoLoopEditAct;
import com.tantanapp.common.utils.NullChecker;
import l.co90;
import l.cwf0;
import l.e51;
import l.i0e;
import l.l5j0;
import l.o7r;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VButton;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cje0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Context f9682f;

    /* JADX INFO: renamed from: g */
    public VImage f9683g;

    /* JADX INFO: renamed from: h */
    public VButton f9684h;

    /* JADX INFO: renamed from: i */
    public cwf0 f9685i;

    /* JADX INFO: renamed from: j */
    public View f9686j;

    public cje0(@NonNull @NotNull Context context) {
        super(context, v7c0.f24183c);
        this.f9682f = context;
        this.f9685i = i0e.c("p_marriage_user_complete_profile", getClass().getName());
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m13462C() {
        co90.d();
        co90.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    private void m13463D() {
        final Window window = getWindow();
        if (NullChecker.a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f23139o2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(x2c0.f26938nn);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0608a(bottomSheetBehaviorFrom));
        }
        e51.G(new Runnable() { // from class: l.zie0
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f24191k);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private void m13464E() {
        this.f9686j = o7r.a(this.f9682f).inflate(f6c0.f11900Nb, (ViewGroup) null);
        setContentView(this.f9686j, new FrameLayout.LayoutParams(-1, -1));
        this.f9683g = this.f9686j.findViewById(u4c0.f22466A1);
        this.f9684h = this.f9686j.findViewById(u4c0.f23073k4);
        setCancelable(true);
        xdl0.E0(this.f9683g, new View.OnClickListener() { // from class: l.xie0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27529a.m13466G(view);
            }
        });
        xdl0.E0(this.f9684h, new View.OnClickListener() { // from class: l.yie0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28234a.m13467H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m13465F() {
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m13466G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m13467H(View view) {
        zvf0.r("e_marriage_user_compelete_profile", "p_marriage_user_complete_profile");
        Context context = this.f9682f;
        if (context instanceof Act) {
            this.f9682f.startActivityForResult(ProfileInfoLoopEditAct.Y1(context, LoopFragmentFactory.LoopCreateEntryType.ENTRY_SERIOUS_DIALOG, (LoopInputType) null, CoreModule.f1534c.f3628e0.m21490p9().clone(), "serious_purpose_dialog"), 3500);
            this.f9682f.overridePendingTransition(rzb0.f20953y, rzb0.f20945q);
            dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    private void m13468J() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: I */
    public final void m13472I() {
        e51.y(new Runnable() { // from class: l.bje0
            @Override // java.lang.Runnable
            public final void run() {
                cje0.m13462C();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        this.f9685i.k();
        this.f9685i.j();
        getWindow().setWindowAnimations(v7c0.f24181a);
        e51.G(new Runnable() { // from class: l.aje0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8284a.m13465F();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m13464E();
        m13468J();
        m13472I();
    }

    public void onStart() {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onStart();
        this.f9685i.c();
        this.f9685i.r();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f9686j.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m13463D();
    }

    /* JADX INFO: renamed from: l.cje0$a */
    public class C0608a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f9687a;

        public C0608a(BottomSheetBehavior bottomSheetBehavior) {
            this.f9687a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f9687a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                cje0.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

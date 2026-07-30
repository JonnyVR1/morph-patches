package p149l;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VButton;
import p147v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class cje0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Context f81168f;

    /* JADX INFO: renamed from: g */
    public VImage f81169g;

    /* JADX INFO: renamed from: h */
    public VButton f81170h;

    /* JADX INFO: renamed from: i */
    public cwf0 f81171i;

    /* JADX INFO: renamed from: j */
    public View f81172j;

    public cje0(@NonNull @NotNull Context context) {
        super(context, v7c0.f180356c);
        this.f81168f = context;
        this.f81171i = i0e.m133794c("p_marriage_user_complete_profile", getClass().getName());
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m107141C() {
        co90.m107943d();
        co90.m107948i();
    }

    /* JADX INFO: renamed from: D */
    private void m107142D() {
        final Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(x2c0.f190402nn);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C16166a(bottomSheetBehaviorFrom));
        }
        e51.m114742G(new Runnable() { // from class: l.zie0
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f180364k);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private void m107143E() {
        this.f81172j = o7r.m163037a(this.f81168f).inflate(f6c0.f95486Nb, (ViewGroup) null);
        setContentView(this.f81172j, new FrameLayout.LayoutParams(-1, -1));
        this.f81169g = (VImage) this.f81172j.findViewById(u4c0.f173718A1);
        this.f81170h = (VButton) this.f81172j.findViewById(u4c0.f174325k4);
        setCancelable(true);
        xdl0.m208329E0(this.f81169g, new View.OnClickListener() { // from class: l.xie0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193103a.m107145G(view);
            }
        });
        xdl0.m208329E0(this.f81170h, new View.OnClickListener() { // from class: l.yie0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198475a.m107146H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m107144F() {
        super.m101651T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m107145G(View view) {
        m101651T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m107146H(View view) {
        zvf0.m220396r("e_marriage_user_compelete_profile", "p_marriage_user_complete_profile");
        Context context = this.f81168f;
        if (context instanceof Act) {
            ((Act) this.f81168f).startActivityForResult(ProfileInfoLoopEditAct.m51507Y1(context, LoopFragmentFactory.LoopCreateEntryType.ENTRY_SERIOUS_DIALOG, null, CoreModule.f17545c.f19639e0.m169527p9().mo223809clone(), CoreStaticData.SeriousPurposeDlgType.SERIOUS_PURPOSE_DIALOG), 3500);
            ((Act) this.f81168f).overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
            m101651T();
        }
    }

    /* JADX INFO: renamed from: J */
    private void m107147J() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: I */
    public final void m107151I() {
        e51.m114774y(new Runnable() { // from class: l.bje0
            @Override // java.lang.Runnable
            public final void run() {
                cje0.m107141C();
            }
        });
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m101651T() {
        this.f81171i.m109035k();
        this.f81171i.m109034j();
        getWindow().setWindowAnimations(v7c0.f180354a);
        e51.m114742G(new Runnable() { // from class: l.aje0
            @Override // java.lang.Runnable
            public final void run() {
                this.f70111a.m107144F();
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m107143E();
        m107147J();
        m107151I();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f81171i.m109027c();
        this.f81171i.m109042r();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f81172j.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m107142D();
    }

    /* JADX INFO: renamed from: l.cje0$a */
    public class C16166a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f81173a;

        public C16166a(BottomSheetBehavior bottomSheetBehavior) {
            this.f81173a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f81173a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                cje0.this.m101651T();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

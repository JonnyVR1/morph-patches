package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SurpriseGift;
import com.p051p1.mobile.putong.core.p058ui.profile.CityTopGreetDialog;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;

/* JADX INFO: loaded from: classes2.dex */
public class gch0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public View f103573f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f103574g;

    /* JADX INFO: renamed from: h */
    public VLinear f103575h;

    /* JADX INFO: renamed from: i */
    public TextView f103576i;

    /* JADX INFO: renamed from: j */
    public Act f103577j;

    /* JADX INFO: renamed from: k */
    public l4g0 f103578k;

    /* JADX INFO: renamed from: l */
    public BottomSheetBehavior f103579l;

    /* JADX INFO: renamed from: m */
    public x20 f103580m;

    /* JADX INFO: renamed from: n */
    public final BottomSheetBehavior.BottomSheetCallback f103581n;

    public gch0(@NonNull Context context) {
        super(context);
        this.f103581n = new C17195a();
        m129875H(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m129871C(View view) {
    }

    /* JADX INFO: renamed from: G */
    private String m129874G() {
        return "p_surprisebox";
    }

    /* JADX INFO: renamed from: H */
    private void m129875H(Context context) {
        this.f103577j = (Act) context;
        setContentView(m129883F(LayoutInflater.from(context), null));
        setCancelable(false);
    }

    /* JADX INFO: renamed from: I */
    private void m129876I() {
        bnl0.m105509E0(this.f103573f, new View.OnClickListener() { // from class: l.bch0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76149a.m129877J(view);
            }
        });
        bnl0.m105509E0(this.f103574g, new View.OnClickListener() { // from class: l.cch0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gch0.m129871C(view);
            }
        });
        bnl0.m105509E0(this.f103575h, new View.OnClickListener() { // from class: l.dch0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87786a.m129878K(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m129877J(View view) {
        dismiss();
        if (NullChecker.m82486a(this.f103580m)) {
            this.f103580m.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m129878K(View view) {
        m129885N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m129879M(DialogInterface dialogInterface) {
        w1e.m204401e(this.f103578k);
    }

    /* JADX INFO: renamed from: F */
    public View m129883F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lch0.m153685b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m129884L(SurpriseGift surpriseGift) {
        i4g0.m138520r("e_surprisebox_click", m129874G());
        if (!NullChecker.m82486a(surpriseGift)) {
            r1j0.m179420g("领取失败");
            return;
        }
        CoreModule.f18264c.f20401k2.m143758i3();
        CoreModule.f18264c.f20401k2.m143759j3();
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "matchUser")) {
            m129887P(0, surpriseGift.matchUserId);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "greetingUser")) {
            m129887P(1, surpriseGift.matchUserId);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "cardExposure")) {
            m129887P(3, null);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "boost")) {
            m129887P(2, null);
            CoreModule.f18264c.f20318J0.m156781V3();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: N */
    public final void m129885N() {
        duringCreated(CoreModule.f18264c.f20401k2.m143764o3()).subscribe(psd0.m173597H(new y20() { // from class: l.ech0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93059a.m129884L((SurpriseGift) obj);
            }
        }, new y20() { // from class: l.fch0
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("领取失败");
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m129886O(x20 x20Var) {
        this.f103580m = x20Var;
    }

    /* JADX INFO: renamed from: P */
    public final void m129887P(int i, String str) {
        ybh0.C21557b c21557b = new ybh0.C21557b();
        c21557b.m215072a(i);
        if (!TextUtils.isEmpty(str)) {
            c21557b.m215073b(CoreModule.m30930K().getUserById(str));
        }
        c21557b.m215074c(this.f103577j);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f103579l = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f103579l.setBottomSheetCallback(this.f103581n);
        m129876I();
        if (this.f103578k == null) {
            this.f103578k = w1e.m204399c(m129874G(), CityTopGreetDialog.class.getSimpleName());
        }
        w1e.m204402f(this.f103578k);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ach0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f69714a.m129879M(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l.gch0$a */
    public class C17195a extends BottomSheetBehavior.BottomSheetCallback {
        public C17195a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                gch0.this.f103579l.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

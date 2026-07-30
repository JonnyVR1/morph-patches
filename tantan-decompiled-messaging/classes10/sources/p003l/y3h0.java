package p003l;

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
import com.p000p1.mobile.putong.core.data.SurpriseGift;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.l5j0;
import l.mkd0;
import l.osi0;
import l.p4c0;
import l.xdl0;
import l.zvf0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y3h0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f8630f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f8631g;

    /* JADX INFO: renamed from: h */
    public VLinear f8632h;

    /* JADX INFO: renamed from: i */
    public TextView f8633i;

    /* JADX INFO: renamed from: j */
    public Act f8634j;

    /* JADX INFO: renamed from: k */
    public cwf0 f8635k;

    /* JADX INFO: renamed from: l */
    public BottomSheetBehavior f8636l;

    /* JADX INFO: renamed from: m */
    public d30 f8637m;

    /* JADX INFO: renamed from: n */
    public final BottomSheetBehavior.BottomSheetCallback f8638n;

    public y3h0(@NonNull Context context) {
        super(context);
        this.f8638n = new C3490a();
        m11134H(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m11130C(View view) {
    }

    /* JADX INFO: renamed from: G */
    private String m11133G() {
        return "p_surprisebox";
    }

    /* JADX INFO: renamed from: H */
    private void m11134H(Context context) {
        this.f8634j = (Act) context;
        setContentView(m11142F(LayoutInflater.from(context), null));
        setCancelable(false);
    }

    /* JADX INFO: renamed from: I */
    private void m11135I() {
        xdl0.E0(this.f8630f, new View.OnClickListener() { // from class: l.t3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7504a.m11136J(view);
            }
        });
        xdl0.E0(this.f8631g, new View.OnClickListener() { // from class: l.u3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y3h0.m11130C(view);
            }
        });
        xdl0.E0(this.f8632h, new View.OnClickListener() { // from class: l.v3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7858a.m11137K(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m11136J(View view) {
        dismiss();
        if (NullChecker.a(this.f8637m)) {
            this.f8637m.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m11137K(View view) {
        m11144N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m11138M(DialogInterface dialogInterface) {
        i0e.e(this.f8635k);
    }

    /* JADX INFO: renamed from: F */
    public View m11142F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d4h0.m6057b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m11143L(SurpriseGift surpriseGift) {
        zvf0.r("e_surprisebox_click", m11133G());
        if (!NullChecker.a(surpriseGift)) {
            osi0.g("领取失败");
            return;
        }
        CoreModule.c.k2.i3();
        CoreModule.c.k2.j3();
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "matchUser")) {
            m11146P(0, surpriseGift.matchUserId);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "greetingUser")) {
            m11146P(1, surpriseGift.matchUserId);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "cardExposure")) {
            m11146P(3, null);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "boost")) {
            m11146P(2, null);
            CoreModule.c.J0.V3();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: N */
    public final void m11144N() {
        duringCreated(CoreModule.c.k2.o3()).subscribe(mkd0.H(new e30() { // from class: l.w3h0
            public final void call(Object obj) {
                this.f8117a.m11143L((SurpriseGift) obj);
            }
        }, new e30() { // from class: l.x3h0
            public final void call(Object obj) {
                osi0.g("领取失败");
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m11145O(d30 d30Var) {
        this.f8637m = d30Var;
    }

    /* JADX INFO: renamed from: P */
    public final void m11146P(int i, String str) {
        q3h0.C3407b c3407b = new q3h0.C3407b();
        c3407b.m8907a(i);
        if (!TextUtils.isEmpty(str)) {
            c3407b.m8908b(CoreModule.K().getUserById(str));
        }
        c3407b.m8909c(this.f8634j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f8636l = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f8636l.setBottomSheetCallback(this.f8638n);
        m11135I();
        if (this.f8635k == null) {
            this.f8635k = i0e.c(m11133G(), CityTopGreetDialog.class.getSimpleName());
        }
        i0e.f(this.f8635k);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.s3h0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f7268a.m11138M(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l.y3h0$a */
    public class C3490a extends BottomSheetBehavior.BottomSheetCallback {
        public C3490a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                y3h0.this.f8636l.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

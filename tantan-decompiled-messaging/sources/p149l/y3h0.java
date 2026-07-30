package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SurpriseGift;
import com.p046p1.mobile.putong.core.p053ui.profile.CityTopGreetDialog;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class y3h0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f195801f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f195802g;

    /* JADX INFO: renamed from: h */
    public VLinear f195803h;

    /* JADX INFO: renamed from: i */
    public TextView f195804i;

    /* JADX INFO: renamed from: j */
    public Act f195805j;

    /* JADX INFO: renamed from: k */
    public cwf0 f195806k;

    /* JADX INFO: renamed from: l */
    public BottomSheetBehavior f195807l;

    /* JADX INFO: renamed from: m */
    public d30 f195808m;

    /* JADX INFO: renamed from: n */
    public final BottomSheetBehavior.BottomSheetCallback f195809n;

    public y3h0(@NonNull Context context) {
        super(context);
        this.f195809n = new C21303a();
        m212808H(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m212804C(View view) {
    }

    /* JADX INFO: renamed from: G */
    private String m212807G() {
        return "p_surprisebox";
    }

    /* JADX INFO: renamed from: H */
    private void m212808H(Context context) {
        this.f195805j = (Act) context;
        setContentView(m212816F(LayoutInflater.from(context), null));
        setCancelable(false);
    }

    /* JADX INFO: renamed from: I */
    private void m212809I() {
        xdl0.m208329E0(this.f195801f, new View.OnClickListener() { // from class: l.t3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167636a.m212810J(view);
            }
        });
        xdl0.m208329E0(this.f195802g, new View.OnClickListener() { // from class: l.u3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y3h0.m212804C(view);
            }
        });
        xdl0.m208329E0(this.f195803h, new View.OnClickListener() { // from class: l.v3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179810a.m212811K(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m212810J(View view) {
        dismiss();
        if (NullChecker.m81303a(this.f195808m)) {
            this.f195808m.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m212811K(View view) {
        m212818N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m212812M(DialogInterface dialogInterface) {
        i0e.m133796e(this.f195806k);
    }

    /* JADX INFO: renamed from: F */
    public View m212816F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d4h0.m109987b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m212817L(SurpriseGift surpriseGift) {
        zvf0.m220396r("e_surprisebox_click", m212807G());
        if (!NullChecker.m81303a(surpriseGift)) {
            osi0.m165783g("领取失败");
            return;
        }
        CoreModule.f17545c.f19659k2.m201607i3();
        CoreModule.f17545c.f19659k2.m201608j3();
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "matchUser")) {
            m212820P(0, surpriseGift.matchUserId);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "greetingUser")) {
            m212820P(1, surpriseGift.matchUserId);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "cardExposure")) {
            m212820P(3, null);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "boost")) {
            m212820P(2, null);
            CoreModule.f17545c.f19576J0.m139269V3();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: N */
    public final void m212818N() {
        duringCreated(CoreModule.f17545c.f19659k2.m201613o3()).subscribe(mkd0.m154956H(new e30() { // from class: l.w3h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184393a.m212817L((SurpriseGift) obj);
            }
        }, new e30() { // from class: l.x3h0
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("领取失败");
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m212819O(d30 d30Var) {
        this.f195808m = d30Var;
    }

    /* JADX INFO: renamed from: P */
    public final void m212820P(int i, String str) {
        q3h0.C19423b c19423b = new q3h0.C19423b();
        c19423b.m172864a(i);
        if (!TextUtils.isEmpty(str)) {
            c19423b.m172865b(CoreModule.m29932K().getUserById(str));
        }
        c19423b.m172866c(this.f195805j);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f195807l = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f195807l.setBottomSheetCallback(this.f195809n);
        m212809I();
        if (this.f195806k == null) {
            this.f195806k = i0e.m133794c(m212807G(), CityTopGreetDialog.class.getSimpleName());
        }
        i0e.m133797f(this.f195806k);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.s3h0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f162140a.m212812M(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l.y3h0$a */
    public class C21303a extends BottomSheetBehavior.BottomSheetCallback {
        public C21303a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                y3h0.this.f195807l.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

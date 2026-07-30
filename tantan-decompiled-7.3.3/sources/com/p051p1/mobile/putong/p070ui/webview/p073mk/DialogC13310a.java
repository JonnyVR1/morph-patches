package com.p051p1.mobile.putong.p070ui.webview.p073mk;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.google.android.material.C2489R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import p153l.bnl0;
import p153l.cbc0;
import p153l.jec0;
import p153l.pej0;
import p153l.psd0;
import p153l.qa00;
import p153l.qnp0;
import p153l.uqb0;
import p153l.y20;
import p153l.ycc0;
import p153l.zfc0;

/* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.a */
/* JADX INFO: loaded from: classes10.dex */
public class DialogC13310a extends pej0 {

    /* JADX INFO: renamed from: f */
    public final int f55651f;

    /* JADX INFO: renamed from: g */
    public View f55652g;

    /* JADX INFO: renamed from: h */
    public CardView f55653h;

    /* JADX INFO: renamed from: i */
    public CommonMkWebView f55654i;

    /* JADX INFO: renamed from: j */
    public View f55655j;

    /* JADX INFO: renamed from: k */
    public Act f55656k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.a$a */
    public class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f55657a;

        public a(BottomSheetBehavior bottomSheetBehavior) {
            this.f55657a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                this.f55657a.setState(3);
            }
        }
    }

    public DialogC13310a(Act act) {
        super(act, zfc0.f204121g);
        this.f55651f = qa00.m175859d(10.0f);
        View viewInflate = LayoutInflater.from(act).inflate(jec0.f120472r, (ViewGroup) null);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.findViewById(ycc0.f198492y).setBackgroundResource(cbc0.f80733G0);
        this.f55656k = act;
        this.f55654i = (CommonMkWebView) viewInflate.findViewById(ycc0.f198478r);
        this.f55655j = viewInflate.findViewById(ycc0.f198476q);
        this.f55653h = (CardView) viewInflate.findViewById(ycc0.f198480s);
        View viewFindViewById = viewInflate.findViewById(ycc0.f198406B);
        this.f55652g = viewFindViewById;
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.ml5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137363a.m81433H(view);
            }
        });
        bnl0.m105509E0(this.f55655j, new View.OnClickListener() { // from class: l.nl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142508a.m81434I(view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ol5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f147810a.m81435J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.pl5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f152995a.m81436K(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m81433H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m81434I(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m81435J(DialogInterface dialogInterface) {
        this.f55654i.m81406p();
        this.f55654i.m81401k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m81436K(DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C2489R.id.design_bottom_sheet));
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new a(bottomSheetBehaviorFrom));
    }

    /* JADX INFO: renamed from: L */
    private void m81437L(final String str) {
        duringCreated(uqb0.f180397c0.accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.ql5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158207a.m81442F(str, (AuthData) obj);
            }
        }, new y20() { // from class: l.rl5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163687a.m81443G(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public void m81441E(String str, CommonH5Builder.BgType bgType) {
        this.f55654i.m81405o(str, bgType);
        this.f55654i.m81408s(ycc0.f198421I0, this);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m81442F(String str, AuthData authData) {
        m81444M(authData.accessToken, str, new HashMap());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m81443G(String str, Throwable th) {
        m81444M("", str, new HashMap());
    }

    /* JADX INFO: renamed from: M */
    public void m81444M(String str, String str2, Map<String, String> map) {
        this.f55654i.m81400j((PutongAct) this.f55656k, str, str2, map);
    }

    /* JADX INFO: renamed from: N */
    public final void m81445N(CommonH5Builder commonH5Builder) {
        String str = commonH5Builder.f55614b;
        m81441E(str, commonH5Builder.f55616d);
        if (commonH5Builder.f55618f != 0 && commonH5Builder.f55619g != 0) {
            m81446O(commonH5Builder);
        }
        if (commonH5Builder.f55617e != 80) {
            getWindow().setWindowAnimations(zfc0.f204115a);
        }
        this.f55654i.setWebViewBg(commonH5Builder.f55616d);
        bnl0.m105524M(this.f55655j, commonH5Builder.f55615c);
        boolean z = commonH5Builder.f55621i;
        View view = this.f55652g;
        if (z) {
            view.setBackgroundColor(Color.parseColor("#4c000000"));
        } else {
            view.setBackground(null);
        }
        m81447P(commonH5Builder);
        m81437L(str);
        show();
    }

    /* JADX INFO: renamed from: O */
    public void m81446O(CommonH5Builder commonH5Builder) {
        int i = commonH5Builder.f55618f;
        int i2 = commonH5Builder.f55619g;
        boolean z = commonH5Builder.f55617e == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f55653h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        if (commonH5Builder.f55622j) {
            layoutParams.height = -1;
            if (commonH5Builder.f55613a) {
                layoutParams.topMargin = bnl0.m105511F0();
            }
        } else {
            layoutParams.height = i2;
        }
        layoutParams.width = i;
        layoutParams.bottomMargin = z ? -this.f55651f : 0;
        layoutParams.gravity = commonH5Builder.f55617e | 1;
        this.f55653h.setLayoutParams(layoutParams);
        this.f55653h.setContentPadding(0, 0, 0, z ? this.f55651f : 0);
        int iM175859d = qa00.m175859d(commonH5Builder.f55620h);
        CardView cardView = this.f55653h;
        if (z) {
            qnp0.m177260c1(cardView, 0, 0, 0, -iM175859d, iM175859d);
        } else {
            qnp0.m177261d1(cardView, iM175859d);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m81447P(CommonH5Builder commonH5Builder) {
        this.f55654i.m81407r(this, "tantan_dialog", commonH5Builder);
    }

    /* JADX INFO: renamed from: Q */
    public void m81448Q(String str) {
        m81445N(new CommonH5Builder(str));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        m81444M("", "about:blank", null);
    }
}

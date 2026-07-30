package com.p046p1.mobile.putong.p065ui.webview.p068mk;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.google.android.material.C2466R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import p149l.e30;
import p149l.e6c0;
import p149l.l5j0;
import p149l.mep0;
import p149l.mkd0;
import p149l.qib0;
import p149l.s4c0;
import p149l.t100;
import p149l.u7c0;
import p149l.w2c0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.a */
/* JADX INFO: loaded from: classes11.dex */
public class DialogC13147a extends l5j0 {

    /* JADX INFO: renamed from: f */
    public final int f54803f;

    /* JADX INFO: renamed from: g */
    public View f54804g;

    /* JADX INFO: renamed from: h */
    public CardView f54805h;

    /* JADX INFO: renamed from: i */
    public CommonMkWebView f54806i;

    /* JADX INFO: renamed from: j */
    public View f54807j;

    /* JADX INFO: renamed from: k */
    public Act f54808k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.a$a */
    public class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f54809a;

        public a(BottomSheetBehavior bottomSheetBehavior) {
            this.f54809a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                this.f54809a.setState(3);
            }
        }
    }

    public DialogC13147a(Act act) {
        super(act, u7c0.f174989g);
        this.f54803f = t100.m186890d(10.0f);
        View viewInflate = LayoutInflater.from(act).inflate(e6c0.f89559r, (ViewGroup) null);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.findViewById(s4c0.f162371y).setBackgroundResource(w2c0.f184137G0);
        this.f54808k = act;
        this.f54806i = (CommonMkWebView) viewInflate.findViewById(s4c0.f162357r);
        this.f54807j = viewInflate.findViewById(s4c0.f162355q);
        this.f54805h = (CardView) viewInflate.findViewById(s4c0.f162359s);
        View viewFindViewById = viewInflate.findViewById(s4c0.f162285B);
        this.f54804g = viewFindViewById;
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.lk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128447a.m80250H(view);
            }
        });
        xdl0.m208329E0(this.f54807j, new View.OnClickListener() { // from class: l.mk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134284a.m80251I(view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nk5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f139376a.m80252J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.ok5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f144397a.m80253K(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m80250H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m80251I(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m80252J(DialogInterface dialogInterface) {
        this.f54806i.m80223p();
        this.f54806i.m80218k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m80253K(DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C2466R.id.design_bottom_sheet));
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new a(bottomSheetBehaviorFrom));
    }

    /* JADX INFO: renamed from: L */
    private void m80254L(final String str) {
        duringCreated(qib0.f154714c0.accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.pk5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149934a.m80259F(str, (AuthData) obj);
            }
        }, new e30() { // from class: l.qk5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155069a.m80260G(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public void m80258E(String str, CommonH5Builder.BgType bgType) {
        this.f54806i.m80222o(str, bgType);
        this.f54806i.m80225s(s4c0.f162300I0, this);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m80259F(String str, AuthData authData) {
        m80261M(authData.accessToken, str, new HashMap());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m80260G(String str, Throwable th) {
        m80261M("", str, new HashMap());
    }

    /* JADX INFO: renamed from: M */
    public void m80261M(String str, String str2, Map<String, String> map) {
        this.f54806i.m80217j((PutongAct) this.f54808k, str, str2, map);
    }

    /* JADX INFO: renamed from: N */
    public final void m80262N(CommonH5Builder commonH5Builder) {
        String str = commonH5Builder.f54766b;
        m80258E(str, commonH5Builder.f54768d);
        if (commonH5Builder.f54770f != 0 && commonH5Builder.f54771g != 0) {
            m80263O(commonH5Builder);
        }
        if (commonH5Builder.f54769e != 80) {
            getWindow().setWindowAnimations(u7c0.f174983a);
        }
        this.f54806i.setWebViewBg(commonH5Builder.f54768d);
        xdl0.m208344M(this.f54807j, commonH5Builder.f54767c);
        boolean z = commonH5Builder.f54773i;
        View view = this.f54804g;
        if (z) {
            view.setBackgroundColor(Color.parseColor("#4c000000"));
        } else {
            view.setBackground(null);
        }
        m80264P(commonH5Builder);
        m80254L(str);
        show();
    }

    /* JADX INFO: renamed from: O */
    public void m80263O(CommonH5Builder commonH5Builder) {
        int i = commonH5Builder.f54770f;
        int i2 = commonH5Builder.f54771g;
        boolean z = commonH5Builder.f54769e == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54805h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        if (commonH5Builder.f54774j) {
            layoutParams.height = -1;
            if (commonH5Builder.f54765a) {
                layoutParams.topMargin = xdl0.m208331F0();
            }
        } else {
            layoutParams.height = i2;
        }
        layoutParams.width = i;
        layoutParams.bottomMargin = z ? -this.f54803f : 0;
        layoutParams.gravity = commonH5Builder.f54769e | 1;
        this.f54805h.setLayoutParams(layoutParams);
        this.f54805h.setContentPadding(0, 0, 0, z ? this.f54803f : 0);
        int iM186890d = t100.m186890d(commonH5Builder.f54772h);
        CardView cardView = this.f54805h;
        if (z) {
            mep0.m154301c1(cardView, 0, 0, 0, -iM186890d, iM186890d);
        } else {
            mep0.m154302d1(cardView, iM186890d);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m80264P(CommonH5Builder commonH5Builder) {
        this.f54806i.m80224r(this, "tantan_dialog", commonH5Builder);
    }

    /* JADX INFO: renamed from: Q */
    public void m80265Q(String str) {
        m80262N(new CommonH5Builder(str));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        m80261M("", "about:blank", null);
    }
}

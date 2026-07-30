package com.p000p1.mobile.putong.p004ui.webview.p007mk;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import l.e30;
import l.e6c0;
import l.l5j0;
import l.mep0;
import l.mkd0;
import l.qib0;
import l.s4c0;
import l.t100;
import l.u7c0;
import l.w2c0;
import l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0549a extends l5j0 {

    /* JADX INFO: renamed from: f */
    public final int f8409f;

    /* JADX INFO: renamed from: g */
    public View f8410g;

    /* JADX INFO: renamed from: h */
    public CardView f8411h;

    /* JADX INFO: renamed from: i */
    public CommonMkWebView f8412i;

    /* JADX INFO: renamed from: j */
    public View f8413j;

    /* JADX INFO: renamed from: k */
    public Act f8414k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.a$a */
    public class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f8415a;

        public a(BottomSheetBehavior bottomSheetBehavior) {
            this.f8415a = bottomSheetBehavior;
        }

        public void onSlide(@NonNull View view, float f) {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                this.f8415a.setState(3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0549a(Act act) {
        super(act, u7c0.g);
        this.f8409f = t100.d(10.0f);
        View viewInflate = LayoutInflater.from(act).inflate(e6c0.r, (ViewGroup) null);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.findViewById(s4c0.y).setBackgroundResource(w2c0.G0);
        this.f8414k = act;
        this.f8412i = (CommonMkWebView) viewInflate.findViewById(s4c0.r);
        this.f8413j = viewInflate.findViewById(s4c0.q);
        this.f8411h = viewInflate.findViewById(s4c0.s);
        View viewFindViewById = viewInflate.findViewById(s4c0.B);
        this.f8410g = viewFindViewById;
        xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.lk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16204a.m10601H(view);
            }
        });
        xdl0.E0(this.f8413j, new View.OnClickListener() { // from class: l.mk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16984a.m10602I(view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nk5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f17552a.m10603J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.ok5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f18128a.m10604K(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m10601H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m10602I(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m10603J(DialogInterface dialogInterface) {
        this.f8412i.m10561p();
        this.f8412i.m10556k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m10604K(DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(R.id.design_bottom_sheet));
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new a(bottomSheetBehaviorFrom));
    }

    /* JADX INFO: renamed from: L */
    private void m10605L(final String str) {
        duringCreated(qib0.c0.accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.pk5
            public final void call(Object obj) {
                this.f18763a.m10610F(str, (AuthData) obj);
            }
        }, new e30() { // from class: l.qk5
            public final void call(Object obj) {
                this.f19366a.m10611G(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public void m10609E(String str, CommonH5Builder.BgType bgType) {
        this.f8412i.m10560o(str, bgType);
        this.f8412i.m10563s(s4c0.I0, this);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m10610F(String str, AuthData authData) {
        m10612M(authData.accessToken, str, new HashMap());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10611G(String str, Throwable th) {
        m10612M("", str, new HashMap());
    }

    /* JADX INFO: renamed from: M */
    public void m10612M(String str, String str2, Map<String, String> map) {
        this.f8412i.m10555j((PutongAct) this.f8414k, str, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final void m10613N(CommonH5Builder commonH5Builder) {
        String str = commonH5Builder.f8372b;
        m10609E(str, commonH5Builder.f8374d);
        if (commonH5Builder.f8376f != 0 && commonH5Builder.f8377g != 0) {
            m10614O(commonH5Builder);
        }
        if (commonH5Builder.f8375e != 80) {
            getWindow().setWindowAnimations(u7c0.a);
        }
        this.f8412i.setWebViewBg(commonH5Builder.f8374d);
        xdl0.M(this.f8413j, commonH5Builder.f8373c);
        boolean z = commonH5Builder.f8379i;
        View view = this.f8410g;
        if (z) {
            view.setBackgroundColor(Color.parseColor("#4c000000"));
        } else {
            view.setBackground(null);
        }
        m10615P(commonH5Builder);
        m10605L(str);
        show();
    }

    /* JADX INFO: renamed from: O */
    public void m10614O(CommonH5Builder commonH5Builder) {
        int i = commonH5Builder.f8376f;
        int i2 = commonH5Builder.f8377g;
        boolean z = commonH5Builder.f8375e == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8411h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        if (commonH5Builder.f8380j) {
            layoutParams.height = -1;
            if (commonH5Builder.f8371a) {
                layoutParams.topMargin = xdl0.F0();
            }
        } else {
            layoutParams.height = i2;
        }
        layoutParams.width = i;
        layoutParams.bottomMargin = z ? -this.f8409f : 0;
        layoutParams.gravity = commonH5Builder.f8375e | 1;
        this.f8411h.setLayoutParams(layoutParams);
        this.f8411h.setContentPadding(0, 0, 0, z ? this.f8409f : 0);
        int iD = t100.d(commonH5Builder.f8378h);
        CardView cardView = this.f8411h;
        if (z) {
            mep0.c1(cardView, 0, 0, 0, -iD, iD);
        } else {
            mep0.d1(cardView, iD);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m10615P(CommonH5Builder commonH5Builder) {
        this.f8412i.m10562r(this, "tantan_dialog", commonH5Builder);
    }

    /* JADX INFO: renamed from: Q */
    public void m10616Q(String str) {
        m10613N(new CommonH5Builder(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*android.app.Dialog*/.onBackPressed();
        m10612M("", "about:blank", null);
    }
}

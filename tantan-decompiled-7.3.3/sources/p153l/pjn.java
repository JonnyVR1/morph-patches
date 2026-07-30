package p153l;

import android.content.DialogInterface;
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
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class pjn extends pej0 {

    /* JADX INFO: renamed from: f */
    public final int f152716f;

    /* JADX INFO: renamed from: g */
    public View f152717g;

    /* JADX INFO: renamed from: h */
    public CardView f152718h;

    /* JADX INFO: renamed from: i */
    public LiveMkWebView f152719i;

    /* JADX INFO: renamed from: j */
    public View f152720j;

    /* JADX INFO: renamed from: k */
    public Act f152721k;

    public pjn(Act act) {
        super(act, hgc0.f109385b);
        this.f152716f = qa00.m175859d(10.0f);
        setContentView(LayoutInflater.from(act).inflate(xec0.f193884k2, (ViewGroup) null));
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.findViewById(ldc0.f131519Y).setBackgroundResource(nbc0.f141096D1);
        this.f152721k = act;
        View viewFindViewById = findViewById(ldc0.f131607u1);
        this.f152719i = (LiveMkWebView) viewFindViewById.findViewById(ldc0.f131467I0);
        this.f152720j = viewFindViewById.findViewById(ldc0.f131454F);
        this.f152718h = (CardView) viewFindViewById.findViewById(ldc0.f131478L);
        View viewFindViewById2 = viewFindViewById.findViewById(ldc0.f131538d0);
        this.f152717g = viewFindViewById2;
        bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.ljn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132378a.m172508H(view);
            }
        });
        bnl0.m105509E0(this.f152720j, new View.OnClickListener() { // from class: l.mjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137109a.m172509I(view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.njn
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f142322a.m172516J(dialogInterface);
            }
        });
        this.f152719i.setOnCheckIsTextEditorFlag(true);
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.ojn
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f147684a.m172517K(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m172508H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m172509I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: E */
    public void m172513E(boolean z, String str, CommonH5Builder.BgType bgType) {
        this.f152719i.m70059y(z, str, bgType);
        this.f152719i.setOnCheckIsTextEditorFlag(true);
        if (dep.m115449b(str)) {
            lej0.INSTANCE.m153910d("octopus_game_loading");
            this.f152719i.m70054t();
            this.f152719i.m70047m(new dep(this), "app");
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m172514F(String str, AuthData authData) {
        m172519M(authData.accessToken, str, new HashMap());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m172515G(String str, Throwable th) {
        m172519M("", str, new HashMap());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m172516J(DialogInterface dialogInterface) {
        this.f152719i.m70056v();
        this.f152719i.m70050p();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m172517K(DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C2489R.id.design_bottom_sheet));
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new C19379a(bottomSheetBehaviorFrom));
    }

    /* JADX INFO: renamed from: L */
    public final void m172518L(final String str) {
        duringCreated(zrv.f205799a.m207656a()).subscribe(dhw.m115826e(new y20() { // from class: l.jjn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121199a.m172514F(str, (AuthData) obj);
            }
        }, new y20() { // from class: l.kjn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127118a.m172515G(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m172519M(String str, String str2, Map<String, String> map) {
        this.f152719i.m70046l((PutongAct) this.f152721k, str, str2, map);
    }

    /* JADX INFO: renamed from: N */
    public void m172520N(int[] iArr, boolean z, int i, int i2, boolean z2) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z3 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f152718h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        if (z) {
            layoutParams.height = -1;
            if (z2) {
                layoutParams.topMargin = bnl0.m105511F0();
            }
        } else {
            layoutParams.height = i4;
        }
        layoutParams.width = i3;
        layoutParams.bottomMargin = z3 ? -this.f152716f : 0;
        layoutParams.gravity = i | 1;
        this.f152718h.setLayoutParams(layoutParams);
        this.f152718h.setContentPadding(0, 0, 0, z3 ? this.f152716f : 0);
        int iM175859d = qa00.m175859d(i2);
        CardView cardView = this.f152718h;
        if (z3) {
            qnp0.m177260c1(cardView, 0, 0, 0, -iM175859d, iM175859d);
        } else {
            qnp0.m177261d1(cardView, iM175859d);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m172521O(String str, int[] iArr, boolean z, int i, CommonH5Builder.BgType bgType, boolean z2, boolean z3, int i2, boolean z4) {
        m172513E(true, str, bgType);
        if (iArr[0] != 0 && iArr[1] != 0) {
            m172520N(iArr, z, i, i2, z4);
        }
        this.f152719i.setWebViewBg(bgType);
        bnl0.m105524M(this.f152720j, z2);
        View view = this.f152717g;
        if (z3) {
            view.setBackgroundColor(n3d0.m161277a(m9c0.f135382g));
        } else {
            view.setBackground(null);
        }
        m172518L(str);
        show();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        m172519M("", "about:blank", null);
    }

    /* JADX INFO: renamed from: l.pjn$a */
    public class C19379a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f152722a;

        public C19379a(BottomSheetBehavior bottomSheetBehavior) {
            this.f152722a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                this.f152722a.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

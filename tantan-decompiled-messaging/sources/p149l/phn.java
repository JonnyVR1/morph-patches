package p149l;

import android.content.DialogInterface;
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
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class phn extends l5j0 {

    /* JADX INFO: renamed from: f */
    public final int f149020f;

    /* JADX INFO: renamed from: g */
    public View f149021g;

    /* JADX INFO: renamed from: h */
    public CardView f149022h;

    /* JADX INFO: renamed from: i */
    public LiveMkWebView f149023i;

    /* JADX INFO: renamed from: j */
    public View f149024j;

    /* JADX INFO: renamed from: k */
    public Act f149025k;

    public phn(Act act) {
        super(act, c8c0.f79737b);
        this.f149020f = t100.m186890d(10.0f);
        setContentView(LayoutInflater.from(act).inflate(s6c0.f162770k2, (ViewGroup) null));
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.findViewById(f5c0.f95062Y).setBackgroundResource(h3c0.f105605D1);
        this.f149025k = act;
        View viewFindViewById = findViewById(f5c0.f95150u1);
        this.f149023i = (LiveMkWebView) viewFindViewById.findViewById(f5c0.f95010I0);
        this.f149024j = viewFindViewById.findViewById(f5c0.f94997F);
        this.f149022h = (CardView) viewFindViewById.findViewById(f5c0.f95021L);
        View viewFindViewById2 = viewFindViewById.findViewById(f5c0.f95081d0);
        this.f149021g = viewFindViewById2;
        xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.lhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128121a.m169081H(view);
            }
        });
        xdl0.m208329E0(this.f149024j, new View.OnClickListener() { // from class: l.mhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133831a.m169082I(view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nhn
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f139003a.m169089J(dialogInterface);
            }
        });
        this.f149023i.setOnCheckIsTextEditorFlag(true);
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.ohn
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f144027a.m169090K(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m169081H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m169082I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: E */
    public void m169086E(boolean z, String str, CommonH5Builder.BgType bgType) {
        this.f149023i.m68876y(z, str, bgType);
        this.f149023i.setOnCheckIsTextEditorFlag(true);
        if (dcp.m110866b(str)) {
            h5j0.INSTANCE.m129405d("octopus_game_loading");
            this.f149023i.m68871t();
            this.f149023i.m68864m(new dcp(this), "app");
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m169087F(String str, AuthData authData) {
        m169092M(authData.accessToken, str, new HashMap());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m169088G(String str, Throwable th) {
        m169092M("", str, new HashMap());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m169089J(DialogInterface dialogInterface) {
        this.f149023i.m68873v();
        this.f149023i.m68867p();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m169090K(DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C2466R.id.design_bottom_sheet));
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new C19218a(bottomSheetBehaviorFrom));
    }

    /* JADX INFO: renamed from: L */
    public final void m169091L(final String str) {
        duringCreated(ypv.f199493a.m199334a()).subscribe(ffw.m121194e(new e30() { // from class: l.jhn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117962a.m169087F(str, (AuthData) obj);
            }
        }, new e30() { // from class: l.khn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123191a.m169088G(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m169092M(String str, String str2, Map<String, String> map) {
        this.f149023i.m68863l((PutongAct) this.f149025k, str, str2, map);
    }

    /* JADX INFO: renamed from: N */
    public void m169093N(int[] iArr, boolean z, int i, int i2, boolean z2) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z3 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149022h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        if (z) {
            layoutParams.height = -1;
            if (z2) {
                layoutParams.topMargin = xdl0.m208331F0();
            }
        } else {
            layoutParams.height = i4;
        }
        layoutParams.width = i3;
        layoutParams.bottomMargin = z3 ? -this.f149020f : 0;
        layoutParams.gravity = i | 1;
        this.f149022h.setLayoutParams(layoutParams);
        this.f149022h.setContentPadding(0, 0, 0, z3 ? this.f149020f : 0);
        int iM186890d = t100.m186890d(i2);
        CardView cardView = this.f149022h;
        if (z3) {
            mep0.m154301c1(cardView, 0, 0, 0, -iM186890d, iM186890d);
        } else {
            mep0.m154302d1(cardView, iM186890d);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m169094O(String str, int[] iArr, boolean z, int i, CommonH5Builder.BgType bgType, boolean z2, boolean z3, int i2, boolean z4) {
        m169086E(true, str, bgType);
        if (iArr[0] != 0 && iArr[1] != 0) {
            m169093N(iArr, z, i, i2, z4);
        }
        this.f149023i.setWebViewBg(bgType);
        xdl0.m208344M(this.f149024j, z2);
        View view = this.f149021g;
        if (z3) {
            view.setBackgroundColor(kvc0.m147352a(g1c0.f100152g));
        } else {
            view.setBackground(null);
        }
        m169091L(str);
        show();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        m169092M("", "about:blank", null);
    }

    /* JADX INFO: renamed from: l.phn$a */
    public class C19218a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f149026a;

        public C19218a(BottomSheetBehavior bottomSheetBehavior) {
            this.f149026a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                this.f149026a.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

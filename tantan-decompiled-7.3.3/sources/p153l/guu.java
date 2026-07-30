package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.mmsdk.player.C12622a;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class guu implements iam<vuu> {

    /* JADX INFO: renamed from: a */
    public VFrame f106578a;

    /* JADX INFO: renamed from: b */
    public View f106579b;

    /* JADX INFO: renamed from: c */
    public CardView f106580c;

    /* JADX INFO: renamed from: d */
    public LiveMkWebView f106581d;

    /* JADX INFO: renamed from: e */
    public VImage f106582e;

    /* JADX INFO: renamed from: f */
    public vuu f106583f;

    /* JADX INFO: renamed from: g */
    public DialogC12774a f106584g;

    /* JADX INFO: renamed from: h */
    public String f106585h;

    /* JADX INFO: renamed from: i */
    public int f106586i = 17;

    /* JADX INFO: renamed from: j */
    public final int f106587j = qa00.m175859d(10.0f);

    /* JADX INFO: renamed from: f */
    public static void m132392f(guu guuVar) {
        guuVar.f106578a = null;
        guuVar.f106579b = null;
        guuVar.f106580c = null;
        guuVar.f106581d = null;
        guuVar.f106582e = null;
    }

    /* JADX INFO: renamed from: k */
    private void m132393k() {
        DialogC12774a dialogC12774a = this.f106584g;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f106581d.m70056v();
        this.f106584g.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m132394s(View view) {
        m132393k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m132395u() {
        m132413z("about:blank", null);
    }

    /* JADX INFO: renamed from: A */
    public final void m132396A(String str) {
        Uri uri = Uri.parse(str);
        this.f106585h = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
    }

    /* JADX INFO: renamed from: B */
    public void m132397B(int[] iArr, boolean z, int i, int i2) {
        DialogC12774a dialogC12774a = this.f106584g;
        if (dialogC12774a != null) {
            dialogC12774a.m72956e0(i);
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z2 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f106580c.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        if (z) {
            layoutParams.height = -1;
        } else {
            layoutParams.height = i4;
        }
        layoutParams.width = i3;
        layoutParams.bottomMargin = z2 ? -this.f106587j : 0;
        layoutParams.gravity = i | 1;
        this.f106580c.setLayoutParams(layoutParams);
        this.f106580c.setContentPadding(0, 0, 0, z2 ? this.f106587j : 0);
        int iM175859d = qa00.m175859d(i2);
        CardView cardView = this.f106580c;
        if (z2) {
            qnp0.m177260c1(cardView, 0, 0, 0, -iM175859d, iM175859d);
        } else {
            qnp0.m177261d1(cardView, iM175859d);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m132398C() {
        ViewGroup.LayoutParams layoutParams = this.f106580c.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            int i = ((FrameLayout.LayoutParams) layoutParams).gravity;
            this.f106586i = i;
            this.f106584g.m72954c0(i == 17 ? jgc0.f120699f : jgc0.f120701h);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f106583f.act();
    }

    /* JADX INFO: renamed from: E */
    public void m132399E() {
        this.f106582e.setVisibility(8);
        this.f106581d.setWebViewMarginTop(0);
    }

    /* JADX INFO: renamed from: F */
    public void m132400F(String str, boolean z, boolean z2, final x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f106581d.m70060z(mdc0.f136166e8, this.f106584g);
        m132398C();
        m132396A(str);
        this.f106584g.show();
        this.f106584g.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cuu
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f83899a.m132410w(x20Var, dialogInterface);
            }
        });
        bnl0.m105524M(this.f106582e, z);
        View view = this.f106579b;
        if (z2) {
            view.setBackgroundColor(zrv.f205803e.getResources().getColor(n9c0.f140783N));
        } else {
            view.setBackground(null);
        }
    }

    @Override // p153l.iam
    public Act act() {
        return this.f106583f.act();
    }

    @Override // p153l.iam
    public void destroy() {
        DialogC12774a dialogC12774a = this.f106584g;
        if (dialogC12774a != null && dialogC12774a.isShowing()) {
            this.f106584g.dismiss();
        }
        LiveMkWebView liveMkWebView = this.f106581d;
        if (liveMkWebView != null) {
            liveMkWebView.m70044B();
            this.f106581d.m70056v();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m132401e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wuu.m207977b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vuu vuuVar) {
        this.f106583f = vuuVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        DialogC12774a dialogC12774a = this.f106584g;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m132403j() {
        m132393k();
    }

    /* JADX INFO: renamed from: l */
    public int m132404l() {
        LiveMkWebView liveMkWebView = this.f106581d;
        if (liveMkWebView != null) {
            return liveMkWebView.getWebViewHashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public void m132405m(boolean z, String str, CommonH5Builder.BgType bgType) {
        m132406n(z, str, bgType);
    }

    /* JADX INFO: renamed from: n */
    public void m132406n(boolean z, String str, CommonH5Builder.BgType bgType) {
        Act act = act();
        if (act == null) {
            return;
        }
        this.f106584g = new DialogC12774a(act, m132401e(act.inflater(), null));
        this.f106581d.m70059y(z, str, bgType);
        this.f106584g.m72961j0(LiveDialogEnum.WEBVIEW);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.duu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90861a.m132394s(view);
            }
        };
        bnl0.m105509E0(this.f106579b, onClickListener);
        bnl0.m105509E0(this.f106582e, onClickListener);
        this.f106581d.setOnCheckIsTextEditorFlag(true);
        this.f106584g.m72957f0(new DialogC12774a.c() { // from class: l.euu
            @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a.c
            /* JADX INFO: renamed from: o */
            public final void mo72967o() {
                this.f95968a.m132395u();
            }
        });
        this.f106584g.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.fuu
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f100947a.m132409v(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m132407p(CommonH5Builder.BgType bgType) {
        this.f106581d.setWebViewBg(bgType);
    }

    /* JADX INFO: renamed from: q */
    public boolean m132408q(String str) {
        if (TextUtils.equals(str, this.f106585h)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f106585h);
        sb.append("?");
        return TextUtils.equals(str, sb.toString());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m132409v(DialogInterface dialogInterface) {
        if (this.f106586i == 17) {
            this.f106583f.m202935z3();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m132410w(x20 x20Var, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        this.f106581d.m70056v();
        this.f106581d.m70050p();
        this.f106583f.m202934y3();
        m132392f(this);
        C12622a.m69707b().m69710e(act());
        this.f106583f = null;
        this.f106584g = null;
    }

    /* JADX INFO: renamed from: x */
    public void m132411x(String str) {
        LiveMkWebView liveMkWebView = this.f106581d;
        if (liveMkWebView != null) {
            liveMkWebView.m70057w(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m132412y(String str, String str2, Map<String, String> map) {
        if (this.f106583f == null) {
            return;
        }
        this.f106581d.m70046l((PutongAct) act(), str, str2, map);
    }

    /* JADX INFO: renamed from: z */
    public void m132413z(String str, Map<String, String> map) {
        this.f106581d.m70058x(str, map);
    }
}

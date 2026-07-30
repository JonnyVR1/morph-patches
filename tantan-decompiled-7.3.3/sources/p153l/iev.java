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

/* JADX INFO: loaded from: classes4.dex */
public class iev implements iam<cfv> {

    /* JADX INFO: renamed from: a */
    public VFrame f114619a;

    /* JADX INFO: renamed from: b */
    public View f114620b;

    /* JADX INFO: renamed from: c */
    public CardView f114621c;

    /* JADX INFO: renamed from: d */
    public LiveMkWebView f114622d;

    /* JADX INFO: renamed from: e */
    public VImage f114623e;

    /* JADX INFO: renamed from: f */
    public cfv f114624f;

    /* JADX INFO: renamed from: g */
    public DialogC12774a f114625g;

    /* JADX INFO: renamed from: h */
    public String f114626h;

    /* JADX INFO: renamed from: i */
    public int f114627i = 17;

    /* JADX INFO: renamed from: j */
    public final int f114628j = qa00.m175859d(10.0f);

    /* JADX INFO: renamed from: A */
    private void m139649A(String str) {
        Uri uri = Uri.parse(str);
        this.f114626h = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
    }

    /* JADX INFO: renamed from: C */
    private void m139650C() {
        ViewGroup.LayoutParams layoutParams = this.f114621c.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            int i = ((FrameLayout.LayoutParams) layoutParams).gravity;
            this.f114627i = i;
            this.f114625g.m72954c0(i == 17 ? jgc0.f120699f : jgc0.f120701h);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m139655f(iev ievVar) {
        ievVar.f114619a = null;
        ievVar.f114620b = null;
        ievVar.f114621c = null;
        ievVar.f114622d = null;
        ievVar.f114623e = null;
    }

    /* JADX INFO: renamed from: k */
    private void m139656k() {
        DialogC12774a dialogC12774a = this.f114625g;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f114622d.m70056v();
        this.f114625g.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m139657s(View view) {
        m139656k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m139658u() {
        m139674z("about:blank", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m139659v(DialogInterface dialogInterface) {
        if (this.f114627i == 17) {
            this.f114624f.m109635C4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m139660w(x20 x20Var, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        this.f114622d.m70056v();
        this.f114622d.m70050p();
        this.f114624f.m109634B4();
        m139655f(this);
        C12622a.m69707b().m69710e(act());
        this.f114624f = null;
        this.f114625g = null;
    }

    /* JADX INFO: renamed from: B */
    public void m139661B(int[] iArr, boolean z, int i, int i2, boolean z2) {
        DialogC12774a dialogC12774a = this.f114625g;
        if (dialogC12774a != null) {
            dialogC12774a.m72956e0(i);
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z3 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f114621c.getLayoutParams();
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
        layoutParams.bottomMargin = z3 ? -this.f114628j : 0;
        layoutParams.gravity = i | 1;
        this.f114621c.setLayoutParams(layoutParams);
        this.f114621c.setContentPadding(0, 0, 0, z3 ? this.f114628j : 0);
        int iM175859d = qa00.m175859d(i2);
        CardView cardView = this.f114621c;
        if (z3) {
            qnp0.m177260c1(cardView, 0, 0, 0, -iM175859d, iM175859d);
        } else {
            qnp0.m177261d1(cardView, iM175859d);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f114624f.act();
    }

    /* JADX INFO: renamed from: E */
    public void m139662E() {
        this.f114623e.setVisibility(8);
        this.f114622d.setWebViewMarginTop(0);
    }

    /* JADX INFO: renamed from: F */
    public void m139663F(String str, boolean z, boolean z2, final x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f114622d.m70060z(mdc0.f136166e8, this.f114625g);
        m139650C();
        m139649A(str);
        this.f114625g.show();
        this.f114625g.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.eev
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f93671a.m139660w(x20Var, dialogInterface);
            }
        });
        bnl0.m105524M(this.f114623e, z);
        View view = this.f114620b;
        if (z2) {
            view.setBackgroundColor(zrv.f205803e.getResources().getColor(n9c0.f140783N));
        } else {
            view.setBackground(null);
        }
    }

    @Override // p153l.iam
    public Act act() {
        return this.f114624f.act();
    }

    @Override // p153l.iam
    public void destroy() {
        DialogC12774a dialogC12774a = this.f114625g;
        if (dialogC12774a != null && dialogC12774a.isShowing()) {
            this.f114625g.dismiss();
        }
        LiveMkWebView liveMkWebView = this.f114622d;
        if (liveMkWebView != null) {
            liveMkWebView.m70044B();
            this.f114622d.m70056v();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m139664e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dfv.m115548b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cfv cfvVar) {
        this.f114624f = cfvVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        DialogC12774a dialogC12774a = this.f114625g;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m139666j() {
        m139656k();
    }

    /* JADX INFO: renamed from: l */
    public int m139667l() {
        LiveMkWebView liveMkWebView = this.f114622d;
        if (liveMkWebView != null) {
            return liveMkWebView.getWebViewHashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public void m139668m(boolean z, String str, CommonH5Builder.BgType bgType) {
        m139669n(z, str, bgType);
    }

    /* JADX INFO: renamed from: n */
    public void m139669n(boolean z, String str, CommonH5Builder.BgType bgType) {
        if (act() == null) {
            return;
        }
        this.f114625g = new DialogC12774a(this.f114624f, m139664e(act().inflater(), null), 17);
        this.f114622d.m70059y(z, str, bgType);
        this.f114625g.m72961j0(LiveDialogEnum.WEBVIEW);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.fev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98716a.m139657s(view);
            }
        };
        bnl0.m105509E0(this.f114620b, onClickListener);
        bnl0.m105509E0(this.f114623e, onClickListener);
        this.f114622d.setOnCheckIsTextEditorFlag(true);
        this.f114625g.m72957f0(new DialogC12774a.c() { // from class: l.gev
            @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a.c
            /* JADX INFO: renamed from: o */
            public final void mo72967o() {
                this.f103858a.m139658u();
            }
        });
        this.f114625g.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.hev
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f109188a.m139659v(dialogInterface);
            }
        });
        if (aro.m99761a(str)) {
            lej0.INSTANCE.m153910d("octopus_game_loading");
            this.f114622d.m70054t();
            this.f114622d.m70047m(new aro(), "app");
        }
    }

    /* JADX INFO: renamed from: p */
    public void m139670p(CommonH5Builder.BgType bgType) {
        this.f114622d.setWebViewBg(bgType);
    }

    /* JADX INFO: renamed from: q */
    public boolean m139671q(String str) {
        if (TextUtils.equals(str, this.f114626h)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f114626h);
        sb.append("?");
        return TextUtils.equals(str, sb.toString());
    }

    /* JADX INFO: renamed from: x */
    public void m139672x(String str) {
        LiveMkWebView liveMkWebView = this.f114622d;
        if (liveMkWebView != null) {
            liveMkWebView.m70057w(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m139673y(String str, String str2, Map<String, String> map) {
        if (this.f114624f == null) {
            return;
        }
        this.f114622d.m70046l((PutongAct) act(), str, str2, map);
    }

    /* JADX INFO: renamed from: z */
    public void m139674z(String str, Map<String, String> map) {
        this.f114622d.m70058x(str, map);
    }
}

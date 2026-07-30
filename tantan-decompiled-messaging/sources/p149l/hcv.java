package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.mmsdk.player.C12459a;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class hcv implements s7m<bdv> {

    /* JADX INFO: renamed from: a */
    public VFrame f107098a;

    /* JADX INFO: renamed from: b */
    public View f107099b;

    /* JADX INFO: renamed from: c */
    public CardView f107100c;

    /* JADX INFO: renamed from: d */
    public LiveMkWebView f107101d;

    /* JADX INFO: renamed from: e */
    public VImage f107102e;

    /* JADX INFO: renamed from: f */
    public bdv f107103f;

    /* JADX INFO: renamed from: g */
    public DialogC12611a f107104g;

    /* JADX INFO: renamed from: h */
    public String f107105h;

    /* JADX INFO: renamed from: i */
    public int f107106i = 17;

    /* JADX INFO: renamed from: j */
    public final int f107107j = t100.m186890d(10.0f);

    /* JADX INFO: renamed from: A */
    private void m130494A(String str) {
        Uri uri = Uri.parse(str);
        this.f107105h = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
    }

    /* JADX INFO: renamed from: C */
    private void m130495C() {
        ViewGroup.LayoutParams layoutParams = this.f107100c.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            int i = ((FrameLayout.LayoutParams) layoutParams).gravity;
            this.f107106i = i;
            this.f107104g.m71771c0(i == 17 ? d8c0.f84851f : d8c0.f84853h);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m130500f(hcv hcvVar) {
        hcvVar.f107098a = null;
        hcvVar.f107099b = null;
        hcvVar.f107100c = null;
        hcvVar.f107101d = null;
        hcvVar.f107102e = null;
    }

    /* JADX INFO: renamed from: k */
    private void m130501k() {
        DialogC12611a dialogC12611a = this.f107104g;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f107101d.m68873v();
        this.f107104g.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m130502s(View view) {
        m130501k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m130503u() {
        m130519z("about:blank", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m130504v(DialogInterface dialogInterface) {
        if (this.f107106i == 17) {
            this.f107103f.m101272C4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m130505w(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        this.f107101d.m68873v();
        this.f107101d.m68867p();
        this.f107103f.m101271B4();
        m130500f(this);
        C12459a.m68524b().m68527e(act());
        this.f107103f = null;
        this.f107104g = null;
    }

    /* JADX INFO: renamed from: B */
    public void m130506B(int[] iArr, boolean z, int i, int i2, boolean z2) {
        DialogC12611a dialogC12611a = this.f107104g;
        if (dialogC12611a != null) {
            dialogC12611a.m71773e0(i);
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z3 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f107100c.getLayoutParams();
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
        layoutParams.bottomMargin = z3 ? -this.f107107j : 0;
        layoutParams.gravity = i | 1;
        this.f107100c.setLayoutParams(layoutParams);
        this.f107100c.setContentPadding(0, 0, 0, z3 ? this.f107107j : 0);
        int iM186890d = t100.m186890d(i2);
        CardView cardView = this.f107100c;
        if (z3) {
            mep0.m154301c1(cardView, 0, 0, 0, -iM186890d, iM186890d);
        } else {
            mep0.m154302d1(cardView, iM186890d);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f107103f.act();
    }

    /* JADX INFO: renamed from: E */
    public void m130507E() {
        this.f107102e.setVisibility(8);
        this.f107101d.setWebViewMarginTop(0);
    }

    /* JADX INFO: renamed from: F */
    public void m130508F(String str, boolean z, boolean z2, final d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f107101d.m68877z(g5c0.f100921e8, this.f107104g);
        m130495C();
        m130494A(str);
        this.f107104g.show();
        this.f107104g.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dcv
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f85509a.m130505w(d30Var, dialogInterface);
            }
        });
        xdl0.m208344M(this.f107102e, z);
        View view = this.f107099b;
        if (z2) {
            view.setBackgroundColor(ypv.f199497e.getResources().getColor(h1c0.f105322N));
        } else {
            view.setBackground(null);
        }
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f107103f.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        DialogC12611a dialogC12611a = this.f107104g;
        if (dialogC12611a != null && dialogC12611a.isShowing()) {
            this.f107104g.dismiss();
        }
        LiveMkWebView liveMkWebView = this.f107101d;
        if (liveMkWebView != null) {
            liveMkWebView.m68861B();
            this.f107101d.m68873v();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m130509e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cdv.m106295b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bdv bdvVar) {
        this.f107103f = bdvVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        DialogC12611a dialogC12611a = this.f107104g;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m130511j() {
        m130501k();
    }

    /* JADX INFO: renamed from: l */
    public int m130512l() {
        LiveMkWebView liveMkWebView = this.f107101d;
        if (liveMkWebView != null) {
            return liveMkWebView.getWebViewHashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public void m130513m(boolean z, String str, CommonH5Builder.BgType bgType) {
        m130514n(z, str, bgType);
    }

    /* JADX INFO: renamed from: n */
    public void m130514n(boolean z, String str, CommonH5Builder.BgType bgType) {
        if (act() == null) {
            return;
        }
        this.f107104g = new DialogC12611a(this.f107103f, m130509e(act().inflater(), null), 17);
        this.f107101d.m68876y(z, str, bgType);
        this.f107104g.m71778j0(LiveDialogEnum.WEBVIEW);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ecv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90569a.m130502s(view);
            }
        };
        xdl0.m208329E0(this.f107099b, onClickListener);
        xdl0.m208329E0(this.f107102e, onClickListener);
        this.f107101d.setOnCheckIsTextEditorFlag(true);
        this.f107104g.m71774f0(new DialogC12611a.c() { // from class: l.fcv
            @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a.c
            /* JADX INFO: renamed from: o */
            public final void mo71784o() {
                this.f96853a.m130503u();
            }
        });
        this.f107104g.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.gcv
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f102056a.m130504v(dialogInterface);
            }
        });
        if (apo.m98164a(str)) {
            h5j0.INSTANCE.m129405d("octopus_game_loading");
            this.f107101d.m68871t();
            this.f107101d.m68864m(new apo(), "app");
        }
    }

    /* JADX INFO: renamed from: p */
    public void m130515p(CommonH5Builder.BgType bgType) {
        this.f107101d.setWebViewBg(bgType);
    }

    /* JADX INFO: renamed from: q */
    public boolean m130516q(String str) {
        if (TextUtils.equals(str, this.f107105h)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f107105h);
        sb.append("?");
        return TextUtils.equals(str, sb.toString());
    }

    /* JADX INFO: renamed from: x */
    public void m130517x(String str) {
        LiveMkWebView liveMkWebView = this.f107101d;
        if (liveMkWebView != null) {
            liveMkWebView.m68874w(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m130518y(String str, String str2, Map<String, String> map) {
        if (this.f107103f == null) {
            return;
        }
        this.f107101d.m68863l((PutongAct) act(), str, str2, map);
    }

    /* JADX INFO: renamed from: z */
    public void m130519z(String str, Map<String, String> map) {
        this.f107101d.m68875x(str, map);
    }
}

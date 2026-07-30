package p002l;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.a;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.d30;
import l.h5j0;
import l.mep0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.ypv;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hcv implements s7m<bdv> {

    /* JADX INFO: renamed from: a */
    public VFrame f11975a;

    /* JADX INFO: renamed from: b */
    public View f11976b;

    /* JADX INFO: renamed from: c */
    public CardView f11977c;

    /* JADX INFO: renamed from: d */
    public LiveMkWebView f11978d;

    /* JADX INFO: renamed from: e */
    public VImage f11979e;

    /* JADX INFO: renamed from: f */
    public bdv f11980f;

    /* JADX INFO: renamed from: g */
    public C0200a f11981g;

    /* JADX INFO: renamed from: h */
    public String f11982h;

    /* JADX INFO: renamed from: i */
    public int f11983i = 17;

    /* JADX INFO: renamed from: j */
    public final int f11984j = t100.d(10.0f);

    /* JADX INFO: renamed from: A */
    private void m14307A(String str) {
        Uri uri = Uri.parse(str);
        this.f11982h = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
    }

    /* JADX INFO: renamed from: C */
    private void m14308C() {
        ViewGroup.LayoutParams layoutParams = this.f11977c.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            int i = ((FrameLayout.LayoutParams) layoutParams).gravity;
            this.f11983i = i;
            this.f11981g.m5139c0(i == 17 ? d8c0.f9101f : d8c0.f9103h);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14313f(hcv hcvVar) {
        hcvVar.f11975a = null;
        hcvVar.f11976b = null;
        hcvVar.f11977c = null;
        hcvVar.f11978d = null;
        hcvVar.f11979e = null;
    }

    /* JADX INFO: renamed from: k */
    private void m14314k() {
        a aVar = this.f11981g;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f11978d.v();
        this.f11981g.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m14315s(View view) {
        m14314k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m14316u() {
        m14334z("about:blank", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m14317v(DialogInterface dialogInterface) {
        if (this.f11983i == 17) {
            this.f11980f.m10290C4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m14318w(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        this.f11978d.v();
        this.f11978d.p();
        this.f11980f.m10289B4();
        m14313f(this);
        com.p1.mobile.putong.live.base.mmsdk.player.a.b().e(act());
        this.f11980f = null;
        this.f11981g = null;
    }

    /* JADX INFO: renamed from: B */
    public void m14319B(int[] iArr, boolean z, int i, int i2, boolean z2) {
        C0200a c0200a = this.f11981g;
        if (c0200a != null) {
            c0200a.m5141e0(i);
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z3 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11977c.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        if (z) {
            layoutParams.height = -1;
            if (z2) {
                layoutParams.topMargin = xdl0.F0();
            }
        } else {
            layoutParams.height = i4;
        }
        layoutParams.width = i3;
        layoutParams.bottomMargin = z3 ? -this.f11984j : 0;
        layoutParams.gravity = i | 1;
        this.f11977c.setLayoutParams(layoutParams);
        this.f11977c.setContentPadding(0, 0, 0, z3 ? this.f11984j : 0);
        int iD = t100.d(i2);
        CardView cardView = this.f11977c;
        if (z3) {
            mep0.c1(cardView, 0, 0, 0, -iD, iD);
        } else {
            mep0.d1(cardView, iD);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public Context m14320C0() {
        return this.f11980f.act();
    }

    /* JADX INFO: renamed from: E */
    public void m14321E() {
        this.f11979e.setVisibility(8);
        this.f11978d.setWebViewMarginTop(0);
    }

    /* JADX INFO: renamed from: F */
    public void m14322F(String str, boolean z, boolean z2, final d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11978d.z(g5c0.f11071e8, this.f11981g);
        m14308C();
        m14307A(str);
        this.f11981g.show();
        this.f11981g.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dcv
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f9171a.m14318w(d30Var, dialogInterface);
            }
        });
        xdl0.M(this.f11979e, z);
        View view = this.f11976b;
        if (z2) {
            view.setBackgroundColor(ypv.e.getResources().getColor(h1c0.f11742N));
        } else {
            view.setBackground(null);
        }
    }

    public Act act() {
        return this.f11980f.act();
    }

    public void destroy() {
        a aVar = this.f11981g;
        if (aVar != null && aVar.isShowing()) {
            this.f11981g.dismiss();
        }
        LiveMkWebView liveMkWebView = this.f11978d;
        if (liveMkWebView != null) {
            liveMkWebView.B();
            this.f11978d.v();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m14323e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cdv.m10942b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m14325i1(bdv bdvVar) {
        this.f11980f = bdvVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        a aVar = this.f11981g;
        return aVar != null && aVar.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m14326j() {
        m14314k();
    }

    /* JADX INFO: renamed from: l */
    public int m14327l() {
        LiveMkWebView liveMkWebView = this.f11978d;
        if (liveMkWebView != null) {
            return liveMkWebView.getWebViewHashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public void m14328m(boolean z, String str, CommonH5Builder.BgType bgType) {
        m14329n(z, str, bgType);
    }

    /* JADX INFO: renamed from: n */
    public void m14329n(boolean z, String str, CommonH5Builder.BgType bgType) {
        if (act() == null) {
            return;
        }
        this.f11981g = new C0200a(this.f11980f, m14323e(act().inflater(), null), 17);
        this.f11978d.y(z, str, bgType);
        this.f11981g.m5146j0(LiveDialogEnum.WEBVIEW);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ecv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9674a.m14315s(view);
            }
        };
        xdl0.E0(this.f11976b, onClickListener);
        xdl0.E0(this.f11979e, onClickListener);
        this.f11978d.setOnCheckIsTextEditorFlag(true);
        this.f11981g.m5142f0(new C0200a.c() { // from class: l.fcv
            @Override // com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a.c
            /* JADX INFO: renamed from: o */
            public final void mo5152o() {
                this.f10234a.m14316u();
            }
        });
        this.f11981g.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.gcv
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f11368a.m14317v(dialogInterface);
            }
        });
        if (apo.m9994a(str)) {
            h5j0.INSTANCE.d("octopus_game_loading");
            this.f11978d.t();
            this.f11978d.m(new apo(), "app");
        }
    }

    /* JADX INFO: renamed from: p */
    public void m14330p(CommonH5Builder.BgType bgType) {
        this.f11978d.setWebViewBg(bgType);
    }

    /* JADX INFO: renamed from: q */
    public boolean m14331q(String str) {
        if (TextUtils.equals(str, this.f11982h)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11982h);
        sb.append("?");
        return TextUtils.equals(str, sb.toString());
    }

    /* JADX INFO: renamed from: x */
    public void m14332x(String str) {
        LiveMkWebView liveMkWebView = this.f11978d;
        if (liveMkWebView != null) {
            liveMkWebView.w(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m14333y(String str, String str2, Map<String, String> map) {
        if (this.f11980f == null) {
            return;
        }
        this.f11978d.l(act(), str, str2, map);
    }

    /* JADX INFO: renamed from: z */
    public void m14334z(String str, Map<String, String> map) {
        this.f11978d.x(str, map);
    }
}

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

/* JADX INFO: loaded from: classes13.dex */
public class fsu implements s7m<usu> {

    /* JADX INFO: renamed from: a */
    public VFrame f99109a;

    /* JADX INFO: renamed from: b */
    public View f99110b;

    /* JADX INFO: renamed from: c */
    public CardView f99111c;

    /* JADX INFO: renamed from: d */
    public LiveMkWebView f99112d;

    /* JADX INFO: renamed from: e */
    public VImage f99113e;

    /* JADX INFO: renamed from: f */
    public usu f99114f;

    /* JADX INFO: renamed from: g */
    public DialogC12611a f99115g;

    /* JADX INFO: renamed from: h */
    public String f99116h;

    /* JADX INFO: renamed from: i */
    public int f99117i = 17;

    /* JADX INFO: renamed from: j */
    public final int f99118j = t100.m186890d(10.0f);

    /* JADX INFO: renamed from: f */
    public static void m122962f(fsu fsuVar) {
        fsuVar.f99109a = null;
        fsuVar.f99110b = null;
        fsuVar.f99111c = null;
        fsuVar.f99112d = null;
        fsuVar.f99113e = null;
    }

    /* JADX INFO: renamed from: k */
    private void m122963k() {
        DialogC12611a dialogC12611a = this.f99115g;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f99112d.m68873v();
        this.f99115g.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m122964s(View view) {
        m122963k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m122965u() {
        m122983z("about:blank", null);
    }

    /* JADX INFO: renamed from: A */
    public final void m122966A(String str) {
        Uri uri = Uri.parse(str);
        this.f99116h = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
    }

    /* JADX INFO: renamed from: B */
    public void m122967B(int[] iArr, boolean z, int i, int i2) {
        DialogC12611a dialogC12611a = this.f99115g;
        if (dialogC12611a != null) {
            dialogC12611a.m71773e0(i);
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z2 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f99111c.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        if (z) {
            layoutParams.height = -1;
        } else {
            layoutParams.height = i4;
        }
        layoutParams.width = i3;
        layoutParams.bottomMargin = z2 ? -this.f99118j : 0;
        layoutParams.gravity = i | 1;
        this.f99111c.setLayoutParams(layoutParams);
        this.f99111c.setContentPadding(0, 0, 0, z2 ? this.f99118j : 0);
        int iM186890d = t100.m186890d(i2);
        CardView cardView = this.f99111c;
        if (z2) {
            mep0.m154301c1(cardView, 0, 0, 0, -iM186890d, iM186890d);
        } else {
            mep0.m154302d1(cardView, iM186890d);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m122968C() {
        ViewGroup.LayoutParams layoutParams = this.f99111c.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            int i = ((FrameLayout.LayoutParams) layoutParams).gravity;
            this.f99117i = i;
            this.f99115g.m71771c0(i == 17 ? d8c0.f84851f : d8c0.f84853h);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f99114f.act();
    }

    /* JADX INFO: renamed from: E */
    public void m122969E() {
        this.f99113e.setVisibility(8);
        this.f99112d.setWebViewMarginTop(0);
    }

    /* JADX INFO: renamed from: F */
    public void m122970F(String str, boolean z, boolean z2, final d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f99112d.m68877z(g5c0.f100921e8, this.f99115g);
        m122968C();
        m122966A(str);
        this.f99115g.show();
        this.f99115g.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bsu
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f77123a.m122980w(d30Var, dialogInterface);
            }
        });
        xdl0.m208344M(this.f99113e, z);
        View view = this.f99110b;
        if (z2) {
            view.setBackgroundColor(ypv.f199497e.getResources().getColor(h1c0.f105322N));
        } else {
            view.setBackground(null);
        }
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f99114f.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        DialogC12611a dialogC12611a = this.f99115g;
        if (dialogC12611a != null && dialogC12611a.isShowing()) {
            this.f99115g.dismiss();
        }
        LiveMkWebView liveMkWebView = this.f99112d;
        if (liveMkWebView != null) {
            liveMkWebView.m68861B();
            this.f99112d.m68873v();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m122971e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vsu.m199908b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(usu usuVar) {
        this.f99114f = usuVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        DialogC12611a dialogC12611a = this.f99115g;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m122973j() {
        m122963k();
    }

    /* JADX INFO: renamed from: l */
    public int m122974l() {
        LiveMkWebView liveMkWebView = this.f99112d;
        if (liveMkWebView != null) {
            return liveMkWebView.getWebViewHashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public void m122975m(boolean z, String str, CommonH5Builder.BgType bgType) {
        m122976n(z, str, bgType);
    }

    /* JADX INFO: renamed from: n */
    public void m122976n(boolean z, String str, CommonH5Builder.BgType bgType) {
        Act act = act();
        if (act == null) {
            return;
        }
        this.f99115g = new DialogC12611a(act, m122971e(act.inflater(), null));
        this.f99112d.m68876y(z, str, bgType);
        this.f99115g.m71778j0(LiveDialogEnum.WEBVIEW);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.csu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82382a.m122964s(view);
            }
        };
        xdl0.m208329E0(this.f99110b, onClickListener);
        xdl0.m208329E0(this.f99113e, onClickListener);
        this.f99112d.setOnCheckIsTextEditorFlag(true);
        this.f99115g.m71774f0(new DialogC12611a.c() { // from class: l.dsu
            @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a.c
            /* JADX INFO: renamed from: o */
            public final void mo71784o() {
                this.f87792a.m122965u();
            }
        });
        this.f99115g.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.esu
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f93054a.m122979v(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m122977p(CommonH5Builder.BgType bgType) {
        this.f99112d.setWebViewBg(bgType);
    }

    /* JADX INFO: renamed from: q */
    public boolean m122978q(String str) {
        if (TextUtils.equals(str, this.f99116h)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f99116h);
        sb.append("?");
        return TextUtils.equals(str, sb.toString());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m122979v(DialogInterface dialogInterface) {
        if (this.f99117i == 17) {
            this.f99114f.m195271z3();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m122980w(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        this.f99112d.m68873v();
        this.f99112d.m68867p();
        this.f99114f.m195270y3();
        m122962f(this);
        C12459a.m68524b().m68527e(act());
        this.f99114f = null;
        this.f99115g = null;
    }

    /* JADX INFO: renamed from: x */
    public void m122981x(String str) {
        LiveMkWebView liveMkWebView = this.f99112d;
        if (liveMkWebView != null) {
            liveMkWebView.m68874w(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m122982y(String str, String str2, Map<String, String> map) {
        if (this.f99114f == null) {
            return;
        }
        this.f99112d.m68863l((PutongAct) act(), str, str2, map);
    }

    /* JADX INFO: renamed from: z */
    public void m122983z(String str, Map<String, String> map) {
        this.f99112d.m68875x(str, map);
    }
}

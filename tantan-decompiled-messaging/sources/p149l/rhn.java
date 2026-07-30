package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.game.IntlGameTabFrag;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;

/* JADX INFO: loaded from: classes13.dex */
public class rhn extends bwr<shn> {

    /* JADX INFO: renamed from: a */
    public final mss f159450a;

    /* JADX INFO: renamed from: b */
    public final IntlGameTabFrag f159451b;

    /* JADX INFO: renamed from: c */
    public ij4 f159452c;

    /* JADX INFO: renamed from: d */
    public izb f159453d;

    /* JADX INFO: renamed from: e */
    public boolean f159454e;

    public rhn(IntlGameTabFrag intlGameTabFrag, mss mssVar) {
        super(intlGameTabFrag);
        this.f159454e = false;
        this.f159450a = mssVar;
        this.f159451b = intlGameTabFrag;
        this.f159452c = new ij4(intlGameTabFrag);
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m179428q2(MKWebView mKWebView) {
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        mKWebView.getSettings().setTextZoom(100);
    }

    /* JADX INFO: renamed from: u2 */
    private void m179429u2() {
        ((shn) this.viewModel).f164618c.setBackgroundColor(0);
        ((shn) this.viewModel).f164618c.getSettings().setCacheMode(2);
        ((shn) this.viewModel).f164618c.clearCache(true);
    }

    /* JADX INFO: renamed from: r2 */
    public void m179430r2(String str) {
        izb izbVar = this.f159453d;
        if (izbVar == null || vwb.m200296J(izbVar.m139040z())) {
            return;
        }
        this.f159453d.m139040z().get(0).m114651p().mo127285b(str, new String[0]);
    }

    /* JADX INFO: renamed from: s2 */
    public void m179431s2() {
        String strM195956u4 = ypv.m215672k().m195956u4();
        if (TextUtils.isEmpty(strM195956u4)) {
            return;
        }
        izb izbVar = new izb();
        this.f159453d = izbVar;
        izbVar.m87118q(this.f159451b.act(), ((shn) this.viewModel).f164618c);
        this.f159453d.m87120x(new MKWebViewHelper.InterfaceC14920a() { // from class: l.qhn
            @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.InterfaceC14920a
            /* JADX INFO: renamed from: a */
            public final void mo87121a(MKWebView mKWebView) {
                rhn.m179428q2(mKWebView);
            }
        });
        if (!this.f159453d.m139035B()) {
            this.f159453d.m139034A((PutongAct) this.f159451b.act(), "", ((shn) this.viewModel).f164618c, strM195956u4);
        }
        m179429u2();
        ((shn) this.viewModel).f164618c.loadUrl(strM195956u4);
    }

    /* JADX INFO: renamed from: v2 */
    public void m179432v2() {
        if (this.f159454e) {
            m179430r2("reloadPage");
        } else {
            m179431s2();
            this.f159454e = true;
        }
    }
}

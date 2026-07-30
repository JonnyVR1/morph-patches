package p153l;

import android.text.TextUtils;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.game.IntlGameTabFrag;

/* JADX INFO: loaded from: classes9.dex */
public class rjn extends cyr<sjn> {

    /* JADX INFO: renamed from: a */
    public final nus f163487a;

    /* JADX INFO: renamed from: b */
    public final IntlGameTabFrag f163488b;

    /* JADX INFO: renamed from: c */
    public hk4 f163489c;

    /* JADX INFO: renamed from: d */
    public w0c f163490d;

    /* JADX INFO: renamed from: e */
    public boolean f163491e;

    public rjn(IntlGameTabFrag intlGameTabFrag, nus nusVar) {
        super(intlGameTabFrag);
        this.f163491e = false;
        this.f163487a = nusVar;
        this.f163488b = intlGameTabFrag;
        this.f163489c = new hk4(intlGameTabFrag);
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m181738q2(MKWebView mKWebView) {
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        mKWebView.getSettings().setTextZoom(100);
    }

    /* JADX INFO: renamed from: u2 */
    private void m181739u2() {
        ((sjn) this.viewModel).f169127c.setBackgroundColor(0);
        ((sjn) this.viewModel).f169127c.getSettings().setCacheMode(2);
        ((sjn) this.viewModel).f169127c.clearCache(true);
    }

    /* JADX INFO: renamed from: r2 */
    public void m181740r2(String str) {
        w0c w0cVar = this.f163490d;
        if (w0cVar == null || jyb.m147479J(w0cVar.m204136L())) {
            return;
        }
        this.f163490d.m204136L().get(0).m205747x().mo97004b(str, new String[0]);
    }

    /* JADX INFO: renamed from: s2 */
    public void m181741s2() {
        String strM203743u4 = zrv.m221193k().m203743u4();
        if (TextUtils.isEmpty(strM203743u4)) {
            return;
        }
        w0c w0cVar = new w0c();
        this.f163490d = w0cVar;
        w0cVar.m17975z(this.f163488b.act(), ((sjn) this.viewModel).f169127c);
        this.f163490d.m17959J(new MKWebViewHelper.InterfaceC3520a() { // from class: l.qjn
            @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.InterfaceC3520a
            /* JADX INFO: renamed from: a */
            public final void mo17976a(MKWebView mKWebView) {
                rjn.m181738q2(mKWebView);
            }
        });
        if (!this.f163490d.m204138N()) {
            this.f163490d.m204137M((PutongAct) this.f163488b.act(), "", ((sjn) this.viewModel).f169127c, strM203743u4);
        }
        m181739u2();
        ((sjn) this.viewModel).f169127c.loadUrl(strM203743u4);
    }

    /* JADX INFO: renamed from: v2 */
    public void m181742v2() {
        if (this.f163491e) {
            m181740r2("reloadPage");
        } else {
            m181741s2();
            this.f163491e = true;
        }
    }
}

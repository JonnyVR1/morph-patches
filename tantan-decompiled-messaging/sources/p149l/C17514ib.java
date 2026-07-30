package p149l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import p147v.VIcon;
import p149l.hlp0;

/* JADX INFO: renamed from: l.ib */
/* JADX INFO: loaded from: classes11.dex */
public class C17514ib<P extends hlp0> extends olp0<C16098cb> {

    /* JADX INFO: renamed from: F */
    public String f112334F;

    /* JADX INFO: renamed from: G */
    public String f112335G;

    /* JADX INFO: renamed from: l.ib$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenWebViewAct f112336a;

        public a(AccessTokenWebViewAct accessTokenWebViewAct) {
            this.f112336a = accessTokenWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f112336a.m80159o2();
        }
    }

    /* JADX INFO: renamed from: l.ib$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenWebViewAct f112338a;

        public b(AccessTokenWebViewAct accessTokenWebViewAct) {
            this.f112338a = accessTokenWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f112338a.m80160p2();
        }
    }

    /* JADX INFO: renamed from: l.ib$c */
    public class c implements sw3.InterfaceC20043a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sw3.InterfaceC20043a f112340a;

        public c(sw3.InterfaceC20043a interfaceC20043a) {
            this.f112340a = interfaceC20043a;
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            if (C17514ib.this.m135224Y()) {
                C17514ib c17514ib = C17514ib.this;
                c17514ib.f112335G = c17514ib.f144530d.getTitle();
            }
            if (NullChecker.m81303a(this.f112340a)) {
                this.f112340a.mo36610a(str);
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
            if (NullChecker.m81303a(this.f112340a)) {
                this.f112340a.mo36611b(str);
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            if (NullChecker.m81303a(this.f112340a)) {
                this.f112340a.mo36612c(i, str, str2);
            }
        }
    }

    public C17514ib(PutongAct putongAct) {
        super(putongAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ Boolean m135212F(String str) {
        if (str.startsWith("tantan:")) {
            if (!str.contains("shareAction")) {
                return Boolean.FALSE;
            }
            final String str2 = gkp0.m126669d(str).get("url");
            if (TextUtils.isEmpty(str2)) {
                lsi0.m151580j("something wrong");
            } else {
                e51.m114742G(new Runnable() { // from class: l.fb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f96684a.m135225Z(str2);
                    }
                });
            }
            return Boolean.TRUE;
        }
        HashMap map = new HashMap();
        if (jkp0.m141904d(str)) {
            map.put("H5-Authorization", this.f112334F);
        } else {
            jkp0.m141906f("Load override url not in token whitelist: " + str + "\norigin: " + this.f144538l);
        }
        this.f144530d.loadUrl(str, map);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m135214P(roj0 roj0Var) {
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: A */
    public void mo135219A(Map<String, String> map) {
        if (m164980q() == null || !m164980q().contains("?speed=true")) {
            this.f144530d.setLayerType(1, null);
        }
        ((C16098cb) this.f144535i).m105956m0();
    }

    /* JADX INFO: renamed from: U */
    public aoq mo135220U(PutongAct putongAct, String str, WebViewX webViewX) {
        return new aoq(putongAct, this.f112334F, this.f144530d);
    }

    /* JADX INFO: renamed from: V */
    public String m135221V() {
        WebViewX webViewX;
        if ((TextUtils.isEmpty(this.f112335G) || this.f112335G.contains("mp.weixin.qq.com")) && (webViewX = this.f144530d) != null) {
            this.f112335G = webViewX.getTitle();
        }
        return this.f112335G;
    }

    /* JADX INFO: renamed from: W */
    public void m135222W() {
        this.f144525D = new d30() { // from class: l.db
            @Override // p149l.d30
            public final void call() {
                this.f85276a.m135226a0();
            }
        };
    }

    /* JADX INFO: renamed from: X */
    public void m135223X() {
        if (act() instanceof AccessTokenWebViewAct) {
            this.f144528b.m223584B();
            AccessTokenWebViewAct accessTokenWebViewAct = (AccessTokenWebViewAct) act();
            if (accessTokenWebViewAct.m80156l2()) {
                Drawable drawable = accessTokenWebViewAct.getResources().getDrawable(w2c0.f184195q0);
                drawable.mutate();
                drawable.setColorFilter(accessTokenWebViewAct.getResources().getColor(v0c0.f179096c), PorterDuff.Mode.SRC_ATOP);
                VIcon vIcon = new VIcon(accessTokenWebViewAct);
                vIcon.setIconStyle(4);
                vIcon.setImageDrawable(drawable);
                vIcon.setOnClickListener(new a(accessTokenWebViewAct));
                this.f144528b.m223589z(vIcon);
            }
            if (accessTokenWebViewAct.m80157m2()) {
                Drawable drawable2 = accessTokenWebViewAct.getResources().getDrawable(w2c0.f184191o0);
                drawable2.mutate();
                drawable2.setColorFilter(accessTokenWebViewAct.getResources().getColor(v0c0.f179096c), PorterDuff.Mode.SRC_ATOP);
                VIcon vIcon2 = new VIcon(accessTokenWebViewAct);
                vIcon2.setIconStyle(4);
                vIcon2.setImageDrawable(drawable2);
                vIcon2.setOnClickListener(new b(accessTokenWebViewAct));
                this.f144528b.m223589z(vIcon2);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public boolean m135224Y() {
        String strM164980q = m164980q();
        String[] strArrSplit = strM164980q == null ? null : strM164980q.split("://");
        return strArrSplit != null && strArrSplit.length > 1 && strArrSplit[1].startsWith("mp.weixin.qq.com");
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m135225Z(String str) {
        try {
            m135229d0(URLDecoder.decode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            CrashHelper.m81296c(e);
            lsi0.m151580j("something wrong");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m135226a0() {
        if (this.f144530d == null) {
            return;
        }
        if (!jkp0.m141904d(this.f144538l)) {
            jkp0.m141906f("Load javascript:doWhenGetToken not in token whitelist: " + this.f144538l);
        } else {
            this.f144530d.loadUrl("javascript:doWhenGetToken('" + this.f112334F + "')");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m135227b0(Throwable th) {
        this.f144532f.setVisibility(0);
        this.f144531e.setVisibility(8);
    }

    /* JADX INFO: renamed from: c0 */
    public void m135228c0(AuthData authData) {
        this.f112334F = authData.accessToken;
        this.f144522A = mo135220U(act(), this.f112334F, this.f144530d);
        HashMap map = new HashMap();
        if (jkp0.m141904d(this.f144538l)) {
            map.put("H5-Authorization", authData.accessToken);
        } else {
            jkp0.m141906f("Load url not in token whitelist: " + this.f144538l);
        }
        if (TextUtils.isEmpty(authData.accessToken)) {
            CrashHelper.m81296c(new NullPointerException("AccessTokenWebView request h5 right,but accessToken is null !"));
        }
        super.mo135219A(map);
    }

    /* JADX INFO: renamed from: d0 */
    public void m135229d0(String str) {
        Link link = new Link();
        link.href = str;
        link.resources = vwb.m200324f0(new IdBoxed(qib0.f154714c0.userId(), "user"));
        new ShareHelper(link).m80018v0(act(), act().getString(R$string.f17331H1), "Hi 朋友，100块要不要？", "点进来就得奖励，还能结识帅哥美女，超1亿人都在使用的脱单神器，你还在等什么？", vwb.m200324f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq-space")), true, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpURUQzNFhJUk1ZTkJTVktQS040NEZFTVNGNU9NUCIsInciOjYwMCwiaCI6NjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzU1NzMwNTYwOTI5MDA0OTkzMn0?format=180x180").subscribe(mkd0.m154956H(new e30() { // from class: l.gb
            @Override // p149l.e30
            public final void call(Object obj) {
                C17514ib.m135214P((roj0) obj);
            }
        }, new e30() { // from class: l.hb
            @Override // p149l.e30
            public final void call(Object obj) {
                yij0.m214926D((Throwable) obj);
            }
        }));
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: u */
    public w9j<String, Boolean> mo135230u() {
        return new w9j() { // from class: l.eb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90280a.m135212F((String) obj);
            }
        };
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: v */
    public sw3.InterfaceC20043a mo135231v() {
        return new c(super.mo135231v());
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: y */
    public void mo135232y() {
        super.mo135232y();
        m135223X();
    }
}

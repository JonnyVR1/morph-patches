package p153l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import p151v.VIcon;
import p153l.lup0;

/* JADX INFO: renamed from: l.db */
/* JADX INFO: loaded from: classes10.dex */
public class C16494db<P extends lup0> extends sup0<C21270xa> {

    /* JADX INFO: renamed from: F */
    public String f85950F;

    /* JADX INFO: renamed from: G */
    public String f85951G;

    /* JADX INFO: renamed from: l.db$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenWebViewAct f85952a;

        public a(AccessTokenWebViewAct accessTokenWebViewAct) {
            this.f85952a = accessTokenWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f85952a.m81342p2();
        }
    }

    /* JADX INFO: renamed from: l.db$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenWebViewAct f85954a;

        public b(AccessTokenWebViewAct accessTokenWebViewAct) {
            this.f85954a = accessTokenWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f85954a.m81343q2();
        }
    }

    /* JADX INFO: renamed from: l.db$c */
    public class c implements rx3.InterfaceC19928a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rx3.InterfaceC19928a f85956a;

        public c(rx3.InterfaceC19928a interfaceC19928a) {
            this.f85956a = interfaceC19928a;
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            if (C16494db.this.m115149Y()) {
                C16494db c16494db = C16494db.this;
                c16494db.f85951G = c16494db.f170715d.getTitle();
            }
            if (NullChecker.m82486a(this.f85956a)) {
                this.f85956a.mo37613a(str);
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
            if (NullChecker.m82486a(this.f85956a)) {
                this.f85956a.mo37614b(str);
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            if (NullChecker.m82486a(this.f85956a)) {
                this.f85956a.mo37615c(i, str, str2);
            }
        }
    }

    public C16494db(PutongAct putongAct) {
        super(putongAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ Boolean m115138F(String str) {
        if (str.startsWith("tantan:")) {
            if (!str.contains("shareAction")) {
                return Boolean.FALSE;
            }
            final String str2 = ktp0.m151393d(str).get("url");
            if (TextUtils.isEmpty(str2)) {
                o1j0.m165636j("something wrong");
            } else {
                l51.m152887G(new Runnable() { // from class: l.ab
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f69187a.m115150Z(str2);
                    }
                });
            }
            return Boolean.TRUE;
        }
        HashMap map = new HashMap();
        if (ntp0.m164746d(str)) {
            map.put("H5-Authorization", this.f85950F);
        } else {
            ntp0.m164748f("Load override url not in token whitelist: " + str + "\norigin: " + this.f170723l);
        }
        this.f170715d.loadUrl(str, map);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m115140P(uxj0 uxj0Var) {
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: A */
    public void mo115145A(Map<String, String> map) {
        if (m188067q() == null || !m188067q().contains("?speed=true")) {
            this.f170715d.setLayerType(1, null);
        }
        ((C21270xa) this.f170720i).m209826m0();
    }

    /* JADX INFO: renamed from: U */
    public zpq mo98397U(PutongAct putongAct, String str, WebViewX webViewX) {
        return new zpq(putongAct, this.f85950F, this.f170715d);
    }

    /* JADX INFO: renamed from: V */
    public String m115146V() {
        WebViewX webViewX;
        if ((TextUtils.isEmpty(this.f85951G) || this.f85951G.contains("mp.weixin.qq.com")) && (webViewX = this.f170715d) != null) {
            this.f85951G = webViewX.getTitle();
        }
        return this.f85951G;
    }

    /* JADX INFO: renamed from: W */
    public void m115147W() {
        this.f170710D = new x20() { // from class: l.ya
            @Override // p153l.x20
            public final void call() {
                this.f198144a.m115151a0();
            }
        };
    }

    /* JADX INFO: renamed from: X */
    public void m115148X() {
        if (act() instanceof AccessTokenWebViewAct) {
            this.f170713b.m224830B();
            AccessTokenWebViewAct accessTokenWebViewAct = (AccessTokenWebViewAct) act();
            if (accessTokenWebViewAct.m81339m2()) {
                Drawable drawable = accessTokenWebViewAct.getResources().getDrawable(cbc0.f80791q0);
                drawable.mutate();
                drawable.setColorFilter(accessTokenWebViewAct.getResources().getColor(b9c0.f75557c), PorterDuff.Mode.SRC_ATOP);
                VIcon vIcon = new VIcon(accessTokenWebViewAct);
                vIcon.setIconStyle(4);
                vIcon.setImageDrawable(drawable);
                vIcon.setOnClickListener(new a(accessTokenWebViewAct));
                this.f170713b.m224835z(vIcon);
            }
            if (accessTokenWebViewAct.m81340n2()) {
                Drawable drawable2 = accessTokenWebViewAct.getResources().getDrawable(cbc0.f80787o0);
                drawable2.mutate();
                drawable2.setColorFilter(accessTokenWebViewAct.getResources().getColor(b9c0.f75557c), PorterDuff.Mode.SRC_ATOP);
                VIcon vIcon2 = new VIcon(accessTokenWebViewAct);
                vIcon2.setIconStyle(4);
                vIcon2.setImageDrawable(drawable2);
                vIcon2.setOnClickListener(new b(accessTokenWebViewAct));
                this.f170713b.m224835z(vIcon2);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public boolean m115149Y() {
        String strM188067q = m188067q();
        String[] strArrSplit = strM188067q == null ? null : strM188067q.split("://");
        return strArrSplit != null && strArrSplit.length > 1 && strArrSplit[1].startsWith("mp.weixin.qq.com");
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m115150Z(String str) {
        try {
            m115154d0(URLDecoder.decode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            CrashHelper.m82479c(e);
            o1j0.m165636j("something wrong");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m115151a0() {
        if (this.f170715d == null) {
            return;
        }
        if (!ntp0.m164746d(this.f170723l)) {
            ntp0.m164748f("Load javascript:doWhenGetToken not in token whitelist: " + this.f170723l);
        } else {
            this.f170715d.loadUrl("javascript:doWhenGetToken('" + this.f85950F + "')");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m115152b0(Throwable th) {
        this.f170717f.setVisibility(0);
        this.f170716e.setVisibility(8);
    }

    /* JADX INFO: renamed from: c0 */
    public void m115153c0(AuthData authData) {
        this.f85950F = authData.accessToken;
        this.f170707A = mo98397U(act(), this.f85950F, this.f170715d);
        HashMap map = new HashMap();
        if (ntp0.m164746d(this.f170723l)) {
            map.put("H5-Authorization", authData.accessToken);
        } else {
            ntp0.m164748f("Load url not in token whitelist: " + this.f170723l);
        }
        if (TextUtils.isEmpty(authData.accessToken)) {
            CrashHelper.m82479c(new NullPointerException("AccessTokenWebView request h5 right,but accessToken is null !"));
        }
        super.mo115145A(map);
    }

    /* JADX INFO: renamed from: d0 */
    public void m115154d0(String str) {
        Link link = new Link();
        link.href = str;
        link.resources = jyb.m147507f0(new IdBoxed(uqb0.f180397c0.userId(), "user"));
        new ShareHelper(link).m81201v0(act(), act().getString(R$string.f18050H1), "Hi 朋友，100块要不要？", "点进来就得奖励，还能结识帅哥美女，超1亿人都在使用的脱单神器，你还在等什么？", jyb.m147507f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq-space")), true, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpURUQzNFhJUk1ZTkJTVktQS040NEZFTVNGNU9NUCIsInciOjYwMCwiaCI6NjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzU1NzMwNTYwOTI5MDA0OTkzMn0?format=180x180").subscribe(psd0.m173597H(new y20() { // from class: l.bb
            @Override // p153l.y20
            public final void call(Object obj) {
                C16494db.m115140P((uxj0) obj);
            }
        }, new y20() { // from class: l.cb
            @Override // p153l.y20
            public final void call(Object obj) {
                bsj0.m106246D((Throwable) obj);
            }
        }));
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: u */
    public qcj<String, Boolean> mo98401u() {
        return new qcj() { // from class: l.za
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203529a.m115138F((String) obj);
            }
        };
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: v */
    public rx3.InterfaceC19928a mo98402v() {
        return new c(super.mo98402v());
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: y */
    public void mo115155y() {
        super.mo115155y();
        m115148X();
    }
}

package p009l;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.p004ui.share.ShareHelper;
import com.p000p1.mobile.putong.p004ui.webview.AccessTokenWebViewAct;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.web.WebViewX;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.IdBoxed;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import l.d30;
import l.e30;
import l.e51;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.v0c0;
import l.vwb;
import l.w2c0;
import l.w9j;
import p009l.hlp0;
import v.VIcon;

/* JADX INFO: renamed from: l.ib */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0952ib<P extends hlp0> extends olp0<C0803cb> {

    /* JADX INFO: renamed from: F */
    public String f14456F;

    /* JADX INFO: renamed from: G */
    public String f14457G;

    /* JADX INFO: renamed from: l.ib$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenWebViewAct f14458a;

        public a(AccessTokenWebViewAct accessTokenWebViewAct) {
            this.f14458a = accessTokenWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f14458a.m10493o2();
        }
    }

    /* JADX INFO: renamed from: l.ib$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenWebViewAct f14460a;

        public b(AccessTokenWebViewAct accessTokenWebViewAct) {
            this.f14460a = accessTokenWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f14460a.m10494p2();
        }
    }

    /* JADX INFO: renamed from: l.ib$c */
    public class c implements sw3.InterfaceC1195a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sw3.InterfaceC1195a f14462a;

        public c(sw3.InterfaceC1195a interfaceC1195a) {
            this.f14462a = interfaceC1195a;
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: a */
        public void mo552a(String str) {
            if (C0952ib.this.m16298Y()) {
                C0952ib c0952ib = C0952ib.this;
                c0952ib.f14457G = c0952ib.f18145d.getTitle();
            }
            if (NullChecker.a(this.f14462a)) {
                this.f14462a.mo552a(str);
            }
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: b */
        public void mo553b(String str) {
            if (NullChecker.a(this.f14462a)) {
                this.f14462a.mo553b(str);
            }
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: c */
        public void mo554c(int i, String str, String str2) {
            if (NullChecker.a(this.f14462a)) {
                this.f14462a.mo554c(i, str, str2);
            }
        }
    }

    public C0952ib(PutongAct putongAct) {
        super(putongAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ Boolean m16286F(String str) {
        if (str.startsWith("tantan:")) {
            if (!str.contains("shareAction")) {
                return Boolean.FALSE;
            }
            final String str2 = gkp0.m15107d(str).get("url");
            if (TextUtils.isEmpty(str2)) {
                lsi0.j("something wrong");
            } else {
                e51.G(new Runnable() { // from class: l.fb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12898a.m16299Z(str2);
                    }
                });
            }
            return Boolean.TRUE;
        }
        HashMap map = new HashMap();
        if (jkp0.m17145d(str)) {
            map.put("H5-Authorization", this.f14456F);
        } else {
            jkp0.m17147f("Load override url not in token whitelist: " + str + "\norigin: " + this.f18153l);
        }
        this.f18145d.loadUrl(str, map);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m16288P(roj0 roj0Var) {
    }

    @Override // p009l.olp0
    /* JADX INFO: renamed from: A */
    public void mo16293A(Map<String, String> map) {
        if (m19968q() == null || !m19968q().contains("?speed=true")) {
            this.f18145d.setLayerType(1, null);
        }
        ((C0803cb) this.f18150i).m12469m0();
    }

    /* JADX INFO: renamed from: U */
    public aoq m16294U(PutongAct putongAct, String str, WebViewX webViewX) {
        return new aoq(putongAct, this.f14456F, this.f18145d);
    }

    /* JADX INFO: renamed from: V */
    public String m16295V() {
        WebViewX webViewX;
        if ((TextUtils.isEmpty(this.f14457G) || this.f14457G.contains("mp.weixin.qq.com")) && (webViewX = this.f18145d) != null) {
            this.f14457G = webViewX.getTitle();
        }
        return this.f14457G;
    }

    /* JADX INFO: renamed from: W */
    public void m16296W() {
        this.f18140D = new d30() { // from class: l.db
            public final void call() {
                this.f11704a.m16300a0();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.Context, com.p1.mobile.putong.app.PutongAct, com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct] */
    /* JADX INFO: renamed from: X */
    public void m16297X() {
        if (act() instanceof AccessTokenWebViewAct) {
            this.f18143b.B();
            ?? r0 = (AccessTokenWebViewAct) act();
            if (r0.m10490l2()) {
                Drawable drawable = r0.getResources().getDrawable(w2c0.q0);
                drawable.mutate();
                drawable.setColorFilter(r0.getResources().getColor(v0c0.c), PorterDuff.Mode.SRC_ATOP);
                View vIcon = new VIcon((Context) r0);
                vIcon.setIconStyle(4);
                vIcon.setImageDrawable(drawable);
                vIcon.setOnClickListener(new a(r0));
                this.f18143b.z(new View[]{vIcon});
            }
            if (r0.m10491m2()) {
                Drawable drawable2 = r0.getResources().getDrawable(w2c0.o0);
                drawable2.mutate();
                drawable2.setColorFilter(r0.getResources().getColor(v0c0.c), PorterDuff.Mode.SRC_ATOP);
                View vIcon2 = new VIcon((Context) r0);
                vIcon2.setIconStyle(4);
                vIcon2.setImageDrawable(drawable2);
                vIcon2.setOnClickListener(new b(r0));
                this.f18143b.z(new View[]{vIcon2});
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public boolean m16298Y() {
        String strM19968q = m19968q();
        String[] strArrSplit = strM19968q == null ? null : strM19968q.split("://");
        return strArrSplit != null && strArrSplit.length > 1 && strArrSplit[1].startsWith("mp.weixin.qq.com");
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m16299Z(String str) {
        try {
            m16303d0(URLDecoder.decode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            CrashHelper.c(e);
            lsi0.j("something wrong");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m16300a0() {
        if (this.f18145d == null) {
            return;
        }
        if (!jkp0.m17145d(this.f18153l)) {
            jkp0.m17147f("Load javascript:doWhenGetToken not in token whitelist: " + this.f18153l);
        } else {
            this.f18145d.loadUrl("javascript:doWhenGetToken('" + this.f14456F + "')");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m16301b0(Throwable th) {
        this.f18147f.setVisibility(0);
        this.f18146e.setVisibility(8);
    }

    /* JADX INFO: renamed from: c0 */
    public void m16302c0(AuthData authData) {
        this.f14456F = authData.accessToken;
        this.f18137A = m16294U(act(), this.f14456F, this.f18145d);
        HashMap map = new HashMap();
        if (jkp0.m17145d(this.f18153l)) {
            map.put("H5-Authorization", authData.accessToken);
        } else {
            jkp0.m17147f("Load url not in token whitelist: " + this.f18153l);
        }
        if (TextUtils.isEmpty(authData.accessToken)) {
            CrashHelper.c(new NullPointerException("AccessTokenWebView request h5 right,but accessToken is null !"));
        }
        super.mo16293A(map);
    }

    /* JADX INFO: renamed from: d0 */
    public void m16303d0(String str) {
        Link link = new Link();
        link.href = str;
        link.resources = vwb.f0(new IdBoxed[]{new IdBoxed(qib0.c0.userId(), "user")});
        new ShareHelper(link).m10347v0(act(), act().getString(R.string.H1), "Hi 朋友，100块要不要？", "点进来就得奖励，还能结识帅哥美女，超1亿人都在使用的脱单神器，你还在等什么？", vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq-space")}), true, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpURUQzNFhJUk1ZTkJTVktQS040NEZFTVNGNU9NUCIsInciOjYwMCwiaCI6NjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzU1NzMwNTYwOTI5MDA0OTkzMn0?format=180x180").subscribe(mkd0.H(new e30() { // from class: l.gb
            public final void call(Object obj) {
                C0952ib.m16288P((roj0) obj);
            }
        }, new e30() { // from class: l.hb
            public final void call(Object obj) {
                yij0.m25382D((Throwable) obj);
            }
        }));
    }

    @Override // p009l.olp0
    /* JADX INFO: renamed from: u */
    public w9j<String, Boolean> mo16304u() {
        return new w9j() { // from class: l.eb
            public final Object call(Object obj) {
                return this.f12474a.m16286F((String) obj);
            }
        };
    }

    @Override // p009l.olp0
    /* JADX INFO: renamed from: v */
    public sw3.InterfaceC1195a mo16305v() {
        return new c(super.mo16305v());
    }

    @Override // p009l.olp0
    /* JADX INFO: renamed from: y */
    public void mo16306y() {
        super.mo16306y();
        m16297X();
    }
}

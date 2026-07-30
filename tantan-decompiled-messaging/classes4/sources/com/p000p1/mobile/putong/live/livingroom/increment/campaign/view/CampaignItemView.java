package com.p000p1.mobile.putong.live.livingroom.increment.campaign.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import immomo.com.mklibrary.core.base.ui.MKWebViewHelper;
import java.util.HashMap;
import java.util.List;
import l.c4g0;
import l.e30;
import l.edv;
import l.ffw;
import l.hfw;
import l.izb;
import l.jkp0;
import l.jo0;
import l.mkd0;
import l.u3g0;
import l.vwb;
import l.w9j;
import l.wul;
import l.xdl0;
import l.ypv;
import l.ztr;
import p002l.be4;
import p002l.vd4;
import p002l.wd4;
import p002l.yc4;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CampaignItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CampaignItemView f5529a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f5530b;

    /* JADX INFO: renamed from: c */
    public MKWebView f5531c;

    /* JADX INFO: renamed from: d */
    public View f5532d;

    /* JADX INFO: renamed from: e */
    public izb f5533e;

    /* JADX INFO: renamed from: f */
    public vd4 f5534f;

    /* JADX INFO: renamed from: g */
    public Act f5535g;

    /* JADX INFO: renamed from: h */
    public c4g0 f5536h;

    /* JADX INFO: renamed from: i */
    public BLiveCampaign f5537i;

    /* JADX INFO: renamed from: j */
    public wd4 f5538j;

    /* JADX INFO: renamed from: k */
    public be4 f5539k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView$a */
    public class C0381a extends MKWebViewHelper.b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vd4 f5540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0381a(wul wulVar, vd4 vd4Var) {
            super(wulVar);
            this.f5540b = vd4Var;
        }

        /* JADX INFO: renamed from: e */
        public void m6972e(WebView webView, int i, String str, String str2) {
            super.e(webView, i, str, str2);
            hfw.a("[live]campaign", "onReceivedErrorX message = " + str);
            ztr.b(i, str, str2, CampaignItemView.class.getName());
        }

        /* JADX INFO: renamed from: f */
        public void m6973f(WebView webView, String str) {
            super.f(webView, str);
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            this.f5540b.m23851N4(true);
        }
    }

    public CampaignItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m6957g(View view) {
        yc4.m26504a(this, view);
    }

    public Bitmap getViewBitmap() {
        return getDrawingCache();
    }

    /* JADX INFO: renamed from: h */
    public void m6958h() {
        edv.b(this.f5531c, this.f5533e);
        this.f5531c = null;
        this.f5538j = null;
        mkd0.z(this.f5536h);
    }

    /* JADX INFO: renamed from: i */
    public void m6959i() {
        this.f5531c.stopLoading();
        this.f5538j = null;
        mkd0.z(this.f5536h);
    }

    /* JADX INFO: renamed from: j */
    public final void m6960j(final BLiveCampaign bLiveCampaign, final vd4 vd4Var) {
        izb izbVar = new izb();
        this.f5533e = izbVar;
        izbVar.q((Activity) getContext(), this.f5531c);
        this.f5533e.A(getContext(), "", this.f5531c, "");
        this.f5531c.setBackgroundColor(0);
        this.f5531c.setMKWebLoadListener(new C0381a(this.f5533e, vd4Var));
        boolean z = bLiveCampaign.isH5HandleClick;
        View view = this.f5532d;
        if (z) {
            xdl0.M(view, false);
            xdl0.E0(this.f5532d, (View.OnClickListener) null);
        } else {
            xdl0.M(view, true);
            xdl0.E0(this.f5532d, new View.OnClickListener() { // from class: l.uc4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    vd4Var.m23844F4(bLiveCampaign);
                }
            });
        }
        this.f5531c.getSettings().setCacheMode(-1);
        this.f5531c.onResume();
    }

    /* JADX INFO: renamed from: k */
    public final void m6961k(String str, MKWebView mKWebView, String str2) {
        HashMap map = new HashMap();
        if (jkp0.d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6962l() {
        Act act = this.f5535g;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m6963m(BLiveCampaign bLiveCampaign, AuthData authData) {
        this.f5534f.m23849K4(authData.accessToken);
        m6961k(authData.accessToken, this.f5531c, bLiveCampaign.entranceUrl);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m6964n(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        return Boolean.valueOf(TextUtils.equals(liveCampaignInfo.getSubscribeType(), this.f5537i.campaignType));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m6965o(u3g0 u3g0Var) {
        return Boolean.valueOf(u3g0Var.b == this.f5531c.hashCode());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6957g(this);
        setDrawingCacheEnabled(true);
        this.f5539k = new be4(this.f5530b);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m6966p(u3g0 u3g0Var) {
        this.f5538j = u3g0Var.c;
        u3g0Var.d.call(Boolean.valueOf(TextUtils.equals(u3g0Var.a, this.f5537i.campaignType)));
    }

    /* JADX INFO: renamed from: q */
    public final void m6967q(final BLiveCampaign bLiveCampaign) {
        if (m6962l()) {
            String strM23862h4 = this.f5534f.m23862h4();
            if (TextUtils.isEmpty(strM23862h4)) {
                this.f5535g.duringCreated(ypv.a.a()).subscribe(ffw.e(new e30() { // from class: l.sc4
                    public final void call(Object obj) {
                        this.f18918a.m6963m(bLiveCampaign, (AuthData) obj);
                    }
                }, new e30() { // from class: l.tc4
                    public final void call(Object obj) {
                        hfw.a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m6961k(strM23862h4, this.f5531c, bLiveCampaign.entranceUrl);
            }
            this.f5534f.m23841C4(bLiveCampaign);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m6968r(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo;
        if (vwb.J(list) || this.f5538j == null || this.f5537i == null || (liveCampaignInfo = (LongLinkGiftMessage.LiveCampaignInfo) vwb.r(list, new w9j() { // from class: l.rc4
            public final Object call(Object obj) {
                return this.f18458a.m6964n((LongLinkGiftMessage.LiveCampaignInfo) obj);
            }
        })) == null) {
            return;
        }
        this.f5538j.m24522a(liveCampaignInfo);
    }

    /* JADX INFO: renamed from: s */
    public final void m6969s() {
        mkd0.z(this.f5536h);
        this.f5536h = this.f5535g.duringCreated((c) this.f5534f.m25548F2().LiveBridgeImplEvent.subscribeCampaign().g()).filter(new w9j() { // from class: l.vc4
            public final Object call(Object obj) {
                return this.f21067a.m6965o((u3g0) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.wc4
            public final void call(Object obj) {
                this.f21627a.m6966p((u3g0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m6970t() {
        mkd0.z(this.f5536h);
        this.f5531c.loadUrl("about:blank");
        xdl0.M(this, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: u */
    public void m6971u(BLiveCampaign bLiveCampaign, vd4 vd4Var) {
        this.f5534f = vd4Var;
        this.f5535g = vd4Var.act();
        this.f5537i = bLiveCampaign;
        m6969s();
        this.f5539k.m10316d(bLiveCampaign, vd4Var.m25547E2().mo14489A0());
        m6960j(bLiveCampaign, vd4Var);
        m6967q(bLiveCampaign);
        xdl0.M(this, true);
    }

    public CampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

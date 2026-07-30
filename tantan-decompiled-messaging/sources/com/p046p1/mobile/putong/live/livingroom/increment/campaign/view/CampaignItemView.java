package com.p046p1.mobile.putong.live.livingroom.increment.campaign.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.HashMap;
import java.util.List;
import p149l.be4;
import p149l.c4g0;
import p149l.e30;
import p149l.edv;
import p149l.ffw;
import p149l.hfw;
import p149l.izb;
import p149l.jkp0;
import p149l.jo0;
import p149l.mkd0;
import p149l.u3g0;
import p149l.vd4;
import p149l.vwb;
import p149l.w9j;
import p149l.wd4;
import p149l.wul;
import p149l.xdl0;
import p149l.yc4;
import p149l.ypv;
import p149l.ztr;

/* JADX INFO: loaded from: classes4.dex */
public class CampaignItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CampaignItemView f49487a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f49488b;

    /* JADX INFO: renamed from: c */
    public MKWebView f49489c;

    /* JADX INFO: renamed from: d */
    public View f49490d;

    /* JADX INFO: renamed from: e */
    public izb f49491e;

    /* JADX INFO: renamed from: f */
    public vd4 f49492f;

    /* JADX INFO: renamed from: g */
    public Act f49493g;

    /* JADX INFO: renamed from: h */
    public c4g0 f49494h;

    /* JADX INFO: renamed from: i */
    public BLiveCampaign f49495i;

    /* JADX INFO: renamed from: j */
    public wd4 f49496j;

    /* JADX INFO: renamed from: k */
    public be4 f49497k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView$a */
    public class C12792a extends MKWebViewHelper.C14921b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vd4 f49498b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12792a(wul wulVar, vd4 vd4Var) {
            super(wulVar);
            this.f49498b = vd4Var;
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            super.mo43911e(webView, i, str, str2);
            hfw.m130790a("[live]campaign", "onReceivedErrorX message = " + str);
            ztr.m220137b(i, str, str2, CampaignItemView.class.getName());
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            super.mo43912f(webView, str);
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            this.f49498b.m197948N4(true);
        }
    }

    public CampaignItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m73417g(View view) {
        yc4.m214004a(this, view);
    }

    public Bitmap getViewBitmap() {
        return getDrawingCache();
    }

    /* JADX INFO: renamed from: h */
    public void m73418h() {
        edv.m115835b(this.f49489c, this.f49491e);
        this.f49489c = null;
        this.f49496j = null;
        mkd0.m154992z(this.f49494h);
    }

    /* JADX INFO: renamed from: i */
    public void m73419i() {
        this.f49489c.stopLoading();
        this.f49496j = null;
        mkd0.m154992z(this.f49494h);
    }

    /* JADX INFO: renamed from: j */
    public final void m73420j(final BLiveCampaign bLiveCampaign, final vd4 vd4Var) {
        izb izbVar = new izb();
        this.f49491e = izbVar;
        izbVar.m87118q((Activity) getContext(), this.f49489c);
        this.f49491e.m139034A((PutongAct) getContext(), "", this.f49489c, "");
        this.f49489c.setBackgroundColor(0);
        this.f49489c.setMKWebLoadListener(new C12792a(this.f49491e, vd4Var));
        boolean z = bLiveCampaign.isH5HandleClick;
        View view = this.f49490d;
        if (z) {
            xdl0.m208344M(view, false);
            xdl0.m208329E0(this.f49490d, null);
        } else {
            xdl0.m208344M(view, true);
            xdl0.m208329E0(this.f49490d, new View.OnClickListener() { // from class: l.uc4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    vd4Var.m197941F4(bLiveCampaign);
                }
            });
        }
        this.f49489c.getSettings().setCacheMode(-1);
        this.f49489c.onResume();
    }

    /* JADX INFO: renamed from: k */
    public final void m73421k(String str, MKWebView mKWebView, String str2) {
        HashMap map = new HashMap();
        if (jkp0.m141904d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m73422l() {
        Act act = this.f49493g;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m73423m(BLiveCampaign bLiveCampaign, AuthData authData) {
        this.f49492f.m197946K4(authData.accessToken);
        m73421k(authData.accessToken, this.f49489c, bLiveCampaign.entranceUrl);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m73424n(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        return Boolean.valueOf(TextUtils.equals(liveCampaignInfo.getSubscribeType(), this.f49495i.campaignType));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m73425o(u3g0 u3g0Var) {
        return Boolean.valueOf(u3g0Var.f173610b == this.f49489c.hashCode());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73417g(this);
        setDrawingCacheEnabled(true);
        this.f49497k = new be4(this.f49488b);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m73426p(u3g0 u3g0Var) {
        this.f49496j = u3g0Var.f173611c;
        u3g0Var.f173612d.call(Boolean.valueOf(TextUtils.equals(u3g0Var.f173609a, this.f49495i.campaignType)));
    }

    /* JADX INFO: renamed from: q */
    public final void m73427q(final BLiveCampaign bLiveCampaign) {
        if (m73422l()) {
            String strM197957h4 = this.f49492f.m197957h4();
            if (TextUtils.isEmpty(strM197957h4)) {
                this.f49493g.duringCreated(ypv.f199493a.m199334a()).subscribe(ffw.m121194e(new e30() { // from class: l.sc4
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f163707a.m73423m(bLiveCampaign, (AuthData) obj);
                    }
                }, new e30() { // from class: l.tc4
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hfw.m130790a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m73421k(strM197957h4, this.f49489c, bLiveCampaign.entranceUrl);
            }
            this.f49492f.mo138427C4(bLiveCampaign);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m73428r(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo;
        if (vwb.m200296J(list) || this.f49496j == null || this.f49495i == null || (liveCampaignInfo = (LongLinkGiftMessage.LiveCampaignInfo) vwb.m200346r(list, new w9j() { // from class: l.rc4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158713a.m73424n((LongLinkGiftMessage.LiveCampaignInfo) obj);
            }
        })) == null) {
            return;
        }
        this.f49496j.mo147900a(liveCampaignInfo);
    }

    /* JADX INFO: renamed from: s */
    public final void m73429s() {
        mkd0.m154992z(this.f49494h);
        this.f49494h = this.f49493g.duringCreated(this.f49492f.m206028F2().LiveBridgeImplEvent.subscribeCampaign().m172460g()).filter(new w9j() { // from class: l.vc4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180908a.m73425o((u3g0) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.wc4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185652a.m73426p((u3g0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m73430t() {
        mkd0.m154992z(this.f49494h);
        this.f49489c.loadUrl("about:blank");
        xdl0.m208344M(this, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: u */
    public void m73431u(BLiveCampaign bLiveCampaign, vd4 vd4Var) {
        this.f49492f = vd4Var;
        this.f49493g = vd4Var.act();
        this.f49495i = bLiveCampaign;
        m73429s();
        this.f49497k.m101319d(bLiveCampaign, vd4Var.m206027E2().mo132054A0());
        m73420j(bLiveCampaign, vd4Var);
        m73427q(bLiveCampaign);
        xdl0.m208344M(this, true);
    }

    public CampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

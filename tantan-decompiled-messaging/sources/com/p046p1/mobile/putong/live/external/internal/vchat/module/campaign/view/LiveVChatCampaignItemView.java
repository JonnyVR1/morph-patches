package com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.view;

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
import p149l.c4g0;
import p149l.ce4;
import p149l.e30;
import p149l.edv;
import p149l.ffw;
import p149l.hfw;
import p149l.izb;
import p149l.jkp0;
import p149l.jo0;
import p149l.kgu;
import p149l.mkd0;
import p149l.u3g0;
import p149l.vwb;
import p149l.w9j;
import p149l.wd4;
import p149l.wfu;
import p149l.wul;
import p149l.xdl0;
import p149l.ypv;
import p149l.ztr;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatCampaignItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveVChatCampaignItemView f45129a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f45130b;

    /* JADX INFO: renamed from: c */
    public MKWebView f45131c;

    /* JADX INFO: renamed from: d */
    public View f45132d;

    /* JADX INFO: renamed from: e */
    public izb f45133e;

    /* JADX INFO: renamed from: f */
    public kgu f45134f;

    /* JADX INFO: renamed from: g */
    public Act f45135g;

    /* JADX INFO: renamed from: h */
    public c4g0 f45136h;

    /* JADX INFO: renamed from: i */
    public BLiveCampaign f45137i;

    /* JADX INFO: renamed from: j */
    public wd4 f45138j;

    /* JADX INFO: renamed from: k */
    public ce4 f45139k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView$a */
    public class C12514a extends MKWebViewHelper.C14921b {
        public C12514a(wul wulVar) {
            super(wulVar);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            super.mo43911e(webView, i, str, str2);
            hfw.m130790a("[live]campaign", "onReceivedErrorX message = " + str);
            ztr.m220137b(i, str, str2, LiveVChatCampaignItemView.class.getName());
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            super.mo43912f(webView, str);
        }
    }

    public LiveVChatCampaignItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m69330g(View view) {
        wfu.m202990a(this, view);
    }

    public Bitmap getViewBitmap() {
        return getDrawingCache();
    }

    /* JADX INFO: renamed from: h */
    public void m69331h() {
        edv.m115835b(this.f45131c, this.f45133e);
        this.f45131c = null;
        this.f45138j = null;
        mkd0.m154992z(this.f45136h);
    }

    /* JADX INFO: renamed from: i */
    public void m69332i() {
        MKWebView mKWebView = this.f45131c;
        if (mKWebView != null) {
            mKWebView.stopLoading();
        }
        this.f45138j = null;
        mkd0.m154992z(this.f45136h);
    }

    /* JADX INFO: renamed from: j */
    public final void m69333j(final BLiveCampaign bLiveCampaign, final kgu kguVar) {
        izb izbVar = new izb();
        this.f45133e = izbVar;
        izbVar.m87118q((Activity) getContext(), this.f45131c);
        this.f45133e.m139034A((PutongAct) getContext(), "", this.f45131c, "");
        this.f45131c.setBackgroundColor(0);
        this.f45131c.setMKWebLoadListener(new C12514a(this.f45133e));
        boolean z = bLiveCampaign.isH5HandleClick;
        View view = this.f45132d;
        if (z) {
            xdl0.m208344M(view, false);
            xdl0.m208329E0(this.f45132d, null);
        } else {
            xdl0.m208344M(view, true);
            xdl0.m208329E0(this.f45132d, new View.OnClickListener() { // from class: l.sfu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    kguVar.m145928r3(bLiveCampaign);
                }
            });
        }
        this.f45131c.getSettings().setCacheMode(-1);
    }

    /* JADX INFO: renamed from: k */
    public final void m69334k(String str, MKWebView mKWebView, String str2) {
        HashMap map = new HashMap();
        if (jkp0.m141904d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m69335l() {
        Act act = this.f45135g;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m69336m(BLiveCampaign bLiveCampaign, AuthData authData) {
        this.f45134f.m145930w3(authData.accessToken);
        m69334k(authData.accessToken, this.f45131c, bLiveCampaign.entranceUrl);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m69337n(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        return Boolean.valueOf(TextUtils.equals(liveCampaignInfo.getSubscribeType(), this.f45137i.campaignType));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m69338o(u3g0 u3g0Var) {
        return Boolean.valueOf(u3g0Var.f173610b == this.f45131c.hashCode());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69330g(this);
        setDrawingCacheEnabled(true);
        this.f45139k = new ce4(this.f45130b);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m69339p(u3g0 u3g0Var) {
        this.f45138j = u3g0Var.f173611c;
        u3g0Var.f173612d.call(Boolean.valueOf(TextUtils.equals(u3g0Var.f173609a, this.f45137i.campaignType)));
    }

    /* JADX INFO: renamed from: q */
    public final void m69340q(final BLiveCampaign bLiveCampaign) {
        if (m69335l()) {
            String strM145920e3 = this.f45134f.m145920e3();
            if (TextUtils.isEmpty(strM145920e3)) {
                this.f45135g.duringCreated(ypv.f199493a.m199334a()).subscribe(ffw.m121194e(new e30() { // from class: l.tfu
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f170019a.m69336m(bLiveCampaign, (AuthData) obj);
                    }
                }, new e30() { // from class: l.ufu
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hfw.m130790a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m69334k(strM145920e3, this.f45131c, bLiveCampaign.entranceUrl);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m69341r(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo;
        if (vwb.m200296J(list) || this.f45138j == null || this.f45137i == null || (liveCampaignInfo = (LongLinkGiftMessage.LiveCampaignInfo) vwb.m200346r(list, new w9j() { // from class: l.pfu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148586a.m69337n((LongLinkGiftMessage.LiveCampaignInfo) obj);
            }
        })) == null) {
            return;
        }
        this.f45138j.mo147900a(liveCampaignInfo);
    }

    /* JADX INFO: renamed from: s */
    public final void m69342s() {
        mkd0.m154992z(this.f45136h);
        this.f45136h = this.f45135g.duringCreated(this.f45134f.m218411K2().LiveVChatBridgeImplEvent.m69188c().m172460g()).filter(new w9j() { // from class: l.qfu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154289a.m69338o((u3g0) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.rfu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159197a.m69339p((u3g0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m69343t() {
        mkd0.m154992z(this.f45136h);
        this.f45131c.loadUrl("about:blank");
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: u */
    public void m69344u(BLiveCampaign bLiveCampaign, kgu kguVar) {
        this.f45134f = kguVar;
        this.f45135g = kguVar.act();
        this.f45137i = bLiveCampaign;
        m69342s();
        this.f45139k.m106311b(bLiveCampaign);
        m69333j(bLiveCampaign, kguVar);
        m69340q(bLiveCampaign);
        xdl0.m208344M(this, true);
    }

    public LiveVChatCampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatCampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

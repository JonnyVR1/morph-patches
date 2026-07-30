package com.p051p1.mobile.putong.live.livingroom.increment.campaign.view;

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
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import java.util.HashMap;
import java.util.List;
import p153l.af4;
import p153l.awr;
import p153l.bcg0;
import p153l.bnl0;
import p153l.dhw;
import p153l.dpf0;
import p153l.ffv;
import p153l.fhw;
import p153l.fo0;
import p153l.jyb;
import p153l.kcg0;
import p153l.ntp0;
import p153l.nxl;
import p153l.psd0;
import p153l.qcj;
import p153l.ue4;
import p153l.ve4;
import p153l.w0c;
import p153l.xd4;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class CampaignItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CampaignItemView f50335a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f50336b;

    /* JADX INFO: renamed from: c */
    public MKWebView f50337c;

    /* JADX INFO: renamed from: d */
    public View f50338d;

    /* JADX INFO: renamed from: e */
    public w0c f50339e;

    /* JADX INFO: renamed from: f */
    public ue4 f50340f;

    /* JADX INFO: renamed from: g */
    public Act f50341g;

    /* JADX INFO: renamed from: h */
    public kcg0 f50342h;

    /* JADX INFO: renamed from: i */
    public BLiveCampaign f50343i;

    /* JADX INFO: renamed from: j */
    public ve4 f50344j;

    /* JADX INFO: renamed from: k */
    public af4 f50345k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView$a */
    public class C12955a extends dpf0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ue4 f50346c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12955a(nxl nxlVar, ue4 ue4Var) {
            super(nxlVar);
            this.f50346c = ue4Var;
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            super.mo17978e(webView, i, str, str2);
            fhw.m125605a("[live]campaign", "onReceivedErrorX message = " + str);
            awr.m100708b(i, str, str2, CampaignItemView.class.getName());
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            super.mo17979f(webView, str);
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            this.f50346c.m195629N4(true);
        }
    }

    public CampaignItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m74600g(View view) {
        xd4.m210444a(this, view);
    }

    public Bitmap getViewBitmap() {
        return getDrawingCache();
    }

    /* JADX INFO: renamed from: h */
    public void m74601h() {
        ffv.m125425a(this.f50337c, this.f50339e);
        this.f50337c = null;
        this.f50344j = null;
        psd0.m173633z(this.f50342h);
    }

    /* JADX INFO: renamed from: i */
    public void m74602i() {
        this.f50337c.stopLoading();
        this.f50344j = null;
        psd0.m173633z(this.f50342h);
    }

    /* JADX INFO: renamed from: j */
    public final void m74603j(final BLiveCampaign bLiveCampaign, final ue4 ue4Var) {
        w0c w0cVar = new w0c();
        this.f50339e = w0cVar;
        w0cVar.m17975z((Activity) getContext(), this.f50337c);
        this.f50339e.m204137M((PutongAct) getContext(), "", this.f50337c, "");
        this.f50337c.setBackgroundColor(0);
        this.f50337c.setMKWebLoadListener(new C12955a(this.f50339e, ue4Var));
        boolean z = bLiveCampaign.isH5HandleClick;
        View view = this.f50338d;
        if (z) {
            bnl0.m105524M(view, false);
            bnl0.m105509E0(this.f50338d, null);
        } else {
            bnl0.m105524M(view, true);
            bnl0.m105509E0(this.f50338d, new View.OnClickListener() { // from class: l.td4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ue4Var.m195622F4(bLiveCampaign);
                }
            });
        }
        this.f50337c.getSettings().setCacheMode(-1);
        this.f50337c.onResume();
    }

    /* JADX INFO: renamed from: k */
    public final void m74604k(String str, MKWebView mKWebView, String str2) {
        HashMap map = new HashMap();
        if (ntp0.m164746d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m74605l() {
        Act act = this.f50341g;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m74606m(BLiveCampaign bLiveCampaign, AuthData authData) {
        this.f50340f.m195627K4(authData.accessToken);
        m74604k(authData.accessToken, this.f50337c, bLiveCampaign.entranceUrl);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m74607n(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        return Boolean.valueOf(TextUtils.equals(liveCampaignInfo.getSubscribeType(), this.f50343i.campaignType));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m74608o(bcg0 bcg0Var) {
        return Boolean.valueOf(bcg0Var.f76143b == this.f50337c.hashCode());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74600g(this);
        setDrawingCacheEnabled(true);
        this.f50345k = new af4(this.f50336b);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m74609p(bcg0 bcg0Var) {
        this.f50344j = bcg0Var.f76144c;
        bcg0Var.f76145d.call(Boolean.valueOf(TextUtils.equals(bcg0Var.f76142a, this.f50343i.campaignType)));
    }

    /* JADX INFO: renamed from: q */
    public final void m74610q(final BLiveCampaign bLiveCampaign) {
        if (m74605l()) {
            String strM195638h4 = this.f50340f.m195638h4();
            if (TextUtils.isEmpty(strM195638h4)) {
                this.f50341g.duringCreated(zrv.f205799a.m207656a()).subscribe(dhw.m115826e(new y20() { // from class: l.rd4
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f162282a.m74606m(bLiveCampaign, (AuthData) obj);
                    }
                }, new y20() { // from class: l.sd4
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        fhw.m125605a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m74604k(strM195638h4, this.f50337c, bLiveCampaign.entranceUrl);
            }
            this.f50340f.mo156935C4(bLiveCampaign);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m74611r(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo;
        if (jyb.m147479J(list) || this.f50344j == null || this.f50343i == null || (liveCampaignInfo = (LongLinkGiftMessage.LiveCampaignInfo) jyb.m147529r(list, new qcj() { // from class: l.qd4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156657a.m74607n((LongLinkGiftMessage.LiveCampaignInfo) obj);
            }
        })) == null) {
            return;
        }
        this.f50344j.mo152372a(liveCampaignInfo);
    }

    /* JADX INFO: renamed from: s */
    public final void m74612s() {
        psd0.m173633z(this.f50342h);
        this.f50342h = this.f50341g.duringCreated(this.f50340f.m213811F2().LiveBridgeImplEvent.subscribeCampaign().m199270g()).filter(new qcj() { // from class: l.ud4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178504a.m74608o((bcg0) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.vd4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183537a.m74609p((bcg0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m74613t() {
        psd0.m173633z(this.f50342h);
        this.f50337c.loadUrl("about:blank");
        bnl0.m105524M(this, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: u */
    public void m74614u(BLiveCampaign bLiveCampaign, ue4 ue4Var) {
        this.f50340f = ue4Var;
        this.f50341g = ue4Var.act();
        this.f50343i = bLiveCampaign;
        m74612s();
        this.f50345k.m97281d(bLiveCampaign, ue4Var.m213810E2().mo118362A0());
        m74603j(bLiveCampaign, ue4Var);
        m74610q(bLiveCampaign);
        bnl0.m105524M(this, true);
    }

    public CampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

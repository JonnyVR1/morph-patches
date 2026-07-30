package com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view;

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
import p153l.awr;
import p153l.bcg0;
import p153l.bf4;
import p153l.bnl0;
import p153l.dhw;
import p153l.dpf0;
import p153l.ffv;
import p153l.fhw;
import p153l.fo0;
import p153l.jyb;
import p153l.kcg0;
import p153l.liu;
import p153l.ntp0;
import p153l.nxl;
import p153l.psd0;
import p153l.qcj;
import p153l.ve4;
import p153l.w0c;
import p153l.xhu;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatCampaignItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveVChatCampaignItemView f45977a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f45978b;

    /* JADX INFO: renamed from: c */
    public MKWebView f45979c;

    /* JADX INFO: renamed from: d */
    public View f45980d;

    /* JADX INFO: renamed from: e */
    public w0c f45981e;

    /* JADX INFO: renamed from: f */
    public liu f45982f;

    /* JADX INFO: renamed from: g */
    public Act f45983g;

    /* JADX INFO: renamed from: h */
    public kcg0 f45984h;

    /* JADX INFO: renamed from: i */
    public BLiveCampaign f45985i;

    /* JADX INFO: renamed from: j */
    public ve4 f45986j;

    /* JADX INFO: renamed from: k */
    public bf4 f45987k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView$a */
    public class C12677a extends dpf0 {
        public C12677a(nxl nxlVar) {
            super(nxlVar);
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            super.mo17978e(webView, i, str, str2);
            fhw.m125605a("[live]campaign", "onReceivedErrorX message = " + str);
            awr.m100708b(i, str, str2, LiveVChatCampaignItemView.class.getName());
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            super.mo17979f(webView, str);
        }
    }

    public LiveVChatCampaignItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m70513g(View view) {
        xhu.m211075a(this, view);
    }

    public Bitmap getViewBitmap() {
        return getDrawingCache();
    }

    /* JADX INFO: renamed from: h */
    public void m70514h() {
        ffv.m125425a(this.f45979c, this.f45981e);
        this.f45979c = null;
        this.f45986j = null;
        psd0.m173633z(this.f45984h);
    }

    /* JADX INFO: renamed from: i */
    public void m70515i() {
        MKWebView mKWebView = this.f45979c;
        if (mKWebView != null) {
            mKWebView.stopLoading();
        }
        this.f45986j = null;
        psd0.m173633z(this.f45984h);
    }

    /* JADX INFO: renamed from: j */
    public final void m70516j(final BLiveCampaign bLiveCampaign, final liu liuVar) {
        w0c w0cVar = new w0c();
        this.f45981e = w0cVar;
        w0cVar.m17975z((Activity) getContext(), this.f45979c);
        this.f45981e.m204137M((PutongAct) getContext(), "", this.f45979c, "");
        this.f45979c.setBackgroundColor(0);
        this.f45979c.setMKWebLoadListener(new C12677a(this.f45981e));
        boolean z = bLiveCampaign.isH5HandleClick;
        View view = this.f45980d;
        if (z) {
            bnl0.m105524M(view, false);
            bnl0.m105509E0(this.f45980d, null);
        } else {
            bnl0.m105524M(view, true);
            bnl0.m105509E0(this.f45980d, new View.OnClickListener() { // from class: l.thu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    liuVar.m154411r3(bLiveCampaign);
                }
            });
        }
        this.f45979c.getSettings().setCacheMode(-1);
    }

    /* JADX INFO: renamed from: k */
    public final void m70517k(String str, MKWebView mKWebView, String str2) {
        HashMap map = new HashMap();
        if (ntp0.m164746d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m70518l() {
        Act act = this.f45983g;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m70519m(BLiveCampaign bLiveCampaign, AuthData authData) {
        this.f45982f.m154413w3(authData.accessToken);
        m70517k(authData.accessToken, this.f45979c, bLiveCampaign.entranceUrl);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m70520n(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        return Boolean.valueOf(TextUtils.equals(liveCampaignInfo.getSubscribeType(), this.f45985i.campaignType));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m70521o(bcg0 bcg0Var) {
        return Boolean.valueOf(bcg0Var.f76143b == this.f45979c.hashCode());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70513g(this);
        setDrawingCacheEnabled(true);
        this.f45987k = new bf4(this.f45978b);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m70522p(bcg0 bcg0Var) {
        this.f45986j = bcg0Var.f76144c;
        bcg0Var.f76145d.call(Boolean.valueOf(TextUtils.equals(bcg0Var.f76142a, this.f45985i.campaignType)));
    }

    /* JADX INFO: renamed from: q */
    public final void m70523q(final BLiveCampaign bLiveCampaign) {
        if (m70518l()) {
            String strM154403e3 = this.f45982f.m154403e3();
            if (TextUtils.isEmpty(strM154403e3)) {
                this.f45983g.duringCreated(zrv.f205799a.m207656a()).subscribe(dhw.m115826e(new y20() { // from class: l.uhu
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f179054a.m70519m(bLiveCampaign, (AuthData) obj);
                    }
                }, new y20() { // from class: l.vhu
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        fhw.m125605a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m70517k(strM154403e3, this.f45979c, bLiveCampaign.entranceUrl);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m70524r(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo;
        if (jyb.m147479J(list) || this.f45986j == null || this.f45985i == null || (liveCampaignInfo = (LongLinkGiftMessage.LiveCampaignInfo) jyb.m147529r(list, new qcj() { // from class: l.qhu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157763a.m70520n((LongLinkGiftMessage.LiveCampaignInfo) obj);
            }
        })) == null) {
            return;
        }
        this.f45986j.mo152372a(liveCampaignInfo);
    }

    /* JADX INFO: renamed from: s */
    public final void m70525s() {
        psd0.m173633z(this.f45984h);
        this.f45984h = this.f45983g.duringCreated(this.f45982f.m97928K2().LiveVChatBridgeImplEvent.m70371c().m199270g()).filter(new qcj() { // from class: l.rhu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163198a.m70521o((bcg0) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.shu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168762a.m70522p((bcg0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m70526t() {
        psd0.m173633z(this.f45984h);
        this.f45979c.loadUrl("about:blank");
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: u */
    public void m70527u(BLiveCampaign bLiveCampaign, liu liuVar) {
        this.f45982f = liuVar;
        this.f45983g = liuVar.act();
        this.f45985i = bLiveCampaign;
        m70525s();
        this.f45987k.m103873b(bLiveCampaign);
        m70516j(bLiveCampaign, liuVar);
        m70523q(bLiveCampaign);
        bnl0.m105524M(this, true);
    }

    public LiveVChatCampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatCampaignItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

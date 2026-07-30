package com.p051p1.mobile.putong.live.livingroom.voice.intl.newoperation;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import java.util.HashMap;
import p153l.awr;
import p153l.bnl0;
import p153l.dhw;
import p153l.dpf0;
import p153l.fhw;
import p153l.gdo0;
import p153l.ntp0;
import p153l.nxl;
import p153l.qdo0;
import p153l.w0c;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceNewOperationItemWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceNewOperationItemWebView f54132a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f54133b;

    /* JADX INFO: renamed from: c */
    public MKWebView f54134c;

    /* JADX INFO: renamed from: d */
    public View f54135d;

    /* JADX INFO: renamed from: e */
    public w0c f54136e;

    /* JADX INFO: renamed from: f */
    public Act f54137f;

    /* JADX INFO: renamed from: g */
    public String f54138g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationItemWebView$a */
    public class C13192a extends dpf0 {
        public C13192a(nxl nxlVar) {
            super(nxlVar);
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            super.mo17978e(webView, i, str, str2);
            fhw.m125605a("[live]campaign", "onReceivedErrorX message = " + str);
            awr.m100708b(i, str, str2, VoiceNewOperationItemWebView.class.getName());
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            super.mo17979f(webView, str);
        }
    }

    public VoiceNewOperationItemWebView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m79471d(View view) {
        gdo0.m129936a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m79472e(final BLiveVoiceCampaign bLiveVoiceCampaign, final qdo0 qdo0Var) {
        w0c w0cVar = new w0c();
        this.f54136e = w0cVar;
        w0cVar.m17975z((Activity) getContext(), this.f54134c);
        this.f54136e.m204137M((PutongAct) getContext(), "", this.f54134c, "");
        this.f54134c.setBackgroundColor(0);
        this.f54134c.setMKWebLoadListener(new C13192a(this.f54136e));
        boolean z = bLiveVoiceCampaign.isH5HandleClick;
        View view = this.f54135d;
        if (z) {
            bnl0.m105524M(view, false);
            bnl0.m105509E0(this.f54135d, null);
        } else {
            bnl0.m105524M(view, true);
            bnl0.m105509E0(this.f54135d, new View.OnClickListener() { // from class: l.fdo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    qdo0Var.m176200b4(bLiveVoiceCampaign);
                }
            });
        }
        this.f54134c.getSettings().setCacheMode(-1);
        this.f54134c.onResume();
    }

    /* JADX INFO: renamed from: f */
    public final void m79473f(String str, MKWebView mKWebView, String str2) {
        HashMap map = new HashMap();
        if (ntp0.m164746d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m79474g() {
        Act act = this.f54137f;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m79475h(BLiveVoiceCampaign bLiveVoiceCampaign, AuthData authData) {
        String str = authData.accessToken;
        this.f54138g = str;
        m79473f(str, this.f54134c, bLiveVoiceCampaign.entranceUrl);
    }

    /* JADX INFO: renamed from: i */
    public final void m79476i(final BLiveVoiceCampaign bLiveVoiceCampaign) {
        if (m79474g()) {
            if (TextUtils.isEmpty(this.f54138g)) {
                this.f54137f.duringCreated(zrv.f205799a.m207656a()).subscribe(dhw.m115826e(new y20() { // from class: l.ddo0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f87952a.m79475h(bLiveVoiceCampaign, (AuthData) obj);
                    }
                }, new y20() { // from class: l.edo0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        fhw.m125605a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m79473f(this.f54138g, this.f54134c, bLiveVoiceCampaign.entranceUrl);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m79477j(BLiveVoiceCampaign bLiveVoiceCampaign, qdo0 qdo0Var) {
        this.f54137f = qdo0Var.act();
        m79472e(bLiveVoiceCampaign, qdo0Var);
        m79476i(bLiveVoiceCampaign);
        bnl0.m105524M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79471d(this);
        setDrawingCacheEnabled(true);
    }

    public VoiceNewOperationItemWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceNewOperationItemWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

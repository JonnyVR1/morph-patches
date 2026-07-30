package com.p046p1.mobile.putong.live.livingroom.voice.intl.newoperation;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.HashMap;
import p149l.c4o0;
import p149l.e30;
import p149l.ffw;
import p149l.hfw;
import p149l.izb;
import p149l.jkp0;
import p149l.m4o0;
import p149l.wul;
import p149l.xdl0;
import p149l.ypv;
import p149l.ztr;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceNewOperationItemWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceNewOperationItemWebView f53284a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f53285b;

    /* JADX INFO: renamed from: c */
    public MKWebView f53286c;

    /* JADX INFO: renamed from: d */
    public View f53287d;

    /* JADX INFO: renamed from: e */
    public izb f53288e;

    /* JADX INFO: renamed from: f */
    public Act f53289f;

    /* JADX INFO: renamed from: g */
    public String f53290g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationItemWebView$a */
    public class C13029a extends MKWebViewHelper.C14921b {
        public C13029a(wul wulVar) {
            super(wulVar);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            super.mo43911e(webView, i, str, str2);
            hfw.m130790a("[live]campaign", "onReceivedErrorX message = " + str);
            ztr.m220137b(i, str, str2, VoiceNewOperationItemWebView.class.getName());
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            super.mo43912f(webView, str);
        }
    }

    public VoiceNewOperationItemWebView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m78288d(View view) {
        c4o0.m105233a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m78289e(final BLiveVoiceCampaign bLiveVoiceCampaign, final m4o0 m4o0Var) {
        izb izbVar = new izb();
        this.f53288e = izbVar;
        izbVar.m87118q((Activity) getContext(), this.f53286c);
        this.f53288e.m139034A((PutongAct) getContext(), "", this.f53286c, "");
        this.f53286c.setBackgroundColor(0);
        this.f53286c.setMKWebLoadListener(new C13029a(this.f53288e));
        boolean z = bLiveVoiceCampaign.isH5HandleClick;
        View view = this.f53287d;
        if (z) {
            xdl0.m208344M(view, false);
            xdl0.m208329E0(this.f53287d, null);
        } else {
            xdl0.m208344M(view, true);
            xdl0.m208329E0(this.f53287d, new View.OnClickListener() { // from class: l.b4o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    m4o0Var.m153073b4(bLiveVoiceCampaign);
                }
            });
        }
        this.f53286c.getSettings().setCacheMode(-1);
        this.f53286c.onResume();
    }

    /* JADX INFO: renamed from: f */
    public final void m78290f(String str, MKWebView mKWebView, String str2) {
        HashMap map = new HashMap();
        if (jkp0.m141904d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m78291g() {
        Act act = this.f53289f;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m78292h(BLiveVoiceCampaign bLiveVoiceCampaign, AuthData authData) {
        String str = authData.accessToken;
        this.f53290g = str;
        m78290f(str, this.f53286c, bLiveVoiceCampaign.entranceUrl);
    }

    /* JADX INFO: renamed from: i */
    public final void m78293i(final BLiveVoiceCampaign bLiveVoiceCampaign) {
        if (m78291g()) {
            if (TextUtils.isEmpty(this.f53290g)) {
                this.f53289f.duringCreated(ypv.f199493a.m199334a()).subscribe(ffw.m121194e(new e30() { // from class: l.z3o0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f201384a.m78292h(bLiveVoiceCampaign, (AuthData) obj);
                    }
                }, new e30() { // from class: l.a4o0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hfw.m130790a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m78290f(this.f53290g, this.f53286c, bLiveVoiceCampaign.entranceUrl);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m78294j(BLiveVoiceCampaign bLiveVoiceCampaign, m4o0 m4o0Var) {
        this.f53289f = m4o0Var.act();
        m78289e(bLiveVoiceCampaign, m4o0Var);
        m78293i(bLiveVoiceCampaign);
        xdl0.m208344M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78288d(this);
        setDrawingCacheEnabled(true);
    }

    public VoiceNewOperationItemWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceNewOperationItemWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

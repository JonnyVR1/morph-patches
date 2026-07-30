package com.p000p1.mobile.putong.live.livingroom.voice.intl.newoperation;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import immomo.com.mklibrary.core.base.ui.MKWebViewHelper;
import java.util.HashMap;
import l.c4o0;
import l.e30;
import l.ffw;
import l.hfw;
import l.wul;
import l.xdl0;
import l.ztr;
import p009l.izb;
import p009l.jkp0;
import p009l.m4o0;
import p009l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceNewOperationItemWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceNewOperationItemWebView f6890a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f6891b;

    /* JADX INFO: renamed from: c */
    public MKWebView f6892c;

    /* JADX INFO: renamed from: d */
    public View f6893d;

    /* JADX INFO: renamed from: e */
    public izb f6894e;

    /* JADX INFO: renamed from: f */
    public Act f6895f;

    /* JADX INFO: renamed from: g */
    public String f6896g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationItemWebView$a */
    public class C0431a extends MKWebViewHelper.b {
        public C0431a(wul wulVar) {
            super(wulVar);
        }

        /* JADX INFO: renamed from: e */
        public void m8484e(WebView webView, int i, String str, String str2) {
            super.e(webView, i, str, str2);
            hfw.a("[live]campaign", "onReceivedErrorX message = " + str);
            ztr.b(i, str, str2, VoiceNewOperationItemWebView.class.getName());
        }

        /* JADX INFO: renamed from: f */
        public void m8485f(WebView webView, String str) {
            super.f(webView, str);
        }
    }

    public VoiceNewOperationItemWebView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m8477d(View view) {
        c4o0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m8478e(final BLiveVoiceCampaign bLiveVoiceCampaign, final m4o0 m4o0Var) {
        izb izbVar = new izb();
        this.f6894e = izbVar;
        izbVar.q((Activity) getContext(), this.f6892c);
        this.f6894e.m16803A((PutongAct) getContext(), "", this.f6892c, "");
        this.f6892c.setBackgroundColor(0);
        this.f6892c.setMKWebLoadListener(new C0431a(this.f6894e));
        boolean z = bLiveVoiceCampaign.isH5HandleClick;
        View view = this.f6893d;
        if (z) {
            xdl0.M(view, false);
            xdl0.E0(this.f6893d, (View.OnClickListener) null);
        } else {
            xdl0.M(view, true);
            xdl0.E0(this.f6893d, new View.OnClickListener() { // from class: l.b4o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    m4o0Var.m18240b4(bLiveVoiceCampaign);
                }
            });
        }
        this.f6892c.getSettings().setCacheMode(-1);
        this.f6892c.onResume();
    }

    /* JADX INFO: renamed from: f */
    public final void m8479f(String str, MKWebView mKWebView, String str2) {
        HashMap map = new HashMap();
        if (jkp0.m17145d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8480g() {
        Act act = this.f6895f;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m8481h(BLiveVoiceCampaign bLiveVoiceCampaign, AuthData authData) {
        String str = authData.accessToken;
        this.f6896g = str;
        m8479f(str, this.f6892c, bLiveVoiceCampaign.entranceUrl);
    }

    /* JADX INFO: renamed from: i */
    public final void m8482i(final BLiveVoiceCampaign bLiveVoiceCampaign) {
        if (m8480g()) {
            if (TextUtils.isEmpty(this.f6896g)) {
                this.f6895f.duringCreated(ypv.f23196a.m23644a()).subscribe(ffw.e(new e30() { // from class: l.z3o0
                    public final void call(Object obj) {
                        this.f23334a.m8481h(bLiveVoiceCampaign, (AuthData) obj);
                    }
                }, new e30() { // from class: l.a4o0
                    public final void call(Object obj) {
                        hfw.a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m8479f(this.f6896g, this.f6892c, bLiveVoiceCampaign.entranceUrl);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m8483j(BLiveVoiceCampaign bLiveVoiceCampaign, m4o0 m4o0Var) {
        this.f6895f = m4o0Var.act();
        m8478e(bLiveVoiceCampaign, m4o0Var);
        m8482i(bLiveVoiceCampaign);
        xdl0.M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8477d(this);
        setDrawingCacheEnabled(true);
    }

    public VoiceNewOperationItemWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceNewOperationItemWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

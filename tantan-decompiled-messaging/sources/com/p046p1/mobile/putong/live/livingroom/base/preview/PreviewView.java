package com.p046p1.mobile.putong.live.livingroom.base.preview;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaignLink;
import com.p046p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p046p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewBottomView;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewTopView;
import java.util.Map;
import p147v.VRelative;
import p149l.d30;
import p149l.e30;
import p149l.eet;
import p149l.fl80;
import p149l.hpd0;
import p149l.oar;
import p149l.qib0;
import p149l.qk80;
import p149l.s7m;
import p149l.t100;
import p149l.vdt;
import p149l.vwb;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class PreviewView extends VRelative implements s7m<qk80> {

    /* JADX INFO: renamed from: d */
    public LivePreviewTopView f47865d;

    /* JADX INFO: renamed from: e */
    public LivePreviewCampaignView f47866e;

    /* JADX INFO: renamed from: f */
    public LivePreviewBottomView f47867f;

    /* JADX INFO: renamed from: g */
    public qk80 f47868g;

    /* JADX INFO: renamed from: h */
    public final hpd0 f47869h;

    public PreviewView(Context context) {
        super(context);
        this.f47869h = new hpd0("live_beauty_red_point" + ypv.f199493a.m199309D0(), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m71947S(View view) {
        this.f47867f.m76531c();
        this.f47868g.m175215L5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m71948T(View view) {
        this.f47868g.m175213J5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m71949V(View view) {
        m71954c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m71950W(View view) {
        m71967i0("normal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m71951X(View view) {
        m71967i0("obs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m71952Y(View view) {
        m71963b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m71953Z(View view) {
        this.f47868g.m175240Y5();
    }

    /* JADX INFO: renamed from: c0 */
    private void m71954c0() {
        if (!vdt.m198092b(2)) {
            this.f47868g.m175214K5();
        } else if (!this.f47867f.m76535g()) {
            this.f47867f.m76530b();
        } else {
            this.f47868g.m175214K5();
            eet.m116003b(this.f47868g, "anchor_preivew_start_live", new e30() { // from class: l.dl80
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((Map) obj).put("isFirstTry", "true");
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    private void m71957r() {
        if (vdt.m198092b(2)) {
            this.f47865d.f52018j.setFilters(new InputFilter[]{new oar(20)});
        } else {
            m71960Q();
            this.f47865d.f52018j.setFilters(new InputFilter[]{new oar(48)});
        }
        xdl0.m208329E0(this.f47867f.f51989a, new View.OnClickListener() { // from class: l.wk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186733a.m71947S(view);
            }
        });
        this.f47867f.f51993e.setOnClickListener(new View.OnClickListener() { // from class: l.xk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193275a.m71948T(view);
            }
        });
        this.f47867f.setLiveBellSelected(true);
        xdl0.m208329E0(this.f47867f.f51994f, new View.OnClickListener() { // from class: l.yk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198735a.m71949V(view);
            }
        });
        xdl0.m208329E0(this.f47865d.f52011c, new View.OnClickListener() { // from class: l.zk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203520a.m71950W(view);
            }
        });
        xdl0.m208329E0(this.f47865d.f52012d, new View.OnClickListener() { // from class: l.al80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70417a.m71951X(view);
            }
        });
        xdl0.m208329E0(this.f47867f.f51992d, new View.OnClickListener() { // from class: l.bl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76170a.m71952Y(view);
            }
        });
        xdl0.m208329E0(this.f47865d.f52014f, new View.OnClickListener() { // from class: l.cl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81376a.m71953Z(view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: P */
    public final void m71959P(View view) {
        fl80.m121964a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final void m71960Q() {
        this.f47865d.f52018j.setInputType(131072);
        this.f47865d.f52018j.setSingleLine(false);
        xdl0.m208372e0(this.f47865d.f52013e, 0);
        ViewGroup.LayoutParams layoutParams = this.f47865d.f52018j.getLayoutParams();
        layoutParams.height = t100.m186890d(50.0f);
        this.f47865d.f52018j.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qk80 qk80Var) {
        this.f47868g = qk80Var;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m71962a0() {
        xdl0.m208344M(this.f47866e.f52003d, false);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m71963b0() {
        this.f47869h.put(Boolean.TRUE);
        this.f47868g.m175234V5();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m71964e0() {
        boolean zM76534f = this.f47867f.m76534f();
        LivePreviewBottomView livePreviewBottomView = this.f47867f;
        if (zM76534f) {
            livePreviewBottomView.setLiveBellSelected(false);
        } else {
            livePreviewBottomView.setLiveBellSelected(true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m71965g0(BLivePageCampaign bLivePageCampaign, e30<BLiveCampaignLink> e30Var) {
        if (TextUtils.isEmpty(bLivePageCampaign.title) || vwb.m200296J(bLivePageCampaign.campaignLinks)) {
            xdl0.m208344M(this.f47866e.f52003d, false);
        } else {
            xdl0.m208344M(this.f47866e.f52003d, true);
            this.f47866e.m76541H(bLivePageCampaign, e30Var, new d30() { // from class: l.el80
                @Override // p149l.d30
                public final void call() {
                    this.f92082a.m71962a0();
                }
            });
        }
    }

    public String getTitle() {
        return this.f47865d.f52018j.getText().toString();
    }

    /* JADX INFO: renamed from: h0 */
    public void m71966h0(boolean z) {
        LivePreviewTopView livePreviewTopView = this.f47865d;
        if (z) {
            livePreviewTopView.setCheckingStatus(ypv.f199497e.getString(R$string.f47125ab));
        } else {
            livePreviewTopView.setCheckingStatus(ypv.f199497e.getString(R$string.f47147bb));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m71967i0(String str) {
        if ("normal".equals(str)) {
            this.f47865d.f52011c.setSelected(true);
            this.f47865d.f52012d.setSelected(false);
            this.f47867f.f51994f.setText(R$string.f47301ib);
        } else if ("obs".equals(str)) {
            this.f47865d.f52011c.setSelected(false);
            this.f47865d.f52012d.setSelected(true);
            this.f47867f.f51994f.setText(R$string.f47279hb);
        }
        this.f47868g.m175217M5(str);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m71968j0() {
        return this.f47867f.m76534f();
    }

    /* JADX INFO: renamed from: k0 */
    public void m71969k0() {
        xdl0.m208344M(this.f47865d.f52010b, true);
        xdl0.m208344M(this.f47865d.f52012d, true);
    }

    /* JADX INFO: renamed from: m0 */
    public void m71970m0(BLivePushLimit bLivePushLimit) {
        if (bLivePushLimit.remaining <= 0 || qib0.f154693H.guessedCurrentServerTime() - bLivePushLimit.availableTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f47867f.setLiveBellSelected(false);
        } else {
            this.f47867f.setLiveBellSelected(true);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m71971n0(String str, String str2) {
        this.f47865d.setTitle(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f47865d.setAvatarUrl(str2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71959P(this);
        m71957r();
    }

    public void setPreviewContentVisibility(boolean z) {
        xdl0.m208344M(this.f47866e, z);
        xdl0.m208344M(this.f47867f, z);
        xdl0.m208344M(this.f47865d.f52013e, z);
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47869h = new hpd0("live_beauty_red_point" + ypv.f199493a.m199309D0(), Boolean.FALSE);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47869h = new hpd0("live_beauty_red_point" + ypv.f199493a.m199309D0(), Boolean.FALSE);
    }
}

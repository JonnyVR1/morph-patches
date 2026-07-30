package com.p051p1.mobile.putong.live.livingroom.base.preview;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaignLink;
import com.p051p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p051p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewBottomView;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewTopView;
import java.util.Map;
import p151v.VRelative;
import p153l.bnl0;
import p153l.fgt;
import p153l.iam;
import p153l.jt80;
import p153l.jxd0;
import p153l.jyb;
import p153l.qa00;
import p153l.qcr;
import p153l.uqb0;
import p153l.us80;
import p153l.wft;
import p153l.x20;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class PreviewView extends VRelative implements iam<us80> {

    /* JADX INFO: renamed from: d */
    public LivePreviewTopView f48713d;

    /* JADX INFO: renamed from: e */
    public LivePreviewCampaignView f48714e;

    /* JADX INFO: renamed from: f */
    public LivePreviewBottomView f48715f;

    /* JADX INFO: renamed from: g */
    public us80 f48716g;

    /* JADX INFO: renamed from: h */
    public final jxd0 f48717h;

    public PreviewView(Context context) {
        super(context);
        this.f48717h = new jxd0("live_beauty_red_point" + zrv.f205799a.m207631D0(), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m73130S(View view) {
        this.f48715f.m77714c();
        this.f48716g.m197765L5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m73131T(View view) {
        this.f48716g.m197763J5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m73132V(View view) {
        m73137c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m73133W(View view) {
        m73150i0("normal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m73134X(View view) {
        m73150i0("obs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m73135Y(View view) {
        m73146b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m73136Z(View view) {
        this.f48716g.m197790Y5();
    }

    /* JADX INFO: renamed from: c0 */
    private void m73137c0() {
        if (!wft.m206159b(2)) {
            this.f48716g.m197764K5();
        } else if (!this.f48715f.m77718g()) {
            this.f48715f.m77713b();
        } else {
            this.f48716g.m197764K5();
            fgt.m125530b(this.f48716g, "anchor_preivew_start_live", new y20() { // from class: l.ht80
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((Map) obj).put("isFirstTry", "true");
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    private void m73140r() {
        if (wft.m206159b(2)) {
            this.f48713d.f52866j.setFilters(new InputFilter[]{new qcr(20)});
        } else {
            m73143Q();
            this.f48713d.f52866j.setFilters(new InputFilter[]{new qcr(48)});
        }
        bnl0.m105509E0(this.f48715f.f52837a, new View.OnClickListener() { // from class: l.at80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73215a.m73130S(view);
            }
        });
        this.f48715f.f52841e.setOnClickListener(new View.OnClickListener() { // from class: l.bt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78339a.m73131T(view);
            }
        });
        this.f48715f.setLiveBellSelected(true);
        bnl0.m105509E0(this.f48715f.f52842f, new View.OnClickListener() { // from class: l.ct80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83674a.m73132V(view);
            }
        });
        bnl0.m105509E0(this.f48713d.f52859c, new View.OnClickListener() { // from class: l.dt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90550a.m73133W(view);
            }
        });
        bnl0.m105509E0(this.f48713d.f52860d, new View.OnClickListener() { // from class: l.et80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95705a.m73134X(view);
            }
        });
        bnl0.m105509E0(this.f48715f.f52840d, new View.OnClickListener() { // from class: l.ft80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100723a.m73135Y(view);
            }
        });
        bnl0.m105509E0(this.f48713d.f52862f, new View.OnClickListener() { // from class: l.gt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106390a.m73136Z(view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: P */
    public final void m73142P(View view) {
        jt80.m146889a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final void m73143Q() {
        this.f48713d.f52866j.setInputType(131072);
        this.f48713d.f52866j.setSingleLine(false);
        bnl0.m105552e0(this.f48713d.f52861e, 0);
        ViewGroup.LayoutParams layoutParams = this.f48713d.f52866j.getLayoutParams();
        layoutParams.height = qa00.m175859d(50.0f);
        this.f48713d.f52866j.setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(us80 us80Var) {
        this.f48716g = us80Var;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m73145a0() {
        bnl0.m105524M(this.f48714e.f52851d, false);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m73146b0() {
        this.f48717h.put(Boolean.TRUE);
        this.f48716g.m197784V5();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m73147e0() {
        boolean zM77717f = this.f48715f.m77717f();
        LivePreviewBottomView livePreviewBottomView = this.f48715f;
        if (zM77717f) {
            livePreviewBottomView.setLiveBellSelected(false);
        } else {
            livePreviewBottomView.setLiveBellSelected(true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m73148g0(BLivePageCampaign bLivePageCampaign, y20<BLiveCampaignLink> y20Var) {
        if (TextUtils.isEmpty(bLivePageCampaign.title) || jyb.m147479J(bLivePageCampaign.campaignLinks)) {
            bnl0.m105524M(this.f48714e.f52851d, false);
        } else {
            bnl0.m105524M(this.f48714e.f52851d, true);
            this.f48714e.m77724H(bLivePageCampaign, y20Var, new x20() { // from class: l.it80
                @Override // p153l.x20
                public final void call() {
                    this.f116807a.m73145a0();
                }
            });
        }
    }

    public String getTitle() {
        return this.f48713d.f52866j.getText().toString();
    }

    /* JADX INFO: renamed from: h0 */
    public void m73149h0(boolean z) {
        LivePreviewTopView livePreviewTopView = this.f48713d;
        if (z) {
            livePreviewTopView.setCheckingStatus(zrv.f205803e.getString(R$string.f47973ab));
        } else {
            livePreviewTopView.setCheckingStatus(zrv.f205803e.getString(R$string.f47995bb));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m73150i0(String str) {
        if ("normal".equals(str)) {
            this.f48713d.f52859c.setSelected(true);
            this.f48713d.f52860d.setSelected(false);
            this.f48715f.f52842f.setText(R$string.f48149ib);
        } else if ("obs".equals(str)) {
            this.f48713d.f52859c.setSelected(false);
            this.f48713d.f52860d.setSelected(true);
            this.f48715f.f52842f.setText(R$string.f48127hb);
        }
        this.f48716g.m197767M5(str);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m73151j0() {
        return this.f48715f.m77717f();
    }

    /* JADX INFO: renamed from: k0 */
    public void m73152k0() {
        bnl0.m105524M(this.f48713d.f52858b, true);
        bnl0.m105524M(this.f48713d.f52860d, true);
    }

    /* JADX INFO: renamed from: m0 */
    public void m73153m0(BLivePushLimit bLivePushLimit) {
        if (bLivePushLimit.remaining <= 0 || uqb0.f180376H.guessedCurrentServerTime() - bLivePushLimit.availableTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f48715f.setLiveBellSelected(false);
        } else {
            this.f48715f.setLiveBellSelected(true);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m73154n0(String str, String str2) {
        this.f48713d.setTitle(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f48713d.setAvatarUrl(str2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73142P(this);
        m73140r();
    }

    public void setPreviewContentVisibility(boolean z) {
        bnl0.m105524M(this.f48714e, z);
        bnl0.m105524M(this.f48715f, z);
        bnl0.m105524M(this.f48713d.f52861e, z);
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48717h = new jxd0("live_beauty_red_point" + zrv.f205799a.m207631D0(), Boolean.FALSE);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48717h = new jxd0("live_beauty_red_point" + zrv.f205799a.m207631D0(), Boolean.FALSE);
    }
}

package com.p000p1.mobile.putong.live.livingroom.base.preview;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveCampaignLink;
import com.p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p1.mobile.putong.live.livingroom.view.LivePreviewBottomView;
import com.p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;
import com.p1.mobile.putong.live.livingroom.view.LivePreviewTopView;
import java.util.Map;
import l.d30;
import l.e30;
import l.hpd0;
import l.oar;
import l.qib0;
import l.s7m;
import l.t100;
import l.vdt;
import l.vwb;
import l.xdl0;
import l.ypv;
import p002l.eet;
import p002l.fl80;
import p002l.qk80;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PreviewView extends VRelative implements s7m<qk80> {

    /* JADX INFO: renamed from: d */
    public LivePreviewTopView f3907d;

    /* JADX INFO: renamed from: e */
    public LivePreviewCampaignView f3908e;

    /* JADX INFO: renamed from: f */
    public LivePreviewBottomView f3909f;

    /* JADX INFO: renamed from: g */
    public qk80 f3910g;

    /* JADX INFO: renamed from: h */
    public final hpd0 f3911h;

    public PreviewView(Context context) {
        super(context);
        this.f3911h = new hpd0("live_beauty_red_point" + ypv.a.D0(), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m5332S(View view) {
        this.f3909f.c();
        this.f3910g.m21420L5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m5333T(View view) {
        this.f3910g.m21418J5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m5334V(View view) {
        m5339c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m5335W(View view) {
        m5353i0("normal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m5336X(View view) {
        m5353i0("obs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m5337Y(View view) {
        m5349b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m5338Z(View view) {
        this.f3910g.m21447Y5();
    }

    /* JADX INFO: renamed from: c0 */
    private void m5339c0() {
        if (!vdt.b(2)) {
            this.f3910g.m21419K5();
        } else if (!this.f3909f.g()) {
            this.f3909f.b();
        } else {
            this.f3910g.m21419K5();
            eet.m12448b(this.f3910g, "anchor_preivew_start_live", new e30() { // from class: l.dl80
                public final void call(Object obj) {
                    ((Map) obj).put("isFirstTry", "true");
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    private void m5342r() {
        if (vdt.b(2)) {
            this.f3907d.j.setFilters(new InputFilter[]{new oar(20)});
        } else {
            m5346Q();
            this.f3907d.j.setFilters(new InputFilter[]{new oar(48)});
        }
        xdl0.E0(this.f3909f.a, new View.OnClickListener() { // from class: l.wk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21807a.m5332S(view);
            }
        });
        this.f3909f.e.setOnClickListener(new View.OnClickListener() { // from class: l.xk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22332a.m5333T(view);
            }
        });
        this.f3909f.setLiveBellSelected(true);
        xdl0.E0(this.f3909f.f, new View.OnClickListener() { // from class: l.yk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22952a.m5334V(view);
            }
        });
        xdl0.E0(this.f3907d.c, new View.OnClickListener() { // from class: l.zk80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23476a.m5335W(view);
            }
        });
        xdl0.E0(this.f3907d.d, new View.OnClickListener() { // from class: l.al80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7716a.m5336X(view);
            }
        });
        xdl0.E0(this.f3909f.d, new View.OnClickListener() { // from class: l.bl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8252a.m5337Y(view);
            }
        });
        xdl0.E0(this.f3907d.f, new View.OnClickListener() { // from class: l.cl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8734a.m5338Z(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    public Context m5344C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: P */
    public final void m5345P(View view) {
        fl80.m13289a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final void m5346Q() {
        this.f3907d.j.setInputType(131072);
        this.f3907d.j.setSingleLine(false);
        xdl0.e0(this.f3907d.e, 0);
        ViewGroup.LayoutParams layoutParams = this.f3907d.j.getLayoutParams();
        layoutParams.height = t100.d(50.0f);
        this.f3907d.j.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m5354i1(qk80 qk80Var) {
        this.f3910g = qk80Var;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m5348a0() {
        xdl0.M(this.f3908e.d, false);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m5349b0() {
        this.f3911h.put(Boolean.TRUE);
        this.f3910g.m21441V5();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m5350e0() {
        boolean zF = this.f3909f.f();
        LivePreviewBottomView livePreviewBottomView = this.f3909f;
        if (zF) {
            livePreviewBottomView.setLiveBellSelected(false);
        } else {
            livePreviewBottomView.setLiveBellSelected(true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m5351g0(BLivePageCampaign bLivePageCampaign, e30<BLiveCampaignLink> e30Var) {
        if (TextUtils.isEmpty(bLivePageCampaign.title) || vwb.J(bLivePageCampaign.campaignLinks)) {
            xdl0.M(this.f3908e.d, false);
        } else {
            xdl0.M(this.f3908e.d, true);
            this.f3908e.H(bLivePageCampaign, e30Var, new d30() { // from class: l.el80
                public final void call() {
                    this.f9850a.m5348a0();
                }
            });
        }
    }

    public String getTitle() {
        return this.f3907d.j.getText().toString();
    }

    /* JADX INFO: renamed from: h0 */
    public void m5352h0(boolean z) {
        LivePreviewTopView livePreviewTopView = this.f3907d;
        if (z) {
            livePreviewTopView.setCheckingStatus(ypv.e.getString(R$string.f3167ab));
        } else {
            livePreviewTopView.setCheckingStatus(ypv.e.getString(R$string.f3189bb));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m5353i0(String str) {
        if ("normal".equals(str)) {
            this.f3907d.c.setSelected(true);
            this.f3907d.d.setSelected(false);
            this.f3909f.f.setText(R$string.f3343ib);
        } else if ("obs".equals(str)) {
            this.f3907d.c.setSelected(false);
            this.f3907d.d.setSelected(true);
            this.f3909f.f.setText(R$string.f3321hb);
        }
        this.f3910g.m21422M5(str);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m5355j0() {
        return this.f3909f.f();
    }

    /* JADX INFO: renamed from: k0 */
    public void m5356k0() {
        xdl0.M(this.f3907d.b, true);
        xdl0.M(this.f3907d.d, true);
    }

    /* JADX INFO: renamed from: m0 */
    public void m5357m0(BLivePushLimit bLivePushLimit) {
        if (bLivePushLimit.remaining <= 0 || qib0.H.guessedCurrentServerTime() - bLivePushLimit.availableTime <= 0.0d) {
            this.f3909f.setLiveBellSelected(false);
        } else {
            this.f3909f.setLiveBellSelected(true);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m5358n0(String str, String str2) {
        this.f3907d.setTitle(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f3907d.setAvatarUrl(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5345P(this);
        m5342r();
    }

    public void setPreviewContentVisibility(boolean z) {
        xdl0.M(this.f3908e, z);
        xdl0.M(this.f3909f, z);
        xdl0.M(this.f3907d.e, z);
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3911h = new hpd0("live_beauty_red_point" + ypv.a.D0(), Boolean.FALSE);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3911h = new hpd0("live_beauty_red_point" + ypv.a.D0(), Boolean.FALSE);
    }
}

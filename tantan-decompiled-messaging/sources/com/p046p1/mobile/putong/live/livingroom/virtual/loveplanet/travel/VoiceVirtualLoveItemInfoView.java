package com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VCheckBox;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.agv;
import p149l.alk0;
import p149l.b6p0;
import p149l.c45;
import p149l.h1c0;
import p149l.i3c0;
import p149l.j4p0;
import p149l.kvc0;
import p149l.t100;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLoveItemInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Guideline f52528d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f52529e;

    /* JADX INFO: renamed from: f */
    public ImageView f52530f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f52531g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f52532h;

    /* JADX INFO: renamed from: i */
    public CommonMaskAvatarView f52533i;

    /* JADX INFO: renamed from: j */
    public TextView f52534j;

    /* JADX INFO: renamed from: k */
    public VLinear f52535k;

    /* JADX INFO: renamed from: l */
    public TextView f52536l;

    /* JADX INFO: renamed from: m */
    public VText f52537m;

    /* JADX INFO: renamed from: n */
    public VLinear f52538n;

    /* JADX INFO: renamed from: o */
    public ImageView f52539o;

    /* JADX INFO: renamed from: p */
    public TextView f52540p;

    /* JADX INFO: renamed from: q */
    public TextView f52541q;

    /* JADX INFO: renamed from: r */
    public VFrame f52542r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f52543s;

    /* JADX INFO: renamed from: t */
    public BLiveLovePlanetPlayerInfo f52544t;

    /* JADX INFO: renamed from: u */
    public c45 f52545u;

    /* JADX INFO: renamed from: v */
    public String f52546v;

    public VoiceVirtualLoveItemInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: n0 */
    private void m77158n0(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
        String str = bLiveCallEffectConfig == null ? "https://fe-static.tancdn.com/v1/raw/dca27774-97f5-4987-b63e-14793e7db35912.svga" : bLiveCallEffectConfig.circleVoicingUrl;
        if (this.f52532h.isAnimating() && TextUtils.equals(str, this.f52546v)) {
            return;
        }
        this.f52546v = str;
        this.f52532h.m68500j(str, -1);
    }

    /* JADX INFO: renamed from: t0 */
    private void m77159t0() {
        if (NullChecker.m81303a(this.f52532h)) {
            this.f52532h.stopAnimation(true);
        }
        this.f52533i.m72129t0();
    }

    public BLiveLovePlanetPlayerInfo getBindInfo() {
        return this.f52544t;
    }

    public BLiveLovePlanetPlayerInfo getBindPlayerInfo() {
        return this.f52544t;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77160j0(View view) {
        b6p0.m100468a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m77161k0(String str) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.f52544t;
        return bLiveLovePlanetPlayerInfo != null && TextUtils.equals(str, bLiveLovePlanetPlayerInfo.userId);
    }

    /* JADX INFO: renamed from: l0 */
    public void m77162l0(String str) {
        this.f52529e.mo68497g(str, -1, null, true);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m77163m0(j4p0 j4p0Var, BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, View view) {
        VCheckBox vCheckBox = this.f52543s;
        vCheckBox.setChecked(!vCheckBox.isChecked());
        j4p0Var.m139755z4(bLiveLovePlanetPlayerInfo.position, bLiveLovePlanetPlayerInfo.userId, this.f52543s.isChecked());
    }

    /* JADX INFO: renamed from: o0 */
    public void m77164o0(int i) {
        this.f52544t = null;
        m77159t0();
        xdl0.m208360X(this.f52531g, t100.m186890d(23.0f));
        xdl0.m208345M0(this.f52533i, false);
        this.f52533i.m72119i0();
        this.f52536l.setBackgroundResource(i3c0.f110987e1);
        this.f52536l.setText(String.format("%d", Integer.valueOf(i)));
        this.f52537m.setText("虚位以待");
        xdl0.m208344M(this.f52541q, false);
        xdl0.m208344M(this.f52538n, false);
        xdl0.m208344M(this.f52542r, false);
        this.f52545u.m105202b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77159t0();
        m77168s0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77160j0(this);
        this.f52545u = new c45(this.f52533i.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: p0 */
    public void m77165p0(final j4p0 j4p0Var, final BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, String str, BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo2) {
        if (!TextUtils.equals(str, ypv.f199493a.m199309D0())) {
            if (TextUtils.equals(ypv.f199493a.m199309D0(), bLiveLovePlanetPlayerInfo.userId) || bLiveLovePlanetPlayerInfo2 == null) {
                xdl0.m208344M(this.f52542r, false);
            } else {
                xdl0.m208344M(this.f52542r, true);
                this.f52543s.setChecked(bLiveLovePlanetPlayerInfo2.selectPosition == ((long) bLiveLovePlanetPlayerInfo.position));
                this.f52542r.setOnClickListener(new View.OnClickListener() { // from class: l.a6p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f67787a.m77163m0(j4p0Var, bLiveLovePlanetPlayerInfo, view);
                    }
                });
            }
            xdl0.m208344M(this.f52541q, false);
            return;
        }
        xdl0.m208344M(this.f52542r, false);
        xdl0.m208344M(this.f52541q, true);
        long j = bLiveLovePlanetPlayerInfo.selectPosition;
        TextView textView = this.f52541q;
        if (j > 0) {
            textView.setTextColor(kvc0.m147352a(h1c0.f105362e1));
            this.f52541q.setBackgroundResource(i3c0.f110725H3);
            this.f52541q.setText(String.format("已选%d号", Long.valueOf(bLiveLovePlanetPlayerInfo.selectPosition)));
        } else {
            textView.setTextColor(kvc0.m147352a(h1c0.f105395p1));
            this.f52541q.setBackgroundResource(i3c0.f110737I3);
            this.f52541q.setText("未选择");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m77166q0(j4p0 j4p0Var, BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, String str) {
        m77162l0(str);
        m77167r0(j4p0Var, bLiveLovePlanetPlayerInfo);
        xdl0.m208360X(this.f52531g, t100.m186890d(23.0f));
    }

    /* JADX INFO: renamed from: r0 */
    public void m77167r0(final j4p0 j4p0Var, final BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        xdl0.m208344M(this.f52541q, false);
        xdl0.m208344M(this.f52542r, false);
        xdl0.m208360X(this.f52531g, 0);
        xdl0.m208344M(this.f52533i, true);
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = bLiveLovePlanetPlayerInfo.avatarConfig;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveMaskAvatarConfig != null ? bLiveMaskAvatarConfig.frameConfig : null;
        agv.m96349g(this.f52533i, t100.m186890d(44.0f), bLiveLovePlanetPlayerInfo.getAvatarUrl(), bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.staticUrl : null, bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.dynamicUrl : null);
        xdl0.m208329E0(this.f52533i, new View.OnClickListener() { // from class: l.z5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j4p0Var.m139750u4(bLiveLovePlanetPlayerInfo.userId);
            }
        });
        xdl0.m208344M(this.f52534j, bLiveLovePlanetPlayerInfo.isLeave);
        if (bLiveLovePlanetPlayerInfo.isLeave) {
            m77159t0();
        }
        this.f52537m.setTextColor(-1);
        this.f52537m.setText(w8u.m202213p(bLiveLovePlanetPlayerInfo.userName, 3));
        boolean zEquals = TextUtils.equals(bLiveLovePlanetPlayerInfo.gender, "male");
        TextView textView = this.f52536l;
        if (zEquals) {
            textView.setBackgroundResource(i3c0.f110661C);
        } else {
            textView.setBackgroundResource(i3c0.f111082m0);
        }
        this.f52536l.setText(String.format("%d", Integer.valueOf(bLiveLovePlanetPlayerInfo.position)));
        xdl0.m208344M(this.f52538n, true);
        this.f52540p.setText(x8u.m207433c(bLiveLovePlanetPlayerInfo.receivedScore));
        this.f52544t = bLiveLovePlanetPlayerInfo;
        this.f52545u.m105204d(bLiveLovePlanetPlayerInfo.avatarConfig);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m77168s0() {
        if (NullChecker.m81303a(this.f52529e)) {
            this.f52529e.stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m77169u0(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.f52544t;
        if (bLiveLovePlanetPlayerInfo == null || !TextUtils.equals(bLiveLovePlanetPlayerInfo.userId, bLiveVoiceCall.user)) {
            m77159t0();
            return;
        }
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || alk0.m97312k(bLiveVoiceCall)) {
            m77159t0();
            return;
        }
        m77158n0(bLiveVoiceCall);
        CommonMaskAvatarView commonMaskAvatarView = this.f52533i;
        if (z) {
            commonMaskAvatarView.m72128s0();
        } else {
            commonMaskAvatarView.m72129t0();
        }
    }

    public VoiceVirtualLoveItemInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceVirtualLoveItemInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

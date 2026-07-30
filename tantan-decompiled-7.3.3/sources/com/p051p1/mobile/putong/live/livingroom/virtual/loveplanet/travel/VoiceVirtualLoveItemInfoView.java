package com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VCheckBox;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.d55;
import p153l.ffp0;
import p153l.guk0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.ndp0;
import p153l.obc0;
import p153l.qa00;
import p153l.xau;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLoveItemInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Guideline f53376d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f53377e;

    /* JADX INFO: renamed from: f */
    public ImageView f53378f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f53379g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f53380h;

    /* JADX INFO: renamed from: i */
    public CommonMaskAvatarView f53381i;

    /* JADX INFO: renamed from: j */
    public TextView f53382j;

    /* JADX INFO: renamed from: k */
    public VLinear f53383k;

    /* JADX INFO: renamed from: l */
    public TextView f53384l;

    /* JADX INFO: renamed from: m */
    public VText f53385m;

    /* JADX INFO: renamed from: n */
    public VLinear f53386n;

    /* JADX INFO: renamed from: o */
    public ImageView f53387o;

    /* JADX INFO: renamed from: p */
    public TextView f53388p;

    /* JADX INFO: renamed from: q */
    public TextView f53389q;

    /* JADX INFO: renamed from: r */
    public VFrame f53390r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f53391s;

    /* JADX INFO: renamed from: t */
    public BLiveLovePlanetPlayerInfo f53392t;

    /* JADX INFO: renamed from: u */
    public d55 f53393u;

    /* JADX INFO: renamed from: v */
    public String f53394v;

    public VoiceVirtualLoveItemInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: n0 */
    private void m78341n0(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
        String str = bLiveCallEffectConfig == null ? "https://fe-static.tancdn.com/v1/raw/dca27774-97f5-4987-b63e-14793e7db35912.svga" : bLiveCallEffectConfig.circleVoicingUrl;
        if (this.f53380h.isAnimating() && TextUtils.equals(str, this.f53394v)) {
            return;
        }
        this.f53394v = str;
        this.f53380h.m69683j(str, -1);
    }

    /* JADX INFO: renamed from: t0 */
    private void m78342t0() {
        if (NullChecker.m82486a(this.f53380h)) {
            this.f53380h.stopAnimation(true);
        }
        this.f53381i.m73312t0();
    }

    public BLiveLovePlanetPlayerInfo getBindInfo() {
        return this.f53392t;
    }

    public BLiveLovePlanetPlayerInfo getBindPlayerInfo() {
        return this.f53392t;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78343j0(View view) {
        ffp0.m125409a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m78344k0(String str) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.f53392t;
        return bLiveLovePlanetPlayerInfo != null && TextUtils.equals(str, bLiveLovePlanetPlayerInfo.userId);
    }

    /* JADX INFO: renamed from: l0 */
    public void m78345l0(String str) {
        this.f53377e.mo69680g(str, -1, null, true);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m78346m0(ndp0 ndp0Var, BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, View view) {
        VCheckBox vCheckBox = this.f53391s;
        vCheckBox.setChecked(!vCheckBox.isChecked());
        ndp0Var.m162783z4(bLiveLovePlanetPlayerInfo.position, bLiveLovePlanetPlayerInfo.userId, this.f53391s.isChecked());
    }

    /* JADX INFO: renamed from: o0 */
    public void m78347o0(int i) {
        this.f53392t = null;
        m78342t0();
        bnl0.m105540X(this.f53379g, qa00.m175859d(23.0f));
        bnl0.m105525M0(this.f53381i, false);
        this.f53381i.m73302i0();
        this.f53384l.setBackgroundResource(obc0.f146315e1);
        this.f53384l.setText(String.format("%d", Integer.valueOf(i)));
        this.f53385m.setText("虚位以待");
        bnl0.m105524M(this.f53389q, false);
        bnl0.m105524M(this.f53386n, false);
        bnl0.m105524M(this.f53390r, false);
        this.f53393u.m114258b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m78342t0();
        m78351s0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78343j0(this);
        this.f53393u = new d55(this.f53381i.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: p0 */
    public void m78348p0(final ndp0 ndp0Var, final BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, String str, BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo2) {
        if (!TextUtils.equals(str, zrv.f205799a.m207631D0())) {
            if (TextUtils.equals(zrv.f205799a.m207631D0(), bLiveLovePlanetPlayerInfo.userId) || bLiveLovePlanetPlayerInfo2 == null) {
                bnl0.m105524M(this.f53390r, false);
            } else {
                bnl0.m105524M(this.f53390r, true);
                this.f53391s.setChecked(bLiveLovePlanetPlayerInfo2.selectPosition == ((long) bLiveLovePlanetPlayerInfo.position));
                this.f53390r.setOnClickListener(new View.OnClickListener() { // from class: l.efp0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f93812a.m78346m0(ndp0Var, bLiveLovePlanetPlayerInfo, view);
                    }
                });
            }
            bnl0.m105524M(this.f53389q, false);
            return;
        }
        bnl0.m105524M(this.f53390r, false);
        bnl0.m105524M(this.f53389q, true);
        long j = bLiveLovePlanetPlayerInfo.selectPosition;
        TextView textView = this.f53389q;
        if (j > 0) {
            textView.setTextColor(n3d0.m161277a(n9c0.f140823e1));
            this.f53389q.setBackgroundResource(obc0.f146053H3);
            this.f53389q.setText(String.format("已选%d号", Long.valueOf(bLiveLovePlanetPlayerInfo.selectPosition)));
        } else {
            textView.setTextColor(n3d0.m161277a(n9c0.f140856p1));
            this.f53389q.setBackgroundResource(obc0.f146065I3);
            this.f53389q.setText("未选择");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m78349q0(ndp0 ndp0Var, BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, String str) {
        m78345l0(str);
        m78350r0(ndp0Var, bLiveLovePlanetPlayerInfo);
        bnl0.m105540X(this.f53379g, qa00.m175859d(23.0f));
    }

    /* JADX INFO: renamed from: r0 */
    public void m78350r0(final ndp0 ndp0Var, final BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        bnl0.m105524M(this.f53389q, false);
        bnl0.m105524M(this.f53390r, false);
        bnl0.m105540X(this.f53379g, 0);
        bnl0.m105524M(this.f53381i, true);
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = bLiveLovePlanetPlayerInfo.avatarConfig;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveMaskAvatarConfig != null ? bLiveMaskAvatarConfig.frameConfig : null;
        biv.m104522g(this.f53381i, qa00.m175859d(44.0f), bLiveLovePlanetPlayerInfo.getAvatarUrl(), bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.staticUrl : null, bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.dynamicUrl : null);
        bnl0.m105509E0(this.f53381i, new View.OnClickListener() { // from class: l.dfp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ndp0Var.m162778u4(bLiveLovePlanetPlayerInfo.userId);
            }
        });
        bnl0.m105524M(this.f53382j, bLiveLovePlanetPlayerInfo.isLeave);
        if (bLiveLovePlanetPlayerInfo.isLeave) {
            m78342t0();
        }
        this.f53385m.setTextColor(-1);
        this.f53385m.setText(xau.m209906p(bLiveLovePlanetPlayerInfo.userName, 3));
        boolean zEquals = TextUtils.equals(bLiveLovePlanetPlayerInfo.gender, "male");
        TextView textView = this.f53384l;
        if (zEquals) {
            textView.setBackgroundResource(obc0.f145989C);
        } else {
            textView.setBackgroundResource(obc0.f146410m0);
        }
        this.f53384l.setText(String.format("%d", Integer.valueOf(bLiveLovePlanetPlayerInfo.position)));
        bnl0.m105524M(this.f53386n, true);
        this.f53388p.setText(yau.m214935c(bLiveLovePlanetPlayerInfo.receivedScore));
        this.f53392t = bLiveLovePlanetPlayerInfo;
        this.f53393u.m114260d(bLiveLovePlanetPlayerInfo.avatarConfig);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m78351s0() {
        if (NullChecker.m82486a(this.f53377e)) {
            this.f53377e.stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m78352u0(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.f53392t;
        if (bLiveLovePlanetPlayerInfo == null || !TextUtils.equals(bLiveLovePlanetPlayerInfo.userId, bLiveVoiceCall.user)) {
            m78342t0();
            return;
        }
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || guk0.m132332k(bLiveVoiceCall)) {
            m78342t0();
            return;
        }
        m78341n0(bLiveVoiceCall);
        CommonMaskAvatarView commonMaskAvatarView = this.f53381i;
        if (z) {
            commonMaskAvatarView.m73311s0();
        } else {
            commonMaskAvatarView.m73312t0();
        }
    }

    public VoiceVirtualLoveItemInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceVirtualLoveItemInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

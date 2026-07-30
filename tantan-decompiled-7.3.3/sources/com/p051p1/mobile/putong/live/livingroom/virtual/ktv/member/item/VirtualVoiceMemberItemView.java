package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.item;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberItemViewBindings;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.biv;
import p153l.bnl0;
import p153l.d55;
import p153l.f3t;
import p153l.fc2;
import p153l.fhw;
import p153l.guk0;
import p153l.h64;
import p153l.i9o0;
import p153l.izs;
import p153l.l6o0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.rwn0;
import p153l.s7m0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceMemberItemView extends LiveVirtualVoiceMemberItemViewBindings {

    /* JADX INFO: renamed from: o */
    @Nullable
    public BLiveVoiceCall f53205o;

    /* JADX INFO: renamed from: p */
    public nsv<h64> f53206p;

    /* JADX INFO: renamed from: q */
    public d55 f53207q;

    /* JADX INFO: renamed from: r */
    public String f53208r;

    /* JADX INFO: renamed from: s */
    public String f53209s;

    public VirtualVoiceMemberItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k0 */
    private void m78201k0(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
        String str = bLiveCallEffectConfig == null ? "https://auto.tancdn.com/v1/raw/5efbe412-9a82-49e6-80ea-36e6fa0dd34b10.pdf" : bLiveCallEffectConfig.horizontalVoicingUrl;
        if (this.f48976k.isAnimating() && TextUtils.equals(str, this.f53208r)) {
            return;
        }
        bnl0.m105524M(this.f48975j, false);
        bnl0.m105524M(this.f48976k, true);
        this.f53208r = str;
        this.f48976k.mo69685l(str, -1, null);
    }

    /* JADX INFO: renamed from: p0 */
    private void m78202p0() {
        AnimEffectPlayer animEffectPlayer = this.f48976k;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
            this.f48976k.setAnimListener(null);
            bnl0.m105524M(this.f48975j, true);
            bnl0.m105524M(this.f48976k, false);
            this.f53208r = "";
        }
    }

    public nsv<h64> getCallUser() {
        return this.f53206p;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78203j0(String str) {
        if (this.f48979n.isAnimating() && bnl0.m105529O0(this.f48979n) && TextUtils.equals(str, this.f53209s)) {
            return;
        }
        bnl0.m105524M(this.f48979n, true);
        this.f53209s = str;
        this.f48979n.m69683j(str, -1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m78204l0(String str, nsv<h64> nsvVar) {
        if (TextUtils.equals(str, "guideGoCallUser")) {
            this.f48972g.setImageResource(obc0.f146076J2);
            bnl0.m105524M(this.f48972g, true);
            bnl0.m105524M(this.f48970e, true);
            this.f48970e.setBackgroundResource(obc0.f146121N);
            bnl0.m105525M0(this.f48971f, false);
            this.f53207q.m114258b();
            m78202p0();
            return;
        }
        bnl0.m105525M0(this.f48971f, true);
        bnl0.m105524M(this.f48972g, false);
        nsv<h64> nsvVarM123807h = f3t.m123807h(nsvVar);
        this.f53206p = nsvVarM123807h;
        l6o0 l6o0VarM153068c = l6o0.m153068c(nsvVarM123807h);
        biv.m104518c(this.f48971f, qa00.m175859d(58.0f), nsvVarM123807h, new qcj() { // from class: l.p8m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((h64) obj).f107999c;
            }
        }, 1);
        if (!l6o0VarM153068c.m153071d() || !l6o0VarM153068c.f130275b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            bnl0.m105525M0(this.f48971f.getRealAvatarView(), true);
            bnl0.m105524M(this.f48970e, false);
            this.f53207q.m114258b();
        } else {
            bnl0.m105525M0(this.f48971f.getRealAvatarView(), false);
            bnl0.m105524M(this.f48970e, true);
            this.f53207q.m114261e(nsvVarM123807h);
            this.f48970e.setBackground(fc2.m124978h(Color.parseColor("#382121")));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m78205m0() {
        if (this.f48971f != null) {
            m78202p0();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m78206n0(s7m0<?> s7m0Var, String str, int i, String str2) {
        boolean zM139137h = i9o0.m139137h(s7m0Var);
        boolean zM139138i = i9o0.m139138i(s7m0Var);
        this.f48974i.setActualImageResource(-1);
        if ("anchor".equals(str)) {
            if (s7m0Var == null || !((rwn0) s7m0Var.m213810E2()).m183434i3()) {
                this.f48977l.setText(R$string.f48416uf);
            } else {
                this.f48977l.setText(R$string.f48460wf);
            }
            this.f48977l.setTextColor(n3d0.m161277a(n9c0.f140877w1));
            this.f48974i.setBackground(fc2.m124979i(Color.parseColor("#A35D25"), qa00.m175859d(10.0f)));
        } else if ("manager".equals(str)) {
            this.f48977l.setTextColor(n3d0.m161277a(n9c0.f140877w1));
            this.f48974i.setBackground(fc2.m124979i(Color.parseColor("#0B68AD"), qa00.m175859d(10.0f)));
            this.f48977l.setText(R$string.f48210l7);
        } else if ("default".equals(str) && guk0.m132331j(this.f53205o)) {
            this.f48977l.setTextColor(n3d0.m161277a(n9c0.f140877w1));
            this.f48974i.setBackground(fc2.m124979i(Color.parseColor("#7b70ff"), qa00.m175859d(10.0f)));
            this.f48977l.setText(R$string.f48172jd);
        } else {
            this.f48977l.setTextColor(n3d0.m161277a(n9c0.f140856p1));
            this.f48974i.setBackground(fc2.m124979i(n3d0.m161277a(n9c0.f140781M), qa00.m175859d(10.0f)));
            if (guk0.m132330i(str2)) {
                this.f48977l.setText(R$string.f48172jd);
            } else {
                if (-1 != i) {
                    this.f48977l.setText(String.valueOf(i));
                } else if (!zM139138i && !((rwn0) s7m0Var.m213810E2()).mo118373p()) {
                    this.f48977l.setText(R$string.f48482xf);
                } else if (zM139137h) {
                    this.f48977l.setText(R$string.f47631K6);
                }
                this.f48977l.setTextColor(n3d0.m161277a(n9c0.f140856p1));
            }
        }
        BLiveVoiceCall bLiveVoiceCall = this.f53205o;
        if (bLiveVoiceCall != null && bLiveVoiceCall.isVoiceGaming) {
            this.f48974i.setBackground(fc2.m124979i(n3d0.m161277a(n9c0.f140836j), qa00.m175859d(10.0f)));
            this.f48977l.setText("游戏中");
        }
        BLiveVoiceCall bLiveVoiceCall2 = this.f53205o;
        if (bLiveVoiceCall2 != null) {
            if (TEnum.equals(bLiveVoiceCall2.playInfoStatus, "playing") || TEnum.equals(this.f53205o.playInfoStatus, "pause") || TEnum.equals(this.f53205o.playInfoStatus, "prepare")) {
                this.f48977l.setText("演唱中");
                this.f48974i.setBackground(fc2.m124979i(n3d0.m161277a(n9c0.f140836j), qa00.m175859d(10.0f)));
                this.f48977l.setTextColor(n3d0.m161277a(n9c0.f140823e1));
            } else if (TEnum.equals(this.f53205o.playInfoStatus, "waiting")) {
                this.f48977l.setText("准备");
                this.f48977l.setTextColor(n3d0.m161277a(n9c0.f140823e1));
            }
        }
        BLiveVoiceCall bLiveVoiceCall3 = this.f53205o;
        if (bLiveVoiceCall3 == null || bLiveVoiceCall3.callEffect == null) {
            return;
        }
        this.f48974i.setBackground(null);
        izs.m142870u("context_livingAct", this.f48974i, this.f53205o.callEffect.horizontalBg, qa00.m175859d(20.0f), qa00.m175859d(13.0f));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78207o0() {
        if (NullChecker.m82486a(this.f48979n)) {
            this.f48979n.stopAnimation(true);
            bnl0.m105524M(this.f48979n, false);
            this.f53209s = "";
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m78205m0();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberItemViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f48971f.setMaskUnLimit(true);
        this.f53207q = new d55(this.f48971f.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: q0 */
    public void m78208q0(String str) {
        if (TextUtils.isEmpty(str)) {
            m78207o0();
        } else {
            m78203j0(str);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m78209r0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || guk0.m132332k(bLiveVoiceCall)) {
            m78202p0();
        } else {
            m78201k0(bLiveVoiceCall);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m78210s0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || guk0.m132332k(bLiveVoiceCall)) {
            this.f48971f.m73312t0();
            return;
        }
        if (l6o0.m153068c(this.f53206p).m153071d()) {
            BLiveUserMask bLiveUserMask = l6o0.m153068c(this.f53206p).f130275b;
            if (NullChecker.m82486a(bLiveUserMask) && NullChecker.m82486a(bLiveUserMask.avatarConfig) && NullChecker.m82486a(bLiveUserMask.avatarConfig.frameConfig) && bLiveUserMask.avatarConfig.frameConfig.checkNeedChangeVoice()) {
                this.f48971f.m73311s0();
            }
        }
    }

    public void setCallInfo(BLiveVoiceCall bLiveVoiceCall) {
        this.f53205o = bLiveVoiceCall;
        if (bLiveVoiceCall == null) {
            fhw.m125605a("[live][voice]", "call is null");
            m78202p0();
            bnl0.m105525M0(this.f48973h, false);
            return;
        }
        fhw.m125605a("[live][voice]", bLiveVoiceCall.toJson());
        bnl0.m105525M0(this.f48973h, true);
        if (bLiveVoiceCall.isVoiceGaming) {
            this.f48975j.setActualImageResource(obc0.f146175R8);
        } else if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
            BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
            VDraweeView vDraweeView = this.f48975j;
            if (bLiveCallEffectConfig == null) {
                vDraweeView.setActualImageResource(obc0.f146176R9);
            } else {
                izs.m142868s("context_livingAct", vDraweeView, bLiveCallEffectConfig.muteIcon);
            }
        } else {
            BLiveCallEffectConfig bLiveCallEffectConfig2 = bLiveVoiceCall.callEffect;
            VDraweeView vDraweeView2 = this.f48975j;
            if (bLiveCallEffectConfig2 == null) {
                vDraweeView2.setActualImageResource(obc0.f146187S9);
            } else {
                izs.m142868s("context_livingAct", vDraweeView2, bLiveCallEffectConfig2.defaultIcon);
            }
        }
        m78209r0(bLiveVoiceCall);
        m78210s0(bLiveVoiceCall);
    }

    public VirtualVoiceMemberItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceMemberItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

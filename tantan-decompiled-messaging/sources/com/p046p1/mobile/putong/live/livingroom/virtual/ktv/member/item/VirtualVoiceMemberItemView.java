package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.item;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberItemViewBindings;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.agv;
import p149l.alk0;
import p149l.c45;
import p149l.e0o0;
import p149l.e1t;
import p149l.h1c0;
import p149l.hfw;
import p149l.hxn0;
import p149l.hxs;
import p149l.i3c0;
import p149l.i54;
import p149l.kvc0;
import p149l.mqv;
import p149l.nnn0;
import p149l.oyl0;
import p149l.t100;
import p149l.w9j;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceMemberItemView extends LiveVirtualVoiceMemberItemViewBindings {

    /* JADX INFO: renamed from: o */
    @Nullable
    public BLiveVoiceCall f52357o;

    /* JADX INFO: renamed from: p */
    public mqv<i54> f52358p;

    /* JADX INFO: renamed from: q */
    public c45 f52359q;

    /* JADX INFO: renamed from: r */
    public String f52360r;

    /* JADX INFO: renamed from: s */
    public String f52361s;

    public VirtualVoiceMemberItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k0 */
    private void m77018k0(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
        String str = bLiveCallEffectConfig == null ? "https://auto.tancdn.com/v1/raw/5efbe412-9a82-49e6-80ea-36e6fa0dd34b10.pdf" : bLiveCallEffectConfig.horizontalVoicingUrl;
        if (this.f48128k.isAnimating() && TextUtils.equals(str, this.f52360r)) {
            return;
        }
        xdl0.m208344M(this.f48127j, false);
        xdl0.m208344M(this.f48128k, true);
        this.f52360r = str;
        this.f48128k.mo68502l(str, -1, null);
    }

    /* JADX INFO: renamed from: p0 */
    private void m77019p0() {
        AnimEffectPlayer animEffectPlayer = this.f48128k;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
            this.f48128k.setAnimListener(null);
            xdl0.m208344M(this.f48127j, true);
            xdl0.m208344M(this.f48128k, false);
            this.f52360r = "";
        }
    }

    public mqv<i54> getCallUser() {
        return this.f52358p;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77020j0(String str) {
        if (this.f48131n.isAnimating() && xdl0.m208349O0(this.f48131n) && TextUtils.equals(str, this.f52361s)) {
            return;
        }
        xdl0.m208344M(this.f48131n, true);
        this.f52361s = str;
        this.f48131n.m68500j(str, -1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m77021l0(String str, mqv<i54> mqvVar) {
        if (TextUtils.equals(str, "guideGoCallUser")) {
            this.f48124g.setImageResource(i3c0.f110748J2);
            xdl0.m208344M(this.f48124g, true);
            xdl0.m208344M(this.f48122e, true);
            this.f48122e.setBackgroundResource(i3c0.f110793N);
            xdl0.m208345M0(this.f48123f, false);
            this.f52359q.m105202b();
            m77019p0();
            return;
        }
        xdl0.m208345M0(this.f48123f, true);
        xdl0.m208344M(this.f48124g, false);
        mqv<i54> mqvVarM114446h = e1t.m114446h(mqvVar);
        this.f52358p = mqvVarM114446h;
        hxn0 hxn0VarM133350c = hxn0.m133350c(mqvVarM114446h);
        agv.m96345c(this.f48123f, t100.m186890d(58.0f), mqvVarM114446h, new w9j() { // from class: l.lzl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((i54) obj).f111522c;
            }
        }, 1);
        if (!hxn0VarM133350c.m133353d() || !hxn0VarM133350c.f109896b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            xdl0.m208345M0(this.f48123f.getRealAvatarView(), true);
            xdl0.m208344M(this.f48122e, false);
            this.f52359q.m105202b();
        } else {
            xdl0.m208345M0(this.f48123f.getRealAvatarView(), false);
            xdl0.m208344M(this.f48122e, true);
            this.f52359q.m105205e(mqvVarM114446h);
            this.f48122e.setBackground(yb2.m213883h(Color.parseColor("#382121")));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m77022m0() {
        if (this.f48123f != null) {
            m77019p0();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m77023n0(oyl0<?> oyl0Var, String str, int i, String str2) {
        boolean zM114322h = e0o0.m114322h(oyl0Var);
        boolean zM114323i = e0o0.m114323i(oyl0Var);
        this.f48126i.setActualImageResource(-1);
        if ("anchor".equals(str)) {
            if (oyl0Var == null || !((nnn0) oyl0Var.m206027E2()).m160271i3()) {
                this.f48129l.setText(R$string.f47568uf);
            } else {
                this.f48129l.setText(R$string.f47612wf);
            }
            this.f48129l.setTextColor(kvc0.m147352a(h1c0.f105416w1));
            this.f48126i.setBackground(yb2.m213884i(Color.parseColor("#A35D25"), t100.m186890d(10.0f)));
        } else if ("manager".equals(str)) {
            this.f48129l.setTextColor(kvc0.m147352a(h1c0.f105416w1));
            this.f48126i.setBackground(yb2.m213884i(Color.parseColor("#0B68AD"), t100.m186890d(10.0f)));
            this.f48129l.setText(R$string.f47362l7);
        } else if ("default".equals(str) && alk0.m97311j(this.f52357o)) {
            this.f48129l.setTextColor(kvc0.m147352a(h1c0.f105416w1));
            this.f48126i.setBackground(yb2.m213884i(Color.parseColor("#7b70ff"), t100.m186890d(10.0f)));
            this.f48129l.setText(R$string.f47324jd);
        } else {
            this.f48129l.setTextColor(kvc0.m147352a(h1c0.f105395p1));
            this.f48126i.setBackground(yb2.m213884i(kvc0.m147352a(h1c0.f105320M), t100.m186890d(10.0f)));
            if (alk0.m97310i(str2)) {
                this.f48129l.setText(R$string.f47324jd);
            } else {
                if (-1 != i) {
                    this.f48129l.setText(String.valueOf(i));
                } else if (!zM114323i && !((nnn0) oyl0Var.m206027E2()).mo97490p()) {
                    this.f48129l.setText(R$string.f47634xf);
                } else if (zM114322h) {
                    this.f48129l.setText(R$string.f46783K6);
                }
                this.f48129l.setTextColor(kvc0.m147352a(h1c0.f105395p1));
            }
        }
        BLiveVoiceCall bLiveVoiceCall = this.f52357o;
        if (bLiveVoiceCall != null && bLiveVoiceCall.isVoiceGaming) {
            this.f48126i.setBackground(yb2.m213884i(kvc0.m147352a(h1c0.f105375j), t100.m186890d(10.0f)));
            this.f48129l.setText("游戏中");
        }
        BLiveVoiceCall bLiveVoiceCall2 = this.f52357o;
        if (bLiveVoiceCall2 != null) {
            if (TEnum.equals(bLiveVoiceCall2.playInfoStatus, "playing") || TEnum.equals(this.f52357o.playInfoStatus, "pause") || TEnum.equals(this.f52357o.playInfoStatus, "prepare")) {
                this.f48129l.setText("演唱中");
                this.f48126i.setBackground(yb2.m213884i(kvc0.m147352a(h1c0.f105375j), t100.m186890d(10.0f)));
                this.f48129l.setTextColor(kvc0.m147352a(h1c0.f105362e1));
            } else if (TEnum.equals(this.f52357o.playInfoStatus, "waiting")) {
                this.f48129l.setText("准备");
                this.f48129l.setTextColor(kvc0.m147352a(h1c0.f105362e1));
            }
        }
        BLiveVoiceCall bLiveVoiceCall3 = this.f52357o;
        if (bLiveVoiceCall3 == null || bLiveVoiceCall3.callEffect == null) {
            return;
        }
        this.f48126i.setBackground(null);
        hxs.m133408u("context_livingAct", this.f48126i, this.f52357o.callEffect.horizontalBg, t100.m186890d(20.0f), t100.m186890d(13.0f));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m77024o0() {
        if (NullChecker.m81303a(this.f48131n)) {
            this.f48131n.stopAnimation(true);
            xdl0.m208344M(this.f48131n, false);
            this.f52361s = "";
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77022m0();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberItemViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f48123f.setMaskUnLimit(true);
        this.f52359q = new c45(this.f48123f.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: q0 */
    public void m77025q0(String str) {
        if (TextUtils.isEmpty(str)) {
            m77024o0();
        } else {
            m77020j0(str);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m77026r0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || alk0.m97312k(bLiveVoiceCall)) {
            m77019p0();
        } else {
            m77018k0(bLiveVoiceCall);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m77027s0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || alk0.m97312k(bLiveVoiceCall)) {
            this.f48123f.m72129t0();
            return;
        }
        if (hxn0.m133350c(this.f52358p).m133353d()) {
            BLiveUserMask bLiveUserMask = hxn0.m133350c(this.f52358p).f109896b;
            if (NullChecker.m81303a(bLiveUserMask) && NullChecker.m81303a(bLiveUserMask.avatarConfig) && NullChecker.m81303a(bLiveUserMask.avatarConfig.frameConfig) && bLiveUserMask.avatarConfig.frameConfig.checkNeedChangeVoice()) {
                this.f48123f.m72128s0();
            }
        }
    }

    public void setCallInfo(BLiveVoiceCall bLiveVoiceCall) {
        this.f52357o = bLiveVoiceCall;
        if (bLiveVoiceCall == null) {
            hfw.m130790a("[live][voice]", "call is null");
            m77019p0();
            xdl0.m208345M0(this.f48125h, false);
            return;
        }
        hfw.m130790a("[live][voice]", bLiveVoiceCall.toJson());
        xdl0.m208345M0(this.f48125h, true);
        if (bLiveVoiceCall.isVoiceGaming) {
            this.f48127j.setActualImageResource(i3c0.f110847R8);
        } else if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
            BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
            VDraweeView vDraweeView = this.f48127j;
            if (bLiveCallEffectConfig == null) {
                vDraweeView.setActualImageResource(i3c0.f110848R9);
            } else {
                hxs.m133406s("context_livingAct", vDraweeView, bLiveCallEffectConfig.muteIcon);
            }
        } else {
            BLiveCallEffectConfig bLiveCallEffectConfig2 = bLiveVoiceCall.callEffect;
            VDraweeView vDraweeView2 = this.f48127j;
            if (bLiveCallEffectConfig2 == null) {
                vDraweeView2.setActualImageResource(i3c0.f110859S9);
            } else {
                hxs.m133406s("context_livingAct", vDraweeView2, bLiveCallEffectConfig2.defaultIcon);
            }
        }
        m77026r0(bLiveVoiceCall);
        m77027s0(bLiveVoiceCall);
    }

    public VirtualVoiceMemberItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceMemberItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

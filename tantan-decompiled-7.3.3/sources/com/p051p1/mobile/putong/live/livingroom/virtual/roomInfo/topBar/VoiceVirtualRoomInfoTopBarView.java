package com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSummary;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bfp0;
import p153l.bnl0;
import p153l.cjp0;
import p153l.fc2;
import p153l.i9o0;
import p153l.iam;
import p153l.izs;
import p153l.jgc0;
import p153l.mdc0;
import p153l.n3d0;
import p153l.obc0;
import p153l.rwn0;
import p153l.t3m0;
import p153l.yec0;
import p153l.ynp0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualRoomInfoTopBarView extends ConstraintLayout implements iam<bfp0> {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualRoomInfoTopBarView f53563d;

    /* JADX INFO: renamed from: e */
    public ImageView f53564e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53565f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53566g;

    /* JADX INFO: renamed from: h */
    public VLinear f53567h;

    /* JADX INFO: renamed from: i */
    public FocusTextView f53568i;

    /* JADX INFO: renamed from: j */
    public VText f53569j;

    /* JADX INFO: renamed from: k */
    public VText f53570k;

    /* JADX INFO: renamed from: l */
    public bfp0 f53571l;

    /* JADX INFO: renamed from: m */
    public BLiveVoiceVirtualRoomSummary f53572m;

    /* JADX INFO: renamed from: n */
    public Dialog f53573n;

    public VoiceVirtualRoomInfoTopBarView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m78635m0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m78637q0(View view) {
        this.f53571l.m103967q4();
    }

    /* JADX INFO: renamed from: r */
    private void m78638r() {
        bnl0.m105509E0(this.f53564e, new View.OnClickListener() { // from class: l.vip0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184287a.m78637q0(view);
            }
        });
        bnl0.m105509E0(this.f53563d, new View.OnClickListener() { // from class: l.wip0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189379a.m78639r0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m78639r0(View view) {
        this.f53571l.m103968r4();
    }

    /* JADX INFO: renamed from: B0 */
    public void m78640B0(BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary) {
        bnl0.m105524M(this, true);
        this.f53572m = bLiveVoiceVirtualRoomSummary;
        m78654w0(bLiveVoiceVirtualRoomSummary.coverUrl);
        m78655y0(bLiveVoiceVirtualRoomSummary.levelSmallIcon);
        this.f53569j.setText(String.format("ID:%s", bLiveVoiceVirtualRoomSummary.publicRoomId));
        m78642E0(bLiveVoiceVirtualRoomSummary.title);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m78641D0(BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem, boolean z) {
        if (i9o0.m139136g(this.f53571l) && zrv.m221193k().m203445J6()) {
            bnl0.m105524M(this.f53570k, true);
            this.f53570k.setBackgroundResource(obc0.f146506u0);
            this.f53570k.setText(R$string.f47557Gk);
            bnl0.m105509E0(this.f53570k, new View.OnClickListener() { // from class: l.bjp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f77004a.m78650s0(view);
                }
            });
            return;
        }
        if (bLiveVoiceVirtualRoomSettleItem.isCreated()) {
            m78656z0();
            return;
        }
        if (!bLiveVoiceVirtualRoomSettleItem.isSettled()) {
            if (bLiveVoiceVirtualRoomSettleItem.isUnSettled()) {
                m78643G0();
            }
        } else {
            bnl0.m105524M(this.f53570k, false);
            if (z) {
                this.f53571l.m103975y4();
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m78642E0(String str) {
        BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary = this.f53572m;
        if (bLiveVoiceVirtualRoomSummary != null) {
            bLiveVoiceVirtualRoomSummary.title = str;
        }
        this.f53568i.setText(str);
        this.f53571l.m103976z4(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final void m78643G0() {
        boolean zMo118373p = ((rwn0) this.f53571l.m213810E2()).mo118373p();
        VText vText = this.f53570k;
        if (zMo118373p) {
            bnl0.m105524M(vText, false);
            return;
        }
        vText.setBackgroundResource(obc0.f146506u0);
        this.f53570k.setText(R$string.f47601Ik);
        bnl0.m105524M(this.f53570k, true);
        bnl0.m105509E0(this.f53570k, new View.OnClickListener() { // from class: l.ajp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71846a.m78651t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public final void m78644H0(LongLinkVirtualVoice.VoiceRoomLevelUp voiceRoomLevelUp) {
        if (ynp0.m216949z(this.f53573n)) {
            this.f53573n.dismiss();
        }
        Dialog dialogM21566z = this.f53571l.act().dialog().m21515L(jgc0.f120702i).m21516M(yec0.f198914S6).m21495B(true).m21566z();
        this.f53573n = dialogM21566z;
        View viewM21457P = dialogM21566z.m21457P();
        viewM21457P.setBackground(fc2.m124981k(n3d0.m161283g(voiceRoomLevelUp.getStartColor()), n3d0.m161283g(voiceRoomLevelUp.getEndColor()), 20, GradientDrawable.Orientation.TOP_BOTTOM));
        bnl0.m105509E0(viewM21457P.findViewById(mdc0.f136318v0), new View.OnClickListener() { // from class: l.xip0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194476a.m78652u0(view);
            }
        });
        izs.m142868s("context_livingAct", (SimpleDraweeView) viewM21457P.findViewById(mdc0.f136221k3), voiceRoomLevelUp.getLevelIcon());
        ((TextView) viewM21457P.findViewById(mdc0.f136267p3)).setText(String.format("本群已升级至LV.%d", Integer.valueOf(voiceRoomLevelUp.getLevel())));
        bnl0.m105509E0(viewM21457P.findViewById(mdc0.f136354z0), new View.OnClickListener() { // from class: l.yip0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200231a.m78653v0(view);
            }
        });
        this.f53573n.show();
    }

    /* JADX INFO: renamed from: I0 */
    public void m78645I0(LongLinkVirtualVoice.VoiceRoomLevelUp voiceRoomLevelUp) {
        BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary = this.f53572m;
        if (bLiveVoiceVirtualRoomSummary != null) {
            bLiveVoiceVirtualRoomSummary.levelIcon = voiceRoomLevelUp.getLevelIcon();
            this.f53572m.level = voiceRoomLevelUp.getLevel();
            this.f53572m.levelSmallIcon = voiceRoomLevelUp.getLevelSmallIcon();
        }
        m78655y0(this.f53572m.levelSmallIcon);
        m78644H0(voiceRoomLevelUp);
    }

    /* JADX INFO: renamed from: J0 */
    public void m78646J0(BLiveExtraData bLiveExtraData, boolean z) {
        if (bLiveExtraData.voiceSettles.isEmpty()) {
            return;
        }
        m78641D0(bLiveExtraData.voiceSettles.get(0), z);
    }

    /* JADX INFO: renamed from: K0 */
    public void m78647K0(LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage) {
        LongLinkVirtualVoice.VoiceSettleMessage.MsgType msgType = voiceSettleMessage.getMsgType();
        boolean zEquals = TextUtils.equals(zrv.f205799a.m207631D0(), voiceSettleMessage.getUserId());
        if (msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.apply) {
            if (zEquals) {
                m78656z0();
            }
        } else if (msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.approve) {
            bnl0.m105524M(this.f53570k, false);
            this.f53571l.m103971u4();
        } else if (msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.reject || msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.quit) {
            if (zEquals) {
                m78643G0();
            }
            this.f53571l.m103971u4();
        } else if (msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.updateSettledCount) {
            this.f53571l.m103971u4();
        }
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f53571l.act();
    }

    @Override // p153l.iam
    public void destroy() {
        this.f53568i.setText("");
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78648o0(View view) {
        cjp0.m110275a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78648o0(this);
        m78638r();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bfp0 bfp0Var) {
        this.f53571l = bfp0Var;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m78650s0(View view) {
        this.f53571l.m103966p4();
        t3m0.m189091e(this.f53571l);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m78651t0(View view) {
        this.f53571l.m103972v4();
        t3m0.m189109w(this.f53571l);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m78652u0(View view) {
        this.f53573n.dismiss();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m78653v0(View view) {
        this.f53571l.m103953b4();
        Dialog dialog = this.f53573n;
        if (dialog != null) {
            ynp0.m216937n(dialog);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m78654w0(String str) {
        izs.m142868s("context_livingAct", this.f53565f, str);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m78655y0(String str) {
        izs.m142868s("context_livingAct", this.f53566g, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final void m78656z0() {
        boolean zMo118373p = ((rwn0) this.f53571l.m213810E2()).mo118373p();
        VText vText = this.f53570k;
        if (zMo118373p) {
            bnl0.m105524M(vText, false);
            return;
        }
        vText.setBackgroundResource(obc0.f146351h1);
        this.f53570k.setText(R$string.f48228m3);
        bnl0.m105524M(this.f53570k, true);
        bnl0.m105509E0(this.f53570k, new View.OnClickListener() { // from class: l.zip0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceVirtualRoomInfoTopBarView.m78635m0(view);
            }
        });
    }

    public VoiceVirtualRoomInfoTopBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceVirtualRoomInfoTopBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

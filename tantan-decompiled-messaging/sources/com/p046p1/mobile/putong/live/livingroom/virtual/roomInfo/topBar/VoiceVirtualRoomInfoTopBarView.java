package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSummary;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.d8c0;
import p149l.e0o0;
import p149l.g5c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.nnn0;
import p149l.pul0;
import p149l.s7m;
import p149l.t6c0;
import p149l.uep0;
import p149l.x5p0;
import p149l.xdl0;
import p149l.y9p0;
import p149l.yb2;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualRoomInfoTopBarView extends ConstraintLayout implements s7m<x5p0> {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualRoomInfoTopBarView f52715d;

    /* JADX INFO: renamed from: e */
    public ImageView f52716e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f52717f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52718g;

    /* JADX INFO: renamed from: h */
    public VLinear f52719h;

    /* JADX INFO: renamed from: i */
    public FocusTextView f52720i;

    /* JADX INFO: renamed from: j */
    public VText f52721j;

    /* JADX INFO: renamed from: k */
    public VText f52722k;

    /* JADX INFO: renamed from: l */
    public x5p0 f52723l;

    /* JADX INFO: renamed from: m */
    public BLiveVoiceVirtualRoomSummary f52724m;

    /* JADX INFO: renamed from: n */
    public Dialog f52725n;

    public VoiceVirtualRoomInfoTopBarView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m77452m0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m77454q0(View view) {
        this.f52723l.m207130q4();
    }

    /* JADX INFO: renamed from: r */
    private void m77455r() {
        xdl0.m208329E0(this.f52716e, new View.OnClickListener() { // from class: l.r9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158425a.m77454q0(view);
            }
        });
        xdl0.m208329E0(this.f52715d, new View.OnClickListener() { // from class: l.s9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163209a.m77456r0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m77456r0(View view) {
        this.f52723l.m207131r4();
    }

    /* JADX INFO: renamed from: B0 */
    public void m77457B0(BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary) {
        xdl0.m208344M(this, true);
        this.f52724m = bLiveVoiceVirtualRoomSummary;
        m77471w0(bLiveVoiceVirtualRoomSummary.coverUrl);
        m77472y0(bLiveVoiceVirtualRoomSummary.levelSmallIcon);
        this.f52721j.setText(String.format("ID:%s", bLiveVoiceVirtualRoomSummary.publicRoomId));
        m77459E0(bLiveVoiceVirtualRoomSummary.title);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m77458D0(BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem, boolean z) {
        if (e0o0.m114321g(this.f52723l) && ypv.m215672k().m195658J6()) {
            xdl0.m208344M(this.f52722k, true);
            this.f52722k.setBackgroundResource(i3c0.f111178u0);
            this.f52722k.setText(R$string.f46709Gk);
            xdl0.m208329E0(this.f52722k, new View.OnClickListener() { // from class: l.x9p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191638a.m77467s0(view);
                }
            });
            return;
        }
        if (bLiveVoiceVirtualRoomSettleItem.isCreated()) {
            m77473z0();
            return;
        }
        if (!bLiveVoiceVirtualRoomSettleItem.isSettled()) {
            if (bLiveVoiceVirtualRoomSettleItem.isUnSettled()) {
                m77460G0();
            }
        } else {
            xdl0.m208344M(this.f52722k, false);
            if (z) {
                this.f52723l.m207138y4();
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m77459E0(String str) {
        BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary = this.f52724m;
        if (bLiveVoiceVirtualRoomSummary != null) {
            bLiveVoiceVirtualRoomSummary.title = str;
        }
        this.f52720i.setText(str);
        this.f52723l.m207139z4(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final void m77460G0() {
        boolean zMo97490p = ((nnn0) this.f52723l.m206027E2()).mo97490p();
        VText vText = this.f52722k;
        if (zMo97490p) {
            xdl0.m208344M(vText, false);
            return;
        }
        vText.setBackgroundResource(i3c0.f111178u0);
        this.f52722k.setText(R$string.f46753Ik);
        xdl0.m208344M(this.f52722k, true);
        xdl0.m208329E0(this.f52722k, new View.OnClickListener() { // from class: l.w9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185392a.m77468t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public final void m77461H0(LongLinkVirtualVoice.VoiceRoomLevelUp voiceRoomLevelUp) {
        if (uep0.m193339z(this.f52725n)) {
            this.f52725n.dismiss();
        }
        Dialog dialogM20567z = this.f52723l.act().dialog().m20516L(d8c0.f84854i).m20517M(t6c0.f168182S6).m20496B(true).m20567z();
        this.f52725n = dialogM20567z;
        View viewM20458P = dialogM20567z.m20458P();
        viewM20458P.setBackground(yb2.m213886k(kvc0.m147358g(voiceRoomLevelUp.getStartColor()), kvc0.m147358g(voiceRoomLevelUp.getEndColor()), 20, GradientDrawable.Orientation.TOP_BOTTOM));
        xdl0.m208329E0(viewM20458P.findViewById(g5c0.f101073v0), new View.OnClickListener() { // from class: l.t9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169046a.m77469u0(view);
            }
        });
        hxs.m133406s("context_livingAct", (SimpleDraweeView) viewM20458P.findViewById(g5c0.f100976k3), voiceRoomLevelUp.getLevelIcon());
        ((TextView) viewM20458P.findViewById(g5c0.f101022p3)).setText(String.format("本群已升级至LV.%d", Integer.valueOf(voiceRoomLevelUp.getLevel())));
        xdl0.m208329E0(viewM20458P.findViewById(g5c0.f101109z0), new View.OnClickListener() { // from class: l.u9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175492a.m77470v0(view);
            }
        });
        this.f52725n.show();
    }

    /* JADX INFO: renamed from: I0 */
    public void m77462I0(LongLinkVirtualVoice.VoiceRoomLevelUp voiceRoomLevelUp) {
        BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary = this.f52724m;
        if (bLiveVoiceVirtualRoomSummary != null) {
            bLiveVoiceVirtualRoomSummary.levelIcon = voiceRoomLevelUp.getLevelIcon();
            this.f52724m.level = voiceRoomLevelUp.getLevel();
            this.f52724m.levelSmallIcon = voiceRoomLevelUp.getLevelSmallIcon();
        }
        m77472y0(this.f52724m.levelSmallIcon);
        m77461H0(voiceRoomLevelUp);
    }

    /* JADX INFO: renamed from: J0 */
    public void m77463J0(BLiveExtraData bLiveExtraData, boolean z) {
        if (bLiveExtraData.voiceSettles.isEmpty()) {
            return;
        }
        m77458D0(bLiveExtraData.voiceSettles.get(0), z);
    }

    /* JADX INFO: renamed from: K0 */
    public void m77464K0(LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage) {
        LongLinkVirtualVoice.VoiceSettleMessage.MsgType msgType = voiceSettleMessage.getMsgType();
        boolean zEquals = TextUtils.equals(ypv.f199493a.m199309D0(), voiceSettleMessage.getUserId());
        if (msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.apply) {
            if (zEquals) {
                m77473z0();
            }
        } else if (msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.approve) {
            xdl0.m208344M(this.f52722k, false);
            this.f52723l.m207134u4();
        } else if (msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.reject || msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.quit) {
            if (zEquals) {
                m77460G0();
            }
            this.f52723l.m207134u4();
        } else if (msgType == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.updateSettledCount) {
            this.f52723l.m207134u4();
        }
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f52723l.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f52720i.setText("");
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m77465o0(View view) {
        y9p0.m213547a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77465o0(this);
        m77455r();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x5p0 x5p0Var) {
        this.f52723l = x5p0Var;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m77467s0(View view) {
        this.f52723l.m207129p4();
        pul0.m171447e(this.f52723l);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m77468t0(View view) {
        this.f52723l.m207135v4();
        pul0.m171465w(this.f52723l);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m77469u0(View view) {
        this.f52725n.dismiss();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m77470v0(View view) {
        this.f52723l.m207116b4();
        Dialog dialog = this.f52725n;
        if (dialog != null) {
            uep0.m193327n(dialog);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m77471w0(String str) {
        hxs.m133406s("context_livingAct", this.f52717f, str);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m77472y0(String str) {
        hxs.m133406s("context_livingAct", this.f52718g, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final void m77473z0() {
        boolean zMo97490p = ((nnn0) this.f52723l.m206027E2()).mo97490p();
        VText vText = this.f52722k;
        if (zMo97490p) {
            xdl0.m208344M(vText, false);
            return;
        }
        vText.setBackgroundResource(i3c0.f111023h1);
        this.f52722k.setText(R$string.f47380m3);
        xdl0.m208344M(this.f52722k, true);
        xdl0.m208329E0(this.f52722k, new View.OnClickListener() { // from class: l.v9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceVirtualRoomInfoTopBarView.m77452m0(view);
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

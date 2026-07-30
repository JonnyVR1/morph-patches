package com.p046p1.mobile.putong.live.livingroom.virtual.call.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.agv;
import p149l.alk0;
import p149l.c45;
import p149l.e1t;
import p149l.h1c0;
import p149l.hxn0;
import p149l.i3c0;
import p149l.i54;
import p149l.i5h0;
import p149l.kvc0;
import p149l.mqv;
import p149l.nnn0;
import p149l.o3p0;
import p149l.r4p0;
import p149l.t100;
import p149l.u6p0;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualNineDeputyItemView extends RelativeLayout implements r4p0 {

    /* JADX INFO: renamed from: a */
    public FrameLayout f52247a;

    /* JADX INFO: renamed from: b */
    public ImageView f52248b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f52249c;

    /* JADX INFO: renamed from: d */
    public View f52250d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f52251e;

    /* JADX INFO: renamed from: f */
    public ImageView f52252f;

    /* JADX INFO: renamed from: g */
    public TextView f52253g;

    /* JADX INFO: renamed from: h */
    public VLinear f52254h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f52255i;

    /* JADX INFO: renamed from: j */
    public TextView f52256j;

    /* JADX INFO: renamed from: k */
    public VText f52257k;

    /* JADX INFO: renamed from: l */
    public VLinear f52258l;

    /* JADX INFO: renamed from: m */
    public ImageView f52259m;

    /* JADX INFO: renamed from: n */
    public TextView f52260n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f52261o;

    /* JADX INFO: renamed from: p */
    public String f52262p;

    /* JADX INFO: renamed from: q */
    public i5h0 f52263q;

    /* JADX INFO: renamed from: r */
    public c45 f52264r;

    public VoiceVirtualNineDeputyItemView(Context context) {
        this(context, null);
    }

    @Override // p149l.r4p0
    /* JADX INFO: renamed from: a */
    public void mo76898a(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || alk0.m97312k(bLiveVoiceCall)) {
            m76910q();
        } else {
            m76906m(bLiveVoiceCall);
        }
    }

    @Override // p149l.r4p0
    /* JADX INFO: renamed from: b */
    public void mo76899b(int i, boolean z, o3p0 o3p0Var) {
        mo76903f(i, o3p0Var);
        if (z) {
            this.f52251e.m72119i0();
            m76909p();
        }
    }

    @Override // p149l.r4p0
    /* JADX INFO: renamed from: c */
    public void mo76900c(@NonNull final BLiveVoiceCall bLiveVoiceCall, @Nullable BLiveMember bLiveMember, @NonNull mqv<i54> mqvVar, @NonNull final o3p0<?> o3p0Var) {
        xdl0.m208344M(this.f52251e, true);
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) o3p0Var.m206027E2()).mo149813j();
        if (!alk0.m97312k(bLiveVoiceCall)) {
            xdl0.m208344M(this.f52253g, false);
            if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
                this.f52255i.setActualImageResource(i3c0.f110684Da);
                xdl0.m208344M(this.f52255i, true);
                m76910q();
            } else {
                this.f52255i.setImageDrawable(null);
                xdl0.m208344M(this.f52255i, false);
            }
        }
        xdl0.m208345M0(this.f52251e.getRealAvatarView(), true);
        this.f52257k.setTextColor(-1);
        this.f52257k.setText(mqvVar.f135304a.f111521b);
        this.f52257k.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208329E0(this.f52251e, new View.OnClickListener() { // from class: l.q6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o3p0Var.m162463h4(bLiveVoiceCall);
            }
        });
        int i = bLiveVoiceCall.position;
        if (i == 0) {
            this.f52256j.setText("主持");
        } else if (bLiveMember == null || !bLiveMember.isManager) {
            this.f52256j.setText(String.valueOf(i + 1));
        } else {
            this.f52256j.setText("管理");
        }
        xdl0.m208344M(this.f52256j, true);
        xdl0.m208344M(this.f52248b, false);
        m76907n(bLiveVoiceCall, mqvVar, bLiveVoiceMo149813j, o3p0Var);
    }

    @Override // p149l.r4p0
    /* JADX INFO: renamed from: d */
    public void mo76901d(String str) {
        if (TextUtils.isEmpty(str)) {
            m76909p();
        } else {
            m76905l(str);
        }
    }

    @Override // p149l.r4p0
    /* JADX INFO: renamed from: e */
    public void mo76902e(final int i, @NonNull final o3p0<?> o3p0Var) {
        xdl0.m208329E0(this.f52248b, new View.OnClickListener() { // from class: l.r6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o3p0Var.m162464i4(Integer.valueOf(i));
            }
        });
    }

    @Override // p149l.r4p0
    /* JADX INFO: renamed from: f */
    public void mo76903f(int i, o3p0 o3p0Var) {
        xdl0.m208344M(this.f52256j, false);
        xdl0.m208344M(this.f52255i, false);
        xdl0.m208344M(this.f52253g, false);
        this.f52257k.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        this.f52257k.setText(String.format("%s号麦位", Integer.valueOf(i)));
        this.f52257k.setTypeface(Typeface.DEFAULT);
        m76908o(this.f52257k, 4);
        xdl0.m208344M(this.f52251e, false);
        xdl0.m208344M(this.f52248b, true);
        this.f52258l.setVisibility(4);
        this.f52260n.setText("0");
        m76910q();
        this.f52264r.m105202b();
        this.f52250d.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: k */
    public final void m76904k(View view) {
        u6p0.m192016a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public final void m76905l(String str) {
        if (this.f52261o.isAnimating()) {
            return;
        }
        xdl0.m208344M(this.f52261o, true);
        this.f52261o.m68501k(str, -1, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m76906m(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig;
        String str = (bLiveVoiceCall == null || (bLiveCallEffectConfig = bLiveVoiceCall.callEffect) == null) ? "https://auto.tancdn.com/v1/raw/a5705b18-7436-41ec-8ab5-b094eacd298211.pdf" : bLiveCallEffectConfig.circleVoicingUrl;
        if (this.f52249c.isAnimating() && TextUtils.equals(str, this.f52262p)) {
            return;
        }
        this.f52262p = str;
        this.f52249c.mo68502l(str, -1, this.f52263q);
    }

    /* JADX INFO: renamed from: n */
    public final void m76907n(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar, BLiveVoice bLiveVoice, @NonNull final o3p0<?> o3p0Var) {
        this.f52258l.setVisibility(0);
        this.f52260n.setTextColor(getContext().getResources().getColor(h1c0.f105386m1));
        final mqv<i54> mqvVarM114446h = e1t.m114446h(mqvVar);
        hxn0 hxn0VarM133350c = hxn0.m133350c(mqvVarM114446h);
        agv.m96345c(this.f52251e, t100.m186890d(73.0f), mqvVarM114446h, new w9j() { // from class: l.s6p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((i54) obj).f111522c;
            }
        }, 1);
        this.f52259m.setImageResource(i3c0.f110696Ea);
        this.f52260n.setText(x8u.m207433c(bLiveVoiceCall.userRecvRewardPoint));
        xdl0.m208329E0(this.f52258l, new View.OnClickListener() { // from class: l.t6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o3p0Var.m162465j4(((i54) mqvVarM114446h.f135304a).f111520a);
            }
        });
        this.f52264r.m105205e(mqvVarM114446h);
        if (hxn0VarM133350c.m133353d() && hxn0VarM133350c.f109896b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            xdl0.m208345M0(this.f52251e.getRealAvatarView(), false);
            this.f52250d.setBackground(yb2.m213883h(Color.parseColor("#382121")));
        } else {
            xdl0.m208345M0(this.f52251e.getRealAvatarView(), true);
            this.f52250d.setBackgroundResource(0);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m76908o(TextView textView, int i) {
        textView.setMaxEms(i);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76910q();
        this.f52251e.m72119i0();
        m76909p();
        this.f52264r.m105202b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76904k(this);
        this.f52263q = new i5h0(this.f52249c, null);
        this.f52264r = new c45(this.f52251e.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: p */
    public final void m76909p() {
        if (NullChecker.m81303a(this.f52261o)) {
            this.f52261o.stopAnimation(true);
            xdl0.m208344M(this.f52261o, false);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m76910q() {
        AnimEffectPlayer animEffectPlayer = this.f52249c;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
        this.f52251e.m72129t0();
        this.f52262p = "";
    }

    /* JADX INFO: renamed from: r */
    public void m76911r(mqv<i54> mqvVar, BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || alk0.m97312k(bLiveVoiceCall)) {
            this.f52251e.m72129t0();
            return;
        }
        if (!hxn0.m133350c(mqvVar).m133353d()) {
            this.f52251e.m72129t0();
            return;
        }
        BLiveUserMask bLiveUserMask = hxn0.m133350c(mqvVar).f109896b;
        if (NullChecker.m81303a(bLiveUserMask) && NullChecker.m81303a(bLiveUserMask.avatarConfig) && NullChecker.m81303a(bLiveUserMask.avatarConfig.frameConfig) && bLiveUserMask.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            this.f52251e.m72128s0();
        }
    }

    @Override // p149l.r4p0
    public void setItemPlaceRes(int i) {
        this.f52248b.setImageResource(i);
    }

    public VoiceVirtualNineDeputyItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VoiceVirtualNineDeputyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

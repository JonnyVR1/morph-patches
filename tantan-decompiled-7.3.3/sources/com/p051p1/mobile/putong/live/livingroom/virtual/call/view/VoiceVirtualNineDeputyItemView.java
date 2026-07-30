package com.p051p1.mobile.putong.live.livingroom.virtual.call.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.d55;
import p153l.f3t;
import p153l.fc2;
import p153l.guk0;
import p153l.h64;
import p153l.l6o0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.qdh0;
import p153l.rwn0;
import p153l.scp0;
import p153l.vdp0;
import p153l.yau;
import p153l.yfp0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualNineDeputyItemView extends RelativeLayout implements vdp0 {

    /* JADX INFO: renamed from: a */
    public FrameLayout f53095a;

    /* JADX INFO: renamed from: b */
    public ImageView f53096b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f53097c;

    /* JADX INFO: renamed from: d */
    public View f53098d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f53099e;

    /* JADX INFO: renamed from: f */
    public ImageView f53100f;

    /* JADX INFO: renamed from: g */
    public TextView f53101g;

    /* JADX INFO: renamed from: h */
    public VLinear f53102h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f53103i;

    /* JADX INFO: renamed from: j */
    public TextView f53104j;

    /* JADX INFO: renamed from: k */
    public VText f53105k;

    /* JADX INFO: renamed from: l */
    public VLinear f53106l;

    /* JADX INFO: renamed from: m */
    public ImageView f53107m;

    /* JADX INFO: renamed from: n */
    public TextView f53108n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f53109o;

    /* JADX INFO: renamed from: p */
    public String f53110p;

    /* JADX INFO: renamed from: q */
    public qdh0 f53111q;

    /* JADX INFO: renamed from: r */
    public d55 f53112r;

    public VoiceVirtualNineDeputyItemView(Context context) {
        this(context, null);
    }

    @Override // p153l.vdp0
    /* JADX INFO: renamed from: a */
    public void mo78081a(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || guk0.m132332k(bLiveVoiceCall)) {
            m78093q();
        } else {
            m78089m(bLiveVoiceCall);
        }
    }

    @Override // p153l.vdp0
    /* JADX INFO: renamed from: b */
    public void mo78082b(int i, boolean z, scp0 scp0Var) {
        mo78086f(i, scp0Var);
        if (z) {
            this.f53099e.m73302i0();
            m78092p();
        }
    }

    @Override // p153l.vdp0
    /* JADX INFO: renamed from: c */
    public void mo78083c(@NonNull final BLiveVoiceCall bLiveVoiceCall, @Nullable BLiveMember bLiveMember, @NonNull nsv<h64> nsvVar, @NonNull final scp0<?> scp0Var) {
        bnl0.m105524M(this.f53099e, true);
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) scp0Var.m213810E2()).mo183435j();
        if (!guk0.m132332k(bLiveVoiceCall)) {
            bnl0.m105524M(this.f53101g, false);
            if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
                this.f53103i.setActualImageResource(obc0.f146012Da);
                bnl0.m105524M(this.f53103i, true);
                m78093q();
            } else {
                this.f53103i.setImageDrawable(null);
                bnl0.m105524M(this.f53103i, false);
            }
        }
        bnl0.m105525M0(this.f53099e.getRealAvatarView(), true);
        this.f53105k.setTextColor(-1);
        this.f53105k.setText(nsvVar.f143542a.f107998b);
        this.f53105k.setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105509E0(this.f53099e, new View.OnClickListener() { // from class: l.ufp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scp0Var.m185383h4(bLiveVoiceCall);
            }
        });
        int i = bLiveVoiceCall.position;
        if (i == 0) {
            this.f53104j.setText("主持");
        } else if (bLiveMember == null || !bLiveMember.isManager) {
            this.f53104j.setText(String.valueOf(i + 1));
        } else {
            this.f53104j.setText("管理");
        }
        bnl0.m105524M(this.f53104j, true);
        bnl0.m105524M(this.f53096b, false);
        m78090n(bLiveVoiceCall, nsvVar, bLiveVoiceMo183435j, scp0Var);
    }

    @Override // p153l.vdp0
    /* JADX INFO: renamed from: d */
    public void mo78084d(String str) {
        if (TextUtils.isEmpty(str)) {
            m78092p();
        } else {
            m78088l(str);
        }
    }

    @Override // p153l.vdp0
    /* JADX INFO: renamed from: e */
    public void mo78085e(final int i, @NonNull final scp0<?> scp0Var) {
        bnl0.m105509E0(this.f53096b, new View.OnClickListener() { // from class: l.vfp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scp0Var.m185384i4(Integer.valueOf(i));
            }
        });
    }

    @Override // p153l.vdp0
    /* JADX INFO: renamed from: f */
    public void mo78086f(int i, scp0 scp0Var) {
        bnl0.m105524M(this.f53104j, false);
        bnl0.m105524M(this.f53103i, false);
        bnl0.m105524M(this.f53101g, false);
        this.f53105k.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        this.f53105k.setText(String.format("%s号麦位", Integer.valueOf(i)));
        this.f53105k.setTypeface(Typeface.DEFAULT);
        m78091o(this.f53105k, 4);
        bnl0.m105524M(this.f53099e, false);
        bnl0.m105524M(this.f53096b, true);
        this.f53106l.setVisibility(4);
        this.f53108n.setText("0");
        m78093q();
        this.f53112r.m114258b();
        this.f53098d.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: k */
    public final void m78087k(View view) {
        yfp0.m215809a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public final void m78088l(String str) {
        if (this.f53109o.isAnimating()) {
            return;
        }
        bnl0.m105524M(this.f53109o, true);
        this.f53109o.m69684k(str, -1, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m78089m(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig;
        String str = (bLiveVoiceCall == null || (bLiveCallEffectConfig = bLiveVoiceCall.callEffect) == null) ? "https://auto.tancdn.com/v1/raw/a5705b18-7436-41ec-8ab5-b094eacd298211.pdf" : bLiveCallEffectConfig.circleVoicingUrl;
        if (this.f53097c.isAnimating() && TextUtils.equals(str, this.f53110p)) {
            return;
        }
        this.f53110p = str;
        this.f53097c.mo69685l(str, -1, this.f53111q);
    }

    /* JADX INFO: renamed from: n */
    public final void m78090n(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar, BLiveVoice bLiveVoice, @NonNull final scp0<?> scp0Var) {
        this.f53106l.setVisibility(0);
        this.f53108n.setTextColor(getContext().getResources().getColor(n9c0.f140847m1));
        final nsv<h64> nsvVarM123807h = f3t.m123807h(nsvVar);
        l6o0 l6o0VarM153068c = l6o0.m153068c(nsvVarM123807h);
        biv.m104518c(this.f53099e, qa00.m175859d(73.0f), nsvVarM123807h, new qcj() { // from class: l.wfp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((h64) obj).f107999c;
            }
        }, 1);
        this.f53107m.setImageResource(obc0.f146024Ea);
        this.f53108n.setText(yau.m214935c(bLiveVoiceCall.userRecvRewardPoint));
        bnl0.m105509E0(this.f53106l, new View.OnClickListener() { // from class: l.xfp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scp0Var.m185385j4(((h64) nsvVarM123807h.f143542a).f107997a);
            }
        });
        this.f53112r.m114261e(nsvVarM123807h);
        if (l6o0VarM153068c.m153071d() && l6o0VarM153068c.f130275b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            bnl0.m105525M0(this.f53099e.getRealAvatarView(), false);
            this.f53098d.setBackground(fc2.m124978h(Color.parseColor("#382121")));
        } else {
            bnl0.m105525M0(this.f53099e.getRealAvatarView(), true);
            this.f53098d.setBackgroundResource(0);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m78091o(TextView textView, int i) {
        textView.setMaxEms(i);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m78093q();
        this.f53099e.m73302i0();
        m78092p();
        this.f53112r.m114258b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78087k(this);
        this.f53111q = new qdh0(this.f53097c, null);
        this.f53112r = new d55(this.f53099e.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: p */
    public final void m78092p() {
        if (NullChecker.m82486a(this.f53109o)) {
            this.f53109o.stopAnimation(true);
            bnl0.m105524M(this.f53109o, false);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m78093q() {
        AnimEffectPlayer animEffectPlayer = this.f53097c;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
        this.f53099e.m73312t0();
        this.f53110p = "";
    }

    /* JADX INFO: renamed from: r */
    public void m78094r(nsv<h64> nsvVar, BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || guk0.m132332k(bLiveVoiceCall)) {
            this.f53099e.m73312t0();
            return;
        }
        if (!l6o0.m153068c(nsvVar).m153071d()) {
            this.f53099e.m73312t0();
            return;
        }
        BLiveUserMask bLiveUserMask = l6o0.m153068c(nsvVar).f130275b;
        if (NullChecker.m82486a(bLiveUserMask) && NullChecker.m82486a(bLiveUserMask.avatarConfig) && NullChecker.m82486a(bLiveUserMask.avatarConfig.frameConfig) && bLiveUserMask.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            this.f53099e.m73311s0();
        }
    }

    @Override // p153l.vdp0
    public void setItemPlaceRes(int i) {
        this.f53096b.setImageResource(i);
    }

    public VoiceVirtualNineDeputyItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VoiceVirtualNineDeputyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

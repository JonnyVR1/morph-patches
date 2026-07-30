package com.p046p1.mobile.putong.live.external.voiceslipcard.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.fpn0;
import p149l.hxs;
import p149l.szu;
import p149l.t100;
import p149l.x4u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceActivitiesItemView extends LiveVoiceSwipeMenuLayout {

    /* JADX INFO: renamed from: A */
    public AnimEffectPlayer f46428A;

    /* JADX INFO: renamed from: B */
    public VText f46429B;

    /* JADX INFO: renamed from: C */
    public VImage f46430C;

    /* JADX INFO: renamed from: D */
    public VText f46431D;

    /* JADX INFO: renamed from: E */
    public VText f46432E;

    /* JADX INFO: renamed from: F */
    public VText f46433F;

    /* JADX INFO: renamed from: G */
    public VText f46434G;

    /* JADX INFO: renamed from: H */
    public VText f46435H;

    /* JADX INFO: renamed from: u */
    public VRelative f46436u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f46437v;

    /* JADX INFO: renamed from: w */
    public VText f46438w;

    /* JADX INFO: renamed from: x */
    public VText f46439x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f46440y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f46441z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesItemView$a */
    public interface InterfaceC12594a {
        /* JADX INFO: renamed from: a */
        void mo70993a(int i, BLiveMemberActivityData bLiveMemberActivityData);

        /* JADX INFO: renamed from: b */
        void mo70994b(BLiveMemberActivityData bLiveMemberActivityData);
    }

    public LiveVoiceActivitiesItemView(Context context) {
        super(context);
    }

    private void setDescText(CharSequence charSequence) {
        this.f46439x.setText(charSequence);
    }

    private void setRelationStatus(String str) {
        xdl0.m208344M(this.f46432E, "all".equals(str));
        xdl0.m208344M(this.f46433F, "follow".equals(str));
        xdl0.m208344M(this.f46434G, "match".equals(str));
        xdl0.m208344M(this.f46435H, "likeother".equals(str));
    }

    private void setTitleText(CharSequence charSequence) {
        this.f46438w.setText(charSequence);
    }

    /* JADX INFO: renamed from: o */
    public final void m70984o(View view) {
        szu.m186799a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m70992w();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70984o(this);
        m70985p(false);
    }

    /* JADX INFO: renamed from: p */
    public void m70985p(boolean z) {
        this.f46438w.setTextColor(fpn0.m122612b(z).mo108465e());
        this.f46439x.setTextColor(fpn0.m122612b(z).mo108462b());
        this.f46431D.setTextColor(fpn0.m122612b(z).mo108464d());
    }

    /* JADX INFO: renamed from: q */
    public final void m70986q(String str) {
        hxs.m133408u("context_square", this.f46437v, str, t100.m186890d(55.0f), t100.m186890d(55.0f));
    }

    /* JADX INFO: renamed from: r */
    public void m70987r(BLiveMemberActivityData bLiveMemberActivityData) {
        setTitleText(bLiveMemberActivityData.mainTitle);
        setDescText(bLiveMemberActivityData.secondTitle);
        m70986q(bLiveMemberActivityData.avatar);
        m70988s(bLiveMemberActivityData.status, bLiveMemberActivityData.endTimeStamp);
        setRelationStatus(bLiveMemberActivityData.relationStatus);
    }

    /* JADX INFO: renamed from: s */
    public final void m70988s(String str, double d) {
        if (TextUtils.isEmpty(str)) {
            m70990u(d);
        } else {
            m70991v(str);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: t */
    public void m70989t(final InterfaceC12594a interfaceC12594a, final BLiveMemberActivityData bLiveMemberActivityData) {
        xdl0.m208329E0(this.f46432E, new View.OnClickListener() { // from class: l.nzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12594a.mo70993a(0, bLiveMemberActivityData);
            }
        });
        xdl0.m208329E0(this.f46433F, new View.OnClickListener() { // from class: l.ozu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12594a.mo70993a(1, bLiveMemberActivityData);
            }
        });
        xdl0.m208329E0(this.f46434G, new View.OnClickListener() { // from class: l.pzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12594a.mo70993a(2, bLiveMemberActivityData);
            }
        });
        xdl0.m208329E0(this.f46435H, new View.OnClickListener() { // from class: l.qzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12594a.mo70993a(3, bLiveMemberActivityData);
            }
        });
        xdl0.m208329E0(this.f46436u, new View.OnClickListener() { // from class: l.rzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12594a.mo70994b(bLiveMemberActivityData);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m70990u(double d) {
        xdl0.m208344M(this.f46441z, false);
        xdl0.m208344M(this.f46431D, true);
        this.f46431D.setText(x4u.m207020f((long) d));
    }

    /* JADX INFO: renamed from: v */
    public final void m70991v(String str) {
        xdl0.m208344M(this.f46441z, true);
        xdl0.m208344M(this.f46431D, false);
        if (!this.f46428A.isAnimating()) {
            this.f46428A.m68500j("https://auto.tancdn.com/v1/raw/faaceaf9-d54d-45c6-9009-aecd295225e511.pdf", -1);
        }
        this.f46429B.setText(str);
    }

    /* JADX INFO: renamed from: w */
    public void m70992w() {
        AnimEffectPlayer animEffectPlayer = this.f46428A;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f46428A.m68505o();
    }

    public LiveVoiceActivitiesItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceActivitiesItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

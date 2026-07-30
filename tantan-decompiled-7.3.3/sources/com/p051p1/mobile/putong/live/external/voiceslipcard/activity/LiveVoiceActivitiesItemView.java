package com.p051p1.mobile.putong.live.external.voiceslipcard.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.jyn0;
import p153l.qa00;
import p153l.t1v;
import p153l.y6u;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceActivitiesItemView extends LiveVoiceSwipeMenuLayout {

    /* JADX INFO: renamed from: A */
    public AnimEffectPlayer f47276A;

    /* JADX INFO: renamed from: B */
    public VText f47277B;

    /* JADX INFO: renamed from: C */
    public VImage f47278C;

    /* JADX INFO: renamed from: D */
    public VText f47279D;

    /* JADX INFO: renamed from: E */
    public VText f47280E;

    /* JADX INFO: renamed from: F */
    public VText f47281F;

    /* JADX INFO: renamed from: G */
    public VText f47282G;

    /* JADX INFO: renamed from: H */
    public VText f47283H;

    /* JADX INFO: renamed from: u */
    public VRelative f47284u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f47285v;

    /* JADX INFO: renamed from: w */
    public VText f47286w;

    /* JADX INFO: renamed from: x */
    public VText f47287x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f47288y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f47289z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesItemView$a */
    public interface InterfaceC12757a {
        /* JADX INFO: renamed from: a */
        void mo72176a(int i, BLiveMemberActivityData bLiveMemberActivityData);

        /* JADX INFO: renamed from: b */
        void mo72177b(BLiveMemberActivityData bLiveMemberActivityData);
    }

    public LiveVoiceActivitiesItemView(Context context) {
        super(context);
    }

    private void setDescText(CharSequence charSequence) {
        this.f47287x.setText(charSequence);
    }

    private void setRelationStatus(String str) {
        bnl0.m105524M(this.f47280E, "all".equals(str));
        bnl0.m105524M(this.f47281F, "follow".equals(str));
        bnl0.m105524M(this.f47282G, "match".equals(str));
        bnl0.m105524M(this.f47283H, "likeother".equals(str));
    }

    private void setTitleText(CharSequence charSequence) {
        this.f47286w.setText(charSequence);
    }

    /* JADX INFO: renamed from: o */
    public final void m72167o(View view) {
        t1v.m188938a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m72175w();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72167o(this);
        m72168p(false);
    }

    /* JADX INFO: renamed from: p */
    public void m72168p(boolean z) {
        this.f47286w.setTextColor(jyn0.m147605b(z).mo187675e());
        this.f47287x.setTextColor(jyn0.m147605b(z).mo187672b());
        this.f47279D.setTextColor(jyn0.m147605b(z).mo187674d());
    }

    /* JADX INFO: renamed from: q */
    public final void m72169q(String str) {
        izs.m142870u("context_square", this.f47285v, str, qa00.m175859d(55.0f), qa00.m175859d(55.0f));
    }

    /* JADX INFO: renamed from: r */
    public void m72170r(BLiveMemberActivityData bLiveMemberActivityData) {
        setTitleText(bLiveMemberActivityData.mainTitle);
        setDescText(bLiveMemberActivityData.secondTitle);
        m72169q(bLiveMemberActivityData.avatar);
        m72171s(bLiveMemberActivityData.status, bLiveMemberActivityData.endTimeStamp);
        setRelationStatus(bLiveMemberActivityData.relationStatus);
    }

    /* JADX INFO: renamed from: s */
    public final void m72171s(String str, double d) {
        if (TextUtils.isEmpty(str)) {
            m72173u(d);
        } else {
            m72174v(str);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: t */
    public void m72172t(final InterfaceC12757a interfaceC12757a, final BLiveMemberActivityData bLiveMemberActivityData) {
        bnl0.m105509E0(this.f47280E, new View.OnClickListener() { // from class: l.o1v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12757a.mo72176a(0, bLiveMemberActivityData);
            }
        });
        bnl0.m105509E0(this.f47281F, new View.OnClickListener() { // from class: l.p1v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12757a.mo72176a(1, bLiveMemberActivityData);
            }
        });
        bnl0.m105509E0(this.f47282G, new View.OnClickListener() { // from class: l.q1v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12757a.mo72176a(2, bLiveMemberActivityData);
            }
        });
        bnl0.m105509E0(this.f47283H, new View.OnClickListener() { // from class: l.r1v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12757a.mo72176a(3, bLiveMemberActivityData);
            }
        });
        bnl0.m105509E0(this.f47284u, new View.OnClickListener() { // from class: l.s1v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC12757a.mo72177b(bLiveMemberActivityData);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m72173u(double d) {
        bnl0.m105524M(this.f47289z, false);
        bnl0.m105524M(this.f47279D, true);
        this.f47279D.setText(y6u.m214502f((long) d));
    }

    /* JADX INFO: renamed from: v */
    public final void m72174v(String str) {
        bnl0.m105524M(this.f47289z, true);
        bnl0.m105524M(this.f47279D, false);
        if (!this.f47276A.isAnimating()) {
            this.f47276A.m69683j("https://auto.tancdn.com/v1/raw/faaceaf9-d54d-45c6-9009-aecd295225e511.pdf", -1);
        }
        this.f47277B.setText(str);
    }

    /* JADX INFO: renamed from: w */
    public void m72175w() {
        AnimEffectPlayer animEffectPlayer = this.f47276A;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f47276A.m69688o();
    }

    public LiveVoiceActivitiesItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceActivitiesItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

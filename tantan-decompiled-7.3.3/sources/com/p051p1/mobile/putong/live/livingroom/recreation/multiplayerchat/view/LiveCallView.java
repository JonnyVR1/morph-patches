package com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p153l.a3s;
import p153l.bnl0;
import p153l.d74;
import p153l.g64;
import p153l.gt0;
import p153l.iam;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;
import p153l.u54;
import p153l.yau;
import p153l.ynp0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveCallView extends LinearLayout implements iam<d74> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f52353a;

    /* JADX INFO: renamed from: b */
    public TextView f52354b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f52355c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f52356d;

    /* JADX INFO: renamed from: e */
    public TextView f52357e;

    /* JADX INFO: renamed from: f */
    public TextView f52358f;

    /* JADX INFO: renamed from: g */
    public ImageView f52359g;

    /* JADX INFO: renamed from: h */
    public ImageView f52360h;

    /* JADX INFO: renamed from: i */
    public TextView f52361i;

    /* JADX INFO: renamed from: j */
    public ImageView f52362j;

    /* JADX INFO: renamed from: k */
    public d74 f52363k;

    public LiveCallView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m77152q(View view) {
        this.f52363k.m114620f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m77153s(View view) {
        this.f52363k.m114610I4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m77154u(View view) {
        this.f52363k.m114618d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m77155v(View view) {
        this.f52363k.m114621g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m77156w(View view) {
        this.f52363k.m114608G4();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f52363k.act();
    }

    @Override // p153l.iam
    public void destroy() {
        m77160m();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m77157j(View view) {
        a3s.m95867a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(d74 d74Var) {
        this.f52363k = d74Var;
    }

    /* JADX INFO: renamed from: l */
    public void m77159l(boolean z, boolean z2) {
        if (z && z2) {
            Animator animatorM132180z = gt0.m132180z(gt0.m132170p(this.f52361i, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), gt0.m132170p(this.f52362j, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f));
            gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.y2s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197279a.m77161n();
                }
            });
            gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.z2s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202732a.m77162p();
                }
            });
            animatorM132180z.start();
            return;
        }
        bnl0.m105524M(this.f52361i, !z);
        if (!z) {
            this.f52363k.m114615N4();
        }
        bnl0.m105524M(this.f52362j, z);
    }

    /* JADX INFO: renamed from: m */
    public void m77160m() {
        g64.m129083d("hide video view");
        bnl0.m105524M(this, false);
        bnl0.m105524M(this.f52361i, false);
        bnl0.m105524M(this.f52362j, false);
        bnl0.m105524M(this.f52360h, false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m77161n() {
        bnl0.m105524M(this.f52362j, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77157j(this);
        bnl0.m105507D0(qa00.m175859d(16.0f) + ynp0.m216942s(12, (String) getContext().getText(R$string.f47475D4)), this.f52361i);
        bnl0.m105509E0(this.f52360h, new View.OnClickListener() { // from class: l.t2s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171790a.m77152q(view);
            }
        });
        bnl0.m105509E0(this.f52362j, new View.OnClickListener() { // from class: l.u2s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177240a.m77153s(view);
            }
        });
        bnl0.m105509E0(this.f52359g, new View.OnClickListener() { // from class: l.v2s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182106a.m77154u(view);
            }
        });
        bnl0.m105509E0(this.f52361i, new View.OnClickListener() { // from class: l.w2s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186928a.m77155v(view);
            }
        });
        bnl0.m105509E0(this.f52355c, new View.OnClickListener() { // from class: l.x2s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192181a.m77156w(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m77162p() {
        bnl0.m105524M(this.f52361i, false);
        this.f52361i.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: x */
    public void m77163x(BLiveCall bLiveCall) {
        if (bLiveCall.mutedByAnchor || bLiveCall.mutedByUser) {
            this.f52359g.setImageResource(obc0.f146039G1);
        } else {
            this.f52359g.setImageResource(obc0.f146051H1);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m77164y(BLiveCall bLiveCall) {
        g64.m129083d("render video view");
        bnl0.m105524M(this, true);
        izs.m142868s("context_single_room", this.f52356d, bLiveCall.userPicture);
        this.f52358f.setText(yau.m214935c(bLiveCall.userRecvRewardPoint));
        this.f52357e.setText(String.valueOf(bLiveCall.position));
        if (u54.m194531k(bLiveCall)) {
            bnl0.m105524M(this.f52361i, false);
            bnl0.m105524M(this.f52362j, true);
        }
        if (u54.m194531k(bLiveCall) || this.f52363k.m213815L2()) {
            bnl0.m105524M(this.f52360h, true);
            bnl0.m105524M(this.f52359g, true);
            m77163x(bLiveCall);
        } else {
            bnl0.m105524M(this.f52360h, false);
            bnl0.m105524M(this.f52359g, false);
        }
        m77165z();
    }

    /* JADX INFO: renamed from: z */
    public final void m77165z() {
        int iM216939p = (ynp0.m216939p() * 804) / 1080;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.width = ynp0.m216939p();
        layoutParams.height = iM216939p;
        setLayoutParams(layoutParams);
    }

    public LiveCallView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveCallView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

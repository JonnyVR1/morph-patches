package com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.e64;
import p149l.h54;
import p149l.hxs;
import p149l.i3c0;
import p149l.s7m;
import p149l.t100;
import p149l.uep0;
import p149l.v44;
import p149l.x8u;
import p149l.xdl0;
import p149l.z0s;

/* JADX INFO: loaded from: classes5.dex */
public class LiveCallView extends LinearLayout implements s7m<e64> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f51505a;

    /* JADX INFO: renamed from: b */
    public TextView f51506b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f51507c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f51508d;

    /* JADX INFO: renamed from: e */
    public TextView f51509e;

    /* JADX INFO: renamed from: f */
    public TextView f51510f;

    /* JADX INFO: renamed from: g */
    public ImageView f51511g;

    /* JADX INFO: renamed from: h */
    public ImageView f51512h;

    /* JADX INFO: renamed from: i */
    public TextView f51513i;

    /* JADX INFO: renamed from: j */
    public ImageView f51514j;

    /* JADX INFO: renamed from: k */
    public e64 f51515k;

    public LiveCallView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m75969q(View view) {
        this.f51515k.m114977f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m75970s(View view) {
        this.f51515k.m114967I4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m75971u(View view) {
        this.f51515k.m114975d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m75972v(View view) {
        this.f51515k.m114978g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m75973w(View view) {
        this.f51515k.m114965G4();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f51515k.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        m75977m();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m75974j(View view) {
        z0s.m216756a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(e64 e64Var) {
        this.f51515k = e64Var;
    }

    /* JADX INFO: renamed from: l */
    public void m75976l(boolean z, boolean z2) {
        if (z && z2) {
            Animator animatorM103753z = bt0.m103753z(bt0.m103743p(this.f51513i, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), bt0.m103743p(this.f51514j, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f));
            bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.x0s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188992a.m75978n();
                }
            });
            bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.y0s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195325a.m75979p();
                }
            });
            animatorM103753z.start();
            return;
        }
        xdl0.m208344M(this.f51513i, !z);
        if (!z) {
            this.f51515k.m114972N4();
        }
        xdl0.m208344M(this.f51514j, z);
    }

    /* JADX INFO: renamed from: m */
    public void m75977m() {
        h54.m129377d("hide video view");
        xdl0.m208344M(this, false);
        xdl0.m208344M(this.f51513i, false);
        xdl0.m208344M(this.f51514j, false);
        xdl0.m208344M(this.f51512h, false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m75978n() {
        xdl0.m208344M(this.f51514j, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75974j(this);
        xdl0.m208327D0(t100.m186890d(16.0f) + uep0.m193332s(12, (String) getContext().getText(R$string.f46627D4)), this.f51513i);
        xdl0.m208329E0(this.f51512h, new View.OnClickListener() { // from class: l.s0s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161800a.m75969q(view);
            }
        });
        xdl0.m208329E0(this.f51514j, new View.OnClickListener() { // from class: l.t0s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167208a.m75970s(view);
            }
        });
        xdl0.m208329E0(this.f51511g, new View.OnClickListener() { // from class: l.u0s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172939a.m75971u(view);
            }
        });
        xdl0.m208329E0(this.f51513i, new View.OnClickListener() { // from class: l.v0s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179139a.m75972v(view);
            }
        });
        xdl0.m208329E0(this.f51507c, new View.OnClickListener() { // from class: l.w0s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183936a.m75973w(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m75979p() {
        xdl0.m208344M(this.f51513i, false);
        this.f51513i.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: x */
    public void m75980x(BLiveCall bLiveCall) {
        if (bLiveCall.mutedByAnchor || bLiveCall.mutedByUser) {
            this.f51511g.setImageResource(i3c0.f110711G1);
        } else {
            this.f51511g.setImageResource(i3c0.f110723H1);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m75981y(BLiveCall bLiveCall) {
        h54.m129377d("render video view");
        xdl0.m208344M(this, true);
        hxs.m133406s("context_single_room", this.f51508d, bLiveCall.userPicture);
        this.f51510f.setText(x8u.m207433c(bLiveCall.userRecvRewardPoint));
        this.f51509e.setText(String.valueOf(bLiveCall.position));
        if (v44.m196943k(bLiveCall)) {
            xdl0.m208344M(this.f51513i, false);
            xdl0.m208344M(this.f51514j, true);
        }
        if (v44.m196943k(bLiveCall) || this.f51515k.m206032L2()) {
            xdl0.m208344M(this.f51512h, true);
            xdl0.m208344M(this.f51511g, true);
            m75980x(bLiveCall);
        } else {
            xdl0.m208344M(this.f51512h, false);
            xdl0.m208344M(this.f51511g, false);
        }
        m75982z();
    }

    /* JADX INFO: renamed from: z */
    public final void m75982z() {
        int iM193329p = (uep0.m193329p() * 804) / 1080;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.width = uep0.m193329p();
        layoutParams.height = iM193329p;
        setLayoutParams(layoutParams);
    }

    public LiveCallView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveCallView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

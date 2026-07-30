package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import p147v.VDraweeView;
import p147v.VText;
import p149l.an70;
import p149l.bt0;
import p149l.gn70;
import p149l.h4t;
import p149l.hxs;
import p149l.s7m;
import p149l.t100;
import p149l.um70;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes5.dex */
public class PkFirstGiftView extends ConstraintLayout implements s7m<h4t> {

    /* JADX INFO: renamed from: d */
    public View f51685d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51686e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f51687f;

    /* JADX INFO: renamed from: g */
    public VText f51688g;

    /* JADX INFO: renamed from: h */
    public h4t f51689h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f51690i;

    public PkFirstGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m76158q0(View view) {
        h4t h4tVar = this.f51689h;
        if (h4tVar != null) {
            if (h4tVar instanceof an70) {
                ((an70) h4tVar).m97733P3();
            } else if (h4tVar instanceof um70) {
                ((um70) h4tVar).m194311P3();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m76159r() {
        xdl0.m208329E0(this.f51685d, new View.OnClickListener() { // from class: l.cn70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81652a.m76158q0(view);
            }
        });
        xdl0.m208329E0(this.f51688g, new View.OnClickListener() { // from class: l.dn70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87034a.m76160r0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m76160r0(View view) {
        h4t h4tVar = this.f51689h;
        if (h4tVar != null) {
            if (h4tVar instanceof an70) {
                ((an70) h4tVar).m97734R3();
            } else if (h4tVar instanceof um70) {
                ((um70) h4tVar).m194312R3();
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        m76165p0();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m76161l0(View view) {
        gn70.m127115a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(h4t h4tVar) {
        this.f51689h = h4tVar;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m76163n0() {
        this.f51686e.setController(null);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m76164o0() {
        ValueAnimator valueAnimator = this.f51690i;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m76164o0();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76161l0(this);
        m76159r();
    }

    /* JADX INFO: renamed from: p0 */
    public void m76165p0() {
        xdl0.m208344M(this, false);
        this.f51688g.setText("");
        m76164o0();
        this.f51687f.setController(null);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m76166s0() {
        if (this.f51686e.getController() == null || this.f51686e.getController().mo129603f() == null) {
            hxs.m133398k("context_livingAct", this.f51686e, ydt.f197625o);
        } else {
            this.f51686e.getController().mo129603f().start();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m76167t0(BLivePkFirstKillGift bLivePkFirstKillGift) {
        xdl0.m208344M(this, true);
        VDraweeView vDraweeView = this.f51687f;
        String str = bLivePkFirstKillGift.giftPicture;
        int i = t100.f167268q;
        hxs.m133408u("context_single_room", vDraweeView, str, i, i);
        this.f51688g.setText(bLivePkFirstKillGift.giftName);
        m76168u0();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m76168u0() {
        m76164o0();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
        this.f51690i = valueAnimatorOfInt;
        valueAnimatorOfInt.setRepeatMode(2);
        this.f51690i.setRepeatCount(-1);
        bt0.m103745r(this.f51690i, new Runnable() { // from class: l.en70
            @Override // java.lang.Runnable
            public final void run() {
                this.f92283a.m76166s0();
            }
        });
        this.f51690i.setDuration(6000L);
        bt0.m103749v(this.f51690i, new Runnable() { // from class: l.en70
            @Override // java.lang.Runnable
            public final void run() {
                this.f92283a.m76166s0();
            }
        });
        bt0.m103733f(this.f51690i, new Runnable() { // from class: l.fn70
            @Override // java.lang.Runnable
            public final void run() {
                this.f98402a.m76163n0();
            }
        });
        this.f51690i.start();
    }

    public PkFirstGiftView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkFirstGiftView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

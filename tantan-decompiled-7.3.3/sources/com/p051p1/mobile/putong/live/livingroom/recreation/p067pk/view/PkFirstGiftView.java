package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import p151v.VDraweeView;
import p151v.VText;
import p153l.av70;
import p153l.bnl0;
import p153l.gt0;
import p153l.gv70;
import p153l.i6t;
import p153l.iam;
import p153l.izs;
import p153l.mv70;
import p153l.qa00;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
public class PkFirstGiftView extends ConstraintLayout implements iam<i6t> {

    /* JADX INFO: renamed from: d */
    public View f52533d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f52534e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f52535f;

    /* JADX INFO: renamed from: g */
    public VText f52536g;

    /* JADX INFO: renamed from: h */
    public i6t f52537h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f52538i;

    public PkFirstGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m77341q0(View view) {
        i6t i6tVar = this.f52537h;
        if (i6tVar != null) {
            if (i6tVar instanceof gv70) {
                ((gv70) i6tVar).m132510P3();
            } else if (i6tVar instanceof av70) {
                ((av70) i6tVar).m100416P3();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m77342r() {
        bnl0.m105509E0(this.f52533d, new View.OnClickListener() { // from class: l.iv70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117023a.m77341q0(view);
            }
        });
        bnl0.m105509E0(this.f52536g, new View.OnClickListener() { // from class: l.jv70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122773a.m77343r0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m77343r0(View view) {
        i6t i6tVar = this.f52537h;
        if (i6tVar != null) {
            if (i6tVar instanceof gv70) {
                ((gv70) i6tVar).m132511R3();
            } else if (i6tVar instanceof av70) {
                ((av70) i6tVar).m100417R3();
            }
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        m77348p0();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m77344l0(View view) {
        mv70.m160253a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(i6t i6tVar) {
        this.f52537h = i6tVar;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m77346n0() {
        this.f52534e.setController(null);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m77347o0() {
        ValueAnimator valueAnimator = this.f52538i;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m77347o0();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77344l0(this);
        m77342r();
    }

    /* JADX INFO: renamed from: p0 */
    public void m77348p0() {
        bnl0.m105524M(this, false);
        this.f52536g.setText("");
        m77347o0();
        this.f52535f.setController(null);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m77349s0() {
        if (this.f52534e.getController() == null || this.f52534e.getController().mo108240f() == null) {
            izs.m142860k("context_livingAct", this.f52534e, zft.f204220o);
        } else {
            this.f52534e.getController().mo108240f().start();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m77350t0(BLivePkFirstKillGift bLivePkFirstKillGift) {
        bnl0.m105524M(this, true);
        VDraweeView vDraweeView = this.f52535f;
        String str = bLivePkFirstKillGift.giftPicture;
        int i = qa00.f156330q;
        izs.m142870u("context_single_room", vDraweeView, str, i, i);
        this.f52536g.setText(bLivePkFirstKillGift.giftName);
        m77351u0();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m77351u0() {
        m77347o0();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
        this.f52538i = valueAnimatorOfInt;
        valueAnimatorOfInt.setRepeatMode(2);
        this.f52538i.setRepeatCount(-1);
        gt0.m132172r(this.f52538i, new Runnable() { // from class: l.kv70
            @Override // java.lang.Runnable
            public final void run() {
                this.f128947a.m77349s0();
            }
        });
        this.f52538i.setDuration(6000L);
        gt0.m132176v(this.f52538i, new Runnable() { // from class: l.kv70
            @Override // java.lang.Runnable
            public final void run() {
                this.f128947a.m77349s0();
            }
        });
        gt0.m132160f(this.f52538i, new Runnable() { // from class: l.lv70
            @Override // java.lang.Runnable
            public final void run() {
                this.f133687a.m77346n0();
            }
        });
        this.f52538i.start();
    }

    public PkFirstGiftView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkFirstGiftView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

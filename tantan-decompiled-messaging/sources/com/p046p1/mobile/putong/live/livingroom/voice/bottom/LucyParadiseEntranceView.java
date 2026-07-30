package com.p046p1.mobile.putong.live.livingroom.voice.bottom;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.TXLiteAVCode;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.hxs;
import p149l.t100;
import p149l.vfw;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LucyParadiseEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LucyParadiseEntranceView f52901d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f52902e;

    /* JADX INFO: renamed from: f */
    public VText f52903f;

    /* JADX INFO: renamed from: g */
    public VText f52904g;

    /* JADX INFO: renamed from: h */
    public VText f52905h;

    /* JADX INFO: renamed from: i */
    public BLiveLuckyParadiseBottomEntrance f52906i;

    /* JADX INFO: renamed from: j */
    public AnimatorSet f52907j;

    public LucyParadiseEntranceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: n0 */
    private void m77753n0() {
        VText vText = this.f52903f;
        Boolean bool = Boolean.FALSE;
        m77755B0(vText, bool);
        m77755B0(this.f52904g, bool);
        AnimatorSet animatorSet = this.f52907j;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f52907j.cancel();
            this.f52907j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m77754u0() {
        xdl0.m208344M(this.f52904g, false);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m77755B0(TextView textView, Boolean bool) {
        int iM186890d = t100.m186890d(20.0f);
        textView.setAlpha(bool.booleanValue() ? 1.0f : 0.0f);
        textView.setTranslationY(bool.booleanValue() ? 0.0f : iM186890d);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77756m0(View view) {
        vfw.m198294a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public String m77757o0(long j) {
        long j2;
        long j3;
        if (j < 0) {
            return "";
        }
        if (j < 0 || j >= 3600) {
            j2 = j >= 3600 ? 59L : 0L;
            j3 = j2;
        } else {
            j3 = j % 60;
            j2 = j / 60;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append(":");
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77753n0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77756m0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m77758p0() {
        m77753n0();
        xdl0.m208344M(this.f52905h, false);
        if (NullChecker.m81303a(this.f52906i)) {
            setIcon(this.f52906i.defaultIcon);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public Boolean m77759q0() {
        return Boolean.valueOf(NullChecker.m81303a(this.f52903f) && xdl0.m208349O0(this.f52903f));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m77760r0() {
        xdl0.m208344M(this.f52904g, true);
        xdl0.m208344M(this.f52903f, true);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m77761s0() {
        xdl0.m208344M(this.f52903f, false);
    }

    public void setIcon(String str) {
        hxs.m133407t("context_livingAct", this.f52902e, str, t100.f167274w);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m77762t0() {
        xdl0.m208344M(this.f52903f, true);
        xdl0.m208344M(this.f52904g, true);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m77763v0() {
        this.f52907j.start();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m77764w0() {
        m77753n0();
        m77755B0(this.f52903f, Boolean.TRUE);
        if (this.f52907j == null) {
            Animator animatorM103737j = bt0.m103737j(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
            Property property = ViewGroup.TRANSLATION_Y;
            ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103739l(this.f52903f, property, 0L, 300L, null, 0.0f, -4.0f);
            Property property2 = ViewGroup.ALPHA;
            ObjectAnimator objectAnimator2 = (ObjectAnimator) bt0.m103739l(this.f52903f, property2, 0L, 300L, null, 1.0f, 0.0f);
            ObjectAnimator objectAnimator3 = (ObjectAnimator) bt0.m103739l(this.f52904g, property, 0L, 300L, null, 4.0f, 0.0f);
            ObjectAnimator objectAnimator4 = (ObjectAnimator) bt0.m103739l(this.f52904g, property2, 0L, 300L, null, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            bt0.m103750w(objectAnimator2, new Runnable() { // from class: l.qfw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154294a.m77760r0();
                }
            }, new Runnable() { // from class: l.rfw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159206a.m77761s0();
                }
            });
            animatorSet.playTogether(objectAnimator, objectAnimator2, objectAnimator3, objectAnimator4);
            Animator animatorM103737j2 = bt0.m103737j(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
            ObjectAnimator objectAnimator5 = (ObjectAnimator) bt0.m103739l(this.f52904g, property, 0L, 300L, null, 0.0f, -12.0f);
            ObjectAnimator objectAnimator6 = (ObjectAnimator) bt0.m103739l(this.f52904g, property2, 0L, 300L, null, 1.0f, 0.0f);
            ObjectAnimator objectAnimator7 = (ObjectAnimator) bt0.m103739l(this.f52903f, property, 200L, 300L, null, 12.0f, 0.0f);
            ObjectAnimator objectAnimator8 = (ObjectAnimator) bt0.m103739l(this.f52903f, property2, 200L, 300L, null, 0.0f, 1.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            bt0.m103750w(objectAnimator6, new Runnable() { // from class: l.sfw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164346a.m77762t0();
                }
            }, new Runnable() { // from class: l.tfw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170029a.m77754u0();
                }
            });
            animatorSet2.playTogether(objectAnimator5, objectAnimator6, objectAnimator7, objectAnimator8);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f52907j = animatorSet3;
            animatorSet3.playSequentially(animatorM103737j, animatorSet, animatorM103737j2, animatorSet2);
        }
        bt0.m103733f(this.f52907j, new Runnable() { // from class: l.ufw
            @Override // java.lang.Runnable
            public final void run() {
                this.f176334a.m77763v0();
            }
        });
        this.f52907j.start();
    }

    /* JADX INFO: renamed from: y0 */
    public void m77765y0(BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance) {
        this.f52906i = bLiveLuckyParadiseBottomEntrance;
        xdl0.m208344M(this.f52905h, !TextUtils.isEmpty(bLiveLuckyParadiseBottomEntrance.tip));
        if (!TextUtils.isEmpty(bLiveLuckyParadiseBottomEntrance.tip)) {
            this.f52905h.setText(bLiveLuckyParadiseBottomEntrance.tip);
        }
        if (bLiveLuckyParadiseBottomEntrance.isCrazyNow) {
            setIcon(bLiveLuckyParadiseBottomEntrance.crazyIcon);
            xdl0.m208344M(this.f52903f, true);
            m77766z0(bLiveLuckyParadiseBottomEntrance.endTime - bLiveLuckyParadiseBottomEntrance.currentTime);
        } else {
            if (!bLiveLuckyParadiseBottomEntrance.buff || TextUtils.isEmpty(bLiveLuckyParadiseBottomEntrance.buffText) || TextUtils.isEmpty(bLiveLuckyParadiseBottomEntrance.buffIcon)) {
                m77758p0();
                return;
            }
            this.f52904g.setText(bLiveLuckyParadiseBottomEntrance.buffText);
            m77766z0(bLiveLuckyParadiseBottomEntrance.endTime - bLiveLuckyParadiseBottomEntrance.currentTime);
            hxs.m133407t("context_livingAct", this.f52902e, bLiveLuckyParadiseBottomEntrance.buffIcon, t100.f167274w);
            xdl0.m208344M(this.f52903f, true);
            if (this.f52907j == null) {
                m77764w0();
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m77766z0(long j) {
        this.f52903f.setText(m77757o0(j / 1000));
    }

    public LucyParadiseEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LucyParadiseEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f52902e.setImageResource(i);
    }
}

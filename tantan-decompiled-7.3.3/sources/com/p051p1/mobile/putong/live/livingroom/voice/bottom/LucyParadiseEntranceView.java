package com.p051p1.mobile.putong.live.livingroom.voice.bottom;

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
import com.p051p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.TXLiteAVCode;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.izs;
import p153l.qa00;
import p153l.thw;

/* JADX INFO: loaded from: classes5.dex */
public class LucyParadiseEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LucyParadiseEntranceView f53749d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53750e;

    /* JADX INFO: renamed from: f */
    public VText f53751f;

    /* JADX INFO: renamed from: g */
    public VText f53752g;

    /* JADX INFO: renamed from: h */
    public VText f53753h;

    /* JADX INFO: renamed from: i */
    public BLiveLuckyParadiseBottomEntrance f53754i;

    /* JADX INFO: renamed from: j */
    public AnimatorSet f53755j;

    public LucyParadiseEntranceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: n0 */
    private void m78936n0() {
        VText vText = this.f53751f;
        Boolean bool = Boolean.FALSE;
        m78938B0(vText, bool);
        m78938B0(this.f53752g, bool);
        AnimatorSet animatorSet = this.f53755j;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f53755j.cancel();
            this.f53755j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m78937u0() {
        bnl0.m105524M(this.f53752g, false);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m78938B0(TextView textView, Boolean bool) {
        int iM175859d = qa00.m175859d(20.0f);
        textView.setAlpha(bool.booleanValue() ? 1.0f : 0.0f);
        textView.setTranslationY(bool.booleanValue() ? 0.0f : iM175859d);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78939m0(View view) {
        thw.m191300a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public String m78940o0(long j) {
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
        m78936n0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78939m0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m78941p0() {
        m78936n0();
        bnl0.m105524M(this.f53753h, false);
        if (NullChecker.m82486a(this.f53754i)) {
            setIcon(this.f53754i.defaultIcon);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public Boolean m78942q0() {
        return Boolean.valueOf(NullChecker.m82486a(this.f53751f) && bnl0.m105529O0(this.f53751f));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m78943r0() {
        bnl0.m105524M(this.f53752g, true);
        bnl0.m105524M(this.f53751f, true);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m78944s0() {
        bnl0.m105524M(this.f53751f, false);
    }

    public void setIcon(String str) {
        izs.m142869t("context_livingAct", this.f53750e, str, qa00.f156336w);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m78945t0() {
        bnl0.m105524M(this.f53751f, true);
        bnl0.m105524M(this.f53752g, true);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m78946v0() {
        this.f53755j.start();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m78947w0() {
        m78936n0();
        m78938B0(this.f53751f, Boolean.TRUE);
        if (this.f53755j == null) {
            Animator animatorM132164j = gt0.m132164j(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
            Property property = ViewGroup.TRANSLATION_Y;
            ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132166l(this.f53751f, property, 0L, 300L, null, 0.0f, -4.0f);
            Property property2 = ViewGroup.ALPHA;
            ObjectAnimator objectAnimator2 = (ObjectAnimator) gt0.m132166l(this.f53751f, property2, 0L, 300L, null, 1.0f, 0.0f);
            ObjectAnimator objectAnimator3 = (ObjectAnimator) gt0.m132166l(this.f53752g, property, 0L, 300L, null, 4.0f, 0.0f);
            ObjectAnimator objectAnimator4 = (ObjectAnimator) gt0.m132166l(this.f53752g, property2, 0L, 300L, null, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            gt0.m132177w(objectAnimator2, new Runnable() { // from class: l.ohw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f147490a.m78943r0();
                }
            }, new Runnable() { // from class: l.phw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152492a.m78944s0();
                }
            });
            animatorSet.playTogether(objectAnimator, objectAnimator2, objectAnimator3, objectAnimator4);
            Animator animatorM132164j2 = gt0.m132164j(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
            ObjectAnimator objectAnimator5 = (ObjectAnimator) gt0.m132166l(this.f53752g, property, 0L, 300L, null, 0.0f, -12.0f);
            ObjectAnimator objectAnimator6 = (ObjectAnimator) gt0.m132166l(this.f53752g, property2, 0L, 300L, null, 1.0f, 0.0f);
            ObjectAnimator objectAnimator7 = (ObjectAnimator) gt0.m132166l(this.f53751f, property, 200L, 300L, null, 12.0f, 0.0f);
            ObjectAnimator objectAnimator8 = (ObjectAnimator) gt0.m132166l(this.f53751f, property2, 200L, 300L, null, 0.0f, 1.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            gt0.m132177w(objectAnimator6, new Runnable() { // from class: l.qhw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157769a.m78945t0();
                }
            }, new Runnable() { // from class: l.rhw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163207a.m78937u0();
                }
            });
            animatorSet2.playTogether(objectAnimator5, objectAnimator6, objectAnimator7, objectAnimator8);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f53755j = animatorSet3;
            animatorSet3.playSequentially(animatorM132164j, animatorSet, animatorM132164j2, animatorSet2);
        }
        gt0.m132160f(this.f53755j, new Runnable() { // from class: l.shw
            @Override // java.lang.Runnable
            public final void run() {
                this.f168765a.m78946v0();
            }
        });
        this.f53755j.start();
    }

    /* JADX INFO: renamed from: y0 */
    public void m78948y0(BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance) {
        this.f53754i = bLiveLuckyParadiseBottomEntrance;
        bnl0.m105524M(this.f53753h, !TextUtils.isEmpty(bLiveLuckyParadiseBottomEntrance.tip));
        if (!TextUtils.isEmpty(bLiveLuckyParadiseBottomEntrance.tip)) {
            this.f53753h.setText(bLiveLuckyParadiseBottomEntrance.tip);
        }
        if (bLiveLuckyParadiseBottomEntrance.isCrazyNow) {
            setIcon(bLiveLuckyParadiseBottomEntrance.crazyIcon);
            bnl0.m105524M(this.f53751f, true);
            m78949z0(bLiveLuckyParadiseBottomEntrance.endTime - bLiveLuckyParadiseBottomEntrance.currentTime);
        } else {
            if (!bLiveLuckyParadiseBottomEntrance.buff || TextUtils.isEmpty(bLiveLuckyParadiseBottomEntrance.buffText) || TextUtils.isEmpty(bLiveLuckyParadiseBottomEntrance.buffIcon)) {
                m78941p0();
                return;
            }
            this.f53752g.setText(bLiveLuckyParadiseBottomEntrance.buffText);
            m78949z0(bLiveLuckyParadiseBottomEntrance.endTime - bLiveLuckyParadiseBottomEntrance.currentTime);
            izs.m142869t("context_livingAct", this.f53750e, bLiveLuckyParadiseBottomEntrance.buffIcon, qa00.f156336w);
            bnl0.m105524M(this.f53751f, true);
            if (this.f53755j == null) {
                m78947w0();
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m78949z0(long j) {
        this.f53751f.setText(m78940o0(j / 1000));
    }

    public LucyParadiseEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LucyParadiseEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f53750e.setImageResource(i);
    }
}

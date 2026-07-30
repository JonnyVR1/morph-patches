package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonAnimation;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.i3c0;
import p002l.tjc0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RedDotButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4574a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4575b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f4576c;

    /* JADX INFO: renamed from: d */
    public View f4577d;

    /* JADX INFO: renamed from: e */
    public CountDownTimer f4578e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.RedDotButton$a */
    public class CountDownTimerC0309a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveBottomButton f4579a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC0309a(long j, long j2, BLiveBottomButton bLiveBottomButton) {
            super(j, j2);
            this.f4579a = bLiveBottomButton;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            RedDotButton redDotButton = RedDotButton.this;
            BLiveButtonAnimation bLiveButtonAnimation = this.f4579a.animation;
            redDotButton.m5665d(bLiveButtonAnimation.playGapSeconds, bLiveButtonAnimation.url);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.RedDotButton$b */
    public class CountDownTimerC0310b extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f4581a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.RedDotButton$b$a */
        public class a extends AnimListener {
            public a() {
            }

            public void onFinished() {
                super.onFinished();
                xdl0.M(RedDotButton.this.f4576c, false);
                xdl0.M(RedDotButton.this.f4575b, true);
            }

            public void onStart() {
                super.onStart();
                xdl0.M(RedDotButton.this.f4576c, true);
                xdl0.M(RedDotButton.this.f4575b, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC0310b(long j, long j2, String str) {
            super(j, j2);
            this.f4581a = str;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            SVGALoader.with(RedDotButton.this.getContext()).from(this.f4581a).repeatCount(1).animListener(new a()).into(RedDotButton.this.f4576c);
        }
    }

    public RedDotButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m5663b(View view) {
        tjc0.m22984a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m5664c(BLiveBottomButton bLiveBottomButton) {
        CountDownTimer countDownTimer = this.f4578e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (TextUtils.isEmpty(bLiveBottomButton.animation.url)) {
            return;
        }
        BLiveButtonAnimation bLiveButtonAnimation = bLiveBottomButton.animation;
        if (bLiveButtonAnimation.enterPlayOffsetSeconds < 0 || bLiveButtonAnimation.playGapSeconds < 0) {
            return;
        }
        CountDownTimerC0309a countDownTimerC0309a = new CountDownTimerC0309a(bLiveBottomButton.animation.enterPlayOffsetSeconds * 1000, 1000L, bLiveBottomButton);
        this.f4578e = countDownTimerC0309a;
        countDownTimerC0309a.start();
    }

    /* JADX INFO: renamed from: d */
    public final void m5665d(long j, String str) {
        CountDownTimerC0310b countDownTimerC0310b = new CountDownTimerC0310b(Long.MAX_VALUE, j * 1000, str);
        this.f4578e = countDownTimerC0310b;
        countDownTimerC0310b.start();
    }

    /* JADX INFO: renamed from: e */
    public void m5666e() {
        this.f4574a.setBackgroundResource(i3c0.f13011y0);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4577d, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.f4578e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5663b(this);
    }

    public void setLocalIcon(int i) {
        this.f4575b.setImageResource(i);
    }

    public void setRemoteIcon(String str) {
        hxs.u("context_single_room", this.f4575b, str, t100.d(44.0f), t100.d(38.0f));
    }
}

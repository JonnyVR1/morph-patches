package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonAnimation;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.tjc0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class RedDotButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public FrameLayout f48532a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f48533b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f48534c;

    /* JADX INFO: renamed from: d */
    public View f48535d;

    /* JADX INFO: renamed from: e */
    public CountDownTimer f48536e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.RedDotButton$a */
    public class CountDownTimerC12720a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveBottomButton f48537a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC12720a(long j, long j2, BLiveBottomButton bLiveBottomButton) {
            super(j, j2);
            this.f48537a = bLiveBottomButton;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            RedDotButton redDotButton = RedDotButton.this;
            BLiveButtonAnimation bLiveButtonAnimation = this.f48537a.animation;
            redDotButton.m72192d(bLiveButtonAnimation.playGapSeconds, bLiveButtonAnimation.url);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.RedDotButton$b */
    public class CountDownTimerC12721b extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f48539a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.RedDotButton$b$a */
        public class a extends AnimListener {
            public a() {
            }

            @Override // com.tantan.library.svga.AnimListener
            public void onFinished() {
                super.onFinished();
                xdl0.m208344M(RedDotButton.this.f48534c, false);
                xdl0.m208344M(RedDotButton.this.f48533b, true);
            }

            @Override // com.tantan.library.svga.AnimListener
            public void onStart() {
                super.onStart();
                xdl0.m208344M(RedDotButton.this.f48534c, true);
                xdl0.m208344M(RedDotButton.this.f48533b, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC12721b(long j, long j2, String str) {
            super(j, j2);
            this.f48539a = str;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            SVGALoader.with(RedDotButton.this.getContext()).from(this.f48539a).repeatCount(1).animListener(new a()).into(RedDotButton.this.f48534c);
        }
    }

    public RedDotButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m72190b(View view) {
        tjc0.m189250a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m72191c(BLiveBottomButton bLiveBottomButton) {
        CountDownTimer countDownTimer = this.f48536e;
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
        CountDownTimerC12720a countDownTimerC12720a = new CountDownTimerC12720a(bLiveBottomButton.animation.enterPlayOffsetSeconds * 1000, 1000L, bLiveBottomButton);
        this.f48536e = countDownTimerC12720a;
        countDownTimerC12720a.start();
    }

    /* JADX INFO: renamed from: d */
    public final void m72192d(long j, String str) {
        CountDownTimerC12721b countDownTimerC12721b = new CountDownTimerC12721b(Long.MAX_VALUE, j * 1000, str);
        this.f48536e = countDownTimerC12721b;
        countDownTimerC12721b.start();
    }

    /* JADX INFO: renamed from: e */
    public void m72193e() {
        this.f48532a.setBackgroundResource(i3c0.f111226y0);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48535d, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.f48536e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72190b(this);
    }

    public void setLocalIcon(int i) {
        this.f48533b.setImageResource(i);
    }

    public void setRemoteIcon(String str) {
        hxs.m133408u("context_single_room", this.f48533b, str, t100.m186890d(44.0f), t100.m186890d(38.0f));
    }
}

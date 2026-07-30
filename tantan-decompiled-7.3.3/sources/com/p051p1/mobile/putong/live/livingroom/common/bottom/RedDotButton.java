package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonAnimation;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p153l.asc0;
import p153l.bnl0;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class RedDotButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public FrameLayout f49380a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49381b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f49382c;

    /* JADX INFO: renamed from: d */
    public View f49383d;

    /* JADX INFO: renamed from: e */
    public CountDownTimer f49384e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.RedDotButton$a */
    public class CountDownTimerC12883a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveBottomButton f49385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC12883a(long j, long j2, BLiveBottomButton bLiveBottomButton) {
            super(j, j2);
            this.f49385a = bLiveBottomButton;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            RedDotButton redDotButton = RedDotButton.this;
            BLiveButtonAnimation bLiveButtonAnimation = this.f49385a.animation;
            redDotButton.m73375d(bLiveButtonAnimation.playGapSeconds, bLiveButtonAnimation.url);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.RedDotButton$b */
    public class CountDownTimerC12884b extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f49387a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.RedDotButton$b$a */
        public class a extends AnimListener {
            public a() {
            }

            @Override // com.tantan.library.svga.AnimListener
            public void onFinished() {
                super.onFinished();
                bnl0.m105524M(RedDotButton.this.f49382c, false);
                bnl0.m105524M(RedDotButton.this.f49381b, true);
            }

            @Override // com.tantan.library.svga.AnimListener
            public void onStart() {
                super.onStart();
                bnl0.m105524M(RedDotButton.this.f49382c, true);
                bnl0.m105524M(RedDotButton.this.f49381b, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC12884b(long j, long j2, String str) {
            super(j, j2);
            this.f49387a = str;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            SVGALoader.with(RedDotButton.this.getContext()).from(this.f49387a).repeatCount(1).animListener(new a()).into(RedDotButton.this.f49382c);
        }
    }

    public RedDotButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m73373b(View view) {
        asc0.m99897a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m73374c(BLiveBottomButton bLiveBottomButton) {
        CountDownTimer countDownTimer = this.f49384e;
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
        CountDownTimerC12883a countDownTimerC12883a = new CountDownTimerC12883a(bLiveBottomButton.animation.enterPlayOffsetSeconds * 1000, 1000L, bLiveBottomButton);
        this.f49384e = countDownTimerC12883a;
        countDownTimerC12883a.start();
    }

    /* JADX INFO: renamed from: d */
    public final void m73375d(long j, String str) {
        CountDownTimerC12884b countDownTimerC12884b = new CountDownTimerC12884b(Long.MAX_VALUE, j * 1000, str);
        this.f49384e = countDownTimerC12884b;
        countDownTimerC12884b.start();
    }

    /* JADX INFO: renamed from: e */
    public void m73376e() {
        this.f49380a.setBackgroundResource(obc0.f146554y0);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49383d, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.f49384e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73373b(this);
    }

    public void setLocalIcon(int i) {
        this.f49381b.setImageResource(i);
    }

    public void setRemoteIcon(String str) {
        izs.m142870u("context_single_room", this.f49381b, str, qa00.m175859d(44.0f), qa00.m175859d(38.0f));
    }
}

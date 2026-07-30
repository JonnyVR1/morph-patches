package com.p051p1.mobile.putong.live.livingroom.view.rollview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.dhw;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class LiveTextRollView extends LiveRollView<HorizontalMarqueeView> {

    /* JADX INFO: renamed from: i */
    public int f52968i;

    /* JADX INFO: renamed from: j */
    public int f52969j;

    /* JADX INFO: renamed from: k */
    public int f52970k;

    public LiveTextRollView(Context context) {
        super(context);
        this.f52968i = 1200;
        this.f52969j = 500;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m77892A(Runnable runnable, Integer num) {
        m77900I(runnable);
    }

    /* JADX INFO: renamed from: C */
    public void m77894C(String str, boolean z) {
        HorizontalMarqueeView horizontalMarqueeViewM77875j = m77875j(z);
        if (NullChecker.m82486a(horizontalMarqueeViewM77875j)) {
            horizontalMarqueeViewM77875j.setMarqueeText(str);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m77895D(String str) {
        m77894C(str, true);
    }

    /* JADX INFO: renamed from: E */
    public void m77896E(int i, boolean z) {
        HorizontalMarqueeView horizontalMarqueeViewM77875j = m77875j(true);
        if (NullChecker.m82486a(horizontalMarqueeViewM77875j)) {
            horizontalMarqueeViewM77875j.setGravity(i);
            horizontalMarqueeViewM77875j.setFillViewport(z);
        }
        HorizontalMarqueeView horizontalMarqueeViewM77875j2 = m77875j(false);
        if (NullChecker.m82486a(horizontalMarqueeViewM77875j2)) {
            horizontalMarqueeViewM77875j2.setGravity(i);
            horizontalMarqueeViewM77875j2.setFillViewport(z);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void m77893B(final Runnable runnable) {
        if (m77874i(m77875j(true)) <= this.f52960c) {
            runnable.run();
        } else if (getWidth() > 0) {
            m77900I(runnable);
        } else {
            bnl0.m105520K(this).first().subscribe(dhw.m115825d(new y20() { // from class: l.gdu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103734a.m77892A(runnable, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m77898G(String str, final Runnable runnable) {
        m77894C(str, false);
        m77888w(new x20() { // from class: l.fdu
            @Override // p153l.x20
            public final void call() {
                this.f98507a.m77893B(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public void m77899H(int i) {
        setPreAnim(i);
        showNext();
    }

    /* JADX INFO: renamed from: I */
    public final void m77900I(Runnable runnable) {
        HorizontalMarqueeView horizontalMarqueeViewM77875j = m77875j(true);
        if (NullChecker.m82486a(horizontalMarqueeViewM77875j)) {
            horizontalMarqueeViewM77875j.setAnimDuration(this.f52968i);
            horizontalMarqueeViewM77875j.m75479c(this.f52969j, runnable, this.f52970k);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveRollView, android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        HorizontalMarqueeView horizontalMarqueeView = new HorizontalMarqueeView(getContext());
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 8388627;
        horizontalMarqueeView.setTextColor(this.f52959b);
        horizontalMarqueeView.setTextSize(this.f52958a);
        horizontalMarqueeView.setMaxLines(1);
        horizontalMarqueeView.setSingleLine(true);
        horizontalMarqueeView.setEllipsize(TextUtils.TruncateAt.END);
        horizontalMarqueeView.setLayoutParams(layoutParams);
        horizontalMarqueeView.setGravity(8388627);
        return horizontalMarqueeView;
    }

    public void setGap(int i) {
        this.f52970k = i;
    }

    public void setMarqueeDelayTime(int i) {
        this.f52969j = i;
    }

    public void setMarqueeTime(int i) {
        this.f52968i = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveRollView
    /* JADX INFO: renamed from: t */
    public void mo77885t() {
        HorizontalMarqueeView horizontalMarqueeViewM77875j = m77875j(true);
        if (NullChecker.m82486a(horizontalMarqueeViewM77875j)) {
            horizontalMarqueeViewM77875j.m75478b();
        }
        HorizontalMarqueeView horizontalMarqueeViewM77875j2 = m77875j(false);
        if (NullChecker.m82486a(horizontalMarqueeViewM77875j2)) {
            horizontalMarqueeViewM77875j2.m75478b();
        }
    }

    public LiveTextRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52968i = 1200;
        this.f52969j = 500;
    }
}

package com.p046p1.mobile.putong.live.livingroom.view.rollview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveTextRollView extends LiveRollView<HorizontalMarqueeView> {

    /* JADX INFO: renamed from: i */
    public int f52120i;

    /* JADX INFO: renamed from: j */
    public int f52121j;

    /* JADX INFO: renamed from: k */
    public int f52122k;

    public LiveTextRollView(Context context) {
        super(context);
        this.f52120i = 1200;
        this.f52121j = 500;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m76709A(Runnable runnable, Integer num) {
        m76717I(runnable);
    }

    /* JADX INFO: renamed from: C */
    public void m76711C(String str, boolean z) {
        HorizontalMarqueeView horizontalMarqueeViewM76692j = m76692j(z);
        if (NullChecker.m81303a(horizontalMarqueeViewM76692j)) {
            horizontalMarqueeViewM76692j.setMarqueeText(str);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m76712D(String str) {
        m76711C(str, true);
    }

    /* JADX INFO: renamed from: E */
    public void m76713E(int i, boolean z) {
        HorizontalMarqueeView horizontalMarqueeViewM76692j = m76692j(true);
        if (NullChecker.m81303a(horizontalMarqueeViewM76692j)) {
            horizontalMarqueeViewM76692j.setGravity(i);
            horizontalMarqueeViewM76692j.setFillViewport(z);
        }
        HorizontalMarqueeView horizontalMarqueeViewM76692j2 = m76692j(false);
        if (NullChecker.m81303a(horizontalMarqueeViewM76692j2)) {
            horizontalMarqueeViewM76692j2.setGravity(i);
            horizontalMarqueeViewM76692j2.setFillViewport(z);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void m76710B(final Runnable runnable) {
        if (m76691i(m76692j(true)) <= this.f52112c) {
            runnable.run();
        } else if (getWidth() > 0) {
            m76717I(runnable);
        } else {
            xdl0.m208340K(this).first().subscribe(ffw.m121193d(new e30() { // from class: l.fbu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f96750a.m76709A(runnable, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m76715G(String str, final Runnable runnable) {
        m76711C(str, false);
        m76705w(new d30() { // from class: l.ebu
            @Override // p149l.d30
            public final void call() {
                this.f90378a.m76710B(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public void m76716H(int i) {
        setPreAnim(i);
        showNext();
    }

    /* JADX INFO: renamed from: I */
    public final void m76717I(Runnable runnable) {
        HorizontalMarqueeView horizontalMarqueeViewM76692j = m76692j(true);
        if (NullChecker.m81303a(horizontalMarqueeViewM76692j)) {
            horizontalMarqueeViewM76692j.setAnimDuration(this.f52120i);
            horizontalMarqueeViewM76692j.m74296c(this.f52121j, runnable, this.f52122k);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveRollView, android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        HorizontalMarqueeView horizontalMarqueeView = new HorizontalMarqueeView(getContext());
        int i = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 8388627;
        horizontalMarqueeView.setTextColor(this.f52111b);
        horizontalMarqueeView.setTextSize(this.f52110a);
        horizontalMarqueeView.setMaxLines(1);
        horizontalMarqueeView.setSingleLine(true);
        horizontalMarqueeView.setEllipsize(TextUtils.TruncateAt.END);
        horizontalMarqueeView.setLayoutParams(layoutParams);
        horizontalMarqueeView.setGravity(8388627);
        return horizontalMarqueeView;
    }

    public void setGap(int i) {
        this.f52122k = i;
    }

    public void setMarqueeDelayTime(int i) {
        this.f52121j = i;
    }

    public void setMarqueeTime(int i) {
        this.f52120i = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveRollView
    /* JADX INFO: renamed from: t */
    public void mo76702t() {
        HorizontalMarqueeView horizontalMarqueeViewM76692j = m76692j(true);
        if (NullChecker.m81303a(horizontalMarqueeViewM76692j)) {
            horizontalMarqueeViewM76692j.m74295b();
        }
        HorizontalMarqueeView horizontalMarqueeViewM76692j2 = m76692j(false);
        if (NullChecker.m81303a(horizontalMarqueeViewM76692j2)) {
            horizontalMarqueeViewM76692j2.m74295b();
        }
    }

    public LiveTextRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52120i = 1200;
        this.f52121j = 500;
    }
}

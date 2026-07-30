package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.gpr;
import p149l.l9s;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveActivitiesEntryAll extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveActivitiesEntryAnimBackground f46247a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f46248b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f46249c;

    /* JADX INFO: renamed from: d */
    public View f46250d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f46251e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f46252f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f46253g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f46254h;

    /* JADX INFO: renamed from: i */
    public VMarqueeText f46255i;

    /* JADX INFO: renamed from: j */
    public VText f46256j;

    /* JADX INFO: renamed from: k */
    public VFrame f46257k;

    public LiveActivitiesEntryAll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m70846a(View view) {
        gpr.m127480a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m70847b(int i, int i2) {
        xdl0.m208344M(this.f46250d, false);
        if (i != 5) {
            xdl0.m208344M(this.f46248b, false);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f46254h.getLayoutParams();
        if (i2 != 5) {
            xdl0.m208344M(this.f46253g, false);
            xdl0.m208344M(this.f46252f, false);
            layoutParams.width = t100.m186890d(85.0f);
        } else {
            layoutParams.width = t100.m186890d(116.0f);
        }
        this.f46254h.setLayoutParams(layoutParams);
        if (i2 == 2) {
            boolean zM149078h = l9s.m149078h();
            LinearLayout linearLayout = this.f46254h;
            if (zM149078h) {
                xdl0.m208358V(linearLayout, t100.m186890d(40.0f));
            } else {
                xdl0.m208358V(linearLayout, t100.m186890d(44.0f));
            }
        } else if (i2 == 0 || i2 == 1) {
            xdl0.m208358V(this.f46254h, t100.m186890d(55.0f));
        }
        xdl0.m208344M(this.f46257k, false);
        xdl0.m208344M(this.f46256j, true);
        xdl0.m208344M(this.f46255i, true);
        this.f46255i.setTextSize(14.0f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70846a(this);
        if (l9s.m149078h()) {
            this.f46255i.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }
}

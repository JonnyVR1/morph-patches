package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.bnl0;
import p153l.hrr;
import p153l.mbs;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class LiveActivitiesEntryAll extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveActivitiesEntryAnimBackground f47095a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f47096b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f47097c;

    /* JADX INFO: renamed from: d */
    public View f47098d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f47099e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f47100f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f47101g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f47102h;

    /* JADX INFO: renamed from: i */
    public VMarqueeText f47103i;

    /* JADX INFO: renamed from: j */
    public VText f47104j;

    /* JADX INFO: renamed from: k */
    public VFrame f47105k;

    public LiveActivitiesEntryAll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m72029a(View view) {
        hrr.m136921a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72030b(int i, int i2) {
        bnl0.m105524M(this.f47098d, false);
        if (i != 5) {
            bnl0.m105524M(this.f47096b, false);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f47102h.getLayoutParams();
        if (i2 != 5) {
            bnl0.m105524M(this.f47101g, false);
            bnl0.m105524M(this.f47100f, false);
            layoutParams.width = qa00.m175859d(85.0f);
        } else {
            layoutParams.width = qa00.m175859d(116.0f);
        }
        this.f47102h.setLayoutParams(layoutParams);
        if (i2 == 2) {
            boolean zM157855h = mbs.m157855h();
            LinearLayout linearLayout = this.f47102h;
            if (zM157855h) {
                bnl0.m105538V(linearLayout, qa00.m175859d(40.0f));
            } else {
                bnl0.m105538V(linearLayout, qa00.m175859d(44.0f));
            }
        } else if (i2 == 0 || i2 == 1) {
            bnl0.m105538V(this.f47102h, qa00.m175859d(55.0f));
        }
        bnl0.m105524M(this.f47105k, false);
        bnl0.m105524M(this.f47104j, true);
        bnl0.m105524M(this.f47103i, true);
        this.f47103i.setTextSize(14.0f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72029a(this);
        if (mbs.m157855h()) {
            this.f47103i.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }
}

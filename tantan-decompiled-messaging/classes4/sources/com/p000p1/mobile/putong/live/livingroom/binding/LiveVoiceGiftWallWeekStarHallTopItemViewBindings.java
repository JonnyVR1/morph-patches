package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceWeekStarHallTop3ItemView;
import l.jfd0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceGiftWallWeekStarHallTopItemViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceWeekStarHallTop3ItemView f4375d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4376e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4377f;

    /* JADX INFO: renamed from: g */
    public VImage f4378g;

    /* JADX INFO: renamed from: h */
    public VText f4379h;

    /* JADX INFO: renamed from: i */
    public VText f4380i;

    public LiveVoiceGiftWallWeekStarHallTopItemViewBindings(Context context) {
        super(context);
    }

    public VoiceWeekStarHallTop3ItemView getRoot() {
        return this.f4375d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5536h0(ViewGroup viewGroup) {
        this.f4375d = (VoiceWeekStarHallTop3ItemView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4376e = childAt;
        String str = childAt == null ? "_bg_view" : null;
        VDraweeView childAt2 = viewGroup.getChildAt(1);
        this.f4377f = childAt2;
        if (childAt2 == null) {
            str = "_avatar";
        }
        VImage childAt3 = viewGroup.getChildAt(2);
        this.f4378g = childAt3;
        if (childAt3 == null) {
            str = "_crown";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f4379h = childAt4;
        if (childAt4 == null) {
            str = "_name";
        }
        VText childAt5 = viewGroup.getChildAt(4);
        this.f4380i = childAt5;
        if (childAt5 == null) {
            str = "_week_star";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5536h0(this);
    }

    public LiveVoiceGiftWallWeekStarHallTopItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceGiftWallWeekStarHallTopItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

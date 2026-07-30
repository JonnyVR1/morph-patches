package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceWeekStarHallTop3ItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceGiftWallWeekStarHallTopItemViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceWeekStarHallTop3ItemView f48333d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48334e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f48335f;

    /* JADX INFO: renamed from: g */
    public VImage f48336g;

    /* JADX INFO: renamed from: h */
    public VText f48337h;

    /* JADX INFO: renamed from: i */
    public VText f48338i;

    public LiveVoiceGiftWallWeekStarHallTopItemViewBindings(Context context) {
        super(context);
    }

    public VoiceWeekStarHallTop3ItemView getRoot() {
        return this.f48333d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72067h0(ViewGroup viewGroup) {
        this.f48333d = (VoiceWeekStarHallTop3ItemView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48334e = vDraweeView;
        String str = vDraweeView == null ? "_bg_view" : null;
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(1);
        this.f48335f = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_avatar";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f48336g = vImage;
        if (vImage == null) {
            str = "_crown";
        }
        VText vText = (VText) viewGroup.getChildAt(3);
        this.f48337h = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) viewGroup.getChildAt(4);
        this.f48338i = vText2;
        if (vText2 == null) {
            str = "_week_star";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72067h0(this);
    }

    public LiveVoiceGiftWallWeekStarHallTopItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceGiftWallWeekStarHallTopItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

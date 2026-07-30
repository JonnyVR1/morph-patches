package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceWeekStarHallTop3ItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceGiftWallWeekStarHallTopItemViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceWeekStarHallTop3ItemView f49181d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49182e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49183f;

    /* JADX INFO: renamed from: g */
    public VImage f49184g;

    /* JADX INFO: renamed from: h */
    public VText f49185h;

    /* JADX INFO: renamed from: i */
    public VText f49186i;

    public LiveVoiceGiftWallWeekStarHallTopItemViewBindings(Context context) {
        super(context);
    }

    public VoiceWeekStarHallTop3ItemView getRoot() {
        return this.f49181d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73250h0(ViewGroup viewGroup) {
        this.f49181d = (VoiceWeekStarHallTop3ItemView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f49182e = vDraweeView;
        String str = vDraweeView == null ? "_bg_view" : null;
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(1);
        this.f49183f = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_avatar";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f49184g = vImage;
        if (vImage == null) {
            str = "_crown";
        }
        VText vText = (VText) viewGroup.getChildAt(3);
        this.f49185h = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) viewGroup.getChildAt(4);
        this.f49186i = vText2;
        if (vText2 == null) {
            str = "_week_star";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73250h0(this);
    }

    public LiveVoiceGiftWallWeekStarHallTopItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceGiftWallWeekStarHallTopItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

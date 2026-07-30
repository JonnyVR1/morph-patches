package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.guide.HeatTaskItemView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHeatTaskItemLayoutBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public HeatTaskItemView f48339d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48340e;

    /* JADX INFO: renamed from: f */
    public VText f48341f;

    /* JADX INFO: renamed from: g */
    public VText f48342g;

    /* JADX INFO: renamed from: h */
    public VText f48343h;

    /* JADX INFO: renamed from: i */
    public VText f48344i;

    public LiveVoiceHeatTaskItemLayoutBindings(Context context) {
        super(context);
    }

    public HeatTaskItemView getRoot() {
        return this.f48339d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72068h0(ViewGroup viewGroup) {
        this.f48339d = (HeatTaskItemView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48340e = vDraweeView;
        String str = vDraweeView == null ? "_user_icon" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48341f = vText;
        if (vText == null) {
            str = "_user_name";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f48342g = vText2;
        if (vText2 == null) {
            str = "_description";
        }
        VText vText3 = (VText) viewGroup.getChildAt(3);
        this.f48343h = vText3;
        if (vText3 == null) {
            str = "_confirm_bt";
        }
        VText vText4 = (VText) viewGroup.getChildAt(4);
        this.f48344i = vText4;
        if (vText4 == null) {
            str = "_confirm_hint";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72068h0(this);
    }

    public LiveVoiceHeatTaskItemLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHeatTaskItemLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

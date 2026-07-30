package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.guide.HeatTaskItemView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHeatTaskItemLayoutBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public HeatTaskItemView f49187d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49188e;

    /* JADX INFO: renamed from: f */
    public VText f49189f;

    /* JADX INFO: renamed from: g */
    public VText f49190g;

    /* JADX INFO: renamed from: h */
    public VText f49191h;

    /* JADX INFO: renamed from: i */
    public VText f49192i;

    public LiveVoiceHeatTaskItemLayoutBindings(Context context) {
        super(context);
    }

    public HeatTaskItemView getRoot() {
        return this.f49187d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73251h0(ViewGroup viewGroup) {
        this.f49187d = (HeatTaskItemView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f49188e = vDraweeView;
        String str = vDraweeView == null ? "_user_icon" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f49189f = vText;
        if (vText == null) {
            str = "_user_name";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f49190g = vText2;
        if (vText2 == null) {
            str = "_description";
        }
        VText vText3 = (VText) viewGroup.getChildAt(3);
        this.f49191h = vText3;
        if (vText3 == null) {
            str = "_confirm_bt";
        }
        VText vText4 = (VText) viewGroup.getChildAt(4);
        this.f49192i = vText4;
        if (vText4 == null) {
            str = "_confirm_hint";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73251h0(this);
    }

    public LiveVoiceHeatTaskItemLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHeatTaskItemLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.guide.HeatTaskItemView;
import l.jfd0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceHeatTaskItemLayoutBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public HeatTaskItemView f4381d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4382e;

    /* JADX INFO: renamed from: f */
    public VText f4383f;

    /* JADX INFO: renamed from: g */
    public VText f4384g;

    /* JADX INFO: renamed from: h */
    public VText f4385h;

    /* JADX INFO: renamed from: i */
    public VText f4386i;

    public LiveVoiceHeatTaskItemLayoutBindings(Context context) {
        super(context);
    }

    public HeatTaskItemView getRoot() {
        return this.f4381d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5537h0(ViewGroup viewGroup) {
        this.f4381d = (HeatTaskItemView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4382e = childAt;
        String str = childAt == null ? "_user_icon" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f4383f = childAt2;
        if (childAt2 == null) {
            str = "_user_name";
        }
        VText childAt3 = viewGroup.getChildAt(2);
        this.f4384g = childAt3;
        if (childAt3 == null) {
            str = "_description";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f4385h = childAt4;
        if (childAt4 == null) {
            str = "_confirm_bt";
        }
        VText childAt5 = viewGroup.getChildAt(4);
        this.f4386i = childAt5;
        if (childAt5 == null) {
            str = "_confirm_hint";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5537h0(this);
    }

    public LiveVoiceHeatTaskItemLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHeatTaskItemLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

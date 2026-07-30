package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import p147v.VDraweeView;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallConnectionIconViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultiCallConnectionIconView f47979d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f47980e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f47981f;

    public LiveMultiCallConnectionIconViewBindings(Context context) {
        super(context);
    }

    public MultiCallConnectionIconView getRoot() {
        return this.f47979d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72015h0(ViewGroup viewGroup) {
        this.f47979d = (MultiCallConnectionIconView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f47980e = vDraweeView;
        String str = vDraweeView == null ? "_user_left" : null;
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(1);
        this.f47981f = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_user_right";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72015h0(this);
    }

    public LiveMultiCallConnectionIconViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallConnectionIconViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

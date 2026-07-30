package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import p151v.VDraweeView;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallConnectionIconViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultiCallConnectionIconView f48827d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48828e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f48829f;

    public LiveMultiCallConnectionIconViewBindings(Context context) {
        super(context);
    }

    public MultiCallConnectionIconView getRoot() {
        return this.f48827d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73198h0(ViewGroup viewGroup) {
        this.f48827d = (MultiCallConnectionIconView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48828e = vDraweeView;
        String str = vDraweeView == null ? "_user_left" : null;
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(1);
        this.f48829f = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_user_right";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73198h0(this);
    }

    public LiveMultiCallConnectionIconViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallConnectionIconViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import l.jfd0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallConnectionIconViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultiCallConnectionIconView f4021d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4022e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4023f;

    public LiveMultiCallConnectionIconViewBindings(Context context) {
        super(context);
    }

    public MultiCallConnectionIconView getRoot() {
        return this.f4021d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5416h0(ViewGroup viewGroup) {
        this.f4021d = (MultiCallConnectionIconView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4022e = childAt;
        String str = childAt == null ? "_user_left" : null;
        VDraweeView childAt2 = viewGroup.getChildAt(1);
        this.f4023f = childAt2;
        if (childAt2 == null) {
            str = "_user_right";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5416h0(this);
    }

    public LiveMultiCallConnectionIconViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallConnectionIconViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

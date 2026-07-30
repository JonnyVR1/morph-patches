package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleItemView;
import l.jfd0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceUserCardMiddleItemViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualUserCardMiddleItemView f4219d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4220e;

    /* JADX INFO: renamed from: f */
    public View f4221f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f4222g;

    /* JADX INFO: renamed from: h */
    public View f4223h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f4224i;

    /* JADX INFO: renamed from: j */
    public VText f4225j;

    /* JADX INFO: renamed from: k */
    public VText f4226k;

    public LiveVirtualVoiceUserCardMiddleItemViewBindings(Context context) {
        super(context);
    }

    public VoiceVirtualUserCardMiddleItemView getRoot() {
        return this.f4219d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5504h0(ViewGroup viewGroup) {
        this.f4219d = (VoiceVirtualUserCardMiddleItemView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4220e = childAt;
        String str = childAt == null ? "_icon" : null;
        View childAt2 = viewGroup.getChildAt(1);
        this.f4221f = childAt2;
        if (childAt2 == null) {
            str = "_left_user_icon_bg";
        }
        VDraweeView childAt3 = viewGroup.getChildAt(2);
        this.f4222g = childAt3;
        if (childAt3 == null) {
            str = "_left_user_icon";
        }
        View childAt4 = viewGroup.getChildAt(3);
        this.f4223h = childAt4;
        if (childAt4 == null) {
            str = "_right_user_icon_bg";
        }
        VDraweeView childAt5 = viewGroup.getChildAt(4);
        this.f4224i = childAt5;
        if (childAt5 == null) {
            str = "_right_user_icon";
        }
        VText childAt6 = viewGroup.getChildAt(5);
        this.f4225j = childAt6;
        if (childAt6 == null) {
            str = "_amount";
        }
        VText childAt7 = viewGroup.getChildAt(6);
        this.f4226k = childAt7;
        if (childAt7 == null) {
            str = "_title";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5504h0(this);
    }

    public LiveVirtualVoiceUserCardMiddleItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceUserCardMiddleItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

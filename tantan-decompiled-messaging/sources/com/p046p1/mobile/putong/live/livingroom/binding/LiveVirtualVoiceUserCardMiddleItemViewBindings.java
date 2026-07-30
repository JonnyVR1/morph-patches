package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleItemView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceUserCardMiddleItemViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualUserCardMiddleItemView f48177d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48178e;

    /* JADX INFO: renamed from: f */
    public View f48179f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f48180g;

    /* JADX INFO: renamed from: h */
    public View f48181h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f48182i;

    /* JADX INFO: renamed from: j */
    public VText f48183j;

    /* JADX INFO: renamed from: k */
    public VText f48184k;

    public LiveVirtualVoiceUserCardMiddleItemViewBindings(Context context) {
        super(context);
    }

    public VoiceVirtualUserCardMiddleItemView getRoot() {
        return this.f48177d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72049h0(ViewGroup viewGroup) {
        this.f48177d = (VoiceVirtualUserCardMiddleItemView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48178e = vDraweeView;
        String str = vDraweeView == null ? "_icon" : null;
        View childAt = viewGroup.getChildAt(1);
        this.f48179f = childAt;
        if (childAt == null) {
            str = "_left_user_icon_bg";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(2);
        this.f48180g = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_left_user_icon";
        }
        View childAt2 = viewGroup.getChildAt(3);
        this.f48181h = childAt2;
        if (childAt2 == null) {
            str = "_right_user_icon_bg";
        }
        VDraweeView vDraweeView3 = (VDraweeView) viewGroup.getChildAt(4);
        this.f48182i = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_right_user_icon";
        }
        VText vText = (VText) viewGroup.getChildAt(5);
        this.f48183j = vText;
        if (vText == null) {
            str = "_amount";
        }
        VText vText2 = (VText) viewGroup.getChildAt(6);
        this.f48184k = vText2;
        if (vText2 == null) {
            str = "_title";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72049h0(this);
    }

    public LiveVirtualVoiceUserCardMiddleItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceUserCardMiddleItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

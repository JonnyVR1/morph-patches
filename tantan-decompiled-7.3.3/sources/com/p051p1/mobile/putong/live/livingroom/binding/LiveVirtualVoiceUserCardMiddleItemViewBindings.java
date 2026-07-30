package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleItemView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceUserCardMiddleItemViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualUserCardMiddleItemView f49025d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49026e;

    /* JADX INFO: renamed from: f */
    public View f49027f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49028g;

    /* JADX INFO: renamed from: h */
    public View f49029h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f49030i;

    /* JADX INFO: renamed from: j */
    public VText f49031j;

    /* JADX INFO: renamed from: k */
    public VText f49032k;

    public LiveVirtualVoiceUserCardMiddleItemViewBindings(Context context) {
        super(context);
    }

    public VoiceVirtualUserCardMiddleItemView getRoot() {
        return this.f49025d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73232h0(ViewGroup viewGroup) {
        this.f49025d = (VoiceVirtualUserCardMiddleItemView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f49026e = vDraweeView;
        String str = vDraweeView == null ? "_icon" : null;
        View childAt = viewGroup.getChildAt(1);
        this.f49027f = childAt;
        if (childAt == null) {
            str = "_left_user_icon_bg";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(2);
        this.f49028g = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_left_user_icon";
        }
        View childAt2 = viewGroup.getChildAt(3);
        this.f49029h = childAt2;
        if (childAt2 == null) {
            str = "_right_user_icon_bg";
        }
        VDraweeView vDraweeView3 = (VDraweeView) viewGroup.getChildAt(4);
        this.f49030i = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_right_user_icon";
        }
        VText vText = (VText) viewGroup.getChildAt(5);
        this.f49031j = vText;
        if (vText == null) {
            str = "_amount";
        }
        VText vText2 = (VText) viewGroup.getChildAt(6);
        this.f49032k = vText2;
        if (vText2 == null) {
            str = "_title";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73232h0(this);
    }

    public LiveVirtualVoiceUserCardMiddleItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceUserCardMiddleItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

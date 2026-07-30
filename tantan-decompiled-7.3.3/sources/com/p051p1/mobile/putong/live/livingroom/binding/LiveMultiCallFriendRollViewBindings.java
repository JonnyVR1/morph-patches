package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.view.RollItemView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallFriendsRollUserView;
import p151v.VDraweeView;
import p153l.mdd0;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LiveMultiCallFriendRollViewBindings extends RollItemView<mdd0> {

    /* JADX INFO: renamed from: a */
    public MultiCallFriendsRollUserView f48830a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f48831b;

    public LiveMultiCallFriendRollViewBindings(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m73199b(ViewGroup viewGroup) {
        this.f48830a = (MultiCallFriendsRollUserView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48831b = vDraweeView;
        String str = vDraweeView == null ? "_avatar" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public View m73200c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199138k4, viewGroup, false);
        m73199b((ViewGroup) viewInflate);
        return viewInflate;
    }

    public MultiCallFriendsRollUserView getRoot() {
        return this.f48830a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73199b(this);
    }

    public LiveMultiCallFriendRollViewBindings(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

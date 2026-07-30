package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.view.RollItemView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallFriendsRollUserView;
import p147v.VDraweeView;
import p149l.j5d0;
import p149l.jfd0;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LiveMultiCallFriendRollViewBindings extends RollItemView<j5d0> {

    /* JADX INFO: renamed from: a */
    public MultiCallFriendsRollUserView f47982a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f47983b;

    public LiveMultiCallFriendRollViewBindings(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m72016b(ViewGroup viewGroup) {
        this.f47982a = (MultiCallFriendsRollUserView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f47983b = vDraweeView;
        String str = vDraweeView == null ? "_avatar" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public View m72017c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168406k4, viewGroup, false);
        m72016b((ViewGroup) viewInflate);
        return viewInflate;
    }

    public MultiCallFriendsRollUserView getRoot() {
        return this.f47982a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72016b(this);
    }

    public LiveMultiCallFriendRollViewBindings(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

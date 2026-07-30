package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.view.RollItemView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallFriendsRollUserView;
import l.jfd0;
import p002l.j5d0;
import p002l.t6c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class LiveMultiCallFriendRollViewBindings extends RollItemView<j5d0> {

    /* JADX INFO: renamed from: a */
    public MultiCallFriendsRollUserView f4024a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4025b;

    public LiveMultiCallFriendRollViewBindings(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m5417b(ViewGroup viewGroup) {
        this.f4024a = (MultiCallFriendsRollUserView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4025b = childAt;
        String str = childAt == null ? "_avatar" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public View m5418c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19902k4, viewGroup, false);
        m5417b((ViewGroup) viewInflate);
        return viewInflate;
    }

    public MultiCallFriendsRollUserView getRoot() {
        return this.f4024a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5417b(this);
    }

    public LiveMultiCallFriendRollViewBindings(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

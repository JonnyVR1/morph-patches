package com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.iam;
import p153l.m14;
import p153l.ykd0;

/* JADX INFO: loaded from: classes5.dex */
public class RoomPusherView extends FrameLayout implements iam<m14> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f52368a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f52369b;

    public RoomPusherView(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo22061C0() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m77167a(View view) {
        ykd0.m216467a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77167a(this);
    }

    public void setVisible(boolean z) {
        bnl0.m105524M(this, z);
    }

    public RoomPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(m14 m14Var) {
    }
}

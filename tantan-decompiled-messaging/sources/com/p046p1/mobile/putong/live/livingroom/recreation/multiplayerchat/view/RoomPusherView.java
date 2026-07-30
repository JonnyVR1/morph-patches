package com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.n04;
import p149l.s7m;
import p149l.wcd0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class RoomPusherView extends FrameLayout implements s7m<n04> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f51520a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f51521b;

    public RoomPusherView(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo21062C0() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m75984a(View view) {
        wcd0.m202655a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75984a(this);
    }

    public void setVisible(boolean z) {
        xdl0.m208344M(this, z);
    }

    public RoomPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(n04 n04Var) {
    }
}

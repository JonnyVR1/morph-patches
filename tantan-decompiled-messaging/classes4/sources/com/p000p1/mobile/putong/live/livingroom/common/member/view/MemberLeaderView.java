package com.p000p1.mobile.putong.live.livingroom.common.member.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import l.xdl0;
import p002l.aay;
import p002l.t6c0;
import v.VButton;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MemberLeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MemberLeaderView f5278a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f5279b;

    /* JADX INFO: renamed from: c */
    public VLinear f5280c;

    /* JADX INFO: renamed from: d */
    public VButton f5281d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f5282e;

    public MemberLeaderView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static MemberLeaderView m6614c(LayoutInflater layoutInflater) {
        return (MemberLeaderView) layoutInflater.inflate(t6c0.f19627O3, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m6615b(View view) {
        aay.m9468a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m6616d(View view) {
        View.OnClickListener onClickListener = this.f5282e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6615b(this);
        this.f5279b.setLayoutManager(new LinearLayoutManager(getContext()));
        xdl0.E0(this.f5281d, new View.OnClickListener() { // from class: l.v9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21048a.m6616d(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f5282e = onClickListener;
    }

    public MemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

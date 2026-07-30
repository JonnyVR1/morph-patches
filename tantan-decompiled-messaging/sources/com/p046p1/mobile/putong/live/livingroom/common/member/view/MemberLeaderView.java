package com.p046p1.mobile.putong.live.livingroom.common.member.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import p147v.VButton;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.aay;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class MemberLeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MemberLeaderView f49236a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f49237b;

    /* JADX INFO: renamed from: c */
    public VLinear f49238c;

    /* JADX INFO: renamed from: d */
    public VButton f49239d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f49240e;

    public MemberLeaderView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static MemberLeaderView m73088c(LayoutInflater layoutInflater) {
        return (MemberLeaderView) layoutInflater.inflate(t6c0.f168131O3, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m73089b(View view) {
        aay.m95577a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m73090d(View view) {
        View.OnClickListener onClickListener = this.f49240e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73089b(this);
        this.f49237b.setLayoutManager(new LinearLayoutManager(getContext()));
        xdl0.m208329E0(this.f49239d, new View.OnClickListener() { // from class: l.v9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180682a.m73090d(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f49240e = onClickListener;
    }

    public MemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

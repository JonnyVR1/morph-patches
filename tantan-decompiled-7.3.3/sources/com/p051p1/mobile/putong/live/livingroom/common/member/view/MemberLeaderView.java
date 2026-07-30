package com.p051p1.mobile.putong.live.livingroom.common.member.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import p151v.VButton;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.xiy;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class MemberLeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MemberLeaderView f50084a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f50085b;

    /* JADX INFO: renamed from: c */
    public VLinear f50086c;

    /* JADX INFO: renamed from: d */
    public VButton f50087d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f50088e;

    public MemberLeaderView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static MemberLeaderView m74271c(LayoutInflater layoutInflater) {
        return (MemberLeaderView) layoutInflater.inflate(yec0.f198863O3, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m74272b(View view) {
        xiy.m211179a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m74273d(View view) {
        View.OnClickListener onClickListener = this.f50088e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74272b(this);
        this.f50085b.setLayoutManager(new LinearLayoutManager(getContext()));
        bnl0.m105509E0(this.f50087d, new View.OnClickListener() { // from class: l.siy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168885a.m74273d(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f50088e = onClickListener;
    }

    public MemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

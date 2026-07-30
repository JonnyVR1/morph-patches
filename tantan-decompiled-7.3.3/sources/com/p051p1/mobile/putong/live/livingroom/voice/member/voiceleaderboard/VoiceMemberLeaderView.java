package com.p051p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard;

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
import p153l.b8o0;
import p153l.bnl0;
import p153l.yec0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceMemberLeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMemberLeaderView f54542a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f54543b;

    /* JADX INFO: renamed from: c */
    public VLinear f54544c;

    /* JADX INFO: renamed from: d */
    public VButton f54545d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f54546e;

    public VoiceMemberLeaderView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static VoiceMemberLeaderView m79803c(LayoutInflater layoutInflater) {
        return (VoiceMemberLeaderView) layoutInflater.inflate(yec0.f198797I9, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m79804b(View view) {
        b8o0.m103026a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m79805d(View view) {
        View.OnClickListener onClickListener = this.f54546e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79804b(this);
        this.f54543b.setLayoutManager(new LinearLayoutManager(getContext()));
        bnl0.m105509E0(this.f54545d, new View.OnClickListener() { // from class: l.a8o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68936a.m79805d(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f54546e = onClickListener;
    }

    public VoiceMemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceMemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

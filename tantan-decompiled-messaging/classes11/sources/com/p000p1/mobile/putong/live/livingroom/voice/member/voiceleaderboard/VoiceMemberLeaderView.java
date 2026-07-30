package com.p000p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import l.t6c0;
import l.xdl0;
import l.xyn0;
import v.VButton;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceMemberLeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMemberLeaderView f7300a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f7301b;

    /* JADX INFO: renamed from: c */
    public VLinear f7302c;

    /* JADX INFO: renamed from: d */
    public VButton f7303d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f7304e;

    public VoiceMemberLeaderView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static VoiceMemberLeaderView m8836c(LayoutInflater layoutInflater) {
        return (VoiceMemberLeaderView) layoutInflater.inflate(t6c0.I9, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m8837b(View view) {
        xyn0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m8838d(View view) {
        View.OnClickListener onClickListener = this.f7304e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8837b(this);
        this.f7301b.setLayoutManager(new LinearLayoutManager(getContext()));
        xdl0.E0(this.f7303d, new View.OnClickListener() { // from class: l.wyn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22369a.m8838d(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f7304e = onClickListener;
    }

    public VoiceMemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceMemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

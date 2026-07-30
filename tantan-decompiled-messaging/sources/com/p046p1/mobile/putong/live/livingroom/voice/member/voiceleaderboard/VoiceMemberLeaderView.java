package com.p046p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard;

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
import p149l.t6c0;
import p149l.xdl0;
import p149l.xyn0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceMemberLeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMemberLeaderView f53694a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f53695b;

    /* JADX INFO: renamed from: c */
    public VLinear f53696c;

    /* JADX INFO: renamed from: d */
    public VButton f53697d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f53698e;

    public VoiceMemberLeaderView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static VoiceMemberLeaderView m78620c(LayoutInflater layoutInflater) {
        return (VoiceMemberLeaderView) layoutInflater.inflate(t6c0.f168065I9, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m78621b(View view) {
        xyn0.m211862a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m78622d(View view) {
        View.OnClickListener onClickListener = this.f53698e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78621b(this);
        this.f53695b.setLayoutManager(new LinearLayoutManager(getContext()));
        xdl0.m208329E0(this.f53697d, new View.OnClickListener() { // from class: l.wyn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188579a.m78622d(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f53698e = onClickListener;
    }

    public VoiceMemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceMemberLeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

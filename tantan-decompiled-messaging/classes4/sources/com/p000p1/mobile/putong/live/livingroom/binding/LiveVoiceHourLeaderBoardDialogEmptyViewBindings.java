package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardEmptyView;
import l.jfd0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceHourLeaderBoardDialogEmptyViewBindings extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceHourBoardEmptyView f4387a;

    /* JADX INFO: renamed from: b */
    public VImage f4388b;

    /* JADX INFO: renamed from: c */
    public VText f4389c;

    public LiveVoiceHourLeaderBoardDialogEmptyViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5538a(ViewGroup viewGroup) {
        this.f4387a = (VoiceHourBoardEmptyView) viewGroup;
        VImage childAt = viewGroup.getChildAt(0);
        this.f4388b = childAt;
        String str = childAt == null ? "_empty_icon" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f4389c = childAt2;
        if (childAt2 == null) {
            str = "_summary";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public VoiceHourBoardEmptyView getRoot() {
        return this.f4387a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5538a(this);
    }

    public LiveVoiceHourLeaderBoardDialogEmptyViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourLeaderBoardDialogEmptyViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

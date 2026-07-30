package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardEmptyView;
import p147v.VImage;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHourLeaderBoardDialogEmptyViewBindings extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceHourBoardEmptyView f48345a;

    /* JADX INFO: renamed from: b */
    public VImage f48346b;

    /* JADX INFO: renamed from: c */
    public VText f48347c;

    public LiveVoiceHourLeaderBoardDialogEmptyViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72069a(ViewGroup viewGroup) {
        this.f48345a = (VoiceHourBoardEmptyView) viewGroup;
        VImage vImage = (VImage) viewGroup.getChildAt(0);
        this.f48346b = vImage;
        String str = vImage == null ? "_empty_icon" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48347c = vText;
        if (vText == null) {
            str = "_summary";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public VoiceHourBoardEmptyView getRoot() {
        return this.f48345a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72069a(this);
    }

    public LiveVoiceHourLeaderBoardDialogEmptyViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourLeaderBoardDialogEmptyViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

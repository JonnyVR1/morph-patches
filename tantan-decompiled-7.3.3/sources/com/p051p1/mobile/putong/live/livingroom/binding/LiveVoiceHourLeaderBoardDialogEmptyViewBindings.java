package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardEmptyView;
import p151v.VImage;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHourLeaderBoardDialogEmptyViewBindings extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceHourBoardEmptyView f49193a;

    /* JADX INFO: renamed from: b */
    public VImage f49194b;

    /* JADX INFO: renamed from: c */
    public VText f49195c;

    public LiveVoiceHourLeaderBoardDialogEmptyViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73252a(ViewGroup viewGroup) {
        this.f49193a = (VoiceHourBoardEmptyView) viewGroup;
        VImage vImage = (VImage) viewGroup.getChildAt(0);
        this.f49194b = vImage;
        String str = vImage == null ? "_empty_icon" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f49195c = vText;
        if (vText == null) {
            str = "_summary";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public VoiceHourBoardEmptyView getRoot() {
        return this.f49193a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73252a(this);
    }

    public LiveVoiceHourLeaderBoardDialogEmptyViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourLeaderBoardDialogEmptyViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

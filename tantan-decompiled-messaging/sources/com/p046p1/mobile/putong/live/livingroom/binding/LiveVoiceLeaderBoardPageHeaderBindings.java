package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardFirstView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardSecondOrThirdView;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceLeaderBoardPageHeaderBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardHeaderView f48379d;

    /* JADX INFO: renamed from: e */
    public VoiceHourBoardSecondOrThirdView f48380e;

    /* JADX INFO: renamed from: f */
    public VoiceHourBoardSecondOrThirdView f48381f;

    /* JADX INFO: renamed from: g */
    public VoiceHourBoardFirstView f48382g;

    public LiveVoiceLeaderBoardPageHeaderBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardHeaderView getRoot() {
        return this.f48379d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72073h0(ViewGroup viewGroup) {
        this.f48379d = (VoiceHourBoardHeaderView) viewGroup;
        VoiceHourBoardSecondOrThirdView voiceHourBoardSecondOrThirdView = (VoiceHourBoardSecondOrThirdView) viewGroup.getChildAt(0);
        this.f48380e = voiceHourBoardSecondOrThirdView;
        String str = voiceHourBoardSecondOrThirdView == null ? "_second_user" : null;
        VoiceHourBoardSecondOrThirdView voiceHourBoardSecondOrThirdView2 = (VoiceHourBoardSecondOrThirdView) viewGroup.getChildAt(1);
        this.f48381f = voiceHourBoardSecondOrThirdView2;
        if (voiceHourBoardSecondOrThirdView2 == null) {
            str = "_third_user";
        }
        VoiceHourBoardFirstView voiceHourBoardFirstView = (VoiceHourBoardFirstView) viewGroup.getChildAt(2);
        this.f48382g = voiceHourBoardFirstView;
        if (voiceHourBoardFirstView == null) {
            str = "_first_user";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72073h0(this);
    }

    public LiveVoiceLeaderBoardPageHeaderBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceLeaderBoardPageHeaderBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

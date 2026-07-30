package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardFirstView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardSecondOrThirdView;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceLeaderBoardPageHeaderBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardHeaderView f49227d;

    /* JADX INFO: renamed from: e */
    public VoiceHourBoardSecondOrThirdView f49228e;

    /* JADX INFO: renamed from: f */
    public VoiceHourBoardSecondOrThirdView f49229f;

    /* JADX INFO: renamed from: g */
    public VoiceHourBoardFirstView f49230g;

    public LiveVoiceLeaderBoardPageHeaderBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardHeaderView getRoot() {
        return this.f49227d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73256h0(ViewGroup viewGroup) {
        this.f49227d = (VoiceHourBoardHeaderView) viewGroup;
        VoiceHourBoardSecondOrThirdView voiceHourBoardSecondOrThirdView = (VoiceHourBoardSecondOrThirdView) viewGroup.getChildAt(0);
        this.f49228e = voiceHourBoardSecondOrThirdView;
        String str = voiceHourBoardSecondOrThirdView == null ? "_second_user" : null;
        VoiceHourBoardSecondOrThirdView voiceHourBoardSecondOrThirdView2 = (VoiceHourBoardSecondOrThirdView) viewGroup.getChildAt(1);
        this.f49229f = voiceHourBoardSecondOrThirdView2;
        if (voiceHourBoardSecondOrThirdView2 == null) {
            str = "_third_user";
        }
        VoiceHourBoardFirstView voiceHourBoardFirstView = (VoiceHourBoardFirstView) viewGroup.getChildAt(2);
        this.f49230g = voiceHourBoardFirstView;
        if (voiceHourBoardFirstView == null) {
            str = "_first_user";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73256h0(this);
    }

    public LiveVoiceLeaderBoardPageHeaderBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceLeaderBoardPageHeaderBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardFirstView;
import com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView;
import com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardSecondOrThirdView;
import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceLeaderBoardPageHeaderBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardHeaderView f4421d;

    /* JADX INFO: renamed from: e */
    public VoiceHourBoardSecondOrThirdView f4422e;

    /* JADX INFO: renamed from: f */
    public VoiceHourBoardSecondOrThirdView f4423f;

    /* JADX INFO: renamed from: g */
    public VoiceHourBoardFirstView f4424g;

    public LiveVoiceLeaderBoardPageHeaderBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardHeaderView getRoot() {
        return this.f4421d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5542h0(ViewGroup viewGroup) {
        this.f4421d = (VoiceHourBoardHeaderView) viewGroup;
        VoiceHourBoardSecondOrThirdView childAt = viewGroup.getChildAt(0);
        this.f4422e = childAt;
        String str = childAt == null ? "_second_user" : null;
        VoiceHourBoardSecondOrThirdView childAt2 = viewGroup.getChildAt(1);
        this.f4423f = childAt2;
        if (childAt2 == null) {
            str = "_third_user";
        }
        VoiceHourBoardFirstView childAt3 = viewGroup.getChildAt(2);
        this.f4424g = childAt3;
        if (childAt3 == null) {
            str = "_first_user";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5542h0(this);
    }

    public LiveVoiceLeaderBoardPageHeaderBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceLeaderBoardPageHeaderBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

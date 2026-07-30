package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView;
import p147v.VDraweeView;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceLeaderBoardTopAnimViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveVoiceLeaderBoardTopAnimView f48383d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48384e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f48385f;

    public LiveVoiceLeaderBoardTopAnimViewBindings(Context context) {
        super(context);
    }

    public LiveVoiceLeaderBoardTopAnimView getRoot() {
        return this.f48383d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72074h0(ViewGroup viewGroup) {
        this.f48383d = (LiveVoiceLeaderBoardTopAnimView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48384e = vDraweeView;
        String str = vDraweeView == null ? "_top_bg" : null;
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewGroup.getChildAt(1);
        this.f48385f = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_bg_svga";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72074h0(this);
    }

    public LiveVoiceLeaderBoardTopAnimViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceLeaderBoardTopAnimViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

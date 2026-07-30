package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView;
import p151v.VDraweeView;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceLeaderBoardTopAnimViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveVoiceLeaderBoardTopAnimView f49231d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49232e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f49233f;

    public LiveVoiceLeaderBoardTopAnimViewBindings(Context context) {
        super(context);
    }

    public LiveVoiceLeaderBoardTopAnimView getRoot() {
        return this.f49231d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73257h0(ViewGroup viewGroup) {
        this.f49231d = (LiveVoiceLeaderBoardTopAnimView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f49232e = vDraweeView;
        String str = vDraweeView == null ? "_top_bg" : null;
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewGroup.getChildAt(1);
        this.f49233f = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_bg_svga";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73257h0(this);
    }

    public LiveVoiceLeaderBoardTopAnimViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceLeaderBoardTopAnimViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView;
import l.jfd0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceLeaderBoardTopAnimViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveVoiceLeaderBoardTopAnimView f4425d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4426e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f4427f;

    public LiveVoiceLeaderBoardTopAnimViewBindings(Context context) {
        super(context);
    }

    public LiveVoiceLeaderBoardTopAnimView getRoot() {
        return this.f4425d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5543h0(ViewGroup viewGroup) {
        this.f4425d = (LiveVoiceLeaderBoardTopAnimView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4426e = childAt;
        String str = childAt == null ? "_top_bg" : null;
        AnimEffectPlayer childAt2 = viewGroup.getChildAt(1);
        this.f4427f = childAt2;
        if (childAt2 == null) {
            str = "_bg_svga";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5543h0(this);
    }

    public LiveVoiceLeaderBoardTopAnimViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceLeaderBoardTopAnimViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PushMessage;
import l.bt0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
class LiveInternalFindPeoplePushView extends LiveInternalPushBaseView {
    public LiveInternalFindPeoplePushView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo1801a() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo1802b(PushMessage pushMessage, Act act) {
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorZ = bt0.z(new Animator[]{bt0.q(this, "translationY", new float[]{0.0f, -t100.d(60.0f)}), bt0.q(this, "alpha", new float[]{1.0f, 0.0f})});
        animatorZ.setDuration(400L);
        return animatorZ;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorZ = bt0.z(new Animator[]{bt0.q(this, "translationY", new float[]{-t100.d(60.0f), 0.0f}), bt0.q(this, "alpha", new float[]{0.0f, 1.0f})});
        animatorZ.setDuration(400L);
        return animatorZ;
    }

    public LiveInternalFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.data.PushMessage;
import p153l.gt0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
class LiveInternalFindPeoplePushView extends LiveInternalPushBaseView {
    public LiveInternalFindPeoplePushView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo38833a() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo38834b(PushMessage pushMessage, Act act) {
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM132180z = gt0.m132180z(gt0.m132171q(this, "translationY", 0.0f, -qa00.m175859d(60.0f)), gt0.m132171q(this, "alpha", 1.0f, 0.0f));
        animatorM132180z.setDuration(400L);
        return animatorM132180z;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM132180z = gt0.m132180z(gt0.m132171q(this, "translationY", -qa00.m175859d(60.0f), 0.0f), gt0.m132171q(this, "alpha", 0.0f, 1.0f));
        animatorM132180z.setDuration(400L);
        return animatorM132180z;
    }

    public LiveInternalFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

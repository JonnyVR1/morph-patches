package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.data.PushMessage;
import p149l.bt0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
class LiveInternalFindPeoplePushView extends LiveInternalPushBaseView {
    public LiveInternalFindPeoplePushView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo37830a() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo37831b(PushMessage pushMessage, Act act) {
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM103753z = bt0.m103753z(bt0.m103744q(this, "translationY", 0.0f, -t100.m186890d(60.0f)), bt0.m103744q(this, "alpha", 1.0f, 0.0f));
        animatorM103753z.setDuration(400L);
        return animatorM103753z;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM103753z = bt0.m103753z(bt0.m103744q(this, "translationY", -t100.m186890d(60.0f), 0.0f), bt0.m103744q(this, "alpha", 0.0f, 1.0f));
        animatorM103753z.setDuration(400L);
        return animatorM103753z;
    }

    public LiveInternalFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

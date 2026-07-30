package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import p153l.bnl0;
import p153l.gt0;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
class LiveInternalVideoMultiCallFindPeoplePushView extends LiveInternalPushBaseView {
    public LiveInternalVideoMultiCallFindPeoplePushView(@NonNull Context context) {
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
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        View viewMo127348s = CoreModule.m30934Q().mo68412M6().mo127348s(act);
        CoreModule.m30934Q().mo68412M6().mo127336g(viewMo127348s, pushMessageCustom, new x20() { // from class: com.p1.mobile.putong.core.newui.home.bubble.internalpush.c
            @Override // p153l.x20
            public final void call() {
                this.f22991a.m38878d();
            }
        });
        removeAllViews();
        addView(viewMo127348s, new FrameLayout.LayoutParams(bnl0.m105592y0(), qa00.m175859d(350.0f)));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m38878d() {
        this.f22990b.call();
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

    public LiveInternalVideoMultiCallFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalVideoMultiCallFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

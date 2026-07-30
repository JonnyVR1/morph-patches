package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import l.bt0;
import l.d30;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
class LiveInternalVideoMultiCallFindPeoplePushView extends LiveInternalPushBaseView {
    public LiveInternalVideoMultiCallFindPeoplePushView(@NonNull Context context) {
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
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        View viewM12100s = CoreModule.Q().m9019M6().m12100s(act);
        CoreModule.Q().m9019M6().m12088g(viewM12100s, pushMessageCustom, new d30() { // from class: com.p1.mobile.putong.core.newui.home.bubble.internalpush.c
            public final void call() {
                this.f1027a.m1846d();
            }
        });
        removeAllViews();
        addView(viewM12100s, new FrameLayout.LayoutParams(xdl0.y0(), t100.d(350.0f)));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1846d() {
        this.f1026b.call();
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

    public LiveInternalVideoMultiCallFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalVideoMultiCallFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

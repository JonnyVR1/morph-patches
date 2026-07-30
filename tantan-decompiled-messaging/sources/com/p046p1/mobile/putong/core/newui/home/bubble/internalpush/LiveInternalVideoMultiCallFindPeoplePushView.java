package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import p149l.bt0;
import p149l.d30;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
class LiveInternalVideoMultiCallFindPeoplePushView extends LiveInternalPushBaseView {
    public LiveInternalVideoMultiCallFindPeoplePushView(@NonNull Context context) {
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
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        View viewMo102434s = CoreModule.m29936Q().mo67229M6().mo102434s(act);
        CoreModule.m29936Q().mo67229M6().mo102422g(viewMo102434s, pushMessageCustom, new d30() { // from class: com.p1.mobile.putong.core.newui.home.bubble.internalpush.c
            @Override // p149l.d30
            public final void call() {
                this.f22249a.m37875d();
            }
        });
        removeAllViews();
        addView(viewMo102434s, new FrameLayout.LayoutParams(xdl0.m208412y0(), t100.m186890d(350.0f)));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m37875d() {
        this.f22248b.call();
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

    public LiveInternalVideoMultiCallFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalVideoMultiCallFindPeoplePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

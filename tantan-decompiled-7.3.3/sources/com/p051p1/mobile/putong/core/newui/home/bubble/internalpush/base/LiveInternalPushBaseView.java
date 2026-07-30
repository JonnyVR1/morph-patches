package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PushMessage;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalPushBaseView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public x20 f22989a;

    /* JADX INFO: renamed from: b */
    public x20 f22990b;

    public LiveInternalPushBaseView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo38833a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void mo38834b(PushMessage pushMessage, Act act) {
    }

    public Animator getHideAnim() {
        return null;
    }

    public Animator getShowAnim() {
        return null;
    }

    public void setOnDismissAction(x20 x20Var) {
        this.f22990b = x20Var;
    }

    public void setOnExitAction(x20 x20Var) {
        this.f22989a = x20Var;
    }

    public LiveInternalPushBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalPushBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

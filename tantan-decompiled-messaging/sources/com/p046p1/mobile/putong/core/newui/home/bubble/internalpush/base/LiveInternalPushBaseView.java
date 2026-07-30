package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PushMessage;
import p149l.d30;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalPushBaseView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public d30 f22247a;

    /* JADX INFO: renamed from: b */
    public d30 f22248b;

    public LiveInternalPushBaseView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo37830a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void mo37831b(PushMessage pushMessage, Act act) {
    }

    public Animator getHideAnim() {
        return null;
    }

    public Animator getShowAnim() {
        return null;
    }

    public void setOnDismissAction(d30 d30Var) {
        this.f22248b = d30Var;
    }

    public void setOnExitAction(d30 d30Var) {
        this.f22247a = d30Var;
    }

    public LiveInternalPushBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalPushBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

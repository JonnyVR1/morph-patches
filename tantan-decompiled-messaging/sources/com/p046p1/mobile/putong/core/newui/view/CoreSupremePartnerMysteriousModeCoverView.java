package com.p046p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import p149l.m5b;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreSupremePartnerMysteriousModeCoverView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreSupremePartnerMysteriousModeCoverView f26893a;

    /* JADX INFO: renamed from: b */
    public View f26894b;

    /* JADX INFO: renamed from: c */
    public View f26895c;

    /* JADX INFO: renamed from: d */
    public CoreSupremePartnerMysteriousModeTagView f26896d;

    public CoreSupremePartnerMysteriousModeCoverView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43698a(View view) {
        m5b.m153132a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m43699b(User user, int i) {
        this.f26896d.m43701b(user);
        if (2 != i) {
            this.f26894b.setBackgroundResource(x2c0.f189275Dp);
        } else {
            xdl0.m208360X(this.f26896d, t100.m186890d(144.0f));
            this.f26894b.setBackgroundResource(x2c0.f189307Ep);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43698a(this);
        xdl0.m208344M(this.f26895c, false);
    }

    public CoreSupremePartnerMysteriousModeCoverView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreSupremePartnerMysteriousModeCoverView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

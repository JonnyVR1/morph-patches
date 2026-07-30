package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.User;
import l.m5b;
import l.t100;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreSupremePartnerMysteriousModeCoverView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreSupremePartnerMysteriousModeCoverView f5671a;

    /* JADX INFO: renamed from: b */
    public View f5672b;

    /* JADX INFO: renamed from: c */
    public View f5673c;

    /* JADX INFO: renamed from: d */
    public CoreSupremePartnerMysteriousModeTagView f5674d;

    public CoreSupremePartnerMysteriousModeCoverView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7962a(View view) {
        m5b.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7963b(User user, int i) {
        this.f5674d.m7965b(user);
        if (2 != i) {
            this.f5672b.setBackgroundResource(x2c0.Dp);
        } else {
            xdl0.X(this.f5674d, t100.d(144.0f));
            this.f5672b.setBackgroundResource(x2c0.Ep);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7962a(this);
        xdl0.M(this.f5673c, false);
    }

    public CoreSupremePartnerMysteriousModeCoverView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreSupremePartnerMysteriousModeCoverView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

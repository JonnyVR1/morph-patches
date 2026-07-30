package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveSignInReward;
import l.hxs;
import l.t100;
import l.yb2;
import p002l.kfi0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TaskRewardView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5364a;

    /* JADX INFO: renamed from: b */
    public VText f5365b;

    public TaskRewardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m6757a(View view) {
        kfi0.m16609a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6758b(BLiveSignInReward bLiveSignInReward, boolean z) {
        float f = "medal".equals(bLiveSignInReward.type) ? 0.7894737f : 1.0f;
        this.f5364a.setScaleX(f);
        this.f5364a.setScaleY(f);
        hxs.u("context_livingAct", this.f5364a, bLiveSignInReward.icon, t100.d(38.0f), t100.d(38.0f));
        this.f5365b.setText(bLiveSignInReward.name + bLiveSignInReward.description);
        if (z) {
            m6759c();
        } else {
            m6760d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6759c() {
        setBackground(yb2.a(647906574, t100.g, false));
        this.f5365b.setTextColor(-2479528);
    }

    /* JADX INFO: renamed from: d */
    public final void m6760d() {
        setBackground(yb2.a(867565635, t100.g, false));
        this.f5365b.setTextColor(-1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6757a(this);
    }
}

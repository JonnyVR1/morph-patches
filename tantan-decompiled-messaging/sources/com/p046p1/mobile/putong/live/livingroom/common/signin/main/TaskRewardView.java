package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Medal;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInReward;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.kfi0;
import p149l.t100;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class TaskRewardView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49322a;

    /* JADX INFO: renamed from: b */
    public VText f49323b;

    public TaskRewardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m73227a(View view) {
        kfi0.m145856a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73228b(BLiveSignInReward bLiveSignInReward, boolean z) {
        float f = Medal.TYPE.equals(bLiveSignInReward.type) ? 0.7894737f : 1.0f;
        this.f49322a.setScaleX(f);
        this.f49322a.setScaleY(f);
        hxs.m133408u("context_livingAct", this.f49322a, bLiveSignInReward.icon, t100.m186890d(38.0f), t100.m186890d(38.0f));
        this.f49323b.setText(bLiveSignInReward.name + bLiveSignInReward.description);
        if (z) {
            m73229c();
        } else {
            m73230d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m73229c() {
        setBackground(yb2.m213876a(647906574, t100.f167258g, false));
        this.f49323b.setTextColor(-2479528);
    }

    /* JADX INFO: renamed from: d */
    public final void m73230d() {
        setBackground(yb2.m213876a(867565635, t100.f167258g, false));
        this.f49323b.setTextColor(-1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73227a(this);
    }
}

package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Medal;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInReward;
import p151v.VDraweeView;
import p151v.VText;
import p153l.fc2;
import p153l.izs;
import p153l.koi0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class TaskRewardView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50170a;

    /* JADX INFO: renamed from: b */
    public VText f50171b;

    public TaskRewardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m74410a(View view) {
        koi0.m150638a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74411b(BLiveSignInReward bLiveSignInReward, boolean z) {
        float f = Medal.TYPE.equals(bLiveSignInReward.type) ? 0.7894737f : 1.0f;
        this.f50170a.setScaleX(f);
        this.f50170a.setScaleY(f);
        izs.m142870u("context_livingAct", this.f50170a, bLiveSignInReward.icon, qa00.m175859d(38.0f), qa00.m175859d(38.0f));
        this.f50171b.setText(bLiveSignInReward.name + bLiveSignInReward.description);
        if (z) {
            m74412c();
        } else {
            m74413d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m74412c() {
        setBackground(fc2.m124971a(647906574, qa00.f156320g, false));
        this.f50171b.setTextColor(-2479528);
    }

    /* JADX INFO: renamed from: d */
    public final void m74413d() {
        setBackground(fc2.m124971a(867565635, qa00.f156320g, false));
        this.f50171b.setTextColor(-1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74410a(this);
    }
}

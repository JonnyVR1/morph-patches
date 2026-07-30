package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VText;
import p149l.rqs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardBoardAwardGroup extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardBoardAwardGroup f50460d;

    /* JADX INFO: renamed from: e */
    public View f50461e;

    /* JADX INFO: renamed from: f */
    public VText f50462f;

    public LiveGuardBoardAwardGroup(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74661h0(View view) {
        rqs.m180493a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74661h0(this);
    }

    public LiveGuardBoardAwardGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardBoardAwardGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

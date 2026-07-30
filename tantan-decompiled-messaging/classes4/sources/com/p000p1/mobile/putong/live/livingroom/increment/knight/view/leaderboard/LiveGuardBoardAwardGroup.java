package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p002l.rqs;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardBoardAwardGroup extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardBoardAwardGroup f6502d;

    /* JADX INFO: renamed from: e */
    public View f6503e;

    /* JADX INFO: renamed from: f */
    public VText f6504f;

    public LiveGuardBoardAwardGroup(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8255h0(View view) {
        rqs.m22117a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8255h0(this);
    }

    public LiveGuardBoardAwardGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardBoardAwardGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

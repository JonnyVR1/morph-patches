package com.p046p1.mobile.putong.core.newui.home;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.eej;
import p149l.i0g0;
import p149l.qib0;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class GPHomeMissMatchView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VFrame f21630a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f21631b;

    /* JADX INFO: renamed from: c */
    public VText f21632c;

    /* JADX INFO: renamed from: d */
    public VText f21633d;

    /* JADX INFO: renamed from: e */
    public float f21634e;

    /* JADX INFO: renamed from: f */
    public float f21635f;

    /* JADX INFO: renamed from: g */
    public float f21636g;

    /* JADX INFO: renamed from: h */
    public float f21637h;

    /* JADX INFO: renamed from: i */
    public Runnable f21638i;

    public GPHomeMissMatchView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36644p(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21634e = motionEvent.getX();
            this.f21635f = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.f21636g = motionEvent.getX();
                this.f21637h = motionEvent.getY();
            }
        } else if (Math.abs(this.f21636g - this.f21634e) >= Math.abs(this.f21637h - this.f21635f) || Math.abs(motionEvent.getY() - this.f21635f) <= ViewConfiguration.get(getContext()).getScaledTouchSlop() || !NullChecker.m81303a(this.f21638i)) {
            performClick();
        } else {
            this.f21638i.run();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m36644p(View view) {
        eej.m115970a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m36645s(Act act, User user, Runnable runnable) {
        this.f21638i = runnable;
        qib0.f154691G.m102336O(this.f21631b, user.m60124fp().url, 2, 80);
        this.f21632c.setText(act.string(R$string.f18297Ya));
        this.f21633d.setText(i0g0.m133861b0(act.string(R$string.f18237Wa), vwb.m200324f0(act.string(R$string.f18267Xa)), Color.parseColor("#e1a11c"), Typeface.DEFAULT_BOLD));
    }

    public GPHomeMissMatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GPHomeMissMatchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

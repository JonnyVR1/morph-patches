package com.p000p1.mobile.putong.core.newui.home;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.eej;
import l.qib0;
import l.vwb;
import p009l.i0g0;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GPHomeMissMatchView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VFrame f408a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f409b;

    /* JADX INFO: renamed from: c */
    public VText f410c;

    /* JADX INFO: renamed from: d */
    public VText f411d;

    /* JADX INFO: renamed from: e */
    public float f412e;

    /* JADX INFO: renamed from: f */
    public float f413f;

    /* JADX INFO: renamed from: g */
    public float f414g;

    /* JADX INFO: renamed from: h */
    public float f415h;

    /* JADX INFO: renamed from: i */
    public Runnable f416i;

    public GPHomeMissMatchView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m593p(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f412e = motionEvent.getX();
            this.f413f = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.f414g = motionEvent.getX();
                this.f415h = motionEvent.getY();
            }
        } else if (Math.abs(this.f414g - this.f412e) >= Math.abs(this.f415h - this.f413f) || Math.abs(motionEvent.getY() - this.f413f) <= ViewConfiguration.get(getContext()).getScaledTouchSlop() || !NullChecker.a(this.f416i)) {
            performClick();
        } else {
            this.f416i.run();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m593p(View view) {
        eej.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m594s(Act act, User user, Runnable runnable) {
        this.f416i = runnable;
        qib0.G.O(this.f409b, ((Media) user.fp()).url, 2, 80);
        this.f410c.setText(act.string(R.string.Ya));
        this.f411d.setText(i0g0.m16129b0(act.string(R.string.Wa), vwb.f0(new String[]{act.string(R.string.Xa)}), Color.parseColor("#e1a11c"), Typeface.DEFAULT_BOLD));
    }

    public GPHomeMissMatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GPHomeMissMatchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

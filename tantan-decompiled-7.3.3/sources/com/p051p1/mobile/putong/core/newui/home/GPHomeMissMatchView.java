package com.p051p1.mobile.putong.core.newui.home;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.jyb;
import p153l.q8g0;
import p153l.uqb0;
import p153l.ygj;

/* JADX INFO: loaded from: classes11.dex */
public class GPHomeMissMatchView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VFrame f22372a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f22373b;

    /* JADX INFO: renamed from: c */
    public VText f22374c;

    /* JADX INFO: renamed from: d */
    public VText f22375d;

    /* JADX INFO: renamed from: e */
    public float f22376e;

    /* JADX INFO: renamed from: f */
    public float f22377f;

    /* JADX INFO: renamed from: g */
    public float f22378g;

    /* JADX INFO: renamed from: h */
    public float f22379h;

    /* JADX INFO: renamed from: i */
    public Runnable f22380i;

    public GPHomeMissMatchView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37647p(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22376e = motionEvent.getX();
            this.f22377f = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.f22378g = motionEvent.getX();
                this.f22379h = motionEvent.getY();
            }
        } else if (Math.abs(this.f22378g - this.f22376e) >= Math.abs(this.f22379h - this.f22377f) || Math.abs(motionEvent.getY() - this.f22377f) <= ViewConfiguration.get(getContext()).getScaledTouchSlop() || !NullChecker.m82486a(this.f22380i)) {
            performClick();
        } else {
            this.f22380i.run();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m37647p(View view) {
        ygj.m215843a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m37648s(Act act, User user, Runnable runnable) {
        this.f22380i = runnable;
        uqb0.f180374G.m127120O(this.f22373b, user.m61308fp().url, 2, 80);
        this.f22374c.setText(act.string(R$string.f19488nb));
        this.f22375d.setText(q8g0.m175796b0(act.string(R$string.f19426lb), jyb.m147507f0(act.string(R$string.f19457mb)), Color.parseColor("#e1a11c"), Typeface.DEFAULT_BOLD));
    }

    public GPHomeMissMatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GPHomeMissMatchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

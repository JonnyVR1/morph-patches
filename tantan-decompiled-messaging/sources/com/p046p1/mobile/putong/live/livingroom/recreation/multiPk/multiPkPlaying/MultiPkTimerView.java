package com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying;

import android.animation.Animator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p149l.bt0;
import p149l.h1c0;
import p149l.kvc0;
import p149l.ql10;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class MultiPkTimerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f51439d;

    /* JADX INFO: renamed from: e */
    public View f51440e;

    /* JADX INFO: renamed from: f */
    public View f51441f;

    /* JADX INFO: renamed from: g */
    public View f51442g;

    /* JADX INFO: renamed from: h */
    public VImage f51443h;

    /* JADX INFO: renamed from: i */
    public VImage f51444i;

    /* JADX INFO: renamed from: j */
    public TextView f51445j;

    /* JADX INFO: renamed from: k */
    public Animator f51446k;

    /* JADX INFO: renamed from: l */
    public int f51447l;

    /* JADX INFO: renamed from: m */
    public int f51448m;

    public MultiPkTimerView(Context context) {
        super(context);
        this.f51447l = 0;
        this.f51448m = 0;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75881h0(View view) {
        ql10.m175394a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m75882i0() {
        Animator animator = this.f51446k;
        if (animator != null) {
            animator.cancel();
            this.f51446k = null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m75883j0() {
        xdl0.m208344M(this.f51443h, true);
    }

    /* JADX INFO: renamed from: k0 */
    public void m75884k0(int i) {
        m75882i0();
        if (i <= 0) {
            m75883j0();
        } else {
            bt0.m103739l(this.f51445j, bt0.f77162i, 0L, 1000L, new LinearInterpolator(), 1.0f, 1.2f, 1.0f, 1.2f, 1.0f).start();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m75885l0(int i, boolean z) {
        Object objValueOf;
        Object objValueOf2;
        if (this.f51447l == 0 && this.f51448m == 0 && i < 0) {
            return;
        }
        if (i >= 0 && i < 3600) {
            this.f51447l = i / 60;
            this.f51448m = i % 60;
        } else if (i >= 3600) {
            this.f51447l = 59;
            this.f51448m = 59;
        } else {
            this.f51447l = 0;
            this.f51448m = 0;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = this.f51447l;
        if (i2 > 9) {
            objValueOf = Integer.valueOf(i2);
        } else {
            objValueOf = "0" + this.f51447l;
        }
        sb.append(objValueOf);
        sb.append(":");
        int i3 = this.f51448m;
        if (i3 > 9) {
            objValueOf2 = Integer.valueOf(i3);
        } else {
            objValueOf2 = "0" + this.f51448m;
        }
        sb.append(objValueOf2);
        String string = sb.toString();
        if (!z) {
            this.f51445j.setText(string);
            this.f51445j.setTextColor(i <= 10 ? kvc0.m147352a(h1c0.f105317K0) : kvc0.m147352a(h1c0.f105362e1));
            return;
        }
        xdl0.m208327D0(t100.m186890d(111.0f), this.f51443h);
        String strConcat = "结束 ".concat(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strConcat);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(kvc0.m147352a(h1c0.f105319L0));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(kvc0.m147352a(h1c0.f105362e1));
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, 2, 18);
        spannableStringBuilder.setSpan(foregroundColorSpan2, 3, strConcat.length(), 18);
        this.f51445j.setText(spannableStringBuilder);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m75882i0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75881h0(this);
    }

    public MultiPkTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51447l = 0;
        this.f51448m = 0;
    }

    public MultiPkTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51447l = 0;
        this.f51448m = 0;
    }
}

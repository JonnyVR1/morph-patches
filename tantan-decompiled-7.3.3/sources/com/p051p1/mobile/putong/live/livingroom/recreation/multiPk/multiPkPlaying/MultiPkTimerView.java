package com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying;

import android.animation.Animator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p153l.au10;
import p153l.bnl0;
import p153l.gt0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class MultiPkTimerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f52287d;

    /* JADX INFO: renamed from: e */
    public View f52288e;

    /* JADX INFO: renamed from: f */
    public View f52289f;

    /* JADX INFO: renamed from: g */
    public View f52290g;

    /* JADX INFO: renamed from: h */
    public VImage f52291h;

    /* JADX INFO: renamed from: i */
    public VImage f52292i;

    /* JADX INFO: renamed from: j */
    public TextView f52293j;

    /* JADX INFO: renamed from: k */
    public Animator f52294k;

    /* JADX INFO: renamed from: l */
    public int f52295l;

    /* JADX INFO: renamed from: m */
    public int f52296m;

    public MultiPkTimerView(Context context) {
        super(context);
        this.f52295l = 0;
        this.f52296m = 0;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77064h0(View view) {
        au10.m100315a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m77065i0() {
        Animator animator = this.f52294k;
        if (animator != null) {
            animator.cancel();
            this.f52294k = null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m77066j0() {
        bnl0.m105524M(this.f52291h, true);
    }

    /* JADX INFO: renamed from: k0 */
    public void m77067k0(int i) {
        m77065i0();
        if (i <= 0) {
            m77066j0();
        } else {
            gt0.m132166l(this.f52293j, gt0.f106354i, 0L, 1000L, new LinearInterpolator(), 1.0f, 1.2f, 1.0f, 1.2f, 1.0f).start();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m77068l0(int i, boolean z) {
        Object objValueOf;
        Object objValueOf2;
        if (this.f52295l == 0 && this.f52296m == 0 && i < 0) {
            return;
        }
        if (i >= 0 && i < 3600) {
            this.f52295l = i / 60;
            this.f52296m = i % 60;
        } else if (i >= 3600) {
            this.f52295l = 59;
            this.f52296m = 59;
        } else {
            this.f52295l = 0;
            this.f52296m = 0;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = this.f52295l;
        if (i2 > 9) {
            objValueOf = Integer.valueOf(i2);
        } else {
            objValueOf = "0" + this.f52295l;
        }
        sb.append(objValueOf);
        sb.append(":");
        int i3 = this.f52296m;
        if (i3 > 9) {
            objValueOf2 = Integer.valueOf(i3);
        } else {
            objValueOf2 = "0" + this.f52296m;
        }
        sb.append(objValueOf2);
        String string = sb.toString();
        if (!z) {
            this.f52293j.setText(string);
            this.f52293j.setTextColor(i <= 10 ? n3d0.m161277a(n9c0.f140778K0) : n3d0.m161277a(n9c0.f140823e1));
            return;
        }
        bnl0.m105507D0(qa00.m175859d(111.0f), this.f52291h);
        String strConcat = "结束 ".concat(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strConcat);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n3d0.m161277a(n9c0.f140780L0));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(n3d0.m161277a(n9c0.f140823e1));
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, 2, 18);
        spannableStringBuilder.setSpan(foregroundColorSpan2, 3, strConcat.length(), 18);
        this.f52293j.setText(spannableStringBuilder);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77065i0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77064h0(this);
    }

    public MultiPkTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52295l = 0;
        this.f52296m = 0;
    }

    public MultiPkTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52295l = 0;
        this.f52296m = 0;
    }
}

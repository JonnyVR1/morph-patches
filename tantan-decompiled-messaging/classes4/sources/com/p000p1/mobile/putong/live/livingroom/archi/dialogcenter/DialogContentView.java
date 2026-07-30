package com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import p002l.xzd;
import v.VFrame;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DialogContentView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f3751c;

    /* JADX INFO: renamed from: d */
    public VFrame f3752d;

    public DialogContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m5102P(View view) {
        xzd.m26275a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m5103Q(View view) {
        if (NullChecker.a(this.f3752d)) {
            this.f3752d.removeAllViews();
            this.f3752d.addView(view);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m5104R(boolean z) {
        if (NullChecker.a(this.f3751c)) {
            this.f3751c.setBackgroundColor(z ? -1929379840 : 16777215);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5102P(this);
    }

    public void setContentBackground(@DrawableRes int i) {
        this.f3752d.setBackgroundResource(i);
    }

    public void setShadowClick(View.OnClickListener onClickListener) {
        xdl0.E0(this.f3751c, onClickListener);
    }

    public DialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

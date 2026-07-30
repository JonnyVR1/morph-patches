package com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VLinear;
import p149l.xdl0;
import p149l.xzd;

/* JADX INFO: loaded from: classes4.dex */
public class DialogContentView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f47709c;

    /* JADX INFO: renamed from: d */
    public VFrame f47710d;

    public DialogContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m71734P(View view) {
        xzd.m211985a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m71735Q(View view) {
        if (NullChecker.m81303a(this.f47710d)) {
            this.f47710d.removeAllViews();
            this.f47710d.addView(view);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m71736R(boolean z) {
        if (NullChecker.m81303a(this.f47709c)) {
            this.f47709c.setBackgroundColor(z ? -1929379840 : 16777215);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71734P(this);
    }

    public void setContentBackground(@DrawableRes int i) {
        this.f47710d.setBackgroundResource(i);
    }

    public void setShadowClick(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f47709c, onClickListener);
    }

    public DialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

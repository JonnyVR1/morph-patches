package com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VLinear;
import p153l.bnl0;
import p153l.l1e;

/* JADX INFO: loaded from: classes4.dex */
public class DialogContentView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f48557c;

    /* JADX INFO: renamed from: d */
    public VFrame f48558d;

    public DialogContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m72917P(View view) {
        l1e.m152469a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m72918Q(View view) {
        if (NullChecker.m82486a(this.f48558d)) {
            this.f48558d.removeAllViews();
            this.f48558d.addView(view);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m72919R(boolean z) {
        if (NullChecker.m82486a(this.f48557c)) {
            this.f48557c.setBackgroundColor(z ? -1929379840 : 16777215);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72917P(this);
    }

    public void setContentBackground(@DrawableRes int i) {
        this.f48558d.setBackgroundResource(i);
    }

    public void setShadowClick(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f48557c, onClickListener);
    }

    public DialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

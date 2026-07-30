package com.p000p1.mobile.putong.core.newui.home;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.BoostLimit;
import java.util.Iterator;
import l.n93;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BoostRemainingCountView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f370a;

    /* JADX INFO: renamed from: b */
    public VText f371b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f372c;

    /* JADX INFO: renamed from: d */
    public VText f373d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f374e;

    /* JADX INFO: renamed from: f */
    public ImageView f375f;

    /* JADX INFO: renamed from: g */
    public VText f376g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f377h;

    public BoostRemainingCountView(Context context) {
        super(context);
        this.f377h = null;
    }

    private int getBoostLimitCount() {
        Iterator it = CoreModule.c.o3().boostLimits.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((BoostLimit) it.next()).remaining;
        }
        return i;
    }

    private void setHeight(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f370a.getLayoutParams();
        layoutParams.height = i;
        this.f370a.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = this.f370a;
        relativeLayout.layout(relativeLayout.getLeft(), getTop(), this.f370a.getRight(), getTop() + i);
        int iD = t100.d(24.0f);
        LinearLayout linearLayout = this.f372c;
        linearLayout.layout(linearLayout.getLeft(), ((getTop() + i) - this.f372c.getHeight()) - iD, this.f372c.getRight(), (getTop() + i) - iD);
        int iD2 = t100.d(42.0f);
        VText vText = this.f371b;
        vText.layout(vText.getLeft(), ((getTop() + i) - this.f371b.getHeight()) - iD2, this.f371b.getRight(), (getTop() + i) - iD2);
        if (this.f371b.getVisibility() == 0 && this.f371b.getHeight() == 0) {
            xdl0.n0(this.f371b);
            int iD3 = t100.d(16.0f);
            int width = (this.f370a.getWidth() - this.f371b.getWidth()) / 2;
            VText vText2 = this.f371b;
            vText2.layout(width, iD3, vText2.getWidth() + width, this.f371b.getHeight() + iD3);
        }
        if (this.f372c.getVisibility() == 0 && this.f372c.getHeight() == 0) {
            xdl0.n0(this.f372c);
            int iD4 = t100.d(34.0f);
            int width2 = (this.f370a.getWidth() - this.f372c.getWidth()) / 2;
            LinearLayout linearLayout2 = this.f372c;
            linearLayout2.layout(width2, iD4, linearLayout2.getWidth() + width2, this.f372c.getHeight() + iD4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m582a(View view) {
        n93.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m582a(this);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public BoostRemainingCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f377h = null;
    }

    public BoostRemainingCountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f377h = null;
    }
}

package com.p046p1.mobile.putong.core.newui.home;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.BoostLimit;
import java.util.Iterator;
import p147v.VText;
import p149l.n93;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class BoostRemainingCountView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f21592a;

    /* JADX INFO: renamed from: b */
    public VText f21593b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f21594c;

    /* JADX INFO: renamed from: d */
    public VText f21595d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f21596e;

    /* JADX INFO: renamed from: f */
    public ImageView f21597f;

    /* JADX INFO: renamed from: g */
    public VText f21598g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f21599h;

    public BoostRemainingCountView(Context context) {
        super(context);
        this.f21599h = null;
    }

    private int getBoostLimitCount() {
        Iterator<BoostLimit> it = CoreModule.f17545c.m31484o3().boostLimits.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().remaining;
        }
        return i;
    }

    private void setHeight(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21592a.getLayoutParams();
        layoutParams.height = i;
        this.f21592a.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = this.f21592a;
        relativeLayout.layout(relativeLayout.getLeft(), getTop(), this.f21592a.getRight(), getTop() + i);
        int iM186890d = t100.m186890d(24.0f);
        LinearLayout linearLayout = this.f21594c;
        linearLayout.layout(linearLayout.getLeft(), ((getTop() + i) - this.f21594c.getHeight()) - iM186890d, this.f21594c.getRight(), (getTop() + i) - iM186890d);
        int iM186890d2 = t100.m186890d(42.0f);
        VText vText = this.f21593b;
        vText.layout(vText.getLeft(), ((getTop() + i) - this.f21593b.getHeight()) - iM186890d2, this.f21593b.getRight(), (getTop() + i) - iM186890d2);
        if (this.f21593b.getVisibility() == 0 && this.f21593b.getHeight() == 0) {
            xdl0.m208390n0(this.f21593b);
            int iM186890d3 = t100.m186890d(16.0f);
            int width = (this.f21592a.getWidth() - this.f21593b.getWidth()) / 2;
            VText vText2 = this.f21593b;
            vText2.layout(width, iM186890d3, vText2.getWidth() + width, this.f21593b.getHeight() + iM186890d3);
        }
        if (this.f21594c.getVisibility() == 0 && this.f21594c.getHeight() == 0) {
            xdl0.m208390n0(this.f21594c);
            int iM186890d4 = t100.m186890d(34.0f);
            int width2 = (this.f21592a.getWidth() - this.f21594c.getWidth()) / 2;
            LinearLayout linearLayout2 = this.f21594c;
            linearLayout2.layout(width2, iM186890d4, linearLayout2.getWidth() + width2, this.f21594c.getHeight() + iM186890d4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m36633a(View view) {
        n93.m158529a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36633a(this);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public BoostRemainingCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21599h = null;
    }

    public BoostRemainingCountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21599h = null;
    }
}

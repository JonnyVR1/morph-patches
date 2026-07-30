package com.p051p1.mobile.putong.core.newui.home;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.BoostLimit;
import java.util.Iterator;
import p151v.VText;
import p153l.bnl0;
import p153l.ca3;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class BoostRemainingCountView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f22334a;

    /* JADX INFO: renamed from: b */
    public VText f22335b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f22336c;

    /* JADX INFO: renamed from: d */
    public VText f22337d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f22338e;

    /* JADX INFO: renamed from: f */
    public ImageView f22339f;

    /* JADX INFO: renamed from: g */
    public VText f22340g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f22341h;

    public BoostRemainingCountView(Context context) {
        super(context);
        this.f22341h = null;
    }

    private int getBoostLimitCount() {
        Iterator<BoostLimit> it = CoreModule.f18264c.m32487o3().boostLimits.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().remaining;
        }
        return i;
    }

    private void setHeight(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f22334a.getLayoutParams();
        layoutParams.height = i;
        this.f22334a.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = this.f22334a;
        relativeLayout.layout(relativeLayout.getLeft(), getTop(), this.f22334a.getRight(), getTop() + i);
        int iM175859d = qa00.m175859d(24.0f);
        LinearLayout linearLayout = this.f22336c;
        linearLayout.layout(linearLayout.getLeft(), ((getTop() + i) - this.f22336c.getHeight()) - iM175859d, this.f22336c.getRight(), (getTop() + i) - iM175859d);
        int iM175859d2 = qa00.m175859d(42.0f);
        VText vText = this.f22335b;
        vText.layout(vText.getLeft(), ((getTop() + i) - this.f22335b.getHeight()) - iM175859d2, this.f22335b.getRight(), (getTop() + i) - iM175859d2);
        if (this.f22335b.getVisibility() == 0 && this.f22335b.getHeight() == 0) {
            bnl0.m105570n0(this.f22335b);
            int iM175859d3 = qa00.m175859d(16.0f);
            int width = (this.f22334a.getWidth() - this.f22335b.getWidth()) / 2;
            VText vText2 = this.f22335b;
            vText2.layout(width, iM175859d3, vText2.getWidth() + width, this.f22335b.getHeight() + iM175859d3);
        }
        if (this.f22336c.getVisibility() == 0 && this.f22336c.getHeight() == 0) {
            bnl0.m105570n0(this.f22336c);
            int iM175859d4 = qa00.m175859d(34.0f);
            int width2 = (this.f22334a.getWidth() - this.f22336c.getWidth()) / 2;
            LinearLayout linearLayout2 = this.f22336c;
            linearLayout2.layout(width2, iM175859d4, linearLayout2.getWidth() + width2, this.f22336c.getHeight() + iM175859d4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m37636a(View view) {
        ca3.m108471a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37636a(this);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public BoostRemainingCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22341h = null;
    }

    public BoostRemainingCountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22341h = null;
    }
}

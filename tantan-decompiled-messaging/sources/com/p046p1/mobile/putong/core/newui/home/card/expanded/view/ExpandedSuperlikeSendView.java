package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGAnimationView;
import p149l.t100;
import p149l.u4c0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedSuperlikeSendView extends CardView {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f22640a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f22641b;

    /* JADX INFO: renamed from: c */
    public int f22642c;

    public ExpandedSuperlikeSendView(@NonNull Context context) {
        super(context);
        this.f22642c = t100.m186890d(850.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m38346b() {
        this.f22641b.stopAnimation(false);
        this.f22640a.stopAnimation(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f22640a = (SVGAnimationView) findViewById(u4c0.f174368md);
        this.f22641b = (SVGAnimationView) findViewById(u4c0.f174351ld);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f22642c;
        if (size > i3) {
            size = i3;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int iM186890d = (size - t100.m186890d(CoreModule.m29932K().mo30705Lo())) - t100.m186890d(4.0f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iM186890d, 1073741824));
        setMeasuredDimension(size2, iM186890d);
    }

    public ExpandedSuperlikeSendView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22642c = t100.m186890d(850.0f);
    }

    public ExpandedSuperlikeSendView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22642c = t100.m186890d(850.0f);
    }
}

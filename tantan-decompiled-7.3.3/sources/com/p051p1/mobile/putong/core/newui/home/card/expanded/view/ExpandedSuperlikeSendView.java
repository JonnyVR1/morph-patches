package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGAnimationView;
import p153l.adc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedSuperlikeSendView extends CardView {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f23382a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f23383b;

    /* JADX INFO: renamed from: c */
    public int f23384c;

    public ExpandedSuperlikeSendView(@NonNull Context context) {
        super(context);
        this.f23384c = qa00.m175859d(850.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m39349b() {
        this.f23383b.stopAnimation(false);
        this.f23382a.stopAnimation(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f23382a = (SVGAnimationView) findViewById(adc0.f70493od);
        this.f23383b = (SVGAnimationView) findViewById(adc0.f70476nd);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f23384c;
        if (size > i3) {
            size = i3;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int iM175859d = (size - qa00.m175859d(CoreModule.m30930K().mo31708Lo())) - qa00.m175859d(4.0f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iM175859d, 1073741824));
        setMeasuredDimension(size2, iM175859d);
    }

    public ExpandedSuperlikeSendView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23384c = qa00.m175859d(850.0f);
    }

    public ExpandedSuperlikeSendView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23384c = qa00.m175859d(850.0f);
    }
}

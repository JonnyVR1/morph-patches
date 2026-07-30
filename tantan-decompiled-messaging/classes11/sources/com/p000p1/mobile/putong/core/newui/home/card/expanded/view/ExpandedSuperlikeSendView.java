package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGAnimationView;
import l.t100;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedSuperlikeSendView extends CardView {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f1418a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f1419b;

    /* JADX INFO: renamed from: c */
    public int f1420c;

    public ExpandedSuperlikeSendView(@NonNull Context context) {
        super(context);
        this.f1420c = t100.d(850.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m2324b() {
        this.f1419b.stopAnimation(false);
        this.f1418a.stopAnimation(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f1418a = findViewById(u4c0.md);
        this.f1419b = findViewById(u4c0.ld);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f1420c;
        if (size > i3) {
            size = i3;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int iD = (size - t100.d(CoreModule.K().Lo())) - t100.d(4.0f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iD, 1073741824));
        setMeasuredDimension(size2, iD);
    }

    public ExpandedSuperlikeSendView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1420c = t100.d(850.0f);
    }

    public ExpandedSuperlikeSendView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1420c = t100.d(850.0f);
    }
}

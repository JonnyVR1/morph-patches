package com.p051p1.mobile.putong.feed.newui.preview.gesture;

import android.content.Context;
import android.util.AttributeSet;
import com.tantanapp.common.utils.NullChecker;
import p151v.fresco.photodraweeview.PhotoDraweeView;
import p153l.am50;
import p153l.u0h;
import p153l.wlj;
import p153l.z3h;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPhotoDraweeView extends PhotoDraweeView {

    /* JADX INFO: renamed from: p */
    public z3h f43476p;

    public FeedPhotoDraweeView(Context context, wlj wljVar) {
        super(context, wljVar);
    }

    @Override // p151v.fresco.photodraweeview.PhotoDraweeView
    public void setOnDragDismissListenler(am50 am50Var) {
        super.setOnDragDismissListenler(am50Var);
        if (am50Var instanceof z3h) {
            this.f43476p = (z3h) am50Var;
        }
        setDismissDragDetector(new u0h(getOnDismissDragGesterListener(), getContext()));
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.m82486a(this.f43476p)) {
            this.f43476p.mo95928b(getTranslationX(), getTranslationY());
        }
    }

    public FeedPhotoDraweeView(Context context) {
        super(context);
    }

    public FeedPhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPhotoDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

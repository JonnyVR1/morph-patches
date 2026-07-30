package com.p000p1.mobile.putong.feed.newui.preview.gesture;

import android.content.Context;
import android.util.AttributeSet;
import com.tantanapp.common.utils.NullChecker;
import l.djj;
import l.td50;
import p007l.fzg;
import p007l.k2h;
import v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPhotoDraweeView extends PhotoDraweeView {

    /* JADX INFO: renamed from: p */
    public k2h f4089p;

    public FeedPhotoDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnDragDismissListenler(td50 td50Var) {
        super.setOnDragDismissListenler(td50Var);
        if (td50Var instanceof k2h) {
            this.f4089p = (k2h) td50Var;
        }
        setDismissDragDetector(new fzg(getOnDismissDragGesterListener(), getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTranslationY(float f) {
        super/*android.view.View*/.setTranslationY(f);
        if (NullChecker.a(this.f4089p)) {
            this.f4089p.mo11386b(getTranslationX(), getTranslationY());
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

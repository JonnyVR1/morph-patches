package com.p046p1.mobile.putong.feed.newui.preview.gesture;

import android.content.Context;
import android.util.AttributeSet;
import com.tantanapp.common.utils.NullChecker;
import p147v.fresco.photodraweeview.PhotoDraweeView;
import p149l.djj;
import p149l.fzg;
import p149l.k2h;
import p149l.td50;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPhotoDraweeView extends PhotoDraweeView {

    /* JADX INFO: renamed from: p */
    public k2h f42628p;

    public FeedPhotoDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
    }

    @Override // p147v.fresco.photodraweeview.PhotoDraweeView
    public void setOnDragDismissListenler(td50 td50Var) {
        super.setOnDragDismissListenler(td50Var);
        if (td50Var instanceof k2h) {
            this.f42628p = (k2h) td50Var;
        }
        setDismissDragDetector(new fzg(getOnDismissDragGesterListener(), getContext()));
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.m81303a(this.f42628p)) {
            this.f42628p.mo144303b(getTranslationX(), getTranslationY());
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

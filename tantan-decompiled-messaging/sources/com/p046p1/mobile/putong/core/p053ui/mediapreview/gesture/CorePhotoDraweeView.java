package com.p046p1.mobile.putong.core.p053ui.mediapreview.gesture;

import android.content.Context;
import android.util.AttributeSet;
import com.tantanapp.common.utils.NullChecker;
import p147v.fresco.photodraweeview.PhotoDraweeView;
import p149l.djj;
import p149l.n9e;
import p149l.rk8;
import p149l.td50;

/* JADX INFO: loaded from: classes3.dex */
public class CorePhotoDraweeView extends PhotoDraweeView {

    /* JADX INFO: renamed from: p */
    public n9e f30679p;

    public CorePhotoDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
    }

    @Override // p147v.fresco.photodraweeview.PhotoDraweeView
    public void setOnDragDismissListenler(td50 td50Var) {
        super.setOnDragDismissListenler(td50Var);
        if (td50Var instanceof n9e) {
            this.f30679p = (n9e) td50Var;
        }
        setDismissDragDetector(new rk8(getOnDismissDragGesterListener(), getContext()));
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.m81303a(this.f30679p)) {
            this.f30679p.mo158539b(getTranslationX(), getTranslationY());
        }
    }

    public CorePhotoDraweeView(Context context) {
        super(context);
    }

    public CorePhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CorePhotoDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

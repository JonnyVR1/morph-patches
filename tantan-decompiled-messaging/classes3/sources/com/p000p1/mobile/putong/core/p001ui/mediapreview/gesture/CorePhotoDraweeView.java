package com.p000p1.mobile.putong.core.p001ui.mediapreview.gesture;

import android.content.Context;
import android.util.AttributeSet;
import com.tantanapp.common.utils.NullChecker;
import l.djj;
import p003l.n9e;
import p003l.rk8;
import p003l.td50;
import p028v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CorePhotoDraweeView extends PhotoDraweeView {

    /* JADX INFO: renamed from: p */
    public n9e f570p;

    public CorePhotoDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p028v.fresco.photodraweeview.PhotoDraweeView
    public void setOnDragDismissListenler(td50 td50Var) {
        super.setOnDragDismissListenler(td50Var);
        if (td50Var instanceof n9e) {
            this.f570p = (n9e) td50Var;
        }
        setDismissDragDetector(new rk8(getOnDismissDragGesterListener(), getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTranslationY(float f) {
        super/*android.view.View*/.setTranslationY(f);
        if (NullChecker.a(this.f570p)) {
            this.f570p.mo6530b(getTranslationX(), getTranslationY());
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

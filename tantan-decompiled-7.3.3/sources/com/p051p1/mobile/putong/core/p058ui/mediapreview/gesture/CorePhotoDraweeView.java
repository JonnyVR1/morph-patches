package com.p051p1.mobile.putong.core.p058ui.mediapreview.gesture;

import android.content.Context;
import android.util.AttributeSet;
import com.tantanapp.common.utils.NullChecker;
import p151v.fresco.photodraweeview.PhotoDraweeView;
import p153l.am50;
import p153l.rae;
import p153l.wl8;
import p153l.wlj;

/* JADX INFO: loaded from: classes3.dex */
public class CorePhotoDraweeView extends PhotoDraweeView {

    /* JADX INFO: renamed from: p */
    public rae f31527p;

    public CorePhotoDraweeView(Context context, wlj wljVar) {
        super(context, wljVar);
    }

    @Override // p151v.fresco.photodraweeview.PhotoDraweeView
    public void setOnDragDismissListenler(am50 am50Var) {
        super.setOnDragDismissListenler(am50Var);
        if (am50Var instanceof rae) {
            this.f31527p = (rae) am50Var;
        }
        setDismissDragDetector(new wl8(getOnDismissDragGesterListener(), getContext()));
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.m82486a(this.f31527p)) {
            this.f31527p.mo173453b(getTranslationX(), getTranslationY());
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

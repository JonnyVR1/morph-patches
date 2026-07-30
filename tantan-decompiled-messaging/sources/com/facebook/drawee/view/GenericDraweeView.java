package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import p149l.djj;
import p149l.ejj;
import p149l.fjj;
import p149l.o6j;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GenericDraweeView extends DraweeView<djj> {
    public GenericDraweeView(Context context) {
        super(context);
        m8286h(context, null);
    }

    /* JADX INFO: renamed from: h */
    public void m8286h(Context context, AttributeSet attributeSet) {
        if (o6j.m162852d()) {
            o6j.m162850a("GenericDraweeView#inflateHierarchy");
        }
        ejj ejjVarM121603d = fjj.m121603d(context, attributeSet);
        setAspectRatio(ejjVarM121603d.m116877f());
        setHierarchy(ejjVarM121603d.m116872a());
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    public GenericDraweeView(Context context, djj djjVar) {
        super(context);
        setHierarchy(djjVar);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8286h(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8286h(context, attributeSet);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m8286h(context, attributeSet);
    }
}

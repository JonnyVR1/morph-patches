package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import p153l.i9j;
import p153l.wlj;
import p153l.xlj;
import p153l.ylj;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GenericDraweeView extends DraweeView<wlj> {
    public GenericDraweeView(Context context) {
        super(context);
        m8340h(context, null);
    }

    /* JADX INFO: renamed from: h */
    public void m8340h(Context context, AttributeSet attributeSet) {
        if (i9j.m139099d()) {
            i9j.m139097a("GenericDraweeView#inflateHierarchy");
        }
        xlj xljVarM216575d = ylj.m216575d(context, attributeSet);
        setAspectRatio(xljVarM216575d.m211643f());
        setHierarchy(xljVarM216575d.m211638a());
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    public GenericDraweeView(Context context, wlj wljVar) {
        super(context);
        setHierarchy(wljVar);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8340h(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8340h(context, attributeSet);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m8340h(context, attributeSet);
    }
}

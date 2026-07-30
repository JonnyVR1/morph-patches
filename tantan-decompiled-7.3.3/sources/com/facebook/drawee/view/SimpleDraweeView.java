package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import p153l.a7h0;
import p153l.i4k0;
import p153l.i9j;
import p153l.wgc0;
import p153l.wlj;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SimpleDraweeView extends GenericDraweeView {

    /* JADX INFO: renamed from: i */
    public static a7h0<? extends AbstractDraweeControllerBuilder> f6392i;

    /* JADX INFO: renamed from: h */
    public AbstractDraweeControllerBuilder f6393h;

    public SimpleDraweeView(Context context, wlj wljVar) {
        super(context, wljVar);
        m8341i(context, null);
    }

    /* JADX INFO: renamed from: i */
    private void m8341i(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                wn80.m207183h(f6392i, "SimpleDraweeView was not initialized!");
                this.f6393h = f6392i.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wgc0.f188938E);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(wgc0.f188940G)) {
                        mo8344o(Uri.parse(typedArrayObtainStyledAttributes.getString(wgc0.f188940G)), null);
                    } else if (typedArrayObtainStyledAttributes.hasValue(wgc0.f188939F) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(wgc0.f188939F, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        } catch (Throwable th2) {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8342j(a7h0<? extends AbstractDraweeControllerBuilder> a7h0Var) {
        f6392i = a7h0Var;
    }

    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.f6393h;
    }

    /* JADX INFO: renamed from: m */
    public void m8343m(@DrawableRes int i, Object obj) {
        mo8344o(i4k0.m138558g(i), obj);
    }

    /* JADX INFO: renamed from: o */
    public void mo8344o(Uri uri, Object obj) {
        setController(this.f6393h.m8257A(obj).mo155332a(uri).mo8264b(getController()).build());
    }

    /* JADX INFO: renamed from: p */
    public void m8345p(String str, Object obj) {
        mo8344o(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(@DrawableRes int i) {
        m8343m(i, null);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        setController(this.f6393h.m8259C(imageRequest).mo8264b(getController()).build());
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        mo8344o(uri, null);
    }

    public void setImageURI(String str) {
        m8345p(str, null);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        m8341i(context, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8341i(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8341i(context, attributeSet);
    }

    @TargetApi(21)
    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m8341i(context, attributeSet);
    }
}

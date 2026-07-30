package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import p149l.djj;
import p149l.fvj0;
import p149l.o6j;
import p149l.r8c0;
import p149l.rf80;
import p149l.syg0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SimpleDraweeView extends GenericDraweeView {

    /* JADX INFO: renamed from: i */
    public static syg0<? extends AbstractDraweeControllerBuilder> f6355i;

    /* JADX INFO: renamed from: h */
    public AbstractDraweeControllerBuilder f6356h;

    public SimpleDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
        m8287i(context, null);
    }

    /* JADX INFO: renamed from: i */
    private void m8287i(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                rf80.m179117h(f6355i, "SimpleDraweeView was not initialized!");
                this.f6356h = f6355i.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r8c0.f158175E);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(r8c0.f158177G)) {
                        mo8290o(Uri.parse(typedArrayObtainStyledAttributes.getString(r8c0.f158177G)), null);
                    } else if (typedArrayObtainStyledAttributes.hasValue(r8c0.f158176F) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(r8c0.f158176F, -1)) != -1) {
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
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        } catch (Throwable th2) {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8288j(syg0<? extends AbstractDraweeControllerBuilder> syg0Var) {
        f6355i = syg0Var;
    }

    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.f6356h;
    }

    /* JADX INFO: renamed from: m */
    public void m8289m(@DrawableRes int i, Object obj) {
        mo8290o(fvj0.m123312g(i), obj);
    }

    /* JADX INFO: renamed from: o */
    public void mo8290o(Uri uri, Object obj) {
        setController(this.f6356h.m8203A(obj).mo121501a(uri).mo8210b(getController()).build());
    }

    /* JADX INFO: renamed from: p */
    public void m8291p(String str, Object obj) {
        mo8290o(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(@DrawableRes int i) {
        m8289m(i, null);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        setController(this.f6356h.m8205C(imageRequest).mo8210b(getController()).build());
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        mo8290o(uri, null);
    }

    public void setImageURI(String str) {
        m8291p(str, null);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        m8287i(context, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8287i(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8287i(context, attributeSet);
    }

    @TargetApi(21)
    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m8287i(context, attributeSet);
    }
}

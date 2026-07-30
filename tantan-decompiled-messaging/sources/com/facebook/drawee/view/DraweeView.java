package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import p149l.hce;
import p149l.ice;
import p149l.jce;
import p149l.o6j;
import p149l.t050;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DraweeView<DH extends ice> extends ImageView {

    /* JADX INFO: renamed from: g */
    public static boolean f6348g = false;

    /* JADX INFO: renamed from: a */
    public final C1598a.a f6349a;

    /* JADX INFO: renamed from: b */
    public float f6350b;

    /* JADX INFO: renamed from: c */
    public jce<DH> f6351c;

    /* JADX INFO: renamed from: d */
    public boolean f6352d;

    /* JADX INFO: renamed from: e */
    public boolean f6353e;

    /* JADX INFO: renamed from: f */
    public Object f6354f;

    public DraweeView(Context context) {
        super(context);
        this.f6349a = new C1598a.a();
        this.f6350b = 0.0f;
        this.f6352d = false;
        this.f6353e = false;
        this.f6354f = null;
        m8280d(context);
    }

    /* JADX INFO: renamed from: d */
    private void m8280d(Context context) {
        boolean zM162852d;
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("DraweeView#init");
            }
            if (this.f6352d) {
                if (zM162852d) {
                    return;
                } else {
                    return;
                }
            }
            boolean z = true;
            this.f6352d = true;
            this.f6351c = jce.m140878c(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (zM162852d) {
                    return;
                } else {
                    return;
                }
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f6348g || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.f6353e = z;
        } finally {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f6348g = z;
    }

    /* JADX INFO: renamed from: a */
    public void m8281a() {
        this.f6351c.m140887j();
    }

    /* JADX INFO: renamed from: b */
    public void m8282b() {
        this.f6351c.m140888k();
    }

    /* JADX INFO: renamed from: e */
    public final void m8283e() {
        Drawable drawable;
        if (!this.f6353e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    /* JADX INFO: renamed from: f */
    public void m8284f() {
        m8281a();
    }

    /* JADX INFO: renamed from: g */
    public void m8285g() {
        m8282b();
    }

    public float getAspectRatio() {
        return this.f6350b;
    }

    public hce getController() {
        return this.f6351c.m140882e();
    }

    public Object getExtraData() {
        return this.f6354f;
    }

    public DH getHierarchy() {
        return (DH) this.f6351c.m140883f();
    }

    public Drawable getTopLevelDrawable() {
        return this.f6351c.m140885h();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8283e();
        m8284f();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8283e();
        m8285g();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m8283e();
        m8284f();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        C1598a.a aVar = this.f6349a;
        aVar.f6357a = i;
        aVar.f6358b = i2;
        C1598a.m8293b(aVar, this.f6350b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        C1598a.a aVar2 = this.f6349a;
        super.onMeasure(aVar2.f6357a, aVar2.f6358b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m8283e();
        m8285g();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6351c.m140889l(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m8283e();
    }

    public void setAspectRatio(float f) {
        if (f == this.f6350b) {
            return;
        }
        this.f6350b = f;
        requestLayout();
    }

    public void setController(hce hceVar) {
        this.f6351c.m140892o(hceVar);
        super.setImageDrawable(this.f6351c.m140885h());
    }

    public void setExtraData(Object obj) {
        this.f6354f = obj;
    }

    public void setHierarchy(DH dh) {
        this.f6351c.m140893p(dh);
        super.setImageDrawable(this.f6351c.m140885h());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        m8280d(getContext());
        this.f6351c.m140891n();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        m8280d(getContext());
        this.f6351c.m140891n();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        m8280d(getContext());
        this.f6351c.m140891n();
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        m8280d(getContext());
        this.f6351c.m140891n();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f6353e = z;
    }

    @Override // android.view.View
    public String toString() {
        t050.C20089a c20089aM186815b = t050.m186815b(this);
        jce<DH> jceVar = this.f6351c;
        return c20089aM186815b.m186817b("holder", jceVar != null ? jceVar.toString() : "<no holder set>").toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6349a = new C1598a.a();
        this.f6350b = 0.0f;
        this.f6352d = false;
        this.f6353e = false;
        this.f6354f = null;
        m8280d(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6349a = new C1598a.a();
        this.f6350b = 0.0f;
        this.f6352d = false;
        this.f6353e = false;
        this.f6354f = null;
        m8280d(context);
    }

    @TargetApi(21)
    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6349a = new C1598a.a();
        this.f6350b = 0.0f;
        this.f6352d = false;
        this.f6353e = false;
        this.f6354f = null;
        m8280d(context);
    }
}

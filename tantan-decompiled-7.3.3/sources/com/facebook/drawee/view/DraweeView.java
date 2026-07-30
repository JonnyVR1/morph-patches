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
import p153l.i950;
import p153l.i9j;
import p153l.lde;
import p153l.mde;
import p153l.nde;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DraweeView<DH extends mde> extends ImageView {

    /* JADX INFO: renamed from: g */
    public static boolean f6385g = false;

    /* JADX INFO: renamed from: a */
    public final C1621a.a f6386a;

    /* JADX INFO: renamed from: b */
    public float f6387b;

    /* JADX INFO: renamed from: c */
    public nde<DH> f6388c;

    /* JADX INFO: renamed from: d */
    public boolean f6389d;

    /* JADX INFO: renamed from: e */
    public boolean f6390e;

    /* JADX INFO: renamed from: f */
    public Object f6391f;

    public DraweeView(Context context) {
        super(context);
        this.f6386a = new C1621a.a();
        this.f6387b = 0.0f;
        this.f6389d = false;
        this.f6390e = false;
        this.f6391f = null;
        m8334d(context);
    }

    /* JADX INFO: renamed from: d */
    private void m8334d(Context context) {
        boolean zM139099d;
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("DraweeView#init");
            }
            if (this.f6389d) {
                if (zM139099d) {
                    return;
                } else {
                    return;
                }
            }
            boolean z = true;
            this.f6389d = true;
            this.f6388c = nde.m162681c(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (zM139099d) {
                    return;
                } else {
                    return;
                }
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f6385g || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.f6390e = z;
        } finally {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f6385g = z;
    }

    /* JADX INFO: renamed from: a */
    public void m8335a() {
        this.f6388c.m162689j();
    }

    /* JADX INFO: renamed from: b */
    public void m8336b() {
        this.f6388c.m162690k();
    }

    /* JADX INFO: renamed from: e */
    public final void m8337e() {
        Drawable drawable;
        if (!this.f6390e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    /* JADX INFO: renamed from: f */
    public void m8338f() {
        m8335a();
    }

    /* JADX INFO: renamed from: g */
    public void m8339g() {
        m8336b();
    }

    public float getAspectRatio() {
        return this.f6387b;
    }

    public lde getController() {
        return this.f6388c.m162685e();
    }

    public Object getExtraData() {
        return this.f6391f;
    }

    public DH getHierarchy() {
        return (DH) this.f6388c.m162686f();
    }

    public Drawable getTopLevelDrawable() {
        return this.f6388c.m162687h();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8337e();
        m8338f();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8337e();
        m8339g();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m8337e();
        m8338f();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        C1621a.a aVar = this.f6386a;
        aVar.f6394a = i;
        aVar.f6395b = i2;
        C1621a.m8347b(aVar, this.f6387b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        C1621a.a aVar2 = this.f6386a;
        super.onMeasure(aVar2.f6394a, aVar2.f6395b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m8337e();
        m8339g();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6388c.m162691l(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m8337e();
    }

    public void setAspectRatio(float f) {
        if (f == this.f6387b) {
            return;
        }
        this.f6387b = f;
        requestLayout();
    }

    public void setController(lde ldeVar) {
        this.f6388c.m162694o(ldeVar);
        super.setImageDrawable(this.f6388c.m162687h());
    }

    public void setExtraData(Object obj) {
        this.f6391f = obj;
    }

    public void setHierarchy(DH dh) {
        this.f6388c.m162695p(dh);
        super.setImageDrawable(this.f6388c.m162687h());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        m8334d(getContext());
        this.f6388c.m162693n();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        m8334d(getContext());
        this.f6388c.m162693n();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        m8334d(getContext());
        this.f6388c.m162693n();
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        m8334d(getContext());
        this.f6388c.m162693n();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f6390e = z;
    }

    @Override // android.view.View
    public String toString() {
        i950.C17670a c17670aM139075b = i950.m139075b(this);
        nde<DH> ndeVar = this.f6388c;
        return c17670aM139075b.m139077b("holder", ndeVar != null ? ndeVar.toString() : "<no holder set>").toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6386a = new C1621a.a();
        this.f6387b = 0.0f;
        this.f6389d = false;
        this.f6390e = false;
        this.f6391f = null;
        m8334d(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6386a = new C1621a.a();
        this.f6387b = 0.0f;
        this.f6389d = false;
        this.f6390e = false;
        this.f6391f = null;
        m8334d(context);
    }

    @TargetApi(21)
    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6386a = new C1621a.a();
        this.f6387b = 0.0f;
        this.f6389d = false;
        this.f6390e = false;
        this.f6391f = null;
        m8334d(context);
    }
}

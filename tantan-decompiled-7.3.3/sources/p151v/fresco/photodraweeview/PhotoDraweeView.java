package p151v.fresco.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import androidx.annotation.NonNull;
import p151v.VDraweeView;
import p153l.am50;
import p153l.cn50;
import p153l.fp50;
import p153l.i5e;
import p153l.lde;
import p153l.mn50;
import p153l.t31;
import p153l.wlj;
import p153l.zl50;

/* JADX INFO: loaded from: classes3.dex */
public class PhotoDraweeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public t31 f210502o;

    public PhotoDraweeView(Context context, wlj wljVar) {
        super(context, wljVar);
        m224645u();
    }

    public float getDoubleTapScale() {
        return this.f210502o.m189061v();
    }

    public float getMaximumScale() {
        return this.f210502o.m189065z();
    }

    public float getMediumScale() {
        return this.f210502o.m189022A();
    }

    public float getMinimumScale() {
        return this.f210502o.m189023C();
    }

    public zl50 getOnDismissDragGesterListener() {
        return this.f210502o.m189024D();
    }

    public cn50 getOnPhotoTapListener() {
        this.f210502o.m189025E();
        return null;
    }

    public fp50 getOnViewTapListener() {
        return this.f210502o.m189026F();
    }

    public float getScale() {
        return this.f210502o.m189027G();
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m224645u();
        super.onAttachedToWindow();
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        this.f210502o.m189031K();
        super.onDetachedFromWindow();
    }

    @Override // p151v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        canvas.concat(this.f210502o.m189062w());
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f210502o.m189034N(z);
    }

    @Override // p151v.VDraweeView, com.facebook.drawee.view.DraweeView
    public void setController(lde ldeVar) {
        this.f210502o.m189037Q(false);
        super.setController(ldeVar);
    }

    public void setDismissDragDetector(i5e i5eVar) {
        this.f210502o.m189035O(i5eVar);
    }

    public void setDoubleTapScale(float f) {
        this.f210502o.m189036P(f);
    }

    public void setMaximumScale(float f) {
        this.f210502o.m189038R(f);
    }

    public void setMediumScale(float f) {
        this.f210502o.m189039S(f);
    }

    public void setMinimumScale(float f) {
        this.f210502o.m189040T(f);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f210502o.m189041U(onDoubleTapListener);
    }

    public void setOnDragDismissListenler(am50 am50Var) {
        this.f210502o.m189042V(am50Var);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f210502o.m189043W(onLongClickListener);
    }

    public void setOnPhotoTapListener(cn50 cn50Var) {
        this.f210502o.m189044X(cn50Var);
    }

    public void setOnScaleChangeListener(mn50 mn50Var) {
        this.f210502o.m189045Y(mn50Var);
    }

    public void setOnViewTapListener(fp50 fp50Var) {
        this.f210502o.m189046Z(fp50Var);
    }

    public void setScale(float f) {
        this.f210502o.m189048a0(f);
    }

    public void setZoomTransitionDuration(long j) {
        this.f210502o.m189051d0(j);
    }

    /* JADX INFO: renamed from: u */
    public void m224645u() {
        t31 t31Var = this.f210502o;
        if (t31Var == null || t31Var.m189063x() == null) {
            this.f210502o = new t31(this);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m224646v(float f, float f2, float f3, boolean z) {
        this.f210502o.m189049b0(f, f2, f3, z);
    }

    /* JADX INFO: renamed from: w */
    public void m224647w(int i, int i2) {
        this.f210502o.m189037Q(true);
        this.f210502o.m189053e0(i, i2);
    }

    public PhotoDraweeView(Context context) {
        super(context);
        m224645u();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224645u();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224645u();
    }
}

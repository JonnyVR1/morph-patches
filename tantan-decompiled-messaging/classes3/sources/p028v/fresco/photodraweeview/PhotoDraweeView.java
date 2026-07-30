package p028v.fresco.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import androidx.annotation.NonNull;
import l.djj;
import l.hce;
import p003l.gf50;
import p003l.m31;
import p003l.sd50;
import p003l.td50;
import p003l.u3e;
import p003l.ve50;
import p003l.zg50;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PhotoDraweeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public m31 f13205o;

    public PhotoDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
        m11900u();
    }

    public float getDoubleTapScale() {
        return this.f13205o.m6264v();
    }

    public float getMaximumScale() {
        return this.f13205o.m6268z();
    }

    public float getMediumScale() {
        return this.f13205o.m6225A();
    }

    public float getMinimumScale() {
        return this.f13205o.m6226C();
    }

    public sd50 getOnDismissDragGesterListener() {
        return this.f13205o.m6227D();
    }

    public ve50 getOnPhotoTapListener() {
        this.f13205o.m6228E();
        return null;
    }

    public zg50 getOnViewTapListener() {
        return this.f13205o.m6229F();
    }

    public float getScale() {
        return this.f13205o.m6230G();
    }

    public void onAttachedToWindow() {
        m11900u();
        super/*com.facebook.drawee.view.DraweeView*/.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f13205o.m6234K();
        super/*com.facebook.drawee.view.DraweeView*/.onDetachedFromWindow();
    }

    @Override // p028v.VDraweeView
    public void onDraw(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        canvas.concat(this.f13205o.m6265w());
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f13205o.m6237N(z);
    }

    @Override // p028v.VDraweeView
    public void setController(hce hceVar) {
        this.f13205o.m6240Q(false);
        super.setController(hceVar);
    }

    public void setDismissDragDetector(u3e u3eVar) {
        this.f13205o.m6238O(u3eVar);
    }

    public void setDoubleTapScale(float f) {
        this.f13205o.m6239P(f);
    }

    public void setMaximumScale(float f) {
        this.f13205o.m6241R(f);
    }

    public void setMediumScale(float f) {
        this.f13205o.m6242S(f);
    }

    public void setMinimumScale(float f) {
        this.f13205o.m6243T(f);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f13205o.m6244U(onDoubleTapListener);
    }

    public void setOnDragDismissListenler(td50 td50Var) {
        this.f13205o.m6245V(td50Var);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13205o.m6246W(onLongClickListener);
    }

    public void setOnPhotoTapListener(ve50 ve50Var) {
        this.f13205o.m6247X(ve50Var);
    }

    public void setOnScaleChangeListener(gf50 gf50Var) {
        this.f13205o.m6248Y(gf50Var);
    }

    public void setOnViewTapListener(zg50 zg50Var) {
        this.f13205o.m6249Z(zg50Var);
    }

    public void setScale(float f) {
        this.f13205o.m6251a0(f);
    }

    public void setZoomTransitionDuration(long j) {
        this.f13205o.m6254d0(j);
    }

    /* JADX INFO: renamed from: u */
    public void m11900u() {
        m31 m31Var = this.f13205o;
        if (m31Var == null || m31Var.m6266x() == null) {
            this.f13205o = new m31(this);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m11901v(float f, float f2, float f3, boolean z) {
        this.f13205o.m6252b0(f, f2, f3, z);
    }

    /* JADX INFO: renamed from: w */
    public void m11902w(int i, int i2) {
        this.f13205o.m6240Q(true);
        this.f13205o.m6256e0(i, i2);
    }

    public PhotoDraweeView(Context context) {
        super(context);
        m11900u();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11900u();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11900u();
    }
}

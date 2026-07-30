package p147v.fresco.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import androidx.annotation.NonNull;
import p147v.VDraweeView;
import p149l.djj;
import p149l.gf50;
import p149l.hce;
import p149l.m31;
import p149l.sd50;
import p149l.td50;
import p149l.u3e;
import p149l.ve50;
import p149l.zg50;

/* JADX INFO: loaded from: classes3.dex */
public class PhotoDraweeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public m31 f209580o;

    public PhotoDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
        m223399u();
    }

    public float getDoubleTapScale() {
        return this.f209580o.m152798v();
    }

    public float getMaximumScale() {
        return this.f209580o.m152802z();
    }

    public float getMediumScale() {
        return this.f209580o.m152759A();
    }

    public float getMinimumScale() {
        return this.f209580o.m152760C();
    }

    public sd50 getOnDismissDragGesterListener() {
        return this.f209580o.m152761D();
    }

    public ve50 getOnPhotoTapListener() {
        this.f209580o.m152762E();
        return null;
    }

    public zg50 getOnViewTapListener() {
        return this.f209580o.m152763F();
    }

    public float getScale() {
        return this.f209580o.m152764G();
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m223399u();
        super.onAttachedToWindow();
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        this.f209580o.m152768K();
        super.onDetachedFromWindow();
    }

    @Override // p147v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        canvas.concat(this.f209580o.m152799w());
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f209580o.m152771N(z);
    }

    @Override // p147v.VDraweeView, com.facebook.drawee.view.DraweeView
    public void setController(hce hceVar) {
        this.f209580o.m152774Q(false);
        super.setController(hceVar);
    }

    public void setDismissDragDetector(u3e u3eVar) {
        this.f209580o.m152772O(u3eVar);
    }

    public void setDoubleTapScale(float f) {
        this.f209580o.m152773P(f);
    }

    public void setMaximumScale(float f) {
        this.f209580o.m152775R(f);
    }

    public void setMediumScale(float f) {
        this.f209580o.m152776S(f);
    }

    public void setMinimumScale(float f) {
        this.f209580o.m152777T(f);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f209580o.m152778U(onDoubleTapListener);
    }

    public void setOnDragDismissListenler(td50 td50Var) {
        this.f209580o.m152779V(td50Var);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f209580o.m152780W(onLongClickListener);
    }

    public void setOnPhotoTapListener(ve50 ve50Var) {
        this.f209580o.m152781X(ve50Var);
    }

    public void setOnScaleChangeListener(gf50 gf50Var) {
        this.f209580o.m152782Y(gf50Var);
    }

    public void setOnViewTapListener(zg50 zg50Var) {
        this.f209580o.m152783Z(zg50Var);
    }

    public void setScale(float f) {
        this.f209580o.m152785a0(f);
    }

    public void setZoomTransitionDuration(long j) {
        this.f209580o.m152788d0(j);
    }

    /* JADX INFO: renamed from: u */
    public void m223399u() {
        m31 m31Var = this.f209580o;
        if (m31Var == null || m31Var.m152800x() == null) {
            this.f209580o = new m31(this);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m223400v(float f, float f2, float f3, boolean z) {
        this.f209580o.m152786b0(f, f2, f3, z);
    }

    /* JADX INFO: renamed from: w */
    public void m223401w(int i, int i2) {
        this.f209580o.m152774Q(true);
        this.f209580o.m152790e0(i, i2);
    }

    public PhotoDraweeView(Context context) {
        super(context);
        m223399u();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223399u();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223399u();
    }
}

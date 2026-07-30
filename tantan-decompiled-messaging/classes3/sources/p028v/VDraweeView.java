package p028v;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.tantanapp.common.utils.CrashHelper;
import l.b9c0;
import l.djj;
import l.hce;
import l.hpd0;
import l.tj40;
import org.jetbrains.annotations.Nullable;
import p003l.d30;
import p003l.ekh0;
import p003l.m23;
import p028v.VDraweeView;
import p028v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VDraweeView extends SimpleDraweeView implements C1378a.b, tj40.a {

    /* JADX INFO: renamed from: n */
    public static hpd0 f12706n = new hpd0("no_image_mode", Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public ekh0 f12707j;

    /* JADX INFO: renamed from: k */
    public C1378a f12708k;

    /* JADX INFO: renamed from: l */
    public boolean f12709l;

    /* JADX INFO: renamed from: m */
    public final tj40 f12710m;

    public VDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
        this.f12709l = true;
        this.f12710m = new tj40(this);
        m11483s(context, null, 0);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m11481q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    private void m11483s(Context context, AttributeSet attributeSet, int i) {
        ekh0 ekh0Var = new ekh0(this);
        this.f12707j = ekh0Var;
        ekh0Var.m3898h(context, attributeSet, i);
        this.f12708k = new C1378a(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.D3, i, 0);
            this.f12709l = typedArrayObtainStyledAttributes.getBoolean(b9c0.E3, this.f12709l);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m11484c(ColorFilter colorFilter) {
        super/*android.widget.ImageView*/.setColorFilter(colorFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        try {
            this.f12708k.m11823g(canvas);
            super/*android.view.View*/.draw(canvas);
            this.f12707j.m3891a(canvas);
        } catch (Throwable th) {
            CrashHelper.c(th);
            m23.m6193b(this, th, new d30() { // from class: l.gok0
                @Override // p003l.d30
                public final void call() {
                    VDraweeView.m11481q();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        super/*android.view.View*/.drawableStateChanged();
        this.f12707j.m3896f();
    }

    public Drawable getForeground() {
        return this.f12707j.m3897g();
    }

    public float getOriginalHeight() {
        return this.f12708k.m11825i();
    }

    public float getOriginalWidth() {
        return this.f12708k.m11826j();
    }

    public C1378a getZoomAnimationAttacher() {
        return this.f12708k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void jumpDrawablesToCurrentState() {
        super/*android.view.View*/.jumpDrawablesToCurrentState();
        this.f12707j.m3892b();
    }

    @Override // p028v.C1378a.b
    /* JADX INFO: renamed from: k */
    public String mo879k() {
        return this.f12708k.m11820F();
    }

    @Override // p028v.C1378a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo880l(ViewGroup viewGroup) {
        return this.f12708k.m11821G(viewGroup);
    }

    @Override // p028v.C1378a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo881n(ViewGroup viewGroup) {
        if (this instanceof PhotoDraweeView) {
            ((PhotoDraweeView) this).setScale(1.0f);
        }
        return this.f12708k.m11822H(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        try {
            super/*android.view.View*/.onDraw(canvas);
        } catch (Throwable th) {
            CrashHelper.c(th);
            m23.m6193b(this, th, new d30() { // from class: l.hok0
                @Override // p003l.d30
                public final void call() {
                    this.f4240a.m11485t();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        this.f12707j.m3893c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f12707j.m3894d(motionEvent);
        return super/*com.facebook.drawee.view.DraweeView*/.onTouchEvent(motionEvent);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12710m.a(colorFilter);
    }

    public void setController(@Nullable hce hceVar) {
        if (((Boolean) f12706n.get()).booleanValue()) {
            return;
        }
        super/*com.facebook.drawee.view.DraweeView*/.setController(hceVar);
    }

    public void setForeground(Drawable drawable) {
        this.f12707j.m3899i(drawable);
    }

    public void setOriginalHeight(float f) {
        this.f12708k.m11841y(f);
    }

    public void setOriginalWidth(float f) {
        this.f12708k.m11842z(f);
    }

    public void setZoomAnimationKey(String str) {
        this.f12708k.m11816B(str);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m11485t() {
        getHierarchy().f(new ColorDrawable(16777215), 1.0f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean verifyDrawable(Drawable drawable) {
        return super/*android.view.View*/.verifyDrawable(drawable) || this.f12707j.m3895e(drawable);
    }

    public VDraweeView(Context context) {
        super(context);
        this.f12709l = true;
        this.f12710m = new tj40(this);
        m11483s(context, null, 0);
    }

    public VDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12709l = true;
        this.f12710m = new tj40(this);
        m11483s(context, attributeSet, 0);
    }

    public VDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12709l = true;
        this.f12710m = new tj40(this);
        m11483s(context, attributeSet, 0);
    }

    public VDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12709l = true;
        this.f12710m = new tj40(this);
        m11483s(context, attributeSet, 0);
    }
}

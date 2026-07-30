package p151v;

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
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.fresco.photodraweeview.PhotoDraweeView;
import p153l.c33;
import p153l.hhc0;
import p153l.hs40;
import p153l.jxd0;
import p153l.lde;
import p153l.lsh0;
import p153l.wlj;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class VDraweeView extends SimpleDraweeView implements C22700a.b, hs40.InterfaceC17567a {

    /* JADX INFO: renamed from: n */
    public static jxd0 f210003n = new jxd0("no_image_mode", Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public lsh0 f210004j;

    /* JADX INFO: renamed from: k */
    public C22700a f210005k;

    /* JADX INFO: renamed from: l */
    public boolean f210006l;

    /* JADX INFO: renamed from: m */
    public final hs40 f210007m;

    public VDraweeView(Context context, wlj wljVar) {
        super(context, wljVar);
        this.f210006l = true;
        this.f210007m = new hs40(this);
        m224255s(context, null, 0);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m224253q() {
    }

    /* JADX INFO: renamed from: s */
    private void m224255s(Context context, AttributeSet attributeSet, int i) {
        lsh0 lsh0Var = new lsh0(this);
        this.f210004j = lsh0Var;
        lsh0Var.m155695h(context, attributeSet, i);
        this.f210005k = new C22700a(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109553D3, i, 0);
            this.f210006l = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109560E3, this.f210006l);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p153l.hs40.InterfaceC17567a
    /* JADX INFO: renamed from: c */
    public void mo136951c(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        try {
            this.f210005k.m224577g(canvas);
            super.draw(canvas);
            this.f210004j.m155688a(canvas);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            c33.m107766b(this, th, new x20() { // from class: l.mxk0
                @Override // p153l.x20
                public final void call() {
                    VDraweeView.m224253q();
                }
            });
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f210004j.m155693f();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f210004j.m155694g();
    }

    public float getOriginalHeight() {
        return this.f210005k.m224579i();
    }

    public float getOriginalWidth() {
        return this.f210005k.m224580j();
    }

    public C22700a getZoomAnimationAttacher() {
        return this.f210005k;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f210004j.m155689b();
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: k */
    public String mo45129k() {
        return this.f210005k.m224574F();
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo45130l(ViewGroup viewGroup) {
        return this.f210005k.m224575G(viewGroup);
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo45131n(ViewGroup viewGroup) {
        if (this instanceof PhotoDraweeView) {
            ((PhotoDraweeView) this).setScale(1.0f);
        }
        return this.f210005k.m224576H(viewGroup);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            c33.m107766b(this, th, new x20() { // from class: l.nxk0
                @Override // p153l.x20
                public final void call() {
                    this.f144155a.m224256t();
                }
            });
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f210004j.m155690c();
    }

    @Override // com.facebook.drawee.view.DraweeView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f210004j.m155691d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        this.f210007m.m136949a(colorFilter);
    }

    @Override // com.facebook.drawee.view.DraweeView
    public void setController(@Nullable lde ldeVar) {
        if (f210003n.get().booleanValue()) {
            return;
        }
        super.setController(ldeVar);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f210004j.m155696i(drawable);
    }

    public void setOriginalHeight(float f) {
        this.f210005k.m224595y(f);
    }

    public void setOriginalWidth(float f) {
        this.f210005k.m224596z(f);
    }

    public void setZoomAnimationKey(String str) {
        this.f210005k.m224570B(str);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m224256t() {
        getHierarchy().mo118280f(new ColorDrawable(16777215), 1.0f, true);
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f210004j.m155692e(drawable);
    }

    public VDraweeView(Context context) {
        super(context);
        this.f210006l = true;
        this.f210007m = new hs40(this);
        m224255s(context, null, 0);
    }

    public VDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210006l = true;
        this.f210007m = new hs40(this);
        m224255s(context, attributeSet, 0);
    }

    public VDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210006l = true;
        this.f210007m = new hs40(this);
        m224255s(context, attributeSet, 0);
    }

    public VDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f210006l = true;
        this.f210007m = new hs40(this);
        m224255s(context, attributeSet, 0);
    }
}

package p147v;

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
import p147v.VDraweeView;
import p147v.fresco.photodraweeview.PhotoDraweeView;
import p149l.b9c0;
import p149l.d30;
import p149l.djj;
import p149l.ekh0;
import p149l.hce;
import p149l.hpd0;
import p149l.m23;
import p149l.tj40;

/* JADX INFO: loaded from: classes3.dex */
public class VDraweeView extends SimpleDraweeView implements C22585a.b, tj40.InterfaceC20186a {

    /* JADX INFO: renamed from: n */
    public static hpd0 f209081n = new hpd0("no_image_mode", Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public ekh0 f209082j;

    /* JADX INFO: renamed from: k */
    public C22585a f209083k;

    /* JADX INFO: renamed from: l */
    public boolean f209084l;

    /* JADX INFO: renamed from: m */
    public final tj40 f209085m;

    public VDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
        this.f209084l = true;
        this.f209085m = new tj40(this);
        m223009s(context, null, 0);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m223007q() {
    }

    /* JADX INFO: renamed from: s */
    private void m223009s(Context context, AttributeSet attributeSet, int i) {
        ekh0 ekh0Var = new ekh0(this);
        this.f209082j = ekh0Var;
        ekh0Var.m116974h(context, attributeSet, i);
        this.f209083k = new C22585a(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74244D3, i, 0);
            this.f209084l = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74251E3, this.f209084l);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p149l.tj40.InterfaceC20186a
    /* JADX INFO: renamed from: c */
    public void mo189247c(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        try {
            this.f209083k.m223331g(canvas);
            super.draw(canvas);
            this.f209082j.m116967a(canvas);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            m23.m152650b(this, th, new d30() { // from class: l.gok0
                @Override // p149l.d30
                public final void call() {
                    VDraweeView.m223007q();
                }
            });
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209082j.m116972f();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f209082j.m116973g();
    }

    public float getOriginalHeight() {
        return this.f209083k.m223333i();
    }

    public float getOriginalWidth() {
        return this.f209083k.m223334j();
    }

    public C22585a getZoomAnimationAttacher() {
        return this.f209083k;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f209082j.m116968b();
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: k */
    public String mo43946k() {
        return this.f209083k.m223328F();
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo43947l(ViewGroup viewGroup) {
        return this.f209083k.m223329G(viewGroup);
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo43948n(ViewGroup viewGroup) {
        if (this instanceof PhotoDraweeView) {
            ((PhotoDraweeView) this).setScale(1.0f);
        }
        return this.f209083k.m223330H(viewGroup);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            m23.m152650b(this, th, new d30() { // from class: l.hok0
                @Override // p149l.d30
                public final void call() {
                    this.f108830a.m223010t();
                }
            });
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f209082j.m116969c();
    }

    @Override // com.facebook.drawee.view.DraweeView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f209082j.m116970d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        this.f209085m.m189245a(colorFilter);
    }

    @Override // com.facebook.drawee.view.DraweeView
    public void setController(@Nullable hce hceVar) {
        if (f209081n.get().booleanValue()) {
            return;
        }
        super.setController(hceVar);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f209082j.m116975i(drawable);
    }

    public void setOriginalHeight(float f) {
        this.f209083k.m223349y(f);
    }

    public void setOriginalWidth(float f) {
        this.f209083k.m223350z(f);
    }

    public void setZoomAnimationKey(String str) {
        this.f209083k.m223324B(str);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m223010t() {
        getHierarchy().mo112059f(new ColorDrawable(16777215), 1.0f, true);
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f209082j.m116971e(drawable);
    }

    public VDraweeView(Context context) {
        super(context);
        this.f209084l = true;
        this.f209085m = new tj40(this);
        m223009s(context, null, 0);
    }

    public VDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209084l = true;
        this.f209085m = new tj40(this);
        m223009s(context, attributeSet, 0);
    }

    public VDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209084l = true;
        this.f209085m = new tj40(this);
        m223009s(context, attributeSet, 0);
    }

    public VDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f209084l = true;
        this.f209085m = new tj40(this);
        m223009s(context, attributeSet, 0);
    }
}

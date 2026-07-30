package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import p149l.b9c0;
import p149l.d30;
import p149l.eqh0;
import p149l.gbl0;
import p149l.n8c0;
import p149l.rjj;
import p149l.t100;
import p149l.upk0;
import p149l.w660;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class VPageIndicator_Action extends View implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public Paint f209215a;

    /* JADX INFO: renamed from: b */
    public TextPaint f209216b;

    /* JADX INFO: renamed from: c */
    public RectF f209217c;

    /* JADX INFO: renamed from: d */
    public w660 f209218d;

    /* JADX INFO: renamed from: e */
    public DataSetObserver f209219e;

    /* JADX INFO: renamed from: f */
    public int f209220f;

    /* JADX INFO: renamed from: g */
    public int f209221g;

    /* JADX INFO: renamed from: h */
    public float f209222h;

    /* JADX INFO: renamed from: i */
    public int f209223i;

    /* JADX INFO: renamed from: j */
    public int f209224j;

    /* JADX INFO: renamed from: k */
    public d30 f209225k;

    /* JADX INFO: renamed from: l */
    public int f209226l;

    /* JADX INFO: renamed from: m */
    public String f209227m;

    /* JADX INFO: renamed from: n */
    public Paint.FontMetrics f209228n;

    /* JADX INFO: renamed from: o */
    public rjj f209229o;

    /* JADX INFO: renamed from: v.VPageIndicator_Action$a */
    public class C22553a extends rjj.C19717d {
        public C22553a() {
        }

        @Override // p149l.rjj.C19717d, p149l.rjj.InterfaceC19716c
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (VPageIndicator_Action.this.f209221g != VPageIndicator_Action.this.f209220f - 1 || VPageIndicator_Action.this.f209222h != 0.0f || VPageIndicator_Action.this.f209225k == null) {
                return false;
            }
            VPageIndicator_Action.this.f209225k.call();
            return true;
        }
    }

    /* JADX INFO: renamed from: v.VPageIndicator_Action$b */
    public class C22554b extends DataSetObserver {
        public C22554b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VPageIndicator_Action vPageIndicator_Action = VPageIndicator_Action.this;
            vPageIndicator_Action.f209220f = vPageIndicator_Action.f209218d.getCount();
            gbl0.m125183a0(VPageIndicator_Action.this);
        }
    }

    public VPageIndicator_Action(Context context) {
        super(context);
        m223138g(context, null, 0);
    }

    /* JADX INFO: renamed from: g */
    private void m223138g(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74397b4, i, n8c0.f137634r);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.f74404c4, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.f74432g4, RoundedDrawable.DEFAULT_BORDER_COLOR);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74411d4, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.f74418e4, 0);
        String string = typedArrayObtainStyledAttributes.getString(b9c0.f74425f4);
        typedArrayObtainStyledAttributes.recycle();
        this.f209217c = new RectF();
        Paint paint = new Paint(1);
        this.f209215a = paint;
        paint.setColor(color);
        TextPaint textPaint = new TextPaint(1);
        this.f209216b = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f209216b.setColor(color2);
        this.f209216b.setFakeBoldText(true);
        this.f209216b.setTypeface(eqh0.m117752c(3));
        this.f209228n = new Paint.FontMetrics();
        this.f209223i = dimensionPixelSize;
        this.f209224j = dimensionPixelOffset;
        this.f209226l = t100.m186890d(4.0f);
        this.f209227m = string;
        this.f209229o = new rjj(context, new C22553a());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2 = this.f209222h;
        float f3 = 1.0f;
        if (f2 != 0.0f || (i2 = this.f209221g) <= 0) {
            i = this.f209221g;
        } else {
            i = i2 - 1;
            f2 = 1.0f;
        }
        int i3 = this.f209220f;
        int i4 = ((i3 - 1) * this.f209224j) + ((i3 + 2) * this.f209223i);
        int height = canvas.getHeight();
        int i5 = this.f209223i;
        float f4 = (height - i5) / 2.0f;
        float f5 = i5 + f4;
        float width = (canvas.getWidth() - i4) / 2.0f;
        int i6 = 0;
        while (i6 < this.f209220f) {
            if (i6 == i) {
                int i7 = this.f209223i;
                f = i7 + (i7 * 2 * (f3 - f2));
            } else {
                int i8 = i + 1;
                int i9 = this.f209223i;
                f = i6 == i8 ? (i9 * 2 * f2) + i9 : i9;
            }
            float f6 = width + f;
            this.f209217c.set(width, f4, f6, f5);
            int i10 = this.f209220f;
            if (i < i10 - 2) {
                this.f209215a.setAlpha(255);
                RectF rectF = this.f209217c;
                int i11 = this.f209223i;
                canvas.drawRoundRect(rectF, i11, i11, this.f209215a);
            } else {
                int i12 = i10 - 1;
                Paint paint = this.f209215a;
                if (i6 < i12) {
                    paint.setAlpha((int) ((f3 - f2) * 255.0f));
                    RectF rectF2 = this.f209217c;
                    int i13 = this.f209223i;
                    canvas.drawRoundRect(rectF2, i13, i13, this.f209215a);
                } else {
                    paint.setAlpha(255);
                    float width2 = f6 + ((canvas.getWidth() - f6) * f2);
                    float f7 = this.f209223i;
                    int width3 = canvas.getWidth();
                    int i14 = this.f209223i;
                    float f8 = f7 + ((width3 - i14) * f2);
                    float height2 = i14 + ((canvas.getHeight() - this.f209223i) * f2);
                    float height3 = (canvas.getHeight() - height2) / 2.0f;
                    this.f209217c.set(width2 - f8, height3, width2, height3 + height2);
                    canvas.drawRoundRect(this.f209217c, canvas.getHeight() / 2.0f, canvas.getHeight() / 2.0f, this.f209215a);
                    float f9 = height2 / 3.0f;
                    if (f9 > this.f209226l && this.f209227m != null) {
                        this.f209216b.setTextSize(f9);
                        this.f209216b.getFontMetrics(this.f209228n);
                        float height4 = canvas.getHeight() / 2;
                        Paint.FontMetrics fontMetrics = this.f209228n;
                        float f10 = fontMetrics.descent;
                        canvas.drawText(this.f209227m, width2 - (f8 / 2.0f), (height4 + ((f10 - fontMetrics.ascent) / 2.0f)) - f10, this.f209216b);
                    }
                    f = f8;
                    f4 = height3;
                }
            }
            width += f + this.f209224j;
            i6++;
            f3 = 1.0f;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
        this.f209221g = i;
        this.f209222h = f;
        gbl0.m125183a0(this);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f209229o.m179603l(motionEvent);
        return true;
    }

    public void setAction(d30 d30Var) {
        this.f209225k = d30Var;
    }

    public void setViewPager(ViewPager viewPager) {
        w660 w660Var = this.f209218d;
        if (w660Var != null) {
            w660Var.unregisterDataSetObserver(this.f209219e);
        }
        w660 adapter = viewPager.getAdapter();
        this.f209218d = adapter;
        if (adapter == null) {
            upk0.m194883a("setViewPager must be called after ViewPager#setAdapter");
            return;
        }
        this.f209220f = adapter.getCount();
        if (this.f209219e == null) {
            this.f209219e = new C22554b();
        }
        this.f209218d.registerDataSetObserver(this.f209219e);
        viewPager.m4185d(this);
    }

    public VPageIndicator_Action(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m223138g(context, attributeSet, 0);
    }

    public VPageIndicator_Action(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223138g(context, attributeSet, i);
    }
}

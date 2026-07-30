package p151v;

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
import p153l.azk0;
import p153l.cf60;
import p153l.hhc0;
import p153l.kkl0;
import p153l.kmj;
import p153l.lyh0;
import p153l.qa00;
import p153l.tgc0;
import p153l.x20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class VPageIndicator_Action extends View implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public Paint f210137a;

    /* JADX INFO: renamed from: b */
    public TextPaint f210138b;

    /* JADX INFO: renamed from: c */
    public RectF f210139c;

    /* JADX INFO: renamed from: d */
    public cf60 f210140d;

    /* JADX INFO: renamed from: e */
    public DataSetObserver f210141e;

    /* JADX INFO: renamed from: f */
    public int f210142f;

    /* JADX INFO: renamed from: g */
    public int f210143g;

    /* JADX INFO: renamed from: h */
    public float f210144h;

    /* JADX INFO: renamed from: i */
    public int f210145i;

    /* JADX INFO: renamed from: j */
    public int f210146j;

    /* JADX INFO: renamed from: k */
    public x20 f210147k;

    /* JADX INFO: renamed from: l */
    public int f210148l;

    /* JADX INFO: renamed from: m */
    public String f210149m;

    /* JADX INFO: renamed from: n */
    public Paint.FontMetrics f210150n;

    /* JADX INFO: renamed from: o */
    public kmj f210151o;

    /* JADX INFO: renamed from: v.VPageIndicator_Action$a */
    public class C22668a extends kmj.C18210d {
        public C22668a() {
        }

        @Override // p153l.kmj.C18210d, p153l.kmj.InterfaceC18209c
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (VPageIndicator_Action.this.f210143g != VPageIndicator_Action.this.f210142f - 1 || VPageIndicator_Action.this.f210144h != 0.0f || VPageIndicator_Action.this.f210147k == null) {
                return false;
            }
            VPageIndicator_Action.this.f210147k.call();
            return true;
        }
    }

    /* JADX INFO: renamed from: v.VPageIndicator_Action$b */
    public class C22669b extends DataSetObserver {
        public C22669b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VPageIndicator_Action vPageIndicator_Action = VPageIndicator_Action.this;
            vPageIndicator_Action.f210142f = vPageIndicator_Action.f210140d.getCount();
            kkl0.m150146a0(VPageIndicator_Action.this);
        }
    }

    public VPageIndicator_Action(Context context) {
        super(context);
        m224384g(context, null, 0);
    }

    /* JADX INFO: renamed from: g */
    private void m224384g(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109706b4, i, tgc0.f174072r);
        int color = typedArrayObtainStyledAttributes.getColor(hhc0.f109713c4, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(hhc0.f109741g4, RoundedDrawable.DEFAULT_BORDER_COLOR);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109720d4, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(hhc0.f109727e4, 0);
        String string = typedArrayObtainStyledAttributes.getString(hhc0.f109734f4);
        typedArrayObtainStyledAttributes.recycle();
        this.f210139c = new RectF();
        Paint paint = new Paint(1);
        this.f210137a = paint;
        paint.setColor(color);
        TextPaint textPaint = new TextPaint(1);
        this.f210138b = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f210138b.setColor(color2);
        this.f210138b.setFakeBoldText(true);
        this.f210138b.setTypeface(lyh0.m156283c(3));
        this.f210150n = new Paint.FontMetrics();
        this.f210145i = dimensionPixelSize;
        this.f210146j = dimensionPixelOffset;
        this.f210148l = qa00.m175859d(4.0f);
        this.f210149m = string;
        this.f210151o = new kmj(context, new C22668a());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2 = this.f210144h;
        float f3 = 1.0f;
        if (f2 != 0.0f || (i2 = this.f210143g) <= 0) {
            i = this.f210143g;
        } else {
            i = i2 - 1;
            f2 = 1.0f;
        }
        int i3 = this.f210142f;
        int i4 = ((i3 - 1) * this.f210146j) + ((i3 + 2) * this.f210145i);
        int height = canvas.getHeight();
        int i5 = this.f210145i;
        float f4 = (height - i5) / 2.0f;
        float f5 = i5 + f4;
        float width = (canvas.getWidth() - i4) / 2.0f;
        int i6 = 0;
        while (i6 < this.f210142f) {
            if (i6 == i) {
                int i7 = this.f210145i;
                f = i7 + (i7 * 2 * (f3 - f2));
            } else {
                int i8 = i + 1;
                int i9 = this.f210145i;
                f = i6 == i8 ? (i9 * 2 * f2) + i9 : i9;
            }
            float f6 = width + f;
            this.f210139c.set(width, f4, f6, f5);
            int i10 = this.f210142f;
            if (i < i10 - 2) {
                this.f210137a.setAlpha(255);
                RectF rectF = this.f210139c;
                int i11 = this.f210145i;
                canvas.drawRoundRect(rectF, i11, i11, this.f210137a);
            } else {
                int i12 = i10 - 1;
                Paint paint = this.f210137a;
                if (i6 < i12) {
                    paint.setAlpha((int) ((f3 - f2) * 255.0f));
                    RectF rectF2 = this.f210139c;
                    int i13 = this.f210145i;
                    canvas.drawRoundRect(rectF2, i13, i13, this.f210137a);
                } else {
                    paint.setAlpha(255);
                    float width2 = f6 + ((canvas.getWidth() - f6) * f2);
                    float f7 = this.f210145i;
                    int width3 = canvas.getWidth();
                    int i14 = this.f210145i;
                    float f8 = f7 + ((width3 - i14) * f2);
                    float height2 = i14 + ((canvas.getHeight() - this.f210145i) * f2);
                    float height3 = (canvas.getHeight() - height2) / 2.0f;
                    this.f210139c.set(width2 - f8, height3, width2, height3 + height2);
                    canvas.drawRoundRect(this.f210139c, canvas.getHeight() / 2.0f, canvas.getHeight() / 2.0f, this.f210137a);
                    float f9 = height2 / 3.0f;
                    if (f9 > this.f210148l && this.f210149m != null) {
                        this.f210138b.setTextSize(f9);
                        this.f210138b.getFontMetrics(this.f210150n);
                        float height4 = canvas.getHeight() / 2;
                        Paint.FontMetrics fontMetrics = this.f210150n;
                        float f10 = fontMetrics.descent;
                        canvas.drawText(this.f210149m, width2 - (f8 / 2.0f), (height4 + ((f10 - fontMetrics.ascent) / 2.0f)) - f10, this.f210138b);
                    }
                    f = f8;
                    f4 = height3;
                }
            }
            width += f + this.f210146j;
            i6++;
            f3 = 1.0f;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
        this.f210143g = i;
        this.f210144h = f;
        kkl0.m150146a0(this);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f210151o.m150481l(motionEvent);
        return true;
    }

    public void setAction(x20 x20Var) {
        this.f210147k = x20Var;
    }

    public void setViewPager(ViewPager viewPager) {
        cf60 cf60Var = this.f210140d;
        if (cf60Var != null) {
            cf60Var.unregisterDataSetObserver(this.f210141e);
        }
        cf60 adapter = viewPager.getAdapter();
        this.f210140d = adapter;
        if (adapter == null) {
            azk0.m101074a("setViewPager must be called after ViewPager#setAdapter");
            return;
        }
        this.f210142f = adapter.getCount();
        if (this.f210141e == null) {
            this.f210141e = new C22669b();
        }
        this.f210140d.registerDataSetObserver(this.f210141e);
        viewPager.m4187d(this);
    }

    public VPageIndicator_Action(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m224384g(context, attributeSet, 0);
    }

    public VPageIndicator_Action(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224384g(context, attributeSet, i);
    }
}

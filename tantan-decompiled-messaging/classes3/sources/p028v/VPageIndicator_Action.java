package p028v;

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
import l.b9c0;
import l.gbl0;
import l.n8c0;
import l.t100;
import l.w660;
import p003l.d30;
import p003l.eqh0;
import p003l.rjj;
import p003l.upk0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VPageIndicator_Action extends View implements ViewPager.j {

    /* JADX INFO: renamed from: a */
    public Paint f12840a;

    /* JADX INFO: renamed from: b */
    public TextPaint f12841b;

    /* JADX INFO: renamed from: c */
    public RectF f12842c;

    /* JADX INFO: renamed from: d */
    public w660 f12843d;

    /* JADX INFO: renamed from: e */
    public DataSetObserver f12844e;

    /* JADX INFO: renamed from: f */
    public int f12845f;

    /* JADX INFO: renamed from: g */
    public int f12846g;

    /* JADX INFO: renamed from: h */
    public float f12847h;

    /* JADX INFO: renamed from: i */
    public int f12848i;

    /* JADX INFO: renamed from: j */
    public int f12849j;

    /* JADX INFO: renamed from: k */
    public d30 f12850k;

    /* JADX INFO: renamed from: l */
    public int f12851l;

    /* JADX INFO: renamed from: m */
    public String f12852m;

    /* JADX INFO: renamed from: n */
    public Paint.FontMetrics f12853n;

    /* JADX INFO: renamed from: o */
    public rjj f12854o;

    /* JADX INFO: renamed from: v.VPageIndicator_Action$a */
    public class C1346a extends rjj.C0510d {
        public C1346a() {
        }

        @Override // p003l.rjj.C0510d, p003l.rjj.InterfaceC0509c
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (VPageIndicator_Action.this.f12846g != VPageIndicator_Action.this.f12845f - 1 || VPageIndicator_Action.this.f12847h != 0.0f || VPageIndicator_Action.this.f12850k == null) {
                return false;
            }
            VPageIndicator_Action.this.f12850k.call();
            return true;
        }
    }

    /* JADX INFO: renamed from: v.VPageIndicator_Action$b */
    public class C1347b extends DataSetObserver {
        public C1347b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VPageIndicator_Action vPageIndicator_Action = VPageIndicator_Action.this;
            vPageIndicator_Action.f12845f = vPageIndicator_Action.f12843d.getCount();
            gbl0.a0(VPageIndicator_Action.this);
        }
    }

    public VPageIndicator_Action(Context context) {
        super(context);
        m11619g(context, null, 0);
    }

    /* JADX INFO: renamed from: g */
    private void m11619g(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.b4, i, n8c0.r);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.c4, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.g4, RoundedDrawable.DEFAULT_BORDER_COLOR);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.d4, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.e4, 0);
        String string = typedArrayObtainStyledAttributes.getString(b9c0.f4);
        typedArrayObtainStyledAttributes.recycle();
        this.f12842c = new RectF();
        Paint paint = new Paint(1);
        this.f12840a = paint;
        paint.setColor(color);
        TextPaint textPaint = new TextPaint(1);
        this.f12841b = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f12841b.setColor(color2);
        this.f12841b.setFakeBoldText(true);
        this.f12841b.setTypeface(eqh0.m3924c(3));
        this.f12853n = new Paint.FontMetrics();
        this.f12848i = dimensionPixelSize;
        this.f12849j = dimensionPixelOffset;
        this.f12851l = t100.d(4.0f);
        this.f12852m = string;
        this.f12854o = new rjj(context, new C1346a());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2 = this.f12847h;
        float f3 = 1.0f;
        if (f2 != 0.0f || (i2 = this.f12846g) <= 0) {
            i = this.f12846g;
        } else {
            i = i2 - 1;
            f2 = 1.0f;
        }
        int i3 = this.f12845f;
        int i4 = ((i3 - 1) * this.f12849j) + ((i3 + 2) * this.f12848i);
        int height = canvas.getHeight();
        int i5 = this.f12848i;
        float f4 = (height - i5) / 2.0f;
        float f5 = i5 + f4;
        float width = (canvas.getWidth() - i4) / 2.0f;
        int i6 = 0;
        while (i6 < this.f12845f) {
            if (i6 == i) {
                int i7 = this.f12848i;
                f = i7 + (i7 * 2 * (f3 - f2));
            } else {
                int i8 = i + 1;
                int i9 = this.f12848i;
                f = i6 == i8 ? (i9 * 2 * f2) + i9 : i9;
            }
            float f6 = width + f;
            this.f12842c.set(width, f4, f6, f5);
            int i10 = this.f12845f;
            if (i < i10 - 2) {
                this.f12840a.setAlpha(255);
                RectF rectF = this.f12842c;
                int i11 = this.f12848i;
                canvas.drawRoundRect(rectF, i11, i11, this.f12840a);
            } else {
                int i12 = i10 - 1;
                Paint paint = this.f12840a;
                if (i6 < i12) {
                    paint.setAlpha((int) ((f3 - f2) * 255.0f));
                    RectF rectF2 = this.f12842c;
                    int i13 = this.f12848i;
                    canvas.drawRoundRect(rectF2, i13, i13, this.f12840a);
                } else {
                    paint.setAlpha(255);
                    float width2 = f6 + ((canvas.getWidth() - f6) * f2);
                    float f7 = this.f12848i;
                    int width3 = canvas.getWidth();
                    int i14 = this.f12848i;
                    float f8 = f7 + ((width3 - i14) * f2);
                    float height2 = i14 + ((canvas.getHeight() - this.f12848i) * f2);
                    float height3 = (canvas.getHeight() - height2) / 2.0f;
                    this.f12842c.set(width2 - f8, height3, width2, height3 + height2);
                    canvas.drawRoundRect(this.f12842c, canvas.getHeight() / 2.0f, canvas.getHeight() / 2.0f, this.f12840a);
                    float f9 = height2 / 3.0f;
                    if (f9 > this.f12851l && this.f12852m != null) {
                        this.f12841b.setTextSize(f9);
                        this.f12841b.getFontMetrics(this.f12853n);
                        float height4 = canvas.getHeight() / 2;
                        Paint.FontMetrics fontMetrics = this.f12853n;
                        float f10 = fontMetrics.descent;
                        canvas.drawText(this.f12852m, width2 - (f8 / 2.0f), (height4 + ((f10 - fontMetrics.ascent) / 2.0f)) - f10, this.f12841b);
                    }
                    f = f8;
                    f4 = height3;
                }
            }
            width += f + this.f12849j;
            i6++;
            f3 = 1.0f;
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.f12846g = i;
        this.f12847h = f;
        gbl0.a0(this);
    }

    public void onPageSelected(int i) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f12854o.m7286l(motionEvent);
        return true;
    }

    public void setAction(d30 d30Var) {
        this.f12850k = d30Var;
    }

    public void setViewPager(ViewPager viewPager) {
        w660 w660Var = this.f12843d;
        if (w660Var != null) {
            w660Var.unregisterDataSetObserver(this.f12844e);
        }
        w660 adapter = viewPager.getAdapter();
        this.f12843d = adapter;
        if (adapter == null) {
            upk0.m8197a("setViewPager must be called after ViewPager#setAdapter");
            return;
        }
        this.f12845f = adapter.getCount();
        if (this.f12844e == null) {
            this.f12844e = new C1347b();
        }
        this.f12843d.registerDataSetObserver(this.f12844e);
        viewPager.d(this);
    }

    public VPageIndicator_Action(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m11619g(context, attributeSet, 0);
    }

    public VPageIndicator_Action(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11619g(context, attributeSet, i);
    }
}

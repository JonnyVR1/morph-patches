package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.b9c0;
import l.ffx;
import l.qkq0;
import l.t100;
import p003l.cse0;
import p003l.xed0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VPagerWormIndicator extends View implements ViewPager.j {

    /* JADX INFO: renamed from: m */
    public static final int f12880m = t100.d(4.0f);

    /* JADX INFO: renamed from: n */
    public static final int f12881n = t100.d(8.0f);

    /* JADX INFO: renamed from: o */
    public static final int f12882o = t100.d(8.0f);

    /* JADX INFO: renamed from: p */
    public static final int f12883p = t100.d(8.0f);

    /* JADX INFO: renamed from: q */
    public static final int f12884q = t100.d(16.0f);

    /* JADX INFO: renamed from: a */
    public int f12885a;

    /* JADX INFO: renamed from: b */
    public int f12886b;

    /* JADX INFO: renamed from: c */
    public float f12887c;

    /* JADX INFO: renamed from: d */
    public int f12888d;

    /* JADX INFO: renamed from: e */
    public int f12889e;

    /* JADX INFO: renamed from: f */
    public int f12890f;

    /* JADX INFO: renamed from: g */
    public int f12891g;

    /* JADX INFO: renamed from: h */
    public int f12892h;

    /* JADX INFO: renamed from: i */
    public int f12893i;

    /* JADX INFO: renamed from: j */
    public int f12894j;

    /* JADX INFO: renamed from: k */
    public cse0 f12895k;

    /* JADX INFO: renamed from: l */
    public List<cse0> f12896l;

    public VPagerWormIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12885a = 0;
        this.f12886b = 0;
        this.f12896l = new ArrayList(3);
        m11629d(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    private void m11629d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.h4);
        setIndicatorColor(typedArrayObtainStyledAttributes.getColor(b9c0.i4, -2133798704));
        setSelectedIndicatorColor(typedArrayObtainStyledAttributes.getColor(b9c0.n4, -3092272));
        setIndicatorMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.k4, f12881n));
        setIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.m4, f12882o));
        setSelectedIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.o4, f12884q));
        setIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.j4, f12883p));
        setIndicatorRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.l4, f12880m));
        typedArrayObtainStyledAttributes.recycle();
    }

    private int getIndicatorNeedWidth() {
        return ((this.f12896l.size() - 1) * this.f12890f) + ((this.f12896l.size() - 1) * this.f12891g) + this.f12892h;
    }

    /* JADX INFO: renamed from: a */
    public final void m11630a() {
        this.f12895k = null;
        if (this.f12896l.isEmpty()) {
            return;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new xed0(this.f12894j));
        this.f12895k = new cse0(shapeDrawable);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f12889e);
        paint.setAntiAlias(true);
        this.f12895k.m3421e(paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m11631b(int i) {
        this.f12896l.clear();
        for (int i2 = 0; i2 < i; i2++) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new xed0(this.f12894j));
            cse0 cse0Var = new cse0(shapeDrawable);
            Paint paint = shapeDrawable.getPaint();
            paint.setColor(this.f12888d);
            paint.setAntiAlias(true);
            cse0Var.m3421e(paint);
            this.f12896l.add(cse0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11632c(Canvas canvas, cse0 cse0Var) {
        canvas.save();
        canvas.translate(cse0Var.m3418b(), cse0Var.m3419c());
        cse0Var.m3417a().draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public final void m11633e(int i, int i2) {
        int indicatorNeedWidth = (i - getIndicatorNeedWidth()) / 2;
        int i3 = (i2 - this.f12893i) / 2;
        int i4 = 0;
        while (i4 < this.f12896l.size()) {
            if (i4 > 0) {
                indicatorNeedWidth += this.f12890f;
            }
            cse0 cse0Var = this.f12896l.get(i4);
            cse0Var.m3420d(this.f12891g, this.f12893i);
            cse0Var.m3422f(indicatorNeedWidth);
            cse0Var.m3423g(i3);
            indicatorNeedWidth += this.f12885a == i4 ? this.f12892h : this.f12891g;
            i4++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11634f(int i, float f) {
        if (this.f12895k == null || this.f12896l.isEmpty()) {
            return;
        }
        cse0 cse0Var = this.f12896l.get(i);
        this.f12895k.m3420d(this.f12892h, this.f12893i);
        this.f12895k.m3422f(cse0Var.m3418b() + ((this.f12890f + this.f12891g) * f));
        this.f12895k.m3423g(cse0Var.m3419c());
    }

    /* JADX INFO: renamed from: g */
    public final void m11635g(int i, float f) {
        this.f12885a = i;
        this.f12887c = f;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        Iterator<cse0> it = this.f12896l.iterator();
        while (it.hasNext()) {
            m11632c(canvas, it.next());
        }
        if (NullChecker.a(this.f12895k)) {
            m11632c(canvas, this.f12895k);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m11633e(getWidth(), getHeight());
        m11634f(this.f12885a, this.f12887c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iD = ffx.d(i);
        int iC = ffx.c(i);
        int iD2 = ffx.d(i2);
        int iC2 = ffx.c(i2);
        if (iC != 1073741824) {
            iD = Math.min(iD, getIndicatorNeedWidth() + getPaddingLeft() + getPaddingRight());
        }
        if (iC2 != 1073741824) {
            iD2 = Math.min(iD2, this.f12893i + getPaddingTop() + getPaddingBottom());
        }
        setMeasuredDimension(iD, iD2);
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            m11635g(this.f12886b, 0.0f);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        m11635g(i, f);
    }

    public void onPageSelected(int i) {
        this.f12886b = i;
    }

    public void setCurrentItem(int i) {
        this.f12886b = i;
    }

    public void setIndicatorColor(@ColorInt int i) {
        this.f12888d = i;
    }

    public void setIndicatorHeight(int i) {
        this.f12893i = i;
    }

    public void setIndicatorMargin(int i) {
        this.f12890f = i;
    }

    public void setIndicatorRadius(int i) {
        this.f12894j = i;
    }

    public void setIndicatorWidth(int i) {
        this.f12891g = i;
    }

    public void setSelectedIndicatorColor(@ColorInt int i) {
        this.f12889e = i;
    }

    public void setSelectedIndicatorWidth(int i) {
        this.f12892h = i;
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager.getAdapter() == null) {
            qkq0.a("ViewPager must has set Adapter first before bind pager with indicator");
            return;
        }
        viewPager.P(this);
        viewPager.d(this);
        m11631b(viewPager.getAdapter().getCount());
        m11630a();
        setCurrentItem(viewPager.getCurrentItem());
    }

    public VPagerWormIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VPagerWormIndicator(Context context) {
        this(context, null);
    }
}

package p147v;

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
import p149l.b9c0;
import p149l.cse0;
import p149l.ffx;
import p149l.qkq0;
import p149l.t100;
import p149l.xed0;

/* JADX INFO: loaded from: classes3.dex */
public class VPagerWormIndicator extends View implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: m */
    public static final int f209255m = t100.m186890d(4.0f);

    /* JADX INFO: renamed from: n */
    public static final int f209256n = t100.m186890d(8.0f);

    /* JADX INFO: renamed from: o */
    public static final int f209257o = t100.m186890d(8.0f);

    /* JADX INFO: renamed from: p */
    public static final int f209258p = t100.m186890d(8.0f);

    /* JADX INFO: renamed from: q */
    public static final int f209259q = t100.m186890d(16.0f);

    /* JADX INFO: renamed from: a */
    public int f209260a;

    /* JADX INFO: renamed from: b */
    public int f209261b;

    /* JADX INFO: renamed from: c */
    public float f209262c;

    /* JADX INFO: renamed from: d */
    public int f209263d;

    /* JADX INFO: renamed from: e */
    public int f209264e;

    /* JADX INFO: renamed from: f */
    public int f209265f;

    /* JADX INFO: renamed from: g */
    public int f209266g;

    /* JADX INFO: renamed from: h */
    public int f209267h;

    /* JADX INFO: renamed from: i */
    public int f209268i;

    /* JADX INFO: renamed from: j */
    public int f209269j;

    /* JADX INFO: renamed from: k */
    public cse0 f209270k;

    /* JADX INFO: renamed from: l */
    public List<cse0> f209271l;

    public VPagerWormIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209260a = 0;
        this.f209261b = 0;
        this.f209271l = new ArrayList(3);
        m223147d(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    private void m223147d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74439h4);
        setIndicatorColor(typedArrayObtainStyledAttributes.getColor(b9c0.f74446i4, -2133798704));
        setSelectedIndicatorColor(typedArrayObtainStyledAttributes.getColor(b9c0.f74481n4, -3092272));
        setIndicatorMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74460k4, f209256n));
        setIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74474m4, f209257o));
        setSelectedIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74488o4, f209259q));
        setIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74453j4, f209258p));
        setIndicatorRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74467l4, f209255m));
        typedArrayObtainStyledAttributes.recycle();
    }

    private int getIndicatorNeedWidth() {
        return ((this.f209271l.size() - 1) * this.f209265f) + ((this.f209271l.size() - 1) * this.f209266g) + this.f209267h;
    }

    /* JADX INFO: renamed from: a */
    public final void m223148a() {
        this.f209270k = null;
        if (this.f209271l.isEmpty()) {
            return;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new xed0(this.f209269j));
        this.f209270k = new cse0(shapeDrawable);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f209264e);
        paint.setAntiAlias(true);
        this.f209270k.m108502e(paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m223149b(int i) {
        this.f209271l.clear();
        for (int i2 = 0; i2 < i; i2++) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new xed0(this.f209269j));
            cse0 cse0Var = new cse0(shapeDrawable);
            Paint paint = shapeDrawable.getPaint();
            paint.setColor(this.f209263d);
            paint.setAntiAlias(true);
            cse0Var.m108502e(paint);
            this.f209271l.add(cse0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m223150c(Canvas canvas, cse0 cse0Var) {
        canvas.save();
        canvas.translate(cse0Var.m108499b(), cse0Var.m108500c());
        cse0Var.m108498a().draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public final void m223151e(int i, int i2) {
        int indicatorNeedWidth = (i - getIndicatorNeedWidth()) / 2;
        int i3 = (i2 - this.f209268i) / 2;
        int i4 = 0;
        while (i4 < this.f209271l.size()) {
            if (i4 > 0) {
                indicatorNeedWidth += this.f209265f;
            }
            cse0 cse0Var = this.f209271l.get(i4);
            cse0Var.m108501d(this.f209266g, this.f209268i);
            cse0Var.m108503f(indicatorNeedWidth);
            cse0Var.m108504g(i3);
            indicatorNeedWidth += this.f209260a == i4 ? this.f209267h : this.f209266g;
            i4++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m223152f(int i, float f) {
        if (this.f209270k == null || this.f209271l.isEmpty()) {
            return;
        }
        cse0 cse0Var = this.f209271l.get(i);
        this.f209270k.m108501d(this.f209267h, this.f209268i);
        this.f209270k.m108503f(cse0Var.m108499b() + ((this.f209265f + this.f209266g) * f));
        this.f209270k.m108504g(cse0Var.m108500c());
    }

    /* JADX INFO: renamed from: g */
    public final void m223153g(int i, float f) {
        this.f209260a = i;
        this.f209262c = f;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        Iterator<cse0> it = this.f209271l.iterator();
        while (it.hasNext()) {
            m223150c(canvas, it.next());
        }
        if (NullChecker.m81303a(this.f209270k)) {
            m223150c(canvas, this.f209270k);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m223151e(getWidth(), getHeight());
        m223152f(this.f209260a, this.f209262c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iM121201d = ffx.m121201d(i);
        int iM121200c = ffx.m121200c(i);
        int iM121201d2 = ffx.m121201d(i2);
        int iM121200c2 = ffx.m121200c(i2);
        if (iM121200c != 1073741824) {
            iM121201d = Math.min(iM121201d, getIndicatorNeedWidth() + getPaddingLeft() + getPaddingRight());
        }
        if (iM121200c2 != 1073741824) {
            iM121201d2 = Math.min(iM121201d2, this.f209268i + getPaddingTop() + getPaddingBottom());
        }
        setMeasuredDimension(iM121201d, iM121201d2);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            m223153g(this.f209261b, 0.0f);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
        m223153g(i, f);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        this.f209261b = i;
    }

    public void setCurrentItem(int i) {
        this.f209261b = i;
    }

    public void setIndicatorColor(@ColorInt int i) {
        this.f209263d = i;
    }

    public void setIndicatorHeight(int i) {
        this.f209268i = i;
    }

    public void setIndicatorMargin(int i) {
        this.f209265f = i;
    }

    public void setIndicatorRadius(int i) {
        this.f209269j = i;
    }

    public void setIndicatorWidth(int i) {
        this.f209266g = i;
    }

    public void setSelectedIndicatorColor(@ColorInt int i) {
        this.f209264e = i;
    }

    public void setSelectedIndicatorWidth(int i) {
        this.f209267h = i;
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager.getAdapter() == null) {
            qkq0.m175383a("ViewPager must has set Adapter first before bind pager with indicator");
            return;
        }
        viewPager.m4175P(this);
        viewPager.m4185d(this);
        m223149b(viewPager.getAdapter().getCount());
        m223148a();
        setCurrentItem(viewPager.getCurrentItem());
    }

    public VPagerWormIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VPagerWormIndicator(Context context) {
        this(context, null);
    }
}

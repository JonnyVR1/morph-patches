package p151v;

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
import p153l.dox;
import p153l.hhc0;
import p153l.j0f0;
import p153l.qa00;
import p153l.wtq0;
import p153l.zmd0;

/* JADX INFO: loaded from: classes3.dex */
public class VPagerWormIndicator extends View implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: m */
    public static final int f210177m = qa00.m175859d(4.0f);

    /* JADX INFO: renamed from: n */
    public static final int f210178n = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: o */
    public static final int f210179o = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: p */
    public static final int f210180p = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: q */
    public static final int f210181q = qa00.m175859d(16.0f);

    /* JADX INFO: renamed from: a */
    public int f210182a;

    /* JADX INFO: renamed from: b */
    public int f210183b;

    /* JADX INFO: renamed from: c */
    public float f210184c;

    /* JADX INFO: renamed from: d */
    public int f210185d;

    /* JADX INFO: renamed from: e */
    public int f210186e;

    /* JADX INFO: renamed from: f */
    public int f210187f;

    /* JADX INFO: renamed from: g */
    public int f210188g;

    /* JADX INFO: renamed from: h */
    public int f210189h;

    /* JADX INFO: renamed from: i */
    public int f210190i;

    /* JADX INFO: renamed from: j */
    public int f210191j;

    /* JADX INFO: renamed from: k */
    public j0f0 f210192k;

    /* JADX INFO: renamed from: l */
    public List<j0f0> f210193l;

    public VPagerWormIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210182a = 0;
        this.f210183b = 0;
        this.f210193l = new ArrayList(3);
        m224393d(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    private void m224393d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109748h4);
        setIndicatorColor(typedArrayObtainStyledAttributes.getColor(hhc0.f109755i4, -2133798704));
        setSelectedIndicatorColor(typedArrayObtainStyledAttributes.getColor(hhc0.f109790n4, -3092272));
        setIndicatorMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109769k4, f210178n));
        setIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109783m4, f210179o));
        setSelectedIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109797o4, f210181q));
        setIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109762j4, f210180p));
        setIndicatorRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109776l4, f210177m));
        typedArrayObtainStyledAttributes.recycle();
    }

    private int getIndicatorNeedWidth() {
        return ((this.f210193l.size() - 1) * this.f210187f) + ((this.f210193l.size() - 1) * this.f210188g) + this.f210189h;
    }

    /* JADX INFO: renamed from: a */
    public final void m224394a() {
        this.f210192k = null;
        if (this.f210193l.isEmpty()) {
            return;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new zmd0(this.f210191j));
        this.f210192k = new j0f0(shapeDrawable);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f210186e);
        paint.setAntiAlias(true);
        this.f210192k.m142974e(paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m224395b(int i) {
        this.f210193l.clear();
        for (int i2 = 0; i2 < i; i2++) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new zmd0(this.f210191j));
            j0f0 j0f0Var = new j0f0(shapeDrawable);
            Paint paint = shapeDrawable.getPaint();
            paint.setColor(this.f210185d);
            paint.setAntiAlias(true);
            j0f0Var.m142974e(paint);
            this.f210193l.add(j0f0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m224396c(Canvas canvas, j0f0 j0f0Var) {
        canvas.save();
        canvas.translate(j0f0Var.m142971b(), j0f0Var.m142972c());
        j0f0Var.m142970a().draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public final void m224397e(int i, int i2) {
        int indicatorNeedWidth = (i - getIndicatorNeedWidth()) / 2;
        int i3 = (i2 - this.f210190i) / 2;
        int i4 = 0;
        while (i4 < this.f210193l.size()) {
            if (i4 > 0) {
                indicatorNeedWidth += this.f210187f;
            }
            j0f0 j0f0Var = this.f210193l.get(i4);
            j0f0Var.m142973d(this.f210188g, this.f210190i);
            j0f0Var.m142975f(indicatorNeedWidth);
            j0f0Var.m142976g(i3);
            indicatorNeedWidth += this.f210182a == i4 ? this.f210189h : this.f210188g;
            i4++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m224398f(int i, float f) {
        if (this.f210192k == null || this.f210193l.isEmpty()) {
            return;
        }
        j0f0 j0f0Var = this.f210193l.get(i);
        this.f210192k.m142973d(this.f210189h, this.f210190i);
        this.f210192k.m142975f(j0f0Var.m142971b() + ((this.f210187f + this.f210188g) * f));
        this.f210192k.m142976g(j0f0Var.m142972c());
    }

    /* JADX INFO: renamed from: g */
    public final void m224399g(int i, float f) {
        this.f210182a = i;
        this.f210184c = f;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        Iterator<j0f0> it = this.f210193l.iterator();
        while (it.hasNext()) {
            m224396c(canvas, it.next());
        }
        if (NullChecker.m82486a(this.f210192k)) {
            m224396c(canvas, this.f210192k);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m224397e(getWidth(), getHeight());
        m224398f(this.f210182a, this.f210184c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iM117366d = dox.m117366d(i);
        int iM117365c = dox.m117365c(i);
        int iM117366d2 = dox.m117366d(i2);
        int iM117365c2 = dox.m117365c(i2);
        if (iM117365c != 1073741824) {
            iM117366d = Math.min(iM117366d, getIndicatorNeedWidth() + getPaddingLeft() + getPaddingRight());
        }
        if (iM117365c2 != 1073741824) {
            iM117366d2 = Math.min(iM117366d2, this.f210190i + getPaddingTop() + getPaddingBottom());
        }
        setMeasuredDimension(iM117366d, iM117366d2);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            m224399g(this.f210183b, 0.0f);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
        m224399g(i, f);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        this.f210183b = i;
    }

    public void setCurrentItem(int i) {
        this.f210183b = i;
    }

    public void setIndicatorColor(@ColorInt int i) {
        this.f210185d = i;
    }

    public void setIndicatorHeight(int i) {
        this.f210190i = i;
    }

    public void setIndicatorMargin(int i) {
        this.f210187f = i;
    }

    public void setIndicatorRadius(int i) {
        this.f210191j = i;
    }

    public void setIndicatorWidth(int i) {
        this.f210188g = i;
    }

    public void setSelectedIndicatorColor(@ColorInt int i) {
        this.f210186e = i;
    }

    public void setSelectedIndicatorWidth(int i) {
        this.f210189h = i;
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager.getAdapter() == null) {
            wtq0.m207906a("ViewPager must has set Adapter first before bind pager with indicator");
            return;
        }
        viewPager.m4177P(this);
        viewPager.m4187d(this);
        m224395b(viewPager.getAdapter().getCount());
        m224394a();
        setCurrentItem(viewPager.getCurrentItem());
    }

    public VPagerWormIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VPagerWormIndicator(Context context) {
        this(context, null);
    }
}

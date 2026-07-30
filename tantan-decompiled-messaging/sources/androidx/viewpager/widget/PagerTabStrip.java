package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.e16;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: A */
    public boolean f3193A;

    /* JADX INFO: renamed from: B */
    public int f3194B;

    /* JADX INFO: renamed from: C */
    public boolean f3195C;

    /* JADX INFO: renamed from: D */
    public float f3196D;

    /* JADX INFO: renamed from: E */
    public float f3197E;

    /* JADX INFO: renamed from: F */
    public int f3198F;

    /* JADX INFO: renamed from: q */
    public int f3199q;

    /* JADX INFO: renamed from: r */
    public int f3200r;

    /* JADX INFO: renamed from: s */
    public int f3201s;

    /* JADX INFO: renamed from: t */
    public int f3202t;

    /* JADX INFO: renamed from: u */
    public int f3203u;

    /* JADX INFO: renamed from: v */
    public int f3204v;

    /* JADX INFO: renamed from: w */
    public final Paint f3205w;

    /* JADX INFO: renamed from: x */
    public final Rect f3206x;

    /* JADX INFO: renamed from: y */
    public int f3207y;

    /* JADX INFO: renamed from: z */
    public boolean f3208z;

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    public class ViewOnClickListenerC0702a implements View.OnClickListener {
        public ViewOnClickListenerC0702a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f3213a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    public class ViewOnClickListenerC0703b implements View.OnClickListener {
        public ViewOnClickListenerC0703b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f3213a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f3205w = paint;
        this.f3206x = new Rect();
        this.f3207y = 255;
        this.f3208z = false;
        this.f3193A = false;
        int i = this.f3226n;
        this.f3199q = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3200r = (int) ((3.0f * f) + 0.5f);
        this.f3201s = (int) ((6.0f * f) + 0.5f);
        this.f3202t = (int) (64.0f * f);
        this.f3204v = (int) ((16.0f * f) + 0.5f);
        this.f3194B = (int) ((1.0f * f) + 0.5f);
        this.f3203u = (int) ((f * 32.0f) + 0.5f);
        this.f3198F = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f3214b.setFocusable(true);
        this.f3214b.setOnClickListener(new ViewOnClickListenerC0702a());
        this.f3216d.setFocusable(true);
        this.f3216d.setOnClickListener(new ViewOnClickListenerC0703b());
        if (getBackground() == null) {
            this.f3208z = true;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* JADX INFO: renamed from: d */
    public void mo4142d(int i, float f, boolean z) {
        Rect rect = this.f3206x;
        int height = getHeight();
        int left = this.f3215c.getLeft() - this.f3204v;
        int right = this.f3215c.getRight() + this.f3204v;
        int i2 = height - this.f3200r;
        rect.set(left, i2, right, height);
        super.mo4142d(i, f, z);
        this.f3207y = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f3215c.getLeft() - this.f3204v, i2, this.f3215c.getRight() + this.f3204v, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f3208z;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f3203u);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.f3199q;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f3215c.getLeft() - this.f3204v;
        int right = this.f3215c.getRight() + this.f3204v;
        int i = height - this.f3200r;
        this.f3205w.setColor((this.f3207y << 24) | (this.f3199q & 16777215));
        float f = height;
        canvas.drawRect(left, i, right, f, this.f3205w);
        if (this.f3208z) {
            this.f3205w.setColor((this.f3199q & 16777215) | RoundedDrawable.DEFAULT_BORDER_COLOR);
            canvas.drawRect(getPaddingLeft(), height - this.f3194B, getWidth() - getPaddingRight(), f, this.f3205w);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f3195C) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f3196D = x;
            this.f3197E = y;
            this.f3195C = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f3196D) > this.f3198F || Math.abs(y - this.f3197E) > this.f3198F)) {
                this.f3195C = true;
            }
        } else if (x < this.f3215c.getLeft() - this.f3204v) {
            ViewPager viewPager = this.f3213a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > this.f3215c.getRight() + this.f3204v) {
            ViewPager viewPager2 = this.f3213a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        super.setBackgroundColor(i);
        if (this.f3193A) {
            return;
        }
        this.f3208z = (i & RoundedDrawable.DEFAULT_BORDER_COLOR) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3193A) {
            return;
        }
        this.f3208z = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (this.f3193A) {
            return;
        }
        this.f3208z = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.f3208z = z;
        this.f3193A = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f3201s;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@ColorInt int i) {
        this.f3199q = i;
        this.f3205w.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i) {
        setTabIndicatorColor(e16.m114375c(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.f3202t;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }
}

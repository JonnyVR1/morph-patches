package p028v;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import l.yd5;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VSlidingTabStrip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final int f12958a;

    /* JADX INFO: renamed from: b */
    public final Paint f12959b;

    /* JADX INFO: renamed from: c */
    public int f12960c;

    /* JADX INFO: renamed from: d */
    public final Paint f12961d;

    /* JADX INFO: renamed from: e */
    public final int f12962e;

    /* JADX INFO: renamed from: f */
    public final Paint f12963f;

    /* JADX INFO: renamed from: g */
    public final float f12964g;

    /* JADX INFO: renamed from: h */
    public int f12965h;

    /* JADX INFO: renamed from: i */
    public float f12966i;

    /* JADX INFO: renamed from: j */
    public VSlidingTabs.InterfaceC1366c f12967j;

    /* JADX INFO: renamed from: k */
    public final C1363a f12968k;

    /* JADX INFO: renamed from: v.VSlidingTabStrip$a */
    public static class C1363a implements VSlidingTabs.InterfaceC1366c {

        /* JADX INFO: renamed from: a */
        public int[] f12969a;

        /* JADX INFO: renamed from: b */
        public int[] f12970b;

        @Override // p028v.VSlidingTabs.InterfaceC1366c
        /* JADX INFO: renamed from: a */
        public final int mo11693a(int i) {
            int[] iArr = this.f12969a;
            return iArr[i % iArr.length];
        }

        @Override // p028v.VSlidingTabs.InterfaceC1366c
        /* JADX INFO: renamed from: b */
        public final int mo11694b(int i) {
            int[] iArr = this.f12970b;
            return iArr[i % iArr.length];
        }

        /* JADX INFO: renamed from: c */
        public void m11695c(int... iArr) {
            this.f12970b = iArr;
        }

        /* JADX INFO: renamed from: d */
        public void m11696d(int... iArr) {
            this.f12969a = iArr;
        }

        public C1363a() {
        }
    }

    public VSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        float f = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
        int i = typedValue.data;
        int iM11691b = m11691b(i, (byte) 38);
        this.f12962e = iM11691b;
        C1363a c1363a = new C1363a();
        this.f12968k = c1363a;
        c1363a.m11696d(-3592417);
        c1363a.m11695c(m11691b(i, HttpTokens.SPACE));
        this.f12958a = (int) (0.0f * f);
        Paint paint = new Paint();
        this.f12959b = paint;
        paint.setColor(iM11691b);
        this.f12960c = (int) (2.0f * f);
        this.f12961d = new Paint();
        this.f12964g = 0.5f;
        Paint paint2 = new Paint();
        this.f12963f = paint2;
        paint2.setStrokeWidth((int) (f * 1.0f));
    }

    /* JADX INFO: renamed from: b */
    public static int m11691b(int i, byte b) {
        return Color.argb((int) b, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: renamed from: a */
    public void m11692a(int i, float f) {
        this.f12965h = i;
        this.f12966i = f;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        int height = getHeight();
        int childCount = getChildCount();
        float f = height;
        int iMin = (int) (Math.min(Math.max(0.0f, this.f12964g), 1.0f) * f);
        VSlidingTabs.InterfaceC1366c interfaceC1366c = this.f12967j;
        if (interfaceC1366c == null) {
            interfaceC1366c = this.f12968k;
        }
        VSlidingTabs.InterfaceC1366c interfaceC1366c2 = interfaceC1366c;
        if (childCount > 0) {
            View childAt = getChildAt(this.f12965h);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int iMo11693a = interfaceC1366c2.mo11693a(this.f12965h);
            if (this.f12966i > 0.0f && this.f12965h < getChildCount() - 1) {
                int iMo11693a2 = interfaceC1366c2.mo11693a(this.f12965h + 1);
                if (iMo11693a != iMo11693a2) {
                    iMo11693a = yd5.a(iMo11693a2, iMo11693a, this.f12966i);
                }
                View childAt2 = getChildAt(this.f12965h + 1);
                float left2 = this.f12966i * childAt2.getLeft();
                float f2 = this.f12966i;
                left = (int) (left2 + ((1.0f - f2) * left));
                right = (int) ((f2 * childAt2.getRight()) + ((1.0f - this.f12966i) * right));
            }
            this.f12961d.setColor(iMo11693a);
            canvas.drawRect(left, height - this.f12960c, right, f, this.f12961d);
        }
        canvas.drawRect(0.0f, height - this.f12958a, getWidth(), f, this.f12959b);
        int i = (height - iMin) / 2;
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt3 = getChildAt(i2);
            this.f12963f.setColor(interfaceC1366c2.mo11694b(i2));
            canvas.drawLine(childAt3.getRight(), i, childAt3.getRight(), i + iMin, this.f12963f);
        }
    }

    public void setCustomTabColorizer(VSlidingTabs.InterfaceC1366c interfaceC1366c) {
        this.f12967j = interfaceC1366c;
        invalidate();
    }

    public void setDividerColors(int... iArr) {
        this.f12967j = null;
        this.f12968k.m11695c(iArr);
        invalidate();
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f12967j = null;
        this.f12968k.m11696d(iArr);
        invalidate();
    }

    public void setSelectedIndicatorThickness(int i) {
        this.f12960c = i;
    }

    public VSlidingTabStrip(Context context) {
        this(context, null);
    }
}

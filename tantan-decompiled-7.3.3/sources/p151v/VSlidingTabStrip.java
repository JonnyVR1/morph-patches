package p151v;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import org.eclipse.jetty.http.HttpTokens;
import p153l.ye5;

/* JADX INFO: loaded from: classes3.dex */
public class VSlidingTabStrip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final int f210255a;

    /* JADX INFO: renamed from: b */
    public final Paint f210256b;

    /* JADX INFO: renamed from: c */
    public int f210257c;

    /* JADX INFO: renamed from: d */
    public final Paint f210258d;

    /* JADX INFO: renamed from: e */
    public final int f210259e;

    /* JADX INFO: renamed from: f */
    public final Paint f210260f;

    /* JADX INFO: renamed from: g */
    public final float f210261g;

    /* JADX INFO: renamed from: h */
    public int f210262h;

    /* JADX INFO: renamed from: i */
    public float f210263i;

    /* JADX INFO: renamed from: j */
    public VSlidingTabs.InterfaceC22688c f210264j;

    /* JADX INFO: renamed from: k */
    public final C22685a f210265k;

    /* JADX INFO: renamed from: v.VSlidingTabStrip$a */
    public static class C22685a implements VSlidingTabs.InterfaceC22688c {

        /* JADX INFO: renamed from: a */
        public int[] f210266a;

        /* JADX INFO: renamed from: b */
        public int[] f210267b;

        @Override // p151v.VSlidingTabs.InterfaceC22688c
        /* JADX INFO: renamed from: a */
        public final int mo224453a(int i) {
            int[] iArr = this.f210266a;
            return iArr[i % iArr.length];
        }

        @Override // p151v.VSlidingTabs.InterfaceC22688c
        /* JADX INFO: renamed from: b */
        public final int mo224454b(int i) {
            int[] iArr = this.f210267b;
            return iArr[i % iArr.length];
        }

        /* JADX INFO: renamed from: c */
        public void m224455c(int... iArr) {
            this.f210267b = iArr;
        }

        /* JADX INFO: renamed from: d */
        public void m224456d(int... iArr) {
            this.f210266a = iArr;
        }

        public C22685a() {
        }
    }

    public VSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        float f = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
        int i = typedValue.data;
        int iM224451b = m224451b(i, (byte) 38);
        this.f210259e = iM224451b;
        C22685a c22685a = new C22685a();
        this.f210265k = c22685a;
        c22685a.m224456d(-3592417);
        c22685a.m224455c(m224451b(i, HttpTokens.SPACE));
        this.f210255a = (int) (0.0f * f);
        Paint paint = new Paint();
        this.f210256b = paint;
        paint.setColor(iM224451b);
        this.f210257c = (int) (2.0f * f);
        this.f210258d = new Paint();
        this.f210261g = 0.5f;
        Paint paint2 = new Paint();
        this.f210260f = paint2;
        paint2.setStrokeWidth((int) (f * 1.0f));
    }

    /* JADX INFO: renamed from: b */
    public static int m224451b(int i, byte b) {
        return Color.argb((int) b, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: renamed from: a */
    public void m224452a(int i, float f) {
        this.f210262h = i;
        this.f210263i = f;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        int height = getHeight();
        int childCount = getChildCount();
        float f = height;
        int iMin = (int) (Math.min(Math.max(0.0f, this.f210261g), 1.0f) * f);
        VSlidingTabs.InterfaceC22688c interfaceC22688c = this.f210264j;
        if (interfaceC22688c == null) {
            interfaceC22688c = this.f210265k;
        }
        VSlidingTabs.InterfaceC22688c interfaceC22688c2 = interfaceC22688c;
        if (childCount > 0) {
            View childAt = getChildAt(this.f210262h);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int iMo224453a = interfaceC22688c2.mo224453a(this.f210262h);
            if (this.f210263i > 0.0f && this.f210262h < getChildCount() - 1) {
                int iMo224453a2 = interfaceC22688c2.mo224453a(this.f210262h + 1);
                if (iMo224453a != iMo224453a2) {
                    iMo224453a = ye5.m215395a(iMo224453a2, iMo224453a, this.f210263i);
                }
                View childAt2 = getChildAt(this.f210262h + 1);
                float left2 = this.f210263i * childAt2.getLeft();
                float f2 = this.f210263i;
                left = (int) (left2 + ((1.0f - f2) * left));
                right = (int) ((f2 * childAt2.getRight()) + ((1.0f - this.f210263i) * right));
            }
            this.f210258d.setColor(iMo224453a);
            canvas.drawRect(left, height - this.f210257c, right, f, this.f210258d);
        }
        canvas.drawRect(0.0f, height - this.f210255a, getWidth(), f, this.f210256b);
        int i = (height - iMin) / 2;
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt3 = getChildAt(i2);
            this.f210260f.setColor(interfaceC22688c2.mo224454b(i2));
            canvas.drawLine(childAt3.getRight(), i, childAt3.getRight(), i + iMin, this.f210260f);
        }
    }

    public void setCustomTabColorizer(VSlidingTabs.InterfaceC22688c interfaceC22688c) {
        this.f210264j = interfaceC22688c;
        invalidate();
    }

    public void setDividerColors(int... iArr) {
        this.f210264j = null;
        this.f210265k.m224455c(iArr);
        invalidate();
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f210264j = null;
        this.f210265k.m224456d(iArr);
        invalidate();
    }

    public void setSelectedIndicatorThickness(int i) {
        this.f210257c = i;
    }

    public VSlidingTabStrip(Context context) {
        this(context, null);
    }
}

package p147v;

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
import p149l.yd5;

/* JADX INFO: loaded from: classes3.dex */
public class VSlidingTabStrip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final int f209333a;

    /* JADX INFO: renamed from: b */
    public final Paint f209334b;

    /* JADX INFO: renamed from: c */
    public int f209335c;

    /* JADX INFO: renamed from: d */
    public final Paint f209336d;

    /* JADX INFO: renamed from: e */
    public final int f209337e;

    /* JADX INFO: renamed from: f */
    public final Paint f209338f;

    /* JADX INFO: renamed from: g */
    public final float f209339g;

    /* JADX INFO: renamed from: h */
    public int f209340h;

    /* JADX INFO: renamed from: i */
    public float f209341i;

    /* JADX INFO: renamed from: j */
    public VSlidingTabs.InterfaceC22573c f209342j;

    /* JADX INFO: renamed from: k */
    public final C22570a f209343k;

    /* JADX INFO: renamed from: v.VSlidingTabStrip$a */
    public static class C22570a implements VSlidingTabs.InterfaceC22573c {

        /* JADX INFO: renamed from: a */
        public int[] f209344a;

        /* JADX INFO: renamed from: b */
        public int[] f209345b;

        @Override // p147v.VSlidingTabs.InterfaceC22573c
        /* JADX INFO: renamed from: a */
        public final int mo223207a(int i) {
            int[] iArr = this.f209344a;
            return iArr[i % iArr.length];
        }

        @Override // p147v.VSlidingTabs.InterfaceC22573c
        /* JADX INFO: renamed from: b */
        public final int mo223208b(int i) {
            int[] iArr = this.f209345b;
            return iArr[i % iArr.length];
        }

        /* JADX INFO: renamed from: c */
        public void m223209c(int... iArr) {
            this.f209345b = iArr;
        }

        /* JADX INFO: renamed from: d */
        public void m223210d(int... iArr) {
            this.f209344a = iArr;
        }

        public C22570a() {
        }
    }

    public VSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        float f = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
        int i = typedValue.data;
        int iM223205b = m223205b(i, (byte) 38);
        this.f209337e = iM223205b;
        C22570a c22570a = new C22570a();
        this.f209343k = c22570a;
        c22570a.m223210d(-3592417);
        c22570a.m223209c(m223205b(i, HttpTokens.SPACE));
        this.f209333a = (int) (0.0f * f);
        Paint paint = new Paint();
        this.f209334b = paint;
        paint.setColor(iM223205b);
        this.f209335c = (int) (2.0f * f);
        this.f209336d = new Paint();
        this.f209339g = 0.5f;
        Paint paint2 = new Paint();
        this.f209338f = paint2;
        paint2.setStrokeWidth((int) (f * 1.0f));
    }

    /* JADX INFO: renamed from: b */
    public static int m223205b(int i, byte b) {
        return Color.argb((int) b, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: renamed from: a */
    public void m223206a(int i, float f) {
        this.f209340h = i;
        this.f209341i = f;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        int height = getHeight();
        int childCount = getChildCount();
        float f = height;
        int iMin = (int) (Math.min(Math.max(0.0f, this.f209339g), 1.0f) * f);
        VSlidingTabs.InterfaceC22573c interfaceC22573c = this.f209342j;
        if (interfaceC22573c == null) {
            interfaceC22573c = this.f209343k;
        }
        VSlidingTabs.InterfaceC22573c interfaceC22573c2 = interfaceC22573c;
        if (childCount > 0) {
            View childAt = getChildAt(this.f209340h);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int iMo223207a = interfaceC22573c2.mo223207a(this.f209340h);
            if (this.f209341i > 0.0f && this.f209340h < getChildCount() - 1) {
                int iMo223207a2 = interfaceC22573c2.mo223207a(this.f209340h + 1);
                if (iMo223207a != iMo223207a2) {
                    iMo223207a = yd5.m214214a(iMo223207a2, iMo223207a, this.f209341i);
                }
                View childAt2 = getChildAt(this.f209340h + 1);
                float left2 = this.f209341i * childAt2.getLeft();
                float f2 = this.f209341i;
                left = (int) (left2 + ((1.0f - f2) * left));
                right = (int) ((f2 * childAt2.getRight()) + ((1.0f - this.f209341i) * right));
            }
            this.f209336d.setColor(iMo223207a);
            canvas.drawRect(left, height - this.f209335c, right, f, this.f209336d);
        }
        canvas.drawRect(0.0f, height - this.f209333a, getWidth(), f, this.f209334b);
        int i = (height - iMin) / 2;
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt3 = getChildAt(i2);
            this.f209338f.setColor(interfaceC22573c2.mo223208b(i2));
            canvas.drawLine(childAt3.getRight(), i, childAt3.getRight(), i + iMin, this.f209338f);
        }
    }

    public void setCustomTabColorizer(VSlidingTabs.InterfaceC22573c interfaceC22573c) {
        this.f209342j = interfaceC22573c;
        invalidate();
    }

    public void setDividerColors(int... iArr) {
        this.f209342j = null;
        this.f209343k.m223209c(iArr);
        invalidate();
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f209342j = null;
        this.f209343k.m223210d(iArr);
        invalidate();
    }

    public void setSelectedIndicatorThickness(int i) {
        this.f209335c = i;
    }

    public VSlidingTabStrip(Context context) {
        this(context, null);
    }
}

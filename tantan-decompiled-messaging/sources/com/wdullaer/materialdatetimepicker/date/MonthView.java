package com.wdullaer.materialdatetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.wdullaer.materialdatetimepicker.R$string;
import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p149l.C17055gc;
import p149l.e16;
import p149l.f2c0;
import p149l.gbl0;
import p149l.k1c0;
import p149l.kfj0;
import p149l.q100;
import p149l.wnf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MonthView extends View {

    /* JADX INFO: renamed from: N */
    protected static int f61254N = 32;

    /* JADX INFO: renamed from: O */
    protected static int f61255O = 10;

    /* JADX INFO: renamed from: P */
    protected static int f61256P = 1;

    /* JADX INFO: renamed from: Q */
    protected static int f61257Q;

    /* JADX INFO: renamed from: R */
    protected static int f61258R;

    /* JADX INFO: renamed from: S */
    protected static int f61259S;

    /* JADX INFO: renamed from: T */
    protected static int f61260T;

    /* JADX INFO: renamed from: U */
    protected static int f61261U;

    /* JADX INFO: renamed from: A */
    protected final Calendar f61262A;

    /* JADX INFO: renamed from: B */
    private final C14664a f61263B;

    /* JADX INFO: renamed from: C */
    protected int f61264C;

    /* JADX INFO: renamed from: D */
    protected InterfaceC14665b f61265D;

    /* JADX INFO: renamed from: E */
    private boolean f61266E;

    /* JADX INFO: renamed from: F */
    protected int f61267F;

    /* JADX INFO: renamed from: G */
    protected int f61268G;

    /* JADX INFO: renamed from: H */
    protected int f61269H;

    /* JADX INFO: renamed from: I */
    protected int f61270I;

    /* JADX INFO: renamed from: J */
    protected int f61271J;

    /* JADX INFO: renamed from: K */
    protected int f61272K;

    /* JADX INFO: renamed from: L */
    protected int f61273L;

    /* JADX INFO: renamed from: M */
    private int f61274M;

    /* JADX INFO: renamed from: a */
    protected InterfaceC14668a f61275a;

    /* JADX INFO: renamed from: b */
    protected int f61276b;

    /* JADX INFO: renamed from: c */
    private String f61277c;

    /* JADX INFO: renamed from: d */
    private String f61278d;

    /* JADX INFO: renamed from: e */
    protected Paint f61279e;

    /* JADX INFO: renamed from: f */
    protected Paint f61280f;

    /* JADX INFO: renamed from: g */
    protected Paint f61281g;

    /* JADX INFO: renamed from: h */
    protected Paint f61282h;

    /* JADX INFO: renamed from: i */
    private final Formatter f61283i;

    /* JADX INFO: renamed from: j */
    private final StringBuilder f61284j;

    /* JADX INFO: renamed from: k */
    protected int f61285k;

    /* JADX INFO: renamed from: l */
    protected int f61286l;

    /* JADX INFO: renamed from: m */
    protected int f61287m;

    /* JADX INFO: renamed from: n */
    protected int f61288n;

    /* JADX INFO: renamed from: o */
    protected int f61289o;

    /* JADX INFO: renamed from: p */
    protected int f61290p;

    /* JADX INFO: renamed from: q */
    protected int f61291q;

    /* JADX INFO: renamed from: r */
    protected boolean f61292r;

    /* JADX INFO: renamed from: s */
    protected int f61293s;

    /* JADX INFO: renamed from: t */
    protected int f61294t;

    /* JADX INFO: renamed from: u */
    protected int f61295u;

    /* JADX INFO: renamed from: v */
    protected int f61296v;

    /* JADX INFO: renamed from: w */
    protected int f61297w;

    /* JADX INFO: renamed from: x */
    protected int f61298x;

    /* JADX INFO: renamed from: y */
    protected int f61299y;

    /* JADX INFO: renamed from: z */
    private final Calendar f61300z;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.MonthView$a */
    public class C14664a extends wnf {

        /* JADX INFO: renamed from: a */
        private final Rect f61301a;

        /* JADX INFO: renamed from: b */
        private final Calendar f61302b;

        public C14664a(View view) {
            super(view);
            this.f61301a = new Rect();
            this.f61302b = Calendar.getInstance();
        }

        /* JADX INFO: renamed from: a */
        public void m85137a(int i, Rect rect) {
            MonthView monthView = MonthView.this;
            int i2 = monthView.f61276b;
            int monthHeaderSize = monthView.getMonthHeaderSize();
            MonthView monthView2 = MonthView.this;
            int i3 = monthView2.f61291q;
            int i4 = (monthView2.f61290p - (monthView2.f61276b * 2)) / monthView2.f61296v;
            int iM85130g = (i - 1) + monthView2.m85130g();
            int i5 = MonthView.this.f61296v;
            int i6 = i2 + ((iM85130g % i5) * i4);
            int i7 = monthHeaderSize + ((iM85130g / i5) * i3);
            rect.set(i6, i7, i4 + i6, i3 + i7);
        }

        /* JADX INFO: renamed from: b */
        public CharSequence m85138b(int i) {
            Calendar calendar = this.f61302b;
            MonthView monthView = MonthView.this;
            calendar.set(monthView.f61289o, monthView.f61288n, i);
            CharSequence charSequence = DateFormat.format("dd MMMM yyyy", this.f61302b.getTimeInMillis());
            MonthView monthView2 = MonthView.this;
            return i == monthView2.f61293s ? monthView2.getContext().getString(R$string.f61164i, charSequence) : charSequence;
        }

        /* JADX INFO: renamed from: c */
        public void m85139c(int i) {
            getAccessibilityNodeProvider(MonthView.this).mo130365f(i, 64, null);
        }

        @Override // p149l.wnf
        public int getVirtualViewAt(float f, float f2) {
            int iM85131h = MonthView.this.m85131h(f, f2);
            if (iM85131h >= 0) {
                return iM85131h;
            }
            return Integer.MIN_VALUE;
        }

        @Override // p149l.wnf
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 1; i <= MonthView.this.f61297w; i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // p149l.wnf
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            MonthView.this.m85124m(i);
            return true;
        }

        @Override // p149l.wnf
        public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(m85138b(i));
        }

        @Override // p149l.wnf
        public void onPopulateNodeForVirtualView(int i, C17055gc c17055gc) {
            m85137a(i, this.f61301a);
            c17055gc.m125434s0(m85138b(i));
            c17055gc.m125417j0(this.f61301a);
            c17055gc.m125402a(16);
            if (i == MonthView.this.f61293s) {
                c17055gc.m125380L0(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.MonthView$b */
    public interface InterfaceC14665b {
        /* JADX INFO: renamed from: a */
        void mo85140a(MonthView monthView, AbstractC14669b.a aVar);
    }

    public MonthView(Context context, AttributeSet attributeSet, InterfaceC14668a interfaceC14668a) {
        super(context, attributeSet);
        this.f61276b = 0;
        this.f61285k = -1;
        this.f61286l = -1;
        this.f61287m = -1;
        this.f61291q = f61254N;
        this.f61292r = false;
        this.f61293s = -1;
        this.f61294t = -1;
        this.f61295u = 1;
        this.f61296v = 7;
        this.f61297w = 7;
        this.f61298x = -1;
        this.f61299y = -1;
        this.f61264C = 6;
        this.f61274M = 0;
        this.f61275a = interfaceC14668a;
        Resources resources = context.getResources();
        this.f61262A = Calendar.getInstance();
        this.f61300z = Calendar.getInstance();
        this.f61277c = resources.getString(R$string.f61160e);
        this.f61278d = resources.getString(R$string.f61171p);
        InterfaceC14668a interfaceC14668a2 = this.f61275a;
        if (interfaceC14668a2 == null || !interfaceC14668a2.mo85106z()) {
            this.f61267F = e16.m114375c(context, k1c0.f120571n);
            this.f61269H = e16.m114375c(context, k1c0.f120565h);
            this.f61272K = e16.m114375c(context, k1c0.f120567j);
            this.f61271J = e16.m114375c(context, k1c0.f120569l);
        } else {
            this.f61267F = e16.m114375c(context, k1c0.f120572o);
            this.f61269H = e16.m114375c(context, k1c0.f120566i);
            this.f61272K = e16.m114375c(context, k1c0.f120568k);
            this.f61271J = e16.m114375c(context, k1c0.f120570m);
        }
        this.f61268G = e16.m114375c(context, k1c0.f120578u);
        this.f61270I = this.f61275a.mo85104u();
        this.f61273L = e16.m114375c(context, k1c0.f120578u);
        StringBuilder sb = new StringBuilder(50);
        this.f61284j = sb;
        this.f61283i = new Formatter(sb, Locale.getDefault());
        f61257Q = resources.getDimensionPixelSize(f2c0.f94165c);
        f61258R = resources.getDimensionPixelSize(f2c0.f94168f);
        f61259S = resources.getDimensionPixelSize(f2c0.f94167e);
        f61260T = resources.getDimensionPixelOffset(f2c0.f94169g);
        f61261U = resources.getDimensionPixelSize(f2c0.f94164b);
        this.f61291q = (resources.getDimensionPixelOffset(f2c0.f94163a) - getMonthHeaderSize()) / 6;
        C14664a monthViewTouchHelper = getMonthViewTouchHelper();
        this.f61263B = monthViewTouchHelper;
        gbl0.m125201j0(this, monthViewTouchHelper);
        gbl0.m125221t0(this, 1);
        this.f61266E = true;
        m85133k();
    }

    /* JADX INFO: renamed from: b */
    private int m85122b() {
        int iM85130g = m85130g();
        int i = this.f61297w;
        int i2 = this.f61296v;
        return ((iM85130g + i) / i2) + ((iM85130g + i) % i2 > 0 ? 1 : 0);
    }

    @NonNull
    private String getMonthAndYearString() {
        Locale locale = Locale.getDefault();
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "MMMM yyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(bestDateTimePattern, locale);
        simpleDateFormat.applyLocalizedPattern(bestDateTimePattern);
        this.f61284j.setLength(0);
        return simpleDateFormat.format(this.f61300z.getTime());
    }

    /* JADX INFO: renamed from: j */
    private String m85123j(Calendar calendar) {
        return new SimpleDateFormat("EEEEE", Locale.getDefault()).format(calendar.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m85124m(int i) {
        if (this.f61275a.mo85096e0(this.f61289o, this.f61288n, i)) {
            return;
        }
        InterfaceC14665b interfaceC14665b = this.f61265D;
        if (interfaceC14665b != null) {
            interfaceC14665b.mo85140a(this, new AbstractC14669b.a(this.f61289o, this.f61288n, i));
        }
        this.f61263B.sendEventForVirtualView(i, 1);
    }

    /* JADX INFO: renamed from: p */
    private boolean m85125p(int i, Calendar calendar) {
        return this.f61289o == calendar.get(1) && this.f61288n == calendar.get(2) && i == calendar.get(5);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo85126c(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    /* JADX INFO: renamed from: d */
    public void m85127d(Canvas canvas) {
        int monthHeaderSize = getMonthHeaderSize() - (f61259S / 2);
        int i = (this.f61290p - (this.f61276b * 2)) / (this.f61296v * 2);
        int i2 = 0;
        while (true) {
            int i3 = this.f61296v;
            if (i2 >= i3) {
                return;
            }
            int i4 = (((i2 * 2) + 1) * i) + this.f61276b;
            this.f61262A.set(7, (this.f61295u + i2) % i3);
            canvas.drawText(m85123j(this.f61262A), i4, monthHeaderSize, this.f61282h);
            i2++;
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.f61263B.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public void m85128e(Canvas canvas) {
        int monthHeaderSize = (((this.f61291q + f61257Q) / 2) - f61256P) + getMonthHeaderSize();
        float f = (this.f61290p - (this.f61276b * 2)) / (this.f61296v * 2.0f);
        int i = monthHeaderSize;
        int iM85130g = m85130g();
        for (int i2 = 1; i2 <= this.f61297w; i2++) {
            int i3 = (int) ((((iM85130g * 2) + 1) * f) + this.f61276b);
            int i4 = this.f61291q;
            float f2 = i3;
            int i5 = i - (((f61257Q + i4) / 2) - f61256P);
            mo85126c(canvas, this.f61289o, this.f61288n, i2, i3, i, (int) (f2 - f), (int) (f2 + f), i5, i5 + i4);
            iM85130g++;
            if (iM85130g == this.f61296v) {
                i += this.f61291q;
                iM85130g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m85129f(Canvas canvas) {
        canvas.drawText(getMonthAndYearString(), (this.f61290p + (this.f61276b * 2)) / 2, (getMonthHeaderSize() - f61259S) / 2, this.f61280f);
    }

    /* JADX INFO: renamed from: g */
    public int m85130g() {
        int i = this.f61274M;
        int i2 = this.f61295u;
        if (i < i2) {
            i += this.f61296v;
        }
        return i - i2;
    }

    public AbstractC14669b.a getAccessibilityFocus() {
        int focusedVirtualView = this.f61263B.getFocusedVirtualView();
        if (focusedVirtualView >= 0) {
            return new AbstractC14669b.a(this.f61289o, this.f61288n, focusedVirtualView);
        }
        return null;
    }

    public int getMonth() {
        return this.f61288n;
    }

    public int getMonthHeaderSize() {
        return f61260T;
    }

    public C14664a getMonthViewTouchHelper() {
        return new C14664a(this);
    }

    public int getYear() {
        return this.f61289o;
    }

    /* JADX INFO: renamed from: h */
    public int m85131h(float f, float f2) {
        int iM85132i = m85132i(f, f2);
        if (iM85132i < 1 || iM85132i > this.f61297w) {
            return -1;
        }
        return iM85132i;
    }

    /* JADX INFO: renamed from: i */
    public int m85132i(float f, float f2) {
        int i = this.f61276b;
        float f3 = i;
        if (f < f3 || f > this.f61290p - i) {
            return -1;
        }
        return (((int) (((f - f3) * this.f61296v) / ((this.f61290p - i) - this.f61276b))) - m85130g()) + 1 + ((((int) (f2 - getMonthHeaderSize())) / this.f61291q) * this.f61296v);
    }

    /* JADX INFO: renamed from: k */
    public void m85133k() {
        Paint paint = new Paint();
        this.f61280f = paint;
        paint.setFakeBoldText(true);
        this.f61280f.setAntiAlias(true);
        this.f61280f.setTextSize(f61258R);
        this.f61280f.setTypeface(Typeface.create(this.f61278d, 1));
        this.f61280f.setColor(this.f61267F);
        Paint paint2 = this.f61280f;
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        Paint paint3 = this.f61280f;
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f61281g = paint4;
        paint4.setFakeBoldText(true);
        this.f61281g.setAntiAlias(true);
        this.f61281g.setColor(this.f61270I);
        this.f61281g.setTextAlign(align);
        this.f61281g.setStyle(style);
        this.f61281g.setAlpha(255);
        Paint paint5 = new Paint();
        this.f61282h = paint5;
        paint5.setAntiAlias(true);
        this.f61282h.setTextSize(f61259S);
        this.f61282h.setColor(this.f61269H);
        this.f61282h.setTypeface(kfj0.m145857a(q100.m172366a()));
        this.f61282h.setStyle(style);
        this.f61282h.setTextAlign(align);
        this.f61282h.setFakeBoldText(true);
        Paint paint6 = new Paint();
        this.f61279e = paint6;
        paint6.setAntiAlias(true);
        this.f61279e.setTextSize(f61257Q);
        this.f61279e.setStyle(style);
        this.f61279e.setTextAlign(align);
        this.f61279e.setFakeBoldText(false);
    }

    /* JADX INFO: renamed from: l */
    public boolean m85134l(int i, int i2, int i3) {
        Calendar[] calendarArrMo85102n3 = this.f61275a.mo85102n3();
        if (calendarArrMo85102n3 == null) {
            return false;
        }
        for (Calendar calendar : calendarArrMo85102n3) {
            if (i < calendar.get(1)) {
                break;
            }
            if (i <= calendar.get(1)) {
                if (i2 < calendar.get(2)) {
                    break;
                }
                if (i2 > calendar.get(2)) {
                    continue;
                } else {
                    if (i3 < calendar.get(5)) {
                        break;
                    }
                    if (i3 <= calendar.get(5)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m85135n(AbstractC14669b.a aVar) {
        int i;
        if (aVar.f61323b != this.f61289o || aVar.f61324c != this.f61288n || (i = aVar.f61325d) > this.f61297w) {
            return false;
        }
        this.f61263B.m85139c(i);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public void m85136o() {
        this.f61264C = 6;
        requestLayout();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m85129f(canvas);
        m85127d(canvas);
        m85128e(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.f61291q * this.f61264C) + getMonthHeaderSize() + 5);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f61290p = i;
        this.f61263B.invalidateRoot();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        int iM85131h;
        if (motionEvent.getAction() == 1 && (iM85131h = m85131h(motionEvent.getX(), motionEvent.getY())) >= 0) {
            m85124m(iM85131h);
        }
        return true;
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (this.f61266E) {
            return;
        }
        super.setAccessibilityDelegate(accessibilityDelegate);
    }

    public void setDatePickerController(InterfaceC14668a interfaceC14668a) {
        this.f61275a = interfaceC14668a;
    }

    public void setMonthParams(HashMap<String, Integer> map) {
        if (!map.containsKey(MerchandiseTimeUnit.month) && !map.containsKey(MerchandiseTimeUnit.year)) {
            throw new InvalidParameterException("You must specify month and year for this view");
        }
        setTag(map);
        if (map.containsKey("height")) {
            int iIntValue = map.get("height").intValue();
            this.f61291q = iIntValue;
            int i = f61255O;
            if (iIntValue < i) {
                this.f61291q = i;
            }
        }
        if (map.containsKey("selected_day")) {
            this.f61293s = map.get("selected_day").intValue();
        }
        this.f61288n = map.get(MerchandiseTimeUnit.month).intValue();
        this.f61289o = map.get(MerchandiseTimeUnit.year).intValue();
        Calendar calendar = Calendar.getInstance();
        int i2 = 0;
        this.f61292r = false;
        this.f61294t = -1;
        this.f61300z.set(2, this.f61288n);
        this.f61300z.set(1, this.f61289o);
        this.f61300z.set(5, 1);
        this.f61274M = this.f61300z.get(7);
        if (map.containsKey("week_start")) {
            this.f61295u = map.get("week_start").intValue();
        } else {
            this.f61295u = this.f61300z.getFirstDayOfWeek();
        }
        this.f61297w = this.f61300z.getActualMaximum(5);
        while (i2 < this.f61297w) {
            i2++;
            if (m85125p(i2, calendar)) {
                this.f61292r = true;
                this.f61294t = i2;
            }
        }
        this.f61264C = m85122b();
        this.f61263B.invalidateRoot();
    }

    public void setOnDayClickListener(InterfaceC14665b interfaceC14665b) {
        this.f61265D = interfaceC14665b;
    }

    public void setSelectedDay(int i) {
        this.f61293s = i;
    }

    public MonthView(Context context) {
        this(context, null, null);
    }
}

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
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.wdullaer.materialdatetimepicker.R$string;
import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p153l.C15967bc;
import p153l.dpf;
import p153l.j26;
import p153l.kkl0;
import p153l.mac0;
import p153l.na00;
import p153l.ooj0;
import p153l.q9c0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MonthView extends View {

    /* JADX INFO: renamed from: N */
    protected static int f62101N = 32;

    /* JADX INFO: renamed from: O */
    protected static int f62102O = 10;

    /* JADX INFO: renamed from: P */
    protected static int f62103P = 1;

    /* JADX INFO: renamed from: Q */
    protected static int f62104Q;

    /* JADX INFO: renamed from: R */
    protected static int f62105R;

    /* JADX INFO: renamed from: S */
    protected static int f62106S;

    /* JADX INFO: renamed from: T */
    protected static int f62107T;

    /* JADX INFO: renamed from: U */
    protected static int f62108U;

    /* JADX INFO: renamed from: A */
    protected final Calendar f62109A;

    /* JADX INFO: renamed from: B */
    private final C14812a f62110B;

    /* JADX INFO: renamed from: C */
    protected int f62111C;

    /* JADX INFO: renamed from: D */
    protected InterfaceC14813b f62112D;

    /* JADX INFO: renamed from: E */
    private boolean f62113E;

    /* JADX INFO: renamed from: F */
    protected int f62114F;

    /* JADX INFO: renamed from: G */
    protected int f62115G;

    /* JADX INFO: renamed from: H */
    protected int f62116H;

    /* JADX INFO: renamed from: I */
    protected int f62117I;

    /* JADX INFO: renamed from: J */
    protected int f62118J;

    /* JADX INFO: renamed from: K */
    protected int f62119K;

    /* JADX INFO: renamed from: L */
    protected int f62120L;

    /* JADX INFO: renamed from: M */
    private int f62121M;

    /* JADX INFO: renamed from: a */
    protected InterfaceC14816a f62122a;

    /* JADX INFO: renamed from: b */
    protected int f62123b;

    /* JADX INFO: renamed from: c */
    private String f62124c;

    /* JADX INFO: renamed from: d */
    private String f62125d;

    /* JADX INFO: renamed from: e */
    protected Paint f62126e;

    /* JADX INFO: renamed from: f */
    protected Paint f62127f;

    /* JADX INFO: renamed from: g */
    protected Paint f62128g;

    /* JADX INFO: renamed from: h */
    protected Paint f62129h;

    /* JADX INFO: renamed from: i */
    private final Formatter f62130i;

    /* JADX INFO: renamed from: j */
    private final StringBuilder f62131j;

    /* JADX INFO: renamed from: k */
    protected int f62132k;

    /* JADX INFO: renamed from: l */
    protected int f62133l;

    /* JADX INFO: renamed from: m */
    protected int f62134m;

    /* JADX INFO: renamed from: n */
    protected int f62135n;

    /* JADX INFO: renamed from: o */
    protected int f62136o;

    /* JADX INFO: renamed from: p */
    protected int f62137p;

    /* JADX INFO: renamed from: q */
    protected int f62138q;

    /* JADX INFO: renamed from: r */
    protected boolean f62139r;

    /* JADX INFO: renamed from: s */
    protected int f62140s;

    /* JADX INFO: renamed from: t */
    protected int f62141t;

    /* JADX INFO: renamed from: u */
    protected int f62142u;

    /* JADX INFO: renamed from: v */
    protected int f62143v;

    /* JADX INFO: renamed from: w */
    protected int f62144w;

    /* JADX INFO: renamed from: x */
    protected int f62145x;

    /* JADX INFO: renamed from: y */
    protected int f62146y;

    /* JADX INFO: renamed from: z */
    private final Calendar f62147z;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.MonthView$a */
    public class C14812a extends dpf {

        /* JADX INFO: renamed from: a */
        private final Rect f62148a;

        /* JADX INFO: renamed from: b */
        private final Calendar f62149b;

        public C14812a(View view) {
            super(view);
            this.f62148a = new Rect();
            this.f62149b = Calendar.getInstance();
        }

        /* JADX INFO: renamed from: a */
        public void m86308a(int i, Rect rect) {
            MonthView monthView = MonthView.this;
            int i2 = monthView.f62123b;
            int monthHeaderSize = monthView.getMonthHeaderSize();
            MonthView monthView2 = MonthView.this;
            int i3 = monthView2.f62138q;
            int i4 = (monthView2.f62137p - (monthView2.f62123b * 2)) / monthView2.f62143v;
            int iM86301g = (i - 1) + monthView2.m86301g();
            int i5 = MonthView.this.f62143v;
            int i6 = i2 + ((iM86301g % i5) * i4);
            int i7 = monthHeaderSize + ((iM86301g / i5) * i3);
            rect.set(i6, i7, i4 + i6, i3 + i7);
        }

        /* JADX INFO: renamed from: b */
        public CharSequence m86309b(int i) {
            Calendar calendar = this.f62149b;
            MonthView monthView = MonthView.this;
            calendar.set(monthView.f62136o, monthView.f62135n, i);
            CharSequence charSequence = DateFormat.format("dd MMMM yyyy", this.f62149b.getTimeInMillis());
            MonthView monthView2 = MonthView.this;
            return i == monthView2.f62140s ? monthView2.getContext().getString(R$string.f62011i, charSequence) : charSequence;
        }

        /* JADX INFO: renamed from: c */
        public void m86310c(int i) {
            getAccessibilityNodeProvider(MonthView.this).mo108697f(i, 64, null);
        }

        @Override // p153l.dpf
        public int getVirtualViewAt(float f, float f2) {
            int iM86302h = MonthView.this.m86302h(f, f2);
            if (iM86302h >= 0) {
                return iM86302h;
            }
            return Integer.MIN_VALUE;
        }

        @Override // p153l.dpf
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 1; i <= MonthView.this.f62144w; i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // p153l.dpf
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            MonthView.this.m86295m(i);
            return true;
        }

        @Override // p153l.dpf
        public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(m86309b(i));
        }

        @Override // p153l.dpf
        public void onPopulateNodeForVirtualView(int i, C15967bc c15967bc) {
            m86308a(i, this.f62148a);
            c15967bc.m103438s0(m86309b(i));
            c15967bc.m103421j0(this.f62148a);
            c15967bc.m103406a(16);
            if (i == MonthView.this.f62140s) {
                c15967bc.m103384L0(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.MonthView$b */
    public interface InterfaceC14813b {
        /* JADX INFO: renamed from: a */
        void mo86311a(MonthView monthView, AbstractC14817b.a aVar);
    }

    public MonthView(Context context, AttributeSet attributeSet, InterfaceC14816a interfaceC14816a) {
        super(context, attributeSet);
        this.f62123b = 0;
        this.f62132k = -1;
        this.f62133l = -1;
        this.f62134m = -1;
        this.f62138q = f62101N;
        this.f62139r = false;
        this.f62140s = -1;
        this.f62141t = -1;
        this.f62142u = 1;
        this.f62143v = 7;
        this.f62144w = 7;
        this.f62145x = -1;
        this.f62146y = -1;
        this.f62111C = 6;
        this.f62121M = 0;
        this.f62122a = interfaceC14816a;
        Resources resources = context.getResources();
        this.f62109A = Calendar.getInstance();
        this.f62147z = Calendar.getInstance();
        this.f62124c = resources.getString(R$string.f62007e);
        this.f62125d = resources.getString(R$string.f62018p);
        InterfaceC14816a interfaceC14816a2 = this.f62122a;
        if (interfaceC14816a2 == null || !interfaceC14816a2.mo86277z()) {
            this.f62114F = j26.m143190c(context, q9c0.f156229n);
            this.f62116H = j26.m143190c(context, q9c0.f156223h);
            this.f62119K = j26.m143190c(context, q9c0.f156225j);
            this.f62118J = j26.m143190c(context, q9c0.f156227l);
        } else {
            this.f62114F = j26.m143190c(context, q9c0.f156230o);
            this.f62116H = j26.m143190c(context, q9c0.f156224i);
            this.f62119K = j26.m143190c(context, q9c0.f156226k);
            this.f62118J = j26.m143190c(context, q9c0.f156228m);
        }
        this.f62115G = j26.m143190c(context, q9c0.f156236u);
        this.f62117I = this.f62122a.mo86275u();
        this.f62120L = j26.m143190c(context, q9c0.f156236u);
        StringBuilder sb = new StringBuilder(50);
        this.f62131j = sb;
        this.f62130i = new Formatter(sb, Locale.getDefault());
        f62104Q = resources.getDimensionPixelSize(mac0.f135502c);
        f62105R = resources.getDimensionPixelSize(mac0.f135505f);
        f62106S = resources.getDimensionPixelSize(mac0.f135504e);
        f62107T = resources.getDimensionPixelOffset(mac0.f135506g);
        f62108U = resources.getDimensionPixelSize(mac0.f135501b);
        this.f62138q = (resources.getDimensionPixelOffset(mac0.f135500a) - getMonthHeaderSize()) / 6;
        C14812a monthViewTouchHelper = getMonthViewTouchHelper();
        this.f62110B = monthViewTouchHelper;
        kkl0.m150164j0(this, monthViewTouchHelper);
        kkl0.m150184t0(this, 1);
        this.f62113E = true;
        m86304k();
    }

    /* JADX INFO: renamed from: b */
    private int m86293b() {
        int iM86301g = m86301g();
        int i = this.f62144w;
        int i2 = this.f62143v;
        return ((iM86301g + i) / i2) + ((iM86301g + i) % i2 > 0 ? 1 : 0);
    }

    @NonNull
    private String getMonthAndYearString() {
        Locale locale = Locale.getDefault();
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "MMMM yyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(bestDateTimePattern, locale);
        simpleDateFormat.applyLocalizedPattern(bestDateTimePattern);
        this.f62131j.setLength(0);
        return simpleDateFormat.format(this.f62147z.getTime());
    }

    /* JADX INFO: renamed from: j */
    private String m86294j(Calendar calendar) {
        return new SimpleDateFormat("EEEEE", Locale.getDefault()).format(calendar.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m86295m(int i) {
        if (this.f62122a.mo86267e0(this.f62136o, this.f62135n, i)) {
            return;
        }
        InterfaceC14813b interfaceC14813b = this.f62112D;
        if (interfaceC14813b != null) {
            interfaceC14813b.mo86311a(this, new AbstractC14817b.a(this.f62136o, this.f62135n, i));
        }
        this.f62110B.sendEventForVirtualView(i, 1);
    }

    /* JADX INFO: renamed from: p */
    private boolean m86296p(int i, Calendar calendar) {
        return this.f62136o == calendar.get(1) && this.f62135n == calendar.get(2) && i == calendar.get(5);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo86297c(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    /* JADX INFO: renamed from: d */
    public void m86298d(Canvas canvas) {
        int monthHeaderSize = getMonthHeaderSize() - (f62106S / 2);
        int i = (this.f62137p - (this.f62123b * 2)) / (this.f62143v * 2);
        int i2 = 0;
        while (true) {
            int i3 = this.f62143v;
            if (i2 >= i3) {
                return;
            }
            int i4 = (((i2 * 2) + 1) * i) + this.f62123b;
            this.f62109A.set(7, (this.f62142u + i2) % i3);
            canvas.drawText(m86294j(this.f62109A), i4, monthHeaderSize, this.f62129h);
            i2++;
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.f62110B.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public void m86299e(Canvas canvas) {
        int monthHeaderSize = (((this.f62138q + f62104Q) / 2) - f62103P) + getMonthHeaderSize();
        float f = (this.f62137p - (this.f62123b * 2)) / (this.f62143v * 2.0f);
        int i = monthHeaderSize;
        int iM86301g = m86301g();
        for (int i2 = 1; i2 <= this.f62144w; i2++) {
            int i3 = (int) ((((iM86301g * 2) + 1) * f) + this.f62123b);
            int i4 = this.f62138q;
            float f2 = i3;
            int i5 = i - (((f62104Q + i4) / 2) - f62103P);
            mo86297c(canvas, this.f62136o, this.f62135n, i2, i3, i, (int) (f2 - f), (int) (f2 + f), i5, i5 + i4);
            iM86301g++;
            if (iM86301g == this.f62143v) {
                i += this.f62138q;
                iM86301g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m86300f(Canvas canvas) {
        canvas.drawText(getMonthAndYearString(), (this.f62137p + (this.f62123b * 2)) / 2, (getMonthHeaderSize() - f62106S) / 2, this.f62127f);
    }

    /* JADX INFO: renamed from: g */
    public int m86301g() {
        int i = this.f62121M;
        int i2 = this.f62142u;
        if (i < i2) {
            i += this.f62143v;
        }
        return i - i2;
    }

    public AbstractC14817b.a getAccessibilityFocus() {
        int focusedVirtualView = this.f62110B.getFocusedVirtualView();
        if (focusedVirtualView >= 0) {
            return new AbstractC14817b.a(this.f62136o, this.f62135n, focusedVirtualView);
        }
        return null;
    }

    public int getMonth() {
        return this.f62135n;
    }

    public int getMonthHeaderSize() {
        return f62107T;
    }

    public C14812a getMonthViewTouchHelper() {
        return new C14812a(this);
    }

    public int getYear() {
        return this.f62136o;
    }

    /* JADX INFO: renamed from: h */
    public int m86302h(float f, float f2) {
        int iM86303i = m86303i(f, f2);
        if (iM86303i < 1 || iM86303i > this.f62144w) {
            return -1;
        }
        return iM86303i;
    }

    /* JADX INFO: renamed from: i */
    public int m86303i(float f, float f2) {
        int i = this.f62123b;
        float f3 = i;
        if (f < f3 || f > this.f62137p - i) {
            return -1;
        }
        return (((int) (((f - f3) * this.f62143v) / ((this.f62137p - i) - this.f62123b))) - m86301g()) + 1 + ((((int) (f2 - getMonthHeaderSize())) / this.f62138q) * this.f62143v);
    }

    /* JADX INFO: renamed from: k */
    public void m86304k() {
        Paint paint = new Paint();
        this.f62127f = paint;
        paint.setFakeBoldText(true);
        this.f62127f.setAntiAlias(true);
        this.f62127f.setTextSize(f62105R);
        this.f62127f.setTypeface(Typeface.create(this.f62125d, 1));
        this.f62127f.setColor(this.f62114F);
        Paint paint2 = this.f62127f;
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        Paint paint3 = this.f62127f;
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f62128g = paint4;
        paint4.setFakeBoldText(true);
        this.f62128g.setAntiAlias(true);
        this.f62128g.setColor(this.f62117I);
        this.f62128g.setTextAlign(align);
        this.f62128g.setStyle(style);
        this.f62128g.setAlpha(255);
        Paint paint5 = new Paint();
        this.f62129h = paint5;
        paint5.setAntiAlias(true);
        this.f62129h.setTextSize(f62106S);
        this.f62129h.setColor(this.f62116H);
        this.f62129h.setTypeface(ooj0.m168584a(na00.m162052a()));
        this.f62129h.setStyle(style);
        this.f62129h.setTextAlign(align);
        this.f62129h.setFakeBoldText(true);
        Paint paint6 = new Paint();
        this.f62126e = paint6;
        paint6.setAntiAlias(true);
        this.f62126e.setTextSize(f62104Q);
        this.f62126e.setStyle(style);
        this.f62126e.setTextAlign(align);
        this.f62126e.setFakeBoldText(false);
    }

    /* JADX INFO: renamed from: l */
    public boolean m86305l(int i, int i2, int i3) {
        Calendar[] calendarArrMo86273n3 = this.f62122a.mo86273n3();
        if (calendarArrMo86273n3 == null) {
            return false;
        }
        for (Calendar calendar : calendarArrMo86273n3) {
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
    public boolean m86306n(AbstractC14817b.a aVar) {
        int i;
        if (aVar.f62170b != this.f62136o || aVar.f62171c != this.f62135n || (i = aVar.f62172d) > this.f62144w) {
            return false;
        }
        this.f62110B.m86310c(i);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public void m86307o() {
        this.f62111C = 6;
        requestLayout();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m86300f(canvas);
        m86298d(canvas);
        m86299e(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.f62138q * this.f62111C) + getMonthHeaderSize() + 5);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f62137p = i;
        this.f62110B.invalidateRoot();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        int iM86302h;
        if (motionEvent.getAction() == 1 && (iM86302h = m86302h(motionEvent.getX(), motionEvent.getY())) >= 0) {
            m86295m(iM86302h);
        }
        return true;
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (this.f62113E) {
            return;
        }
        super.setAccessibilityDelegate(accessibilityDelegate);
    }

    public void setDatePickerController(InterfaceC14816a interfaceC14816a) {
        this.f62122a = interfaceC14816a;
    }

    public void setMonthParams(HashMap<String, Integer> map) {
        if (!map.containsKey(MerchandiseTimeUnit.month) && !map.containsKey(MerchandiseTimeUnit.year)) {
            throw new InvalidParameterException("You must specify month and year for this view");
        }
        setTag(map);
        if (map.containsKey("height")) {
            int iIntValue = map.get("height").intValue();
            this.f62138q = iIntValue;
            int i = f62102O;
            if (iIntValue < i) {
                this.f62138q = i;
            }
        }
        if (map.containsKey("selected_day")) {
            this.f62140s = map.get("selected_day").intValue();
        }
        this.f62135n = map.get(MerchandiseTimeUnit.month).intValue();
        this.f62136o = map.get(MerchandiseTimeUnit.year).intValue();
        Calendar calendar = Calendar.getInstance();
        int i2 = 0;
        this.f62139r = false;
        this.f62141t = -1;
        this.f62147z.set(2, this.f62135n);
        this.f62147z.set(1, this.f62136o);
        this.f62147z.set(5, 1);
        this.f62121M = this.f62147z.get(7);
        if (map.containsKey("week_start")) {
            this.f62142u = map.get("week_start").intValue();
        } else {
            this.f62142u = this.f62147z.getFirstDayOfWeek();
        }
        this.f62144w = this.f62147z.getActualMaximum(5);
        while (i2 < this.f62144w) {
            i2++;
            if (m86296p(i2, calendar)) {
                this.f62139r = true;
                this.f62141t = i2;
            }
        }
        this.f62111C = m86293b();
        this.f62110B.invalidateRoot();
    }

    public void setOnDayClickListener(InterfaceC14813b interfaceC14813b) {
        this.f62112D = interfaceC14813b;
    }

    public void setSelectedDay(int i) {
        this.f62140s = i;
    }

    public MonthView(Context context) {
        this(context, null, null);
    }
}

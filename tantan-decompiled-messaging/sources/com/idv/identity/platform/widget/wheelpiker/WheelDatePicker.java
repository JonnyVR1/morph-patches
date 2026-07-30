package com.idv.identity.platform.widget.wheelpiker;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import java.util.Calendar;
import java.util.List;
import p149l.l4c0;
import p149l.lwm;
import p149l.upk0;
import p149l.y5c0;

/* JADX INFO: loaded from: classes7.dex */
public class WheelDatePicker extends LinearLayout implements WheelPicker.InterfaceC3715a {

    /* JADX INFO: renamed from: a */
    private final WheelYearPicker f12749a;

    /* JADX INFO: renamed from: b */
    private final WheelMonthPicker f12750b;

    /* JADX INFO: renamed from: c */
    private final WheelDayPicker f12751c;

    /* JADX INFO: renamed from: d */
    private int f12752d;

    /* JADX INFO: renamed from: e */
    private int f12753e;

    /* JADX INFO: renamed from: f */
    private int f12754f;

    /* JADX INFO: renamed from: g */
    private int f12755g;

    /* JADX INFO: renamed from: h */
    private int f12756h;

    /* JADX INFO: renamed from: i */
    private int f12757i;

    /* JADX INFO: renamed from: j */
    protected boolean f12758j;

    /* JADX INFO: renamed from: com.idv.identity.platform.widget.wheelpiker.WheelDatePicker$a */
    public class C3712a implements WheelPicker.InterfaceC3715a {
        public C3712a() {
        }

        @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker.InterfaceC3715a
        /* JADX INFO: renamed from: a */
        public void mo18139a(WheelPicker wheelPicker, Object obj, int i) {
            int i2 = Integer.parseInt(obj.toString());
            int i3 = WheelDatePicker.this.f12755g;
            WheelDatePicker wheelDatePicker = WheelDatePicker.this;
            if (i2 < i3) {
                if (wheelDatePicker.f12750b.getCurrentMonth() == 2) {
                    WheelDatePicker.this.setSelectedMonth(2);
                    return;
                }
                return;
            }
            int currentMonth = wheelDatePicker.f12750b.getCurrentMonth();
            int i4 = WheelDatePicker.this.f12756h;
            WheelDatePicker wheelDatePicker2 = WheelDatePicker.this;
            if (currentMonth <= i4) {
                if (wheelDatePicker2.f12750b.getCurrentMonth() != WheelDatePicker.this.f12756h || WheelDatePicker.this.f12751c.getCurrentDay() <= WheelDatePicker.this.f12757i) {
                    return;
                }
                WheelDatePicker.this.f12751c.setSelectedDay(WheelDatePicker.this.f12757i);
                return;
            }
            int currentDay = wheelDatePicker2.f12751c.getCurrentDay();
            int i5 = WheelDatePicker.this.f12757i;
            WheelDatePicker wheelDatePicker3 = WheelDatePicker.this;
            if (currentDay > i5) {
                wheelDatePicker3.f12750b.setSelectedMonth(WheelDatePicker.this.f12756h - 1);
            } else {
                wheelDatePicker3.f12750b.setSelectedMonth(WheelDatePicker.this.f12756h);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.widget.wheelpiker.WheelDatePicker$b */
    public class C3713b implements WheelPicker.InterfaceC3715a {
        public C3713b() {
        }

        @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker.InterfaceC3715a
        /* JADX INFO: renamed from: a */
        public void mo18139a(WheelPicker wheelPicker, Object obj, int i) {
            if (WheelDatePicker.this.f12749a.getCurrentYear() >= WheelDatePicker.this.f12755g) {
                int currentMonth = WheelDatePicker.this.f12750b.getCurrentMonth();
                int i2 = WheelDatePicker.this.f12756h;
                WheelDatePicker wheelDatePicker = WheelDatePicker.this;
                if (currentMonth > i2) {
                    wheelDatePicker.f12749a.setSelectedYear(WheelDatePicker.this.f12755g - 1);
                    WheelDatePicker.this.f12750b.setSelectedMonth(Integer.parseInt(obj.toString()));
                } else if (wheelDatePicker.f12750b.getCurrentMonth() == WheelDatePicker.this.f12756h && WheelDatePicker.this.f12751c.getCurrentDay() > WheelDatePicker.this.f12757i) {
                    WheelDatePicker.this.f12751c.setSelectedDay(WheelDatePicker.this.f12757i);
                }
            }
            WheelDatePicker.this.setSelectedMonth(Integer.parseInt(obj.toString()));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.widget.wheelpiker.WheelDatePicker$c */
    public class C3714c implements WheelPicker.InterfaceC3715a {
        public C3714c() {
        }

        @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker.InterfaceC3715a
        /* JADX INFO: renamed from: a */
        public void mo18139a(WheelPicker wheelPicker, Object obj, int i) {
            if (WheelDatePicker.this.f12749a.getCurrentYear() >= WheelDatePicker.this.f12755g) {
                if (Integer.parseInt(obj.toString()) > WheelDatePicker.this.f12757i) {
                    if (WheelDatePicker.this.f12750b.getCurrentMonth() + 1 >= WheelDatePicker.this.f12756h) {
                        WheelDatePicker.this.f12750b.setSelectedMonth(WheelDatePicker.this.f12756h - 1);
                    }
                } else {
                    if (Integer.parseInt(obj.toString()) != WheelDatePicker.this.f12757i || WheelDatePicker.this.f12750b.getCurrentMonth() < WheelDatePicker.this.f12756h) {
                        return;
                    }
                    WheelDatePicker.this.f12750b.setSelectedMonth(WheelDatePicker.this.f12756h);
                }
            }
        }
    }

    public WheelDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12758j = true;
        LayoutInflater.from(context).inflate(y5c0.f196409c, this);
        WheelYearPicker wheelYearPicker = (WheelYearPicker) findViewById(l4c0.f125991C);
        this.f12749a = wheelYearPicker;
        WheelMonthPicker wheelMonthPicker = (WheelMonthPicker) findViewById(l4c0.f125990B);
        this.f12750b = wheelMonthPicker;
        WheelDayPicker wheelDayPicker = (WheelDayPicker) findViewById(l4c0.f125989A);
        this.f12751c = wheelDayPicker;
        wheelYearPicker.setOnItemSelectedListener(this);
        wheelMonthPicker.setOnItemSelectedListener(this);
        wheelDayPicker.setOnItemSelectedListener(this);
        m18138i();
        wheelMonthPicker.setMaximumWidthText("00");
        wheelDayPicker.setMaximumWidthText("00");
        this.f12752d = wheelYearPicker.getCurrentYear();
        this.f12753e = wheelMonthPicker.getCurrentMonth();
        this.f12754f = wheelDayPicker.getCurrentDay();
    }

    /* JADX INFO: renamed from: i */
    private void m18138i() {
        List data = this.f12749a.getData();
        String strValueOf = String.valueOf(data.get(data.size() - 1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strValueOf.length(); i++) {
            sb.append("0");
        }
        this.f12749a.setMaximumWidthText(sb.toString());
    }

    @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker.InterfaceC3715a
    /* JADX INFO: renamed from: a */
    public void mo18139a(WheelPicker wheelPicker, Object obj, int i) {
        if (wheelPicker.getId() == l4c0.f125991C) {
            int iIntValue = ((Integer) obj).intValue();
            this.f12752d = iIntValue;
            this.f12751c.m18146o(iIntValue, this.f12750b.getCurrentMonth());
        } else if (wheelPicker.getId() == l4c0.f125990B) {
            int iIntValue2 = ((Integer) obj).intValue();
            this.f12753e = iIntValue2;
            this.f12751c.m18145n(iIntValue2, this.f12752d);
        }
        this.f12754f = this.f12751c.getCurrentDay();
    }

    public int getCurrentDay() {
        return this.f12751c.getCurrentDay();
    }

    @Deprecated
    public int getCurrentItemPosition() {
        throw new UnsupportedOperationException("You can not get position of current item fromWheelDatePicker");
    }

    public int getCurrentMonth() {
        return this.f12750b.getCurrentMonth();
    }

    public int getCurrentYear() {
        return this.f12749a.getCurrentYear();
    }

    @Deprecated
    public List getData() {
        throw new UnsupportedOperationException("You can not get data source from WheelDatePicker");
    }

    public int getIndicatorSize() {
        if (this.f12749a.getIndicatorSize() == this.f12750b.getIndicatorSize() && this.f12750b.getIndicatorSize() == this.f12751c.getIndicatorSize()) {
            return this.f12749a.getIndicatorSize();
        }
        upk0.m194883a("Can not get indicator size correctly from WheelDatePicker!");
        return 0;
    }

    public int getItemSpace() {
        if (this.f12749a.getItemSpace() == this.f12750b.getItemSpace() && this.f12750b.getItemSpace() == this.f12751c.getItemSpace()) {
            return this.f12749a.getItemSpace();
        }
        upk0.m194883a("Can not get item space correctly from WheelDatePicker!");
        return 0;
    }

    public int getItemTextColor() {
        if (this.f12749a.getItemTextColor() == this.f12750b.getItemTextColor() && this.f12750b.getItemTextColor() == this.f12751c.getItemTextColor()) {
            return this.f12749a.getItemTextColor();
        }
        upk0.m194883a("Can not get color of item text correctly fromWheelDatePicker!");
        return 0;
    }

    public int getItemTextSize() {
        if (this.f12749a.getItemTextSize() == this.f12750b.getItemTextSize() && this.f12750b.getItemTextSize() == this.f12751c.getItemTextSize()) {
            return this.f12749a.getItemTextSize();
        }
        upk0.m194883a("Can not get size of item text correctly fromWheelDatePicker!");
        return 0;
    }

    public int getSelectedDay() {
        return this.f12751c.getSelectedDay();
    }

    public int getSelectedItemTextColor() {
        if (this.f12749a.getSelectedItemTextColor() == this.f12750b.getSelectedItemTextColor() && this.f12750b.getSelectedItemTextColor() == this.f12751c.getSelectedItemTextColor()) {
            return this.f12749a.getSelectedItemTextColor();
        }
        upk0.m194883a("Can not get color of selected item text correctly fromWheelDatePicker!");
        return 0;
    }

    public int getSelectedMonth() {
        return this.f12750b.getSelectedMonth();
    }

    public int getSelectedYear() {
        return this.f12749a.getSelectedYear();
    }

    public Typeface getTypeface() {
        if (this.f12749a.getTypeface().equals(this.f12750b.getTypeface()) && this.f12750b.getTypeface().equals(this.f12751c.getTypeface())) {
            return this.f12749a.getTypeface();
        }
        upk0.m194883a("Can not get typeface correctly from WheelDatePicker!");
        return null;
    }

    public int getVisibleItemCount() {
        if (this.f12749a.getVisibleItemCount() == this.f12750b.getVisibleItemCount() && this.f12750b.getVisibleItemCount() == this.f12751c.getVisibleItemCount()) {
            return this.f12749a.getVisibleItemCount();
        }
        lwm.m151979a("Can not get visible item count correctly fromWheelDatePicker!");
        return 0;
    }

    public int getYearEnd() {
        return this.f12749a.getYearEnd();
    }

    public int getYearStart() {
        return this.f12749a.getYearStart();
    }

    /* JADX INFO: renamed from: h */
    public void m18140h() {
        if (this.f12758j) {
            this.f12755g = Calendar.getInstance().get(1);
            this.f12756h = Calendar.getInstance().get(2) + 1;
            this.f12757i = Calendar.getInstance().get(5);
            this.f12749a.setYearEnd(this.f12755g);
            m18141j();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m18141j() {
        this.f12749a.setOnItemSelectedListener(new C3712a());
        this.f12750b.setOnItemSelectedListener(new C3713b());
        this.f12751c.setOnItemSelectedListener(new C3714c());
    }

    public void setCurved(boolean z) {
        this.f12749a.setCurved(z);
        this.f12750b.setCurved(z);
        this.f12751c.setCurved(z);
    }

    public void setCyclic(boolean z) {
        this.f12749a.setCyclic(z);
        this.f12750b.setCyclic(z);
        this.f12751c.setCyclic(z);
    }

    @Deprecated
    public void setData(List list) {
    }

    public void setIndicator(boolean z) {
        this.f12749a.setIndicator(z);
        this.f12750b.setIndicator(z);
        this.f12751c.setIndicator(z);
    }

    public void setIndicatorColor(int i) {
        this.f12749a.setIndicatorColor(i);
        this.f12750b.setIndicatorColor(i);
        this.f12751c.setIndicatorColor(i);
    }

    public void setIndicatorSize(int i) {
        this.f12749a.setIndicatorSize(i);
        this.f12750b.setIndicatorSize(i);
        this.f12751c.setIndicatorSize(i);
    }

    @Deprecated
    public void setItemAlign(int i) {
        throw new UnsupportedOperationException("You don't need to set item align forWheelDatePicker");
    }

    public void setItemSpace(int i) {
        this.f12749a.setItemSpace(i);
        this.f12750b.setItemSpace(i);
        this.f12751c.setItemSpace(i);
    }

    public void setItemTextColor(int i) {
        this.f12749a.setItemTextColor(i);
        this.f12750b.setItemTextColor(i);
        this.f12751c.setItemTextColor(i);
    }

    public void setItemTextSize(int i) {
        this.f12749a.setItemTextSize(i);
        this.f12750b.setItemTextSize(i);
        this.f12751c.setItemTextSize(i);
    }

    @Deprecated
    public void setMaximumWidthText(String str) {
    }

    public void setNeedCheckEndDate(boolean z) {
        this.f12758j = z;
        m18140h();
    }

    @Deprecated
    public void setOnItemSelectedListener(WheelPicker.InterfaceC3715a interfaceC3715a) {
    }

    @Deprecated
    public void setSameWidth(boolean z) {
    }

    public void setSelectedDay(int i) {
        this.f12754f = i;
        this.f12751c.setSelectedDay(i);
    }

    @Deprecated
    public void setSelectedItemPosition(int i) {
    }

    public void setSelectedItemTextColor(int i) {
        this.f12749a.setSelectedItemTextColor(i);
        this.f12750b.setSelectedItemTextColor(i);
        this.f12751c.setSelectedItemTextColor(i);
    }

    public void setSelectedMonth(int i) {
        this.f12753e = i;
        this.f12750b.setSelectedMonth(i);
        this.f12751c.m18145n(i, this.f12749a.getCurrentYear());
    }

    public void setSelectedYear(int i) {
        this.f12752d = i;
        this.f12749a.setSelectedYear(i);
        this.f12751c.m18146o(i, this.f12750b.getCurrentMonth());
    }

    public void setTypeface(Typeface typeface) {
        this.f12749a.setTypeface(typeface);
        this.f12750b.setTypeface(typeface);
        this.f12751c.setTypeface(typeface);
    }

    public void setVisibleItemCount(int i) {
        this.f12749a.setVisibleItemCount(i);
        this.f12750b.setVisibleItemCount(i);
        this.f12751c.setVisibleItemCount(i);
    }

    public void setYearEnd(int i) {
        this.f12749a.setYearEnd(i);
    }

    public void setYearStart(int i) {
        this.f12749a.setYearStart(i);
    }

    public WheelDatePicker(Context context) {
        this(context, null);
    }
}

package com.idv.identity.platform.widget.wheelpiker;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import java.util.Calendar;
import java.util.List;
import p153l.azk0;
import p153l.eec0;
import p153l.mym;
import p153l.scc0;

/* JADX INFO: loaded from: classes7.dex */
public class WheelDatePicker extends LinearLayout implements WheelPicker.InterfaceC3874a {

    /* JADX INFO: renamed from: a */
    private final WheelYearPicker f13490a;

    /* JADX INFO: renamed from: b */
    private final WheelMonthPicker f13491b;

    /* JADX INFO: renamed from: c */
    private final WheelDayPicker f13492c;

    /* JADX INFO: renamed from: d */
    private int f13493d;

    /* JADX INFO: renamed from: e */
    private int f13494e;

    /* JADX INFO: renamed from: f */
    private int f13495f;

    /* JADX INFO: renamed from: g */
    private int f13496g;

    /* JADX INFO: renamed from: h */
    private int f13497h;

    /* JADX INFO: renamed from: i */
    private int f13498i;

    /* JADX INFO: renamed from: j */
    protected boolean f13499j;

    /* JADX INFO: renamed from: com.idv.identity.platform.widget.wheelpiker.WheelDatePicker$a */
    public class C3871a implements WheelPicker.InterfaceC3874a {
        public C3871a() {
        }

        @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker.InterfaceC3874a
        /* JADX INFO: renamed from: a */
        public void mo19216a(WheelPicker wheelPicker, Object obj, int i) {
            int i2 = Integer.parseInt(obj.toString());
            int i3 = WheelDatePicker.this.f13496g;
            WheelDatePicker wheelDatePicker = WheelDatePicker.this;
            if (i2 < i3) {
                if (wheelDatePicker.f13491b.getCurrentMonth() == 2) {
                    WheelDatePicker.this.setSelectedMonth(2);
                    return;
                }
                return;
            }
            int currentMonth = wheelDatePicker.f13491b.getCurrentMonth();
            int i4 = WheelDatePicker.this.f13497h;
            WheelDatePicker wheelDatePicker2 = WheelDatePicker.this;
            if (currentMonth <= i4) {
                if (wheelDatePicker2.f13491b.getCurrentMonth() != WheelDatePicker.this.f13497h || WheelDatePicker.this.f13492c.getCurrentDay() <= WheelDatePicker.this.f13498i) {
                    return;
                }
                WheelDatePicker.this.f13492c.setSelectedDay(WheelDatePicker.this.f13498i);
                return;
            }
            int currentDay = wheelDatePicker2.f13492c.getCurrentDay();
            int i5 = WheelDatePicker.this.f13498i;
            WheelDatePicker wheelDatePicker3 = WheelDatePicker.this;
            if (currentDay > i5) {
                wheelDatePicker3.f13491b.setSelectedMonth(WheelDatePicker.this.f13497h - 1);
            } else {
                wheelDatePicker3.f13491b.setSelectedMonth(WheelDatePicker.this.f13497h);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.widget.wheelpiker.WheelDatePicker$b */
    public class C3872b implements WheelPicker.InterfaceC3874a {
        public C3872b() {
        }

        @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker.InterfaceC3874a
        /* JADX INFO: renamed from: a */
        public void mo19216a(WheelPicker wheelPicker, Object obj, int i) {
            if (WheelDatePicker.this.f13490a.getCurrentYear() >= WheelDatePicker.this.f13496g) {
                int currentMonth = WheelDatePicker.this.f13491b.getCurrentMonth();
                int i2 = WheelDatePicker.this.f13497h;
                WheelDatePicker wheelDatePicker = WheelDatePicker.this;
                if (currentMonth > i2) {
                    wheelDatePicker.f13490a.setSelectedYear(WheelDatePicker.this.f13496g - 1);
                    WheelDatePicker.this.f13491b.setSelectedMonth(Integer.parseInt(obj.toString()));
                } else if (wheelDatePicker.f13491b.getCurrentMonth() == WheelDatePicker.this.f13497h && WheelDatePicker.this.f13492c.getCurrentDay() > WheelDatePicker.this.f13498i) {
                    WheelDatePicker.this.f13492c.setSelectedDay(WheelDatePicker.this.f13498i);
                }
            }
            WheelDatePicker.this.setSelectedMonth(Integer.parseInt(obj.toString()));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.widget.wheelpiker.WheelDatePicker$c */
    public class C3873c implements WheelPicker.InterfaceC3874a {
        public C3873c() {
        }

        @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker.InterfaceC3874a
        /* JADX INFO: renamed from: a */
        public void mo19216a(WheelPicker wheelPicker, Object obj, int i) {
            if (WheelDatePicker.this.f13490a.getCurrentYear() >= WheelDatePicker.this.f13496g) {
                if (Integer.parseInt(obj.toString()) > WheelDatePicker.this.f13498i) {
                    if (WheelDatePicker.this.f13491b.getCurrentMonth() + 1 >= WheelDatePicker.this.f13497h) {
                        WheelDatePicker.this.f13491b.setSelectedMonth(WheelDatePicker.this.f13497h - 1);
                    }
                } else {
                    if (Integer.parseInt(obj.toString()) != WheelDatePicker.this.f13498i || WheelDatePicker.this.f13491b.getCurrentMonth() < WheelDatePicker.this.f13497h) {
                        return;
                    }
                    WheelDatePicker.this.f13491b.setSelectedMonth(WheelDatePicker.this.f13497h);
                }
            }
        }
    }

    public WheelDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13499j = true;
        LayoutInflater.from(context).inflate(eec0.f93634c, this);
        WheelYearPicker wheelYearPicker = (WheelYearPicker) findViewById(scc0.f167211C);
        this.f13490a = wheelYearPicker;
        WheelMonthPicker wheelMonthPicker = (WheelMonthPicker) findViewById(scc0.f167210B);
        this.f13491b = wheelMonthPicker;
        WheelDayPicker wheelDayPicker = (WheelDayPicker) findViewById(scc0.f167209A);
        this.f13492c = wheelDayPicker;
        wheelYearPicker.setOnItemSelectedListener(this);
        wheelMonthPicker.setOnItemSelectedListener(this);
        wheelDayPicker.setOnItemSelectedListener(this);
        m19215i();
        wheelMonthPicker.setMaximumWidthText("00");
        wheelDayPicker.setMaximumWidthText("00");
        this.f13493d = wheelYearPicker.getCurrentYear();
        this.f13494e = wheelMonthPicker.getCurrentMonth();
        this.f13495f = wheelDayPicker.getCurrentDay();
    }

    /* JADX INFO: renamed from: i */
    private void m19215i() {
        List data = this.f13490a.getData();
        String strValueOf = String.valueOf(data.get(data.size() - 1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strValueOf.length(); i++) {
            sb.append("0");
        }
        this.f13490a.setMaximumWidthText(sb.toString());
    }

    @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker.InterfaceC3874a
    /* JADX INFO: renamed from: a */
    public void mo19216a(WheelPicker wheelPicker, Object obj, int i) {
        if (wheelPicker.getId() == scc0.f167211C) {
            int iIntValue = ((Integer) obj).intValue();
            this.f13493d = iIntValue;
            this.f13492c.m19223o(iIntValue, this.f13491b.getCurrentMonth());
        } else if (wheelPicker.getId() == scc0.f167210B) {
            int iIntValue2 = ((Integer) obj).intValue();
            this.f13494e = iIntValue2;
            this.f13492c.m19222n(iIntValue2, this.f13493d);
        }
        this.f13495f = this.f13492c.getCurrentDay();
    }

    public int getCurrentDay() {
        return this.f13492c.getCurrentDay();
    }

    @Deprecated
    public int getCurrentItemPosition() {
        throw new UnsupportedOperationException("You can not get position of current item fromWheelDatePicker");
    }

    public int getCurrentMonth() {
        return this.f13491b.getCurrentMonth();
    }

    public int getCurrentYear() {
        return this.f13490a.getCurrentYear();
    }

    @Deprecated
    public List getData() {
        throw new UnsupportedOperationException("You can not get data source from WheelDatePicker");
    }

    public int getIndicatorSize() {
        if (this.f13490a.getIndicatorSize() == this.f13491b.getIndicatorSize() && this.f13491b.getIndicatorSize() == this.f13492c.getIndicatorSize()) {
            return this.f13490a.getIndicatorSize();
        }
        azk0.m101074a("Can not get indicator size correctly from WheelDatePicker!");
        return 0;
    }

    public int getItemSpace() {
        if (this.f13490a.getItemSpace() == this.f13491b.getItemSpace() && this.f13491b.getItemSpace() == this.f13492c.getItemSpace()) {
            return this.f13490a.getItemSpace();
        }
        azk0.m101074a("Can not get item space correctly from WheelDatePicker!");
        return 0;
    }

    public int getItemTextColor() {
        if (this.f13490a.getItemTextColor() == this.f13491b.getItemTextColor() && this.f13491b.getItemTextColor() == this.f13492c.getItemTextColor()) {
            return this.f13490a.getItemTextColor();
        }
        azk0.m101074a("Can not get color of item text correctly fromWheelDatePicker!");
        return 0;
    }

    public int getItemTextSize() {
        if (this.f13490a.getItemTextSize() == this.f13491b.getItemTextSize() && this.f13491b.getItemTextSize() == this.f13492c.getItemTextSize()) {
            return this.f13490a.getItemTextSize();
        }
        azk0.m101074a("Can not get size of item text correctly fromWheelDatePicker!");
        return 0;
    }

    public int getSelectedDay() {
        return this.f13492c.getSelectedDay();
    }

    public int getSelectedItemTextColor() {
        if (this.f13490a.getSelectedItemTextColor() == this.f13491b.getSelectedItemTextColor() && this.f13491b.getSelectedItemTextColor() == this.f13492c.getSelectedItemTextColor()) {
            return this.f13490a.getSelectedItemTextColor();
        }
        azk0.m101074a("Can not get color of selected item text correctly fromWheelDatePicker!");
        return 0;
    }

    public int getSelectedMonth() {
        return this.f13491b.getSelectedMonth();
    }

    public int getSelectedYear() {
        return this.f13490a.getSelectedYear();
    }

    public Typeface getTypeface() {
        if (this.f13490a.getTypeface().equals(this.f13491b.getTypeface()) && this.f13491b.getTypeface().equals(this.f13492c.getTypeface())) {
            return this.f13490a.getTypeface();
        }
        azk0.m101074a("Can not get typeface correctly from WheelDatePicker!");
        return null;
    }

    public int getVisibleItemCount() {
        if (this.f13490a.getVisibleItemCount() == this.f13491b.getVisibleItemCount() && this.f13491b.getVisibleItemCount() == this.f13492c.getVisibleItemCount()) {
            return this.f13490a.getVisibleItemCount();
        }
        mym.m160801a("Can not get visible item count correctly fromWheelDatePicker!");
        return 0;
    }

    public int getYearEnd() {
        return this.f13490a.getYearEnd();
    }

    public int getYearStart() {
        return this.f13490a.getYearStart();
    }

    /* JADX INFO: renamed from: h */
    public void m19217h() {
        if (this.f13499j) {
            this.f13496g = Calendar.getInstance().get(1);
            this.f13497h = Calendar.getInstance().get(2) + 1;
            this.f13498i = Calendar.getInstance().get(5);
            this.f13490a.setYearEnd(this.f13496g);
            m19218j();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m19218j() {
        this.f13490a.setOnItemSelectedListener(new C3871a());
        this.f13491b.setOnItemSelectedListener(new C3872b());
        this.f13492c.setOnItemSelectedListener(new C3873c());
    }

    public void setCurved(boolean z) {
        this.f13490a.setCurved(z);
        this.f13491b.setCurved(z);
        this.f13492c.setCurved(z);
    }

    public void setCyclic(boolean z) {
        this.f13490a.setCyclic(z);
        this.f13491b.setCyclic(z);
        this.f13492c.setCyclic(z);
    }

    @Deprecated
    public void setData(List list) {
    }

    public void setIndicator(boolean z) {
        this.f13490a.setIndicator(z);
        this.f13491b.setIndicator(z);
        this.f13492c.setIndicator(z);
    }

    public void setIndicatorColor(int i) {
        this.f13490a.setIndicatorColor(i);
        this.f13491b.setIndicatorColor(i);
        this.f13492c.setIndicatorColor(i);
    }

    public void setIndicatorSize(int i) {
        this.f13490a.setIndicatorSize(i);
        this.f13491b.setIndicatorSize(i);
        this.f13492c.setIndicatorSize(i);
    }

    @Deprecated
    public void setItemAlign(int i) {
        throw new UnsupportedOperationException("You don't need to set item align forWheelDatePicker");
    }

    public void setItemSpace(int i) {
        this.f13490a.setItemSpace(i);
        this.f13491b.setItemSpace(i);
        this.f13492c.setItemSpace(i);
    }

    public void setItemTextColor(int i) {
        this.f13490a.setItemTextColor(i);
        this.f13491b.setItemTextColor(i);
        this.f13492c.setItemTextColor(i);
    }

    public void setItemTextSize(int i) {
        this.f13490a.setItemTextSize(i);
        this.f13491b.setItemTextSize(i);
        this.f13492c.setItemTextSize(i);
    }

    @Deprecated
    public void setMaximumWidthText(String str) {
    }

    public void setNeedCheckEndDate(boolean z) {
        this.f13499j = z;
        m19217h();
    }

    @Deprecated
    public void setOnItemSelectedListener(WheelPicker.InterfaceC3874a interfaceC3874a) {
    }

    @Deprecated
    public void setSameWidth(boolean z) {
    }

    public void setSelectedDay(int i) {
        this.f13495f = i;
        this.f13492c.setSelectedDay(i);
    }

    @Deprecated
    public void setSelectedItemPosition(int i) {
    }

    public void setSelectedItemTextColor(int i) {
        this.f13490a.setSelectedItemTextColor(i);
        this.f13491b.setSelectedItemTextColor(i);
        this.f13492c.setSelectedItemTextColor(i);
    }

    public void setSelectedMonth(int i) {
        this.f13494e = i;
        this.f13491b.setSelectedMonth(i);
        this.f13492c.m19222n(i, this.f13490a.getCurrentYear());
    }

    public void setSelectedYear(int i) {
        this.f13493d = i;
        this.f13490a.setSelectedYear(i);
        this.f13492c.m19223o(i, this.f13491b.getCurrentMonth());
    }

    public void setTypeface(Typeface typeface) {
        this.f13490a.setTypeface(typeface);
        this.f13491b.setTypeface(typeface);
        this.f13492c.setTypeface(typeface);
    }

    public void setVisibleItemCount(int i) {
        this.f13490a.setVisibleItemCount(i);
        this.f13491b.setVisibleItemCount(i);
        this.f13492c.setVisibleItemCount(i);
    }

    public void setYearEnd(int i) {
        this.f13490a.setYearEnd(i);
    }

    public void setYearStart(int i) {
        this.f13490a.setYearStart(i);
    }

    public WheelDatePicker(Context context) {
        this(context, null);
    }
}

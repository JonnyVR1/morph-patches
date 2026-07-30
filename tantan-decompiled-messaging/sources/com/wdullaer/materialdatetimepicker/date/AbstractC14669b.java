package com.wdullaer.materialdatetimepicker.date;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14669b extends BaseAdapter implements MonthView.InterfaceC14665b {

    /* JADX INFO: renamed from: a */
    private final Context f61319a;

    /* JADX INFO: renamed from: b */
    protected final InterfaceC14668a f61320b;

    /* JADX INFO: renamed from: c */
    private a f61321c;

    public AbstractC14669b(Context context, InterfaceC14668a interfaceC14668a) {
        this.f61319a = context;
        this.f61320b = interfaceC14668a;
        m85153c();
        m85155f(interfaceC14668a.mo85107z2());
    }

    /* JADX INFO: renamed from: d */
    private boolean m85151d(int i, int i2) {
        a aVar = this.f61321c;
        return aVar.f61323b == i && aVar.f61324c == i2;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.MonthView.InterfaceC14665b
    /* JADX INFO: renamed from: a */
    public void mo85140a(MonthView monthView, a aVar) {
        if (aVar != null) {
            m85154e(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract MonthView mo85152b(Context context);

    /* JADX INFO: renamed from: c */
    public void m85153c() {
        this.f61321c = new a(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: e */
    public void m85154e(a aVar) {
        this.f61320b.mo85105w();
        this.f61320b.mo85090K0(aVar.f61323b, aVar.f61324c, aVar.f61325d);
        m85155f(aVar);
    }

    /* JADX INFO: renamed from: f */
    public void m85155f(a aVar) {
        this.f61321c = aVar;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Calendar calendarMo85095c2 = this.f61320b.mo85095c2();
        Calendar calendarMo85093T3 = this.f61320b.mo85093T3();
        return (((calendarMo85095c2.get(1) * 12) + calendarMo85095c2.get(2)) - ((calendarMo85093T3.get(1) * 12) + calendarMo85093T3.get(2))) + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"NewApi"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        MonthView monthViewMo85152b;
        HashMap<String, Integer> map;
        if (view != null) {
            monthViewMo85152b = (MonthView) view;
            map = (HashMap) monthViewMo85152b.getTag();
        } else {
            monthViewMo85152b = mo85152b(this.f61319a);
            monthViewMo85152b.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            monthViewMo85152b.setClickable(true);
            monthViewMo85152b.setOnDayClickListener(this);
            map = null;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.clear();
        int i2 = (this.f61320b.mo85093T3().get(2) + i) % 12;
        int iMo85089I3 = ((i + this.f61320b.mo85093T3().get(2)) / 12) + this.f61320b.mo85089I3();
        int i3 = m85151d(iMo85089I3, i2) ? this.f61321c.f61325d : -1;
        monthViewMo85152b.m85136o();
        map.put("selected_day", Integer.valueOf(i3));
        map.put(MerchandiseTimeUnit.year, Integer.valueOf(iMo85089I3));
        map.put(MerchandiseTimeUnit.month, Integer.valueOf(i2));
        map.put("week_start", Integer.valueOf(this.f61320b.mo85092L2()));
        monthViewMo85152b.setMonthParams(map);
        monthViewMo85152b.invalidate();
        return monthViewMo85152b;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private Calendar f61322a;

        /* JADX INFO: renamed from: b */
        int f61323b;

        /* JADX INFO: renamed from: c */
        int f61324c;

        /* JADX INFO: renamed from: d */
        int f61325d;

        public a(Calendar calendar) {
            this.f61323b = calendar.get(1);
            this.f61324c = calendar.get(2);
            this.f61325d = calendar.get(5);
        }

        /* JADX INFO: renamed from: c */
        private void m85156c(long j) {
            if (this.f61322a == null) {
                this.f61322a = Calendar.getInstance();
            }
            this.f61322a.setTimeInMillis(j);
            this.f61324c = this.f61322a.get(2);
            this.f61323b = this.f61322a.get(1);
            this.f61325d = this.f61322a.get(5);
        }

        /* JADX INFO: renamed from: a */
        public void m85157a(a aVar) {
            this.f61323b = aVar.f61323b;
            this.f61324c = aVar.f61324c;
            this.f61325d = aVar.f61325d;
        }

        /* JADX INFO: renamed from: b */
        public void m85158b(int i, int i2, int i3) {
            this.f61323b = i;
            this.f61324c = i2;
            this.f61325d = i3;
        }

        public a(long j) {
            m85156c(j);
        }

        public a() {
            m85156c(System.currentTimeMillis());
        }

        public a(int i, int i2, int i3) {
            m85158b(i, i2, i3);
        }
    }
}

package com.wdullaer.materialdatetimepicker.date;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14817b extends BaseAdapter implements MonthView.InterfaceC14813b {

    /* JADX INFO: renamed from: a */
    private final Context f62166a;

    /* JADX INFO: renamed from: b */
    protected final InterfaceC14816a f62167b;

    /* JADX INFO: renamed from: c */
    private a f62168c;

    public AbstractC14817b(Context context, InterfaceC14816a interfaceC14816a) {
        this.f62166a = context;
        this.f62167b = interfaceC14816a;
        m86324c();
        m86326f(interfaceC14816a.mo86278z2());
    }

    /* JADX INFO: renamed from: d */
    private boolean m86322d(int i, int i2) {
        a aVar = this.f62168c;
        return aVar.f62170b == i && aVar.f62171c == i2;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.MonthView.InterfaceC14813b
    /* JADX INFO: renamed from: a */
    public void mo86311a(MonthView monthView, a aVar) {
        if (aVar != null) {
            m86325e(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract MonthView mo86323b(Context context);

    /* JADX INFO: renamed from: c */
    public void m86324c() {
        this.f62168c = new a(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: e */
    public void m86325e(a aVar) {
        this.f62167b.mo86276w();
        this.f62167b.mo86261K0(aVar.f62170b, aVar.f62171c, aVar.f62172d);
        m86326f(aVar);
    }

    /* JADX INFO: renamed from: f */
    public void m86326f(a aVar) {
        this.f62168c = aVar;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Calendar calendarMo86266c2 = this.f62167b.mo86266c2();
        Calendar calendarMo86264T3 = this.f62167b.mo86264T3();
        return (((calendarMo86266c2.get(1) * 12) + calendarMo86266c2.get(2)) - ((calendarMo86264T3.get(1) * 12) + calendarMo86264T3.get(2))) + 1;
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
        MonthView monthViewMo86323b;
        HashMap<String, Integer> map;
        if (view != null) {
            monthViewMo86323b = (MonthView) view;
            map = (HashMap) monthViewMo86323b.getTag();
        } else {
            monthViewMo86323b = mo86323b(this.f62166a);
            monthViewMo86323b.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            monthViewMo86323b.setClickable(true);
            monthViewMo86323b.setOnDayClickListener(this);
            map = null;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.clear();
        int i2 = (this.f62167b.mo86264T3().get(2) + i) % 12;
        int iMo86260I3 = ((i + this.f62167b.mo86264T3().get(2)) / 12) + this.f62167b.mo86260I3();
        int i3 = m86322d(iMo86260I3, i2) ? this.f62168c.f62172d : -1;
        monthViewMo86323b.m86307o();
        map.put("selected_day", Integer.valueOf(i3));
        map.put(MerchandiseTimeUnit.year, Integer.valueOf(iMo86260I3));
        map.put(MerchandiseTimeUnit.month, Integer.valueOf(i2));
        map.put("week_start", Integer.valueOf(this.f62167b.mo86263L2()));
        monthViewMo86323b.setMonthParams(map);
        monthViewMo86323b.invalidate();
        return monthViewMo86323b;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private Calendar f62169a;

        /* JADX INFO: renamed from: b */
        int f62170b;

        /* JADX INFO: renamed from: c */
        int f62171c;

        /* JADX INFO: renamed from: d */
        int f62172d;

        public a(Calendar calendar) {
            this.f62170b = calendar.get(1);
            this.f62171c = calendar.get(2);
            this.f62172d = calendar.get(5);
        }

        /* JADX INFO: renamed from: c */
        private void m86327c(long j) {
            if (this.f62169a == null) {
                this.f62169a = Calendar.getInstance();
            }
            this.f62169a.setTimeInMillis(j);
            this.f62171c = this.f62169a.get(2);
            this.f62170b = this.f62169a.get(1);
            this.f62172d = this.f62169a.get(5);
        }

        /* JADX INFO: renamed from: a */
        public void m86328a(a aVar) {
            this.f62170b = aVar.f62170b;
            this.f62171c = aVar.f62171c;
            this.f62172d = aVar.f62172d;
        }

        /* JADX INFO: renamed from: b */
        public void m86329b(int i, int i2, int i3) {
            this.f62170b = i;
            this.f62171c = i2;
            this.f62172d = i3;
        }

        public a(long j) {
            m86327c(j);
        }

        public a() {
            m86327c(System.currentTimeMillis());
        }

        public a(int i, int i2, int i3) {
            m86329b(i, i2, i3);
        }
    }
}

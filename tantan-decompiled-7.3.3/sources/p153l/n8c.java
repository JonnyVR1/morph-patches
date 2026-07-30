package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.idv.identity.platform.widget.wheelpiker.WheelDatePicker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class n8c extends if2 {

    /* JADX INFO: renamed from: c */
    public WheelDatePicker f140667c;

    /* JADX INFO: renamed from: d */
    private final StringBuilder f140668d;

    /* JADX INFO: renamed from: e */
    private final boolean f140669e;

    /* JADX INFO: renamed from: f */
    private String f140670f;

    /* JADX INFO: renamed from: l.n8c$a */
    public class ViewOnClickListenerC18820a implements View.OnClickListener {
        public ViewOnClickListenerC18820a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n8c.this.m161907b();
            n8c.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.n8c$b */
    public class ViewOnClickListenerC18821b implements View.OnClickListener {
        public ViewOnClickListenerC18821b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n8c.this.f140668d.setLength(0);
            n8c.this.dismiss();
        }
    }

    public n8c(Context context, boolean z) {
        super(context, eec0.f93633b);
        this.f140668d = new StringBuilder();
        this.f140670f = "";
        this.f114642a = context;
        this.f140669e = z;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m161904g(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m161905h(Calendar calendar, Calendar calendar2) {
        int i = calendar2.get(1) - calendar.get(1);
        boolean z = calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
        if (calendar.get(2) == 1 && calendar.get(5) == 29 && !m161904g(calendar2.get(1)) && calendar2.get(2) == 1) {
            z = calendar2.get(5) == 28;
        }
        return (i == 5 || i == 10 || i == 20) && z;
    }

    /* JADX INFO: renamed from: j */
    public static Calendar m161906j(String str) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Invalid date format: " + str);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m161907b() {
        if (this.f140669e) {
            try {
                if (new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(this.f140667c.getCurrentYear() + "-" + this.f140667c.getCurrentMonth() + "-" + this.f140667c.getCurrentDay()).compareTo(new Date(System.currentTimeMillis())) > 0) {
                    this.f140668d.setLength(0);
                    return false;
                }
            } catch (ParseException unused) {
            }
        }
        String strM161908c = m161908c(m161909d().getCurrentMonth());
        this.f140668d.setLength(0);
        StringBuilder sb = this.f140668d;
        sb.append(this.f140667c.getCurrentYear());
        sb.append("-");
        sb.append(strM161908c);
        sb.append("-");
        sb.append(m161908c(m161909d().getCurrentDay()));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public String m161908c(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: d */
    public WheelDatePicker m161909d() {
        if (this.f140667c == null) {
            this.f140667c = (WheelDatePicker) findViewById(scc0.f167222k);
        }
        return this.f140667c;
    }

    /* JADX INFO: renamed from: e */
    public String m161910e() {
        m161911f(this.f140669e);
        return this.f140668d.toString();
    }

    /* JADX INFO: renamed from: f */
    public void m161911f(boolean z) {
        this.f140667c = m161909d();
        Calendar calendar = Calendar.getInstance();
        WheelDatePicker wheelDatePicker = this.f140667c;
        if (wheelDatePicker != null) {
            wheelDatePicker.setNeedCheckEndDate(z);
            if (f8g0.m124534a(this.f140670f)) {
                this.f140667c.setSelectedYear(calendar.get(1));
                this.f140667c.setSelectedMonth((calendar.get(2) + 1) % 12);
                this.f140667c.setSelectedDay(calendar.get(5));
                return;
            }
            String[] strArrSplit = this.f140670f.split("-");
            if (strArrSplit == null || strArrSplit.length <= 2) {
                return;
            }
            this.f140667c.setSelectedYear(Integer.parseInt(strArrSplit[0]));
            this.f140667c.setSelectedMonth(Integer.parseInt(strArrSplit[1]));
            this.f140667c.setSelectedDay(Integer.parseInt(strArrSplit[2]));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m161912i(String str) {
        this.f140670f = str;
    }

    @Override // p153l.if2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m161911f(this.f140669e);
        View viewFindViewById = findViewById(scc0.f167224m);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC18820a());
        }
        View viewFindViewById2 = findViewById(scc0.f167223l);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC18821b());
        }
    }
}

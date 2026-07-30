package p149l;

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
public class h7c extends bf2 {

    /* JADX INFO: renamed from: c */
    public WheelDatePicker f106213c;

    /* JADX INFO: renamed from: d */
    private final StringBuilder f106214d;

    /* JADX INFO: renamed from: e */
    private final boolean f106215e;

    /* JADX INFO: renamed from: f */
    private String f106216f;

    /* JADX INFO: renamed from: l.h7c$a */
    public class ViewOnClickListenerC17239a implements View.OnClickListener {
        public ViewOnClickListenerC17239a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h7c.this.m129628b();
            h7c.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.h7c$b */
    public class ViewOnClickListenerC17240b implements View.OnClickListener {
        public ViewOnClickListenerC17240b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h7c.this.f106214d.setLength(0);
            h7c.this.dismiss();
        }
    }

    public h7c(Context context, boolean z) {
        super(context, y5c0.f196408b);
        this.f106214d = new StringBuilder();
        this.f106216f = "";
        this.f75268a = context;
        this.f106215e = z;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m129625g(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m129626h(Calendar calendar, Calendar calendar2) {
        int i = calendar2.get(1) - calendar.get(1);
        boolean z = calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
        if (calendar.get(2) == 1 && calendar.get(5) == 29 && !m129625g(calendar2.get(1)) && calendar2.get(2) == 1) {
            z = calendar2.get(5) == 28;
        }
        return (i == 5 || i == 10 || i == 20) && z;
    }

    /* JADX INFO: renamed from: j */
    public static Calendar m129627j(String str) {
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
    public boolean m129628b() {
        if (this.f106215e) {
            try {
                if (new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(this.f106213c.getCurrentYear() + "-" + this.f106213c.getCurrentMonth() + "-" + this.f106213c.getCurrentDay()).compareTo(new Date(System.currentTimeMillis())) > 0) {
                    this.f106214d.setLength(0);
                    return false;
                }
            } catch (ParseException unused) {
            }
        }
        String strM129629c = m129629c(m129630d().getCurrentMonth());
        this.f106214d.setLength(0);
        StringBuilder sb = this.f106214d;
        sb.append(this.f106213c.getCurrentYear());
        sb.append("-");
        sb.append(strM129629c);
        sb.append("-");
        sb.append(m129629c(m129630d().getCurrentDay()));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public String m129629c(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: d */
    public WheelDatePicker m129630d() {
        if (this.f106213c == null) {
            this.f106213c = (WheelDatePicker) findViewById(l4c0.f126002k);
        }
        return this.f106213c;
    }

    /* JADX INFO: renamed from: e */
    public String m129631e() {
        m129632f(this.f106215e);
        return this.f106214d.toString();
    }

    /* JADX INFO: renamed from: f */
    public void m129632f(boolean z) {
        this.f106213c = m129630d();
        Calendar calendar = Calendar.getInstance();
        WheelDatePicker wheelDatePicker = this.f106213c;
        if (wheelDatePicker != null) {
            wheelDatePicker.setNeedCheckEndDate(z);
            if (yzf0.m216680a(this.f106216f)) {
                this.f106213c.setSelectedYear(calendar.get(1));
                this.f106213c.setSelectedMonth((calendar.get(2) + 1) % 12);
                this.f106213c.setSelectedDay(calendar.get(5));
                return;
            }
            String[] strArrSplit = this.f106216f.split("-");
            if (strArrSplit == null || strArrSplit.length <= 2) {
                return;
            }
            this.f106213c.setSelectedYear(Integer.parseInt(strArrSplit[0]));
            this.f106213c.setSelectedMonth(Integer.parseInt(strArrSplit[1]));
            this.f106213c.setSelectedDay(Integer.parseInt(strArrSplit[2]));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m129633i(String str) {
        this.f106216f = str;
    }

    @Override // p149l.bf2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m129632f(this.f106215e);
        View viewFindViewById = findViewById(l4c0.f126004m);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC17239a());
        }
        View viewFindViewById2 = findViewById(l4c0.f126003l);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC17240b());
        }
    }
}

package p149l;

import android.graphics.Color;
import android.view.View;
import cn.qqtheme.framework.wheelview.ItemsRange;
import cn.qqtheme.framework.wheelview.OnWheelChangedListener;
import cn.qqtheme.framework.wheelview.OnWheelScrollListener;
import cn.qqtheme.framework.wheelview.WheelView;
import cn.qqtheme.framework.wheelview.adapter.NumericWheelAdapter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.User;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.fourthline.cling.model.Constants;

/* JADX INFO: loaded from: classes10.dex */
public class sb0 {

    /* JADX INFO: renamed from: c */
    public int f163469c;

    /* JADX INFO: renamed from: j */
    public Act f163476j;

    /* JADX INFO: renamed from: k */
    public Calendar f163477k;

    /* JADX INFO: renamed from: l */
    public WheelView f163478l;

    /* JADX INFO: renamed from: m */
    public WheelView f163479m;

    /* JADX INFO: renamed from: n */
    public WheelView f163480n;

    /* JADX INFO: renamed from: o */
    public View f163481o;

    /* JADX INFO: renamed from: p */
    public GregorianCalendar f163482p;

    /* JADX INFO: renamed from: q */
    public GregorianCalendar f163483q;

    /* JADX INFO: renamed from: r */
    public GregorianCalendar f163484r;

    /* JADX INFO: renamed from: a */
    public ArrayList<Integer> f163467a = vwb.m200324f0(1, 3, 5, 7, 8, 10, 12);

    /* JADX INFO: renamed from: b */
    public final int f163468b = Constants.UPNP_MULTICAST_PORT;

    /* JADX INFO: renamed from: d */
    public int f163470d = 1;

    /* JADX INFO: renamed from: e */
    public int f163471e = 1;

    /* JADX INFO: renamed from: f */
    public int f163472f = Constants.UPNP_MULTICAST_PORT;

    /* JADX INFO: renamed from: g */
    public int f163473g = Constants.UPNP_MULTICAST_PORT;

    /* JADX INFO: renamed from: h */
    public int f163474h = 1;

    /* JADX INFO: renamed from: i */
    public int f163475i = 1;

    public sb0(Act act, View view) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US;
        this.f163482p = new GregorianCalendar(timeZone, locale);
        this.f163483q = new GregorianCalendar(TimeZone.getTimeZone("UTC"), locale);
        this.f163484r = new GregorianCalendar(TimeZone.getTimeZone("UTC"), locale);
        this.f163476j = act;
        this.f163481o = view;
    }

    /* JADX INFO: renamed from: k */
    public final int m183157k(int i, int i2) {
        if (i2 == 2) {
            return m183163q(i) ? 29 : 28;
        }
        return this.f163467a.contains(Integer.valueOf(i2)) ? 31 : 30;
    }

    /* JADX INFO: renamed from: l */
    public final void m183158l() {
        this.f163469c = this.f163483q.get(1);
        this.f163470d = this.f163483q.get(2) + 1;
        this.f163471e = this.f163483q.get(5);
    }

    /* JADX INFO: renamed from: m */
    public final void m183159m(WheelView wheelView, int i, int i2, int i3, boolean z, boolean z2) {
        Act act = this.f163476j;
        NumericWheelAdapter numericWheelAdapter = z2 ? new NumericWheelAdapter(act, i, i2, "%02d") : new NumericWheelAdapter(act, i, i2);
        wheelView.setViewAdapter(numericWheelAdapter);
        numericWheelAdapter.setTextColor(w0c0.f183831b);
        numericWheelAdapter.setTextSize(20);
        wheelView.setCyclic(z);
        wheelView.setCurrentItem(i3);
    }

    /* JADX INFO: renamed from: n */
    public final void m183160n(View view, int i, int i2) {
        int i3;
        if (this.f163480n == null) {
            WheelView wheelView = (WheelView) view.findViewById(u4c0.f173970Of);
            this.f163480n = wheelView;
            wheelView.addChangingListener(new OnWheelChangedListener() { // from class: l.pb0
                @Override // cn.qqtheme.framework.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView2, int i4, int i5) {
                    this.f148019a.m183164r(wheelView2, i4, i5);
                }
            });
            this.f163480n.addScrollingListener(new C19899c());
        }
        int iM183157k = m183157k(i, i2);
        if (this.f163471e > iM183157k) {
            this.f163471e = iM183157k;
        }
        this.f163475i = 0;
        if (this.f163470d != this.f163483q.get(2) + 1 || ((i3 = this.f163469c) != this.f163473g && i3 != this.f163472f)) {
            m183159m(this.f163480n, 1, iM183157k, this.f163471e - 1, true, true);
            this.f163480n.setEnableRange(null);
            return;
        }
        int i4 = this.f163483q.get(5);
        int i5 = this.f163484r.get(5);
        int i6 = this.f163469c;
        if (i6 == this.f163473g) {
            m183159m(this.f163480n, 1, iM183157k, Math.min(this.f163471e - 1, i4 - 1), false, true);
            this.f163480n.setEnableRange(new ItemsRange(0, i4));
        } else if (i6 == this.f163472f) {
            int i7 = i5 - 1;
            m183159m(this.f163480n, 1, iM183157k, Math.max(this.f163471e - 1, i7), false, true);
            this.f163480n.setEnableRange(new ItemsRange(i7, iM183157k));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m183161o(View view) {
        if (this.f163479m == null) {
            WheelView wheelView = (WheelView) view.findViewById(u4c0.f173987Pf);
            this.f163479m = wheelView;
            wheelView.addChangingListener(new OnWheelChangedListener() { // from class: l.rb0
                @Override // cn.qqtheme.framework.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView2, int i, int i2) {
                    this.f158572a.m183165s(wheelView2, i, i2);
                }
            });
            this.f163479m.addScrollingListener(new C19898b(view));
        }
        this.f163474h = 0;
        int i = this.f163483q.get(2);
        int i2 = this.f163484r.get(2);
        int i3 = this.f163469c;
        int i4 = this.f163473g;
        if (i3 != i4 && i3 != this.f163472f) {
            this.f163479m.setEnableRange(null);
            m183159m(this.f163479m, 1, 12, this.f163470d - 1, true, true);
            return;
        }
        WheelView wheelView2 = this.f163479m;
        if (i3 == i4) {
            m183159m(wheelView2, 1, 12, i, false, true);
            this.f163479m.setEnableRange(new ItemsRange(0, i + 1));
        } else {
            m183159m(wheelView2, 1, 12, i2, false, true);
            this.f163479m.setEnableRange(new ItemsRange(i2, 12));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m183162p(View view, int i) {
        this.f163477k.setTime(new Date(qib0.f154693H.guessedCurrentServerTime()));
        if (this.f163478l == null) {
            WheelView wheelView = (WheelView) view.findViewById(u4c0.f174004Qf);
            this.f163478l = wheelView;
            wheelView.addChangingListener(new OnWheelChangedListener() { // from class: l.qb0
                @Override // cn.qqtheme.framework.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView2, int i2, int i3) {
                    this.f153590a.m183166t(wheelView2, i2, i3);
                }
            });
            this.f163478l.addScrollingListener(new C19897a(view));
        }
        this.f163472f = this.f163484r.get(1);
        int i2 = this.f163483q.get(1);
        this.f163473g = i2;
        WheelView wheelView2 = this.f163478l;
        int i3 = this.f163472f;
        wheelView2.setEnableRange(new ItemsRange(i3 - 1900, (i2 - i3) + 1));
        m183159m(this.f163478l, Constants.UPNP_MULTICAST_PORT, this.f163477k.get(1), this.f163473g - 1900, false, false);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m183163q(int i) {
        return (i % 100 != 0 || i % 400 == 0) && i % 4 == 0;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m183164r(WheelView wheelView, int i, int i2) {
        this.f163471e = i2 + 1;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m183165s(WheelView wheelView, int i, int i2) {
        this.f163470d = i2 + 1;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m183166t(WheelView wheelView, int i, int i2) {
        this.f163469c = i2 + Constants.UPNP_MULTICAST_PORT;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m183167u(e30 e30Var, View view) {
        zvf0.m220396r("e_birthday_tips_done_button", "p_birthday_tips_view");
        this.f163478l.stopScrolling();
        this.f163479m.stopScrolling();
        this.f163480n.stopScrolling();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(this.f163469c, this.f163470d - 1, this.f163471e, 0, 0, 0);
        gregorianCalendar.set(14, 0);
        java.util.Date time = gregorianCalendar.getTime();
        if (time.compareTo(yij0.m214944V()) > 0) {
            lsi0.m151578h(R$string.f17651Co);
            return;
        }
        if (time.compareTo(new java.util.Date(this.f163484r.getTimeInMillis())) < 0) {
            lsi0.m151578h(R$string.f17621Bo);
            return;
        }
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        userMo223809clone.settings.birthdate = Double.valueOf(time.getTime());
        e30Var.call(userMo223809clone);
    }

    /* JADX INFO: renamed from: v */
    public final void m183168v(View view) {
        if (view.isEnabled()) {
            return;
        }
        view.setEnabled(true);
        view.setBackgroundColor(Color.parseColor("#d34530"));
    }

    /* JADX INFO: renamed from: w */
    public void m183169w(View view, View view2, final e30<User> e30Var) {
        java.util.Date date = new java.util.Date((long) CoreModule.f17545c.f19639e0.m169527p9().settings.birthdate.doubleValue());
        Calendar calendar = Calendar.getInstance();
        this.f163477k = calendar;
        calendar.setTime(date);
        this.f163482p.setTimeInMillis(yij0.m214944V().getTime());
        this.f163483q.setTimeInMillis(yij0.m214923A().getTime());
        this.f163484r.setTimeInMillis(yij0.m214936N().getTime());
        xdl0.m208345M0(view.findViewById(u4c0.f174498u7), true);
        view2.setOnClickListener(new View.OnClickListener() { // from class: l.ob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f142873a.m183167u(e30Var, view3);
            }
        });
        m183158l();
        m183162p(view, this.f163469c);
        m183161o(view);
        m183160n(view, this.f163469c, this.f163477k.get(2) + 1);
    }

    /* JADX INFO: renamed from: l.sb0$a */
    public class C19897a implements OnWheelScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f163485a;

        public C19897a(View view) {
            this.f163485a = view;
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            zvf0.m220396r("e_birthday_tips_calendar", "p_birthday_tips_view");
            sb0.this.m183161o(this.f163485a);
            sb0 sb0Var = sb0.this;
            sb0Var.m183160n(this.f163485a, sb0Var.f163469c, sb0.this.f163470d);
            sb0 sb0Var2 = sb0.this;
            sb0Var2.m183168v(sb0Var2.f163481o);
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    /* JADX INFO: renamed from: l.sb0$b */
    public class C19898b implements OnWheelScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f163487a;

        public C19898b(View view) {
            this.f163487a = view;
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            zvf0.m220396r("e_birthday_tips_calendar", "p_birthday_tips_view");
            sb0 sb0Var = sb0.this;
            sb0Var.m183160n(this.f163487a, sb0Var.f163469c, sb0.this.f163470d);
            sb0 sb0Var2 = sb0.this;
            sb0Var2.m183168v(sb0Var2.f163481o);
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    /* JADX INFO: renamed from: l.sb0$c */
    public class C19899c implements OnWheelScrollListener {
        public C19899c() {
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            zvf0.m220396r("e_birthday_tips_calendar", "p_birthday_tips_view");
            sb0 sb0Var = sb0.this;
            sb0Var.m183168v(sb0Var.f163481o);
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }
}

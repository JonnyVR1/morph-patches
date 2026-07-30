package p153l;

import android.graphics.Color;
import android.view.View;
import cn.qqtheme.framework.wheelview.ItemsRange;
import cn.qqtheme.framework.wheelview.OnWheelChangedListener;
import cn.qqtheme.framework.wheelview.OnWheelScrollListener;
import cn.qqtheme.framework.wheelview.WheelView;
import cn.qqtheme.framework.wheelview.adapter.NumericWheelAdapter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.User;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.fourthline.cling.model.Constants;

/* JADX INFO: loaded from: classes3.dex */
public class ob0 {

    /* JADX INFO: renamed from: c */
    public int f145783c;

    /* JADX INFO: renamed from: j */
    public Act f145790j;

    /* JADX INFO: renamed from: k */
    public Calendar f145791k;

    /* JADX INFO: renamed from: l */
    public WheelView f145792l;

    /* JADX INFO: renamed from: m */
    public WheelView f145793m;

    /* JADX INFO: renamed from: n */
    public WheelView f145794n;

    /* JADX INFO: renamed from: o */
    public View f145795o;

    /* JADX INFO: renamed from: p */
    public GregorianCalendar f145796p;

    /* JADX INFO: renamed from: q */
    public GregorianCalendar f145797q;

    /* JADX INFO: renamed from: r */
    public GregorianCalendar f145798r;

    /* JADX INFO: renamed from: a */
    public ArrayList<Integer> f145781a = jyb.m147507f0(1, 3, 5, 7, 8, 10, 12);

    /* JADX INFO: renamed from: b */
    public final int f145782b = Constants.UPNP_MULTICAST_PORT;

    /* JADX INFO: renamed from: d */
    public int f145784d = 1;

    /* JADX INFO: renamed from: e */
    public int f145785e = 1;

    /* JADX INFO: renamed from: f */
    public int f145786f = Constants.UPNP_MULTICAST_PORT;

    /* JADX INFO: renamed from: g */
    public int f145787g = Constants.UPNP_MULTICAST_PORT;

    /* JADX INFO: renamed from: h */
    public int f145788h = 1;

    /* JADX INFO: renamed from: i */
    public int f145789i = 1;

    public ob0(Act act, View view) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US;
        this.f145796p = new GregorianCalendar(timeZone, locale);
        this.f145797q = new GregorianCalendar(TimeZone.getTimeZone("UTC"), locale);
        this.f145798r = new GregorianCalendar(TimeZone.getTimeZone("UTC"), locale);
        this.f145790j = act;
        this.f145795o = view;
    }

    /* JADX INFO: renamed from: k */
    public final int m166890k(int i, int i2) {
        if (i2 == 2) {
            return m166896q(i) ? 29 : 28;
        }
        return this.f145781a.contains(Integer.valueOf(i2)) ? 31 : 30;
    }

    /* JADX INFO: renamed from: l */
    public final void m166891l() {
        this.f145783c = this.f145797q.get(1);
        this.f145784d = this.f145797q.get(2) + 1;
        this.f145785e = this.f145797q.get(5);
    }

    /* JADX INFO: renamed from: m */
    public final void m166892m(WheelView wheelView, int i, int i2, int i3, boolean z, boolean z2) {
        Act act = this.f145790j;
        NumericWheelAdapter numericWheelAdapter = z2 ? new NumericWheelAdapter(act, i, i2, "%02d") : new NumericWheelAdapter(act, i, i2);
        wheelView.setViewAdapter(numericWheelAdapter);
        numericWheelAdapter.setTextColor(c9c0.f80400b);
        numericWheelAdapter.setTextSize(20);
        wheelView.setCyclic(z);
        wheelView.setCurrentItem(i3);
    }

    /* JADX INFO: renamed from: n */
    public final void m166893n(View view, int i, int i2) {
        int i3;
        if (this.f145794n == null) {
            WheelView wheelView = (WheelView) view.findViewById(adc0.f70109Rf);
            this.f145794n = wheelView;
            wheelView.addChangingListener(new OnWheelChangedListener() { // from class: l.lb0
                @Override // cn.qqtheme.framework.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView2, int i4, int i5) {
                    this.f130760a.m166897r(wheelView2, i4, i5);
                }
            });
            this.f145794n.addScrollingListener(new C19070c());
        }
        int iM166890k = m166890k(i, i2);
        if (this.f145785e > iM166890k) {
            this.f145785e = iM166890k;
        }
        this.f145789i = 0;
        if (this.f145784d != this.f145797q.get(2) + 1 || ((i3 = this.f145783c) != this.f145787g && i3 != this.f145786f)) {
            m166892m(this.f145794n, 1, iM166890k, this.f145785e - 1, true, true);
            this.f145794n.setEnableRange(null);
            return;
        }
        int i4 = this.f145797q.get(5);
        int i5 = this.f145798r.get(5);
        int i6 = this.f145783c;
        if (i6 == this.f145787g) {
            m166892m(this.f145794n, 1, iM166890k, Math.min(this.f145785e - 1, i4 - 1), false, true);
            this.f145794n.setEnableRange(new ItemsRange(0, i4));
        } else if (i6 == this.f145786f) {
            int i7 = i5 - 1;
            m166892m(this.f145794n, 1, iM166890k, Math.max(this.f145785e - 1, i7), false, true);
            this.f145794n.setEnableRange(new ItemsRange(i7, iM166890k));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m166894o(View view) {
        if (this.f145793m == null) {
            WheelView wheelView = (WheelView) view.findViewById(adc0.f70126Sf);
            this.f145793m = wheelView;
            wheelView.addChangingListener(new OnWheelChangedListener() { // from class: l.nb0
                @Override // cn.qqtheme.framework.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView2, int i, int i2) {
                    this.f141062a.m166898s(wheelView2, i, i2);
                }
            });
            this.f145793m.addScrollingListener(new C19069b(view));
        }
        this.f145788h = 0;
        int i = this.f145797q.get(2);
        int i2 = this.f145798r.get(2);
        int i3 = this.f145783c;
        int i4 = this.f145787g;
        if (i3 != i4 && i3 != this.f145786f) {
            this.f145793m.setEnableRange(null);
            m166892m(this.f145793m, 1, 12, this.f145784d - 1, true, true);
            return;
        }
        WheelView wheelView2 = this.f145793m;
        if (i3 == i4) {
            m166892m(wheelView2, 1, 12, i, false, true);
            this.f145793m.setEnableRange(new ItemsRange(0, i + 1));
        } else {
            m166892m(wheelView2, 1, 12, i2, false, true);
            this.f145793m.setEnableRange(new ItemsRange(i2, 12));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m166895p(View view, int i) {
        this.f145791k.setTime(new Date(uqb0.f180376H.guessedCurrentServerTime()));
        if (this.f145792l == null) {
            WheelView wheelView = (WheelView) view.findViewById(adc0.f70143Tf);
            this.f145792l = wheelView;
            wheelView.addChangingListener(new OnWheelChangedListener() { // from class: l.mb0
                @Override // cn.qqtheme.framework.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView2, int i2, int i3) {
                    this.f135610a.m166899t(wheelView2, i2, i3);
                }
            });
            this.f145792l.addScrollingListener(new C19068a(view));
        }
        this.f145786f = this.f145798r.get(1);
        int i2 = this.f145797q.get(1);
        this.f145787g = i2;
        WheelView wheelView2 = this.f145792l;
        int i3 = this.f145786f;
        wheelView2.setEnableRange(new ItemsRange(i3 - 1900, (i2 - i3) + 1));
        m166892m(this.f145792l, Constants.UPNP_MULTICAST_PORT, this.f145791k.get(1), this.f145787g - 1900, false, false);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m166896q(int i) {
        return (i % 100 != 0 || i % 400 == 0) && i % 4 == 0;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m166897r(WheelView wheelView, int i, int i2) {
        this.f145785e = i2 + 1;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m166898s(WheelView wheelView, int i, int i2) {
        this.f145784d = i2 + 1;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m166899t(WheelView wheelView, int i, int i2) {
        this.f145783c = i2 + Constants.UPNP_MULTICAST_PORT;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m166900u(y20 y20Var, View view) {
        i4g0.m138520r("e_birthday_tips_done_button", "p_birthday_tips_view");
        this.f145792l.stopScrolling();
        this.f145793m.stopScrolling();
        this.f145794n.stopScrolling();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(this.f145783c, this.f145784d - 1, this.f145785e, 0, 0, 0);
        gregorianCalendar.set(14, 0);
        java.util.Date time = gregorianCalendar.getTime();
        if (time.compareTo(bsj0.m106264V()) > 0) {
            o1j0.m165634h(R$string.f19041Yo);
            return;
        }
        if (time.compareTo(new java.util.Date(this.f145798r.getTimeInMillis())) < 0) {
            o1j0.m165634h(R$string.f19011Xo);
            return;
        }
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        userMo225055clone.settings.birthdate = Double.valueOf(time.getTime());
        y20Var.call(userMo225055clone);
    }

    /* JADX INFO: renamed from: v */
    public final void m166901v(View view) {
        if (view.isEnabled()) {
            return;
        }
        view.setEnabled(true);
        view.setBackgroundColor(Color.parseColor("#d34530"));
    }

    /* JADX INFO: renamed from: w */
    public void m166902w(View view, View view2, final y20<User> y20Var) {
        java.util.Date date = new java.util.Date((long) CoreModule.f18264c.f20381e0.m116600p9().settings.birthdate.doubleValue());
        Calendar calendar = Calendar.getInstance();
        this.f145791k = calendar;
        calendar.setTime(date);
        this.f145796p.setTimeInMillis(bsj0.m106264V().getTime());
        this.f145797q.setTimeInMillis(bsj0.m106243A().getTime());
        this.f145798r.setTimeInMillis(bsj0.m106256N().getTime());
        bnl0.m105525M0(view.findViewById(adc0.f70623w7), true);
        view2.setOnClickListener(new View.OnClickListener() { // from class: l.kb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f124733a.m166900u(y20Var, view3);
            }
        });
        m166891l();
        m166895p(view, this.f145783c);
        m166894o(view);
        m166893n(view, this.f145783c, this.f145791k.get(2) + 1);
    }

    /* JADX INFO: renamed from: l.ob0$a */
    public class C19068a implements OnWheelScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f145799a;

        public C19068a(View view) {
            this.f145799a = view;
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            i4g0.m138520r("e_birthday_tips_calendar", "p_birthday_tips_view");
            ob0.this.m166894o(this.f145799a);
            ob0 ob0Var = ob0.this;
            ob0Var.m166893n(this.f145799a, ob0Var.f145783c, ob0.this.f145784d);
            ob0 ob0Var2 = ob0.this;
            ob0Var2.m166901v(ob0Var2.f145795o);
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    /* JADX INFO: renamed from: l.ob0$b */
    public class C19069b implements OnWheelScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f145801a;

        public C19069b(View view) {
            this.f145801a = view;
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            i4g0.m138520r("e_birthday_tips_calendar", "p_birthday_tips_view");
            ob0 ob0Var = ob0.this;
            ob0Var.m166893n(this.f145801a, ob0Var.f145783c, ob0.this.f145784d);
            ob0 ob0Var2 = ob0.this;
            ob0Var2.m166901v(ob0Var2.f145795o);
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    /* JADX INFO: renamed from: l.ob0$c */
    public class C19070c implements OnWheelScrollListener {
        public C19070c() {
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            i4g0.m138520r("e_birthday_tips_calendar", "p_birthday_tips_view");
            ob0 ob0Var = ob0.this;
            ob0Var.m166901v(ob0Var.f145795o);
        }

        @Override // cn.qqtheme.framework.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }
}

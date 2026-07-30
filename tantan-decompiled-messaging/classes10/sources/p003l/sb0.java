package p003l;

import android.graphics.Color;
import android.view.View;
import cn.qqtheme.framework.wheelview.ItemsRange;
import cn.qqtheme.framework.wheelview.OnWheelChangedListener;
import cn.qqtheme.framework.wheelview.OnWheelScrollListener;
import cn.qqtheme.framework.wheelview.WheelView;
import cn.qqtheme.framework.wheelview.adapter.NumericWheelAdapter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import l.e30;
import l.lsi0;
import l.qib0;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.xdl0;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sb0 {

    /* JADX INFO: renamed from: c */
    public int f7324c;

    /* JADX INFO: renamed from: j */
    public Act f7331j;

    /* JADX INFO: renamed from: k */
    public Calendar f7332k;

    /* JADX INFO: renamed from: l */
    public WheelView f7333l;

    /* JADX INFO: renamed from: m */
    public WheelView f7334m;

    /* JADX INFO: renamed from: n */
    public WheelView f7335n;

    /* JADX INFO: renamed from: o */
    public View f7336o;

    /* JADX INFO: renamed from: p */
    public GregorianCalendar f7337p;

    /* JADX INFO: renamed from: q */
    public GregorianCalendar f7338q;

    /* JADX INFO: renamed from: r */
    public GregorianCalendar f7339r;

    /* JADX INFO: renamed from: a */
    public ArrayList<Integer> f7322a = vwb.f0(new Integer[]{1, 3, 5, 7, 8, 10, 12});

    /* JADX INFO: renamed from: b */
    public final int f7323b = 1900;

    /* JADX INFO: renamed from: d */
    public int f7325d = 1;

    /* JADX INFO: renamed from: e */
    public int f7326e = 1;

    /* JADX INFO: renamed from: f */
    public int f7327f = 1900;

    /* JADX INFO: renamed from: g */
    public int f7328g = 1900;

    /* JADX INFO: renamed from: h */
    public int f7329h = 1;

    /* JADX INFO: renamed from: i */
    public int f7330i = 1;

    public sb0(Act act, View view) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US;
        this.f7337p = new GregorianCalendar(timeZone, locale);
        this.f7338q = new GregorianCalendar(TimeZone.getTimeZone("UTC"), locale);
        this.f7339r = new GregorianCalendar(TimeZone.getTimeZone("UTC"), locale);
        this.f7331j = act;
        this.f7336o = view;
    }

    /* JADX INFO: renamed from: k */
    public final int m9284k(int i, int i2) {
        if (i2 == 2) {
            return m9290q(i) ? 29 : 28;
        }
        return this.f7322a.contains(Integer.valueOf(i2)) ? 31 : 30;
    }

    /* JADX INFO: renamed from: l */
    public final void m9285l() {
        this.f7324c = this.f7338q.get(1);
        this.f7325d = this.f7338q.get(2) + 1;
        this.f7326e = this.f7338q.get(5);
    }

    /* JADX INFO: renamed from: m */
    public final void m9286m(WheelView wheelView, int i, int i2, int i3, boolean z, boolean z2) {
        Act act = this.f7331j;
        NumericWheelAdapter numericWheelAdapter = z2 ? new NumericWheelAdapter(act, i, i2, "%02d") : new NumericWheelAdapter(act, i, i2);
        wheelView.setViewAdapter(numericWheelAdapter);
        numericWheelAdapter.setTextColor(w0c0.b);
        numericWheelAdapter.setTextSize(20);
        wheelView.setCyclic(z);
        wheelView.setCurrentItem(i3);
    }

    /* JADX INFO: renamed from: n */
    public final void m9287n(View view, int i, int i2) {
        int i3;
        if (this.f7335n == null) {
            WheelView wheelViewFindViewById = view.findViewById(u4c0.Of);
            this.f7335n = wheelViewFindViewById;
            wheelViewFindViewById.addChangingListener(new OnWheelChangedListener() { // from class: l.pb0
                public final void onChanged(WheelView wheelView, int i4, int i5) {
                    this.f6844a.m9291r(wheelView, i4, i5);
                }
            });
            this.f7335n.addScrollingListener(new C3426c());
        }
        int iM9284k = m9284k(i, i2);
        if (this.f7326e > iM9284k) {
            this.f7326e = iM9284k;
        }
        this.f7330i = 0;
        if (this.f7325d != this.f7338q.get(2) + 1 || ((i3 = this.f7324c) != this.f7328g && i3 != this.f7327f)) {
            m9286m(this.f7335n, 1, iM9284k, this.f7326e - 1, true, true);
            this.f7335n.setEnableRange((ItemsRange) null);
            return;
        }
        int i4 = this.f7338q.get(5);
        int i5 = this.f7339r.get(5);
        int i6 = this.f7324c;
        if (i6 == this.f7328g) {
            m9286m(this.f7335n, 1, iM9284k, Math.min(this.f7326e - 1, i4 - 1), false, true);
            this.f7335n.setEnableRange(new ItemsRange(0, i4));
        } else if (i6 == this.f7327f) {
            int i7 = i5 - 1;
            m9286m(this.f7335n, 1, iM9284k, Math.max(this.f7326e - 1, i7), false, true);
            this.f7335n.setEnableRange(new ItemsRange(i7, iM9284k));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m9288o(View view) {
        if (this.f7334m == null) {
            WheelView wheelViewFindViewById = view.findViewById(u4c0.Pf);
            this.f7334m = wheelViewFindViewById;
            wheelViewFindViewById.addChangingListener(new OnWheelChangedListener() { // from class: l.rb0
                public final void onChanged(WheelView wheelView, int i, int i2) {
                    this.f7164a.m9292s(wheelView, i, i2);
                }
            });
            this.f7334m.addScrollingListener(new C3425b(view));
        }
        this.f7329h = 0;
        int i = this.f7338q.get(2);
        int i2 = this.f7339r.get(2);
        int i3 = this.f7324c;
        int i4 = this.f7328g;
        if (i3 != i4 && i3 != this.f7327f) {
            this.f7334m.setEnableRange((ItemsRange) null);
            m9286m(this.f7334m, 1, 12, this.f7325d - 1, true, true);
            return;
        }
        WheelView wheelView = this.f7334m;
        if (i3 == i4) {
            m9286m(wheelView, 1, 12, i, false, true);
            this.f7334m.setEnableRange(new ItemsRange(0, i + 1));
        } else {
            m9286m(wheelView, 1, 12, i2, false, true);
            this.f7334m.setEnableRange(new ItemsRange(i2, 12));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m9289p(View view, int i) {
        this.f7332k.setTime(new Date(qib0.H.guessedCurrentServerTime()));
        if (this.f7333l == null) {
            WheelView wheelViewFindViewById = view.findViewById(u4c0.Qf);
            this.f7333l = wheelViewFindViewById;
            wheelViewFindViewById.addChangingListener(new OnWheelChangedListener() { // from class: l.qb0
                public final void onChanged(WheelView wheelView, int i2, int i3) {
                    this.f7000a.m9293t(wheelView, i2, i3);
                }
            });
            this.f7333l.addScrollingListener(new C3424a(view));
        }
        this.f7327f = this.f7339r.get(1);
        int i2 = this.f7338q.get(1);
        this.f7328g = i2;
        WheelView wheelView = this.f7333l;
        int i3 = this.f7327f;
        wheelView.setEnableRange(new ItemsRange(i3 - 1900, (i2 - i3) + 1));
        m9286m(this.f7333l, 1900, this.f7332k.get(1), this.f7328g - 1900, false, false);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9290q(int i) {
        return (i % 100 != 0 || i % 400 == 0) && i % 4 == 0;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m9291r(WheelView wheelView, int i, int i2) {
        this.f7326e = i2 + 1;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m9292s(WheelView wheelView, int i, int i2) {
        this.f7325d = i2 + 1;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m9293t(WheelView wheelView, int i, int i2) {
        this.f7324c = i2 + 1900;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m9294u(e30 e30Var, View view) {
        zvf0.r("e_birthday_tips_done_button", "p_birthday_tips_view");
        this.f7333l.stopScrolling();
        this.f7334m.stopScrolling();
        this.f7335n.stopScrolling();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(this.f7324c, this.f7325d - 1, this.f7326e, 0, 0, 0);
        gregorianCalendar.set(14, 0);
        java.util.Date time = gregorianCalendar.getTime();
        if (time.compareTo(yij0.V()) > 0) {
            lsi0.h(R.string.Co);
            return;
        }
        if (time.compareTo(new java.util.Date(this.f7339r.getTimeInMillis())) < 0) {
            lsi0.h(R.string.Bo);
            return;
        }
        User userClone = CoreModule.c.e0.p9().clone();
        userClone.settings.birthdate = Double.valueOf(time.getTime());
        e30Var.call(userClone);
    }

    /* JADX INFO: renamed from: v */
    public final void m9295v(View view) {
        if (view.isEnabled()) {
            return;
        }
        view.setEnabled(true);
        view.setBackgroundColor(Color.parseColor("#d34530"));
    }

    /* JADX INFO: renamed from: w */
    public void m9296w(View view, View view2, final e30<User> e30Var) {
        java.util.Date date = new java.util.Date((long) CoreModule.c.e0.p9().settings.birthdate.doubleValue());
        Calendar calendar = Calendar.getInstance();
        this.f7332k = calendar;
        calendar.setTime(date);
        this.f7337p.setTimeInMillis(yij0.V().getTime());
        this.f7338q.setTimeInMillis(yij0.A().getTime());
        this.f7339r.setTimeInMillis(yij0.N().getTime());
        xdl0.M0(view.findViewById(u4c0.u7), true);
        view2.setOnClickListener(new View.OnClickListener() { // from class: l.ob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f6640a.m9294u(e30Var, view3);
            }
        });
        m9285l();
        m9289p(view, this.f7324c);
        m9288o(view);
        m9287n(view, this.f7324c, this.f7332k.get(2) + 1);
    }

    /* JADX INFO: renamed from: l.sb0$a */
    public class C3424a implements OnWheelScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f7340a;

        public C3424a(View view) {
            this.f7340a = view;
        }

        public void onScrollingFinished(WheelView wheelView) {
            zvf0.r("e_birthday_tips_calendar", "p_birthday_tips_view");
            sb0.this.m9288o(this.f7340a);
            sb0 sb0Var = sb0.this;
            sb0Var.m9287n(this.f7340a, sb0Var.f7324c, sb0.this.f7325d);
            sb0 sb0Var2 = sb0.this;
            sb0Var2.m9295v(sb0Var2.f7336o);
        }

        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    /* JADX INFO: renamed from: l.sb0$b */
    public class C3425b implements OnWheelScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f7342a;

        public C3425b(View view) {
            this.f7342a = view;
        }

        public void onScrollingFinished(WheelView wheelView) {
            zvf0.r("e_birthday_tips_calendar", "p_birthday_tips_view");
            sb0 sb0Var = sb0.this;
            sb0Var.m9287n(this.f7342a, sb0Var.f7324c, sb0.this.f7325d);
            sb0 sb0Var2 = sb0.this;
            sb0Var2.m9295v(sb0Var2.f7336o);
        }

        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    /* JADX INFO: renamed from: l.sb0$c */
    public class C3426c implements OnWheelScrollListener {
        public C3426c() {
        }

        public void onScrollingFinished(WheelView wheelView) {
            zvf0.r("e_birthday_tips_calendar", "p_birthday_tips_view");
            sb0 sb0Var = sb0.this;
            sb0Var.m9295v(sb0Var.f7336o);
        }

        public void onScrollingStarted(WheelView wheelView) {
        }
    }
}

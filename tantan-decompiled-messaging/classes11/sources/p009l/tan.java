package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.Calendar;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.qib0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tan {

    /* JADX INFO: renamed from: a */
    public static final zpd0 f20591a = new zpd0("af_retention_day0_time", -1L);

    /* JADX INFO: renamed from: b */
    public static final zpd0 f20592b = new zpd0("app_last_retention_time", -1L);

    /* JADX INFO: renamed from: c */
    public static final hpd0 f20593c;

    /* JADX INFO: renamed from: d */
    public static final hpd0 f20594d;

    /* JADX INFO: renamed from: e */
    public static boolean f20595e;

    static {
        Boolean bool = Boolean.FALSE;
        f20593c = new hpd0("intl.event.D1-D2_retention", bool);
        f20594d = new hpd0("intl.event.D1-D3_retention", bool);
        f20595e = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m22473a(Act.r rVar) {
        if (rVar != null) {
            zpd0 zpd0Var = f20591a;
            if (((Long) zpd0Var.get()).longValue() < 0) {
                return;
            }
            long jGuessedCurrentServerTime = qib0.H.guessedCurrentServerTime();
            zpd0 zpd0Var2 = f20592b;
            if (((Long) zpd0Var2.get()).longValue() < jGuessedCurrentServerTime) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jGuessedCurrentServerTime);
                calendar.set(11, 24);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(((Long) zpd0Var.get()).longValue());
                calendar2.set(11, 24);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                int timeInMillis = calendar2.getTimeInMillis() < calendar.getTimeInMillis() ? (int) ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000) : -1;
                if (timeInMillis == 1) {
                    qib0.e1("Day1_retention", new Object[0]);
                } else if (timeInMillis == 2) {
                    qib0.e1("Day2_retention", new Object[0]);
                } else if (timeInMillis == 3) {
                    qib0.e1("Day3_retention", new Object[0]);
                } else if (timeInMillis == 7) {
                    qib0.e1("Day7_retention", new Object[0]);
                } else if (timeInMillis == 14) {
                    qib0.e1("Day14_retention", new Object[0]);
                } else if (timeInMillis == 30) {
                    qib0.e1("Day30_retention", new Object[0]);
                }
                if (timeInMillis <= 2) {
                    hpd0 hpd0Var = f20593c;
                    if (!((Boolean) hpd0Var.get()).booleanValue()) {
                        qib0.e1("D1-D2_retention", new Object[0]);
                        hpd0Var.put(Boolean.TRUE);
                    }
                }
                if (timeInMillis <= 3) {
                    hpd0 hpd0Var2 = f20594d;
                    if (!((Boolean) hpd0Var2.get()).booleanValue()) {
                        qib0.e1("D1-D3_retention", new Object[0]);
                        hpd0Var2.put(Boolean.TRUE);
                    }
                }
                zpd0Var2.put(Long.valueOf(calendar.getTimeInMillis()));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m22474b() {
        try {
            User userMe_ = qib0.c0.me_();
            if (userMe_ != null) {
                if (TEnum.equals(userMe_.gender, "female")) {
                    qib0.e1("signin_female_fb", new Object[0]);
                    qib0.e1("signin_female", new Object[0]);
                } else if (TEnum.equals(userMe_.gender, "male")) {
                    qib0.e1("signin_male_fb", new Object[0]);
                    qib0.e1("signin_male", new Object[0]);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m22475c() {
        User userMe_ = qib0.c0.me_();
        if (userMe_ != null) {
            if (TEnum.equals(userMe_.gender, "female")) {
                qib0.e1("signin_female_ph", new Object[0]);
                qib0.e1("signin_female", new Object[0]);
            } else if (TEnum.equals(userMe_.gender, "male")) {
                qib0.e1("signin_male_ph", new Object[0]);
                qib0.e1("signin_male", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m22476d() {
        zpd0 zpd0Var = f20591a;
        if (((Long) zpd0Var.get()).longValue() < 0) {
            zpd0Var.put(Long.valueOf(qib0.H.guessedCurrentServerTime()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m22477e(User user) {
        if (user.age.intValue() >= 18 && user.age.intValue() <= 22) {
            qib0.e1(TEnum.equals(user.gender, "female") ? "tantan_female_18to22" : "tantan_male_18to22", new Object[0]);
        } else if (user.age.intValue() >= 23 && user.age.intValue() <= 30) {
            qib0.e1(TEnum.equals(user.gender, "female") ? "tantan_female_23to30" : "tantan_male_23to30", new Object[0]);
        } else if (user.age.intValue() < 31 || user.age.intValue() > 39) {
            qib0.e1(TEnum.equals(user.gender, "female") ? "tantan_female_over39" : "tantan_male_over39", new Object[0]);
        } else {
            qib0.e1(TEnum.equals(user.gender, "female") ? "tantan_female_31to39" : "tantan_male_31to39", new Object[0]);
        }
        if (user.age.intValue() < 18 || user.age.intValue() > 39) {
            return;
        }
        qib0.e1(TEnum.equals(user.gender, "female") ? "tantan_female_18to39" : "tantan_male_18to39", new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public static void m22478f() {
        Act.foreground().subscribe(mkd0.G(new e30() { // from class: l.san
            public final void call(Object obj) {
                tan.m22473a((Act.r) obj);
            }
        }));
    }
}

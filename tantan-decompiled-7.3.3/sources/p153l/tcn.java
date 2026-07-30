package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.Calendar;

/* JADX INFO: loaded from: classes10.dex */
public class tcn {

    /* JADX INFO: renamed from: a */
    public static final byd0 f173261a = new byd0("af_retention_day0_time", -1L);

    /* JADX INFO: renamed from: b */
    public static final byd0 f173262b = new byd0("app_last_retention_time", -1L);

    /* JADX INFO: renamed from: c */
    public static final jxd0 f173263c;

    /* JADX INFO: renamed from: d */
    public static final jxd0 f173264d;

    /* JADX INFO: renamed from: e */
    public static boolean f173265e;

    static {
        Boolean bool = Boolean.FALSE;
        f173263c = new jxd0("intl.event.D1-D2_retention", bool);
        f173264d = new jxd0("intl.event.D1-D3_retention", bool);
        f173265e = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m190484a(Act.C4450r c4450r) {
        if (c4450r != null) {
            byd0 byd0Var = f173261a;
            if (byd0Var.get().longValue() < 0) {
                return;
            }
            long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
            byd0 byd0Var2 = f173262b;
            if (byd0Var2.get().longValue() < jGuessedCurrentServerTime) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jGuessedCurrentServerTime);
                calendar.set(11, 24);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(byd0Var.get().longValue());
                calendar2.set(11, 24);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                int timeInMillis = calendar2.getTimeInMillis() < calendar.getTimeInMillis() ? (int) ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000) : -1;
                if (timeInMillis == 1) {
                    uqb0.m197269e1("Day1_retention", new Object[0]);
                } else if (timeInMillis == 2) {
                    uqb0.m197269e1("Day2_retention", new Object[0]);
                } else if (timeInMillis == 3) {
                    uqb0.m197269e1("Day3_retention", new Object[0]);
                } else if (timeInMillis == 7) {
                    uqb0.m197269e1("Day7_retention", new Object[0]);
                } else if (timeInMillis == 14) {
                    uqb0.m197269e1("Day14_retention", new Object[0]);
                } else if (timeInMillis == 30) {
                    uqb0.m197269e1("Day30_retention", new Object[0]);
                }
                if (timeInMillis <= 2) {
                    jxd0 jxd0Var = f173263c;
                    if (!jxd0Var.get().booleanValue()) {
                        uqb0.m197269e1("D1-D2_retention", new Object[0]);
                        jxd0Var.put(Boolean.TRUE);
                    }
                }
                if (timeInMillis <= 3) {
                    jxd0 jxd0Var2 = f173264d;
                    if (!jxd0Var2.get().booleanValue()) {
                        uqb0.m197269e1("D1-D3_retention", new Object[0]);
                        jxd0Var2.put(Boolean.TRUE);
                    }
                }
                byd0Var2.put(Long.valueOf(calendar.getTimeInMillis()));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m190485b() {
        try {
            User userMe_ = uqb0.f180397c0.me_();
            if (userMe_ != null) {
                if (TEnum.equals(userMe_.gender, "female")) {
                    uqb0.m197269e1("signin_female_fb", new Object[0]);
                    uqb0.m197269e1("signin_female", new Object[0]);
                } else if (TEnum.equals(userMe_.gender, "male")) {
                    uqb0.m197269e1("signin_male_fb", new Object[0]);
                    uqb0.m197269e1("signin_male", new Object[0]);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m190486c() {
        User userMe_ = uqb0.f180397c0.me_();
        if (userMe_ != null) {
            if (TEnum.equals(userMe_.gender, "female")) {
                uqb0.m197269e1("signin_female_ph", new Object[0]);
                uqb0.m197269e1("signin_female", new Object[0]);
            } else if (TEnum.equals(userMe_.gender, "male")) {
                uqb0.m197269e1("signin_male_ph", new Object[0]);
                uqb0.m197269e1("signin_male", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m190487d() {
        byd0 byd0Var = f173261a;
        if (byd0Var.get().longValue() < 0) {
            byd0Var.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m190488e(User user) {
        if (user.age.intValue() >= 18 && user.age.intValue() <= 22) {
            uqb0.m197269e1(TEnum.equals(user.gender, "female") ? "tantan_female_18to22" : "tantan_male_18to22", new Object[0]);
        } else if (user.age.intValue() >= 23 && user.age.intValue() <= 30) {
            uqb0.m197269e1(TEnum.equals(user.gender, "female") ? "tantan_female_23to30" : "tantan_male_23to30", new Object[0]);
        } else if (user.age.intValue() < 31 || user.age.intValue() > 39) {
            uqb0.m197269e1(TEnum.equals(user.gender, "female") ? "tantan_female_over39" : "tantan_male_over39", new Object[0]);
        } else {
            uqb0.m197269e1(TEnum.equals(user.gender, "female") ? "tantan_female_31to39" : "tantan_male_31to39", new Object[0]);
        }
        if (user.age.intValue() < 18 || user.age.intValue() > 39) {
            return;
        }
        uqb0.m197269e1(TEnum.equals(user.gender, "female") ? "tantan_female_18to39" : "tantan_male_18to39", new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public static void m190489f() {
        Act.foreground().subscribe(psd0.m173596G(new y20() { // from class: l.scn
            @Override // p153l.y20
            public final void call(Object obj) {
                tcn.m190484a((Act.C4450r) obj);
            }
        }));
    }
}

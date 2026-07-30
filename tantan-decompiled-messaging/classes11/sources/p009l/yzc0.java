package p009l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Locale;
import l.eqh0;
import l.hpd0;
import l.j760;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.zpd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yzc0 {

    /* JADX INFO: renamed from: h */
    public static yzc0 f23298h;

    /* JADX INFO: renamed from: a */
    public a<Boolean> f23299a;

    /* JADX INFO: renamed from: b */
    public boolean f23300b;

    /* JADX INFO: renamed from: c */
    public final zpd0 f23301c;

    /* JADX INFO: renamed from: d */
    public uqd0 f23302d;

    /* JADX INFO: renamed from: e */
    public tpd0 f23303e;

    /* JADX INFO: renamed from: f */
    public tpd0 f23304f;

    /* JADX INFO: renamed from: g */
    public hpd0 f23305g;

    public yzc0() {
        Boolean bool = Boolean.FALSE;
        this.f23299a = a.c(bool);
        this.f23300b = false;
        this.f23301c = new zpd0("business_entrance_last_show_time" + CoreModule.H().userId(), 0L);
        this.f23302d = new uqd0("see_anim_will_random_user_id" + CoreModule.H().userId(), "");
        this.f23303e = new tpd0("last_total_likes_count" + CoreModule.H().userId(), 0);
        this.f23304f = new tpd0("last_new_likes_count" + CoreModule.H().userId(), 0);
        this.f23305g = new hpd0("today_new_likes_changed" + CoreModule.H().userId(), bool);
    }

    /* JADX INFO: renamed from: a */
    public static j760<String, String> m25565a(int i) {
        String strValueOf;
        String str = "km";
        if (i > 99000) {
            strValueOf = "99+";
        } else if (i > 1000) {
            strValueOf = String.valueOf(i / 1000);
        } else {
            str = "m";
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        return vwb.Y(strValueOf, str);
    }

    /* JADX INFO: renamed from: b */
    public static yzc0 m25566b() {
        if (f23298h == null) {
            synchronized (yzc0.class) {
                try {
                    if (f23298h == null) {
                        f23298h = new yzc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23298h;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m25567d(User user, User user2) {
        return m25568e(user, user2);
    }

    /* JADX INFO: renamed from: e */
    public static CharSequence m25568e(User user, User user2) {
        String strReplace;
        j760 j760VarY;
        int i = user2.location.distance;
        j760<String, String> j760VarM25565a = m25565a(i);
        String str = (String) j760VarM25565a.a;
        String str2 = (String) j760VarM25565a.b;
        String str3 = user2.location.region.district;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str + str2);
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        arrayList.add(String.valueOf(user2.age));
        if (m25569h()) {
            arrayList.add("岁");
            if (i > 10000) {
                j760VarY = (TextUtils.isEmpty(str3) || CoreModule.c.e0.p9() == null || !str3.equals(CoreModule.c.e0.p9().location.region.district)) ? vwb.Y("其中有个%S_One_Gender%%S_Age%岁...", (Object) null) : vwb.Y("其中1%S_One_Gender%%S_Age%岁，在%S_City%...", (Object) null);
            } else {
                j760VarY = vwb.Y("其中1%S_One_Gender%%S_Age%岁，离你%S_Distance%...", (Object) null);
            }
            strReplace = (String) j760VarY.a;
            if (strReplace.contains("%S_One_Gender%")) {
                if (TEnum.equals(user2.gender, "male")) {
                    strReplace = strReplace.replace("%S_One_Gender%", i > 10000 ? "帅哥" : "人");
                } else if (TEnum.equals(user2.gender, "female")) {
                    strReplace = strReplace.replace("%S_One_Gender%", i > 10000 ? "妹子" : "人");
                } else {
                    strReplace = strReplace.replace("%S_One_Gender%", "人");
                }
            }
            if (strReplace.contains("S_Age")) {
                strReplace = strReplace.replace("%S_Age%", String.valueOf(user2.age));
            }
            if (strReplace.contains("S_Distance")) {
                strReplace = strReplace.replace("%S_Distance%", str + str2);
            }
            if (strReplace.contains("S_City")) {
                strReplace = strReplace.replace("%S_City%", str3);
            }
        } else if (i <= 10000) {
            strReplace = String.format("Someone's %s y/o ; %s away", user2.age, str + str2);
        } else if (TextUtils.isEmpty(str3) || !TextUtils.equals(str3, user.location.region.district)) {
            strReplace = String.format("%s's %s y/o...", TEnum.equals(user2.gender, "male") ? "He" : "She", user2.age);
        } else {
            strReplace = String.format("Someone's %s y/o ; in %s...", user2.age, str3);
        }
        return i0g0.m16129b0(strReplace, arrayList, Color.parseColor("#edb044"), eqh0.c(3));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m25569h() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m25570j(int i) {
        if (m25569h()) {
            return "谁喜欢我:%S_Count%%S_Gender%待配对".replace("%S_Count%", i < 99 ? String.valueOf(i) : "99+").replace("%S_Gender%", "人");
        }
        return String.format("%s people liked you", i0g0.m16108G(i));
    }

    /* JADX INFO: renamed from: c */
    public int m25571c() {
        return ((Integer) this.f23304f.get()).intValue();
    }

    /* JADX INFO: renamed from: f */
    public String m25572f() {
        return (String) this.f23302d.get();
    }

    /* JADX INFO: renamed from: g */
    public boolean m25573g() {
        return !mqi0.m18535D(((Long) this.f23301c.get()).longValue());
    }

    /* JADX INFO: renamed from: i */
    public void m25574i() {
        this.f23301c.put(Long.valueOf(mqi0.m18550o()));
    }

    /* JADX INFO: renamed from: k */
    public void m25575k(int i) {
        this.f23304f.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: l */
    public void m25576l(boolean z) {
        this.f23305g.put(Boolean.valueOf(z));
    }
}

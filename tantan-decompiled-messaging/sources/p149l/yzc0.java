package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Locale;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class yzc0 {

    /* JADX INFO: renamed from: h */
    public static yzc0 f200858h;

    /* JADX INFO: renamed from: a */
    public C22392a<Boolean> f200859a;

    /* JADX INFO: renamed from: b */
    public boolean f200860b;

    /* JADX INFO: renamed from: c */
    public final zpd0 f200861c;

    /* JADX INFO: renamed from: d */
    public uqd0 f200862d;

    /* JADX INFO: renamed from: e */
    public tpd0 f200863e;

    /* JADX INFO: renamed from: f */
    public tpd0 f200864f;

    /* JADX INFO: renamed from: g */
    public hpd0 f200865g;

    public yzc0() {
        Boolean bool = Boolean.FALSE;
        this.f200859a = C22392a.m221513c(bool);
        this.f200860b = false;
        this.f200861c = new zpd0("business_entrance_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f200862d = new uqd0("see_anim_will_random_user_id" + CoreModule.m29931H().userId(), "");
        this.f200863e = new tpd0("last_total_likes_count" + CoreModule.m29931H().userId(), 0);
        this.f200864f = new tpd0("last_new_likes_count" + CoreModule.m29931H().userId(), 0);
        this.f200865g = new hpd0("today_new_likes_changed" + CoreModule.m29931H().userId(), bool);
    }

    /* JADX INFO: renamed from: a */
    public static j760<String, String> m216633a(int i) {
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
        return vwb.m200311Y(strValueOf, str);
    }

    /* JADX INFO: renamed from: b */
    public static yzc0 m216634b() {
        if (f200858h == null) {
            synchronized (yzc0.class) {
                try {
                    if (f200858h == null) {
                        f200858h = new yzc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f200858h;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m216635d(User user, User user2) {
        return m216636e(user, user2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static CharSequence m216636e(User user, User user2) {
        String strReplace;
        j760 j760VarM200311Y;
        int i = user2.location.distance;
        j760<String, String> j760VarM216633a = m216633a(i);
        String str = j760VarM216633a.f116564a;
        String str2 = j760VarM216633a.f116565b;
        String str3 = user2.location.region.district;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str + str2);
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        arrayList.add(String.valueOf(user2.age));
        if (m216637h()) {
            arrayList.add("岁");
            if (i > 10000) {
                j760VarM200311Y = (TextUtils.isEmpty(str3) || CoreModule.f17545c.f19639e0.m169527p9() == null || !str3.equals(CoreModule.f17545c.f19639e0.m169527p9().location.region.district)) ? vwb.m200311Y("其中有个%S_One_Gender%%S_Age%岁...", null) : vwb.m200311Y("其中1%S_One_Gender%%S_Age%岁，在%S_City%...", null);
            } else {
                j760VarM200311Y = vwb.m200311Y("其中1%S_One_Gender%%S_Age%岁，离你%S_Distance%...", null);
            }
            strReplace = (String) j760VarM200311Y.f116564a;
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
        return i0g0.m133861b0(strReplace, arrayList, Color.parseColor("#edb044"), eqh0.m117752c(3));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m216637h() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m81303a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m216638j(int i) {
        if (m216637h()) {
            return "谁喜欢我:%S_Count%%S_Gender%待配对".replace("%S_Count%", i < 99 ? String.valueOf(i) : "99+").replace("%S_Gender%", "人");
        }
        return String.format("%s people liked you", i0g0.m133840G(i));
    }

    /* JADX INFO: renamed from: c */
    public int m216639c() {
        return this.f200864f.get().intValue();
    }

    /* JADX INFO: renamed from: f */
    public String m216640f() {
        return this.f200862d.get();
    }

    /* JADX INFO: renamed from: g */
    public boolean m216641g() {
        return !mqi0.m155929D(this.f200861c.get().longValue());
    }

    /* JADX INFO: renamed from: i */
    public void m216642i() {
        this.f200861c.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: k */
    public void m216643k(int i) {
        this.f200864f.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: l */
    public void m216644l(boolean z) {
        this.f200865g.put(Boolean.valueOf(z));
    }
}

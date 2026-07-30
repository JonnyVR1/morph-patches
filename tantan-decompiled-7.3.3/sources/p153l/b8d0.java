package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Locale;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class b8d0 {

    /* JADX INFO: renamed from: h */
    public static b8d0 f75419h;

    /* JADX INFO: renamed from: a */
    public C22507a<Boolean> f75420a;

    /* JADX INFO: renamed from: b */
    public boolean f75421b;

    /* JADX INFO: renamed from: c */
    public final byd0 f75422c;

    /* JADX INFO: renamed from: d */
    public wyd0 f75423d;

    /* JADX INFO: renamed from: e */
    public vxd0 f75424e;

    /* JADX INFO: renamed from: f */
    public vxd0 f75425f;

    /* JADX INFO: renamed from: g */
    public jxd0 f75426g;

    public b8d0() {
        Boolean bool = Boolean.FALSE;
        this.f75420a = C22507a.m222759c(bool);
        this.f75421b = false;
        this.f75422c = new byd0("business_entrance_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f75423d = new wyd0("see_anim_will_random_user_id" + CoreModule.m30929H().userId(), "");
        this.f75424e = new vxd0("last_total_likes_count" + CoreModule.m30929H().userId(), 0);
        this.f75425f = new vxd0("last_new_likes_count" + CoreModule.m30929H().userId(), 0);
        this.f75426g = new jxd0("today_new_likes_changed" + CoreModule.m30929H().userId(), bool);
    }

    /* JADX INFO: renamed from: a */
    public static pf60<String, String> m102962a(int i) {
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
        return jyb.m147494Y(strValueOf, str);
    }

    /* JADX INFO: renamed from: b */
    public static b8d0 m102963b() {
        if (f75419h == null) {
            synchronized (b8d0.class) {
                try {
                    if (f75419h == null) {
                        f75419h = new b8d0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f75419h;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m102964d(User user, User user2) {
        return m102965e(user, user2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static CharSequence m102965e(User user, User user2) {
        String strReplace;
        pf60 pf60VarM147494Y;
        int i = user2.location.distance;
        pf60<String, String> pf60VarM102962a = m102962a(i);
        String str = pf60VarM102962a.f152156a;
        String str2 = pf60VarM102962a.f152157b;
        String str3 = user2.location.region.district;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str + str2);
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        arrayList.add(String.valueOf(user2.age));
        if (m102966h()) {
            arrayList.add("岁");
            if (i > 10000) {
                pf60VarM147494Y = (TextUtils.isEmpty(str3) || CoreModule.f18264c.f20381e0.m116600p9() == null || !str3.equals(CoreModule.f18264c.f20381e0.m116600p9().location.region.district)) ? jyb.m147494Y("其中有个%S_One_Gender%%S_Age%岁...", null) : jyb.m147494Y("其中1%S_One_Gender%%S_Age%岁，在%S_City%...", null);
            } else {
                pf60VarM147494Y = jyb.m147494Y("其中1%S_One_Gender%%S_Age%岁，离你%S_Distance%...", null);
            }
            strReplace = (String) pf60VarM147494Y.f152156a;
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
        return q8g0.m175796b0(strReplace, arrayList, Color.parseColor("#edb044"), lyh0.m156283c(3));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m102966h() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m82486a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m102967j(int i) {
        if (m102966h()) {
            return "谁喜欢我:%S_Count%%S_Gender%待配对".replace("%S_Count%", i < 99 ? String.valueOf(i) : "99+").replace("%S_Gender%", "人");
        }
        return String.format("%s people liked you", q8g0.m175775G(i));
    }

    /* JADX INFO: renamed from: c */
    public int m102968c() {
        return this.f75425f.get().intValue();
    }

    /* JADX INFO: renamed from: f */
    public String m102969f() {
        return this.f75423d.get();
    }

    /* JADX INFO: renamed from: g */
    public boolean m102970g() {
        return !pzi0.m174439D(this.f75422c.get().longValue());
    }

    /* JADX INFO: renamed from: i */
    public void m102971i() {
        this.f75422c.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: k */
    public void m102972k(int i) {
        this.f75425f.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: l */
    public void m102973l(boolean z) {
        this.f75426g.put(Boolean.valueOf(z));
    }
}

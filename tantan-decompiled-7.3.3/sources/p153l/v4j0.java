package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class v4j0 {
    /* JADX INFO: renamed from: a */
    public static String m199703a() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        return pzi0.f154857d.format(date);
    }

    /* JADX INFO: renamed from: b */
    public static void m199704b() {
        CoreModule.f18264c.f20381e0.f89015D3.clear();
        CoreModule.f18264c.f20381e0.f89019E0.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m199705c() {
        return (pzi0.m174439D(CoreModule.f18264c.f20381e0.f89088O0.get().longValue()) || CoreModule.f18264c.f20381e0.f89070L3.get().intValue() != 2 || m199706d()) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m199706d() {
        return TextUtils.equals(CoreModule.f18264c.f20381e0.f89015D3.get(), m199703a());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m199707e() {
        String str = CoreModule.f18264c.f20381e0.f89008C3.get();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List listAsList = Arrays.asList(str.split("#"));
        if (jyb.m147479J(listAsList)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m199703a());
        sb.append(":true");
        return listAsList.contains(sb.toString());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m199708f() {
        return (CoreModule.f18264c.f20381e0.f89070L3.get().intValue() < 3 || m199707e() || pzi0.m174439D(CoreModule.f18264c.f20381e0.f89077M3.get().longValue())) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static void m199709g() {
        CoreModule.f18264c.f20381e0.f89015D3.put(m199703a());
        CoreModule.f18264c.f20381e0.f89019E0.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: h */
    public static void m199710h() {
        CoreModule.f18264c.f20381e0.f89077M3.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: i */
    public static void m199711i(boolean z) {
        if (m199707e()) {
            return;
        }
        String str = CoreModule.f18264c.f20381e0.f89008C3.get();
        String str2 = m199703a() + ":" + z;
        if (TextUtils.isEmpty(str)) {
            CoreModule.f18264c.f20381e0.f89008C3.put(str2);
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split("#")));
        if (arrayList.contains(str2)) {
            return;
        }
        if (z) {
            arrayList.remove(m199703a() + ":false");
        }
        arrayList.add(str2);
        CoreModule.f18264c.f20381e0.f89008C3.put(arrayList.size() > 50 ? du4.m118067a("#", arrayList.subList(arrayList.size() - 20, arrayList.size())) : du4.m118067a("#", arrayList));
    }
}

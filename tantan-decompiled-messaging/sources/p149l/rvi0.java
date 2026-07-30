package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class rvi0 {
    /* JADX INFO: renamed from: a */
    public static String m181290a() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        return mqi0.f135252d.format(date);
    }

    /* JADX INFO: renamed from: b */
    public static void m181291b() {
        CoreModule.f17545c.f19639e0.f149158D3.clear();
        CoreModule.f17545c.f19639e0.f149162E0.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m181292c() {
        return (mqi0.m155929D(CoreModule.f17545c.f19639e0.f149231O0.get().longValue()) || CoreModule.f17545c.f19639e0.f149213L3.get().intValue() != 2 || m181293d()) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m181293d() {
        return TextUtils.equals(CoreModule.f17545c.f19639e0.f149158D3.get(), m181290a());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m181294e() {
        String str = CoreModule.f17545c.f19639e0.f149151C3.get();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List listAsList = Arrays.asList(str.split("#"));
        if (vwb.m200296J(listAsList)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m181290a());
        sb.append(":true");
        return listAsList.contains(sb.toString());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m181295f() {
        return (CoreModule.f17545c.f19639e0.f149213L3.get().intValue() < 3 || m181294e() || mqi0.m155929D(CoreModule.f17545c.f19639e0.f149220M3.get().longValue())) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static void m181296g() {
        CoreModule.f17545c.f19639e0.f149158D3.put(m181290a());
        CoreModule.f17545c.f19639e0.f149162E0.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: h */
    public static void m181297h() {
        CoreModule.f17545c.f19639e0.f149220M3.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: i */
    public static void m181298i(boolean z) {
        if (m181294e()) {
            return;
        }
        String str = CoreModule.f17545c.f19639e0.f149151C3.get();
        String str2 = m181290a() + ":" + z;
        if (TextUtils.isEmpty(str)) {
            CoreModule.f17545c.f19639e0.f149151C3.put(str2);
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split("#")));
        if (arrayList.contains(str2)) {
            return;
        }
        if (z) {
            arrayList.remove(m181290a() + ":false");
        }
        arrayList.add(str2);
        CoreModule.f17545c.f19639e0.f149151C3.put(arrayList.size() > 50 ? et4.m117971a("#", arrayList.subList(arrayList.size() - 20, arrayList.size())) : et4.m117971a("#", arrayList));
    }
}

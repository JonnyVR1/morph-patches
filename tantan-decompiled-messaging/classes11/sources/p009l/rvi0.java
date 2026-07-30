package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import l.roj0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rvi0 {
    /* JADX INFO: renamed from: a */
    public static String m21820a() {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        return mqi0.f17028d.format(date);
    }

    /* JADX INFO: renamed from: b */
    public static void m21821b() {
        CoreModule.c.e0.D3.clear();
        CoreModule.c.e0.E0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21822c() {
        return (mqi0.m18535D(((Long) CoreModule.c.e0.O0.get()).longValue()) || ((Integer) CoreModule.c.e0.L3.get()).intValue() != 2 || m21823d()) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m21823d() {
        return TextUtils.equals((CharSequence) CoreModule.c.e0.D3.get(), m21820a());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m21824e() {
        String str = (String) CoreModule.c.e0.C3.get();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List listAsList = Arrays.asList(str.split("#"));
        if (vwb.J(listAsList)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m21820a());
        sb.append(":true");
        return listAsList.contains(sb.toString());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m21825f() {
        return (((Integer) CoreModule.c.e0.L3.get()).intValue() < 3 || m21824e() || mqi0.m18535D(((Long) CoreModule.c.e0.M3.get()).longValue())) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static void m21826g() {
        CoreModule.c.e0.D3.put(m21820a());
        CoreModule.c.e0.E0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: h */
    public static void m21827h() {
        CoreModule.c.e0.M3.put(Long.valueOf(mqi0.m18550o()));
    }

    /* JADX INFO: renamed from: i */
    public static void m21828i(boolean z) {
        if (m21824e()) {
            return;
        }
        String str = (String) CoreModule.c.e0.C3.get();
        String str2 = m21820a() + ":" + z;
        if (TextUtils.isEmpty(str)) {
            CoreModule.c.e0.C3.put(str2);
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split("#")));
        if (arrayList.contains(str2)) {
            return;
        }
        if (z) {
            arrayList.remove(m21820a() + ":false");
        }
        arrayList.add(str2);
        CoreModule.c.e0.C3.put(arrayList.size() > 50 ? et4.m14104a("#", arrayList.subList(arrayList.size() - 20, arrayList.size())) : et4.m14104a("#", arrayList));
    }
}

package p153l;

import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class zw80 {
    /* JADX INFO: renamed from: a */
    public static List<yw80<?>> m221856a(kv80 kv80Var) {
        ArrayList arrayList = new ArrayList();
        if (m221858c()) {
            arrayList.add(new r3l(kv80Var));
        }
        if (m221857b()) {
            arrayList.add(new d3l(kv80Var));
        }
        if (wft.m206159b(2) || IntlCountryCodeController.m29122s()) {
            arrayList.add(new u4l(kv80Var));
        }
        if (m221859d()) {
            arrayList.add(new x3l(kv80Var));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m221857b() {
        return tbs.f172989b.m203517S6();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m221858c() {
        vwt vwtVar = tbs.f172989b;
        return (vwtVar == null || !vwtVar.m203525T6() || mqr.m159589i()) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m221859d() {
        vwt vwtVar = tbs.f172989b;
        return vwtVar != null && vwtVar.m203557X6();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m221860e() {
        return m221857b() || tbs.f172989b.m203565Y6() || m221859d() || m221858c();
    }
}

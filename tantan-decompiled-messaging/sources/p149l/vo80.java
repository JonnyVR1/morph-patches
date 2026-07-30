package p149l;

import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class vo80 {
    /* JADX INFO: renamed from: a */
    public static List<uo80<?>> m199158a(gn80 gn80Var) {
        ArrayList arrayList = new ArrayList();
        if (m199160c()) {
            arrayList.add(new b1l(gn80Var));
        }
        if (m199159b()) {
            arrayList.add(new n0l(gn80Var));
        }
        if (vdt.m198092b(2) || IntlCountryCodeController.m28123s()) {
            arrayList.add(new e2l(gn80Var));
        }
        if (m199161d()) {
            arrayList.add(new h1l(gn80Var));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m199159b() {
        return s9s.f163228b.m195730S6();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m199160c() {
        uut uutVar = s9s.f163228b;
        return (uutVar == null || !uutVar.m195738T6() || lor.m150804i()) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m199161d() {
        uut uutVar = s9s.f163228b;
        return uutVar != null && uutVar.m195770X6();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m199162e() {
        return m199159b() || s9s.f163228b.m195778Y6() || m199161d() || m199160c();
    }
}

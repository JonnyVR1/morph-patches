package com.vivo.push.p118d;

import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14756e;
import com.vivo.push.C14765m;
import com.vivo.push.p116b.C14702t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.h */
/* JADX INFO: loaded from: classes2.dex */
final class C14737h extends AbstractC14755z {
    public C14737h(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        C14737h c14737h;
        C14702t c14702t = (C14702t) abstractC14769o;
        ArrayList<String> arrayListM85947d = c14702t.m85947d();
        List<String> listM85948e = c14702t.m85948e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iM85946h = c14702t.m85946h();
        String strM85945g = c14702t.m85945g();
        if (arrayListM85947d != null) {
            for (String str : arrayListM85947d) {
                if (str.startsWith("ali/")) {
                    arrayList2.add(str.replace("ali/", ""));
                } else if (str.startsWith("tag/")) {
                    arrayList.add(str.replace("tag/", ""));
                }
            }
        }
        if (listM85948e != null) {
            for (String str2 : listM85948e) {
                if (str2.startsWith("ali/")) {
                    arrayList4.add(str2.replace("ali/", ""));
                } else if (str2.startsWith("tag/")) {
                    arrayList3.add(str2.replace("tag/", ""));
                }
            }
        }
        if (arrayList.size() > 0 || arrayList3.size() > 0) {
            if (arrayList.size() > 0) {
                C14756e.m86032a().m86062b(arrayList);
            }
            C14756e.m86032a().m86051a(c14702t.m85945g(), arrayList3.size() > 0 ? 10000 : iM85946h);
            c14737h = this;
            C14765m.m86086b(new RunnableC14738i(c14737h, iM85946h, arrayList, arrayList3, strM85945g));
        } else {
            c14737h = this;
        }
        if (arrayList2.size() > 0 || arrayList4.size() > 0) {
            if (arrayList2.size() > 0) {
                C14756e.m86032a().m86064c(arrayList2);
            }
            C14756e.m86032a().m86051a(c14702t.m85945g(), iM85946h);
            C14765m.m86086b(new RunnableC14739j(c14737h, iM85946h, arrayList2, arrayList4, strM85945g));
        }
    }
}

package com.vivo.push.p113d;

import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14608e;
import com.vivo.push.C14617m;
import com.vivo.push.p111b.C14554t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.h */
/* JADX INFO: loaded from: classes2.dex */
final class C14589h extends AbstractC14607z {
    public C14589h(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14589h c14589h;
        C14554t c14554t = (C14554t) abstractC14621o;
        ArrayList<String> arrayListM84776d = c14554t.m84776d();
        List<String> listM84777e = c14554t.m84777e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iM84775h = c14554t.m84775h();
        String strM84774g = c14554t.m84774g();
        if (arrayListM84776d != null) {
            for (String str : arrayListM84776d) {
                if (str.startsWith("ali/")) {
                    arrayList2.add(str.replace("ali/", ""));
                } else if (str.startsWith("tag/")) {
                    arrayList.add(str.replace("tag/", ""));
                }
            }
        }
        if (listM84777e != null) {
            for (String str2 : listM84777e) {
                if (str2.startsWith("ali/")) {
                    arrayList4.add(str2.replace("ali/", ""));
                } else if (str2.startsWith("tag/")) {
                    arrayList3.add(str2.replace("tag/", ""));
                }
            }
        }
        if (arrayList.size() > 0 || arrayList3.size() > 0) {
            if (arrayList.size() > 0) {
                C14608e.m84861a().m84891b(arrayList);
            }
            C14608e.m84861a().m84880a(c14554t.m84774g(), arrayList3.size() > 0 ? 10000 : iM84775h);
            c14589h = this;
            C14617m.m84915b(new RunnableC14590i(c14589h, iM84775h, arrayList, arrayList3, strM84774g));
        } else {
            c14589h = this;
        }
        if (arrayList2.size() > 0 || arrayList4.size() > 0) {
            if (arrayList2.size() > 0) {
                C14608e.m84861a().m84893c(arrayList2);
            }
            C14608e.m84861a().m84880a(c14554t.m84774g(), iM84775h);
            C14617m.m84915b(new RunnableC14591j(c14589h, iM84775h, arrayList2, arrayList4, strM84774g));
        }
    }
}

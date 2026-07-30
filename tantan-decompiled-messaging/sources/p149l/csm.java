package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class csm implements t3g.InterfaceC20102a {

    /* JADX INFO: renamed from: a */
    private final kb20 f82362a;

    public csm(kb20 kb20Var) {
        this.f82362a = kb20Var;
    }

    @Override // p149l.t3g.InterfaceC20102a
    /* JADX INFO: renamed from: a */
    public List<String> mo108516a() {
        ArrayList arrayList = new ArrayList();
        kb20 kb20Var = this.f82362a;
        if (kb20Var != null) {
            String str = kb20Var.f122186a;
            if (str != null) {
                arrayList.add(str);
            }
            String str2 = this.f82362a.f122189d;
            if (str2 != null) {
                arrayList.add(str2);
            }
            List<String> list = this.f82362a.f122195j;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    @Override // p149l.t3g.InterfaceC20102a
    /* JADX INFO: renamed from: b */
    public List<String> mo108517b() {
        ArrayList arrayList = new ArrayList();
        kb20 kb20Var = this.f82362a;
        if (kb20Var != null) {
            String str = kb20Var.f122187b;
            if (str != null) {
                arrayList.add(str);
            }
            String str2 = this.f82362a.f122188c;
            if (str2 != null) {
                arrayList.add(str2);
            }
            List<String> list = this.f82362a.f122194i;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }
}

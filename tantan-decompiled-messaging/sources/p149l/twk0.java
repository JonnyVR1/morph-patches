package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class twk0 implements t3g.InterfaceC20102a {

    /* JADX INFO: renamed from: a */
    private final kb20 f172400a;

    /* JADX INFO: renamed from: b */
    private final boolean f172401b;

    public twk0(kb20 kb20Var, boolean z) {
        this.f172401b = z;
        this.f172400a = kb20Var;
    }

    @Override // p149l.t3g.InterfaceC20102a
    /* JADX INFO: renamed from: a */
    public List<String> mo108516a() {
        ArrayList arrayList = new ArrayList();
        kb20 kb20Var = this.f172400a;
        if (kb20Var != null) {
            if (this.f172401b) {
                List<String> list = kb20Var.f122192g;
                if (list != null) {
                    arrayList.addAll(list);
                }
                String str = this.f172400a.f122186a;
                if (str != null) {
                    arrayList.add(str);
                }
                String str2 = this.f172400a.f122189d;
                if (str2 != null) {
                    arrayList.add(str2);
                }
                List<String> list2 = this.f172400a.f122195j;
                if (list2 != null) {
                    for (String str3 : list2) {
                        if (!arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
            } else {
                String str4 = kb20Var.f122186a;
                if (str4 != null) {
                    arrayList.add(str4);
                }
                String str5 = this.f172400a.f122189d;
                if (str5 != null) {
                    arrayList.add(str5);
                }
                List<String> list3 = this.f172400a.f122192g;
                if (list3 != null) {
                    arrayList.addAll(list3);
                }
                List<String> list4 = this.f172400a.f122195j;
                if (list4 != null) {
                    for (String str6 : list4) {
                        if (!arrayList.contains(str6)) {
                            arrayList.add(str6);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // p149l.t3g.InterfaceC20102a
    /* JADX INFO: renamed from: b */
    public List<String> mo108517b() {
        ArrayList arrayList = new ArrayList();
        kb20 kb20Var = this.f172400a;
        if (kb20Var != null) {
            if (this.f172401b) {
                List<String> list = kb20Var.f122193h;
                if (list != null) {
                    arrayList.addAll(list);
                }
                String str = this.f172400a.f122187b;
                if (str != null) {
                    arrayList.add(str);
                }
                String str2 = this.f172400a.f122188c;
                if (str2 != null) {
                    arrayList.add(str2);
                }
                List<String> list2 = this.f172400a.f122194i;
                if (list2 != null) {
                    for (String str3 : list2) {
                        if (!arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
            } else {
                String str4 = kb20Var.f122187b;
                if (str4 != null) {
                    arrayList.add(str4);
                }
                String str5 = this.f172400a.f122188c;
                if (str5 != null) {
                    arrayList.add(str5);
                }
                List<String> list3 = this.f172400a.f122193h;
                if (list3 != null) {
                    arrayList.addAll(list3);
                }
                List<String> list4 = this.f172400a.f122194i;
                if (list4 != null) {
                    for (String str6 : list4) {
                        if (!arrayList.contains(str6)) {
                            arrayList.add(str6);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}

package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class z5l0 implements h5g.InterfaceC17403a {

    /* JADX INFO: renamed from: a */
    private final tj20 f203067a;

    /* JADX INFO: renamed from: b */
    private final boolean f203068b;

    public z5l0(tj20 tj20Var, boolean z) {
        this.f203068b = z;
        this.f203067a = tj20Var;
    }

    @Override // p153l.h5g.InterfaceC17403a
    /* JADX INFO: renamed from: a */
    public List<String> mo122675a() {
        ArrayList arrayList = new ArrayList();
        tj20 tj20Var = this.f203067a;
        if (tj20Var != null) {
            if (this.f203068b) {
                List<String> list = tj20Var.f174533g;
                if (list != null) {
                    arrayList.addAll(list);
                }
                String str = this.f203067a.f174527a;
                if (str != null) {
                    arrayList.add(str);
                }
                String str2 = this.f203067a.f174530d;
                if (str2 != null) {
                    arrayList.add(str2);
                }
                List<String> list2 = this.f203067a.f174536j;
                if (list2 != null) {
                    for (String str3 : list2) {
                        if (!arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
            } else {
                String str4 = tj20Var.f174527a;
                if (str4 != null) {
                    arrayList.add(str4);
                }
                String str5 = this.f203067a.f174530d;
                if (str5 != null) {
                    arrayList.add(str5);
                }
                List<String> list3 = this.f203067a.f174533g;
                if (list3 != null) {
                    arrayList.addAll(list3);
                }
                List<String> list4 = this.f203067a.f174536j;
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

    @Override // p153l.h5g.InterfaceC17403a
    /* JADX INFO: renamed from: b */
    public List<String> mo122676b() {
        ArrayList arrayList = new ArrayList();
        tj20 tj20Var = this.f203067a;
        if (tj20Var != null) {
            if (this.f203068b) {
                List<String> list = tj20Var.f174534h;
                if (list != null) {
                    arrayList.addAll(list);
                }
                String str = this.f203067a.f174528b;
                if (str != null) {
                    arrayList.add(str);
                }
                String str2 = this.f203067a.f174529c;
                if (str2 != null) {
                    arrayList.add(str2);
                }
                List<String> list2 = this.f203067a.f174535i;
                if (list2 != null) {
                    for (String str3 : list2) {
                        if (!arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
            } else {
                String str4 = tj20Var.f174528b;
                if (str4 != null) {
                    arrayList.add(str4);
                }
                String str5 = this.f203067a.f174529c;
                if (str5 != null) {
                    arrayList.add(str5);
                }
                List<String> list3 = this.f203067a.f174534h;
                if (list3 != null) {
                    arrayList.addAll(list3);
                }
                List<String> list4 = this.f203067a.f174535i;
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

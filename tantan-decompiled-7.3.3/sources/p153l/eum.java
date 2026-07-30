package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eum implements h5g.InterfaceC17403a {

    /* JADX INFO: renamed from: a */
    private final tj20 f95910a;

    public eum(tj20 tj20Var) {
        this.f95910a = tj20Var;
    }

    @Override // p153l.h5g.InterfaceC17403a
    /* JADX INFO: renamed from: a */
    public List<String> mo122675a() {
        ArrayList arrayList = new ArrayList();
        tj20 tj20Var = this.f95910a;
        if (tj20Var != null) {
            String str = tj20Var.f174527a;
            if (str != null) {
                arrayList.add(str);
            }
            String str2 = this.f95910a.f174530d;
            if (str2 != null) {
                arrayList.add(str2);
            }
            List<String> list = this.f95910a.f174536j;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    @Override // p153l.h5g.InterfaceC17403a
    /* JADX INFO: renamed from: b */
    public List<String> mo122676b() {
        ArrayList arrayList = new ArrayList();
        tj20 tj20Var = this.f95910a;
        if (tj20Var != null) {
            String str = tj20Var.f174528b;
            if (str != null) {
                arrayList.add(str);
            }
            String str2 = this.f95910a.f174529c;
            if (str2 != null) {
                arrayList.add(str2);
            }
            List<String> list = this.f95910a.f174535i;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }
}

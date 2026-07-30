package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c13 {
    /* JADX INFO: renamed from: a */
    public static b13 m107520a(List<dof> list) {
        int size = list.size() << 1;
        int i = size - 1;
        if (list.get(list.size() - 1).m117198d() == null) {
            i = size - 2;
        }
        b13 b13Var = new b13(i * 12);
        int i2 = 0;
        int iM175348b = list.get(0).m117198d().m175348b();
        for (int i3 = 11; i3 >= 0; i3--) {
            if (((1 << i3) & iM175348b) != 0) {
                b13Var.m101406r(i2);
            }
            i2++;
        }
        for (int i4 = 1; i4 < list.size(); i4++) {
            dof dofVar = list.get(i4);
            int iM175348b2 = dofVar.m117197c().m175348b();
            for (int i5 = 11; i5 >= 0; i5--) {
                if (((1 << i5) & iM175348b2) != 0) {
                    b13Var.m101406r(i2);
                }
                i2++;
            }
            if (dofVar.m117198d() != null) {
                int iM175348b3 = dofVar.m117198d().m175348b();
                for (int i6 = 11; i6 >= 0; i6--) {
                    if (((1 << i6) & iM175348b3) != 0) {
                        b13Var.m101406r(i2);
                    }
                    i2++;
                }
            }
        }
        return b13Var;
    }
}

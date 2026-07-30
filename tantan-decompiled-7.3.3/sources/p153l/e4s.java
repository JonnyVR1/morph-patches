package p153l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e4s {

    /* JADX INFO: renamed from: a */
    public static ctl f92143a;

    /* JADX INFO: renamed from: b */
    public static List<uxr<?>> m119474b(hk4 hk4Var, List<r6s> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<r6s> it = list.iterator();
        while (it.hasNext()) {
            final uxr<?> uxrVarM119475c = m119475c(hk4Var, it.next());
            if (uxrVarM119475c != null) {
                uxrVarM119475c.mo113881A(new View.OnClickListener() { // from class: l.d4s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        uxrVarM119475c.mo96606J(view);
                    }
                });
                arrayList.add(uxrVarM119475c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static uxr<?> m119475c(hk4 hk4Var, r6s r6sVar) {
        int iM180020d = r6sVar.m180020d();
        if (iM180020d == 1) {
            return wwr.m208290O(hk4Var, r6sVar.m180018b());
        }
        if (iM180020d == 2) {
            return les.m153937O(hk4Var, r6sVar.m180021e());
        }
        if (iM180020d == 3) {
            return beu.m103783O(hk4Var, r6sVar.m180028l());
        }
        if (iM180020d == 4) {
            return cfu.m109603O(hk4Var, r6sVar.m180027k());
        }
        if (iM180020d == 5) {
            return a9s.m96604O(hk4Var, r6sVar.m180027k());
        }
        if (iM180020d == 3001) {
            return bvo0.m106584O(hk4Var, r6sVar.m180025i());
        }
        if (iM180020d == 3002) {
            return dvo0.m118300O(hk4Var, r6sVar.m180025i());
        }
        if (iM180020d == 3004) {
            return gto0.m132251O(hk4Var, r6sVar.m180026j());
        }
        switch (iM180020d) {
            case 8:
                return owr.m169616O(hk4Var, r6sVar.m180017a());
            case 9:
                return wys.m208624O(hk4Var, r6sVar.m180024h());
            case 10:
                return tbt.m190093O(hk4Var, r6sVar.m180030n());
            default:
                switch (iM180020d) {
                    case 12:
                        return h6v.m133734O(hk4Var, r6sVar.m180021e());
                    case 13:
                        return r6v.m180049O(hk4Var, r6sVar.m180024h());
                    case 14:
                        return yfs.m215811O(hk4Var, r6sVar.m180022f());
                    case 15:
                        return wit.m206598O(hk4Var, r6sVar.m180023g());
                    case 16:
                        return i3s.m138339O(hk4Var, r6sVar.m180019c());
                    default:
                        switch (iM180020d) {
                            case 1001:
                                return dfu.m115544O(hk4Var, r6sVar.m180029m());
                            case 1002:
                                return zxu.m222079P(hk4Var, r6sVar.m180032p());
                            case 1003:
                                return ayu.m100923P(hk4Var, r6sVar.m180032p());
                            case 1004:
                                return fyu.m128126P(hk4Var, r6sVar.m180032p());
                            default:
                                ctl ctlVar = f92143a;
                                if (ctlVar != null) {
                                    return ctlVar.mo106133a(hk4Var, r6sVar);
                                }
                                return null;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m119476d(ctl ctlVar) {
        f92143a = ctlVar;
    }
}

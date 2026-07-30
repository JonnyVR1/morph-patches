package p149l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class d2s {

    /* JADX INFO: renamed from: a */
    public static qql f83427a;

    /* JADX INFO: renamed from: b */
    public static List<tvr<?>> m109829b(ij4 ij4Var, List<q4s> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<q4s> it = list.iterator();
        while (it.hasNext()) {
            final tvr<?> tvrVarM109830c = m109830c(ij4Var, it.next());
            if (tvrVarM109830c != null) {
                tvrVarM109830c.mo109662A(new View.OnClickListener() { // from class: l.c2s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        tvrVarM109830c.mo101240J(view);
                    }
                });
                arrayList.add(tvrVarM109830c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static tvr<?> m109830c(ij4 ij4Var, q4s q4sVar) {
        int iM172955d = q4sVar.m172955d();
        if (iM172955d == 1) {
            return vur.m200090O(ij4Var, q4sVar.m172953b());
        }
        if (iM172955d == 2) {
            return kcs.m145605O(ij4Var, q4sVar.m172956e());
        }
        if (iM172955d == 3) {
            return acu.m95842O(ij4Var, q4sVar.m172963l());
        }
        if (iM172955d == 4) {
            return bdu.m101238O(ij4Var, q4sVar.m172962k());
        }
        if (iM172955d == 5) {
            return z6s.m217417O(ij4Var, q4sVar.m172962k());
        }
        if (iM172955d == 3001) {
            return xlo0.m209955O(ij4Var, q4sVar.m172960i());
        }
        if (iM172955d == 3002) {
            return zlo0.m219284O(ij4Var, q4sVar.m172960i());
        }
        if (iM172955d == 3004) {
            return cko0.m107421O(ij4Var, q4sVar.m172961j());
        }
        switch (iM172955d) {
            case 8:
                return nur.m161516O(ij4Var, q4sVar.m172952a());
            case 9:
                return vws.m200438O(ij4Var, q4sVar.m172959h());
            case 10:
                return s9t.m182776O(ij4Var, q4sVar.m172965n());
            default:
                switch (iM172955d) {
                    case 12:
                        return g4v.m124424O(ij4Var, q4sVar.m172956e());
                    case 13:
                        return q4v.m172977O(ij4Var, q4sVar.m172959h());
                    case 14:
                        return xds.m208425O(ij4Var, q4sVar.m172957f());
                    case 15:
                        return vgt.m198387O(ij4Var, q4sVar.m172958g());
                    case 16:
                        return h1s.m129074O(ij4Var, q4sVar.m172954c());
                    default:
                        switch (iM172955d) {
                            case 1001:
                                return cdu.m106290O(ij4Var, q4sVar.m172964m());
                            case 1002:
                                return yvu.m216235P(ij4Var, q4sVar.m172967p());
                            case 1003:
                                return zvu.m220484P(ij4Var, q4sVar.m172967p());
                            case 1004:
                                return ewu.m118516P(ij4Var, q4sVar.m172967p());
                            default:
                                qql qqlVar = f83427a;
                                if (qqlVar != null) {
                                    return qqlVar.mo175944a(ij4Var, q4sVar);
                                }
                                return null;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m109831d(qql qqlVar) {
        f83427a = qqlVar;
    }
}

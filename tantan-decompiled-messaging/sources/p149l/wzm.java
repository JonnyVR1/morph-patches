package p149l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class wzm extends vj2 {
    @Override // p149l.vj2
    /* JADX INFO: renamed from: a */
    public Object mo100034a(u0f... u0fVarArr) {
        u0f u0fVar = u0fVarArr[0];
        EngineType engineType = u0fVar.f172902a;
        EngineType engineType2 = EngineType.StringParamsList;
        if (engineType == engineType2) {
            u0f u0fVar2 = u0fVarArr[1];
            if (u0fVar2.f172902a == engineType2) {
                return m206299f(u0fVar, u0fVar2);
            }
        }
        EngineType engineType3 = EngineType.NumberParamsList;
        if (engineType != engineType3) {
            return null;
        }
        u0f u0fVar3 = u0fVarArr[1];
        if (u0fVar3.f172902a == engineType3) {
            return m206298e(u0fVar, u0fVar3);
        }
        return null;
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: c */
    public String mo100035c() {
        return "intersect";
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo100036d() {
        return FunctionResultType.List;
    }

    /* JADX INFO: renamed from: e */
    public final List<Double> m206298e(u0f u0fVar, u0f u0fVar2) {
        ArrayList arrayList = new ArrayList(((ArrayList) u0fVar.f172903b).size());
        ArrayList arrayList2 = new ArrayList(((ArrayList) u0fVar2.f172903b).size());
        Iterator it = ((ArrayList) u0fVar.f172903b).iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(m198619b(((u0f) it.next()).f172903b)));
        }
        Iterator it2 = ((ArrayList) u0fVar2.f172903b).iterator();
        while (it2.hasNext()) {
            arrayList.add(Double.valueOf(m198619b(((u0f) it2.next()).f172903b)));
        }
        arrayList.retainAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List<String> m206299f(u0f u0fVar, u0f u0fVar2) {
        ArrayList arrayList = new ArrayList(((ArrayList) u0fVar.f172903b).size());
        ArrayList arrayList2 = new ArrayList(((ArrayList) u0fVar2.f172903b).size());
        Iterator it = ((ArrayList) u0fVar.f172903b).iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((u0f) it.next()).f172903b);
        }
        Iterator it2 = ((ArrayList) u0fVar2.f172903b).iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((u0f) it2.next()).f172903b);
        }
        arrayList.retainAll(arrayList2);
        return arrayList;
    }
}

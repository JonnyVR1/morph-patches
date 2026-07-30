package p153l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class w1n extends dk2 {
    @Override // p153l.dk2
    /* JADX INFO: renamed from: a */
    public Object mo116186a(y1f... y1fVarArr) {
        y1f y1fVar = y1fVarArr[0];
        EngineType engineType = y1fVar.f197094a;
        EngineType engineType2 = EngineType.StringParamsList;
        if (engineType == engineType2) {
            y1f y1fVar2 = y1fVarArr[1];
            if (y1fVar2.f197094a == engineType2) {
                return m204453f(y1fVar, y1fVar2);
            }
        }
        EngineType engineType3 = EngineType.NumberParamsList;
        if (engineType != engineType3) {
            return null;
        }
        y1f y1fVar3 = y1fVarArr[1];
        if (y1fVar3.f197094a == engineType3) {
            return m204452e(y1fVar, y1fVar3);
        }
        return null;
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: c */
    public String mo116188c() {
        return "intersect";
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo116189d() {
        return FunctionResultType.List;
    }

    /* JADX INFO: renamed from: e */
    public final List<Double> m204452e(y1f y1fVar, y1f y1fVar2) {
        ArrayList arrayList = new ArrayList(((ArrayList) y1fVar.f197095b).size());
        ArrayList arrayList2 = new ArrayList(((ArrayList) y1fVar2.f197095b).size());
        Iterator it = ((ArrayList) y1fVar.f197095b).iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(m116187b(((y1f) it.next()).f197095b)));
        }
        Iterator it2 = ((ArrayList) y1fVar2.f197095b).iterator();
        while (it2.hasNext()) {
            arrayList.add(Double.valueOf(m116187b(((y1f) it2.next()).f197095b)));
        }
        arrayList.retainAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List<String> m204453f(y1f y1fVar, y1f y1fVar2) {
        ArrayList arrayList = new ArrayList(((ArrayList) y1fVar.f197095b).size());
        ArrayList arrayList2 = new ArrayList(((ArrayList) y1fVar2.f197095b).size());
        Iterator it = ((ArrayList) y1fVar.f197095b).iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((y1f) it.next()).f197095b);
        }
        Iterator it2 = ((ArrayList) y1fVar2.f197095b).iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((y1f) it2.next()).f197095b);
        }
        arrayList.retainAll(arrayList2);
        return arrayList;
    }
}

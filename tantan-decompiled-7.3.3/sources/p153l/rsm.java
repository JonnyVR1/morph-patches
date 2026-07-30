package p153l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class rsm extends dk2<Boolean> {
    @Override // p153l.dk2
    /* JADX INFO: renamed from: c */
    public String mo116188c() {
        return "in";
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo116189d() {
        return FunctionResultType.Boolean;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:1: B:18:0x004f->B:31:?, LOOP_END, SYNTHETIC] */
    @Override // p153l.dk2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo116186a(y1f... y1fVarArr) {
        y1f y1fVar;
        Iterator it;
        EngineType engineType = y1fVarArr[0].f197094a;
        if (engineType == EngineType.Number) {
            y1f y1fVar2 = y1fVarArr[1];
            if (y1fVar2.f197094a == EngineType.NumberParamsList) {
                Iterator it2 = ((ArrayList) y1fVar2.f197095b).iterator();
                while (it2.hasNext()) {
                    if (m116187b(((y1f) it2.next()).f197095b) == m116187b(y1fVarArr[0].f197095b)) {
                        return Boolean.TRUE;
                    }
                }
            } else if (engineType == EngineType.String) {
                y1fVar = y1fVarArr[1];
                if (y1fVar.f197094a == EngineType.StringParamsList) {
                    it = ((ArrayList) y1fVar.f197095b).iterator();
                    while (it.hasNext()) {
                        if (((String) ((y1f) it.next()).f197095b).equals((String) y1fVarArr[0].f197095b)) {
                            return Boolean.TRUE;
                        }
                    }
                }
            }
        } else if (engineType == EngineType.String) {
            y1fVar = y1fVarArr[1];
            if (y1fVar.f197094a == EngineType.StringParamsList) {
                it = ((ArrayList) y1fVar.f197095b).iterator();
                while (it.hasNext()) {
                    if (((String) ((y1f) it.next()).f197095b).equals((String) y1fVarArr[0].f197095b)) {
                        return Boolean.TRUE;
                    }
                }
            }
        }
        return Boolean.FALSE;
    }
}

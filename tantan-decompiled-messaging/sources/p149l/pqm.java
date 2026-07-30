package p149l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class pqm extends vj2<Boolean> {
    @Override // p149l.vj2
    /* JADX INFO: renamed from: c */
    public String mo100035c() {
        return "in";
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo100036d() {
        return FunctionResultType.Boolean;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:1: B:18:0x004f->B:31:?, LOOP_END, SYNTHETIC] */
    @Override // p149l.vj2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo100034a(u0f... u0fVarArr) {
        u0f u0fVar;
        Iterator it;
        EngineType engineType = u0fVarArr[0].f172902a;
        if (engineType == EngineType.Number) {
            u0f u0fVar2 = u0fVarArr[1];
            if (u0fVar2.f172902a == EngineType.NumberParamsList) {
                Iterator it2 = ((ArrayList) u0fVar2.f172903b).iterator();
                while (it2.hasNext()) {
                    if (m198619b(((u0f) it2.next()).f172903b) == m198619b(u0fVarArr[0].f172903b)) {
                        return Boolean.TRUE;
                    }
                }
            } else if (engineType == EngineType.String) {
                u0fVar = u0fVarArr[1];
                if (u0fVar.f172902a == EngineType.StringParamsList) {
                    it = ((ArrayList) u0fVar.f172903b).iterator();
                    while (it.hasNext()) {
                        if (((String) ((u0f) it.next()).f172903b).equals((String) u0fVarArr[0].f172903b)) {
                            return Boolean.TRUE;
                        }
                    }
                }
            }
        } else if (engineType == EngineType.String) {
            u0fVar = u0fVarArr[1];
            if (u0fVar.f172902a == EngineType.StringParamsList) {
                it = ((ArrayList) u0fVar.f172903b).iterator();
                while (it.hasNext()) {
                    if (((String) ((u0f) it.next()).f172903b).equals((String) u0fVarArr[0].f172903b)) {
                        return Boolean.TRUE;
                    }
                }
            }
        }
        return Boolean.FALSE;
    }
}

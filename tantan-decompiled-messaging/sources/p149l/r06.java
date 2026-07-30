package p149l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class r06 extends vj2<Boolean> {
    @Override // p149l.vj2
    /* JADX INFO: renamed from: c */
    public String mo100035c() {
        return "contains";
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo100036d() {
        return FunctionResultType.Boolean;
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo100034a(u0f... u0fVarArr) {
        if (u0fVarArr[0].f172902a == EngineType.String) {
            u0f u0fVar = u0fVarArr[1];
            if (u0fVar.f172902a == EngineType.StringParamsList) {
                Iterator it = ((ArrayList) u0fVar.f172903b).iterator();
                while (it.hasNext()) {
                    if (((String) ((u0f) it.next()).f172903b).contains((String) u0fVarArr[0].f172903b)) {
                        return Boolean.TRUE;
                    }
                }
            }
        }
        return Boolean.FALSE;
    }
}

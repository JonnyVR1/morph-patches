package p149l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class nar extends vj2 {
    @Override // p149l.vj2
    /* JADX INFO: renamed from: a */
    public Object mo100034a(u0f... u0fVarArr) {
        u0f u0fVar = u0fVarArr[0];
        if (u0fVar.f172902a == EngineType.StringParamsList) {
            return Integer.valueOf(((ArrayList) u0fVar.f172903b).size());
        }
        return 0;
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: c */
    public String mo100035c() {
        return "length";
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo100036d() {
        return FunctionResultType.Number;
    }
}

package p149l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;

/* JADX INFO: loaded from: classes13.dex */
public class f720 extends vj2<Boolean> {
    @Override // p149l.vj2
    /* JADX INFO: renamed from: c */
    public String mo100035c() {
        return "ne";
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo100036d() {
        return FunctionResultType.Boolean;
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo100034a(u0f... u0fVarArr) {
        u0f u0fVar = u0fVarArr[0];
        EngineType engineType = u0fVar.f172902a;
        EngineType engineType2 = EngineType.Number;
        if (engineType == engineType2 && u0fVarArr[1].f172902a == engineType2) {
            return Boolean.valueOf(m198619b(u0fVar.f172903b) != m198619b(u0fVarArr[1].f172903b));
        }
        EngineType engineType3 = EngineType.String;
        if (engineType == engineType3) {
            u0f u0fVar2 = u0fVarArr[1];
            if (u0fVar2.f172902a == engineType3) {
                return Boolean.valueOf(!((String) u0fVar.f172903b).equals((String) u0fVar2.f172903b));
            }
        }
        return Boolean.FALSE;
    }
}

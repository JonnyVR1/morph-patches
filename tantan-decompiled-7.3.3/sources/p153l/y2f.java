package p153l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;

/* JADX INFO: loaded from: classes11.dex */
public class y2f extends dk2<Boolean> {
    @Override // p153l.dk2
    /* JADX INFO: renamed from: c */
    public String mo116188c() {
        return "eq";
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo116189d() {
        return FunctionResultType.Boolean;
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo116186a(y1f... y1fVarArr) {
        y1f y1fVar = y1fVarArr[0];
        EngineType engineType = y1fVar.f197094a;
        EngineType engineType2 = EngineType.Number;
        if (engineType == engineType2 && y1fVarArr[1].f197094a == engineType2) {
            return Boolean.valueOf(m116187b(y1fVar.f197095b) == m116187b(y1fVarArr[1].f197095b));
        }
        EngineType engineType3 = EngineType.String;
        if (engineType == engineType3) {
            y1f y1fVar2 = y1fVarArr[1];
            if (y1fVar2.f197094a == engineType3) {
                return Boolean.valueOf(((String) y1fVar.f197095b).equals((String) y1fVar2.f197095b));
            }
        }
        return Boolean.FALSE;
    }
}

package p153l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class pcr extends dk2 {
    @Override // p153l.dk2
    /* JADX INFO: renamed from: a */
    public Object mo116186a(y1f... y1fVarArr) {
        y1f y1fVar = y1fVarArr[0];
        if (y1fVar.f197094a == EngineType.StringParamsList) {
            return Integer.valueOf(((ArrayList) y1fVar.f197095b).size());
        }
        return 0;
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: c */
    public String mo116188c() {
        return "length";
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo116189d() {
        return FunctionResultType.Number;
    }
}

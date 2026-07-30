package p153l;

import com.tantanapp.engine.EngineType;
import com.tantanapp.engine.FunctionResultType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class w16 extends dk2<Boolean> {
    @Override // p153l.dk2
    /* JADX INFO: renamed from: c */
    public String mo116188c() {
        return "contains";
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo116189d() {
        return FunctionResultType.Boolean;
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo116186a(y1f... y1fVarArr) {
        if (y1fVarArr[0].f197094a == EngineType.String) {
            y1f y1fVar = y1fVarArr[1];
            if (y1fVar.f197094a == EngineType.StringParamsList) {
                Iterator it = ((ArrayList) y1fVar.f197095b).iterator();
                while (it.hasNext()) {
                    if (((String) ((y1f) it.next()).f197095b).contains((String) y1fVarArr[0].f197095b)) {
                        return Boolean.TRUE;
                    }
                }
            }
        }
        return Boolean.FALSE;
    }
}

package p153l;

import com.tantanapp.engine.FunctionResultType;

/* JADX INFO: loaded from: classes11.dex */
public class x560 extends dk2<Boolean> {
    @Override // p153l.dk2
    /* JADX INFO: renamed from: c */
    public String mo116188c() {
        return "or";
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo116189d() {
        return FunctionResultType.Boolean;
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo116186a(y1f... y1fVarArr) {
        for (y1f y1fVar : y1fVarArr) {
            if (((Boolean) y1fVar.f197095b).booleanValue()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}

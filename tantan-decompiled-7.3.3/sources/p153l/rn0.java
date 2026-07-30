package p153l;

import com.tantanapp.engine.FunctionResultType;

/* JADX INFO: loaded from: classes11.dex */
public class rn0 extends dk2<Boolean> {
    @Override // p153l.dk2
    /* JADX INFO: renamed from: c */
    public String mo116188c() {
        return "and";
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
            if (!((Boolean) y1fVar.f197095b).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}

package p149l;

import com.tantanapp.engine.FunctionResultType;

/* JADX INFO: loaded from: classes13.dex */
public class vn0 extends vj2<Boolean> {
    @Override // p149l.vj2
    /* JADX INFO: renamed from: c */
    public String mo100035c() {
        return "and";
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo100036d() {
        return FunctionResultType.Boolean;
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo100034a(u0f... u0fVarArr) {
        for (u0f u0fVar : u0fVarArr) {
            if (!((Boolean) u0fVar.f172903b).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}

package p149l;

import com.tantanapp.engine.FunctionResultType;

/* JADX INFO: loaded from: classes13.dex */
public abstract class vj2<T> {

    /* JADX INFO: renamed from: a */
    public String f181659a = "EngineFunction";

    /* JADX INFO: renamed from: a */
    public abstract T mo100034a(u0f... u0fVarArr);

    /* JADX INFO: renamed from: b */
    public double m198619b(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).doubleValue();
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).doubleValue();
        }
        return obj instanceof Float ? ((Float) obj).doubleValue() : ((Double) obj).doubleValue();
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo100035c();

    /* JADX INFO: renamed from: d */
    public abstract FunctionResultType mo100036d();
}

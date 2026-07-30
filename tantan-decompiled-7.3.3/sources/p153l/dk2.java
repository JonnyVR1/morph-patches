package p153l;

import com.tantanapp.engine.FunctionResultType;

/* JADX INFO: loaded from: classes11.dex */
public abstract class dk2<T> {

    /* JADX INFO: renamed from: a */
    public String f88963a = "EngineFunction";

    /* JADX INFO: renamed from: a */
    public abstract T mo116186a(y1f... y1fVarArr);

    /* JADX INFO: renamed from: b */
    public double m116187b(Object obj) {
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
    public abstract String mo116188c();

    /* JADX INFO: renamed from: d */
    public abstract FunctionResultType mo116189d();
}

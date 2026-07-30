package p149l;

import com.tantanapp.engine.FunctionResultType;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class ecj0 extends vj2<Double> {
    @Override // p149l.vj2
    /* JADX INFO: renamed from: c */
    public String mo100035c() {
        return "t_time";
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo100036d() {
        return FunctionResultType.Number;
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Double mo100034a(u0f... u0fVarArr) {
        try {
            return Double.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse((String) u0fVarArr[0].f172903b).getTime());
        } catch (Exception unused) {
            return Double.valueOf(-1.0d);
        }
    }
}

package p153l;

import com.tantanapp.engine.FunctionResultType;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class ilj0 extends dk2<Double> {
    @Override // p153l.dk2
    /* JADX INFO: renamed from: c */
    public String mo116188c() {
        return "t_time";
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo116189d() {
        return FunctionResultType.Number;
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Double mo116186a(y1f... y1fVarArr) {
        try {
            return Double.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse((String) y1fVarArr[0].f197095b).getTime());
        } catch (Exception unused) {
            return Double.valueOf(-1.0d);
        }
    }
}

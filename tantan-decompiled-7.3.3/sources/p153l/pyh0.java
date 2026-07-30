package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantanapp.engine.FunctionResultType;

/* JADX INFO: loaded from: classes11.dex */
public class pyh0 extends dk2<Double> {
    @Override // p153l.dk2
    /* JADX INFO: renamed from: c */
    public String mo116188c() {
        return "t_version";
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo116189d() {
        return FunctionResultType.Boolean;
    }

    @Override // p153l.dk2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Double mo116186a(y1f[] y1fVarArr) {
        String[] strArrSplit = ((String) y1fVarArr[0].f197095b).split("\\.");
        int i = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (String str : strArrSplit) {
            d += Double.parseDouble(str) * ((double) i);
            i /= 100;
        }
        return Double.valueOf(d);
    }
}

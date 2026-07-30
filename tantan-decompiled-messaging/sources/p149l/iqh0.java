package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantanapp.engine.FunctionResultType;

/* JADX INFO: loaded from: classes13.dex */
public class iqh0 extends vj2<Double> {
    @Override // p149l.vj2
    /* JADX INFO: renamed from: c */
    public String mo100035c() {
        return "t_version";
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: d */
    public FunctionResultType mo100036d() {
        return FunctionResultType.Boolean;
    }

    @Override // p149l.vj2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Double mo100034a(u0f[] u0fVarArr) {
        String[] strArrSplit = ((String) u0fVarArr[0].f172903b).split("\\.");
        int i = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (String str : strArrSplit) {
            d += Double.parseDouble(str) * ((double) i);
            i /= 100;
        }
        return Double.valueOf(d);
    }
}

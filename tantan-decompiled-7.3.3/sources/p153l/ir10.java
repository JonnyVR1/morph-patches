package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class ir10 {

    /* JADX INFO: renamed from: a */
    public static final String f116487a;

    static {
        f116487a = !wft.m206159b(2) ? "[live][MultiCall][intl]" : cd10.f81073a;
    }

    /* JADX INFO: renamed from: a */
    public static void m141746a(String str) {
        if (wft.m206159b(2)) {
            fhw.m125605a(f116487a, str);
        } else {
            nsh0.m164604f(str, f116487a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m141747b(String str, @Nullable BLiveMultiCall bLiveMultiCall, @Nullable HashMap<String, BLiveMultiCall> map) {
        String str2 = bLiveMultiCall != null ? bLiveMultiCall.userId : "NULL";
        if (map == null) {
            m141746a("opName = " + str + ", opCallUserId = " + str2);
            return;
        }
        m141746a("opName = " + str + ", opCallUserId = " + str2 + ", callMap = " + euk.m122578d(new ArrayList(map.values())));
    }
}

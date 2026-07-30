package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class yi10 {

    /* JADX INFO: renamed from: a */
    public static final String f198437a;

    static {
        f198437a = !vdt.m198092b(2) ? "[live][MultiCall][intl]" : s410.f162235a;
    }

    /* JADX INFO: renamed from: a */
    public static void m214879a(String str) {
        if (vdt.m198092b(2)) {
            hfw.m130790a(f198437a, str);
        } else {
            gkh0.m126623f(str, f198437a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m214880b(String str, @Nullable BLiveMultiCall bLiveMultiCall, @Nullable HashMap<String, BLiveMultiCall> map) {
        String str2 = bLiveMultiCall != null ? bLiveMultiCall.userId : "NULL";
        if (map == null) {
            m214879a("opName = " + str + ", opCallUserId = " + str2);
            return;
        }
        m214879a("opName = " + str + ", opCallUserId = " + str2 + ", callMap = " + ork.m165672d(new ArrayList(map.values())));
    }
}

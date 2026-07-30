package p149l;

import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class nxf0 {

    /* JADX INFO: renamed from: b */
    private static nxf0 f141021b;

    /* JADX INFO: renamed from: a */
    private final Map<String, MMKV> f141022a = new ConcurrentHashMap();

    private nxf0() {
    }

    /* JADX INFO: renamed from: a */
    public static nxf0 m161944a() {
        if (f141021b == null) {
            synchronized (nxf0.class) {
                try {
                    if (f141021b == null) {
                        f141021b = new nxf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f141021b;
    }

    /* JADX INFO: renamed from: b */
    public MMKV m161945b(String str) {
        if (TextUtils.isEmpty(str)) {
            qkq0.m175383a("getKV serviceId is null");
            return null;
        }
        MMKV mmkv = this.f141022a.get(str);
        if (mmkv != null) {
            return mmkv;
        }
        MMKV mmkvMmkvWithID = MMKV.mmkvWithID(str);
        this.f141022a.put(str, mmkvMmkvWithID);
        return mmkvMmkvWithID;
    }
}

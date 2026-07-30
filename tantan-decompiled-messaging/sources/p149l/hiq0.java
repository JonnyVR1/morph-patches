package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.nativecrash.NativeImpl;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class hiq0 {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f107958a;

    public hiq0(File file) {
        String strM5164l;
        File fileM113925m = dwq0.m113925m(file);
        if (!fileM113925m.exists() || fileM113925m.length() == 0 || (strM5164l = NativeImpl.m5164l(fileM113925m.getAbsolutePath())) == null) {
            return;
        }
        String[] strArrSplit = strM5164l.split(SignParameters.NEW_LINE);
        this.f107958a = new HashMap();
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split("=");
            if (strArrSplit2.length == 2) {
                this.f107958a.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m131293a() {
        Map<String, String> map = this.f107958a;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f107958a.get("process_name")) || TextUtils.isEmpty(this.f107958a.get("crash_thread_name")) || TextUtils.isEmpty(this.f107958a.get("pid")) || TextUtils.isEmpty(this.f107958a.get("tid")) || TextUtils.isEmpty(this.f107958a.get("start_time")) || TextUtils.isEmpty(this.f107958a.get("crash_time")) || TextUtils.isEmpty(this.f107958a.get("signal_line"))) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public String m131294b() {
        return this.f107958a.get("signal_line");
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m131295c() {
        return this.f107958a;
    }
}

package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.nativecrash.NativeImpl;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mrq0 {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f138405a;

    public mrq0(File file) {
        String strM5174l;
        File fileM143577m = j5r0.m143577m(file);
        if (!fileM143577m.exists() || fileM143577m.length() == 0 || (strM5174l = NativeImpl.m5174l(fileM143577m.getAbsolutePath())) == null) {
            return;
        }
        String[] strArrSplit = strM5174l.split(SignParameters.NEW_LINE);
        this.f138405a = new HashMap();
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split("=");
            if (strArrSplit2.length == 2) {
                this.f138405a.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m159709a() {
        Map<String, String> map = this.f138405a;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f138405a.get("process_name")) || TextUtils.isEmpty(this.f138405a.get("crash_thread_name")) || TextUtils.isEmpty(this.f138405a.get("pid")) || TextUtils.isEmpty(this.f138405a.get("tid")) || TextUtils.isEmpty(this.f138405a.get("start_time")) || TextUtils.isEmpty(this.f138405a.get("crash_time")) || TextUtils.isEmpty(this.f138405a.get("signal_line"))) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public String m159710b() {
        return this.f138405a.get("signal_line");
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m159711c() {
        return this.f138405a;
    }
}

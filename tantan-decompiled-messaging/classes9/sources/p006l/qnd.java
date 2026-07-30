package p006l;

import android.text.TextUtils;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import l.e51;
import l.ggi;
import l.rhi;
import l.uqd0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qnd implements ggi.b<String> {

    /* JADX INFO: renamed from: f */
    public static JSONObject f19926f;

    /* JADX INFO: renamed from: a */
    public String f19927a;

    /* JADX INFO: renamed from: b */
    public String f19928b;

    /* JADX INFO: renamed from: c */
    public String f19929c;

    /* JADX INFO: renamed from: d */
    public String f19930d;

    /* JADX INFO: renamed from: e */
    public uqd0 f19931e;

    static {
        String strF = RemoteConfig.x().F("android_filepersistent");
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        try {
            f19926f = new JSONObject(strF);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    public qnd(String str, String str2, String str3) {
        this.f19927a = str;
        this.f19930d = TextUtils.isEmpty(str2) ? "" : str2;
        this.f19928b = TextUtils.isEmpty(str3) ? "" : str3;
        this.f19929c = this.f19927a + this.f19928b + "_suffix";
        this.f19931e = new uqd0(this.f19929c, this.f19930d + "@version@0", true, "filepersistentsp");
    }

    /* JADX INFO: renamed from: b */
    public final void m22292b(final String str, final int i) {
        e51.y(new Runnable() { // from class: l.pnd
            @Override // java.lang.Runnable
            public final void run() {
                this.f19221a.m22295e(str, i);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final String m22293c(String str, String str2, String str3, int i) {
        String str4;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        if (i == 0) {
            str4 = "";
        } else {
            str4 = "_" + i;
        }
        sb.append(str4);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String getFileName() {
        int iMax = 0;
        int iOptInt = (NullChecker.a(f19926f) && f19926f.has(this.f19927a)) ? f19926f.optInt(this.f19927a) : 0;
        String str = (String) this.f19931e.get();
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("@version@");
                if (strArrSplit.length == 2) {
                    String str2 = strArrSplit[0];
                    int i = Integer.parseInt(strArrSplit[1]);
                    if (i < iOptInt || !str2.equals(this.f19930d)) {
                        m22292b(str2, i);
                        this.f19931e.put(this.f19930d + "@version@" + iOptInt);
                    }
                    iMax = Math.max(iOptInt, i);
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        return m22293c(this.f19927a, this.f19930d, this.f19928b, iMax);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m22295e(String str, int i) {
        File file = new File(ggi.f());
        if (file.exists()) {
            rhi.m(new File(file, m22293c(this.f19927a, str, this.f19928b, i)).getAbsolutePath());
        }
    }
}

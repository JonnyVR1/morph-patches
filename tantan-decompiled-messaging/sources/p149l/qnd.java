package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class qnd implements ggi.InterfaceC17075b<String> {

    /* JADX INFO: renamed from: f */
    public static JSONObject f155411f;

    /* JADX INFO: renamed from: a */
    public String f155412a;

    /* JADX INFO: renamed from: b */
    public String f155413b;

    /* JADX INFO: renamed from: c */
    public String f155414c;

    /* JADX INFO: renamed from: d */
    public String f155415d;

    /* JADX INFO: renamed from: e */
    public uqd0 f155416e;

    static {
        String strM79302F = RemoteConfig.m79298x().m79302F("android_filepersistent");
        if (TextUtils.isEmpty(strM79302F)) {
            return;
        }
        try {
            f155411f = new JSONObject(strM79302F);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    public qnd(String str, String str2, String str3) {
        this.f155412a = str;
        this.f155415d = TextUtils.isEmpty(str2) ? "" : str2;
        this.f155413b = TextUtils.isEmpty(str3) ? "" : str3;
        this.f155414c = this.f155412a + this.f155413b + "_suffix";
        this.f155416e = new uqd0(this.f155414c, this.f155415d + "@version@0", true, "filepersistentsp");
    }

    /* JADX INFO: renamed from: b */
    public final void m175634b(final String str, final int i) {
        e51.m114774y(new Runnable() { // from class: l.pnd
            @Override // java.lang.Runnable
            public final void run() {
                this.f150382a.m175637e(str, i);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final String m175635c(String str, String str2, String str3, int i) {
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

    @Override // p149l.ggi.InterfaceC17075b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String getFileName() {
        int iMax = 0;
        int iOptInt = (NullChecker.m81303a(f155411f) && f155411f.has(this.f155412a)) ? f155411f.optInt(this.f155412a) : 0;
        String str = this.f155416e.get();
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("@version@");
                if (strArrSplit.length == 2) {
                    String str2 = strArrSplit[0];
                    int i = Integer.parseInt(strArrSplit[1]);
                    if (i < iOptInt || !str2.equals(this.f155415d)) {
                        m175634b(str2, i);
                        this.f155416e.put(this.f155415d + "@version@" + iOptInt);
                    }
                    iMax = Math.max(iOptInt, i);
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        return m175635c(this.f155412a, this.f155415d, this.f155413b, iMax);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m175637e(String str, int i) {
        File file = new File(ggi.m125965f());
        if (file.exists()) {
            rhi.m179369m(new File(file, m175635c(this.f155412a, str, this.f155413b, i)).getAbsolutePath());
        }
    }
}

package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class vod implements dji.InterfaceC16550b<String> {

    /* JADX INFO: renamed from: f */
    public static JSONObject f185022f;

    /* JADX INFO: renamed from: a */
    public String f185023a;

    /* JADX INFO: renamed from: b */
    public String f185024b;

    /* JADX INFO: renamed from: c */
    public String f185025c;

    /* JADX INFO: renamed from: d */
    public String f185026d;

    /* JADX INFO: renamed from: e */
    public wyd0 f185027e;

    static {
        String strM80485F = RemoteConfig.m80481x().m80485F("android_filepersistent");
        if (TextUtils.isEmpty(strM80485F)) {
            return;
        }
        try {
            f185022f = new JSONObject(strM80485F);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    public vod(String str, String str2, String str3) {
        this.f185023a = str;
        this.f185026d = TextUtils.isEmpty(str2) ? "" : str2;
        this.f185024b = TextUtils.isEmpty(str3) ? "" : str3;
        this.f185025c = this.f185023a + this.f185024b + "_suffix";
        this.f185027e = new wyd0(this.f185025c, this.f185026d + "@version@0", true, "filepersistentsp");
    }

    /* JADX INFO: renamed from: b */
    public final void m202087b(final String str, final int i) {
        l51.m152919y(new Runnable() { // from class: l.uod
            @Override // java.lang.Runnable
            public final void run() {
                this.f180032a.m202090e(str, i);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final String m202088c(String str, String str2, String str3, int i) {
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

    @Override // p153l.dji.InterfaceC16550b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String getFileName() {
        int iMax = 0;
        int iOptInt = (NullChecker.m82486a(f185022f) && f185022f.has(this.f185023a)) ? f185022f.optInt(this.f185023a) : 0;
        String str = this.f185027e.get();
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("@version@");
                if (strArrSplit.length == 2) {
                    String str2 = strArrSplit[0];
                    int i = Integer.parseInt(strArrSplit[1]);
                    if (i < iOptInt || !str2.equals(this.f185026d)) {
                        m202087b(str2, i);
                        this.f185027e.put(this.f185026d + "@version@" + iOptInt);
                    }
                    iMax = Math.max(iOptInt, i);
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        return m202088c(this.f185023a, this.f185026d, this.f185024b, iMax);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m202090e(String str, int i) {
        File file = new File(dji.m116097f());
        if (file.exists()) {
            oki.m168025m(new File(file, m202088c(this.f185023a, str, this.f185024b, i)).getAbsolutePath());
        }
    }
}

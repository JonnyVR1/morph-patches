package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.common.thread.C3486c;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b1b extends qpl {

    /* JADX INFO: renamed from: l.b1b$a */
    public class RunnableC15886a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f74352a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f74353b;

        public RunnableC15886a(String str, String str2) {
            this.f74352a = str;
            this.f74353b = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                JSONArray jSONArray = new JSONArray(this.f74352a);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String strOptString = jSONArray.optString(i);
                    if (strOptString != null) {
                        sb.append(strOptString);
                        sb.append(SignParameters.NEW_LINE);
                    }
                }
                String string = sb.toString();
                String.format("filePath: %s\ncontent: %s", this.f74353b, string);
                FileUtil.m17516B(FileUtil.m17531o(this.f74353b), string);
            } catch (Exception e) {
                Log.e("storageBridge", "", e);
            }
        }
    }

    /* JADX INFO: renamed from: l.b1b$b */
    public class RunnableC15887b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f74355a;

        public RunnableC15887b(String str) {
            this.f74355a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zIsEmpty = TextUtils.isEmpty(this.f74355a);
            b1b b1bVar = b1b.this;
            if (zIsEmpty) {
                FileUtil.m17527k(ckw.m110395d(b1bVar.m177460c()));
            } else {
                FileUtil.m17527k(b1bVar.m101469v(b1bVar.m177460c(), this.f74355a));
            }
        }
    }

    /* JADX INFO: renamed from: l.b1b$c */
    public class RunnableC15888c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f74357a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f74358b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f74359c;

        public RunnableC15888c(String str, String str2, String str3) {
            this.f74357a = str;
            this.f74358b = str2;
            this.f74359c = str3;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                b1b b1bVar = b1b.this;
                File fileM101470w = b1bVar.m101470w(b1bVar.m177460c(), this.f74357a, this.f74358b);
                if (fileM101470w == null) {
                    return;
                }
                if (fileM101470w.exists()) {
                    fileM101470w.delete();
                } else {
                    fileM101470w.createNewFile();
                }
                FileUtil.m17541y(this.f74359c.getBytes(), fileM101470w);
                jzv.m147728a(qpl.f158878b, "tang------写入文件内容耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "   file " + fileM101470w.getAbsolutePath());
            } catch (Exception e) {
                Log.e(qpl.f158878b, "", e);
            }
        }
    }

    public b1b(hul hulVar) {
        super(hulVar);
    }

    /* JADX INFO: renamed from: A */
    private void m101465A(String str, String str2, String str3) {
        String strM101468t = m101468t(str2);
        if (strM101468t == null) {
            return;
        }
        C3486c.m17566d(1, new RunnableC15886a(str3, strM101468t + File.separator + str));
    }

    /* JADX INFO: renamed from: t */
    private String m101468t(String str) {
        String str2 = m177460c().getFilesDir().getAbsolutePath() + "/coverage/6/" + str;
        File file = new File(str2);
        if (file.exists() || file.mkdirs()) {
            return str2;
        }
        String.format("mkdir failed: %s", str2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public File m101469v(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return new File(ckw.m110395d(context), oiw.m167803f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public File m101470w(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String strM167803f = oiw.m167803f(str2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return ckw.m110396e(context, strM167803f, oiw.m167803f(str));
    }

    /* JADX INFO: renamed from: x */
    private boolean m101471x(String str, String str2, String str3) {
        long j;
        String.format("interceptByWolfGameLog(%s, %s, %s)", str, str2, str3);
        if (!"MKLog".equals(str) || !"WolfGameTimeStamp".equals(str2)) {
            return false;
        }
        try {
            long j2 = Long.parseLong(str3);
            long j3 = Long.parseLong(m101475u("MKLog", "WolfGameTimeStampStart"));
            m101476z("MKLog", "WolfGameTimeStampStart");
            j = j3 - j2;
        } catch (Exception e) {
            Log.e(qpl.f158878b, "", e);
            j = 0;
        }
        if (j <= 0) {
            return true;
        }
        m101472y(j);
        return true;
    }

    /* JADX INFO: renamed from: y */
    private void m101472y(long j) {
        bmw bmwVar = new bmw();
        hul hulVar = this.f158879a;
        String originURL = hulVar != null ? hulVar.getOriginURL() : "";
        bmwVar.m116161k(originURL);
        bmwVar.m116159i(a6k0.m96329a(originURL));
        bmwVar.m105272l(j);
        mkw.m158843f().m158849j(bmwVar);
        String.format("logWolfGame---log: %s", bmwVar.toString());
    }

    /* JADX INFO: renamed from: B */
    public boolean m101473B(String str, String str2, String str3) {
        if (m101471x(str, str2, str3)) {
            return true;
        }
        if (str3 == null) {
            str3 = "";
        }
        C3486c.m17566d(3, new RunnableC15888c(str2, str, str3));
        return true;
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(String str, String str2, JSONObject jSONObject) throws Exception {
        if (m177460c() == null) {
            return true;
        }
        str2.getClass();
        switch (str2) {
            case "clearItem":
                m101474s(jSONObject.optString("path"), jSONObject.optString(Constants.KEY_KEY));
                return true;
            case "getItem":
                m177463g(jSONObject.optString("callback"), m101475u(jSONObject.optString("path"), jSONObject.optString(Constants.KEY_KEY)));
                return true;
            case "setCoverageData":
                m101465A(jSONObject.optString(Constants.KEY_KEY), jSONObject.optString("commitid"), jSONObject.optString("value"));
                return true;
            case "removeItem":
                m101476z(jSONObject.optString("path"), jSONObject.optString(Constants.KEY_KEY));
                return true;
            case "setItem":
                m101473B(jSONObject.optString("path"), jSONObject.optString(Constants.KEY_KEY), jSONObject.optString("value"));
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m101474s(String str, String str2) {
        try {
            C3486c.m17566d(2, new RunnableC15887b(str));
        } catch (Exception e) {
            Log.e(qpl.f158878b, "", e);
        }
    }

    /* JADX INFO: renamed from: u */
    public String m101475u(String str, String str2) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            File fileM101470w = m101470w(m177460c(), str2, str);
            byte[] bArrM17533q = FileUtil.m17533q(fileM101470w);
            if (bArrM17533q == null) {
                return "";
            }
            String str3 = new String(bArrM17533q);
            jzv.m147728a(qpl.f158878b, "tang------读取文件内容耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "   file " + fileM101470w.getAbsolutePath());
            return str3;
        } catch (Exception e) {
            Log.e(qpl.f158878b, "", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: z */
    public void m101476z(String str, String str2) {
        try {
            File fileM101470w = m101470w(m177460c(), str2, str);
            if (fileM101470w == null || !fileM101470w.exists()) {
                return;
            }
            fileM101470w.delete();
        } catch (Exception e) {
            Log.e(qpl.f158878b, "", e);
        }
    }
}

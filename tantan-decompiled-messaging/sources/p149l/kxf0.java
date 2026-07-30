package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.FileUtil;
import com.immomo.mmutil.log.Log4Android;
import com.immomo.mmutil.task.C3804c;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class kxf0 extends fnl {

    /* JADX INFO: renamed from: l.kxf0$a */
    public class RunnableC18108a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f125107a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f125108b;

        public RunnableC18108a(String str, String str2) {
            this.f125107a = str;
            this.f125108b = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                JSONArray jSONArray = new JSONArray(this.f125107a);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String strOptString = jSONArray.optString(i);
                    if (strOptString != null) {
                        sb.append(strOptString);
                        sb.append(SignParameters.NEW_LINE);
                    }
                }
                String string = sb.toString();
                MDLog.m7390d("StorageBridge", "filePath: %s\ncontent: %s", this.f125108b, string);
                FileUtil.m18416m(FileUtil.m18409f(this.f125108b), string);
            } catch (Exception e) {
                MDLog.printErrStackTrace("storageBridge", e);
            }
        }
    }

    /* JADX INFO: renamed from: l.kxf0$b */
    public class RunnableC18109b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f125110a;

        public RunnableC18109b(String str) {
            this.f125110a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zIsEmpty = TextUtils.isEmpty(this.f125110a);
            kxf0 kxf0Var = kxf0.this;
            if (zIsEmpty) {
                FileUtil.m18406c(ohw.m164467e(kxf0Var.m122322a()));
            } else {
                FileUtil.m18406c(kxf0Var.m147751n(kxf0Var.m122322a(), this.f125110a));
            }
        }
    }

    /* JADX INFO: renamed from: l.kxf0$c */
    public class RunnableC18110c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f125112a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f125113b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f125114c;

        public RunnableC18110c(String str, String str2, String str3) {
            this.f125112a = str;
            this.f125113b = str2;
            this.f125114c = str3;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                kxf0 kxf0Var = kxf0.this;
                File fileM147752o = kxf0Var.m147752o(kxf0Var.m122322a(), this.f125112a, this.f125113b);
                if (fileM147752o == null) {
                    return;
                }
                if (fileM147752o.exists()) {
                    fileM147752o.delete();
                } else {
                    fileM147752o.createNewFile();
                }
                FileUtil.m18413j(this.f125114c.getBytes(), fileM147752o);
                mxv.m156926a(fnl.f98429b, "tang------写入文件内容耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "   file " + fileM147752o.getAbsolutePath());
            } catch (Exception e) {
                Log4Android.m18417f().m18422e(e);
            }
        }
    }

    public kxf0(MKWebView mKWebView) {
        super(mKWebView);
    }

    /* JADX INFO: renamed from: l */
    private String m147750l(String str) {
        String str2 = m122322a().getFilesDir().getAbsolutePath() + "/coverage/6/" + str;
        File file = new File(str2);
        if (file.exists() || file.mkdirs()) {
            return str2;
        }
        MDLog.m7390d("StorageBridge", "mkdir failed: %s", str2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public File m147751n(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return new File(ohw.m164467e(context), pgw.m168922f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public File m147752o(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String strM168922f = pgw.m168922f(str2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return ohw.m164468f(context, strM168922f, pgw.m168922f(str));
    }

    /* JADX INFO: renamed from: p */
    private boolean m147753p(String str, String str2, String str3) {
        long j;
        MDLog.m7390d(fnl.f98429b, "interceptByWolfGameLog(%s, %s, %s)", str, str2, str3);
        if (!"MKLog".equals(str) || !"WolfGameTimeStamp".equals(str2)) {
            return false;
        }
        try {
            long j2 = Long.parseLong(str3);
            long j3 = Long.parseLong(m147757m("MKLog", "WolfGameTimeStampStart"));
            m147758r("MKLog", "WolfGameTimeStampStart");
            j = j3 - j2;
        } catch (Exception e) {
            MDLog.printErrStackTrace(fnl.f98429b, e);
            j = 0;
        }
        if (j <= 0) {
            return true;
        }
        m147754q(j);
        return true;
    }

    /* JADX INFO: renamed from: q */
    private void m147754q(long j) {
        cjw cjwVar = new cjw();
        MKWebView mKWebView = this.f98430a;
        String originURL = mKWebView != null ? mKWebView.getOriginURL() : "";
        cjwVar.m101944m(originURL);
        cjwVar.m101942k(zhw.m218869b(originURL));
        cjwVar.m107258n(j);
        uhw.m193793e().m193799i(cjwVar);
        MDLog.m7390d(fnl.f98429b, "logWolfGame---log: %s", cjwVar.toString());
    }

    /* JADX INFO: renamed from: s */
    private void m147755s(String str, String str2, String str3) {
        String strM147750l = m147750l(str2);
        if (strM147750l == null) {
            return;
        }
        C3804c.m18444d(1, new RunnableC18108a(str3, strM147750l + File.separator + str));
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception {
        if (m122322a() == null) {
            return true;
        }
        str2.getClass();
        switch (str2) {
            case "clearItem":
                m147756k(jSONObject.optString("path"), jSONObject.optString(Constants.KEY_KEY));
                return true;
            case "getItem":
                m122324c(jSONObject.optString("callback"), m147757m(jSONObject.optString("path"), jSONObject.optString(Constants.KEY_KEY)));
                return true;
            case "setCoverageData":
                m147755s(jSONObject.optString(Constants.KEY_KEY), jSONObject.optString("commitid"), jSONObject.optString("value"));
                return true;
            case "removeItem":
                m147758r(jSONObject.optString("path"), jSONObject.optString(Constants.KEY_KEY));
                return true;
            case "setItem":
                m147759t(jSONObject.optString("path"), jSONObject.optString(Constants.KEY_KEY), jSONObject.optString("value"));
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m147756k(String str, String str2) {
        try {
            C3804c.m18444d(2, new RunnableC18109b(str));
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public String m147757m(String str, String str2) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            File fileM147752o = m147752o(m122322a(), str2, str);
            byte[] bArrM18410g = FileUtil.m18410g(fileM147752o);
            if (bArrM18410g == null) {
                return "";
            }
            String str3 = new String(bArrM18410g);
            mxv.m156926a(fnl.f98429b, "tang------读取文件内容耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "   file " + fileM147752o.getAbsolutePath());
            return str3;
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: r */
    public void m147758r(String str, String str2) {
        try {
            File fileM147752o = m147752o(m122322a(), str2, str);
            if (fileM147752o == null || !fileM147752o.exists()) {
                return;
            }
            fileM147752o.delete();
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m147759t(String str, String str2, String str3) {
        if (m147753p(str, str2, str3)) {
            return true;
        }
        if (str3 == null) {
            str3 = "";
        }
        C3804c.m18444d(3, new RunnableC18110c(str2, str, str3));
        return true;
    }
}

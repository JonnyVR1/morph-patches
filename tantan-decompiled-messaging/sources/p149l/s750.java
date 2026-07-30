package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.task.C3804c;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.sina.weibo.sdk.constant.WBConstants;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s750 extends fnl {

    /* JADX INFO: renamed from: l.s750$b */
    public class RunnableC19868b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONArray f162894a;

        public RunnableC19868b(JSONArray jSONArray) {
            this.f162894a = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f162894a.length(); i++) {
                File fileM218871d = zhw.m218871d(this.f162894a.optString(i));
                if (fileM218871d != null && fileM218871d.exists() && fileM218871d.isFile()) {
                    fileM218871d.delete();
                }
            }
        }
    }

    public s750(MKWebView mKWebView) {
        super(mKWebView);
    }

    /* JADX INFO: renamed from: i */
    private void m182477i(JSONObject jSONObject) {
        String strM149943d = liw.m149943d(jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("resources");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        JSONObject jSONObject2 = new JSONObject();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObjectOptJSONObject.optString(next);
            if (TextUtils.isEmpty(strOptString)) {
                m182478j(jSONObject2, next, false);
            } else {
                String strM218869b = zhw.m218869b(strOptString);
                if (TextUtils.isEmpty(strM218869b)) {
                    m182478j(jSONObject2, next, false);
                } else {
                    File fileM154674b = nij.m159512a(strM218869b) ? mij.m154674b(strM218869b) : z750.m217437h(strM218869b);
                    if (fileM154674b == null || !fileM154674b.exists()) {
                        m182478j(jSONObject2, next, false);
                    } else {
                        File file = new File(fileM154674b, zhw.m218874g(strOptString));
                        if (!file.exists() || file.length() <= 0) {
                            m182478j(jSONObject2, next, false);
                        } else {
                            m182478j(jSONObject2, next, true);
                        }
                    }
                }
            }
        }
        m122324c(strM149943d, jSONObject2.toString());
    }

    /* JADX INFO: renamed from: j */
    private void m182478j(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.putOpt(str, Boolean.valueOf(z));
        } catch (JSONException e) {
            MDLog.printErrStackTrace(fnl.f98429b, e);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m182479k(JSONObject jSONObject) {
        try {
            C3804c.m18444d(2, new RunnableC19868b(jSONObject.optJSONArray("files")));
        } catch (Exception e) {
            MDLog.printErrStackTrace(fnl.f98429b, e);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m182480l(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("bid");
        String strM149943d = liw.m149943d(jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            m122324c(strM149943d, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{1}).toString());
            return;
        }
        kij kijVarM146091c = kij.m146091c(jSONObject);
        if (kijVarM146091c == null || !kijVarM146091c.m146093b()) {
            m122324c(strM149943d, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{1}).toString());
        } else {
            C3804c.m18444d(2, new RunnableC19867a(strOptString, kijVarM146091c, strM149943d));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception {
        v750 v750VarM214871t;
        h460 h460Var;
        long jM214873v;
        h460 h460VarM217446q;
        String strM149943d = liw.m149943d(jSONObject);
        str2.getClass();
        byte b = -1;
        switch (str2.hashCode()) {
            case -838846263:
                if (str2.equals("update")) {
                    b = 0;
                }
                break;
            case -759238347:
                if (str2.equals("clearCache")) {
                    b = 1;
                }
                break;
            case -694013204:
                if (str2.equals("isCached")) {
                    b = 2;
                }
                break;
            case -319981218:
                if (str2.equals("removeCache")) {
                    b = 3;
                }
                break;
            case -316963757:
                if (str2.equals("removeFiles")) {
                    b = 4;
                }
                break;
            case 297313881:
                if (str2.equals("isResourceOfflined")) {
                    b = 5;
                }
                break;
            case 408989319:
                if (str2.equals("getOfflineType")) {
                    b = 6;
                }
                break;
            case 821765105:
                if (str2.equals("checkUpdate")) {
                    b = 7;
                }
                break;
            case 1270772948:
                if (str2.equals("sendOfflineRequest")) {
                    b = 8;
                }
                break;
            case 1388468386:
                if (str2.equals("getVersion")) {
                    b = 9;
                }
                break;
        }
        switch (b) {
            case 0:
                mxv.m156926a(fnl.f98429b, "强制更新 " + jSONObject);
                yhw.m214862s().m214870p(jSONObject.optString("bid"), jSONObject.optString("url"), new ue3.C20412b().m193202e(this.f98430a).m193201d(strM149943d).m193203f(0).m193204g("更新成功").m193199b(0).m193200c("更新失败").m193198a());
                return true;
            case 1:
                yhw.m214862s().m214868k(new ue3.C20412b().m193202e(this.f98430a).m193201d(strM149943d).m193203f(0).m193204g("删除成功").m193199b(0).m193200c("删除失败").m193198a());
                return true;
            case 2:
                m122324c(strM149943d, liw.m149941b(new String[]{WBConstants.AUTH_PARAMS_VERSION}, new Object[]{Long.valueOf(yhw.m214862s().m214874x(jSONObject.optString("bid")))}).toString());
                return true;
            case 3:
                boolean zM214866D = yhw.m214862s().m214866D(jSONObject.optString("bid"));
                m122324c(strM149943d, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS, "message"}, new String[]{zM214866D ? "0" : "1", zM214866D ? "删除成功" : "删除失败"}).toString());
                return true;
            case 4:
                m182479k(jSONObject);
                return true;
            case 5:
                m182477i(jSONObject);
                return true;
            case 6:
                String strOptString = jSONObject.optString("bid");
                m122324c(strM149943d, liw.m149941b(new String[]{"type"}, new String[]{(TextUtils.isEmpty(strOptString) || (v750VarM214871t = yhw.m214862s().m214871t(strOptString)) == null || (h460Var = v750VarM214871t.f180303c) == null || TextUtils.isEmpty(h460Var.m129224e())) ? NotificationStatus.undefined : v750VarM214871t.f180303c.m129224e()}).toString());
                return true;
            case 7:
                mxv.m156926a(fnl.f98429b, "检查更新 " + jSONObject);
                yhw.m214862s().m214867j(jSONObject.optString("bid"), m122323b(), new ue3.C20412b().m193202e(this.f98430a).m193201d(strM149943d).m193203f(0).m193204g("更新成功").m193199b(0).m193200c("更新失败").m193198a());
                return true;
            case 8:
                m182480l(jSONObject);
                return true;
            case 9:
                String strOptString2 = jSONObject.optString("bid");
                if (jSONObject.optInt("ap") == 1) {
                    File fileM164464b = ohw.m164464b();
                    if (fileM164464b != null) {
                        fileM164464b = new File(fileM164464b, strOptString2);
                    }
                    jM214873v = (fileM164464b == null || (h460VarM217446q = z750.m217446q(fileM164464b.getAbsolutePath())) == null) ? 0L : h460VarM217446q.m129226g();
                } else {
                    jM214873v = yhw.m214862s().m214873v(strOptString2);
                }
                m122324c(strM149943d, jM214873v + "");
                return true;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: l.s750$a */
    public class RunnableC19867a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f162889a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ kij f162890b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f162891c;

        public RunnableC19867a(String str, kij kijVar, String str2) {
            this.f162889a = str;
            this.f162890b = kijVar;
            this.f162891c = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (mij.m154682j(this.f162889a, this.f162890b)) {
                s750.this.m122324c(this.f162891c, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{0}).toString());
            } else {
                lij.m149908h().m149915g(this.f162889a, this.f162890b, false, true, new a());
            }
        }

        /* JADX INFO: renamed from: l.s750$a$a */
        public class a implements uhj {
            public a() {
            }

            @Override // p149l.uhj
            /* JADX INFO: renamed from: c */
            public void mo182483c(String str, int i, Exception exc) {
                RunnableC19867a runnableC19867a = RunnableC19867a.this;
                if (i == 1) {
                    s750.this.m122324c(runnableC19867a.f162891c, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{2}).toString());
                } else {
                    s750.this.m122324c(runnableC19867a.f162891c, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{1}).toString());
                }
            }

            @Override // p149l.uhj
            /* JADX INFO: renamed from: d */
            public void mo182484d(String str, int i) {
                if (i == 1) {
                    RunnableC19867a runnableC19867a = RunnableC19867a.this;
                    s750.this.m122324c(runnableC19867a.f162891c, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{0}).toString());
                }
            }

            @Override // p149l.uhj
            /* JADX INFO: renamed from: a */
            public void mo182481a(String str, int i) {
            }

            @Override // p149l.uhj
            /* JADX INFO: renamed from: b */
            public void mo182482b(String str, int i, int i2, long j, long j2) {
            }
        }
    }
}

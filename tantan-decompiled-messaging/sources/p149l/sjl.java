package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.mmutil.FileUtil;
import com.immomo.mmutil.log.Log4Android;
import com.immomo.mmutil.task.C3804c;
import com.immomo.mwc.sdk.MWCEngine;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.tencent.open.SocialConstants;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.server.LocalServerHandler;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sjl extends fnl {

    /* JADX INFO: renamed from: l.sjl$a */
    public class RunnableC19957a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f164849a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f164850b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f164851c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ JSONObject f164852d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f164853e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f164854f;

        public RunnableC19957a(String str, JSONObject jSONObject, String str2, JSONObject jSONObject2, String str3, boolean z) {
            this.f164849a = str;
            this.f164850b = jSONObject;
            this.f164851c = str2;
            this.f164852d = jSONObject2;
            this.f164853e = str3;
            this.f164854f = z;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            String strM149940a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM184498l = sjl.this.m184498l(this.f164849a, this.f164850b);
            MDLog.m7390d(fnl.f98429b, "check pre fetch cast: %d, data: %s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), strM184498l);
            if (TextUtils.isEmpty(strM184498l)) {
                strM184498l = sjl.this.m184499m(this.f164849a, this.f164851c, this.f164850b);
            }
            if (TextUtils.isEmpty(strM184498l)) {
                try {
                    MKWebView mKWebView = sjl.this.f98430a;
                    strM184498l = sjl.m184501o(mKWebView == null ? null : mKWebView.getBid(), this.f164849a, this.f164851c, this.f164850b, this.f164852d);
                    MKWebView mKWebView2 = sjl.this.f98430a;
                    if (mKWebView2 != null && !mKWebView2.m87089v0()) {
                        MWCEngine.m19361D("HttpBridge", sjl.this.f98430a.getWorkerId(), "[MK页面接口请求成功]request:mk:post @url=%s, @ts=%d", this.f164849a, Long.valueOf(iow.m137389a()));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ec", -1);
                        jSONObject.put("em", "网络请求失败");
                        jSONObject.put("data", strM184498l);
                        jSONObject.put("exmsg", e.getMessage());
                        if (mxv.m156929d()) {
                            mxv.m156926a(fnl.f98429b, "tang-------执行request请求失败 " + jSONObject.toString());
                        }
                        sjl.this.m122324c(this.f164853e, jSONObject.toString());
                    } catch (JSONException e2) {
                        Log4Android.m18417f().m18422e(e2);
                    }
                }
            }
            if (TextUtils.isEmpty(strM184498l)) {
                return;
            }
            try {
                strM184498l = new JSONObject(strM184498l).toString();
            } catch (Exception unused) {
            }
            try {
                if (this.f164854f) {
                    strM149940a = Base64.encodeToString(strM184498l.getBytes(), 2);
                } else {
                    String strM149942c = liw.m149942c(strM184498l);
                    strM149940a = liw.m149940a(Uri.encode(liw.m149948i(strM184498l, strM149942c), "UTF-8"), strM149942c);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                strM149940a = strM184498l;
            }
            sjl.this.m122324c(this.f164853e, strM149940a);
        }
    }

    /* JADX INFO: renamed from: l.sjl$b */
    public class RunnableC19958b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f164856a;

        public RunnableC19958b(JSONObject jSONObject) {
            this.f164856a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            MKWebView mKWebView = sjl.this.f98430a;
            if (mKWebView == null || mKWebView.m87089v0()) {
                return;
            }
            String strOptString = this.f164856a.optString("bid");
            String strOptString2 = this.f164856a.optString("env");
            String strOptString3 = this.f164856a.optString("callback");
            if (TextUtils.isEmpty(strOptString)) {
                sjl.this.m122324c(strOptString3, liw.m149941b(new String[]{"error"}, new Object[]{"no bid!"}).toString());
                return;
            }
            LocalServerHandler.m87201h(strOptString2);
            LocalServerHandler.m87202i(strOptString);
            sjl.this.m122324c(strOptString3, LocalServerHandler.m87199f() ? liw.m149941b(new String[]{"host", IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, "sign"}, new Object[]{LocalServerHandler.m87194a(), Integer.valueOf(LocalServerHandler.m87195b()), LocalServerHandler.m87196c()}).toString() : liw.m149941b(new String[]{"error"}, new Object[]{"打开失败"}).toString());
        }
    }

    public sjl(MKWebView mKWebView) {
        super(mKWebView);
    }

    /* JADX INFO: renamed from: k */
    public static void m184497k(String str, JSONObject jSONObject) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            v750 v750VarM214871t = yhw.m214862s().m214871t(str);
            if (v750VarM214871t != null) {
                String strM197341g = v750VarM214871t.m197341g();
                if (TextUtils.isEmpty(strM197341g)) {
                    jSONObject.put("mkVersion", v750VarM214871t.m197340f());
                } else {
                    jSONObject.put("mkVersion", strM197341g);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public String m184498l(String str, JSONObject jSONObject) throws Throwable {
        MKWebView mKWebView = this.f98430a;
        if (mKWebView != null && !mKWebView.m87089v0()) {
            String originURL = this.f98430a.getOriginURL();
            if (TextUtils.isEmpty(originURL)) {
                return null;
            }
            Integer numValueOf = Integer.valueOf(this.f98430a.hashCode());
            String strM115856k = ee80.m115856k(numValueOf, str, jSONObject);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                ee80.m115855j().m115862m(strM115856k);
            } catch (InterruptedException e) {
                MDLog.printErrStackTrace(fnl.f98429b, e);
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            MDLog.m7390d(fnl.f98429b, "wait time: %d, prefetch key: %s", Long.valueOf(jCurrentTimeMillis2), strM115856k);
            File fileM115861h = ee80.m115855j().m115861h(numValueOf, originURL, strM115856k);
            if (fileM115861h != null && fileM115861h.exists()) {
                try {
                    String strM18411h = FileUtil.m18411h(fileM115861h);
                    ee80.m115855j().m115859d(strM115856k);
                    ji80 ji80Var = new ji80(strM18411h);
                    ji80Var.m141638e(jCurrentTimeMillis2);
                    return ji80Var.toString();
                } catch (IOException e2) {
                    MDLog.printErrStackTrace(fnl.f98429b, e2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public String m184499m(String str, String str2, JSONObject jSONObject) {
        MKWebView mKWebView = this.f98430a;
        if (mKWebView == null || mKWebView.m87089v0()) {
            return null;
        }
        return MWCEngine.m19358A(this.f98430a.getWorkerId(), str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: n */
    private void m184500n(JSONObject jSONObject) {
        MKWebView mKWebView = this.f98430a;
        if (mKWebView == null || mKWebView.m87089v0()) {
            return;
        }
        C3804c.m18444d(2, new RunnableC19958b(jSONObject));
    }

    /* JADX INFO: renamed from: o */
    public static String m184501o(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        HashMap map;
        vsl vslVarM169154a = phw.m169153b().m169154a();
        HashMap map2 = null;
        if (jSONObject != null) {
            map = new HashMap();
            if (jSONObject.optInt("needDeviceId", 0) == 1) {
                map.put(vslVarM169154a.mo87149g(0), vslVarM169154a.mo87147e(0));
            }
            m184497k(str, jSONObject);
            String strMo87149g = vslVarM169154a.mo87149g(1);
            String strMo87147e = vslVarM169154a.mo87147e(1);
            if (b0g0.m99776i(strMo87149g) && b0g0.m99776i(strMo87147e)) {
                map.put(strMo87149g, strMo87147e);
            }
            m184502p(map, jSONObject, null);
        } else {
            map = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        mxv.m156926a(fnl.f98429b, "tang-------执行request请求，开始 " + str2 + "  " + str3);
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.length() > 0) {
                    HashMap map3 = new HashMap();
                    try {
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map3.put(next, jSONObject2.optString(next));
                        }
                        map2 = map3;
                    } catch (Throwable th) {
                        th = th;
                        map2 = map3;
                        MDLog.printErrStackTrace(fnl.f98429b, th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String strMo87146d = "get".equalsIgnoreCase(str3) ? vslVarM169154a.mo87146d(str2, map, map2) : vslVarM169154a.mo87143a(str2, map, map2);
        if (mxv.m156929d()) {
            mxv.m156926a(fnl.f98429b, "tang-------执行request请求，结束 " + str2 + "  " + str3 + "    耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return strMo87146d;
    }

    /* JADX INFO: renamed from: p */
    public static void m184502p(Map<String, String> map, JSONObject jSONObject, String str) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof JSONObject) {
                    m184502p(map, (JSONObject) objOpt, m184504r(str, next, -1));
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object objOpt2 = jSONArray.opt(i);
                        if (objOpt2 != null) {
                            if (objOpt2 instanceof JSONObject) {
                                m184502p(map, (JSONObject) objOpt2, m184504r(str, next, i));
                            } else {
                                map.put(m184503q(str, next) + "[" + i + Constants.AES_SUFFIX, objOpt2.toString());
                            }
                        }
                    }
                } else {
                    map.put(m184503q(str, next), objOpt.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private static String m184503q(String str, String str2) {
        return m184505s(str) ? str2 : String.format(str, str2);
    }

    /* JADX INFO: renamed from: r */
    private static String m184504r(String str, String str2, int i) {
        String str3;
        if (i >= 0) {
            str3 = "[" + i + "][%s]";
        } else {
            str3 = "[%s]";
        }
        if (!m184505s(str)) {
            return String.format(str, str2).concat(str3);
        }
        return str2 + str3;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m184505s(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: t */
    private void m184506t(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, String str3, boolean z) {
        if (phw.m169153b().m169154a() == null) {
            MDLog.m7391e("MK", "mk-http-requester is NULL");
        } else {
            C3804c.m18444d(2, new RunnableC19957a(str, jSONObject2, str2, jSONObject, str3, z));
        }
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception {
        str2.getClass();
        boolean z = false;
        if (!str2.equals(SocialConstants.TYPE_REQUEST)) {
            if (str2.equals("createServer")) {
                m184500n(jSONObject);
            }
            return false;
        }
        String strOptString = jSONObject.optString(FirebaseAnalytics.Param.METHOD, "get");
        String strOptString2 = jSONObject.optString("url");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        if (jSONObject.has("encode") && jSONObject.getInt("encode") == 1) {
            z = true;
        }
        m184506t(strOptString2, strOptString, jSONObjectOptJSONObject, jSONObjectOptJSONObject2, jSONObject.optString("callback"), z);
        return true;
    }
}

package com.weibo.ssosdk;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import p149l.lnp0;
import p149l.u100;
import p149l.whq0;

/* JADX INFO: loaded from: classes2.dex */
public class WeiboSsoSdk {
    private static final String AID_FILE_NAME = "weibo_sso_sdk_aid";
    private static final String INIT_FILE_NAME = "weibo_sso_sdk_init";
    private static final String LOGIN_URL = "https://login.sina.com.cn/visitor/signin";
    private static final int SDK_ACT_UPLOAD = 2;
    private static final int SDK_ACT_VISITORLOGIN = 1;
    public static final String SDK_VERSION_CODE = "1.0";
    private static final String TAG = "WeiboSsoSdk";
    private static final int VERSION = 1;
    private static lnp0 config;
    private static WeiboSsoSdk sInstance;
    private int mCallCount;
    private C14694d mVisitorLoginInfo;
    private volatile ReentrantLock mTaskLock = new ReentrantLock(true);
    private boolean isFirstUpload = true;

    /* JADX INFO: renamed from: com.weibo.ssosdk.WeiboSsoSdk$a */
    public class RunnableC14691a implements Runnable {
        public RunnableC14691a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Thread.sleep(86400000L);
                    WeiboSsoSdk.m85254i().m85257l((WeiboSsoSdk.this.mVisitorLoginInfo == null || TextUtils.isEmpty(WeiboSsoSdk.this.mVisitorLoginInfo.m85260a())) ? WeiboSsoSdk.this.m85256k() : WeiboSsoSdk.this.mVisitorLoginInfo.m85260a(), 2);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.weibo.ssosdk.WeiboSsoSdk$b */
    public class RunnableC14692b implements Runnable {
        public RunnableC14692b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(Constants.ONE_MIN_IN_MILLIS);
                if (WeiboSsoSdk.this.isFirstUpload) {
                    WeiboSsoSdk.this.m85257l((WeiboSsoSdk.this.mVisitorLoginInfo == null || TextUtils.isEmpty(WeiboSsoSdk.this.mVisitorLoginInfo.m85260a())) ? WeiboSsoSdk.this.m85256k() : WeiboSsoSdk.this.mVisitorLoginInfo.m85260a(), 2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.weibo.ssosdk.WeiboSsoSdk$c */
    public class RunnableC14693c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC14695a f61518a;

        public RunnableC14693c(InterfaceC14695a interfaceC14695a) {
            this.f61518a = interfaceC14695a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WeiboSsoSdk.this.m85257l("", 1);
            } catch (Exception unused) {
            }
            if (WeiboSsoSdk.this.mVisitorLoginInfo == null) {
                WeiboSsoSdk.this.mVisitorLoginInfo = new C14694d();
            }
            this.f61518a.handler(WeiboSsoSdk.this.mVisitorLoginInfo);
        }
    }

    /* JADX INFO: renamed from: com.weibo.ssosdk.WeiboSsoSdk$d */
    public static final class C14694d {

        /* JADX INFO: renamed from: a */
        private String f61520a = "";

        /* JADX INFO: renamed from: b */
        private String f61521b = "";

        /* JADX INFO: renamed from: c */
        public static C14694d m85259c(String str) throws Exception {
            C14694d c14694d = new C14694d();
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("retcode", "");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (strOptString.equals("20000000") && jSONObject2 != null) {
                c14694d.f61520a = jSONObject2.optString("aid", "");
                c14694d.f61521b = jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_SUB, "");
                return c14694d;
            }
            throw new Exception("error： " + strOptString + " msg:" + jSONObject.optString("msg", ""));
        }

        /* JADX INFO: renamed from: a */
        public String m85260a() {
            return this.f61520a;
        }

        /* JADX INFO: renamed from: b */
        public String m85261b() {
            return this.f61521b;
        }
    }

    static {
        System.loadLibrary("wind");
    }

    private WeiboSsoSdk() throws Exception {
        lnp0 lnp0Var = config;
        if (lnp0Var == null || !lnp0Var.m150705q()) {
            whq0.m203241a("config error");
            throw null;
        }
        this.mCallCount = 0;
        new Thread(new RunnableC14691a()).start();
        new Thread(new RunnableC14692b()).start();
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m85251f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(m85253h(1));
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.close();
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: g */
    private String m85252g(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(LOGIN_URL).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setReadTimeout(3000);
            httpURLConnection.setConnectTimeout(1000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.flush();
            if (httpURLConnection.getResponseCode() != 200) {
                return null;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    inputStream.close();
                    byteArrayOutputStream.close();
                    return new String(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private File m85253h(int i) {
        return new File(config.m150694b().getFilesDir(), AID_FILE_NAME + i);
    }

    /* JADX INFO: renamed from: i */
    public static synchronized WeiboSsoSdk m85254i() throws Exception {
        try {
            if (sInstance == null) {
                sInstance = new WeiboSsoSdk();
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    /* JADX INFO: renamed from: j */
    public static synchronized boolean m85255j(lnp0 lnp0Var) {
        if (lnp0Var == null) {
            return false;
        }
        if (!lnp0Var.m150705q()) {
            return false;
        }
        if (config != null) {
            return false;
        }
        lnp0 lnp0Var2 = (lnp0) lnp0Var.clone();
        config = lnp0Var2;
        u100.m191391w(lnp0Var2.m150694b());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public String m85256k() throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(m85253h(1));
            try {
                byte[] bArr = new byte[fileInputStream2.available()];
                fileInputStream2.read(bArr);
                String str = new String(bArr);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (Exception unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return "";
                }
                try {
                    fileInputStream.close();
                    return "";
                } catch (IOException unused3) {
                    return "";
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m85257l(String str, int i) throws Exception {
        String strEncode;
        if (TextUtils.isEmpty(config.m150693a(false))) {
            return;
        }
        if (!this.mTaskLock.tryLock()) {
            this.mTaskLock.lock();
            this.mTaskLock.unlock();
            return;
        }
        this.isFirstUpload = false;
        String strM191382n = u100.m191382n(config.m150694b());
        try {
            strEncode = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            strEncode = "";
        }
        String strM85252g = m85252g(riseWind(config.m150693a(true), config.m150694b().getPackageName(), strEncode, strM191382n, config.m150696d(true), config.m150697e(true), config.m150700k(true), config.m150699j(true), config.m150698f(true), config.m150695c(true), i, this.mCallCount));
        this.mCallCount++;
        if (strM85252g == null) {
            this.mTaskLock.unlock();
            whq0.m203241a("network error.");
            return;
        }
        try {
            C14694d c14694dM85259c = C14694d.m85259c(strM85252g);
            if (c14694dM85259c != null && !TextUtils.isEmpty(c14694dM85259c.m85260a())) {
                m85251f(c14694dM85259c.m85260a());
            }
            if (i == 1) {
                this.mVisitorLoginInfo = c14694dM85259c;
            }
            this.mTaskLock.unlock();
        } catch (Exception e) {
            this.mTaskLock.unlock();
            throw e;
        }
    }

    private native String riseWind(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2);

    /* JADX INFO: renamed from: m */
    public void m85258m(InterfaceC14695a interfaceC14695a) {
        C14694d c14694d = this.mVisitorLoginInfo;
        if (c14694d == null || TextUtils.isEmpty(c14694d.m85260a()) || TextUtils.isEmpty(this.mVisitorLoginInfo.m85261b())) {
            Executors.newSingleThreadExecutor().execute(new RunnableC14693c(interfaceC14695a));
        } else {
            interfaceC14695a.handler(this.mVisitorLoginInfo);
        }
    }
}

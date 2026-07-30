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
import p153l.brq0;
import p153l.pwp0;
import p153l.ra00;

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
    private static pwp0 config;
    private static WeiboSsoSdk sInstance;
    private int mCallCount;
    private C14842d mVisitorLoginInfo;
    private volatile ReentrantLock mTaskLock = new ReentrantLock(true);
    private boolean isFirstUpload = true;

    /* JADX INFO: renamed from: com.weibo.ssosdk.WeiboSsoSdk$a */
    public class RunnableC14839a implements Runnable {
        public RunnableC14839a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Thread.sleep(86400000L);
                    WeiboSsoSdk.m86425i().m86428l((WeiboSsoSdk.this.mVisitorLoginInfo == null || TextUtils.isEmpty(WeiboSsoSdk.this.mVisitorLoginInfo.m86431a())) ? WeiboSsoSdk.this.m86427k() : WeiboSsoSdk.this.mVisitorLoginInfo.m86431a(), 2);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.weibo.ssosdk.WeiboSsoSdk$b */
    public class RunnableC14840b implements Runnable {
        public RunnableC14840b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(Constants.ONE_MIN_IN_MILLIS);
                if (WeiboSsoSdk.this.isFirstUpload) {
                    WeiboSsoSdk.this.m86428l((WeiboSsoSdk.this.mVisitorLoginInfo == null || TextUtils.isEmpty(WeiboSsoSdk.this.mVisitorLoginInfo.m86431a())) ? WeiboSsoSdk.this.m86427k() : WeiboSsoSdk.this.mVisitorLoginInfo.m86431a(), 2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.weibo.ssosdk.WeiboSsoSdk$c */
    public class RunnableC14841c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC14843a f62365a;

        public RunnableC14841c(InterfaceC14843a interfaceC14843a) {
            this.f62365a = interfaceC14843a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WeiboSsoSdk.this.m86428l("", 1);
            } catch (Exception unused) {
            }
            if (WeiboSsoSdk.this.mVisitorLoginInfo == null) {
                WeiboSsoSdk.this.mVisitorLoginInfo = new C14842d();
            }
            this.f62365a.handler(WeiboSsoSdk.this.mVisitorLoginInfo);
        }
    }

    /* JADX INFO: renamed from: com.weibo.ssosdk.WeiboSsoSdk$d */
    public static final class C14842d {

        /* JADX INFO: renamed from: a */
        private String f62367a = "";

        /* JADX INFO: renamed from: b */
        private String f62368b = "";

        /* JADX INFO: renamed from: c */
        public static C14842d m86430c(String str) throws Exception {
            C14842d c14842d = new C14842d();
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("retcode", "");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (strOptString.equals("20000000") && jSONObject2 != null) {
                c14842d.f62367a = jSONObject2.optString("aid", "");
                c14842d.f62368b = jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_SUB, "");
                return c14842d;
            }
            throw new Exception("error： " + strOptString + " msg:" + jSONObject.optString("msg", ""));
        }

        /* JADX INFO: renamed from: a */
        public String m86431a() {
            return this.f62367a;
        }

        /* JADX INFO: renamed from: b */
        public String m86432b() {
            return this.f62368b;
        }
    }

    static {
        System.loadLibrary("wind");
    }

    private WeiboSsoSdk() throws Exception {
        pwp0 pwp0Var = config;
        if (pwp0Var == null || !pwp0Var.m174073q()) {
            brq0.m106161a("config error");
            throw null;
        }
        this.mCallCount = 0;
        new Thread(new RunnableC14839a()).start();
        new Thread(new RunnableC14840b()).start();
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m86422f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(m86424h(1));
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
    private String m86423g(String str) {
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
    private File m86424h(int i) {
        return new File(config.m174062b().getFilesDir(), AID_FILE_NAME + i);
    }

    /* JADX INFO: renamed from: i */
    public static synchronized WeiboSsoSdk m86425i() throws Exception {
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
    public static synchronized boolean m86426j(pwp0 pwp0Var) {
        if (pwp0Var == null) {
            return false;
        }
        if (!pwp0Var.m174073q()) {
            return false;
        }
        if (config != null) {
            return false;
        }
        pwp0 pwp0Var2 = (pwp0) pwp0Var.clone();
        config = pwp0Var2;
        ra00.m180686w(pwp0Var2.m174062b());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public String m86427k() throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(m86424h(1));
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
    public void m86428l(String str, int i) throws Exception {
        String strEncode;
        if (TextUtils.isEmpty(config.m174061a(false))) {
            return;
        }
        if (!this.mTaskLock.tryLock()) {
            this.mTaskLock.lock();
            this.mTaskLock.unlock();
            return;
        }
        this.isFirstUpload = false;
        String strM180677n = ra00.m180677n(config.m174062b());
        try {
            strEncode = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            strEncode = "";
        }
        String strM86423g = m86423g(riseWind(config.m174061a(true), config.m174062b().getPackageName(), strEncode, strM180677n, config.m174064d(true), config.m174065e(true), config.m174068k(true), config.m174067j(true), config.m174066f(true), config.m174063c(true), i, this.mCallCount));
        this.mCallCount++;
        if (strM86423g == null) {
            this.mTaskLock.unlock();
            brq0.m106161a("network error.");
            return;
        }
        try {
            C14842d c14842dM86430c = C14842d.m86430c(strM86423g);
            if (c14842dM86430c != null && !TextUtils.isEmpty(c14842dM86430c.m86431a())) {
                m86422f(c14842dM86430c.m86431a());
            }
            if (i == 1) {
                this.mVisitorLoginInfo = c14842dM86430c;
            }
            this.mTaskLock.unlock();
        } catch (Exception e) {
            this.mTaskLock.unlock();
            throw e;
        }
    }

    private native String riseWind(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2);

    /* JADX INFO: renamed from: m */
    public void m86429m(InterfaceC14843a interfaceC14843a) {
        C14842d c14842d = this.mVisitorLoginInfo;
        if (c14842d == null || TextUtils.isEmpty(c14842d.m86431a()) || TextUtils.isEmpty(this.mVisitorLoginInfo.m86432b())) {
            Executors.newSingleThreadExecutor().execute(new RunnableC14841c(interfaceC14843a));
        } else {
            interfaceC14843a.handler(this.mVisitorLoginInfo);
        }
    }
}

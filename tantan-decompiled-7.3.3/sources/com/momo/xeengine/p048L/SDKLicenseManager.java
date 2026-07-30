package com.momo.xeengine.p048L;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.momo.xeengine.XEnginePreferences;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class SDKLicenseManager {
    private static final String ENABLE_KEY = "sdk.expire";
    private static boolean MODULE_ENABLE = false;
    private static final String PREF_NAME = "com.immomo.xengine";
    private static final long RENEW_THRESHOLD_MILLIS = 86400000;
    private static final String SAVE_TIME_KEY = "sdk.save";
    private static final String SECRET_TOKEN = "K3sRVijq0qar6xWICc9PPA==";
    private static final String SERVER_URL = "https://melon-gateway-os.immomo.com/cosmos_middleware/gift/getResource";
    private String appID;
    private volatile boolean enable;
    private final Executor executor;
    private String packageName;
    private final Runnable requestTask;
    private volatile long saveTime;

    public static class InstanceHolder {
        private static final SDKLicenseManager INSTANCE = new SDKLicenseManager();

        private InstanceHolder() {
        }
    }

    public class LicenseRequestTask implements Runnable {
        private LicenseRequestTask() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpURLConnection httpURLConnection = null;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("secParam", AESUtil.encrypt(SDKLicenseManager.this.appID + '_' + SDKLicenseManager.this.packageName, SDKLicenseManager.SECRET_TOKEN));
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, SDKLicenseManager.this.appID);
                byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(SDKLicenseManager.SERVER_URL).openConnection();
                try {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setConnectTimeout(5000);
                    httpURLConnection2.setReadTimeout(5000);
                    boolean z = true;
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                    httpURLConnection2.getOutputStream().write(bytes);
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (200 <= responseCode && responseCode < 300) {
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        }
                        bufferedReader.close();
                        inputStream.close();
                        ConfigResponse configResponseFromJson = ConfigResponse.fromJson(new JSONObject(sb.toString()));
                        if (configResponseFromJson.getEc() == 0 && configResponseFromJson.getData() != null) {
                            long expireTime = configResponseFromJson.getData().getExpireTime();
                            SDKLicenseManager sDKLicenseManager = SDKLicenseManager.this;
                            if (System.currentTimeMillis() >= expireTime) {
                                z = false;
                            }
                            sDKLicenseManager.saveEnable(z);
                        }
                    }
                    httpURLConnection2.disconnect();
                } catch (Exception unused) {
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private SDKLicenseManager() {
        this.enable = true;
        this.saveTime = 0L;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.executor = executorServiceNewSingleThreadExecutor;
        this.requestTask = new LicenseRequestTask();
        if (MODULE_ENABLE) {
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.momo.xeengine.L.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15285a.loadLicenseFromStorage();
                }
            });
        }
    }

    public static SDKLicenseManager getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private SharedPreferences getPrefs() {
        return XEnginePreferences.getContext().getSharedPreferences(PREF_NAME, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadLicenseFromStorage() {
        SharedPreferences prefs = getPrefs();
        this.enable = prefs.getBoolean(ENABLE_KEY, true);
        this.saveTime = prefs.getLong(SAVE_TIME_KEY, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEnable(boolean z) {
        this.enable = z;
        SharedPreferences.Editor editorEdit = getPrefs().edit();
        editorEdit.putBoolean(ENABLE_KEY, z);
        editorEdit.putLong(SAVE_TIME_KEY, System.currentTimeMillis());
        editorEdit.apply();
    }

    public synchronized boolean isLicenseValid() {
        return this.enable;
    }

    public void setAppID(String str) {
        if (MODULE_ENABLE && TextUtils.isEmpty(this.appID)) {
            this.appID = str;
            Context context = XEnginePreferences.getContext();
            if (context != null) {
                this.packageName = context.getPackageName();
            }
            this.executor.execute(new Runnable() { // from class: com.momo.xeengine.L.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15286a.updateLicense();
                }
            });
        }
    }

    public void updateLicense() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.saveTime + 86400000 <= jCurrentTimeMillis || jCurrentTimeMillis < this.saveTime) {
            this.executor.execute(this.requestTask);
        }
    }
}

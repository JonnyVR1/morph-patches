package com.momo.xeengine.gift;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.momo.xeengine.ClientInfoProvider;
import com.momo.xeengine.XEnginePreferences;
import com.momo.xeengine.xnative.XEDevice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Keep
class GiftLogUploader {
    private static final String CONTENT_TYPE = "application/json";
    private static final String URL = "https://cosmos-compass-api.immomo.com/gift/uploadGiftLog";
    private static final String URL_HW = "https://cosmos-compass-api-hw.immomo.com/gift/uploadGiftLog";
    private final List<GiftLogEvent> eventQueue;
    private final ExecutorService executorService;
    private boolean forceUpload;
    private boolean hasTimer;
    private final Object lock;
    private final Handler mainHandler;
    private int uploadCount;
    private float uploadInterval;

    public static class Holder {
        private static final GiftLogUploader instance = new GiftLogUploader();

        private Holder() {
        }
    }

    private GiftLogUploader() {
        this.eventQueue = new ArrayList();
        this.executorService = Executors.newSingleThreadExecutor();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.hasTimer = false;
        this.uploadCount = 10;
        this.uploadInterval = 2.0f;
        this.forceUpload = true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20243a(GiftLogUploader giftLogUploader, List list) {
        giftLogUploader.getClass();
        try {
            giftLogUploader.uploadEvents(list);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20244b(GiftLogUploader giftLogUploader) {
        giftLogUploader.hasTimer = false;
        giftLogUploader.uploadAllEvents();
    }

    private JSONObject buildRequestBody(List<GiftLogEvent> list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String appId = XEnginePreferences.getAppId();
        String appKey = XEnginePreferences.getAppKey();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String mD5FromString = GiftUtils.getMD5FromString(appId + appKey + jCurrentTimeMillis);
        String deviceID = getDeviceID();
        jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, appId);
        jSONObject.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, XEDevice.getPackageName());
        jSONObject.put("platform", "android");
        jSONObject.put("osVersion", Build.VERSION.RELEASE);
        jSONObject.put("sdkVersion", XEnginePreferences.VERSION);
        jSONObject.put(Constants.DEVICE_ID_TAG, deviceID);
        jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, XEDevice.getAppVersionName(XEnginePreferences.getContext()));
        jSONObject.put("sign", mD5FromString);
        jSONObject.put("uploadTime", jCurrentTimeMillis);
        jSONObject.put("deviceModel", XEDevice.getDeviceModel());
        JSONArray jSONArray = new JSONArray();
        Iterator<GiftLogEvent> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSONObject());
        }
        jSONObject.put("eventList", jSONArray);
        return jSONObject;
    }

    private static String getDeviceID() {
        try {
            ClientInfoProvider clientInfoProvider = XEnginePreferences.getClientInfoProvider();
            String userID = clientInfoProvider != null ? clientInfoProvider.getUserID() : null;
            return TextUtils.isEmpty(userID) ? XEDevice.getDeviceId() : userID;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static GiftLogUploader getInstance() {
        return Holder.instance;
    }

    private void uploadEvents(List<GiftLogEvent> list) {
        if (list.isEmpty()) {
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(XEnginePreferences.isInternational() ? URL_HW : URL).openConnection();
            try {
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("Content-Type", CONTENT_TYPE);
                boolean z = true;
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setConnectTimeout(10000);
                httpURLConnection2.setReadTimeout(30000);
                String string = buildRequestBody(list).toString();
                Charset charset = StandardCharsets.UTF_8;
                byte[] bytes = string.getBytes(charset);
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                try {
                    outputStream.write(bytes);
                    outputStream.close();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        z = false;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(z ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream(), charset));
                    do {
                        try {
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } while (bufferedReader.readLine() != null);
                    bufferedReader.close();
                    httpURLConnection2.disconnect();
                } catch (Throwable th3) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Throwable unused) {
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public void addEvent(GiftLogEvent giftLogEvent) {
        boolean z;
        try {
            if (!TextUtils.isEmpty(XEnginePreferences.getAppId()) && !TextUtils.isEmpty(XEnginePreferences.getAppKey())) {
                if ("3".equals(giftLogEvent.getEventId())) {
                    synchronized (this.lock) {
                        this.eventQueue.add(giftLogEvent);
                    }
                    return;
                }
                if (this.forceUpload || "2".equals(giftLogEvent.getEventId())) {
                    synchronized (this.lock) {
                        this.eventQueue.add(giftLogEvent);
                    }
                    uploadAllEvents();
                    return;
                }
                synchronized (this.lock) {
                    try {
                        z = true;
                        if (this.eventQueue.isEmpty() && !this.hasTimer) {
                            this.hasTimer = true;
                            this.mainHandler.postDelayed(new Runnable() { // from class: com.momo.xeengine.gift.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    GiftLogUploader.m20244b(this.f14589a);
                                }
                            }, (long) (this.uploadInterval * 60.0f * 1000.0f));
                        }
                        this.eventQueue.add(giftLogEvent);
                        if (this.eventQueue.size() < this.uploadCount) {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    uploadAllEvents();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setForceUpload(boolean z) {
        this.forceUpload = z;
    }

    public void setUploadCountAndInterval(int i, float f) {
        this.uploadCount = i;
        this.uploadInterval = f;
    }

    public void uploadAllEvents() {
        synchronized (this.lock) {
            try {
                if (this.eventQueue.isEmpty()) {
                    return;
                }
                final ArrayList arrayList = new ArrayList(this.eventQueue);
                this.eventQueue.clear();
                this.executorService.execute(new Runnable() { // from class: com.momo.xeengine.gift.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        GiftLogUploader.m20243a(this.f14590a, arrayList);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

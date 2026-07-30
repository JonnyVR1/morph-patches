package com.tencent.youtu.liveness;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.tencent.connect.common.Constants;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class YTFetchLicenseHelper {

    /* JADX INFO: renamed from: com.tencent.youtu.liveness.YTFetchLicenseHelper$1FetchThreadRunnable, reason: invalid class name */
    public class C1FetchThreadRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        public FetchLicenseResult f60503a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f60504b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f60505c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f60506d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f60507e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f60508f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f60509g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f60510h;

        public C1FetchThreadRunnable(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f60504b = str;
            this.f60505c = str2;
            this.f60506d = str3;
            this.f60507e = str4;
            this.f60508f = str5;
            this.f60509g = str6;
            this.f60510h = str7;
            this.f60503a = new FetchLicenseResult(YTFetchLicenseHelper.this);
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpsURLConnection httpsURLConnection;
            BufferedReader bufferedReader = null;
            try {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    String str = this.f60504b + "-" + jCurrentTimeMillis;
                    Mac mac = Mac.getInstance("HmacSHA256");
                    mac.init(new SecretKeySpec(this.f60505c.getBytes(), "HmacSHA256"));
                    String strEncodeToString = Base64.encodeToString(mac.doFinal(str.getBytes()), 2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Constants.JumpUrlConstants.URL_KEY_APPID, this.f60504b);
                    jSONObject.put("auth_string", strEncodeToString);
                    jSONObject.put("machine_type", this.f60506d);
                    jSONObject.put("machine_id", this.f60507e);
                    jSONObject.put("machine_info", this.f60508f);
                    jSONObject.put("package_name", this.f60509g);
                    jSONObject.put("time_stamp", jCurrentTimeMillis);
                    String string = jSONObject.toString();
                    httpsURLConnection = (HttpsURLConnection) new URL(this.f60510h).openConnection();
                    try {
                        httpsURLConnection.setRequestMethod("POST");
                        httpsURLConnection.setDoInput(true);
                        httpsURLConnection.setDoOutput(true);
                        httpsURLConnection.setUseCaches(false);
                        httpsURLConnection.setInstanceFollowRedirects(false);
                        httpsURLConnection.setRequestProperty("Content-type", "application/json");
                        httpsURLConnection.setConnectTimeout(5000);
                        httpsURLConnection.setReadTimeout(5000);
                        httpsURLConnection.connect();
                        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
                        dataOutputStream.write(string.getBytes());
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        this.f60503a.http_status = httpsURLConnection.getResponseCode();
                        if (this.f60503a.http_status == 200) {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                            try {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        sb.append(line);
                                    }
                                }
                                JSONObject jSONObject2 = new JSONObject(sb.toString());
                                if (jSONObject2.has(StateEvent.Name.ERROR_CODE)) {
                                    this.f60503a.error_code = jSONObject2.optInt(StateEvent.Name.ERROR_CODE);
                                    this.f60503a.error_msg = jSONObject2.optString("error_msg");
                                    FetchLicenseResult fetchLicenseResult = this.f60503a;
                                    if (fetchLicenseResult.error_code == 0) {
                                        fetchLicenseResult.license = jSONObject2.optString("license");
                                        this.f60503a.bind_type = jSONObject2.optString("bind_type");
                                        this.f60503a.auth_type = jSONObject2.optString("auth_type");
                                    }
                                }
                                bufferedReader = bufferedReader2;
                            } catch (MalformedURLException e) {
                                e = e;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    return;
                                }
                            } catch (ProtocolException e3) {
                                e = e3;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    return;
                                }
                            } catch (SocketTimeoutException e5) {
                                e = e5;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    return;
                                }
                            } catch (IOException e7) {
                                e = e7;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e8) {
                                        e8.printStackTrace();
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    return;
                                }
                            } catch (InvalidKeyException e9) {
                                e = e9;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    return;
                                }
                            } catch (NoSuchAlgorithmException e11) {
                                e = e11;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e12) {
                                        e12.printStackTrace();
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    return;
                                }
                            } catch (JSONException e13) {
                                e = e13;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    return;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e15) {
                                        e15.printStackTrace();
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    throw th;
                                }
                                httpsURLConnection.disconnect();
                                throw th;
                            }
                        } else {
                            Log.e("YTCommon_FetchLicense", "connection status: " + this.f60503a.http_status);
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e16) {
                                e16.printStackTrace();
                            }
                        }
                    } catch (MalformedURLException e17) {
                        e = e17;
                    } catch (ProtocolException e18) {
                        e = e18;
                    } catch (SocketTimeoutException e19) {
                        e = e19;
                    } catch (IOException e20) {
                        e = e20;
                    } catch (InvalidKeyException e21) {
                        e = e21;
                    } catch (NoSuchAlgorithmException e22) {
                        e = e22;
                    } catch (JSONException e23) {
                        e = e23;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (MalformedURLException e24) {
                e = e24;
                httpsURLConnection = null;
            } catch (ProtocolException e25) {
                e = e25;
                httpsURLConnection = null;
            } catch (SocketTimeoutException e26) {
                e = e26;
                httpsURLConnection = null;
            } catch (IOException e27) {
                e = e27;
                httpsURLConnection = null;
            } catch (InvalidKeyException e28) {
                e = e28;
                httpsURLConnection = null;
            } catch (NoSuchAlgorithmException e29) {
                e = e29;
                httpsURLConnection = null;
            } catch (JSONException e30) {
                e = e30;
                httpsURLConnection = null;
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = null;
            }
            httpsURLConnection.disconnect();
        }
    }

    public class FetchLicenseResult {
        public int error_code = 1002;
        public int http_status = -1;
        public String error_msg = "";
        public String license = "";
        public String bind_type = "";
        public String auth_type = "";

        public FetchLicenseResult(YTFetchLicenseHelper yTFetchLicenseHelper) {
        }
    }

    public FetchLicenseResult fetchLicenseOnline(Context context, String str, String str2, String str3, YTDeviceInfo yTDeviceInfo) {
        C1FetchThreadRunnable c1FetchThreadRunnable = new C1FetchThreadRunnable(str2, str3, yTDeviceInfo == null ? "ANDROID" : yTDeviceInfo.platform, yTDeviceInfo == null ? "" : yTDeviceInfo.device_id, yTDeviceInfo != null ? yTDeviceInfo.device_info_encrypted : "", context.getPackageName(), str);
        Thread thread = new Thread(c1FetchThreadRunnable);
        try {
            thread.start();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return c1FetchThreadRunnable.f60503a;
    }
}

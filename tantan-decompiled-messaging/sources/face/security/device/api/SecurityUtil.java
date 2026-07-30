package face.security.device.api;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.UUID;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class SecurityUtil {
    private static final int MAX_TIME_OUT = 20;
    public static final int NET_EXCEPTION_CODE = -1;
    public static Field artMethodField;

    /* JADX INFO: renamed from: cs */
    public static String m86919cs(Map<String, String> map, String str) throws Exception {
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : strArr) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(encode(str2, str));
            sb.append("=");
            sb.append(encode(map.get(str2), str));
        }
        return FaceSecDevice.gsRaw("POST&" + encode("/", str) + "&" + encode(sb.toString(), str));
    }

    /* JADX INFO: renamed from: dw */
    private static int m86920dw(String str, String str2) {
        return -1;
    }

    private static String encode(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return URLEncoder.encode(str, str2).replace(Marker.ANY_NON_NULL_MARKER, "%20").replace("*", "%2A").replace("%7E", "~");
    }

    /* JADX INFO: renamed from: fd */
    private static String m86921fd(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
        return simpleDateFormat.format(date);
    }

    public static long getArtMethod(Member member) {
        Field field = artMethodField;
        if (field == null) {
            return 0L;
        }
        try {
            return ((Long) field.get(member)).longValue();
        } catch (IllegalAccessException unused) {
            return 0L;
        }
    }

    public static Field getField(Class cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static String gsi(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String string = UUID.randomUUID().toString();
        if (string.isEmpty()) {
            return "";
        }
        String str2 = String.format("%s-%s-%d-%s", str, "h", Long.valueOf(System.currentTimeMillis()), string.replace("-", ""));
        String strSubstring = str2.substring(0, str2.length() - 4);
        int iAbs = Math.abs(strSubstring.concat("7849478494").hashCode());
        String strValueOf = String.valueOf(iAbs);
        if (strValueOf.length() > 4) {
            strValueOf = strValueOf.substring(strValueOf.length() - 4);
        } else if (strValueOf.length() < 4) {
            strValueOf = String.format("%4d", Integer.valueOf(iAbs));
        }
        return strSubstring.concat(strValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.net.HttpURLConnection] */
    public static String httpPost(String str, Map<String, String> map, Map<String, String> map2) throws Throwable {
        ?? r6;
        HttpURLConnection httpURLConnection;
        String str2;
        BufferedReader bufferedReader = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setRequestMethod("POST");
                    boolean z = true;
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setConnectTimeout(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                    httpURLConnection.setReadTimeout(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append("&");
                        }
                        sb.append(encode(entry2.getKey(), "UTF-8"));
                        sb.append("=");
                        sb.append(encode(entry2.getValue(), "UTF-8"));
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(sb.toString().getBytes());
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String str3 = responseCode + "#" + Base64.encodeToString("net error".getBytes(), 2);
                        httpURLConnection.disconnect();
                        return str3;
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        }
                        str2 = responseCode + "#" + Base64.encodeToString(sb2.toString().getBytes(), 2);
                        inputStream.close();
                        try {
                            bufferedReader2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        httpURLConnection = httpURLConnection;
                        e.printStackTrace();
                        str2 = "-1#" + Base64.encodeToString(e.getMessage().getBytes(), 2);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (httpURLConnection != null) {
                        }
                        return str2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        r6 = httpURLConnection;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (r6 == 0) {
                            throw th;
                        }
                        r6.disconnect();
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    return str2;
                } catch (Exception e5) {
                    e = e5;
                    httpURLConnection = httpURLConnection;
                }
            } catch (Throwable th2) {
                th = th2;
                r6 = str;
            }
        } catch (Exception e6) {
            e = e6;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            r6 = 0;
        }
    }

    public static String spr(String str, Map<String, String> map, Map<String, String> map2) {
        HashMap map3 = new HashMap();
        map3.put("TimestampKeep", m86921fd(new Date()));
        map3.put("SignatureNonce", UUID.randomUUID().toString());
        if (map2 != null) {
            map2.remove(RequestParameters.SIGNATURE);
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    map3.put(key, value);
                }
            }
            String str2 = map2.get(Constants.CLTAP_APP_VERSION);
            if (str2 != null && !str2.isEmpty() && str2.equals("2020-04-25")) {
                map3.put("Timestamp", m86921fd(new Date()));
            }
        }
        try {
            map3.put(RequestParameters.SIGNATURE, m86919cs(map3, "UTF-8"));
        } catch (Throwable unused) {
            map3.put(RequestParameters.SIGNATURE, "null");
        }
        return httpPost(str, map, map3);
    }

    public static void utilInit() {
        try {
            artMethodField = getField(Method.class, "artMethod");
        } catch (Exception unused) {
        }
    }
}

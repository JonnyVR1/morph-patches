package p149l;

import android.util.Log;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.eclipse.jetty.http.HttpMethods;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class zz40 {

    /* JADX INFO: renamed from: l.zz40$a */
    public static class C21825a {

        /* JADX INFO: renamed from: a */
        public boolean f205778a = false;

        /* JADX INFO: renamed from: b */
        public String f205779b = "";
    }

    /* JADX INFO: renamed from: a */
    public static String m220988a(URI uri, String str) {
        String host = uri.getHost();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(".");
        stringBuffer.append(host);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m220989b(String str, String str2, String str3, String str4) {
        return "PUT\n\n\n" + str3 + "\n/" + str + "/" + str2 + "?security-token=" + str4;
    }

    /* JADX INFO: renamed from: c */
    public static String m220990c(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKeySpec);
        return d300.m109837a(mac.doFinal(str2.getBytes("UTF-8")));
    }

    /* JADX INFO: renamed from: d */
    public static URI m220991d(URI uri, String str) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s://", uri.getScheme()));
        sb.append(m220988a(uri, str));
        sb.append(uri.getPort() != -1 ? String.format(":%s", Integer.valueOf(uri.getPort())) : "");
        sb.append(uri.getPath());
        return new URI(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static String m220992e(String str, String str2, String str3, String str4, String str5, String str6, Date date) throws NoSuchAlgorithmException, URISyntaxException, InvalidKeyException, UnsupportedEncodingException {
        String strValueOf = String.valueOf(date.getTime() / 1000);
        String strM220990c = m220990c(str2, m220989b(str5, str6, strValueOf, str3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Expires", strValueOf);
        linkedHashMap.put(RequestParameters.OSS_ACCESS_KEY_ID, str);
        linkedHashMap.put(RequestParameters.SIGNATURE, strM220990c);
        linkedHashMap.put(RequestParameters.SECURITY_TOKEN, str3);
        String strM220994g = m220994g(linkedHashMap, "utf-8");
        String string = m220991d(new URI(str4), str5).toString();
        if (!string.endsWith("/")) {
            string = string.concat("/");
        }
        return string + str6 + "?" + strM220994g;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX INFO: renamed from: f */
    public static C21825a m220993f(String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        int i;
        String strM220992e;
        String string;
        int responseCode;
        String strTrim = str.trim();
        if (!strTrim.toLowerCase().startsWith("http")) {
            strTrim = "https://".concat(strTrim);
        }
        String str7 = strTrim;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C21825a c21825a = new C21825a();
        if (bArr == null) {
            c21825a.f205778a = false;
            c21825a.f205779b = "OSSFile Empty";
            return c21825a;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, 15);
        Date time = calendar.getTime();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        try {
            strM220992e = m220992e(str2, str3, str4, str7, str5, str6, time);
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strM220992e).openConnection();
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setRequestMethod(HttpMethods.PUT);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", "");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
                responseCode = httpURLConnection.getResponseCode();
                i = 200;
                try {
                    InputStream inputStream = responseCode == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append(Log.getStackTraceString(e));
                        String string2 = sb.toString();
                        if (responseCode != i) {
                            z = false;
                        }
                        c21825a.f205778a = z;
                        c21825a.f205779b = string2;
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM220992e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string2, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        return c21825a;
                    }
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    string = headerFields != null ? headerFields.toString() : "";
                    try {
                        try {
                            bufferedReader.close();
                            inputStream.close();
                            httpURLConnection.disconnect();
                            String string3 = sb.toString();
                            if (responseCode != 200) {
                                z = false;
                            }
                            c21825a.f205778a = z;
                            c21825a.f205779b = string3;
                            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == 200 ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM220992e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string3, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            return c21825a;
                        } catch (Exception e) {
                            e = e;
                            sb.append(Log.getStackTraceString(e));
                            String string4 = sb.toString();
                            if (responseCode != i) {
                                z = false;
                            }
                            c21825a.f205778a = z;
                            c21825a.f205779b = string4;
                            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM220992e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string4, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            return c21825a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        String string5 = sb.toString();
                        if (responseCode != i) {
                            z = false;
                        }
                        c21825a.f205778a = z;
                        c21825a.f205779b = string5;
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM220992e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string5, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    string = "";
                } catch (Throwable th2) {
                    th = th2;
                    string = "";
                    String string6 = sb.toString();
                    if (responseCode != i) {
                        z = false;
                    }
                    c21825a.f205778a = z;
                    c21825a.f205779b = string6;
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM220992e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string6, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                i = 200;
                string = "";
                responseCode = -1;
            } catch (Throwable th3) {
                th = th3;
                i = 200;
                string = "";
                responseCode = -1;
                String string7 = sb.toString();
                if (responseCode != i) {
                    z = false;
                }
                c21825a.f205778a = z;
                c21825a.f205779b = string7;
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM220992e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string7, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            i = 200;
            strM220992e = "";
            string = strM220992e;
        } catch (Throwable th4) {
            th = th4;
            i = 200;
            strM220992e = "";
            string = strM220992e;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m220994g(Map<String, String> map, String str) throws UnsupportedEncodingException {
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!z) {
                sb.append("&");
            }
            sb.append(m220995h(key, str));
            if (value != null) {
                sb.append("=");
                sb.append(m220995h(value, str));
            }
            z = false;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m220995h(String str, String str2) throws UnsupportedEncodingException {
        return str == null ? "" : URLEncoder.encode(str, str2).replace(Marker.ANY_NON_NULL_MARKER, "%20").replace("*", "%2A").replace("~", "%7E").replace("/", "%2F");
    }
}

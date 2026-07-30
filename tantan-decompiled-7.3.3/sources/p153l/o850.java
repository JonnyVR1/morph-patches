package p153l;

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
public class o850 {

    /* JADX INFO: renamed from: l.o850$a */
    public static class C19050a {

        /* JADX INFO: renamed from: a */
        public boolean f145357a = false;

        /* JADX INFO: renamed from: b */
        public String f145358b = "";
    }

    /* JADX INFO: renamed from: a */
    public static String m166449a(URI uri, String str) {
        String host = uri.getHost();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(".");
        stringBuffer.append(host);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m166450b(String str, String str2, String str3, String str4) {
        return "PUT\n\n\n" + str3 + "\n/" + str + "/" + str2 + "?security-token=" + str4;
    }

    /* JADX INFO: renamed from: c */
    public static String m166451c(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKeySpec);
        return ac00.m96782a(mac.doFinal(str2.getBytes("UTF-8")));
    }

    /* JADX INFO: renamed from: d */
    public static URI m166452d(URI uri, String str) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s://", uri.getScheme()));
        sb.append(m166449a(uri, str));
        sb.append(uri.getPort() != -1 ? String.format(":%s", Integer.valueOf(uri.getPort())) : "");
        sb.append(uri.getPath());
        return new URI(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static String m166453e(String str, String str2, String str3, String str4, String str5, String str6, Date date) throws NoSuchAlgorithmException, URISyntaxException, InvalidKeyException, UnsupportedEncodingException {
        String strValueOf = String.valueOf(date.getTime() / 1000);
        String strM166451c = m166451c(str2, m166450b(str5, str6, strValueOf, str3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Expires", strValueOf);
        linkedHashMap.put(RequestParameters.OSS_ACCESS_KEY_ID, str);
        linkedHashMap.put(RequestParameters.SIGNATURE, strM166451c);
        linkedHashMap.put(RequestParameters.SECURITY_TOKEN, str3);
        String strM166455g = m166455g(linkedHashMap, "utf-8");
        String string = m166452d(new URI(str4), str5).toString();
        if (!string.endsWith("/")) {
            string = string.concat("/");
        }
        return string + str6 + "?" + strM166455g;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX INFO: renamed from: f */
    public static C19050a m166454f(String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        int i;
        String strM166453e;
        String string;
        int responseCode;
        String strTrim = str.trim();
        if (!strTrim.toLowerCase().startsWith("http")) {
            strTrim = "https://".concat(strTrim);
        }
        String str7 = strTrim;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C19050a c19050a = new C19050a();
        if (bArr == null) {
            c19050a.f145357a = false;
            c19050a.f145358b = "OSSFile Empty";
            return c19050a;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, 15);
        Date time = calendar.getTime();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        try {
            strM166453e = m166453e(str2, str3, str4, str7, str5, str6, time);
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strM166453e).openConnection();
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
                        c19050a.f145357a = z;
                        c19050a.f145358b = string2;
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM166453e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string2, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        return c19050a;
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
                            c19050a.f145357a = z;
                            c19050a.f145358b = string3;
                            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == 200 ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM166453e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string3, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            return c19050a;
                        } catch (Exception e) {
                            e = e;
                            sb.append(Log.getStackTraceString(e));
                            String string4 = sb.toString();
                            if (responseCode != i) {
                                z = false;
                            }
                            c19050a.f145357a = z;
                            c19050a.f145358b = string4;
                            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM166453e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string4, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            return c19050a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        String string5 = sb.toString();
                        if (responseCode != i) {
                            z = false;
                        }
                        c19050a.f145357a = z;
                        c19050a.f145358b = string5;
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM166453e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string5, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
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
                    c19050a.f145357a = z;
                    c19050a.f145358b = string6;
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM166453e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string6, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
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
                c19050a.f145357a = z;
                c19050a.f145358b = string7;
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, responseCode == i ? "ossHttpUploadSuccess" : "ossHttpUploadFileError", "presignedUrl", strM166453e, "endPoint", str7, "bucketName", str5, "fileName", str6, "code", String.valueOf(responseCode), "message", string7, "headerFields", string, "uploadCost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            i = 200;
            strM166453e = "";
            string = strM166453e;
        } catch (Throwable th4) {
            th = th4;
            i = 200;
            strM166453e = "";
            string = strM166453e;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m166455g(Map<String, String> map, String str) throws UnsupportedEncodingException {
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
            sb.append(m166456h(key, str));
            if (value != null) {
                sb.append("=");
                sb.append(m166456h(value, str));
            }
            z = false;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m166456h(String str, String str2) throws UnsupportedEncodingException {
        return str == null ? "" : URLEncoder.encode(str, str2).replace(Marker.ANY_NON_NULL_MARKER, "%20").replace("*", "%2A").replace("~", "%7E").replace("/", "%2F");
    }
}

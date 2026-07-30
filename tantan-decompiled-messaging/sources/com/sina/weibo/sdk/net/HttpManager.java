package com.sina.weibo.sdk.net;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.exception.WeiboHttpException;
import com.sina.weibo.sdk.network.IRequestParam;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.Utility;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.util.Set;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes11.dex */
public class HttpManager {
    private static final String BOUNDARY;
    private static final String END_MP_BOUNDARY;
    private static final String MP_BOUNDARY;
    private static final String TAG = "HttpManager";

    static {
        System.loadLibrary("weibosdkcore");
        String boundry = getBoundry();
        BOUNDARY = boundry;
        MP_BOUNDARY = "--" + boundry;
        END_MP_BOUNDARY = "--" + boundry + "--";
    }

    public static void buildParams(OutputStream outputStream, WeiboParameters weiboParameters) throws WeiboException {
        try {
            Set<String> setKeySet = weiboParameters.keySet();
            for (String str : setKeySet) {
                if (weiboParameters.get(str) instanceof String) {
                    StringBuilder sb = new StringBuilder(100);
                    sb.setLength(0);
                    sb.append(MP_BOUNDARY);
                    sb.append("\r\n");
                    sb.append("content-disposition: form-data; name=\"");
                    sb.append(str);
                    sb.append("\"\r\n\r\n");
                    sb.append(weiboParameters.get(str));
                    sb.append("\r\n");
                    outputStream.write(sb.toString().getBytes());
                }
            }
            for (String str2 : setKeySet) {
                Object obj = weiboParameters.get(str2);
                if (obj instanceof Bitmap) {
                    outputStream.write((MP_BOUNDARY + "\r\ncontent-disposition: form-data; name=\"" + str2 + "\"; filename=\"file\"\r\nContent-Type: application/octet-stream; charset=utf-8\r\n\r\n").getBytes());
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    outputStream.write(byteArrayOutputStream.toByteArray());
                    outputStream.write("\r\n".getBytes());
                } else if (obj instanceof ByteArrayOutputStream) {
                    outputStream.write((MP_BOUNDARY + "\r\ncontent-disposition: form-data; name=\"" + str2 + "\"; filename=\"file\"\r\nContent-Type: application/octet-stream; charset=utf-8\r\n\r\n").getBytes());
                    ByteArrayOutputStream byteArrayOutputStream2 = (ByteArrayOutputStream) obj;
                    outputStream.write(byteArrayOutputStream2.toByteArray());
                    outputStream.write("\r\n".getBytes());
                    byteArrayOutputStream2.close();
                }
            }
            outputStream.write(("\r\n" + END_MP_BOUNDARY).getBytes());
        } catch (IOException e) {
            throw new WeiboException(e);
        }
    }

    private static native String calcOauthSignNative(Context context, String str, String str2);

    public static synchronized String downloadFile(Context context, String str, String str2, String str3) throws WeiboException {
        long length;
        long contentLength;
        try {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str3);
            if (file2.exists()) {
                return file2.getPath();
            }
            if (!URLUtil.isValidUrl(str)) {
                return "";
            }
            File file3 = new File(str2, str3 + "_temp");
            HttpURLConnection httpURLConnectionCreateConnect = ConnectionFactory.createConnect(str, context);
            httpURLConnectionCreateConnect.setConnectTimeout(300000);
            httpURLConnectionCreateConnect.setReadTimeout(300000);
            try {
                httpURLConnectionCreateConnect.setRequestMethod("GET");
            } catch (Exception unused) {
            }
            try {
                if (file3.exists()) {
                    length = file3.length();
                } else {
                    file3.createNewFile();
                    length = 0;
                }
                httpURLConnectionCreateConnect.setRequestProperty("RANGE", BytesRange.PREFIX + length);
                int responseCode = httpURLConnectionCreateConnect.getResponseCode();
                if (responseCode == 206) {
                    contentLength = 0;
                } else {
                    if (responseCode != 200) {
                        throw new WeiboHttpException(readConnectResponse(httpURLConnectionCreateConnect, true), responseCode);
                    }
                    contentLength = httpURLConnectionCreateConnect.getContentLength();
                }
                InputStream inputStream = httpURLConnectionCreateConnect.getInputStream();
                RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    randomAccessFile.write(bArr, 0, i);
                }
                randomAccessFile.close();
                inputStream.close();
                if (contentLength != 0 && file3.length() >= contentLength) {
                    file3.renameTo(file2);
                    return file2.getPath();
                }
                file3.delete();
            } catch (Exception unused2) {
            }
            return "";
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void fillCommonRequestParam(IRequestParam iRequestParam) {
    }

    public static String getBoundry() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < 12; i++) {
            long jCurrentTimeMillis = System.currentTimeMillis() + ((long) i);
            long j = jCurrentTimeMillis % 3;
            if (j == 0) {
                stringBuffer.append(((char) jCurrentTimeMillis) % '\t');
            } else if (j == 1) {
                stringBuffer.append((char) ((jCurrentTimeMillis % 26) + 65));
            } else {
                stringBuffer.append((char) ((jCurrentTimeMillis % 26) + 97));
            }
        }
        return stringBuffer.toString();
    }

    public static String getOauthSign(Context context, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        return calcOauthSignNative(context, sb.toString(), str4);
    }

    private static String getTimestamp() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    public static String openRedirectUrl4LocationUri(Context context, String str, String str2, WeiboParameters weiboParameters) {
        HttpURLConnection httpURLConnectionCreateConnect;
        if (str2.equals("GET")) {
            if (str.endsWith("?")) {
                str = str + weiboParameters.encodeUrl();
            } else {
                str = str + "?" + weiboParameters.encodeUrl();
            }
            httpURLConnectionCreateConnect = ConnectionFactory.createConnect(str, context);
        } else {
            httpURLConnectionCreateConnect = ConnectionFactory.createConnect(str, context);
        }
        try {
            httpURLConnectionCreateConnect.setInstanceFollowRedirects(false);
            httpURLConnectionCreateConnect.connect();
            int responseCode = httpURLConnectionCreateConnect.getResponseCode();
            if (responseCode != 302 && responseCode != 301) {
                return responseCode == 200 ? str : "";
            }
            return httpURLConnectionCreateConnect.getHeaderField("Location");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String openUrl(Context context, String str, String str2, WeiboParameters weiboParameters) throws WeiboException {
        String strRequestHttpExecute = requestHttpExecute(context, str, str2, weiboParameters);
        LogUtil.m80478d(TAG, "Response : " + strRequestHttpExecute);
        return strRequestHttpExecute;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[SYNTHETIC] */
    private static String readConnectResponse(HttpURLConnection httpURLConnection, boolean z) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream = null;
        String str = null;
        inputStream = null;
        try {
            byte[] bArr = new byte[8192];
            InputStream errorStream = z ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                if (errorStream != null) {
                    while (true) {
                        try {
                            int i = errorStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        } catch (IOException e) {
                            inputStream = errorStream;
                            e = e;
                            try {
                                throw new WeiboException(e);
                            } catch (Throwable th) {
                                th = th;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    throw th;
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (Exception unused2) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            inputStream = errorStream;
                            th = th2;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                throw th;
                            }
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    }
                    str = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                }
                if (errorStream != null) {
                    try {
                        errorStream.close();
                    } catch (Exception unused3) {
                    }
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused4) {
                }
                return str;
            } catch (IOException e2) {
                inputStream = errorStream;
                e = e2;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                inputStream = errorStream;
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    private static String requestHttpExecute(Context context, String str, String str2, WeiboParameters weiboParameters) {
        HttpURLConnection httpURLConnectionCreateConnect;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                setHttpCommonParam(context, weiboParameters);
                if ("GET".equals(str2)) {
                    httpURLConnectionCreateConnect = ConnectionFactory.createConnect(str + "?" + weiboParameters.encodeUrl(), context);
                    httpURLConnectionCreateConnect.setRequestMethod("GET");
                    httpURLConnectionCreateConnect.setInstanceFollowRedirects(true);
                    httpURLConnectionCreateConnect.connect();
                } else {
                    httpURLConnectionCreateConnect = ConnectionFactory.createConnect(str, context);
                    httpURLConnectionCreateConnect.setInstanceFollowRedirects(true);
                    httpURLConnectionCreateConnect.connect();
                    if (weiboParameters.hasBinaryData()) {
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnectionCreateConnect.getOutputStream());
                        buildParams(dataOutputStream, weiboParameters);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } else {
                        DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnectionCreateConnect.getOutputStream());
                        dataOutputStream2.write(weiboParameters.encodeUrl().getBytes("UTF-8"));
                        dataOutputStream2.flush();
                        dataOutputStream2.close();
                    }
                }
                int responseCode = httpURLConnectionCreateConnect.getResponseCode();
                if (responseCode != 200) {
                    throw new WeiboHttpException(readConnectResponse(httpURLConnectionCreateConnect, true), responseCode);
                }
                String connectResponse = readConnectResponse(httpURLConnectionCreateConnect, false);
                httpURLConnectionCreateConnect.disconnect();
                return connectResponse;
            } catch (IOException e) {
                e.printStackTrace();
                throw new WeiboException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private static void setHttpCommonParam(Context context, WeiboParameters weiboParameters) {
        String aid;
        String str = "";
        if (TextUtils.isEmpty(weiboParameters.getAppKey())) {
            aid = "";
        } else {
            aid = Utility.getAid(context, weiboParameters.getAppKey());
            if (!TextUtils.isEmpty(aid)) {
                weiboParameters.put("aid", aid);
            }
        }
        String timestamp = getTimestamp();
        weiboParameters.put("oauth_timestamp", timestamp);
        Object obj = weiboParameters.get("access_token");
        Object obj2 = weiboParameters.get(Oauth2AccessToken.KEY_REFRESH_TOKEN);
        Object obj3 = weiboParameters.get("phone");
        if (obj != null && (obj instanceof String)) {
            str = (String) obj;
        } else if (obj2 != null && (obj2 instanceof String)) {
            str = (String) obj2;
        } else if (obj3 != null && (obj3 instanceof String)) {
            str = (String) obj3;
        }
        weiboParameters.put("oauth_sign", getOauthSign(context, aid, str, weiboParameters.getAppKey(), timestamp));
    }
}

package com.tencent.youtu.sdkkitframework.common;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CommonUtils {
    public static final String ALGORITHM = "TC3-HMAC-SHA256";
    public static final String CT_JSON = "application/json;";
    public static final String HOST = "ocr.tencentcloudapi.com";
    public static final int MAX_TIMEOUT_MS = 30000;
    public static final int MIN_TIMEOUT_MS = 0;
    public static final String SERVICE = "ocr";
    public static final String TAG = "CommonUtils";
    public static final String UTF8 = "UTF-8";
    public static ConcurrentHashMap<String, BenchMarkTime> benchMarkMaps = new ConcurrentHashMap<>();
    public static final char[] hexCode = "0123456789ABCDEF".toCharArray();

    public static class BenchMarkTime {
        public long begin;
        public long total = 0;
        public long tick = 0;
        public long cur = 0;
        public long avg = 0;
        public long min = Long.MAX_VALUE;
        public long max = Long.MIN_VALUE;

        private void update(long j) {
            this.tick++;
            this.min = Math.min(j, this.min);
            this.max = Math.max(j, this.max);
            long j2 = this.total + j;
            this.total = j2;
            this.avg = j2 / this.tick;
        }

        public void begin() {
            this.begin = System.currentTimeMillis();
        }

        public void end() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.begin;
            this.cur = jCurrentTimeMillis;
            update(jCurrentTimeMillis);
        }

        public String getTime() {
            return "avg: " + this.avg + "ms min: " + this.min + "ms max: " + this.max + "ms cur: " + this.cur + "ms";
        }
    }

    public static String Base64Encode(byte[] bArr) {
        return Base64.getEncoder().encodeToString(bArr);
    }

    public static byte[] HmacSha1(byte[] bArr, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(str.getBytes(), "HmacSHA1"));
        return mac.doFinal(bArr);
    }

    public static void benchMarkBegin(String str) {
        if (!benchMarkMaps.containsKey(str)) {
            benchMarkMaps.put(str, new BenchMarkTime());
        }
        benchMarkMaps.get(str).begin();
    }

    public static long benchMarkEnd(String str) {
        if (!benchMarkMaps.containsKey(str)) {
            return 0L;
        }
        BenchMarkTime benchMarkTime = benchMarkMaps.get(str);
        benchMarkTime.end();
        YtLogger.m84637d(TAG, "benchMarkEnd -- " + str + " : " + benchMarkTime.cur + "ms");
        return benchMarkTime.cur;
    }

    public static String byteToHex(byte b) {
        return new String(new char[]{Character.forDigit((b >> 4) & 15, 16), Character.forDigit(b & 15, 16)});
    }

    public static String bytesToHexFun(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    public static String encodeHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(byteToHex(b));
        }
        return stringBuffer.toString();
    }

    public static HashMap<String, String> getAuthorization(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str8 = simpleDateFormat.format(new Date(Long.parseLong(strValueOf + "000")));
        String str9 = str8 + "/ocr/tc3_request";
        String str10 = "TC3-HMAC-SHA256 Credential=" + str2 + "/" + str9 + ", SignedHeaders=content-type;host, Signature=" + bytesToHexFun(hmac256(hmac256(hmac256(hmac256(("TC3" + str3).getBytes("UTF-8"), str8), SERVICE), "tc3_request"), "TC3-HMAC-SHA256\n" + strValueOf + SignParameters.NEW_LINE + str9 + SignParameters.NEW_LINE + sha256Hex("POST\n/\n\ncontent-type:application/json\nhost:ocr.tencentcloudapi.com\n\ncontent-type;host\n" + sha256Hex(str))));
        HashMap<String, String> map = new HashMap<>();
        if (str4 != null && !str4.isEmpty()) {
            map.put("X-TC-Token", str4);
        }
        map.put("Authorization", str10);
        map.put("Content-Type", CT_JSON);
        map.put("Host", HOST);
        map.put("X-TC-Action", str5);
        map.put("X-TC-Timestamp", strValueOf);
        map.put("X-TC-Version", str6);
        map.put("X-TC-Region", str7);
        return map;
    }

    public static String getBenchMarkTime(String str) {
        if (!benchMarkMaps.containsKey(str)) {
            return "";
        }
        return "[" + str + Constants.AES_SUFFIX + benchMarkMaps.get(str).getTime();
    }

    public static byte[] getSignature(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(str2.getBytes(), mac.getAlgorithm()));
        return mac.doFinal(str.getBytes());
    }

    public static String getYouTuAppSign(long j, String str, String str2, String str3) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String str4 = String.format("a=%d&b=%s&k=%s&t=%d&e=%d&r=%d", Long.valueOf(j), str3, str, Long.valueOf(jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis + 2592000), Integer.valueOf(Math.abs(new Random().nextInt())));
        byte[] bArrHmacSha1 = HmacSha1(str4, str2);
        byte[] bArr = new byte[bArrHmacSha1.length + str4.getBytes().length];
        System.arraycopy(bArrHmacSha1, 0, bArr, 0, bArrHmacSha1.length);
        System.arraycopy(str4.getBytes(), 0, bArr, bArrHmacSha1.length, str4.getBytes().length);
        return Base64Encode(bArr);
    }

    public static String getYouTuAppSignTC3(String str, String str2, String str3, String str4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str5 = simpleDateFormat.format(new Date(Long.valueOf(str4 + "000").longValue()));
        String str6 = str5 + "/ocr/tc3_request";
        return "TC3-HMAC-SHA256 Credential=" + str + "/" + str6 + ", SignedHeaders=content-type;host, Signature=" + bytesToHexFun(hmac256(hmac256(hmac256(hmac256(("TC3" + str2).getBytes("UTF-8"), str5), SERVICE), "tc3_request"), "TC3-HMAC-SHA256\n" + str4 + SignParameters.NEW_LINE + str6 + SignParameters.NEW_LINE + sha256Hex("POST\n/\n\ncontent-type:application/json\nhost:ocr.tencentcloudapi.com\n\ncontent-type;host\n" + sha256Hex(str3)))).toLowerCase();
    }

    public static String getYoutuOpenAppSign(String str, String str2, String str3, String str4) throws NoSuchAlgorithmException, InvalidKeyException {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String str5 = "a=" + str + "&k=" + str2 + "&e=" + (2592000 + jCurrentTimeMillis) + "&t=" + jCurrentTimeMillis + "&r=" + Math.abs(new Random().nextInt()) + "&u=" + str4 + "&f=";
        byte[] signature = getSignature(str5, str3);
        byte[] bArr = new byte[signature.length + str5.getBytes().length];
        System.arraycopy(signature, 0, bArr, 0, signature.length);
        System.arraycopy(str5.getBytes(), 0, bArr, signature.length, str5.getBytes().length);
        return new String(android.util.Base64.encode(bArr, 2));
    }

    public static byte[] hmac256(byte[] bArr, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, mac.getAlgorithm()));
        return mac.doFinal(str.getBytes("UTF-8"));
    }

    public static String makeMessageJson(int i, String str, String str2) {
        try {
            new JSONObject(str2);
            return str2;
        } catch (Exception unused) {
            return "{ \"errorcode\":" + i + ",\"errormsg\": \"" + str + "\",\"extrainfo\":\"" + str2 + "\"}";
        }
    }

    public static String printHexBinary(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = hexCode;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static void reportException(String str, Exception exc) {
        YtSDKStats.getInstance().reportInfo(str + " cause exception: " + exc.getLocalizedMessage());
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(exc) { // from class: com.tencent.youtu.sdkkitframework.common.CommonUtils.1
            public final /* synthetic */ Exception val$e;

            {
                this.val$e = exc;
                put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                put(StateEvent.Name.PROCESS_RESULT, "failed");
                put(StateEvent.Name.ERROR_CODE, 3145728);
                put("message", CommonUtils.makeMessageJson(3145728, StringCode.RST_FAILED, exc.getLocalizedMessage()));
            }
        });
    }

    public static String sha256Hex(String str) {
        return printHexBinary(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"))).toLowerCase();
    }

    public static byte[] HmacSha1(String str, String str2) {
        return HmacSha1(str.getBytes(), str2);
    }
}

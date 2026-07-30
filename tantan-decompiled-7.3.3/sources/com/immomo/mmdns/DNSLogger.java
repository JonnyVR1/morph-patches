package com.immomo.mmdns;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class DNSLogger {
    private static final String BUSINESS_DNS_PARSETIME = "dns-time";
    private static final String BUSINESS_DNS_RATE = "dns-rate";
    private static final String BUSINESS_DNS_REQUEST = "dns-request";
    private static final String BUSINESS_DNS_RESULT = "dns-result";
    private static final int PARSE_DOZEN_COUNT = 6;
    private static final int REQUEST_DOZEN_COUNT = 5;
    private LogCallback logCallback;
    private long smartCount;
    private List<ParseLog> parseLogs = new ArrayList(20);
    private List<RateLog> rateLogs = new ArrayList(20);
    private List<RequestLog> requestLogs = new ArrayList(20);
    private final Object parseLock = new Object();
    private final Object rateLock = new Object();
    private final Object requestLock = new Object();

    public interface Jsonable {
        JSONObject toJson() throws Exception;
    }

    public interface LogCallback {
        void onLog(String str, JSONObject jSONObject);

        void onLogOverflow(String str, JSONArray jSONArray);
    }

    public class ParseLog implements Jsonable {
        public String host;

        /* JADX INFO: renamed from: ip */
        public String f13660ip;
        public long time;

        public ParseLog(String str, String str2, long j) {
            this.host = str;
            this.f13660ip = str2;
            this.time = j;
        }

        @Override // com.immomo.mmdns.DNSLogger.Jsonable
        public JSONObject toJson() throws Exception {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", this.host);
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f13660ip);
            jSONObject.put("time", this.time);
            return jSONObject;
        }
    }

    public class RateLog implements Jsonable {
        String host;

        /* JADX INFO: renamed from: ip */
        String f13661ip;
        boolean success;

        public RateLog(String str, String str2, boolean z) {
            this.host = str;
            this.f13661ip = str2;
            this.success = z;
        }

        @Override // com.immomo.mmdns.DNSLogger.Jsonable
        public JSONObject toJson() throws Exception {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", this.host);
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f13661ip);
            jSONObject.put("success", this.success);
            return jSONObject;
        }
    }

    public class RequestLog implements Jsonable {

        /* JADX INFO: renamed from: dn */
        String f13662dn;
        String requestIp;
        long time;

        public RequestLog(String str, String str2, long j) {
            this.f13662dn = str;
            this.requestIp = str2;
            this.time = j;
        }

        @Override // com.immomo.mmdns.DNSLogger.Jsonable
        public JSONObject toJson() throws Exception {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dn", this.f13662dn);
            jSONObject.put("requestIp", this.requestIp);
            jSONObject.put("time", this.time);
            return jSONObject;
        }
    }

    private void processLogUpload(int i, List<? extends Jsonable> list, String str) {
        try {
            if (list.size() >= i) {
                JSONArray jSONArray = new JSONArray();
                Iterator<? extends Jsonable> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJson());
                }
                this.logCallback.onLogOverflow(str, jSONArray);
            }
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.DNS, e);
        } finally {
            list.clear();
        }
    }

    public void recordDnsResult(long j, String str, String str2) {
        if (this.logCallback == null) {
            return;
        }
        if (this.smartCount >= Long.MAX_VALUE) {
            this.smartCount = 0L;
        }
        this.smartCount++;
        if (!str.contains("live") || this.smartCount % 4 == 0) {
            ParseLog parseLog = new ParseLog(str, str2, j);
            synchronized (this.parseLock) {
                this.parseLogs.add(parseLog);
                processLogUpload(6, this.parseLogs, BUSINESS_DNS_PARSETIME);
            }
            synchronized (this.rateLock) {
                try {
                    boolean zEquals = TextUtils.equals(str, str2);
                    List<RateLog> list = this.rateLogs;
                    if (zEquals) {
                        list.add(new RateLog(str, str2, false));
                    } else {
                        list.add(new RateLog(str, str2, true));
                    }
                    processLogUpload(6, this.rateLogs, BUSINESS_DNS_RATE);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void recordRequestLog(String str, String str2, long j) {
        if (this.logCallback == null) {
            return;
        }
        synchronized (this.requestLock) {
            this.requestLogs.add(new RequestLog(str, str2, j));
            processLogUpload(5, this.requestLogs, BUSINESS_DNS_REQUEST);
        }
    }

    public void recordSingleLog(String str, Map<String, String> map) {
        if (this.logCallback == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.logCallback.onLog(str, jSONObject);
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.DNS, e);
        }
    }

    public void setLogCallback(LogCallback logCallback) {
        this.logCallback = logCallback;
    }
}

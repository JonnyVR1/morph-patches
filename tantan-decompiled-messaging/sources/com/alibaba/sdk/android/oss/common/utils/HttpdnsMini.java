package com.alibaba.sdk.android.oss.common.utils;

import com.alibaba.sdk.android.oss.common.OSSLog;
import com.clevertap.android.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class HttpdnsMini {
    private static final String ACCOUNT_ID = "181345";
    private static final int EMPTY_RESULT_HOST_TTL = 30;
    private static final int MAX_HOLD_HOST_NUM = 100;
    private static final int MAX_THREAD_NUM = 5;
    private static final int RESOLVE_TIMEOUT_IN_SEC = 10;
    private static final String SERVER_IP = "203.107.1.1";
    private static final String TAG = "HttpDnsMini";
    private static HttpdnsMini instance;
    private ConcurrentMap<String, HostObject> hostManager = new ConcurrentHashMap();
    private ExecutorService pool = Executors.newFixedThreadPool(5);

    public class HostObject {
        private String hostName;

        /* JADX INFO: renamed from: ip */
        private String f3882ip;
        private long queryTime;
        private long ttl;

        public HostObject() {
        }

        public String getHostName() {
            return this.hostName;
        }

        public String getIp() {
            return this.f3882ip;
        }

        public long getQueryTime() {
            return this.queryTime;
        }

        public long getTtl() {
            return this.ttl;
        }

        public boolean isExpired() {
            return getQueryTime() + this.ttl < System.currentTimeMillis() / 1000;
        }

        public boolean isStillAvailable() {
            return (getQueryTime() + this.ttl) + 600 > System.currentTimeMillis() / 1000;
        }

        public void setHostName(String str) {
            this.hostName = str;
        }

        public void setIp(String str) {
            this.f3882ip = str;
        }

        public void setQueryTime(long j) {
            this.queryTime = j;
        }

        public void setTtl(long j) {
            this.ttl = j;
        }

        public String toString() {
            return "[hostName=" + getHostName() + ", ip=" + this.f3882ip + ", ttl=" + getTtl() + ", queryTime=" + this.queryTime + Constants.AES_SUFFIX;
        }
    }

    public class QueryHostTask implements Callable<String> {
        private boolean hasRetryed = false;
        private String hostName;

        public QueryHostTask(String str) {
            this.hostName = str;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x013f  */
        /* JADX WARN: Code duplicated, block: B:52:0x0147 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        public String call() throws Throwable {
            InputStream inputStream;
            InputStream inputStream2;
            String str = "https://203.107.1.1/181345/d?host=" + this.hostName;
            OSSLog.logDebug("[httpdnsmini] - buildUrl: ".concat(str));
            InputStream inputStream3 = null;
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    if (httpURLConnection.getResponseCode() != 200) {
                        OSSLog.logError("[httpdnsmini] - responseCodeNot 200, but: " + httpURLConnection.getResponseCode());
                        inputStream2 = null;
                    } else {
                        inputStream2 = httpURLConnection.getInputStream();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                            }
                            JSONObject jSONObject = new JSONObject(sb.toString());
                            String string = jSONObject.getString("host");
                            long j = jSONObject.getLong("ttl");
                            JSONArray jSONArray = jSONObject.getJSONArray("ips");
                            OSSLog.logDebug("[httpdnsmini] - ips:" + jSONArray.toString());
                            if (string != null && jSONArray.length() > 0) {
                                if (j == 0) {
                                    j = 30;
                                }
                                HostObject hostObject = HttpdnsMini.this.new HostObject();
                                String string2 = jSONArray.getString(0);
                                hostObject.setHostName(string);
                                hostObject.setTtl(j);
                                hostObject.setIp(string2);
                                hostObject.setQueryTime(System.currentTimeMillis() / 1000);
                                OSSLog.logDebug("[httpdnsmini] - resolve result:" + hostObject.toString());
                                if (HttpdnsMini.this.hostManager.size() < 100) {
                                    HttpdnsMini.this.hostManager.put(this.hostName, hostObject);
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                        return string2;
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                return string2;
                            }
                        } catch (Exception e2) {
                            inputStream = inputStream2;
                            e = e2;
                            try {
                                if (OSSLog.isEnableLog()) {
                                    e.printStackTrace();
                                    OSSLog.logThrowable2Local(e);
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (!this.hasRetryed) {
                                    return null;
                                }
                                this.hasRetryed = true;
                                return call();
                            } catch (Throwable th) {
                                th = th;
                                inputStream3 = inputStream;
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream3 = inputStream2;
                            if (inputStream3 != null) {
                                inputStream3.close();
                            }
                            throw th;
                        }
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (Exception e5) {
                e = e5;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
            if (!this.hasRetryed) {
                return null;
            }
            this.hasRetryed = true;
            return call();
        }
    }

    private HttpdnsMini() {
    }

    public static HttpdnsMini getInstance() {
        if (instance == null) {
            synchronized (HttpdnsMini.class) {
                try {
                    if (instance == null) {
                        instance = new HttpdnsMini();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public String getIpByHostAsync(String str) {
        HostObject hostObject = this.hostManager.get(str);
        if (hostObject == null || hostObject.isExpired()) {
            OSSLog.logDebug("[httpdnsmini] - refresh host: " + str);
            this.pool.submit(new QueryHostTask(str));
        }
        if (hostObject == null || !hostObject.isStillAvailable()) {
            return null;
        }
        return hostObject.getIp();
    }
}

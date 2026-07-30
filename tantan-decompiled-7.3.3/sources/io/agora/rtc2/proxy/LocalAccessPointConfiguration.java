package io.agora.rtc2.proxy;

import io.agora.base.internal.CalledByNative;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LocalAccessPointConfiguration {
    public ArrayList<String> ipList = null;
    public ArrayList<String> domainList = null;
    public String verifyDomainName = null;
    public int mode = 0;
    public boolean disableAut = true;
    public AdvancedConfigInfo advancedConfig = null;

    public static class AdvancedConfigInfo {
        public LogUploadServerInfo logUploadServer;

        public AdvancedConfigInfo() {
            this.logUploadServer = null;
            this.logUploadServer = new LogUploadServerInfo();
        }

        @CalledByNative("AdvancedConfigInfo")
        public LogUploadServerInfo getLogUploadServerInfo() {
            return this.logUploadServer;
        }
    }

    public static class LogUploadServerInfo {
        public String serverDomain;
        public boolean serverHttps;
        public String serverPath;
        public int serverPort;

        public LogUploadServerInfo() {
            this.serverDomain = null;
            this.serverPath = null;
            this.serverPort = 0;
            this.serverHttps = true;
        }

        @CalledByNative("LogUploadServerInfo")
        public String getServerDomain() {
            return this.serverDomain;
        }

        @CalledByNative("LogUploadServerInfo")
        public boolean getServerHttps() {
            return this.serverHttps;
        }

        @CalledByNative("LogUploadServerInfo")
        public String getServerPath() {
            return this.serverPath;
        }

        @CalledByNative("LogUploadServerInfo")
        public int getServerPort() {
            return this.serverPort;
        }

        public LogUploadServerInfo(String str, String str2, int i, boolean z) {
            this.serverDomain = str;
            this.serverPath = str2;
            this.serverPort = i;
            this.serverHttps = z;
        }
    }
}

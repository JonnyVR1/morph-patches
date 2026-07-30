package com.tantanapp.media.proxy.api;

import com.clevertap.android.sdk.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class PreloadTaskInfo {
    public long mAddTimestamp;
    public long mAverageRate;
    public String mCdnIp;
    public long mCompleteTimestamp;
    public long mConnectUsedTime;
    public String mDNSServers;
    public long mDnsUsedTime;
    public long mDownloadLimitRate;
    public long mDownloadRate;
    public long mDownloadedDuration;
    public long mDownloadedSize;
    public int mEndReasonCode;
    public String mEndReasonStr;
    public int mEventCode;
    public int mEventSubCode;
    public int mFirstPacketTime;
    public long mFirstWriteTimestamp;
    public long mGetFileSizeCost;
    public int mHeaderSize;
    public long mHttpBodyTime;
    public int mHttpCode;
    public String mHttpHeader;
    public long mHttpHeaderTime;
    public Boolean mIsFirstNetworkPacket;
    public String mKey;
    public int mPreloadThreadNumber;
    public int mPriority;
    public long mRequireDuration;
    public long mRequireSize;
    public long mRequireStart;
    public String mSessionID;
    public int mStatus;
    public int mTaskId;
    public long mTcpConnectTime;
    public int mTlsTime;
    public String mUrl;
    public long mUsedTime;
    public long mWaitTime;

    public static class TaskEndReason {
        public static String[] StrTaskEndReason = {TaskEndReasonHin.STR_NO_END, TaskEndReasonHin.STR_NOT_CONNECT, TaskEndReasonHin.STR_READ_ERROR, "下载完成", TaskEndReasonHin.STR_GET_FILESIZE_FAILED, TaskEndReasonHin.STR_REMOVE, TaskEndReasonHin.STR_PAUSE, TaskEndReasonHin.STR_WRITE_DISK_FAILED};

        public static class TaskEndReasonCode {
            public static final int END_COMPLETE = 3;
            public static final int END_GET_FILESIZE_FAILED = 4;
            public static final int END_NOT_CONNECT = 1;
            public static final int END_NO_END = 0;
            public static final int END_PAUSE = 6;
            public static final int END_READ_ERROR = 2;
            public static final int END_REMOVE = 5;
            public static final int END_WRITE_FAILED = 7;
        }

        public static class TaskEndReasonHin {
            public static final String STR_COMPLETE = "下载完成";
            public static final String STR_GET_FILESIZE_FAILED = "获取文件大小失败";
            public static final String STR_NOT_CONNECT = "connect失败";
            public static final String STR_NO_END = "初始化,无错误";
            public static final String STR_PAUSE = "被暂停";
            public static final String STR_READ_ERROR = "读错误";
            public static final String STR_REMOVE = "被删除";
            public static final String STR_WRITE_DISK_FAILED = "写磁盘失败";
        }
    }

    public static class TaskPriority {

        /* JADX INFO: renamed from: T0 */
        public static final int f56137T0 = 0;

        /* JADX INFO: renamed from: T1 */
        public static final int f56138T1 = 1;

        /* JADX INFO: renamed from: T2 */
        public static final int f56139T2 = 2;
    }

    public static class TaskStatus {
        public static String[] StrTaskStatus = {TaskStatusHin.STR_INITED, TaskStatusHin.STR_STARTING, TaskStatusHin.STR_PAUSED, TaskStatusHin.STR_DELAY_REMOVE, TaskStatusHin.STR_DELAY_PAUSED, "下载完成", TaskStatusHin.STR_REMOVE};

        public static class TaskStatusHin {
            public static final String STR_COMPLETE = "下载完成";
            public static final String STR_DELAY_PAUSED = "暂停中...";
            public static final String STR_DELAY_REMOVE = "删除中...";
            public static final String STR_INITED = "未启动";
            public static final String STR_PAUSED = "暂停";
            public static final String STR_REMOVE = "已删除";
            public static final String STR_STARTING = "下载中";
        }
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.mSessionID);
            jSONObject.put("task_end_code", this.mEndReasonCode);
            jSONObject.put("task_end_reason", this.mEndReasonStr);
            jSONObject.put("task_id", this.mTaskId);
            jSONObject.put("url", this.mUrl);
            jSONObject.put(Constants.KEY_KEY, this.mKey);
            jSONObject.put("http_header", this.mHttpHeader);
            jSONObject.put("dns_cost", this.mDnsUsedTime);
            jSONObject.put("tcp_connect_cost", this.mTcpConnectTime);
            jSONObject.put("http_header_cost", this.mHttpHeaderTime);
            jSONObject.put("first_packet_cost", this.mHttpBodyTime);
            jSONObject.put("http_status_code", this.mHttpCode);
            jSONObject.put("cdn_ip", this.mCdnIp);
            jSONObject.put("dns_ip", this.mDNSServers);
            jSONObject.put("downloaded_bytes", this.mDownloadedSize);
            jSONObject.put("downloaded_duration", this.mDownloadedDuration);
            jSONObject.put("task_add_timestamp", this.mAddTimestamp);
            jSONObject.put("task_wait_time", this.mWaitTime);
            jSONObject.put("task_use_cost", this.mUsedTime);
            jSONObject.put("download_byterate", this.mAverageRate);
            jSONObject.put("get_file_cost", this.mGetFileSizeCost);
            jSONObject.put("tls_time", this.mTlsTime);
            jSONObject.put("first_packet_time", this.mFirstPacketTime);
            jSONObject.put("header_size", this.mHeaderSize);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}

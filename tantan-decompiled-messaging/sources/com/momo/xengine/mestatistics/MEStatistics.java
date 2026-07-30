package com.momo.xengine.mestatistics;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public interface MEStatistics {
    static MEStatistics getInstance() {
        return MEStatisticsImpl.getInstance();
    }

    void flush();

    void init(Context context);

    void realTimeReport(ReportType reportType, String str, long j);

    void realTimeReport(ReportType reportType, String str, long j, String str2);

    void report(ReportType reportType, String str, long j);

    void report(ReportType reportType, String str, long j, String str2);

    void setMMCVVersion(int i);

    void setMagicEffectVersion(int i);

    void setRecorderSDKVersion(int i);

    void setUID(String str);

    void setXEngineVersion(int i);
}

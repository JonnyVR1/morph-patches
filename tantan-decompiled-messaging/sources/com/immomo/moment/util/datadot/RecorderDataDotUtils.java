package com.immomo.moment.util.datadot;

import com.momo.xengine.mestatistics.MEStatistics;
import com.momo.xengine.mestatistics.ReportType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class RecorderDataDotUtils implements Serializable {
    private static volatile RecorderDataDotUtils instance;

    private RecorderDataDotUtils() {
    }

    public static RecorderDataDotUtils getInstance() {
        if (instance == null) {
            synchronized (RecorderDataDotUtils.class) {
                try {
                    if (instance == null) {
                        instance = new RecorderDataDotUtils();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public void flush() {
        MEStatistics.getInstance().flush();
    }

    public void realTimeReport(String str, long j, ReportType reportType) {
        MEStatistics.getInstance().realTimeReport(reportType, str, j);
    }

    public void report(String str, long j, ReportType reportType) {
        MEStatistics.getInstance().report(reportType, str, j);
    }

    public void realTimeReport(ReportType reportType, String str, long j, String str2) {
        MEStatistics.getInstance().realTimeReport(reportType, str, j, str2);
    }
}

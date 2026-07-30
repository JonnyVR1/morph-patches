package com.momo.xengine.mestatistics;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class MEStatisticsImpl implements MEStatistics {
    private Context context;
    private final List<StatisticalValue> reportCache = new LinkedList();

    public static class Holder {
        static MEStatisticsImpl instance = new MEStatisticsImpl();
    }

    public static MEStatisticsImpl getInstance() {
        return Holder.instance;
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void flush() {
        StatisticalEvent statisticalEvent;
        if (this.context != null) {
            synchronized (this) {
                try {
                    if (this.reportCache.size() > 0) {
                        statisticalEvent = new StatisticalEvent();
                        Iterator<StatisticalValue> it = this.reportCache.iterator();
                        while (it.hasNext()) {
                            statisticalEvent.addValue(it.next());
                        }
                        this.reportCache.clear();
                    } else {
                        statisticalEvent = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (statisticalEvent != null) {
                Server.send(statisticalEvent);
            }
        }
    }

    public Context getContext() {
        return this.context;
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void init(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        StatisticalEvent.setup(applicationContext);
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void realTimeReport(ReportType reportType, String str, long j, String str2) {
        if (this.context != null) {
            StatisticalEvent statisticalEvent = new StatisticalEvent();
            statisticalEvent.addValue(reportType, str, j, str2);
            Server.send(statisticalEvent);
        }
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void report(ReportType reportType, String str, long j, String str2) {
        if (this.context != null) {
            StatisticalValue statisticalValue = new StatisticalValue(reportType, str, j);
            if (!TextUtils.isEmpty(str2)) {
                statisticalValue.setExtend(str2);
            }
            synchronized (this) {
                this.reportCache.add(statisticalValue);
            }
        }
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void setMMCVVersion(int i) {
        StatisticalEvent.setMmcvVersion(i);
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void setMagicEffectVersion(int i) {
        StatisticalEvent.setMagicEffectVersion(i);
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void setRecorderSDKVersion(int i) {
        StatisticalEvent.setRecorderSDKVersion(i);
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void setUID(String str) {
        StatisticalEvent.setUid(str);
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void setXEngineVersion(int i) {
        StatisticalEvent.setEngineVersion(i);
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void realTimeReport(ReportType reportType, String str, long j) {
        realTimeReport(reportType, str, j, null);
    }

    @Override // com.momo.xengine.mestatistics.MEStatistics
    public void report(ReportType reportType, String str, long j) {
        report(reportType, str, j, null);
    }
}

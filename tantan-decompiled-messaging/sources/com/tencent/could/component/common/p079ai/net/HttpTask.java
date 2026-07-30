package com.tencent.could.component.common.p079ai.net;

import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class HttpTask implements Runnable, Delayed {

    /* JADX INFO: renamed from: b */
    public IHttpRequest f57288b;

    /* JADX INFO: renamed from: d */
    public long f57290d;

    /* JADX INFO: renamed from: a */
    public String f57287a = "";

    /* JADX INFO: renamed from: c */
    public int f57289c = 0;

    /* JADX INFO: renamed from: e */
    public boolean f57291e = false;

    public HttpTask(CallBackListener callBackListener, NetWorkParam netWorkParam) {
        OkHttpRequest okHttpRequest = new OkHttpRequest();
        this.f57288b = okHttpRequest;
        okHttpRequest.setListener(callBackListener);
        this.f57288b.setNetWorkParam(netWorkParam);
        this.f57288b.setNeedUseDeputy(false);
        this.f57288b.setNeedIpBackUrl(false);
    }

    public void cleanRequest() {
        this.f57291e = true;
        IHttpRequest iHttpRequest = this.f57288b;
        if (iHttpRequest != null) {
            iHttpRequest.cleanExecute();
        }
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(getDelayTime() - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public long getDelayTime() {
        return this.f57290d;
    }

    public int getFailedNum() {
        return this.f57289c;
    }

    public IHttpRequest getIHttpRequest() {
        return this.f57288b;
    }

    public NetWorkParam getRequestNetWorkParam() {
        return this.f57288b.getNetWorkParam();
    }

    public String getTaskError() {
        return this.f57287a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f57288b.execute();
        } catch (Exception e) {
            if (this.f57291e) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "already stop , do not net retry");
                return;
            }
            this.f57287a = e.getMessage();
            TxNetWorkHelper.getInstance().logDebug("HttpTask", "fail error: " + this.f57287a);
            if (this.f57289c == 1) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "next try use deputy!");
                this.f57288b.setNeedUseDeputy(true);
            }
            if (this.f57289c == 2) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "next try use back ip!");
                this.f57288b.setNeedIpBackUrl(true);
            }
            if (this.f57289c > 2) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "next try use back ip array!");
                this.f57288b.setNeedIpBackUrls(true, this.f57289c - 3);
            }
            ThreadManager.getInstance().addFailedTask(this);
        }
    }

    public void setDelayTime(long j) {
        this.f57290d = j + System.currentTimeMillis();
    }

    public void setFailedNum(int i) {
        this.f57289c = i;
    }

    public void setTaskError(String str) {
        this.f57287a = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return 0;
    }
}

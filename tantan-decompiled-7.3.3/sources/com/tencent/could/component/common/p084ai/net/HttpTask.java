package com.tencent.could.component.common.p084ai.net;

import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class HttpTask implements Runnable, Delayed {

    /* JADX INFO: renamed from: b */
    public IHttpRequest f58136b;

    /* JADX INFO: renamed from: d */
    public long f58138d;

    /* JADX INFO: renamed from: a */
    public String f58135a = "";

    /* JADX INFO: renamed from: c */
    public int f58137c = 0;

    /* JADX INFO: renamed from: e */
    public boolean f58139e = false;

    public HttpTask(CallBackListener callBackListener, NetWorkParam netWorkParam) {
        OkHttpRequest okHttpRequest = new OkHttpRequest();
        this.f58136b = okHttpRequest;
        okHttpRequest.setListener(callBackListener);
        this.f58136b.setNetWorkParam(netWorkParam);
        this.f58136b.setNeedUseDeputy(false);
        this.f58136b.setNeedIpBackUrl(false);
    }

    public void cleanRequest() {
        this.f58139e = true;
        IHttpRequest iHttpRequest = this.f58136b;
        if (iHttpRequest != null) {
            iHttpRequest.cleanExecute();
        }
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(getDelayTime() - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public long getDelayTime() {
        return this.f58138d;
    }

    public int getFailedNum() {
        return this.f58137c;
    }

    public IHttpRequest getIHttpRequest() {
        return this.f58136b;
    }

    public NetWorkParam getRequestNetWorkParam() {
        return this.f58136b.getNetWorkParam();
    }

    public String getTaskError() {
        return this.f58135a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f58136b.execute();
        } catch (Exception e) {
            if (this.f58139e) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "already stop , do not net retry");
                return;
            }
            this.f58135a = e.getMessage();
            TxNetWorkHelper.getInstance().logDebug("HttpTask", "fail error: " + this.f58135a);
            if (this.f58137c == 1) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "next try use deputy!");
                this.f58136b.setNeedUseDeputy(true);
            }
            if (this.f58137c == 2) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "next try use back ip!");
                this.f58136b.setNeedIpBackUrl(true);
            }
            if (this.f58137c > 2) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "next try use back ip array!");
                this.f58136b.setNeedIpBackUrls(true, this.f58137c - 3);
            }
            ThreadManager.getInstance().addFailedTask(this);
        }
    }

    public void setDelayTime(long j) {
        this.f58138d = j + System.currentTimeMillis();
    }

    public void setFailedNum(int i) {
        this.f58137c = i;
    }

    public void setTaskError(String str) {
        this.f58135a = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return 0;
    }
}

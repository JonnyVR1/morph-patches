package com.tantanapp.httpdns.model;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.f0l;
import p153l.kyb;

/* JADX INFO: loaded from: classes11.dex */
public class DomainModel implements Serializable {
    public f0l healthCheckModel;
    public long queryTime;
    public String domain = "";
    public int ttl = 0;
    public String type = "";
    public ArrayList<IpModel> mainIpModelList = null;
    public ArrayList<IpModel> backupIpModelList = null;
    public ArrayList<IpModel> totalIpModelList = null;
    public String json = "";

    private ArrayList<IpModel> getValideIp(List<IpModel> list) {
        if (kyb.m151952a(list)) {
            return null;
        }
        ArrayList<IpModel> arrayList = new ArrayList<>();
        for (IpModel ipModel : list) {
            if (ipModel.valide) {
                arrayList.add(ipModel);
            }
        }
        return arrayList;
    }

    public String getIpByDomainModel() {
        ArrayList<IpModel> valideIp = getValideIp(this.mainIpModelList);
        if (kyb.m151952a(valideIp)) {
            valideIp = getValideIp(this.backupIpModelList);
        }
        if (kyb.m151952a(valideIp)) {
            return null;
        }
        Collections.shuffle(valideIp);
        return valideIp.get(0).f56959ip;
    }

    public int getProbeInterval() {
        return this.healthCheckModel.f96694b;
    }

    public boolean isExpire() {
        return (SystemClock.elapsedRealtime() / 1000) - (this.queryTime / 1000) > ((long) this.ttl);
    }

    public boolean isNeedProbe() {
        f0l f0lVar = this.healthCheckModel;
        return f0lVar != null && f0lVar.f96694b >= 1;
    }

    public void markIpValid(IpModel ipModel, ArrayList<IpModel> arrayList) {
        for (IpModel ipModel2 : arrayList) {
            if (ipModel2.f56959ip.equals(ipModel.f56959ip)) {
                ipModel.valide = ipModel2.valide;
                return;
            }
        }
    }

    @NonNull
    public String toString() {
        String str = ("域名：" + this.domain + SignParameters.NEW_LINE) + "过期时间：" + this.ttl + SignParameters.NEW_LINE;
        if (this.mainIpModelList != null) {
            for (int i = 0; i < this.mainIpModelList.size(); i++) {
                str = str + "主ip：[" + i + "]:" + this.mainIpModelList.get(i).toString() + SignParameters.NEW_LINE;
            }
        }
        if (this.backupIpModelList != null) {
            for (int i2 = 0; i2 < this.backupIpModelList.size(); i2++) {
                str = str + "备ip：[" + i2 + "]:" + this.backupIpModelList.get(i2).toString() + SignParameters.NEW_LINE;
            }
        }
        return str;
    }
}

package com.tantanapp.httpdns.model;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.pxk;
import p149l.wwb;

/* JADX INFO: loaded from: classes13.dex */
public class DomainModel implements Serializable {
    public pxk healthCheckModel;
    public long queryTime;
    public String domain = "";
    public int ttl = 0;
    public String type = "";
    public ArrayList<IpModel> mainIpModelList = null;
    public ArrayList<IpModel> backupIpModelList = null;
    public ArrayList<IpModel> totalIpModelList = null;
    public String json = "";

    private ArrayList<IpModel> getValideIp(List<IpModel> list) {
        if (wwb.m205852a(list)) {
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
        if (wwb.m205852a(valideIp)) {
            valideIp = getValideIp(this.backupIpModelList);
        }
        if (wwb.m205852a(valideIp)) {
            return null;
        }
        Collections.shuffle(valideIp);
        return valideIp.get(0).f56111ip;
    }

    public int getProbeInterval() {
        return this.healthCheckModel.f151689b;
    }

    public boolean isExpire() {
        return (SystemClock.elapsedRealtime() / 1000) - (this.queryTime / 1000) > ((long) this.ttl);
    }

    public boolean isNeedProbe() {
        pxk pxkVar = this.healthCheckModel;
        return pxkVar != null && pxkVar.f151689b >= 1;
    }

    public void markIpValid(IpModel ipModel, ArrayList<IpModel> arrayList) {
        for (IpModel ipModel2 : arrayList) {
            if (ipModel2.f56111ip.equals(ipModel.f56111ip)) {
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

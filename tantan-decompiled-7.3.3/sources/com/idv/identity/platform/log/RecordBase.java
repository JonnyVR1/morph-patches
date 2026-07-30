package com.idv.identity.platform.log;

import java.util.HashMap;
import java.util.Map;
import p153l.ac00;

/* JADX INFO: loaded from: classes7.dex */
public class RecordBase {
    public String logTime = "";
    public String logIdx = "";
    public String clientId = "";
    public String clientVersion = "";
    public String logVersion = "";
    public String deviceId = "";
    public String sessionId = "";
    public String actionName = "";
    public String logLevel = "";
    public Map<String, String> bizParam = new HashMap();
    public String phonePrint = "";
    public String osVersion = "";
    public String netType = "";
    public String screenMetrix = "";
    public String packageName = "";

    public String getActionName() {
        return this.actionName;
    }

    public Map<String, String> getBizParam() {
        return this.bizParam;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getLogIdx() {
        return this.logIdx;
    }

    public String getLogLevel() {
        return this.logLevel;
    }

    public String getLogTime() {
        return this.logTime;
    }

    public String getLogVersion() {
        return this.logVersion;
    }

    public String getNetType() {
        return this.netType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPhonePrint() {
        return this.phonePrint;
    }

    public String getScreenMetrix() {
        return this.screenMetrix;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setActionName(String str) {
        this.actionName = str;
    }

    public void setBizParam(Map<String, String> map) {
        this.bizParam = map;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setLogIdx(String str) {
        this.logIdx = str;
    }

    public void setLogLevel(String str) {
        this.logLevel = str;
    }

    public void setLogTime(String str) {
        this.logTime = str;
    }

    public void setLogVersion(String str) {
        this.logVersion = str;
    }

    public void setNetType(String str) {
        this.netType = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPhonePrint(String str) {
        this.phonePrint = str;
    }

    public void setScreenMetrix(String str) {
        this.screenMetrix = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String toString() {
        Map<String, String> map = this.bizParam;
        return (map == null || map.isEmpty()) ? "" : ac00.m96789h(this);
    }
}

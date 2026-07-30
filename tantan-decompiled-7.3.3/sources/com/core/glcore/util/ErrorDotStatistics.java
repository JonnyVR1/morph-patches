package com.core.glcore.util;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class ErrorDotStatistics {
    private static volatile ErrorDotStatistics instance;
    private LinkedList<String> errInfo = new LinkedList<>();

    public static ErrorDotStatistics getInstance() {
        if (instance == null) {
            synchronized (ErrorDotStatistics.class) {
                try {
                    if (instance == null) {
                        instance = new ErrorDotStatistics();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public void addErrInfo(String str) {
        if (str != null) {
            this.errInfo.add(str);
        }
    }

    public void clear() {
        LinkedList<String> linkedList = this.errInfo;
        if (linkedList != null) {
            linkedList.clear();
            this.errInfo = null;
        }
    }

    public String getErrorInfo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.errInfo.size(); i++) {
            sb.append(this.errInfo.get(i));
            sb.append(SignParameters.NEW_LINE);
        }
        if (sb.toString().length() > 0) {
            return sb.toString().substring(0, sb.toString().length() - 1);
        }
        return null;
    }

    public String getLastErrorInfo() {
        LinkedList<String> linkedList = this.errInfo;
        if (linkedList == null || linkedList.size() <= 0) {
            return null;
        }
        return this.errInfo.getLast();
    }
}

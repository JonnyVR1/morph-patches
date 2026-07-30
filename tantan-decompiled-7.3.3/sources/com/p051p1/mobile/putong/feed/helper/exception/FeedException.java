package com.p051p1.mobile.putong.feed.helper.exception;

import android.app.Activity;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class FeedException extends Exception {
    public FeedException(String str) {
        super(str);
    }

    public static String getActStackInfo() {
        StringBuilder sb = new StringBuilder();
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null) {
                    sb.append(activity.getClass().getName());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        }
        return sb.toString();
    }

    public static String getTrace(Exception exc) {
        StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace == null || stackTrace.length <= 2) {
            return "Trace TAG Error";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stackTrace.length && i <= 2; i++) {
            if (i != 2) {
                sb.append("at " + stackTrace[i].toString());
                sb.append(SignParameters.NEW_LINE);
            } else {
                sb.append("at " + stackTrace[i].toString());
            }
        }
        return sb.toString();
    }
}

package com.tencent.open.log;

import android.text.format.Time;
import android.util.Log;
import p149l.j6f;

/* JADX INFO: renamed from: com.tencent.open.log.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C14380g {

    /* JADX INFO: renamed from: a */
    public static final C14380g f60303a = new C14380g();

    /* JADX INFO: renamed from: a */
    public String m84362a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        long j2 = j % 1000;
        Time time = new Time();
        time.set(j);
        StringBuilder sb = new StringBuilder();
        sb.append(m84361a(i));
        sb.append('/');
        sb.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb.append('.');
        if (j2 < 10) {
            sb.append("00");
        } else if (j2 < 100) {
            sb.append('0');
        }
        sb.append(j2);
        sb.append(" [");
        if (thread == null) {
            sb.append("N/A");
        } else {
            sb.append(thread.getName());
        }
        sb.append("][");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        sb.append('\n');
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m84361a(int i) {
        if (i == 1) {
            return j6f.GPS_MEASUREMENT_INTERRUPTED;
        }
        if (i == 2) {
            return "D";
        }
        if (i == 4) {
            return "I";
        }
        if (i == 8) {
            return "W";
        }
        if (i == 16) {
            return "E";
        }
        if (i != 32) {
            return "-";
        }
        return "A";
    }
}

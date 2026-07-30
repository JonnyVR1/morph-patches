package com.tencent.open.log;

import com.p069ss.bytertc.engine.utils.LogUtil;
import com.tencent.connect.common.Constants;
import java.io.File;

/* JADX INFO: renamed from: com.tencent.open.log.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14376c {

    /* JADX INFO: renamed from: a */
    public static int f60285a = 60;

    /* JADX INFO: renamed from: b */
    public static int f60286b = 60;

    /* JADX INFO: renamed from: c */
    public static String f60287c = "OpenSDK.Client.File.Tracer";

    /* JADX INFO: renamed from: d */
    public static String f60288d;

    /* JADX INFO: renamed from: e */
    public static String f60289e;

    /* JADX INFO: renamed from: f */
    public static long f60290f;

    /* JADX INFO: renamed from: g */
    public static int f60291g;

    /* JADX INFO: renamed from: h */
    public static int f60292h;

    /* JADX INFO: renamed from: i */
    public static int f60293i;

    /* JADX INFO: renamed from: j */
    public static String f60294j;

    /* JADX INFO: renamed from: k */
    public static String f60295k;

    /* JADX INFO: renamed from: l */
    public static String f60296l;

    /* JADX INFO: renamed from: m */
    public static int f60297m;

    /* JADX INFO: renamed from: n */
    public static long f60298n;

    /* JADX INFO: renamed from: o */
    public static String f60299o;

    static {
        StringBuilder sb = new StringBuilder("Tencent");
        String str = File.separator;
        sb.append(str);
        sb.append("msflogs");
        sb.append(str);
        sb.append("com");
        sb.append(str);
        sb.append("tencent");
        sb.append(str);
        sb.append("mobileqq");
        sb.append(str);
        f60288d = sb.toString();
        f60289e = ".log";
        f60290f = 8388608L;
        f60291g = 262144;
        f60292h = 1024;
        f60293i = 10000;
        f60294j = "debug.file.blockcount";
        f60295k = "debug.file.keepperiod";
        f60296l = "debug.file.tracelevel";
        f60297m = 24;
        f60298n = 604800000L;
        f60299o = Constants.APP_SPECIFIC_ROOT + str + LogUtil.DIR_TAIL;
    }
}

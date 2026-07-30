package com.tencent.open.log;

import com.p074ss.bytertc.engine.utils.LogUtil;
import com.tencent.connect.common.Constants;
import java.io.File;

/* JADX INFO: renamed from: com.tencent.open.log.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14539c {

    /* JADX INFO: renamed from: a */
    public static int f61133a = 60;

    /* JADX INFO: renamed from: b */
    public static int f61134b = 60;

    /* JADX INFO: renamed from: c */
    public static String f61135c = "OpenSDK.Client.File.Tracer";

    /* JADX INFO: renamed from: d */
    public static String f61136d;

    /* JADX INFO: renamed from: e */
    public static String f61137e;

    /* JADX INFO: renamed from: f */
    public static long f61138f;

    /* JADX INFO: renamed from: g */
    public static int f61139g;

    /* JADX INFO: renamed from: h */
    public static int f61140h;

    /* JADX INFO: renamed from: i */
    public static int f61141i;

    /* JADX INFO: renamed from: j */
    public static String f61142j;

    /* JADX INFO: renamed from: k */
    public static String f61143k;

    /* JADX INFO: renamed from: l */
    public static String f61144l;

    /* JADX INFO: renamed from: m */
    public static int f61145m;

    /* JADX INFO: renamed from: n */
    public static long f61146n;

    /* JADX INFO: renamed from: o */
    public static String f61147o;

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
        f61136d = sb.toString();
        f61137e = ".log";
        f61138f = 8388608L;
        f61139g = 262144;
        f61140h = 1024;
        f61141i = 10000;
        f61142j = "debug.file.blockcount";
        f61143k = "debug.file.keepperiod";
        f61144l = "debug.file.tracelevel";
        f61145m = 24;
        f61146n = 604800000L;
        f61147o = Constants.APP_SPECIFIC_ROOT + str + LogUtil.DIR_TAIL;
    }
}

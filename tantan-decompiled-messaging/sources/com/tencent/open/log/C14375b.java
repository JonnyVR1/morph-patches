package com.tencent.open.log;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.tencent.open.utils.C14396n;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: renamed from: com.tencent.open.log.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14375b {

    /* JADX INFO: renamed from: a */
    private static SimpleDateFormat f60276a = C14377d.b.m84356a("yy.MM.dd.HH");

    /* JADX INFO: renamed from: b */
    private String f60277b;

    /* JADX INFO: renamed from: c */
    private int f60278c;

    /* JADX INFO: renamed from: d */
    private int f60279d;

    /* JADX INFO: renamed from: e */
    private int f60280e;

    /* JADX INFO: renamed from: f */
    private long f60281f;

    /* JADX INFO: renamed from: g */
    private int f60282g;

    /* JADX INFO: renamed from: h */
    private String f60283h;

    /* JADX INFO: renamed from: i */
    private long f60284i;

    public C14375b(int i, int i2, int i3, String str, long j, int i4, String str2, long j2) {
        this.f60277b = "Tracer.File";
        this.f60278c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f60279d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f60280e = 4096;
        this.f60281f = 10000L;
        this.f60282g = 10;
        this.f60283h = ".log";
        this.f60284i = Long.MAX_VALUE;
        m84344b(i);
        m84341a(i2);
        m84348c(i3);
        m84342a(str);
        m84345b(j);
        m84351d(i4);
        m84346b(str2);
        m84349c(j2);
    }

    /* JADX INFO: renamed from: a */
    public static String m84337a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime());
    }

    /* JADX INFO: renamed from: c */
    private String m84338c(String str) {
        return "com.tencent.mobileqq_connectSdk." + str + ".log";
    }

    /* JADX INFO: renamed from: d */
    private File m84339d(long j) {
        String strM84338c = m84338c(m84337a(j));
        String strM84485b = C14396n.m84485b();
        if (TextUtils.isEmpty(strM84485b) && strM84485b == null) {
            return null;
        }
        try {
            File file = new File(strM84485b, C14376c.f60299o);
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file, strM84338c);
        } catch (Exception e) {
            SLog.m84308e(SLog.TAG, "getWorkFile,get app specific file exception:", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m84343b() {
        return this.f60277b;
    }

    /* JADX INFO: renamed from: b */
    public void m84344b(int i) {
        this.f60279d = i;
    }

    /* JADX INFO: renamed from: b */
    public void m84345b(long j) {
        this.f60281f = j;
    }

    /* JADX INFO: renamed from: b */
    public void m84346b(String str) {
        this.f60283h = str;
    }

    /* JADX INFO: renamed from: c */
    public int m84347c() {
        return this.f60280e;
    }

    /* JADX INFO: renamed from: c */
    public void m84348c(int i) {
        this.f60280e = i;
    }

    /* JADX INFO: renamed from: c */
    public void m84349c(long j) {
        this.f60284i = j;
    }

    /* JADX INFO: renamed from: a */
    public File m84340a() {
        return m84339d(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public void m84342a(String str) {
        this.f60277b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m84341a(int i) {
        this.f60278c = i;
    }

    /* JADX INFO: renamed from: d */
    public int m84350d() {
        return this.f60282g;
    }

    /* JADX INFO: renamed from: d */
    public void m84351d(int i) {
        this.f60282g = i;
    }

    public C14375b() {
        this(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, 4096, "Tracer.File", 10000L, 10, ".log", Long.MAX_VALUE);
    }
}

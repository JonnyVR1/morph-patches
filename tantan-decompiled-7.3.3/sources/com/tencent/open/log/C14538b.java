package com.tencent.open.log;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.tencent.open.utils.C14559n;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: renamed from: com.tencent.open.log.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14538b {

    /* JADX INFO: renamed from: a */
    private static SimpleDateFormat f61124a = C14540d.b.m85539a("yy.MM.dd.HH");

    /* JADX INFO: renamed from: b */
    private String f61125b;

    /* JADX INFO: renamed from: c */
    private int f61126c;

    /* JADX INFO: renamed from: d */
    private int f61127d;

    /* JADX INFO: renamed from: e */
    private int f61128e;

    /* JADX INFO: renamed from: f */
    private long f61129f;

    /* JADX INFO: renamed from: g */
    private int f61130g;

    /* JADX INFO: renamed from: h */
    private String f61131h;

    /* JADX INFO: renamed from: i */
    private long f61132i;

    public C14538b(int i, int i2, int i3, String str, long j, int i4, String str2, long j2) {
        this.f61125b = "Tracer.File";
        this.f61126c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f61127d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f61128e = 4096;
        this.f61129f = 10000L;
        this.f61130g = 10;
        this.f61131h = ".log";
        this.f61132i = Long.MAX_VALUE;
        m85527b(i);
        m85524a(i2);
        m85531c(i3);
        m85525a(str);
        m85528b(j);
        m85534d(i4);
        m85529b(str2);
        m85532c(j2);
    }

    /* JADX INFO: renamed from: a */
    public static String m85520a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime());
    }

    /* JADX INFO: renamed from: c */
    private String m85521c(String str) {
        return "com.tencent.mobileqq_connectSdk." + str + ".log";
    }

    /* JADX INFO: renamed from: d */
    private File m85522d(long j) {
        String strM85521c = m85521c(m85520a(j));
        String strM85668b = C14559n.m85668b();
        if (TextUtils.isEmpty(strM85668b) && strM85668b == null) {
            return null;
        }
        try {
            File file = new File(strM85668b, C14539c.f61147o);
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file, strM85521c);
        } catch (Exception e) {
            SLog.m85491e(SLog.TAG, "getWorkFile,get app specific file exception:", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m85526b() {
        return this.f61125b;
    }

    /* JADX INFO: renamed from: b */
    public void m85527b(int i) {
        this.f61127d = i;
    }

    /* JADX INFO: renamed from: b */
    public void m85528b(long j) {
        this.f61129f = j;
    }

    /* JADX INFO: renamed from: b */
    public void m85529b(String str) {
        this.f61131h = str;
    }

    /* JADX INFO: renamed from: c */
    public int m85530c() {
        return this.f61128e;
    }

    /* JADX INFO: renamed from: c */
    public void m85531c(int i) {
        this.f61128e = i;
    }

    /* JADX INFO: renamed from: c */
    public void m85532c(long j) {
        this.f61132i = j;
    }

    /* JADX INFO: renamed from: a */
    public File m85523a() {
        return m85522d(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public void m85525a(String str) {
        this.f61125b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m85524a(int i) {
        this.f61126c = i;
    }

    /* JADX INFO: renamed from: d */
    public int m85533d() {
        return this.f61130g;
    }

    /* JADX INFO: renamed from: d */
    public void m85534d(int i) {
        this.f61130g = i;
    }

    public C14538b() {
        this(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, 4096, "Tracer.File", 10000L, 10, ".log", Long.MAX_VALUE);
    }
}

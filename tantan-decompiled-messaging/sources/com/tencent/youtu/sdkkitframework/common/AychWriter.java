package com.tencent.youtu.sdkkitframework.common;

/* JADX INFO: loaded from: classes2.dex */
public class AychWriter extends Thread {

    /* JADX INFO: renamed from: a */
    public String f60512a;

    /* JADX INFO: renamed from: b */
    public String f60513b;

    /* JADX INFO: renamed from: c */
    public String f60514c;

    public AychWriter(String str, String str2, String str3) {
        this.f60512a = str;
        this.f60513b = str2;
        this.f60514c = str3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        System.out.println("开始执行run()");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            LogWriter.getLogWriter(this.f60513b, this.f60514c).log(this.f60512a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LogWriter.logWriter = null;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        System.out.println("总消耗时间：" + (jCurrentTimeMillis2 - jCurrentTimeMillis));
    }
}

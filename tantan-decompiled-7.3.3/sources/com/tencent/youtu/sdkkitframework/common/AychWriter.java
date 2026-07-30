package com.tencent.youtu.sdkkitframework.common;

/* JADX INFO: loaded from: classes2.dex */
public class AychWriter extends Thread {

    /* JADX INFO: renamed from: a */
    public String f61359a;

    /* JADX INFO: renamed from: b */
    public String f61360b;

    /* JADX INFO: renamed from: c */
    public String f61361c;

    public AychWriter(String str, String str2, String str3) {
        this.f61359a = str;
        this.f61360b = str2;
        this.f61361c = str3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        System.out.println("开始执行run()");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            LogWriter.getLogWriter(this.f61360b, this.f61361c).log(this.f61359a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LogWriter.logWriter = null;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        System.out.println("总消耗时间：" + (jCurrentTimeMillis2 - jCurrentTimeMillis));
    }
}

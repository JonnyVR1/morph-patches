package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import p149l.dxq0;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14856b {

    /* JADX INFO: renamed from: a */
    private static volatile C14856b f63009a;

    /* JADX INFO: renamed from: a */
    private Context f63010a;

    /* JADX INFO: renamed from: e */
    private volatile String f63017e;

    /* JADX INFO: renamed from: f */
    private volatile String f63018f;

    /* JADX INFO: renamed from: a */
    private final Object f63011a = new Object();

    /* JADX INFO: renamed from: b */
    private final Object f63013b = new Object();

    /* JADX INFO: renamed from: a */
    private final String f63012a = "mipush_region";

    /* JADX INFO: renamed from: b */
    private final String f63014b = "mipush_country_code";

    /* JADX INFO: renamed from: c */
    private final String f63015c = "mipush_region.lock";

    /* JADX INFO: renamed from: d */
    private final String f63016d = "mipush_country_code.lock";

    public C14856b(Context context) {
        this.f63010a = context;
    }

    /* JADX INFO: renamed from: a */
    private String m86605a(Context context, String str, String str2, Object obj) {
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        File file = new File(context.getFilesDir(), str);
        FileLock fileLock = null;
        if (!file.exists()) {
            ilq0.m137040m("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                File file2 = new File(context.getFilesDir(), str2);
                dxq0.m114022f(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        try {
                            String strM114017a = dxq0.m114017a(file);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e) {
                                    ilq0.m137044q(e);
                                }
                            }
                            dxq0.m114018b(randomAccessFile);
                            return strM114017a;
                        } catch (Exception e2) {
                            e = e2;
                            ilq0.m137044q(e);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e3) {
                                    ilq0.m137044q(e3);
                                }
                            }
                            dxq0.m114018b(randomAccessFile);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileLock = fileLockLock;
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e4) {
                                ilq0.m137044q(e4);
                            }
                        }
                        dxq0.m114018b(randomAccessFile);
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    fileLockLock = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    dxq0.m114018b(randomAccessFile);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                randomAccessFile = null;
                fileLockLock = null;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m86610b(String str, boolean z) {
        if (!TextUtils.equals(str, this.f63018f)) {
            this.f63018f = str;
        }
        if (z) {
            m86606a(this.f63010a, str, "mipush_country_code", "mipush_region.lock", this.f63011a);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m86609b() {
        if (TextUtils.isEmpty(this.f63018f)) {
            this.f63018f = m86605a(this.f63010a, "mipush_country_code", "mipush_country_code.lock", this.f63013b);
        }
        return this.f63018f;
    }

    /* JADX INFO: renamed from: a */
    public String m86607a() {
        if (TextUtils.isEmpty(this.f63017e)) {
            this.f63017e = m86605a(this.f63010a, "mipush_region", "mipush_region.lock", this.f63011a);
        }
        return this.f63017e;
    }

    /* JADX INFO: renamed from: a */
    public void m86608a(String str, boolean z) {
        if (!TextUtils.equals(str, this.f63017e)) {
            this.f63017e = str;
        }
        if (z) {
            m86606a(this.f63010a, str, "mipush_region", "mipush_region.lock", this.f63011a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86606a(Context context, String str, String str2, String str3, Object obj) {
        RandomAccessFile randomAccessFile;
        synchronized (obj) {
            FileLock fileLockLock = null;
            try {
                File file = new File(context.getFilesDir(), str3);
                dxq0.m114022f(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    try {
                        fileLockLock = randomAccessFile.getChannel().lock();
                        dxq0.m114020d(new File(context.getFilesDir(), str2), str);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e) {
                                ilq0.m137044q(e);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        ilq0.m137044q(e);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                        }
                        dxq0.m114018b(randomAccessFile);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e3) {
                            ilq0.m137044q(e3);
                        }
                    }
                    dxq0.m114018b(randomAccessFile);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                randomAccessFile = null;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
                if (fileLockLock != null) {
                    fileLockLock.release();
                }
                dxq0.m114018b(randomAccessFile);
                throw th;
            }
            dxq0.m114018b(randomAccessFile);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14856b m86604a(Context context) {
        if (f63009a == null) {
            synchronized (C14856b.class) {
                try {
                    if (f63009a == null) {
                        f63009a = new C14856b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f63009a;
    }
}

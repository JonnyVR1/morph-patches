package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import p153l.j6r0;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.b */
/* JADX INFO: loaded from: classes2.dex */
public class C15004b {

    /* JADX INFO: renamed from: a */
    private static volatile C15004b f63856a;

    /* JADX INFO: renamed from: a */
    private Context f63857a;

    /* JADX INFO: renamed from: e */
    private volatile String f63864e;

    /* JADX INFO: renamed from: f */
    private volatile String f63865f;

    /* JADX INFO: renamed from: a */
    private final Object f63858a = new Object();

    /* JADX INFO: renamed from: b */
    private final Object f63860b = new Object();

    /* JADX INFO: renamed from: a */
    private final String f63859a = "mipush_region";

    /* JADX INFO: renamed from: b */
    private final String f63861b = "mipush_country_code";

    /* JADX INFO: renamed from: c */
    private final String f63862c = "mipush_region.lock";

    /* JADX INFO: renamed from: d */
    private final String f63863d = "mipush_country_code.lock";

    public C15004b(Context context) {
        this.f63857a = context;
    }

    /* JADX INFO: renamed from: a */
    private String m87776a(Context context, String str, String str2, Object obj) {
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        File file = new File(context.getFilesDir(), str);
        FileLock fileLock = null;
        if (!file.exists()) {
            ouq0.m169393m("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                File file2 = new File(context.getFilesDir(), str2);
                j6r0.m143695f(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        try {
                            String strM143690a = j6r0.m143690a(file);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e) {
                                    ouq0.m169397q(e);
                                }
                            }
                            j6r0.m143691b(randomAccessFile);
                            return strM143690a;
                        } catch (Exception e2) {
                            e = e2;
                            ouq0.m169397q(e);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e3) {
                                    ouq0.m169397q(e3);
                                }
                            }
                            j6r0.m143691b(randomAccessFile);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileLock = fileLockLock;
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e4) {
                                ouq0.m169397q(e4);
                            }
                        }
                        j6r0.m143691b(randomAccessFile);
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
                    j6r0.m143691b(randomAccessFile);
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
    public void m87781b(String str, boolean z) {
        if (!TextUtils.equals(str, this.f63865f)) {
            this.f63865f = str;
        }
        if (z) {
            m87777a(this.f63857a, str, "mipush_country_code", "mipush_region.lock", this.f63858a);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m87780b() {
        if (TextUtils.isEmpty(this.f63865f)) {
            this.f63865f = m87776a(this.f63857a, "mipush_country_code", "mipush_country_code.lock", this.f63860b);
        }
        return this.f63865f;
    }

    /* JADX INFO: renamed from: a */
    public String m87778a() {
        if (TextUtils.isEmpty(this.f63864e)) {
            this.f63864e = m87776a(this.f63857a, "mipush_region", "mipush_region.lock", this.f63858a);
        }
        return this.f63864e;
    }

    /* JADX INFO: renamed from: a */
    public void m87779a(String str, boolean z) {
        if (!TextUtils.equals(str, this.f63864e)) {
            this.f63864e = str;
        }
        if (z) {
            m87777a(this.f63857a, str, "mipush_region", "mipush_region.lock", this.f63858a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m87777a(Context context, String str, String str2, String str3, Object obj) {
        RandomAccessFile randomAccessFile;
        synchronized (obj) {
            FileLock fileLockLock = null;
            try {
                File file = new File(context.getFilesDir(), str3);
                j6r0.m143695f(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    try {
                        fileLockLock = randomAccessFile.getChannel().lock();
                        j6r0.m143693d(new File(context.getFilesDir(), str2), str);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e) {
                                ouq0.m169397q(e);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        ouq0.m169397q(e);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                        }
                        j6r0.m143691b(randomAccessFile);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e3) {
                            ouq0.m169397q(e3);
                        }
                    }
                    j6r0.m143691b(randomAccessFile);
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
                j6r0.m143691b(randomAccessFile);
                throw th;
            }
            j6r0.m143691b(randomAccessFile);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C15004b m87775a(Context context) {
        if (f63856a == null) {
            synchronized (C15004b.class) {
                try {
                    if (f63856a == null) {
                        f63856a = new C15004b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f63856a;
    }
}

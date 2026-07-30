package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.tantanapp.push.xiaomi.MiPushReceiver;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14788m;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Arrays;
import p149l.auq0;
import p149l.awq0;
import p149l.dxq0;
import p149l.ilq0;
import p149l.jkq0;
import p149l.jxq0;
import p149l.njq0;
import p149l.vlq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ba */
/* JADX INFO: loaded from: classes2.dex */
public class C14857ba {

    /* JADX INFO: renamed from: a */
    public static final Object f63019a = new Object();

    /* JADX INFO: renamed from: a */
    public static byte[] m86612a(Context context) {
        String strM99303c = awq0.m99301d(context).m99303c(MiPushReceiver.PUSH_NAME, "td_key", "");
        if (TextUtils.isEmpty(strM99303c)) {
            strM99303c = vlq0.m198838a(20);
            awq0.m99301d(context).m99304e(MiPushReceiver.PUSH_NAME, "td_key", strM99303c);
        }
        return m86613a(strM99303c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m86615c(Context context, C14744gj c14744gj) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        try {
            byte[] bArrM99036c = auq0.m99036c(m86612a(context), C14788m.m86277e(c14744gj));
            if (bArrM99036c != null && bArrM99036c.length >= 1) {
                if (bArrM99036c.length > 30720) {
                    ilq0.m137040m("TinyData write to cache file failed case too much data content item:" + c14744gj.m85633d() + "  ts:" + System.currentTimeMillis());
                    dxq0.m114018b(null);
                    dxq0.m114018b(null);
                    return;
                }
                BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                try {
                    bufferedOutputStream3.write(jxq0.m143821b(bArrM99036c.length));
                    bufferedOutputStream3.write(bArrM99036c);
                    bufferedOutputStream3.flush();
                    dxq0.m114018b(null);
                    dxq0.m114018b(bufferedOutputStream3);
                    return;
                } catch (IOException e) {
                    bufferedOutputStream2 = bufferedOutputStream3;
                    e = e;
                    try {
                        ilq0.m137042o("TinyData write to cache file failed cause io exception item:" + c14744gj.m85633d(), e);
                        dxq0.m114018b(null);
                        dxq0.m114018b(bufferedOutputStream2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        dxq0.m114018b(null);
                        dxq0.m114018b(bufferedOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    bufferedOutputStream = bufferedOutputStream3;
                    e = e2;
                    try {
                        ilq0.m137042o("TinyData write to cache file  failed item:" + c14744gj.m85633d(), e);
                        dxq0.m114018b(null);
                        dxq0.m114018b(bufferedOutputStream);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        dxq0.m114018b(null);
                        dxq0.m114018b(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    bufferedOutputStream = bufferedOutputStream3;
                    th = th3;
                    dxq0.m114018b(null);
                    dxq0.m114018b(bufferedOutputStream);
                    throw th;
                }
            }
            ilq0.m137040m("TinyData write to cache file failed case encryption fail item:" + c14744gj.m85633d() + "  ts:" + System.currentTimeMillis());
            dxq0.m114018b(null);
            dxq0.m114018b(null);
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream2 = null;
        } catch (Exception e4) {
            e = e4;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86611a(final Context context, final C14744gj c14744gj) {
        if (C14855az.m86603a(c14744gj.m85636e())) {
            njq0.m159772f(context).m159773g(new Runnable() { // from class: com.xiaomi.push.service.ba.1
                @Override // java.lang.Runnable
                public void run() {
                    RandomAccessFile randomAccessFile;
                    synchronized (C14857ba.f63019a) {
                        FileLock fileLockLock = null;
                        try {
                            try {
                                File file = new File(context.getFilesDir(), "tiny_data.lock");
                                dxq0.m114022f(file);
                                randomAccessFile = new RandomAccessFile(file, "rw");
                                try {
                                    fileLockLock = randomAccessFile.getChannel().lock();
                                    C14857ba.m86615c(context, c14744gj);
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
            });
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m86613a(String str) {
        byte[] bArrCopyOf = Arrays.copyOf(jkq0.m141908b(str), 16);
        bArrCopyOf[0] = 68;
        bArrCopyOf[15] = 84;
        return bArrCopyOf;
    }
}

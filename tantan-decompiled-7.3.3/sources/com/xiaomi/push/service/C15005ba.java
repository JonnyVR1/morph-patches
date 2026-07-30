package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.tantanapp.push.xiaomi.MiPushReceiver;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14936m;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Arrays;
import p153l.bvq0;
import p153l.g3r0;
import p153l.g5r0;
import p153l.j6r0;
import p153l.ouq0;
import p153l.p6r0;
import p153l.ptq0;
import p153l.tsq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ba */
/* JADX INFO: loaded from: classes2.dex */
public class C15005ba {

    /* JADX INFO: renamed from: a */
    public static final Object f63866a = new Object();

    /* JADX INFO: renamed from: a */
    public static byte[] m87783a(Context context) {
        String strM129072c = g5r0.m129070d(context).m129072c(MiPushReceiver.PUSH_NAME, "td_key", "");
        if (TextUtils.isEmpty(strM129072c)) {
            strM129072c = bvq0.m106587a(20);
            g5r0.m129070d(context).m129073e(MiPushReceiver.PUSH_NAME, "td_key", strM129072c);
        }
        return m87784a(strM129072c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m87786c(Context context, C14892gj c14892gj) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        try {
            byte[] bArrM128758c = g3r0.m128758c(m87783a(context), C14936m.m87448e(c14892gj));
            if (bArrM128758c != null && bArrM128758c.length >= 1) {
                if (bArrM128758c.length > 30720) {
                    ouq0.m169393m("TinyData write to cache file failed case too much data content item:" + c14892gj.m86804d() + "  ts:" + System.currentTimeMillis());
                    j6r0.m143691b(null);
                    j6r0.m143691b(null);
                    return;
                }
                BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                try {
                    bufferedOutputStream3.write(p6r0.m170922b(bArrM128758c.length));
                    bufferedOutputStream3.write(bArrM128758c);
                    bufferedOutputStream3.flush();
                    j6r0.m143691b(null);
                    j6r0.m143691b(bufferedOutputStream3);
                    return;
                } catch (IOException e) {
                    bufferedOutputStream2 = bufferedOutputStream3;
                    e = e;
                    try {
                        ouq0.m169395o("TinyData write to cache file failed cause io exception item:" + c14892gj.m86804d(), e);
                        j6r0.m143691b(null);
                        j6r0.m143691b(bufferedOutputStream2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        j6r0.m143691b(null);
                        j6r0.m143691b(bufferedOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    bufferedOutputStream = bufferedOutputStream3;
                    e = e2;
                    try {
                        ouq0.m169395o("TinyData write to cache file  failed item:" + c14892gj.m86804d(), e);
                        j6r0.m143691b(null);
                        j6r0.m143691b(bufferedOutputStream);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        j6r0.m143691b(null);
                        j6r0.m143691b(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    bufferedOutputStream = bufferedOutputStream3;
                    th = th3;
                    j6r0.m143691b(null);
                    j6r0.m143691b(bufferedOutputStream);
                    throw th;
                }
            }
            ouq0.m169393m("TinyData write to cache file failed case encryption fail item:" + c14892gj.m86804d() + "  ts:" + System.currentTimeMillis());
            j6r0.m143691b(null);
            j6r0.m143691b(null);
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
    public static void m87782a(final Context context, final C14892gj c14892gj) {
        if (C15003az.m87774a(c14892gj.m86807e())) {
            tsq0.m192627f(context).m192628g(new Runnable() { // from class: com.xiaomi.push.service.ba.1
                @Override // java.lang.Runnable
                public void run() {
                    RandomAccessFile randomAccessFile;
                    synchronized (C15005ba.f63866a) {
                        FileLock fileLockLock = null;
                        try {
                            try {
                                File file = new File(context.getFilesDir(), "tiny_data.lock");
                                j6r0.m143695f(file);
                                randomAccessFile = new RandomAccessFile(file, "rw");
                                try {
                                    fileLockLock = randomAccessFile.getChannel().lock();
                                    C15005ba.m87786c(context, c14892gj);
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
            });
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m87784a(String str) {
        byte[] bArrCopyOf = Arrays.copyOf(ptq0.m173774b(str), 16);
        bArrCopyOf[0] = 68;
        bArrCopyOf[15] = 84;
        return bArrCopyOf;
    }
}

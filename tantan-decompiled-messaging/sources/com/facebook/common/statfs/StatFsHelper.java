package com.facebook.common.statfs;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p149l.spi0;

/* JADX INFO: loaded from: classes.dex */
public class StatFsHelper {

    /* JADX INFO: renamed from: h */
    public static StatFsHelper f6263h;

    /* JADX INFO: renamed from: i */
    public static final long f6264i = 120000;

    /* JADX INFO: renamed from: b */
    public volatile File f6266b;

    /* JADX INFO: renamed from: d */
    public volatile File f6268d;

    /* JADX INFO: renamed from: e */
    public long f6269e;

    /* JADX INFO: renamed from: a */
    public volatile StatFs f6265a = null;

    /* JADX INFO: renamed from: c */
    public volatile StatFs f6267c = null;

    /* JADX INFO: renamed from: g */
    public volatile boolean f6271g = false;

    /* JADX INFO: renamed from: f */
    public final Lock f6270f = new ReentrantLock();

    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    /* JADX INFO: renamed from: a */
    public static StatFs m8167a(String str) {
        return new StatFs(str);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized StatFsHelper m8168d() {
        try {
            if (f6263h == null) {
                f6263h = new StatFsHelper();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6263h;
    }

    /* JADX INFO: renamed from: b */
    public final void m8169b() {
        if (this.f6271g) {
            return;
        }
        this.f6270f.lock();
        try {
            if (!this.f6271g) {
                this.f6266b = Environment.getDataDirectory();
                this.f6268d = Environment.getExternalStorageDirectory();
                m8173g();
                this.f6271g = true;
            }
        } finally {
            this.f6270f.unlock();
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    /* JADX INFO: renamed from: c */
    public long m8170c(StorageType storageType) {
        m8169b();
        m8171e();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.f6265a : this.f6267c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m8171e() {
        if (this.f6270f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f6269e > f6264i) {
                    m8173g();
                }
            } finally {
                this.f6270f.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m8172f(StorageType storageType, long j) {
        m8169b();
        long jM8170c = m8170c(storageType);
        return jM8170c <= 0 || jM8170c < j;
    }

    /* JADX INFO: renamed from: g */
    public final void m8173g() {
        this.f6265a = m8174h(this.f6265a, this.f6266b);
        this.f6267c = m8174h(this.f6267c, this.f6268d);
        this.f6269e = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public final StatFs m8174h(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return m8167a(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                throw spi0.m185369a(th);
            }
        }
        return null;
    }
}

package com.facebook.common.statfs;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p153l.vyi0;

/* JADX INFO: loaded from: classes.dex */
public class StatFsHelper {

    /* JADX INFO: renamed from: h */
    public static StatFsHelper f6300h;

    /* JADX INFO: renamed from: i */
    public static final long f6301i = 120000;

    /* JADX INFO: renamed from: b */
    public volatile File f6303b;

    /* JADX INFO: renamed from: d */
    public volatile File f6305d;

    /* JADX INFO: renamed from: e */
    public long f6306e;

    /* JADX INFO: renamed from: a */
    public volatile StatFs f6302a = null;

    /* JADX INFO: renamed from: c */
    public volatile StatFs f6304c = null;

    /* JADX INFO: renamed from: g */
    public volatile boolean f6308g = false;

    /* JADX INFO: renamed from: f */
    public final Lock f6307f = new ReentrantLock();

    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    /* JADX INFO: renamed from: a */
    public static StatFs m8221a(String str) {
        return new StatFs(str);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized StatFsHelper m8222d() {
        try {
            if (f6300h == null) {
                f6300h = new StatFsHelper();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6300h;
    }

    /* JADX INFO: renamed from: b */
    public final void m8223b() {
        if (this.f6308g) {
            return;
        }
        this.f6307f.lock();
        try {
            if (!this.f6308g) {
                this.f6303b = Environment.getDataDirectory();
                this.f6305d = Environment.getExternalStorageDirectory();
                m8227g();
                this.f6308g = true;
            }
        } finally {
            this.f6307f.unlock();
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    /* JADX INFO: renamed from: c */
    public long m8224c(StorageType storageType) {
        m8223b();
        m8225e();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.f6302a : this.f6304c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m8225e() {
        if (this.f6307f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f6306e > f6301i) {
                    m8227g();
                }
            } finally {
                this.f6307f.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m8226f(StorageType storageType, long j) {
        m8223b();
        long jM8224c = m8224c(storageType);
        return jM8224c <= 0 || jM8224c < j;
    }

    /* JADX INFO: renamed from: g */
    public final void m8227g() {
        this.f6302a = m8228h(this.f6302a, this.f6303b);
        this.f6304c = m8228h(this.f6304c, this.f6305d);
        this.f6306e = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public final StatFs m8228h(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return m8221a(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                throw vyi0.m203997a(th);
            }
        }
        return null;
    }
}

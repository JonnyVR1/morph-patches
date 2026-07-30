package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import p153l.t3d0;

/* JADX INFO: renamed from: androidx.profileinstaller.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0550e {

    /* JADX INFO: renamed from: a */
    public static final t3d0<c> f2519a = t3d0.m189082a();

    /* JADX INFO: renamed from: b */
    public static final Object f2520b = new Object();

    /* JADX INFO: renamed from: c */
    @Nullable
    public static c f2521c = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.e$a */
    @RequiresApi(33)
    public static class a {
        /* JADX INFO: renamed from: a */
        public static PackageInfo m3305a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.e$b */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f2522a;

        /* JADX INFO: renamed from: b */
        public final int f2523b;

        /* JADX INFO: renamed from: c */
        public final long f2524c;

        /* JADX INFO: renamed from: d */
        public final long f2525d;

        public b(int i, int i2, long j, long j2) {
            this.f2522a = i;
            this.f2523b = i2;
            this.f2524c = j;
            this.f2525d = j2;
        }

        /* JADX INFO: renamed from: a */
        public static b m3306a(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3307b(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2522a);
                dataOutputStream.writeInt(this.f2523b);
                dataOutputStream.writeLong(this.f2524c);
                dataOutputStream.writeLong(this.f2525d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f2523b == bVar.f2523b && this.f2524c == bVar.f2524c && this.f2522a == bVar.f2522a && this.f2525d == bVar.f2525d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f2523b), Long.valueOf(this.f2524c), Integer.valueOf(this.f2522a), Long.valueOf(this.f2525d));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.e$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f2526a;

        /* JADX INFO: renamed from: b */
        public final boolean f2527b;

        /* JADX INFO: renamed from: c */
        public final boolean f2528c;

        /* JADX INFO: renamed from: d */
        public final boolean f2529d;

        public c(int i, boolean z, boolean z2, boolean z3) {
            this.f2526a = i;
            this.f2528c = z2;
            this.f2527b = z;
            this.f2529d = z3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m3302a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m3305a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static c m3303b(int i, boolean z, boolean z2, boolean z3) {
        c cVar = new c(i, z, z2, z3);
        f2521c = cVar;
        f2519a.set(cVar);
        return f2521c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public static c m3304c(@NonNull Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        b bVarM3306a;
        b bVar;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z && (cVar = f2521c) != null) {
            return cVar;
        }
        synchronized (f2520b) {
            if (z) {
                i = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                assetFileDescriptorOpenFd.close();
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    long jM3302a = m3302a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarM3306a = b.m3306a(file3);
                    } else {
                        bVarM3306a = null;
                    }
                    if (bVarM3306a == null) {
                        if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z) {
                        i = 2;
                    }
                    if (bVarM3306a != null) {
                        i = 3;
                    }
                    int i4 = i;
                    bVar = new b(1, i4, jM3302a, length);
                    if (bVarM3306a != null) {
                        bVar.m3307b(file3);
                    } else {
                        bVar.m3307b(file3);
                    }
                    return m3303b(i4, z3, z4, z2);
                }
                return m3303b(262144, false, false, z2);
            }
            c cVar2 = f2521c;
            if (cVar2 != null) {
                return cVar2;
            }
            i = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                z2 = false;
            }
            i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28 && i2 != 30) {
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                try {
                    long jM3302a2 = m3302a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarM3306a = b.m3306a(file3);
                        } catch (IOException unused2) {
                            return m3303b(131072, z3, z4, z2);
                        }
                    } else {
                        bVarM3306a = null;
                    }
                    if (bVarM3306a == null && bVarM3306a.f2524c == jM3302a2 && (i3 = bVarM3306a.f2523b) != 2) {
                        i = i3;
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z && z4 && i != 1) {
                        i = 2;
                    }
                    if (bVarM3306a != null && bVarM3306a.f2523b == 2 && i == 1 && length3 < bVarM3306a.f2525d) {
                        i = 3;
                    }
                    int i5 = i;
                    bVar = new b(1, i5, jM3302a2, length);
                    if (bVarM3306a != null || !bVarM3306a.equals(bVar)) {
                        try {
                            bVar.m3307b(file3);
                        } catch (IOException unused3) {
                            i5 = 196608;
                        }
                    }
                    return m3303b(i5, z3, z4, z2);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return m3303b(65536, z3, z4, z2);
                }
            }
            return m3303b(262144, false, false, z2);
            throw th;
        }
    }
}

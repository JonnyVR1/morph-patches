package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;
import p149l.dzd;
import p149l.ewa0;
import p149l.qkq0;
import p149l.wze;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C0546b {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final AssetManager f2504a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Executor f2505b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C0547c.c f2506c;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final File f2508e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final String f2509f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final String f2510g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final String f2511h;

    /* JADX INFO: renamed from: j */
    @Nullable
    public dzd[] f2513j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public byte[] f2514k;

    /* JADX INFO: renamed from: i */
    public boolean f2512i = false;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final byte[] f2507d = m3235d();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C0546b(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull C0547c.c cVar, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f2504a = assetManager;
        this.f2505b = executor;
        this.f2506c = cVar;
        this.f2509f = str;
        this.f2510g = str2;
        this.f2511h = str3;
        this.f2508e = file;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static byte[] m3235d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return ewa0.f93476a;
        }
        switch (i) {
            case 24:
            case 25:
                return ewa0.f93480e;
            case 26:
                return ewa0.f93479d;
            case 27:
                return ewa0.f93478c;
            case 28:
            case 29:
            case 30:
                return ewa0.f93477b;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3236j() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || i == 24 || i == 25;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C0546b m3237b(dzd[] dzdVarArr, byte[] bArr) {
        try {
            InputStream inputStreamM3241g = m3241g(this.f2504a, this.f2511h);
            if (inputStreamM3241g == null) {
                if (inputStreamM3241g != null) {
                    inputStreamM3241g.close();
                }
                return null;
            }
            try {
                this.f2513j = C0548d.m3292r(inputStreamM3241g, C0548d.m3290p(inputStreamM3241g, C0548d.f2518b), bArr, dzdVarArr);
                inputStreamM3241g.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamM3241g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            this.f2506c.mo3221a(9, e);
        } catch (IOException e2) {
            this.f2506c.mo3221a(7, e2);
        } catch (IllegalStateException e3) {
            this.f2513j = null;
            this.f2506c.mo3221a(8, e3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3238c() {
        if (this.f2512i) {
            return;
        }
        qkq0.m175383a("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: e */
    public boolean m3239e() {
        if (this.f2507d == null) {
            m3244k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        boolean zExists = this.f2508e.exists();
        File file = this.f2508e;
        if (!zExists) {
            try {
                if (!file.createNewFile()) {
                    m3244k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                m3244k(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            m3244k(4, null);
            return false;
        }
        this.f2512i = true;
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final InputStream m3240f(AssetManager assetManager) {
        try {
            return m3241g(assetManager, this.f2510g);
        } catch (FileNotFoundException e) {
            this.f2506c.mo3221a(6, e);
            return null;
        } catch (IOException e2) {
            this.f2506c.mo3221a(7, e2);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final InputStream m3241g(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2506c.mo3222b(5, null);
            }
            return null;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: h */
    public C0546b m3242h() {
        C0546b c0546bM3237b;
        m3238c();
        if (this.f2507d != null) {
            InputStream inputStreamM3240f = m3240f(this.f2504a);
            if (inputStreamM3240f != null) {
                this.f2513j = m3243i(inputStreamM3240f);
            }
            dzd[] dzdVarArr = this.f2513j;
            if (dzdVarArr != null && m3236j() && (c0546bM3237b = m3237b(dzdVarArr, this.f2507d)) != null) {
                return c0546bM3237b;
            }
        }
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final dzd[] m3243i(InputStream inputStream) {
        try {
            try {
                try {
                    dzd[] dzdVarArrM3298x = C0548d.m3298x(inputStream, C0548d.m3290p(inputStream, C0548d.f2517a), this.f2509f);
                    try {
                        inputStream.close();
                        return dzdVarArrM3298x;
                    } catch (IOException e) {
                        this.f2506c.mo3221a(7, e);
                        return dzdVarArrM3298x;
                    }
                } catch (IllegalStateException e2) {
                    this.f2506c.mo3221a(8, e2);
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        this.f2506c.mo3221a(7, e3);
                    }
                    return null;
                }
            } catch (IOException e4) {
                this.f2506c.mo3221a(7, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f2506c.mo3221a(7, e5);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3244k(final int i, @Nullable final Object obj) {
        this.f2505b.execute(new Runnable() { // from class: l.syd
            @Override // java.lang.Runnable
            public final void run() {
                this.f166937a.f2506c.mo3221a(i, obj);
            }
        });
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: l */
    public C0546b m3245l() {
        dzd[] dzdVarArr = this.f2513j;
        byte[] bArr = this.f2507d;
        if (dzdVarArr != null && bArr != null) {
            m3238c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    C0548d.m3263F(byteArrayOutputStream, bArr);
                    if (!C0548d.m3260C(byteArrayOutputStream, bArr, dzdVarArr)) {
                        this.f2506c.mo3221a(5, null);
                        this.f2513j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f2514k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f2513j = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.f2506c.mo3221a(7, e);
            } catch (IllegalStateException e2) {
                this.f2506c.mo3221a(8, e2);
            }
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: m */
    public boolean m3246m() {
        byte[] bArr = this.f2514k;
        if (bArr == null) {
            return false;
        }
        m3238c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f2508e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                wze.m206263l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                m3244k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f2514k = null;
                                this.f2513j = null;
                                return true;
                            } catch (Throwable th) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (FileNotFoundException e) {
                m3244k(6, e);
                this.f2514k = null;
                this.f2513j = null;
                return false;
            } catch (IOException e2) {
                m3244k(7, e2);
                this.f2514k = null;
                this.f2513j = null;
                return false;
            }
        } catch (Throwable th9) {
            this.f2514k = null;
            this.f2513j = null;
            throw th9;
        }
    }
}

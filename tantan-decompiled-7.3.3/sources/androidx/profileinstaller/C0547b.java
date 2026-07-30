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
import p153l.a1f;
import p153l.i4b0;
import p153l.r0e;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C0547b {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final AssetManager f2504a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Executor f2505b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C0548c.c f2506c;

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
    public r0e[] f2513j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public byte[] f2514k;

    /* JADX INFO: renamed from: i */
    public boolean f2512i = false;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final byte[] f2507d = m3236d();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C0547b(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull C0548c.c cVar, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
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
    public static byte[] m3236d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return i4b0.f112865a;
        }
        switch (i) {
            case 24:
            case 25:
                return i4b0.f112869e;
            case 26:
                return i4b0.f112868d;
            case 27:
                return i4b0.f112867c;
            case 28:
            case 29:
            case 30:
                return i4b0.f112866b;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3237j() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || i == 24 || i == 25;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C0547b m3238b(r0e[] r0eVarArr, byte[] bArr) {
        try {
            InputStream inputStreamM3242g = m3242g(this.f2504a, this.f2511h);
            if (inputStreamM3242g == null) {
                if (inputStreamM3242g != null) {
                    inputStreamM3242g.close();
                }
                return null;
            }
            try {
                this.f2513j = C0549d.m3293r(inputStreamM3242g, C0549d.m3291p(inputStreamM3242g, C0549d.f2518b), bArr, r0eVarArr);
                inputStreamM3242g.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamM3242g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            this.f2506c.mo3222a(9, e);
        } catch (IOException e2) {
            this.f2506c.mo3222a(7, e2);
        } catch (IllegalStateException e3) {
            this.f2513j = null;
            this.f2506c.mo3222a(8, e3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3239c() {
        if (this.f2512i) {
            return;
        }
        wtq0.m207906a("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: e */
    public boolean m3240e() {
        if (this.f2507d == null) {
            m3245k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        boolean zExists = this.f2508e.exists();
        File file = this.f2508e;
        if (!zExists) {
            try {
                if (!file.createNewFile()) {
                    m3245k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                m3245k(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            m3245k(4, null);
            return false;
        }
        this.f2512i = true;
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final InputStream m3241f(AssetManager assetManager) {
        try {
            return m3242g(assetManager, this.f2510g);
        } catch (FileNotFoundException e) {
            this.f2506c.mo3222a(6, e);
            return null;
        } catch (IOException e2) {
            this.f2506c.mo3222a(7, e2);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final InputStream m3242g(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2506c.mo3223b(5, null);
            }
            return null;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: h */
    public C0547b m3243h() {
        C0547b c0547bM3238b;
        m3239c();
        if (this.f2507d != null) {
            InputStream inputStreamM3241f = m3241f(this.f2504a);
            if (inputStreamM3241f != null) {
                this.f2513j = m3244i(inputStreamM3241f);
            }
            r0e[] r0eVarArr = this.f2513j;
            if (r0eVarArr != null && m3237j() && (c0547bM3238b = m3238b(r0eVarArr, this.f2507d)) != null) {
                return c0547bM3238b;
            }
        }
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final r0e[] m3244i(InputStream inputStream) {
        try {
            try {
                try {
                    r0e[] r0eVarArrM3299x = C0549d.m3299x(inputStream, C0549d.m3291p(inputStream, C0549d.f2517a), this.f2509f);
                    try {
                        inputStream.close();
                        return r0eVarArrM3299x;
                    } catch (IOException e) {
                        this.f2506c.mo3222a(7, e);
                        return r0eVarArrM3299x;
                    }
                } catch (IllegalStateException e2) {
                    this.f2506c.mo3222a(8, e2);
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        this.f2506c.mo3222a(7, e3);
                    }
                    return null;
                }
            } catch (IOException e4) {
                this.f2506c.mo3222a(7, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f2506c.mo3222a(7, e5);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3245k(final int i, @Nullable final Object obj) {
        this.f2505b.execute(new Runnable() { // from class: l.f0e
            @Override // java.lang.Runnable
            public final void run() {
                this.f96670a.f2506c.mo3222a(i, obj);
            }
        });
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: l */
    public C0547b m3246l() {
        r0e[] r0eVarArr = this.f2513j;
        byte[] bArr = this.f2507d;
        if (r0eVarArr != null && bArr != null) {
            m3239c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    C0549d.m3264F(byteArrayOutputStream, bArr);
                    if (!C0549d.m3261C(byteArrayOutputStream, bArr, r0eVarArr)) {
                        this.f2506c.mo3222a(5, null);
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
                this.f2506c.mo3222a(7, e);
            } catch (IllegalStateException e2) {
                this.f2506c.mo3222a(8, e2);
            }
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: m */
    public boolean m3247m() {
        byte[] bArr = this.f2514k;
        if (bArr == null) {
            return false;
        }
        m3239c();
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
                                a1f.m95495l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                m3245k(1, null);
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
                m3245k(6, e);
                this.f2514k = null;
                this.f2513j = null;
                return false;
            } catch (IOException e2) {
                m3245k(7, e2);
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

package p149l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfso;
import com.tencent.liteav.TXLiteAVCode;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class naw0 {

    /* JADX INFO: renamed from: g */
    public static final HashMap f137977g = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f137978a;

    /* JADX INFO: renamed from: b */
    public final oaw0 f137979b;

    /* JADX INFO: renamed from: c */
    public final p8w0 f137980c;

    /* JADX INFO: renamed from: d */
    public final k8w0 f137981d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public faw0 f137982e;

    /* JADX INFO: renamed from: f */
    public final Object f137983f = new Object();

    public naw0(@NonNull Context context, @NonNull oaw0 oaw0Var, @NonNull p8w0 p8w0Var, @NonNull k8w0 k8w0Var) {
        this.f137978a = context;
        this.f137979b = oaw0Var;
        this.f137980c = p8w0Var;
        this.f137981d = k8w0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final s8w0 m158721a() {
        faw0 faw0Var;
        synchronized (this.f137983f) {
            faw0Var = this.f137982e;
        }
        return faw0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final gaw0 m158722b() {
        synchronized (this.f137983f) {
            try {
                faw0 faw0Var = this.f137982e;
                if (faw0Var == null) {
                    return null;
                }
                return faw0Var.m120314f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m158723c(@NonNull gaw0 gaw0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                faw0 faw0Var = new faw0(m158724d(gaw0Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f137978a, "msa-r", gaw0Var.m125040e(), null, new Bundle(), 2), gaw0Var, this.f137979b, this.f137980c);
                if (!faw0Var.m120316h()) {
                    throw new zzfso(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, "init failed");
                }
                int iM120313e = faw0Var.m120313e();
                if (iM120313e != 0) {
                    throw new zzfso(4001, "ci: " + iM120313e);
                }
                synchronized (this.f137983f) {
                    faw0 faw0Var2 = this.f137982e;
                    if (faw0Var2 != null) {
                        try {
                            faw0Var2.m120315g();
                        } catch (zzfso e) {
                            this.f137980c.m167827c(e.zza(), -1L, e);
                        }
                        this.f137982e = faw0Var;
                    } else {
                        this.f137982e = faw0Var;
                    }
                    throw th;
                }
                this.f137980c.m167828d(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfso(2004, e2);
            }
        } catch (zzfso e3) {
            this.f137980c.m167827c(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.f137980c.m167827c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Class m158724d(@NonNull gaw0 gaw0Var) throws zzfso {
        try {
            String strM13369U = gaw0Var.m125036a().m13369U();
            HashMap map = f137977g;
            Class cls = (Class) map.get(strM13369U);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f137981d.m144979a(gaw0Var.m125038c())) {
                    throw new zzfso(TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY, "VM did not pass signature verification");
                }
                try {
                    File fileM125037b = gaw0Var.m125037b();
                    if (!fileM125037b.exists()) {
                        fileM125037b.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(gaw0Var.m125038c().getAbsolutePath(), fileM125037b.getAbsolutePath(), null, this.f137978a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strM13369U, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzfso(2008, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new zzfso(2008, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new zzfso(2008, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new zzfso(TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY, e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

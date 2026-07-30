package p153l;

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
public final class tjw0 {

    /* JADX INFO: renamed from: g */
    public static final HashMap f174620g = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f174621a;

    /* JADX INFO: renamed from: b */
    public final ujw0 f174622b;

    /* JADX INFO: renamed from: c */
    public final vhw0 f174623c;

    /* JADX INFO: renamed from: d */
    public final qhw0 f174624d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public ljw0 f174625e;

    /* JADX INFO: renamed from: f */
    public final Object f174626f = new Object();

    public tjw0(@NonNull Context context, @NonNull ujw0 ujw0Var, @NonNull vhw0 vhw0Var, @NonNull qhw0 qhw0Var) {
        this.f174621a = context;
        this.f174622b = ujw0Var;
        this.f174623c = vhw0Var;
        this.f174624d = qhw0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final yhw0 m191461a() {
        ljw0 ljw0Var;
        synchronized (this.f174626f) {
            ljw0Var = this.f174625e;
        }
        return ljw0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final mjw0 m191462b() {
        synchronized (this.f174626f) {
            try {
                ljw0 ljw0Var = this.f174625e;
                if (ljw0Var == null) {
                    return null;
                }
                return ljw0Var.m154588f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m191463c(@NonNull mjw0 mjw0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                ljw0 ljw0Var = new ljw0(m191464d(mjw0Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f174621a, "msa-r", mjw0Var.m158646e(), null, new Bundle(), 2), mjw0Var, this.f174622b, this.f174623c);
                if (!ljw0Var.m154590h()) {
                    throw new zzfso(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, "init failed");
                }
                int iM154587e = ljw0Var.m154587e();
                if (iM154587e != 0) {
                    throw new zzfso(4001, "ci: " + iM154587e);
                }
                synchronized (this.f174626f) {
                    ljw0 ljw0Var2 = this.f174625e;
                    if (ljw0Var2 != null) {
                        try {
                            ljw0Var2.m154589g();
                        } catch (zzfso e) {
                            this.f174623c.m201302c(e.zza(), -1L, e);
                        }
                        this.f174625e = ljw0Var;
                    } else {
                        this.f174625e = ljw0Var;
                    }
                    throw th;
                }
                this.f174623c.m201303d(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfso(2004, e2);
            }
        } catch (zzfso e3) {
            this.f174623c.m201302c(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.f174623c.m201302c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Class m191464d(@NonNull mjw0 mjw0Var) throws zzfso {
        try {
            String strM13423U = mjw0Var.m158642a().m13423U();
            HashMap map = f174620g;
            Class cls = (Class) map.get(strM13423U);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f174624d.m176621a(mjw0Var.m158644c())) {
                    throw new zzfso(TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY, "VM did not pass signature verification");
                }
                try {
                    File fileM158643b = mjw0Var.m158643b();
                    if (!fileM158643b.exists()) {
                        fileM158643b.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(mjw0Var.m158644c().getAbsolutePath(), fileM158643b.getAbsolutePath(), null, this.f174621a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strM13423U, clsLoadClass);
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

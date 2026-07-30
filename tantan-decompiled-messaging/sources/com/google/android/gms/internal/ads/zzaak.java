package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import p149l.c2r0;
import p149l.chv0;
import p149l.d2r0;
import p149l.f5v0;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
public final class zzaak extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final c2r0 zzd;
    private boolean zze;

    public /* synthetic */ zzaak(c2r0 c2r0Var, SurfaceTexture surfaceTexture, boolean z, d2r0 d2r0Var) {
        super(surfaceTexture);
        this.zzd = c2r0Var;
        this.zza = z;
    }

    /* JADX INFO: renamed from: a */
    public static zzaak m13534a(Context context, boolean z) {
        boolean z2 = true;
        if (z && !m13535b(context)) {
            z2 = false;
        }
        f5v0.m119535f(z2);
        return new c2r0().m104918a(z ? zzb : 0);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized boolean m13535b(Context context) {
        int i;
        try {
            if (!zzc) {
                if (chv0.m106994c(context)) {
                    i = chv0.m106995d() ? 1 : 2;
                } else {
                    i = 0;
                }
                zzb = i;
                zzc = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            try {
                if (!this.zze) {
                    this.zzd.m104919b();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

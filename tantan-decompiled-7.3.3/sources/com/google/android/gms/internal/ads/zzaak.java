package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import p153l.ibr0;
import p153l.iqv0;
import p153l.jbr0;
import p153l.lev0;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
public final class zzaak extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final ibr0 zzd;
    private boolean zze;

    public /* synthetic */ zzaak(ibr0 ibr0Var, SurfaceTexture surfaceTexture, boolean z, jbr0 jbr0Var) {
        super(surfaceTexture);
        this.zzd = ibr0Var;
        this.zza = z;
    }

    /* JADX INFO: renamed from: a */
    public static zzaak m13588a(Context context, boolean z) {
        boolean z2 = true;
        if (z && !m13589b(context)) {
            z2 = false;
        }
        lev0.m153958f(z2);
        return new ibr0().m139398a(z ? zzb : 0);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized boolean m13589b(Context context) {
        int i;
        try {
            if (!zzc) {
                if (iqv0.m141728c(context)) {
                    i = iqv0.m141729d() ? 1 : 2;
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
                    this.zzd.m139399b();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

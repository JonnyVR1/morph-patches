package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.C0761a;
import androidx.work.C0763c;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.common.annotation.KeepForSdk;
import p149l.gz5;
import p149l.lms0;
import p149l.s050;
import p149l.uyl;
import p149l.x2t0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class WorkManagerUtil extends lms0 {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    /* JADX INFO: renamed from: o8 */
    private static void m12284o8(Context context) {
        try {
            WorkManager.m4348i(context.getApplicationContext(), new C0761a.a().m4391a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // p149l.tns0
    public final void zze(@NonNull uyl uylVar) {
        Context context = (Context) s050.m181847P2(uylVar);
        m12284o8(context);
        try {
            WorkManager workManagerM4347h = WorkManager.m4347h(context);
            workManagerM4347h.mo4349a("offline_ping_sender_work");
            workManagerM4347h.m4351c(new C0763c.a(OfflinePingSender.class).m4441i(new gz5.C17205a().m128832b(NetworkType.CONNECTED).m128831a()).m4435a("offline_ping_sender_work").m4436b());
        } catch (IllegalStateException e) {
            x2t0.m206870h("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // p149l.tns0
    public final boolean zzf(@NonNull uyl uylVar, @NonNull String str, @NonNull String str2) {
        return zzg(uylVar, new zza(str, str2, ""));
    }

    @Override // p149l.tns0
    public final boolean zzg(uyl uylVar, zza zzaVar) {
        Context context = (Context) s050.m181847P2(uylVar);
        m12284o8(context);
        gz5 gz5VarM128831a = new gz5.C17205a().m128832b(NetworkType.CONNECTED).m128831a();
        try {
            WorkManager.m4347h(context).m4351c(new C0763c.a(OfflineNotificationPoster.class).m4441i(gz5VarM128831a).m4443k(new Data.C0753a().m4325f("uri", zzaVar.zza).m4325f("gws_query_id", zzaVar.zzb).m4325f("image_url", zzaVar.zzc).m4320a()).m4435a("offline_notification_work").m4436b());
            return true;
        } catch (IllegalStateException e) {
            x2t0.m206870h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}

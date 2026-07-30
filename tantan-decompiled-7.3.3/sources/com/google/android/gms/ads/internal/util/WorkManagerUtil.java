package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.C0763a;
import androidx.work.C0765c;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.common.annotation.KeepForSdk;
import p153l.dct0;
import p153l.h950;
import p153l.l06;
import p153l.p1m;
import p153l.rvs0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class WorkManagerUtil extends rvs0 {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    /* JADX INFO: renamed from: o8 */
    private static void m12338o8(Context context) {
        try {
            WorkManager.m4350i(context.getApplicationContext(), new C0763a.a().m4393a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // p153l.zws0
    public final void zze(@NonNull p1m p1mVar) {
        Context context = (Context) h950.m134037P2(p1mVar);
        m12338o8(context);
        try {
            WorkManager workManagerM4349h = WorkManager.m4349h(context);
            workManagerM4349h.mo4351a("offline_ping_sender_work");
            workManagerM4349h.m4353c(new C0765c.a(OfflinePingSender.class).m4443i(new l06.C18324a().m152319b(NetworkType.CONNECTED).m152318a()).m4437a("offline_ping_sender_work").m4438b());
        } catch (IllegalStateException e) {
            dct0.m115299h("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // p153l.zws0
    public final boolean zzf(@NonNull p1m p1mVar, @NonNull String str, @NonNull String str2) {
        return zzg(p1mVar, new zza(str, str2, ""));
    }

    @Override // p153l.zws0
    public final boolean zzg(p1m p1mVar, zza zzaVar) {
        Context context = (Context) h950.m134037P2(p1mVar);
        m12338o8(context);
        l06 l06VarM152318a = new l06.C18324a().m152319b(NetworkType.CONNECTED).m152318a();
        try {
            WorkManager.m4349h(context).m4353c(new C0765c.a(OfflineNotificationPoster.class).m4443i(l06VarM152318a).m4445k(new Data.C0755a().m4327f("uri", zzaVar.zza).m4327f("gws_query_id", zzaVar.zzb).m4327f("image_url", zzaVar.zzc).m4322a()).m4437a("offline_notification_work").m4438b());
            return true;
        } catch (IllegalStateException e) {
            dct0.m115299h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}

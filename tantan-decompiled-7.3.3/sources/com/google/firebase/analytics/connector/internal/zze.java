package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;
import p153l.ax0;

/* JADX INFO: loaded from: classes7.dex */
public final class zze implements zza {
    Set<String> zza;
    private AnalyticsConnector.AnalyticsConnectorListener zzb;
    private ax0 zzc;
    private zzd zzd;

    public zze(ax0 ax0Var, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = ax0Var;
        zzd zzdVar = new zzd(this);
        this.zzd = zzdVar;
        this.zzc.m100739q(zzdVar);
        this.zza = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zza(Set<String> set) {
        this.zza.clear();
        Set<String> set2 = this.zza;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            }
            if (zzb.zzc(str) && zzb.zzd(str)) {
                String strZzb = zzb.zzb(str);
                Preconditions.checkNotNull(strZzb);
                hashSet.add(strZzb);
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb() {
        this.zza.clear();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }
}

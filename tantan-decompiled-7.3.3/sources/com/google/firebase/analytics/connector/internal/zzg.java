package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;
import p153l.ax0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzg implements zza {
    private AnalyticsConnector.AnalyticsConnectorListener zza;
    private ax0 zzb;
    private zzf zzc;

    public zzg(ax0 ax0Var, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zza = analyticsConnectorListener;
        this.zzb = ax0Var;
        zzf zzfVar = new zzf(this);
        this.zzc = zzfVar;
        this.zzb.m100739q(zzfVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb() {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zza(Set<String> set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zza;
    }
}

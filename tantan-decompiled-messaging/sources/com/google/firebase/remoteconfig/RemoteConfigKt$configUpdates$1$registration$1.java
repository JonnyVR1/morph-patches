package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$registration$1;
import kotlin.Metadata;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import p149l.ad90;
import p149l.vr4;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m87232d2 = {"com/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "onError", "", "error", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "onUpdate", "configUpdate", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "com.google.firebase-firebase-config"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    final /* synthetic */ ad90<ConfigUpdate> $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, ad90<? super ConfigUpdate> ad90Var) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = ad90Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m16847a(ad90 ad90Var, ConfigUpdate configUpdate) {
        ad90Var.getClass();
        configUpdate.getClass();
        vr4.m199640w(ad90Var, configUpdate);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(@NotNull FirebaseRemoteConfigException error) {
        error.getClass();
        C15424f.m94056b(this.$$this$callbackFlow, "Error listening for config updates.", error);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(@NotNull final ConfigUpdate configUpdate) {
        configUpdate.getClass();
        FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
        final ad90<ConfigUpdate> ad90Var = this.$$this$callbackFlow;
        firebaseRemoteConfig.schedule(new Runnable() { // from class: l.aqc0
            @Override // java.lang.Runnable
            public final void run() {
                RemoteConfigKt$configUpdates$1$registration$1.m16847a(ad90Var, configUpdate);
            }
        });
    }
}

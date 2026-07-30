package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1$registration$1;
import kotlin.Metadata;
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import p153l.el90;
import p153l.us4;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m88121d2 = {"com/google/firebase/remoteconfig/ktx/RemoteConfigKt$configUpdates$1$registration$1", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "onError", "", "error", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "onUpdate", "configUpdate", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "com.google.firebase-firebase-config"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    final /* synthetic */ el90<ConfigUpdate> $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, el90<? super ConfigUpdate> el90Var) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = el90Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m16918a(el90 el90Var, ConfigUpdate configUpdate) {
        el90Var.getClass();
        configUpdate.getClass();
        us4.m197696w(el90Var, configUpdate);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(@NotNull FirebaseRemoteConfigException error) {
        error.getClass();
        C15531f.m94948b(this.$$this$callbackFlow, "Error listening for config updates.", error);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(@NotNull final ConfigUpdate configUpdate) {
        configUpdate.getClass();
        FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
        final el90<ConfigUpdate> el90Var = this.$$this$callbackFlow;
        firebaseRemoteConfig.schedule(new Runnable() { // from class: l.eyc0
            @Override // java.lang.Runnable
            public final void run() {
                RemoteConfigKt$configUpdates$1$registration$1.m16918a(el90Var, configUpdate);
            }
        });
    }
}

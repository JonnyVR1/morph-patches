package com.google.firebase.remoteconfig.internal.rollouts;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p149l.ng50;

/* JADX INFO: loaded from: classes7.dex */
public class RolloutsStateSubscriptionsHandler {
    private ConfigCacheClient activatedConfigsCache;
    private Executor executor;
    private RolloutsStateFactory rolloutsStateFactory;
    private Set<RolloutsStateSubscriber> subscribers = Collections.newSetFromMap(new ConcurrentHashMap());

    public RolloutsStateSubscriptionsHandler(@NonNull ConfigCacheClient configCacheClient, @NonNull RolloutsStateFactory rolloutsStateFactory, @NonNull Executor executor) {
        this.activatedConfigsCache = configCacheClient;
        this.rolloutsStateFactory = rolloutsStateFactory;
        this.executor = executor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16860a(RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler, Task task, final RolloutsStateSubscriber rolloutsStateSubscriber, ConfigContainer configContainer) {
        rolloutsStateSubscriptionsHandler.getClass();
        try {
            ConfigContainer configContainer2 = (ConfigContainer) task.mo15373l();
            if (configContainer2 != null) {
                final RolloutsState activeRolloutsState = rolloutsStateSubscriptionsHandler.rolloutsStateFactory.getActiveRolloutsState(configContainer2);
                rolloutsStateSubscriptionsHandler.executor.execute(new Runnable() { // from class: l.m5d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        rolloutsStateSubscriber.onRolloutsStateChanged(activeRolloutsState);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException unused) {
        }
    }

    public void publishActiveRolloutsState(@NonNull ConfigContainer configContainer) {
        try {
            final RolloutsState activeRolloutsState = this.rolloutsStateFactory.getActiveRolloutsState(configContainer);
            for (final RolloutsStateSubscriber rolloutsStateSubscriber : this.subscribers) {
                this.executor.execute(new Runnable() { // from class: l.n5d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        rolloutsStateSubscriber.onRolloutsStateChanged(activeRolloutsState);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException unused) {
        }
    }

    public void registerRolloutsStateSubscriber(@NonNull final RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.subscribers.add(rolloutsStateSubscriber);
        final Task<ConfigContainer> task = this.activatedConfigsCache.get();
        task.mo15366e(this.executor, new ng50() { // from class: l.l5d0
            @Override // p149l.ng50
            public final void onSuccess(Object obj) {
                RolloutsStateSubscriptionsHandler.m16860a(this.f126112a, task, rolloutsStateSubscriber, (ConfigContainer) obj);
            }
        });
    }
}

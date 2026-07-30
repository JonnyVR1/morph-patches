package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import p153l.f7f;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, m88121d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@Deprecated
@SourceDebugExtension
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        Component componentBuild = Component.builder(Qualified.qualified(Background.class, CoroutineDispatcher.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final CoroutineDispatcher create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Background.class, Executor.class));
                obj.getClass();
                return f7f.m124439b((Executor) obj);
            }
        }).build();
        componentBuild.getClass();
        Component componentBuild2 = Component.builder(Qualified.qualified(Lightweight.class, CoroutineDispatcher.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final CoroutineDispatcher create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
                obj.getClass();
                return f7f.m124439b((Executor) obj);
            }
        }).build();
        componentBuild2.getClass();
        Component componentBuild3 = Component.builder(Qualified.qualified(Blocking.class, CoroutineDispatcher.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final CoroutineDispatcher create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
                obj.getClass();
                return f7f.m124439b((Executor) obj);
            }
        }).build();
        componentBuild3.getClass();
        Component componentBuild4 = Component.builder(Qualified.qualified(UiThread.class, CoroutineDispatcher.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final CoroutineDispatcher create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(UiThread.class, Executor.class));
                obj.getClass();
                return f7f.m124439b((Executor) obj);
            }
        }).build();
        componentBuild4.getClass();
        return CollectionsKt.listOf((Object[]) new Component[]{componentBuild, componentBuild2, componentBuild3, componentBuild4});
    }
}

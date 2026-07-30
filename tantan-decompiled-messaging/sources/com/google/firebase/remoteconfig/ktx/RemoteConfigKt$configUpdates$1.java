package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ad90;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/ad90;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1", m87374f = "RemoteConfig.kt", m87375l = {119}, m87376m = "invokeSuspend")
public final class RemoteConfigKt$configUpdates$1 extends SuspendLambda implements Function2<ad90<? super ConfigUpdate>, Continuation<? super Unit>, Object> {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, Continuation<? super RemoteConfigKt$configUpdates$1> continuation) {
        super(2, continuation);
        this.$this_configUpdates = firebaseRemoteConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.$this_configUpdates, continuation);
        remoteConfigKt$configUpdates$1.L$0 = obj;
        return remoteConfigKt$configUpdates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ad90<? super ConfigUpdate> ad90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((RemoteConfigKt$configUpdates$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ad90 ad90Var = (ad90) this.L$0;
            FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
            final ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddOnConfigUpdateListener = firebaseRemoteConfig.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, ad90Var));
            configUpdateListenerRegistrationAddOnConfigUpdateListener.getClass();
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    configUpdateListenerRegistrationAddOnConfigUpdateListener.remove();
                }
            };
            this.label = 1;
            if (ProduceKt.m93979a(ad90Var, function0, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        return Unit.INSTANCE;
    }
}

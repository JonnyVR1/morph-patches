package com.google.firebase.sessions.settings;

import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fpd0;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m87232d2 = {"<anonymous>", "", fpd0.DEFAULT_FILE_NAME, "Landroidx/datastore/preferences/core/MutablePreferences;"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", m87374f = "SettingsCache.kt", m87375l = {}, m87376m = "invokeSuspend")
public final class SettingsCache$removeConfigs$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$removeConfigs$2(SettingsCache settingsCache, Continuation<? super SettingsCache$removeConfigs$2> continuation) {
        super(2, continuation);
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new SettingsCache$removeConfigs$2(this.this$0, continuation);
        settingsCache$removeConfigs$2.L$0 = obj;
        return settingsCache$removeConfigs$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull MutablePreferences mutablePreferences, @Nullable Continuation<? super Unit> continuation) {
        return ((SettingsCache$removeConfigs$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        mutablePreferences.m1482f();
        this.this$0.updateSessionConfigs(mutablePreferences);
        return Unit.INSTANCE;
    }
}

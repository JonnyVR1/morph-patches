package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "com.google.firebase.sessions.settings.SettingsCache", m87374f = "SettingsCache.kt", m87375l = {103}, m87376m = "removeConfigs$com_google_firebase_firebase_sessions")
public final class SettingsCache$removeConfigs$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$removeConfigs$1(SettingsCache settingsCache, Continuation<? super SettingsCache$removeConfigs$1> continuation) {
        super(continuation);
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}

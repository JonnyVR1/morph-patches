package com.google.firebase.sessions.settings;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m87232d2 = {"<anonymous>", "", Careers.f38732it, "Lorg/json/JSONObject;"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m87374f = "RemoteSettings.kt", m87375l = {125, 128, 131, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 134, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements Function2<JSONObject, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation<? super RemoteSettings$updateSettings$2$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull JSONObject jSONObject, @Nullable Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102 A[PHI: r0 r1
      0x0102: PHI (r0v9 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r0v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v11 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:44:0x00e5, B:46:0x00fe, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r1v12 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r1v7 kotlin.jvm.internal.Ref$ObjectRef)
      (r1v7 kotlin.jvm.internal.Ref$ObjectRef)
      (r1v16 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:44:0x00e5, B:46:0x00fe, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122 A[PHI: r0
      0x0122: PHI (r0v12 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r0v9 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v9 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v16 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:49:0x0106, B:51:0x011f, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013f, code lost:
    
        if (r12.updateSessionCacheDuration(r0, r11) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0180, code lost:
    
        if (r12.updateSessionCacheUpdatedTime(r0, r11) == r4) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

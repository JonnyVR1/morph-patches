package androidx.datastore.migrations;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.dwe0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {1, 5, 1}, m87236xi = 48)
@DebugMetadata(m87373c = "androidx.datastore.migrations.SharedPreferencesMigration", m87374f = "SharedPreferencesMigration.kt", m87375l = {CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA}, m87376m = "shouldMigrate")
final class SharedPreferencesMigration$shouldMigrate$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dwe0<Object> this$0;

    public SharedPreferencesMigration$shouldMigrate$1(dwe0<Object> dwe0Var, Continuation<? super SharedPreferencesMigration$shouldMigrate$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}

package androidx.datastore.migrations;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.k4f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {1, 5, 1}, m88125xi = 48)
@DebugMetadata(m88262c = "androidx.datastore.migrations.SharedPreferencesMigration", m88263f = "SharedPreferencesMigration.kt", m88264l = {CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA}, m88265m = "shouldMigrate")
final class SharedPreferencesMigration$shouldMigrate$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k4f0<Object> this$0;

    public SharedPreferencesMigration$shouldMigrate$1(k4f0<Object> k4f0Var, Continuation<? super SharedPreferencesMigration$shouldMigrate$1> continuation) {
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

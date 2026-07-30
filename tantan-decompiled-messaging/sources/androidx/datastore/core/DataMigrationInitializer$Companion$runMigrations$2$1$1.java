package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.r4c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE}, m87233k = 3, m87234mv = {1, 5, 1}, m87236xi = 48)
@DebugMetadata(m87373c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m87374f = "DataMigrationInitializer.kt", m87375l = {45}, m87376m = "invokeSuspend")
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ r4c<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(r4c<T> r4cVar, Continuation<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> continuation) {
        super(1, continuation);
        this.$migration = r4cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 for r3v3 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            kotlin.ResultKt.m87239b(r4)
            goto L24
        Lf:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r3)
            r3 = 0
            return r3
        L16:
            kotlin.ResultKt.m87239b(r4)
            l.r4c<T> r4 = r3.$migration
            r3.label = r2
            java.lang.Object r3 = r4.m177784b(r3)
            if (r3 != r0) goto L24
            return r0
        L24:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

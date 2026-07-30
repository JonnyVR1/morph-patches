package androidx.datastore.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.r4c;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, m87232d2 = {"<anonymous>", j6f.GPS_DIRECTION_TRUE, "startingData"}, m87233k = 3, m87234mv = {1, 5, 1}, m87236xi = 48)
@DebugMetadata(m87373c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m87374f = "DataMigrationInitializer.kt", m87375l = {44, 46}, m87376m = "invokeSuspend")
public final class DataMigrationInitializer$Companion$runMigrations$2<T> extends SuspendLambda implements Function2<T, Continuation<? super T>, Object> {
    final /* synthetic */ List<Function1<Continuation<? super Unit>, Object>> $cleanUps;
    final /* synthetic */ List<r4c<T>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends r4c<T>> list, List<Function1<Continuation<? super Unit>, Object>> list2, Continuation<? super DataMigrationInitializer$Companion$runMigrations$2> continuation) {
        super(2, continuation);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(T t, @Nullable Continuation<? super T> continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L36
            if (r1 == r3) goto L21
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r9.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r9.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.m87239b(r10)
            goto L45
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r9)
            return r4
        L21:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r5 = r9.L$2
            l.r4c r5 = (p149l.r4c) r5
            java.lang.Object r6 = r9.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r9.L$0
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.m87239b(r10)
            r8 = r7
            r7 = r5
            r5 = r8
            goto L67
        L36:
            kotlin.ResultKt.m87239b(r10)
            java.lang.Object r10 = r9.L$0
            java.util.List<l.r4c<T>> r1 = r9.$migrations
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> r5 = r9.$cleanUps
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L8c
            java.lang.Object r6 = r1.next()
            l.r4c r6 = (p149l.r4c) r6
            r9.L$0 = r5
            r9.L$1 = r1
            r9.L$2 = r6
            r9.L$3 = r10
            r9.label = r3
            java.lang.Object r7 = r6.m177783a(r10, r9)
            if (r7 != r0) goto L62
            goto L87
        L62:
            r8 = r1
            r1 = r10
            r10 = r7
            r7 = r6
            r6 = r8
        L67:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8a
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r10.<init>(r7, r4)
            r5.add(r10)
            r9.L$0 = r5
            r9.L$1 = r6
            r9.L$2 = r4
            r9.L$3 = r4
            r9.label = r2
            java.lang.Object r10 = r7.m177785c(r1, r9)
            if (r10 != r0) goto L88
        L87:
            return r0
        L88:
            r1 = r6
            goto L45
        L8a:
            r10 = r1
            goto L88
        L8c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

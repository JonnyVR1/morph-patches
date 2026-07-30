package androidx.room;

import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.fri;
import p149l.gr4;
import p149l.jh3;
import p149l.jri;
import p149l.or4;
import p149l.ppb;
import p149l.qkq0;
import p149l.qpb;
import p149l.uwp;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"R", "Ll/fri;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "<anonymous>", "(Ll/fri;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", m87374f = "CoroutinesRoom.kt", m87375l = {111}, m87376m = "invokeSuspend")
public final class CoroutinesRoom$Companion$createFlow$1<R> extends SuspendLambda implements Function2<fri<R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1 */
    @Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"R", "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
    @DebugMetadata(m87373c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", m87374f = "CoroutinesRoom.kt", m87375l = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA}, m87376m = "invokeSuspend")
    public static final class C06521 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ fri<R> $$this$flow;
        final /* synthetic */ Callable<R> $callable;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ String[] $tableNames;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"R", "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
        @DebugMetadata(m87373c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", m87374f = "CoroutinesRoom.kt", m87375l = {128, 130}, m87376m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
            final /* synthetic */ Callable<R> $callable;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ a $observer;
            final /* synthetic */ gr4<Unit> $observerChannel;
            final /* synthetic */ gr4<R> $resultChannel;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RoomDatabase roomDatabase, a aVar, gr4 gr4Var, Callable callable, gr4 gr4Var2, Continuation continuation) {
                super(2, continuation);
                this.$db = roomDatabase;
                this.$observer = aVar;
                this.$observerChannel = gr4Var;
                this.$callable = callable;
                this.$resultChannel = gr4Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0046  */
            /* JADX WARN: Code duplicated, block: B:21:0x0047  */
            /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:18:0x003c, B:22:0x004a, B:24:0x0052, B:14:0x0024, B:17:0x0036), top: B:31:0x0008 }] */
            /* JADX WARN: Code duplicated, block: B:27:0x0068  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
            
                if (r4.mo93787E(r7, r6) == r0) goto L26;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:8:0x0015). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    java.lang.Object r0 = p149l.uwp.m196133e()
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L28
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L19
                    java.lang.Object r1 = r6.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    kotlin.ResultKt.m87239b(r7)     // Catch: java.lang.Throwable -> L17
                L15:
                    r7 = r1
                    goto L3c
                L17:
                    r7 = move-exception
                    goto L76
                L19:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    p149l.qkq0.m175383a(r6)
                    r6 = 0
                    return r6
                L20:
                    java.lang.Object r1 = r6.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    kotlin.ResultKt.m87239b(r7)     // Catch: java.lang.Throwable -> L17
                    goto L4a
                L28:
                    kotlin.ResultKt.m87239b(r7)
                    androidx.room.RoomDatabase r7 = r6.$db
                    androidx.room.e r7 = r7.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r1 = r6.$observer
                    r7.m3944c(r1)
                    l.gr4<kotlin.Unit> r7 = r6.$observerChannel     // Catch: java.lang.Throwable -> L17
                    kotlinx.coroutines.channels.ChannelIterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L17
                L3c:
                    r6.L$0 = r7     // Catch: java.lang.Throwable -> L17
                    r6.label = r3     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r1 = r7.mo93915a(r6)     // Catch: java.lang.Throwable -> L17
                    if (r1 != r0) goto L47
                    goto L67
                L47:
                    r5 = r1
                    r1 = r7
                    r7 = r5
                L4a:
                    java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L17
                    boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L17
                    if (r7 == 0) goto L68
                    r1.next()     // Catch: java.lang.Throwable -> L17
                    java.util.concurrent.Callable<R> r7 = r6.$callable     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r7 = r7.call()     // Catch: java.lang.Throwable -> L17
                    l.gr4<R> r4 = r6.$resultChannel     // Catch: java.lang.Throwable -> L17
                    r6.L$0 = r1     // Catch: java.lang.Throwable -> L17
                    r6.label = r2     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r7 = r4.mo93787E(r7, r6)     // Catch: java.lang.Throwable -> L17
                    if (r7 != r0) goto L15
                L67:
                    return r0
                L68:
                    androidx.room.RoomDatabase r7 = r6.$db
                    androidx.room.e r7 = r7.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r6 = r6.$observer
                    r7.m3955n(r6)
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                L76:
                    androidx.room.RoomDatabase r0 = r6.$db
                    androidx.room.e r0 = r0.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r6 = r6.$observer
                    r0.m3955n(r6)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.C06521.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a */
        @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"androidx/room/CoroutinesRoom$Companion$createFlow$1$1$a", "Landroidx/room/e$c;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "room-ktx_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class a extends C0668e.c {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gr4<Unit> f2948b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String[] strArr, gr4<Unit> gr4Var) {
                super(strArr);
                this.f2948b = gr4Var;
            }

            @Override // androidx.room.C0668e.c
            /* JADX INFO: renamed from: c */
            public void mo3906c(@NotNull Set<String> tables) {
                this.f2948b.mo93791l(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06521(boolean z, RoomDatabase roomDatabase, fri<R> friVar, String[] strArr, Callable<R> callable, Continuation<? super C06521> continuation) {
            super(2, continuation);
            this.$inTransaction = z;
            this.$db = roomDatabase;
            this.$$this$flow = friVar;
            this.$tableNames = strArr;
            this.$callable = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C06521 c06521 = new C06521(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, continuation);
            c06521.L$0 = obj;
            return c06521;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C06521) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ContinuationInterceptor continuationInterceptorM175821b;
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = (ppb) this.L$0;
                gr4 gr4VarM165524c = or4.m165524c(-1, null, null, 6, null);
                a aVar = new a(this.$tableNames, gr4VarM165524c);
                gr4VarM165524c.mo93791l(Unit.INSTANCE);
                C0674k c0674k = (C0674k) ppbVar.getCoroutineContext().get(C0674k.INSTANCE);
                if (c0674k == null || (continuationInterceptorM175821b = c0674k.getTransactionDispatcher()) == null) {
                    boolean z = this.$inTransaction;
                    RoomDatabase roomDatabase = this.$db;
                    continuationInterceptorM175821b = z ? qpb.m175821b(roomDatabase) : qpb.m175820a(roomDatabase);
                }
                gr4 gr4VarM165524c2 = or4.m165524c(0, null, null, 7, null);
                jh3.m141367d(ppbVar, continuationInterceptorM175821b, null, new AnonymousClass1(this.$db, aVar, gr4VarM165524c, this.$callable, gr4VarM165524c2, null), 2, null);
                fri<R> friVar = this.$$this$flow;
                this.label = 1;
                if (jri.m142956o(friVar, gr4VarM165524c2, this) == objM196133e) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, Continuation<? super CoroutinesRoom$Companion$createFlow$1> continuation) {
        super(2, continuation);
        this.$inTransaction = z;
        this.$db = roomDatabase;
        this.$tableNames = strArr;
        this.$callable = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, continuation);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull fri<R> friVar, @Nullable Continuation<? super Unit> continuation) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(friVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            C06521 c06521 = new C06521(this.$inTransaction, this.$db, (fri) this.L$0, this.$tableNames, this.$callable, null);
            this.label = 1;
            if (C15424f.m94059e(c06521, this) == objM196133e) {
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

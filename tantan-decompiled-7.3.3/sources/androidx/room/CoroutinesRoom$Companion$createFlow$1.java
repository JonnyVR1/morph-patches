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
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.channels.ChannelIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.bui;
import p153l.drb;
import p153l.erb;
import p153l.fs4;
import p153l.fui;
import p153l.ns4;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"R", "Ll/bui;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "<anonymous>", "(Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", m88263f = "CoroutinesRoom.kt", m88264l = {111}, m88265m = "invokeSuspend")
public final class CoroutinesRoom$Companion$createFlow$1<R> extends SuspendLambda implements Function2<bui<R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1 */
    @Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"R", "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
    @DebugMetadata(m88262c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", m88263f = "CoroutinesRoom.kt", m88264l = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA}, m88265m = "invokeSuspend")
    public static final class C06541 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ bui<R> $$this$flow;
        final /* synthetic */ Callable<R> $callable;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ String[] $tableNames;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"R", "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
        @DebugMetadata(m88262c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", m88263f = "CoroutinesRoom.kt", m88264l = {128, 130}, m88265m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
            final /* synthetic */ Callable<R> $callable;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ a $observer;
            final /* synthetic */ fs4<Unit> $observerChannel;
            final /* synthetic */ fs4<R> $resultChannel;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RoomDatabase roomDatabase, a aVar, fs4 fs4Var, Callable callable, fs4 fs4Var2, Continuation continuation) {
                super(2, continuation);
                this.$db = roomDatabase;
                this.$observer = aVar;
                this.$observerChannel = fs4Var;
                this.$callable = callable;
                this.$resultChannel = fs4Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0046  */
            /* JADX WARN: Code duplicated, block: B:21:0x0047  */
            /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:18:0x003c, B:22:0x004a, B:24:0x0052, B:14:0x0024, B:17:0x0036), top: B:31:0x0008 }] */
            /* JADX WARN: Code duplicated, block: B:27:0x0068  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
            
                if (r4.mo94679E(r7, r6) == r0) goto L26;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:8:0x0015). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                ChannelIterator<Unit> it;
                ChannelIterator<Unit> channelIterator;
                Object objMo94807a;
                Object objM198688e = uyp.m198688e();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.m88128b(obj);
                        this.$db.getInvalidationTracker().m3946c(this.$observer);
                        it = this.$observerChannel.iterator();
                        this.L$0 = it;
                        this.label = 1;
                        objMo94807a = it.mo94807a(this);
                        if (objMo94807a == objM198688e) {
                            channelIterator = it;
                            obj = objMo94807a;
                            if (!((Boolean) obj).booleanValue()) {
                                this.$db.getInvalidationTracker().m3957n(this.$observer);
                                return Unit.INSTANCE;
                            }
                            channelIterator.next();
                            R rCall = this.$callable.call();
                            fs4<R> fs4Var = this.$resultChannel;
                            this.L$0 = channelIterator;
                            this.label = 2;
                        }
                        return objM198688e;
                    }
                    if (i == 1) {
                        channelIterator = (ChannelIterator) this.L$0;
                        ResultKt.m88128b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            this.$db.getInvalidationTracker().m3957n(this.$observer);
                            return Unit.INSTANCE;
                        }
                        channelIterator.next();
                        R rCall2 = this.$callable.call();
                        fs4<R> fs4Var2 = this.$resultChannel;
                        this.L$0 = channelIterator;
                        this.label = 2;
                    } else {
                        if (i != 2) {
                            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        channelIterator = (ChannelIterator) this.L$0;
                        ResultKt.m88128b(obj);
                    }
                    it = channelIterator;
                    this.L$0 = it;
                    this.label = 1;
                    objMo94807a = it.mo94807a(this);
                    if (objMo94807a == objM198688e) {
                        channelIterator = it;
                        obj = objMo94807a;
                        if (!((Boolean) obj).booleanValue()) {
                            this.$db.getInvalidationTracker().m3957n(this.$observer);
                            return Unit.INSTANCE;
                        }
                        channelIterator.next();
                        R rCall3 = this.$callable.call();
                        fs4<R> fs4Var3 = this.$resultChannel;
                        this.L$0 = channelIterator;
                        this.label = 2;
                    }
                    return objM198688e;
                } catch (Throwable th) {
                    this.$db.getInvalidationTracker().m3957n(this.$observer);
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a */
        @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"androidx/room/CoroutinesRoom$Companion$createFlow$1$1$a", "Landroidx/room/e$c;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "room-ktx_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class a extends C0670e.c {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ fs4<Unit> f2948b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String[] strArr, fs4<Unit> fs4Var) {
                super(strArr);
                this.f2948b = fs4Var;
            }

            @Override // androidx.room.C0670e.c
            /* JADX INFO: renamed from: c */
            public void mo3908c(@NotNull Set<String> tables) {
                this.f2948b.mo94683l(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06541(boolean z, RoomDatabase roomDatabase, bui<R> buiVar, String[] strArr, Callable<R> callable, Continuation<? super C06541> continuation) {
            super(2, continuation);
            this.$inTransaction = z;
            this.$db = roomDatabase;
            this.$$this$flow = buiVar;
            this.$tableNames = strArr;
            this.$callable = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C06541 c06541 = new C06541(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, continuation);
            c06541.L$0 = obj;
            return c06541;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C06541) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ContinuationInterceptor continuationInterceptorM122139b;
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                drb drbVar = (drb) this.L$0;
                fs4 fs4VarM164557c = ns4.m164557c(-1, null, null, 6, null);
                a aVar = new a(this.$tableNames, fs4VarM164557c);
                fs4VarM164557c.mo94683l(Unit.INSTANCE);
                C0676k c0676k = (C0676k) drbVar.getCoroutineContext().get(C0676k.INSTANCE);
                if (c0676k == null || (continuationInterceptorM122139b = c0676k.getTransactionDispatcher()) == null) {
                    boolean z = this.$inTransaction;
                    RoomDatabase roomDatabase = this.$db;
                    continuationInterceptorM122139b = z ? erb.m122139b(roomDatabase) : erb.m122138a(roomDatabase);
                }
                fs4 fs4VarM164557c2 = ns4.m164557c(0, null, null, 7, null);
                xh3.m210980d(drbVar, continuationInterceptorM122139b, null, new AnonymousClass1(this.$db, aVar, fs4VarM164557c, this.$callable, fs4VarM164557c2, null), 2, null);
                bui<R> buiVar = this.$$this$flow;
                this.label = 1;
                if (fui.m127491o(buiVar, fs4VarM164557c2, this) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
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
    public final Object invoke(@NotNull bui<R> buiVar, @Nullable Continuation<? super Unit> continuation) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            C06541 c06541 = new C06541(this.$inTransaction, this.$db, (bui) this.L$0, this.$tableNames, this.$callable, null);
            this.label = 1;
            if (C15531f.m94951e(c06541, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}

package com.clevertap.android.sdk.inapp.delay;

import androidx.annotation.WorkerThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.C15594p;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.axl;
import p153l.drb;
import p153l.fpq;
import p153l.ker;
import p153l.oa5;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 >2\u00020\u0001:\u0004*.,(B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u001e\u0010\u0011J\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b%\u0010\u0011J\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010)R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000208048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010=\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager;", "", "", "accountId", "Ll/axl;", "logger", "Ll/oa5;", "clock", "Ll/drb;", "scope", "Ll/ker;", "lifecycleOwner", "tagSuffix", "<init>", "(Ljava/lang/String;Ll/axl;Ll/oa5;Ll/drb;Ll/ker;Ljava/lang/String;)V", "", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "msg", "n", "(Ljava/lang/String;)V", "id", "", "delayInMs", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "callback", "Lkotlinx/coroutines/o;", "q", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/o;", "k", "", BLiveStormDanmakuGiftResourceType.f45292l, "()I", "", "m", "(Ljava/lang/String;)Z", "o", "p", "()V", "a", "Ljava/lang/String;", "b", "Ll/axl;", "c", "Ll/oa5;", Constants.INAPP_DATA_TAG, "Ll/drb;", "e", "Ll/ker;", "f", "TAG", "Ljava/util/concurrent/ConcurrentHashMap;", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "activeJobs", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$a;", "h", "cancelledJobs", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/Object;", "scheduleLock", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class InAppTimerManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final drb scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ker lifecycleOwner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, InterfaceC15593o> activeJobs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, C1248a> cancelledJobs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Object scheduleLock;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1", m88263f = "InAppTimerManager.kt", m88264l = {53}, m88265m = "invokeSuspend")
    public static final class C12471 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1$1, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
        @DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1$1", m88263f = "InAppTimerManager.kt", m88264l = {57, 60}, m88265m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InAppTimerManager this$0;

            /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
            @DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1$1$1", m88263f = "InAppTimerManager.kt", m88264l = {62}, m88265m = "invokeSuspend")
            public static final class C227801 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InAppTimerManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C227801(InAppTimerManager inAppTimerManager, Continuation<? super C227801> continuation) {
                    super(2, continuation);
                    this.this$0 = inAppTimerManager;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C227801 c227801 = new C227801(this.this$0, continuation);
                    c227801.L$0 = obj;
                    return c227801;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
                    return ((C227801) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM198688e = uyp.m198688e();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.m88128b(obj);
                        drb drbVar = (drb) this.L$0;
                        InAppTimerManager inAppTimerManager = this.this$0;
                        StringBuilder sb = new StringBuilder("process lifeCycleOwner: withContext block, ");
                        sb.append(drbVar.getCoroutineContext());
                        sb.append(", ");
                        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) drbVar.getCoroutineContext().get(InterfaceC15593o.INSTANCE);
                        sb.append(interfaceC15593o != null ? interfaceC15593o.getParent() : null);
                        sb.append('}');
                        inAppTimerManager.m6397n(sb.toString());
                        InAppTimerManager inAppTimerManager2 = this.this$0;
                        this.label = 1;
                        if (inAppTimerManager2.m6401o(this) == objM198688e) {
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
            public AnonymousClass1(InAppTimerManager inAppTimerManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = inAppTimerManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v2 */
            /* JADX WARN: Type inference failed for: r10v3, types: [l.drb] */
            /* JADX WARN: Type inference failed for: r10v8 */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l.drb] */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ?? r10;
                Object objM198688e = uyp.m198688e();
                ?? r1 = this.label;
                try {
                    if (r1 == 0) {
                        ResultKt.m88128b(obj);
                        drb drbVar = (drb) this.L$0;
                        InAppTimerManager inAppTimerManager = this.this$0;
                        StringBuilder sb = new StringBuilder("process lifeCycleOwner: started, ");
                        sb.append(drbVar.getCoroutineContext());
                        sb.append(", ");
                        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) drbVar.getCoroutineContext().get(InterfaceC15593o.INSTANCE);
                        sb.append(interfaceC15593o != null ? interfaceC15593o.getParent() : null);
                        sb.append('}');
                        inAppTimerManager.m6397n(sb.toString());
                        this.this$0.m6402p();
                        this.L$0 = drbVar;
                        this.label = 1;
                        r1 = drbVar;
                        if (DelayKt.m94501a(this) == objM198688e) {
                            return objM198688e;
                        }
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            drb drbVar2 = (drb) this.L$0;
                            ResultKt.m88128b(obj);
                            r10 = drbVar2;
                            C15531f.m94952f(r10);
                            return Unit.INSTANCE;
                        }
                        drb drbVar3 = (drb) this.L$0;
                        ResultKt.m88128b(obj);
                        r1 = drbVar3;
                    }
                    throw new KotlinNothingValueException();
                } catch (CancellationException unused) {
                    InAppTimerManager inAppTimerManager2 = this.this$0;
                    StringBuilder sb2 = new StringBuilder("process lifeCycleOwner: Stopped, ");
                    sb2.append(r1.getCoroutineContext());
                    sb2.append(", ");
                    InterfaceC15593o interfaceC15593o2 = (InterfaceC15593o) r1.getCoroutineContext().get(InterfaceC15593o.INSTANCE);
                    sb2.append(interfaceC15593o2 != null ? interfaceC15593o2.getParent() : null);
                    sb2.append('}');
                    inAppTimerManager2.m6397n(sb2.toString());
                    C15594p c15594p = C15594p.INSTANCE;
                    C227801 c227801 = new C227801(this.this$0, null);
                    this.L$0 = r1;
                    this.label = 2;
                    if (vh3.m201255g(c15594p, c227801, this) != objM198688e) {
                        r10 = r1;
                    }
                    return objM198688e;
                }
            }
        }

        public C12471(Continuation<? super C12471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12471 c12471 = InAppTimerManager.this.new C12471(continuation);
            c12471.L$0 = obj;
            return c12471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C12471) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                drb drbVar = (drb) this.L$0;
                InAppTimerManager inAppTimerManager = InAppTimerManager.this;
                StringBuilder sb = new StringBuilder("lifeCycleOwner scope launch, ");
                sb.append(drbVar.getCoroutineContext());
                sb.append(", ");
                InterfaceC15593o interfaceC15593o = (InterfaceC15593o) drbVar.getCoroutineContext().get(InterfaceC15593o.INSTANCE);
                sb.append(interfaceC15593o != null ? interfaceC15593o.getParent() : null);
                sb.append('}');
                inAppTimerManager.m6397n(sb.toString());
                ker kerVar = InAppTimerManager.this.lifecycleOwner;
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InAppTimerManager.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.m2999b(kerVar, state, anonymousClass1, this) == objM198688e) {
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

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$a */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$a;", "", "", "originalDelayInMs", "scheduledAt", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "callback", "<init>", "(JJLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C1248a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long originalDelayInMs;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long scheduledAt;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<AbstractC1251d, Unit> callback;

        /* JADX WARN: Multi-variable type inference failed */
        public C1248a(long j, long j2, @NotNull Function1<? super AbstractC1251d, Unit> function1) {
            function1.getClass();
            this.originalDelayInMs = j;
            this.scheduledAt = j2;
            this.callback = function1;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function1<AbstractC1251d, Unit> m6404a() {
            return this.callback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getOriginalDelayInMs() {
            return this.originalDelayInMs;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getScheduledAt() {
            return this.scheduledAt;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C1248a)) {
                return false;
            }
            C1248a c1248a = (C1248a) other;
            return this.originalDelayInMs == c1248a.originalDelayInMs && this.scheduledAt == c1248a.scheduledAt && Intrinsics.m88377d(this.callback, c1248a.callback);
        }

        public int hashCode() {
            return (((Long.hashCode(this.originalDelayInMs) * 31) + Long.hashCode(this.scheduledAt)) * 31) + this.callback.hashCode();
        }

        @NotNull
        public String toString() {
            return "CancelledJobData(originalDelayInMs=" + this.originalDelayInMs + ", scheduledAt=" + this.scheduledAt + ", callback=" + this.callback + ')';
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$c */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$c;", "", "", "id", "", "remainingTimeInMs", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "callback", "<init>", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "c", "()J", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C1250c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long remainingTimeInMs;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<AbstractC1251d, Unit> callback;

        /* JADX WARN: Multi-variable type inference failed */
        public C1250c(@NotNull String str, long j, @NotNull Function1<? super AbstractC1251d, Unit> function1) {
            str.getClass();
            function1.getClass();
            this.id = str;
            this.remainingTimeInMs = j;
            this.callback = function1;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function1<AbstractC1251d, Unit> m6407a() {
            return this.callback;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getRemainingTimeInMs() {
            return this.remainingTimeInMs;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C1250c)) {
                return false;
            }
            C1250c c1250c = (C1250c) other;
            return Intrinsics.m88377d(this.id, c1250c.id) && this.remainingTimeInMs == c1250c.remainingTimeInMs && Intrinsics.m88377d(this.callback, c1250c.callback);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Long.hashCode(this.remainingTimeInMs)) * 31) + this.callback.hashCode();
        }

        @NotNull
        public String toString() {
            return "RescheduleData(id=" + this.id + ", remainingTimeInMs=" + this.remainingTimeInMs + ", callback=" + this.callback + ')';
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$d */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "<init>", "()V", "a", "c", "b", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$a;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$b;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static abstract class AbstractC1251d {

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$d$a */
        @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$a;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "id", "", "scheduledAt", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "J", "getScheduledAt", "()J", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final /* data */ class a extends AbstractC1251d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final long scheduledAt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String str, long j) {
                super(null);
                str.getClass();
                this.id = str;
                this.scheduledAt = j;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return Intrinsics.m88377d(this.id, aVar.id) && this.scheduledAt == aVar.scheduledAt;
            }

            public int hashCode() {
                return (this.id.hashCode() * 31) + Long.hashCode(this.scheduledAt);
            }

            @NotNull
            public String toString() {
                return "Completed(id=" + this.id + ", scheduledAt=" + this.scheduledAt + ')';
            }
        }

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$d$b */
        @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$b;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final /* data */ class b extends AbstractC1251d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull String str) {
                super(null);
                str.getClass();
                this.id = str;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && Intrinsics.m88377d(this.id, ((b) other).id);
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            @NotNull
            public String toString() {
                return "Discarded(id=" + this.id + ')';
            }
        }

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$d$c */
        @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$c;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "id", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final /* data */ class c extends AbstractC1251d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull String str, @NotNull Exception exc) {
                super(null);
                str.getClass();
                exc.getClass();
                this.id = str;
                this.exception = exc;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Exception getException() {
                return this.exception;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return Intrinsics.m88377d(this.id, cVar.id) && Intrinsics.m88377d(this.exception, cVar.exception);
            }

            public int hashCode() {
                return (this.id.hashCode() * 31) + this.exception.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(id=" + this.id + ", exception=" + this.exception + ')';
            }
        }

        public /* synthetic */ AbstractC1251d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1251d() {
        }
    }

    public InAppTimerManager(@NotNull String str, @NotNull axl axlVar, @NotNull oa5 oa5Var, @NotNull drb drbVar, @NotNull ker kerVar, @NotNull String str2) {
        str.getClass();
        axlVar.getClass();
        oa5Var.getClass();
        drbVar.getClass();
        kerVar.getClass();
        str2.getClass();
        this.accountId = str;
        this.logger = axlVar;
        this.clock = oa5Var;
        this.scope = drbVar;
        this.lifecycleOwner = kerVar;
        this.TAG = "[InAppTimerManager:" + str2 + "]:";
        this.activeJobs = new ConcurrentHashMap<>();
        this.cancelledJobs = new ConcurrentHashMap<>();
        this.scheduleLock = new Object();
        xh3.m210980d(drbVar, null, null, new C12471(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m6396j(Continuation<? super Unit> continuation) throws Throwable {
        InAppTimerManager$cancelAllTimers$1 inAppTimerManager$cancelAllTimers$1;
        int size;
        Iterator it;
        if (continuation instanceof InAppTimerManager$cancelAllTimers$1) {
            inAppTimerManager$cancelAllTimers$1 = (InAppTimerManager$cancelAllTimers$1) continuation;
            int i = inAppTimerManager$cancelAllTimers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inAppTimerManager$cancelAllTimers$1.label = i - Integer.MIN_VALUE;
            } else {
                inAppTimerManager$cancelAllTimers$1 = new InAppTimerManager$cancelAllTimers$1(this, continuation);
            }
        } else {
            inAppTimerManager$cancelAllTimers$1 = new InAppTimerManager$cancelAllTimers$1(this, continuation);
        }
        Object obj = inAppTimerManager$cancelAllTimers$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = inAppTimerManager$cancelAllTimers$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            size = this.activeJobs.size();
            Collection<InterfaceC15593o> collectionValues = this.activeJobs.values();
            collectionValues.getClass();
            it = CollectionsKt.toList(collectionValues).iterator();
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = inAppTimerManager$cancelAllTimers$1.I$0;
            it = (Iterator) inAppTimerManager$cancelAllTimers$1.L$1;
            InAppTimerManager inAppTimerManager = (InAppTimerManager) inAppTimerManager$cancelAllTimers$1.L$0;
            ResultKt.m88128b(obj);
            size = i3;
            this = inAppTimerManager;
        }
        while (it.hasNext()) {
            InterfaceC15593o interfaceC15593o = (InterfaceC15593o) it.next();
            interfaceC15593o.getClass();
            inAppTimerManager$cancelAllTimers$1.L$0 = this;
            inAppTimerManager$cancelAllTimers$1.L$1 = it;
            inAppTimerManager$cancelAllTimers$1.I$0 = size;
            inAppTimerManager$cancelAllTimers$1.label = 1;
            if (fpq.m126706e(interfaceC15593o, inAppTimerManager$cancelAllTimers$1) == objM198688e) {
                return objM198688e;
            }
        }
        this.logger.verbose(this.accountId, this.TAG + " Cancelled " + size + " timers");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m6397n(String msg) {
        this.logger.verbose(this.accountId, this.TAG + " Running on: [" + Thread.currentThread().getName() + "] | " + msg);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m6398k(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        InAppTimerManager$cleanup$1 inAppTimerManager$cleanup$1;
        if (continuation instanceof InAppTimerManager$cleanup$1) {
            inAppTimerManager$cleanup$1 = (InAppTimerManager$cleanup$1) continuation;
            int i = inAppTimerManager$cleanup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inAppTimerManager$cleanup$1.label = i - Integer.MIN_VALUE;
            } else {
                inAppTimerManager$cleanup$1 = new InAppTimerManager$cleanup$1(this, continuation);
            }
        } else {
            inAppTimerManager$cleanup$1 = new InAppTimerManager$cleanup$1(this, continuation);
        }
        Object obj = inAppTimerManager$cleanup$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = inAppTimerManager$cleanup$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            this.logger.verbose(this.accountId, this.TAG + " cleaning up timer state");
            inAppTimerManager$cleanup$1.L$0 = this;
            inAppTimerManager$cleanup$1.label = 1;
            if (m6396j(inAppTimerManager$cleanup$1) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (InAppTimerManager) inAppTimerManager$cleanup$1.L$0;
            ResultKt.m88128b(obj);
        }
        this.activeJobs.clear();
        this.cancelledJobs.clear();
        this.logger.verbose(this.accountId, this.TAG + " cleanup complete");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final int m6399l() {
        return this.activeJobs.size();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6400m(@NotNull String id) {
        id.getClass();
        InterfaceC15593o interfaceC15593o = this.activeJobs.get(id);
        if (interfaceC15593o != null) {
            return interfaceC15593o.mo94581k();
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m6401o(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objM6396j = m6396j(continuation);
        return objM6396j == uyp.m198688e() ? objM6396j : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public final void m6402p() {
        Function1<AbstractC1251d, Unit> function1M6404a;
        this.logger.verbose(this.accountId, this.TAG + " Handling foreground - rescheduling cancelled timers");
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        ArrayList<C1250c> arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Map.Entry<String, C1248a> entry : this.cancelledJobs.entrySet()) {
            String key = entry.getKey();
            C1248a value = entry.getValue();
            long originalDelayInMs = value.getOriginalDelayInMs();
            long scheduledAt = jCurrentTimeMillis - value.getScheduledAt();
            long j = originalDelayInMs - scheduledAt;
            long j2 = jCurrentTimeMillis;
            this.logger.verbose(this.accountId, this.TAG + " Id " + key + " - Original delay: " + originalDelayInMs + "ms, Elapsed: " + scheduledAt + "ms, Remaining: " + j + "ms");
            if (j > 0) {
                arrayList.add(new C1250c(key, j, value.m6404a()));
            } else {
                arrayList2.add(key);
            }
            jCurrentTimeMillis = j2;
        }
        int i = 0;
        int i2 = 0;
        for (C1250c c1250c : arrayList) {
            m6403q(c1250c.getId(), c1250c.getRemainingTimeInMs(), c1250c.m6407a());
            i2++;
            this.logger.verbose(this.accountId, this.TAG + " Rescheduled " + c1250c.getId() + " with " + c1250c.getRemainingTimeInMs() + "ms remaining");
        }
        for (String str : arrayList2) {
            C1248a c1248aRemove = this.cancelledJobs.remove(str);
            i++;
            if (c1248aRemove != null && (function1M6404a = c1248aRemove.m6404a()) != null) {
                function1M6404a.invoke(new AbstractC1251d.b(str));
            }
            this.logger.verbose(this.accountId, this.TAG + " Discarded expired timer: " + str);
        }
        this.logger.verbose(this.accountId, this.TAG + " Foreground handling complete - Rescheduled: " + i2 + ", Discarded: " + i);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: q */
    public final InterfaceC15593o m6403q(@NotNull String id, long delayInMs, @NotNull Function1<? super AbstractC1251d, Unit> callback) {
        id.getClass();
        callback.getClass();
        synchronized (this.scheduleLock) {
            InterfaceC15593o interfaceC15593o = this.activeJobs.get(id);
            if (interfaceC15593o != null) {
                if (!interfaceC15593o.mo94581k()) {
                    interfaceC15593o = null;
                }
                if (interfaceC15593o != null) {
                    this.logger.verbose(this.accountId, this.TAG + " Timer with id'" + id + "' already scheduled, keeping existing");
                    return interfaceC15593o;
                }
            }
            InterfaceC15593o interfaceC15593oM210980d = xh3.m210980d(this.scope, null, null, new InAppTimerManager$scheduleTimer$1$3(this, delayInMs, callback, id, null), 3, null);
            this.activeJobs.put(id, interfaceC15593oM210980d);
            this.logger.verbose(this.accountId, this.TAG + " Scheduled timer with id '" + id + "' for " + delayInMs + "ms delay");
            return interfaceC15593oM210980d;
        }
    }
}

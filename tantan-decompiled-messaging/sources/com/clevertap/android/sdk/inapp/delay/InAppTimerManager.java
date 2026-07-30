package com.clevertap.android.sdk.inapp.delay;

import androidx.annotation.WorkerThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.C15487p;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gnq;
import p149l.hh3;
import p149l.jcr;
import p149l.jh3;
import p149l.n95;
import p149l.nul;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 >2\u00020\u0001:\u0004*.,(B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u001e\u0010\u0011J\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b%\u0010\u0011J\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010)R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000208048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010=\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager;", "", "", "accountId", "Ll/nul;", "logger", "Ll/n95;", "clock", "Ll/ppb;", "scope", "Ll/jcr;", "lifecycleOwner", "tagSuffix", "<init>", "(Ljava/lang/String;Ll/nul;Ll/n95;Ll/ppb;Ll/jcr;Ljava/lang/String;)V", "", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "msg", "n", "(Ljava/lang/String;)V", "id", "", "delayInMs", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "callback", "Lkotlinx/coroutines/o;", "q", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/o;", "k", "", BLiveStormDanmakuGiftResourceType.f44444l, "()I", "", "m", "(Ljava/lang/String;)Z", "o", "p", "()V", "a", "Ljava/lang/String;", "b", "Ll/nul;", "c", "Ll/n95;", Constants.INAPP_DATA_TAG, "Ll/ppb;", "e", "Ll/jcr;", "f", "TAG", "Ljava/util/concurrent/ConcurrentHashMap;", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "activeJobs", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$a;", "h", "cancelledJobs", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/Object;", "scheduleLock", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class InAppTimerManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ppb scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final jcr lifecycleOwner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, InterfaceC15486o> activeJobs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, C1225a> cancelledJobs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Object scheduleLock;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1", m87374f = "InAppTimerManager.kt", m87375l = {53}, m87376m = "invokeSuspend")
    public static final class C12241 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1$1, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
        @DebugMetadata(m87373c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1$1", m87374f = "InAppTimerManager.kt", m87375l = {57, 60}, m87376m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InAppTimerManager this$0;

            /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
            @DebugMetadata(m87373c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager$1$1$1", m87374f = "InAppTimerManager.kt", m87375l = {62}, m87376m = "invokeSuspend")
            public static final class C226641 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InAppTimerManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C226641(InAppTimerManager inAppTimerManager, Continuation<? super C226641> continuation) {
                    super(2, continuation);
                    this.this$0 = inAppTimerManager;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C226641 c226641 = new C226641(this.this$0, continuation);
                    c226641.L$0 = obj;
                    return c226641;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
                    return ((C226641) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM196133e = uwp.m196133e();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.m87239b(obj);
                        ppb ppbVar = (ppb) this.L$0;
                        InAppTimerManager inAppTimerManager = this.this$0;
                        StringBuilder sb = new StringBuilder("process lifeCycleOwner: withContext block, ");
                        sb.append(ppbVar.getCoroutineContext());
                        sb.append(", ");
                        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) ppbVar.getCoroutineContext().get(InterfaceC15486o.INSTANCE);
                        sb.append(interfaceC15486o != null ? interfaceC15486o.getParent() : null);
                        sb.append('}');
                        inAppTimerManager.m6343n(sb.toString());
                        InAppTimerManager inAppTimerManager2 = this.this$0;
                        this.label = 1;
                        if (inAppTimerManager2.m6347o(this) == objM196133e) {
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
            public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v2 */
            /* JADX WARN: Type inference failed for: r10v3, types: [l.ppb] */
            /* JADX WARN: Type inference failed for: r10v8 */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l.ppb] */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ?? r10;
                Object objM196133e = uwp.m196133e();
                ?? r1 = this.label;
                try {
                    if (r1 == 0) {
                        ResultKt.m87239b(obj);
                        ppb ppbVar = (ppb) this.L$0;
                        InAppTimerManager inAppTimerManager = this.this$0;
                        StringBuilder sb = new StringBuilder("process lifeCycleOwner: started, ");
                        sb.append(ppbVar.getCoroutineContext());
                        sb.append(", ");
                        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) ppbVar.getCoroutineContext().get(InterfaceC15486o.INSTANCE);
                        sb.append(interfaceC15486o != null ? interfaceC15486o.getParent() : null);
                        sb.append('}');
                        inAppTimerManager.m6343n(sb.toString());
                        this.this$0.m6348p();
                        this.L$0 = ppbVar;
                        this.label = 1;
                        r1 = ppbVar;
                        if (DelayKt.m93610a(this) == objM196133e) {
                            return objM196133e;
                        }
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ppb ppbVar2 = (ppb) this.L$0;
                            ResultKt.m87239b(obj);
                            r10 = ppbVar2;
                            C15424f.m94060f(r10);
                            return Unit.INSTANCE;
                        }
                        ppb ppbVar3 = (ppb) this.L$0;
                        ResultKt.m87239b(obj);
                        r1 = ppbVar3;
                    }
                    throw new KotlinNothingValueException();
                } catch (CancellationException unused) {
                    InAppTimerManager inAppTimerManager2 = this.this$0;
                    StringBuilder sb2 = new StringBuilder("process lifeCycleOwner: Stopped, ");
                    sb2.append(r1.getCoroutineContext());
                    sb2.append(", ");
                    InterfaceC15486o interfaceC15486o2 = (InterfaceC15486o) r1.getCoroutineContext().get(InterfaceC15486o.INSTANCE);
                    sb2.append(interfaceC15486o2 != null ? interfaceC15486o2.getParent() : null);
                    sb2.append('}');
                    inAppTimerManager2.m6343n(sb2.toString());
                    C15487p c15487p = C15487p.INSTANCE;
                    C226641 c226641 = new C226641(this.this$0, null);
                    this.L$0 = r1;
                    this.label = 2;
                    if (hh3.m130938g(c15487p, c226641, this) != objM196133e) {
                        r10 = r1;
                    }
                    return objM196133e;
                }
            }
        }

        public C12241(Continuation<? super C12241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12241 c12241 = InAppTimerManager.this.new C12241(continuation);
            c12241.L$0 = obj;
            return c12241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C12241) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = (ppb) this.L$0;
                InAppTimerManager inAppTimerManager = InAppTimerManager.this;
                StringBuilder sb = new StringBuilder("lifeCycleOwner scope launch, ");
                sb.append(ppbVar.getCoroutineContext());
                sb.append(", ");
                InterfaceC15486o interfaceC15486o = (InterfaceC15486o) ppbVar.getCoroutineContext().get(InterfaceC15486o.INSTANCE);
                sb.append(interfaceC15486o != null ? interfaceC15486o.getParent() : null);
                sb.append('}');
                inAppTimerManager.m6343n(sb.toString());
                jcr jcrVar = InAppTimerManager.this.lifecycleOwner;
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InAppTimerManager.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.m2998b(jcrVar, state, anonymousClass1, this) == objM196133e) {
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

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$a */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$a;", "", "", "originalDelayInMs", "scheduledAt", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "callback", "<init>", "(JJLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C1225a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long originalDelayInMs;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long scheduledAt;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<AbstractC1228d, Unit> callback;

        /* JADX WARN: Multi-variable type inference failed */
        public C1225a(long j, long j2, @NotNull Function1<? super AbstractC1228d, Unit> function1) {
            function1.getClass();
            this.originalDelayInMs = j;
            this.scheduledAt = j2;
            this.callback = function1;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function1<AbstractC1228d, Unit> m6350a() {
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
            if (!(other instanceof C1225a)) {
                return false;
            }
            C1225a c1225a = (C1225a) other;
            return this.originalDelayInMs == c1225a.originalDelayInMs && this.scheduledAt == c1225a.scheduledAt && Intrinsics.m87488d(this.callback, c1225a.callback);
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
    @Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$c;", "", "", "id", "", "remainingTimeInMs", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "callback", "<init>", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "c", "()J", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C1227c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long remainingTimeInMs;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<AbstractC1228d, Unit> callback;

        /* JADX WARN: Multi-variable type inference failed */
        public C1227c(@NotNull String str, long j, @NotNull Function1<? super AbstractC1228d, Unit> function1) {
            str.getClass();
            function1.getClass();
            this.id = str;
            this.remainingTimeInMs = j;
            this.callback = function1;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function1<AbstractC1228d, Unit> m6353a() {
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
            if (!(other instanceof C1227c)) {
                return false;
            }
            C1227c c1227c = (C1227c) other;
            return Intrinsics.m87488d(this.id, c1227c.id) && this.remainingTimeInMs == c1227c.remainingTimeInMs && Intrinsics.m87488d(this.callback, c1227c.callback);
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
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "<init>", "()V", "a", "c", "b", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$a;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$b;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$c;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static abstract class AbstractC1228d {

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.delay.InAppTimerManager$d$a */
        @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$a;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "id", "", "scheduledAt", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "J", "getScheduledAt", "()J", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final /* data */ class a extends AbstractC1228d {

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
                return Intrinsics.m87488d(this.id, aVar.id) && this.scheduledAt == aVar.scheduledAt;
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
        @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$b;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final /* data */ class b extends AbstractC1228d {

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
                return (other instanceof b) && Intrinsics.m87488d(this.id, ((b) other).id);
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
        @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d$c;", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager$d;", "", "id", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final /* data */ class c extends AbstractC1228d {

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
                return Intrinsics.m87488d(this.id, cVar.id) && Intrinsics.m87488d(this.exception, cVar.exception);
            }

            public int hashCode() {
                return (this.id.hashCode() * 31) + this.exception.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(id=" + this.id + ", exception=" + this.exception + ')';
            }
        }

        public /* synthetic */ AbstractC1228d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1228d() {
        }
    }

    public InAppTimerManager(@NotNull String str, @NotNull nul nulVar, @NotNull n95 n95Var, @NotNull ppb ppbVar, @NotNull jcr jcrVar, @NotNull String str2) {
        str.getClass();
        nulVar.getClass();
        n95Var.getClass();
        ppbVar.getClass();
        jcrVar.getClass();
        str2.getClass();
        this.accountId = str;
        this.logger = nulVar;
        this.clock = n95Var;
        this.scope = ppbVar;
        this.lifecycleOwner = jcrVar;
        this.TAG = "[InAppTimerManager:" + str2 + "]:";
        this.activeJobs = new ConcurrentHashMap<>();
        this.cancelledJobs = new ConcurrentHashMap<>();
        this.scheduleLock = new Object();
        jh3.m141367d(ppbVar, null, null, new C12241(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m6342j(Continuation<? super Unit> continuation) throws Throwable {
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
        Object objM196133e = uwp.m196133e();
        int i2 = inAppTimerManager$cancelAllTimers$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            size = this.activeJobs.size();
            Collection<InterfaceC15486o> collectionValues = this.activeJobs.values();
            collectionValues.getClass();
            it = CollectionsKt.toList(collectionValues).iterator();
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = inAppTimerManager$cancelAllTimers$1.I$0;
            it = (Iterator) inAppTimerManager$cancelAllTimers$1.L$1;
            InAppTimerManager inAppTimerManager = (InAppTimerManager) inAppTimerManager$cancelAllTimers$1.L$0;
            ResultKt.m87239b(obj);
            size = i3;
            this = inAppTimerManager;
        }
        while (it.hasNext()) {
            InterfaceC15486o interfaceC15486o = (InterfaceC15486o) it.next();
            interfaceC15486o.getClass();
            inAppTimerManager$cancelAllTimers$1.L$0 = this;
            inAppTimerManager$cancelAllTimers$1.L$1 = it;
            inAppTimerManager$cancelAllTimers$1.I$0 = size;
            inAppTimerManager$cancelAllTimers$1.label = 1;
            if (gnq.m127164e(interfaceC15486o, inAppTimerManager$cancelAllTimers$1) == objM196133e) {
                return objM196133e;
            }
        }
        this.logger.verbose(this.accountId, this.TAG + " Cancelled " + size + " timers");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m6343n(String msg) {
        this.logger.verbose(this.accountId, this.TAG + " Running on: [" + Thread.currentThread().getName() + "] | " + msg);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m6344k(@NotNull Continuation<? super Unit> continuation) throws Throwable {
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
        Object objM196133e = uwp.m196133e();
        int i2 = inAppTimerManager$cleanup$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            this.logger.verbose(this.accountId, this.TAG + " cleaning up timer state");
            inAppTimerManager$cleanup$1.L$0 = this;
            inAppTimerManager$cleanup$1.label = 1;
            if (m6342j(inAppTimerManager$cleanup$1) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (InAppTimerManager) inAppTimerManager$cleanup$1.L$0;
            ResultKt.m87239b(obj);
        }
        this.activeJobs.clear();
        this.cancelledJobs.clear();
        this.logger.verbose(this.accountId, this.TAG + " cleanup complete");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final int m6345l() {
        return this.activeJobs.size();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6346m(@NotNull String id) {
        id.getClass();
        InterfaceC15486o interfaceC15486o = this.activeJobs.get(id);
        if (interfaceC15486o != null) {
            return interfaceC15486o.mo93690k();
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m6347o(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objM6342j = m6342j(continuation);
        return objM6342j == uwp.m196133e() ? objM6342j : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public final void m6348p() {
        Function1<AbstractC1228d, Unit> function1M6350a;
        this.logger.verbose(this.accountId, this.TAG + " Handling foreground - rescheduling cancelled timers");
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        ArrayList<C1227c> arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Map.Entry<String, C1225a> entry : this.cancelledJobs.entrySet()) {
            String key = entry.getKey();
            C1225a value = entry.getValue();
            long originalDelayInMs = value.getOriginalDelayInMs();
            long scheduledAt = jCurrentTimeMillis - value.getScheduledAt();
            long j = originalDelayInMs - scheduledAt;
            long j2 = jCurrentTimeMillis;
            this.logger.verbose(this.accountId, this.TAG + " Id " + key + " - Original delay: " + originalDelayInMs + "ms, Elapsed: " + scheduledAt + "ms, Remaining: " + j + "ms");
            if (j > 0) {
                arrayList.add(new C1227c(key, j, value.m6350a()));
            } else {
                arrayList2.add(key);
            }
            jCurrentTimeMillis = j2;
        }
        int i = 0;
        int i2 = 0;
        for (C1227c c1227c : arrayList) {
            m6349q(c1227c.getId(), c1227c.getRemainingTimeInMs(), c1227c.m6353a());
            i2++;
            this.logger.verbose(this.accountId, this.TAG + " Rescheduled " + c1227c.getId() + " with " + c1227c.getRemainingTimeInMs() + "ms remaining");
        }
        for (String str : arrayList2) {
            C1225a c1225aRemove = this.cancelledJobs.remove(str);
            i++;
            if (c1225aRemove != null && (function1M6350a = c1225aRemove.m6350a()) != null) {
                function1M6350a.invoke(new AbstractC1228d.b(str));
            }
            this.logger.verbose(this.accountId, this.TAG + " Discarded expired timer: " + str);
        }
        this.logger.verbose(this.accountId, this.TAG + " Foreground handling complete - Rescheduled: " + i2 + ", Discarded: " + i);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: q */
    public final InterfaceC15486o m6349q(@NotNull String id, long delayInMs, @NotNull Function1<? super AbstractC1228d, Unit> callback) {
        id.getClass();
        callback.getClass();
        synchronized (this.scheduleLock) {
            InterfaceC15486o interfaceC15486o = this.activeJobs.get(id);
            if (interfaceC15486o != null) {
                if (!interfaceC15486o.mo93690k()) {
                    interfaceC15486o = null;
                }
                if (interfaceC15486o != null) {
                    this.logger.verbose(this.accountId, this.TAG + " Timer with id'" + id + "' already scheduled, keeping existing");
                    return interfaceC15486o;
                }
            }
            InterfaceC15486o interfaceC15486oM141367d = jh3.m141367d(this.scope, null, null, new InAppTimerManager$scheduleTimer$1$3(this, delayInMs, callback, id, null), 3, null);
            this.activeJobs.put(id, interfaceC15486oM141367d);
            this.logger.verbose(this.accountId, this.TAG + " Scheduled timer with id '" + id + "' for " + delayInMs + "ms delay");
            return interfaceC15486oM141367d;
        }
    }
}

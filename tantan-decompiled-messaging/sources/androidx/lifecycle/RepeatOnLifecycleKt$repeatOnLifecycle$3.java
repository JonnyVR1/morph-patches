package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.sync.MutexKt;
import org.spongycastle.asn1.eac.EACTags;
import p149l.bf4;
import p149l.d4e;
import p149l.hh3;
import p149l.hpw;
import p149l.jcr;
import p149l.jh3;
import p149l.ot10;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m87374f = "RepeatOnLifecycle.kt", m87375l = {EACTags.DISCRETIONARY_DATA}, m87376m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<ppb, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m87374f = "RepeatOnLifecycle.kt", m87375l = {161}, m87376m = "invokeSuspend")
    @SourceDebugExtension
    public static final class C04651 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ ppb $$this$coroutineScope;
        final /* synthetic */ Function2<ppb, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04651(Lifecycle lifecycle, Lifecycle.State state, ppb ppbVar, Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04651> continuation) {
            super(2, continuation);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = ppbVar;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04651(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C04651) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Throwable th;
            Ref.ObjectRef objectRef2;
            InterfaceC15486o interfaceC15486o;
            LifecycleEventObserver lifecycleEventObserver;
            InterfaceC15486o interfaceC15486o2;
            LifecycleEventObserver lifecycleEventObserver2;
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                objectRef = (Ref.ObjectRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                try {
                    ResultKt.m87239b(obj);
                    interfaceC15486o2 = (InterfaceC15486o) objectRef2.element;
                    if (interfaceC15486o2 != null) {
                        InterfaceC15486o.a.m94245a(interfaceC15486o2, null, 1, null);
                    }
                    lifecycleEventObserver2 = (LifecycleEventObserver) objectRef.element;
                    if (lifecycleEventObserver2 != null) {
                        this.$this_repeatOnLifecycle.mo2969d(lifecycleEventObserver2);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC15486o = (InterfaceC15486o) objectRef2.element;
                    if (interfaceC15486o != null) {
                        InterfaceC15486o.a.m94245a(interfaceC15486o, null, 1, null);
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) objectRef.element;
                    if (lifecycleEventObserver != null) {
                        throw th;
                    }
                    this.$this_repeatOnLifecycle.mo2969d(lifecycleEventObserver);
                    throw th;
                }
            }
            ResultKt.m87239b(obj);
            if (this.$this_repeatOnLifecycle.getState() == Lifecycle.State.DESTROYED) {
                return Unit.INSTANCE;
            }
            final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef = new Ref.ObjectRef();
            try {
                Lifecycle.State state = this.$state;
                Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                final ppb ppbVar = this.$$this$coroutineScope;
                final Function2<ppb, Continuation<? super Unit>, Object> function2 = this.$block;
                this.L$0 = objectRef3;
                this.L$1 = objectRef;
                this.L$2 = state;
                this.L$3 = lifecycle;
                this.L$4 = ppbVar;
                this.L$5 = function2;
                this.label = 1;
                final C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(this), 1);
                c15407c.m93745G();
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                final Lifecycle.Event eventM2973d = companion.m2973d(state);
                final Lifecycle.Event eventM2970a = companion.m2970a(state);
                final ot10 ot10VarM94362b = MutexKt.m94362b(false, 1, null);
                ?? r4 = new LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 */
                    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
                    @DebugMetadata(m87373c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", m87374f = "RepeatOnLifecycle.kt", m87375l = {165, 110}, m87376m = "invokeSuspend")
                    @SourceDebugExtension
                    public static final class C04661 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Function2<ppb, Continuation<? super Unit>, Object> $block;
                        final /* synthetic */ ot10 $mutex;
                        Object L$0;
                        Object L$1;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C04661(ot10 ot10Var, Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04661> continuation) {
                            super(2, continuation);
                            this.$mutex = ot10Var;
                            this.$block = function2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C04661(this.$mutex, this.$block, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
                            return ((C04661) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            ot10 ot10Var;
                            Function2<ppb, Continuation<? super Unit>, Object> function2;
                            Throwable th;
                            ot10 ot10Var2;
                            Object objM196133e = uwp.m196133e();
                            int i = this.label;
                            try {
                                if (i == 0) {
                                    ResultKt.m87239b(obj);
                                    ot10Var = this.$mutex;
                                    function2 = this.$block;
                                    this.L$0 = ot10Var;
                                    this.L$1 = function2;
                                    this.label = 1;
                                    if (ot10Var.mo94354c(null, this) != objM196133e) {
                                    }
                                    return objM196133e;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    ot10Var2 = (ot10) this.L$0;
                                    try {
                                        ResultKt.m87239b(obj);
                                        Unit unit = Unit.INSTANCE;
                                        ot10Var2.mo94355d(null);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        ot10Var2.mo94355d(null);
                                        throw th;
                                    }
                                }
                                function2 = (Function2) this.L$1;
                                ot10 ot10Var3 = (ot10) this.L$0;
                                ResultKt.m87239b(obj);
                                ot10Var = ot10Var3;
                                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                                this.L$0 = ot10Var;
                                this.L$1 = null;
                                this.label = 2;
                                if (C15424f.m94059e(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != objM196133e) {
                                    ot10Var2 = ot10Var;
                                    Unit unit2 = Unit.INSTANCE;
                                    ot10Var2.mo94355d(null);
                                    return Unit.INSTANCE;
                                }
                                return objM196133e;
                            } catch (Throwable th3) {
                                ot10 ot10Var4 = ot10Var;
                                th = th3;
                                ot10Var2 = ot10Var4;
                                ot10Var2.mo94355d(null);
                                throw th;
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r7v3, types: [T, kotlinx.coroutines.o] */
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(jcr jcrVar, Lifecycle.Event event) {
                        jcrVar.getClass();
                        event.getClass();
                        if (event == eventM2973d) {
                            objectRef3.element = jh3.m141367d(ppbVar, null, null, new C04661(ot10VarM94362b, function2, null), 3, null);
                            return;
                        }
                        if (event == eventM2970a) {
                            InterfaceC15486o interfaceC15486o3 = objectRef3.element;
                            if (interfaceC15486o3 != null) {
                                InterfaceC15486o.a.m94245a(interfaceC15486o3, null, 1, null);
                            }
                            objectRef3.element = null;
                        }
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            bf4<Unit> bf4Var = c15407c;
                            Result.Companion companion2 = Result.INSTANCE;
                            bf4Var.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
                        }
                    }
                };
                objectRef.element = r4;
                lifecycle.mo2966a((LifecycleEventObserver) r4);
                Object objM93778v = c15407c.m93778v();
                if (objM93778v == uwp.m196133e()) {
                    DebugProbesKt.m87383c(this);
                }
                if (objM93778v == objM196133e) {
                    return objM196133e;
                }
                objectRef2 = objectRef3;
                interfaceC15486o2 = (InterfaceC15486o) objectRef2.element;
                if (interfaceC15486o2 != null) {
                    InterfaceC15486o.a.m94245a(interfaceC15486o2, null, 1, null);
                }
                lifecycleEventObserver2 = (LifecycleEventObserver) objectRef.element;
                if (lifecycleEventObserver2 != null) {
                    this.$this_repeatOnLifecycle.mo2969d(lifecycleEventObserver2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                objectRef2 = objectRef3;
                interfaceC15486o = (InterfaceC15486o) objectRef2.element;
                if (interfaceC15486o != null) {
                    InterfaceC15486o.a.m94245a(interfaceC15486o, null, 1, null);
                }
                lifecycleEventObserver = (LifecycleEventObserver) objectRef.element;
                if (lifecycleEventObserver != null) {
                    throw th;
                }
                this.$this_repeatOnLifecycle.mo2969d(lifecycleEventObserver);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
        super(2, continuation);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ppb ppbVar = (ppb) this.L$0;
            hpw immediate = d4e.m109982c().getImmediate();
            C04651 c04651 = new C04651(this.$this_repeatOnLifecycle, this.$state, ppbVar, this.$block, null);
            this.label = 1;
            if (hh3.m130938g(immediate, c04651, this) == objM196133e) {
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

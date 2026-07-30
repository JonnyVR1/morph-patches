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
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.sync.MutexKt;
import org.spongycastle.asn1.eac.EACTags;
import p153l.ag4;
import p153l.drb;
import p153l.gsw;
import p153l.ker;
import p153l.r5e;
import p153l.uyp;
import p153l.vh3;
import p153l.w120;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m88263f = "RepeatOnLifecycle.kt", m88264l = {EACTags.DISCRETIONARY_DATA}, m88265m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<drb, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m88263f = "RepeatOnLifecycle.kt", m88264l = {161}, m88265m = "invokeSuspend")
    @SourceDebugExtension
    public static final class C04661 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ drb $$this$coroutineScope;
        final /* synthetic */ Function2<drb, Continuation<? super Unit>, Object> $block;
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
        public C04661(Lifecycle lifecycle, Lifecycle.State state, drb drbVar, Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04661> continuation) {
            super(2, continuation);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = drbVar;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04661(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C04661) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC15593o interfaceC15593o;
            LifecycleEventObserver lifecycleEventObserver;
            InterfaceC15593o interfaceC15593o2;
            LifecycleEventObserver lifecycleEventObserver2;
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                objectRef = (Ref.ObjectRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                try {
                    ResultKt.m88128b(obj);
                    interfaceC15593o2 = (InterfaceC15593o) objectRef2.element;
                    if (interfaceC15593o2 != null) {
                        InterfaceC15593o.a.m95138a(interfaceC15593o2, null, 1, null);
                    }
                    lifecycleEventObserver2 = (LifecycleEventObserver) objectRef.element;
                    if (lifecycleEventObserver2 != null) {
                        this.$this_repeatOnLifecycle.mo2970d(lifecycleEventObserver2);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC15593o = (InterfaceC15593o) objectRef2.element;
                    if (interfaceC15593o != null) {
                        InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) objectRef.element;
                    if (lifecycleEventObserver != null) {
                        throw th;
                    }
                    this.$this_repeatOnLifecycle.mo2970d(lifecycleEventObserver);
                    throw th;
                }
            }
            ResultKt.m88128b(obj);
            if (this.$this_repeatOnLifecycle.getState() == Lifecycle.State.DESTROYED) {
                return Unit.INSTANCE;
            }
            final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef = new Ref.ObjectRef();
            try {
                Lifecycle.State state = this.$state;
                Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                final drb drbVar = this.$$this$coroutineScope;
                final Function2<drb, Continuation<? super Unit>, Object> function2 = this.$block;
                this.L$0 = objectRef3;
                this.L$1 = objectRef;
                this.L$2 = state;
                this.L$3 = lifecycle;
                this.L$4 = drbVar;
                this.L$5 = function2;
                this.label = 1;
                final C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(this), 1);
                c15514c.m94637G();
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                final Lifecycle.Event eventM2974d = companion.m2974d(state);
                final Lifecycle.Event eventM2971a = companion.m2971a(state);
                final w120 w120VarM95255b = MutexKt.m95255b(false, 1, null);
                ?? r4 = new LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 */
                    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
                    @DebugMetadata(m88262c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", m88263f = "RepeatOnLifecycle.kt", m88264l = {165, 110}, m88265m = "invokeSuspend")
                    @SourceDebugExtension
                    public static final class C04671 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Function2<drb, Continuation<? super Unit>, Object> $block;
                        final /* synthetic */ w120 $mutex;
                        Object L$0;
                        Object L$1;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C04671(w120 w120Var, Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04671> continuation) {
                            super(2, continuation);
                            this.$mutex = w120Var;
                            this.$block = function2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C04671(this.$mutex, this.$block, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
                            return ((C04671) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            w120 w120Var;
                            Function2<drb, Continuation<? super Unit>, Object> function2;
                            Throwable th;
                            w120 w120Var2;
                            Object objM198688e = uyp.m198688e();
                            int i = this.label;
                            try {
                                if (i == 0) {
                                    ResultKt.m88128b(obj);
                                    w120Var = this.$mutex;
                                    function2 = this.$block;
                                    this.L$0 = w120Var;
                                    this.L$1 = function2;
                                    this.label = 1;
                                    if (w120Var.mo95247c(null, this) != objM198688e) {
                                    }
                                    return objM198688e;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    w120Var2 = (w120) this.L$0;
                                    try {
                                        ResultKt.m88128b(obj);
                                        Unit unit = Unit.INSTANCE;
                                        w120Var2.mo95248d(null);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        w120Var2.mo95248d(null);
                                        throw th;
                                    }
                                }
                                function2 = (Function2) this.L$1;
                                w120 w120Var3 = (w120) this.L$0;
                                ResultKt.m88128b(obj);
                                w120Var = w120Var3;
                                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                                this.L$0 = w120Var;
                                this.L$1 = null;
                                this.label = 2;
                                if (C15531f.m94951e(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != objM198688e) {
                                    w120Var2 = w120Var;
                                    Unit unit2 = Unit.INSTANCE;
                                    w120Var2.mo95248d(null);
                                    return Unit.INSTANCE;
                                }
                                return objM198688e;
                            } catch (Throwable th3) {
                                w120 w120Var4 = w120Var;
                                th = th3;
                                w120Var2 = w120Var4;
                                w120Var2.mo95248d(null);
                                throw th;
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r7v3, types: [T, kotlinx.coroutines.o] */
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(ker kerVar, Lifecycle.Event event) {
                        kerVar.getClass();
                        event.getClass();
                        if (event == eventM2974d) {
                            objectRef3.element = xh3.m210980d(drbVar, null, null, new C04671(w120VarM95255b, function2, null), 3, null);
                            return;
                        }
                        if (event == eventM2971a) {
                            InterfaceC15593o interfaceC15593o3 = objectRef3.element;
                            if (interfaceC15593o3 != null) {
                                InterfaceC15593o.a.m95138a(interfaceC15593o3, null, 1, null);
                            }
                            objectRef3.element = null;
                        }
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            ag4<Unit> ag4Var = c15514c;
                            Result.Companion companion2 = Result.INSTANCE;
                            ag4Var.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
                        }
                    }
                };
                objectRef.element = r4;
                lifecycle.mo2967a((LifecycleEventObserver) r4);
                Object objM94670v = c15514c.m94670v();
                if (objM94670v == uyp.m198688e()) {
                    DebugProbesKt.m88272c(this);
                }
                if (objM94670v == objM198688e) {
                    return objM198688e;
                }
                objectRef2 = objectRef3;
                interfaceC15593o2 = (InterfaceC15593o) objectRef2.element;
                if (interfaceC15593o2 != null) {
                    InterfaceC15593o.a.m95138a(interfaceC15593o2, null, 1, null);
                }
                lifecycleEventObserver2 = (LifecycleEventObserver) objectRef.element;
                if (lifecycleEventObserver2 != null) {
                    this.$this_repeatOnLifecycle.mo2970d(lifecycleEventObserver2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                objectRef2 = objectRef3;
                interfaceC15593o = (InterfaceC15593o) objectRef2.element;
                if (interfaceC15593o != null) {
                    InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
                }
                lifecycleEventObserver = (LifecycleEventObserver) objectRef.element;
                if (lifecycleEventObserver != null) {
                    throw th;
                }
                this.$this_repeatOnLifecycle.mo2970d(lifecycleEventObserver);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
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
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = (drb) this.L$0;
            gsw immediate = r5e.m179862c().getImmediate();
            C04661 c04661 = new C04661(this.$this_repeatOnLifecycle, this.$state, drbVar, this.$block, null);
            this.label = 1;
            if (vh3.m201255g(immediate, c04661, this) == objM198688e) {
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

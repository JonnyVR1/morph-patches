package androidx.work.impl.workers;

import androidx.work.impl.constraints.AbstractC0787a;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.haq0;
import p149l.j6f;
import p149l.jri;
import p149l.qkq0;
import p149l.txv;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m87232d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "Ll/haq0;", "workSpec", "", "c", "(Landroidx/work/impl/constraints/WorkConstraintsTracker;Ll/haq0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ConstraintTrackingWorkerKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3622a;

    static {
        String strM190978i = txv.m190978i("ConstraintTrkngWrkr");
        strM190978i.getClass();
        f3622a = strM190978i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m4638c(WorkConstraintsTracker workConstraintsTracker, haq0 haq0Var, Continuation<? super Integer> continuation) throws Throwable {
        ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 constraintTrackingWorkerKt$awaitConstraintsNotMet$1;
        if (continuation instanceof ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1) {
            constraintTrackingWorkerKt$awaitConstraintsNotMet$1 = (ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1) continuation;
            int i = constraintTrackingWorkerKt$awaitConstraintsNotMet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                constraintTrackingWorkerKt$awaitConstraintsNotMet$1.label = i - Integer.MIN_VALUE;
            } else {
                constraintTrackingWorkerKt$awaitConstraintsNotMet$1 = new ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1(continuation);
            }
        } else {
            constraintTrackingWorkerKt$awaitConstraintsNotMet$1 = new ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1(continuation);
        }
        Object objM142959r = constraintTrackingWorkerKt$awaitConstraintsNotMet$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = constraintTrackingWorkerKt$awaitConstraintsNotMet$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(objM142959r);
            final eri eriVarM142933E = jri.m142933E(workConstraintsTracker.m4579b(haq0Var), new ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(haq0Var, null));
            eri<Object> eriVar = new eri<Object>() { // from class: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2, reason: invalid class name */
                @Metadata(m87231d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/jsi", "<anonymous>"}, m87233k = 3, m87234mv = {1, 8, 0})
                @SourceDebugExtension
                public static final class AnonymousClass2<T> implements fri {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ fri f3624a;

                    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
                    @DebugMetadata(m87373c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2", m87374f = "ConstraintTrackingWorker.kt", m87375l = {223}, m87376m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(fri friVar) {
                        this.f3624a = friVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p149l.fri
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objM196133e = uwp.m196133e();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.m87239b(obj2);
                            fri friVar = this.f3624a;
                            if (obj instanceof AbstractC0787a.b) {
                                anonymousClass1.label = 1;
                                if (friVar.emit(obj, anonymousClass1) == objM196133e) {
                                    return objM196133e;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ResultKt.m87239b(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p149l.eri
                @Nullable
                public Object collect(@NotNull fri<? super Object> friVar, @NotNull Continuation continuation2) {
                    Object objCollect = eriVarM142933E.collect(new AnonymousClass2(friVar), continuation2);
                    return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
                }
            };
            constraintTrackingWorkerKt$awaitConstraintsNotMet$1.label = 1;
            objM142959r = jri.m142959r(eriVar, constraintTrackingWorkerKt$awaitConstraintsNotMet$1);
            if (objM142959r == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(objM142959r);
        }
        return Boxing.m87371b(((AbstractC0787a.b) objM142959r).getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
    }
}

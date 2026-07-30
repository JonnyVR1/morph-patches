package androidx.work.impl.workers;

import androidx.work.impl.constraints.AbstractC0789a;
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
import p153l.aui;
import p153l.bui;
import p153l.fui;
import p153l.mjq0;
import p153l.p7f;
import p153l.qzv;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m88121d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "Ll/mjq0;", "workSpec", "", "c", "(Landroidx/work/impl/constraints/WorkConstraintsTracker;Ll/mjq0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ConstraintTrackingWorkerKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3622a;

    static {
        String strM178831i = qzv.m178831i("ConstraintTrkngWrkr");
        strM178831i.getClass();
        f3622a = strM178831i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m4640c(WorkConstraintsTracker workConstraintsTracker, mjq0 mjq0Var, Continuation<? super Integer> continuation) throws Throwable {
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
        Object objM127494r = constraintTrackingWorkerKt$awaitConstraintsNotMet$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = constraintTrackingWorkerKt$awaitConstraintsNotMet$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objM127494r);
            final aui auiVarM127468E = fui.m127468E(workConstraintsTracker.m4581b(mjq0Var), new ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(mjq0Var, null));
            aui<Object> auiVar = new aui<Object>() { // from class: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2, reason: invalid class name */
                @Metadata(m88120d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/fvi", "<anonymous>"}, m88122k = 3, m88123mv = {1, 8, 0})
                @SourceDebugExtension
                public static final class AnonymousClass2<T> implements bui {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ bui f3624a;

                    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
                    @DebugMetadata(m88262c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2", m88263f = "ConstraintTrackingWorker.kt", m88264l = {223}, m88265m = "emit")
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

                    public AnonymousClass2(bui buiVar) {
                        this.f3624a = buiVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p153l.bui
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
                        Object objM198688e = uyp.m198688e();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.m88128b(obj2);
                            bui buiVar = this.f3624a;
                            if (obj instanceof AbstractC0789a.b) {
                                anonymousClass1.label = 1;
                                if (buiVar.emit(obj, anonymousClass1) == objM198688e) {
                                    return objM198688e;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ResultKt.m88128b(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p153l.aui
                @Nullable
                public Object collect(@NotNull bui<? super Object> buiVar, @NotNull Continuation continuation2) {
                    Object objCollect = auiVarM127468E.collect(new AnonymousClass2(buiVar), continuation2);
                    return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
                }
            };
            constraintTrackingWorkerKt$awaitConstraintsNotMet$1.label = 1;
            objM127494r = fui.m127494r(auiVar, constraintTrackingWorkerKt$awaitConstraintsNotMet$1);
            if (objM127494r == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(objM127494r);
        }
        return Boxing.m88260b(((AbstractC0789a.b) objM127494r).getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
    }
}

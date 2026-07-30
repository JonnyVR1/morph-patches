package androidx.work.impl.constraints;

import android.os.Build;
import com.p046p1.mobile.putong.data.Careers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b7j0;
import p149l.bz5;
import p149l.dc20;
import p149l.eri;
import p149l.fd20;
import p149l.fri;
import p149l.gb20;
import p149l.gc20;
import p149l.gt2;
import p149l.haq0;
import p149l.j6f;
import p149l.jri;
import p149l.jt2;
import p149l.oxf0;
import p149l.qkq0;
import p149l.txv;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "", "Ll/bz5;", "controllers", "<init>", "(Ljava/util/List;)V", "Ll/b7j0;", "trackers", "(Ll/b7j0;)V", "Ll/haq0;", "spec", "Ll/eri;", "Landroidx/work/impl/constraints/a;", "b", "(Ll/haq0;)Ll/eri;", "workSpec", "", "a", "(Ll/haq0;)Z", "Ljava/util/List;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class WorkConstraintsTracker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<bz5> controllers;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(@NotNull b7j0 b7j0Var) {
        this((List<? extends bz5>) CollectionsKt.listOfNotNull((Object[]) new bz5[]{new gt2(b7j0Var.m100681a()), new jt2(b7j0Var.getBatteryNotLowTracker()), new oxf0(b7j0Var.m100685e()), new gb20(b7j0Var.m100684d()), new fd20(b7j0Var.m100684d()), new gc20(b7j0Var.m100684d()), new dc20(b7j0Var.m100684d()), Build.VERSION.SDK_INT >= 28 ? WorkConstraintsTrackerKt.m4580a(b7j0Var.getContext()) : null}));
        b7j0Var.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4578a(@NotNull haq0 workSpec) {
        workSpec.getClass();
        List<bz5> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bz5) obj).mo4572a(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            txv.m190976e().mo190979a(WorkConstraintsTrackerKt.f3586a, "Work " + workSpec.id + " constrained by " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<bz5, CharSequence>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$areAllConstraintsMet$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(bz5 bz5Var) {
                    bz5Var.getClass();
                    return bz5Var.getClass().getSimpleName();
                }
            }, 31, null));
        }
        return arrayList.isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final eri<AbstractC0787a> m4579b(@NotNull haq0 spec) {
        spec.getClass();
        List<bz5> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bz5) obj).mo4574c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bz5) it.next()).mo4573b(spec.constraints));
        }
        final eri[] eriVarArr = (eri[]) CollectionsKt.toList(arrayList2).toArray(new eri[0]);
        return jri.m142954m(new eri<AbstractC0787a>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3 */
            @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", "", Careers.f38732it, "", "<anonymous>", "(Ll/fri;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, m87233k = 3, m87234mv = {1, 8, 0})
            @DebugMetadata(m87373c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", m87374f = "WorkConstraintsTracker.kt", m87375l = {292}, m87376m = "invokeSuspend")
            @SourceDebugExtension
            public static final class C07853 extends SuspendLambda implements Function3<fri<? super AbstractC0787a>, AbstractC0787a[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C07853(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                public final Object invoke(@NotNull fri<? super AbstractC0787a> friVar, @NotNull AbstractC0787a[] abstractC0787aArr, @Nullable Continuation<? super Unit> continuation) {
                    C07853 c07853 = new C07853(continuation);
                    c07853.L$0 = friVar;
                    c07853.L$1 = abstractC0787aArr;
                    return c07853.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objM196133e = uwp.m196133e();
                    int i = this.label;
                    AbstractC0787a abstractC0787a = null;
                    if (i == 0) {
                        ResultKt.m87239b(obj);
                        fri friVar = (fri) this.L$0;
                        for (AbstractC0787a abstractC0787a2 : (AbstractC0787a[]) ((Object[]) this.L$1)) {
                            if (!Intrinsics.m87488d(abstractC0787a2, AbstractC0787a.a.INSTANCE)) {
                                abstractC0787a = abstractC0787a2;
                                break;
                            }
                        }
                        if (abstractC0787a == null) {
                            abstractC0787a = AbstractC0787a.a.INSTANCE;
                        }
                        this.label = 1;
                        if (friVar.emit(abstractC0787a, this) == objM196133e) {
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

            @Override // p149l.eri
            @Nullable
            public Object collect(@NotNull fri<? super AbstractC0787a> friVar, @NotNull Continuation continuation) {
                final eri[] eriVarArr2 = eriVarArr;
                Object objM94173a = CombineKt.m94173a(friVar, eriVarArr2, new Function0<AbstractC0787a[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final AbstractC0787a[] invoke() {
                        return new AbstractC0787a[eriVarArr2.length];
                    }
                }, new C07853(null), continuation);
                return objM94173a == uwp.m196133e() ? objM94173a : Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(@NotNull List<? extends bz5> list) {
        list.getClass();
        this.controllers = list;
    }
}

package androidx.work.impl.constraints;

import android.os.Build;
import com.p051p1.mobile.putong.data.Careers;
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
import p153l.aui;
import p153l.bui;
import p153l.fgj0;
import p153l.fui;
import p153l.g06;
import p153l.mjq0;
import p153l.mk20;
import p153l.p7f;
import p153l.pj20;
import p153l.pk20;
import p153l.pl20;
import p153l.qzv;
import p153l.uyp;
import p153l.w5g0;
import p153l.wt2;
import p153l.wtq0;
import p153l.zt2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "", "Ll/g06;", "controllers", "<init>", "(Ljava/util/List;)V", "Ll/fgj0;", "trackers", "(Ll/fgj0;)V", "Ll/mjq0;", "spec", "Ll/aui;", "Landroidx/work/impl/constraints/a;", "b", "(Ll/mjq0;)Ll/aui;", "workSpec", "", "a", "(Ll/mjq0;)Z", "Ljava/util/List;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class WorkConstraintsTracker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<g06> controllers;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(@NotNull fgj0 fgj0Var) {
        this((List<? extends g06>) CollectionsKt.listOfNotNull((Object[]) new g06[]{new wt2(fgj0Var.m125500a()), new zt2(fgj0Var.getBatteryNotLowTracker()), new w5g0(fgj0Var.m125504e()), new pj20(fgj0Var.m125503d()), new pl20(fgj0Var.m125503d()), new pk20(fgj0Var.m125503d()), new mk20(fgj0Var.m125503d()), Build.VERSION.SDK_INT >= 28 ? WorkConstraintsTrackerKt.m4582a(fgj0Var.getContext()) : null}));
        fgj0Var.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4580a(@NotNull mjq0 workSpec) {
        workSpec.getClass();
        List<g06> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((g06) obj).mo4574a(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "Work " + workSpec.id + " constrained by " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<g06, CharSequence>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$areAllConstraintsMet$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(g06 g06Var) {
                    g06Var.getClass();
                    return g06Var.getClass().getSimpleName();
                }
            }, 31, null));
        }
        return arrayList.isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final aui<AbstractC0789a> m4581b(@NotNull mjq0 spec) {
        spec.getClass();
        List<g06> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((g06) obj).mo4576c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g06) it.next()).mo4575b(spec.constraints));
        }
        final aui[] auiVarArr = (aui[]) CollectionsKt.toList(arrayList2).toArray(new aui[0]);
        return fui.m127489m(new aui<AbstractC0789a>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3 */
            @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/bui;", "", Careers.f39580it, "", "<anonymous>", "(Ll/bui;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, m88122k = 3, m88123mv = {1, 8, 0})
            @DebugMetadata(m88262c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", m88263f = "WorkConstraintsTracker.kt", m88264l = {292}, m88265m = "invokeSuspend")
            @SourceDebugExtension
            public static final class C07873 extends SuspendLambda implements Function3<bui<? super AbstractC0789a>, AbstractC0789a[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C07873(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                public final Object invoke(@NotNull bui<? super AbstractC0789a> buiVar, @NotNull AbstractC0789a[] abstractC0789aArr, @Nullable Continuation<? super Unit> continuation) {
                    C07873 c07873 = new C07873(continuation);
                    c07873.L$0 = buiVar;
                    c07873.L$1 = abstractC0789aArr;
                    return c07873.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objM198688e = uyp.m198688e();
                    int i = this.label;
                    AbstractC0789a abstractC0789a = null;
                    if (i == 0) {
                        ResultKt.m88128b(obj);
                        bui buiVar = (bui) this.L$0;
                        for (AbstractC0789a abstractC0789a2 : (AbstractC0789a[]) ((Object[]) this.L$1)) {
                            if (!Intrinsics.m88377d(abstractC0789a2, AbstractC0789a.a.INSTANCE)) {
                                abstractC0789a = abstractC0789a2;
                                break;
                            }
                        }
                        if (abstractC0789a == null) {
                            abstractC0789a = AbstractC0789a.a.INSTANCE;
                        }
                        this.label = 1;
                        if (buiVar.emit(abstractC0789a, this) == objM198688e) {
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

            @Override // p153l.aui
            @Nullable
            public Object collect(@NotNull bui<? super AbstractC0789a> buiVar, @NotNull Continuation continuation) {
                final aui[] auiVarArr2 = auiVarArr;
                Object objM95066a = CombineKt.m95066a(buiVar, auiVarArr2, new Function0<AbstractC0789a[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final AbstractC0789a[] invoke() {
                        return new AbstractC0789a[auiVarArr2.length];
                    }
                }, new C07873(null), continuation);
                return objM95066a == uyp.m198688e() ? objM95066a : Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(@NotNull List<? extends g06> list) {
        list.getClass();
        this.controllers = list;
    }
}

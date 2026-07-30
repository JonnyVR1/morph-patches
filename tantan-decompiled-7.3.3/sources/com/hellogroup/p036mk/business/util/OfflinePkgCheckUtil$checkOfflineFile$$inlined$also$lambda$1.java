package com.hellogroup.p036mk.business.util;

import com.hellogroup.fep.base.core.FepManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.gsw;
import p153l.hul;
import p153l.jzv;
import p153l.r5e;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;
import p153l.x4d0;
import p153l.y35;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/hellogroup/mk/business/util/OfflinePkgCheckUtil$checkOfflineFile$2$1", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
public final class OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ y35 $checkInfo$inlined;
    final /* synthetic */ List $it;
    final /* synthetic */ x4d0 $resourceResponse$inlined;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12313p$;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.util.OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1$1 */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Ll/drb;", "Lkotlin/Result;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/hellogroup/mk/business/util/OfflinePkgCheckUtil$checkOfflineFile$2$1$2", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
    public static final class C35691 extends SuspendLambda implements Function2<drb, Continuation<? super Result<? extends Unit>>, Object> {
        final /* synthetic */ List $deletePkgs;
        int label;

        /* JADX INFO: renamed from: p$ */
        private drb f12314p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35691(List list, Continuation continuation) {
            super(2, continuation);
            this.$deletePkgs = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C35691 c35691 = OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1.this.new C35691(this.$deletePkgs, continuation);
            c35691.f12314p$ = (drb) obj;
            return c35691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Result<? extends Unit>> continuation) {
            return ((C35691) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM225066constructorimpl;
            uyp.m198688e();
            if (this.label != 0) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            try {
                Result.Companion companion = Result.INSTANCE;
                hul hulVar = OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1.this.$checkInfo$inlined.f197305a.get();
                if (hulVar != null) {
                    jzv.m147728a("OfflinePkgCheckUtil", "already remove and reload");
                    OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1.this.$resourceResponse$inlined.m209304a(this.$deletePkgs);
                    hulVar.mo17912a();
                    OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1.this.$checkInfo$inlined.f197306b = true;
                }
                objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            return Result.m225065boximpl(objM225066constructorimpl);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1(List list, Continuation continuation, y35 y35Var, x4d0 x4d0Var) {
        super(2, continuation);
        this.$it = list;
        this.$checkInfo$inlined = y35Var;
        this.$resourceResponse$inlined = x4d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1 offlinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1 = new OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1(this.$it, continuation, this.$checkInfo$inlined, this.$resourceResponse$inlined);
        offlinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1.f12313p$ = (drb) obj;
        return offlinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        drb drbVar;
        long jCurrentTimeMillis;
        List arrayList;
        y35 y35Var;
        Ref.BooleanRef booleanRef;
        long j;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                arrayList = (List) this.L$2;
                booleanRef = (Ref.BooleanRef) this.L$1;
                jCurrentTimeMillis = this.J$0;
                drbVar = (drb) this.L$0;
                ResultKt.m88128b(obj);
            } else {
                if (i != 2) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                ResultKt.m88128b(obj);
            }
            jCurrentTimeMillis = j;
            jzv.m147734g("OfflinePkgCheckUtil", "校验本地文件完成, current cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms ");
            return Unit.INSTANCE;
        }
        ResultKt.m88128b(obj);
        drbVar = this.f12313p$;
        jCurrentTimeMillis = System.currentTimeMillis();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        booleanRef2.element = true;
        arrayList = new ArrayList();
        for (zgi zgiVar : this.$it) {
            try {
                if (zgiVar.m219632o()) {
                    if (FepManager.INSTANCE.m17610a().m17583d(zgiVar)) {
                        jzv.m147734g("OfflinePkgCheckUtil", "校验本地文件通过, name: " + zgiVar.m219626i());
                    } else {
                        booleanRef2.element = false;
                        jzv.m147734g("OfflinePkgCheckUtil", "校验本地文件失败, name: " + zgiVar.m219626i() + ", 将删除包");
                        arrayList.add(zgiVar);
                    }
                }
            } catch (Exception e) {
                jzv.m147729b("OfflinePkgCheckUtil", e.getMessage());
            }
        }
        if (!booleanRef2.element && (y35Var = this.$checkInfo$inlined) != null) {
            if (y35Var.f197305a.get() == null) {
                return Unit.INSTANCE;
            }
            if (!this.$checkInfo$inlined.f197306b) {
                this.L$0 = drbVar;
                this.J$0 = jCurrentTimeMillis;
                this.L$1 = booleanRef2;
                this.L$2 = arrayList;
                this.label = 1;
                if (DelayKt.m94502b(100L, this) != objM198688e) {
                    booleanRef = booleanRef2;
                }
                return objM198688e;
            }
            jzv.m147734g("OfflinePkgCheckUtil", "校验本地文件完成, current cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms ");
        }
        return Unit.INSTANCE;
        gsw gswVarM179862c = r5e.m179862c();
        C35691 c35691 = new C35691(arrayList, null);
        this.L$0 = drbVar;
        this.J$0 = jCurrentTimeMillis;
        this.L$1 = booleanRef;
        this.L$2 = arrayList;
        this.label = 2;
        if (vh3.m201255g(gswVarM179862c, c35691, this) != objM198688e) {
            j = jCurrentTimeMillis;
            jCurrentTimeMillis = j;
            jzv.m147734g("OfflinePkgCheckUtil", "校验本地文件完成, current cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms ");
            return Unit.INSTANCE;
        }
        return objM198688e;
    }
}

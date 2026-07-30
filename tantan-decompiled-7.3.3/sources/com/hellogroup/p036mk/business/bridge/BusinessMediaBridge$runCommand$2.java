package com.hellogroup.p036mk.business.bridge;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.drb;
import p153l.ijw;
import p153l.jxl;
import p153l.kxl;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.business.bridge.BusinessMediaBridge$runCommand$2", m88263f = "BusinessMediaBridge.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class BusinessMediaBridge$runCommand$2 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ jxl $loadICallback;
    final /* synthetic */ JSONObject $params;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12159p$;
    final /* synthetic */ BusinessMediaBridge this$0;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.bridge.BusinessMediaBridge$runCommand$2$a */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"com/hellogroup/mk/business/bridge/BusinessMediaBridge$runCommand$2$a", "Ll/kxl;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3532a implements kxl {
        public C3532a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessMediaBridge$runCommand$2(BusinessMediaBridge businessMediaBridge, jxl jxlVar, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.this$0 = businessMediaBridge;
        this.$loadICallback = jxlVar;
        this.$params = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        BusinessMediaBridge$runCommand$2 businessMediaBridge$runCommand$2 = new BusinessMediaBridge$runCommand$2(this.this$0, this.$loadICallback, this.$params, continuation);
        businessMediaBridge$runCommand$2.f12159p$ = (drb) obj;
        return businessMediaBridge$runCommand$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((BusinessMediaBridge$runCommand$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        this.$loadICallback.m147366b(this.this$0.m177460c(), new ijw(this.$params), new C3532a());
        return Unit.INSTANCE;
    }
}

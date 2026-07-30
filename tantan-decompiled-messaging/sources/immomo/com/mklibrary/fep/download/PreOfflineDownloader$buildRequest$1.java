package immomo.com.mklibrary.fep.download;

import com.cosmos.mdlog.MDLog;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.Map;
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
import p149l.nei;
import p149l.oei;
import p149l.ppb;
import p149l.qkq0;
import p149l.sei;
import p149l.uwp;
import p149l.x750;
import p149l.y750;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
@DebugMetadata(m87373c = "immomo.com.mklibrary.fep.download.PreOfflineDownloader$buildRequest$1", m87374f = "PreOfflineDownloader.kt", m87375l = {39}, m87376m = "invokeSuspend")
public final class PreOfflineDownloader$buildRequest$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ x750 $call;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: p$ */
    private ppb f63320p$;

    /* JADX INFO: renamed from: immomo.com.mklibrary.fep.download.PreOfflineDownloader$buildRequest$1$a */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"immomo/com/mklibrary/fep/download/PreOfflineDownloader$buildRequest$1$a", "Ll/nei;", "", LovePlanetStage.result, "Lorg/json/JSONObject;", "resultObj", "", "b", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "a", "(Ljava/lang/Exception;)V", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class C14927a implements nei {
        @Override // p149l.nei
        /* JADX INFO: renamed from: a */
        public void mo87192a(@Nullable Exception e) {
            MDLog.printErrStackTrace("OfflineDownloader", e);
        }

        @Override // p149l.nei
        /* JADX INFO: renamed from: b */
        public void mo87193b(@Nullable String result, @Nullable JSONObject resultObj) {
            if (resultObj != null) {
                PreOfflineDownloader preOfflineDownloader = PreOfflineDownloader.INSTANCE;
                y750 y750VarM87188g = preOfflineDownloader.m87188g(resultObj);
                MDLog.m7395i("OfflineDownloader", "buildRequest=" + y750VarM87188g);
                preOfflineDownloader.m87187f(y750VarM87188g);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreOfflineDownloader$buildRequest$1(x750 x750Var, Continuation continuation) {
        super(2, continuation);
        this.$call = x750Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        PreOfflineDownloader$buildRequest$1 preOfflineDownloader$buildRequest$1 = new PreOfflineDownloader$buildRequest$1(this.$call, continuation);
        preOfflineDownloader$buildRequest$1.f63320p$ = (ppb) obj;
        return preOfflineDownloader$buildRequest$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((PreOfflineDownloader$buildRequest$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        sei seiVar = null;
        try {
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = this.f63320p$;
                PreOfflineDownloader preOfflineDownloader = PreOfflineDownloader.INSTANCE;
                this.L$0 = ppbVar;
                this.L$1 = null;
                this.label = 1;
                obj = preOfflineDownloader.m87190d(ppbVar, this);
                if (obj == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                seiVar = (sei) this.L$1;
                ResultKt.m87239b(obj);
            }
            Map<String, String> map = (Map) obj;
            if (!map.isEmpty()) {
                oei oeiVar = new oei();
                oeiVar.m183652a(map);
                oeiVar.m163955f(new C14927a());
                seiVar = oeiVar;
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace("OfflineDownloader", th);
        }
        x750 x750Var = this.$call;
        if (x750Var != null) {
            x750Var.mo198198a(seiVar);
        }
        return Unit.INSTANCE;
    }
}

package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.fui;
import p153l.hu40;
import p153l.p7f;
import p153l.rui;
import p153l.uyp;
import p153l.xh3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\nH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a.\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/aui;", "", "a", "(Ll/aui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "scope", "Lkotlinx/coroutines/o;", Constants.INAPP_DATA_TAG, "(Ll/aui;Ll/drb;)Lkotlinx/coroutines/o;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "value", "Lkotlin/coroutines/Continuation;", "", "action", "b", "(Ll/aui;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/bui;", "flow", "c", "(Ll/bui;Ll/aui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CollectKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m94966a(@NotNull aui<?> auiVar, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = auiVar.collect(hu40.INSTANCE, continuation);
        return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94967b(@NotNull aui<? extends T> auiVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objM127484h = fui.m127484h(rui.m183196b(fui.m127466C(auiVar, function2), 0, null, 2, null), continuation);
        return objM127484h == uyp.m198688e() ? objM127484h : Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m94968c(@NotNull bui<? super T> buiVar, @NotNull aui<? extends T> auiVar, @NotNull Continuation<? super Unit> continuation) {
        fui.m127493q(buiVar);
        Object objCollect = auiVar.collect(buiVar, continuation);
        return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC15593o m94969d(@NotNull aui<? extends T> auiVar, @NotNull drb drbVar) {
        return xh3.m210980d(drbVar, null, null, new FlowKt__CollectKt$launchIn$1(auiVar, null), 3, null);
    }
}

package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.jh3;
import p149l.jri;
import p149l.ppb;
import p149l.tl40;
import p149l.uwp;
import p149l.vri;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\nH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a.\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/eri;", "", "a", "(Ll/eri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "scope", "Lkotlinx/coroutines/o;", Constants.INAPP_DATA_TAG, "(Ll/eri;Ll/ppb;)Lkotlinx/coroutines/o;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "value", "Lkotlin/coroutines/Continuation;", "", "action", "b", "(Ll/eri;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/fri;", "flow", "c", "(Ll/fri;Ll/eri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CollectKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m94073a(@NotNull eri<?> eriVar, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = eriVar.collect(tl40.INSTANCE, continuation);
        return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94074b(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objM142949h = jri.m142949h(vri.m199665b(jri.m142931C(eriVar, function2), 0, null, 2, null), continuation);
        return objM142949h == uwp.m196133e() ? objM142949h : Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m94075c(@NotNull fri<? super T> friVar, @NotNull eri<? extends T> eriVar, @NotNull Continuation<? super Unit> continuation) {
        jri.m142958q(friVar);
        Object objCollect = eriVar.collect(friVar, continuation);
        return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC15486o m94076d(@NotNull eri<? extends T> eriVar, @NotNull ppb ppbVar) {
        return jh3.m141367d(ppbVar, null, null, new FlowKt__CollectKt$launchIn$1(eriVar, null), 3, null);
    }
}

package kotlinx.coroutines.flow;

import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.api.Api;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.jetbrains.annotations.NotNull;
import p153l.aui;
import p153l.bqh0;
import p153l.bui;
import p153l.fui;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001aq\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a`\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\f\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\" \u0010\u0018\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/aui;", "Lkotlin/Function3;", "Ll/bui;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "b", "(Ll/aui;Lkotlin/jvm/functions/Function3;)Ll/aui;", "Lkotlin/Function2;", "a", "(Ll/aui;Lkotlin/jvm/functions/Function2;)Ll/aui;", "", "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__MergeKt {

    /* JADX INFO: renamed from: a */
    public static final int f67506a = bqh0.m105935b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Api.BaseClientBuilder.API_PRIORITY_OTHER);

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T, R> aui<R> m94990a(@NotNull aui<? extends T> auiVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return fui.m127476M(auiVar, new FlowKt__MergeKt$mapLatest$1(function2, null));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T, R> aui<R> m94991b(@NotNull aui<? extends T> auiVar, @BuilderInference @NotNull Function3<? super bui<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new ChannelFlowTransformLatest(function3, auiVar, null, 0, null, 28, null);
    }
}

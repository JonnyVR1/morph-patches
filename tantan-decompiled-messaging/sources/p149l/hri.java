package p149l;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002)\b\u0001\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0080@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"R", "Lkotlin/Function2;", "Ll/ppb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class hri {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <R> Object m132686a(@BuilderInference @NotNull Function2<? super ppb, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        gri griVar = new gri(continuation.getContext(), continuation);
        Object objM180070b = rnj0.m180070b(griVar, griVar, function2);
        if (objM180070b == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM180070b;
    }
}

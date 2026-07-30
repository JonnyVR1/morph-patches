package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.dui;
import p153l.p7f;
import p153l.uyp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008f\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@¢\u0006\u0004\b\u000e\u0010\u000f*\u001c\b\u0002\u0010\u0011\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00102\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0010¨\u0006\u0012"}, m88121d2 = {"R", p7f.GPS_DIRECTION_TRUE, "Ll/bui;", "", "Ll/aui;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "a", "(Ll/bui;[Ll/aui;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class CombineKt {
    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <R, T> Object m95066a(@NotNull bui<? super R> buiVar, @NotNull aui<? extends T>[] auiVarArr, @NotNull Function0<T[]> function0, @NotNull Function3<? super bui<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objM118146a = dui.m118146a(new CombineKt$combineInternal$2(auiVarArr, function0, function3, buiVar, null), continuation);
        return objM118146a == uyp.m198688e() ? objM118146a : Unit.INSTANCE;
    }
}

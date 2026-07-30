package p149l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J2\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\r\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/rce0;", "R", "", "Ll/sce0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "", "c", "(Ll/sce0;Lkotlin/jvm/functions/Function1;)V", "Q", "Ll/uce0;", "Lkotlin/Function2;", "e", "(Ll/uce0;Lkotlin/jvm/functions/Function2;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface rce0<R> {
    /* JADX INFO: renamed from: c */
    void mo94309c(@NotNull sce0 sce0Var, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1);

    /* JADX INFO: renamed from: e */
    <Q> void mo94311e(@NotNull uce0<? extends Q> uce0Var, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);
}

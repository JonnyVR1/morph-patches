package p153l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J2\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\r\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/wke0;", "R", "", "Ll/xke0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "", "c", "(Ll/xke0;Lkotlin/jvm/functions/Function1;)V", "Q", "Ll/zke0;", "Lkotlin/Function2;", "e", "(Ll/zke0;Lkotlin/jvm/functions/Function2;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface wke0<R> {
    /* JADX INFO: renamed from: c */
    void mo95202c(@NotNull xke0 xke0Var, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1);

    /* JADX INFO: renamed from: e */
    <Q> void mo95204e(@NotNull zke0<? extends Q> zke0Var, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);
}

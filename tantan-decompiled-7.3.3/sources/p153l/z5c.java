package p153l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m88121d2 = {"Ll/z5c;", p7f.GPS_DIRECTION_TRUE, "", "currentData", "", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public interface z5c<T> {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m218633a(T t, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object m218634b(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* JADX INFO: renamed from: c */
    Object m218635c(T t, @NotNull Continuation<? super T> continuation);
}

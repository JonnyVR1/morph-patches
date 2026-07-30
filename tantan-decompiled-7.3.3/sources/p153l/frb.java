package p153l;

import androidx.datastore.core.CorruptionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m88121d2 = {"Ll/frb;", p7f.GPS_DIRECTION_TRUE, "", "Landroidx/datastore/core/CorruptionException;", "ex", "a", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public interface frb<T> {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo112444a(@NotNull CorruptionException corruptionException, @NotNull Continuation<? super T> continuation);
}

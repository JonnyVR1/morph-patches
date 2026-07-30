package p153l;

import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m88121d2 = {"Ll/j0d0;", p7f.GPS_DIRECTION_TRUE, "Ll/frb;", "Lkotlin/Function1;", "Landroidx/datastore/core/CorruptionException;", "produceNewData", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ex", "a", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class j0d0<T> implements frb<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<CorruptionException, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public j0d0(@NotNull Function1<? super CorruptionException, ? extends T> function1) {
        function1.getClass();
        this.produceNewData = function1;
    }

    @Override // p153l.frb
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo112444a(@NotNull CorruptionException corruptionException, @NotNull Continuation<? super T> continuation) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}

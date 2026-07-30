package p153l;

import com.p051p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "", Owner.TYPE, "", "a", "(Lkotlinx/coroutines/flow/internal/AbortFlowException;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class eui {
    /* JADX INFO: renamed from: a */
    public static final void m122570a(@NotNull AbortFlowException abortFlowException, @NotNull Object obj) {
        if (abortFlowException.owner != obj) {
            throw abortFlowException;
        }
    }
}

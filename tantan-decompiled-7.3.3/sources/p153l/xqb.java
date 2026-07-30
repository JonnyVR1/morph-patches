package p153l;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m88121d2 = {"Ll/xqb;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "h0", "a", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface xqb extends CoroutineContext.Element {

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f195797a;

    /* JADX INFO: renamed from: l.xqb$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Ll/xqb$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Ll/xqb;", "<init>", "()V", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class Companion implements CoroutineContext.Key<xqb> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f195797a = new Companion();
    }

    void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception);
}

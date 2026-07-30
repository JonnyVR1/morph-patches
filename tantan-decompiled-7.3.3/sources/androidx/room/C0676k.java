package androidx.room;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.room.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Landroidx/room/k;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/ContinuationInterceptor;", "transactionDispatcher", "<init>", "(Lkotlin/coroutines/ContinuationInterceptor;)V", "", "a", "()V", Constants.INAPP_DATA_TAG, "Lkotlin/coroutines/ContinuationInterceptor;", "c", "()Lkotlin/coroutines/ContinuationInterceptor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", Constants.KEY_KEY, "room-ktx_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C0676k implements CoroutineContext.Element {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ContinuationInterceptor transactionDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger referenceCount = new AtomicInteger(0);

    /* JADX INFO: renamed from: androidx.room.k$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Landroidx/room/k$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/room/k;", "<init>", "()V", "room-ktx_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion implements CoroutineContext.Key<C0676k> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public C0676k(@NotNull ContinuationInterceptor continuationInterceptor) {
        this.transactionDispatcher = continuationInterceptor;
    }

    /* JADX INFO: renamed from: a */
    public final void m4019a() {
        this.referenceCount.incrementAndGet();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ContinuationInterceptor getTransactionDispatcher() {
        return this.transactionDispatcher;
    }

    /* JADX INFO: renamed from: d */
    public final void m4021d() {
        if (this.referenceCount.decrementAndGet() >= 0) {
            return;
        }
        wtq0.m207906a("Transaction was never started or was already released.");
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.m88251a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.m88252b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.Key<C0676k> getKey() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.m88253c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.m88254d(this, coroutineContext);
    }
}

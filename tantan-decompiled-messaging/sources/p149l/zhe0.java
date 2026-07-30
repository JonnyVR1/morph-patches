package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m87232d2 = {"Ll/zhe0;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "value", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iterator", Constants.INAPP_DATA_TAG, "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Result;", LovePlanetStage.result, "resumeWith", "(Ljava/lang/Object;)V", "h", "", "g", "()Ljava/lang/Throwable;", "", "Lkotlin/sequences/State;", "a", "I", "state", "b", "Ljava/lang/Object;", "nextValue", "Ljava/util/Iterator;", "nextIterator", "Lkotlin/coroutines/Continuation;", "getNextStep", "()Lkotlin/coroutines/Continuation;", "j", "(Lkotlin/coroutines/Continuation;)V", "nextStep", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zhe0<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public T nextValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Iterator<? extends T> nextIterator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Continuation<? super Unit> nextStep;

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo93258c(T t, @NotNull Continuation<? super Unit> continuation) {
        this.nextValue = t;
        this.state = 3;
        this.nextStep = continuation;
        Object objM196133e = uwp.m196133e();
        if (objM196133e == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM196133e == uwp.m196133e() ? objM196133e : Unit.INSTANCE;
    }

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo93259d(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation) {
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = continuation;
        Object objM196133e = uwp.m196133e();
        if (objM196133e == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM196133e == uwp.m196133e() ? objM196133e : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final Throwable m218791g() {
        int i = this.state;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final T m218792h() {
        if (hasNext()) {
            return next();
        }
        lmr.m150601a();
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i = this.state;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m218791g();
                }
                Iterator<? extends T> it = this.nextIterator;
                it.getClass();
                if (it.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            Continuation<? super Unit> continuation = this.nextStep;
            continuation.getClass();
            this.nextStep = null;
            continuation.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m218793j(@Nullable Continuation<? super Unit> continuation) {
        this.nextStep = continuation;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i = this.state;
        if (i == 0 || i == 1) {
            return m218792h();
        }
        if (i == 2) {
            this.state = 1;
            Iterator<? extends T> it = this.nextIterator;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw m218791g();
        }
        this.state = 0;
        T t = this.nextValue;
        this.nextValue = null;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) throws Throwable {
        ResultKt.m87239b(result);
        this.state = 4;
    }
}

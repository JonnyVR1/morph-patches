package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.brb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "androidx.lifecycle.CoroutineLiveData", m88263f = "CoroutineLiveData.kt", m88264l = {226}, m88265m = "clearSource$lifecycle_livedata_release")
final class CoroutineLiveData$clearSource$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ brb<Object> this$0;

    public CoroutineLiveData$clearSource$1(brb<Object> brbVar, Continuation<? super CoroutineLiveData$clearSource$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}

package kotlin.random;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m88121d2 = {"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "<init>", "()V", "kotlin/random/FallbackThreadLocalRandom$implStorage$1", "a", "Lkotlin/random/FallbackThreadLocalRandom$implStorage$1;", "implStorage", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final FallbackThreadLocalRandom$implStorage$1 implStorage = new ThreadLocal<java.util.Random>() { // from class: kotlin.random.FallbackThreadLocalRandom$implStorage$1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    };

    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    public java.util.Random getImpl() {
        java.util.Random random = get();
        random.getClass();
        return random;
    }
}

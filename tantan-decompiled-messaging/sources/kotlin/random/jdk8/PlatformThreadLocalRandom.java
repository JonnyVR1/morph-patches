package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.random.AbstractPlatformRandom;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m87232d2 = {"Lkotlin/random/jdk8/PlatformThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "<init>", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextInt", "", "from", "until", "nextLong", "", "nextDouble", "", "kotlin-stdlib-jdk8"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    public Random getImpl() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }

    @Override // kotlin.random.Random
    public double nextDouble(double until) {
        return ThreadLocalRandom.current().nextDouble(until);
    }

    @Override // kotlin.random.Random
    public int nextInt(int from, int until) {
        return ThreadLocalRandom.current().nextInt(from, until);
    }

    @Override // kotlin.random.Random
    public long nextLong(long until) {
        return ThreadLocalRandom.current().nextLong(until);
    }

    @Override // kotlin.random.Random
    public long nextLong(long from, long until) {
        return ThreadLocalRandom.current().nextLong(from, until);
    }
}

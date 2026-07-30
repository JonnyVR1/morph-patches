package kotlin.time;

import kotlin.Metadata;
import kotlin.internal.PlatformImplementationsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, m88121d2 = {"Lkotlin/time/Instant;", "instant", "", "a", "(Lkotlin/time/Instant;)Ljava/lang/Object;", "Lkotlin/time/Clock;", "Lkotlin/time/Clock;", "getSystemClock$annotations", "()V", "systemClock", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class InstantJvmKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Clock f67334a = PlatformImplementationsKt.f64124a.mo88277c();

    @ExperimentalTime
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Object m94461a(@NotNull Instant instant) {
        instant.getClass();
        return new InstantSerialized(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
    }
}

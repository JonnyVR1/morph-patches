package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "other", "Lkotlin/time/Duration;", "e", "(Lkotlin/time/ComparableTimeMark;)J", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@WasExperimental
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static int m94397a(@NotNull ComparableTimeMark comparableTimeMark, @NotNull ComparableTimeMark comparableTimeMark2) {
            comparableTimeMark2.getClass();
            return Duration.m94418m(comparableTimeMark.mo94396e(comparableTimeMark2), Duration.INSTANCE.m94436c());
        }
    }

    /* JADX INFO: renamed from: e */
    long mo94396e(@NotNull ComparableTimeMark other);
}

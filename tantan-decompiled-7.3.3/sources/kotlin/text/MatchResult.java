package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0015J\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m88121d2 = {"Lkotlin/text/MatchResult;", "", "next", "()Lkotlin/text/MatchResult;", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "range", "Lkotlin/text/MatchGroupCollection;", "b", "()Lkotlin/text/MatchGroupCollection;", "groups", "", "", "c", "()Ljava/util/List;", "groupValues", "Lkotlin/text/MatchResult$Destructured;", "a", "()Lkotlin/text/MatchResult$Destructured;", "destructured", "Destructured", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface MatchResult {

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class DefaultImpls {
        @NotNull
        /* JADX INFO: renamed from: a */
        public static Destructured m94256a(@NotNull MatchResult matchResult) {
            return new Destructured(matchResult);
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m88121d2 = {"Lkotlin/text/MatchResult$Destructured;", "", "Lkotlin/text/MatchResult;", "match", "<init>", "(Lkotlin/text/MatchResult;)V", "a", "Lkotlin/text/MatchResult;", "()Lkotlin/text/MatchResult;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Destructured {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final MatchResult match;

        public Destructured(@NotNull MatchResult matchResult) {
            matchResult.getClass();
            this.match = matchResult;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final MatchResult getMatch() {
            return this.match;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Destructured mo94253a();

    @NotNull
    /* JADX INFO: renamed from: b */
    MatchGroupCollection mo94254b();

    @NotNull
    /* JADX INFO: renamed from: c */
    List<String> mo94255c();

    @NotNull
    IntRange getRange();

    @Nullable
    MatchResult next();
}

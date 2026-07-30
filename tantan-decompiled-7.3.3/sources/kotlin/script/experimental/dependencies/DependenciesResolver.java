package kotlin.script.experimental.dependencies;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.script.dependencies.ScriptDependenciesResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m88121d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver;", "Lkotlin/script/dependencies/ScriptDependenciesResolver;", "NoDependencies", "ResolveResult", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface DependenciesResolver extends ScriptDependenciesResolver {

    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver$NoDependencies;", "Lkotlin/script/experimental/dependencies/DependenciesResolver;", "<init>", "()V", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class NoDependencies implements DependenciesResolver {

        @NotNull
        public static final NoDependencies INSTANCE = new NoDependencies();

        private NoDependencies() {
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m88121d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult;", "", "<init>", "()V", "Failure", "Success", "Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult$Failure;", "Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult$Success;", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static abstract class ResolveResult {

        @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult$Failure;", "Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lkotlin/script/experimental/dependencies/ScriptReport;", "a", "Ljava/util/List;", "getReports", "()Ljava/util/List;", "reports", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
        public static final /* data */ class Failure extends ResolveResult {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final List<ScriptReport> reports;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.m88377d(this.reports, ((Failure) other).reports);
            }

            public int hashCode() {
                return this.reports.hashCode();
            }

            @NotNull
            public String toString() {
                return "Failure(reports=" + this.reports + ')';
            }
        }

        @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult$Success;", "Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/script/experimental/dependencies/ScriptDependencies;", "a", "Lkotlin/script/experimental/dependencies/ScriptDependencies;", "getDependencies", "()Lkotlin/script/experimental/dependencies/ScriptDependencies;", "dependencies", "", "Lkotlin/script/experimental/dependencies/ScriptReport;", "b", "Ljava/util/List;", "getReports", "()Ljava/util/List;", "reports", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
        public static final /* data */ class Success extends ResolveResult {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final ScriptDependencies dependencies;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final List<ScriptReport> reports;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.m88377d(this.dependencies, success.dependencies) && Intrinsics.m88377d(this.reports, success.reports);
            }

            public int hashCode() {
                return (this.dependencies.hashCode() * 31) + this.reports.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(dependencies=" + this.dependencies + ", reports=" + this.reports + ')';
            }
        }

        private ResolveResult() {
        }
    }
}

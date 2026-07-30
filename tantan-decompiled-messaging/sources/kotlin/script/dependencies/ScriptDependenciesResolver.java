package kotlin.script.dependencies;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m87232d2 = {"Lkotlin/script/dependencies/ScriptDependenciesResolver;", "", "ReportSeverity", "kotlin-script-runtime"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface ScriptDependenciesResolver {

    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m87232d2 = {"Lkotlin/script/dependencies/ScriptDependenciesResolver$ReportSeverity;", "", "(Ljava/lang/String;I)V", "FATAL", "ERROR", "WARNING", "INFO", "DEBUG", "kotlin-script-runtime"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public enum ReportSeverity {
        FATAL,
        ERROR,
        WARNING,
        INFO,
        DEBUG;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<ReportSeverity> getEntries() {
            return $ENTRIES;
        }
    }
}

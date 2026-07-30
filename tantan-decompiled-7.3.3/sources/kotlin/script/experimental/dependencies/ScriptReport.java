package kotlin.script.experimental.dependencies;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m88121d2 = {"Lkotlin/script/experimental/dependencies/ScriptReport;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "message", "Lkotlin/script/experimental/dependencies/ScriptReport$Severity;", "b", "Lkotlin/script/experimental/dependencies/ScriptReport$Severity;", "getSeverity", "()Lkotlin/script/experimental/dependencies/ScriptReport$Severity;", "severity", "Lkotlin/script/experimental/dependencies/ScriptReport$Position;", "c", "Lkotlin/script/experimental/dependencies/ScriptReport$Position;", "getPosition", "()Lkotlin/script/experimental/dependencies/ScriptReport$Position;", "position", "Position", "Severity", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final /* data */ class ScriptReport {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Severity severity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Position position;

    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, m88121d2 = {"Lkotlin/script/experimental/dependencies/ScriptReport$Position;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getStartLine", "startLine", "b", "getStartColumn", "startColumn", "c", "Ljava/lang/Integer;", "getEndLine", "()Ljava/lang/Integer;", "endLine", Constants.INAPP_DATA_TAG, "getEndColumn", "endColumn", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final /* data */ class Position {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int startLine;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int startColumn;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Integer endLine;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Integer endColumn;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            Position position = (Position) other;
            return this.startLine == position.startLine && this.startColumn == position.startColumn && Intrinsics.m88377d(this.endLine, position.endLine) && Intrinsics.m88377d(this.endColumn, position.endColumn);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.startLine) * 31) + Integer.hashCode(this.startColumn)) * 31;
            Integer num = this.endLine;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.endColumn;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Position(startLine=" + this.startLine + ", startColumn=" + this.startColumn + ", endLine=" + this.endLine + ", endColumn=" + this.endColumn + ')';
        }
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m88121d2 = {"Lkotlin/script/experimental/dependencies/ScriptReport$Severity;", "", "(Ljava/lang/String;I)V", "FATAL", "ERROR", "WARNING", "INFO", "DEBUG", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public enum Severity {
        FATAL,
        ERROR,
        WARNING,
        INFO,
        DEBUG;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<Severity> getEntries() {
            return $ENTRIES;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScriptReport)) {
            return false;
        }
        ScriptReport scriptReport = (ScriptReport) other;
        return Intrinsics.m88377d(this.message, scriptReport.message) && this.severity == scriptReport.severity && Intrinsics.m88377d(this.position, scriptReport.position);
    }

    public int hashCode() {
        int iHashCode = ((this.message.hashCode() * 31) + this.severity.hashCode()) * 31;
        Position position = this.position;
        return iHashCode + (position == null ? 0 : position.hashCode());
    }

    @NotNull
    public String toString() {
        return "ScriptReport(message=" + this.message + ", severity=" + this.severity + ", position=" + this.position + ')';
    }
}

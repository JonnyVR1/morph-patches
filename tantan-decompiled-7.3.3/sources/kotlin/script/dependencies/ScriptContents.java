package kotlin.script.dependencies;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m88121d2 = {"Lkotlin/script/dependencies/ScriptContents;", "", "Position", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface ScriptContents {

    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0013"}, m88121d2 = {"Lkotlin/script/dependencies/ScriptContents$Position;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getLine", "line", "b", "getCol", "col", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final /* data */ class Position {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int line;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int col;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            Position position = (Position) other;
            return this.line == position.line && this.col == position.col;
        }

        public int hashCode() {
            return (Integer.hashCode(this.line) * 31) + Integer.hashCode(this.col);
        }

        @NotNull
        public String toString() {
            return "Position(line=" + this.line + ", col=" + this.col + ')';
        }
    }
}

package javax.validation.constraints;

/* JADX INFO: loaded from: classes2.dex */
public enum Pattern$Flag {
    UNIX_LINES(1),
    CASE_INSENSITIVE(2),
    COMMENTS(4),
    MULTILINE(8),
    DOTALL(32),
    UNICODE_CASE(64),
    CANON_EQ(128);

    private final int value;

    Pattern$Flag(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}

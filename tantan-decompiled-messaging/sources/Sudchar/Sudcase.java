package Sudchar;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Sudcase extends IOException {
    public Sudcase(int i, long j) {
        super("Response code can't handled on internal " + i + " with current offset " + j);
    }
}

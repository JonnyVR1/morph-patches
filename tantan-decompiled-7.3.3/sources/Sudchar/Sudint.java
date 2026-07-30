package Sudchar;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Sudint extends IOException {
    public Sudint(long j, long j2) {
        super("There is Free space less than Require space: " + j2 + " < " + j);
    }
}

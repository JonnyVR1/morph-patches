package Sudbreak;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Suddo extends IOException {
    public Suddo(int i, long j) {
        super(j + " kb of memory would be needed; limit was " + i + " kb. If the file is not corrupt, consider increasing the memory limit.");
    }
}

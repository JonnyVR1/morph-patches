package tech.sud.logger;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class Sudint implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}

package p153l;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class clg0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}

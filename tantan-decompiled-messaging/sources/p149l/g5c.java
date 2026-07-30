package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class g5c {
    /* JADX INFO: renamed from: a */
    public static void m124484a(@Nullable a5c a5cVar) {
        if (a5cVar != null) {
            try {
                a5cVar.close();
            } catch (IOException unused) {
            }
        }
    }
}

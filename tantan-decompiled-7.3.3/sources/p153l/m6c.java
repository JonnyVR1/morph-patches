package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class m6c {
    /* JADX INFO: renamed from: a */
    public static void m157209a(@Nullable g6c g6cVar) {
        if (g6cVar != null) {
            try {
                g6cVar.close();
            } catch (IOException unused) {
            }
        }
    }
}

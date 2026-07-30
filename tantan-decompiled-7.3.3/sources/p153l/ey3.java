package p153l;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"", "", "a", "(Ljava/lang/Object;)I", "clevertap-core_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ey3 {
    /* JADX INFO: renamed from: a */
    public static final int m123168a(@Nullable Object obj) {
        if (obj instanceof Bitmap) {
            return ((Bitmap) obj).getByteCount() / 1024;
        }
        if (obj instanceof byte[]) {
            return ((byte[]) obj).length / 1024;
        }
        return 1;
    }
}

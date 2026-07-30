package p149l;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class uts0 {

    /* JADX INFO: renamed from: a */
    public final Map f178287a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f178288b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final Bitmap m195308a(Integer num) {
        return (Bitmap) this.f178287a.get(num);
    }
}

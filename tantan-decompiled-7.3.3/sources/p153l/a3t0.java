package p153l;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class a3t0 {

    /* JADX INFO: renamed from: a */
    public final Map f68317a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f68318b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final Bitmap m95869a(Integer num) {
        return (Bitmap) this.f68317a.get(num);
    }
}

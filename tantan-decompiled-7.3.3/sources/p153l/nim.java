package p153l;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nim {

    /* JADX INFO: renamed from: a */
    private final List<ImageHeaderParser> f142139a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public synchronized void m163290a(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f142139a.add(imageHeaderParser);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized List<ImageHeaderParser> m163291b() {
        return this.f142139a;
    }
}

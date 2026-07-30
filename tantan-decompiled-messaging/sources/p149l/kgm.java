package p149l;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kgm {

    /* JADX INFO: renamed from: a */
    private final List<ImageHeaderParser> f123043a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public synchronized void m145894a(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f123043a.add(imageHeaderParser);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized List<ImageHeaderParser> m145895b() {
        return this.f123043a;
    }
}

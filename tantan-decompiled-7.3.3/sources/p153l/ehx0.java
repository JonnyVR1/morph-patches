package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ehx0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Uri f94088a;

    /* JADX INFO: renamed from: b */
    public Map f94089b = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: c */
    public long f94090c;

    /* JADX INFO: renamed from: d */
    public int f94091d;

    /* JADX INFO: renamed from: a */
    public final ehx0 m120873a(int i) {
        this.f94091d = 6;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final ehx0 m120874b(Map map) {
        this.f94089b = map;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final ehx0 m120875c(long j) {
        this.f94090c = j;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final ehx0 m120876d(Uri uri) {
        this.f94088a = uri;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final akx0 m120877e() {
        if (this.f94088a != null) {
            return new akx0(this.f94088a, this.f94089b, this.f94090c, this.f94091d);
        }
        wtq0.m207906a("The uri must be set.");
        return null;
    }
}

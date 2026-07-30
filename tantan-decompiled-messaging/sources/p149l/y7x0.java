package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class y7x0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Uri f196749a;

    /* JADX INFO: renamed from: b */
    public Map f196750b = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: c */
    public long f196751c;

    /* JADX INFO: renamed from: d */
    public int f196752d;

    /* JADX INFO: renamed from: a */
    public final y7x0 m213337a(int i) {
        this.f196752d = 6;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final y7x0 m213338b(Map map) {
        this.f196750b = map;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final y7x0 m213339c(long j) {
        this.f196751c = j;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final y7x0 m213340d(Uri uri) {
        this.f196749a = uri;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final uax0 m213341e() {
        if (this.f196749a != null) {
            return new uax0(this.f196749a, this.f196750b, this.f196751c, this.f196752d);
        }
        qkq0.m175383a("The uri must be set.");
        return null;
    }
}

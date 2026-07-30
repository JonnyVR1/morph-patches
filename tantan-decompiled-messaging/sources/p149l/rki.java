package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.C2050d;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p149l.pki;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rki<T extends pki<T>> implements C2050d.a<T> {

    /* JADX INFO: renamed from: a */
    public final C2050d.a<? extends T> f159842a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final List<StreamKey> f159843b;

    public rki(C2050d.a<? extends T> aVar, @Nullable List<StreamKey> list) {
        this.f159842a = aVar;
        this.f159843b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.C2050d.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T mo11019a(Uri uri, InputStream inputStream) throws IOException {
        T tMo11019a = this.f159842a.mo11019a(uri, inputStream);
        List<StreamKey> list = this.f159843b;
        return (list == null || list.isEmpty()) ? tMo11019a : (T) tMo11019a.mo11253a(this.f159843b);
    }
}

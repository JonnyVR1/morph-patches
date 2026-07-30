package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.C2073d;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p153l.lni;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nni<T extends lni<T>> implements C2073d.a<T> {

    /* JADX INFO: renamed from: a */
    public final C2073d.a<? extends T> f142794a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final List<StreamKey> f142795b;

    public nni(C2073d.a<? extends T> aVar, @Nullable List<StreamKey> list) {
        this.f142794a = aVar;
        this.f142795b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.C2073d.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T mo11073a(Uri uri, InputStream inputStream) throws IOException {
        T tMo11073a = this.f142794a.mo11073a(uri, inputStream);
        List<StreamKey> list = this.f142795b;
        return (list == null || list.isEmpty()) ? tMo11073a : (T) tMo11073a.mo11307a(this.f142795b);
    }
}

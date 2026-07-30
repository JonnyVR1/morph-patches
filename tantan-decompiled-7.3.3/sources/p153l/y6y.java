package p153l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class y6y implements re00<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    private final Context f197723a;

    /* JADX INFO: renamed from: l.y6y$a */
    public static class C21533a implements se00<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        private final Context f197724a;

        public C21533a(Context context) {
            this.f197724a = context;
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Uri, InputStream> mo101570b(qs10 qs10Var) {
            return new y6y(this.f197724a);
        }
    }

    public y6y(Context context) {
        this.f197723a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: e */
    private boolean m214523e(u560 u560Var) {
        Long l2 = (Long) u560Var.m194542c(VideoDecoder.f4616d);
        return l2 != null && l2.longValue() == -1;
    }

    @Override // p153l.re00
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<InputStream> mo101565a(@NonNull Uri uri, int i, int i2, @NonNull u560 u560Var) {
        if (x6y.m209566d(i, i2) && m214523e(u560Var)) {
            return new re00.C19812a<>(new d950(uri), xyi0.m213625e(this.f197723a, uri));
        }
        return null;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull Uri uri) {
        return x6y.m209565c(uri);
    }
}

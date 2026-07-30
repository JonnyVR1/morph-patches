package p153l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class w6y implements re00<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    private final Context f187659a;

    /* JADX INFO: renamed from: l.w6y$a */
    public static class C21041a implements se00<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        private final Context f187660a;

        public C21041a(Context context) {
            this.f187660a = context;
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Uri, InputStream> mo101570b(qs10 qs10Var) {
            return new w6y(this.f187660a);
        }
    }

    public w6y(Context context) {
        this.f187659a = context.getApplicationContext();
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<InputStream> mo101565a(@NonNull Uri uri, int i, int i2, @NonNull u560 u560Var) {
        if (x6y.m209566d(i, i2)) {
            return new re00.C19812a<>(new d950(uri), xyi0.m213624c(this.f187659a, uri));
        }
        return null;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull Uri uri) {
        return x6y.m209563a(uri);
    }
}

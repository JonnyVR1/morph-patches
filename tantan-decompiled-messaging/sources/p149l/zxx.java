package p149l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class zxx implements i600<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    private final Context f205566a;

    /* JADX INFO: renamed from: l.zxx$a */
    public static class C21813a implements j600<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        private final Context f205567a;

        public C21813a(Context context) {
            this.f205567a = context;
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Uri, InputStream> mo103357b(gk10 gk10Var) {
            return new zxx(this.f205567a);
        }
    }

    public zxx(Context context) {
        this.f205566a = context.getApplicationContext();
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<InputStream> mo103352a(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        if (ayx.m99590d(i, i2)) {
            return new i600.C17490a<>(new o050(uri), upi0.m194879c(this.f205566a, uri));
        }
        return null;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull Uri uri) {
        return ayx.m99587a(uri);
    }
}

package p149l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class byx implements i600<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    private final Context f77991a;

    /* JADX INFO: renamed from: l.byx$a */
    public static class C16020a implements j600<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        private final Context f77992a;

        public C16020a(Context context) {
            this.f77992a = context;
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Uri, InputStream> mo103357b(gk10 gk10Var) {
            return new byx(this.f77992a);
        }
    }

    public byx(Context context) {
        this.f77991a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: e */
    private boolean m104527e(px50 px50Var) {
        Long l2 = (Long) px50Var.m171822c(u3l0.f173628d);
        return l2 != null && l2.longValue() == -1;
    }

    @Override // p149l.i600
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<InputStream> mo103352a(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        if (ayx.m99590d(i, i2) && m104527e(px50Var)) {
            return new i600.C17490a<>(new o050(uri), upi0.m194880e(this.f77991a, uri));
        }
        return null;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull Uri uri) {
        return ayx.m99589c(uri);
    }
}

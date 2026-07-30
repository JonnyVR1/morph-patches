package p153l;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class e8g0<Data> implements re00<String, Data> {

    /* JADX INFO: renamed from: a */
    private final re00<Uri, Data> f92543a;

    /* JADX INFO: renamed from: l.e8g0$a */
    public static final class C16730a implements se00<String, AssetFileDescriptor> {
        @Override // p153l.se00
        /* JADX INFO: renamed from: b */
        public re00<String, AssetFileDescriptor> mo101570b(@NonNull qs10 qs10Var) {
            return new e8g0(qs10Var.m177716d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: l.e8g0$b */
    public static class C16731b implements se00<String, ParcelFileDescriptor> {
        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<String, ParcelFileDescriptor> mo101570b(@NonNull qs10 qs10Var) {
            return new e8g0(qs10Var.m177716d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: l.e8g0$c */
    public static class C16732c implements se00<String, InputStream> {
        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<String, InputStream> mo101570b(@NonNull qs10 qs10Var) {
            return new e8g0(qs10Var.m177716d(Uri.class, InputStream.class));
        }
    }

    public e8g0(re00<Uri, Data> re00Var) {
        this.f92543a = re00Var;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    private static Uri m119815e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m119816f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m119816f(str) : uri;
    }

    /* JADX INFO: renamed from: f */
    private static Uri m119816f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<Data> mo101565a(@NonNull String str, int i, int i2, @NonNull u560 u560Var) {
        Uri uriM119815e = m119815e(str);
        if (uriM119815e == null || !this.f92543a.mo101566b(uriM119815e)) {
            return null;
        }
        return this.f92543a.mo101565a(uriM119815e, i, i2, u560Var);
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull String str) {
        return true;
    }
}

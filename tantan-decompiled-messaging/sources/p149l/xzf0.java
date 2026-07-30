package p149l;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class xzf0<Data> implements i600<String, Data> {

    /* JADX INFO: renamed from: a */
    private final i600<Uri, Data> f195196a;

    /* JADX INFO: renamed from: l.xzf0$a */
    public static final class C21265a implements j600<String, AssetFileDescriptor> {
        @Override // p149l.j600
        /* JADX INFO: renamed from: b */
        public i600<String, AssetFileDescriptor> mo103357b(@NonNull gk10 gk10Var) {
            return new xzf0(gk10Var.m126584d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: l.xzf0$b */
    public static class C21266b implements j600<String, ParcelFileDescriptor> {
        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<String, ParcelFileDescriptor> mo103357b(@NonNull gk10 gk10Var) {
            return new xzf0(gk10Var.m126584d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: l.xzf0$c */
    public static class C21267c implements j600<String, InputStream> {
        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<String, InputStream> mo103357b(@NonNull gk10 gk10Var) {
            return new xzf0(gk10Var.m126584d(Uri.class, InputStream.class));
        }
    }

    public xzf0(i600<Uri, Data> i600Var) {
        this.f195196a = i600Var;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    private static Uri m211988e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m211989f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m211989f(str) : uri;
    }

    /* JADX INFO: renamed from: f */
    private static Uri m211989f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<Data> mo103352a(@NonNull String str, int i, int i2, @NonNull px50 px50Var) {
        Uri uriM211988e = m211988e(str);
        if (uriM211988e == null || !this.f195196a.mo103353b(uriM211988e)) {
            return null;
        }
        return this.f195196a.mo103352a(uriM211988e, i, i2, px50Var);
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull String str) {
        return true;
    }
}

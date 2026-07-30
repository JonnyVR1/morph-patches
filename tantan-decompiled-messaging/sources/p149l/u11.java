package p149l;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class u11<Data> implements i600<Uri, Data> {

    /* JADX INFO: renamed from: c */
    private static final int f172960c = 22;

    /* JADX INFO: renamed from: a */
    private final AssetManager f172961a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC20332a<Data> f172962b;

    /* JADX INFO: renamed from: l.u11$a */
    public interface InterfaceC20332a<Data> {
        /* JADX INFO: renamed from: a */
        l4c<Data> mo191402a(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: l.u11$b */
    public static class C20333b implements j600<Uri, ParcelFileDescriptor>, InterfaceC20332a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final AssetManager f172963a;

        public C20333b(AssetManager assetManager) {
            this.f172963a = assetManager;
        }

        @Override // p149l.u11.InterfaceC20332a
        /* JADX INFO: renamed from: a */
        public l4c<ParcelFileDescriptor> mo191402a(AssetManager assetManager, String str) {
            return new tfi(assetManager, str);
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Uri, ParcelFileDescriptor> mo103357b(gk10 gk10Var) {
            return new u11(this.f172963a, this);
        }
    }

    /* JADX INFO: renamed from: l.u11$c */
    public static class C20334c implements j600<Uri, InputStream>, InterfaceC20332a<InputStream> {

        /* JADX INFO: renamed from: a */
        private final AssetManager f172964a;

        public C20334c(AssetManager assetManager) {
            this.f172964a = assetManager;
        }

        @Override // p149l.u11.InterfaceC20332a
        /* JADX INFO: renamed from: a */
        public l4c<InputStream> mo191402a(AssetManager assetManager, String str) {
            return new bzf0(assetManager, str);
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Uri, InputStream> mo103357b(gk10 gk10Var) {
            return new u11(this.f172964a, this);
        }
    }

    public u11(AssetManager assetManager, InterfaceC20332a<Data> interfaceC20332a) {
        this.f172961a = assetManager;
        this.f172962b = interfaceC20332a;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<Data> mo103352a(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        return new i600.C17490a<>(new o050(uri), this.f172962b.mo191402a(this.f172961a, uri.toString().substring(f172960c)));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}

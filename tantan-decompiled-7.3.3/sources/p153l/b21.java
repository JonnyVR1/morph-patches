package p153l;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class b21<Data> implements re00<Uri, Data> {

    /* JADX INFO: renamed from: c */
    private static final int f74448c = 22;

    /* JADX INFO: renamed from: a */
    private final AssetManager f74449a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC15891a<Data> f74450b;

    /* JADX INFO: renamed from: l.b21$a */
    public interface InterfaceC15891a<Data> {
        /* JADX INFO: renamed from: a */
        t5c<Data> mo101569a(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: l.b21$b */
    public static class C15892b implements se00<Uri, AssetFileDescriptor>, InterfaceC15891a<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final AssetManager f74451a;

        public C15892b(AssetManager assetManager) {
            this.f74451a = assetManager;
        }

        @Override // p153l.b21.InterfaceC15891a
        /* JADX INFO: renamed from: a */
        public t5c<AssetFileDescriptor> mo101569a(AssetManager assetManager, String str) {
            return new qii(assetManager, str);
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Uri, AssetFileDescriptor> mo101570b(qs10 qs10Var) {
            return new b21(this.f74451a, this);
        }
    }

    /* JADX INFO: renamed from: l.b21$c */
    public static class C15893c implements se00<Uri, InputStream>, InterfaceC15891a<InputStream> {

        /* JADX INFO: renamed from: a */
        private final AssetManager f74452a;

        public C15893c(AssetManager assetManager) {
            this.f74452a = assetManager;
        }

        @Override // p153l.b21.InterfaceC15891a
        /* JADX INFO: renamed from: a */
        public t5c<InputStream> mo101569a(AssetManager assetManager, String str) {
            return new i7g0(assetManager, str);
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Uri, InputStream> mo101570b(qs10 qs10Var) {
            return new b21(this.f74452a, this);
        }
    }

    public b21(AssetManager assetManager, InterfaceC15891a<Data> interfaceC15891a) {
        this.f74449a = assetManager;
        this.f74450b = interfaceC15891a;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<Data> mo101565a(@NonNull Uri uri, int i, int i2, @NonNull u560 u560Var) {
        return new re00.C19812a<>(new d950(uri), this.f74450b.mo101569a(this.f74449a, uri.toString().substring(f74448c)));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}

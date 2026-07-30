package p153l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e4k0<Data> implements re00<Uri, Data> {

    /* JADX INFO: renamed from: b */
    private static final Set<String> f92109b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: a */
    private final InterfaceC16714c<Data> f92110a;

    /* JADX INFO: renamed from: l.e4k0$a */
    public static final class C16712a implements se00<Uri, AssetFileDescriptor>, InterfaceC16714c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final ContentResolver f92111a;

        public C16712a(ContentResolver contentResolver) {
            this.f92111a = contentResolver;
        }

        @Override // p153l.e4k0.InterfaceC16714c
        /* JADX INFO: renamed from: a */
        public t5c<AssetFileDescriptor> mo119438a(Uri uri) {
            return new z11(this.f92111a, uri);
        }

        @Override // p153l.se00
        /* JADX INFO: renamed from: b */
        public re00<Uri, AssetFileDescriptor> mo101570b(qs10 qs10Var) {
            return new e4k0(this);
        }
    }

    /* JADX INFO: renamed from: l.e4k0$b */
    public static class C16713b implements se00<Uri, ParcelFileDescriptor>, InterfaceC16714c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final ContentResolver f92112a;

        public C16713b(ContentResolver contentResolver) {
            this.f92112a = contentResolver;
        }

        @Override // p153l.e4k0.InterfaceC16714c
        /* JADX INFO: renamed from: a */
        public t5c<ParcelFileDescriptor> mo119438a(Uri uri) {
            return new rii(this.f92112a, uri);
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Uri, ParcelFileDescriptor> mo101570b(qs10 qs10Var) {
            return new e4k0(this);
        }
    }

    /* JADX INFO: renamed from: l.e4k0$c */
    public interface InterfaceC16714c<Data> {
        /* JADX INFO: renamed from: a */
        t5c<Data> mo119438a(Uri uri);
    }

    /* JADX INFO: renamed from: l.e4k0$d */
    public static class C16715d implements se00<Uri, InputStream>, InterfaceC16714c<InputStream> {

        /* JADX INFO: renamed from: a */
        private final ContentResolver f92113a;

        public C16715d(ContentResolver contentResolver) {
            this.f92113a = contentResolver;
        }

        @Override // p153l.e4k0.InterfaceC16714c
        /* JADX INFO: renamed from: a */
        public t5c<InputStream> mo119438a(Uri uri) {
            return new n7g0(this.f92113a, uri);
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Uri, InputStream> mo101570b(qs10 qs10Var) {
            return new e4k0(this);
        }
    }

    public e4k0(InterfaceC16714c<Data> interfaceC16714c) {
        this.f92110a = interfaceC16714c;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<Data> mo101565a(@NonNull Uri uri, int i, int i2, @NonNull u560 u560Var) {
        return new re00.C19812a<>(new d950(uri), this.f92110a.mo119438a(uri));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull Uri uri) {
        return f92109b.contains(uri.getScheme());
    }
}

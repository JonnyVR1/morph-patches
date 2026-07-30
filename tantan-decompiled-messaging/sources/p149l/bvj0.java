package p149l;

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
public class bvj0<Data> implements i600<Uri, Data> {

    /* JADX INFO: renamed from: b */
    private static final Set<String> f77452b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: a */
    private final InterfaceC15984c<Data> f77453a;

    /* JADX INFO: renamed from: l.bvj0$a */
    public static final class C15982a implements j600<Uri, AssetFileDescriptor>, InterfaceC15984c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final ContentResolver f77454a;

        public C15982a(ContentResolver contentResolver) {
            this.f77454a = contentResolver;
        }

        @Override // p149l.bvj0.InterfaceC15984c
        /* JADX INFO: renamed from: a */
        public l4c<AssetFileDescriptor> mo104043a(Uri uri) {
            return new s11(this.f77454a, uri);
        }

        @Override // p149l.j600
        /* JADX INFO: renamed from: b */
        public i600<Uri, AssetFileDescriptor> mo103357b(gk10 gk10Var) {
            return new bvj0(this);
        }
    }

    /* JADX INFO: renamed from: l.bvj0$b */
    public static class C15983b implements j600<Uri, ParcelFileDescriptor>, InterfaceC15984c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final ContentResolver f77455a;

        public C15983b(ContentResolver contentResolver) {
            this.f77455a = contentResolver;
        }

        @Override // p149l.bvj0.InterfaceC15984c
        /* JADX INFO: renamed from: a */
        public l4c<ParcelFileDescriptor> mo104043a(Uri uri) {
            return new ufi(this.f77455a, uri);
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Uri, ParcelFileDescriptor> mo103357b(gk10 gk10Var) {
            return new bvj0(this);
        }
    }

    /* JADX INFO: renamed from: l.bvj0$c */
    public interface InterfaceC15984c<Data> {
        /* JADX INFO: renamed from: a */
        l4c<Data> mo104043a(Uri uri);
    }

    /* JADX INFO: renamed from: l.bvj0$d */
    public static class C15985d implements j600<Uri, InputStream>, InterfaceC15984c<InputStream> {

        /* JADX INFO: renamed from: a */
        private final ContentResolver f77456a;

        public C15985d(ContentResolver contentResolver) {
            this.f77456a = contentResolver;
        }

        @Override // p149l.bvj0.InterfaceC15984c
        /* JADX INFO: renamed from: a */
        public l4c<InputStream> mo104043a(Uri uri) {
            return new gzf0(this.f77456a, uri);
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Uri, InputStream> mo103357b(gk10 gk10Var) {
            return new bvj0(this);
        }
    }

    public bvj0(InterfaceC15984c<Data> interfaceC15984c) {
        this.f77453a = interfaceC15984c;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<Data> mo103352a(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        return new i600.C17490a<>(new o050(uri), this.f77453a.mo104043a(uri));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull Uri uri) {
        return f77452b.contains(uri.getScheme());
    }
}

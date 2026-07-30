package p149l;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class yfi<Data> implements i600<File, Data> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC21392d<Data> f198065a;

    /* JADX INFO: renamed from: l.yfi$a */
    public static class C21389a<Data> implements j600<File, Data> {

        /* JADX INFO: renamed from: a */
        private final InterfaceC21392d<Data> f198066a;

        public C21389a(InterfaceC21392d<Data> interfaceC21392d) {
            this.f198066a = interfaceC21392d;
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public final i600<File, Data> mo103357b(@NonNull gk10 gk10Var) {
            return new yfi(this.f198066a);
        }
    }

    /* JADX INFO: renamed from: l.yfi$b */
    public static class C21390b extends C21389a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: l.yfi$b$a */
        public class a implements InterfaceC21392d<ParcelFileDescriptor> {
            @Override // p149l.yfi.InterfaceC21392d
            /* JADX INFO: renamed from: a */
            public Class<ParcelFileDescriptor> mo214554a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p149l.yfi.InterfaceC21392d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo214555b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p149l.yfi.InterfaceC21392d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo214556c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C21390b() {
            super(new a());
        }
    }

    /* JADX INFO: renamed from: l.yfi$d */
    public interface InterfaceC21392d<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo214554a();

        /* JADX INFO: renamed from: b */
        void mo214555b(Data data) throws IOException;

        /* JADX INFO: renamed from: c */
        Data mo214556c(File file) throws FileNotFoundException;
    }

    /* JADX INFO: renamed from: l.yfi$e */
    public static class C21393e extends C21389a<InputStream> {

        /* JADX INFO: renamed from: l.yfi$e$a */
        public class a implements InterfaceC21392d<InputStream> {
            @Override // p149l.yfi.InterfaceC21392d
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo214554a() {
                return InputStream.class;
            }

            @Override // p149l.yfi.InterfaceC21392d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo214555b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p149l.yfi.InterfaceC21392d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo214556c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C21393e() {
            super(new a());
        }
    }

    public yfi(InterfaceC21392d<Data> interfaceC21392d) {
        this.f198065a = interfaceC21392d;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<Data> mo103352a(@NonNull File file, int i, int i2, @NonNull px50 px50Var) {
        return new i600.C17490a<>(new o050(file), new C21391c(file, this.f198065a));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull File file) {
        return true;
    }

    /* JADX INFO: renamed from: l.yfi$c */
    public static final class C21391c<Data> implements l4c<Data> {

        /* JADX INFO: renamed from: a */
        private final File f198067a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC21392d<Data> f198068b;

        /* JADX INFO: renamed from: c */
        private Data f198069c;

        public C21391c(File file, InterfaceC21392d<Data> interfaceC21392d) {
            this.f198067a = file;
            this.f198068b = interfaceC21392d;
        }

        @Override // p149l.l4c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo103356a() {
            return this.f198068b.mo214554a();
        }

        @Override // p149l.l4c
        public void cleanup() {
            Data data = this.f198069c;
            if (data != null) {
                try {
                    this.f198068b.mo214555b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // p149l.l4c
        /* JADX INFO: renamed from: d */
        public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super Data> interfaceC18148a) {
            try {
                Data dataMo214556c = this.f198068b.mo214556c(this.f198067a);
                this.f198069c = dataMo214556c;
                interfaceC18148a.mo5407b(dataMo214556c);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
                interfaceC18148a.mo5408c(e);
            }
        }

        @Override // p149l.l4c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // p149l.l4c
        public void cancel() {
        }
    }
}

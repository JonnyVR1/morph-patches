package p153l;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class vii<Data> implements re00<File, Data> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC20840d<Data> f184244a;

    /* JADX INFO: renamed from: l.vii$a */
    public static class C20837a<Data> implements se00<File, Data> {

        /* JADX INFO: renamed from: a */
        private final InterfaceC20840d<Data> f184245a;

        public C20837a(InterfaceC20840d<Data> interfaceC20840d) {
            this.f184245a = interfaceC20840d;
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public final re00<File, Data> mo101570b(@NonNull qs10 qs10Var) {
            return new vii(this.f184245a);
        }
    }

    /* JADX INFO: renamed from: l.vii$b */
    public static class C20838b extends C20837a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: l.vii$b$a */
        public class a implements InterfaceC20840d<ParcelFileDescriptor> {
            @Override // p153l.vii.InterfaceC20840d
            /* JADX INFO: renamed from: a */
            public Class<ParcelFileDescriptor> mo201350a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p153l.vii.InterfaceC20840d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo201351b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p153l.vii.InterfaceC20840d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo201352c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY);
            }
        }

        public C20838b() {
            super(new a());
        }
    }

    /* JADX INFO: renamed from: l.vii$d */
    public interface InterfaceC20840d<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo201350a();

        /* JADX INFO: renamed from: b */
        void mo201351b(Data data) throws IOException;

        /* JADX INFO: renamed from: c */
        Data mo201352c(File file) throws FileNotFoundException;
    }

    /* JADX INFO: renamed from: l.vii$e */
    public static class C20841e extends C20837a<InputStream> {

        /* JADX INFO: renamed from: l.vii$e$a */
        public class a implements InterfaceC20840d<InputStream> {
            @Override // p153l.vii.InterfaceC20840d
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo201350a() {
                return InputStream.class;
            }

            @Override // p153l.vii.InterfaceC20840d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo201351b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p153l.vii.InterfaceC20840d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo201352c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C20841e() {
            super(new a());
        }
    }

    public vii(InterfaceC20840d<Data> interfaceC20840d) {
        this.f184244a = interfaceC20840d;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<Data> mo101565a(@NonNull File file, int i, int i2, @NonNull u560 u560Var) {
        return new re00.C19812a<>(new d950(file), new C20839c(file, this.f184244a));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull File file) {
        return true;
    }

    /* JADX INFO: renamed from: l.vii$c */
    public static final class C20839c<Data> implements t5c<Data> {

        /* JADX INFO: renamed from: a */
        private final File f184246a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC20840d<Data> f184247b;

        /* JADX INFO: renamed from: c */
        private Data f184248c;

        public C20839c(File file, InterfaceC20840d<Data> interfaceC20840d) {
            this.f184246a = file;
            this.f184247b = interfaceC20840d;
        }

        @Override // p153l.t5c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo106029a() {
            return this.f184247b.mo201350a();
        }

        @Override // p153l.t5c
        public void cleanup() {
            Data data = this.f184248c;
            if (data != null) {
                try {
                    this.f184247b.mo201351b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // p153l.t5c
        /* JADX INFO: renamed from: d */
        public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super Data> interfaceC20239a) {
            try {
                Data dataMo201352c = this.f184247b.mo201352c(this.f184246a);
                this.f184248c = dataMo201352c;
                interfaceC20239a.mo5432b(dataMo201352c);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
                interfaceC20239a.mo5433c(e);
            }
        }

        @Override // p153l.t5c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // p153l.t5c
        public void cancel() {
        }
    }
}

package p149l;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class up3<Data> implements i600<byte[], Data> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC20474b<Data> f177570a;

    /* JADX INFO: renamed from: l.up3$a */
    public static class C20473a implements j600<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: l.up3$a$a */
        public class a implements InterfaceC20474b<ByteBuffer> {
            public a() {
            }

            @Override // p149l.up3.InterfaceC20474b
            /* JADX INFO: renamed from: a */
            public Class<ByteBuffer> mo194599a() {
                return ByteBuffer.class;
            }

            @Override // p149l.up3.InterfaceC20474b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo194600b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<byte[], ByteBuffer> mo103357b(@NonNull gk10 gk10Var) {
            return new up3(new a());
        }
    }

    /* JADX INFO: renamed from: l.up3$b */
    public interface InterfaceC20474b<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo194599a();

        /* JADX INFO: renamed from: b */
        Data mo194600b(byte[] bArr);
    }

    /* JADX INFO: renamed from: l.up3$d */
    public static class C20476d implements j600<byte[], InputStream> {

        /* JADX INFO: renamed from: l.up3$d$a */
        public class a implements InterfaceC20474b<InputStream> {
            public a() {
            }

            @Override // p149l.up3.InterfaceC20474b
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo194599a() {
                return InputStream.class;
            }

            @Override // p149l.up3.InterfaceC20474b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo194600b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<byte[], InputStream> mo103357b(@NonNull gk10 gk10Var) {
            return new up3(new a());
        }
    }

    public up3(InterfaceC20474b<Data> interfaceC20474b) {
        this.f177570a = interfaceC20474b;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<Data> mo103352a(@NonNull byte[] bArr, int i, int i2, @NonNull px50 px50Var) {
        return new i600.C17490a<>(new o050(bArr), new C20475c(bArr, this.f177570a));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull byte[] bArr) {
        return true;
    }

    /* JADX INFO: renamed from: l.up3$c */
    public static class C20475c<Data> implements l4c<Data> {

        /* JADX INFO: renamed from: a */
        private final byte[] f177572a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC20474b<Data> f177573b;

        public C20475c(byte[] bArr, InterfaceC20474b<Data> interfaceC20474b) {
            this.f177572a = bArr;
            this.f177573b = interfaceC20474b;
        }

        @Override // p149l.l4c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo103356a() {
            return this.f177573b.mo194599a();
        }

        @Override // p149l.l4c
        /* JADX INFO: renamed from: d */
        public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super Data> interfaceC18148a) {
            interfaceC18148a.mo5407b(this.f177573b.mo194600b(this.f177572a));
        }

        @Override // p149l.l4c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // p149l.l4c
        public void cancel() {
        }

        @Override // p149l.l4c
        public void cleanup() {
        }
    }
}

package p153l;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class uq3<Data> implements re00<byte[], Data> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC20622b<Data> f180346a;

    /* JADX INFO: renamed from: l.uq3$a */
    public static class C20621a implements se00<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: l.uq3$a$a */
        public class a implements InterfaceC20622b<ByteBuffer> {
            public a() {
            }

            @Override // p153l.uq3.InterfaceC20622b
            /* JADX INFO: renamed from: a */
            public Class<ByteBuffer> mo197212a() {
                return ByteBuffer.class;
            }

            @Override // p153l.uq3.InterfaceC20622b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo197213b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<byte[], ByteBuffer> mo101570b(@NonNull qs10 qs10Var) {
            return new uq3(new a());
        }
    }

    /* JADX INFO: renamed from: l.uq3$b */
    public interface InterfaceC20622b<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo197212a();

        /* JADX INFO: renamed from: b */
        Data mo197213b(byte[] bArr);
    }

    /* JADX INFO: renamed from: l.uq3$d */
    public static class C20624d implements se00<byte[], InputStream> {

        /* JADX INFO: renamed from: l.uq3$d$a */
        public class a implements InterfaceC20622b<InputStream> {
            public a() {
            }

            @Override // p153l.uq3.InterfaceC20622b
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo197212a() {
                return InputStream.class;
            }

            @Override // p153l.uq3.InterfaceC20622b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo197213b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<byte[], InputStream> mo101570b(@NonNull qs10 qs10Var) {
            return new uq3(new a());
        }
    }

    public uq3(InterfaceC20622b<Data> interfaceC20622b) {
        this.f180346a = interfaceC20622b;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<Data> mo101565a(@NonNull byte[] bArr, int i, int i2, @NonNull u560 u560Var) {
        return new re00.C19812a<>(new d950(bArr), new C20623c(bArr, this.f180346a));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull byte[] bArr) {
        return true;
    }

    /* JADX INFO: renamed from: l.uq3$c */
    public static class C20623c<Data> implements t5c<Data> {

        /* JADX INFO: renamed from: a */
        private final byte[] f180348a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC20622b<Data> f180349b;

        public C20623c(byte[] bArr, InterfaceC20622b<Data> interfaceC20622b) {
            this.f180348a = bArr;
            this.f180349b = interfaceC20622b;
        }

        @Override // p153l.t5c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo106029a() {
            return this.f180349b.mo197212a();
        }

        @Override // p153l.t5c
        /* JADX INFO: renamed from: d */
        public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super Data> interfaceC20239a) {
            interfaceC20239a.mo5432b(this.f180349b.mo197213b(this.f180348a));
        }

        @Override // p153l.t5c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // p153l.t5c
        public void cancel() {
        }

        @Override // p153l.t5c
        public void cleanup() {
        }
    }
}

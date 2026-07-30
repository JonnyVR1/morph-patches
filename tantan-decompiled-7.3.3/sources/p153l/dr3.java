package p153l;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.InterfaceC1064a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class dr3 implements InterfaceC1064a<ByteBuffer> {

    /* JADX INFO: renamed from: a */
    private final ByteBuffer f90354a;

    /* JADX INFO: renamed from: l.dr3$a */
    public static class C16608a implements InterfaceC1064a.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.InterfaceC1064a.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo5371a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1064a.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC1064a<ByteBuffer> mo5372b(ByteBuffer byteBuffer) {
            return new dr3(byteBuffer);
        }
    }

    public dr3(ByteBuffer byteBuffer) {
        this.f90354a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1064a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo5369a() {
        this.f90354a.position(0);
        return this.f90354a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1064a
    public void cleanup() {
    }
}

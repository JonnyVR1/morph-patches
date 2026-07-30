package p149l;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class dq3 implements x4c<ByteBuffer> {

    /* JADX INFO: renamed from: a */
    private final ByteBuffer f87381a;

    /* JADX INFO: renamed from: l.dq3$a */
    public static class C16432a implements x4c.InterfaceC21025a<ByteBuffer> {
        @Override // p149l.x4c.InterfaceC21025a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo112977a() {
            return ByteBuffer.class;
        }

        @Override // p149l.x4c.InterfaceC21025a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public x4c<ByteBuffer> mo112978b(ByteBuffer byteBuffer) {
            return new dq3(byteBuffer);
        }
    }

    public dq3(ByteBuffer byteBuffer) {
        this.f87381a = byteBuffer;
    }

    @Override // p149l.x4c
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo112975a() {
        this.f87381a.position(0);
        return this.f87381a;
    }

    @Override // p149l.x4c
    public void cleanup() {
    }
}

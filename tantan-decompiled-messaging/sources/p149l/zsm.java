package p149l;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zsm implements x4c<InputStream> {

    /* JADX INFO: renamed from: a */
    private final RecyclableBufferedInputStream f204610a;

    /* JADX INFO: renamed from: l.zsm$a */
    public static final class C21760a implements x4c.InterfaceC21025a<InputStream> {

        /* JADX INFO: renamed from: a */
        private final h01 f204611a;

        public C21760a(h01 h01Var) {
            this.f204611a = h01Var;
        }

        @Override // p149l.x4c.InterfaceC21025a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<InputStream> mo112977a() {
            return InputStream.class;
        }

        @Override // p149l.x4c.InterfaceC21025a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public x4c<InputStream> mo112978b(InputStream inputStream) {
            return new zsm(inputStream, this.f204611a);
        }
    }

    public zsm(InputStream inputStream, h01 h01Var) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, h01Var);
        this.f204610a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    /* JADX INFO: renamed from: b */
    public void m220041b() {
        this.f204610a.m5519k();
    }

    @Override // p149l.x4c
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream mo112975a() throws IOException {
        this.f204610a.reset();
        return this.f204610a;
    }

    @Override // p149l.x4c
    public void cleanup() {
        this.f204610a.release();
    }
}

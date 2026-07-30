package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class br3 implements re00<File, ByteBuffer> {

    /* JADX INFO: renamed from: l.br3$b */
    public static class C16091b implements se00<File, ByteBuffer> {
        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<File, ByteBuffer> mo101570b(@NonNull qs10 qs10Var) {
            return new br3();
        }
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<ByteBuffer> mo101565a(@NonNull File file, int i, int i2, @NonNull u560 u560Var) {
        return new re00.C19812a<>(new d950(file), new C16090a(file));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull File file) {
        return true;
    }

    /* JADX INFO: renamed from: l.br3$a */
    public static final class C16090a implements t5c<ByteBuffer> {

        /* JADX INFO: renamed from: a */
        private final File f77976a;

        public C16090a(File file) {
            this.f77976a = file;
        }

        @Override // p153l.t5c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo106029a() {
            return ByteBuffer.class;
        }

        @Override // p153l.t5c
        /* JADX INFO: renamed from: d */
        public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super ByteBuffer> interfaceC20239a) {
            try {
                interfaceC20239a.mo5432b(er3.m122094a(this.f77976a));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
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

        @Override // p153l.t5c
        public void cleanup() {
        }
    }
}

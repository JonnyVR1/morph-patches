package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class bq3 implements i600<File, ByteBuffer> {

    /* JADX INFO: renamed from: l.bq3$b */
    public static class C15942b implements j600<File, ByteBuffer> {
        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<File, ByteBuffer> mo103357b(@NonNull gk10 gk10Var) {
            return new bq3();
        }
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<ByteBuffer> mo103352a(@NonNull File file, int i, int i2, @NonNull px50 px50Var) {
        return new i600.C17490a<>(new o050(file), new C15941a(file));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull File file) {
        return true;
    }

    /* JADX INFO: renamed from: l.bq3$a */
    public static final class C15941a implements l4c<ByteBuffer> {

        /* JADX INFO: renamed from: a */
        private final File f76751a;

        public C15941a(File file) {
            this.f76751a = file;
        }

        @Override // p149l.l4c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo103356a() {
            return ByteBuffer.class;
        }

        @Override // p149l.l4c
        /* JADX INFO: renamed from: d */
        public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super ByteBuffer> interfaceC18148a) {
            try {
                interfaceC18148a.mo5407b(eq3.m117702a(this.f76751a));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
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

        @Override // p149l.l4c
        public void cleanup() {
        }
    }
}

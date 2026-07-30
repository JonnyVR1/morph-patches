package p149l;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class p5c<Model, Data> implements i600<Model, Data> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC19134a<Data> f147277a;

    /* JADX INFO: renamed from: l.p5c$a */
    public interface InterfaceC19134a<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo167468a();

        /* JADX INFO: renamed from: b */
        void mo167469b(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;
    }

    /* JADX INFO: renamed from: l.p5c$c */
    public static final class C19136c<Model> implements j600<Model, InputStream> {

        /* JADX INFO: renamed from: a */
        private final InterfaceC19134a<InputStream> f147281a = new a();

        /* JADX INFO: renamed from: l.p5c$c$a */
        public class a implements InterfaceC19134a<InputStream> {
            public a() {
            }

            @Override // p149l.p5c.InterfaceC19134a
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo167468a() {
                return InputStream.class;
            }

            @Override // p149l.p5c.InterfaceC19134a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo167469b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p149l.p5c.InterfaceC19134a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream decode(String str) {
                if (!str.startsWith("data:image")) {
                    ig3.m135964a("Not a valid image data URL.");
                    return null;
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    ig3.m135964a("Missing comma in data URL.");
                    return null;
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                ig3.m135964a("Not a base64 image data URL.");
                return null;
            }
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Model, InputStream> mo103357b(@NonNull gk10 gk10Var) {
            return new p5c(this.f147281a);
        }
    }

    public p5c(InterfaceC19134a<Data> interfaceC19134a) {
        this.f147277a = interfaceC19134a;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: a */
    public i600.C17490a<Data> mo103352a(@NonNull Model model, int i, int i2, @NonNull px50 px50Var) {
        return new i600.C17490a<>(new o050(model), new C19135b(model.toString(), this.f147277a));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: b */
    public boolean mo103353b(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    /* JADX INFO: renamed from: l.p5c$b */
    public static final class C19135b<Data> implements l4c<Data> {

        /* JADX INFO: renamed from: a */
        private final String f147278a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC19134a<Data> f147279b;

        /* JADX INFO: renamed from: c */
        private Data f147280c;

        public C19135b(String str, InterfaceC19134a<Data> interfaceC19134a) {
            this.f147278a = str;
            this.f147279b = interfaceC19134a;
        }

        @Override // p149l.l4c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo103356a() {
            return this.f147279b.mo167468a();
        }

        @Override // p149l.l4c
        public void cleanup() {
            try {
                this.f147279b.mo167469b(this.f147280c);
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [Data, java.lang.Object] */
        @Override // p149l.l4c
        /* JADX INFO: renamed from: d */
        public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super Data> interfaceC18148a) {
            try {
                Data dataDecode = this.f147279b.decode(this.f147278a);
                this.f147280c = dataDecode;
                interfaceC18148a.mo5407b(dataDecode);
            } catch (IllegalArgumentException e) {
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

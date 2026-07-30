package p153l;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class v6c<Model, Data> implements re00<Model, Data> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC20769a<Data> f182628a;

    /* JADX INFO: renamed from: l.v6c$a */
    public interface InterfaceC20769a<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo200047a();

        /* JADX INFO: renamed from: b */
        void mo200048b(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;
    }

    /* JADX INFO: renamed from: l.v6c$c */
    public static final class C20771c<Model> implements se00<Model, InputStream> {

        /* JADX INFO: renamed from: a */
        private final InterfaceC20769a<InputStream> f182632a = new a();

        /* JADX INFO: renamed from: l.v6c$c$a */
        public class a implements InterfaceC20769a<InputStream> {
            public a() {
            }

            @Override // p153l.v6c.InterfaceC20769a
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo200047a() {
                return InputStream.class;
            }

            @Override // p153l.v6c.InterfaceC20769a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo200048b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p153l.v6c.InterfaceC20769a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream decode(String str) {
                if (!str.startsWith("data:image")) {
                    wg3.m206174a("Not a valid image data URL.");
                    return null;
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    wg3.m206174a("Missing comma in data URL.");
                    return null;
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                wg3.m206174a("Not a base64 image data URL.");
                return null;
            }
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Model, InputStream> mo101570b(@NonNull qs10 qs10Var) {
            return new v6c(this.f182632a);
        }
    }

    public v6c(InterfaceC20769a<Data> interfaceC20769a) {
        this.f182628a = interfaceC20769a;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: a */
    public re00.C19812a<Data> mo101565a(@NonNull Model model, int i, int i2, @NonNull u560 u560Var) {
        return new re00.C19812a<>(new d950(model), new C20770b(model.toString(), this.f182628a));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: b */
    public boolean mo101566b(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    /* JADX INFO: renamed from: l.v6c$b */
    public static final class C20770b<Data> implements t5c<Data> {

        /* JADX INFO: renamed from: a */
        private final String f182629a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC20769a<Data> f182630b;

        /* JADX INFO: renamed from: c */
        private Data f182631c;

        public C20770b(String str, InterfaceC20769a<Data> interfaceC20769a) {
            this.f182629a = str;
            this.f182630b = interfaceC20769a;
        }

        @Override // p153l.t5c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo106029a() {
            return this.f182630b.mo200047a();
        }

        @Override // p153l.t5c
        public void cleanup() {
            try {
                this.f182630b.mo200048b(this.f182631c);
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [Data, java.lang.Object] */
        @Override // p153l.t5c
        /* JADX INFO: renamed from: d */
        public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super Data> interfaceC20239a) {
            try {
                Data dataDecode = this.f182630b.decode(this.f182629a);
                this.f182631c = dataDecode;
                interfaceC20239a.mo5432b(dataDecode);
            } catch (IllegalArgumentException e) {
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

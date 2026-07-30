package p007l;

import com.fasterxml.jackson.core.JsonParseException;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import l.v9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class qiq<T> extends ggi<T> {

    /* JADX INFO: renamed from: k */
    public final JsonAdapter<T> f3955k;

    /* JADX INFO: renamed from: l */
    public v9j<T> f3956l;

    public qiq(ggi.InterfaceC0552b<String> interfaceC0552b, int i, JsonAdapter<T> jsonAdapter, v9j<T> v9jVar) {
        this(interfaceC0552b.getFileName(), i, jsonAdapter, v9jVar);
    }

    @Override // p007l.ggi
    /* JADX INFO: renamed from: e */
    public T mo9258e(FileInputStream fileInputStream) throws IOException {
        try {
            return (T) this.f3955k.parse(fileInputStream);
        } catch (JsonParseException e) {
            CrashHelper.c(e);
            m9257c();
            return (T) this.f3956l.call();
        }
    }

    @Override // p007l.ggi
    /* JADX INFO: renamed from: q */
    public byte[] mo9269q(T t) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f3955k.serialize(t, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public qiq(String str, int i, JsonAdapter<T> jsonAdapter, v9j<T> v9jVar) {
        super(str, i, (ProtobufAdapter) null);
        this.f3955k = jsonAdapter;
        this.f3956l = v9jVar;
    }
}

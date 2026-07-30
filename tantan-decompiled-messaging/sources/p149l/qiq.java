package p149l;

import com.fasterxml.jackson.core.JsonParseException;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class qiq<T> extends ggi<T> {

    /* JADX INFO: renamed from: k */
    public final JsonAdapter<T> f154793k;

    /* JADX INFO: renamed from: l */
    public v9j<T> f154794l;

    public qiq(ggi.InterfaceC17075b<String> interfaceC17075b, int i, JsonAdapter<T> jsonAdapter, v9j<T> v9jVar) {
        this(interfaceC17075b.getFileName(), i, jsonAdapter, v9jVar);
    }

    @Override // p149l.ggi
    /* JADX INFO: renamed from: e */
    public T mo125968e(FileInputStream fileInputStream) throws IOException {
        try {
            return this.f154793k.parse(fileInputStream);
        } catch (JsonParseException e) {
            CrashHelper.m81296c(e);
            m125967c();
            return this.f154794l.call();
        }
    }

    @Override // p149l.ggi
    /* JADX INFO: renamed from: q */
    public byte[] mo125979q(T t) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f154793k.serialize(t, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public qiq(String str, int i, JsonAdapter<T> jsonAdapter, v9j<T> v9jVar) {
        super(str, i, (ProtobufAdapter) null);
        this.f154793k = jsonAdapter;
        this.f154794l = v9jVar;
    }
}

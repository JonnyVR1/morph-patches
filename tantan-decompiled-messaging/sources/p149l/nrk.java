package p149l;

import com.fasterxml.jackson.core.JsonParseException;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class nrk<T extends BaseLiveBean> extends ggi<T> {

    /* JADX INFO: renamed from: k */
    public final c7t<T> f140202k;

    /* JADX INFO: renamed from: l */
    public v9j<T> f140203l;

    public nrk(ggi.InterfaceC17075b<String> interfaceC17075b, int i, c7t<T> c7tVar, v9j<T> v9jVar) {
        this(interfaceC17075b.getFileName(), i, c7tVar, v9jVar);
    }

    @Override // p149l.ggi
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public T mo125968e(FileInputStream fileInputStream) throws IOException {
        try {
            return (T) this.f140202k.parse(fileInputStream, "");
        } catch (JsonParseException e) {
            CrashHelper.m81296c(e);
            m125967c();
            return this.f140203l.call();
        }
    }

    @Override // p149l.ggi
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public byte[] mo125979q(T t) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f140202k.m105637e(t, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public nrk(String str, int i, c7t<T> c7tVar, v9j<T> v9jVar) {
        super(str, i, (ProtobufAdapter) null);
        this.f140202k = c7tVar;
        this.f140203l = v9jVar;
    }
}

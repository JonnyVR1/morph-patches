package p153l;

import com.fasterxml.jackson.core.JsonParseException;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class duk<T extends BaseLiveBean> extends dji<T> {

    /* JADX INFO: renamed from: k */
    public final d9t<T> f90810k;

    /* JADX INFO: renamed from: l */
    public pcj<T> f90811l;

    public duk(dji.InterfaceC16550b<String> interfaceC16550b, int i, d9t<T> d9tVar, pcj<T> pcjVar) {
        this(interfaceC16550b.getFileName(), i, d9tVar, pcjVar);
    }

    @Override // p153l.dji
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public T mo116100e(FileInputStream fileInputStream) throws IOException {
        try {
            return (T) this.f90810k.parse(fileInputStream, "");
        } catch (JsonParseException e) {
            CrashHelper.m82479c(e);
            m116099c();
            return this.f90811l.call();
        }
    }

    @Override // p153l.dji
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public byte[] mo116111q(T t) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f90810k.m115098e(t, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public duk(String str, int i, d9t<T> d9tVar, pcj<T> pcjVar) {
        super(str, i, (ProtobufAdapter) null);
        this.f90810k = d9tVar;
        this.f90811l = pcjVar;
    }
}

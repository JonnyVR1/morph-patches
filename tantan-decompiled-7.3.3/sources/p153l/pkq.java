package p153l;

import com.fasterxml.jackson.core.JsonParseException;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class pkq<T> extends dji<T> {

    /* JADX INFO: renamed from: k */
    public final JsonAdapter<T> f152939k;

    /* JADX INFO: renamed from: l */
    public pcj<T> f152940l;

    public pkq(dji.InterfaceC16550b<String> interfaceC16550b, int i, JsonAdapter<T> jsonAdapter, pcj<T> pcjVar) {
        this(interfaceC16550b.getFileName(), i, jsonAdapter, pcjVar);
    }

    @Override // p153l.dji
    /* JADX INFO: renamed from: e */
    public T mo116100e(FileInputStream fileInputStream) throws IOException {
        try {
            return this.f152939k.parse(fileInputStream);
        } catch (JsonParseException e) {
            CrashHelper.m82479c(e);
            m116099c();
            return this.f152940l.call();
        }
    }

    @Override // p153l.dji
    /* JADX INFO: renamed from: q */
    public byte[] mo116111q(T t) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f152939k.serialize(t, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public pkq(String str, int i, JsonAdapter<T> jsonAdapter, pcj<T> pcjVar) {
        super(str, i, (ProtobufAdapter) null);
        this.f152939k = jsonAdapter;
        this.f152940l = pcjVar;
    }
}

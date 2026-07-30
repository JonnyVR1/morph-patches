package com.tantanapp.common.data;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public interface INetParser<T> {
    public static final INetParser<String> STRING_PARSER = new INetParser<String>() { // from class: com.tantanapp.common.data.INetParser.1
        @Override // com.tantanapp.common.data.INetParser
        public String parse(InputStream inputStream, String str, DataChecker dataChecker) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    String string = byteArrayOutputStream.toString("UTF-8");
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }

        @Override // com.tantanapp.common.data.INetParser
        public String parse(InputStream inputStream, String str) throws IOException {
            return parse(inputStream, str, (DataChecker) null);
        }
    };

    T parse(InputStream inputStream, String str) throws IOException;

    T parse(InputStream inputStream, String str, DataChecker dataChecker) throws IOException;
}

package org.spongycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p153l.f2l;

/* JADX INFO: loaded from: classes3.dex */
public class UrlBase64 {
    private static final Encoder encoder = new UrlBase64Encoder();

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            f2l.m123629a("exception decoding URL safe base64 string: ", e.getMessage(), e);
            return null;
        }
    }

    public static byte[] encode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding URL safe base64 data: " + e.getMessage(), e);
        }
    }

    public static int decode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.decode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            f2l.m123629a("exception decoding URL safe base64 string: ", e.getMessage(), e);
            return null;
        }
    }

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return encoder.decode(str, outputStream);
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }
}

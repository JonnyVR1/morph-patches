package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.Base64;

/* JADX INFO: loaded from: classes2.dex */
public class BCodec extends RFC1522Codec implements StringEncoder, StringDecoder {
    private final String charset;

    public BCodec() {
        this("UTF-8");
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using BCodec");
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doDecoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.decodeBase64(bArr);
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeBase64(bArr);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using BCodec");
    }

    public String getDefaultCharset() {
        return this.charset;
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public String getEncoding() {
        return "B";
    }

    public BCodec(String str) {
        this.charset = str;
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decodeText(str);
        } catch (UnsupportedEncodingException e) {
            throw new DecoderException(e.getMessage(), e);
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        return encode(str, getDefaultCharset());
    }

    public String encode(String str, String str2) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return encodeText(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new EncoderException(e.getMessage(), e);
        }
    }
}

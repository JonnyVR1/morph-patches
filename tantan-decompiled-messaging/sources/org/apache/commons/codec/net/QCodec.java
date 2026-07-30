package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes2.dex */
public class QCodec extends RFC1522Codec implements StringEncoder, StringDecoder {
    private static final byte BLANK = 32;
    private static final BitSet PRINTABLE_CHARS;
    private static final byte UNDERSCORE = 95;
    private final String charset;
    private boolean encodeBlanks;

    static {
        BitSet bitSet = new BitSet(256);
        PRINTABLE_CHARS = bitSet;
        bitSet.set(32);
        bitSet.set(33);
        bitSet.set(34);
        bitSet.set(35);
        bitSet.set(36);
        bitSet.set(37);
        bitSet.set(38);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        bitSet.set(42);
        bitSet.set(43);
        bitSet.set(44);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(47);
        for (int i = 48; i <= 57; i++) {
            PRINTABLE_CHARS.set(i);
        }
        BitSet bitSet2 = PRINTABLE_CHARS;
        bitSet2.set(58);
        bitSet2.set(59);
        bitSet2.set(60);
        bitSet2.set(62);
        bitSet2.set(64);
        for (int i2 = 65; i2 <= 90; i2++) {
            PRINTABLE_CHARS.set(i2);
        }
        BitSet bitSet3 = PRINTABLE_CHARS;
        bitSet3.set(91);
        bitSet3.set(92);
        bitSet3.set(93);
        bitSet3.set(94);
        bitSet3.set(96);
        for (int i3 = 97; i3 <= 122; i3++) {
            PRINTABLE_CHARS.set(i3);
        }
        BitSet bitSet4 = PRINTABLE_CHARS;
        bitSet4.set(123);
        bitSet4.set(124);
        bitSet4.set(125);
        bitSet4.set(126);
    }

    public QCodec(String str) {
        this.encodeBlanks = false;
        this.charset = str;
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using Q codec");
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doDecoding(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        for (byte b : bArr) {
            if (b == 95) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i = 0; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    if (b2 != 95) {
                        bArr2[i] = b2;
                    } else {
                        bArr2[i] = 32;
                    }
                }
                return QuotedPrintableCodec.decodeQuotedPrintable(bArr2);
            }
        }
        return QuotedPrintableCodec.decodeQuotedPrintable(bArr);
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArrEncodeQuotedPrintable = QuotedPrintableCodec.encodeQuotedPrintable(PRINTABLE_CHARS, bArr);
        if (this.encodeBlanks) {
            for (int i = 0; i < bArrEncodeQuotedPrintable.length; i++) {
                if (bArrEncodeQuotedPrintable[i] == 32) {
                    bArrEncodeQuotedPrintable[i] = UNDERSCORE;
                }
            }
        }
        return bArrEncodeQuotedPrintable;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using Q codec");
    }

    public String getDefaultCharset() {
        return this.charset;
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public String getEncoding() {
        return "Q";
    }

    public boolean isEncodeBlanks() {
        return this.encodeBlanks;
    }

    public void setEncodeBlanks(boolean z) {
        this.encodeBlanks = z;
    }

    public QCodec() {
        this("UTF-8");
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

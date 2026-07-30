package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
abstract class RFC1522Codec {
    protected static final String POSTFIX = "?=";
    protected static final String PREFIX = "=?";
    protected static final char SEP = '?';

    public String decodeText(String str) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(PREFIX) || !str.endsWith(POSTFIX)) {
            throw new DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == length) {
            throw new DecoderException("RFC 1522 violation: charset token not found");
        }
        String strSubstring = str.substring(2, iIndexOf);
        if (strSubstring.equals("")) {
            throw new DecoderException("RFC 1522 violation: charset not specified");
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(63, i);
        if (iIndexOf2 == length) {
            throw new DecoderException("RFC 1522 violation: encoding token not found");
        }
        String strSubstring2 = str.substring(i, iIndexOf2);
        if (getEncoding().equalsIgnoreCase(strSubstring2)) {
            int i2 = iIndexOf2 + 1;
            return new String(doDecoding(StringUtils.getBytesUsAscii(str.substring(i2, str.indexOf(63, i2)))), strSubstring);
        }
        throw new DecoderException("This codec cannot decode " + strSubstring2 + " encoded content");
    }

    public abstract byte[] doDecoding(byte[] bArr) throws DecoderException;

    public abstract byte[] doEncoding(byte[] bArr) throws EncoderException;

    public String encodeText(String str, String str2) throws EncoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(PREFIX);
        stringBuffer.append(str2);
        stringBuffer.append(SEP);
        stringBuffer.append(getEncoding());
        stringBuffer.append(SEP);
        stringBuffer.append(StringUtils.newStringUsAscii(doEncoding(str.getBytes(str2))));
        stringBuffer.append(POSTFIX);
        return stringBuffer.toString();
    }

    public abstract String getEncoding();
}

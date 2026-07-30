package org.java_websocket.util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import l.aag0;
import org.eclipse.jetty.util.StringUtil;
import org.java_websocket.exceptions.InvalidDataException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Charsetfunctions {
    public static CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
    private static final int[] utf8d = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    private Charsetfunctions() {
    }

    public static byte[] asciiBytes(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            aag0.a(e);
            return null;
        }
    }

    public static boolean isValidUTF8(ByteBuffer byteBuffer, int i) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < i) {
            return false;
        }
        int i2 = 0;
        while (i < iRemaining) {
            int[] iArr = utf8d;
            i2 = iArr[(i2 << 4) + 256 + iArr[byteBuffer.get(i) & 255]];
            if (i2 == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static String stringAscii(byte[] bArr, int i, int i2) {
        try {
            return new String(bArr, i, i2, "ASCII");
        } catch (UnsupportedEncodingException e) {
            aag0.a(e);
            return null;
        }
    }

    public static String stringUtf8(ByteBuffer byteBuffer) throws InvalidDataException {
        CharsetDecoder charsetDecoderNewDecoder = Charset.forName(StringUtil.__UTF8Alt).newDecoder();
        charsetDecoderNewDecoder.onMalformedInput(codingErrorAction);
        charsetDecoderNewDecoder.onUnmappableCharacter(codingErrorAction);
        try {
            byteBuffer.mark();
            String string = charsetDecoderNewDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return string;
        } catch (CharacterCodingException e) {
            throw new InvalidDataException(1007, e);
        }
    }

    public static byte[] utf8Bytes(String str) {
        try {
            return str.getBytes(StringUtil.__UTF8Alt);
        } catch (UnsupportedEncodingException e) {
            aag0.a(e);
            return null;
        }
    }

    public static String stringAscii(byte[] bArr) {
        return stringAscii(bArr, 0, bArr.length);
    }

    public static boolean isValidUTF8(ByteBuffer byteBuffer) {
        return isValidUTF8(byteBuffer, 0);
    }

    public static String stringUtf8(byte[] bArr) throws InvalidDataException {
        return stringUtf8(ByteBuffer.wrap(bArr));
    }
}

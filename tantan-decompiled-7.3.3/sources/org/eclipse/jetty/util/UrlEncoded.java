package org.eclipse.jetty.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.iig0;

/* JADX INFO: loaded from: classes2.dex */
public class UrlEncoded extends MultiMap implements Cloneable {
    private static final Logger LOG = Log.getLogger((Class<?>) UrlEncoded.class);
    public static final String ENCODING = System.getProperty("org.eclipse.jetty.util.UrlEncoding.charset", "UTF-8");

    public UrlEncoded(String str) {
        super(6);
        decode(str, ENCODING);
    }

    public static void decode88591To(InputStream inputStream, MultiMap multiMap, int i, int i2) throws IOException {
        synchronized (multiMap) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                String string = null;
                int i3 = 0;
                while (true) {
                    int i4 = inputStream.read();
                    if (i4 < 0) {
                        if (string != null) {
                            Object string2 = stringBuffer.length() == 0 ? "" : stringBuffer.toString();
                            stringBuffer.setLength(0);
                            multiMap.add(string, string2);
                        } else if (stringBuffer.length() > 0) {
                            multiMap.add(stringBuffer.toString(), "");
                        }
                        return;
                    }
                    char c = (char) i4;
                    if (c == '%') {
                        int i5 = inputStream.read();
                        int i6 = inputStream.read();
                        if (i5 >= 0 && i6 >= 0) {
                            stringBuffer.append((char) ((TypeUtil.convertHexDigit((byte) i5) << 4) + TypeUtil.convertHexDigit((byte) i6)));
                        }
                    } else if (c == '&') {
                        String string3 = stringBuffer.length() == 0 ? "" : stringBuffer.toString();
                        stringBuffer.setLength(0);
                        if (string != null) {
                            multiMap.add(string, string3);
                        } else if (string3 != null && string3.length() > 0) {
                            multiMap.add(string3, "");
                        }
                        if (i2 > 0 && multiMap.size() > i2) {
                            LOG.warn("maxFormKeys limit exceeded keys>{}", Integer.valueOf(i2));
                            return;
                        }
                        string = null;
                    } else if (c == '+') {
                        stringBuffer.append(' ');
                    } else if (c == '=' && string == null) {
                        string = stringBuffer.toString();
                        stringBuffer.setLength(0);
                    } else {
                        stringBuffer.append(c);
                    }
                    if (i >= 0 && (i3 = i3 + 1) > i) {
                        throw new IllegalStateException("Form too large");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00a4 A[EDGE_INSN: B:110:0x00a4->B:46:0x00a4 BREAK  A[LOOP:1: B:30:0x0067->B:47:0x00a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7 A[Catch: UnsupportedEncodingException -> 0x005f, LOOP:1: B:30:0x0067->B:47:0x00a7, LOOP_END, TryCatch #2 {UnsupportedEncodingException -> 0x005f, blocks: (B:55:0x00d2, B:25:0x0055, B:28:0x0062, B:36:0x0075, B:47:0x00a7, B:39:0x0082, B:40:0x008b, B:41:0x0090, B:43:0x0097, B:44:0x009c, B:48:0x00ae, B:51:0x00be, B:53:0x00c4, B:54:0x00cf, B:59:0x00dc, B:62:0x00e3, B:64:0x00ea), top: B:106:0x00d2, inners: #0 }] */
    public static String decodeString(String str, int i, int i2, String str2) {
        int i3;
        String str3;
        int i4;
        int i5 = 0;
        if (str2 == null || StringUtil.isUTF8(str2)) {
            Utf8StringBuffer utf8StringBuffer = null;
            while (i5 < i2) {
                int i6 = i + i5;
                char cCharAt = str.charAt(i6);
                if (cCharAt < 0 || cCharAt > 255) {
                    if (utf8StringBuffer == null) {
                        Utf8StringBuffer utf8StringBuffer2 = new Utf8StringBuffer(i2);
                        utf8StringBuffer2.getStringBuffer().append((CharSequence) str, i, i6 + 1);
                        utf8StringBuffer = utf8StringBuffer2;
                    } else {
                        utf8StringBuffer.getStringBuffer().append(cCharAt);
                    }
                } else if (cCharAt == '+') {
                    if (utf8StringBuffer == null) {
                        utf8StringBuffer = new Utf8StringBuffer(i2);
                        utf8StringBuffer.getStringBuffer().append((CharSequence) str, i, i6);
                    }
                    utf8StringBuffer.getStringBuffer().append(' ');
                } else if (cCharAt == '%' && (i3 = i5 + 2) < i2) {
                    if (utf8StringBuffer == null) {
                        utf8StringBuffer = new Utf8StringBuffer(i2);
                        utf8StringBuffer.getStringBuffer().append((CharSequence) str, i, i6);
                    }
                    try {
                        utf8StringBuffer.append((byte) TypeUtil.parseInt(str, i6 + 1, 2, 16));
                        i5 = i3;
                    } catch (NumberFormatException unused) {
                        utf8StringBuffer.getStringBuffer().append('%');
                    }
                } else if (utf8StringBuffer != null) {
                    utf8StringBuffer.getStringBuffer().append(cCharAt);
                }
                i5++;
            }
            if (utf8StringBuffer == null) {
                return (i == 0 && str.length() == i2) ? str : str.substring(i, i + i2);
            }
            return utf8StringBuffer.toString();
        }
        int i7 = 0;
        StringBuffer stringBuffer = null;
        while (i7 < i2) {
            int i8 = i + i7;
            try {
                char cCharAt2 = str.charAt(i8);
                if (cCharAt2 < 0 || cCharAt2 > 255) {
                    str3 = null;
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(i2);
                        stringBuffer.append((CharSequence) str, i, i8 + 1);
                    } else {
                        stringBuffer.append(cCharAt2);
                    }
                } else if (cCharAt2 == '+') {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(i2);
                        stringBuffer.append((CharSequence) str, i, i8);
                    }
                    stringBuffer.append(' ');
                    str3 = null;
                } else {
                    if (cCharAt2 == '%') {
                        str3 = null;
                        if (i7 + 2 < i2) {
                            if (stringBuffer == null) {
                                StringBuffer stringBuffer2 = new StringBuffer(i2);
                                stringBuffer2.append((CharSequence) str, i, i8);
                                stringBuffer = stringBuffer2;
                            }
                            byte[] bArr = new byte[i2];
                            int i9 = i7;
                            int i10 = 0;
                            while (cCharAt2 >= 0 && cCharAt2 <= 255) {
                                if (cCharAt2 == '%') {
                                    if (i9 + 2 < i2) {
                                        try {
                                            bArr[i10] = (byte) TypeUtil.parseInt(str, i + i9 + 1, 2, 16);
                                            i10++;
                                            i9 += 3;
                                        } catch (NumberFormatException e) {
                                            LOG.ignore(e);
                                            i4 = i10 + 1;
                                            bArr[i10] = 37;
                                            i9++;
                                            i10 = i4;
                                        }
                                        if (i9 >= i2) {
                                            break;
                                        }
                                        cCharAt2 = str.charAt(i + i9);
                                    } else {
                                        i4 = i10 + 1;
                                        bArr[i10] = 37;
                                    }
                                } else if (cCharAt2 == '+') {
                                    i4 = i10 + 1;
                                    bArr[i10] = HttpTokens.SPACE;
                                } else {
                                    i4 = i10 + 1;
                                    bArr[i10] = (byte) cCharAt2;
                                }
                                i9++;
                                i10 = i4;
                                if (i9 >= i2) {
                                    break;
                                    break;
                                }
                                cCharAt2 = str.charAt(i + i9);
                            }
                            stringBuffer.append(new String(bArr, 0, i10, str2));
                            i7 = i9 - 1;
                        }
                    } else {
                        str3 = null;
                    }
                    if (stringBuffer != null) {
                        stringBuffer.append(cCharAt2);
                    }
                }
                try {
                    i7++;
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                    iig0.m140070a(e);
                    return str3;
                }
            } catch (UnsupportedEncodingException e3) {
                e = e3;
                str3 = null;
            }
        }
        if (stringBuffer == null) {
            return (i == 0 && str.length() == i2) ? str : str.substring(i, i + i2);
        }
        return stringBuffer.toString();
    }

    public static void decodeTo(InputStream inputStream, MultiMap multiMap, String str, int i, int i2) throws IOException {
        if (str == null) {
            str = ENCODING;
        }
        if ("UTF-8".equalsIgnoreCase(str)) {
            decodeUtf8To(inputStream, multiMap, i, i2);
            return;
        }
        if ("ISO-8859-1".equals(str)) {
            decode88591To(inputStream, multiMap, i, i2);
            return;
        }
        if ("UTF-16".equalsIgnoreCase(str)) {
            decodeUtf16To(inputStream, multiMap, i, i2);
            return;
        }
        synchronized (multiMap) {
            try {
                ByteArrayOutputStream2 byteArrayOutputStream2 = new ByteArrayOutputStream2();
                String string = null;
                char c = 0;
                byte bConvertHexDigit = 0;
                int i3 = 0;
                while (true) {
                    int i4 = inputStream.read();
                    if (i4 > 0) {
                        char c2 = (char) i4;
                        if (c2 == '%') {
                            c = 2;
                        } else if (c2 == '&') {
                            String string2 = byteArrayOutputStream2.size() == 0 ? "" : byteArrayOutputStream2.toString(str);
                            byteArrayOutputStream2.setCount(0);
                            if (string != null) {
                                multiMap.add(string, string2);
                            } else if (string2 != null && string2.length() > 0) {
                                multiMap.add(string2, "");
                            }
                            string = null;
                        } else if (c2 == '+') {
                            byteArrayOutputStream2.write(32);
                        } else if (c2 != '=') {
                            if (c == 2) {
                                bConvertHexDigit = TypeUtil.convertHexDigit((byte) i4);
                                c = 1;
                            } else if (c == 1) {
                                byteArrayOutputStream2.write((bConvertHexDigit << 4) + TypeUtil.convertHexDigit((byte) i4));
                                c = 0;
                            } else {
                                byteArrayOutputStream2.write(i4);
                            }
                        } else if (string != null) {
                            byteArrayOutputStream2.write(i4);
                        } else {
                            string = byteArrayOutputStream2.size() == 0 ? "" : byteArrayOutputStream2.toString(str);
                            byteArrayOutputStream2.setCount(0);
                        }
                        i3++;
                        if (i >= 0 && i3 > i) {
                            throw new IllegalStateException("Form too large");
                        }
                    } else {
                        int size = byteArrayOutputStream2.size();
                        if (string != null) {
                            Object string3 = size == 0 ? "" : byteArrayOutputStream2.toString(str);
                            byteArrayOutputStream2.setCount(0);
                            multiMap.add(string, string3);
                        } else if (size > 0) {
                            multiMap.add(byteArrayOutputStream2.toString(str), "");
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void decodeUtf16To(InputStream inputStream, MultiMap multiMap, int i, int i2) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-16");
        StringWriter stringWriter = new StringWriter(8192);
        C22074IO.copy(inputStreamReader, stringWriter, i);
        decodeTo(stringWriter.getBuffer().toString(), multiMap, ENCODING, i2);
    }

    public static void decodeUtf8To(InputStream inputStream, MultiMap multiMap, int i, int i2) throws IOException {
        synchronized (multiMap) {
            try {
                Utf8StringBuilder utf8StringBuilder = new Utf8StringBuilder();
                int i3 = 0;
                String string = null;
                while (true) {
                    int i4 = inputStream.read();
                    if (i4 < 0) {
                        if (string != null) {
                            Object string2 = utf8StringBuilder.length() == 0 ? "" : utf8StringBuilder.toString();
                            utf8StringBuilder.reset();
                            multiMap.add(string, string2);
                        } else if (utf8StringBuilder.length() > 0) {
                            multiMap.add(utf8StringBuilder.toString(), "");
                        }
                        return;
                    }
                    char c = (char) i4;
                    if (c == '%') {
                        int i5 = inputStream.read();
                        int i6 = inputStream.read();
                        if (i5 >= 0 && i6 >= 0) {
                            utf8StringBuilder.append((byte) ((TypeUtil.convertHexDigit((byte) i5) << 4) + TypeUtil.convertHexDigit((byte) i6)));
                        }
                    } else if (c == '&') {
                        String string3 = utf8StringBuilder.length() == 0 ? "" : utf8StringBuilder.toString();
                        utf8StringBuilder.reset();
                        if (string != null) {
                            multiMap.add(string, string3);
                        } else if (string3 != null && string3.length() > 0) {
                            multiMap.add(string3, "");
                        }
                        if (i2 > 0) {
                            try {
                                if (multiMap.size() > i2) {
                                    LOG.warn("maxFormKeys limit exceeded keys>{}", Integer.valueOf(i2));
                                    return;
                                }
                            } catch (Utf8Appendable.NotUtf8Exception e) {
                                e = e;
                                string = null;
                                Logger logger = LOG;
                                logger.warn(e.toString(), new Object[0]);
                                logger.debug(e);
                            }
                        }
                        string = null;
                    } else if (c == '+') {
                        utf8StringBuilder.append(HttpTokens.SPACE);
                    } else if (c != '=') {
                        try {
                            utf8StringBuilder.append((byte) i4);
                        } catch (Utf8Appendable.NotUtf8Exception e2) {
                            e = e2;
                            Logger logger2 = LOG;
                            logger2.warn(e.toString(), new Object[0]);
                            logger2.debug(e);
                        }
                    } else if (string != null) {
                        utf8StringBuilder.append((byte) i4);
                    } else {
                        string = utf8StringBuilder.toString();
                        utf8StringBuilder.reset();
                    }
                    if (i >= 0 && (i3 = i3 + 1) > i) {
                        throw new IllegalStateException("Form too large");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String encode(MultiMap multiMap, String str, boolean z) {
        if (str == null) {
            str = ENCODING;
        }
        StringBuilder sb = new StringBuilder(128);
        Iterator it = multiMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            int size = LazyList.size(value);
            if (size == 0) {
                sb.append(encodeString(string, str));
                if (z) {
                    sb.append('=');
                }
            } else {
                for (int i = 0; i < size; i++) {
                    if (i > 0) {
                        sb.append('&');
                    }
                    Object obj = LazyList.get(value, i);
                    sb.append(encodeString(string, str));
                    if (obj != null) {
                        String string2 = obj.toString();
                        if (string2.length() > 0) {
                            sb.append('=');
                            sb.append(encodeString(string2, str));
                        } else if (z) {
                            sb.append('=');
                        }
                    } else if (z) {
                        sb.append('=');
                    }
                }
            }
            if (it.hasNext()) {
                sb.append('&');
            }
        }
        return sb.toString();
    }

    public static String encodeString(String str, String str2) {
        byte[] bytes;
        int i;
        int i2;
        if (str2 == null) {
            str2 = ENCODING;
        }
        try {
            bytes = str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        byte[] bArr = new byte[bytes.length * 3];
        boolean z = true;
        int i3 = 0;
        for (byte b : bytes) {
            if (b == 32) {
                bArr[i3] = 43;
                i3++;
                z = false;
            } else if ((b < 97 || b > 122) && ((b < 65 || b > 90) && (b < 48 || b > 57))) {
                int i4 = i3 + 1;
                bArr[i3] = 37;
                byte b2 = (byte) ((b & 240) >> 4);
                if (b2 >= 10) {
                    i = i3 + 2;
                    bArr[i4] = (byte) (b2 + 55);
                } else {
                    i = i3 + 2;
                    bArr[i4] = (byte) (b2 + 48);
                }
                byte b3 = (byte) (b & 15);
                if (b3 >= 10) {
                    i2 = i + 1;
                    bArr[i] = (byte) (b3 + 55);
                } else {
                    i2 = i + 1;
                    bArr[i] = (byte) (b3 + 48);
                }
                z = false;
                i3 = i2;
            } else {
                bArr[i3] = b;
                i3++;
            }
        }
        if (z) {
            return str;
        }
        try {
            return new String(bArr, 0, i3, str2);
        } catch (UnsupportedEncodingException unused2) {
            return new String(bArr, 0, i3);
        }
    }

    public Object clone() {
        return new UrlEncoded(this);
    }

    public void decode(String str) {
        decodeTo(str, this, ENCODING, -1);
    }

    public void decode(String str, String str2) {
        decodeTo(str, this, str2, -1);
    }

    public UrlEncoded() {
        super(6);
    }

    public UrlEncoded(UrlEncoded urlEncoded) {
        super((MultiMap) urlEncoded);
    }

    public UrlEncoded(String str, String str2) {
        super(6);
        decode(str, str2);
    }

    public String encode(String str) {
        return encode(str, false);
    }

    public synchronized String encode(String str, boolean z) {
        return encode(this, str, z);
    }

    public String encode() {
        return encode(ENCODING, false);
    }

    public static String encodeString(String str) {
        return encodeString(str, ENCODING);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    public static void decodeTo(String str, MultiMap multiMap, String str2, int i) {
        String strDecodeString;
        String strDecodeString2;
        if (str2 == null) {
            str2 = ENCODING;
        }
        synchronized (multiMap) {
            int i2 = -1;
            String strDecodeString3 = null;
            boolean z = false;
            for (int i3 = 0; i3 < str.length(); i3++) {
                try {
                    char cCharAt = str.charAt(i3);
                    if (cCharAt == '%') {
                        z = true;
                    } else {
                        if (cCharAt == '&') {
                            int i4 = (i3 - i2) - 1;
                            if (i4 == 0) {
                                strDecodeString2 = "";
                            } else {
                                int i5 = i2 + 1;
                                strDecodeString2 = z ? decodeString(str, i5, i4, str2) : str.substring(i5, i3);
                            }
                            if (strDecodeString3 != null) {
                                multiMap.add(strDecodeString3, strDecodeString2);
                            } else if (strDecodeString2 != null && strDecodeString2.length() > 0) {
                                multiMap.add(strDecodeString2, "");
                            }
                            if (i > 0 && multiMap.size() > i) {
                                LOG.warn("maxFormKeys limit exceeded keys>{}", Integer.valueOf(i));
                                return;
                            }
                            strDecodeString3 = null;
                        } else if (cCharAt == '+') {
                            z = true;
                        } else if (cCharAt == '=' && strDecodeString3 == null) {
                            strDecodeString3 = z ? decodeString(str, i2 + 1, (i3 - i2) - 1, str2) : str.substring(i2 + 1, i3);
                        }
                        z = false;
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (strDecodeString3 != null) {
                int length = (str.length() - i2) - 1;
                if (length == 0) {
                    strDecodeString = "";
                } else {
                    int i6 = i2 + 1;
                    strDecodeString = z ? decodeString(str, i6, length, str2) : str.substring(i6);
                }
                multiMap.add(strDecodeString3, strDecodeString);
            } else if (i2 < str.length()) {
                String strDecodeString4 = z ? decodeString(str, i2 + 1, (str.length() - i2) - 1, str2) : str.substring(i2 + 1);
                if (strDecodeString4 != null && strDecodeString4.length() > 0) {
                    multiMap.add(strDecodeString4, "");
                }
            }
        }
    }

    public static void decodeUtf8To(byte[] bArr, int i, int i2, MultiMap multiMap, Utf8StringBuilder utf8StringBuilder) {
        Utf8Appendable.NotUtf8Exception e;
        synchronized (multiMap) {
            int i3 = i2 + i;
            String string = null;
            while (i < i3) {
                try {
                    byte b = bArr[i];
                    char c = (char) (b & 255);
                    if (c != '%') {
                        if (c == '&') {
                            String string2 = utf8StringBuilder.length() == 0 ? "" : utf8StringBuilder.toString();
                            utf8StringBuilder.reset();
                            if (string != null) {
                                multiMap.add(string, string2);
                            } else if (string2 != null && string2.length() > 0) {
                                multiMap.add(string2, "");
                            }
                            string = null;
                        } else if (c == '+') {
                            utf8StringBuilder.append(HttpTokens.SPACE);
                        } else if (c != '=') {
                            try {
                                utf8StringBuilder.append(b);
                            } catch (Utf8Appendable.NotUtf8Exception e2) {
                                e = e2;
                                Logger logger = LOG;
                                logger.warn(e.toString(), new Object[0]);
                                logger.debug(e);
                            }
                        } else if (string != null) {
                            utf8StringBuilder.append(b);
                        } else {
                            string = utf8StringBuilder.toString();
                            utf8StringBuilder.reset();
                        }
                    } else if (i + 2 < i3) {
                        int i4 = i + 1;
                        try {
                            i += 2;
                            utf8StringBuilder.append((byte) ((TypeUtil.convertHexDigit(bArr[i4]) << 4) + TypeUtil.convertHexDigit(bArr[i])));
                        } catch (Utf8Appendable.NotUtf8Exception e3) {
                            e = e3;
                            i = i4;
                            Logger logger2 = LOG;
                            logger2.warn(e.toString(), new Object[0]);
                            logger2.debug(e);
                        }
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (string != null) {
                String string3 = utf8StringBuilder.length() == 0 ? "" : utf8StringBuilder.toString();
                utf8StringBuilder.reset();
                multiMap.add(string, string3);
            } else if (utf8StringBuilder.length() > 0) {
                multiMap.add(utf8StringBuilder.toString(), "");
            }
        }
    }

    public static void decodeTo(String str, MultiMap multiMap, String str2) {
        decodeTo(str, multiMap, str2, -1);
    }

    public static void decodeUtf8To(byte[] bArr, int i, int i2, MultiMap multiMap) {
        decodeUtf8To(bArr, i, i2, multiMap, new Utf8StringBuilder());
    }
}

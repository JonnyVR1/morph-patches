package org.eclipse.jetty.server;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import l.ohg0;
import org.eclipse.jetty.http.AbstractGenerator;
import org.eclipse.jetty.util.ByteArrayOutputStream2;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HttpWriter extends Writer {
    public static final int MAX_OUTPUT_CHARS = 512;
    private static final int WRITE_CONV = 0;
    private static final int WRITE_ISO1 = 1;
    private static final int WRITE_UTF8 = 2;
    final AbstractGenerator _generator;
    final HttpOutput _out;
    int _surrogate = 0;
    int _writeMode;

    public HttpWriter(HttpOutput httpOutput) {
        this._out = httpOutput;
        this._generator = httpOutput._generator;
    }

    private Writer getConverter() throws IOException {
        HttpOutput httpOutput = this._out;
        if (httpOutput._converter == null) {
            HttpOutput httpOutput2 = this._out;
            httpOutput._converter = new OutputStreamWriter(httpOutput2._bytes, httpOutput2._characterEncoding);
        }
        return this._out._converter;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._out.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this._out.flush();
    }

    public void setCharacterEncoding(String str) {
        if (str == null || "ISO-8859-1".equalsIgnoreCase(str)) {
            this._writeMode = 1;
        } else if (StringUtil.__UTF8.equalsIgnoreCase(str)) {
            this._writeMode = 2;
        } else {
            this._writeMode = 0;
            String str2 = this._out._characterEncoding;
            if (str2 == null || !str2.equalsIgnoreCase(str)) {
                this._out._converter = null;
            }
        }
        HttpOutput httpOutput = this._out;
        httpOutput._characterEncoding = str;
        if (httpOutput._bytes == null) {
            httpOutput._bytes = new ByteArrayOutputStream2(512);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, org.eclipse.jetty.server.HttpOutput] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        int codePoint;
        ?? r0 = this._out;
        while (i2 > 0) {
            r0._bytes.reset();
            int length = i2 <= 512 ? i2 : 512;
            int i3 = this._writeMode;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 == 1) {
                    byte[] buf = r0._bytes.getBuf();
                    int count = r0._bytes.getCount();
                    if (length > buf.length - count) {
                        length = buf.length - count;
                    }
                    while (i4 < length) {
                        char c = cArr[i + i4];
                        int i5 = count + 1;
                        if (c >= 256) {
                            c = '?';
                        }
                        buf[count] = (byte) c;
                        i4++;
                        count = i5;
                    }
                    if (count >= 0) {
                        r0._bytes.setCount(count);
                    }
                } else {
                    if (i3 != 2) {
                        ohg0.a();
                        return;
                    }
                    byte[] buf2 = r0._bytes.getBuf();
                    int count2 = r0._bytes.getCount();
                    if (count2 + length > buf2.length) {
                        length = buf2.length - count2;
                    }
                    int i6 = 0;
                    while (i6 < length) {
                        char c2 = cArr[i + i6];
                        if (this._surrogate == 0) {
                            if (Character.isHighSurrogate(c2)) {
                                codePoint = c2;
                                this._surrogate = c2;
                            }
                            i6++;
                        } else {
                            char c3 = c2;
                            boolean zIsLowSurrogate = Character.isLowSurrogate(c3);
                            int i7 = this._surrogate;
                            if (zIsLowSurrogate) {
                                codePoint = Character.toCodePoint((char) i7, c3);
                            } else {
                                this._surrogate = 0;
                                i6--;
                                codePoint = i7;
                            }
                        }
                        codePoint = c2;
                        if ((codePoint & (-128)) != 0) {
                            if ((codePoint & (-2048)) == 0) {
                                if (count2 + 2 <= buf2.length) {
                                    int i8 = count2 + 1;
                                    buf2[count2] = (byte) ((codePoint >> 6) | 192);
                                    count2 += 2;
                                    buf2[i8] = (byte) ((codePoint & 63) | 128);
                                    this._surrogate = 0;
                                    if (count2 == buf2.length) {
                                        i6++;
                                    } else {
                                        i6++;
                                    }
                                }
                            } else if (((-65536) & codePoint) == 0) {
                                if (count2 + 3 <= buf2.length) {
                                    buf2[count2] = (byte) ((codePoint >> 12) | 224);
                                    int i9 = count2 + 2;
                                    buf2[count2 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
                                    count2 += 3;
                                    buf2[i9] = (byte) ((codePoint & 63) | 128);
                                    this._surrogate = 0;
                                    if (count2 == buf2.length) {
                                        i6++;
                                    } else {
                                        i6++;
                                    }
                                }
                            } else if (((-14680064) & codePoint) == 0) {
                                if (count2 + 4 <= buf2.length) {
                                    buf2[count2] = (byte) ((codePoint >> 18) | 240);
                                    buf2[count2 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
                                    int i10 = count2 + 3;
                                    buf2[count2 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
                                    count2 += 4;
                                    buf2[i10] = (byte) ((codePoint & 63) | 128);
                                    this._surrogate = 0;
                                    if (count2 == buf2.length) {
                                        i6++;
                                    } else {
                                        i6++;
                                    }
                                }
                            } else if (((-201326592) & codePoint) != 0) {
                                if ((Integer.MIN_VALUE & codePoint) != 0) {
                                    buf2[count2] = 63;
                                    count2++;
                                } else if (count2 + 6 <= buf2.length) {
                                    buf2[count2] = (byte) ((codePoint >> 30) | 252);
                                    buf2[count2 + 1] = (byte) (((codePoint >> 24) & 63) | 128);
                                    buf2[count2 + 2] = (byte) (((codePoint >> 18) & 63) | 128);
                                    buf2[count2 + 3] = (byte) (((codePoint >> 12) & 63) | 128);
                                    int i11 = count2 + 5;
                                    buf2[count2 + 4] = (byte) (((codePoint >> 6) & 63) | 128);
                                    count2 += 6;
                                    buf2[i11] = (byte) ((codePoint & 63) | 128);
                                }
                                this._surrogate = 0;
                                if (count2 == buf2.length) {
                                    i6++;
                                } else {
                                    i6++;
                                }
                            } else if (count2 + 5 <= buf2.length) {
                                buf2[count2] = (byte) ((codePoint >> 24) | 248);
                                buf2[count2 + 1] = (byte) (((codePoint >> 18) & 63) | 128);
                                buf2[count2 + 2] = (byte) (((codePoint >> 12) & 63) | 128);
                                int i12 = count2 + 4;
                                buf2[count2 + 3] = (byte) (((codePoint >> 6) & 63) | 128);
                                count2 += 5;
                                buf2[i12] = (byte) ((codePoint & 63) | 128);
                                this._surrogate = 0;
                                if (count2 == buf2.length) {
                                    i6++;
                                } else {
                                    i6++;
                                }
                            }
                            length = i6;
                            break;
                        }
                        if (count2 >= buf2.length) {
                            length = i6;
                            break;
                        } else {
                            buf2[count2] = (byte) codePoint;
                            count2++;
                            i6++;
                        }
                    }
                    r0._bytes.setCount(count2);
                }
            } else {
                Writer converter = getConverter();
                converter.write(cArr, i, length);
                converter.flush();
            }
            r0._bytes.writeTo(r0);
            i2 -= length;
            i += length;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        while (i2 > 512) {
            write(str, i, 512);
            i += 512;
            i2 -= 512;
        }
        HttpOutput httpOutput = this._out;
        if (httpOutput._chars == null) {
            httpOutput._chars = new char[512];
        }
        char[] cArr = httpOutput._chars;
        str.getChars(i, i + i2, cArr, 0);
        write(cArr, 0, i2);
    }
}

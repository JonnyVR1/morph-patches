package org.eclipse.jetty.http;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import l.ig3;
import l.kg3;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.UrlEncoded;
import org.eclipse.jetty.util.Utf8StringBuilder;
import p003l.qhg0;
import p003l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HttpURI {
    private static final int ASTERISK = 10;
    private static final int AUTH = 4;
    private static final int AUTH_OR_PATH = 1;
    private static final int IPV6 = 5;
    private static final int PARAM = 8;
    private static final int PATH = 7;
    private static final int PORT = 6;
    private static final int QUERY = 9;
    private static final int SCHEME_OR_PATH = 2;
    private static final int START = 0;
    private static final byte[] __empty = new byte[0];
    int _authority;
    boolean _encoded;
    int _end;
    int _fragment;
    int _host;
    int _param;
    boolean _partial;
    int _path;
    int _port;
    int _portValue;
    int _query;
    byte[] _raw;
    String _rawString;
    int _scheme;
    final Utf8StringBuilder _utf8b;

    public HttpURI(String str) {
        this._partial = false;
        this._raw = __empty;
        this._encoded = false;
        this._utf8b = new Utf8StringBuilder(64);
        this._rawString = str;
        try {
            byte[] bytes = str.getBytes(StringUtil.__UTF8);
            parse(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException e) {
            upk0.m8197a(e.getMessage());
            throw null;
        }
    }

    private void parse2(byte[] bArr, int i, int i2) {
        char c = 0;
        this._encoded = false;
        this._raw = bArr;
        int i3 = i + i2;
        this._end = i3;
        this._scheme = i;
        this._authority = i;
        this._host = i;
        this._port = i;
        this._portValue = -1;
        this._path = i;
        this._param = i3;
        this._query = i3;
        this._fragment = i3;
        int i4 = i;
        int i5 = i4;
        while (i4 < i3) {
            byte[] bArr2 = this._raw;
            char c2 = (char) (bArr2[i4] & 255);
            int i6 = i4 + 1;
            switch (c) {
                case 0:
                    if (c2 == '#') {
                        this._param = i4;
                        this._query = i4;
                        this._fragment = i4;
                    } else if (c2 == '*') {
                        this._path = i4;
                        i5 = i4;
                        i4 = i6;
                        c = '\n';
                    } else if (c2 == '/') {
                        i5 = i4;
                        i4 = i6;
                        c = 1;
                    } else if (c2 == ';') {
                        this._param = i4;
                        i5 = i4;
                        i4 = i6;
                        c = '\b';
                    } else if (c2 != '?') {
                        c = 2;
                    } else {
                        this._param = i4;
                        this._query = i4;
                        i5 = i4;
                        i4 = i6;
                        c = '\t';
                    }
                    i5 = i4;
                    i4 = i6;
                    break;
                case 1:
                    if ((this._partial || this._scheme != this._authority) && c2 == '/') {
                        this._host = i6;
                        int i7 = this._end;
                        this._port = i7;
                        this._path = i7;
                        i4 = i6;
                        c = 4;
                    } else {
                        if (c2 != ';' && c2 != '?' && c2 != '#') {
                            this._host = i5;
                            this._port = i5;
                            i4 = i6;
                        }
                        c = 7;
                    }
                    break;
                case 2:
                    if (i2 > 6 && c2 == 't') {
                        int i8 = i + 3;
                        if (bArr2[i8] == 58) {
                            i6 = i + 4;
                        } else {
                            i8 = i + 4;
                            if (bArr2[i8] == 58) {
                                i6 = i + 5;
                            } else {
                                i8 = i + 5;
                                if (bArr2[i8] == 58) {
                                    i6 = i + 6;
                                }
                            }
                        }
                        i4 = i8;
                        c2 = ':';
                    }
                    if (c2 != '#') {
                        if (c2 == '/') {
                            i4 = i6;
                        } else if (c2 == '?') {
                            this._param = i4;
                            this._query = i4;
                            i4 = i6;
                            c = '\t';
                            break;
                        } else if (c2 == ':') {
                            int i9 = i6 + 1;
                            this._authority = i6;
                            this._path = i6;
                            if (((char) (bArr2[i9] & 255)) == '/') {
                                i4 = i9;
                                i5 = i6;
                                c = 1;
                            } else {
                                this._host = i6;
                                this._port = i6;
                                i4 = i9;
                                i5 = i6;
                            }
                            break;
                        } else if (c2 == ';') {
                            this._param = i4;
                            i4 = i6;
                            c = '\b';
                            break;
                        }
                        c = 7;
                    } else {
                        this._param = i4;
                        this._query = i4;
                        this._fragment = i4;
                    }
                    i4 = i6;
                    break;
                case 3:
                default:
                    i4 = i6;
                    break;
                case 4:
                    if (c2 == '/') {
                        this._path = i4;
                        this._port = i4;
                        i5 = i4;
                        c = 7;
                    } else if (c2 == ':') {
                        this._port = i4;
                        c = 6;
                    } else if (c2 == '@') {
                        this._host = i6;
                    } else if (c2 == '[') {
                        c = 5;
                    }
                    i4 = i6;
                    break;
                case 5:
                    if (c2 == '/') {
                        kg3.a("No closing ']' for ", StringUtil.toString(this._raw, i, i2, URIUtil.__CHARSET));
                    } else {
                        if (c2 == ']') {
                            c = 4;
                        }
                        i4 = i6;
                    }
                    break;
                case 6:
                    if (c2 != '/') {
                        i4 = i6;
                    } else {
                        this._path = i4;
                        if (this._port <= this._authority) {
                            this._port = i4;
                        }
                        i5 = i4;
                        i4 = i6;
                        c = 7;
                    }
                    break;
                case 7:
                    if (c2 == '#') {
                        this._param = i4;
                        this._query = i4;
                        this._fragment = i4;
                    } else if (c2 == '%') {
                        this._encoded = true;
                    } else if (c2 == ';') {
                        this._param = i4;
                        c = '\b';
                    } else if (c2 == '?') {
                        this._param = i4;
                        this._query = i4;
                        c = '\t';
                    }
                    i4 = i6;
                    break;
                case '\b':
                    if (c2 == '#') {
                        this._query = i4;
                        this._fragment = i4;
                    } else if (c2 == '?') {
                        this._query = i4;
                        c = '\t';
                    }
                    i4 = i6;
                    break;
                case '\t':
                    if (c2 == '#') {
                        this._fragment = i4;
                    }
                    i4 = i6;
                    break;
                case '\n':
                    ig3.a("only '*'");
                    break;
            }
            return;
        }
        int i10 = this._port;
        int i11 = this._path;
        if (i10 < i11) {
            this._portValue = TypeUtil.parseInt(this._raw, i10 + 1, (i11 - i10) - 1, 10);
        }
    }

    private String toUtf8String(int i, int i2) {
        this._utf8b.reset();
        this._utf8b.append(this._raw, i, i2);
        return this._utf8b.toString();
    }

    public void clear() {
        this._end = 0;
        this._fragment = 0;
        this._query = 0;
        this._param = 0;
        this._path = 0;
        this._port = 0;
        this._host = 0;
        this._authority = 0;
        this._scheme = 0;
        this._raw = __empty;
        this._rawString = "";
        this._encoded = false;
    }

    public void decodeQueryTo(MultiMap multiMap, String str) throws UnsupportedEncodingException {
        if (this._query == this._fragment) {
            return;
        }
        if (str == null || StringUtil.isUTF8(str)) {
            byte[] bArr = this._raw;
            int i = this._query;
            UrlEncoded.decodeUtf8To(bArr, i + 1, (this._fragment - i) - 1, multiMap);
        } else {
            byte[] bArr2 = this._raw;
            int i2 = this._query;
            UrlEncoded.decodeTo(StringUtil.toString(bArr2, i2 + 1, (this._fragment - i2) - 1, str), multiMap, str);
        }
    }

    public String getAuthority() {
        int i = this._authority;
        int i2 = this._path;
        if (i == i2) {
            return null;
        }
        return toUtf8String(i, i2 - i);
    }

    public String getCompletePath() {
        int i = this._path;
        int i2 = this._end;
        if (i == i2) {
            return null;
        }
        return toUtf8String(i, i2 - i);
    }

    public String getDecodedPath() {
        int i = this._path;
        int i2 = this._param;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        byte[] bArr = null;
        int i4 = 0;
        while (true) {
            int i5 = this._param;
            if (i >= i5) {
                if (bArr == null) {
                    return toUtf8String(this._path, i3);
                }
                this._utf8b.reset();
                this._utf8b.append(bArr, 0, i4);
                return this._utf8b.toString();
            }
            byte[] bArr2 = this._raw;
            byte b = bArr2[i];
            if (b == 37) {
                int i6 = i + 2;
                if (i6 >= i5) {
                    qhg0.m7021a("Bad % encoding: ", this);
                    return null;
                }
                b = (byte) (TypeUtil.parseInt(bArr2, i + 1, 2, 16) & 255);
                i = i6;
            } else {
                if (bArr == null) {
                    i4++;
                }
                i++;
            }
            if (bArr == null) {
                bArr = new byte[i3];
                System.arraycopy(this._raw, this._path, bArr, 0, i4);
            }
            bArr[i4] = b;
            i4++;
            i++;
        }
    }

    public String getFragment() {
        int i = this._fragment;
        int i2 = this._end;
        if (i == i2) {
            return null;
        }
        return toUtf8String(i + 1, (i2 - i) - 1);
    }

    public String getHost() {
        int i = this._host;
        int i2 = this._port;
        if (i == i2) {
            return null;
        }
        return toUtf8String(i, i2 - i);
    }

    public String getParam() {
        int i = this._param;
        int i2 = this._query;
        if (i == i2) {
            return null;
        }
        return toUtf8String(i + 1, (i2 - i) - 1);
    }

    public String getPath() {
        int i = this._path;
        int i2 = this._param;
        if (i == i2) {
            return null;
        }
        return toUtf8String(i, i2 - i);
    }

    public String getPathAndParam() {
        int i = this._path;
        int i2 = this._query;
        if (i == i2) {
            return null;
        }
        return toUtf8String(i, i2 - i);
    }

    public int getPort() {
        return this._portValue;
    }

    public String getQuery(String str) {
        int i = this._query;
        int i2 = this._fragment;
        if (i == i2) {
            return null;
        }
        return StringUtil.toString(this._raw, i + 1, (i2 - i) - 1, str);
    }

    public String getScheme() {
        int i = this._scheme;
        int i2 = this._authority;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 == 5) {
            byte[] bArr = this._raw;
            if (bArr[i] == 104 && bArr[i + 1] == 116 && bArr[i + 2] == 116 && bArr[i + 3] == 112) {
                return "http";
            }
        }
        if (i3 == 6) {
            byte[] bArr2 = this._raw;
            if (bArr2[i] == 104 && bArr2[i + 1] == 116 && bArr2[i + 2] == 116 && bArr2[i + 3] == 112 && bArr2[i + 4] == 115) {
                return "https";
            }
        }
        return toUtf8String(i, (i2 - i) - 1);
    }

    public boolean hasQuery() {
        return this._fragment > this._query;
    }

    public void parse(String str) {
        byte[] bytes = str.getBytes();
        parse2(bytes, 0, bytes.length);
        this._rawString = str;
    }

    public void parseConnect(byte[] bArr, int i, int i2) {
        this._rawString = null;
        this._encoded = false;
        this._raw = bArr;
        int i3 = i + i2;
        this._end = i3;
        this._scheme = i;
        this._authority = i;
        this._host = i;
        this._port = i3;
        this._portValue = -1;
        this._path = i3;
        this._param = i3;
        this._query = i3;
        this._fragment = i3;
        int i4 = i;
        char c = 4;
        while (i4 < i3) {
            char c2 = (char) (this._raw[i4] & 255);
            int i5 = i4 + 1;
            if (c == 4) {
                if (c2 == ':') {
                    this._port = i4;
                    break;
                } else if (c2 == '[') {
                    c = 5;
                }
            } else if (c != 5) {
                continue;
            } else if (c2 == '/') {
                kg3.a("No closing ']' for ", StringUtil.toString(this._raw, i, i2, URIUtil.__CHARSET));
                return;
            } else if (c2 == ']') {
                c = 4;
            }
            i4 = i5;
        }
        int i6 = this._port;
        int i7 = this._path;
        if (i6 >= i7) {
            ig3.a("No port");
        } else {
            this._portValue = TypeUtil.parseInt(this._raw, i6 + 1, (i7 - i6) - 1, 10);
            this._path = i;
        }
    }

    public String toString() {
        if (this._rawString == null) {
            int i = this._scheme;
            this._rawString = toUtf8String(i, this._end - i);
        }
        return this._rawString;
    }

    public void writeTo(Utf8StringBuilder utf8StringBuilder) {
        byte[] bArr = this._raw;
        int i = this._scheme;
        utf8StringBuilder.append(bArr, i, this._end - i);
    }

    public void parse(byte[] bArr, int i, int i2) {
        this._rawString = null;
        parse2(bArr, i, i2);
    }

    public String getQuery() {
        int i = this._query;
        int i2 = this._fragment;
        if (i == i2) {
            return null;
        }
        return toUtf8String(i + 1, (i2 - i) - 1);
    }

    public HttpURI(boolean z) {
        this._partial = false;
        this._raw = __empty;
        this._encoded = false;
        this._utf8b = new Utf8StringBuilder(64);
        this._partial = z;
    }

    public HttpURI() {
        this._partial = false;
        this._raw = __empty;
        this._encoded = false;
        this._utf8b = new Utf8StringBuilder(64);
    }

    public void decodeQueryTo(MultiMap multiMap) {
        if (this._query == this._fragment) {
            return;
        }
        this._utf8b.reset();
        byte[] bArr = this._raw;
        int i = this._query;
        UrlEncoded.decodeUtf8To(bArr, i + 1, (this._fragment - i) - 1, multiMap, this._utf8b);
    }

    public HttpURI(byte[] bArr, int i, int i2) {
        this._partial = false;
        this._raw = __empty;
        this._encoded = false;
        this._utf8b = new Utf8StringBuilder(64);
        parse2(bArr, i, i2);
    }

    public HttpURI(URI uri) {
        this._partial = false;
        this._raw = __empty;
        this._encoded = false;
        this._utf8b = new Utf8StringBuilder(64);
        parse(uri.toASCIIString());
    }

    public String getDecodedPath(String str) {
        int i = this._path;
        int i2 = this._param;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        byte[] bArr = null;
        int i4 = 0;
        while (true) {
            int i5 = this._param;
            if (i >= i5) {
                if (bArr == null) {
                    byte[] bArr2 = this._raw;
                    int i6 = this._path;
                    return StringUtil.toString(bArr2, i6, i5 - i6, str);
                }
                return StringUtil.toString(bArr, 0, i4, str);
            }
            byte[] bArr3 = this._raw;
            byte b = bArr3[i];
            if (b == 37) {
                int i7 = i + 2;
                if (i7 < i5) {
                    b = (byte) (TypeUtil.parseInt(bArr3, i + 1, 2, 16) & 255);
                    i = i7;
                } else {
                    qhg0.m7021a("Bad % encoding: ", this);
                    return null;
                }
            } else {
                if (bArr == null) {
                    i4++;
                }
                i++;
            }
            if (bArr == null) {
                bArr = new byte[i3];
                System.arraycopy(this._raw, this._path, bArr, 0, i4);
            }
            bArr[i4] = b;
            i4++;
            i++;
        }
    }
}

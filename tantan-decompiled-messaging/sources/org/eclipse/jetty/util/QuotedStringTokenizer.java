package org.eclipse.jetty.util;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.aag0;
import p149l.lmr;

/* JADX INFO: loaded from: classes3.dex */
public class QuotedStringTokenizer extends StringTokenizer {
    private static final String __delim = "\t\n\r";
    private static final char[] escapes;
    private String _delim;
    private boolean _double;
    private boolean _hasToken;

    /* JADX INFO: renamed from: _i */
    private int f205893_i;
    private int _lastStart;
    private boolean _returnDelimiters;
    private boolean _returnQuotes;
    private boolean _single;
    private String _string;
    private StringBuffer _token;

    static {
        char[] cArr = new char[32];
        escapes = cArr;
        Arrays.fill(cArr, (char) 65535);
        cArr[8] = Constants.INAPP_POSITION_BOTTOM;
        cArr[9] = Constants.INAPP_POSITION_TOP;
        cArr[10] = 'n';
        cArr[12] = 'f';
        cArr[13] = Constants.INAPP_POSITION_RIGHT;
    }

    public QuotedStringTokenizer(String str, String str2, boolean z, boolean z2) {
        super("");
        this._delim = __delim;
        this._returnQuotes = false;
        this._returnDelimiters = false;
        this._hasToken = false;
        this.f205893_i = 0;
        this._lastStart = 0;
        this._double = true;
        this._single = true;
        this._string = str;
        if (str2 != null) {
            this._delim = str2;
        }
        this._returnDelimiters = z;
        this._returnQuotes = z2;
        if (this._delim.indexOf(39) < 0 && this._delim.indexOf(34) < 0) {
            this._token = new StringBuffer(this._string.length() > 1024 ? 512 : this._string.length() / 2);
            return;
        }
        throw new Error("Can't use quotes as delimiters: " + this._delim);
    }

    public static void quote(Appendable appendable, String str) {
        try {
            appendable.append('\"');
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= ' ') {
                    if (cCharAt == '\"' || cCharAt == '\\') {
                        appendable.append('\\');
                    }
                    appendable.append(cCharAt);
                } else {
                    char c = escapes[cCharAt];
                    if (c == 65535) {
                        appendable.append('\\').append('u').append('0').append('0');
                        if (cCharAt < 16) {
                            appendable.append('0');
                        }
                        appendable.append(Integer.toString(cCharAt, 16));
                    } else {
                        appendable.append('\\').append(c);
                    }
                }
            }
            appendable.append('\"');
        } catch (IOException e) {
            aag0.m95543a(e);
        }
    }

    public static String quoteIfNeeded(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "\"\"";
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\' || cCharAt == '\"' || cCharAt == '\'' || Character.isWhitespace(cCharAt) || str2.indexOf(cCharAt) >= 0) {
                StringBuffer stringBuffer = new StringBuffer(str.length() + 8);
                quote(stringBuffer, str);
                return stringBuffer.toString();
            }
        }
        return str;
    }

    public static String unquote(String str) {
        char cCharAt;
        if (str == null) {
            return null;
        }
        if (str.length() < 2 || (cCharAt = str.charAt(0)) != str.charAt(str.length() - 1)) {
            return str;
        }
        if (cCharAt != '\"' && cCharAt != '\'') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() - 2);
        boolean z = false;
        int i = 1;
        while (i < str.length() - 1) {
            char cCharAt2 = str.charAt(i);
            if (z) {
                if (cCharAt2 == '\"') {
                    sb.append('\"');
                } else if (cCharAt2 == '/') {
                    sb.append('/');
                } else if (cCharAt2 == '\\') {
                    sb.append('\\');
                } else if (cCharAt2 == 'b') {
                    sb.append('\b');
                } else if (cCharAt2 == 'f') {
                    sb.append('\f');
                } else if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else if (cCharAt2 != 'u') {
                    sb.append(cCharAt2);
                } else {
                    int i2 = i + 3;
                    int iConvertHexDigit = (TypeUtil.convertHexDigit((byte) str.charAt(i)) << 24) + (TypeUtil.convertHexDigit((byte) str.charAt(i + 1)) << Tnaf.POW_2_WIDTH) + (TypeUtil.convertHexDigit((byte) str.charAt(i + 2)) << 8);
                    i += 4;
                    sb.append((char) (iConvertHexDigit + TypeUtil.convertHexDigit((byte) str.charAt(i2))));
                }
                z = false;
            } else if (cCharAt2 == '\\') {
                z = true;
            } else {
                sb.append(cCharAt2);
            }
            i++;
        }
        return sb.toString();
    }

    @Override // java.util.StringTokenizer
    public int countTokens() {
        return -1;
    }

    public boolean getDouble() {
        return this._double;
    }

    public boolean getSingle() {
        return this._single;
    }

    @Override // java.util.StringTokenizer, java.util.Enumeration
    public boolean hasMoreElements() {
        return hasMoreTokens();
    }

    @Override // java.util.StringTokenizer
    public boolean hasMoreTokens() {
        if (this._hasToken) {
            return true;
        }
        this._lastStart = this.f205893_i;
        char c = 0;
        boolean z = false;
        while (this.f205893_i < this._string.length()) {
            String str = this._string;
            int i = this.f205893_i;
            this.f205893_i = i + 1;
            char cCharAt = str.charAt(i);
            if (c != 0) {
                if (c == 1) {
                    this._hasToken = true;
                    if (this._delim.indexOf(cCharAt) >= 0) {
                        if (this._returnDelimiters) {
                            this.f205893_i--;
                        }
                        return this._hasToken;
                    }
                    if (cCharAt == '\'' && this._single) {
                        if (this._returnQuotes) {
                            this._token.append(cCharAt);
                        }
                        c = 2;
                    } else if (cCharAt == '\"' && this._double) {
                        if (this._returnQuotes) {
                            this._token.append(cCharAt);
                        }
                        c = 3;
                    } else {
                        this._token.append(cCharAt);
                    }
                } else if (c == 2) {
                    this._hasToken = true;
                    if (z) {
                        this._token.append(cCharAt);
                        z = false;
                    } else if (cCharAt == '\'') {
                        if (this._returnQuotes) {
                            this._token.append(cCharAt);
                        }
                        c = 1;
                    } else if (cCharAt == '\\') {
                        if (this._returnQuotes) {
                            this._token.append(cCharAt);
                        }
                        z = true;
                    } else {
                        this._token.append(cCharAt);
                    }
                } else if (c == 3) {
                    this._hasToken = true;
                    if (z) {
                        this._token.append(cCharAt);
                        z = false;
                    } else if (cCharAt == '\"') {
                        if (this._returnQuotes) {
                            this._token.append(cCharAt);
                        }
                        c = 1;
                    } else if (cCharAt == '\\') {
                        if (this._returnQuotes) {
                            this._token.append(cCharAt);
                        }
                        z = true;
                    } else {
                        this._token.append(cCharAt);
                    }
                }
            } else if (this._delim.indexOf(cCharAt) >= 0) {
                if (this._returnDelimiters) {
                    this._token.append(cCharAt);
                    this._hasToken = true;
                    return true;
                }
            } else if (cCharAt == '\'' && this._single) {
                if (this._returnQuotes) {
                    this._token.append(cCharAt);
                }
                c = 2;
            } else if (cCharAt == '\"' && this._double) {
                if (this._returnQuotes) {
                    this._token.append(cCharAt);
                }
                c = 3;
            } else {
                this._token.append(cCharAt);
                this._hasToken = true;
                c = 1;
            }
        }
        return this._hasToken;
    }

    @Override // java.util.StringTokenizer, java.util.Enumeration
    public Object nextElement() throws NoSuchElementException {
        return nextToken();
    }

    @Override // java.util.StringTokenizer
    public String nextToken() throws NoSuchElementException {
        StringBuffer stringBuffer;
        if (!hasMoreTokens() || (stringBuffer = this._token) == null) {
            lmr.m150601a();
            return null;
        }
        String string = stringBuffer.toString();
        this._token.setLength(0);
        this._hasToken = false;
        return string;
    }

    public void setDouble(boolean z) {
        this._double = z;
    }

    public void setSingle(boolean z) {
        this._single = z;
    }

    @Override // java.util.StringTokenizer
    public String nextToken(String str) throws NoSuchElementException {
        this._delim = str;
        this.f205893_i = this._lastStart;
        this._token.setLength(0);
        this._hasToken = false;
        return nextToken();
    }

    public static boolean quoteIfNeeded(Appendable appendable, String str, String str2) {
        for (int i = 0; i < str.length(); i++) {
            if (str2.indexOf(str.charAt(i)) >= 0) {
                quote(appendable, str);
                return true;
            }
        }
        try {
            appendable.append(str);
            return false;
        } catch (IOException e) {
            aag0.m95543a(e);
            return false;
        }
    }

    public static String quote(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "\"\"";
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 8);
        quote(stringBuffer, str);
        return stringBuffer.toString();
    }

    public QuotedStringTokenizer(String str, String str2, boolean z) {
        this(str, str2, z, false);
    }

    public QuotedStringTokenizer(String str, String str2) {
        this(str, str2, false, false);
    }

    public QuotedStringTokenizer(String str) {
        this(str, null, false, false);
    }
}

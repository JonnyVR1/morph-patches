package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.IOUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.spongycastle.asn1.eac.EACTags;
import p153l.okq;
import p153l.qkq;

/* JADX INFO: loaded from: classes.dex */
public abstract class JSONLexerBase implements JSONLexer, Closeable {
    protected static final int INT_MULTMIN_RADIX_TEN = -214748364;
    protected static final long MULTMIN_RADIX_TEN = -922337203685477580L;

    /* JADX INFO: renamed from: bp */
    protected int f3872bp;

    /* JADX INFO: renamed from: ch */
    protected char f3873ch;
    protected int eofPos;
    protected int features;
    protected boolean hasSpecial;

    /* JADX INFO: renamed from: np */
    protected int f3874np;
    protected int pos;
    protected char[] sbuf;

    /* JADX INFO: renamed from: sp */
    protected int f3875sp;
    protected String stringDefaultValue;
    protected int token;
    private static final ThreadLocal<char[]> SBUF_LOCAL = new ThreadLocal<>();
    protected static final char[] typeFieldName = ("\"" + JSON.DEFAULT_TYPE_KEY + "\":\"").toCharArray();
    protected static final int[] digits = new int[103];
    protected Calendar calendar = null;
    protected TimeZone timeZone = JSON.defaultTimeZone;
    protected Locale locale = JSON.defaultLocale;
    public int matchStat = 0;

    static {
        for (int i = 48; i <= 57; i++) {
            digits[i] = i - 48;
        }
        for (int i2 = 97; i2 <= 102; i2++) {
            digits[i2] = i2 - 87;
        }
        for (int i3 = 65; i3 <= 70; i3++) {
            digits[i3] = i3 - 55;
        }
    }

    public JSONLexerBase(int i) {
        this.stringDefaultValue = null;
        this.features = i;
        if ((i & Feature.InitStringFieldAsEmpty.mask) != 0) {
            this.stringDefaultValue = "";
        }
        char[] cArr = SBUF_LOCAL.get();
        this.sbuf = cArr;
        if (cArr == null) {
            this.sbuf = new char[512];
        }
    }

    public static boolean isWhitespace(char c) {
        if (c <= ' ') {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b';
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    public static String readString(char[] cArr, int i) {
        int i2;
        int i3;
        char[] cArr2 = new char[i];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            char c = cArr[i4];
            if (c != '\\') {
                cArr2[i5] = c;
                i5++;
            } else {
                int i6 = i4 + 1;
                char c2 = cArr[i6];
                if (c2 == '\"') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\"';
                } else if (c2 == '\'') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\'';
                } else if (c2 == 'F') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\f';
                } else if (c2 == '\\') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\\';
                } else if (c2 == 'b') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\b';
                } else if (c2 == 'f') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\f';
                } else if (c2 == 'n') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\n';
                } else if (c2 != 'r') {
                    if (c2 != 'x') {
                        switch (c2) {
                            case '/':
                                i2 = i5 + 1;
                                cArr2[i5] = '/';
                                break;
                            case '0':
                                i2 = i5 + 1;
                                cArr2[i5] = 0;
                                break;
                            case '1':
                                i2 = i5 + 1;
                                cArr2[i5] = 1;
                                break;
                            case '2':
                                i2 = i5 + 1;
                                cArr2[i5] = 2;
                                break;
                            case '3':
                                i2 = i5 + 1;
                                cArr2[i5] = 3;
                                break;
                            case '4':
                                i2 = i5 + 1;
                                cArr2[i5] = 4;
                                break;
                            case '5':
                                i2 = i5 + 1;
                                cArr2[i5] = 5;
                                break;
                            case '6':
                                i2 = i5 + 1;
                                cArr2[i5] = 6;
                                break;
                            case '7':
                                i2 = i5 + 1;
                                cArr2[i5] = 7;
                                break;
                            default:
                                switch (c2) {
                                    case 't':
                                        i2 = i5 + 1;
                                        cArr2[i5] = '\t';
                                        break;
                                    case 'u':
                                        i3 = i5 + 1;
                                        char c3 = cArr[i4 + 2];
                                        char c4 = cArr[i4 + 3];
                                        char c5 = cArr[i4 + 4];
                                        i4 += 5;
                                        cArr2[i5] = (char) Integer.parseInt(new String(new char[]{c3, c4, c5, cArr[i4]}), 16);
                                        break;
                                    case 'v':
                                        i2 = i5 + 1;
                                        cArr2[i5] = 11;
                                        break;
                                    default:
                                        qkq.m176968a("unclosed.str.lit");
                                        return null;
                                }
                                break;
                        }
                    } else {
                        i3 = i5 + 1;
                        int[] iArr = digits;
                        int i7 = iArr[cArr[i4 + 2]] * 16;
                        i4 += 3;
                        cArr2[i5] = (char) (i7 + iArr[cArr[i4]]);
                    }
                    i5 = i3;
                } else {
                    i2 = i5 + 1;
                    cArr2[i5] = '\r';
                }
                i5 = i2;
                i4 = i6;
            }
            i4++;
        }
        return new String(cArr2, 0, i5);
    }

    private void scanStringSingleQuote() {
        this.f3874np = this.f3872bp;
        this.hasSpecial = false;
        while (true) {
            char next = next();
            if (next == '\'') {
                this.token = 4;
                next();
                return;
            }
            if (next != 26) {
                boolean z = this.hasSpecial;
                if (next == '\\') {
                    boolean z2 = true;
                    if (!z) {
                        this.hasSpecial = true;
                        int i = this.f3875sp;
                        char[] cArr = this.sbuf;
                        if (i > cArr.length) {
                            char[] cArr2 = new char[i * 2];
                            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                            this.sbuf = cArr2;
                        }
                        copyTo(this.f3874np + 1, this.f3875sp, this.sbuf);
                    }
                    char next2 = next();
                    if (next2 == '\"') {
                        putChar('\"');
                    } else if (next2 != '\'') {
                        if (next2 != 'F') {
                            if (next2 == '\\') {
                                putChar('\\');
                            } else if (next2 == 'b') {
                                putChar('\b');
                            } else if (next2 != 'f') {
                                if (next2 == 'n') {
                                    putChar('\n');
                                } else if (next2 == 'r') {
                                    putChar('\r');
                                } else if (next2 != 'x') {
                                    switch (next2) {
                                        case '/':
                                            putChar('/');
                                            break;
                                        case '0':
                                            putChar((char) 0);
                                            break;
                                        case '1':
                                            putChar((char) 1);
                                            break;
                                        case '2':
                                            putChar((char) 2);
                                            break;
                                        case '3':
                                            putChar((char) 3);
                                            break;
                                        case '4':
                                            putChar((char) 4);
                                            break;
                                        case '5':
                                            putChar((char) 5);
                                            break;
                                        case '6':
                                            putChar((char) 6);
                                            break;
                                        case '7':
                                            putChar((char) 7);
                                            break;
                                        default:
                                            switch (next2) {
                                                case 't':
                                                    putChar('\t');
                                                    break;
                                                case 'u':
                                                    putChar((char) Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16));
                                                    break;
                                                case 'v':
                                                    putChar((char) 11);
                                                    break;
                                                default:
                                                    this.f3873ch = next2;
                                                    qkq.m176968a("unclosed single-quote string");
                                                    return;
                                            }
                                            break;
                                    }
                                } else {
                                    char next3 = next();
                                    char next4 = next();
                                    boolean z3 = (next3 >= '0' && next3 <= '9') || (next3 >= 'a' && next3 <= 'f') || (next3 >= 'A' && next3 <= 'F');
                                    if ((next4 < '0' || next4 > '9') && ((next4 < 'a' || next4 > 'f') && (next4 < 'A' || next4 > 'F'))) {
                                        z2 = false;
                                    }
                                    if (!z3 || !z2) {
                                        throw new JSONException("invalid escape character \\x" + next3 + next4);
                                    }
                                    int[] iArr = digits;
                                    putChar((char) ((iArr[next3] * 16) + iArr[next4]));
                                }
                            }
                        }
                        putChar('\f');
                    } else {
                        putChar('\'');
                    }
                } else {
                    int i2 = this.f3875sp;
                    if (z) {
                        char[] cArr3 = this.sbuf;
                        if (i2 == cArr3.length) {
                            putChar(next);
                        } else {
                            this.f3875sp = i2 + 1;
                            cArr3[i2] = next;
                        }
                    } else {
                        this.f3875sp = i2 + 1;
                    }
                }
            } else {
                if (isEOF()) {
                    qkq.m176968a("unclosed single-quote string");
                    return;
                }
                putChar(JSONLexer.EOI);
            }
        }
    }

    public abstract String addSymbol(int i, int i2, int i3, SymbolTable symbolTable);

    public abstract void arrayCopy(int i, char[] cArr, int i2, int i3);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract byte[] bytesValue();

    public abstract boolean charArrayCompare(char[] cArr);

    public abstract char charAt(int i);

    @Override // com.alibaba.fastjson.parser.JSONLexer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        char[] cArr = this.sbuf;
        if (cArr.length <= 8192) {
            SBUF_LOCAL.set(cArr);
        }
        this.sbuf = null;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void config(Feature feature, boolean z) {
        int iConfig = Feature.config(this.features, feature, z);
        this.features = iConfig;
        if ((iConfig & Feature.InitStringFieldAsEmpty.mask) != 0) {
            this.stringDefaultValue = "";
        }
    }

    public abstract void copyTo(int i, int i2, char[] cArr);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final Number decimalValue(boolean z) {
        char cCharAt = charAt((this.f3874np + this.f3875sp) - 1);
        try {
            if (cCharAt == 'F') {
                return Float.valueOf(Float.parseFloat(numberString()));
            }
            if (cCharAt == 'D') {
                return Double.valueOf(Double.parseDouble(numberString()));
            }
            return z ? decimalValue() : Double.valueOf(doubleValue());
        } catch (NumberFormatException e) {
            throw new JSONException(e.getMessage() + ", " + info());
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract BigDecimal decimalValue();

    public double doubleValue() {
        return Double.parseDouble(numberString());
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public float floatValue() {
        char cCharAt;
        String strNumberString = numberString();
        float f = Float.parseFloat(strNumberString);
        if ((f != 0.0f && f != Float.POSITIVE_INFINITY) || (cCharAt = strNumberString.charAt(0)) <= '0' || cCharAt > '9') {
            return f;
        }
        qkq.m176968a("float overflow : ".concat(strNumberString));
        return 0.0f;
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final char getCurrent() {
        return this.f3873ch;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public int getFeatures() {
        return this.features;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public Locale getLocale() {
        return this.locale;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public abstract int indexOf(char c, int i);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String info() {
        return "";
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int intValue() {
        int i;
        boolean z;
        int i2 = 0;
        if (this.f3874np == -1) {
            this.f3874np = 0;
        }
        int i3 = this.f3874np;
        int i4 = this.f3875sp + i3;
        if (charAt(i3) == '-') {
            i3++;
            i = Integer.MIN_VALUE;
            z = true;
        } else {
            i = -2147483647;
            z = false;
        }
        if (i3 < i4) {
            i2 = -(charAt(i3) - '0');
            i3++;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            char cCharAt = charAt(i3);
            if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B') {
                i3 = i5;
                break;
            }
            int i6 = cCharAt - '0';
            if (i2 < -214748364) {
                throw new NumberFormatException(numberString());
            }
            int i7 = i2 * 10;
            if (i7 < i + i6) {
                throw new NumberFormatException(numberString());
            }
            i2 = i7 - i6;
            i3 = i5;
        }
        if (!z) {
            return -i2;
        }
        if (i3 > this.f3874np + 1) {
            return i2;
        }
        throw new NumberFormatException(numberString());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0086 -> B:19:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.Number integerValue() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.integerValue():java.lang.Number");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public boolean isBlankInput() {
        int i = 0;
        while (true) {
            char cCharAt = charAt(i);
            if (cCharAt == 26) {
                this.token = 20;
                return true;
            }
            if (!isWhitespace(cCharAt)) {
                return false;
            }
            i++;
        }
    }

    public abstract boolean isEOF();

    public final boolean isEnabled(int i, int i2) {
        return ((this.features & i2) == 0 && (i & i2) == 0) ? false : true;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isRef() {
        return this.f3875sp == 4 && charAt(this.f3874np + 1) == '$' && charAt(this.f3874np + 2) == 'r' && charAt(this.f3874np + 3) == 'e' && charAt(this.f3874np + 4) == 'f';
    }

    public void lexError(String str, Object... objArr) {
        this.token = 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005c -> B:11:0x002e). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final long longValue() throws NumberFormatException {
        long j;
        long j2;
        int i;
        char cCharAt;
        boolean z = false;
        if (this.f3874np == -1) {
            this.f3874np = 0;
        }
        int i2 = this.f3874np;
        int i3 = this.f3875sp + i2;
        if (charAt(i2) == '-') {
            i2++;
            j = Long.MIN_VALUE;
            z = true;
        } else {
            j = -9223372036854775807L;
        }
        if (i2 >= i3) {
            j2 = 0;
            if (i2 < i3) {
                i = i2 + 1;
                cCharAt = charAt(i2);
                if (cCharAt != 'L' || cCharAt == 'S' || cCharAt == 'B') {
                    i2 = i;
                } else {
                    int i4 = cCharAt - '0';
                    if (j2 < MULTMIN_RADIX_TEN) {
                        throw new NumberFormatException(numberString());
                    }
                    long j3 = j2 * 10;
                    long j4 = i4;
                    if (j3 < j + j4) {
                        throw new NumberFormatException(numberString());
                    }
                    j2 = j3 - j4;
                }
            }
            if (z) {
                return -j2;
            }
            if (i2 > this.f3874np + 1) {
                return j2;
            }
            throw new NumberFormatException(numberString());
        }
        i = i2 + 1;
        j2 = -(charAt(i2) - '0');
        i2 = i;
        if (i2 < i3) {
            i = i2 + 1;
            cCharAt = charAt(i2);
            if (cCharAt != 'L') {
            }
            i2 = i;
        }
        if (z) {
            return -j2;
        }
        if (i2 > this.f3874np + 1) {
            return j2;
        }
        throw new NumberFormatException(numberString());
    }

    public final boolean matchField(char[] cArr) {
        while (!charArrayCompare(cArr)) {
            if (!isWhitespace(this.f3873ch)) {
                return false;
            }
            next();
        }
        int length = this.f3872bp + cArr.length;
        this.f3872bp = length;
        char cCharAt = charAt(length);
        this.f3873ch = cCharAt;
        if (cCharAt == '{') {
            next();
            this.token = 12;
        } else if (cCharAt == '[') {
            next();
            this.token = 14;
        } else if (cCharAt == 'S' && charAt(this.f3872bp + 1) == 'e' && charAt(this.f3872bp + 2) == 't' && charAt(this.f3872bp + 3) == '[') {
            int i = this.f3872bp + 3;
            this.f3872bp = i;
            this.f3873ch = charAt(i);
            this.token = 21;
        } else {
            nextToken();
        }
        return true;
    }

    public boolean matchField2(char[] cArr) {
        throw new UnsupportedOperationException();
    }

    public final int matchStat() {
        return this.matchStat;
    }

    public Collection<String> newCollectionByType(Class<?> cls) {
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception e) {
            okq.m168043a(e.getMessage(), e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract char next();

    public final void nextIdent() {
        while (isWhitespace(this.f3873ch)) {
            next();
        }
        char c = this.f3873ch;
        if (c == '_' || c == '$' || Character.isLetter(c)) {
            scanIdent();
        } else {
            nextToken();
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextToken() {
        this.f3875sp = 0;
        while (true) {
            this.pos = this.f3872bp;
            char c = this.f3873ch;
            if (c == '/') {
                skipComment();
            } else {
                if (c == '\"') {
                    scanString();
                    return;
                }
                if (c == ',') {
                    next();
                    this.token = 16;
                    return;
                }
                if (c >= '0' && c <= '9') {
                    scanNumber();
                    return;
                }
                if (c == '-') {
                    scanNumber();
                    return;
                }
                switch (c) {
                    case '\b':
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                        next();
                        break;
                    case '\'':
                        if (isEnabled(Feature.AllowSingleQuotes)) {
                            scanStringSingleQuote();
                            return;
                        } else {
                            qkq.m176968a("Feature.AllowSingleQuotes is false");
                            return;
                        }
                    case '(':
                        next();
                        this.token = 10;
                        return;
                    case ')':
                        next();
                        this.token = 11;
                        return;
                    case '+':
                        next();
                        scanNumber();
                        return;
                    case '.':
                        next();
                        this.token = 25;
                        return;
                    case ':':
                        next();
                        this.token = 17;
                        return;
                    case ';':
                        next();
                        this.token = 24;
                        return;
                    case 'N':
                    case EACTags.DISCRETIONARY_DATA /* 83 */:
                    case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                    case 'u':
                        scanIdent();
                        return;
                    case EACTags.NAME /* 91 */:
                        next();
                        this.token = 14;
                        return;
                    case EACTags.HEADER_LIST /* 93 */:
                        next();
                        this.token = 15;
                        return;
                    case 'f':
                        scanFalse();
                        return;
                    case 'n':
                        scanNullOrNew();
                        return;
                    case 't':
                        scanTrue();
                        return;
                    case 'x':
                        scanHex();
                        return;
                    case '{':
                        next();
                        this.token = 12;
                        return;
                    case '}':
                        next();
                        this.token = 13;
                        return;
                    default:
                        if (isEOF()) {
                            if (this.token == 20) {
                                qkq.m176968a("EOF error");
                                return;
                            }
                            this.token = 20;
                            int i = this.f3872bp;
                            this.pos = i;
                            this.eofPos = i;
                            return;
                        }
                        char c2 = this.f3873ch;
                        if (c2 > 31 && c2 != 127) {
                            lexError("illegal.char", String.valueOf((int) c2));
                            next();
                            return;
                        }
                        next();
                        break;
                        break;
                }
            }
        }
    }

    public final void nextTokenWithChar(char c) {
        this.f3875sp = 0;
        while (true) {
            char c2 = this.f3873ch;
            if (c2 == c) {
                next();
                nextToken();
                return;
            }
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != '\f' && c2 != '\b') {
                throw new JSONException("not match " + c + " - " + this.f3873ch + ", info : " + info());
            }
            next();
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextTokenWithColon() {
        nextTokenWithChar(':');
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract String numberString();

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int pos() {
        return this.pos;
    }

    public final void putChar(char c) {
        int i = this.f3875sp;
        char[] cArr = this.sbuf;
        if (i == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.sbuf = cArr2;
        }
        char[] cArr3 = this.sbuf;
        int i2 = this.f3875sp;
        this.f3875sp = i2 + 1;
        cArr3[i2] = c;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void resetStringPosition() {
        this.f3875sp = 0;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac A[LOOP:0: B:34:0x0096->B:39:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7 A[SYNTHETIC] */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public boolean scanBoolean(char c) {
        boolean z = false;
        this.matchStat = 0;
        char cCharAt = charAt(this.f3872bp);
        int i = 5;
        if (cCharAt != 't') {
            if (cCharAt == 'f') {
                if (charAt(this.f3872bp + 1) != 'a' || charAt(this.f3872bp + 2) != 'l' || charAt(this.f3872bp + 3) != 's' || charAt(this.f3872bp + 4) != 'e') {
                    this.matchStat = -1;
                    return false;
                }
                cCharAt = charAt(this.f3872bp + 5);
                i = 6;
            } else if (cCharAt == '1') {
                cCharAt = charAt(this.f3872bp + 1);
                i = 2;
            } else if (cCharAt == '0') {
                cCharAt = charAt(this.f3872bp + 1);
                i = 2;
            } else {
                i = 1;
            }
            while (cCharAt != c) {
                if (isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    return z;
                }
                cCharAt = charAt(this.f3872bp + i);
                i++;
            }
            int i2 = this.f3872bp + i;
            this.f3872bp = i2;
            this.f3873ch = charAt(i2);
            this.matchStat = 3;
            return z;
        }
        if (charAt(this.f3872bp + 1) != 'r' || charAt(this.f3872bp + 2) != 'u' || charAt(this.f3872bp + 3) != 'e') {
            this.matchStat = -1;
            return false;
        }
        cCharAt = charAt(this.f3872bp + 4);
        z = true;
        while (cCharAt != c) {
            if (isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return z;
            }
            cCharAt = charAt(this.f3872bp + i);
            i++;
        }
        int i3 = this.f3872bp + i;
        this.f3872bp = i3;
        this.f3873ch = charAt(i3);
        this.matchStat = 3;
        return z;
    }

    public Date scanDate(char c) {
        char cCharAt;
        int i;
        long j;
        Date date;
        int i2;
        char cCharAt2;
        boolean z = false;
        this.matchStat = 0;
        char cCharAt3 = charAt(this.f3872bp);
        int i3 = 1;
        if (cCharAt3 == '\"') {
            int iIndexOf = indexOf('\"', this.f3872bp + 1);
            if (iIndexOf == -1) {
                qkq.m176968a("unclosed str");
                return null;
            }
            int i4 = this.f3872bp + 1;
            String strSubString = subString(i4, iIndexOf - i4);
            if (strSubString.indexOf(92) != -1) {
                while (true) {
                    int i5 = 0;
                    for (int i6 = iIndexOf - 1; i6 >= 0 && charAt(i6) == '\\'; i6--) {
                        i5++;
                    }
                    if (i5 % 2 == 0) {
                        break;
                    }
                    iIndexOf = indexOf('\"', iIndexOf + 1);
                }
                int i7 = this.f3872bp;
                int i8 = iIndexOf - (i7 + 1);
                strSubString = readString(sub_chars(i7 + 1, i8), i8);
            }
            int i9 = this.f3872bp;
            int i10 = iIndexOf - (i9 + 1);
            int i11 = i10 + 2;
            i = i10 + 3;
            cCharAt = charAt(i9 + i11);
            JSONScanner jSONScanner = new JSONScanner(strSubString);
            try {
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    this.matchStat = -1;
                    jSONScanner.close();
                    return null;
                }
                date = jSONScanner.getCalendar().getTime();
                jSONScanner.close();
            } catch (Throwable th) {
                jSONScanner.close();
                throw th;
            }
        } else {
            char c2 = '9';
            if (cCharAt3 == '-' || (cCharAt3 >= '0' && cCharAt3 <= '9')) {
                if (cCharAt3 == '-') {
                    cCharAt3 = charAt(this.f3872bp + 1);
                    z = true;
                    i3 = 2;
                }
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    int i12 = i3;
                    cCharAt = cCharAt3;
                    i = i12;
                    j = 0;
                } else {
                    j = cCharAt3 - '0';
                    while (true) {
                        i2 = i3 + 1;
                        cCharAt2 = charAt(this.f3872bp + i3);
                        if (cCharAt2 < '0' || cCharAt2 > c2) {
                            break;
                        }
                        j = (j * 10) + ((long) (cCharAt2 - '0'));
                        i3 = i2;
                        c2 = '9';
                    }
                    cCharAt = cCharAt2;
                    i = i2;
                }
                if (j < 0) {
                    this.matchStat = -1;
                    return null;
                }
                if (z) {
                    j = -j;
                }
                date = new Date(j);
            } else {
                if (cCharAt3 != 'n' || charAt(this.f3872bp + 1) != 'u' || charAt(this.f3872bp + 2) != 'l' || charAt(this.f3872bp + 3) != 'l') {
                    this.matchStat = -1;
                    return null;
                }
                i = 5;
                this.matchStat = 5;
                cCharAt = charAt(this.f3872bp + 4);
                date = null;
            }
        }
        if (cCharAt == ',') {
            int i13 = this.f3872bp + i;
            this.f3872bp = i13;
            this.f3873ch = charAt(i13);
            this.matchStat = 3;
            this.token = 16;
            return date;
        }
        if (cCharAt != ']') {
            this.matchStat = -1;
            return null;
        }
        int i14 = i + 1;
        char cCharAt4 = charAt(this.f3872bp + i);
        if (cCharAt4 == ',') {
            this.token = 16;
            int i15 = this.f3872bp + i14;
            this.f3872bp = i15;
            this.f3873ch = charAt(i15);
        } else if (cCharAt4 == ']') {
            this.token = 15;
            int i16 = this.f3872bp + i14;
            this.f3872bp = i16;
            this.f3873ch = charAt(i16);
        } else if (cCharAt4 == '}') {
            this.token = 13;
            int i17 = this.f3872bp + i14;
            this.f3872bp = i17;
            this.f3873ch = charAt(i17);
        } else {
            if (cCharAt4 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.f3872bp += i;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return date;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x009d -> B:39:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public java.math.BigDecimal scanDecimal(char r18) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanDecimal(char):java.math.BigDecimal");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ca -> B:49:0x00ba). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public double scanDouble(char r25) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanDouble(char):double");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public Enum<?> scanEnum(Class<?> cls, SymbolTable symbolTable, char c) {
        String strScanSymbolWithSeperator = scanSymbolWithSeperator(symbolTable, c);
        if (strScanSymbolWithSeperator == null) {
            return null;
        }
        return Enum.valueOf(cls, strScanSymbolWithSeperator);
    }

    public long scanEnumSymbol(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = cArr.length;
        int i = length + 1;
        if (charAt(this.f3872bp + length) != '\"') {
            this.matchStat = -1;
            return 0L;
        }
        long j = -3750763034362895579L;
        while (true) {
            int i2 = i + 1;
            char cCharAt = charAt(this.f3872bp + i);
            if (cCharAt == '\"') {
                int i3 = i + 2;
                char cCharAt2 = charAt(this.f3872bp + i2);
                if (cCharAt2 == ',') {
                    int i4 = this.f3872bp + i3;
                    this.f3872bp = i4;
                    this.f3873ch = charAt(i4);
                    this.matchStat = 3;
                    return j;
                }
                if (cCharAt2 != '}') {
                    this.matchStat = -1;
                    return 0L;
                }
                int i5 = i + 3;
                char cCharAt3 = charAt(this.f3872bp + i3);
                if (cCharAt3 == ',') {
                    this.token = 16;
                    int i6 = this.f3872bp + i5;
                    this.f3872bp = i6;
                    this.f3873ch = charAt(i6);
                } else if (cCharAt3 == ']') {
                    this.token = 15;
                    int i7 = this.f3872bp + i5;
                    this.f3872bp = i7;
                    this.f3873ch = charAt(i7);
                } else if (cCharAt3 == '}') {
                    this.token = 13;
                    int i8 = this.f3872bp + i5;
                    this.f3872bp = i8;
                    this.f3873ch = charAt(i8);
                } else {
                    if (cCharAt3 != 26) {
                        this.matchStat = -1;
                        return 0L;
                    }
                    this.token = 20;
                    this.f3872bp += i + 2;
                    this.f3873ch = JSONLexer.EOI;
                }
                this.matchStat = 4;
                return j;
            }
            j = (j ^ ((long) ((cCharAt < 'A' || cCharAt > 'Z') ? cCharAt : cCharAt + ' '))) * 1099511628211L;
            if (cCharAt == '\\') {
                this.matchStat = -1;
                return 0L;
            }
            i = i2;
        }
    }

    public final void scanFalse() {
        if (this.f3873ch != 'f') {
            qkq.m176968a("error parse false");
            return;
        }
        next();
        if (this.f3873ch != 'a') {
            qkq.m176968a("error parse false");
            return;
        }
        next();
        if (this.f3873ch != 'l') {
            qkq.m176968a("error parse false");
            return;
        }
        next();
        if (this.f3873ch != 's') {
            qkq.m176968a("error parse false");
            return;
        }
        next();
        if (this.f3873ch != 'e') {
            qkq.m176968a("error parse false");
            return;
        }
        next();
        char c = this.f3873ch;
        if (c == ' ' || c == ',' || c == '}' || c == ']' || c == '\n' || c == '\r' || c == '\t' || c == 26 || c == '\f' || c == '\b' || c == ':' || c == '/') {
            this.token = 7;
        } else {
            qkq.m176968a("scan false error");
        }
    }

    public BigInteger scanFieldBigInteger(char[] cArr) {
        int i;
        char cCharAt;
        boolean z;
        int length;
        int i2;
        BigInteger bigInteger;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length2 = cArr.length;
        int i3 = length2 + 1;
        char cCharAt2 = charAt(this.f3872bp + length2);
        boolean z2 = cCharAt2 == '\"';
        if (z2) {
            cCharAt2 = charAt(this.f3872bp + i3);
            i3 = length2 + 2;
        }
        boolean z3 = cCharAt2 == '-';
        if (z3) {
            cCharAt2 = charAt(this.f3872bp + i3);
            i3++;
        }
        if (cCharAt2 >= '0') {
            char c = '9';
            if (cCharAt2 <= '9') {
                long j = cCharAt2 - '0';
                while (true) {
                    i = i3 + 1;
                    cCharAt = charAt(this.f3872bp + i3);
                    if (cCharAt < '0' || cCharAt > c) {
                        z = false;
                        break;
                    }
                    long j2 = (10 * j) + ((long) (cCharAt - '0'));
                    if (j2 < j) {
                        z = true;
                        break;
                    }
                    j = j2;
                    i3 = i;
                    c = '9';
                }
                if (!z2) {
                    int i4 = this.f3872bp;
                    length = cArr.length + i4;
                    i2 = ((i4 + i) - length) - 1;
                } else {
                    if (cCharAt != '\"') {
                        this.matchStat = -1;
                        return null;
                    }
                    int i5 = i3 + 2;
                    cCharAt = charAt(this.f3872bp + i);
                    int i6 = this.f3872bp;
                    length = cArr.length + i6 + 1;
                    i2 = ((i6 + i5) - length) - 2;
                    i = i5;
                }
                if (z || (i2 >= 20 && (!z3 || i2 >= 21))) {
                    bigInteger = new BigInteger(subString(length, i2));
                } else {
                    if (z3) {
                        j = -j;
                    }
                    bigInteger = BigInteger.valueOf(j);
                }
                if (cCharAt == ',') {
                    int i7 = this.f3872bp + i;
                    this.f3872bp = i7;
                    this.f3873ch = charAt(i7);
                    this.matchStat = 3;
                    this.token = 16;
                    return bigInteger;
                }
                if (cCharAt != '}') {
                    this.matchStat = -1;
                    return null;
                }
                int i8 = i + 1;
                char cCharAt3 = charAt(this.f3872bp + i);
                if (cCharAt3 == ',') {
                    this.token = 16;
                    int i9 = this.f3872bp + i8;
                    this.f3872bp = i9;
                    this.f3873ch = charAt(i9);
                } else if (cCharAt3 == ']') {
                    this.token = 15;
                    int i10 = this.f3872bp + i8;
                    this.f3872bp = i10;
                    this.f3873ch = charAt(i10);
                } else if (cCharAt3 == '}') {
                    this.token = 13;
                    int i11 = this.f3872bp + i8;
                    this.f3872bp = i11;
                    this.f3873ch = charAt(i11);
                } else {
                    if (cCharAt3 != 26) {
                        this.matchStat = -1;
                        return null;
                    }
                    this.token = 20;
                    this.f3872bp += i;
                    this.f3873ch = JSONLexer.EOI;
                }
                this.matchStat = 4;
                return bigInteger;
            }
        }
        if (cCharAt2 != 'n' || charAt(this.f3872bp + i3) != 'u' || charAt(this.f3872bp + i3 + 1) != 'l' || charAt(this.f3872bp + i3 + 2) != 'l') {
            this.matchStat = -1;
            return null;
        }
        this.matchStat = 5;
        int i12 = i3 + 4;
        char cCharAt4 = charAt(this.f3872bp + i3 + 3);
        if (z2 && cCharAt4 == '\"') {
            int i13 = i3 + 5;
            cCharAt4 = charAt(this.f3872bp + i12);
            i12 = i13;
        }
        while (cCharAt4 != ',') {
            if (cCharAt4 == '}') {
                int i14 = this.f3872bp + i12;
                this.f3872bp = i14;
                this.f3873ch = charAt(i14);
                this.matchStat = 5;
                this.token = 13;
                return null;
            }
            if (!isWhitespace(cCharAt4)) {
                this.matchStat = -1;
                return null;
            }
            int i15 = i12 + 1;
            cCharAt4 = charAt(this.f3872bp + i12);
            i12 = i15;
        }
        int i16 = this.f3872bp + i12;
        this.f3872bp = i16;
        this.f3873ch = charAt(i16);
        this.matchStat = 5;
        this.token = 16;
        return null;
    }

    public boolean scanFieldBoolean(char[] cArr) {
        int i;
        boolean z;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return false;
        }
        int length = cArr.length;
        int i2 = length + 1;
        char cCharAt = charAt(this.f3872bp + length);
        if (cCharAt == 't') {
            int i3 = length + 2;
            if (charAt(this.f3872bp + i2) != 'r') {
                this.matchStat = -1;
                return false;
            }
            int i4 = length + 3;
            if (charAt(this.f3872bp + i3) != 'u') {
                this.matchStat = -1;
                return false;
            }
            i = length + 4;
            if (charAt(this.f3872bp + i4) != 'e') {
                this.matchStat = -1;
                return false;
            }
            z = true;
        } else {
            if (cCharAt != 'f') {
                this.matchStat = -1;
                return false;
            }
            int i5 = length + 2;
            if (charAt(this.f3872bp + i2) != 'a') {
                this.matchStat = -1;
                return false;
            }
            int i6 = length + 3;
            if (charAt(this.f3872bp + i5) != 'l') {
                this.matchStat = -1;
                return false;
            }
            int i7 = length + 4;
            if (charAt(this.f3872bp + i6) != 's') {
                this.matchStat = -1;
                return false;
            }
            i = length + 5;
            if (charAt(this.f3872bp + i7) != 'e') {
                this.matchStat = -1;
                return false;
            }
            z = false;
        }
        int i8 = i + 1;
        char cCharAt2 = charAt(this.f3872bp + i);
        if (cCharAt2 == ',') {
            int i9 = this.f3872bp + i8;
            this.f3872bp = i9;
            this.f3873ch = charAt(i9);
            this.matchStat = 3;
            this.token = 16;
            return z;
        }
        if (cCharAt2 != '}') {
            this.matchStat = -1;
            return false;
        }
        int i10 = i + 2;
        char cCharAt3 = charAt(this.f3872bp + i8);
        if (cCharAt3 == ',') {
            this.token = 16;
            int i11 = this.f3872bp + i10;
            this.f3872bp = i11;
            this.f3873ch = charAt(i11);
        } else if (cCharAt3 == ']') {
            this.token = 15;
            int i12 = this.f3872bp + i10;
            this.f3872bp = i12;
            this.f3873ch = charAt(i12);
        } else if (cCharAt3 == '}') {
            this.token = 13;
            int i13 = this.f3872bp + i10;
            this.f3872bp = i13;
            this.f3873ch = charAt(i13);
        } else {
            if (cCharAt3 != 26) {
                this.matchStat = -1;
                return false;
            }
            this.token = 20;
            this.f3872bp += i + 1;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return z;
    }

    public Date scanFieldDate(char[] cArr) {
        char cCharAt;
        int i;
        long j;
        Date date;
        int i2;
        char cCharAt2;
        boolean z = false;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i3 = length + 1;
        char cCharAt3 = charAt(this.f3872bp + length);
        if (cCharAt3 == '\"') {
            int iIndexOf = indexOf('\"', this.f3872bp + cArr.length + 1);
            if (iIndexOf == -1) {
                qkq.m176968a("unclosed str");
                return null;
            }
            int length2 = this.f3872bp + cArr.length + 1;
            String strSubString = subString(length2, iIndexOf - length2);
            if (strSubString.indexOf(92) != -1) {
                while (true) {
                    int i4 = 0;
                    for (int i5 = iIndexOf - 1; i5 >= 0 && charAt(i5) == '\\'; i5--) {
                        i4++;
                    }
                    if (i4 % 2 == 0) {
                        break;
                    }
                    iIndexOf = indexOf('\"', iIndexOf + 1);
                }
                int i6 = this.f3872bp;
                int length3 = iIndexOf - ((cArr.length + i6) + 1);
                strSubString = readString(sub_chars(i6 + cArr.length + 1, length3), length3);
            }
            int i7 = this.f3872bp;
            int length4 = i3 + (iIndexOf - ((cArr.length + i7) + 1)) + 1;
            i = length4 + 1;
            cCharAt = charAt(i7 + length4);
            JSONScanner jSONScanner = new JSONScanner(strSubString);
            try {
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    this.matchStat = -1;
                    jSONScanner.close();
                    return null;
                }
                date = jSONScanner.getCalendar().getTime();
                jSONScanner.close();
            } catch (Throwable th) {
                jSONScanner.close();
                throw th;
            }
        } else {
            if (cCharAt3 != '-' && (cCharAt3 < '0' || cCharAt3 > '9')) {
                this.matchStat = -1;
                return null;
            }
            if (cCharAt3 == '-') {
                cCharAt3 = charAt(this.f3872bp + i3);
                i3 = length + 2;
                z = true;
            }
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                cCharAt = cCharAt3;
                i = i3;
                j = 0;
            } else {
                j = cCharAt3 - '0';
                while (true) {
                    i2 = i3 + 1;
                    cCharAt2 = charAt(this.f3872bp + i3);
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    j = (j * 10) + ((long) (cCharAt2 - '0'));
                    i3 = i2;
                }
                cCharAt = cCharAt2;
                i = i2;
            }
            if (j < 0) {
                this.matchStat = -1;
                return null;
            }
            if (z) {
                j = -j;
            }
            date = new Date(j);
        }
        if (cCharAt == ',') {
            int i8 = this.f3872bp + i;
            this.f3872bp = i8;
            this.f3873ch = charAt(i8);
            this.matchStat = 3;
            return date;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return null;
        }
        int i9 = i + 1;
        char cCharAt4 = charAt(this.f3872bp + i);
        if (cCharAt4 == ',') {
            this.token = 16;
            int i10 = this.f3872bp + i9;
            this.f3872bp = i10;
            this.f3873ch = charAt(i10);
        } else if (cCharAt4 == ']') {
            this.token = 15;
            int i11 = this.f3872bp + i9;
            this.f3872bp = i11;
            this.f3873ch = charAt(i11);
        } else if (cCharAt4 == '}') {
            this.token = 13;
            int i12 = this.f3872bp + i9;
            this.f3872bp = i12;
            this.f3873ch = charAt(i12);
        } else {
            if (cCharAt4 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.f3872bp += i;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return date;
    }

    public BigDecimal scanFieldDecimal(char[] cArr) {
        int i;
        char cCharAt;
        int length;
        int i2;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length2 = cArr.length;
        int i3 = length2 + 1;
        char cCharAt2 = charAt(this.f3872bp + length2);
        boolean z = cCharAt2 == '\"';
        if (z) {
            cCharAt2 = charAt(this.f3872bp + i3);
            i3 = length2 + 2;
        }
        if (cCharAt2 == '-') {
            cCharAt2 = charAt(this.f3872bp + i3);
            i3++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            if (cCharAt2 != 'n' || charAt(this.f3872bp + i3) != 'u' || charAt(this.f3872bp + i3 + 1) != 'l' || charAt(this.f3872bp + i3 + 2) != 'l') {
                this.matchStat = -1;
                return null;
            }
            this.matchStat = 5;
            int i4 = i3 + 4;
            char cCharAt3 = charAt(this.f3872bp + i3 + 3);
            if (z && cCharAt3 == '\"') {
                cCharAt3 = charAt(this.f3872bp + i4);
                i4 = i3 + 5;
            }
            while (cCharAt3 != ',') {
                if (cCharAt3 == '}') {
                    int i5 = this.f3872bp + i4;
                    this.f3872bp = i5;
                    this.f3873ch = charAt(i5);
                    this.matchStat = 5;
                    this.token = 13;
                    return null;
                }
                if (!isWhitespace(cCharAt3)) {
                    this.matchStat = -1;
                    return null;
                }
                char cCharAt4 = charAt(this.f3872bp + i4);
                i4++;
                cCharAt3 = cCharAt4;
            }
            int i6 = this.f3872bp + i4;
            this.f3872bp = i6;
            this.f3873ch = charAt(i6);
            this.matchStat = 5;
            this.token = 16;
            return null;
        }
        while (true) {
            i = i3 + 1;
            cCharAt = charAt(this.f3872bp + i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i3 = i;
        }
        if (cCharAt == '.') {
            int i7 = i3 + 2;
            char cCharAt5 = charAt(this.f3872bp + i);
            if (cCharAt5 < '0' || cCharAt5 > '9') {
                this.matchStat = -1;
                return null;
            }
            while (true) {
                i = i7 + 1;
                cCharAt = charAt(this.f3872bp + i7);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i7 = i;
            }
        }
        if (cCharAt == 'e' || cCharAt == 'E') {
            int i8 = i + 1;
            char cCharAt6 = charAt(this.f3872bp + i);
            if (cCharAt6 == '+' || cCharAt6 == '-') {
                i += 2;
                cCharAt = charAt(this.f3872bp + i8);
            } else {
                i = i8;
                cCharAt = cCharAt6;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                cCharAt = charAt(this.f3872bp + i);
                i++;
            }
        }
        if (!z) {
            int i9 = this.f3872bp;
            length = cArr.length + i9;
            i2 = ((i9 + i) - length) - 1;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return null;
            }
            int i10 = i + 1;
            cCharAt = charAt(this.f3872bp + i);
            int i11 = this.f3872bp;
            length = cArr.length + i11 + 1;
            i2 = ((i11 + i10) - length) - 2;
            i = i10;
        }
        BigDecimal bigDecimal = new BigDecimal(sub_chars(length, i2));
        if (cCharAt == ',') {
            int i12 = this.f3872bp + i;
            this.f3872bp = i12;
            this.f3873ch = charAt(i12);
            this.matchStat = 3;
            this.token = 16;
            return bigDecimal;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return null;
        }
        int i13 = i + 1;
        char cCharAt7 = charAt(this.f3872bp + i);
        if (cCharAt7 == ',') {
            this.token = 16;
            int i14 = this.f3872bp + i13;
            this.f3872bp = i14;
            this.f3873ch = charAt(i14);
        } else if (cCharAt7 == ']') {
            this.token = 15;
            int i15 = this.f3872bp + i13;
            this.f3872bp = i15;
            this.f3873ch = charAt(i15);
        } else if (cCharAt7 == '}') {
            this.token = 13;
            int i16 = this.f3872bp + i13;
            this.f3872bp = i16;
            this.f3873ch = charAt(i16);
        } else {
            if (cCharAt7 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.f3872bp += i;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return bigDecimal;
    }

    public final double scanFieldDouble(char[] cArr) {
        int i;
        char cCharAt;
        long j;
        int length;
        int i2;
        double d;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        int length2 = cArr.length;
        int i3 = length2 + 1;
        char cCharAt2 = charAt(this.f3872bp + length2);
        boolean z = cCharAt2 == '\"';
        if (z) {
            cCharAt2 = charAt(this.f3872bp + i3);
            i3 = length2 + 2;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            cCharAt2 = charAt(this.f3872bp + i3);
            i3++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            boolean z3 = z;
            if (cCharAt2 != 'n' || charAt(this.f3872bp + i3) != 'u' || charAt(this.f3872bp + i3 + 1) != 'l' || charAt(this.f3872bp + i3 + 2) != 'l') {
                this.matchStat = -1;
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            this.matchStat = 5;
            int i4 = i3 + 4;
            char cCharAt3 = charAt(this.f3872bp + i3 + 3);
            if (z3 && cCharAt3 == '\"') {
                int i5 = i3 + 5;
                cCharAt3 = charAt(this.f3872bp + i4);
                i4 = i5;
            }
            while (cCharAt3 != ',') {
                if (cCharAt3 == '}') {
                    int i6 = this.f3872bp + i4;
                    this.f3872bp = i6;
                    this.f3873ch = charAt(i6);
                    this.matchStat = 5;
                    this.token = 13;
                    return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                }
                if (!isWhitespace(cCharAt3)) {
                    this.matchStat = -1;
                    return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                }
                int i7 = i4 + 1;
                cCharAt3 = charAt(this.f3872bp + i4);
                i4 = i7;
            }
            int i8 = this.f3872bp + i4;
            this.f3872bp = i8;
            this.f3873ch = charAt(i8);
            this.matchStat = 5;
            this.token = 16;
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        boolean z4 = z;
        long j2 = cCharAt2 - '0';
        while (true) {
            i = i3 + 1;
            cCharAt = charAt(this.f3872bp + i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            i3 = i;
        }
        if (cCharAt == '.') {
            int i9 = i3 + 2;
            char cCharAt4 = charAt(this.f3872bp + i);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                this.matchStat = -1;
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            j2 = (j2 * 10) + ((long) (cCharAt4 - '0'));
            j = 10;
            while (true) {
                i = i9 + 1;
                cCharAt = charAt(this.f3872bp + i9);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j2 = (j2 * 10) + ((long) (cCharAt - '0'));
                j *= 10;
                i9 = i;
            }
        } else {
            j = 1;
        }
        boolean z5 = cCharAt == 'e' || cCharAt == 'E';
        if (z5) {
            int i10 = i + 1;
            cCharAt = charAt(this.f3872bp + i);
            if (cCharAt == '+' || cCharAt == '-') {
                i += 2;
                cCharAt = charAt(this.f3872bp + i10);
            } else {
                i = i10;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                char cCharAt5 = charAt(this.f3872bp + i);
                i++;
                cCharAt = cCharAt5;
            }
        }
        if (!z4) {
            int i11 = this.f3872bp;
            length = cArr.length + i11;
            i2 = ((i11 + i) - length) - 1;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            int i12 = i + 1;
            cCharAt = charAt(this.f3872bp + i);
            int i13 = this.f3872bp;
            length = cArr.length + i13 + 1;
            i2 = ((i13 + i12) - length) - 2;
            i = i12;
        }
        if (z5 || i2 >= 17) {
            d = Double.parseDouble(subString(length, i2));
        } else {
            d = j2 / j;
            if (z2) {
                d = -d;
            }
        }
        if (cCharAt == ',') {
            int i14 = this.f3872bp + i;
            this.f3872bp = i14;
            this.f3873ch = charAt(i14);
            this.matchStat = 3;
            this.token = 16;
            return d;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        int i15 = i + 1;
        char cCharAt6 = charAt(this.f3872bp + i);
        if (cCharAt6 == ',') {
            this.token = 16;
            int i16 = this.f3872bp + i15;
            this.f3872bp = i16;
            this.f3873ch = charAt(i16);
        } else if (cCharAt6 == ']') {
            this.token = 15;
            int i17 = this.f3872bp + i15;
            this.f3872bp = i17;
            this.f3873ch = charAt(i17);
        } else if (cCharAt6 == '}') {
            this.token = 13;
            int i18 = this.f3872bp + i15;
            this.f3872bp = i18;
            this.f3873ch = charAt(i18);
        } else {
            if (cCharAt6 != 26) {
                this.matchStat = -1;
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            this.token = 20;
            this.f3872bp += i;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return d;
    }

    public final float scanFieldFloat(char[] cArr) {
        int i;
        char cCharAt;
        long j;
        int length;
        int i2;
        float f;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0.0f;
        }
        int length2 = cArr.length;
        int i3 = length2 + 1;
        char cCharAt2 = charAt(this.f3872bp + length2);
        boolean z = cCharAt2 == '\"';
        if (z) {
            cCharAt2 = charAt(this.f3872bp + i3);
            i3 = length2 + 2;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            cCharAt2 = charAt(this.f3872bp + i3);
            i3++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            boolean z3 = z;
            if (cCharAt2 != 'n' || charAt(this.f3872bp + i3) != 'u' || charAt(this.f3872bp + i3 + 1) != 'l' || charAt(this.f3872bp + i3 + 2) != 'l') {
                this.matchStat = -1;
                return 0.0f;
            }
            this.matchStat = 5;
            int i4 = i3 + 4;
            char cCharAt3 = charAt(this.f3872bp + i3 + 3);
            if (z3 && cCharAt3 == '\"') {
                int i5 = i3 + 5;
                cCharAt3 = charAt(this.f3872bp + i4);
                i4 = i5;
            }
            while (cCharAt3 != ',') {
                if (cCharAt3 == '}') {
                    int i6 = this.f3872bp + i4;
                    this.f3872bp = i6;
                    this.f3873ch = charAt(i6);
                    this.matchStat = 5;
                    this.token = 13;
                    return 0.0f;
                }
                if (!isWhitespace(cCharAt3)) {
                    this.matchStat = -1;
                    return 0.0f;
                }
                int i7 = i4 + 1;
                cCharAt3 = charAt(this.f3872bp + i4);
                i4 = i7;
            }
            int i8 = this.f3872bp + i4;
            this.f3872bp = i8;
            this.f3873ch = charAt(i8);
            this.matchStat = 5;
            this.token = 16;
            return 0.0f;
        }
        boolean z4 = z;
        long j2 = cCharAt2 - '0';
        while (true) {
            i = i3 + 1;
            cCharAt = charAt(this.f3872bp + i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            i3 = i;
        }
        if (cCharAt == '.') {
            int i9 = i3 + 2;
            char cCharAt4 = charAt(this.f3872bp + i);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                this.matchStat = -1;
                return 0.0f;
            }
            j2 = (j2 * 10) + ((long) (cCharAt4 - '0'));
            j = 10;
            while (true) {
                i = i9 + 1;
                cCharAt = charAt(this.f3872bp + i9);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j2 = (j2 * 10) + ((long) (cCharAt - '0'));
                j *= 10;
                i9 = i;
            }
        } else {
            j = 1;
        }
        boolean z5 = cCharAt == 'e' || cCharAt == 'E';
        if (z5) {
            int i10 = i + 1;
            cCharAt = charAt(this.f3872bp + i);
            if (cCharAt == '+' || cCharAt == '-') {
                i += 2;
                cCharAt = charAt(this.f3872bp + i10);
            } else {
                i = i10;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                char cCharAt5 = charAt(this.f3872bp + i);
                i++;
                cCharAt = cCharAt5;
            }
        }
        if (!z4) {
            int i11 = this.f3872bp;
            length = cArr.length + i11;
            i2 = ((i11 + i) - length) - 1;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0.0f;
            }
            int i12 = i + 1;
            cCharAt = charAt(this.f3872bp + i);
            int i13 = this.f3872bp;
            length = cArr.length + i13 + 1;
            i2 = ((i13 + i12) - length) - 2;
            i = i12;
        }
        if (z5 || i2 >= 17) {
            f = Float.parseFloat(subString(length, i2));
        } else {
            f = (float) (j2 / j);
            if (z2) {
                f = -f;
            }
        }
        if (cCharAt == ',') {
            int i14 = this.f3872bp + i;
            this.f3872bp = i14;
            this.f3873ch = charAt(i14);
            this.matchStat = 3;
            this.token = 16;
            return f;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return 0.0f;
        }
        int i15 = i + 1;
        char cCharAt6 = charAt(this.f3872bp + i);
        if (cCharAt6 == ',') {
            this.token = 16;
            int i16 = this.f3872bp + i15;
            this.f3872bp = i16;
            this.f3873ch = charAt(i16);
        } else if (cCharAt6 == ']') {
            this.token = 15;
            int i17 = this.f3872bp + i15;
            this.f3872bp = i17;
            this.f3873ch = charAt(i17);
        } else if (cCharAt6 == '}') {
            this.token = 13;
            int i18 = this.f3872bp + i15;
            this.f3872bp = i18;
            this.f3873ch = charAt(i18);
        } else {
            if (cCharAt6 != 26) {
                this.matchStat = -1;
                return 0.0f;
            }
            this.f3872bp += i;
            this.token = 20;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return f;
    }

    public final float[] scanFieldFloatArray(char[] cArr) {
        int i;
        char cCharAt;
        int i2;
        float f;
        this.matchStat = 0;
        float[] fArr = null;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i3 = length + 1;
        if (charAt(this.f3872bp + length) != '[') {
            this.matchStat = -2;
            return null;
        }
        int i4 = length + 2;
        char cCharAt2 = charAt(this.f3872bp + i3);
        float[] fArr2 = new float[16];
        int i5 = 0;
        while (true) {
            int i6 = this.f3872bp;
            int i7 = (i6 + i4) - 1;
            boolean z = cCharAt2 == '-';
            if (z) {
                cCharAt2 = charAt(i6 + i4);
                i4++;
            }
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            int i8 = cCharAt2 - '0';
            while (true) {
                i = i4 + 1;
                cCharAt = charAt(this.f3872bp + i4);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i8 = (i8 * 10) + (cCharAt - '0');
                i4 = i;
            }
            float[] fArr3 = fArr;
            if (cCharAt == '.') {
                int i9 = i4 + 2;
                char cCharAt3 = charAt(this.f3872bp + i);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    this.matchStat = -1;
                    return fArr3;
                }
                i8 = (i8 * 10) + (cCharAt3 - '0');
                i2 = 10;
                while (true) {
                    i = i9 + 1;
                    cCharAt = charAt(this.f3872bp + i9);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i8 = (i8 * 10) + (cCharAt - '0');
                    i2 *= 10;
                    i9 = i;
                }
            } else {
                i2 = 1;
            }
            boolean z2 = cCharAt == 'e' || cCharAt == 'E';
            if (z2) {
                int i10 = i + 1;
                cCharAt = charAt(this.f3872bp + i);
                if (cCharAt == '+' || cCharAt == '-') {
                    i += 2;
                    cCharAt = charAt(this.f3872bp + i10);
                } else {
                    i = i10;
                }
                while (cCharAt >= '0' && cCharAt <= '9') {
                    cCharAt = charAt(this.f3872bp + i);
                    i++;
                }
            }
            int i11 = ((this.f3872bp + i) - i7) - 1;
            if (z2 || i11 >= 10) {
                f = Float.parseFloat(subString(i7, i11));
            } else {
                f = i8 / i2;
                if (z) {
                    f = -f;
                }
            }
            if (i5 >= fArr2.length) {
                float[] fArr4 = new float[(fArr2.length * 3) / 2];
                System.arraycopy(fArr2, 0, fArr4, 0, i5);
                fArr2 = fArr4;
            }
            int i12 = i5 + 1;
            fArr2[i5] = f;
            if (cCharAt == ',') {
                cCharAt = charAt(this.f3872bp + i);
                i4 = i + 1;
            } else {
                if (cCharAt == ']') {
                    int i13 = i + 1;
                    char cCharAt4 = charAt(this.f3872bp + i);
                    if (i12 != fArr2.length) {
                        float[] fArr5 = new float[i12];
                        System.arraycopy(fArr2, 0, fArr5, 0, i12);
                        fArr2 = fArr5;
                    }
                    if (cCharAt4 == ',') {
                        this.f3872bp += i;
                        next();
                        this.matchStat = 3;
                        this.token = 16;
                        return fArr2;
                    }
                    if (cCharAt4 != '}') {
                        this.matchStat = -1;
                        return fArr3;
                    }
                    char cCharAt5 = charAt(this.f3872bp + i13);
                    if (cCharAt5 == ',') {
                        this.token = 16;
                        this.f3872bp += i + 1;
                        next();
                    } else if (cCharAt5 == ']') {
                        this.token = 15;
                        this.f3872bp += i + 1;
                        next();
                    } else if (cCharAt5 == '}') {
                        this.token = 13;
                        this.f3872bp += i + 1;
                        next();
                    } else {
                        if (cCharAt5 != 26) {
                            this.matchStat = -1;
                            return fArr3;
                        }
                        this.f3872bp += i + 1;
                        this.token = 20;
                        this.f3873ch = JSONLexer.EOI;
                    }
                    this.matchStat = 4;
                    return fArr2;
                }
                i4 = i;
            }
            i5 = i12;
            cCharAt2 = cCharAt;
            fArr = fArr3;
        }
        float[] fArr6 = fArr;
        this.matchStat = -1;
        return fArr6;
    }

    public final float[][] scanFieldFloatArray2(char[] cArr) {
        float[][] fArr;
        int i;
        int i2;
        char cCharAt;
        int i3;
        float f;
        int i4;
        this.matchStat = 0;
        float[][] fArr2 = null;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i5 = length + 1;
        char c = '[';
        if (charAt(this.f3872bp + length) != '[') {
            this.matchStat = -2;
            return null;
        }
        int i6 = length + 2;
        char cCharAt2 = charAt(this.f3872bp + i5);
        int i7 = 16;
        float[][] fArr3 = new float[16][];
        int i8 = 0;
        while (true) {
            int i9 = -1;
            int i10 = 1;
            if (cCharAt2 != c) {
                fArr = fArr2;
                i = 3;
                break;
            }
            int i11 = i6 + 1;
            char cCharAt3 = charAt(this.f3872bp + i6);
            float[] fArr4 = new float[i7];
            int i12 = 0;
            fArr = fArr2;
            while (true) {
                int i13 = this.f3872bp;
                int i14 = (i13 + i11) - 1;
                int i15 = i10;
                int i16 = cCharAt3 == '-' ? i15 : 0;
                if (i16 != 0) {
                    char cCharAt4 = charAt(i13 + i11);
                    i11++;
                    cCharAt3 = cCharAt4;
                }
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    this.matchStat = i9;
                    return fArr;
                }
                int i17 = cCharAt3 - '0';
                i = 3;
                while (true) {
                    i2 = i11 + 1;
                    cCharAt = charAt(this.f3872bp + i11);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i17 = (i17 * 10) + (cCharAt - '0');
                    i11 = i2;
                }
                if (cCharAt == '.') {
                    int i18 = i11 + 2;
                    char cCharAt5 = charAt(this.f3872bp + i2);
                    if (cCharAt5 < '0' || cCharAt5 > '9') {
                        this.matchStat = i9;
                        return fArr;
                    }
                    i17 = (i17 * 10) + (cCharAt5 - '0');
                    i3 = 10;
                    while (true) {
                        i2 = i18 + 1;
                        cCharAt = charAt(this.f3872bp + i18);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i17 = (i17 * 10) + (cCharAt - '0');
                        i3 *= 10;
                        i18 = i2;
                    }
                } else {
                    i3 = i15;
                }
                int i19 = (cCharAt == 'e' || cCharAt == 'E') ? i15 : 0;
                if (i19 != 0) {
                    int i20 = i2 + 1;
                    cCharAt = charAt(this.f3872bp + i2);
                    if (cCharAt == '+' || cCharAt == '-') {
                        i2 += 2;
                        cCharAt = charAt(this.f3872bp + i20);
                    } else {
                        i2 = i20;
                    }
                    while (cCharAt >= '0' && cCharAt <= '9') {
                        cCharAt = charAt(this.f3872bp + i2);
                        i2++;
                    }
                }
                int i21 = ((this.f3872bp + i2) - i14) - 1;
                if (i19 != 0 || i21 >= 10) {
                    f = Float.parseFloat(subString(i14, i21));
                } else {
                    f = i17 / i3;
                    if (i16 != 0) {
                        f = -f;
                    }
                }
                if (i12 >= fArr4.length) {
                    float[] fArr5 = new float[(fArr4.length * 3) / 2];
                    System.arraycopy(fArr4, 0, fArr5, 0, i12);
                    fArr4 = fArr5;
                }
                i4 = i12 + 1;
                fArr4[i12] = f;
                if (cCharAt == ',') {
                    cCharAt3 = charAt(this.f3872bp + i2);
                    i11 = i2 + 1;
                } else {
                    if (cCharAt == ']') {
                        break;
                    }
                    cCharAt3 = cCharAt;
                    i11 = i2;
                }
                i12 = i4;
                i10 = i15;
                i9 = -1;
            }
            int i22 = i2 + 1;
            char cCharAt6 = charAt(this.f3872bp + i2);
            if (i4 != fArr4.length) {
                float[] fArr6 = new float[i4];
                System.arraycopy(fArr4, 0, fArr6, 0, i4);
                fArr4 = fArr6;
            }
            if (i8 >= fArr3.length) {
                fArr3 = new float[(fArr3.length * 3) / 2][];
                System.arraycopy(fArr4, 0, fArr3, 0, i4);
            }
            int i23 = i8 + 1;
            fArr3[i8] = fArr4;
            if (cCharAt6 == ',') {
                cCharAt2 = charAt(this.f3872bp + i22);
                i6 = i2 + 2;
            } else {
                if (cCharAt6 == ']') {
                    cCharAt2 = charAt(this.f3872bp + i22);
                    i6 = i2 + 2;
                    i8 = i23;
                    break;
                }
                cCharAt2 = cCharAt6;
                i6 = i22;
            }
            i8 = i23;
            fArr2 = fArr;
            i7 = 16;
            c = '[';
        }
        if (i8 != fArr3.length) {
            float[][] fArr7 = new float[i8][];
            System.arraycopy(fArr3, 0, fArr7, 0, i8);
            fArr3 = fArr7;
        }
        if (cCharAt2 == ',') {
            this.f3872bp += i6 - 1;
            next();
            this.matchStat = i;
            this.token = 16;
            return fArr3;
        }
        if (cCharAt2 != '}') {
            this.matchStat = -1;
            return fArr;
        }
        char cCharAt7 = charAt(this.f3872bp + i6);
        if (cCharAt7 == ',') {
            this.token = 16;
            this.f3872bp += i6;
            next();
        } else if (cCharAt7 == ']') {
            this.token = 15;
            this.f3872bp += i6;
            next();
        } else if (cCharAt7 == '}') {
            this.token = 13;
            this.f3872bp += i6;
            next();
        } else {
            if (cCharAt7 != 26) {
                this.matchStat = -1;
                return fArr;
            }
            this.f3872bp += i6;
            this.token = 20;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return fArr3;
    }

    public int scanFieldInt(char[] cArr) {
        int i;
        char cCharAt;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0;
        }
        int length = cArr.length;
        int i2 = length + 1;
        char cCharAt2 = charAt(this.f3872bp + length);
        boolean z = cCharAt2 == '-';
        if (z) {
            cCharAt2 = charAt(this.f3872bp + i2);
            i2 = length + 2;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.matchStat = -1;
            return 0;
        }
        int i3 = cCharAt2 - '0';
        while (true) {
            i = i2 + 1;
            cCharAt = charAt(this.f3872bp + i2);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i3 = (i3 * 10) + (cCharAt - '0');
            i2 = i;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0;
        }
        if ((i3 < 0 || i > cArr.length + 14) && !(i3 == Integer.MIN_VALUE && i == 17 && z)) {
            this.matchStat = -1;
            return 0;
        }
        if (cCharAt == ',') {
            int i4 = this.f3872bp + i;
            this.f3872bp = i4;
            this.f3873ch = charAt(i4);
            this.matchStat = 3;
            this.token = 16;
            if (z) {
                return -i3;
            }
        } else {
            if (cCharAt != '}') {
                this.matchStat = -1;
                return 0;
            }
            int i5 = i2 + 2;
            char cCharAt3 = charAt(this.f3872bp + i);
            if (cCharAt3 == ',') {
                this.token = 16;
                int i6 = this.f3872bp + i5;
                this.f3872bp = i6;
                this.f3873ch = charAt(i6);
            } else if (cCharAt3 == ']') {
                this.token = 15;
                int i7 = this.f3872bp + i5;
                this.f3872bp = i7;
                this.f3873ch = charAt(i7);
            } else if (cCharAt3 == '}') {
                this.token = 13;
                int i8 = this.f3872bp + i5;
                this.f3872bp = i8;
                this.f3873ch = charAt(i8);
            } else {
                if (cCharAt3 != 26) {
                    this.matchStat = -1;
                    return 0;
                }
                this.token = 20;
                this.f3872bp += i2 + 1;
                this.f3873ch = JSONLexer.EOI;
            }
            this.matchStat = 4;
            if (z) {
                return -i3;
            }
        }
        return i3;
    }

    public final int[] scanFieldIntArray(char[] cArr) {
        boolean z;
        int[] iArr;
        int i;
        char cCharAt;
        int i2;
        char cCharAt2;
        int i3;
        this.matchStat = 0;
        int[] iArr2 = null;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i4 = length + 1;
        if (charAt(this.f3872bp + length) != '[') {
            this.matchStat = -2;
            return null;
        }
        int i5 = length + 2;
        char cCharAt3 = charAt(this.f3872bp + i4);
        int[] iArr3 = new int[16];
        if (cCharAt3 == ']') {
            i3 = length + 3;
            cCharAt2 = charAt(this.f3872bp + i5);
            i2 = 0;
            iArr = null;
        } else {
            int i6 = 0;
            while (true) {
                if (cCharAt3 == '-') {
                    cCharAt3 = charAt(this.f3872bp + i5);
                    i5++;
                    z = true;
                } else {
                    z = false;
                }
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    int[] iArr4 = iArr2;
                    this.matchStat = -1;
                    return iArr4;
                }
                int i7 = cCharAt3 - '0';
                iArr = iArr2;
                while (true) {
                    i = i5 + 1;
                    cCharAt = charAt(this.f3872bp + i5);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i7 = (i7 * 10) + (cCharAt - '0');
                    i5 = i;
                }
                if (i6 >= iArr3.length) {
                    int[] iArr5 = new int[(iArr3.length * 3) / 2];
                    System.arraycopy(iArr3, 0, iArr5, 0, i6);
                    iArr3 = iArr5;
                }
                i2 = i6 + 1;
                if (z) {
                    i7 = -i7;
                }
                iArr3[i6] = i7;
                if (cCharAt == ',') {
                    i5 += 2;
                    cCharAt3 = charAt(this.f3872bp + i);
                } else {
                    if (cCharAt == ']') {
                        cCharAt2 = charAt(this.f3872bp + i);
                        i3 = i5 + 2;
                        break;
                    }
                    cCharAt3 = cCharAt;
                    i5 = i;
                }
                i6 = i2;
                iArr2 = iArr;
            }
        }
        if (i2 != iArr3.length) {
            int[] iArr6 = new int[i2];
            System.arraycopy(iArr3, 0, iArr6, 0, i2);
            iArr3 = iArr6;
        }
        if (cCharAt2 == ',') {
            this.f3872bp += i3 - 1;
            next();
            this.matchStat = 3;
            this.token = 16;
            return iArr3;
        }
        if (cCharAt2 != '}') {
            this.matchStat = -1;
            return iArr;
        }
        char cCharAt4 = charAt(this.f3872bp + i3);
        if (cCharAt4 == ',') {
            this.token = 16;
            this.f3872bp += i3;
            next();
        } else if (cCharAt4 == ']') {
            this.token = 15;
            this.f3872bp += i3;
            next();
        } else if (cCharAt4 == '}') {
            this.token = 13;
            this.f3872bp += i3;
            next();
        } else {
            if (cCharAt4 != 26) {
                this.matchStat = -1;
                return iArr;
            }
            this.f3872bp += i3;
            this.token = 20;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return iArr3;
    }

    public long scanFieldLong(char[] cArr) {
        int i;
        char cCharAt;
        boolean z = false;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = cArr.length;
        int i2 = length + 1;
        char cCharAt2 = charAt(this.f3872bp + length);
        if (cCharAt2 == '-') {
            cCharAt2 = charAt(this.f3872bp + i2);
            i2 = length + 2;
            z = true;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.matchStat = -1;
            return 0L;
        }
        long j = cCharAt2 - '0';
        while (true) {
            i = i2 + 1;
            cCharAt = charAt(this.f3872bp + i2);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            i2 = i;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0L;
        }
        if (i - cArr.length >= 21 || (j < 0 && !(j == Long.MIN_VALUE && z))) {
            this.matchStat = -1;
            return 0L;
        }
        if (cCharAt == ',') {
            int i3 = this.f3872bp + i;
            this.f3872bp = i3;
            this.f3873ch = charAt(i3);
            this.matchStat = 3;
            this.token = 16;
            if (z) {
                return -j;
            }
        } else {
            if (cCharAt != '}') {
                this.matchStat = -1;
                return 0L;
            }
            int i4 = i2 + 2;
            char cCharAt3 = charAt(this.f3872bp + i);
            if (cCharAt3 == ',') {
                this.token = 16;
                int i5 = this.f3872bp + i4;
                this.f3872bp = i5;
                this.f3873ch = charAt(i5);
            } else if (cCharAt3 == ']') {
                this.token = 15;
                int i6 = this.f3872bp + i4;
                this.f3872bp = i6;
                this.f3873ch = charAt(i6);
            } else if (cCharAt3 == '}') {
                this.token = 13;
                int i7 = this.f3872bp + i4;
                this.f3872bp = i7;
                this.f3873ch = charAt(i7);
            } else {
                if (cCharAt3 != 26) {
                    this.matchStat = -1;
                    return 0L;
                }
                this.token = 20;
                this.f3872bp += i2 + 1;
                this.f3873ch = JSONLexer.EOI;
            }
            this.matchStat = 4;
            if (z) {
                return -j;
            }
        }
        return j;
    }

    public String scanFieldString(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return stringDefaultValue();
        }
        int length = cArr.length;
        int i = length + 1;
        if (charAt(this.f3872bp + length) != '\"') {
            this.matchStat = -1;
            return stringDefaultValue();
        }
        int iIndexOf = indexOf('\"', this.f3872bp + cArr.length + 1);
        if (iIndexOf == -1) {
            qkq.m176968a("unclosed str");
            return null;
        }
        int length2 = this.f3872bp + cArr.length + 1;
        String strSubString = subString(length2, iIndexOf - length2);
        if (strSubString.indexOf(92) != -1) {
            while (true) {
                int i2 = 0;
                for (int i3 = iIndexOf - 1; i3 >= 0 && charAt(i3) == '\\'; i3--) {
                    i2++;
                }
                if (i2 % 2 == 0) {
                    break;
                }
                iIndexOf = indexOf('\"', iIndexOf + 1);
            }
            int i4 = this.f3872bp;
            int length3 = iIndexOf - ((cArr.length + i4) + 1);
            strSubString = readString(sub_chars(i4 + cArr.length + 1, length3), length3);
        }
        int i5 = this.f3872bp;
        int length4 = i + (iIndexOf - ((cArr.length + i5) + 1)) + 1;
        int i6 = length4 + 1;
        char cCharAt = charAt(i5 + length4);
        if (cCharAt == ',') {
            int i7 = this.f3872bp + i6;
            this.f3872bp = i7;
            this.f3873ch = charAt(i7);
            this.matchStat = 3;
            return strSubString;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return stringDefaultValue();
        }
        int i8 = length4 + 2;
        char cCharAt2 = charAt(this.f3872bp + i6);
        if (cCharAt2 == ',') {
            this.token = 16;
            int i9 = this.f3872bp + i8;
            this.f3872bp = i9;
            this.f3873ch = charAt(i9);
        } else if (cCharAt2 == ']') {
            this.token = 15;
            int i10 = this.f3872bp + i8;
            this.f3872bp = i10;
            this.f3873ch = charAt(i10);
        } else if (cCharAt2 == '}') {
            this.token = 13;
            int i11 = this.f3872bp + i8;
            this.f3872bp = i11;
            this.f3873ch = charAt(i11);
        } else {
            if (cCharAt2 != 26) {
                this.matchStat = -1;
                return stringDefaultValue();
            }
            this.token = 20;
            this.f3872bp += length4 + 1;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return strSubString;
    }

    public Collection<String> scanFieldStringArray(char[] cArr, Class<?> cls) {
        char cCharAt;
        int i;
        int i2;
        char cCharAt2;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        Collection<String> collectionNewCollectionByType = newCollectionByType(cls);
        int length = cArr.length;
        int i3 = length + 1;
        if (charAt(this.f3872bp + length) != '[') {
            this.matchStat = -1;
            return null;
        }
        int i4 = length + 2;
        char cCharAt3 = charAt(this.f3872bp + i3);
        while (true) {
            if (cCharAt3 == '\"') {
                int iIndexOf = indexOf('\"', this.f3872bp + i4);
                if (iIndexOf == -1) {
                    qkq.m176968a("unclosed str");
                    return null;
                }
                int i5 = this.f3872bp + i4;
                String strSubString = subString(i5, iIndexOf - i5);
                if (strSubString.indexOf(92) != -1) {
                    while (true) {
                        int i6 = 0;
                        for (int i7 = iIndexOf - 1; i7 >= 0 && charAt(i7) == '\\'; i7--) {
                            i6++;
                        }
                        if (i6 % 2 == 0) {
                            break;
                        }
                        iIndexOf = indexOf('\"', iIndexOf + 1);
                    }
                    int i8 = this.f3872bp;
                    int i9 = iIndexOf - (i8 + i4);
                    strSubString = readString(sub_chars(i8 + i4, i9), i9);
                }
                int i10 = this.f3872bp;
                int i11 = i4 + (iIndexOf - (i10 + i4)) + 1;
                i2 = i11 + 1;
                cCharAt2 = charAt(i10 + i11);
                collectionNewCollectionByType.add(strSubString);
            } else {
                if (cCharAt3 != 'n' || charAt(this.f3872bp + i4) != 'u' || charAt(this.f3872bp + i4 + 1) != 'l' || charAt(this.f3872bp + i4 + 2) != 'l') {
                    if (cCharAt3 != ']' || collectionNewCollectionByType.size() != 0) {
                        qkq.m176968a("illega str");
                        return null;
                    }
                    int i12 = i4 + 1;
                    cCharAt = charAt(this.f3872bp + i4);
                    i = i12;
                    break;
                }
                char cCharAt4 = charAt(this.f3872bp + i4 + 3);
                collectionNewCollectionByType.add(null);
                i2 = i4 + 4;
                cCharAt2 = cCharAt4;
            }
            if (cCharAt2 != ',') {
                if (cCharAt2 != ']') {
                    this.matchStat = -1;
                    return null;
                }
                i = i2 + 1;
                cCharAt = charAt(this.f3872bp + i2);
                break;
            }
            int i13 = i2 + 1;
            cCharAt3 = charAt(this.f3872bp + i2);
            i4 = i13;
        }
        if (cCharAt == ',') {
            int i14 = this.f3872bp + i;
            this.f3872bp = i14;
            this.f3873ch = charAt(i14);
            this.matchStat = 3;
            return collectionNewCollectionByType;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return null;
        }
        int i15 = i + 1;
        char cCharAt5 = charAt(this.f3872bp + i);
        if (cCharAt5 == ',') {
            this.token = 16;
            int i16 = this.f3872bp + i15;
            this.f3872bp = i16;
            this.f3873ch = charAt(i16);
        } else if (cCharAt5 == ']') {
            this.token = 15;
            int i17 = this.f3872bp + i15;
            this.f3872bp = i17;
            this.f3873ch = charAt(i17);
        } else if (cCharAt5 == '}') {
            this.token = 13;
            int i18 = this.f3872bp + i15;
            this.f3872bp = i18;
            this.f3873ch = charAt(i18);
        } else {
            if (cCharAt5 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.f3872bp += i;
            this.token = 20;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return collectionNewCollectionByType;
    }

    public long scanFieldSymbol(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = cArr.length;
        int i = length + 1;
        if (charAt(this.f3872bp + length) != '\"') {
            this.matchStat = -1;
            return 0L;
        }
        long j = -3750763034362895579L;
        while (true) {
            int i2 = i + 1;
            char cCharAt = charAt(this.f3872bp + i);
            if (cCharAt == '\"') {
                int i3 = i + 2;
                char cCharAt2 = charAt(this.f3872bp + i2);
                if (cCharAt2 == ',') {
                    int i4 = this.f3872bp + i3;
                    this.f3872bp = i4;
                    this.f3873ch = charAt(i4);
                    this.matchStat = 3;
                    return j;
                }
                if (cCharAt2 != '}') {
                    this.matchStat = -1;
                    return 0L;
                }
                int i5 = i + 3;
                char cCharAt3 = charAt(this.f3872bp + i3);
                if (cCharAt3 == ',') {
                    this.token = 16;
                    int i6 = this.f3872bp + i5;
                    this.f3872bp = i6;
                    this.f3873ch = charAt(i6);
                } else if (cCharAt3 == ']') {
                    this.token = 15;
                    int i7 = this.f3872bp + i5;
                    this.f3872bp = i7;
                    this.f3873ch = charAt(i7);
                } else if (cCharAt3 == '}') {
                    this.token = 13;
                    int i8 = this.f3872bp + i5;
                    this.f3872bp = i8;
                    this.f3873ch = charAt(i8);
                } else {
                    if (cCharAt3 != 26) {
                        this.matchStat = -1;
                        return 0L;
                    }
                    this.token = 20;
                    this.f3872bp += i + 2;
                    this.f3873ch = JSONLexer.EOI;
                }
                this.matchStat = 4;
                return j;
            }
            j = (j ^ ((long) cCharAt)) * 1099511628211L;
            if (cCharAt == '\\') {
                this.matchStat = -1;
                return 0L;
            }
            i = i2;
        }
    }

    public UUID scanFieldUUID(char[] cArr) {
        UUID uuid;
        int i;
        char cCharAt;
        int i2;
        UUID uuid2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i10 = length + 1;
        char cCharAt2 = charAt(this.f3872bp + length);
        if (cCharAt2 != '\"') {
            uuid = null;
            i = 4;
            if (cCharAt2 == 'n') {
                int i11 = length + 2;
                if (charAt(this.f3872bp + i10) == 'u') {
                    int i12 = length + 3;
                    if (charAt(this.f3872bp + i11) == 'l') {
                        int i13 = length + 4;
                        if (charAt(this.f3872bp + i12) == 'l') {
                            int i14 = length + 5;
                            cCharAt = charAt(this.f3872bp + i13);
                            i2 = i14;
                            uuid2 = null;
                        }
                    }
                }
            }
            this.matchStat = -1;
            return null;
        }
        int iIndexOf = indexOf('\"', this.f3872bp + cArr.length + 1);
        if (iIndexOf == -1) {
            qkq.m176968a("unclosed str");
            return null;
        }
        int length2 = this.f3872bp + cArr.length + 1;
        int i15 = iIndexOf - length2;
        char c = 'F';
        uuid = null;
        char c2 = 'A';
        char c3 = 'f';
        char c4 = 'a';
        i = 4;
        if (i15 == 36) {
            int i16 = 0;
            long j = 0;
            while (i16 < 8) {
                char cCharAt3 = charAt(length2 + i16);
                if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    i9 = cCharAt3 - '0';
                } else if (cCharAt3 >= 'a' && cCharAt3 <= 'f') {
                    i9 = cCharAt3 - 'W';
                } else {
                    if (cCharAt3 < 'A' || cCharAt3 > c) {
                        this.matchStat = -2;
                        return null;
                    }
                    i9 = cCharAt3 - '7';
                }
                j = (j << 4) | ((long) i9);
                i16++;
                iIndexOf = iIndexOf;
                c = 'F';
            }
            int i17 = iIndexOf;
            int i18 = 9;
            for (int i19 = 13; i18 < i19; i19 = 13) {
                char cCharAt4 = charAt(length2 + i18);
                if (cCharAt4 >= '0' && cCharAt4 <= '9') {
                    i8 = cCharAt4 - '0';
                } else if (cCharAt4 >= 'a' && cCharAt4 <= 'f') {
                    i8 = cCharAt4 - 'W';
                } else {
                    if (cCharAt4 < 'A' || cCharAt4 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i8 = cCharAt4 - '7';
                }
                j = (j << 4) | ((long) i8);
                i18++;
            }
            int i20 = 14;
            long j2 = j;
            while (i20 < 18) {
                char cCharAt5 = charAt(length2 + i20);
                if (cCharAt5 >= '0' && cCharAt5 <= '9') {
                    i7 = cCharAt5 - '0';
                } else if (cCharAt5 >= 'a' && cCharAt5 <= 'f') {
                    i7 = cCharAt5 - 'W';
                } else {
                    if (cCharAt5 < c2 || cCharAt5 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i7 = cCharAt5 - '7';
                }
                j2 = (j2 << 4) | ((long) i7);
                i20++;
                length2 = length2;
                c2 = 'A';
            }
            int i21 = length2;
            int i22 = 19;
            long j3 = 0;
            while (i22 < 23) {
                char cCharAt6 = charAt(i21 + i22);
                if (cCharAt6 >= '0' && cCharAt6 <= '9') {
                    i6 = cCharAt6 - '0';
                } else if (cCharAt6 >= c4 && cCharAt6 <= c3) {
                    i6 = cCharAt6 - 'W';
                } else {
                    if (cCharAt6 < 'A' || cCharAt6 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i6 = cCharAt6 - '7';
                }
                j3 = (j3 << 4) | ((long) i6);
                i22++;
                c3 = 'f';
                c4 = 'a';
            }
            long j4 = j3;
            for (int i23 = 24; i23 < 36; i23++) {
                char cCharAt7 = charAt(i21 + i23);
                if (cCharAt7 >= '0' && cCharAt7 <= '9') {
                    i5 = cCharAt7 - '0';
                } else if (cCharAt7 >= 'a' && cCharAt7 <= 'f') {
                    i5 = cCharAt7 - 'W';
                } else {
                    if (cCharAt7 < 'A' || cCharAt7 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i5 = cCharAt7 - '7';
                }
                j4 = (j4 << 4) | ((long) i5);
            }
            uuid2 = new UUID(j2, j4);
            int i24 = this.f3872bp;
            int length3 = i10 + (i17 - ((cArr.length + i24) + 1)) + 1;
            i2 = length3 + 1;
            cCharAt = charAt(i24 + length3);
        } else {
            if (i15 != 32) {
                this.matchStat = -1;
                return null;
            }
            long j5 = 0;
            for (int i25 = 0; i25 < 16; i25++) {
                char cCharAt8 = charAt(length2 + i25);
                if (cCharAt8 >= '0' && cCharAt8 <= '9') {
                    i4 = cCharAt8 - '0';
                } else if (cCharAt8 >= 'a' && cCharAt8 <= 'f') {
                    i4 = cCharAt8 - 'W';
                } else {
                    if (cCharAt8 < 'A' || cCharAt8 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i4 = cCharAt8 - '7';
                }
                j5 = (j5 << 4) | ((long) i4);
            }
            int i26 = 16;
            long j6 = 0;
            for (int i27 = 32; i26 < i27; i27 = 32) {
                char cCharAt9 = charAt(length2 + i26);
                if (cCharAt9 >= '0' && cCharAt9 <= '9') {
                    i3 = cCharAt9 - '0';
                } else if (cCharAt9 >= 'a' && cCharAt9 <= 'f') {
                    i3 = cCharAt9 - 'W';
                } else {
                    if (cCharAt9 < 'A' || cCharAt9 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i3 = cCharAt9 - '7';
                }
                j6 = (j6 << 4) | ((long) i3);
                i26++;
            }
            uuid2 = new UUID(j5, j6);
            int i28 = this.f3872bp;
            int length4 = i10 + (iIndexOf - ((cArr.length + i28) + 1)) + 1;
            i2 = length4 + 1;
            cCharAt = charAt(i28 + length4);
        }
        if (cCharAt == ',') {
            int i29 = this.f3872bp + i2;
            this.f3872bp = i29;
            this.f3873ch = charAt(i29);
            this.matchStat = 3;
            return uuid2;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return uuid;
        }
        int i30 = i2 + 1;
        char cCharAt10 = charAt(this.f3872bp + i2);
        if (cCharAt10 == ',') {
            this.token = 16;
            int i31 = this.f3872bp + i30;
            this.f3872bp = i31;
            this.f3873ch = charAt(i31);
        } else if (cCharAt10 == ']') {
            this.token = 15;
            int i32 = this.f3872bp + i30;
            this.f3872bp = i32;
            this.f3873ch = charAt(i32);
        } else if (cCharAt10 == '}') {
            this.token = 13;
            int i33 = this.f3872bp + i30;
            this.f3872bp = i33;
            this.f3873ch = charAt(i33);
        } else {
            if (cCharAt10 != 26) {
                this.matchStat = -1;
                return uuid;
            }
            this.token = 20;
            this.f3872bp += i2;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = i;
        return uuid2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00c7 -> B:49:0x00b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final float scanFloat(char r23) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanFloat(char):float");
    }

    public final void scanHex() {
        char next;
        if (this.f3873ch != 'x') {
            throw new JSONException("illegal state. " + this.f3873ch);
        }
        next();
        if (this.f3873ch != '\'') {
            throw new JSONException("illegal state. " + this.f3873ch);
        }
        this.f3874np = this.f3872bp;
        next();
        if (this.f3873ch == '\'') {
            next();
            this.token = 26;
            return;
        }
        while (true) {
            next = next();
            if ((next < '0' || next > '9') && (next < 'A' || next > 'F')) {
                break;
            } else {
                this.f3875sp++;
            }
        }
        if (next != '\'') {
            throw new JSONException("illegal state. " + next);
        }
        this.f3875sp++;
        next();
        this.token = 26;
    }

    public final void scanIdent() {
        this.f3874np = this.f3872bp - 1;
        this.hasSpecial = false;
        do {
            this.f3875sp++;
            next();
        } while (Character.isLetterOrDigit(this.f3873ch));
        String strStringVal = stringVal();
        if ("null".equalsIgnoreCase(strStringVal)) {
            this.token = 8;
            return;
        }
        if (ShareConstants.NEW_VERSION.equals(strStringVal)) {
            this.token = 9;
            return;
        }
        if ("true".equals(strStringVal)) {
            this.token = 6;
            return;
        }
        if ("false".equals(strStringVal)) {
            this.token = 7;
            return;
        }
        if (NotificationStatus.undefined.equals(strStringVal)) {
            this.token = 23;
            return;
        }
        if ("Set".equals(strStringVal)) {
            this.token = 21;
        } else if ("TreeSet".equals(strStringVal)) {
            this.token = 22;
        } else {
            this.token = 18;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public int scanInt(char c) {
        int i;
        int i2;
        char cCharAt;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.f3872bp);
        boolean z = cCharAt2 == '\"';
        if (z) {
            cCharAt2 = charAt(this.f3872bp + 1);
            i = 2;
        } else {
            i = 1;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            cCharAt2 = charAt(this.f3872bp + i);
            i++;
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            int i3 = cCharAt2 - '0';
            while (true) {
                i2 = i + 1;
                cCharAt = charAt(this.f3872bp + i);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i3 = (i3 * 10) + (cCharAt - '0');
                i = i2;
            }
            if (cCharAt == '.') {
                this.matchStat = -1;
                return 0;
            }
            if (i3 < 0) {
                this.matchStat = -1;
                return 0;
            }
            while (cCharAt != c) {
                if (!isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    if (z2) {
                        return -i3;
                    }
                    return i3;
                }
                char cCharAt3 = charAt(this.f3872bp + i2);
                i2++;
                cCharAt = cCharAt3;
            }
            int i4 = this.f3872bp + i2;
            this.f3872bp = i4;
            this.f3873ch = charAt(i4);
            this.matchStat = 3;
            this.token = 16;
            if (z2) {
                return -i3;
            }
            return i3;
        }
        if (cCharAt2 != 'n' || charAt(this.f3872bp + i) != 'u' || charAt(this.f3872bp + i + 1) != 'l' || charAt(this.f3872bp + i + 2) != 'l') {
            this.matchStat = -1;
            return 0;
        }
        this.matchStat = 5;
        int i5 = i + 4;
        char cCharAt4 = charAt(this.f3872bp + i + 3);
        if (z && cCharAt4 == '\"') {
            cCharAt4 = charAt(this.f3872bp + i5);
            i5 = i + 5;
        }
        while (cCharAt4 != ',') {
            if (cCharAt4 == ']') {
                int i6 = this.f3872bp + i5;
                this.f3872bp = i6;
                this.f3873ch = charAt(i6);
                this.matchStat = 5;
                this.token = 15;
                return 0;
            }
            if (!isWhitespace(cCharAt4)) {
                this.matchStat = -1;
                return 0;
            }
            cCharAt4 = charAt(this.f3872bp + i5);
            i5++;
        }
        int i7 = this.f3872bp + i5;
        this.f3872bp = i7;
        this.f3873ch = charAt(i7);
        this.matchStat = 5;
        this.token = 16;
        return 0;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public long scanLong(char c) {
        int i;
        int i2;
        char cCharAt;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.f3872bp);
        boolean z = cCharAt2 == '\"';
        if (z) {
            cCharAt2 = charAt(this.f3872bp + 1);
            i = 2;
        } else {
            i = 1;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            cCharAt2 = charAt(this.f3872bp + i);
            i++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            if (cCharAt2 != 'n' || charAt(this.f3872bp + i) != 'u' || charAt(this.f3872bp + i + 1) != 'l' || charAt(this.f3872bp + i + 2) != 'l') {
                this.matchStat = -1;
                return 0L;
            }
            this.matchStat = 5;
            int i3 = i + 4;
            char cCharAt3 = charAt(this.f3872bp + i + 3);
            if (z && cCharAt3 == '\"') {
                cCharAt3 = charAt(this.f3872bp + i3);
                i3 = i + 5;
            }
            while (cCharAt3 != ',') {
                if (cCharAt3 == ']') {
                    int i4 = this.f3872bp + i3;
                    this.f3872bp = i4;
                    this.f3873ch = charAt(i4);
                    this.matchStat = 5;
                    this.token = 15;
                    return 0L;
                }
                if (!isWhitespace(cCharAt3)) {
                    this.matchStat = -1;
                    return 0L;
                }
                cCharAt3 = charAt(this.f3872bp + i3);
                i3++;
            }
            int i5 = this.f3872bp + i3;
            this.f3872bp = i5;
            this.f3873ch = charAt(i5);
            this.matchStat = 5;
            this.token = 16;
            return 0L;
        }
        long j = cCharAt2 - '0';
        while (true) {
            i2 = i + 1;
            cCharAt = charAt(this.f3872bp + i);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            i = i2;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0L;
        }
        if (j < 0 && (j != Long.MIN_VALUE || !z2)) {
            throw new NumberFormatException(subString(this.f3872bp, i));
        }
        if (z) {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0L;
            }
            cCharAt = charAt(this.f3872bp + i2);
            i2 = i + 2;
        }
        while (cCharAt != c) {
            if (!isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return j;
            }
            cCharAt = charAt(this.f3872bp + i2);
            i2++;
        }
        int i6 = this.f3872bp + i2;
        this.f3872bp = i6;
        this.f3873ch = charAt(i6);
        this.matchStat = 3;
        this.token = 16;
        return z2 ? -j : j;
    }

    public final void scanNullOrNew(boolean z) {
        if (this.f3873ch != 'n') {
            qkq.m176968a("error parse null or new");
            return;
        }
        next();
        char c = this.f3873ch;
        if (c != 'u') {
            if (c != 'e') {
                qkq.m176968a("error parse new");
                return;
            }
            next();
            if (this.f3873ch != 'w') {
                qkq.m176968a("error parse new");
                return;
            }
            next();
            char c2 = this.f3873ch;
            if (c2 == ' ' || c2 == ',' || c2 == '}' || c2 == ']' || c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == 26 || c2 == '\f' || c2 == '\b') {
                this.token = 9;
                return;
            } else {
                qkq.m176968a("scan new error");
                return;
            }
        }
        next();
        if (this.f3873ch != 'l') {
            qkq.m176968a("error parse null");
            return;
        }
        next();
        if (this.f3873ch != 'l') {
            qkq.m176968a("error parse null");
            return;
        }
        next();
        char c3 = this.f3873ch;
        if (c3 == ' ' || c3 == ',' || c3 == '}' || c3 == ']' || c3 == '\n' || c3 == '\r' || c3 == '\t' || c3 == 26 || ((c3 == ':' && z) || c3 == '\f' || c3 == '\b')) {
            this.token = 8;
        } else {
            qkq.m176968a("scan null error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void scanNumber() {
        char c;
        boolean z;
        char c2;
        this.f3874np = this.f3872bp;
        boolean z2 = true;
        if (this.f3873ch == '-') {
            this.f3875sp++;
            next();
        }
        while (true) {
            c = this.f3873ch;
            if (c < '0' || c > '9') {
                break;
            }
            this.f3875sp++;
            next();
        }
        if (c == '.') {
            this.f3875sp++;
            next();
            while (true) {
                char c3 = this.f3873ch;
                if (c3 < '0' || c3 > '9') {
                    break;
                }
                this.f3875sp++;
                next();
            }
            z = true;
        } else {
            z = false;
        }
        char c4 = this.f3873ch;
        if (c4 != 'L' && c4 != 'S' && c4 != 'B') {
            if (c4 == 'F' || c4 == 'D') {
                this.f3875sp++;
                next();
            } else if (c4 == 'e' || c4 == 'E') {
                this.f3875sp++;
                next();
                char c5 = this.f3873ch;
                if (c5 == '+' || c5 == '-') {
                    this.f3875sp++;
                    next();
                }
                while (true) {
                    c2 = this.f3873ch;
                    if (c2 < '0' || c2 > '9') {
                        break;
                    }
                    this.f3875sp++;
                    next();
                }
                if (c2 == 'D' || c2 == 'F') {
                    this.f3875sp++;
                    next();
                }
            }
            if (z2) {
                this.token = 3;
            } else {
                this.token = 2;
            }
        }
        this.f3875sp++;
        next();
        z2 = z;
        if (z2) {
            this.token = 3;
        } else {
            this.token = 2;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void scanString() {
        this.f3874np = this.f3872bp;
        this.hasSpecial = false;
        while (true) {
            char next = next();
            if (next == '\"') {
                this.token = 4;
                this.f3873ch = next();
                return;
            }
            if (next != 26) {
                boolean z = this.hasSpecial;
                if (next == '\\') {
                    boolean z2 = true;
                    if (!z) {
                        this.hasSpecial = true;
                        int i = this.f3875sp;
                        char[] cArr = this.sbuf;
                        if (i >= cArr.length) {
                            int length = cArr.length * 2;
                            if (i <= length) {
                                i = length;
                            }
                            char[] cArr2 = new char[i];
                            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                            this.sbuf = cArr2;
                        }
                        copyTo(this.f3874np + 1, this.f3875sp, this.sbuf);
                    }
                    char next2 = next();
                    if (next2 == '\"') {
                        putChar('\"');
                    } else if (next2 != '\'') {
                        if (next2 != 'F') {
                            if (next2 == '\\') {
                                putChar('\\');
                            } else if (next2 == 'b') {
                                putChar('\b');
                            } else if (next2 != 'f') {
                                if (next2 == 'n') {
                                    putChar('\n');
                                } else if (next2 == 'r') {
                                    putChar('\r');
                                } else if (next2 != 'x') {
                                    switch (next2) {
                                        case '/':
                                            putChar('/');
                                            break;
                                        case '0':
                                            putChar((char) 0);
                                            break;
                                        case '1':
                                            putChar((char) 1);
                                            break;
                                        case '2':
                                            putChar((char) 2);
                                            break;
                                        case '3':
                                            putChar((char) 3);
                                            break;
                                        case '4':
                                            putChar((char) 4);
                                            break;
                                        case '5':
                                            putChar((char) 5);
                                            break;
                                        case '6':
                                            putChar((char) 6);
                                            break;
                                        case '7':
                                            putChar((char) 7);
                                            break;
                                        default:
                                            switch (next2) {
                                                case 't':
                                                    putChar('\t');
                                                    break;
                                                case 'u':
                                                    putChar((char) Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16));
                                                    break;
                                                case 'v':
                                                    putChar((char) 11);
                                                    break;
                                                default:
                                                    this.f3873ch = next2;
                                                    throw new JSONException("unclosed string : " + next2);
                                            }
                                            break;
                                    }
                                } else {
                                    char next3 = next();
                                    char next4 = next();
                                    boolean z3 = (next3 >= '0' && next3 <= '9') || (next3 >= 'a' && next3 <= 'f') || (next3 >= 'A' && next3 <= 'F');
                                    if ((next4 < '0' || next4 > '9') && ((next4 < 'a' || next4 > 'f') && (next4 < 'A' || next4 > 'F'))) {
                                        z2 = false;
                                    }
                                    if (!z3 || !z2) {
                                        throw new JSONException("invalid escape character \\x" + next3 + next4);
                                    }
                                    int[] iArr = digits;
                                    putChar((char) ((iArr[next3] * 16) + iArr[next4]));
                                }
                            }
                        }
                        putChar('\f');
                    } else {
                        putChar('\'');
                    }
                } else {
                    int i2 = this.f3875sp;
                    if (z) {
                        char[] cArr3 = this.sbuf;
                        if (i2 == cArr3.length) {
                            putChar(next);
                        } else {
                            this.f3875sp = i2 + 1;
                            cArr3[i2] = next;
                        }
                    } else {
                        this.f3875sp = i2 + 1;
                    }
                }
            } else {
                if (isEOF()) {
                    throw new JSONException("unclosed string : " + next);
                }
                putChar(JSONLexer.EOI);
            }
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void scanStringArray(Collection<String> collection, char c) {
        char cCharAt;
        int i;
        int i2;
        char cCharAt2;
        this.matchStat = 0;
        char cCharAt3 = charAt(this.f3872bp);
        char c2 = 'u';
        char c3 = Constants.INAPP_POSITION_LEFT;
        if (cCharAt3 == 'n' && charAt(this.f3872bp + 1) == 'u' && charAt(this.f3872bp + 2) == 'l' && charAt(this.f3872bp + 3) == 'l' && charAt(this.f3872bp + 4) == c) {
            int i3 = this.f3872bp + 5;
            this.f3872bp = i3;
            this.f3873ch = charAt(i3);
            this.matchStat = 5;
            return;
        }
        if (cCharAt3 != '[') {
            this.matchStat = -1;
            return;
        }
        char cCharAt4 = charAt(this.f3872bp + 1);
        int i4 = 2;
        while (true) {
            if (cCharAt4 == 'n' && charAt(this.f3872bp + i4) == c2 && charAt(this.f3872bp + i4 + 1) == c3 && charAt(this.f3872bp + i4 + 2) == c3) {
                int i5 = i4 + 3;
                i = i4 + 4;
                cCharAt = charAt(this.f3872bp + i5);
                collection.add(null);
            } else {
                if (cCharAt4 == ']' && collection.size() == 0) {
                    i2 = i4 + 1;
                    cCharAt2 = charAt(this.f3872bp + i4);
                    break;
                }
                if (cCharAt4 != '\"') {
                    this.matchStat = -1;
                    return;
                }
                int i6 = this.f3872bp + i4;
                int iIndexOf = indexOf('\"', i6);
                if (iIndexOf == -1) {
                    qkq.m176968a("unclosed str");
                    return;
                }
                String strSubString = subString(this.f3872bp + i4, iIndexOf - i6);
                if (strSubString.indexOf(92) != -1) {
                    while (true) {
                        int i7 = 0;
                        for (int i8 = iIndexOf - 1; i8 >= 0 && charAt(i8) == '\\'; i8--) {
                            i7++;
                        }
                        if (i7 % 2 == 0) {
                            break;
                        } else {
                            iIndexOf = indexOf('\"', iIndexOf + 1);
                        }
                    }
                    int i9 = iIndexOf - i6;
                    strSubString = readString(sub_chars(this.f3872bp + i4, i9), i9);
                }
                int i10 = this.f3872bp;
                int i11 = i4 + (iIndexOf - (i10 + i4)) + 1;
                cCharAt = charAt(i10 + i11);
                collection.add(strSubString);
                i = i11 + 1;
            }
            if (cCharAt != ',') {
                if (cCharAt == ']') {
                    i2 = i + 1;
                    cCharAt2 = charAt(this.f3872bp + i);
                    break;
                } else {
                    this.matchStat = -1;
                    return;
                }
            }
            char cCharAt5 = charAt(this.f3872bp + i);
            i4 = i + 1;
            c2 = 'u';
            c3 = Constants.INAPP_POSITION_LEFT;
            cCharAt4 = cCharAt5;
        }
        if (cCharAt2 != c) {
            this.matchStat = -1;
            return;
        }
        int i12 = this.f3872bp + i2;
        this.f3872bp = i12;
        this.f3873ch = charAt(i12);
        this.matchStat = 3;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String scanSymbol(SymbolTable symbolTable, char c) {
        String strAddSymbol;
        this.f3874np = this.f3872bp;
        this.f3875sp = 0;
        boolean z = false;
        int i = 0;
        while (true) {
            char next = next();
            if (next == c) {
                this.token = 4;
                if (z) {
                    strAddSymbol = symbolTable.addSymbol(this.sbuf, 0, this.f3875sp, i);
                } else {
                    int i2 = this.f3874np;
                    strAddSymbol = addSymbol(i2 == -1 ? 0 : i2 + 1, this.f3875sp, i, symbolTable);
                }
                this.f3875sp = 0;
                next();
                return strAddSymbol;
            }
            if (next == 26) {
                qkq.m176968a("unclosed.str");
                return null;
            }
            if (next == '\\') {
                if (!z) {
                    int i3 = this.f3875sp;
                    char[] cArr = this.sbuf;
                    if (i3 >= cArr.length) {
                        int length = cArr.length * 2;
                        if (i3 <= length) {
                            i3 = length;
                        }
                        char[] cArr2 = new char[i3];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        this.sbuf = cArr2;
                    }
                    arrayCopy(this.f3874np + 1, this.sbuf, 0, this.f3875sp);
                    z = true;
                }
                char next2 = next();
                if (next2 == '\"') {
                    i = (i * 31) + 34;
                    putChar('\"');
                } else if (next2 != '\'') {
                    if (next2 != 'F') {
                        if (next2 == '\\') {
                            i = (i * 31) + 92;
                            putChar('\\');
                        } else if (next2 == 'b') {
                            i = (i * 31) + 8;
                            putChar('\b');
                        } else if (next2 != 'f') {
                            if (next2 == 'n') {
                                i = (i * 31) + 10;
                                putChar('\n');
                            } else if (next2 == 'r') {
                                i = (i * 31) + 13;
                                putChar('\r');
                            } else if (next2 != 'x') {
                                switch (next2) {
                                    case '/':
                                        i = (i * 31) + 47;
                                        putChar('/');
                                        break;
                                    case '0':
                                        i = (i * 31) + next2;
                                        putChar((char) 0);
                                        break;
                                    case '1':
                                        i = (i * 31) + next2;
                                        putChar((char) 1);
                                        break;
                                    case '2':
                                        i = (i * 31) + next2;
                                        putChar((char) 2);
                                        break;
                                    case '3':
                                        i = (i * 31) + next2;
                                        putChar((char) 3);
                                        break;
                                    case '4':
                                        i = (i * 31) + next2;
                                        putChar((char) 4);
                                        break;
                                    case '5':
                                        i = (i * 31) + next2;
                                        putChar((char) 5);
                                        break;
                                    case '6':
                                        i = (i * 31) + next2;
                                        putChar((char) 6);
                                        break;
                                    case '7':
                                        i = (i * 31) + next2;
                                        putChar((char) 7);
                                        break;
                                    default:
                                        switch (next2) {
                                            case 't':
                                                i = (i * 31) + 9;
                                                putChar('\t');
                                                break;
                                            case 'u':
                                                int i4 = Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16);
                                                i = (i * 31) + i4;
                                                putChar((char) i4);
                                                break;
                                            case 'v':
                                                i = (i * 31) + 11;
                                                putChar((char) 11);
                                                break;
                                            default:
                                                this.f3873ch = next2;
                                                qkq.m176968a("unclosed.str.lit");
                                                return null;
                                        }
                                        break;
                                }
                            } else {
                                char next3 = next();
                                this.f3873ch = next3;
                                char next4 = next();
                                this.f3873ch = next4;
                                int[] iArr = digits;
                                char c2 = (char) ((iArr[next3] * 16) + iArr[next4]);
                                i = (i * 31) + c2;
                                putChar(c2);
                            }
                        }
                    }
                    i = (i * 31) + 12;
                    putChar('\f');
                } else {
                    i = (i * 31) + 39;
                    putChar('\'');
                }
            } else {
                i = (i * 31) + next;
                int i5 = this.f3875sp;
                if (z) {
                    char[] cArr3 = this.sbuf;
                    if (i5 == cArr3.length) {
                        putChar(next);
                    } else {
                        this.f3875sp = i5 + 1;
                        cArr3[i5] = next;
                    }
                } else {
                    this.f3875sp = i5 + 1;
                }
            }
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String scanSymbolUnQuoted(SymbolTable symbolTable) {
        if (this.token == 1 && this.pos == 0 && this.f3872bp == 1) {
            this.f3872bp = 0;
        }
        boolean[] zArr = IOUtils.firstIdentifierFlags;
        int i = this.f3873ch;
        if (i < zArr.length && !zArr[i]) {
            throw new JSONException("illegal identifier : " + this.f3873ch + info());
        }
        boolean[] zArr2 = IOUtils.identifierFlags;
        this.f3874np = this.f3872bp;
        this.f3875sp = 1;
        while (true) {
            char next = next();
            if (next < zArr2.length && !zArr2[next]) {
                break;
            }
            i = (i * 31) + next;
            this.f3875sp++;
        }
        this.f3873ch = charAt(this.f3872bp);
        this.token = 18;
        if (this.f3875sp == 4 && i == 3392903 && charAt(this.f3874np) == 'n' && charAt(this.f3874np + 1) == 'u' && charAt(this.f3874np + 2) == 'l' && charAt(this.f3874np + 3) == 'l') {
            return null;
        }
        int i2 = this.f3874np;
        return symbolTable == null ? subString(i2, this.f3875sp) : addSymbol(i2, this.f3875sp, i, symbolTable);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String scanSymbolWithSeperator(SymbolTable symbolTable, char c) {
        int i = 0;
        this.matchStat = 0;
        char cCharAt = charAt(this.f3872bp);
        if (cCharAt == 'n') {
            if (charAt(this.f3872bp + 1) != 'u' || charAt(this.f3872bp + 2) != 'l' || charAt(this.f3872bp + 3) != 'l') {
                this.matchStat = -1;
                return null;
            }
            if (charAt(this.f3872bp + 4) != c) {
                this.matchStat = -1;
                return null;
            }
            int i2 = this.f3872bp + 5;
            this.f3872bp = i2;
            this.f3873ch = charAt(i2);
            this.matchStat = 3;
            return null;
        }
        if (cCharAt != '\"') {
            this.matchStat = -1;
            return null;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = charAt(this.f3872bp + i3);
            if (cCharAt2 == '\"') {
                int i5 = this.f3872bp;
                int i6 = i5 + 1;
                String strAddSymbol = addSymbol(i6, ((i5 + i4) - i6) - 1, i, symbolTable);
                int i7 = i3 + 2;
                char cCharAt3 = charAt(this.f3872bp + i4);
                while (cCharAt3 != c) {
                    if (!isWhitespace(cCharAt3)) {
                        this.matchStat = -1;
                        return strAddSymbol;
                    }
                    cCharAt3 = charAt(this.f3872bp + i7);
                    i7++;
                }
                int i8 = this.f3872bp + i7;
                this.f3872bp = i8;
                this.f3873ch = charAt(i8);
                this.matchStat = 3;
                return strAddSymbol;
            }
            i = (i * 31) + cCharAt2;
            if (cCharAt2 == '\\') {
                this.matchStat = -1;
                return null;
            }
            i3 = i4;
        }
    }

    public final void scanTrue() {
        if (this.f3873ch != 't') {
            qkq.m176968a("error parse true");
            return;
        }
        next();
        if (this.f3873ch != 'r') {
            qkq.m176968a("error parse true");
            return;
        }
        next();
        if (this.f3873ch != 'u') {
            qkq.m176968a("error parse true");
            return;
        }
        next();
        if (this.f3873ch != 'e') {
            qkq.m176968a("error parse true");
            return;
        }
        next();
        char c = this.f3873ch;
        if (c == ' ' || c == ',' || c == '}' || c == ']' || c == '\n' || c == '\r' || c == '\t' || c == 26 || c == '\f' || c == '\b' || c == ':' || c == '/') {
            this.token = 6;
        } else {
            qkq.m176968a("scan true error");
        }
    }

    public final int scanType(String str) {
        int i;
        this.matchStat = 0;
        char[] cArr = typeFieldName;
        if (!charArrayCompare(cArr)) {
            return -2;
        }
        int length = this.f3872bp + cArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            if (str.charAt(i2) != charAt(length + i2)) {
                return -1;
            }
        }
        int i3 = length + length2;
        if (charAt(i3) != '\"') {
            return -1;
        }
        int i4 = i3 + 1;
        char cCharAt = charAt(i4);
        this.f3873ch = cCharAt;
        if (cCharAt == ',') {
            int i5 = i3 + 2;
            this.f3873ch = charAt(i5);
            this.f3872bp = i5;
            this.token = 16;
            return 3;
        }
        if (cCharAt == '}') {
            i4 = i3 + 2;
            char cCharAt2 = charAt(i4);
            this.f3873ch = cCharAt2;
            if (cCharAt2 == ',') {
                this.token = 16;
                i = i3 + 3;
                this.f3873ch = charAt(i);
            } else if (cCharAt2 == ']') {
                this.token = 15;
                i = i3 + 3;
                this.f3873ch = charAt(i);
            } else {
                if (cCharAt2 == '}') {
                    this.token = 13;
                    i = i3 + 3;
                    this.f3873ch = charAt(i);
                } else {
                    if (cCharAt2 != 26) {
                        return -1;
                    }
                    this.token = 20;
                }
                this.matchStat = 4;
            }
            i4 = i;
            this.matchStat = 4;
        }
        this.f3872bp = i4;
        return this.matchStat;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String scanTypeName(SymbolTable symbolTable) {
        return null;
    }

    public UUID scanUUID(char c) {
        UUID uuid;
        int i;
        int i2;
        char cCharAt;
        int i3;
        UUID uuid2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.f3872bp);
        if (cCharAt2 == '\"') {
            int iIndexOf = indexOf('\"', this.f3872bp + 1);
            if (iIndexOf == -1) {
                qkq.m176968a("unclosed str");
                return null;
            }
            int i11 = this.f3872bp + 1;
            int i12 = iIndexOf - i11;
            char c2 = 'A';
            uuid = null;
            i = 4;
            if (i12 == 36) {
                long j = 0;
                i2 = 3;
                for (int i13 = 0; i13 < 8; i13++) {
                    char cCharAt3 = charAt(i11 + i13);
                    if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                        i10 = cCharAt3 - '0';
                    } else if (cCharAt3 >= 'a' && cCharAt3 <= 'f') {
                        i10 = cCharAt3 - 'W';
                    } else {
                        if (cCharAt3 < 'A' || cCharAt3 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i10 = cCharAt3 - '7';
                    }
                    j = (j << 4) | ((long) i10);
                }
                int i14 = 9;
                for (int i15 = 13; i14 < i15; i15 = 13) {
                    char cCharAt4 = charAt(i11 + i14);
                    if (cCharAt4 >= '0' && cCharAt4 <= '9') {
                        i9 = cCharAt4 - '0';
                    } else if (cCharAt4 >= 'a' && cCharAt4 <= 'f') {
                        i9 = cCharAt4 - 'W';
                    } else {
                        if (cCharAt4 < 'A' || cCharAt4 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i9 = cCharAt4 - '7';
                    }
                    j = (j << 4) | ((long) i9);
                    i14++;
                }
                int i16 = 14;
                long j2 = j;
                while (i16 < 18) {
                    char cCharAt5 = charAt(i11 + i16);
                    if (cCharAt5 >= '0' && cCharAt5 <= '9') {
                        i8 = cCharAt5 - '0';
                    } else if (cCharAt5 >= 'a' && cCharAt5 <= 'f') {
                        i8 = cCharAt5 - 'W';
                    } else {
                        if (cCharAt5 < c2 || cCharAt5 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i8 = cCharAt5 - '7';
                    }
                    j2 = (j2 << 4) | ((long) i8);
                    i16++;
                    iIndexOf = iIndexOf;
                    c2 = 'A';
                }
                int i17 = iIndexOf;
                long j3 = 0;
                for (int i18 = 19; i18 < 23; i18++) {
                    char cCharAt6 = charAt(i11 + i18);
                    if (cCharAt6 >= '0' && cCharAt6 <= '9') {
                        i7 = cCharAt6 - '0';
                    } else if (cCharAt6 >= 'a' && cCharAt6 <= 'f') {
                        i7 = cCharAt6 - 'W';
                    } else {
                        if (cCharAt6 < 'A' || cCharAt6 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i7 = cCharAt6 - '7';
                    }
                    j3 = (j3 << 4) | ((long) i7);
                }
                int i19 = 24;
                long j4 = j3;
                for (int i20 = 36; i19 < i20; i20 = 36) {
                    char cCharAt7 = charAt(i11 + i19);
                    if (cCharAt7 >= '0' && cCharAt7 <= '9') {
                        i6 = cCharAt7 - '0';
                    } else if (cCharAt7 >= 'a' && cCharAt7 <= 'f') {
                        i6 = cCharAt7 - 'W';
                    } else {
                        if (cCharAt7 < 'A' || cCharAt7 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i6 = cCharAt7 - '7';
                    }
                    j4 = (j4 << 4) | ((long) i6);
                    i19++;
                }
                uuid2 = new UUID(j2, j4);
                int i21 = this.f3872bp;
                int i22 = i17 - (i21 + 1);
                int i23 = i22 + 2;
                i3 = i22 + 3;
                cCharAt = charAt(i21 + i23);
            } else {
                i2 = 3;
                if (i12 != 32) {
                    this.matchStat = -1;
                    return null;
                }
                long j5 = 0;
                for (int i24 = 0; i24 < 16; i24++) {
                    char cCharAt8 = charAt(i11 + i24);
                    if (cCharAt8 >= '0' && cCharAt8 <= '9') {
                        i5 = cCharAt8 - '0';
                    } else if (cCharAt8 >= 'a' && cCharAt8 <= 'f') {
                        i5 = cCharAt8 - 'W';
                    } else {
                        if (cCharAt8 < 'A' || cCharAt8 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i5 = cCharAt8 - '7';
                    }
                    j5 = (j5 << 4) | ((long) i5);
                }
                int i25 = 16;
                long j6 = 0;
                for (int i26 = 32; i25 < i26; i26 = 32) {
                    char cCharAt9 = charAt(i11 + i25);
                    if (cCharAt9 < '0' || cCharAt9 > '9') {
                        if (cCharAt9 >= 'a' && cCharAt9 <= 'f') {
                            i4 = cCharAt9 - 'W';
                        } else {
                            if (cCharAt9 < 'A' || cCharAt9 > 'F') {
                                this.matchStat = -2;
                                return null;
                            }
                            i4 = cCharAt9 - '7';
                        }
                        j6 = (j6 << 4) | ((long) i4);
                        i25++;
                    } else {
                        i4 = cCharAt9 - '0';
                    }
                    j6 = (j6 << 4) | ((long) i4);
                    i25++;
                }
                uuid2 = new UUID(j5, j6);
                int i27 = this.f3872bp;
                int i28 = iIndexOf - (i27 + 1);
                int i29 = i28 + 2;
                i3 = i28 + 3;
                cCharAt = charAt(i27 + i29);
            }
        } else {
            uuid = null;
            i = 4;
            i2 = 3;
            if (cCharAt2 != 'n' || charAt(this.f3872bp + 1) != 'u' || charAt(this.f3872bp + 2) != 'l' || charAt(this.f3872bp + 3) != 'l') {
                this.matchStat = -1;
                return null;
            }
            cCharAt = charAt(this.f3872bp + 4);
            i3 = 5;
            uuid2 = null;
        }
        if (cCharAt == ',') {
            int i30 = this.f3872bp + i3;
            this.f3872bp = i30;
            this.f3873ch = charAt(i30);
            this.matchStat = i2;
            return uuid2;
        }
        if (cCharAt != ']') {
            this.matchStat = -1;
            return uuid;
        }
        int i31 = i3 + 1;
        char cCharAt10 = charAt(this.f3872bp + i3);
        if (cCharAt10 == ',') {
            this.token = 16;
            int i32 = this.f3872bp + i31;
            this.f3872bp = i32;
            this.f3873ch = charAt(i32);
        } else if (cCharAt10 == ']') {
            this.token = 15;
            int i33 = this.f3872bp + i31;
            this.f3872bp = i33;
            this.f3873ch = charAt(i33);
        } else if (cCharAt10 == '}') {
            this.token = 13;
            int i34 = this.f3872bp + i31;
            this.f3872bp = i34;
            this.f3873ch = charAt(i34);
        } else {
            if (cCharAt10 != 26) {
                this.matchStat = -1;
                return uuid;
            }
            this.token = 20;
            this.f3872bp += i3;
            this.f3873ch = JSONLexer.EOI;
        }
        this.matchStat = i;
        return uuid2;
    }

    public boolean seekArrayToItem(int i) {
        throw new UnsupportedOperationException();
    }

    public int seekObjectToField(long j, boolean z) {
        throw new UnsupportedOperationException();
    }

    public int seekObjectToFieldDeepScan(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public void setToken(int i) {
        this.token = i;
    }

    public void skipArray() {
        throw new UnsupportedOperationException();
    }

    public void skipComment() {
        char c;
        next();
        char c2 = this.f3873ch;
        if (c2 == '/') {
            do {
                next();
                c = this.f3873ch;
                if (c == '\n') {
                    next();
                    return;
                }
            } while (c != 26);
            return;
        }
        if (c2 != '*') {
            qkq.m176968a("invalid comment");
            return;
        }
        next();
        while (true) {
            char c3 = this.f3873ch;
            if (c3 == 26) {
                return;
            }
            if (c3 == '*') {
                next();
                if (this.f3873ch == '/') {
                    next();
                    return;
                }
            } else {
                next();
            }
        }
    }

    public void skipObject() {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void skipWhitespace() {
        while (true) {
            char c = this.f3873ch;
            if (c > '/') {
                return;
            }
            if (c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b') {
                next();
            } else if (c != '/') {
                return;
            } else {
                skipComment();
            }
        }
    }

    public final String stringDefaultValue() {
        return this.stringDefaultValue;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract String stringVal();

    public abstract String subString(int i, int i2);

    public abstract char[] sub_chars(int i, int i2);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int token() {
        return this.token;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String tokenName() {
        return JSONToken.name(this.token);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextTokenWithColon(int i) {
        nextTokenWithChar(':');
    }

    public int seekObjectToField(long[] jArr) {
        throw new UnsupportedOperationException();
    }

    public void skipObject(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isEnabled(int i) {
        return (this.features & i) != 0;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isEnabled(Feature feature) {
        return isEnabled(feature.mask);
    }

    public int matchField(long j) {
        throw new UnsupportedOperationException();
    }

    public final void scanNullOrNew() {
        scanNullOrNew(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x007b A[SYNTHETIC] */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextToken(int i) {
        this.f3875sp = 0;
        while (true) {
            if (i == 2) {
                char c = this.f3873ch;
                if (c >= '0' && c <= '9') {
                    this.pos = this.f3872bp;
                    scanNumber();
                    return;
                }
                if (c == '\"') {
                    this.pos = this.f3872bp;
                    scanString();
                    return;
                } else if (c == '[') {
                    this.token = 14;
                    next();
                    return;
                } else if (c == '{') {
                    this.token = 12;
                    next();
                    return;
                }
            } else if (i == 4) {
                char c2 = this.f3873ch;
                if (c2 == '\"') {
                    this.pos = this.f3872bp;
                    scanString();
                    return;
                }
                if (c2 >= '0' && c2 <= '9') {
                    this.pos = this.f3872bp;
                    scanNumber();
                    return;
                } else if (c2 == '[') {
                    this.token = 14;
                    next();
                    return;
                } else if (c2 == '{') {
                    this.token = 12;
                    next();
                    return;
                }
            } else if (i != 12) {
                if (i == 18) {
                    nextIdent();
                    return;
                }
                if (i != 20) {
                    switch (i) {
                        case 14:
                            char c3 = this.f3873ch;
                            if (c3 == '[') {
                                this.token = 14;
                                next();
                            } else if (c3 == '{') {
                                this.token = 12;
                                next();
                            }
                            break;
                        case 15:
                            if (this.f3873ch == ']') {
                                this.token = 15;
                                next();
                            }
                            if (this.f3873ch == 26) {
                                this.token = 20;
                            }
                            break;
                        case 16:
                            char c4 = this.f3873ch;
                            if (c4 == ',') {
                                this.token = 16;
                                next();
                            } else if (c4 == '}') {
                                this.token = 13;
                                next();
                            } else if (c4 == ']') {
                                this.token = 15;
                                next();
                            } else if (c4 == 26) {
                                this.token = 20;
                            } else if (c4 == 'n') {
                                scanNullOrNew(false);
                            }
                            break;
                    }
                    return;
                }
                if (this.f3873ch == 26) {
                    this.token = 20;
                    return;
                }
            } else {
                char c5 = this.f3873ch;
                if (c5 == '{') {
                    this.token = 12;
                    next();
                    return;
                } else if (c5 == '[') {
                    this.token = 14;
                    next();
                    return;
                }
            }
            char c6 = this.f3873ch;
            if (c6 != ' ' && c6 != '\n' && c6 != '\r' && c6 != '\t' && c6 != '\f' && c6 != '\b') {
                nextToken();
                return;
            }
            next();
        }
    }

    public String[] scanFieldStringArray(char[] cArr, int i, SymbolTable symbolTable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String scanSymbol(SymbolTable symbolTable) {
        skipWhitespace();
        char c = this.f3873ch;
        if (c == '\"') {
            return scanSymbol(symbolTable, '\"');
        }
        if (c == '\'') {
            if (isEnabled(Feature.AllowSingleQuotes)) {
                return scanSymbol(symbolTable, '\'');
            }
            qkq.m176968a("syntax error");
            return null;
        }
        if (c == '}') {
            next();
            this.token = 13;
            return null;
        }
        if (c == ',') {
            next();
            this.token = 16;
            return null;
        }
        if (c == 26) {
            this.token = 20;
            return null;
        }
        if (isEnabled(Feature.AllowUnQuotedFieldNames)) {
            return scanSymbolUnQuoted(symbolTable);
        }
        qkq.m176968a("syntax error");
        return null;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String scanString(char c) {
        this.matchStat = 0;
        char cCharAt = charAt(this.f3872bp);
        if (cCharAt == 'n') {
            if (charAt(this.f3872bp + 1) == 'u' && charAt(this.f3872bp + 2) == 'l' && charAt(this.f3872bp + 3) == 'l') {
                if (charAt(this.f3872bp + 4) == c) {
                    int i = this.f3872bp + 5;
                    this.f3872bp = i;
                    this.f3873ch = charAt(i);
                    this.matchStat = 3;
                    return null;
                }
                this.matchStat = -1;
                return null;
            }
            this.matchStat = -1;
            return null;
        }
        int i2 = 1;
        while (cCharAt != '\"') {
            if (isWhitespace(cCharAt)) {
                cCharAt = charAt(this.f3872bp + i2);
                i2++;
            } else {
                this.matchStat = -1;
                return stringDefaultValue();
            }
        }
        int i3 = this.f3872bp + i2;
        int iIndexOf = indexOf('\"', i3);
        if (iIndexOf != -1) {
            String strSubString = subString(this.f3872bp + i2, iIndexOf - i3);
            if (strSubString.indexOf(92) != -1) {
                while (true) {
                    int i4 = 0;
                    for (int i5 = iIndexOf - 1; i5 >= 0 && charAt(i5) == '\\'; i5--) {
                        i4++;
                    }
                    if (i4 % 2 == 0) {
                        break;
                    }
                    iIndexOf = indexOf('\"', iIndexOf + 1);
                }
                int i6 = iIndexOf - i3;
                strSubString = readString(sub_chars(this.f3872bp + 1, i6), i6);
            }
            int i7 = i2 + (iIndexOf - i3) + 1;
            int i8 = i7 + 1;
            char cCharAt2 = charAt(this.f3872bp + i7);
            while (cCharAt2 != c) {
                if (isWhitespace(cCharAt2)) {
                    cCharAt2 = charAt(this.f3872bp + i8);
                    i8++;
                } else {
                    this.matchStat = -1;
                    return strSubString;
                }
            }
            int i9 = this.f3872bp + i8;
            this.f3872bp = i9;
            this.f3873ch = charAt(i9);
            this.matchStat = 3;
            this.token = 16;
            return strSubString;
        }
        qkq.m176968a("unclosed str");
        return null;
    }
}

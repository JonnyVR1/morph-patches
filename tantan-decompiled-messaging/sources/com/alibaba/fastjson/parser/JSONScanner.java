package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.IOUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import p149l.bz00;
import p149l.j6f;
import p149l.k250;
import p149l.piq;
import p149l.qq3;
import p149l.riq;
import p149l.wiq;
import p149l.xiq;

/* JADX INFO: loaded from: classes.dex */
public final class JSONScanner extends JSONLexerBase {
    private final int len;
    private final String text;

    public JSONScanner(String str, int i) {
        super(i);
        this.text = str;
        this.len = str.length();
        this.f3872bp = -1;
        next();
        if (this.f3873ch == 65279) {
            next();
        }
    }

    public static boolean charArrayCompare(String str, int i, char[] cArr) {
        int length = cArr.length;
        if (length + i > str.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (cArr[i2] != str.charAt(i + i2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDate(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
        if (c >= '0' && c <= '9' && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            if (c5 == '0') {
                if (c6 < '1' || c6 > '9') {
                    return false;
                }
            } else if (c5 != '1' || (c6 != '0' && c6 != '1' && c6 != '2')) {
                return false;
            }
            if (i == 48) {
                return i2 >= 49 && i2 <= 57;
            }
            if (i != 49 && i != 50) {
                return i == 51 && (i2 == 48 || i2 == 49);
            }
            if (i2 >= 48 && i2 <= 57) {
                return true;
            }
        }
        return false;
    }

    private boolean checkTime(char c, char c2, char c3, char c4, char c5, char c6) {
        if (c == '0') {
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        } else {
            if (c != '1') {
                if (c == '2' && c2 >= '0' && c2 <= '4') {
                }
                return false;
            }
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        }
        if (c3 < '0' || c3 > '5') {
            if (c3 != '6' || c4 != '0') {
                return false;
            }
        } else if (c4 < '0' || c4 > '9') {
            return false;
        }
        if (c5 < '0' || c5 > '5') {
            return c5 == '6' && c6 == '0';
        }
        return c6 >= '0' && c6 <= '9';
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0245 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x0246  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:183:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:185:0x0406  */
    /* JADX WARN: Code duplicated, block: B:199:0x0437  */
    /* JADX WARN: Code duplicated, block: B:207:0x0458  */
    /* JADX WARN: Code duplicated, block: B:210:0x046f  */
    /* JADX WARN: Code duplicated, block: B:224:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:226:0x04bb  */
    private boolean scanISO8601DateIfMatch(boolean z, int i) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        int i2;
        int i3;
        int i4;
        int i5;
        char c6;
        char cCharAt;
        char c7;
        char c8;
        char c9;
        int i6;
        char c10;
        int i7;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        char cCharAt7;
        char cCharAt8;
        int i8;
        int i9;
        char cCharAt9;
        int i10;
        char c19;
        char cCharAt10;
        char cCharAt11;
        char c20;
        char c21;
        int i11;
        char cCharAt12;
        int i12;
        char cCharAt13;
        int i13;
        char cCharAt14;
        char cCharAt15;
        char cCharAt16;
        if (i < 8) {
            return false;
        }
        char cCharAt17 = charAt(this.f3872bp);
        char cCharAt18 = charAt(this.f3872bp + 1);
        char cCharAt19 = charAt(this.f3872bp + 2);
        char cCharAt20 = charAt(this.f3872bp + 3);
        char cCharAt21 = charAt(this.f3872bp + 4);
        char cCharAt22 = charAt(this.f3872bp + 5);
        char cCharAt23 = charAt(this.f3872bp + 6);
        char cCharAt24 = charAt(this.f3872bp + 7);
        if (!z && i > 13) {
            char cCharAt25 = charAt((this.f3872bp + i) - 1);
            char cCharAt26 = charAt((this.f3872bp + i) - 2);
            if (cCharAt17 == '/' && cCharAt18 == 'D' && cCharAt19 == 'a' && cCharAt20 == 't' && cCharAt21 == 'e' && cCharAt22 == '(' && cCharAt25 == '/' && cCharAt26 == ')') {
                int i14 = -1;
                for (int i15 = 6; i15 < i; i15++) {
                    char cCharAt27 = charAt(this.f3872bp + i15);
                    if (cCharAt27 != '+') {
                        if (cCharAt27 < '0' || cCharAt27 > '9') {
                            break;
                        }
                    } else {
                        i14 = i15;
                    }
                }
                if (i14 == -1) {
                    return false;
                }
                int i16 = this.f3872bp;
                int i17 = i16 + 6;
                long j = Long.parseLong(subString(i17, (i16 + i14) - i17));
                Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
                this.calendar = calendar;
                calendar.setTimeInMillis(j);
                this.token = 5;
                return true;
            }
        }
        if (i == 8 || i == 14 || ((i == 16 && ((cCharAt16 = charAt(this.f3872bp + 10)) == 'T' || cCharAt16 == ' ')) || (i == 17 && charAt(this.f3872bp + 6) != '-'))) {
            if (z) {
                return false;
            }
            char cCharAt28 = charAt(this.f3872bp + 8);
            boolean z2 = cCharAt21 == '-' && cCharAt24 == '-';
            boolean z3 = z2 && i == 16;
            boolean z4 = z2 && i == 17;
            if (z4 || z3) {
                cCharAt17 = cCharAt17;
                c = 'T';
                c2 = cCharAt22;
                cCharAt22 = cCharAt23;
                cCharAt24 = charAt(this.f3872bp + 9);
                c3 = '0';
                c4 = cCharAt28;
                c5 = Matrix.MATRIX_TYPE_ZERO;
            } else {
                if (cCharAt21 == '-' && cCharAt23 == '-') {
                    c = 'T';
                    c3 = '0';
                    c2 = '0';
                    c4 = '0';
                } else {
                    c = 'T';
                    c2 = cCharAt21;
                    c4 = cCharAt23;
                    c3 = '0';
                }
                c5 = Matrix.MATRIX_TYPE_ZERO;
            }
            char c22 = c2;
            char c23 = cCharAt22;
            char c24 = c4;
            char c25 = cCharAt24;
            if (!checkDate(cCharAt17, cCharAt18, cCharAt19, cCharAt20, c2, cCharAt22, c4, cCharAt24)) {
                return false;
            }
            char c26 = c3;
            char c27 = c;
            setCalendar(cCharAt17, cCharAt18, cCharAt19, cCharAt20, c22, c23, c24, c25);
            if (i != 8) {
                char cCharAt29 = charAt(this.f3872bp + 9);
                char cCharAt30 = charAt(this.f3872bp + 10);
                char cCharAt31 = charAt(this.f3872bp + 11);
                char cCharAt32 = charAt(this.f3872bp + 12);
                char cCharAt33 = charAt(this.f3872bp + 13);
                if ((z4 && cCharAt30 == c27 && cCharAt33 == ':' && charAt(this.f3872bp + 16) == c5) || (z3 && ((cCharAt30 == ' ' || cCharAt30 == c27) && cCharAt33 == ':'))) {
                    char cCharAt34 = charAt(this.f3872bp + 14);
                    cCharAt = charAt(this.f3872bp + 15);
                    c9 = cCharAt31;
                    c6 = c26;
                    c7 = cCharAt34;
                    c8 = cCharAt32;
                    cCharAt32 = c6;
                } else {
                    c6 = cCharAt33;
                    cCharAt = cCharAt31;
                    c7 = cCharAt30;
                    c8 = cCharAt29;
                    c9 = cCharAt28;
                }
                boolean zCheckTime = checkTime(c9, c8, c7, cCharAt, cCharAt32, c6);
                char c28 = c7;
                char c29 = c9;
                char c30 = c8;
                if (!zCheckTime) {
                    return false;
                }
                if (i != 17 || z4) {
                    i6 = 0;
                } else {
                    char cCharAt35 = charAt(this.f3872bp + 14);
                    char cCharAt36 = charAt(this.f3872bp + 15);
                    char cCharAt37 = charAt(this.f3872bp + 16);
                    if (cCharAt35 < c26 || cCharAt35 > '9' || cCharAt36 < c26 || cCharAt36 > '9' || cCharAt37 < c26 || cCharAt37 > '9') {
                        return false;
                    }
                    i6 = ((cCharAt35 - c26) * 100) + ((cCharAt36 - c26) * 10) + (cCharAt37 - c26);
                }
                i2 = (c30 - c26) + ((c29 - c26) * 10);
                i3 = ((c28 - '0') * 10) + (cCharAt - c26);
                i4 = ((cCharAt32 - c26) * 10) + (c6 - c26);
                i5 = i6;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            this.calendar.set(11, i2);
            this.calendar.set(12, i3);
            this.calendar.set(13, i4);
            this.calendar.set(14, i5);
            this.token = 5;
            return true;
        }
        if (i < 9) {
            return false;
        }
        cCharAt24 = charAt(this.f3872bp + 8);
        char cCharAt38 = charAt(this.f3872bp + 9);
        if ((cCharAt21 != '-' || cCharAt24 != '-') && (cCharAt21 != '/' || cCharAt24 != '/')) {
            if (cCharAt21 == '-' && cCharAt23 == '-') {
                if (cCharAt24 == ' ') {
                    i7 = 8;
                    c10 = '0';
                    cCharAt24 = '0';
                } else {
                    i7 = 9;
                    c10 = '0';
                }
            } else if ((cCharAt19 == '.' && cCharAt22 == '.') || (cCharAt19 == '-' && cCharAt22 == '-')) {
                cCharAt24 = cCharAt17;
                cCharAt22 = cCharAt21;
                c10 = cCharAt20;
                cCharAt20 = cCharAt38;
                cCharAt17 = cCharAt23;
                cCharAt18 = cCharAt24;
                cCharAt19 = cCharAt24;
                cCharAt24 = cCharAt18;
            } else if (cCharAt24 == 'T') {
                cCharAt17 = cCharAt17;
                c10 = cCharAt21;
                cCharAt22 = cCharAt22;
                cCharAt20 = cCharAt20;
                cCharAt24 = cCharAt23;
                cCharAt24 = cCharAt24;
                cCharAt18 = cCharAt18;
                cCharAt19 = cCharAt19;
                i7 = 8;
            } else {
                if (cCharAt21 != 24180 && cCharAt21 != 45380) {
                    return false;
                }
                if (cCharAt24 != 26376 && cCharAt24 != 50900) {
                    if (cCharAt23 != 26376 && cCharAt23 != 50900) {
                        return false;
                    }
                    if (cCharAt24 == 26085 || cCharAt24 == 51068) {
                        i7 = 10;
                        c10 = '0';
                        cCharAt24 = '0';
                    } else {
                        if (cCharAt38 != 26085 && cCharAt38 != 51068) {
                            return false;
                        }
                        i7 = 10;
                        c10 = '0';
                    }
                } else if (cCharAt38 == 26085 || cCharAt38 == 51068) {
                    cCharAt17 = cCharAt17;
                    c10 = cCharAt22;
                    cCharAt20 = cCharAt20;
                    cCharAt22 = cCharAt23;
                    cCharAt24 = cCharAt24;
                    cCharAt18 = cCharAt18;
                    cCharAt19 = cCharAt19;
                    i7 = 10;
                    cCharAt24 = '0';
                } else {
                    if (charAt(this.f3872bp + 10) != 26085 && charAt(this.f3872bp + 10) != 51068) {
                        return false;
                    }
                    cCharAt17 = cCharAt17;
                    c10 = cCharAt22;
                    cCharAt20 = cCharAt20;
                    cCharAt24 = cCharAt38;
                    cCharAt22 = cCharAt23;
                    cCharAt24 = cCharAt24;
                    cCharAt18 = cCharAt18;
                    cCharAt19 = cCharAt19;
                    i7 = 11;
                }
            }
            c11 = cCharAt17;
            c12 = cCharAt18;
            c13 = cCharAt19;
            c14 = cCharAt20;
            c15 = c10;
            c16 = cCharAt22;
            c17 = cCharAt24;
            c18 = cCharAt24;
            if (!checkDate(cCharAt17, cCharAt18, cCharAt19, cCharAt20, c10, cCharAt22, cCharAt24, cCharAt24)) {
                return false;
            }
            setCalendar(c11, c12, c13, c14, c15, c16, c17, c18);
            cCharAt2 = charAt(this.f3872bp + i7);
            if (cCharAt2 != 'T' && i == 16 && i7 == 8 && charAt(this.f3872bp + 15) == 'Z') {
                char cCharAt39 = charAt(this.f3872bp + i7 + 1);
                char cCharAt40 = charAt(this.f3872bp + i7 + 2);
                char cCharAt41 = charAt(this.f3872bp + i7 + 3);
                char cCharAt42 = charAt(this.f3872bp + i7 + 4);
                char cCharAt43 = charAt(this.f3872bp + i7 + 5);
                char cCharAt44 = charAt(this.f3872bp + i7 + 6);
                if (!checkTime(cCharAt39, cCharAt40, cCharAt41, cCharAt42, cCharAt43, cCharAt44)) {
                    return false;
                }
                setTime(cCharAt39, cCharAt40, cCharAt41, cCharAt42, cCharAt43, cCharAt44);
                this.calendar.set(14, 0);
                if (this.calendar.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs = TimeZone.getAvailableIDs(0);
                    if (availableIDs.length > 0) {
                        this.calendar.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
                    }
                }
                this.token = 5;
                return true;
            }
            if (cCharAt2 == 'T' && (cCharAt2 != ' ' || z)) {
                if (cCharAt2 == '\"' || cCharAt2 == 26 || cCharAt2 == 26085 || cCharAt2 == 51068) {
                    this.calendar.set(11, 0);
                    this.calendar.set(12, 0);
                    this.calendar.set(13, 0);
                    this.calendar.set(14, 0);
                    int i18 = this.f3872bp + i7;
                    this.f3872bp = i18;
                    this.f3873ch = charAt(i18);
                    this.token = 5;
                    return true;
                }
                if ((cCharAt2 != '+' && cCharAt2 != '-') || this.len != i7 + 6 || charAt(this.f3872bp + i7 + 3) != ':' || charAt(this.f3872bp + i7 + 4) != '0' || charAt(this.f3872bp + i7 + 5) != '0') {
                    return false;
                }
                setTime('0', '0', '0', '0', '0', '0');
                this.calendar.set(14, 0);
                setTimeZone(cCharAt2, charAt(this.f3872bp + i7 + 1), charAt(this.f3872bp + i7 + 2));
                return true;
            }
            if (i >= i7 + 9 || charAt(this.f3872bp + i7 + 3) != ':' || charAt(this.f3872bp + i7 + 6) != ':') {
                return false;
            }
            cCharAt3 = charAt(this.f3872bp + i7 + 1);
            cCharAt4 = charAt(this.f3872bp + i7 + 2);
            cCharAt5 = charAt(this.f3872bp + i7 + 4);
            cCharAt6 = charAt(this.f3872bp + i7 + 5);
            cCharAt7 = charAt(this.f3872bp + i7 + 7);
            cCharAt8 = charAt(this.f3872bp + i7 + 8);
            if (!checkTime(cCharAt3, cCharAt4, cCharAt5, cCharAt6, cCharAt7, cCharAt8)) {
                return false;
            }
            setTime(cCharAt3, cCharAt4, cCharAt5, cCharAt6, cCharAt7, cCharAt8);
            if (charAt(this.f3872bp + i7 + 9) == '.') {
                i12 = i7 + 11;
                if (i >= i12 || (cCharAt13 = charAt(this.f3872bp + i7 + 10)) < '0' || cCharAt13 > '9') {
                    return false;
                }
                i9 = cCharAt13 - '0';
                if (i > i12 || (cCharAt15 = charAt(this.f3872bp + i7 + 11)) < '0' || cCharAt15 > '9') {
                    i13 = 2;
                    i8 = 1;
                } else {
                    i9 = (i9 * 10) + (cCharAt15 - '0');
                    i8 = 2;
                    i13 = 2;
                }
                if (i8 == i13 && (cCharAt14 = charAt(this.f3872bp + i7 + 12)) >= '0' && cCharAt14 <= '9') {
                    i9 = (i9 * 10) + (cCharAt14 - '0');
                    i8 = 3;
                }
            } else {
                i8 = -1;
                i9 = 0;
            }
            this.calendar.set(14, i9);
            cCharAt9 = charAt(this.f3872bp + i7 + 10 + i8);
            if (cCharAt9 == ' ') {
                i8++;
                cCharAt9 = charAt(this.f3872bp + i7 + 10 + i8);
            }
            i10 = i8;
            c19 = cCharAt9;
            if (c19 != '+' || c19 == '-') {
                cCharAt10 = charAt(this.f3872bp + i7 + 10 + i10 + 1);
                if (cCharAt10 >= '0' || cCharAt10 > '1' || (cCharAt11 = charAt(this.f3872bp + i7 + 10 + i10 + 2)) < '0' || cCharAt11 > '9') {
                    return false;
                }
                char cCharAt45 = charAt(this.f3872bp + i7 + 10 + i10 + 3);
                if (cCharAt45 == ':') {
                    char cCharAt46 = charAt(this.f3872bp + i7 + 10 + i10 + 4);
                    char cCharAt47 = charAt(this.f3872bp + i7 + 10 + i10 + 5);
                    if (cCharAt46 == '4' && cCharAt47 == '5') {
                        if (cCharAt10 != '1' || cCharAt11 != '2') {
                            if (cCharAt10 != '0') {
                                return false;
                            }
                            if (cCharAt11 != '5' && cCharAt11 != '8') {
                                return false;
                            }
                        }
                    } else if ((cCharAt46 != '0' && cCharAt46 != '3') || cCharAt47 != '0') {
                        return false;
                    }
                    cCharAt11 = cCharAt11;
                    c20 = cCharAt46;
                    c21 = cCharAt47;
                    i11 = 6;
                } else {
                    if (cCharAt45 == '0') {
                        char cCharAt48 = charAt(this.f3872bp + i7 + 10 + i10 + 4);
                        if (cCharAt48 != '0' && cCharAt48 != '3') {
                            return false;
                        }
                        c20 = cCharAt48;
                    } else if (cCharAt45 == '3' && charAt(this.f3872bp + i7 + 10 + i10 + 4) == '0') {
                        c20 = '3';
                    } else if (cCharAt45 == '4' && charAt(this.f3872bp + i7 + 10 + i10 + 4) == '5') {
                        cCharAt11 = cCharAt11;
                        c20 = '4';
                        i11 = 5;
                        c21 = '5';
                    } else {
                        cCharAt11 = cCharAt11;
                        c20 = '0';
                        c21 = '0';
                        i11 = 3;
                    }
                    c21 = '0';
                    i11 = 5;
                }
                setTimeZone(c19, cCharAt10, cCharAt11, c20, c21);
            } else if (c19 == 'Z') {
                if (this.calendar.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs2 = TimeZone.getAvailableIDs(0);
                    if (availableIDs2.length > 0) {
                        this.calendar.setTimeZone(TimeZone.getTimeZone(availableIDs2[0]));
                    }
                }
                i11 = 1;
            } else {
                i11 = 0;
            }
            int i19 = i7 + 10 + i10 + i11;
            cCharAt12 = charAt(this.f3872bp + i19);
            if (cCharAt12 == 26 && cCharAt12 != '\"') {
                return false;
            }
            int i20 = this.f3872bp + i19;
            this.f3872bp = i20;
            this.f3873ch = charAt(i20);
            this.token = 5;
            return true;
        }
        cCharAt17 = cCharAt17;
        c10 = cCharAt22;
        cCharAt20 = cCharAt20;
        cCharAt24 = cCharAt38;
        cCharAt22 = cCharAt23;
        cCharAt24 = cCharAt24;
        cCharAt18 = cCharAt18;
        cCharAt19 = cCharAt19;
        i7 = 10;
        c11 = cCharAt17;
        c12 = cCharAt18;
        c13 = cCharAt19;
        c14 = cCharAt20;
        c15 = c10;
        c16 = cCharAt22;
        c17 = cCharAt24;
        c18 = cCharAt24;
        if (!checkDate(cCharAt17, cCharAt18, cCharAt19, cCharAt20, c10, cCharAt22, cCharAt24, cCharAt24)) {
            return false;
        }
        setCalendar(c11, c12, c13, c14, c15, c16, c17, c18);
        cCharAt2 = charAt(this.f3872bp + i7);
        if (cCharAt2 != 'T') {
        }
        if (cCharAt2 == 'T') {
        }
        if (i >= i7 + 9) {
            return false;
        }
        cCharAt3 = charAt(this.f3872bp + i7 + 1);
        cCharAt4 = charAt(this.f3872bp + i7 + 2);
        cCharAt5 = charAt(this.f3872bp + i7 + 4);
        cCharAt6 = charAt(this.f3872bp + i7 + 5);
        cCharAt7 = charAt(this.f3872bp + i7 + 7);
        cCharAt8 = charAt(this.f3872bp + i7 + 8);
        if (!checkTime(cCharAt3, cCharAt4, cCharAt5, cCharAt6, cCharAt7, cCharAt8)) {
            return false;
        }
        setTime(cCharAt3, cCharAt4, cCharAt5, cCharAt6, cCharAt7, cCharAt8);
        if (charAt(this.f3872bp + i7 + 9) == '.') {
            i12 = i7 + 11;
            if (i >= i12) {
                return false;
            }
            i9 = cCharAt13 - '0';
            if (i > i12) {
                i13 = 2;
                i8 = 1;
            } else {
                i13 = 2;
                i8 = 1;
            }
            if (i8 == i13) {
                i9 = (i9 * 10) + (cCharAt14 - '0');
                i8 = 3;
            }
        } else {
            i8 = -1;
            i9 = 0;
        }
        this.calendar.set(14, i9);
        cCharAt9 = charAt(this.f3872bp + i7 + 10 + i8);
        if (cCharAt9 == ' ') {
            i8++;
            cCharAt9 = charAt(this.f3872bp + i7 + 10 + i8);
        }
        i10 = i8;
        c19 = cCharAt9;
        if (c19 != '+') {
            cCharAt10 = charAt(this.f3872bp + i7 + 10 + i10 + 1);
            if (cCharAt10 >= '0') {
            }
            return false;
        }
        cCharAt10 = charAt(this.f3872bp + i7 + 10 + i10 + 1);
        if (cCharAt10 >= '0') {
        }
        return false;
        int i110 = i7 + 10 + i10 + i11;
        cCharAt12 = charAt(this.f3872bp + i110);
        if (cCharAt12 == 26) {
        }
        int i21 = this.f3872bp + i110;
        this.f3872bp = i21;
        this.f3873ch = charAt(i21);
        this.token = 5;
        return true;
    }

    private void setCalendar(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        this.calendar = calendar;
        calendar.set(1, ((c - '0') * 1000) + ((c2 - '0') * 100) + ((c3 - '0') * 10) + (c4 - '0'));
        this.calendar.set(2, (((c5 - '0') * 10) + (c6 - '0')) - 1);
        this.calendar.set(5, ((c7 - '0') * 10) + (c8 - '0'));
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final String addSymbol(int i, int i2, int i3, SymbolTable symbolTable) {
        return symbolTable.addSymbol(this.text, i, i2, i3);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void arrayCopy(int i, char[] cArr, int i2, int i3) {
        this.text.getChars(i, i3 + i, cArr, i2);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public byte[] bytesValue() {
        if (this.token != 26) {
            return !this.hasSpecial ? IOUtils.decodeBase64(this.text, this.f3874np + 1, this.f3875sp) : IOUtils.decodeBase64(new String(this.sbuf, 0, this.f3875sp));
        }
        int i = this.f3874np + 1;
        int i2 = this.f3875sp;
        if (i2 % 2 != 0) {
            wiq.m203344a("illegal state. ", i2);
            return null;
        }
        int i3 = i2 / 2;
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * 2) + i;
            char cCharAt = this.text.charAt(i5);
            char cCharAt2 = this.text.charAt(i5 + 1);
            char c = '7';
            int i6 = cCharAt - (cCharAt <= '9' ? '0' : '7');
            if (cCharAt2 <= '9') {
                c = '0';
            }
            bArr[i4] = (byte) ((i6 << 4) | (cCharAt2 - c));
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char charAt(int i) {
        return i >= this.len ? JSONLexer.EOI : this.text.charAt(i);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void copyTo(int i, int i2, char[] cArr) {
        this.text.getChars(i, i2 + i, cArr, 0);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final BigDecimal decimalValue() {
        char cCharAt = charAt((this.f3874np + this.f3875sp) - 1);
        int i = this.f3875sp;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i--;
        }
        int i2 = this.f3874np;
        char[] cArr = this.sbuf;
        if (i < cArr.length) {
            this.text.getChars(i2, i2 + i, cArr, 0);
            return new BigDecimal(this.sbuf, 0, i);
        }
        char[] cArr2 = new char[i];
        this.text.getChars(i2, i + i2, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final int indexOf(char c, int i) {
        return this.text.indexOf(c, i);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public String info() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (i3 < this.f3872bp) {
            if (this.text.charAt(i3) == '\n') {
                i++;
                i2 = 1;
            }
            i3++;
            i2++;
        }
        sb.append("pos ");
        sb.append(this.f3872bp);
        sb.append(", line ");
        sb.append(i);
        sb.append(", column ");
        sb.append(i2);
        int length = this.text.length();
        String str = this.text;
        if (length < 65535) {
            sb.append(str);
        } else {
            sb.append(str.substring(0, j6f.COLOR_SPACE_UNCALIBRATED));
        }
        return sb.toString();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean isEOF() {
        int i = this.f3872bp;
        int i2 = this.len;
        return i == i2 || (this.f3873ch == 26 && i + 1 >= i2);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean matchField2(char[] cArr) {
        while (JSONLexerBase.isWhitespace(this.f3873ch)) {
            next();
        }
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return false;
        }
        int length = this.f3872bp + cArr.length;
        int i = length + 1;
        char cCharAt = this.text.charAt(length);
        while (JSONLexerBase.isWhitespace(cCharAt)) {
            cCharAt = this.text.charAt(i);
            i++;
        }
        if (cCharAt != ':') {
            this.matchStat = -2;
            return false;
        }
        this.f3872bp = i;
        this.f3873ch = charAt(i);
        return true;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
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
            piq.m169752a(e.getMessage(), e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final char next() {
        int i = this.f3872bp + 1;
        this.f3872bp = i;
        char cCharAt = i >= this.len ? JSONLexer.EOI : this.text.charAt(i);
        this.f3873ch = cCharAt;
        return cCharAt;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final String numberString() {
        char cCharAt = charAt((this.f3874np + this.f3875sp) - 1);
        int i = this.f3875sp;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i--;
        }
        return subString(this.f3874np, i);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0130  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:73:0x0156  */
    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0164  */
    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public Date scanDate(char c) {
        Date date;
        char cCharAt;
        long j;
        Date date2;
        char cCharAt2;
        int i;
        char cCharAt3;
        boolean z = false;
        this.matchStat = 0;
        int i2 = this.f3872bp;
        char c2 = this.f3873ch;
        int i3 = i2 + 1;
        char cCharAt4 = charAt(i2);
        Date date3 = null;
        if (cCharAt4 != '\"') {
            char c3 = '9';
            char c4 = '0';
            if (cCharAt4 != '-' && (cCharAt4 < '0' || cCharAt4 > '9')) {
                if (cCharAt4 == 'n') {
                    int i4 = i2 + 2;
                    if (charAt(i3) == 'u') {
                        int i5 = i2 + 3;
                        if (charAt(i4) == 'l') {
                            int i6 = i2 + 4;
                            if (charAt(i5) == 'l') {
                                cCharAt = charAt(i6);
                                this.f3872bp = i6;
                                date2 = null;
                                date = null;
                            }
                        }
                    }
                }
                this.f3872bp = i2;
                this.f3873ch = c2;
                this.matchStat = -1;
                return null;
            }
            if (cCharAt4 == '-') {
                cCharAt4 = charAt(i3);
                i3 = i2 + 2;
                z = true;
            }
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                date = null;
                cCharAt = cCharAt4;
                j = 0;
            } else {
                j = cCharAt4 - '0';
                while (true) {
                    int i7 = i3 + 1;
                    date = date3;
                    cCharAt2 = charAt(i3);
                    if (cCharAt2 < c4 || cCharAt2 > c3) {
                        break;
                    }
                    j = (j * 10) + ((long) (cCharAt2 - '0'));
                    i3 = i7;
                    date3 = date;
                    c3 = '9';
                    c4 = '0';
                }
                if (cCharAt2 == ',' || cCharAt2 == ']') {
                    this.f3872bp = i3;
                }
                cCharAt = cCharAt2;
            }
            if (j < 0) {
                this.f3872bp = i2;
                this.f3873ch = c2;
                this.matchStat = -1;
                return date;
            }
            if (z) {
                j = -j;
            }
            date2 = new Date(j);
            i = this.f3872bp;
            if (cCharAt == ',') {
                int i8 = i + 1;
                this.f3872bp = i8;
                this.f3873ch = charAt(i8);
                this.matchStat = 3;
                return date2;
            }
            int i9 = i + 1;
            this.f3872bp = i9;
            cCharAt3 = charAt(i9);
            if (cCharAt3 == ',') {
                this.token = 16;
                int i10 = this.f3872bp + 1;
                this.f3872bp = i10;
                this.f3873ch = charAt(i10);
            } else if (cCharAt3 == ']') {
                this.token = 15;
                int i11 = this.f3872bp + 1;
                this.f3872bp = i11;
                this.f3873ch = charAt(i11);
            } else if (cCharAt3 == '}') {
                this.token = 13;
                int i12 = this.f3872bp + 1;
                this.f3872bp = i12;
                this.f3873ch = charAt(i12);
            } else {
                if (cCharAt3 == 26) {
                    this.f3872bp = i2;
                    this.f3873ch = c2;
                    this.matchStat = -1;
                    return date;
                }
                this.f3873ch = JSONLexer.EOI;
                this.token = 20;
            }
            this.matchStat = 4;
            return date2;
        }
        int iIndexOf = indexOf('\"', i3);
        if (iIndexOf == -1) {
            riq.m179531a("unclosed str");
            return null;
        }
        this.f3872bp = i3;
        if (!scanISO8601DateIfMatch(false, iIndexOf - i3)) {
            this.f3872bp = i2;
            this.f3873ch = c2;
            this.matchStat = -1;
            return null;
        }
        date2 = this.calendar.getTime();
        cCharAt = charAt(iIndexOf + 1);
        this.f3872bp = i2;
        while (cCharAt != ',' && cCharAt != ']') {
            if (!JSONLexerBase.isWhitespace(cCharAt)) {
                this.f3872bp = i2;
                this.f3873ch = c2;
                this.matchStat = -1;
                return null;
            }
            int i13 = iIndexOf + 1;
            char cCharAt5 = charAt(iIndexOf + 2);
            iIndexOf = i13;
            cCharAt = cCharAt5;
        }
        this.f3872bp = iIndexOf + 1;
        this.f3873ch = cCharAt;
        date = null;
        i = this.f3872bp;
        if (cCharAt == ',') {
            int i14 = i + 1;
            this.f3872bp = i14;
            this.f3873ch = charAt(i14);
            this.matchStat = 3;
            return date2;
        }
        int i15 = i + 1;
        this.f3872bp = i15;
        cCharAt3 = charAt(i15);
        if (cCharAt3 == ',') {
            this.token = 16;
            int i16 = this.f3872bp + 1;
            this.f3872bp = i16;
            this.f3873ch = charAt(i16);
        } else if (cCharAt3 == ']') {
            this.token = 15;
            int i17 = this.f3872bp + 1;
            this.f3872bp = i17;
            this.f3873ch = charAt(i17);
        } else if (cCharAt3 == '}') {
            this.token = 13;
            int i18 = this.f3872bp + 1;
            this.f3872bp = i18;
            this.f3873ch = charAt(i18);
        } else {
            if (cCharAt3 == 26) {
                this.f3872bp = i2;
                this.f3873ch = c2;
                this.matchStat = -1;
                return date;
            }
            this.f3873ch = JSONLexer.EOI;
            this.token = 20;
        }
        this.matchStat = 4;
        return date2;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public double scanDouble(char c) {
        int i;
        char cCharAt;
        boolean z;
        long j;
        long j2;
        int i2;
        int i3;
        int i4;
        double d;
        int i5;
        char cCharAt2;
        this.matchStat = 0;
        int i6 = this.f3872bp;
        int i7 = i6 + 1;
        char cCharAt3 = charAt(i6);
        boolean z2 = cCharAt3 == '\"';
        if (z2) {
            cCharAt3 = charAt(i7);
            i7 = i6 + 2;
        }
        boolean z3 = cCharAt3 == '-';
        if (z3) {
            cCharAt3 = charAt(i7);
            i7++;
        }
        if (cCharAt3 < '0' || cCharAt3 > '9') {
            boolean z4 = z2;
            if (cCharAt3 == 'n') {
                int i8 = i7 + 1;
                if (charAt(i7) == 'u') {
                    int i9 = i7 + 2;
                    if (charAt(i8) == 'l') {
                        int i10 = i7 + 3;
                        if (charAt(i9) == 'l') {
                            this.matchStat = 5;
                            int i11 = i7 + 4;
                            char cCharAt4 = charAt(i10);
                            if (z4 && cCharAt4 == '\"') {
                                cCharAt4 = charAt(i11);
                                i11 = i7 + 5;
                            }
                            while (cCharAt4 != ',') {
                                if (cCharAt4 == ']') {
                                    this.f3872bp = i11;
                                    this.f3873ch = charAt(i11);
                                    this.matchStat = 5;
                                    this.token = 15;
                                    return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                                }
                                if (!JSONLexerBase.isWhitespace(cCharAt4)) {
                                    this.matchStat = -1;
                                    return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                                }
                                int i12 = i11 + 1;
                                char cCharAt5 = charAt(i11);
                                i11 = i12;
                                cCharAt4 = cCharAt5;
                            }
                            this.f3872bp = i11;
                            this.f3873ch = charAt(i11);
                            this.matchStat = 5;
                            this.token = 16;
                            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                        }
                    }
                }
            }
            this.matchStat = -1;
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        long j3 = cCharAt3 - '0';
        while (true) {
            i = i7 + 1;
            cCharAt = charAt(i7);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j3 = (j3 * 10) + ((long) (cCharAt - '0'));
            i7 = i;
        }
        if (cCharAt == '.') {
            int i13 = i7 + 2;
            char cCharAt6 = charAt(i);
            if (cCharAt6 < '0' || cCharAt6 > '9') {
                this.matchStat = -1;
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            boolean z5 = true;
            long j4 = (j3 * 10) + ((long) (cCharAt6 - '0'));
            long j5 = 10;
            while (true) {
                i5 = i13 + 1;
                cCharAt2 = charAt(i13);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    break;
                }
                j4 = (j4 * 10) + ((long) (cCharAt2 - '0'));
                j5 *= 10;
                i13 = i5;
                z5 = z5;
            }
            long j6 = j5;
            i = i5;
            cCharAt = cCharAt2;
            z = z5;
            j = j4;
            j2 = j6;
        } else {
            z = true;
            j = j3;
            j2 = 1;
        }
        boolean z6 = (cCharAt == 'e' || cCharAt == 'E') ? z : false;
        if (z6) {
            int i14 = i + 1;
            char cCharAt7 = charAt(i);
            if (cCharAt7 == '+' || cCharAt7 == '-') {
                i += 2;
                cCharAt = charAt(i14);
            } else {
                i = i14;
                cCharAt = cCharAt7;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                char cCharAt8 = charAt(i);
                i++;
                cCharAt = cCharAt8;
            }
        }
        if (!z2) {
            i2 = this.f3872bp;
            int i15 = i;
            i3 = (i - i2) - 1;
            i4 = i15;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            int i16 = i + 1;
            char cCharAt9 = charAt(i);
            i2 = this.f3872bp + 1;
            i3 = (i16 - i2) - 2;
            i4 = i16;
            cCharAt = cCharAt9;
        }
        if (z6 || i3 >= 18) {
            d = Double.parseDouble(subString(i2, i3));
        } else {
            d = j / j2;
            if (z3) {
                d = -d;
            }
        }
        if (cCharAt != c) {
            this.matchStat = -1;
            return d;
        }
        this.f3872bp = i4;
        this.f3873ch = charAt(i4);
        this.matchStat = 3;
        this.token = 16;
        return d;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0165  */
    /* JADX WARN: Code duplicated, block: B:104:0x016b A[LOOP:0: B:78:0x00ed->B:104:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:90:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0147  */
    /* JADX WARN: Code duplicated, block: B:97:0x0152  */
    /* JADX WARN: Code duplicated, block: B:99:0x0158 A[LOOP:1: B:85:0x0111->B:99:0x0158, LOOP_END] */
    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean scanFieldBoolean(char[] cArr) {
        char cCharAt;
        boolean z;
        char cCharAt2;
        this.matchStat = 0;
        if (!charArrayCompare(this.text, this.f3872bp, cArr)) {
            this.matchStat = -2;
            return false;
        }
        int i = this.f3872bp;
        int length = cArr.length + i;
        int i2 = length + 1;
        char cCharAt3 = charAt(length);
        boolean z2 = cCharAt3 == '\"';
        if (z2) {
            cCharAt3 = charAt(i2);
            i2 = length + 2;
        }
        if (cCharAt3 != 't') {
            if (cCharAt3 == 'f') {
                int i3 = i2 + 1;
                if (charAt(i2) != 'a') {
                    this.matchStat = -1;
                    return false;
                }
                int i4 = i2 + 2;
                if (charAt(i3) != 'l') {
                    this.matchStat = -1;
                    return false;
                }
                int i5 = i2 + 3;
                if (charAt(i4) != 's') {
                    this.matchStat = -1;
                    return false;
                }
                int i6 = i2 + 4;
                if (charAt(i5) != 'e') {
                    this.matchStat = -1;
                    return false;
                }
                if (z2) {
                    int i7 = i2 + 5;
                    if (charAt(i6) != '\"') {
                        this.matchStat = -1;
                        return false;
                    }
                    i6 = i7;
                }
                this.f3872bp = i6;
                cCharAt = charAt(i6);
            } else if (cCharAt3 == '1') {
                if (z2) {
                    int i8 = i2 + 1;
                    if (charAt(i2) != '\"') {
                        this.matchStat = -1;
                        return false;
                    }
                    i2 = i8;
                }
                this.f3872bp = i2;
                cCharAt = charAt(i2);
            } else {
                if (cCharAt3 != '0') {
                    this.matchStat = -1;
                    return false;
                }
                if (z2) {
                    int i9 = i2 + 1;
                    if (charAt(i2) != '\"') {
                        this.matchStat = -1;
                        return false;
                    }
                    i2 = i9;
                }
                this.f3872bp = i2;
                cCharAt = charAt(i2);
            }
            z = false;
            while (cCharAt != ',') {
                if (cCharAt == '}') {
                    int i10 = this.f3872bp + 1;
                    this.f3872bp = i10;
                    cCharAt2 = charAt(i10);
                    while (cCharAt2 != ',') {
                        if (cCharAt2 == ']') {
                            this.token = 15;
                            int i11 = this.f3872bp + 1;
                            this.f3872bp = i11;
                            this.f3873ch = charAt(i11);
                        } else if (cCharAt2 == '}') {
                            this.token = 13;
                            int i12 = this.f3872bp + 1;
                            this.f3872bp = i12;
                            this.f3873ch = charAt(i12);
                        } else if (cCharAt2 == 26) {
                            this.token = 20;
                        } else {
                            if (JSONLexerBase.isWhitespace(cCharAt2)) {
                                this.matchStat = -1;
                                return false;
                            }
                            int i13 = this.f3872bp + 1;
                            this.f3872bp = i13;
                            cCharAt2 = charAt(i13);
                        }
                        this.matchStat = 4;
                        return z;
                    }
                    this.token = 16;
                    int i14 = this.f3872bp + 1;
                    this.f3872bp = i14;
                    this.f3873ch = charAt(i14);
                    this.matchStat = 4;
                    return z;
                }
                if (JSONLexerBase.isWhitespace(cCharAt)) {
                    this.f3872bp = i;
                    charAt(i);
                    this.matchStat = -1;
                    return false;
                }
                int i15 = this.f3872bp + 1;
                this.f3872bp = i15;
                cCharAt = charAt(i15);
            }
            int i16 = this.f3872bp + 1;
            this.f3872bp = i16;
            this.f3873ch = charAt(i16);
            this.matchStat = 3;
            this.token = 16;
            return z;
        }
        int i17 = i2 + 1;
        if (charAt(i2) != 'r') {
            this.matchStat = -1;
            return false;
        }
        int i18 = i2 + 2;
        if (charAt(i17) != 'u') {
            this.matchStat = -1;
            return false;
        }
        int i19 = i2 + 3;
        if (charAt(i18) != 'e') {
            this.matchStat = -1;
            return false;
        }
        if (z2) {
            int i20 = i2 + 4;
            if (charAt(i19) != '\"') {
                this.matchStat = -1;
                return false;
            }
            i19 = i20;
        }
        this.f3872bp = i19;
        cCharAt = charAt(i19);
        z = true;
        while (cCharAt != ',') {
            if (cCharAt == '}') {
                int i110 = this.f3872bp + 1;
                this.f3872bp = i110;
                cCharAt2 = charAt(i110);
                while (cCharAt2 != ',') {
                    if (cCharAt2 == ']') {
                        this.token = 15;
                        int i111 = this.f3872bp + 1;
                        this.f3872bp = i111;
                        this.f3873ch = charAt(i111);
                    } else if (cCharAt2 == '}') {
                        this.token = 13;
                        int i112 = this.f3872bp + 1;
                        this.f3872bp = i112;
                        this.f3873ch = charAt(i112);
                    } else if (cCharAt2 == 26) {
                        this.token = 20;
                    } else {
                        if (JSONLexerBase.isWhitespace(cCharAt2)) {
                            this.matchStat = -1;
                            return false;
                        }
                        int i113 = this.f3872bp + 1;
                        this.f3872bp = i113;
                        cCharAt2 = charAt(i113);
                    }
                    this.matchStat = 4;
                    return z;
                }
                this.token = 16;
                int i114 = this.f3872bp + 1;
                this.f3872bp = i114;
                this.f3873ch = charAt(i114);
                this.matchStat = 4;
                return z;
            }
            if (JSONLexerBase.isWhitespace(cCharAt)) {
                this.f3872bp = i;
                charAt(i);
                this.matchStat = -1;
                return false;
            }
            int i115 = this.f3872bp + 1;
            this.f3872bp = i115;
            cCharAt = charAt(i115);
        }
        int i116 = this.f3872bp + 1;
        this.f3872bp = i116;
        this.f3873ch = charAt(i116);
        this.matchStat = 3;
        this.token = 16;
        return z;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public Date scanFieldDate(char[] cArr) {
        Date date;
        char cCharAt;
        long j;
        Date date2;
        char cCharAt2;
        boolean z = false;
        this.matchStat = 0;
        int i = this.f3872bp;
        char c = this.f3873ch;
        Date date3 = null;
        if (!charArrayCompare(this.text, i, cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = this.f3872bp + cArr.length;
        int i2 = length + 1;
        char cCharAt3 = charAt(length);
        boolean z2 = true;
        if (cCharAt3 == '\"') {
            int iIndexOf = indexOf('\"', i2);
            if (iIndexOf == -1) {
                riq.m179531a("unclosed str");
                return null;
            }
            this.f3872bp = i2;
            if (!scanISO8601DateIfMatch(false, iIndexOf - i2)) {
                this.f3872bp = i;
                this.matchStat = -1;
                return null;
            }
            date2 = this.calendar.getTime();
            cCharAt2 = charAt(iIndexOf + 1);
            this.f3872bp = i;
            while (cCharAt2 != ',' && cCharAt2 != '}') {
                if (!JSONLexerBase.isWhitespace(cCharAt2)) {
                    this.matchStat = -1;
                    return null;
                }
                int i3 = iIndexOf + 1;
                char cCharAt4 = charAt(iIndexOf + 2);
                iIndexOf = i3;
                cCharAt2 = cCharAt4;
            }
            this.f3872bp = iIndexOf + 1;
            this.f3873ch = cCharAt2;
            date = null;
        } else {
            char c2 = '9';
            if (cCharAt3 != '-' && (cCharAt3 < '0' || cCharAt3 > '9')) {
                this.matchStat = -1;
                return null;
            }
            if (cCharAt3 == '-') {
                cCharAt3 = charAt(i2);
                i2 = length + 2;
                z = true;
            }
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                date = null;
                cCharAt = cCharAt3;
                j = 0;
            } else {
                j = cCharAt3 - '0';
                while (true) {
                    int i4 = i2 + 1;
                    date = date3;
                    cCharAt = charAt(i2);
                    if (cCharAt < '0' || cCharAt > c2) {
                        break;
                    }
                    j = (j * 10) + ((long) (cCharAt - '0'));
                    z2 = z2;
                    i2 = i4;
                    date3 = date;
                    c2 = '9';
                }
                if (cCharAt == ',' || cCharAt == '}') {
                    this.f3872bp = i2;
                }
            }
            if (j < 0) {
                this.matchStat = -1;
                return date;
            }
            if (z) {
                j = -j;
            }
            date2 = new Date(j);
            cCharAt2 = cCharAt;
        }
        int i5 = this.f3872bp;
        if (cCharAt2 == ',') {
            int i6 = i5 + 1;
            this.f3872bp = i6;
            this.f3873ch = charAt(i6);
            this.matchStat = 3;
            this.token = 16;
            return date2;
        }
        int i7 = i5 + 1;
        this.f3872bp = i7;
        char cCharAt5 = charAt(i7);
        if (cCharAt5 == ',') {
            this.token = 16;
            int i8 = this.f3872bp + 1;
            this.f3872bp = i8;
            this.f3873ch = charAt(i8);
        } else if (cCharAt5 == ']') {
            this.token = 15;
            int i9 = this.f3872bp + 1;
            this.f3872bp = i9;
            this.f3873ch = charAt(i9);
        } else if (cCharAt5 == '}') {
            this.token = 13;
            int i10 = this.f3872bp + 1;
            this.f3872bp = i10;
            this.f3873ch = charAt(i10);
        } else {
            if (cCharAt5 != 26) {
                this.f3872bp = i;
                this.f3873ch = c;
                this.matchStat = -1;
                return date;
            }
            this.token = 20;
        }
        this.matchStat = 4;
        return date2;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public int scanFieldInt(char[] cArr) {
        int i;
        char cCharAt;
        this.matchStat = 0;
        int i2 = this.f3872bp;
        char c = this.f3873ch;
        if (!charArrayCompare(this.text, i2, cArr)) {
            this.matchStat = -2;
            return 0;
        }
        int length = this.f3872bp + cArr.length;
        int i3 = length + 1;
        char cCharAt2 = charAt(length);
        boolean z = cCharAt2 == '\"';
        if (z) {
            cCharAt2 = charAt(i3);
            i3 = length + 2;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            cCharAt2 = charAt(i3);
            i3++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.matchStat = -1;
            return 0;
        }
        int i4 = cCharAt2 - '0';
        while (true) {
            i = i3 + 1;
            cCharAt = charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            int i5 = i4 * 10;
            if (i5 < i4) {
                this.matchStat = -1;
                return 0;
            }
            i4 = i5 + (cCharAt - '0');
            i3 = i;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0;
        }
        if (i4 < 0) {
            this.matchStat = -1;
            return 0;
        }
        if (z) {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0;
            }
            int i6 = i3 + 2;
            cCharAt = charAt(i);
            i = i6;
        }
        while (cCharAt != ',' && cCharAt != '}') {
            if (!JSONLexerBase.isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return 0;
            }
            int i7 = i + 1;
            cCharAt = charAt(i);
            i = i7;
        }
        this.f3872bp = i - 1;
        if (cCharAt == ',') {
            this.f3872bp = i;
            this.f3873ch = charAt(i);
            this.matchStat = 3;
            this.token = 16;
            if (z2) {
                return -i4;
            }
        } else {
            if (cCharAt == '}') {
                this.f3872bp = i;
                char cCharAt3 = charAt(i);
                while (true) {
                    if (cCharAt3 == ',') {
                        this.token = 16;
                        int i8 = this.f3872bp + 1;
                        this.f3872bp = i8;
                        this.f3873ch = charAt(i8);
                        break;
                    }
                    if (cCharAt3 == ']') {
                        this.token = 15;
                        int i9 = this.f3872bp + 1;
                        this.f3872bp = i9;
                        this.f3873ch = charAt(i9);
                        break;
                    }
                    if (cCharAt3 == '}') {
                        this.token = 13;
                        int i10 = this.f3872bp + 1;
                        this.f3872bp = i10;
                        this.f3873ch = charAt(i10);
                        break;
                    }
                    if (cCharAt3 == 26) {
                        this.token = 20;
                        break;
                    }
                    if (!JSONLexerBase.isWhitespace(cCharAt3)) {
                        this.f3872bp = i2;
                        this.f3873ch = c;
                        this.matchStat = -1;
                        return 0;
                    }
                    int i11 = this.f3872bp + 1;
                    this.f3872bp = i11;
                    cCharAt3 = charAt(i11);
                }
                this.matchStat = 4;
            }
            if (z2) {
                return -i4;
            }
        }
        return i4;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public long scanFieldLong(char[] cArr) {
        int i;
        long j;
        char cCharAt;
        boolean z = false;
        this.matchStat = 0;
        int i2 = this.f3872bp;
        char c = this.f3873ch;
        long j2 = 0;
        if (!charArrayCompare(this.text, i2, cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = this.f3872bp + cArr.length;
        int i3 = length + 1;
        char cCharAt2 = charAt(length);
        boolean z2 = cCharAt2 == '\"';
        if (z2) {
            cCharAt2 = charAt(i3);
            i3 = length + 2;
        }
        if (cCharAt2 == '-') {
            cCharAt2 = charAt(i3);
            i3++;
            z = true;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.f3872bp = i2;
            this.f3873ch = c;
            this.matchStat = -1;
            return 0L;
        }
        long j3 = cCharAt2 - '0';
        while (true) {
            i = i3 + 1;
            j = j2;
            cCharAt = charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j3 = (j3 * 10) + ((long) (cCharAt - '0'));
            i3 = i;
            j2 = j;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return j;
        }
        if (z2) {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return j;
            }
            cCharAt = charAt(i);
            i = i3 + 2;
        }
        if (cCharAt == ',' || cCharAt == '}') {
            this.f3872bp = i - 1;
        }
        if (j3 < j && (j3 != Long.MIN_VALUE || !z)) {
            this.f3872bp = i2;
            this.f3873ch = c;
            this.matchStat = -1;
            return j;
        }
        while (cCharAt != ',') {
            if (cCharAt == '}') {
                int i4 = this.f3872bp + 1;
                this.f3872bp = i4;
                char cCharAt3 = charAt(i4);
                while (true) {
                    if (cCharAt3 == ',') {
                        this.token = 16;
                        int i5 = this.f3872bp + 1;
                        this.f3872bp = i5;
                        this.f3873ch = charAt(i5);
                        break;
                    }
                    if (cCharAt3 == ']') {
                        this.token = 15;
                        int i6 = this.f3872bp + 1;
                        this.f3872bp = i6;
                        this.f3873ch = charAt(i6);
                        break;
                    }
                    if (cCharAt3 == '}') {
                        this.token = 13;
                        int i7 = this.f3872bp + 1;
                        this.f3872bp = i7;
                        this.f3873ch = charAt(i7);
                        break;
                    }
                    if (cCharAt3 == 26) {
                        this.token = 20;
                        break;
                    }
                    if (!JSONLexerBase.isWhitespace(cCharAt3)) {
                        this.f3872bp = i2;
                        this.f3873ch = c;
                        this.matchStat = -1;
                        return j;
                    }
                    int i8 = this.f3872bp + 1;
                    this.f3872bp = i8;
                    cCharAt3 = charAt(i8);
                }
                this.matchStat = 4;
                if (z) {
                    return -j3;
                }
                return j3;
            }
            if (!JSONLexerBase.isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return j;
            }
            this.f3872bp = i;
            char cCharAt4 = charAt(i);
            i++;
            cCharAt = cCharAt4;
        }
        int i9 = this.f3872bp + 1;
        this.f3872bp = i9;
        this.f3873ch = charAt(i9);
        this.matchStat = 3;
        this.token = 16;
        if (z) {
            return -j3;
        }
        return j3;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public String scanFieldString(char[] cArr) {
        this.matchStat = 0;
        int i = this.f3872bp;
        char c = this.f3873ch;
        while (!charArrayCompare(this.text, this.f3872bp, cArr)) {
            if (!JSONLexerBase.isWhitespace(this.f3873ch)) {
                this.matchStat = -2;
                return stringDefaultValue();
            }
            next();
        }
        int length = this.f3872bp + cArr.length;
        int i2 = length + 1;
        if (charAt(length) != '\"') {
            this.matchStat = -1;
            return stringDefaultValue();
        }
        int iIndexOf = indexOf('\"', i2);
        if (iIndexOf == -1) {
            riq.m179531a("unclosed str");
            return null;
        }
        String strSubString = subString(i2, iIndexOf - i2);
        if (strSubString.indexOf(92) != -1) {
            while (true) {
                int i3 = 0;
                for (int i4 = iIndexOf - 1; i4 >= 0 && charAt(i4) == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                iIndexOf = indexOf('\"', iIndexOf + 1);
            }
            int i5 = this.f3872bp;
            int length2 = iIndexOf - ((cArr.length + i5) + 1);
            strSubString = JSONLexerBase.readString(sub_chars(i5 + cArr.length + 1, length2), length2);
        }
        char cCharAt = charAt(iIndexOf + 1);
        while (cCharAt != ',' && cCharAt != '}') {
            if (!JSONLexerBase.isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return stringDefaultValue();
            }
            char cCharAt2 = charAt(iIndexOf + 2);
            iIndexOf++;
            cCharAt = cCharAt2;
        }
        this.f3872bp = iIndexOf + 1;
        this.f3873ch = cCharAt;
        if (cCharAt == ',') {
            int i6 = iIndexOf + 2;
            this.f3872bp = i6;
            this.f3873ch = charAt(i6);
            this.matchStat = 3;
            return strSubString;
        }
        int i7 = iIndexOf + 2;
        this.f3872bp = i7;
        char cCharAt3 = charAt(i7);
        if (cCharAt3 == ',') {
            this.token = 16;
            int i8 = this.f3872bp + 1;
            this.f3872bp = i8;
            this.f3873ch = charAt(i8);
        } else if (cCharAt3 == ']') {
            this.token = 15;
            int i9 = this.f3872bp + 1;
            this.f3872bp = i9;
            this.f3873ch = charAt(i9);
        } else if (cCharAt3 == '}') {
            this.token = 13;
            int i10 = this.f3872bp + 1;
            this.f3872bp = i10;
            this.f3873ch = charAt(i10);
        } else {
            if (cCharAt3 != 26) {
                this.f3872bp = i;
                this.f3873ch = c;
                this.matchStat = -1;
                return stringDefaultValue();
            }
            this.token = 20;
        }
        this.matchStat = 4;
        return strSubString;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public Collection<String> scanFieldStringArray(char[] cArr, Class<?> cls) {
        boolean z;
        int i;
        char cCharAt;
        int i2;
        char cCharAt2;
        this.matchStat = 0;
        while (true) {
            char c = this.f3873ch;
            if (c != '\n' && c != ' ') {
                break;
            }
            int i3 = this.f3872bp + 1;
            this.f3872bp = i3;
            this.f3873ch = i3 >= this.len ? (char) 26 : this.text.charAt(i3);
        }
        if (!charArrayCompare(this.text, this.f3872bp, cArr)) {
            this.matchStat = -2;
            return null;
        }
        Collection<String> collectionNewCollectionByType = newCollectionByType(cls);
        int i4 = this.f3872bp;
        char c2 = this.f3873ch;
        int length = cArr.length + i4;
        int i5 = length + 1;
        if (charAt(length) == '[') {
            int i6 = length + 2;
            char cCharAt3 = charAt(i5);
            while (true) {
                if (cCharAt3 == '\"') {
                    int iIndexOf = indexOf('\"', i6);
                    if (iIndexOf == -1) {
                        riq.m179531a("unclosed str");
                        return null;
                    }
                    String strSubString = subString(i6, iIndexOf - i6);
                    z = true;
                    if (strSubString.indexOf(92) != -1) {
                        while (true) {
                            int i7 = 0;
                            for (int i8 = iIndexOf - 1; i8 >= 0 && charAt(i8) == '\\'; i8--) {
                                i7++;
                            }
                            if (i7 % 2 == 0) {
                                break;
                            }
                            iIndexOf = indexOf('\"', iIndexOf + 1);
                        }
                        int i9 = iIndexOf - i6;
                        strSubString = JSONLexerBase.readString(sub_chars(i6, i9), i9);
                    }
                    int i10 = iIndexOf + 1;
                    i2 = iIndexOf + 2;
                    cCharAt2 = charAt(i10);
                    collectionNewCollectionByType.add(strSubString);
                } else {
                    z = true;
                    if (cCharAt3 != 'n' || !this.text.startsWith("ull", i6)) {
                        if (cCharAt3 != ']' || collectionNewCollectionByType.size() != 0) {
                            this.matchStat = -1;
                            return null;
                        }
                        cCharAt = charAt(i6);
                        i = i6 + 1;
                        break;
                    }
                    i2 = i6 + 4;
                    cCharAt2 = charAt(i6 + 3);
                    collectionNewCollectionByType.add(null);
                }
                if (cCharAt2 != ',') {
                    if (cCharAt2 != ']') {
                        this.matchStat = -1;
                        return null;
                    }
                    i = i2 + 1;
                    cCharAt = charAt(i2);
                    while (JSONLexerBase.isWhitespace(cCharAt)) {
                        cCharAt = charAt(i);
                        i++;
                    }
                    break;
                }
                i6 = i2 + 1;
                cCharAt3 = charAt(i2);
            }
        } else {
            z = true;
            if (!this.text.startsWith("ull", i5)) {
                this.matchStat = -1;
                return null;
            }
            int i11 = length + 4;
            i = length + 5;
            cCharAt = charAt(i11);
            collectionNewCollectionByType = null;
        }
        this.f3872bp = i;
        if (cCharAt == ',') {
            this.f3873ch = charAt(i);
            this.matchStat = 3;
            return collectionNewCollectionByType;
        }
        if (cCharAt != '}') {
            this.f3873ch = c2;
            this.f3872bp = i4;
            this.matchStat = -1;
            return null;
        }
        char cCharAt4 = charAt(i);
        while (cCharAt4 != ',') {
            if (cCharAt4 == ']') {
                this.token = 15;
                int i12 = this.f3872bp + 1;
                this.f3872bp = i12;
                this.f3873ch = charAt(i12);
            } else if (cCharAt4 == '}') {
                this.token = 13;
                int i13 = this.f3872bp + 1;
                this.f3872bp = i13;
                this.f3873ch = charAt(i13);
            } else if (cCharAt4 == 26) {
                this.token = 20;
                this.f3873ch = cCharAt4;
            } else {
                boolean z2 = false;
                while (JSONLexerBase.isWhitespace(cCharAt4)) {
                    int i14 = i + 1;
                    char cCharAt5 = charAt(i);
                    this.f3872bp = i14;
                    cCharAt4 = cCharAt5;
                    i = i14;
                    z2 = z;
                }
                if (!z2) {
                    this.matchStat = -1;
                    return null;
                }
            }
            this.matchStat = 4;
            return collectionNewCollectionByType;
        }
        this.token = 16;
        int i15 = this.f3872bp + 1;
        this.f3872bp = i15;
        this.f3873ch = charAt(i15);
        this.matchStat = 4;
        return collectionNewCollectionByType;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public long scanFieldSymbol(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(this.text, this.f3872bp, cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = this.f3872bp + cArr.length;
        int i = length + 1;
        if (charAt(length) != '\"') {
            this.matchStat = -1;
            return 0L;
        }
        long j = -3750763034362895579L;
        while (true) {
            int i2 = i + 1;
            char cCharAt = charAt(i);
            if (cCharAt == '\"') {
                this.f3872bp = i2;
                char cCharAt2 = charAt(i2);
                this.f3873ch = cCharAt2;
                while (cCharAt2 != ',') {
                    if (cCharAt2 == '}') {
                        next();
                        skipWhitespace();
                        char current = getCurrent();
                        if (current == ',') {
                            this.token = 16;
                            int i3 = this.f3872bp + 1;
                            this.f3872bp = i3;
                            this.f3873ch = charAt(i3);
                        } else if (current == ']') {
                            this.token = 15;
                            int i4 = this.f3872bp + 1;
                            this.f3872bp = i4;
                            this.f3873ch = charAt(i4);
                        } else if (current == '}') {
                            this.token = 13;
                            int i5 = this.f3872bp + 1;
                            this.f3872bp = i5;
                            this.f3873ch = charAt(i5);
                        } else {
                            if (current != 26) {
                                this.matchStat = -1;
                                return 0L;
                            }
                            this.token = 20;
                        }
                        this.matchStat = 4;
                        return j;
                    }
                    if (!JSONLexerBase.isWhitespace(cCharAt2)) {
                        this.matchStat = -1;
                        return 0L;
                    }
                    int i6 = this.f3872bp + 1;
                    this.f3872bp = i6;
                    cCharAt2 = charAt(i6);
                }
                int i7 = this.f3872bp + 1;
                this.f3872bp = i7;
                this.f3873ch = charAt(i7);
                this.matchStat = 3;
                return j;
            }
            if (i2 > this.len) {
                this.matchStat = -1;
                return 0L;
            }
            j = (j ^ ((long) cCharAt)) * 1099511628211L;
            i = i2;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final int scanInt(char c) {
        int i;
        char cCharAt;
        this.matchStat = 0;
        int i2 = this.f3872bp;
        int i3 = i2 + 1;
        char cCharAt2 = charAt(i2);
        while (JSONLexerBase.isWhitespace(cCharAt2)) {
            cCharAt2 = charAt(i3);
            i3++;
        }
        boolean z = cCharAt2 == '\"';
        if (z) {
            cCharAt2 = charAt(i3);
            i3++;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            cCharAt2 = charAt(i3);
            i3++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            if (cCharAt2 == 'n') {
                int i4 = i3 + 1;
                if (charAt(i3) == 'u') {
                    int i5 = i3 + 2;
                    if (charAt(i4) == 'l') {
                        int i6 = i3 + 3;
                        if (charAt(i5) == 'l') {
                            this.matchStat = 5;
                            int i7 = i3 + 4;
                            char cCharAt3 = charAt(i6);
                            if (z && cCharAt3 == '\"') {
                                cCharAt3 = charAt(i7);
                                i7 = i3 + 5;
                            }
                            while (cCharAt3 != ',') {
                                if (cCharAt3 == ']') {
                                    this.f3872bp = i7;
                                    this.f3873ch = charAt(i7);
                                    this.matchStat = 5;
                                    this.token = 15;
                                    return 0;
                                }
                                if (!JSONLexerBase.isWhitespace(cCharAt3)) {
                                    this.matchStat = -1;
                                    return 0;
                                }
                                char cCharAt4 = charAt(i7);
                                i7++;
                                cCharAt3 = cCharAt4;
                            }
                            this.f3872bp = i7;
                            this.f3873ch = charAt(i7);
                            this.matchStat = 5;
                            this.token = 16;
                            return 0;
                        }
                    }
                }
            }
            this.matchStat = -1;
            return 0;
        }
        int i8 = cCharAt2 - '0';
        while (true) {
            i = i3 + 1;
            cCharAt = charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            int i9 = i8 * 10;
            if (i9 < i8) {
                xiq.m209674a("parseInt error : ", subString(i2, i3));
                return 0;
            }
            i8 = i9 + (cCharAt - '0');
            i3 = i;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0;
        }
        if (z) {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0;
            }
            cCharAt = charAt(i);
            i = i3 + 2;
        }
        if (i8 < 0) {
            this.matchStat = -1;
            return 0;
        }
        while (cCharAt != c) {
            if (!JSONLexerBase.isWhitespace(cCharAt)) {
                this.matchStat = -1;
                if (z2) {
                    return -i8;
                }
                return i8;
            }
            cCharAt = charAt(i);
            i++;
        }
        this.f3872bp = i;
        this.f3873ch = charAt(i);
        this.matchStat = 3;
        this.token = 16;
        if (z2) {
            return -i8;
        }
        return i8;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public long scanLong(char c) {
        int i;
        char cCharAt;
        this.matchStat = 0;
        int i2 = this.f3872bp;
        int i3 = i2 + 1;
        char cCharAt2 = charAt(i2);
        boolean z = cCharAt2 == '\"';
        if (z) {
            cCharAt2 = charAt(i3);
            i3 = i2 + 2;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            cCharAt2 = charAt(i3);
            i3++;
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            long j = cCharAt2 - '0';
            while (true) {
                i = i3 + 1;
                cCharAt = charAt(i3);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j = (j * 10) + ((long) (cCharAt - '0'));
                i3 = i;
            }
            if (cCharAt == '.') {
                this.matchStat = -1;
                return 0L;
            }
            if (z) {
                if (cCharAt != '\"') {
                    this.matchStat = -1;
                    return 0L;
                }
                cCharAt = charAt(i);
                i = i3 + 2;
            }
            if (j < 0 && (j != Long.MIN_VALUE || !z2)) {
                this.matchStat = -1;
                return 0L;
            }
            while (cCharAt != c) {
                if (!JSONLexerBase.isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    return j;
                }
                cCharAt = charAt(i);
                i++;
            }
            this.f3872bp = i;
            this.f3873ch = charAt(i);
            this.matchStat = 3;
            this.token = 16;
            return z2 ? -j : j;
        }
        if (cCharAt2 == 'n') {
            int i4 = i3 + 1;
            if (charAt(i3) == 'u') {
                int i5 = i3 + 2;
                if (charAt(i4) == 'l') {
                    int i6 = i3 + 3;
                    if (charAt(i5) == 'l') {
                        this.matchStat = 5;
                        int i7 = i3 + 4;
                        char cCharAt3 = charAt(i6);
                        if (z && cCharAt3 == '\"') {
                            cCharAt3 = charAt(i7);
                            i7 = i3 + 5;
                        }
                        while (cCharAt3 != ',') {
                            if (cCharAt3 == ']') {
                                this.f3872bp = i7;
                                this.f3873ch = charAt(i7);
                                this.matchStat = 5;
                                this.token = 15;
                                return 0L;
                            }
                            if (!JSONLexerBase.isWhitespace(cCharAt3)) {
                                this.matchStat = -1;
                                return 0L;
                            }
                            char cCharAt4 = charAt(i7);
                            i7++;
                            cCharAt3 = cCharAt4;
                        }
                        this.f3872bp = i7;
                        this.f3873ch = charAt(i7);
                        this.matchStat = 5;
                        this.token = 16;
                        return 0L;
                    }
                }
            }
        }
        this.matchStat = -1;
        return 0L;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public String scanTypeName(SymbolTable symbolTable) {
        int iIndexOf;
        if (!this.text.startsWith("\"@type\":\"", this.f3872bp) || (iIndexOf = this.text.indexOf(34, this.f3872bp + 9)) == -1) {
            return null;
        }
        int i = this.f3872bp + 9;
        this.f3872bp = i;
        int iCharAt = 0;
        while (i < iIndexOf) {
            iCharAt = (iCharAt * 31) + this.text.charAt(i);
            i++;
        }
        int i2 = this.f3872bp;
        String strAddSymbol = addSymbol(i2, iIndexOf - i2, iCharAt, symbolTable);
        char cCharAt = this.text.charAt(iIndexOf + 1);
        if (cCharAt != ',' && cCharAt != ']') {
            return null;
        }
        int i3 = iIndexOf + 2;
        this.f3872bp = i3;
        this.f3873ch = this.text.charAt(i3);
        return strAddSymbol;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean seekArrayToItem(int i) {
        if (i < 0) {
            k250.m144273a("index must > 0, but ", i);
            return false;
        }
        int i2 = this.token;
        if (i2 == 20) {
            return false;
        }
        if (i2 != 14) {
            bz00.m104536a();
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            skipWhitespace();
            char c = this.f3873ch;
            if (c == '\"' || c == '\'') {
                skipString();
                char c2 = this.f3873ch;
                if (c2 != ',') {
                    if (c2 != ']') {
                        riq.m179531a("illegal json.");
                        return false;
                    }
                    next();
                    nextToken(16);
                    return false;
                }
                next();
            } else {
                if (c == '{') {
                    next();
                    this.token = 12;
                    skipObject(false);
                } else if (c == '[') {
                    next();
                    this.token = 14;
                    skipArray(false);
                } else {
                    int i4 = this.f3872bp + 1;
                    while (true) {
                        if (i4 >= this.text.length()) {
                            riq.m179531a("illegal json.");
                            return false;
                        }
                        char cCharAt = this.text.charAt(i4);
                        if (cCharAt == ',') {
                            int i5 = i4 + 1;
                            this.f3872bp = i5;
                            this.f3873ch = charAt(i5);
                            break;
                        }
                        if (cCharAt == ']') {
                            int i6 = i4 + 1;
                            this.f3872bp = i6;
                            this.f3873ch = charAt(i6);
                            nextToken();
                            return false;
                        }
                        i4++;
                    }
                }
                int i7 = this.token;
                if (i7 != 16) {
                    if (i7 == 15) {
                        return false;
                    }
                    bz00.m104536a();
                    return false;
                }
            }
        }
        nextToken();
        return true;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public int seekObjectToField(long j, boolean z) {
        char c;
        int i = this.token;
        int i2 = -1;
        if (i == 20) {
            return -1;
        }
        if (i != 13) {
            int i3 = 15;
            if (i != 15) {
                int i4 = 16;
                if (i != 12 && i != 16) {
                    qq3.m175877a(JSONToken.name(i));
                    return 0;
                }
                while (true) {
                    char c2 = this.f3873ch;
                    if (c2 == '}') {
                        next();
                        nextToken();
                        return i2;
                    }
                    if (c2 == 26) {
                        return i2;
                    }
                    if (c2 != '\"') {
                        skipWhitespace();
                    }
                    if (this.f3873ch != '\"') {
                        bz00.m104536a();
                        return 0;
                    }
                    int i5 = this.f3872bp + 1;
                    long j2 = -3750763034362895579L;
                    while (i5 < this.text.length()) {
                        char cCharAt = this.text.charAt(i5);
                        if (cCharAt == '\\') {
                            i5++;
                            if (i5 == this.text.length()) {
                                xiq.m209674a("unclosed str, ", info());
                                return 0;
                            }
                            cCharAt = this.text.charAt(i5);
                        }
                        if (cCharAt == '\"') {
                            int i6 = i5 + 1;
                            this.f3872bp = i6;
                            this.f3873ch = i6 >= this.text.length() ? (char) 26 : this.text.charAt(this.f3872bp);
                            break;
                        }
                        j2 = (j2 ^ ((long) cCharAt)) * 1099511628211L;
                        i5++;
                    }
                    char c3 = this.f3873ch;
                    int i7 = i2;
                    if (j2 == j) {
                        if (c3 != ':') {
                            skipWhitespace();
                        }
                        if (this.f3873ch != ':') {
                            return 3;
                        }
                        int i8 = this.f3872bp + 1;
                        this.f3872bp = i8;
                        char cCharAt2 = i8 >= this.text.length() ? JSONLexer.EOI : this.text.charAt(i8);
                        this.f3873ch = cCharAt2;
                        if (cCharAt2 == ',') {
                            int i9 = this.f3872bp + 1;
                            this.f3872bp = i9;
                            this.f3873ch = i9 >= this.text.length() ? JSONLexer.EOI : this.text.charAt(i9);
                            this.token = i4;
                            return 3;
                        }
                        if (cCharAt2 == ']') {
                            int i10 = this.f3872bp + 1;
                            this.f3872bp = i10;
                            this.f3873ch = i10 >= this.text.length() ? JSONLexer.EOI : this.text.charAt(i10);
                            this.token = i3;
                            return 3;
                        }
                        if (cCharAt2 == '}') {
                            int i11 = this.f3872bp + 1;
                            this.f3872bp = i11;
                            this.f3873ch = i11 >= this.text.length() ? JSONLexer.EOI : this.text.charAt(i11);
                            this.token = 13;
                            return 3;
                        }
                        if (cCharAt2 < '0' || cCharAt2 > '9') {
                            nextToken(2);
                            return 3;
                        }
                        this.f3875sp = 0;
                        this.pos = this.f3872bp;
                        scanNumber();
                        return 3;
                    }
                    if (c3 != ':') {
                        skipWhitespace();
                    }
                    if (this.f3873ch != ':') {
                        xiq.m209674a("illegal json, ", info());
                        return 0;
                    }
                    int i12 = this.f3872bp + 1;
                    this.f3872bp = i12;
                    char cCharAt3 = i12 >= this.text.length() ? JSONLexer.EOI : this.text.charAt(i12);
                    this.f3873ch = cCharAt3;
                    if (cCharAt3 != '\"' && cCharAt3 != '\'' && cCharAt3 != '{' && cCharAt3 != '[' && cCharAt3 != '0' && cCharAt3 != '1' && cCharAt3 != '2' && cCharAt3 != '3' && cCharAt3 != '4' && cCharAt3 != '5' && cCharAt3 != '6' && cCharAt3 != '7' && cCharAt3 != '8' && cCharAt3 != '9' && cCharAt3 != '+' && cCharAt3 != '-') {
                        skipWhitespace();
                    }
                    char c4 = this.f3873ch;
                    if (c4 == '-' || c4 == '+' || (c4 >= '0' && c4 <= '9')) {
                        next();
                        while (true) {
                            c = this.f3873ch;
                            if (c < '0' || c > '9') {
                                break;
                            }
                            next();
                        }
                        if (c == '.') {
                            next();
                            while (true) {
                                char c5 = this.f3873ch;
                                if (c5 < '0' || c5 > '9') {
                                    break;
                                }
                                next();
                            }
                        }
                        char c6 = this.f3873ch;
                        if (c6 == 'E' || c6 == 'e') {
                            next();
                            char c7 = this.f3873ch;
                            if (c7 == '-' || c7 == '+') {
                                next();
                            }
                            while (true) {
                                char c8 = this.f3873ch;
                                if (c8 < '0' || c8 > '9') {
                                    break;
                                }
                                next();
                            }
                        }
                        if (this.f3873ch != ',') {
                            skipWhitespace();
                        }
                        if (this.f3873ch == ',') {
                            next();
                        }
                    } else if (c4 == '\"') {
                        skipString();
                        char c9 = this.f3873ch;
                        if (c9 != ',' && c9 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3873ch == ',') {
                            next();
                        }
                    } else if (c4 == 't') {
                        next();
                        if (this.f3873ch == 'r') {
                            next();
                            if (this.f3873ch == 'u') {
                                next();
                                if (this.f3873ch == 'e') {
                                    next();
                                }
                            }
                        }
                        char c10 = this.f3873ch;
                        if (c10 != ',' && c10 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3873ch == ',') {
                            next();
                        }
                    } else if (c4 == 'n') {
                        next();
                        if (this.f3873ch == 'u') {
                            next();
                            if (this.f3873ch == 'l') {
                                next();
                                if (this.f3873ch == 'l') {
                                    next();
                                }
                            }
                        }
                        char c11 = this.f3873ch;
                        if (c11 != ',' && c11 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3873ch == ',') {
                            next();
                        }
                    } else if (c4 == 'f') {
                        next();
                        if (this.f3873ch == 'a') {
                            next();
                            if (this.f3873ch == 'l') {
                                next();
                                if (this.f3873ch == 's') {
                                    next();
                                    if (this.f3873ch == 'e') {
                                        next();
                                    }
                                }
                            }
                        }
                        char c12 = this.f3873ch;
                        if (c12 != ',' && c12 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3873ch == ',') {
                            next();
                        }
                    } else if (c4 == '{') {
                        int i13 = this.f3872bp + 1;
                        this.f3872bp = i13;
                        this.f3873ch = i13 >= this.text.length() ? JSONLexer.EOI : this.text.charAt(i13);
                        if (z) {
                            this.token = 12;
                            return 1;
                        }
                        skipObject(false);
                        if (this.token == 13) {
                            return i7;
                        }
                    } else {
                        if (c4 != '[') {
                            bz00.m104536a();
                            return 0;
                        }
                        next();
                        if (z) {
                            this.token = 14;
                            return 2;
                        }
                        skipArray(false);
                        if (this.token == 13) {
                            return i7;
                        }
                    }
                    i2 = i7;
                    i3 = 15;
                    i4 = 16;
                }
            }
        }
        nextToken();
        return -1;
    }

    public void setTime(char c, char c2, char c3, char c4, char c5, char c6) {
        this.calendar.set(11, ((c - '0') * 10) + (c2 - '0'));
        this.calendar.set(12, ((c3 - '0') * 10) + (c4 - '0'));
        this.calendar.set(13, ((c5 - '0') * 10) + (c6 - '0'));
    }

    public void setTimeZone(char c, char c2, char c3, char c4, char c5) {
        int i = ((((c2 - '0') * 10) + (c3 - '0')) * 3600000) + ((((c4 - '0') * 10) + (c5 - '0')) * HuiYanResultSender.TIMEOUT_MS);
        if (c == '-') {
            i = -i;
        }
        if (this.calendar.getTimeZone().getRawOffset() != i) {
            String[] availableIDs = TimeZone.getAvailableIDs(i);
            if (availableIDs.length > 0) {
                this.calendar.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
            }
        }
    }

    public final void skipArray(boolean z) {
        int i = this.f3872bp;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            int length = this.text.length();
            String str = this.text;
            if (i >= length) {
                if (i != str.length()) {
                    return;
                }
                xiq.m209674a("illegal str, ", info());
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                if (i >= this.len - 1) {
                    this.f3873ch = cCharAt;
                    this.f3872bp = i;
                    xiq.m209674a("illegal str, ", info());
                    return;
                }
                i++;
            } else if (cCharAt == '\"') {
                z2 = !z2;
            } else if (cCharAt != '[') {
                char cCharAt2 = JSONLexer.EOI;
                if (cCharAt == '{' && z) {
                    int i3 = this.f3872bp + 1;
                    this.f3872bp = i3;
                    if (i3 < this.text.length()) {
                        cCharAt2 = this.text.charAt(i3);
                    }
                    this.f3873ch = cCharAt2;
                    skipObject(z);
                } else if (cCharAt == ']' && !z2 && (i2 = i2 - 1) == -1) {
                    int i4 = i + 1;
                    this.f3872bp = i4;
                    if (i4 == this.text.length()) {
                        this.f3873ch = JSONLexer.EOI;
                        this.token = 20;
                        return;
                    } else {
                        this.f3873ch = this.text.charAt(this.f3872bp);
                        nextToken(16);
                        return;
                    }
                }
            } else if (!z2) {
                i2++;
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void skipObject(boolean z) {
        int i = this.f3872bp;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            int length = this.text.length();
            String str = this.text;
            if (i >= length) {
                if (i != str.length()) {
                    return;
                }
                xiq.m209674a("illegal str, ", info());
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                if (i >= this.len - 1) {
                    this.f3873ch = cCharAt;
                    this.f3872bp = i;
                    xiq.m209674a("illegal str, ", info());
                    return;
                }
                i++;
            } else if (cCharAt == '\"') {
                z2 = !z2;
            } else if (cCharAt == '{') {
                if (!z2) {
                    i2++;
                }
            } else if (cCharAt == '}' && !z2 && (i2 = i2 - 1) == -1) {
                int i3 = i + 1;
                this.f3872bp = i3;
                int length2 = this.text.length();
                char cCharAt2 = JSONLexer.EOI;
                if (i3 == length2) {
                    this.f3873ch = JSONLexer.EOI;
                    this.token = 20;
                    return;
                }
                char cCharAt3 = this.text.charAt(this.f3872bp);
                this.f3873ch = cCharAt3;
                if (cCharAt3 == ',') {
                    this.token = 16;
                    int i4 = this.f3872bp + 1;
                    this.f3872bp = i4;
                    if (i4 < this.text.length()) {
                        cCharAt2 = this.text.charAt(i4);
                    }
                    this.f3873ch = cCharAt2;
                    return;
                }
                if (cCharAt3 == '}') {
                    this.token = 13;
                    next();
                    return;
                } else if (cCharAt3 != ']') {
                    nextToken(16);
                    return;
                } else {
                    this.token = 15;
                    next();
                    return;
                }
            }
            i++;
        }
    }

    public final void skipString() {
        if (this.f3873ch != '\"') {
            bz00.m104536a();
            return;
        }
        int i = this.f3872bp;
        while (true) {
            i++;
            if (i >= this.text.length()) {
                riq.m179531a("unclosed str");
                return;
            }
            char cCharAt = this.text.charAt(i);
            if (cCharAt == '\\') {
                if (i < this.len - 1) {
                    i++;
                }
            } else if (cCharAt == '\"') {
                String str = this.text;
                int i2 = i + 1;
                this.f3872bp = i2;
                this.f3873ch = str.charAt(i2);
                return;
            }
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final String stringVal() {
        return !this.hasSpecial ? subString(this.f3874np + 1, this.f3875sp) : new String(this.sbuf, 0, this.f3875sp);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final String subString(int i, int i2) {
        if (!ASMUtils.IS_ANDROID) {
            return this.text.substring(i, i2 + i);
        }
        char[] cArr = this.sbuf;
        if (i2 < cArr.length) {
            this.text.getChars(i, i + i2, cArr, 0);
            return new String(this.sbuf, 0, i2);
        }
        char[] cArr2 = new char[i2];
        this.text.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char[] sub_chars(int i, int i2) {
        if (ASMUtils.IS_ANDROID) {
            char[] cArr = this.sbuf;
            if (i2 < cArr.length) {
                this.text.getChars(i, i2 + i, cArr, 0);
                return this.sbuf;
            }
        }
        char[] cArr2 = new char[i2];
        this.text.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    public JSONScanner(String str) {
        this(str, JSON.DEFAULT_PARSER_FEATURE);
    }

    public JSONScanner(char[] cArr, int i) {
        this(cArr, i, JSON.DEFAULT_PARSER_FEATURE);
    }

    public JSONScanner(char[] cArr, int i, int i2) {
        this(new String(cArr, 0, i), i2);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final boolean charArrayCompare(char[] cArr) {
        return charArrayCompare(this.text, this.f3872bp, cArr);
    }

    public void setTimeZone(char c, char c2, char c3) {
        setTimeZone(c, c2, c3, '0', '0');
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void skipArray() {
        skipArray(false);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void skipObject() {
        skipObject(false);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public String[] scanFieldStringArray(char[] cArr, int i, SymbolTable symbolTable) {
        int i2;
        char cCharAt;
        int i3 = this.f3872bp;
        char c = this.f3873ch;
        while (JSONLexerBase.isWhitespace(this.f3873ch)) {
            next();
        }
        if (cArr != null) {
            this.matchStat = 0;
            if (!charArrayCompare(cArr)) {
                this.matchStat = -2;
                return null;
            }
            int length = this.f3872bp + cArr.length;
            int i4 = length + 1;
            char cCharAt2 = this.text.charAt(length);
            while (JSONLexerBase.isWhitespace(cCharAt2)) {
                cCharAt2 = this.text.charAt(i4);
                i4++;
            }
            if (cCharAt2 == ':') {
                i2 = i4 + 1;
                cCharAt = this.text.charAt(i4);
                while (JSONLexerBase.isWhitespace(cCharAt)) {
                    cCharAt = this.text.charAt(i2);
                    i2++;
                }
            } else {
                this.matchStat = -1;
                return null;
            }
        } else {
            i2 = this.f3872bp + 1;
            cCharAt = this.f3873ch;
        }
        if (cCharAt == '[') {
            this.f3872bp = i2;
            this.f3873ch = this.text.charAt(i2);
            String[] strArr = i >= 0 ? new String[i] : new String[4];
            int i5 = 0;
            while (true) {
                if (JSONLexerBase.isWhitespace(this.f3873ch)) {
                    next();
                } else {
                    if (this.f3873ch != '\"') {
                        this.f3872bp = i3;
                        this.f3873ch = c;
                        this.matchStat = -1;
                        return null;
                    }
                    String strScanSymbol = scanSymbol(symbolTable, '\"');
                    if (i5 == strArr.length) {
                        String[] strArr2 = new String[strArr.length + (strArr.length >> 1) + 1];
                        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                        strArr = strArr2;
                    }
                    int i6 = i5 + 1;
                    strArr[i5] = strScanSymbol;
                    while (JSONLexerBase.isWhitespace(this.f3873ch)) {
                        next();
                    }
                    if (this.f3873ch == ',') {
                        next();
                        i5 = i6;
                    } else {
                        if (strArr.length != i6) {
                            String[] strArr3 = new String[i6];
                            System.arraycopy(strArr, 0, strArr3, 0, i6);
                            strArr = strArr3;
                        }
                        while (JSONLexerBase.isWhitespace(this.f3873ch)) {
                            next();
                        }
                        if (this.f3873ch == ']') {
                            next();
                            return strArr;
                        }
                        this.f3872bp = i3;
                        this.f3873ch = c;
                        this.matchStat = -1;
                        return null;
                    }
                }
            }
        } else {
            if (cCharAt == 'n' && this.text.startsWith("ull", this.f3872bp + 1)) {
                int i7 = this.f3872bp + 4;
                this.f3872bp = i7;
                this.f3873ch = this.text.charAt(i7);
                return null;
            }
            this.matchStat = -1;
            return null;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public int seekObjectToField(long[] jArr) {
        char c;
        int i = this.token;
        if (i != 12 && i != 16) {
            bz00.m104536a();
            return 0;
        }
        while (true) {
            char c2 = this.f3873ch;
            if (c2 == '}') {
                next();
                nextToken();
                this.matchStat = -1;
                return -1;
            }
            char cCharAt = JSONLexer.EOI;
            if (c2 == 26) {
                this.matchStat = -1;
                return -1;
            }
            if (c2 != '\"') {
                skipWhitespace();
            }
            if (this.f3873ch == '\"') {
                int i2 = this.f3872bp + 1;
                long j = -3750763034362895579L;
                while (i2 < this.text.length()) {
                    char cCharAt2 = this.text.charAt(i2);
                    if (cCharAt2 == '\\') {
                        i2++;
                        if (i2 != this.text.length()) {
                            cCharAt2 = this.text.charAt(i2);
                        } else {
                            xiq.m209674a("unclosed str, ", info());
                            return 0;
                        }
                    }
                    if (cCharAt2 == '\"') {
                        int i3 = i2 + 1;
                        this.f3872bp = i3;
                        this.f3873ch = i3 >= this.text.length() ? (char) 26 : this.text.charAt(this.f3872bp);
                        break;
                    }
                    j = (j ^ ((long) cCharAt2)) * 1099511628211L;
                    i2++;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= jArr.length) {
                        i4 = -1;
                        break;
                    }
                    if (j == jArr[i4]) {
                        break;
                    }
                    i4++;
                }
                char c3 = this.f3873ch;
                if (i4 != -1) {
                    if (c3 != ':') {
                        skipWhitespace();
                    }
                    if (this.f3873ch == ':') {
                        int i5 = this.f3872bp + 1;
                        this.f3872bp = i5;
                        char cCharAt3 = i5 >= this.text.length() ? (char) 26 : this.text.charAt(i5);
                        this.f3873ch = cCharAt3;
                        if (cCharAt3 == ',') {
                            int i6 = this.f3872bp + 1;
                            this.f3872bp = i6;
                            if (i6 < this.text.length()) {
                                cCharAt = this.text.charAt(i6);
                            }
                            this.f3873ch = cCharAt;
                            this.token = 16;
                        } else if (cCharAt3 == ']') {
                            int i7 = this.f3872bp + 1;
                            this.f3872bp = i7;
                            if (i7 < this.text.length()) {
                                cCharAt = this.text.charAt(i7);
                            }
                            this.f3873ch = cCharAt;
                            this.token = 15;
                        } else if (cCharAt3 == '}') {
                            int i8 = this.f3872bp + 1;
                            this.f3872bp = i8;
                            if (i8 < this.text.length()) {
                                cCharAt = this.text.charAt(i8);
                            }
                            this.f3873ch = cCharAt;
                            this.token = 13;
                        } else if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                            this.f3875sp = 0;
                            this.pos = this.f3872bp;
                            scanNumber();
                        } else {
                            nextToken(2);
                        }
                    }
                    this.matchStat = 3;
                    return i4;
                }
                if (c3 != ':') {
                    skipWhitespace();
                }
                if (this.f3873ch == ':') {
                    int i9 = this.f3872bp + 1;
                    this.f3872bp = i9;
                    char cCharAt4 = i9 >= this.text.length() ? (char) 26 : this.text.charAt(i9);
                    this.f3873ch = cCharAt4;
                    if (cCharAt4 != '\"' && cCharAt4 != '\'' && cCharAt4 != '{' && cCharAt4 != '[' && cCharAt4 != '0' && cCharAt4 != '1' && cCharAt4 != '2' && cCharAt4 != '3' && cCharAt4 != '4' && cCharAt4 != '5' && cCharAt4 != '6' && cCharAt4 != '7' && cCharAt4 != '8' && cCharAt4 != '9' && cCharAt4 != '+' && cCharAt4 != '-') {
                        skipWhitespace();
                    }
                    char c4 = this.f3873ch;
                    if (c4 == '-' || c4 == '+' || (c4 >= '0' && c4 <= '9')) {
                        next();
                        while (true) {
                            c = this.f3873ch;
                            if (c < '0' || c > '9') {
                                break;
                            }
                            next();
                        }
                        if (c == '.') {
                            next();
                            while (true) {
                                char c5 = this.f3873ch;
                                if (c5 < '0' || c5 > '9') {
                                    break;
                                }
                                next();
                            }
                        }
                        char c6 = this.f3873ch;
                        if (c6 == 'E' || c6 == 'e') {
                            next();
                            char c7 = this.f3873ch;
                            if (c7 == '-' || c7 == '+') {
                                next();
                            }
                            while (true) {
                                char c8 = this.f3873ch;
                                if (c8 < '0' || c8 > '9') {
                                    break;
                                }
                                next();
                            }
                        }
                        if (this.f3873ch != ',') {
                            skipWhitespace();
                        }
                        if (this.f3873ch == ',') {
                            next();
                        }
                    } else if (c4 == '\"') {
                        skipString();
                        char c9 = this.f3873ch;
                        if (c9 != ',' && c9 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3873ch == ',') {
                            next();
                        }
                    } else if (c4 == '{') {
                        int i10 = this.f3872bp + 1;
                        this.f3872bp = i10;
                        if (i10 < this.text.length()) {
                            cCharAt = this.text.charAt(i10);
                        }
                        this.f3873ch = cCharAt;
                        skipObject(false);
                    } else if (c4 == '[') {
                        next();
                        skipArray(false);
                    } else {
                        bz00.m104536a();
                        return 0;
                    }
                } else {
                    xiq.m209674a("illegal json, ", info());
                    return 0;
                }
            } else {
                bz00.m104536a();
                return 0;
            }
        }
    }

    public boolean scanISO8601DateIfMatch(boolean z) {
        return scanISO8601DateIfMatch(z, this.len - this.f3872bp);
    }

    public boolean scanISO8601DateIfMatch() {
        return scanISO8601DateIfMatch(true);
    }
}

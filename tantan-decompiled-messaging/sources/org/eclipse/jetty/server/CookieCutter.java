package org.eclipse.jetty.server;

import java.util.Locale;
import javax.servlet.http.Cookie;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.QuotedStringTokenizer;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class CookieCutter {
    private static final Logger LOG = Log.getLogger((Class<?>) CookieCutter.class);
    private Cookie[] _cookies;
    int _fields;
    private Cookie[] _lastCookies;
    Object _lazyFields;

    public void addCookieField(String str) {
        if (str == null) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return;
        }
        int size = LazyList.size(this._lazyFields);
        int i = this._fields;
        if (size > i) {
            if (!strTrim.equals(LazyList.get(this._lazyFields, i))) {
                while (true) {
                    int size2 = LazyList.size(this._lazyFields);
                    int i2 = this._fields;
                    if (size2 <= i2) {
                        break;
                    } else {
                        this._lazyFields = LazyList.remove(this._lazyFields, i2);
                    }
                }
            } else {
                this._fields++;
                return;
            }
        }
        this._cookies = null;
        this._lastCookies = null;
        Object obj = this._lazyFields;
        int i3 = this._fields;
        this._fields = i3 + 1;
        this._lazyFields = LazyList.add(obj, i3, strTrim);
    }

    public Cookie[] getCookies() {
        Object obj;
        Cookie[] cookieArr = this._cookies;
        if (cookieArr != null) {
            return cookieArr;
        }
        if (this._lastCookies == null || (obj = this._lazyFields) == null || this._fields != LazyList.size(obj)) {
            parseFields();
        } else {
            this._cookies = this._lastCookies;
        }
        Cookie[] cookieArr2 = this._cookies;
        this._lastCookies = cookieArr2;
        return cookieArr2;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0185  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093 A[PHI: r0 r14
      0x0093: PHI (r0v12 boolean) = (r0v9 boolean), (r0v7 boolean), (r0v13 boolean), (r0v7 boolean) binds: [B:72:0x00f6, B:61:0x00cb, B:48:0x00ad, B:37:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r14v9 int) = (r14v2 int), (r14v6 int), (r14v10 int), (r14v13 int) binds: [B:72:0x00f6, B:61:0x00cb, B:48:0x00ad, B:37:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v28 */
    /* JADX WARN: Type inference failed for: r17v29 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    public void parseFields() {
        ?? Substring;
        String strSubstring;
        ?? r17;
        ?? Substring2;
        ?? Substring3;
        ?? r16;
        String strSubstring2;
        ?? Substring4;
        ?? r18;
        ?? Substring5;
        Cookie cookie = null;
        this._lastCookies = null;
        this._cookies = null;
        while (true) {
            int size = LazyList.size(this._lazyFields);
            int i = this._fields;
            if (size <= i) {
                break;
            } else {
                this._lazyFields = LazyList.remove(this._lazyFields, i);
            }
        }
        Object obj = null;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this._fields) {
            String str = (String) LazyList.get(this._lazyFields, i2);
            int length = str.length();
            int i4 = length - 1;
            Cookie cookie2 = cookie;
            ?? r19 = cookie2;
            int i5 = i3;
            int i6 = 0;
            boolean z = false;
            boolean z2 = false;
            int i7 = -1;
            i6 = -1;
            Object objAdd = obj;
            boolean z3 = false;
            while (i6 < length) {
                char cCharAt = str.charAt(i6);
                if (z3) {
                    if (z2) {
                        z2 = false;
                    } else if (cCharAt == '\"') {
                        if (i6 != i4) {
                            Substring5 = Substring;
                            r18 = Substring4;
                        } else if (z) {
                            Substring4 = str.substring(i7, i6 + 1);
                            Substring5 = Substring;
                            r18 = Substring4;
                        } else {
                            r18 = "";
                            Substring5 = str.substring(i7, i6 + 1);
                        }
                        z3 = false;
                        Substring = Substring5;
                        r19 = r18;
                        if (r19 != 0 || Substring == 0) {
                            z3 = z3;
                        } else {
                            String strUnquote = QuotedStringTokenizer.unquote(Substring);
                            String strUnquote2 = QuotedStringTokenizer.unquote(r19);
                            boolean z4 = z3;
                            try {
                                if (strUnquote.startsWith("$")) {
                                    String lowerCase = strUnquote.toLowerCase(Locale.ENGLISH);
                                    if ("$path".equals(lowerCase)) {
                                        if (cookie != null) {
                                            cookie.setPath(strUnquote2);
                                        }
                                    } else if ("$domain".equals(lowerCase)) {
                                        if (cookie != null) {
                                            cookie.setDomain(strUnquote2);
                                        }
                                    } else if ("$port".equals(lowerCase)) {
                                        if (cookie != null) {
                                            cookie.setComment("$port=" + strUnquote2);
                                        }
                                    } else if ("$version".equals(lowerCase)) {
                                        i5 = Integer.parseInt(strUnquote2);
                                    }
                                } else {
                                    Cookie cookie3 = new Cookie(strUnquote, strUnquote2);
                                    if (i5 > 0) {
                                        try {
                                            cookie3.setVersion(i5);
                                        } catch (Exception e) {
                                            e = e;
                                            cookie = cookie3;
                                            LOG.debug(e);
                                        }
                                    }
                                    objAdd = LazyList.add(objAdd, cookie3);
                                    cookie = cookie3;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                            z3 = z4;
                            Substring = 0;
                            r19 = 0;
                        }
                    } else if (cCharAt == '\\') {
                        z2 = true;
                    }
                } else if (z) {
                    if (cCharAt != '\t' && cCharAt != ' ') {
                        if (cCharAt == '\"') {
                            if (i7 < 0) {
                                i7 = i6;
                                z3 = true;
                            }
                            if (i6 == i4) {
                                strSubstring2 = str.substring(i7, i6 + 1);
                                z3 = z3;
                                i6 = i6;
                                Substring = Substring;
                                r19 = strSubstring2;
                                if (r19 != 0) {
                                    z3 = z3;
                                } else {
                                    z3 = z3;
                                }
                            } else {
                                i6 = i6;
                            }
                        } else if (cCharAt != ';') {
                            if (i7 < 0) {
                                i7 = i6;
                            }
                            if (i6 == i4) {
                                strSubstring2 = str.substring(i7, i6 + 1);
                                z3 = z3;
                                i6 = i6;
                                Substring = Substring;
                                r19 = strSubstring2;
                                if (r19 != 0) {
                                    z3 = z3;
                                } else {
                                    z3 = z3;
                                }
                            } else {
                                i6 = i6;
                            }
                        } else {
                            z = false;
                            r16 = Substring;
                            Substring3 = i7 >= 0 ? str.substring(i7, i6 + 1) : "";
                            i7 = -1;
                            Substring = r16;
                            r19 = Substring3;
                            if (r19 != 0) {
                                z3 = z3;
                            } else {
                                z3 = z3;
                            }
                        }
                    }
                } else if (cCharAt != '\t' && cCharAt != ' ') {
                    if (cCharAt == '\"') {
                        if (i7 < 0) {
                            i7 = i6;
                            z3 = true;
                        }
                        if (i6 == i4) {
                            strSubstring = str.substring(i7, i6 + 1);
                            z3 = z3;
                            i6 = i6;
                            r19 = "";
                            Substring = strSubstring;
                            if (r19 != 0) {
                                z3 = z3;
                            } else {
                                z3 = z3;
                            }
                        } else {
                            i6 = i6;
                        }
                    } else if (cCharAt == ';') {
                        if (i7 >= 0) {
                            r17 = "";
                            Substring2 = str.substring(i7, i6 + 1);
                        }
                        r16 = Substring2;
                        Substring3 = r17;
                        i7 = -1;
                        Substring = r16;
                        r19 = Substring3;
                        if (r19 != 0) {
                            z3 = z3;
                        } else {
                            z3 = z3;
                        }
                    } else if (cCharAt != '=') {
                        if (i7 < 0) {
                            i7 = i6;
                        }
                        if (i6 == i4) {
                            strSubstring = str.substring(i7, i6 + 1);
                            z3 = z3;
                            i6 = i6;
                            r19 = "";
                            Substring = strSubstring;
                            if (r19 != 0) {
                                z3 = z3;
                            } else {
                                z3 = z3;
                            }
                        } else {
                            i6 = i6;
                        }
                    } else {
                        if (i7 >= 0) {
                            Substring = str.substring(i7, i6 + 1);
                        }
                        z = true;
                        i7 = -1;
                    }
                }
                i6++;
                Substring = Substring;
                r19 = r19;
            }
            Substring = cookie2;
            i2++;
            obj = objAdd;
            i3 = i5;
            cookie = null;
        }
        Cookie[] cookieArr = (Cookie[]) LazyList.toArray(obj, Cookie.class);
        this._cookies = cookieArr;
        this._lastCookies = cookieArr;
    }

    public void reset() {
        this._cookies = null;
        this._fields = 0;
    }

    public void setCookies(Cookie[] cookieArr) {
        this._cookies = cookieArr;
        this._lastCookies = null;
        this._lazyFields = null;
        this._fields = 0;
    }
}

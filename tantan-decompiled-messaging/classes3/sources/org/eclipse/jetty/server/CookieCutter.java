package org.eclipse.jetty.server;

import java.util.Locale;
import javax.servlet.http.Cookie;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.QuotedStringTokenizer;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
    public void parseFields() {
        String str = null;
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
            String str2 = (String) LazyList.get(this._lazyFields, i2);
            int length = str2.length();
            int i4 = length - 1;
            String strSubstring = str;
            String strSubstring2 = strSubstring;
            int i5 = i3;
            int i6 = 0;
            boolean z = false;
            boolean z2 = false;
            int i7 = -1;
            i6 = -1;
            Object objAdd = obj;
            boolean z3 = false;
            while (i6 < length) {
                char cCharAt = str2.charAt(i6);
                if (z3) {
                    if (z2) {
                        z2 = false;
                    } else if (cCharAt == '\"') {
                        if (i6 == i4) {
                            if (z) {
                                strSubstring2 = str2.substring(i7, i6 + 1);
                            } else {
                                strSubstring = str2.substring(i7, i6 + 1);
                                strSubstring2 = "";
                            }
                        }
                        z3 = false;
                        if (strSubstring2 != null || strSubstring == null) {
                            z3 = z3;
                        } else {
                            String strUnquote = QuotedStringTokenizer.unquote(strSubstring);
                            String strUnquote2 = QuotedStringTokenizer.unquote(strSubstring2);
                            boolean z4 = z3;
                            try {
                                if (strUnquote.startsWith("$")) {
                                    String lowerCase = strUnquote.toLowerCase(Locale.ENGLISH);
                                    if ("$path".equals(lowerCase)) {
                                        if (str != null) {
                                            str.setPath(strUnquote2);
                                        }
                                    } else if ("$domain".equals(lowerCase)) {
                                        if (str != null) {
                                            str.setDomain(strUnquote2);
                                        }
                                    } else if ("$port".equals(lowerCase)) {
                                        if (str != null) {
                                            str.setComment("$port=" + strUnquote2);
                                        }
                                    } else if ("$version".equals(lowerCase)) {
                                        i5 = Integer.parseInt(strUnquote2);
                                    }
                                } else {
                                    String cookie = new Cookie(strUnquote, strUnquote2);
                                    if (i5 > 0) {
                                        try {
                                            cookie.setVersion(i5);
                                        } catch (Exception e) {
                                            e = e;
                                            str = cookie;
                                            LOG.debug(e);
                                        }
                                    }
                                    objAdd = LazyList.add(objAdd, cookie);
                                    str = cookie;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                            z3 = z4;
                            strSubstring = null;
                            strSubstring2 = null;
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
                                strSubstring2 = str2.substring(i7, i6 + 1);
                                z3 = z3;
                                i6 = i6;
                                if (strSubstring2 != null) {
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
                                strSubstring2 = str2.substring(i7, i6 + 1);
                                z3 = z3;
                                i6 = i6;
                                if (strSubstring2 != null) {
                                    z3 = z3;
                                } else {
                                    z3 = z3;
                                }
                            } else {
                                i6 = i6;
                            }
                        } else {
                            strSubstring2 = i7 >= 0 ? str2.substring(i7, i6 + 1) : "";
                            z = false;
                            i7 = -1;
                            if (strSubstring2 != null) {
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
                            strSubstring = str2.substring(i7, i6 + 1);
                            z3 = z3;
                            i6 = i6;
                            strSubstring2 = "";
                            if (strSubstring2 != null) {
                                z3 = z3;
                            } else {
                                z3 = z3;
                            }
                        } else {
                            i6 = i6;
                        }
                    } else if (cCharAt == ';') {
                        if (i7 >= 0) {
                            strSubstring = str2.substring(i7, i6 + 1);
                            strSubstring2 = "";
                        }
                        i7 = -1;
                        if (strSubstring2 != null) {
                            z3 = z3;
                        } else {
                            z3 = z3;
                        }
                    } else if (cCharAt != '=') {
                        if (i7 < 0) {
                            i7 = i6;
                        }
                        if (i6 == i4) {
                            strSubstring = str2.substring(i7, i6 + 1);
                            z3 = z3;
                            i6 = i6;
                            strSubstring2 = "";
                            if (strSubstring2 != null) {
                                z3 = z3;
                            } else {
                                z3 = z3;
                            }
                        } else {
                            i6 = i6;
                        }
                    } else {
                        if (i7 >= 0) {
                            strSubstring = str2.substring(i7, i6 + 1);
                        }
                        z = true;
                        i7 = -1;
                    }
                }
                i6++;
            }
            i2++;
            obj = objAdd;
            i3 = i5;
            str = null;
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

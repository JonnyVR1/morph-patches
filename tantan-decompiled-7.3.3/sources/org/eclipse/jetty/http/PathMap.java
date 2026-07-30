package org.eclipse.jetty.http;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.StringMap;
import p153l.v1d0;

/* JADX INFO: loaded from: classes2.dex */
public class PathMap extends HashMap implements Externalizable {
    private static String __pathSpecSeparators = ":,";
    Entry _default;
    List _defaultSingletonList;
    final Set _entrySet;
    final StringMap _exactMap;
    boolean _nodefault;
    Entry _prefixDefault;
    final StringMap _prefixMap;
    final StringMap _suffixMap;

    public static class Entry implements Map.Entry {
        private final Object key;
        private String mapped;
        private transient String string;
        private final Object value;

        public Entry(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        public String getMapped() {
            return this.mapped;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }

        public void setMapped(String str) {
            this.mapped = str;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            if (this.string == null) {
                this.string = this.key + "=" + this.value;
            }
            return this.string;
        }
    }

    public PathMap(boolean z) {
        super(11);
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
        this._nodefault = z;
    }

    private static boolean isPathWildcardMatch(String str, String str2) {
        int length = str.length() - 2;
        return str.endsWith("/*") && str2.regionMatches(0, str, 0, length) && (str2.length() == length || '/' == str2.charAt(length));
    }

    public static boolean match(String str, String str2, boolean z) throws IllegalArgumentException {
        char cCharAt = str.charAt(0);
        if (cCharAt == '/') {
            if ((!z && str.length() == 1) || str.equals(str2) || isPathWildcardMatch(str, str2)) {
                return true;
            }
        } else if (cCharAt == '*') {
            return str2.regionMatches((str2.length() - str.length()) + 1, str, 1, str.length() - 1);
        }
        return false;
    }

    public static String pathInfo(String str, String str2) {
        if ("".equals(str)) {
            return str2;
        }
        if (str.charAt(0) != '/' || str.length() == 1) {
            return null;
        }
        boolean zIsPathWildcardMatch = isPathWildcardMatch(str, str2);
        if ((!str.equals(str2) || zIsPathWildcardMatch) && zIsPathWildcardMatch && str2.length() != str.length() - 2) {
            return str2.substring(str.length() - 2);
        }
        return null;
    }

    public static String pathMatch(String str, String str2) {
        char cCharAt = str.charAt(0);
        if (cCharAt != '/') {
            if (cCharAt == '*' && str2.regionMatches(str2.length() - (str.length() - 1), str, 1, str.length() - 1)) {
                return str2;
            }
            return null;
        }
        if (str.length() == 1 || str.equals(str2)) {
            return str2;
        }
        if (isPathWildcardMatch(str, str2)) {
            return str2.substring(0, str.length() - 2);
        }
        return null;
    }

    public static String relativePath(String str, String str2, String str3) {
        String strPathInfo = pathInfo(str2, str3);
        if (strPathInfo != null) {
            str3 = strPathInfo;
        }
        if (str3.startsWith("./")) {
            str3 = str3.substring(2);
        }
        if (str.endsWith("/")) {
            return str3.startsWith("/") ? str.concat(str3.substring(1)) : str.concat(str3);
        }
        if (str3.startsWith("/")) {
            return str.concat(str3);
        }
        return str + "/" + str3;
    }

    public static void setPathSpecSeparators(String str) {
        __pathSpecSeparators = str;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        this._exactMap.clear();
        this._prefixMap.clear();
        this._suffixMap.clear();
        this._default = null;
        this._defaultSingletonList = null;
        super.clear();
    }

    public boolean containsMatch(String str) {
        Entry match = getMatch(str);
        return (match == null || match.equals(this._default)) ? false : true;
    }

    public Object getLazyMatches(String str) {
        if (str == null) {
            return LazyList.getList(null);
        }
        int length = str.length();
        int iIndexOf = 0;
        Map.Entry entry = this._exactMap.getEntry(str, 0, length);
        Object objAdd = entry != null ? LazyList.add(null, entry.getValue()) : null;
        int iLastIndexOf = length - 1;
        while (true) {
            iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
            if (iLastIndexOf < 0) {
                break;
            }
            Map.Entry entry2 = this._prefixMap.getEntry(str, 0, iLastIndexOf);
            if (entry2 != null) {
                objAdd = LazyList.add(objAdd, entry2.getValue());
            }
        }
        Entry entry3 = this._prefixDefault;
        if (entry3 != null) {
            objAdd = LazyList.add(objAdd, entry3);
        }
        while (true) {
            iIndexOf = str.indexOf(46, iIndexOf + 1);
            if (iIndexOf <= 0) {
                break;
            }
            Map.Entry entry4 = this._suffixMap.getEntry(str, iIndexOf + 1, (length - iIndexOf) - 1);
            if (entry4 != null) {
                objAdd = LazyList.add(objAdd, entry4.getValue());
            }
        }
        Entry entry5 = this._default;
        if (entry5 != null) {
            return objAdd == null ? this._defaultSingletonList : LazyList.add(objAdd, entry5);
        }
        return objAdd;
    }

    public Entry getMatch(String str) {
        Map.Entry entry;
        Map.Entry entry2;
        Map.Entry entry3;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int iIndexOf = 0;
        if (length == 1 && str.charAt(0) == '/' && (entry3 = (Map.Entry) this._exactMap.get("")) != null) {
            return (Entry) entry3;
        }
        Map.Entry entry4 = this._exactMap.getEntry(str, 0, length);
        if (entry4 != null) {
            return (Entry) entry4.getValue();
        }
        int iLastIndexOf = length;
        do {
            iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
            if (iLastIndexOf < 0) {
                Entry entry5 = this._prefixDefault;
                if (entry5 != null) {
                    return entry5;
                }
                do {
                    iIndexOf = str.indexOf(46, iIndexOf + 1);
                    if (iIndexOf <= 0) {
                        return this._default;
                    }
                    entry = this._suffixMap.getEntry(str, iIndexOf + 1, (length - iIndexOf) - 1);
                } while (entry == null);
                return (Entry) entry.getValue();
            }
            entry2 = this._prefixMap.getEntry(str, 0, iLastIndexOf);
        } while (entry2 == null);
        return (Entry) entry2.getValue();
    }

    public List getMatches(String str) {
        return LazyList.getList(getLazyMatches(str));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        String string = obj.toString();
        if ("".equals(string.trim())) {
            Entry entry = new Entry("", obj2);
            entry.setMapped("");
            this._exactMap.put("", (Object) entry);
            return super.put("", obj2);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(string, __pathSpecSeparators);
        Object obj3 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!strNextToken.startsWith("/") && !strNextToken.startsWith("*.")) {
                v1d0.m199002a("PathSpec ", strNextToken, ". must start with '/' or '*.'");
                return null;
            }
            Object objPut = super.put(strNextToken, obj2);
            Entry entry2 = new Entry(strNextToken, obj2);
            if (entry2.getKey().equals(strNextToken)) {
                if (strNextToken.equals("/*")) {
                    this._prefixDefault = entry2;
                } else if (strNextToken.endsWith("/*")) {
                    String strSubstring = strNextToken.substring(0, strNextToken.length() - 2);
                    entry2.setMapped(strSubstring);
                    this._prefixMap.put(strSubstring, (Object) entry2);
                    this._exactMap.put(strSubstring, (Object) entry2);
                    this._exactMap.put(strNextToken.substring(0, strNextToken.length() - 1), (Object) entry2);
                } else if (strNextToken.startsWith("*.")) {
                    this._suffixMap.put(strNextToken.substring(2), (Object) entry2);
                } else if (!strNextToken.equals("/")) {
                    entry2.setMapped(strNextToken);
                    this._exactMap.put(strNextToken, (Object) entry2);
                } else if (this._nodefault) {
                    this._exactMap.put(strNextToken, (Object) entry2);
                } else {
                    this._default = entry2;
                    this._defaultSingletonList = Collections.singletonList(entry2);
                }
            }
            obj3 = objPut;
        }
        return obj3;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        putAll((HashMap) objectInput.readObject());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj != null) {
            String str = (String) obj;
            if (str.equals("/*")) {
                this._prefixDefault = null;
            } else if (str.endsWith("/*")) {
                this._prefixMap.remove(str.substring(0, str.length() - 2));
                this._exactMap.remove(str.substring(0, str.length() - 1));
                this._exactMap.remove(str.substring(0, str.length() - 2));
            } else if (str.startsWith("*.")) {
                this._suffixMap.remove(str.substring(2));
            } else if (str.equals("/")) {
                this._default = null;
                this._defaultSingletonList = null;
            } else {
                this._exactMap.remove(str);
            }
        }
        return super.remove(obj);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(new HashMap(this));
    }

    public PathMap() {
        super(11);
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
    }

    public PathMap(int i) {
        super(i);
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
    }

    public static boolean match(String str, String str2) throws IllegalArgumentException {
        return match(str, str2, false);
    }

    public Object match(String str) {
        Entry match = getMatch(str);
        if (match != null) {
            return match.getValue();
        }
        return null;
    }

    public PathMap(Map map) {
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        putAll(map);
        this._entrySet = entrySet();
    }
}

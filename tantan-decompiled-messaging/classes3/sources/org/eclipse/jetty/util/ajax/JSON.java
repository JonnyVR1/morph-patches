package org.eclipse.jetty.util.ajax;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.aag0;
import l.ohg0;
import l.qkq0;
import l.xjw;
import org.eclipse.jetty.util.C0746IO;
import org.eclipse.jetty.util.Loader;
import org.eclipse.jetty.util.QuotedStringTokenizer;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.seamless.xhtml.XHTML;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class JSON {
    private Map<String, Convertor> _convertors = new ConcurrentHashMap();
    private int _stringBufferSize = 1024;
    static final Logger LOG = Log.getLogger((Class<?>) JSON.class);
    public static final JSON DEFAULT = new JSON();

    public interface Convertible {
        void fromJSON(Map map);

        void toJSON(Output output);
    }

    public interface Convertor {
        Object fromJSON(Map map);

        void toJSON(Object obj, Output output);
    }

    public interface Generator {
        void addJSON(Appendable appendable);
    }

    public static class Literal implements Generator {
        private String _json;

        public Literal(String str) {
            if (JSON.LOG.isDebugEnabled()) {
                JSON.parse(str);
            }
            this._json = str;
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Generator
        public void addJSON(Appendable appendable) {
            try {
                appendable.append(this._json);
            } catch (IOException e) {
                aag0.a(e);
            }
        }

        public String toString() {
            return this._json;
        }
    }

    public interface Output {
        void add(Object obj);

        void add(String str, double d);

        void add(String str, long j);

        void add(String str, Object obj);

        void add(String str, boolean z);

        void addClass(Class cls);
    }

    public static class ReaderSource implements Source {
        private int _next = -1;
        private Reader _reader;
        private char[] scratch;

        public ReaderSource(Reader reader) {
            this._reader = reader;
        }

        private void getNext() {
            if (this._next < 0) {
                try {
                    this._next = this._reader.read();
                } catch (IOException e) {
                    aag0.a(e);
                }
            }
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Source
        public boolean hasNext() {
            getNext();
            if (this._next >= 0) {
                return true;
            }
            this.scratch = null;
            return false;
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Source
        public char next() {
            getNext();
            char c = (char) this._next;
            this._next = -1;
            return c;
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Source
        public char peek() {
            getNext();
            return (char) this._next;
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Source
        public char[] scratchBuffer() {
            if (this.scratch == null) {
                this.scratch = new char[1024];
            }
            return this.scratch;
        }

        public void setReader(Reader reader) {
            this._reader = reader;
            this._next = -1;
        }
    }

    public interface Source {
        boolean hasNext();

        char next();

        char peek();

        char[] scratchBuffer();
    }

    public static class StringSource implements Source {
        private int index;
        private char[] scratch;
        private final String string;

        public StringSource(String str) {
            this.string = str;
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Source
        public boolean hasNext() {
            if (this.index < this.string.length()) {
                return true;
            }
            this.scratch = null;
            return false;
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Source
        public char next() {
            String str = this.string;
            int i = this.index;
            this.index = i + 1;
            return str.charAt(i);
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Source
        public char peek() {
            return this.string.charAt(this.index);
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Source
        public char[] scratchBuffer() {
            if (this.scratch == null) {
                this.scratch = new char[this.string.length()];
            }
            return this.scratch;
        }

        public String toString() {
            return this.string.substring(0, this.index) + "|||" + this.string.substring(this.index);
        }
    }

    public static void complete(String str, Source source) {
        int i = 0;
        while (source.hasNext() && i < str.length()) {
            char next = source.next();
            int i2 = i + 1;
            if (next != str.charAt(i)) {
                throw new IllegalStateException("Unexpected '" + next + " while seeking  \"" + str + "\"");
            }
            i = i2;
        }
        if (i >= str.length()) {
            return;
        }
        xjw.a("Expected \"", str, "\"");
    }

    public static JSON getDefault() {
        return DEFAULT;
    }

    public static void registerConvertor(Class cls, Convertor convertor) {
        DEFAULT.addConvertor(cls, convertor);
    }

    @Deprecated
    public static void setDefault(JSON json) {
    }

    public static String toString(Object obj) {
        JSON json = DEFAULT;
        StringBuilder sb = new StringBuilder(json.getStringBufferSize());
        json.append(sb, obj);
        return sb.toString();
    }

    public void addConvertor(Class cls, Convertor convertor) {
        this._convertors.put(cls.getName(), convertor);
    }

    public void addConvertorFor(String str, Convertor convertor) {
        this._convertors.put(str, convertor);
    }

    public void append(Appendable appendable, Object obj) {
        try {
            if (obj == null) {
                appendable.append("null");
                return;
            }
            if (obj instanceof Convertible) {
                appendJSON(appendable, (Convertible) obj);
                return;
            }
            if (obj instanceof Generator) {
                appendJSON(appendable, (Generator) obj);
                return;
            }
            if (obj instanceof Map) {
                appendMap(appendable, (Map<?, ?>) obj);
                return;
            }
            if (obj instanceof Collection) {
                appendArray(appendable, (Collection) obj);
                return;
            }
            if (obj.getClass().isArray()) {
                appendArray(appendable, obj);
                return;
            }
            if (obj instanceof Number) {
                appendNumber(appendable, (Number) obj);
                return;
            }
            if (obj instanceof Boolean) {
                appendBoolean(appendable, (Boolean) obj);
                return;
            }
            if (obj instanceof Character) {
                appendString(appendable, obj.toString());
                return;
            }
            if (obj instanceof String) {
                appendString(appendable, (String) obj);
                return;
            }
            Convertor convertor = getConvertor(obj.getClass());
            if (convertor != null) {
                appendJSON(appendable, convertor, obj);
            } else {
                appendString(appendable, obj.toString());
            }
        } catch (IOException e) {
            aag0.a(e);
        }
    }

    public void appendArray(Appendable appendable, Collection collection) {
        try {
            if (collection == null) {
                appendNull(appendable);
                return;
            }
            appendable.append('[');
            Iterator it = collection.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    appendable.append(',');
                }
                append(appendable, it.next());
                z = false;
            }
            appendable.append(']');
        } catch (IOException e) {
            aag0.a(e);
        }
    }

    public void appendBoolean(Appendable appendable, Boolean bool) {
        try {
            if (bool == null) {
                appendNull(appendable);
            } else {
                appendable.append(bool.booleanValue() ? "true" : "false");
            }
        } catch (IOException e) {
            aag0.a(e);
        }
    }

    public void appendJSON(Appendable appendable, Convertible convertible) {
        ConvertableOutput convertableOutput = new ConvertableOutput(appendable);
        convertible.toJSON(convertableOutput);
        convertableOutput.complete();
    }

    public void appendMap(Appendable appendable, Map<?, ?> map) {
        try {
            if (map == null) {
                appendNull(appendable);
                return;
            }
            appendable.append('{');
            Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                QuotedStringTokenizer.quote(appendable, next.getKey().toString());
                appendable.append(':');
                append(appendable, next.getValue());
                if (it.hasNext()) {
                    appendable.append(',');
                }
            }
            appendable.append('}');
        } catch (IOException e) {
            aag0.a(e);
        }
    }

    public void appendNull(Appendable appendable) {
        try {
            appendable.append("null");
        } catch (IOException e) {
            aag0.a(e);
        }
    }

    public void appendNumber(Appendable appendable, Number number) {
        try {
            if (number == null) {
                appendNull(appendable);
            } else {
                appendable.append(String.valueOf(number));
            }
        } catch (IOException e) {
            aag0.a(e);
        }
    }

    public void appendString(Appendable appendable, String str) {
        if (str == null) {
            appendNull(appendable);
        } else {
            QuotedStringTokenizer.quote(appendable, str);
        }
    }

    public JSON contextFor(String str) {
        return this;
    }

    public JSON contextForArray() {
        return this;
    }

    public Object convertTo(Class cls, Map map) {
        if (cls == null || !Convertible.class.isAssignableFrom(cls)) {
            Convertor convertor = getConvertor(cls);
            return convertor != null ? convertor.fromJSON(map) : map;
        }
        try {
            Convertible convertible = (Convertible) cls.newInstance();
            convertible.fromJSON(map);
            return convertible;
        } catch (Exception e) {
            aag0.a(e);
            return null;
        }
    }

    public Object fromJSON(String str) {
        return parse(new StringSource(str));
    }

    public Convertor getConvertor(Class cls) {
        JSON json;
        Convertor convertor = this._convertors.get(cls.getName());
        if (convertor == null && this != (json = DEFAULT)) {
            convertor = json.getConvertor(cls);
        }
        while (convertor == null && cls != Object.class) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; convertor == null && interfaces != null && i < interfaces.length; i++) {
                convertor = this._convertors.get(interfaces[i].getName());
            }
            if (convertor == null) {
                cls = cls.getSuperclass();
                convertor = this._convertors.get(cls.getName());
            }
        }
        return convertor;
    }

    public Convertor getConvertorFor(String str) {
        JSON json;
        Convertor convertor = this._convertors.get(str);
        return (convertor != null || this == (json = DEFAULT)) ? convertor : json.getConvertorFor(str);
    }

    public int getStringBufferSize() {
        return this._stringBufferSize;
    }

    public Object handleUnknown(Source source, char c) {
        throw new IllegalStateException("unknown char '" + c + "'(" + ((int) c) + ") in " + source);
    }

    public Object[] newArray(int i) {
        return new Object[i];
    }

    public Map<String, Object> newMap() {
        return new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public Object parse(Source source) {
        byte b = 0;
        while (source.hasNext()) {
            char cPeek = source.peek();
            if (b == 1) {
                if (cPeek == '*') {
                    b = 2;
                } else if (cPeek == '/') {
                    b = -1;
                }
            } else if (b > 1) {
                if (cPeek == '*') {
                    b = 3;
                } else if (cPeek == '/' && b == 3) {
                    b = 0;
                } else {
                    b = 2;
                }
            } else if (b < 0) {
                if (cPeek == '\n' || cPeek == '\r') {
                    b = 0;
                }
            } else {
                if (cPeek == '\"') {
                    return parseString(source);
                }
                if (cPeek == '-') {
                    return parseNumber(source);
                }
                if (cPeek == '/') {
                    b = 1;
                } else {
                    if (cPeek == 'N') {
                        complete("NaN", source);
                        return null;
                    }
                    if (cPeek == '[') {
                        return parseArray(source);
                    }
                    if (cPeek == 'f') {
                        complete("false", source);
                        return Boolean.FALSE;
                    }
                    if (cPeek == 'n') {
                        complete("null", source);
                        return null;
                    }
                    if (cPeek == '{') {
                        return parseObject(source);
                    }
                    if (cPeek == 't') {
                        complete("true", source);
                        return Boolean.TRUE;
                    }
                    if (cPeek == 'u') {
                        complete("undefined", source);
                        return null;
                    }
                    if (Character.isDigit(cPeek)) {
                        return parseNumber(source);
                    }
                    if (!Character.isWhitespace(cPeek)) {
                        return handleUnknown(source, cPeek);
                    }
                }
            }
            source.next();
        }
        return null;
    }

    public Object parseArray(Source source) {
        if (source.next() != '[') {
            ohg0.a();
            return null;
        }
        int i = 0;
        boolean z = true;
        Object obj = null;
        ArrayList arrayList = null;
        while (source.hasNext()) {
            char cPeek = source.peek();
            if (cPeek != ',') {
                if (cPeek == ']') {
                    source.next();
                    if (i == 0) {
                        return newArray(0);
                    }
                    if (i != 1) {
                        return arrayList.toArray(newArray(arrayList.size()));
                    }
                    Object[] objArrNewArray = newArray(1);
                    Array.set(objArrNewArray, 0, obj);
                    return objArrNewArray;
                }
                if (Character.isWhitespace(cPeek)) {
                    source.next();
                } else {
                    int i2 = i + 1;
                    if (i == 0) {
                        obj = contextForArray().parse(source);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayList.add(obj);
                            arrayList.add(contextForArray().parse(source));
                        } else {
                            arrayList.add(contextForArray().parse(source));
                        }
                        obj = null;
                    }
                    i = i2;
                    z = false;
                }
            } else {
                if (z) {
                    ohg0.a();
                    return null;
                }
                source.next();
                z = true;
            }
        }
        qkq0.a("unexpected end of array");
        return null;
    }

    public Number parseNumber(Source source) {
        boolean z = false;
        long j = 0;
        while (true) {
            StringBuilder sb = null;
            if (source.hasNext()) {
                char cPeek = source.peek();
                if (cPeek != '+') {
                    if (cPeek != 'E' && cPeek != 'e') {
                        if (cPeek != '-') {
                            if (cPeek != '.') {
                                switch (cPeek) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        j = (j * 10) + ((long) (cPeek - '0'));
                                        source.next();
                                        continue;
                                }
                            }
                        }
                    }
                    sb = new StringBuilder(16);
                    if (z) {
                        sb.append('-');
                    }
                    sb.append(j);
                    sb.append(cPeek);
                    source.next();
                }
                if (j != 0) {
                    qkq0.a("bad number");
                    return null;
                }
                source.next();
                z = true;
            }
            if (sb == null) {
                if (z) {
                    j *= -1;
                }
                return Long.valueOf(j);
            }
            while (source.hasNext()) {
                char cPeek2 = source.peek();
                if (cPeek2 != '+' && cPeek2 != 'E' && cPeek2 != 'e' && cPeek2 != '-' && cPeek2 != '.') {
                    switch (cPeek2) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            continue;
                    }
                    return new Double(sb.toString());
                }
                sb.append(cPeek2);
                source.next();
            }
            return new Double(sb.toString());
        }
    }

    public Object parseObject(Source source) {
        if (source.next() != '{') {
            ohg0.a();
            return null;
        }
        Map<String, Object> mapNewMap = newMap();
        char cSeekTo = seekTo("\"}", source);
        while (source.hasNext()) {
            if (cSeekTo == '}') {
                source.next();
                break;
            }
            String string = parseString(source);
            seekTo(':', source);
            source.next();
            mapNewMap.put(string, contextFor(string).parse(source));
            seekTo(",}", source);
            if (source.next() == '}') {
                break;
            }
            cSeekTo = seekTo("\"}", source);
        }
        String str = (String) mapNewMap.get(XHTML.ATTR.CLASS);
        if (str != null) {
            try {
                return convertTo(Loader.loadClass(JSON.class, str), mapNewMap);
            } catch (ClassNotFoundException e) {
                LOG.warn(e);
            }
        }
        return mapNewMap;
    }

    public String parseString(Source source) {
        char c;
        char c2;
        char c3;
        StringBuilder sb;
        boolean z;
        char c4;
        char c5;
        char c6;
        char c7;
        int i;
        if (source.next() != '\"') {
            ohg0.a();
            return null;
        }
        char[] cArrScratchBuffer = source.scratchBuffer();
        StringBuilder sb2 = null;
        char c8 = '\b';
        if (cArrScratchBuffer != null) {
            int i2 = 0;
            z = false;
            c = '\f';
            while (true) {
                if (!source.hasNext()) {
                    c2 = '\n';
                    c3 = '\r';
                    break;
                }
                c2 = '\n';
                if (i2 >= cArrScratchBuffer.length) {
                    c3 = '\r';
                    StringBuilder sb3 = new StringBuilder(cArrScratchBuffer.length * 2);
                    sb3.append(cArrScratchBuffer, 0, i2);
                    sb2 = sb3;
                    break;
                }
                char next = source.next();
                if (z) {
                    if (next == '\"') {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = '\"';
                    } else if (next == '/') {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = '/';
                    } else if (next == '\\') {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = '\\';
                    } else if (next == 'b') {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = '\b';
                    } else if (next == 'f') {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = '\f';
                    } else if (next == 'n') {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = '\n';
                    } else if (next == 'r') {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = '\r';
                    } else if (next == 't') {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = '\t';
                    } else if (next != 'u') {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = next;
                    } else {
                        i = i2 + 1;
                        cArrScratchBuffer[i2] = (char) ((TypeUtil.convertHexDigit((byte) source.next()) << 12) + (TypeUtil.convertHexDigit((byte) source.next()) << 8) + (TypeUtil.convertHexDigit((byte) source.next()) << 4) + TypeUtil.convertHexDigit((byte) source.next()));
                    }
                    z = false;
                } else if (next == '\\') {
                    z = true;
                } else {
                    if (next == '\"') {
                        return toString(cArrScratchBuffer, 0, i2);
                    }
                    i = i2 + 1;
                    cArrScratchBuffer[i2] = next;
                }
                i2 = i;
            }
            if (sb2 == null) {
                return toString(cArrScratchBuffer, 0, i2);
            }
            sb = sb2;
        } else {
            c = '\f';
            c2 = '\n';
            c3 = '\r';
            sb = new StringBuilder(getStringBufferSize());
            z = false;
        }
        while (source.hasNext()) {
            char next2 = source.next();
            if (z) {
                if (next2 == '\"') {
                    c4 = c8;
                    c5 = c;
                    c6 = c2;
                    c7 = c3;
                    sb.append('\"');
                } else if (next2 == '/') {
                    c4 = c8;
                    c5 = c;
                    c6 = c2;
                    c7 = c3;
                    sb.append('/');
                } else if (next2 == '\\') {
                    c4 = c8;
                    c5 = c;
                    c6 = c2;
                    c7 = c3;
                    sb.append('\\');
                } else if (next2 == 'b') {
                    c4 = c8;
                    c5 = c;
                    c6 = c2;
                    c7 = c3;
                    sb.append(c4);
                } else if (next2 == 'f') {
                    c5 = c;
                    c6 = c2;
                    c7 = c3;
                    sb.append(c5);
                    c4 = c8;
                } else if (next2 == 'n') {
                    c6 = c2;
                    c7 = c3;
                    sb.append(c6);
                    c4 = c8;
                    c5 = c;
                } else if (next2 != 'r') {
                    if (next2 == 't') {
                        sb.append('\t');
                    } else if (next2 != 'u') {
                        sb.append(next2);
                    } else {
                        sb.append((char) ((TypeUtil.convertHexDigit((byte) source.next()) << 12) + (TypeUtil.convertHexDigit((byte) source.next()) << 8) + (TypeUtil.convertHexDigit((byte) source.next()) << 4) + TypeUtil.convertHexDigit((byte) source.next())));
                    }
                    c4 = c8;
                    c5 = c;
                    c6 = c2;
                    c7 = c3;
                } else {
                    c7 = c3;
                    sb.append(c7);
                    c4 = c8;
                    c5 = c;
                    c6 = c2;
                }
                c8 = c4;
                z = false;
            } else {
                c5 = c;
                c6 = c2;
                c7 = c3;
                if (next2 == '\\') {
                    c3 = c7;
                    c2 = c6;
                    c = c5;
                    z = true;
                } else {
                    if (next2 == '\"') {
                        break;
                    }
                    sb.append(next2);
                }
            }
            c3 = c7;
            c2 = c6;
            c = c5;
        }
        return sb.toString();
    }

    public void seekTo(char c, Source source) {
        while (source.hasNext()) {
            char cPeek = source.peek();
            if (cPeek == c) {
                return;
            }
            if (!Character.isWhitespace(cPeek)) {
                throw new IllegalStateException("Unexpected '" + cPeek + " while seeking '" + c + "'");
            }
            source.next();
        }
        throw new IllegalStateException("Expected '" + c + "'");
    }

    public void setStringBufferSize(int i) {
        this._stringBufferSize = i;
    }

    public String toJSON(Object obj) {
        StringBuilder sb = new StringBuilder(getStringBufferSize());
        append(sb, obj);
        return sb.toString();
    }

    @Deprecated
    public void appendString(StringBuffer stringBuffer, String str) {
        appendString((Appendable) stringBuffer, str);
    }

    @Deprecated
    public void appendNull(StringBuffer stringBuffer) {
        appendNull((Appendable) stringBuffer);
    }

    public void appendJSON(Appendable appendable, final Convertor convertor, final Object obj) {
        appendJSON(appendable, new Convertible() { // from class: org.eclipse.jetty.util.ajax.JSON.1
            @Override // org.eclipse.jetty.util.ajax.JSON.Convertible
            public void fromJSON(Map map) {
            }

            @Override // org.eclipse.jetty.util.ajax.JSON.Convertible
            public void toJSON(Output output) {
                convertor.toJSON(obj, output);
            }
        });
    }

    @Deprecated
    public void appendJSON(StringBuffer stringBuffer, Convertible convertible) {
        appendJSON((Appendable) stringBuffer, convertible);
    }

    @Deprecated
    public void appendJSON(StringBuffer stringBuffer, Convertor convertor, Object obj) {
        appendJSON((Appendable) stringBuffer, convertor, obj);
    }

    @Deprecated
    public void appendJSON(StringBuffer stringBuffer, Generator generator) {
        generator.addJSON(stringBuffer);
    }

    public void appendJSON(Appendable appendable, Generator generator) {
        generator.addJSON(appendable);
    }

    public static String toString(Map map) {
        JSON json = DEFAULT;
        StringBuilder sb = new StringBuilder(json.getStringBufferSize());
        json.appendMap(sb, (Map<?, ?>) map);
        return sb.toString();
    }

    @Deprecated
    public void appendNumber(StringBuffer stringBuffer, Number number) {
        appendNumber((Appendable) stringBuffer, number);
    }

    public static String toString(Object[] objArr) {
        JSON json = DEFAULT;
        StringBuilder sb = new StringBuilder(json.getStringBufferSize());
        json.appendArray(sb, objArr);
        return sb.toString();
    }

    public String toString(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2);
    }

    @Deprecated
    public void appendBoolean(StringBuffer stringBuffer, Boolean bool) {
        appendBoolean((Appendable) stringBuffer, bool);
    }

    @Deprecated
    public void appendArray(StringBuffer stringBuffer, Collection collection) {
        appendArray((Appendable) stringBuffer, collection);
    }

    public final class ConvertableOutput implements Output {
        private final Appendable _buffer;

        /* JADX INFO: renamed from: c */
        char f9521c;

        private ConvertableOutput(Appendable appendable) {
            this.f9521c = '{';
            this._buffer = appendable;
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Output
        public void add(String str, boolean z) {
            try {
                char c = this.f9521c;
                if (c == 0) {
                    throw new IllegalStateException();
                }
                this._buffer.append(c);
                QuotedStringTokenizer.quote(this._buffer, str);
                this._buffer.append(':');
                JSON.this.appendBoolean(this._buffer, z ? Boolean.TRUE : Boolean.FALSE);
                this.f9521c = ',';
            } catch (IOException e) {
                aag0.a(e);
            }
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Output
        public void addClass(Class cls) {
            try {
                char c = this.f9521c;
                if (c == 0) {
                    throw new IllegalStateException();
                }
                this._buffer.append(c);
                this._buffer.append("\"class\":");
                JSON.this.append(this._buffer, cls.getName());
                this.f9521c = ',';
            } catch (IOException e) {
                aag0.a(e);
            }
        }

        public void complete() {
            try {
                char c = this.f9521c;
                if (c == '{') {
                    this._buffer.append("{}");
                } else if (c != 0) {
                    this._buffer.append("}");
                }
            } catch (IOException e) {
                aag0.a(e);
            }
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Output
        public void add(String str, Object obj) {
            try {
                char c = this.f9521c;
                if (c != 0) {
                    this._buffer.append(c);
                    QuotedStringTokenizer.quote(this._buffer, str);
                    this._buffer.append(':');
                    JSON.this.append(this._buffer, obj);
                    this.f9521c = ',';
                    return;
                }
                throw new IllegalStateException();
            } catch (IOException e) {
                aag0.a(e);
            }
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Output
        public void add(String str, double d) {
            try {
                char c = this.f9521c;
                if (c != 0) {
                    this._buffer.append(c);
                    QuotedStringTokenizer.quote(this._buffer, str);
                    this._buffer.append(':');
                    JSON.this.appendNumber(this._buffer, new Double(d));
                    this.f9521c = ',';
                    return;
                }
                throw new IllegalStateException();
            } catch (IOException e) {
                aag0.a(e);
            }
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Output
        public void add(String str, long j) {
            try {
                char c = this.f9521c;
                if (c != 0) {
                    this._buffer.append(c);
                    QuotedStringTokenizer.quote(this._buffer, str);
                    this._buffer.append(':');
                    JSON.this.appendNumber(this._buffer, Long.valueOf(j));
                    this.f9521c = ',';
                    return;
                }
                throw new IllegalStateException();
            } catch (IOException e) {
                aag0.a(e);
            }
        }

        @Override // org.eclipse.jetty.util.ajax.JSON.Output
        public void add(Object obj) {
            if (this.f9521c != 0) {
                JSON.this.append(this._buffer, obj);
                this.f9521c = (char) 0;
            } else {
                ohg0.a();
            }
        }
    }

    @Deprecated
    public void appendArray(StringBuffer stringBuffer, Object obj) {
        appendArray((Appendable) stringBuffer, obj);
    }

    public void appendArray(Appendable appendable, Object obj) {
        try {
            if (obj == null) {
                appendNull(appendable);
                return;
            }
            appendable.append('[');
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    appendable.append(',');
                }
                append(appendable, Array.get(obj, i));
            }
            appendable.append(']');
        } catch (IOException e) {
            aag0.a(e);
        }
    }

    @Deprecated
    public void appendMap(StringBuffer stringBuffer, Map<?, ?> map) {
        appendMap((Appendable) stringBuffer, map);
    }

    public char seekTo(String str, Source source) {
        while (source.hasNext()) {
            char cPeek = source.peek();
            if (str.indexOf(cPeek) >= 0) {
                return cPeek;
            }
            if (Character.isWhitespace(cPeek)) {
                source.next();
            } else {
                throw new IllegalStateException("Unexpected '" + cPeek + "' while seeking one of '" + str + "'");
            }
        }
        xjw.a("Expected one of '", str, "'");
        return (char) 0;
    }

    @Deprecated
    public void append(StringBuffer stringBuffer, Object obj) {
        append((Appendable) stringBuffer, obj);
    }

    public static Object parse(String str, boolean z) {
        return DEFAULT.parse(new StringSource(str), z);
    }

    public static Object parse(Reader reader) throws IOException {
        return DEFAULT.parse((Source) new ReaderSource(reader), false);
    }

    public static Object parse(Reader reader, boolean z) throws IOException {
        return DEFAULT.parse(new ReaderSource(reader), z);
    }

    @Deprecated
    public static Object parse(InputStream inputStream) throws IOException {
        return DEFAULT.parse((Source) new StringSource(C0746IO.toString(inputStream)), false);
    }

    @Deprecated
    public static Object parse(InputStream inputStream, boolean z) throws IOException {
        return DEFAULT.parse(new StringSource(C0746IO.toString(inputStream)), z);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    public Object parse(Source source, boolean z) {
        if (!z) {
            return parse(source);
        }
        Object obj = null;
        char c = 1;
        byte b = 0;
        while (source.hasNext()) {
            char cPeek = source.peek();
            if (b == 1) {
                if (cPeek != '*') {
                    if (cPeek == '/') {
                        b = -1;
                    }
                } else if (c == 1) {
                    b = 0;
                    c = 2;
                } else {
                    b = 2;
                }
                source.next();
            } else if (b > 1) {
                if (cPeek == '*') {
                    b = 3;
                } else if (cPeek == '/' && b == 3) {
                    if (c == 2) {
                        break;
                    }
                    b = 0;
                } else {
                    b = 2;
                }
                source.next();
            } else {
                if (b < 0) {
                    if (cPeek == '\n' || cPeek == '\r') {
                        b = 0;
                    }
                } else if (!Character.isWhitespace(cPeek)) {
                    if (cPeek == '/') {
                        b = 1;
                    } else if (cPeek == '*') {
                        b = 3;
                    } else if (obj == null) {
                        obj = parse(source);
                    }
                }
                source.next();
            }
        }
        return obj;
    }

    public static Object parse(String str) {
        return DEFAULT.parse((Source) new StringSource(str), false);
    }
}

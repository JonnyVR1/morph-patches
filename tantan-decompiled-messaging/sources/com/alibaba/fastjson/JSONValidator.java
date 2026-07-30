package com.alibaba.fastjson;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import p149l.riq;

/* JADX INFO: loaded from: classes.dex */
public abstract class JSONValidator implements Cloneable {

    /* JADX INFO: renamed from: ch */
    protected char f3867ch;
    protected boolean eof;
    protected Type type;
    protected int pos = -1;
    protected int count = 0;
    protected boolean supportMultiValue = true;

    public static class ReaderValidator extends JSONValidator {
        private static final ThreadLocal<char[]> bufLocal = new ThreadLocal<>();
        private char[] buf;

        /* JADX INFO: renamed from: r */
        final Reader f3868r;
        private int end = -1;
        private int readCount = 0;

        public ReaderValidator(Reader reader) {
            this.f3868r = reader;
            ThreadLocal<char[]> threadLocal = bufLocal;
            char[] cArr = threadLocal.get();
            this.buf = cArr;
            if (cArr != null) {
                threadLocal.set(null);
            } else {
                this.buf = new char[8192];
            }
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void close() throws IOException {
            bufLocal.set(this.buf);
            this.f3868r.close();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void error() {
            throw new JSONException("error, readCount " + this.readCount + ", valueCount : " + this.count + ", pos " + this.pos);
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i = this.pos;
            if (i < this.end) {
                char[] cArr = this.buf;
                int i2 = i + 1;
                this.pos = i2;
                this.f3867ch = cArr[i2];
                return;
            }
            if (this.eof) {
                return;
            }
            try {
                Reader reader = this.f3868r;
                char[] cArr2 = this.buf;
                int i3 = reader.read(cArr2, 0, cArr2.length);
                this.readCount++;
                if (i3 > 0) {
                    this.f3867ch = this.buf[0];
                    this.pos = 0;
                    this.end = i3 - 1;
                } else {
                    if (i3 == -1) {
                        this.pos = 0;
                        this.end = 0;
                        this.buf = null;
                        this.f3867ch = (char) 0;
                        this.eof = true;
                        return;
                    }
                    this.pos = 0;
                    this.end = 0;
                    this.buf = null;
                    this.f3867ch = (char) 0;
                    this.eof = true;
                    riq.m179531a("read error");
                }
            } catch (IOException unused) {
                riq.m179531a("read error");
            }
        }
    }

    public enum Type {
        Object,
        Array,
        Value
    }

    public static class UTF16Validator extends JSONValidator {
        private final String str;

        public UTF16Validator(String str) {
            this.str = str;
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i = this.pos + 1;
            this.pos = i;
            if (i < this.str.length()) {
                this.f3867ch = this.str.charAt(this.pos);
            } else {
                this.f3867ch = (char) 0;
                this.eof = true;
            }
        }
    }

    public static class UTF8InputStreamValidator extends JSONValidator {
        private static final ThreadLocal<byte[]> bufLocal = new ThreadLocal<>();
        private byte[] buf;

        /* JADX INFO: renamed from: is */
        private final InputStream f3869is;
        private int end = -1;
        private int readCount = 0;

        public UTF8InputStreamValidator(InputStream inputStream) {
            this.f3869is = inputStream;
            ThreadLocal<byte[]> threadLocal = bufLocal;
            byte[] bArr = threadLocal.get();
            this.buf = bArr;
            if (bArr != null) {
                threadLocal.set(null);
            } else {
                this.buf = new byte[8192];
            }
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void close() throws IOException {
            bufLocal.set(this.buf);
            this.f3869is.close();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void error() {
            throw new JSONException("error, readCount " + this.readCount + ", valueCount : " + this.count + ", pos " + this.pos);
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i = this.pos;
            if (i < this.end) {
                byte[] bArr = this.buf;
                int i2 = i + 1;
                this.pos = i2;
                this.f3867ch = (char) bArr[i2];
                return;
            }
            if (this.eof) {
                return;
            }
            try {
                InputStream inputStream = this.f3869is;
                byte[] bArr2 = this.buf;
                int i3 = inputStream.read(bArr2, 0, bArr2.length);
                this.readCount++;
                if (i3 > 0) {
                    this.f3867ch = (char) this.buf[0];
                    this.pos = 0;
                    this.end = i3 - 1;
                } else {
                    if (i3 == -1) {
                        this.pos = 0;
                        this.end = 0;
                        this.buf = null;
                        this.f3867ch = (char) 0;
                        this.eof = true;
                        return;
                    }
                    this.pos = 0;
                    this.end = 0;
                    this.buf = null;
                    this.f3867ch = (char) 0;
                    this.eof = true;
                    riq.m179531a("read error");
                }
            } catch (IOException unused) {
                riq.m179531a("read error");
            }
        }
    }

    public static class UTF8Validator extends JSONValidator {
        private final byte[] bytes;

        public UTF8Validator(byte[] bArr) {
            this.bytes = bArr;
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i = this.pos + 1;
            this.pos = i;
            byte[] bArr = this.bytes;
            if (i < bArr.length) {
                this.f3867ch = (char) bArr[i];
            } else {
                this.f3867ch = (char) 0;
                this.eof = true;
            }
        }
    }

    public static JSONValidator from(String str) {
        return new UTF16Validator(str);
    }

    public static JSONValidator fromUtf8(byte[] bArr) {
        return new UTF8Validator(bArr);
    }

    public static final boolean isWhiteSpace(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f' || c == '\b';
    }

    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    public void any() {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10 = this.f3867ch;
        if (c10 != '\"') {
            if (c10 != '+' && c10 != '-') {
                if (c10 != '[') {
                    if (c10 == 'f') {
                        next();
                        if (this.f3867ch != 'a') {
                            error();
                        }
                        next();
                        if (this.f3867ch != 'l') {
                            error();
                        }
                        next();
                        if (this.f3867ch != 's') {
                            error();
                        }
                        next();
                        if (this.f3867ch != 'e') {
                            error();
                        }
                        next();
                        if (!isWhiteSpace(this.f3867ch) || (c7 = this.f3867ch) == ',' || c7 == ']' || c7 == '}' || c7 == 0) {
                            this.type = Type.Value;
                            return;
                        }
                        error();
                        next();
                        if (this.f3867ch != 'u') {
                            error();
                        }
                        next();
                        if (this.f3867ch != 'l') {
                            error();
                        }
                        next();
                        if (this.f3867ch != 'l') {
                            error();
                        }
                        next();
                        if (!isWhiteSpace(this.f3867ch) || (c8 = this.f3867ch) == ',' || c8 == ']' || c8 == '}' || c8 == 0) {
                            this.type = Type.Value;
                            return;
                        }
                        error();
                    } else {
                        if (c10 == 'n') {
                            next();
                            if (this.f3867ch != 'u') {
                                error();
                            }
                            next();
                            if (this.f3867ch != 'l') {
                                error();
                            }
                            next();
                            if (this.f3867ch != 'l') {
                                error();
                            }
                            next();
                            if (isWhiteSpace(this.f3867ch)) {
                            }
                            this.type = Type.Value;
                            return;
                        }
                        if (c10 == 't') {
                            next();
                            if (this.f3867ch != 'r') {
                                error();
                            }
                            next();
                            if (this.f3867ch != 'u') {
                                error();
                            }
                            next();
                            if (this.f3867ch != 'e') {
                                error();
                            }
                            next();
                            if (isWhiteSpace(this.f3867ch) || (c9 = this.f3867ch) == ',' || c9 == ']' || c9 == '}' || c9 == 0) {
                                this.type = Type.Value;
                                return;
                            }
                            error();
                            next();
                            if (this.f3867ch != 'a') {
                                error();
                            }
                            next();
                            if (this.f3867ch != 'l') {
                                error();
                            }
                            next();
                            if (this.f3867ch != 's') {
                                error();
                            }
                            next();
                            if (this.f3867ch != 'e') {
                                error();
                            }
                            next();
                            if (isWhiteSpace(this.f3867ch)) {
                            }
                            this.type = Type.Value;
                            return;
                        }
                        if (c10 != '{') {
                            switch (c10) {
                            }
                            return;
                        }
                        next();
                        skipWhiteSpace();
                        if (this.f3867ch == '}') {
                            next();
                            this.type = Type.Object;
                            return;
                        }
                        while (true) {
                            if (this.f3867ch == '\"') {
                                fieldName();
                            } else {
                                error();
                            }
                            skipWhiteSpace();
                            if (this.f3867ch == ':') {
                                next();
                            } else {
                                error();
                            }
                            skipWhiteSpace();
                            any();
                            skipWhiteSpace();
                            char c11 = this.f3867ch;
                            if (c11 == ',') {
                                next();
                                skipWhiteSpace();
                            } else if (c11 == '}') {
                                next();
                                this.type = Type.Object;
                                return;
                            }
                        }
                    }
                    error();
                    return;
                }
                next();
                skipWhiteSpace();
                if (this.f3867ch == ']') {
                    next();
                    this.type = Type.Array;
                    return;
                }
                while (true) {
                    any();
                    skipWhiteSpace();
                    char c12 = this.f3867ch;
                    if (c12 == ',') {
                        next();
                        skipWhiteSpace();
                    } else {
                        if (c12 == ']') {
                            next();
                            this.type = Type.Array;
                            return;
                        }
                        error();
                    }
                }
            }
            if (c10 == '-' || c10 == '+') {
                next();
                skipWhiteSpace();
                char c13 = this.f3867ch;
                if (c13 < '0' || c13 > '9') {
                    error();
                }
            }
            do {
                next();
                c = this.f3867ch;
                if (c >= '0') {
                }
                if (c == '.') {
                    next();
                    while (true) {
                        c6 = this.f3867ch;
                        if (c6 < '0' && c6 <= '9') {
                            next();
                        }
                    }
                }
                c2 = this.f3867ch;
                if (c2 != 'e' || c2 == 'E') {
                    next();
                    c3 = this.f3867ch;
                    if (c3 != '-' || c3 == '+') {
                        next();
                    }
                    c4 = this.f3867ch;
                    if (c4 >= '0' || c4 > '9') {
                        error();
                    } else {
                        next();
                    }
                    do {
                        next();
                        c5 = this.f3867ch;
                        if (c5 >= '0') {
                        }
                    } while (c5 <= '9');
                }
                this.type = Type.Value;
                return;
            } while (c <= '9');
            if (c == '.') {
                next();
                while (true) {
                    c6 = this.f3867ch;
                    if (c6 < '0') {
                    }
                    next();
                }
            }
            c2 = this.f3867ch;
            if (c2 != 'e') {
                next();
                c3 = this.f3867ch;
                if (c3 != '-') {
                    next();
                } else {
                    next();
                }
                c4 = this.f3867ch;
                if (c4 >= '0') {
                    error();
                } else {
                    error();
                }
                do {
                    next();
                    c5 = this.f3867ch;
                    if (c5 >= '0') {
                    }
                } while (c5 <= '9');
            } else {
                next();
                c3 = this.f3867ch;
                if (c3 != '-') {
                    next();
                } else {
                    next();
                }
                c4 = this.f3867ch;
                if (c4 >= '0') {
                    error();
                } else {
                    error();
                }
                do {
                    next();
                    c5 = this.f3867ch;
                    if (c5 >= '0') {
                    }
                } while (c5 <= '9');
            }
            this.type = Type.Value;
            return;
        }
        next();
        while (true) {
            char c14 = this.f3867ch;
            if (c14 == '\\') {
                next();
                if (this.f3867ch == 'u') {
                    next();
                    next();
                    next();
                    next();
                    next();
                } else {
                    next();
                }
            } else {
                if (c14 == '\"') {
                    next();
                    this.type = Type.Value;
                    return;
                }
                next();
            }
        }
    }

    public void close() throws IOException {
    }

    public void error() {
        throw new JSONException("error : " + this.pos);
    }

    public void fieldName() {
        next();
        while (true) {
            char c = this.f3867ch;
            if (c == '\\') {
                next();
                if (this.f3867ch == 'u') {
                    next();
                    next();
                    next();
                    next();
                    next();
                } else {
                    next();
                }
            } else {
                if (c == '\"') {
                    next();
                    return;
                }
                next();
            }
        }
    }

    public Type getType() {
        return this.type;
    }

    public abstract void next();

    public void skipWhiteSpace() {
        while (isWhiteSpace(this.f3867ch)) {
            next();
        }
    }

    public boolean validate() {
        do {
            any();
            this.count++;
            if (!this.supportMultiValue || this.eof) {
                break;
            }
            skipWhiteSpace();
        } while (!this.eof);
        return true;
    }

    public static JSONValidator from(Reader reader) {
        return new ReaderValidator(reader);
    }

    public static JSONValidator fromUtf8(InputStream inputStream) {
        return new UTF8InputStreamValidator(inputStream);
    }
}

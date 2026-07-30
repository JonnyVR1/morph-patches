package org.eclipse.jetty.util;

import com.meituan.robust.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import javax.servlet.ServletException;
import p153l.lu10;
import p153l.m5j;
import p153l.qg60;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class MultiPartInputStream {
    public static final lu10 __DEFAULT_MULTIPART_CONFIG = new lu10(System.getProperty("java.io.tmpdir"));
    protected lu10 _config;
    protected String _contentType;
    protected File _contextTmpDir;
    protected boolean _deleteOnExit;
    protected InputStream _in;
    protected MultiMap<String> _parts;
    protected File _tmpDir;

    public static class Base64InputStream extends InputStream {
        byte[] _buffer;
        BufferedReader _in;
        String _line;
        int _pos;

        public Base64InputStream(InputStream inputStream) {
            this._in = new BufferedReader(new InputStreamReader(inputStream));
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            byte[] bArr = this._buffer;
            if (bArr == null || this._pos >= bArr.length) {
                String line = this._in.readLine();
                this._line = line;
                if (line == null) {
                    return -1;
                }
                boolean zStartsWith = line.startsWith("--");
                String str = this._line;
                if (zStartsWith) {
                    this._buffer = (str + "\r\n").getBytes();
                } else if (str.length() == 0) {
                    this._buffer = "\r\n".getBytes();
                } else {
                    this._buffer = B64Code.decode(this._line);
                }
                this._pos = 0;
            }
            byte[] bArr2 = this._buffer;
            int i = this._pos;
            this._pos = i + 1;
            return bArr2[i];
        }
    }

    public MultiPartInputStream(InputStream inputStream, String str, lu10 lu10Var, File file) {
        this._in = new BufferedInputStream(inputStream);
        this._contentType = str;
        this._config = lu10Var;
        this._contextTmpDir = file;
        if (file == null) {
            this._contextTmpDir = new File(System.getProperty("java.io.tmpdir"));
        }
        if (this._config == null) {
            this._config = new lu10(this._contextTmpDir.getAbsolutePath());
        }
    }

    private String value(String str, boolean z) {
        int iIndexOf;
        String strTrim = str.substring(str.indexOf(61) + 1).trim();
        int iIndexOf2 = strTrim.indexOf(59);
        if (iIndexOf2 > 0) {
            strTrim = strTrim.substring(0, iIndexOf2);
        }
        if (strTrim.startsWith("\"")) {
            return strTrim.substring(1, strTrim.indexOf(34, 1));
        }
        return (!z || (iIndexOf = strTrim.indexOf(32)) <= 0) ? strTrim : strTrim.substring(0, iIndexOf);
    }

    public void deleteParts() throws MultiException {
        Collection<qg60> parsedParts = getParsedParts();
        MultiException multiException = new MultiException();
        Iterator<qg60> it = parsedParts.iterator();
        while (it.hasNext()) {
            try {
                ((MultiPart) it.next()).cleanUp();
            } catch (Exception e) {
                multiException.add(e);
            }
        }
        this._parts.clear();
        multiException.ifExceptionThrowMulti();
    }

    public Collection<qg60> getParsedParts() {
        MultiMap<String> multiMap = this._parts;
        if (multiMap == null) {
            return Collections.EMPTY_LIST;
        }
        Collection<Object> collectionValues = multiMap.values();
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.addAll(LazyList.getList(it.next(), false));
        }
        return arrayList;
    }

    public qg60 getPart(String str) throws ServletException, IOException {
        parse();
        return (qg60) this._parts.getValue(str, 0);
    }

    public Collection<qg60> getParts() throws ServletException, IOException {
        parse();
        Collection<Object> collectionValues = this._parts.values();
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.addAll(LazyList.getList(it.next(), false));
        }
        return arrayList;
    }

    public boolean isDeleteOnExit() {
        return this._deleteOnExit;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0233 A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:72:0x018b, B:74:0x0199, B:77:0x01a6, B:78:0x01c3, B:85:0x01d0, B:87:0x01d3, B:89:0x01d7, B:92:0x01e2, B:94:0x01e9, B:96:0x01ee, B:97:0x01f2, B:99:0x01fc, B:102:0x0206, B:109:0x0218, B:111:0x021f, B:112:0x0222, B:118:0x0233, B:120:0x023a, B:133:0x0259, B:106:0x020f, B:69:0x017d), top: B:166:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:120:0x023a A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:72:0x018b, B:74:0x0199, B:77:0x01a6, B:78:0x01c3, B:85:0x01d0, B:87:0x01d3, B:89:0x01d7, B:92:0x01e2, B:94:0x01e9, B:96:0x01ee, B:97:0x01f2, B:99:0x01fc, B:102:0x0206, B:109:0x0218, B:111:0x021f, B:112:0x0222, B:118:0x0233, B:120:0x023a, B:133:0x0259, B:106:0x020f, B:69:0x017d), top: B:166:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0241  */
    /* JADX WARN: Code duplicated, block: B:124:0x0244  */
    /* JADX WARN: Code duplicated, block: B:129:0x024c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0250  */
    /* JADX WARN: Code duplicated, block: B:191:0x0251 A[SYNTHETIC] */
    public void parse() throws ServletException, IOException {
        String str;
        long j;
        int i;
        boolean z;
        if (this._parts != null) {
            return;
        }
        this._parts = new MultiMap<>();
        String str2 = this._contentType;
        if (str2 == null || !str2.startsWith("multipart/form-data")) {
            return;
        }
        if (this._config.m155839b() == null || "".equals(this._config.m155839b())) {
            this._tmpDir = this._contextTmpDir;
        } else {
            File file = new File(this._config.m155839b());
            if (file.isAbsolute()) {
                this._tmpDir = file;
            } else {
                this._tmpDir = new File(this._contextTmpDir, this._config.m155839b());
            }
        }
        if (!this._tmpDir.exists()) {
            this._tmpDir.mkdirs();
        }
        StringBuilder sb = new StringBuilder("--");
        String str3 = this._contentType;
        boolean z2 = true;
        sb.append(QuotedStringTokenizer.unquote(value(str3.substring(str3.indexOf("boundary=")), true).trim()));
        String string = sb.toString();
        byte[] bytes = string.concat("--").getBytes("ISO-8859-1");
        byte[] line = TypeUtil.readLine(this._in);
        String str4 = line == null ? null : new String(line, "UTF-8");
        if (str4 == null || !str4.equals(string)) {
            zpg0.m220844a("Missing initial multi part boundary");
            return;
        }
        boolean z3 = false;
        long length = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        loop0: while (!z3) {
            MultiMap<String> multiMap = new MultiMap<>();
            while (true) {
                byte[] line2 = TypeUtil.readLine(this._in);
                if (line2 == null) {
                    break loop0;
                }
                if (line2.length == 0) {
                    break;
                }
                boolean z4 = z3;
                boolean z5 = z2;
                length += (long) line2.length;
                if (this._config.m155841d() > 0 && length > this._config.m155841d()) {
                    throw new IllegalStateException("Request exceeds maxRequestSize (" + this._config.m155841d() + ")");
                }
                String str8 = new String(line2, "UTF-8");
                int iIndexOf = str8.indexOf(58, 0);
                if (iIndexOf > 0) {
                    String lowerCase = str8.substring(0, iIndexOf).trim().toLowerCase(Locale.ENGLISH);
                    String strTrim = str8.substring(iIndexOf + 1, str8.length()).trim();
                    multiMap.put(lowerCase, strTrim);
                    if (lowerCase.equalsIgnoreCase("content-disposition")) {
                        str5 = strTrim;
                    }
                    if (lowerCase.equalsIgnoreCase("content-type")) {
                        str7 = strTrim;
                    }
                    if (lowerCase.equals("content-transfer-encoding")) {
                        str6 = strTrim;
                    }
                }
                z2 = z5;
                z3 = z4;
            }
            if (str5 == null) {
                zpg0.m220844a("Missing content-disposition");
                return;
            }
            QuotedStringTokenizer quotedStringTokenizer = new QuotedStringTokenizer(str5, Constants.PACKNAME_END);
            boolean z6 = false;
            String strValue = null;
            String strValue2 = null;
            while (quotedStringTokenizer.hasMoreTokens()) {
                String strTrim2 = quotedStringTokenizer.nextToken().trim();
                String lowerCase2 = strTrim2.toLowerCase(Locale.ENGLISH);
                boolean z7 = z3;
                if (strTrim2.startsWith("form-data")) {
                    z6 = true;
                } else if (lowerCase2.startsWith("name=")) {
                    strValue = value(strTrim2, true);
                } else if (lowerCase2.startsWith("filename=")) {
                    strValue2 = value(strTrim2, false);
                }
                z3 = z7;
            }
            boolean z8 = z3;
            if (z6 && (str = strValue) != null) {
                if ("base64".equalsIgnoreCase(str6)) {
                    this._in = new Base64InputStream(this._in);
                } else if ("quoted-printable".equalsIgnoreCase(str6)) {
                    this._in = new FilterInputStream(this._in) { // from class: org.eclipse.jetty.util.MultiPartInputStream.1
                        @Override // java.io.FilterInputStream, java.io.InputStream
                        public int read() throws IOException {
                            int i2 = ((FilterInputStream) this).in.read();
                            if (i2 < 0 || i2 != 61) {
                                return i2;
                            }
                            int i3 = ((FilterInputStream) this).in.read();
                            int i4 = ((FilterInputStream) this).in.read();
                            if (i3 >= 0 && i4 >= 0) {
                                return Integer.parseInt(new String(new char[]{(char) i3, (char) i4}), 16);
                            }
                            zpg0.m220844a("Unexpected end to quoted-printable byte");
                            return 0;
                        }
                    };
                }
                MultiPart multiPart = new MultiPart(str, strValue2);
                multiPart.setHeaders(multiMap);
                multiPart.setContentType(str7);
                this._parts.add(str, multiPart);
                multiPart.open();
                int i2 = -2;
                int i3 = -2;
                boolean z9 = false;
                boolean z10 = false;
                while (true) {
                    int i4 = i3;
                    j = length;
                    boolean z11 = z10;
                    boolean z12 = z9;
                    i = 0;
                    while (true) {
                        int i5 = i4 != i2 ? i4 : this._in.read();
                        boolean z13 = z12;
                        boolean z14 = z11;
                        if (i5 != -1) {
                            try {
                                j++;
                                if (this._config.m155841d() > 0 && j > this._config.m155841d()) {
                                    throw new IllegalStateException("Request exceeds maxRequestSize (" + this._config.m155841d() + ")");
                                }
                                int i6 = 13;
                                if (i5 != 13) {
                                    if (i5 == 10) {
                                        i6 = 13;
                                    } else {
                                        if (i < 0 || i >= bytes.length || i5 != bytes[i]) {
                                            if (z13) {
                                                multiPart.write(13);
                                            }
                                            if (z14) {
                                                multiPart.write(10);
                                            }
                                            if (i > 0) {
                                                multiPart.write(bytes, 0, i);
                                            }
                                            multiPart.write(i5);
                                            i = -1;
                                            i2 = -2;
                                            z12 = false;
                                            z11 = false;
                                        } else {
                                            i++;
                                            z12 = z13;
                                            z11 = z14;
                                            i2 = -2;
                                        }
                                        i4 = -2;
                                    }
                                }
                                i4 = i5 == i6 ? this._in.read() : -2;
                            } catch (Throwable th) {
                                multiPart.close();
                                throw th;
                            }
                        }
                        if (i <= 0 || i >= bytes.length - 2) {
                            z = true;
                            if (i == bytes.length - 1) {
                            }
                            if (i <= 0 || i5 == -1) {
                                break;
                                break;
                            }
                            if (z13) {
                                multiPart.write(13);
                            }
                            if (z14) {
                                multiPart.write(10);
                            }
                            if (i5 == 13) {
                                z9 = z;
                            } else {
                                z9 = false;
                            }
                            if (i5 != 10 || i4 == 10) {
                                z10 = z;
                            } else {
                                z10 = false;
                            }
                            if (i4 == 10) {
                                i4 = -2;
                            }
                            long j2 = j;
                            i3 = i4;
                            length = j2;
                            i2 = -2;
                        } else {
                            z = true;
                        }
                        if (z13) {
                            multiPart.write(13);
                        }
                        if (z14) {
                            multiPart.write(10);
                        }
                        multiPart.write(bytes, 0, i);
                        i = -1;
                        z13 = false;
                        z14 = false;
                        if (i <= 0) {
                            break;
                        }
                        if (z13) {
                            multiPart.write(13);
                        }
                        if (z14) {
                            multiPart.write(10);
                        }
                        if (i5 == 13) {
                            z9 = z;
                        } else {
                            z9 = false;
                        }
                        if (i5 != 10) {
                            z10 = z;
                        } else {
                            z10 = z;
                        }
                        if (i4 == 10) {
                            i4 = -2;
                        }
                        long j3 = j;
                        i3 = i4;
                        length = j3;
                        i2 = -2;
                    }
                }
                if (i == bytes.length) {
                    z8 = z;
                }
                multiPart.close();
                length = j;
                z2 = z;
                z3 = z8;
            } else {
                z3 = z8;
                z2 = true;
            }
        }
        if (z3) {
            return;
        }
        zpg0.m220844a("Incomplete parts");
    }

    public void setDeleteOnExit(boolean z) {
        this._deleteOnExit = z;
    }

    public class MultiPart implements qg60 {
        protected ByteArrayOutputStream2 _bout;
        protected String _contentType;
        protected File _file;
        protected String _filename;
        protected MultiMap<String> _headers;
        protected String _name;
        protected OutputStream _out;
        protected long _size = 0;
        protected boolean _temporary = true;

        public MultiPart(String str, String str2) throws IOException {
            this._name = str;
            this._filename = str2;
        }

        public void cleanUp() throws IOException {
            File file;
            if (this._temporary && (file = this._file) != null && file.exists()) {
                this._file.delete();
            }
        }

        public void close() throws IOException {
            this._out.close();
        }

        public void createFile() throws IOException {
            OutputStream outputStream;
            File fileCreateTempFile = File.createTempFile("MultiPart", "", MultiPartInputStream.this._tmpDir);
            this._file = fileCreateTempFile;
            if (MultiPartInputStream.this._deleteOnExit) {
                fileCreateTempFile.deleteOnExit();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this._file));
            if (this._size > 0 && (outputStream = this._out) != null) {
                outputStream.flush();
                this._bout.writeTo(bufferedOutputStream);
                this._out.close();
                this._bout = null;
            }
            this._out = bufferedOutputStream;
        }

        public void delete() throws IOException {
            File file = this._file;
            if (file == null || !file.exists()) {
                return;
            }
            this._file.delete();
        }

        public byte[] getBytes() {
            ByteArrayOutputStream2 byteArrayOutputStream2 = this._bout;
            if (byteArrayOutputStream2 != null) {
                return byteArrayOutputStream2.toByteArray();
            }
            return null;
        }

        public String getContentDispositionFilename() {
            return this._filename;
        }

        public String getContentType() {
            return this._contentType;
        }

        public File getFile() {
            return this._file;
        }

        public String getHeader(String str) {
            if (str == null) {
                return null;
            }
            return (String) this._headers.getValue(str.toLowerCase(Locale.ENGLISH), 0);
        }

        public Collection<String> getHeaderNames() {
            return this._headers.keySet();
        }

        public Collection<String> getHeaders(String str) {
            return this._headers.getValues(str);
        }

        public InputStream getInputStream() throws IOException {
            return this._file != null ? new BufferedInputStream(new FileInputStream(this._file)) : new ByteArrayInputStream(this._bout.getBuf(), 0, this._bout.size());
        }

        public String getName() {
            return this._name;
        }

        public long getSize() {
            return this._size;
        }

        public void open() throws IOException {
            String str = this._filename;
            if (str != null && str.trim().length() > 0) {
                createFile();
                return;
            }
            ByteArrayOutputStream2 byteArrayOutputStream2 = new ByteArrayOutputStream2();
            this._bout = byteArrayOutputStream2;
            this._out = byteArrayOutputStream2;
        }

        public void setContentType(String str) {
            this._contentType = str;
        }

        public void setHeaders(MultiMap<String> multiMap) {
            this._headers = multiMap;
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (MultiPartInputStream.this._config.m155840c() > 0 && this._size + ((long) i2) > MultiPartInputStream.this._config.m155840c()) {
                m5j.m157106a("Multipart Mime part ", this._name, " exceeds max filesize");
                return;
            }
            if (MultiPartInputStream.this._config.m155838a() > 0 && this._size + ((long) i2) > MultiPartInputStream.this._config.m155838a() && this._file == null) {
                createFile();
            }
            this._out.write(bArr, i, i2);
            this._size += (long) i2;
        }

        public void write(int i) throws IOException {
            if (MultiPartInputStream.this._config.m155840c() > 0 && this._size + 1 > MultiPartInputStream.this._config.m155840c()) {
                m5j.m157106a("Multipart Mime part ", this._name, " exceeds max filesize");
                return;
            }
            if (MultiPartInputStream.this._config.m155838a() > 0 && this._size + 1 > MultiPartInputStream.this._config.m155838a() && this._file == null) {
                createFile();
            }
            this._out.write(i);
            this._size++;
        }

        public void write(String str) throws Throwable {
            BufferedOutputStream bufferedOutputStream;
            if (this._file == null) {
                this._temporary = false;
                this._file = new File(MultiPartInputStream.this._tmpDir, str);
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this._file));
                    try {
                        this._bout.writeTo(bufferedOutputStream);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        this._bout = null;
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        this._bout = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = null;
                }
            } else {
                this._temporary = false;
                File file = new File(MultiPartInputStream.this._tmpDir, str);
                if (this._file.renameTo(file)) {
                    this._file = file;
                }
            }
        }
    }
}

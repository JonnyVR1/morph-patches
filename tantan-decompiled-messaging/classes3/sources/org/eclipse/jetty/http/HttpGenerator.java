package org.eclipse.jetty.http;

import java.io.IOException;
import java.io.InterruptedIOException;
import l.ig3;
import l.ohg0;
import l.qkq0;
import org.eclipse.jetty.p004io.Buffer;
import org.eclipse.jetty.p004io.BufferCache;
import org.eclipse.jetty.p004io.BufferUtil;
import org.eclipse.jetty.p004io.Buffers;
import org.eclipse.jetty.p004io.ByteArrayBuffer;
import org.eclipse.jetty.p004io.EndPoint;
import org.eclipse.jetty.p004io.EofException;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HttpGenerator extends AbstractGenerator {
    private static final int CHUNK_SPACE = 12;
    private static final byte[] CONNECTION_;
    private static final byte[] CONNECTION_CLOSE;
    private static final byte[] CONNECTION_KEEP_ALIVE;
    private static final byte[] CONTENT_LENGTH_0;
    private static final byte[] CRLF;
    private static final byte[] LAST_CHUNK;
    private static byte[] SERVER;
    private static final byte[] TRANSFER_ENCODING_CHUNKED;
    private boolean _bufferChunked;
    protected boolean _bypass;
    private boolean _needCRLF;
    private boolean _needEOC;
    private static final Logger LOG = Log.getLogger((Class<?>) HttpGenerator.class);
    private static final Status[] __status = new Status[508];

    public static class Status {
        Buffer _reason;
        Buffer _responseLine;
        Buffer _schemeCode;

        private Status() {
        }
    }

    static {
        int length = HttpVersions.HTTP_1_1_BUFFER.length();
        for (int i = 0; i < __status.length; i++) {
            HttpStatus.Code code = HttpStatus.getCode(i);
            if (code != null) {
                String message = code.getMessage();
                int i2 = length + 5;
                int length2 = message.length() + i2 + 2;
                byte[] bArr = new byte[length2];
                HttpVersions.HTTP_1_1_BUFFER.peek(0, bArr, 0, length);
                bArr[length] = HttpTokens.SPACE;
                bArr[length + 1] = (byte) ((i / 100) + 48);
                bArr[length + 2] = (byte) (((i % 100) / 10) + 48);
                bArr[length + 3] = (byte) ((i % 10) + 48);
                bArr[length + 4] = HttpTokens.SPACE;
                for (int i3 = 0; i3 < message.length(); i3++) {
                    bArr[i2 + i3] = (byte) message.charAt(i3);
                }
                bArr[message.length() + i2] = HttpTokens.CARRIAGE_RETURN;
                bArr[length + 6 + message.length()] = 10;
                Status[] statusArr = __status;
                Status status = new Status();
                statusArr[i] = status;
                status._reason = new ByteArrayBuffer(bArr, i2, (length2 - length) - 7, 0);
                statusArr[i]._schemeCode = new ByteArrayBuffer(bArr, 0, i2, 0);
                statusArr[i]._responseLine = new ByteArrayBuffer(bArr, 0, length2, 0);
            }
        }
        LAST_CHUNK = new byte[]{48, HttpTokens.CARRIAGE_RETURN, 10, HttpTokens.CARRIAGE_RETURN, 10};
        CONTENT_LENGTH_0 = StringUtil.getBytes("Content-Length: 0\r\n");
        CONNECTION_KEEP_ALIVE = StringUtil.getBytes("Connection: keep-alive\r\n");
        CONNECTION_CLOSE = StringUtil.getBytes("Connection: close\r\n");
        CONNECTION_ = StringUtil.getBytes("Connection: ");
        CRLF = StringUtil.getBytes("\r\n");
        TRANSFER_ENCODING_CHUNKED = StringUtil.getBytes("Transfer-Encoding: chunked\r\n");
        SERVER = StringUtil.getBytes("Server: Jetty(7.0.x)\r\n");
    }

    public HttpGenerator(Buffers buffers, EndPoint endPoint) {
        super(buffers, endPoint);
        this._bypass = false;
        this._needCRLF = false;
        this._needEOC = false;
        this._bufferChunked = false;
    }

    private int flushMask() {
        Buffer buffer;
        Buffer buffer2 = this._header;
        int i = 0;
        int i2 = (buffer2 == null || buffer2.length() <= 0) ? 0 : 4;
        Buffer buffer3 = this._buffer;
        int i3 = i2 | ((buffer3 == null || buffer3.length() <= 0) ? 0 : 2);
        if (this._bypass && (buffer = this._content) != null && buffer.length() > 0) {
            i = 1;
        }
        return i3 | i;
    }

    public static Buffer getReasonBuffer(int i) {
        Status[] statusArr = __status;
        Status status = i < statusArr.length ? statusArr[i] : null;
        if (status != null) {
            return status._reason;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x017f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0190  */
    private void prepareBuffers() {
        int length;
        Buffer buffer;
        Buffer buffer2;
        int iSpace;
        byte[] bArr;
        Buffer buffer3;
        Buffer buffer4;
        Buffer buffer5;
        Buffer buffer6;
        if (!this._bufferChunked) {
            if (!this._bypass && (buffer5 = this._content) != null && buffer5.length() > 0 && (buffer6 = this._buffer) != null && buffer6.space() > 0) {
                this._content.skip(this._buffer.put(this._content));
                if (this._content.length() == 0) {
                    this._content = null;
                }
            }
            if (this._contentLength == -2) {
                if (!this._bypass || (!((buffer3 = this._buffer) == null || buffer3.length() == 0) || (buffer4 = this._content) == null)) {
                    Buffer buffer7 = this._buffer;
                    if (buffer7 != null && (length = buffer7.length()) > 0) {
                        this._bufferChunked = true;
                        if (this._buffer.getIndex() == 12) {
                            Buffer buffer8 = this._buffer;
                            int index = buffer8.getIndex() - 2;
                            byte[] bArr2 = HttpTokens.CRLF;
                            buffer8.poke(index, bArr2, 0, 2);
                            Buffer buffer9 = this._buffer;
                            buffer9.setGetIndex(buffer9.getIndex() - 2);
                            BufferUtil.prependHexInt(this._buffer, length);
                            if (this._needCRLF) {
                                Buffer buffer10 = this._buffer;
                                buffer10.poke(buffer10.getIndex() - 2, bArr2, 0, 2);
                                Buffer buffer11 = this._buffer;
                                buffer11.setGetIndex(buffer11.getIndex() - 2);
                                this._needCRLF = false;
                            }
                        } else {
                            if (this._header == null) {
                                this._header = this._buffers.getHeader();
                            }
                            if (this._needCRLF) {
                                if (this._header.length() > 0) {
                                    qkq0.a("EOC");
                                    return;
                                } else {
                                    this._header.put(HttpTokens.CRLF);
                                    this._needCRLF = false;
                                }
                            }
                            BufferUtil.putHexInt(this._header, length);
                            this._header.put(HttpTokens.CRLF);
                        }
                        if (this._buffer.space() >= 2) {
                            this._buffer.put(HttpTokens.CRLF);
                        } else {
                            this._needCRLF = true;
                        }
                    }
                } else {
                    int length2 = buffer4.length();
                    this._bufferChunked = true;
                    if (this._header == null) {
                        this._header = this._buffers.getHeader();
                    }
                    if (this._needCRLF) {
                        if (this._header.length() > 0) {
                            qkq0.a("EOC");
                            return;
                        } else {
                            this._header.put(HttpTokens.CRLF);
                            this._needCRLF = false;
                        }
                    }
                    BufferUtil.putHexInt(this._header, length2);
                    this._header.put(HttpTokens.CRLF);
                    this._needCRLF = true;
                }
                if (this._needEOC && ((buffer = this._content) == null || buffer.length() == 0)) {
                    if (this._needCRLF) {
                        if (this._buffer != null || this._header.space() < 2) {
                            Buffer buffer12 = this._buffer;
                            if (buffer12 != null && buffer12.space() >= 2) {
                                this._buffer.put(HttpTokens.CRLF);
                                this._needCRLF = false;
                            }
                        } else {
                            this._header.put(HttpTokens.CRLF);
                            this._needCRLF = false;
                        }
                    }
                    if (!this._needCRLF && this._needEOC) {
                        if (this._buffer == null) {
                            int iSpace2 = this._header.space();
                            byte[] bArr3 = LAST_CHUNK;
                            if (iSpace2 >= bArr3.length) {
                                if (!this._head) {
                                    this._header.put(bArr3);
                                    this._bufferChunked = true;
                                }
                                this._needEOC = false;
                            } else {
                                buffer2 = this._buffer;
                                if (buffer2 != null) {
                                    iSpace = buffer2.space();
                                    bArr = LAST_CHUNK;
                                    if (iSpace >= bArr.length) {
                                        if (!this._head) {
                                            this._buffer.put(bArr);
                                            this._bufferChunked = true;
                                        }
                                        this._needEOC = false;
                                    }
                                }
                            }
                        } else {
                            buffer2 = this._buffer;
                            if (buffer2 != null) {
                                iSpace = buffer2.space();
                                bArr = LAST_CHUNK;
                                if (iSpace >= bArr.length) {
                                    if (!this._head) {
                                        this._buffer.put(bArr);
                                        this._bufferChunked = true;
                                    }
                                    this._needEOC = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        Buffer buffer13 = this._content;
        if (buffer13 == null || buffer13.length() != 0) {
            return;
        }
        this._content = null;
    }

    public static void setServerVersion(String str) {
        SERVER = StringUtil.getBytes("Server: Jetty(" + str + ")\r\n");
    }

    @Override // org.eclipse.jetty.http.Generator
    public void addContent(Buffer buffer, boolean z) throws IOException {
        Buffer buffer2;
        Buffer buffer3;
        if (this._noContent) {
            qkq0.a("NO CONTENT");
            return;
        }
        if (this._last || this._state == 4) {
            LOG.warn("Ignoring extra content {}", buffer);
            buffer.clear();
            return;
        }
        this._last = z;
        Buffer buffer4 = this._content;
        if ((buffer4 != null && buffer4.length() > 0) || this._bufferChunked) {
            if (this._endp.isOutputShutdown()) {
                throw new EofException();
            }
            flushBuffer();
            Buffer buffer5 = this._content;
            if (buffer5 != null && buffer5.length() > 0) {
                boolean z2 = this._bufferChunked;
                Buffers buffers = this._buffers;
                if (z2) {
                    buffer3 = buffers.getBuffer(this._content.length() + 12 + buffer.length());
                    buffer3.put(this._content);
                    byte[] bArr = HttpTokens.CRLF;
                    buffer3.put(bArr);
                    BufferUtil.putHexInt(buffer3, buffer.length());
                    buffer3.put(bArr);
                    buffer3.put(buffer);
                } else {
                    buffer3 = buffers.getBuffer(this._content.length() + buffer.length());
                    buffer3.put(this._content);
                    buffer3.put(buffer);
                }
                buffer = buffer3;
            }
        }
        this._content = buffer;
        this._contentWritten += (long) buffer.length();
        if (this._head) {
            buffer.clear();
            this._content = null;
            return;
        }
        if (this._endp != null && (((buffer2 = this._buffer) == null || buffer2.length() == 0) && this._content.length() > 0 && (this._last || (isCommitted() && this._content.length() > 1024)))) {
            this._bypass = true;
            return;
        }
        if (this._bufferChunked) {
            return;
        }
        if (this._buffer == null) {
            this._buffer = this._buffers.getBuffer();
        }
        this._content.skip(this._buffer.put(this._content));
        if (this._content.length() == 0) {
            this._content = null;
        }
    }

    @Override // org.eclipse.jetty.http.AbstractGenerator, org.eclipse.jetty.http.Generator
    public void complete() throws IOException {
        if (this._state == 4) {
            return;
        }
        super.complete();
        if (this._state < 3) {
            this._state = 3;
            if (this._contentLength == -2) {
                this._needEOC = true;
            }
        }
        flushBuffer();
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02b2 A[Catch: ArrayIndexOutOfBoundsException -> 0x0082, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0082, blocks: (B:21:0x0037, B:23:0x0052, B:26:0x005c, B:30:0x0085, B:32:0x00a7, B:34:0x00ac, B:78:0x01a0, B:80:0x01a6, B:82:0x01aa, B:85:0x01ce, B:87:0x01e3, B:192:0x0368, B:90:0x01ed, B:99:0x0202, B:101:0x020a, B:103:0x0210, B:104:0x0219, B:106:0x0227, B:107:0x022b, B:108:0x0234, B:110:0x0240, B:117:0x024e, B:118:0x0255, B:122:0x0261, B:124:0x0269, B:125:0x026e, B:131:0x027e, B:133:0x028a, B:132:0x0285, B:134:0x0293, B:136:0x0299, B:137:0x02a0, B:139:0x02a4, B:141:0x02aa, B:143:0x02b2, B:145:0x02b8, B:146:0x02bc, B:148:0x02c4, B:150:0x02ca, B:152:0x02d0, B:154:0x02d8, B:156:0x02e6, B:158:0x02e9, B:160:0x02f7, B:164:0x0301, B:166:0x030c, B:191:0x0362, B:165:0x0307, B:168:0x0313, B:170:0x0317, B:172:0x031d, B:174:0x0325, B:176:0x032b, B:177:0x032f, B:179:0x0337, B:181:0x033d, B:183:0x0344, B:188:0x0352, B:190:0x035d, B:189:0x0358, B:195:0x038b, B:246:0x044c, B:249:0x0454, B:251:0x045b, B:253:0x0467, B:254:0x046d, B:255:0x0474, B:256:0x0475, B:257:0x047c, B:259:0x0484, B:261:0x048b, B:263:0x0491, B:266:0x049b, B:268:0x049f, B:270:0x04a8, B:272:0x04d3, B:274:0x04dc, B:276:0x0507, B:278:0x0524, B:280:0x052a, B:282:0x0530, B:283:0x0537, B:201:0x039b, B:203:0x03a1, B:209:0x03af, B:210:0x03b8, B:211:0x03c4, B:213:0x03ca, B:215:0x03d0, B:221:0x03de, B:222:0x03e3, B:224:0x03e7, B:226:0x03ed, B:228:0x03f3, B:231:0x03fd, B:233:0x0401, B:234:0x0425, B:236:0x042d, B:241:0x0436, B:243:0x043e, B:245:0x0446, B:33:0x00aa, B:35:0x00ba, B:37:0x00be, B:39:0x00c7, B:44:0x00d1, B:45:0x00d7, B:47:0x00de, B:51:0x00e6, B:54:0x011f, B:56:0x0143, B:62:0x016e, B:65:0x0174, B:67:0x017c, B:68:0x017f, B:70:0x0185, B:75:0x0195, B:77:0x019d, B:55:0x0140, B:57:0x014d, B:60:0x0155, B:61:0x015b), top: B:287:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02b8 A[Catch: ArrayIndexOutOfBoundsException -> 0x0082, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0082, blocks: (B:21:0x0037, B:23:0x0052, B:26:0x005c, B:30:0x0085, B:32:0x00a7, B:34:0x00ac, B:78:0x01a0, B:80:0x01a6, B:82:0x01aa, B:85:0x01ce, B:87:0x01e3, B:192:0x0368, B:90:0x01ed, B:99:0x0202, B:101:0x020a, B:103:0x0210, B:104:0x0219, B:106:0x0227, B:107:0x022b, B:108:0x0234, B:110:0x0240, B:117:0x024e, B:118:0x0255, B:122:0x0261, B:124:0x0269, B:125:0x026e, B:131:0x027e, B:133:0x028a, B:132:0x0285, B:134:0x0293, B:136:0x0299, B:137:0x02a0, B:139:0x02a4, B:141:0x02aa, B:143:0x02b2, B:145:0x02b8, B:146:0x02bc, B:148:0x02c4, B:150:0x02ca, B:152:0x02d0, B:154:0x02d8, B:156:0x02e6, B:158:0x02e9, B:160:0x02f7, B:164:0x0301, B:166:0x030c, B:191:0x0362, B:165:0x0307, B:168:0x0313, B:170:0x0317, B:172:0x031d, B:174:0x0325, B:176:0x032b, B:177:0x032f, B:179:0x0337, B:181:0x033d, B:183:0x0344, B:188:0x0352, B:190:0x035d, B:189:0x0358, B:195:0x038b, B:246:0x044c, B:249:0x0454, B:251:0x045b, B:253:0x0467, B:254:0x046d, B:255:0x0474, B:256:0x0475, B:257:0x047c, B:259:0x0484, B:261:0x048b, B:263:0x0491, B:266:0x049b, B:268:0x049f, B:270:0x04a8, B:272:0x04d3, B:274:0x04dc, B:276:0x0507, B:278:0x0524, B:280:0x052a, B:282:0x0530, B:283:0x0537, B:201:0x039b, B:203:0x03a1, B:209:0x03af, B:210:0x03b8, B:211:0x03c4, B:213:0x03ca, B:215:0x03d0, B:221:0x03de, B:222:0x03e3, B:224:0x03e7, B:226:0x03ed, B:228:0x03f3, B:231:0x03fd, B:233:0x0401, B:234:0x0425, B:236:0x042d, B:241:0x0436, B:243:0x043e, B:245:0x0446, B:33:0x00aa, B:35:0x00ba, B:37:0x00be, B:39:0x00c7, B:44:0x00d1, B:45:0x00d7, B:47:0x00de, B:51:0x00e6, B:54:0x011f, B:56:0x0143, B:62:0x016e, B:65:0x0174, B:67:0x017c, B:68:0x017f, B:70:0x0185, B:75:0x0195, B:77:0x019d, B:55:0x0140, B:57:0x014d, B:60:0x0155, B:61:0x015b), top: B:287:0x0037 }] */
    @Override // org.eclipse.jetty.http.AbstractGenerator, org.eclipse.jetty.http.Generator
    public void completeHeader(HttpFields httpFields, boolean z) throws IOException {
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        HttpFields.Field field;
        HttpFields.Field field2;
        StringBuilder sb;
        int i;
        int i2;
        String[] strArr;
        if (this._state != 0) {
            return;
        }
        if (isResponse() && this._status == 0) {
            throw new EofException();
        }
        boolean z6 = this._last;
        if (z6 && !z) {
            qkq0.a("last?");
            return;
        }
        this._last = z6 | z;
        if (this._header == null) {
            this._header = this._buffers.getHeader();
        }
        try {
            boolean z7 = false;
            int i3 = 48;
            if (isRequest()) {
                this._persistent = Boolean.TRUE;
                if (this._version == 9) {
                    this._contentLength = 0L;
                    this._header.put(this._method);
                    this._header.put(HttpTokens.SPACE);
                    this._header.put(this._uri.getBytes(StringUtil.__UTF8));
                    this._header.put(HttpTokens.CRLF);
                    this._state = 3;
                    this._noContent = true;
                    return;
                }
                this._header.put(this._method);
                this._header.put(HttpTokens.SPACE);
                this._header.put(this._uri.getBytes(StringUtil.__UTF8));
                this._header.put(HttpTokens.SPACE);
                this._header.put(this._version == 10 ? HttpVersions.HTTP_1_0_BUFFER : HttpVersions.HTTP_1_1_BUFFER);
                this._header.put(HttpTokens.CRLF);
                j = 0;
            } else {
                int i4 = this._version;
                if (i4 == 9) {
                    this._persistent = Boolean.FALSE;
                    this._contentLength = -1L;
                    this._state = 2;
                    return;
                }
                if (this._persistent == null) {
                    this._persistent = Boolean.valueOf(i4 > 10);
                }
                int i5 = this._status;
                Status[] statusArr = __status;
                Status status = i5 < statusArr.length ? statusArr[i5] : null;
                if (status == null) {
                    this._header.put(HttpVersions.HTTP_1_1_BUFFER);
                    this._header.put(HttpTokens.SPACE);
                    this._header.put((byte) ((this._status / 100) + 48));
                    this._header.put((byte) (((this._status % 100) / 10) + 48));
                    this._header.put((byte) ((this._status % 10) + 48));
                    this._header.put(HttpTokens.SPACE);
                    Buffer buffer = this._reason;
                    Buffer buffer2 = this._header;
                    if (buffer == null) {
                        buffer2.put((byte) ((this._status / 100) + 48));
                        this._header.put((byte) (((this._status % 100) / 10) + 48));
                        this._header.put((byte) ((this._status % 10) + 48));
                    } else {
                        buffer2.put(buffer);
                    }
                    this._header.put(HttpTokens.CRLF);
                    j = 0;
                } else {
                    Buffer buffer3 = this._reason;
                    j = 0;
                    Buffer buffer4 = this._header;
                    if (buffer3 == null) {
                        buffer4.put(status._responseLine);
                    } else {
                        buffer4.put(status._schemeCode);
                        this._header.put(this._reason);
                        this._header.put(HttpTokens.CRLF);
                    }
                }
                int i6 = this._status;
                if (i6 < 200 && i6 >= 100) {
                    this._noContent = true;
                    this._content = null;
                    Buffer buffer5 = this._buffer;
                    if (buffer5 != null) {
                        buffer5.clear();
                    }
                    if (this._status != 101) {
                        this._header.put(HttpTokens.CRLF);
                        this._state = 2;
                        return;
                    }
                } else if (i6 == 204 || i6 == 304) {
                    this._noContent = true;
                    this._content = null;
                    Buffer buffer6 = this._buffer;
                    if (buffer6 != null) {
                        buffer6.clear();
                    }
                }
            }
            if (this._status >= 200 && this._date != null) {
                this._header.put(HttpHeaders.DATE_BUFFER);
                this._header.put(HttpTokens.COLON);
                this._header.put(HttpTokens.SPACE);
                this._header.put(this._date);
                this._header.put(CRLF);
            }
            if (httpFields != null) {
                int size = httpFields.size();
                StringBuilder sb2 = null;
                HttpFields.Field field3 = null;
                HttpFields.Field field4 = null;
                int i7 = 0;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
                while (i7 < size) {
                    HttpFields.Field field5 = httpFields.getField(i7);
                    if (field5 != null) {
                        int nameOrdinal = field5.getNameOrdinal();
                        int i8 = 5;
                        if (nameOrdinal == 1) {
                            if (isRequest()) {
                                field5.putTo(this._header);
                            }
                            int valueOrdinal = field5.getValueOrdinal();
                            if (valueOrdinal == -1) {
                                String[] strArrSplit = field5.getValue().split(",");
                                int i9 = 0;
                                while (strArrSplit != null && i9 < strArrSplit.length) {
                                    BufferCache.CachedBuffer cachedBuffer = HttpHeaderValues.CACHE.get(strArrSplit[i9].trim());
                                    if (cachedBuffer != null) {
                                        int ordinal = cachedBuffer.getOrdinal();
                                        if (ordinal != 1) {
                                            if (ordinal != i8) {
                                                if (sb2 == null) {
                                                    sb2 = new StringBuilder();
                                                } else {
                                                    sb2.append(',');
                                                }
                                                sb2.append(strArrSplit[i9]);
                                            } else if (this._version == 10) {
                                                if (isResponse()) {
                                                    this._persistent = Boolean.TRUE;
                                                }
                                                strArr = strArrSplit;
                                                z3 = true;
                                            }
                                            strArr = strArrSplit;
                                        } else {
                                            if (isResponse()) {
                                                this._persistent = Boolean.FALSE;
                                            }
                                            if (this._persistent.booleanValue() || !isResponse()) {
                                                strArr = strArrSplit;
                                            } else {
                                                strArr = strArrSplit;
                                                if (this._contentLength == -3) {
                                                    this._contentLength = -1L;
                                                }
                                            }
                                            z4 = true;
                                            z3 = false;
                                        }
                                    } else {
                                        strArr = strArrSplit;
                                        if (sb2 == null) {
                                            sb2 = new StringBuilder();
                                        } else {
                                            sb2.append(',');
                                        }
                                        sb2.append(strArr[i9]);
                                    }
                                    i9++;
                                    strArrSplit = strArr;
                                    i8 = 5;
                                }
                            } else if (valueOrdinal == 1) {
                                if (isResponse()) {
                                    this._persistent = Boolean.FALSE;
                                }
                                if (!this._persistent.booleanValue() && isResponse() && this._contentLength == -3) {
                                    this._contentLength = -1L;
                                }
                                z4 = true;
                            } else if (valueOrdinal != 5) {
                                if (valueOrdinal != 11) {
                                    if (sb2 == null) {
                                        sb2 = new StringBuilder();
                                    } else {
                                        sb2.append(',');
                                    }
                                    sb2.append(field5.getValue());
                                } else if (isResponse()) {
                                    field5.putTo(this._header);
                                } else {
                                    if (isResponse()) {
                                        this._persistent = Boolean.FALSE;
                                    }
                                    if (!this._persistent.booleanValue()) {
                                        this._contentLength = -1L;
                                    }
                                    z4 = true;
                                }
                            } else if (this._version == 10) {
                                if (isResponse()) {
                                    this._persistent = Boolean.TRUE;
                                }
                                z3 = true;
                            }
                        } else if (nameOrdinal != 5) {
                            if (nameOrdinal == 12) {
                                long longValue = field5.getLongValue();
                                this._contentLength = longValue;
                                long j2 = this._contentWritten;
                                field3 = (longValue < j2 || (this._last && longValue != j2)) ? null : field5;
                                field5.putTo(this._header);
                            } else if (nameOrdinal == 16) {
                                if (BufferUtil.isPrefix(MimeTypes.MULTIPART_BYTERANGES_BUFFER, field5.getValueBuffer())) {
                                    this._contentLength = -4L;
                                }
                                field5.putTo(this._header);
                                z2 = true;
                            } else if (nameOrdinal != i3) {
                                field5.putTo(this._header);
                            } else if (getSendServerVersion()) {
                                field5.putTo(this._header);
                                z5 = true;
                            }
                        } else if (this._version == 11) {
                            field4 = field5;
                        }
                    }
                    i7++;
                    i3 = 48;
                }
                sb = sb2;
                field2 = field3;
                field = field4;
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
                field = null;
                field2 = null;
                sb = null;
            }
            int i10 = (int) this._contentLength;
            if (i10 != -3) {
                if (i10 == -1) {
                    this._persistent = Boolean.valueOf(isRequest());
                } else if (i10 == 0 && field2 == null && isResponse() && (i2 = this._status) >= 200 && i2 != 204 && i2 != 304) {
                    this._header.put(CONTENT_LENGTH_0);
                }
            } else if (this._contentWritten == j && isResponse() && ((i = this._status) < 200 || i == 204 || i == 304)) {
                this._contentLength = j;
            } else if (this._last) {
                this._contentLength = this._contentWritten;
                if (field2 == null && ((isResponse() || this._contentLength > 0 || z2) && !this._noContent)) {
                    this._header.put(HttpHeaders.CONTENT_LENGTH_BUFFER);
                    this._header.put(HttpTokens.COLON);
                    this._header.put(HttpTokens.SPACE);
                    BufferUtil.putDecLong(this._header, this._contentLength);
                    this._header.put(HttpTokens.CRLF);
                }
            } else {
                this._contentLength = (!this._persistent.booleanValue() || this._version < 11) ? -1L : -2L;
                if (isRequest() && this._contentLength == -1) {
                    this._contentLength = 0L;
                    this._noContent = true;
                }
            }
            if (this._contentLength == -2) {
                if (field == null || 2 == field.getValueOrdinal()) {
                    this._header.put(TRANSFER_ENCODING_CHUNKED);
                } else {
                    if (!field.getValue().endsWith(HttpHeaderValues.CHUNKED)) {
                        throw new IllegalArgumentException("BAD TE");
                    }
                    field.putTo(this._header);
                }
            }
            if (this._contentLength == -1) {
                this._persistent = Boolean.FALSE;
            } else {
                z7 = z3;
            }
            if (isResponse()) {
                if (!this._persistent.booleanValue() && (z4 || this._version > 10)) {
                    this._header.put(CONNECTION_CLOSE);
                    if (sb != null) {
                        Buffer buffer7 = this._header;
                        buffer7.setPutIndex(buffer7.putIndex() - 2);
                        this._header.put((byte) 44);
                        this._header.put(sb.toString().getBytes());
                        this._header.put(CRLF);
                    }
                } else if (z7) {
                    this._header.put(CONNECTION_KEEP_ALIVE);
                    if (sb != null) {
                        Buffer buffer8 = this._header;
                        buffer8.setPutIndex(buffer8.putIndex() - 2);
                        this._header.put((byte) 44);
                        this._header.put(sb.toString().getBytes());
                        this._header.put(CRLF);
                    }
                } else if (sb != null) {
                    this._header.put(CONNECTION_);
                    this._header.put(sb.toString().getBytes());
                    this._header.put(CRLF);
                }
            }
            if (!z5 && this._status > 199 && getSendServerVersion()) {
                this._header.put(SERVER);
            }
            this._header.put(HttpTokens.CRLF);
            this._state = 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Header>" + this._header.capacity(), e);
        }
    }

    @Override // org.eclipse.jetty.http.AbstractGenerator, org.eclipse.jetty.http.Generator
    public int flushBuffer() throws IOException {
        Buffer buffer;
        Boolean bool;
        Buffer buffer2;
        Buffer buffer3;
        try {
            if (this._state == 0) {
                throw new IllegalStateException("State==HEADER");
            }
            prepareBuffers();
            if (this._endp == null) {
                if (this._needCRLF && (buffer3 = this._buffer) != null) {
                    buffer3.put(HttpTokens.CRLF);
                }
                if (this._needEOC && (buffer2 = this._buffer) != null && !this._head) {
                    buffer2.put(LAST_CHUNK);
                }
                this._needCRLF = false;
                this._needEOC = false;
                return 0;
            }
            int iFlushMask = flushMask();
            int iFlush = -1;
            int i = 0;
            while (true) {
                switch (iFlushMask) {
                    case 0:
                        Buffer buffer4 = this._header;
                        if (buffer4 != null) {
                            buffer4.clear();
                        }
                        this._bypass = false;
                        this._bufferChunked = false;
                        Buffer buffer5 = this._buffer;
                        if (buffer5 != null) {
                            buffer5.clear();
                            if (this._contentLength == -2) {
                                this._buffer.setPutIndex(12);
                                this._buffer.setGetIndex(12);
                                Buffer buffer6 = this._content;
                                if (buffer6 != null && buffer6.length() < this._buffer.space() && this._state != 3) {
                                    this._buffer.put(this._content);
                                    this._content.clear();
                                    this._content = null;
                                }
                            }
                        }
                        if (this._needCRLF || this._needEOC || !((buffer = this._content) == null || buffer.length() == 0)) {
                            prepareBuffers();
                        } else {
                            if (this._state == 3) {
                                this._state = 4;
                            }
                            if (this._state == 4 && (bool = this._persistent) != null && !bool.booleanValue() && this._status != 100 && this._method == null) {
                                this._endp.shutdownOutput();
                            }
                        }
                        iFlush = 0;
                        break;
                    case 1:
                        iFlush = this._endp.flush(this._content);
                        break;
                    case 2:
                        iFlush = this._endp.flush(this._buffer);
                        break;
                    case 3:
                        iFlush = this._endp.flush(this._buffer, this._content, null);
                        break;
                    case 4:
                        iFlush = this._endp.flush(this._header);
                        break;
                    case 5:
                        iFlush = this._endp.flush(this._header, this._content, null);
                        break;
                    case 6:
                        iFlush = this._endp.flush(this._header, this._buffer, null);
                        break;
                    case 7:
                        throw new IllegalStateException();
                }
                if (iFlush > 0) {
                    i += iFlush;
                }
                int iFlushMask2 = flushMask();
                if (iFlush <= 0 && (iFlushMask2 == 0 || iFlushMask != 0)) {
                    return i;
                }
                iFlushMask = iFlushMask2;
            }
        } catch (IOException e) {
            LOG.ignore(e);
            if (e instanceof EofException) {
                throw e;
            }
            throw new EofException(e);
        }
    }

    public int getBytesBuffered() {
        Buffer buffer = this._header;
        int length = buffer == null ? 0 : buffer.length();
        Buffer buffer2 = this._buffer;
        int length2 = length + (buffer2 == null ? 0 : buffer2.length());
        Buffer buffer3 = this._content;
        return length2 + (buffer3 != null ? buffer3.length() : 0);
    }

    @Override // org.eclipse.jetty.http.AbstractGenerator, org.eclipse.jetty.http.Generator
    public boolean isBufferFull() {
        Buffer buffer;
        if (super.isBufferFull() || this._bufferChunked || this._bypass) {
            return true;
        }
        return this._contentLength == -2 && (buffer = this._buffer) != null && buffer.space() < 12;
    }

    public boolean isEmpty() {
        Buffer buffer = this._header;
        if (buffer != null && buffer.length() != 0) {
            return false;
        }
        Buffer buffer2 = this._buffer;
        if (buffer2 != null && buffer2.length() != 0) {
            return false;
        }
        Buffer buffer3 = this._content;
        return buffer3 == null || buffer3.length() == 0;
    }

    @Override // org.eclipse.jetty.http.AbstractGenerator
    public boolean isRequest() {
        return this._method != null;
    }

    @Override // org.eclipse.jetty.http.AbstractGenerator
    public boolean isResponse() {
        return this._method == null;
    }

    @Override // org.eclipse.jetty.http.AbstractGenerator
    public int prepareUncheckedAddContent() throws IOException {
        if (this._noContent || this._last || this._state == 4) {
            return -1;
        }
        Buffer buffer = this._content;
        if ((buffer != null && buffer.length() > 0) || this._bufferChunked) {
            flushBuffer();
            if ((buffer != null && buffer.length() > 0) || this._bufferChunked) {
                qkq0.a("FULL");
                return 0;
            }
        }
        if (this._buffer == null) {
            this._buffer = this._buffers.getBuffer();
        }
        this._contentWritten -= (long) this._buffer.length();
        if (this._head) {
            return Integer.MAX_VALUE;
        }
        return this._buffer.space() - (this._contentLength == -2 ? 12 : 0);
    }

    @Override // org.eclipse.jetty.http.AbstractGenerator, org.eclipse.jetty.http.Generator
    public void reset() {
        EndPoint endPoint;
        Boolean bool = this._persistent;
        if (bool != null && !bool.booleanValue() && (endPoint = this._endp) != null && !endPoint.isOutputShutdown()) {
            try {
                this._endp.shutdownOutput();
            } catch (IOException e) {
                LOG.ignore(e);
            }
        }
        super.reset();
        Buffer buffer = this._buffer;
        if (buffer != null) {
            buffer.clear();
        }
        Buffer buffer2 = this._header;
        if (buffer2 != null) {
            buffer2.clear();
        }
        if (this._content != null) {
            this._content = null;
        }
        this._bypass = false;
        this._needCRLF = false;
        this._needEOC = false;
        this._bufferChunked = false;
        this._method = null;
        this._uri = null;
        this._noContent = false;
    }

    public void send1xx(int i) throws IOException {
        if (this._state != 0) {
            return;
        }
        if (i < 100 || i > 199) {
            ig3.a("!1xx");
            return;
        }
        Status status = __status[i];
        if (status == null) {
            throw new IllegalArgumentException(i + "?");
        }
        if (this._header == null) {
            this._header = this._buffers.getHeader();
        }
        this._header.put(status._responseLine);
        this._header.put(HttpTokens.CRLF);
        while (this._header.length() > 0) {
            try {
                int iFlush = this._endp.flush(this._header);
                if (iFlush < 0) {
                    throw new EofException();
                }
                if (iFlush == 0) {
                    Thread.sleep(100L);
                }
            } catch (InterruptedException e) {
                LOG.debug(e);
                throw new InterruptedIOException(e.toString());
            }
        }
    }

    public void sendResponse(Buffer buffer) throws IOException {
        Buffer buffer2;
        if (this._noContent || this._state != 0 || (((buffer2 = this._content) != null && buffer2.length() > 0) || this._bufferChunked || this._head)) {
            ohg0.a();
            return;
        }
        this._last = true;
        this._content = buffer;
        this._bypass = true;
        this._state = 3;
        long length = buffer.length();
        this._contentWritten = length;
        this._contentLength = length;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Integer numValueOf = Integer.valueOf(this._state);
        Buffer buffer = this._header;
        Integer numValueOf2 = Integer.valueOf(buffer == null ? -1 : buffer.length());
        Buffer buffer2 = this._buffer;
        Integer numValueOf3 = Integer.valueOf(buffer2 == null ? -1 : buffer2.length());
        Buffer buffer3 = this._content;
        return String.format("%s{s=%d,h=%d,b=%d,c=%d}", simpleName, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(buffer3 != null ? buffer3.length() : -1));
    }
}

package org.eclipse.jetty.http;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import org.eclipse.jetty.p127io.Buffer;
import org.eclipse.jetty.p127io.BufferCache;
import org.eclipse.jetty.p127io.BufferUtil;
import org.eclipse.jetty.p127io.Buffers;
import org.eclipse.jetty.p127io.ByteArrayBuffer;
import org.eclipse.jetty.p127io.EndPoint;
import org.eclipse.jetty.p127io.EofException;
import org.eclipse.jetty.p127io.View;
import org.eclipse.jetty.p127io.bio.StreamEndPoint;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class HttpParser implements Parser {
    private static final Logger LOG = Log.getLogger((Class<?>) HttpParser.class);
    public static final int STATE_CHUNK = 6;
    public static final int STATE_CHUNKED_CONTENT = 3;
    public static final int STATE_CHUNK_PARAMS = 5;
    public static final int STATE_CHUNK_SIZE = 4;
    public static final int STATE_CONTENT = 2;
    public static final int STATE_END = 0;
    public static final int STATE_END0 = -8;
    public static final int STATE_END1 = -7;
    public static final int STATE_EOF_CONTENT = 1;
    public static final int STATE_FIELD0 = -13;
    public static final int STATE_FIELD2 = -6;
    public static final int STATE_HEADER = -5;
    public static final int STATE_HEADER_IN_NAME = -3;
    public static final int STATE_HEADER_IN_VALUE = -1;
    public static final int STATE_HEADER_NAME = -4;
    public static final int STATE_HEADER_VALUE = -2;
    public static final int STATE_SEEKING_EOF = 7;
    public static final int STATE_SPACE1 = -12;
    public static final int STATE_SPACE2 = -9;
    public static final int STATE_START = -14;
    public static final int STATE_STATUS = -11;
    public static final int STATE_URI = -10;
    private Buffer _body;
    private Buffer _buffer;
    private final Buffers _buffers;
    private BufferCache.CachedBuffer _cached;
    protected int _chunkLength;
    protected int _chunkPosition;
    protected long _contentLength;
    protected long _contentPosition;
    protected final View _contentView;
    private final EndPoint _endp;
    protected byte _eol;
    private boolean _forceContentBuffer;
    private final EventHandler _handler;
    private boolean _headResponse;
    private Buffer _header;
    protected int _length;
    private String _multiLineValue;
    private boolean _persistent;
    private int _responseStatus;
    protected int _state;
    private final View.CaseInsensitive _tok0;
    private final View.CaseInsensitive _tok1;

    public static abstract class EventHandler {
        public abstract void content(Buffer buffer) throws IOException;

        public void earlyEOF() {
        }

        public void headerComplete() throws IOException {
        }

        public void messageComplete(long j) throws IOException {
        }

        public void parsedHeader(Buffer buffer, Buffer buffer2) throws IOException {
        }

        public abstract void startRequest(Buffer buffer, Buffer buffer2, Buffer buffer3) throws IOException;

        public abstract void startResponse(Buffer buffer, int i, Buffer buffer2) throws IOException;
    }

    public HttpParser(Buffer buffer, EventHandler eventHandler) {
        this._contentView = new View();
        this._state = -14;
        this._endp = null;
        this._buffers = null;
        this._header = buffer;
        this._buffer = buffer;
        this._handler = eventHandler;
        this._tok0 = new View.CaseInsensitive(this._header);
        this._tok1 = new View.CaseInsensitive(this._header);
    }

    public int available() throws IOException {
        View view = this._contentView;
        if (view != null && view.length() > 0) {
            return this._contentView.length();
        }
        if (!this._endp.isBlocking()) {
            parseNext();
            View view2 = this._contentView;
            if (view2 == null) {
                return 0;
            }
            return view2.length();
        }
        if (this._state > 0) {
            EndPoint endPoint = this._endp;
            if ((endPoint instanceof StreamEndPoint) && ((StreamEndPoint) endPoint).getInputStream().available() > 0) {
                return 1;
            }
        }
        return 0;
    }

    public Buffer blockForContent(long j) throws IOException {
        EndPoint endPoint;
        if (this._contentView.length() > 0) {
            return this._contentView;
        }
        if (getState() <= 0 || isState(7)) {
            return null;
        }
        try {
            parseNext();
            while (this._contentView.length() == 0 && !isState(0) && !isState(7) && (endPoint = this._endp) != null && endPoint.isOpen()) {
                if (!this._endp.isBlocking()) {
                    if (parseNext() <= 0) {
                        if (!this._endp.blockReadable(j)) {
                            this._endp.close();
                            throw new EofException("timeout");
                        }
                    }
                }
                parseNext();
            }
            if (this._contentView.length() > 0) {
                return this._contentView;
            }
            return null;
        } catch (IOException e) {
            this._endp.close();
            throw e;
        }
    }

    public int fill() throws IOException {
        Buffer buffer;
        Buffer buffer2;
        if (this._buffer == null) {
            this._buffer = getHeaderBuffer();
        }
        if (this._state > 0) {
            Buffer buffer3 = this._buffer;
            Buffer buffer4 = this._header;
            if (buffer3 == buffer4 && buffer4 != null && !buffer4.hasContent() && (buffer2 = this._body) != null && buffer2.hasContent()) {
                Buffer buffer5 = this._body;
                this._buffer = buffer5;
                return buffer5.length();
            }
        }
        Buffer buffer6 = this._buffer;
        Buffer buffer7 = this._header;
        if (buffer6 == buffer7 && this._state > 0 && buffer7.length() == 0 && ((this._forceContentBuffer || this._contentLength - this._contentPosition > this._header.capacity()) && ((buffer = this._body) != null || this._buffers != null))) {
            if (buffer == null) {
                this._body = this._buffers.getBuffer();
            }
            this._buffer = this._body;
        }
        if (this._endp == null) {
            return -1;
        }
        Buffer buffer8 = this._buffer;
        if (buffer8 == this._body || this._state > 0) {
            buffer8.compact();
        }
        int iSpace = this._buffer.space();
        EndPoint endPoint = this._endp;
        if (iSpace == 0) {
            LOG.warn("HttpParser Full for {} ", endPoint);
            this._buffer.clear();
            throw new HttpException(HttpStatus.REQUEST_ENTITY_TOO_LARGE_413, "FULL ".concat(this._buffer == this._body ? "body" : "head"));
        }
        try {
            return endPoint.fill(this._buffer);
        } catch (IOException e) {
            LOG.debug(e);
            if (e instanceof EofException) {
                throw e;
            }
            throw new EofException(e);
        }
    }

    public Buffer getBodyBuffer() {
        return this._body;
    }

    public long getContentLength() {
        return this._contentLength;
    }

    public long getContentRead() {
        return this._contentPosition;
    }

    public Buffer getHeaderBuffer() {
        if (this._header == null) {
            Buffer header = this._buffers.getHeader();
            this._header = header;
            this._tok0.update(header);
            this._tok1.update(this._header);
        }
        return this._header;
    }

    public int getState() {
        return this._state;
    }

    public boolean inContentState() {
        return this._state > 0;
    }

    public boolean inHeaderState() {
        return this._state < 0;
    }

    public boolean isChunking() {
        return this._contentLength == -2;
    }

    @Override // org.eclipse.jetty.http.Parser
    public boolean isComplete() {
        return isState(0);
    }

    @Override // org.eclipse.jetty.http.Parser
    public boolean isIdle() {
        return isState(-14);
    }

    @Override // org.eclipse.jetty.http.Parser
    public boolean isMoreInBuffer() throws IOException {
        Buffer buffer = this._header;
        if (buffer != null && buffer.hasContent()) {
            return true;
        }
        Buffer buffer2 = this._body;
        return buffer2 != null && buffer2.hasContent();
    }

    @Override // org.eclipse.jetty.http.Parser
    public boolean isPersistent() {
        return this._persistent;
    }

    public boolean isState(int i) {
        return this._state == i;
    }

    public void parse() throws IOException {
        if (this._state == 0) {
            reset();
        }
        if (this._state != -14) {
            wtq0.m207906a("!START");
        } else {
            while (this._state != 0 && parseNext() >= 0) {
            }
        }
    }

    @Override // org.eclipse.jetty.http.Parser
    public boolean parseAvailable() throws IOException {
        Buffer buffer;
        boolean z = parseNext() > 0;
        while (!isComplete() && (buffer = this._buffer) != null && buffer.length() > 0) {
            z |= parseNext() > 0;
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x0264  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[Catch: HttpException -> 0x0016, TryCatch #1 {HttpException -> 0x0016, blocks: (B:8:0x000f, B:15:0x0020, B:17:0x0028, B:61:0x00db, B:74:0x010d, B:33:0x006c, B:35:0x0072, B:37:0x007a, B:39:0x007e, B:40:0x009c, B:44:0x00a4, B:46:0x00aa, B:47:0x00af, B:51:0x00c5, B:53:0x00cb, B:56:0x00d2, B:57:0x00d7, B:59:0x00d9, B:48:0x00b7, B:49:0x00c1, B:29:0x005c), top: B:513:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:97:0x019e A[Catch: HttpException -> 0x0138, TryCatch #4 {HttpException -> 0x0138, blocks: (B:3:0x0006, B:6:0x000b, B:12:0x001a, B:19:0x0030, B:64:0x00e4, B:65:0x00ec, B:67:0x00f8, B:70:0x00fe, B:71:0x0101, B:76:0x0112, B:84:0x0131, B:87:0x013c, B:89:0x0140, B:91:0x0148, B:92:0x015d, B:94:0x0161, B:95:0x0169, B:96:0x0199, B:97:0x019e, B:102:0x01a9, B:104:0x01ae, B:105:0x01b3, B:106:0x01c7, B:108:0x01cb, B:110:0x01d3, B:111:0x01e8, B:113:0x01ec, B:114:0x01f4, B:115:0x0224, B:122:0x0236, B:123:0x0241, B:125:0x0245, B:127:0x0249, B:128:0x025d, B:130:0x0266, B:132:0x026a, B:133:0x027e, B:134:0x0284, B:141:0x0294, B:143:0x029c, B:144:0x02a1, B:145:0x02b5, B:147:0x02b9, B:149:0x02bd, B:150:0x02d1, B:151:0x02d8, B:153:0x02dc, B:154:0x02f0, B:159:0x02fe, B:161:0x0306, B:163:0x030e, B:165:0x0316, B:235:0x0421, B:240:0x042e, B:242:0x043b, B:244:0x044b, B:245:0x0468, B:247:0x046e, B:256:0x0481, B:258:0x0488, B:259:0x048a, B:261:0x0490, B:263:0x0498, B:265:0x04a2, B:266:0x04aa, B:275:0x04c1, B:277:0x04cc, B:279:0x04d5, B:286:0x04e3, B:288:0x04ef, B:289:0x04f8, B:270:0x04b8, B:169:0x031e, B:173:0x032d, B:175:0x0333, B:177:0x033d, B:234:0x0407, B:186:0x0357, B:188:0x035f, B:195:0x036d, B:199:0x0379, B:201:0x037d, B:202:0x0389, B:203:0x038a, B:205:0x039b, B:206:0x03a2, B:208:0x03af, B:209:0x03b2, B:212:0x03b9, B:213:0x03c1, B:214:0x03c2, B:221:0x03d3, B:222:0x03d6, B:223:0x03da, B:225:0x03e8, B:232:0x0401, B:230:0x03fb, B:231:0x03fe, B:176:0x0336, B:172:0x0324, B:291:0x0502, B:295:0x0510, B:298:0x0516, B:300:0x0544, B:304:0x0553, B:299:0x052a, B:310:0x0576, B:313:0x057c, B:314:0x05a5, B:316:0x05c8, B:318:0x05d4, B:321:0x05f3, B:324:0x061e, B:329:0x0641, B:332:0x0651, B:333:0x067c, B:341:0x068f, B:342:0x0696, B:343:0x0697, B:345:0x06a0, B:346:0x06a9, B:349:0x06b1, B:353:0x06d3, B:359:0x06e7, B:360:0x06ee, B:361:0x06ef, B:364:0x06fb, B:367:0x0708, B:369:0x070c, B:371:0x0710, B:380:0x0720, B:381:0x0729, B:382:0x0731, B:386:0x0739, B:387:0x073c, B:389:0x0740, B:391:0x074a, B:392:0x0759, B:393:0x075f, B:484:0x0909, B:395:0x076d, B:397:0x0776, B:403:0x07a1, B:398:0x077f, B:400:0x0787, B:402:0x0793, B:406:0x07b0, B:408:0x07b8, B:412:0x07c3, B:414:0x07e9, B:418:0x07f7, B:421:0x07ff, B:423:0x0807, B:425:0x0811, B:426:0x0819, B:430:0x0820, B:432:0x082c, B:433:0x082f, B:445:0x0857, B:451:0x086c, B:456:0x087e, B:457:0x0888, B:458:0x089e, B:459:0x089f, B:461:0x08a4, B:464:0x08ac, B:466:0x08b4, B:468:0x08be, B:469:0x08c6, B:473:0x08cd, B:475:0x08d9, B:476:0x08dc, B:481:0x08f2, B:482:0x08f8, B:483:0x0901, B:485:0x0911, B:487:0x091c, B:491:0x0923, B:493:0x092d, B:495:0x0932, B:496:0x0933, B:498:0x0955, B:502:0x095c, B:505:0x0966), top: B:518:0x0006, inners: #3 }] */
    public int parseNext() throws IOException {
        boolean z;
        int iFill;
        int i;
        int length;
        byte b;
        Buffer bufferLookup;
        int i2;
        int i3;
        long j;
        int i4;
        byte b2 = 0;
        try {
            if (this._state == 0) {
                return 0;
            }
            if (this._buffer == null) {
                try {
                    this._buffer = getHeaderBuffer();
                } catch (HttpException e) {
                    e = e;
                    z = false;
                    this._persistent = z;
                    this._state = 7;
                    throw e;
                }
            }
            int i5 = 1;
            if (this._state == 2) {
                long j2 = this._contentPosition;
                if (j2 == this._contentLength) {
                    this._state = 0;
                    this._handler.messageComplete(j2);
                    return 1;
                }
            }
            int length2 = this._buffer.length();
            byte b3 = -1;
            if (length2 == 0) {
                try {
                    iFill = fill();
                    try {
                        LOG.debug("filled {}/{}", Integer.valueOf(iFill), Integer.valueOf(this._buffer.length()));
                        e = null;
                    } catch (IOException e2) {
                        e = e2;
                        LOG.debug(toString(), e);
                    }
                } catch (IOException e3) {
                    e = e3;
                    iFill = -1;
                }
                if (iFill > 0) {
                    i = 1;
                } else {
                    if (iFill < 0) {
                        this._persistent = false;
                        if (this._state > 0 && this._buffer.length() > 0 && !this._headResponse) {
                            Buffer buffer = this._buffer;
                            Buffer buffer2 = buffer.get(buffer.length());
                            this._contentPosition += (long) buffer2.length();
                            this._contentView.update(buffer2);
                            this._handler.content(buffer2);
                        }
                        int i6 = this._state;
                        if (i6 == 0) {
                            this._state = 0;
                        } else if (i6 == 1) {
                            this._state = 0;
                            this._handler.messageComplete(this._contentPosition);
                        } else if (i6 != 7) {
                            this._state = 0;
                            if (!this._headResponse) {
                                this._handler.earlyEOF();
                            }
                            this._handler.messageComplete(this._contentPosition);
                        } else {
                            this._state = 0;
                        }
                        if (e != null) {
                            throw e;
                        }
                        if (!isComplete() && !isIdle()) {
                            throw new EofException();
                        }
                        return -1;
                    }
                    i = 0;
                }
                length = this._buffer.length();
            } else {
                length = length2;
                i = 0;
            }
            byte[] bArrArray = this._buffer.array();
            int i7 = this._state;
            while (true) {
                int i8 = this._state;
                if (i8 < 0) {
                    int i9 = length - 1;
                    if (length > 0) {
                        if (i7 != i8) {
                            i++;
                            i7 = i8;
                        }
                        byte b4 = this._buffer.get();
                        if (this._eol != 13 || b4 != 10) {
                            this._eol = b2;
                            int i10 = i5;
                            switch (this._state) {
                                case -14:
                                    b = -1;
                                    this._contentLength = -3L;
                                    this._cached = null;
                                    if (b4 > 32 || b4 < 0) {
                                        this._buffer.mark();
                                        this._state = -13;
                                    }
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                                case -13:
                                    b = -1;
                                    if (b4 == 32) {
                                        this._tok0.update(this._buffer.markIndex(), this._buffer.getIndex() - 1);
                                        this._responseStatus = HttpVersions.CACHE.get(this._tok0) == null ? -1 : 0;
                                        this._state = -12;
                                    } else {
                                        if (b4 < 32) {
                                            if (b4 >= 0) {
                                                throw new HttpException(400);
                                            }
                                        }
                                        length = i9;
                                        b3 = b;
                                        b2 = 0;
                                        i5 = 1;
                                    }
                                    break;
                                case -12:
                                    b = -1;
                                    if (b4 > 32 || b4 < 0) {
                                        this._buffer.mark();
                                        if (this._responseStatus >= 0) {
                                            this._state = -11;
                                            this._responseStatus = b4 - 48;
                                        } else {
                                            this._state = -10;
                                        }
                                    } else if (b4 < 32) {
                                        throw new HttpException(400);
                                    }
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                                case -11:
                                    if (b4 == 32) {
                                        this._tok1.update(this._buffer.markIndex(), this._buffer.getIndex() - 1);
                                        this._state = -9;
                                    } else if (b4 >= 48 && b4 <= 57) {
                                        this._responseStatus = (this._responseStatus * 10) + (b4 - 48);
                                    } else if (b4 >= 32 || b4 < 0) {
                                        this._state = -10;
                                        b = -1;
                                        this._responseStatus = -1;
                                        length = i9;
                                        b3 = b;
                                        b2 = 0;
                                        i5 = 1;
                                    } else {
                                        this._handler.startResponse(HttpMethods.CACHE.lookup(this._tok0), this._responseStatus, null);
                                        this._eol = b4;
                                        this._state = -5;
                                        View.CaseInsensitive caseInsensitive = this._tok0;
                                        caseInsensitive.setPutIndex(caseInsensitive.getIndex());
                                        View.CaseInsensitive caseInsensitive2 = this._tok1;
                                        caseInsensitive2.setPutIndex(caseInsensitive2.getIndex());
                                        this._multiLineValue = null;
                                    }
                                    b = -1;
                                    break;
                                case -10:
                                    if (b4 == 32) {
                                        this._tok1.update(this._buffer.markIndex(), this._buffer.getIndex() - 1);
                                        this._state = -9;
                                        b = -1;
                                    } else {
                                        if (b4 < 32 && b4 >= 0) {
                                            this._handler.startRequest(HttpMethods.CACHE.lookup(this._tok0), this._buffer.sliceFromMark(), null);
                                            this._persistent = false;
                                            this._state = 7;
                                            this._handler.headerComplete();
                                            this._handler.messageComplete(this._contentPosition);
                                            return 1;
                                        }
                                        b = -1;
                                        length = i9;
                                        b3 = b;
                                        b2 = 0;
                                        i5 = 1;
                                    }
                                    break;
                                case -9:
                                    if (b4 > 32 || b4 < 0) {
                                        this._buffer.mark();
                                        this._state = -6;
                                    } else if (b4 < 32) {
                                        int i11 = this._responseStatus;
                                        EventHandler eventHandler = this._handler;
                                        if (i11 <= 0) {
                                            eventHandler.startRequest(HttpMethods.CACHE.lookup(this._tok0), this._tok1, null);
                                            this._persistent = false;
                                            this._state = 7;
                                            this._handler.headerComplete();
                                            this._handler.messageComplete(this._contentPosition);
                                            return 1;
                                        }
                                        eventHandler.startResponse(HttpMethods.CACHE.lookup(this._tok0), this._responseStatus, null);
                                        this._eol = b4;
                                        this._state = -5;
                                        View.CaseInsensitive caseInsensitive3 = this._tok0;
                                        caseInsensitive3.setPutIndex(caseInsensitive3.getIndex());
                                        View.CaseInsensitive caseInsensitive4 = this._tok1;
                                        caseInsensitive4.setPutIndex(caseInsensitive4.getIndex());
                                        this._multiLineValue = null;
                                    }
                                    b = -1;
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                                case -8:
                                case -7:
                                default:
                                    b = -1;
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                                case -6:
                                    if (b4 == 13 || b4 == 10) {
                                        int i12 = this._responseStatus;
                                        EventHandler eventHandler2 = this._handler;
                                        if (i12 > 0) {
                                            bufferLookup = HttpVersions.CACHE.lookup(this._tok0);
                                            eventHandler2.startResponse(bufferLookup, this._responseStatus, this._buffer.sliceFromMark());
                                        } else {
                                            Buffer bufferLookup2 = HttpMethods.CACHE.lookup(this._tok0);
                                            View.CaseInsensitive caseInsensitive5 = this._tok1;
                                            Buffer bufferLookup3 = HttpVersions.CACHE.lookup(this._buffer.sliceFromMark());
                                            eventHandler2.startRequest(bufferLookup2, caseInsensitive5, bufferLookup3);
                                            bufferLookup = bufferLookup3;
                                        }
                                        this._eol = b4;
                                        this._persistent = HttpVersions.CACHE.getOrdinal(bufferLookup) >= 11;
                                        this._state = -5;
                                        View.CaseInsensitive caseInsensitive6 = this._tok0;
                                        caseInsensitive6.setPutIndex(caseInsensitive6.getIndex());
                                        View.CaseInsensitive caseInsensitive7 = this._tok1;
                                        caseInsensitive7.setPutIndex(caseInsensitive7.getIndex());
                                        this._multiLineValue = null;
                                        b = -1;
                                    }
                                    b = -1;
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                                case -5:
                                    if (b4 != 9 && b4 != 32 && b4 != 58) {
                                        if (this._cached != null || this._tok0.length() > 0 || this._tok1.length() > 0 || this._multiLineValue != null) {
                                            Buffer bufferLookup4 = this._cached;
                                            if (bufferLookup4 == null) {
                                                bufferLookup4 = HttpHeaders.CACHE.lookup(this._tok0);
                                            }
                                            this._cached = null;
                                            Buffer byteArrayBuffer = this._multiLineValue == null ? this._tok1 : new ByteArrayBuffer(this._multiLineValue);
                                            int ordinal = HttpHeaders.CACHE.getOrdinal(bufferLookup4);
                                            if (ordinal < 0) {
                                                i2 = length;
                                            } else if (ordinal != i10) {
                                                Buffer buffer3 = byteArrayBuffer;
                                                if (ordinal != 5) {
                                                    if (ordinal == 12 && this._contentLength != -2 && (i3 = this._responseStatus) != 304 && i3 != 204 && (i3 < 100 || i3 >= 200)) {
                                                        try {
                                                            long j3 = BufferUtil.toLong(buffer3);
                                                            this._contentLength = j3;
                                                            if (j3 <= 0) {
                                                                this._contentLength = 0L;
                                                            }
                                                        } catch (NumberFormatException e4) {
                                                            LOG.ignore(e4);
                                                            throw new HttpException(400);
                                                        }
                                                    }
                                                    i2 = length;
                                                    byteArrayBuffer = buffer3;
                                                } else {
                                                    HttpHeaderValues httpHeaderValues = HttpHeaderValues.CACHE;
                                                    byteArrayBuffer = httpHeaderValues.lookup(buffer3);
                                                    if (2 == httpHeaderValues.getOrdinal(byteArrayBuffer)) {
                                                        i2 = length;
                                                        this._contentLength = -2L;
                                                    } else {
                                                        i2 = length;
                                                        String string = byteArrayBuffer.toString("ISO-8859-1");
                                                        if (string.endsWith(HttpHeaderValues.CHUNKED)) {
                                                            this._contentLength = -2L;
                                                        } else if (string.indexOf(HttpHeaderValues.CHUNKED) >= 0) {
                                                            throw new HttpException(400, null);
                                                        }
                                                    }
                                                }
                                            } else {
                                                i2 = length;
                                                int ordinal2 = HttpHeaderValues.CACHE.getOrdinal(byteArrayBuffer);
                                                if (ordinal2 == -1) {
                                                    for (String str : byteArrayBuffer.toString().split(Constants.SEPARATOR_COMMA)) {
                                                        int ordinal3 = HttpHeaderValues.CACHE.getOrdinal(str.trim());
                                                        if (ordinal3 == 1) {
                                                            this._persistent = false;
                                                        } else if (ordinal3 == 5) {
                                                            this._persistent = true;
                                                        }
                                                    }
                                                } else if (ordinal2 == 1) {
                                                    this._persistent = false;
                                                } else if (ordinal2 == 5) {
                                                    this._persistent = true;
                                                }
                                            }
                                            this._handler.parsedHeader(bufferLookup4, byteArrayBuffer);
                                            View.CaseInsensitive caseInsensitive8 = this._tok0;
                                            caseInsensitive8.setPutIndex(caseInsensitive8.getIndex());
                                            View.CaseInsensitive caseInsensitive9 = this._tok1;
                                            caseInsensitive9.setPutIndex(caseInsensitive9.getIndex());
                                            this._multiLineValue = null;
                                        } else {
                                            i2 = length;
                                        }
                                        this._buffer.setMarkIndex(-1);
                                        if (b4 != 13 && b4 != 10) {
                                            this._length = 1;
                                            this._buffer.mark();
                                            this._state = -4;
                                            if (bArrArray != null) {
                                                BufferCache.CachedBuffer best = HttpHeaders.CACHE.getBest(bArrArray, this._buffer.markIndex(), i2);
                                                this._cached = best;
                                                if (best != null) {
                                                    this._length = best.length();
                                                    Buffer buffer4 = this._buffer;
                                                    buffer4.setGetIndex(buffer4.markIndex() + this._length);
                                                    length = this._buffer.length();
                                                    b = -1;
                                                }
                                                b3 = b;
                                                b2 = 0;
                                                i5 = 1;
                                            }
                                            break;
                                        }
                                        if (this._contentLength != -3) {
                                            j = 0;
                                        } else {
                                            int i13 = this._responseStatus;
                                            if (i13 == 0 || i13 == 304 || i13 == 204 || i13 < 200) {
                                                j = 0;
                                                this._contentLength = 0L;
                                            } else {
                                                this._contentLength = -1L;
                                                j = 0;
                                            }
                                        }
                                        this._contentPosition = j;
                                        this._eol = b4;
                                        if (b4 == 13 && this._buffer.hasContent() && this._buffer.peek() == 10) {
                                            this._eol = this._buffer.get();
                                        }
                                        long j4 = this._contentLength;
                                        int i14 = j4 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) j4;
                                        if (i14 == -2) {
                                            this._state = 3;
                                            this._handler.headerComplete();
                                        } else if (i14 == -1) {
                                            this._state = 1;
                                            this._handler.headerComplete();
                                        } else {
                                            if (i14 == 0) {
                                                this._handler.headerComplete();
                                                this._state = (this._persistent || ((i4 = this._responseStatus) >= 100 && i4 < 200)) ? 0 : 7;
                                                this._handler.messageComplete(this._contentPosition);
                                                return 1;
                                            }
                                            this._state = 2;
                                            this._handler.headerComplete();
                                        }
                                        return 1;
                                    }
                                    this._length = -1;
                                    this._state = -2;
                                    b = -1;
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                                case -4:
                                    if (b4 != 9) {
                                        if (b4 == 10 || b4 == 13) {
                                            if (this._length > 0) {
                                                this._tok0.update(this._buffer.markIndex(), this._buffer.markIndex() + this._length);
                                            }
                                            this._eol = b4;
                                            this._state = -5;
                                        } else if (b4 != 32) {
                                            if (b4 != 58) {
                                                this._cached = null;
                                                if (this._length == -1) {
                                                    this._buffer.mark();
                                                }
                                                this._length = this._buffer.getIndex() - this._buffer.markIndex();
                                                this._state = -3;
                                            } else {
                                                if (this._length > 0 && this._cached == null) {
                                                    this._tok0.update(this._buffer.markIndex(), this._buffer.markIndex() + this._length);
                                                }
                                                this._length = -1;
                                                this._state = -2;
                                            }
                                        }
                                    }
                                    b = -1;
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                                case -3:
                                    if (b4 == 9) {
                                        this._state = -4;
                                    } else if (b4 == 10 || b4 == 13) {
                                        if (this._length > 0) {
                                            this._tok0.update(this._buffer.markIndex(), this._buffer.markIndex() + this._length);
                                        }
                                        this._eol = b4;
                                        this._state = -5;
                                    } else if (b4 == 32) {
                                        this._state = -4;
                                    } else if (b4 != 58) {
                                        this._cached = null;
                                        this._length++;
                                    } else {
                                        if (this._length > 0 && this._cached == null) {
                                            this._tok0.update(this._buffer.markIndex(), this._buffer.markIndex() + this._length);
                                        }
                                        this._length = -1;
                                        this._state = -2;
                                    }
                                    b = -1;
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                                case -2:
                                    if (b4 != 9) {
                                        if (b4 == 10 || b4 == 13) {
                                            if (this._length > 0) {
                                                if (this._tok1.length() == 0) {
                                                    this._tok1.update(this._buffer.markIndex(), this._buffer.markIndex() + this._length);
                                                } else {
                                                    if (this._multiLineValue == null) {
                                                        this._multiLineValue = this._tok1.toString("ISO-8859-1");
                                                    }
                                                    this._tok1.update(this._buffer.markIndex(), this._buffer.markIndex() + this._length);
                                                    this._multiLineValue += MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this._tok1.toString("ISO-8859-1");
                                                }
                                            }
                                            this._eol = b4;
                                            this._state = -5;
                                        } else if (b4 != 32) {
                                            if (this._length == -1) {
                                                this._buffer.mark();
                                            }
                                            this._length = this._buffer.getIndex() - this._buffer.markIndex();
                                            this._state = -1;
                                        }
                                    }
                                    b = -1;
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                                case -1:
                                    if (b4 == 9) {
                                        this._state = -2;
                                    } else if (b4 == 10 || b4 == 13) {
                                        if (this._length > 0) {
                                            if (this._tok1.length() == 0) {
                                                this._tok1.update(this._buffer.markIndex(), this._buffer.markIndex() + this._length);
                                            } else {
                                                if (this._multiLineValue == null) {
                                                    this._multiLineValue = this._tok1.toString("ISO-8859-1");
                                                }
                                                this._tok1.update(this._buffer.markIndex(), this._buffer.markIndex() + this._length);
                                                this._multiLineValue += MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this._tok1.toString("ISO-8859-1");
                                            }
                                        }
                                        this._eol = b4;
                                        this._state = -5;
                                    } else if (b4 != 32) {
                                        this._length++;
                                    } else {
                                        this._state = -2;
                                    }
                                    b = -1;
                                    length = i9;
                                    b3 = b;
                                    b2 = 0;
                                    i5 = 1;
                                    break;
                            }
                        } else {
                            this._eol = (byte) 10;
                            b = b3;
                        }
                        b3 = b;
                        length = i9;
                        b2 = 0;
                        i5 = 1;
                    }
                }
            }
            int i15 = this._responseStatus;
            if (i15 > 0 && this._headResponse) {
                this._state = (this._persistent || (i15 >= 100 && i15 < 200)) ? 0 : 7;
                this._handler.messageComplete(this._contentLength);
            }
            int length3 = this._buffer.length();
            int i16 = this._state;
            while (true) {
                int i17 = this._state;
                if (i17 > 0 && length3 > 0) {
                    if (i16 != i17) {
                        i++;
                        i16 = i17;
                    }
                    if (this._eol != 13 || this._buffer.peek() != 10) {
                        this._eol = (byte) 0;
                        switch (this._state) {
                            case 1:
                                Buffer buffer5 = this._buffer;
                                Buffer buffer6 = buffer5.get(buffer5.length());
                                this._contentPosition += (long) buffer6.length();
                                this._contentView.update(buffer6);
                                this._handler.content(buffer6);
                                return 1;
                            case 2:
                                long j5 = this._contentLength;
                                long j6 = this._contentPosition;
                                long j7 = j5 - j6;
                                if (j7 == 0) {
                                    this._state = this._persistent ? 0 : 7;
                                    this._handler.messageComplete(j6);
                                    return 1;
                                }
                                if (length3 > j7) {
                                    length3 = (int) j7;
                                }
                                Buffer buffer7 = this._buffer.get(length3);
                                this._contentPosition += (long) buffer7.length();
                                this._contentView.update(buffer7);
                                this._handler.content(buffer7);
                                long j8 = this._contentPosition;
                                if (j8 != this._contentLength) {
                                    return 1;
                                }
                                this._state = this._persistent ? 0 : 7;
                                this._handler.messageComplete(j8);
                                return 1;
                            case 3:
                                byte bPeek = this._buffer.peek();
                                if (bPeek == 13 || bPeek == 10) {
                                    this._eol = this._buffer.get();
                                } else if (bPeek <= 32) {
                                    this._buffer.get();
                                } else {
                                    this._chunkLength = 0;
                                    this._chunkPosition = 0;
                                    this._state = 4;
                                }
                                length3 = this._buffer.length();
                                break;
                            case 4:
                                byte b5 = this._buffer.get();
                                if (b5 == 13 || b5 == 10) {
                                    this._eol = b5;
                                    if (this._chunkLength == 0) {
                                        if (b5 == 13 && this._buffer.hasContent() && this._buffer.peek() == 10) {
                                            this._eol = this._buffer.get();
                                        }
                                        this._state = this._persistent ? 0 : 7;
                                        this._handler.messageComplete(this._contentPosition);
                                        return 1;
                                    }
                                    this._state = 6;
                                } else if (b5 > 32 && b5 != 59) {
                                    if (b5 >= 48 && b5 <= 57) {
                                        this._chunkLength = (this._chunkLength * 16) + (b5 - 48);
                                    } else if (b5 >= 97 && b5 <= 102) {
                                        this._chunkLength = (this._chunkLength * 16) + (b5 - 87);
                                    } else {
                                        if (b5 < 65 || b5 > 70) {
                                            throw new IOException("bad chunk char: " + ((int) b5));
                                        }
                                        this._chunkLength = (this._chunkLength * 16) + (b5 - 55);
                                    }
                                    length3 = this._buffer.length();
                                } else {
                                    this._state = 5;
                                }
                                length3 = this._buffer.length();
                                break;
                            case 5:
                                byte b6 = this._buffer.get();
                                if (b6 == 13 || b6 == 10) {
                                    this._eol = b6;
                                    if (this._chunkLength == 0) {
                                        if (b6 == 13 && this._buffer.hasContent() && this._buffer.peek() == 10) {
                                            this._eol = this._buffer.get();
                                        }
                                        this._state = this._persistent ? 0 : 7;
                                        this._handler.messageComplete(this._contentPosition);
                                        return 1;
                                    }
                                    this._state = 6;
                                }
                                length3 = this._buffer.length();
                                break;
                            case 6:
                                int i18 = this._chunkLength - this._chunkPosition;
                                if (i18 != 0) {
                                    if (length3 > i18) {
                                        length3 = i18;
                                    }
                                    Buffer buffer8 = this._buffer.get(length3);
                                    this._contentPosition += (long) buffer8.length();
                                    this._chunkPosition += buffer8.length();
                                    this._contentView.update(buffer8);
                                    this._handler.content(buffer8);
                                    return 1;
                                }
                                this._state = 3;
                                length3 = this._buffer.length();
                                break;
                                break;
                            case 7:
                                if (this._buffer.length() > 2) {
                                    this._state = 0;
                                    this._endp.close();
                                } else {
                                    while (this._buffer.length() > 0) {
                                        if (!Character.isWhitespace(this._buffer.get())) {
                                            this._state = 0;
                                            this._endp.close();
                                            this._buffer.clear();
                                        }
                                    }
                                }
                                this._buffer.clear();
                                length3 = this._buffer.length();
                                break;
                            default:
                                length3 = this._buffer.length();
                                break;
                        }
                    } else {
                        this._eol = this._buffer.get();
                        length3 = this._buffer.length();
                    }
                }
            }
            return i;
        } catch (HttpException e5) {
            e = e5;
            z = false;
            this._persistent = z;
            this._state = 7;
            throw e;
        }
    }

    @Override // org.eclipse.jetty.http.Parser
    public void reset() {
        int i;
        Buffer buffer;
        View view = this._contentView;
        view.setGetIndex(view.putIndex());
        if (this._persistent) {
            i = -14;
        } else {
            i = this._endp.isInputShutdown() ? 0 : 7;
        }
        this._state = i;
        this._contentLength = -3L;
        this._contentPosition = 0L;
        this._length = 0;
        this._responseStatus = 0;
        if (this._eol == 13 && (buffer = this._buffer) != null && buffer.hasContent() && this._buffer.peek() == 10) {
            this._eol = this._buffer.get();
        }
        Buffer buffer2 = this._body;
        if (buffer2 != null && buffer2.hasContent()) {
            Buffer buffer3 = this._header;
            if (buffer3 == null) {
                getHeaderBuffer();
            } else {
                buffer3.setMarkIndex(-1);
                this._header.compact();
            }
            int iSpace = this._header.space();
            if (iSpace > this._body.length()) {
                iSpace = this._body.length();
            }
            Buffer buffer4 = this._body;
            buffer4.peek(buffer4.getIndex(), iSpace);
            Buffer buffer5 = this._body;
            buffer5.skip(this._header.put(buffer5.peek(buffer5.getIndex(), iSpace)));
        }
        Buffer buffer6 = this._header;
        if (buffer6 != null) {
            buffer6.setMarkIndex(-1);
            this._header.compact();
        }
        Buffer buffer7 = this._body;
        if (buffer7 != null) {
            buffer7.setMarkIndex(-1);
        }
        this._buffer = this._header;
        returnBuffers();
    }

    @Override // org.eclipse.jetty.http.Parser
    public void returnBuffers() {
        Buffers buffers;
        Buffers buffers2;
        Buffer buffer = this._body;
        if (buffer != null && !buffer.hasContent() && this._body.markIndex() == -1 && (buffers2 = this._buffers) != null) {
            Buffer buffer2 = this._buffer;
            Buffer buffer3 = this._body;
            if (buffer2 == buffer3) {
                this._buffer = this._header;
            }
            if (buffers2 != null) {
                buffers2.returnBuffer(buffer3);
            }
            this._body = null;
        }
        Buffer buffer4 = this._header;
        if (buffer4 == null || buffer4.hasContent() || this._header.markIndex() != -1 || (buffers = this._buffers) == null) {
            return;
        }
        Buffer buffer5 = this._buffer;
        Buffer buffer6 = this._header;
        if (buffer5 == buffer6) {
            this._buffer = null;
        }
        buffers.returnBuffer(buffer6);
        this._header = null;
    }

    public void setForceContentBuffer(boolean z) {
        this._forceContentBuffer = z;
    }

    public void setHeadResponse(boolean z) {
        this._headResponse = z;
    }

    @Override // org.eclipse.jetty.http.Parser
    public void setPersistent(boolean z) {
        this._persistent = z;
        if (z) {
            return;
        }
        int i = this._state;
        if (i == 0 || i == -14) {
            this._state = 7;
        }
    }

    public void setState(int i) {
        this._state = i;
        this._contentLength = -3L;
    }

    public String toString(Buffer buffer) {
        return "state=" + this._state + " length=" + this._length + " buf=" + buffer.hashCode();
    }

    public String toString() {
        return String.format("%s{s=%d,l=%d,c=%d}", getClass().getSimpleName(), Integer.valueOf(this._state), Integer.valueOf(this._length), Long.valueOf(this._contentLength));
    }

    public HttpParser(Buffers buffers, EndPoint endPoint, EventHandler eventHandler) {
        this._contentView = new View();
        this._state = -14;
        this._buffers = buffers;
        this._endp = endPoint;
        this._handler = eventHandler;
        this._tok0 = new View.CaseInsensitive();
        this._tok1 = new View.CaseInsensitive();
    }
}

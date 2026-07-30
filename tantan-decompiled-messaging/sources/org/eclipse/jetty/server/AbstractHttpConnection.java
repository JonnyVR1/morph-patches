package org.eclipse.jetty.server;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.DispatcherType;
import org.eclipse.jetty.continuation.ContinuationThrowable;
import org.eclipse.jetty.http.AbstractGenerator;
import org.eclipse.jetty.http.EncodedHttpURI;
import org.eclipse.jetty.http.Generator;
import org.eclipse.jetty.http.HttpBuffers;
import org.eclipse.jetty.http.HttpContent;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.http.HttpGenerator;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpParser;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpURI;
import org.eclipse.jetty.http.HttpVersions;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.http.Parser;
import org.eclipse.jetty.p123io.AbstractConnection;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.BufferCache;
import org.eclipse.jetty.p123io.Buffers;
import org.eclipse.jetty.p123io.Connection;
import org.eclipse.jetty.p123io.EndPoint;
import org.eclipse.jetty.p123io.EofException;
import org.eclipse.jetty.p123io.RuntimeIOException;
import org.eclipse.jetty.p123io.UncheckedPrintWriter;
import org.eclipse.jetty.server.nio.NIOConnector;
import org.eclipse.jetty.server.ssl.SslConnector;
import org.eclipse.jetty.util.QuotedStringTokenizer;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;
import p149l.ig3;
import p149l.qkq0;
import p149l.rhg0;
import p149l.yje0;
import p149l.zje0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractHttpConnection extends AbstractConnection {
    private static final int UNKNOWN = -2;
    private Object _associatedObject;
    private String _charset;
    protected final Connector _connector;
    private boolean _delayedHandling;
    private boolean _earlyEOF;
    private boolean _expect;
    private boolean _expect100Continue;
    private boolean _expect102Processing;
    protected final Generator _generator;
    private boolean _head;
    private boolean _host;
    protected volatile yje0 _in;
    int _include;
    protected volatile Output _out;
    protected final Parser _parser;
    protected volatile PrintWriter _printWriter;
    protected final Request _request;
    protected final HttpFields _requestFields;
    private int _requests;
    protected final Response _response;
    protected final HttpFields _responseFields;
    protected final Server _server;
    protected final HttpURI _uri;
    private int _version;
    protected volatile OutputWriter _writer;
    private static final Logger LOG = Log.getLogger((Class<?>) AbstractHttpConnection.class);
    private static final ThreadLocal<AbstractHttpConnection> __currentConnection = new ThreadLocal<>();

    public class Output extends HttpOutput {
        public Output() {
            super(AbstractHttpConnection.this);
        }

        @Override // org.eclipse.jetty.server.HttpOutput, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (isClosed()) {
                return;
            }
            if (AbstractHttpConnection.this.isIncluding() || this._generator.isCommitted()) {
                AbstractHttpConnection.this.flushResponse();
            } else {
                AbstractHttpConnection.this.commitResponse(true);
            }
            super.close();
        }

        @Override // org.eclipse.jetty.server.HttpOutput, java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            if (!this._generator.isCommitted()) {
                AbstractHttpConnection.this.commitResponse(false);
            }
            super.flush();
        }

        @Override // org.eclipse.jetty.server.HttpOutput, p149l.zje0
        public void print(String str) throws IOException {
            if (isClosed()) {
                rhg0.m179353a("Closed");
            } else {
                AbstractHttpConnection.this.getPrintWriter(null).print(str);
            }
        }

        public void sendContent(Object obj) throws IOException {
            AbstractGenerator abstractGenerator;
            if (isClosed()) {
                rhg0.m179353a("Closed");
                return;
            }
            if (this._generator.isWritten()) {
                qkq0.m175383a("!empty");
                return;
            }
            Resource resource = null;
            if (obj instanceof HttpContent) {
                HttpContent httpContent = (HttpContent) obj;
                Buffer contentType = httpContent.getContentType();
                if (contentType != null) {
                    HttpFields httpFields = AbstractHttpConnection.this._responseFields;
                    Buffer buffer = HttpHeaders.CONTENT_TYPE_BUFFER;
                    if (!httpFields.containsKey(buffer)) {
                        String setCharacterEncoding = AbstractHttpConnection.this._response.getSetCharacterEncoding();
                        if (setCharacterEncoding == null) {
                            AbstractHttpConnection.this._responseFields.add(buffer, contentType);
                        } else if (contentType instanceof BufferCache.CachedBuffer) {
                            BufferCache.CachedBuffer associate = ((BufferCache.CachedBuffer) contentType).getAssociate(setCharacterEncoding);
                            AbstractHttpConnection abstractHttpConnection = AbstractHttpConnection.this;
                            if (associate != null) {
                                abstractHttpConnection._responseFields.put(buffer, associate);
                            } else {
                                abstractHttpConnection._responseFields.put(buffer, contentType + ";charset=" + QuotedStringTokenizer.quoteIfNeeded(setCharacterEncoding, ";= "));
                            }
                        } else {
                            AbstractHttpConnection.this._responseFields.put(buffer, contentType + ";charset=" + QuotedStringTokenizer.quoteIfNeeded(setCharacterEncoding, ";= "));
                        }
                    }
                }
                if (httpContent.getContentLength() > 0) {
                    AbstractHttpConnection.this._responseFields.putLongField(HttpHeaders.CONTENT_LENGTH_BUFFER, httpContent.getContentLength());
                }
                Buffer lastModified = httpContent.getLastModified();
                long jLastModified = httpContent.getResource().lastModified();
                if (lastModified != null) {
                    AbstractHttpConnection.this._responseFields.put(HttpHeaders.LAST_MODIFIED_BUFFER, lastModified);
                } else if (httpContent.getResource() != null && jLastModified != -1) {
                    AbstractHttpConnection.this._responseFields.putDateField(HttpHeaders.LAST_MODIFIED_BUFFER, jLastModified);
                }
                Connector connector = AbstractHttpConnection.this._connector;
                Buffer directBuffer = ((connector instanceof NIOConnector) && ((NIOConnector) connector).getUseDirectBuffers() && !(AbstractHttpConnection.this._connector instanceof SslConnector)) ? httpContent.getDirectBuffer() : httpContent.getIndirectBuffer();
                obj = directBuffer == null ? httpContent.getInputStream() : directBuffer;
            } else if (obj instanceof Resource) {
                resource = (Resource) obj;
                AbstractHttpConnection.this._responseFields.putDateField(HttpHeaders.LAST_MODIFIED_BUFFER, resource.lastModified());
                obj = resource.getInputStream();
            }
            if (obj instanceof Buffer) {
                this._generator.addContent((Buffer) obj, true);
                AbstractHttpConnection.this.commitResponse(true);
                return;
            }
            if (!(obj instanceof InputStream)) {
                ig3.m135964a("unknown content type?");
                return;
            }
            InputStream inputStream = (InputStream) obj;
            try {
                int from = this._generator.getUncheckedBuffer().readFrom(inputStream, this._generator.prepareUncheckedAddContent());
                while (true) {
                    abstractGenerator = this._generator;
                    if (from < 0) {
                        break;
                    }
                    abstractGenerator.completeUncheckedAddContent();
                    AbstractHttpConnection.this._out.flush();
                    from = this._generator.getUncheckedBuffer().readFrom(inputStream, this._generator.prepareUncheckedAddContent());
                }
                abstractGenerator.completeUncheckedAddContent();
                AbstractHttpConnection.this._out.flush();
            } finally {
                if (resource != null) {
                    resource.release();
                } else {
                    inputStream.close();
                }
            }
        }

        public void sendResponse(Buffer buffer) throws IOException {
            ((HttpGenerator) this._generator).sendResponse(buffer);
        }
    }

    public class OutputWriter extends HttpWriter {
        public OutputWriter() {
            super(AbstractHttpConnection.this._out);
        }
    }

    public class RequestHandler extends HttpParser.EventHandler {
        private RequestHandler() {
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void content(Buffer buffer) throws Throwable {
            AbstractHttpConnection.this.content(buffer);
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void earlyEOF() {
            AbstractHttpConnection.this.earlyEOF();
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void headerComplete() throws Throwable {
            AbstractHttpConnection.this.headerComplete();
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void messageComplete(long j) throws Throwable {
            AbstractHttpConnection.this.messageComplete(j);
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void parsedHeader(Buffer buffer, Buffer buffer2) throws IOException {
            AbstractHttpConnection.this.parsedHeader(buffer, buffer2);
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void startRequest(Buffer buffer, Buffer buffer2, Buffer buffer3) throws IOException {
            AbstractHttpConnection.this.startRequest(buffer, buffer2, buffer3);
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void startResponse(Buffer buffer, int i, Buffer buffer2) {
            if (AbstractHttpConnection.LOG.isDebugEnabled()) {
                AbstractHttpConnection.LOG.debug("Bad request!: " + buffer + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + buffer2, new Object[0]);
            }
        }
    }

    public AbstractHttpConnection(Connector connector, EndPoint endPoint, Server server) {
        super(endPoint);
        this._version = -2;
        this._expect = false;
        this._expect100Continue = false;
        this._expect102Processing = false;
        this._head = false;
        this._host = false;
        this._delayedHandling = false;
        this._earlyEOF = false;
        String str = URIUtil.__CHARSET;
        this._uri = "UTF-8".equals(str) ? new HttpURI() : new EncodedHttpURI(str);
        this._connector = connector;
        HttpBuffers httpBuffers = (HttpBuffers) connector;
        this._parser = newHttpParser(httpBuffers.getRequestBuffers(), endPoint, new RequestHandler());
        this._requestFields = new HttpFields();
        this._responseFields = new HttpFields();
        this._request = new Request(this);
        this._response = new Response(this);
        HttpGenerator httpGeneratorNewHttpGenerator = newHttpGenerator(httpBuffers.getResponseBuffers(), endPoint);
        this._generator = httpGeneratorNewHttpGenerator;
        httpGeneratorNewHttpGenerator.setSendServerVersion(server.getSendServerVersion());
        this._server = server;
    }

    public static AbstractHttpConnection getCurrentConnection() {
        return __currentConnection.get();
    }

    public static void setCurrentConnection(AbstractHttpConnection abstractHttpConnection) {
        __currentConnection.set(abstractHttpConnection);
    }

    public void commitResponse(boolean z) throws IOException {
        if (!this._generator.isCommitted()) {
            this._generator.setResponse(this._response.getStatus(), this._response.getReason());
            try {
                if (this._expect100Continue && this._response.getStatus() != 100) {
                    this._generator.setPersistent(false);
                }
                this._generator.completeHeader(this._responseFields, z);
            } catch (RuntimeException e) {
                LOG.warn("header full: " + e, new Object[0]);
                this._response.reset();
                this._generator.reset();
                this._generator.setResponse(500, null);
                this._generator.completeHeader(this._responseFields, true);
                this._generator.complete();
                throw new HttpException(500);
            }
        }
        if (z) {
            this._generator.complete();
        }
    }

    public void completeResponse() throws IOException {
        if (!this._generator.isCommitted()) {
            this._generator.setResponse(this._response.getStatus(), this._response.getReason());
            try {
                this._generator.completeHeader(this._responseFields, true);
            } catch (RuntimeException e) {
                Logger logger = LOG;
                logger.warn("header full: " + e, new Object[0]);
                logger.debug(e);
                this._response.reset();
                this._generator.reset();
                this._generator.setResponse(500, null);
                this._generator.completeHeader(this._responseFields, true);
                this._generator.complete();
                throw new HttpException(500);
            }
        }
        this._generator.complete();
    }

    public void content(Buffer buffer) throws Throwable {
        if (this._delayedHandling) {
            this._delayedHandling = false;
            handleRequest();
        }
    }

    public void earlyEOF() {
        this._earlyEOF = true;
    }

    public void flushResponse() throws IOException {
        try {
            commitResponse(false);
            this._generator.flushBuffer();
        } catch (IOException e) {
            if (!(e instanceof EofException)) {
                throw new EofException(e);
            }
        }
    }

    public Object getAssociatedObject() {
        return this._associatedObject;
    }

    public Connector getConnector() {
        return this._connector;
    }

    public Generator getGenerator() {
        return this._generator;
    }

    public yje0 getInputStream() throws IOException {
        if (this._expect100Continue) {
            if (((HttpParser) this._parser).getHeaderBuffer() == null || ((HttpParser) this._parser).getHeaderBuffer().length() < 2) {
                if (this._generator.isCommitted()) {
                    qkq0.m175383a("Committed before 100 Continues");
                    return null;
                }
                ((HttpGenerator) this._generator).send1xx(100);
            }
            this._expect100Continue = false;
        }
        if (this._in == null) {
            this._in = new HttpInput(this);
        }
        return this._in;
    }

    public int getMaxIdleTime() {
        if (this._connector.isLowResources() && this._endp.getMaxIdleTime() == this._connector.getMaxIdleTime()) {
            return this._connector.getLowResourceMaxIdleTime();
        }
        return this._endp.getMaxIdleTime() > 0 ? this._endp.getMaxIdleTime() : this._connector.getMaxIdleTime();
    }

    public zje0 getOutputStream() {
        if (this._out == null) {
            this._out = new Output();
        }
        return this._out;
    }

    public Parser getParser() {
        return this._parser;
    }

    public PrintWriter getPrintWriter(String str) {
        getOutputStream();
        if (this._writer == null) {
            this._writer = new OutputWriter();
            if (this._server.isUncheckedPrintWriter()) {
                this._printWriter = new UncheckedPrintWriter(this._writer);
            } else {
                this._printWriter = new PrintWriter(this._writer) { // from class: org.eclipse.jetty.server.AbstractHttpConnection.1
                    @Override // java.io.PrintWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        synchronized (((PrintWriter) this).lock) {
                            try {
                                ((PrintWriter) this).out.close();
                            } catch (IOException unused) {
                                setError();
                            }
                        }
                    }
                };
            }
        }
        this._writer.setCharacterEncoding(str);
        return this._printWriter;
    }

    public Request getRequest() {
        return this._request;
    }

    public HttpFields getRequestFields() {
        return this._requestFields;
    }

    public int getRequests() {
        return this._requests;
    }

    public boolean getResolveNames() {
        return this._connector.getResolveNames();
    }

    public Response getResponse() {
        return this._response;
    }

    public HttpFields getResponseFields() {
        return this._responseFields;
    }

    public Server getServer() {
        return this._server;
    }

    @Override // org.eclipse.jetty.p123io.Connection
    public abstract Connection handle() throws IOException;

    /* JADX WARN: Code duplicated, block: B:160:0x0287  */
    /* JADX WARN: Code duplicated, block: B:163:0x0298  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02db  */
    /* JADX WARN: Code duplicated, block: B:181:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:182:0x0305  */
    /* JADX WARN: Code duplicated, block: B:81:0x0143 A[PHI: r8
      0x0143: PHI (r8v15 'th' java.lang.Throwable) = 
      (r8v7 'th' java.lang.Throwable)
      (r8v8 'th' java.lang.Throwable)
      (r8v5 'th' java.lang.Throwable)
      (r8v16 'th' java.lang.Throwable)
     binds: [B:106:0x019c, B:117:0x01c8, B:97:0x017d, B:80:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0149 A[PHI: r8
      0x0149: PHI (r8v13 'th' java.lang.Throwable) = 
      (r8v7 'th' java.lang.Throwable)
      (r8v7 'th' java.lang.Throwable)
      (r8v7 'th' java.lang.Throwable)
      (r8v8 'th' java.lang.Throwable)
      (r8v8 'th' java.lang.Throwable)
      (r8v8 'th' java.lang.Throwable)
      (r8v5 'th' java.lang.Throwable)
      (r8v5 'th' java.lang.Throwable)
      (r8v5 'th' java.lang.Throwable)
      (r8v16 'th' java.lang.Throwable)
      (r8v16 'th' java.lang.Throwable)
      (r8v16 'th' java.lang.Throwable)
     binds: [B:102:0x0192, B:104:0x0198, B:106:0x019c, B:113:0x01be, B:115:0x01c4, B:117:0x01c8, B:93:0x0173, B:95:0x0179, B:97:0x017d, B:76:0x0137, B:78:0x013d, B:80:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    public void handleRequest() throws Throwable {
        boolean z;
        Throwable th;
        String name;
        String strCanonicalPath;
        String decodedPath;
        String str = null;
        try {
            if (LOG.isDebugEnabled()) {
                name = Thread.currentThread().getName();
                try {
                    Thread.currentThread().setName(name + " - " + this._uri);
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    th = null;
                    str = name;
                    if (str != null) {
                        Thread.currentThread().setName(str);
                    }
                    if (this._request._async.isUncompleted()) {
                        this._request._async.doComplete(th);
                        if (this._expect100Continue) {
                            LOG.debug("100 continues not sent", new Object[0]);
                            this._expect100Continue = false;
                            if (!this._response.isCommitted()) {
                                this._generator.setPersistent(false);
                            }
                        }
                        if (this._endp.isOpen()) {
                            this._response.complete();
                        } else if (z) {
                            this._endp.shutdownOutput();
                            this._generator.setPersistent(false);
                            if (!this._generator.isComplete()) {
                                this._response.complete();
                            }
                        } else {
                            if (!this._response.isCommitted()) {
                                this._response.sendError(404);
                            }
                            this._response.complete();
                            if (this._generator.isPersistent()) {
                                this._connector.persist(this._endp);
                            }
                        }
                        this._request.setHandled(true);
                    }
                    throw th;
                }
            } else {
                name = null;
            }
            Server server = this._server;
            boolean z2 = this._request._async.handling() && server != null && server.isRunning();
            z = false;
            th = null;
            while (z2) {
                try {
                    this._request.setHandled(false);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        this._uri.getPort();
                                        try {
                                            decodedPath = this._uri.getDecodedPath();
                                        } catch (Exception e) {
                                            Logger logger = LOG;
                                            logger.warn("Failed UTF-8 decode for request path, trying ISO-8859-1", new Object[0]);
                                            logger.ignore(e);
                                            decodedPath = this._uri.getDecodedPath("ISO-8859-1");
                                        }
                                        strCanonicalPath = URIUtil.canonicalPath(decodedPath);
                                        if (strCanonicalPath == null) {
                                            try {
                                                if (!this._request.getMethod().equals(HttpMethods.CONNECT)) {
                                                    if (this._uri.getScheme() == null || this._uri.getHost() == null) {
                                                        throw new HttpException(400);
                                                    }
                                                    strCanonicalPath = "/";
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    LOG.warn(String.valueOf(this._uri), th);
                                                    try {
                                                        this._request.setHandled(true);
                                                        this._generator.sendError(strCanonicalPath == null ? 400 : 500, null, null, true);
                                                        try {
                                                            if (this._request._async.unhandle() || !server.isRunning() || this._server == null) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            z = true;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            z = true;
                                                            str = name;
                                                            if (str != null) {
                                                                Thread.currentThread().setName(str);
                                                            }
                                                            if (this._request._async.isUncompleted()) {
                                                                this._request._async.doComplete(th);
                                                                if (this._expect100Continue) {
                                                                    LOG.debug("100 continues not sent", new Object[0]);
                                                                    this._expect100Continue = false;
                                                                    if (!this._response.isCommitted()) {
                                                                        this._generator.setPersistent(false);
                                                                    }
                                                                }
                                                                if (this._endp.isOpen()) {
                                                                    this._response.complete();
                                                                } else if (z) {
                                                                    this._endp.shutdownOutput();
                                                                    this._generator.setPersistent(false);
                                                                    if (!this._generator.isComplete()) {
                                                                        this._response.complete();
                                                                    }
                                                                } else {
                                                                    if (!this._response.isCommitted() && !this._request.isHandled()) {
                                                                        this._response.sendError(404);
                                                                    }
                                                                    this._response.complete();
                                                                    if (this._generator.isPersistent()) {
                                                                        this._connector.persist(this._endp);
                                                                    }
                                                                }
                                                                this._request.setHandled(true);
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        z = true;
                                                        if (!this._request._async.unhandle() && server.isRunning()) {
                                                            Server server2 = this._server;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    if (!this._request._async.unhandle()) {
                                                        Server server3 = this._server;
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                        this._request.setPathInfo(strCanonicalPath);
                                        if (this._out != null) {
                                            this._out.reopen();
                                        }
                                        boolean zIsInitial = this._request._async.isInitial();
                                        Request request = this._request;
                                        if (zIsInitial) {
                                            request.setDispatcherType(DispatcherType.REQUEST);
                                            this._connector.customize(this._endp, this._request);
                                            server.handle(this);
                                        } else {
                                            request.setDispatcherType(DispatcherType.ASYNC);
                                            server.handleAsync(this);
                                        }
                                        z2 = (this._request._async.unhandle() || !server.isRunning() || this._server == null) ? false : true;
                                    } catch (ContinuationThrowable e2) {
                                        LOG.ignore(e2);
                                        if (this._request._async.unhandle() || !server.isRunning() || this._server == null) {
                                        }
                                    }
                                } catch (HttpException e3) {
                                    LOG.debug(e3);
                                    this._request.setHandled(true);
                                    this._response.sendError(e3.getStatus(), e3.getReason());
                                    if (this._request._async.unhandle() || !server.isRunning() || this._server == null) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    z = true;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                strCanonicalPath = null;
                            }
                        } catch (EofException e4) {
                            th = e4;
                            LOG.debug(th);
                            this._request.setHandled(true);
                            if (!this._response.isCommitted()) {
                                this._generator.sendError(500, null, null, true);
                            }
                            if (this._request._async.unhandle() || !server.isRunning() || this._server == null) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            z = true;
                        }
                    } catch (RuntimeIOException e5) {
                        th = e5;
                        LOG.debug(th);
                        this._request.setHandled(true);
                        if (this._request._async.unhandle() || !server.isRunning() || this._server == null) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z = true;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
            if (name != null) {
                Thread.currentThread().setName(name);
            }
            if (this._request._async.isUncompleted()) {
                this._request._async.doComplete(th);
                if (this._expect100Continue) {
                    LOG.debug("100 continues not sent", new Object[0]);
                    this._expect100Continue = false;
                    if (!this._response.isCommitted()) {
                        this._generator.setPersistent(false);
                    }
                }
                if (!this._endp.isOpen()) {
                    this._response.complete();
                } else if (z) {
                    this._endp.shutdownOutput();
                    this._generator.setPersistent(false);
                    if (!this._generator.isComplete()) {
                        this._response.complete();
                    }
                } else {
                    if (!this._response.isCommitted() && !this._request.isHandled()) {
                        this._response.sendError(404);
                    }
                    this._response.complete();
                    if (this._generator.isPersistent()) {
                        this._connector.persist(this._endp);
                    }
                }
                this._request.setHandled(true);
            }
        } catch (Throwable th9) {
            th = th9;
            z = false;
            th = null;
        }
    }

    public void headerComplete() throws Throwable {
        this._requests++;
        this._generator.setVersion(this._version);
        int i = this._version;
        if (i == 10) {
            this._generator.setHead(this._head);
            if (this._parser.isPersistent()) {
                this._responseFields.add(HttpHeaders.CONNECTION_BUFFER, HttpHeaderValues.KEEP_ALIVE_BUFFER);
                this._generator.setPersistent(true);
            } else if (HttpMethods.CONNECT.equals(this._request.getMethod())) {
                this._generator.setPersistent(true);
                this._parser.setPersistent(true);
            }
            if (this._server.getSendDateHeader()) {
                this._generator.setDate(this._request.getTimeStampBuffer());
            }
        } else if (i == 11) {
            this._generator.setHead(this._head);
            if (!this._parser.isPersistent()) {
                this._responseFields.add(HttpHeaders.CONNECTION_BUFFER, HttpHeaderValues.CLOSE_BUFFER);
                this._generator.setPersistent(false);
            }
            if (this._server.getSendDateHeader()) {
                this._generator.setDate(this._request.getTimeStampBuffer());
            }
            if (!this._host) {
                LOG.debug("!host {}", this);
                this._generator.setResponse(400, null);
                this._responseFields.put(HttpHeaders.CONNECTION_BUFFER, HttpHeaderValues.CLOSE_BUFFER);
                this._generator.completeHeader(this._responseFields, true);
                this._generator.complete();
                return;
            }
            if (this._expect) {
                LOG.debug("!expectation {}", this);
                this._generator.setResponse(HttpStatus.EXPECTATION_FAILED_417, null);
                this._responseFields.put(HttpHeaders.CONNECTION_BUFFER, HttpHeaderValues.CLOSE_BUFFER);
                this._generator.completeHeader(this._responseFields, true);
                this._generator.complete();
                return;
            }
        }
        String str = this._charset;
        if (str != null) {
            this._request.setCharacterEncodingUnchecked(str);
        }
        if ((((HttpParser) this._parser).getContentLength() > 0 || ((HttpParser) this._parser).isChunking()) && !this._expect100Continue) {
            this._delayedHandling = true;
        } else {
            handleRequest();
        }
    }

    public void include() {
        this._include++;
    }

    public void included() {
        this._include--;
        if (this._out != null) {
            this._out.reopen();
        }
    }

    public boolean isConfidential(Request request) {
        Connector connector = this._connector;
        return connector != null && connector.isConfidential(request);
    }

    public boolean isEarlyEOF() {
        return this._earlyEOF;
    }

    public boolean isExpecting100Continues() {
        return this._expect100Continue;
    }

    public boolean isExpecting102Processing() {
        return this._expect102Processing;
    }

    @Override // org.eclipse.jetty.p123io.Connection
    public boolean isIdle() {
        if (this._generator.isIdle()) {
            return this._parser.isIdle() || this._delayedHandling;
        }
        return false;
    }

    public boolean isIncluding() {
        return this._include > 0;
    }

    public boolean isIntegral(Request request) {
        Connector connector = this._connector;
        return connector != null && connector.isIntegral(request);
    }

    public boolean isResponseCommitted() {
        return this._generator.isCommitted();
    }

    @Override // org.eclipse.jetty.p123io.Connection
    public boolean isSuspended() {
        return this._request.getAsyncContinuation().isSuspended();
    }

    public void messageComplete(long j) throws Throwable {
        if (this._delayedHandling) {
            this._delayedHandling = false;
            handleRequest();
        }
    }

    public HttpGenerator newHttpGenerator(Buffers buffers, EndPoint endPoint) {
        return new HttpGenerator(buffers, endPoint);
    }

    public HttpParser newHttpParser(Buffers buffers, EndPoint endPoint, HttpParser.EventHandler eventHandler) {
        return new HttpParser(buffers, endPoint, eventHandler);
    }

    @Override // org.eclipse.jetty.p123io.Connection
    public void onClose() {
        LOG.debug("closed {}", this);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    public void parsedHeader(Buffer buffer, Buffer buffer2) throws IOException {
        int ordinal = HttpHeaders.CACHE.getOrdinal(buffer);
        if (ordinal == 16) {
            buffer2 = MimeTypes.CACHE.lookup(buffer2);
            this._charset = MimeTypes.getCharsetFromContentType(buffer2);
        } else if (ordinal == 21) {
            buffer2 = HttpHeaderValues.CACHE.lookup(buffer2);
        } else if (ordinal == 24) {
            HttpHeaderValues httpHeaderValues = HttpHeaderValues.CACHE;
            buffer2 = httpHeaderValues.lookup(buffer2);
            int ordinal2 = httpHeaderValues.getOrdinal(buffer2);
            if (ordinal2 == 6) {
                this._expect100Continue = this._generator instanceof HttpGenerator;
            } else if (ordinal2 != 7) {
                String[] strArrSplit = buffer2.toString().split(Constants.SEPARATOR_COMMA);
                for (int i = 0; strArrSplit != null && i < strArrSplit.length; i++) {
                    BufferCache.CachedBuffer cachedBuffer = HttpHeaderValues.CACHE.get(strArrSplit[i].trim());
                    if (cachedBuffer == null) {
                        this._expect = true;
                    } else {
                        int ordinal3 = cachedBuffer.getOrdinal();
                        if (ordinal3 == 6) {
                            this._expect100Continue = this._generator instanceof HttpGenerator;
                        } else if (ordinal3 != 7) {
                            this._expect = true;
                        } else {
                            this._expect102Processing = this._generator instanceof HttpGenerator;
                        }
                    }
                }
            } else {
                this._expect102Processing = this._generator instanceof HttpGenerator;
            }
        } else if (ordinal == 27) {
            this._host = true;
        } else if (ordinal == 40) {
            buffer2 = HttpHeaderValues.CACHE.lookup(buffer2);
        }
        this._requestFields.add(buffer, buffer2);
    }

    public void reset() {
        this._parser.reset();
        this._parser.returnBuffers();
        this._requestFields.clear();
        this._request.recycle();
        this._generator.reset();
        this._generator.returnBuffers();
        this._responseFields.clear();
        this._response.recycle();
        this._uri.clear();
        this._writer = null;
        this._earlyEOF = false;
    }

    public void setAssociatedObject(Object obj) {
        this._associatedObject = obj;
    }

    public void startRequest(Buffer buffer, Buffer buffer2, Buffer buffer3) throws IOException {
        Buffer bufferAsImmutableBuffer = buffer2.asImmutableBuffer();
        this._host = false;
        this._expect = false;
        this._expect100Continue = false;
        this._expect102Processing = false;
        this._delayedHandling = false;
        this._charset = null;
        if (this._request.getTimeStamp() == 0) {
            this._request.setTimeStamp(System.currentTimeMillis());
        }
        this._request.setMethod(buffer.toString());
        try {
            this._head = false;
            int ordinal = HttpMethods.CACHE.getOrdinal(buffer);
            if (ordinal != 3) {
                HttpURI httpURI = this._uri;
                if (ordinal != 8) {
                    httpURI.parse(bufferAsImmutableBuffer.array(), bufferAsImmutableBuffer.getIndex(), bufferAsImmutableBuffer.length());
                } else {
                    httpURI.parseConnect(bufferAsImmutableBuffer.array(), bufferAsImmutableBuffer.getIndex(), bufferAsImmutableBuffer.length());
                }
            } else {
                this._head = true;
                this._uri.parse(bufferAsImmutableBuffer.array(), bufferAsImmutableBuffer.getIndex(), bufferAsImmutableBuffer.length());
            }
            this._request.setUri(this._uri);
            if (buffer3 == null) {
                this._request.setProtocol("");
                this._version = 9;
                return;
            }
            BufferCache bufferCache = HttpVersions.CACHE;
            BufferCache.CachedBuffer cachedBuffer = bufferCache.get(buffer3);
            if (cachedBuffer == null) {
                throw new HttpException(400, null);
            }
            int ordinal2 = bufferCache.getOrdinal(cachedBuffer);
            this._version = ordinal2;
            if (ordinal2 <= 0) {
                this._version = 10;
            }
            this._request.setProtocol(cachedBuffer.toString());
        } catch (Exception e) {
            LOG.debug(e);
            if (!(e instanceof HttpException)) {
                throw new HttpException(400, null, e);
            }
            throw ((HttpException) e);
        }
    }

    @Override // org.eclipse.jetty.p123io.AbstractConnection
    public String toString() {
        return String.format("%s,g=%s,p=%s,r=%d", super.toString(), this._generator, this._parser, Integer.valueOf(this._requests));
    }

    public AbstractHttpConnection(Connector connector, EndPoint endPoint, Server server, Parser parser, Generator generator, Request request) {
        super(endPoint);
        this._version = -2;
        this._expect = false;
        this._expect100Continue = false;
        this._expect102Processing = false;
        this._head = false;
        this._host = false;
        this._delayedHandling = false;
        this._earlyEOF = false;
        String str = URIUtil.__CHARSET;
        this._uri = str.equals("UTF-8") ? new HttpURI() : new EncodedHttpURI(str);
        this._connector = connector;
        this._parser = parser;
        this._requestFields = new HttpFields();
        this._responseFields = new HttpFields();
        this._request = request;
        this._response = new Response(this);
        this._generator = generator;
        generator.setSendServerVersion(server.getSendServerVersion());
        this._server = server;
    }
}

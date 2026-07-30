package org.eclipse.jetty.server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.TimeZone;
import javax.servlet.http.Cookie;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.util.DateCache;
import org.eclipse.jetty.util.RolloverFileOutputStream;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class NCSARequestLog extends AbstractLifeCycle implements RequestLog {
    private static final Logger LOG = Log.getLogger((Class<?>) NCSARequestLog.class);
    private boolean _closeOut;
    private transient OutputStream _fileOut;
    private String _filename;
    private transient PathMap _ignorePathMap;
    private String[] _ignorePaths;
    private transient DateCache _logDateCache;
    private transient OutputStream _out;
    private boolean _preferProxiedForAddress;
    private transient Writer _writer;
    private String _logDateFormat = "dd/MMM/yyyy:HH:mm:ss Z";
    private String _filenameDateFormat = null;
    private Locale _logLocale = Locale.getDefault();
    private String _logTimeZone = "GMT";
    private boolean _logLatency = false;
    private boolean _logCookies = false;
    private boolean _logServer = false;
    private boolean _logDispatch = false;
    private boolean _extended = true;
    private boolean _append = true;
    private int _retainDays = 31;

    public NCSARequestLog(String str) {
        setFilename(str);
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public synchronized void doStart() throws Exception {
        try {
            if (this._logDateFormat != null) {
                DateCache dateCache = new DateCache(this._logDateFormat, this._logLocale);
                this._logDateCache = dateCache;
                dateCache.setTimeZoneID(this._logTimeZone);
            }
            int i = 0;
            if (this._filename != null) {
                this._fileOut = new RolloverFileOutputStream(this._filename, this._append, this._retainDays, TimeZone.getTimeZone(this._logTimeZone), this._filenameDateFormat, null);
                this._closeOut = true;
                LOG.info("Opened " + getDatedFilename(), new Object[0]);
            } else {
                this._fileOut = System.err;
            }
            this._out = this._fileOut;
            String[] strArr = this._ignorePaths;
            if (strArr != null && strArr.length > 0) {
                this._ignorePathMap = new PathMap();
                while (true) {
                    String[] strArr2 = this._ignorePaths;
                    if (i >= strArr2.length) {
                        break;
                    }
                    PathMap pathMap = this._ignorePathMap;
                    String str = strArr2[i];
                    pathMap.put(str, str);
                    i++;
                }
            } else {
                this._ignorePathMap = null;
            }
            this._writer = new OutputStreamWriter(this._out);
            super.doStart();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0026 A[Catch: all -> 0x000c, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0004, B:6:0x0008, B:12:0x0014, B:14:0x0018, B:16:0x001c, B:19:0x0021, B:20:0x0026, B:21:0x0032, B:11:0x000f), top: B:27:0x0001, inners: #0, #2 }] */
    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        OutputStream outputStream;
        synchronized (this) {
            super.doStop();
            try {
                Writer writer = this._writer;
                if (writer != null) {
                    writer.flush();
                    outputStream = this._out;
                    if (outputStream == null && this._closeOut) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            LOG.ignore(e);
                        }
                        this._out = null;
                        this._fileOut = null;
                        this._closeOut = false;
                        this._logDateCache = null;
                        this._writer = null;
                    } else {
                        this._out = null;
                        this._fileOut = null;
                        this._closeOut = false;
                        this._logDateCache = null;
                        this._writer = null;
                    }
                } else {
                    outputStream = this._out;
                    if (outputStream == null) {
                        this._out = null;
                        this._fileOut = null;
                        this._closeOut = false;
                        this._logDateCache = null;
                        this._writer = null;
                    } else {
                        this._out = null;
                        this._fileOut = null;
                        this._closeOut = false;
                        this._logDateCache = null;
                        this._writer = null;
                    }
                }
            } catch (IOException e2) {
                LOG.ignore(e2);
            }
            throw th;
        }
    }

    public String getDatedFilename() {
        OutputStream outputStream = this._fileOut;
        if (outputStream instanceof RolloverFileOutputStream) {
            return ((RolloverFileOutputStream) outputStream).getDatedFilename();
        }
        return null;
    }

    public String getFilename() {
        return this._filename;
    }

    public String getFilenameDateFormat() {
        return this._filenameDateFormat;
    }

    public String[] getIgnorePaths() {
        return this._ignorePaths;
    }

    public boolean getLogCookies() {
        return this._logCookies;
    }

    public String getLogDateFormat() {
        return this._logDateFormat;
    }

    public boolean getLogLatency() {
        return this._logLatency;
    }

    public Locale getLogLocale() {
        return this._logLocale;
    }

    public boolean getLogServer() {
        return this._logServer;
    }

    public String getLogTimeZone() {
        return this._logTimeZone;
    }

    public boolean getPreferProxiedForAddress() {
        return this._preferProxiedForAddress;
    }

    public int getRetainDays() {
        return this._retainDays;
    }

    public boolean isAppend() {
        return this._append;
    }

    public boolean isExtended() {
        return this._extended;
    }

    public boolean isLogDispatch() {
        return this._logDispatch;
    }

    @Override // org.eclipse.jetty.server.RequestLog
    public void log(Request request, Response response) {
        try {
            PathMap pathMap = this._ignorePathMap;
            if ((pathMap == null || pathMap.getMatch(request.getRequestURI()) == null) && this._fileOut != null) {
                StringBuilder sb = new StringBuilder(256);
                if (this._logServer) {
                    sb.append(request.getServerName());
                    sb.append(' ');
                }
                String header = this._preferProxiedForAddress ? request.getHeader(HttpHeaders.X_FORWARDED_FOR) : null;
                if (header == null) {
                    header = request.getRemoteAddr();
                }
                sb.append(header);
                sb.append(" - ");
                Authentication authentication = request.getAuthentication();
                if (authentication instanceof Authentication.User) {
                    sb.append(((Authentication.User) authentication).getUserIdentity().getUserPrincipal().getName());
                } else {
                    sb.append(" - ");
                }
                sb.append(" [");
                DateCache dateCache = this._logDateCache;
                if (dateCache != null) {
                    sb.append(dateCache.format(request.getTimeStamp()));
                } else {
                    sb.append(request.getTimeStampBuffer().toString());
                }
                sb.append("] \"");
                sb.append(request.getMethod());
                sb.append(' ');
                sb.append(request.getUri().toString());
                sb.append(' ');
                sb.append(request.getProtocol());
                sb.append("\" ");
                if (request.getAsyncContinuation().isInitial()) {
                    int status = response.getStatus();
                    if (status <= 0) {
                        status = 404;
                    }
                    sb.append((char) (((status / 100) % 10) + 48));
                    sb.append((char) (((status / 10) % 10) + 48));
                    sb.append((char) ((status % 10) + 48));
                } else {
                    sb.append("Async");
                }
                long contentCount = response.getContentCount();
                if (contentCount >= 0) {
                    sb.append(' ');
                    if (contentCount > 99999) {
                        sb.append(contentCount);
                    } else {
                        if (contentCount > 9999) {
                            sb.append((char) (((contentCount / 10000) % 10) + 48));
                        }
                        if (contentCount > 999) {
                            sb.append((char) (((contentCount / 1000) % 10) + 48));
                        }
                        if (contentCount > 99) {
                            sb.append((char) (((contentCount / 100) % 10) + 48));
                        }
                        if (contentCount > 9) {
                            sb.append((char) (((contentCount / 10) % 10) + 48));
                        }
                        sb.append((char) ((contentCount % 10) + 48));
                    }
                    sb.append(' ');
                } else {
                    sb.append(" - ");
                }
                if (this._extended) {
                    logExtended(request, response, sb);
                }
                if (this._logCookies) {
                    Cookie[] cookies = request.getCookies();
                    if (cookies == null || cookies.length == 0) {
                        sb.append(" -");
                    } else {
                        sb.append(" \"");
                        for (int i = 0; i < cookies.length; i++) {
                            if (i != 0) {
                                sb.append(';');
                            }
                            sb.append(cookies[i].getName());
                            sb.append('=');
                            sb.append(cookies[i].getValue());
                        }
                        sb.append('\"');
                    }
                }
                if (this._logDispatch || this._logLatency) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (this._logDispatch) {
                        long dispatchTime = request.getDispatchTime();
                        sb.append(' ');
                        if (dispatchTime == 0) {
                            dispatchTime = request.getTimeStamp();
                        }
                        sb.append(jCurrentTimeMillis - dispatchTime);
                    }
                    if (this._logLatency) {
                        sb.append(' ');
                        sb.append(jCurrentTimeMillis - request.getTimeStamp());
                    }
                }
                sb.append(StringUtil.__LINE_SEPARATOR);
                String string = sb.toString();
                synchronized (this) {
                    try {
                        Writer writer = this._writer;
                        if (writer == null) {
                            return;
                        }
                        writer.write(string);
                        this._writer.flush();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (IOException e) {
            LOG.warn(e);
        }
    }

    public void logExtended(Request request, Response response, StringBuilder sb) throws IOException {
        String header = request.getHeader(HttpHeaders.REFERER);
        if (header == null) {
            sb.append("\"-\" ");
        } else {
            sb.append('\"');
            sb.append(header);
            sb.append("\" ");
        }
        String header2 = request.getHeader("User-Agent");
        if (header2 == null) {
            sb.append("\"-\" ");
            return;
        }
        sb.append('\"');
        sb.append(header2);
        sb.append('\"');
    }

    public void setAppend(boolean z) {
        this._append = z;
    }

    public void setExtended(boolean z) {
        this._extended = z;
    }

    public void setFilename(String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() == 0) {
                str = null;
            }
        }
        this._filename = str;
    }

    public void setFilenameDateFormat(String str) {
        this._filenameDateFormat = str;
    }

    public void setIgnorePaths(String[] strArr) {
        this._ignorePaths = strArr;
    }

    public void setLogCookies(boolean z) {
        this._logCookies = z;
    }

    public void setLogDateFormat(String str) {
        this._logDateFormat = str;
    }

    public void setLogDispatch(boolean z) {
        this._logDispatch = z;
    }

    public void setLogLatency(boolean z) {
        this._logLatency = z;
    }

    public void setLogLocale(Locale locale) {
        this._logLocale = locale;
    }

    public void setLogServer(boolean z) {
        this._logServer = z;
    }

    public void setLogTimeZone(String str) {
        this._logTimeZone = str;
    }

    public void setPreferProxiedForAddress(boolean z) {
        this._preferProxiedForAddress = z;
    }

    public void setRetainDays(int i) {
        this._retainDays = i;
    }

    public NCSARequestLog() {
    }
}

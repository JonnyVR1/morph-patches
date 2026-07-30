package org.fourthline.cling.transport.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.h21;
import l.i21;
import l.ibe;
import l.k21;
import l.ptc0;
import l.qkq0;
import l.yje0;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpStatus;
import org.fourthline.cling.model.message.Connection;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.transport.spi.UpnpStream;
import org.seamless.util.Exceptions;
import org.seamless.util.p006io.C0944IO;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AsyncServletUpnpStream extends UpnpStream implements k21 {
    private static final Logger log = Logger.getLogger(UpnpStream.class.getName());
    protected final h21 asyncContext;
    protected final HttpServletRequest request;
    protected StreamResponseMessage responseMessage;

    public AsyncServletUpnpStream(ProtocolFactory protocolFactory, h21 h21Var, HttpServletRequest httpServletRequest) {
        super(protocolFactory);
        this.asyncContext = h21Var;
        this.request = httpServletRequest;
        h21Var.addListener(this);
    }

    public void complete() {
        try {
            this.asyncContext.complete();
        } catch (IllegalStateException e) {
            log.info("Error calling servlet container's AsyncContext#complete() method: " + e);
        }
    }

    public abstract Connection createConnection();

    public HttpServletRequest getRequest() {
        return this.request;
    }

    public HttpServletResponse getResponse() {
        HttpServletResponse response = this.asyncContext.getResponse();
        if (response != null) {
            return response;
        }
        qkq0.a("Couldn't get response from asynchronous context, already timed out");
        return null;
    }

    public void onComplete(i21 i21Var) throws IOException {
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Completed asynchronous processing of HTTP request: " + i21Var.getSuppliedRequest());
        }
        responseSent(this.responseMessage);
    }

    public void onError(i21 i21Var) throws IOException {
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Asynchronous processing of HTTP request error: " + i21Var.getThrowable());
        }
        responseException(i21Var.getThrowable());
    }

    public void onTimeout(i21 i21Var) throws IOException {
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Asynchronous processing of HTTP request timed out: " + i21Var.getSuppliedRequest());
        }
        responseException(new Exception("Asynchronous request timed out"));
    }

    public StreamRequestMessage readRequestMessage() throws IOException {
        String method = getRequest().getMethod();
        String requestURI = getRequest().getRequestURI();
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Processing HTTP request: " + method + " " + requestURI);
        }
        yje0 inputStream = null;
        try {
            StreamRequestMessage streamRequestMessage = new StreamRequestMessage(UpnpRequest.Method.getByHttpName(method), URI.create(requestURI));
            if (((UpnpRequest) streamRequestMessage.getOperation()).getMethod().equals(UpnpRequest.Method.UNKNOWN)) {
                ibe.a("Method not supported: ", method);
                return null;
            }
            streamRequestMessage.setConnection(createConnection());
            UpnpHeaders upnpHeaders = new UpnpHeaders();
            Enumeration headerNames = getRequest().getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String str = (String) headerNames.nextElement();
                Enumeration headers = getRequest().getHeaders(str);
                while (headers.hasMoreElements()) {
                    upnpHeaders.add(str, (String) headers.nextElement());
                }
            }
            streamRequestMessage.setHeaders(upnpHeaders);
            try {
                inputStream = getRequest().getInputStream();
                byte[] bytes = C0944IO.readBytes((InputStream) inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                Logger logger2 = log;
                Level level = Level.FINER;
                if (logger2.isLoggable(level)) {
                    logger2.finer("Reading request body bytes: " + bytes.length);
                }
                if (bytes.length > 0 && streamRequestMessage.isContentTypeMissingOrText()) {
                    if (logger2.isLoggable(level)) {
                        logger2.finer("Request contains textual entity body, converting then setting string on message");
                    }
                    streamRequestMessage.setBodyCharacters(bytes);
                    return streamRequestMessage;
                }
                if (bytes.length <= 0) {
                    if (logger2.isLoggable(level)) {
                        logger2.finer("Request did not contain entity body");
                    }
                    return streamRequestMessage;
                }
                if (logger2.isLoggable(level)) {
                    logger2.finer("Request contains binary entity body, setting bytes on message");
                }
                streamRequestMessage.setBody(UpnpMessage.BodyType.BYTES, bytes);
                return streamRequestMessage;
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (IllegalArgumentException e) {
            ptc0.a("Invalid request URI: ", requestURI, e);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            StreamRequestMessage requestMessage = readRequestMessage();
            Logger logger = log;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.finer("Processing new request message: " + requestMessage);
            }
            StreamResponseMessage streamResponseMessageProcess = process(requestMessage);
            this.responseMessage = streamResponseMessageProcess;
            if (streamResponseMessageProcess != null) {
                if (logger.isLoggable(level)) {
                    logger.finer("Preparing HTTP response message: " + this.responseMessage);
                }
                writeResponseMessage(this.responseMessage);
            } else {
                if (logger.isLoggable(level)) {
                    logger.finer("Sending HTTP response status: 404");
                }
                getResponse().setStatus(HttpStatus.NOT_FOUND_404);
            }
            complete();
        } catch (Throwable th) {
            try {
                Logger logger2 = log;
                logger2.info("Exception occurred during UPnP stream processing: " + th);
                Level level2 = Level.FINER;
                if (logger2.isLoggable(level2)) {
                    logger2.log(level2, "Cause: " + Exceptions.unwrap(th), Exceptions.unwrap(th));
                }
                if (getResponse().isCommitted()) {
                    logger2.info("Could not return INTERNAL SERVER ERROR to client, response was already committed");
                } else {
                    logger2.finer("Response hasn't been committed, returning INTERNAL SERVER ERROR to client");
                    getResponse().setStatus(HttpStatus.INTERNAL_SERVER_ERROR_500);
                }
                responseException(th);
            } finally {
                complete();
            }
        }
    }

    public void writeResponseMessage(StreamResponseMessage streamResponseMessage) throws IOException {
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Sending HTTP response status: " + streamResponseMessage.getOperation().getStatusCode());
        }
        getResponse().setStatus(streamResponseMessage.getOperation().getStatusCode());
        for (Map.Entry<String, List<String>> entry : streamResponseMessage.getHeaders().entrySet()) {
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                getResponse().addHeader(entry.getKey(), it.next());
            }
        }
        getResponse().setDateHeader(HttpHeaders.DATE, System.currentTimeMillis());
        byte[] bodyBytes = streamResponseMessage.hasBody() ? streamResponseMessage.getBodyBytes() : null;
        int length = bodyBytes != null ? bodyBytes.length : -1;
        if (length > 0) {
            getResponse().setContentLength(length);
            log.finer("Response message has body, writing bytes to stream...");
            C0944IO.writeBytes((OutputStream) getResponse().getOutputStream(), bodyBytes);
        }
    }

    public void onStartAsync(i21 i21Var) throws IOException {
    }
}

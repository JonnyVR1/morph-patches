package org.fourthline.cling.transport.impl;

import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpVersions;
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
public abstract class HttpExchangeUpnpStream extends UpnpStream {
    private static Logger log = Logger.getLogger(UpnpStream.class.getName());
    private HttpExchange httpExchange;

    public HttpExchangeUpnpStream(ProtocolFactory protocolFactory, HttpExchange httpExchange) {
        super(protocolFactory);
        this.httpExchange = httpExchange;
    }

    public abstract Connection createConnection();

    public HttpExchange getHttpExchange() {
        return this.httpExchange;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            log.fine("Processing HTTP request: " + getHttpExchange().getRequestMethod() + " " + getHttpExchange().getRequestURI());
            StreamRequestMessage streamRequestMessage = new StreamRequestMessage(UpnpRequest.Method.getByHttpName(getHttpExchange().getRequestMethod()), getHttpExchange().getRequestURI());
            if (((UpnpRequest) streamRequestMessage.getOperation()).getMethod().equals(UpnpRequest.Method.UNKNOWN)) {
                log.fine("Method not supported by UPnP stack: " + getHttpExchange().getRequestMethod());
                throw new RuntimeException("Method not supported: " + getHttpExchange().getRequestMethod());
            }
            ((UpnpRequest) streamRequestMessage.getOperation()).setHttpMinorVersion(getHttpExchange().getProtocol().toUpperCase(Locale.ROOT).equals(HttpVersions.HTTP_1_1) ? 1 : 0);
            log.fine("Created new request message: " + streamRequestMessage);
            streamRequestMessage.setConnection(createConnection());
            streamRequestMessage.setHeaders(new UpnpHeaders((Map<String, List<String>>) getHttpExchange().getRequestHeaders()));
            InputStream inputStream = null;
            OutputStream responseBody = null;
            try {
                InputStream requestBody = getHttpExchange().getRequestBody();
                try {
                    byte[] bytes = C0944IO.readBytes(requestBody);
                    if (requestBody != null) {
                        requestBody.close();
                    }
                    log.fine("Reading request body bytes: " + bytes.length);
                    if (bytes.length > 0 && streamRequestMessage.isContentTypeMissingOrText()) {
                        log.fine("Request contains textual entity body, converting then setting string on message");
                        streamRequestMessage.setBodyCharacters(bytes);
                    } else if (bytes.length > 0) {
                        log.fine("Request contains binary entity body, setting bytes on message");
                        streamRequestMessage.setBody(UpnpMessage.BodyType.BYTES, bytes);
                    } else {
                        log.fine("Request did not contain entity body");
                    }
                    StreamResponseMessage streamResponseMessageProcess = process(streamRequestMessage);
                    if (streamResponseMessageProcess != null) {
                        log.fine("Preparing HTTP response message: " + streamResponseMessageProcess);
                        getHttpExchange().getResponseHeaders().putAll(streamResponseMessageProcess.getHeaders());
                        byte[] bodyBytes = streamResponseMessageProcess.hasBody() ? streamResponseMessageProcess.getBodyBytes() : null;
                        int length = bodyBytes != null ? bodyBytes.length : -1;
                        log.fine("Sending HTTP response message: " + streamResponseMessageProcess + " with content length: " + length);
                        getHttpExchange().sendResponseHeaders(streamResponseMessageProcess.getOperation().getStatusCode(), (long) length);
                        if (length > 0) {
                            log.fine("Response message has body, writing bytes to stream...");
                            try {
                                responseBody = getHttpExchange().getResponseBody();
                                C0944IO.writeBytes(responseBody, bodyBytes);
                                responseBody.flush();
                                responseBody.close();
                            } catch (Throwable th) {
                                if (responseBody != null) {
                                    responseBody.close();
                                }
                                throw th;
                            }
                        }
                    } else {
                        log.fine("Sending HTTP response status: 404");
                        getHttpExchange().sendResponseHeaders(HttpStatus.NOT_FOUND_404, -1L);
                    }
                    responseSent(streamResponseMessageProcess);
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = requestBody;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            log.fine("Exception occured during UPnP stream processing: " + th4);
            Logger logger = log;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                log.log(level, "Cause: " + Exceptions.unwrap(th4), Exceptions.unwrap(th4));
            }
            try {
                this.httpExchange.sendResponseHeaders(HttpStatus.INTERNAL_SERVER_ERROR_500, -1L);
            } catch (IOException e) {
                log.warning("Couldn't send error response: " + e);
            }
            responseException(th4);
        }
    }
}

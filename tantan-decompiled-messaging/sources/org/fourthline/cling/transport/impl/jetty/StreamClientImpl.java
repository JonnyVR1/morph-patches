package org.fourthline.cling.transport.impl.jetty;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.client.ContentExchange;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.p123io.ByteArrayBuffer;
import org.eclipse.jetty.util.thread.ExecutorThreadPool;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.ContentTypeHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.AbstractStreamClient;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.StreamClient;
import org.seamless.util.Exceptions;
import org.seamless.util.MimeType;
import p149l.o5d0;
import p149l.ptc0;

/* JADX INFO: loaded from: classes3.dex */
public class StreamClientImpl extends AbstractStreamClient<StreamClientConfigurationImpl, HttpContentExchange> {
    private static final Logger log = Logger.getLogger(StreamClient.class.getName());
    protected final HttpClient client;
    protected final StreamClientConfigurationImpl configuration;

    public static class HttpContentExchange extends ContentExchange {
        protected final HttpClient client;
        protected final StreamClientConfigurationImpl configuration;
        protected Throwable exception;
        protected final StreamRequestMessage requestMessage;

        public HttpContentExchange(StreamClientConfigurationImpl streamClientConfigurationImpl, HttpClient httpClient, StreamRequestMessage streamRequestMessage) {
            super(true);
            this.configuration = streamClientConfigurationImpl;
            this.client = httpClient;
            this.requestMessage = streamRequestMessage;
            applyRequestURLMethod();
            applyRequestHeaders();
            applyRequestBody();
        }

        public void applyRequestBody() {
            if (getRequestMessage().hasBody()) {
                if (getRequestMessage().getBodyType() != UpnpMessage.BodyType.STRING) {
                    if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                        StreamClientImpl.log.fine("Writing binary request body: " + getRequestMessage());
                    }
                    if (getRequestMessage().getContentTypeHeader() == null) {
                        o5d0.m162778a("Missing content type header in request message: ", this.requestMessage);
                        return;
                    }
                    setRequestContentType(getRequestMessage().getContentTypeHeader().getValue().toString());
                    ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(getRequestMessage().getBodyBytes());
                    setRequestHeader("Content-Length", String.valueOf(byteArrayBuffer.length()));
                    setRequestContent(byteArrayBuffer);
                    return;
                }
                if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                    StreamClientImpl.log.fine("Writing textual request body: " + getRequestMessage());
                }
                MimeType value = getRequestMessage().getContentTypeHeader() != null ? getRequestMessage().getContentTypeHeader().getValue() : ContentTypeHeader.DEFAULT_CONTENT_TYPE_UTF8;
                String contentTypeCharset = getRequestMessage().getContentTypeCharset() != null ? getRequestMessage().getContentTypeCharset() : "UTF-8";
                setRequestContentType(value.toString());
                try {
                    ByteArrayBuffer byteArrayBuffer2 = new ByteArrayBuffer(getRequestMessage().getBodyString(), contentTypeCharset);
                    setRequestHeader("Content-Length", String.valueOf(byteArrayBuffer2.length()));
                    setRequestContent(byteArrayBuffer2);
                } catch (UnsupportedEncodingException e) {
                    ptc0.m171306a("Unsupported character encoding: ", contentTypeCharset, e);
                }
            }
        }

        public void applyRequestHeaders() {
            UpnpHeaders headers = getRequestMessage().getHeaders();
            if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Writing headers on HttpContentExchange: " + headers.size());
            }
            UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
            if (!headers.containsKey(type)) {
                setRequestHeader(type.getHttpName(), getConfiguration().getUserAgentValue(getRequestMessage().getUdaMajorVersion(), getRequestMessage().getUdaMinorVersion()));
            }
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                        StreamClientImpl.log.fine("Setting header '" + key + "': " + str);
                    }
                    addRequestHeader(key, str);
                }
            }
        }

        public void applyRequestURLMethod() {
            UpnpRequest operation = getRequestMessage().getOperation();
            if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Preparing HTTP request message with method '" + operation.getHttpMethodName() + "': " + getRequestMessage());
            }
            setURL(operation.getURI().toString());
            setMethod(operation.getHttpMethodName());
        }

        public StreamResponseMessage createResponse() {
            UpnpResponse upnpResponse = new UpnpResponse(getResponseStatus(), UpnpResponse.Status.getByStatusCode(getResponseStatus()).getStatusMsg());
            if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Received response: " + upnpResponse);
            }
            StreamResponseMessage streamResponseMessage = new StreamResponseMessage(upnpResponse);
            UpnpHeaders upnpHeaders = new UpnpHeaders();
            HttpFields responseFields = getResponseFields();
            for (String str : responseFields.getFieldNamesCollection()) {
                Iterator<String> it = responseFields.getValuesCollection(str).iterator();
                while (it.hasNext()) {
                    upnpHeaders.add(str, it.next());
                }
            }
            streamResponseMessage.setHeaders(upnpHeaders);
            byte[] responseContentBytes = getResponseContentBytes();
            if (responseContentBytes != null && responseContentBytes.length > 0 && streamResponseMessage.isContentTypeMissingOrText()) {
                if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                    StreamClientImpl.log.fine("Response contains textual entity body, converting then setting string on message");
                }
                try {
                    streamResponseMessage.setBodyCharacters(responseContentBytes);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("Unsupported character encoding: " + e, e);
                }
            } else if (responseContentBytes != null && responseContentBytes.length > 0) {
                if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                    StreamClientImpl.log.fine("Response contains binary entity body, setting bytes on message");
                }
                streamResponseMessage.setBody(UpnpMessage.BodyType.BYTES, responseContentBytes);
            } else if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Response did not contain entity body");
            }
            if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Response message complete: " + streamResponseMessage);
            }
            return streamResponseMessage;
        }

        public StreamClientConfigurationImpl getConfiguration() {
            return this.configuration;
        }

        public StreamRequestMessage getRequestMessage() {
            return this.requestMessage;
        }

        @Override // org.eclipse.jetty.client.HttpExchange
        public void onConnectionFailed(Throwable th) {
            StreamClientImpl.log.log(Level.WARNING, "HTTP connection failed: " + this.requestMessage, Exceptions.unwrap(th));
        }

        @Override // org.eclipse.jetty.client.HttpExchange
        public void onException(Throwable th) {
            StreamClientImpl.log.log(Level.WARNING, "HTTP request failed: " + this.requestMessage, Exceptions.unwrap(th));
        }
    }

    public StreamClientImpl(StreamClientConfigurationImpl streamClientConfigurationImpl) throws InitializationException {
        this.configuration = streamClientConfigurationImpl;
        log.info("Starting Jetty HttpClient...");
        HttpClient httpClient = new HttpClient();
        this.client = httpClient;
        httpClient.setThreadPool(new ExecutorThreadPool(getConfiguration().getRequestExecutorService()) { // from class: org.fourthline.cling.transport.impl.jetty.StreamClientImpl.1
            @Override // org.eclipse.jetty.util.thread.ExecutorThreadPool, org.eclipse.jetty.util.component.AbstractLifeCycle
            public void doStop() throws Exception {
            }
        });
        httpClient.setTimeout((streamClientConfigurationImpl.getTimeoutSeconds() + 5) * 1000);
        httpClient.setConnectTimeout((streamClientConfigurationImpl.getTimeoutSeconds() + 5) * 1000);
        httpClient.setMaxRetries(streamClientConfigurationImpl.getRequestRetryCount());
        try {
            httpClient.start();
        } catch (Exception e) {
            throw new InitializationException("Could not start Jetty HTTP client: " + e, e);
        }
    }

    @Override // org.fourthline.cling.transport.spi.AbstractStreamClient
    public HttpContentExchange createRequest(StreamRequestMessage streamRequestMessage) {
        return new HttpContentExchange(getConfiguration(), this.client, streamRequestMessage);
    }

    @Override // org.fourthline.cling.transport.spi.AbstractStreamClient
    public boolean logExecutionException(Throwable th) {
        return false;
    }

    @Override // org.fourthline.cling.transport.spi.StreamClient
    public void stop() {
        try {
            this.client.stop();
        } catch (Exception e) {
            log.info("Error stopping HTTP client: " + e);
        }
    }

    @Override // org.fourthline.cling.transport.spi.StreamClient
    public StreamClientConfigurationImpl getConfiguration() {
        return this.configuration;
    }

    @Override // org.fourthline.cling.transport.spi.AbstractStreamClient
    public void abort(HttpContentExchange httpContentExchange) {
        httpContentExchange.cancel();
    }

    @Override // org.fourthline.cling.transport.spi.AbstractStreamClient
    public Callable<StreamResponseMessage> createCallable(final StreamRequestMessage streamRequestMessage, final HttpContentExchange httpContentExchange) {
        return new Callable<StreamResponseMessage>() { // from class: org.fourthline.cling.transport.impl.jetty.StreamClientImpl.2
            @Override // java.util.concurrent.Callable
            public StreamResponseMessage call() throws Exception {
                if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                    StreamClientImpl.log.fine("Sending HTTP request: " + streamRequestMessage);
                }
                StreamClientImpl.this.client.send(httpContentExchange);
                int iWaitForDone = httpContentExchange.waitForDone();
                if (iWaitForDone == 7) {
                    try {
                        return httpContentExchange.createResponse();
                    } catch (Throwable th) {
                        StreamClientImpl.log.log(Level.WARNING, "Error reading response: " + streamRequestMessage, Exceptions.unwrap(th));
                        return null;
                    }
                }
                if (iWaitForDone == 11 || iWaitForDone == 9) {
                    return null;
                }
                StreamClientImpl.log.warning("Unhandled HTTP exchange status: " + iWaitForDone);
                return null;
            }
        };
    }
}

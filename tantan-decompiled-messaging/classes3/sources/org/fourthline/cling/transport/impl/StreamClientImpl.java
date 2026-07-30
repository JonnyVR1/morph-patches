package org.fourthline.cling.transport.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLStreamHandlerFactory;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.StreamClient;
import org.seamless.http.Headers;
import org.seamless.util.Exceptions;
import org.seamless.util.URIUtil;
import org.seamless.util.p006io.C0944IO;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StreamClientImpl implements StreamClient {
    static final String HACK_STREAM_HANDLER_SYSTEM_PROPERTY = "hackStreamHandlerProperty";
    private static final Logger log = Logger.getLogger(StreamClient.class.getName());
    protected final StreamClientConfigurationImpl configuration;

    public StreamClientImpl(StreamClientConfigurationImpl streamClientConfigurationImpl) throws InitializationException {
        this.configuration = streamClientConfigurationImpl;
        if (ModelUtil.ANDROID_EMULATOR || ModelUtil.ANDROID_RUNTIME) {
            throw new InitializationException("This client does not work on Android. The design of HttpURLConnection is broken, we can not add additional 'permitted' HTTP methods. Read the Cling manual.");
        }
        Logger logger = log;
        logger.fine("Using persistent HTTP stream client connections: " + streamClientConfigurationImpl.isUsePersistentConnections());
        System.setProperty("http.keepAlive", Boolean.toString(streamClientConfigurationImpl.isUsePersistentConnections()));
        if (System.getProperty(HACK_STREAM_HANDLER_SYSTEM_PROPERTY) == null) {
            logger.fine("Setting custom static URLStreamHandlerFactory to work around bad JDK defaults");
            try {
                int i = FixedSunURLStreamHandler.f9578a;
                URL.setURLStreamHandlerFactory((URLStreamHandlerFactory) FixedSunURLStreamHandler.class.newInstance());
                System.setProperty(HACK_STREAM_HANDLER_SYSTEM_PROPERTY, "alreadyWorkedAroundTheEvilJDK");
            } catch (Throwable unused) {
                throw new InitializationException("Failed to set modified URLStreamHandlerFactory in this environment. Can't use bundled default client based on HTTPURLConnection, see manual.");
            }
        }
    }

    public void applyHeaders(HttpURLConnection httpURLConnection, Headers headers) {
        log.fine("Writing headers on HttpURLConnection: " + headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            for (String str : entry.getValue()) {
                String key = entry.getKey();
                log.fine("Setting header '" + key + "': " + str);
                httpURLConnection.setRequestProperty(key, str);
            }
        }
    }

    public void applyRequestBody(HttpURLConnection httpURLConnection, StreamRequestMessage streamRequestMessage) throws IOException {
        if (!streamRequestMessage.hasBody()) {
            httpURLConnection.setDoOutput(false);
            return;
        }
        httpURLConnection.setDoOutput(true);
        if (streamRequestMessage.getBodyType().equals(UpnpMessage.BodyType.STRING)) {
            C0944IO.writeUTF8(httpURLConnection.getOutputStream(), streamRequestMessage.getBodyString());
        } else if (streamRequestMessage.getBodyType().equals(UpnpMessage.BodyType.BYTES)) {
            C0944IO.writeBytes(httpURLConnection.getOutputStream(), streamRequestMessage.getBodyBytes());
        }
        httpURLConnection.getOutputStream().flush();
    }

    public void applyRequestProperties(HttpURLConnection httpURLConnection, StreamRequestMessage streamRequestMessage) {
        httpURLConnection.setInstanceFollowRedirects(false);
        UpnpHeaders headers = streamRequestMessage.getHeaders();
        UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
        if (!headers.containsKey(type)) {
            httpURLConnection.setRequestProperty(type.getHttpName(), getConfiguration().getUserAgentValue(streamRequestMessage.getUdaMajorVersion(), streamRequestMessage.getUdaMinorVersion()));
        }
        applyHeaders(httpURLConnection, streamRequestMessage.getHeaders());
    }

    public StreamResponseMessage createResponse(HttpURLConnection httpURLConnection, InputStream inputStream) throws Exception {
        byte[] bytes = null;
        if (httpURLConnection.getResponseCode() == -1) {
            Logger logger = log;
            logger.warning("Received an invalid HTTP response: " + httpURLConnection.getURL());
            logger.warning("Is your Cling-based server sending connection heartbeats with RemoteClientInfo#isRequestCancelled? This client can't handle heartbeats, read the manual.");
            return null;
        }
        UpnpResponse upnpResponse = new UpnpResponse(httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        Logger logger2 = log;
        logger2.fine("Received response: " + upnpResponse);
        StreamResponseMessage streamResponseMessage = new StreamResponseMessage(upnpResponse);
        streamResponseMessage.setHeaders(new UpnpHeaders(httpURLConnection.getHeaderFields()));
        if (inputStream != null) {
            try {
                bytes = C0944IO.readBytes(inputStream);
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
        if (bytes != null && bytes.length > 0 && streamResponseMessage.isContentTypeMissingOrText()) {
            logger2.fine("Response contains textual entity body, converting then setting string on message");
            streamResponseMessage.setBodyCharacters(bytes);
        } else if (bytes == null || bytes.length <= 0) {
            logger2.fine("Response did not contain entity body");
        } else {
            logger2.fine("Response contains binary entity body, setting bytes on message");
            streamResponseMessage.setBody(UpnpMessage.BodyType.BYTES, bytes);
        }
        logger2.fine("Response message complete: " + streamResponseMessage);
        return streamResponseMessage;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.fourthline.cling.transport.impl.StreamClientImpl] */
    @Override // org.fourthline.cling.transport.spi.StreamClient
    public StreamResponseMessage sendRequest(StreamRequestMessage streamRequestMessage) throws Throwable {
        UpnpRequest operation = streamRequestMessage.getOperation();
        Logger logger = log;
        logger.fine("Preparing HTTP request message with method '" + operation.getHttpMethodName() + "': " + streamRequestMessage);
        ?? url = URIUtil.toURL(operation.getURI());
        ?? r8 = 0;
        try {
            try {
                url = (HttpURLConnection) url.openConnection();
                try {
                    url.setRequestMethod(operation.getHttpMethodName());
                    url.setReadTimeout(this.configuration.getTimeoutSeconds() * 1000);
                    url.setConnectTimeout(this.configuration.getTimeoutSeconds() * 1000);
                    applyRequestProperties(url, streamRequestMessage);
                    applyRequestBody(url, streamRequestMessage);
                    logger.fine("Sending HTTP request: " + streamRequestMessage);
                    StreamResponseMessage streamResponseMessageCreateResponse = createResponse(url, url.getInputStream());
                    url.disconnect();
                    return streamResponseMessageCreateResponse;
                } catch (ProtocolException e) {
                    e = e;
                    log.log(Level.WARNING, "HTTP request failed: " + streamRequestMessage, Exceptions.unwrap(e));
                    if (url != 0) {
                        url.disconnect();
                    }
                    return null;
                } catch (IOException e2) {
                    e = e2;
                    if (url == 0) {
                        log.log(Level.WARNING, "HTTP request failed: " + streamRequestMessage, Exceptions.unwrap(e));
                        if (url != 0) {
                            url.disconnect();
                        }
                        return null;
                    }
                    if (e instanceof SocketTimeoutException) {
                        log.info("Timeout of " + getConfiguration().getTimeoutSeconds() + " seconds while waiting for HTTP request to complete, aborting: " + streamRequestMessage);
                        url.disconnect();
                        return null;
                    }
                    Logger logger2 = log;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine("Exception occurred, trying to read the error stream: " + Exceptions.unwrap(e));
                    }
                    try {
                        StreamResponseMessage streamResponseMessageCreateResponse2 = createResponse(url, url.getErrorStream());
                        url.disconnect();
                        return streamResponseMessageCreateResponse2;
                    } catch (Exception e3) {
                        Logger logger3 = log;
                        if (logger3.isLoggable(Level.FINE)) {
                            logger3.fine("Could not read error stream: " + e3);
                        }
                        url.disconnect();
                        return null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    log.log(Level.WARNING, "HTTP request failed: " + streamRequestMessage, Exceptions.unwrap(e));
                    if (url != 0) {
                        url.disconnect();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r8 = url;
                if (r8 != 0) {
                    r8.disconnect();
                }
                throw th;
            }
        } catch (ProtocolException e5) {
            e = e5;
            url = 0;
        } catch (IOException e6) {
            e = e6;
            url = 0;
        } catch (Exception e7) {
            e = e7;
            url = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r8 != 0) {
                r8.disconnect();
            }
            throw th;
        }
    }

    @Override // org.fourthline.cling.transport.spi.StreamClient
    public void stop() {
    }

    @Override // org.fourthline.cling.transport.spi.StreamClient
    public StreamClientConfigurationImpl getConfiguration() {
        return this.configuration;
    }
}

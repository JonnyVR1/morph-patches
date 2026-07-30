package org.fourthline.cling.transport.spi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.transport.spi.StreamClientConfiguration;
import org.seamless.util.Exceptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractStreamClient<C extends StreamClientConfiguration, REQUEST> implements StreamClient<C> {
    private static final Logger log = Logger.getLogger(StreamClient.class.getName());

    public abstract void abort(REQUEST request);

    public abstract Callable<StreamResponseMessage> createCallable(StreamRequestMessage streamRequestMessage, REQUEST request);

    public abstract REQUEST createRequest(StreamRequestMessage streamRequestMessage);

    public abstract boolean logExecutionException(Throwable th);

    public void onFinally(REQUEST request) {
    }

    @Override // org.fourthline.cling.transport.spi.StreamClient
    public StreamResponseMessage sendRequest(StreamRequestMessage streamRequestMessage) throws InterruptedException {
        StreamResponseMessage streamResponseMessage;
        Logger logger = log;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            logger.fine("Preparing HTTP request: " + streamRequestMessage);
        }
        REQUEST requestCreateRequest = createRequest(streamRequestMessage);
        if (requestCreateRequest == null) {
            return null;
        }
        Callable<StreamResponseMessage> callableCreateCallable = createCallable(streamRequestMessage, requestCreateRequest);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Future futureSubmit = getConfiguration().getRequestExecutorService().submit(callableCreateCallable);
        try {
            try {
                try {
                    if (logger.isLoggable(level)) {
                        logger.fine("Waiting " + getConfiguration().getTimeoutSeconds() + " seconds for HTTP request to complete: " + streamRequestMessage);
                    }
                    streamResponseMessage = null;
                    try {
                        StreamResponseMessage streamResponseMessage2 = (StreamResponseMessage) futureSubmit.get(getConfiguration().getTimeoutSeconds(), TimeUnit.SECONDS);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (logger.isLoggable(Level.FINEST)) {
                            logger.finest("Got HTTP response in " + jCurrentTimeMillis2 + "ms: " + streamRequestMessage);
                        }
                        if (getConfiguration().getLogWarningSeconds() > 0 && jCurrentTimeMillis2 > getConfiguration().getLogWarningSeconds() * 1000) {
                            logger.warning("HTTP request took a long time (" + jCurrentTimeMillis2 + "ms): " + streamRequestMessage);
                        }
                        onFinally(requestCreateRequest);
                        return streamResponseMessage2;
                    } catch (ExecutionException e) {
                        e = e;
                        Throwable cause = e.getCause();
                        if (!logExecutionException(cause)) {
                            log.log(Level.WARNING, "HTTP request failed: " + streamRequestMessage, Exceptions.unwrap(cause));
                        }
                        onFinally(requestCreateRequest);
                        return streamResponseMessage;
                    } catch (TimeoutException unused) {
                        log.info("Timeout of " + getConfiguration().getTimeoutSeconds() + " seconds while waiting for HTTP request to complete, aborting: " + streamRequestMessage);
                        abort(requestCreateRequest);
                        onFinally(requestCreateRequest);
                        return streamResponseMessage;
                    }
                } catch (InterruptedException unused2) {
                    Logger logger2 = log;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine("Interruption, aborting request: " + streamRequestMessage);
                    }
                    abort(requestCreateRequest);
                    throw new InterruptedException("HTTP request interrupted and aborted");
                }
            } catch (ExecutionException e2) {
                e = e2;
                streamResponseMessage = null;
            } catch (TimeoutException unused3) {
                streamResponseMessage = null;
            }
        } catch (Throwable th) {
            onFinally(requestCreateRequest);
            throw th;
        }
    }
}

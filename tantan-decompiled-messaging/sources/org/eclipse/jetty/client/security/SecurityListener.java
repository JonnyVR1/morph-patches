package org.eclipse.jetty.client.security;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.eclipse.jetty.client.HttpDestination;
import org.eclipse.jetty.client.HttpEventListenerWrapper;
import org.eclipse.jetty.client.HttpExchange;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class SecurityListener extends HttpEventListenerWrapper {
    private static final Logger LOG = Log.getLogger((Class<?>) SecurityListener.class);
    private int _attempts;
    private HttpDestination _destination;
    private HttpExchange _exchange;
    private boolean _needIntercept;
    private boolean _requestComplete;
    private boolean _responseComplete;

    public SecurityListener(HttpDestination httpDestination, HttpExchange httpExchange) {
        super(httpExchange.getEventListener(), true);
        this._attempts = 0;
        this._destination = httpDestination;
        this._exchange = httpExchange;
    }

    @Override // org.eclipse.jetty.client.HttpEventListenerWrapper, org.eclipse.jetty.client.HttpEventListener
    public void onRequestComplete() throws IOException {
        this._requestComplete = true;
        if (!this._needIntercept) {
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("onRequestComplete, delegating to super with Request complete=" + this._requestComplete + ", response complete=" + this._responseComplete + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this._exchange, new Object[0]);
            }
            super.onRequestComplete();
            return;
        }
        if (!this._responseComplete) {
            Logger logger2 = LOG;
            if (logger2.isDebugEnabled()) {
                logger2.debug("onRequestComplete, Response not yet complete onRequestComplete, calling super for " + this._exchange, new Object[0]);
            }
            super.onRequestComplete();
            return;
        }
        Logger logger3 = LOG;
        if (logger3.isDebugEnabled()) {
            logger3.debug("onRequestComplete, Both complete: Resending from onResponseComplete " + this._exchange, new Object[0]);
        }
        this._responseComplete = false;
        this._requestComplete = false;
        setDelegatingRequests(true);
        setDelegatingResponses(true);
        this._destination.resend(this._exchange);
    }

    @Override // org.eclipse.jetty.client.HttpEventListenerWrapper, org.eclipse.jetty.client.HttpEventListener
    public void onResponseComplete() throws IOException {
        this._responseComplete = true;
        if (!this._needIntercept) {
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("OnResponseComplete, delegating to super with Request complete=" + this._requestComplete + ", response complete=" + this._responseComplete + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this._exchange, new Object[0]);
            }
            super.onResponseComplete();
            return;
        }
        if (!this._requestComplete) {
            Logger logger2 = LOG;
            if (logger2.isDebugEnabled()) {
                logger2.debug("onResponseComplete, Request not yet complete from onResponseComplete,  calling super " + this._exchange, new Object[0]);
            }
            super.onResponseComplete();
            return;
        }
        Logger logger3 = LOG;
        if (logger3.isDebugEnabled()) {
            logger3.debug("onResponseComplete, Both complete: Resending from onResponseComplete" + this._exchange, new Object[0]);
        }
        this._responseComplete = false;
        this._requestComplete = false;
        setDelegatingResponses(true);
        setDelegatingRequests(true);
        this._destination.resend(this._exchange);
    }

    @Override // org.eclipse.jetty.client.HttpEventListenerWrapper, org.eclipse.jetty.client.HttpEventListener
    public void onResponseHeader(Buffer buffer, Buffer buffer2) throws IOException {
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("SecurityListener:Header: " + buffer.toString() + " / " + buffer2.toString(), new Object[0]);
        }
        if (!isDelegatingResponses() && HttpHeaders.CACHE.getOrdinal(buffer) == 51) {
            String string = buffer2.toString();
            String strScrapeAuthenticationType = scrapeAuthenticationType(string);
            Map<String, String> mapScrapeAuthenticationDetails = scrapeAuthenticationDetails(string);
            RealmResolver realmResolver = this._destination.getHttpClient().getRealmResolver();
            if (realmResolver != null) {
                Realm realm = realmResolver.getRealm(mapScrapeAuthenticationDetails.get("realm"), this._destination, "/");
                if (realm == null) {
                    logger.warn("Unknown Security Realm: " + mapScrapeAuthenticationDetails.get("realm"), new Object[0]);
                } else if ("digest".equalsIgnoreCase(strScrapeAuthenticationType)) {
                    this._destination.addAuthorization("/", new DigestAuthentication(realm, mapScrapeAuthenticationDetails));
                } else if ("basic".equalsIgnoreCase(strScrapeAuthenticationType)) {
                    this._destination.addAuthorization("/", new BasicAuthentication(realm));
                }
            }
        }
        super.onResponseHeader(buffer, buffer2);
    }

    @Override // org.eclipse.jetty.client.HttpEventListenerWrapper, org.eclipse.jetty.client.HttpEventListener
    public void onResponseStatus(Buffer buffer, int i, Buffer buffer2) throws IOException {
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("SecurityListener:Response Status: " + i, new Object[0]);
        }
        if (i != 401 || this._attempts >= this._destination.getHttpClient().maxRetries()) {
            setDelegatingResponses(true);
            setDelegatingRequests(true);
            this._needIntercept = false;
        } else {
            setDelegatingResponses(false);
            this._needIntercept = true;
        }
        super.onResponseStatus(buffer, i, buffer2);
    }

    @Override // org.eclipse.jetty.client.HttpEventListenerWrapper, org.eclipse.jetty.client.HttpEventListener
    public void onRetry() {
        this._attempts++;
        setDelegatingRequests(true);
        setDelegatingResponses(true);
        this._requestComplete = false;
        this._responseComplete = false;
        this._needIntercept = false;
        super.onRetry();
    }

    public Map<String, String> scrapeAuthenticationDetails(String str) {
        HashMap map = new HashMap();
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) + 1, str.length()), Constants.SEPARATOR_COMMA);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            String[] strArrSplit = strNextToken.split("=");
            if (strArrSplit.length == 2) {
                map.put(strArrSplit[0].trim(), StringUtil.unquote(strArrSplit[1].trim()));
            } else {
                LOG.debug("SecurityListener: missed scraping authentication details - ".concat(strNextToken), new Object[0]);
            }
        }
        return map;
    }

    public String scrapeAuthenticationType(String str) {
        if (str.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) == -1) {
            return str.toString().trim();
        }
        String string = str.toString();
        return string.substring(0, string.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)).trim();
    }
}

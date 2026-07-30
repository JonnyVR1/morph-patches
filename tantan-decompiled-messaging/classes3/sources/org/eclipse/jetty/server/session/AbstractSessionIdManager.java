package org.eclipse.jetty.server.session;

import java.security.SecureRandom;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import l.ig3;
import org.eclipse.jetty.server.SessionIdManager;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractSessionIdManager extends AbstractLifeCycle implements SessionIdManager {
    private static final Logger LOG = Log.getLogger((Class<?>) AbstractSessionIdManager.class);
    private static final String __NEW_SESSION_ID = "org.eclipse.jetty.server.newSessionId";
    protected Random _random;
    protected boolean _weakRandom;
    protected String _workerName;

    public AbstractSessionIdManager(Random random) {
        this._random = random;
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        initRandom();
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
    }

    public Random getRandom() {
        return this._random;
    }

    @Override // org.eclipse.jetty.server.SessionIdManager
    public String getWorkerName() {
        return this._workerName;
    }

    public void initRandom() {
        Random random = this._random;
        if (random != null) {
            random.setSeed(((random.nextLong() ^ System.currentTimeMillis()) ^ ((long) hashCode())) ^ Runtime.getRuntime().freeMemory());
            return;
        }
        try {
            this._random = new SecureRandom();
        } catch (Exception e) {
            LOG.warn("Could not generate SecureRandom for session-id randomness", e);
            this._random = new Random();
            this._weakRandom = true;
        }
    }

    @Override // org.eclipse.jetty.server.SessionIdManager
    public String newSessionId(HttpServletRequest httpServletRequest, long j) {
        long jNextLong;
        synchronized (this) {
            if (httpServletRequest != null) {
                try {
                    String requestedSessionId = httpServletRequest.getRequestedSessionId();
                    if (requestedSessionId != null) {
                        String clusterId = getClusterId(requestedSessionId);
                        if (idInUse(clusterId)) {
                            return clusterId;
                        }
                    }
                    String str = (String) httpServletRequest.getAttribute(__NEW_SESSION_ID);
                    if (str != null && idInUse(str)) {
                        return str;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String str2 = null;
            while (true) {
                if (str2 != null && str2.length() != 0 && !idInUse(str2)) {
                    httpServletRequest.setAttribute(__NEW_SESSION_ID, str2);
                    return str2;
                }
                long jHashCode = this._weakRandom ? ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this._random.nextInt())) ^ (((long) httpServletRequest.hashCode()) << 32) : this._random.nextLong();
                if (jHashCode < 0) {
                    jHashCode = -jHashCode;
                }
                if (this._weakRandom) {
                    jNextLong = (((long) httpServletRequest.hashCode()) << 32) ^ ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this._random.nextInt()));
                } else {
                    jNextLong = this._random.nextLong();
                }
                if (jNextLong < 0) {
                    jNextLong = -jNextLong;
                }
                str2 = Long.toString(jHashCode, 36) + Long.toString(jNextLong, 36);
                if (this._workerName != null) {
                    str2 = this._workerName + str2;
                }
            }
        }
    }

    public synchronized void setRandom(Random random) {
        this._random = random;
        this._weakRandom = false;
    }

    public void setWorkerName(String str) {
        if (str.contains(".")) {
            ig3.a("Name cannot contain '.'");
        } else {
            this._workerName = str;
        }
    }

    public AbstractSessionIdManager() {
    }
}

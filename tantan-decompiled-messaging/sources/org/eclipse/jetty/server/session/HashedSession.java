package org.eclipse.jetty.server.session;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.eclipse.jetty.util.C21953IO;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class HashedSession extends AbstractSession {
    private static final Logger LOG = Log.getLogger((Class<?>) HashedSession.class);
    private final HashSessionManager _hashSessionManager;
    private transient boolean _idled;
    private transient boolean _saveFailed;

    public HashedSession(HashSessionManager hashSessionManager, HttpServletRequest httpServletRequest) {
        super(hashSessionManager, httpServletRequest);
        this._idled = false;
        this._saveFailed = false;
        this._hashSessionManager = hashSessionManager;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSession
    public void checkValid() {
        if (this._hashSessionManager._idleSavePeriodMs != 0) {
            deIdle();
        }
        super.checkValid();
    }

    public synchronized void deIdle() {
        FileInputStream fileInputStream;
        Exception e;
        if (isIdled()) {
            access(System.currentTimeMillis());
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Deidling " + super.getId(), new Object[0]);
            }
            try {
                File file = new File(this._hashSessionManager._storeDir, super.getId());
                if (!file.exists() || !file.canRead()) {
                    throw new FileNotFoundException(file.getName());
                }
                fileInputStream = new FileInputStream(file);
                try {
                    this._idled = false;
                    this._hashSessionManager.restoreSession(fileInputStream, this);
                    didActivate();
                    if (this._hashSessionManager._savePeriodMs == 0) {
                        file.delete();
                    }
                } catch (Exception e2) {
                    e = e2;
                    LOG.warn("Problem deidling session " + super.getId(), e);
                    C21953IO.close(fileInputStream);
                    invalidate();
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
            }
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSession
    public void doInvalidate() throws IllegalStateException {
        super.doInvalidate();
        if (this._hashSessionManager._storeDir == null || getId() == null) {
            return;
        }
        new File(this._hashSessionManager._storeDir, getId()).delete();
    }

    public synchronized void idle() {
        save(false);
    }

    public synchronized boolean isIdled() {
        return this._idled;
    }

    public synchronized boolean isSaveFailed() {
        return this._saveFailed;
    }

    public synchronized void save(boolean z) {
        File file;
        if (!isIdled() && !this._saveFailed) {
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Saving {} {}", super.getId(), Boolean.valueOf(z));
            }
            FileOutputStream fileOutputStream = null;
            try {
                file = new File(this._hashSessionManager._storeDir, super.getId());
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        willPassivate();
                        save(fileOutputStream2);
                        if (z) {
                            didActivate();
                        } else {
                            clearAttributes();
                        }
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        saveFailed();
                        LOG.warn("Problem saving session " + super.getId(), e);
                        if (fileOutputStream != null) {
                            C21953IO.close(fileOutputStream);
                            file.delete();
                            this._idled = false;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                file = null;
            }
        }
    }

    public synchronized void saveFailed() {
        this._saveFailed = true;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSession, org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public void setMaxInactiveInterval(int i) {
        super.setMaxInactiveInterval(i);
        if (getMaxInactiveInterval() > 0) {
            long maxInactiveInterval = (((long) getMaxInactiveInterval()) * 1000) / 10;
            HashSessionManager hashSessionManager = this._hashSessionManager;
            if (maxInactiveInterval < hashSessionManager._scavengePeriodMs) {
                hashSessionManager.setScavengePeriod((i + 9) / 10);
            }
        }
    }

    public HashedSession(HashSessionManager hashSessionManager, long j, long j2, String str) {
        super(hashSessionManager, j, j2, str);
        this._idled = false;
        this._saveFailed = false;
        this._hashSessionManager = hashSessionManager;
    }

    public synchronized void save(OutputStream outputStream) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(getClusterId());
            dataOutputStream.writeUTF(getNodeId());
            dataOutputStream.writeLong(getCreationTime());
            dataOutputStream.writeLong(getAccessed());
            dataOutputStream.writeInt(getRequests());
            dataOutputStream.writeInt(getAttributes());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(dataOutputStream);
            Enumeration<String> attributeNames = getAttributeNames();
            while (attributeNames.hasMoreElements()) {
                String strNextElement = attributeNames.nextElement();
                objectOutputStream.writeUTF(strNextElement);
                objectOutputStream.writeObject(doGet(strNextElement));
            }
            objectOutputStream.close();
        } catch (Throwable th) {
            throw th;
        }
    }
}

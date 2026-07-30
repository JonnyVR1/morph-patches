package org.eclipse.jetty.server.session;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.servlet.http.HttpServletRequest;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HashSessionManager extends AbstractSessionManager {
    private static int __id;
    static final Logger __log = SessionHandler.LOG;
    private TimerTask _saveTask;
    File _storeDir;
    private TimerTask _task;
    private Timer _timer;
    protected final ConcurrentMap<String, HashedSession> _sessions = new ConcurrentHashMap();
    private boolean _timerStop = false;
    long _scavengePeriodMs = 30000;
    long _savePeriodMs = 0;
    long _idleSavePeriodMs = 0;
    private boolean _lazyLoad = false;
    private volatile boolean _sessionsLoaded = false;
    private boolean _deleteUnrestorableSessions = false;

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public void addSession(AbstractSession abstractSession) {
        if (isRunning()) {
            this._sessions.put(abstractSession.getClusterId(), (HashedSession) abstractSession);
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        super.doStart();
        this._timerStop = false;
        ContextHandler.Context currentContext = ContextHandler.getCurrentContext();
        if (currentContext != null) {
            this._timer = (Timer) currentContext.getAttribute("org.eclipse.jetty.server.session.timer");
        }
        if (this._timer == null) {
            this._timerStop = true;
            StringBuilder sb = new StringBuilder("HashSessionScavenger-");
            int i = __id;
            __id = i + 1;
            sb.append(i);
            this._timer = new Timer(sb.toString(), true);
        }
        setScavengePeriod(getScavengePeriod());
        File file = this._storeDir;
        if (file != null) {
            if (!file.exists()) {
                this._storeDir.mkdirs();
            }
            if (!this._lazyLoad) {
                restoreSessions();
            }
        }
        setSavePeriod(getSavePeriod());
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        synchronized (this) {
            try {
                TimerTask timerTask = this._saveTask;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                this._saveTask = null;
                TimerTask timerTask2 = this._task;
                if (timerTask2 != null) {
                    timerTask2.cancel();
                }
                this._task = null;
                Timer timer = this._timer;
                if (timer != null && this._timerStop) {
                    timer.cancel();
                }
                this._timer = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.doStop();
        this._sessions.clear();
    }

    public int getIdleSavePeriod() {
        long j = this._idleSavePeriodMs;
        if (j <= 0) {
            return 0;
        }
        return (int) (j / 1000);
    }

    public int getSavePeriod() {
        long j = this._savePeriodMs;
        if (j <= 0) {
            return 0;
        }
        return (int) (j / 1000);
    }

    public int getScavengePeriod() {
        return (int) (this._scavengePeriodMs / 1000);
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public AbstractSession getSession(String str) {
        if (this._lazyLoad && !this._sessionsLoaded) {
            try {
                restoreSessions();
            } catch (Exception e) {
                __log.warn(e);
            }
        }
        ConcurrentMap<String, HashedSession> concurrentMap = this._sessions;
        if (concurrentMap == null) {
            return null;
        }
        HashedSession hashedSessionRestoreSession = concurrentMap.get(str);
        if (hashedSessionRestoreSession == null && this._lazyLoad) {
            hashedSessionRestoreSession = restoreSession(str);
        }
        if (hashedSessionRestoreSession == null) {
            return null;
        }
        if (this._idleSavePeriodMs != 0) {
            hashedSessionRestoreSession.deIdle();
        }
        return hashedSessionRestoreSession;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public int getSessions() {
        int sessions = super.getSessions();
        Logger logger = __log;
        if (logger.isDebugEnabled() && this._sessions.size() != sessions) {
            logger.warn("sessions: " + this._sessions.size() + "!=" + sessions, new Object[0]);
        }
        return sessions;
    }

    public File getStoreDirectory() {
        return this._storeDir;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public void invalidateSessions() throws Exception {
        File file;
        ArrayList<HashedSession> arrayList = new ArrayList(this._sessions.values());
        int i = 100;
        while (arrayList.size() > 0) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            if (isStopping() && (file = this._storeDir) != null && file.exists() && this._storeDir.canWrite()) {
                for (HashedSession hashedSession : arrayList) {
                    hashedSession.save(false);
                    removeSession((AbstractSession) hashedSession, false);
                }
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((HashedSession) it.next()).invalidate();
                }
            }
            arrayList = new ArrayList(this._sessions.values());
            i = i2;
        }
    }

    public boolean isDeleteUnrestorableSessions() {
        return this._deleteUnrestorableSessions;
    }

    public boolean isLazyLoad() {
        return this._lazyLoad;
    }

    public AbstractSession newSession(long j, long j2, String str) {
        return new HashedSession(this, j, j2, str);
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public boolean removeSession(String str) {
        return this._sessions.remove(str) != null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0005, B:10:0x0023, B:16:0x0030, B:15:0x002b, B:30:0x0045, B:34:0x004f, B:35:0x0052, B:33:0x004a, B:37:0x0055, B:41:0x005f, B:43:0x0065, B:45:0x006b, B:46:0x0080, B:40:0x005a, B:27:0x003f), top: B:57:0x0005, inners: #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0080, please report this as an issue */
    public synchronized HashedSession restoreSession(String str) {
        FileInputStream fileInputStream;
        File file = new File(this._storeDir, str);
        FileInputStream fileInputStream2 = null;
        try {
            if (!file.exists()) {
                file.delete();
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                HashedSession hashedSessionRestoreSession = restoreSession(fileInputStream, null);
                addSession(hashedSessionRestoreSession, false);
                hashedSessionRestoreSession.didActivate();
                try {
                    fileInputStream.close();
                } catch (Exception e) {
                    __log.ignore(e);
                }
                file.delete();
                return hashedSessionRestoreSession;
            } catch (Exception e2) {
                e = e2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e3) {
                        __log.ignore(e3);
                    }
                }
                if (isDeleteUnrestorableSessions()) {
                    __log.warn("Problem restoring session " + str, e);
                } else {
                    __log.warn("Problem restoring session " + str, e);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e4) {
                        __log.ignore(e4);
                    }
                }
                file.delete();
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        if (isDeleteUnrestorableSessions() || !file.exists()) {
            __log.warn("Problem restoring session " + str, e);
        } else {
            file.delete();
            __log.warn("Deleting file for unrestorable session " + str, e);
        }
        return null;
    }

    public void restoreSessions() throws Exception {
        this._sessionsLoaded = true;
        File file = this._storeDir;
        if (file == null || !file.exists()) {
            return;
        }
        boolean zCanRead = this._storeDir.canRead();
        File file2 = this._storeDir;
        if (!zCanRead) {
            __log.warn("Unable to restore Sessions: Cannot read from Session storage directory " + file2.getAbsolutePath(), new Object[0]);
            return;
        }
        String[] list = file2.list();
        for (int i = 0; list != null && i < list.length; i++) {
            restoreSession(list[i]);
        }
    }

    public void saveSessions(boolean z) throws Exception {
        File file = this._storeDir;
        if (file == null || !file.exists()) {
            return;
        }
        if (this._storeDir.canWrite()) {
            Iterator<HashedSession> it = this._sessions.values().iterator();
            while (it.hasNext()) {
                it.next().save(true);
            }
        } else {
            __log.warn("Unable to save Sessions: Session persistence storage directory " + this._storeDir.getAbsolutePath() + " is not writeable", new Object[0]);
        }
    }

    public void scavenge() {
        if (isStopping() || isStopped()) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        try {
            ClassLoader classLoader = this._loader;
            if (classLoader != null) {
                threadCurrentThread.setContextClassLoader(classLoader);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (HashedSession hashedSession : this._sessions.values()) {
                long maxInactiveInterval = ((long) hashedSession.getMaxInactiveInterval()) * 1000;
                if (maxInactiveInterval > 0 && hashedSession.getAccessed() + maxInactiveInterval < jCurrentTimeMillis) {
                    hashedSession.timeout();
                } else if (this._idleSavePeriodMs > 0 && hashedSession.getAccessed() + this._idleSavePeriodMs < jCurrentTimeMillis) {
                    hashedSession.idle();
                }
            }
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        } catch (Throwable th) {
            try {
                __log.warn("Problem scavenging sessions", th);
            } finally {
                threadCurrentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    public void setDeleteUnrestorableSessions(boolean z) {
        this._deleteUnrestorableSessions = z;
    }

    public void setIdleSavePeriod(int i) {
        this._idleSavePeriodMs = ((long) i) * 1000;
    }

    public void setLazyLoad(boolean z) {
        this._lazyLoad = z;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager, org.eclipse.jetty.server.SessionManager
    public void setMaxInactiveInterval(int i) {
        super.setMaxInactiveInterval(i);
        int i2 = this._dftMaxIdleSecs;
        if (i2 <= 0 || this._scavengePeriodMs <= ((long) i2) * 1000) {
            return;
        }
        setScavengePeriod((i2 + 9) / 10);
    }

    public void setSavePeriod(int i) {
        long j = ((long) i) * 1000;
        if (j < 0) {
            j = 0;
        }
        this._savePeriodMs = j;
        if (this._timer != null) {
            synchronized (this) {
                try {
                    TimerTask timerTask = this._saveTask;
                    if (timerTask != null) {
                        timerTask.cancel();
                    }
                    if (this._savePeriodMs > 0 && this._storeDir != null) {
                        TimerTask timerTask2 = new TimerTask() { // from class: org.eclipse.jetty.server.session.HashSessionManager.1
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public void run() {
                                try {
                                    HashSessionManager.this.saveSessions(true);
                                } catch (Exception e) {
                                    HashSessionManager.__log.warn(e);
                                }
                            }
                        };
                        this._saveTask = timerTask2;
                        Timer timer = this._timer;
                        long j2 = this._savePeriodMs;
                        timer.schedule(timerTask2, j2, j2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setScavengePeriod(int i) {
        if (i == 0) {
            i = 60;
        }
        long j = this._scavengePeriodMs;
        long j2 = ((long) i) * 1000;
        if (j2 > 60000) {
            j2 = 60000;
        }
        long j3 = j2 >= 1000 ? j2 : 1000L;
        this._scavengePeriodMs = j3;
        if (this._timer != null) {
            if (j3 != j || this._task == null) {
                synchronized (this) {
                    try {
                        TimerTask timerTask = this._task;
                        if (timerTask != null) {
                            timerTask.cancel();
                        }
                        TimerTask timerTask2 = new TimerTask() { // from class: org.eclipse.jetty.server.session.HashSessionManager.2
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public void run() {
                                HashSessionManager.this.scavenge();
                            }
                        };
                        this._task = timerTask2;
                        Timer timer = this._timer;
                        long j4 = this._scavengePeriodMs;
                        timer.schedule(timerTask2, j4, j4);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void setStoreDirectory(File file) {
        this._storeDir = file;
    }

    public class ClassLoadingObjectInputStream extends ObjectInputStream {
        public ClassLoadingObjectInputStream(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            try {
                return Class.forName(objectStreamClass.getName(), false, Thread.currentThread().getContextClassLoader());
            } catch (ClassNotFoundException unused) {
                return super.resolveClass(objectStreamClass);
            }
        }

        public ClassLoadingObjectInputStream() throws IOException {
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public AbstractSession newSession(HttpServletRequest httpServletRequest) {
        return new HashedSession(this, httpServletRequest);
    }

    public HashedSession restoreSession(InputStream inputStream, HashedSession hashedSession) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String utf = dataInputStream.readUTF();
        dataInputStream.readUTF();
        long j = dataInputStream.readLong();
        long j2 = dataInputStream.readLong();
        int i = dataInputStream.readInt();
        if (hashedSession == null) {
            hashedSession = (HashedSession) newSession(j, j2, utf);
        }
        hashedSession.setRequests(i);
        int i2 = dataInputStream.readInt();
        if (i2 > 0) {
            ClassLoadingObjectInputStream classLoadingObjectInputStream = new ClassLoadingObjectInputStream(dataInputStream);
            for (int i3 = 0; i3 < i2; i3++) {
                hashedSession.setAttribute(classLoadingObjectInputStream.readUTF(), classLoadingObjectInputStream.readObject());
            }
            classLoadingObjectInputStream.close();
            return hashedSession;
        }
        dataInputStream.close();
        return hashedSession;
    }
}

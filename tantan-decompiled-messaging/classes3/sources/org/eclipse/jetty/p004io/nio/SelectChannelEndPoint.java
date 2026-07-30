package org.eclipse.jetty.p004io.nio;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Locale;
import org.eclipse.jetty.p004io.AsyncEndPoint;
import org.eclipse.jetty.p004io.Buffer;
import org.eclipse.jetty.p004io.ConnectedEndPoint;
import org.eclipse.jetty.p004io.Connection;
import org.eclipse.jetty.p004io.EofException;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.thread.Timeout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SelectChannelEndPoint extends ChannelEndPoint implements AsyncEndPoint, ConnectedEndPoint {
    public static final Logger LOG = Log.getLogger("org.eclipse.jetty.io.nio");
    private final boolean WORK_AROUND_JVM_BUG_6346658;
    private boolean _asyncDispatch;
    private volatile AsyncConnection _connection;
    private boolean _dispatched;
    private final Runnable _handler;
    private volatile long _idleTimestamp;
    private int _interestOps;
    private boolean _ishut;
    private SelectionKey _key;
    private final SelectorManager _manager;
    private boolean _open;
    private boolean _readBlocked;
    private final SelectorManager.SelectSet _selectSet;
    private volatile boolean _writable;
    private boolean _writeBlocked;

    public SelectChannelEndPoint(SocketChannel socketChannel, SelectorManager.SelectSet selectSet, SelectionKey selectionKey, int i) throws IOException {
        super(socketChannel, i);
        this.WORK_AROUND_JVM_BUG_6346658 = System.getProperty("os.name").toLowerCase(Locale.ENGLISH).contains("win");
        this._handler = new Runnable() { // from class: org.eclipse.jetty.io.nio.SelectChannelEndPoint.1
            @Override // java.lang.Runnable
            public void run() {
                SelectChannelEndPoint.this.handle();
            }
        };
        this._dispatched = false;
        this._asyncDispatch = false;
        this._writable = true;
        this._manager = selectSet.getManager();
        this._selectSet = selectSet;
        this._dispatched = false;
        this._asyncDispatch = false;
        this._open = true;
        this._key = selectionKey;
        setCheckForIdle(true);
    }

    private void updateKey() {
        boolean z;
        synchronized (this) {
            try {
                int iInterestOps = -1;
                z = true;
                if (getChannel().isOpen()) {
                    this._interestOps = ((this._socket.isInputShutdown() || !(this._readBlocked || (!this._dispatched && !this._connection.isSuspended()))) ? 0 : 1) | ((this._socket.isOutputShutdown() || !(this._writeBlocked || (!this._dispatched && !this._writable))) ? 0 : 4);
                    try {
                        SelectionKey selectionKey = this._key;
                        if (selectionKey != null && selectionKey.isValid()) {
                            iInterestOps = this._key.interestOps();
                        }
                    } catch (Exception e) {
                        this._key = null;
                        LOG.ignore(e);
                    }
                }
                if (this._interestOps == iInterestOps) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this._selectSet.addChange(this);
            this._selectSet.wakeup();
        }
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public void asyncDispatch() {
        synchronized (this) {
            try {
                if (this._dispatched) {
                    this._asyncDispatch = true;
                } else {
                    dispatch();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.p004io.nio.ChannelEndPoint, org.eclipse.jetty.p004io.EndPoint
    public boolean blockReadable(long j) throws IOException {
        synchronized (this) {
            if (isInputShutdown()) {
                throw new EofException();
            }
            long now = this._selectSet.getNow();
            long j2 = now + j;
            boolean zIsCheckForIdle = isCheckForIdle();
            setCheckForIdle(true);
            try {
                this._readBlocked = true;
                while (!isInputShutdown() && this._readBlocked) {
                    try {
                        try {
                            updateKey();
                            wait(j > 0 ? j2 - now : 10000L);
                        } catch (InterruptedException e) {
                            LOG.warn(e);
                        }
                        now = this._selectSet.getNow();
                        if (this._readBlocked && j > 0 && now >= j2) {
                            this._readBlocked = false;
                            setCheckForIdle(zIsCheckForIdle);
                            return false;
                        }
                    } catch (Throwable th) {
                        this._selectSet.getNow();
                        throw th;
                    }
                }
                this._readBlocked = false;
                setCheckForIdle(zIsCheckForIdle);
                return true;
            } catch (Throwable th2) {
                this._readBlocked = false;
                setCheckForIdle(zIsCheckForIdle);
                throw th2;
            }
        }
    }

    @Override // org.eclipse.jetty.p004io.nio.ChannelEndPoint, org.eclipse.jetty.p004io.EndPoint
    public boolean blockWritable(long j) throws IOException {
        synchronized (this) {
            if (isOutputShutdown()) {
                throw new EofException();
            }
            long now = this._selectSet.getNow();
            long j2 = now + j;
            boolean zIsCheckForIdle = isCheckForIdle();
            setCheckForIdle(true);
            try {
                this._writeBlocked = true;
                while (this._writeBlocked && !isOutputShutdown()) {
                    try {
                        try {
                            updateKey();
                            wait(j > 0 ? j2 - now : 10000L);
                        } catch (InterruptedException e) {
                            LOG.warn(e);
                        }
                        now = this._selectSet.getNow();
                        if (this._writeBlocked && j > 0 && now >= j2) {
                            this._writeBlocked = false;
                            setCheckForIdle(zIsCheckForIdle);
                            return false;
                        }
                    } catch (Throwable th) {
                        this._selectSet.getNow();
                        throw th;
                    }
                }
                this._writeBlocked = false;
                setCheckForIdle(zIsCheckForIdle);
                return true;
            } catch (Throwable th2) {
                this._writeBlocked = false;
                setCheckForIdle(zIsCheckForIdle);
                throw th2;
            }
        }
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public void cancelTimeout(Timeout.Task task) {
        getSelectSet().cancelTimeout(task);
    }

    public void checkIdleTimestamp(long j) {
        long j2 = this._idleTimestamp;
        if (j2 == 0 || this._maxIdleTime <= 0) {
            return;
        }
        final long j3 = j - j2;
        if (j3 > this._maxIdleTime) {
            setCheckForIdle(false);
            this._manager.dispatch(new Runnable() { // from class: org.eclipse.jetty.io.nio.SelectChannelEndPoint.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        SelectChannelEndPoint.this.onIdleExpired(j3);
                    } finally {
                        SelectChannelEndPoint.this.setCheckForIdle(true);
                    }
                }
            });
        }
    }

    @Override // org.eclipse.jetty.p004io.nio.ChannelEndPoint, org.eclipse.jetty.p004io.EndPoint
    public void close() throws IOException {
        if (this.WORK_AROUND_JVM_BUG_6346658) {
            try {
                SelectionKey selectionKey = this._key;
                if (selectionKey != null) {
                    selectionKey.cancel();
                }
            } catch (Throwable th) {
                LOG.ignore(th);
            }
        }
        try {
            try {
                super.close();
            } finally {
                updateKey();
            }
        } catch (IOException e) {
            LOG.ignore(e);
        }
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public void dispatch() {
        synchronized (this) {
            try {
                if (!this._dispatched) {
                    this._dispatched = true;
                    if (!this._manager.dispatch(this._handler)) {
                        this._dispatched = false;
                        LOG.warn("Dispatched Failed! " + this + " to " + this._manager, new Object[0]);
                        updateKey();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void doUpdateKey() {
        synchronized (this) {
            try {
                if (getChannel().isOpen()) {
                    int i = this._interestOps;
                    SelectionKey selectionKey = this._key;
                    if (i > 0) {
                        if (selectionKey != null && selectionKey.isValid()) {
                            this._key.interestOps(this._interestOps);
                        } else if (((SelectableChannel) getChannel()).isRegistered()) {
                            updateKey();
                        } else {
                            try {
                                this._key = ((SelectableChannel) getChannel()).register(this._selectSet.getSelector(), this._interestOps, this);
                            } catch (Exception e) {
                                LOG.ignore(e);
                                SelectionKey selectionKey2 = this._key;
                                if (selectionKey2 != null && selectionKey2.isValid()) {
                                    this._key.cancel();
                                }
                                if (this._open) {
                                    this._selectSet.destroyEndPoint(this);
                                }
                                this._open = false;
                                this._key = null;
                            }
                        }
                    } else if (selectionKey == null || !selectionKey.isValid()) {
                        this._key = null;
                    } else {
                        this._key.interestOps(0);
                    }
                } else {
                    SelectionKey selectionKey3 = this._key;
                    if (selectionKey3 != null && selectionKey3.isValid()) {
                        this._key.cancel();
                    }
                    if (this._open) {
                        this._open = false;
                        this._selectSet.destroyEndPoint(this);
                    }
                    this._key = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.p004io.nio.ChannelEndPoint, org.eclipse.jetty.p004io.EndPoint
    public int fill(Buffer buffer) throws Throwable {
        int iFill = super.fill(buffer);
        if (iFill > 0) {
            notIdle();
        }
        return iFill;
    }

    @Override // org.eclipse.jetty.p004io.nio.ChannelEndPoint, org.eclipse.jetty.p004io.EndPoint
    public int flush(Buffer buffer, Buffer buffer2, Buffer buffer3) throws IOException {
        int iFlush = super.flush(buffer, buffer2, buffer3);
        if (iFlush != 0 || ((buffer == null || !buffer.hasContent()) && ((buffer2 == null || !buffer2.hasContent()) && (buffer3 == null || !buffer3.hasContent())))) {
            if (iFlush > 0) {
                this._writable = true;
                notIdle();
            }
            return iFlush;
        }
        synchronized (this) {
            try {
                this._writable = false;
                if (!this._dispatched) {
                    updateKey();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iFlush;
    }

    @Override // org.eclipse.jetty.p004io.ConnectedEndPoint
    public Connection getConnection() {
        return this._connection;
    }

    public long getIdleTimestamp() {
        return this._idleTimestamp;
    }

    public SelectorManager getSelectManager() {
        return this._manager;
    }

    public SelectorManager.SelectSet getSelectSet() {
        return this._selectSet;
    }

    public SelectionKey getSelectionKey() {
        SelectionKey selectionKey;
        synchronized (this) {
            selectionKey = this._key;
        }
        return selectionKey;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:170:0x01be A[LOOP:2: B:168:0x01bb->B:170:0x01be, LOOP_END] */
    public void handle() {
        boolean zUndispatch;
        boolean z = true;
        while (z) {
            while (true) {
                try {
                    try {
                        AsyncConnection asyncConnection = (AsyncConnection) this._connection.handle();
                        if (asyncConnection == this._connection) {
                            try {
                                break;
                            } catch (Throwable th) {
                                if (z) {
                                    zUndispatch = undispatch();
                                    while (!zUndispatch) {
                                        LOG.warn("SCEP.run() finally DISPATCHED", new Object[0]);
                                        zUndispatch = undispatch();
                                    }
                                }
                                throw th;
                            }
                        }
                        LOG.debug("{} replaced {}", asyncConnection, this._connection);
                        AsyncConnection asyncConnection2 = this._connection;
                        this._connection = asyncConnection;
                        this._manager.endPointUpgraded(this, asyncConnection2);
                    } catch (IOException e) {
                        LOG.warn(e.toString(), new Object[0]);
                        try {
                            close();
                        } catch (IOException e2) {
                            LOG.ignore(e2);
                        }
                        if (!this._ishut && isInputShutdown() && isOpen()) {
                            this._ishut = true;
                            try {
                                this._connection.onInputShutdown();
                            } catch (Throwable th2) {
                                try {
                                    LOG.warn("onInputShutdown failed", th2);
                                    try {
                                        close();
                                    } catch (IOException e3) {
                                        LOG.ignore(e3);
                                    }
                                } catch (Throwable th3) {
                                    updateKey();
                                    throw th3;
                                }
                            }
                            updateKey();
                        }
                    } catch (Throwable th4) {
                        try {
                            LOG.warn("handle failed", th4);
                            try {
                                close();
                            } catch (IOException e4) {
                                LOG.ignore(e4);
                            }
                            if (!this._ishut && isInputShutdown() && isOpen()) {
                                this._ishut = true;
                                try {
                                    this._connection.onInputShutdown();
                                } catch (Throwable th5) {
                                    try {
                                        LOG.warn("onInputShutdown failed", th5);
                                        try {
                                            close();
                                        } catch (IOException e5) {
                                            LOG.ignore(e5);
                                        }
                                    } catch (Throwable th6) {
                                        updateKey();
                                        throw th6;
                                    }
                                }
                                updateKey();
                            }
                        } catch (Throwable th7) {
                            if (!this._ishut && isInputShutdown() && isOpen()) {
                                this._ishut = true;
                                try {
                                    this._connection.onInputShutdown();
                                } catch (Throwable th8) {
                                    try {
                                        LOG.warn("onInputShutdown failed", th8);
                                        try {
                                            close();
                                        } catch (IOException e6) {
                                            LOG.ignore(e6);
                                        }
                                    } catch (Throwable th9) {
                                        updateKey();
                                        throw th9;
                                    }
                                }
                                updateKey();
                            }
                            boolean z2 = !undispatch();
                            throw th7;
                        }
                    }
                } catch (ClosedChannelException e7) {
                    LOG.ignore(e7);
                    if (!this._ishut && isInputShutdown() && isOpen()) {
                        this._ishut = true;
                        try {
                            this._connection.onInputShutdown();
                        } catch (Throwable th10) {
                            try {
                                LOG.warn("onInputShutdown failed", th10);
                                try {
                                    close();
                                } catch (IOException e8) {
                                    LOG.ignore(e8);
                                }
                            } catch (Throwable th11) {
                                updateKey();
                                throw th11;
                            }
                        }
                        updateKey();
                    }
                } catch (EofException e9) {
                    LOG.debug("EOF", e9);
                    try {
                        close();
                    } catch (IOException e10) {
                        LOG.ignore(e10);
                    }
                    if (!this._ishut && isInputShutdown() && isOpen()) {
                        this._ishut = true;
                        try {
                            this._connection.onInputShutdown();
                        } catch (Throwable th12) {
                            try {
                                LOG.warn("onInputShutdown failed", th12);
                                try {
                                    close();
                                } catch (IOException e11) {
                                    LOG.ignore(e11);
                                }
                            } catch (Throwable th13) {
                                updateKey();
                                throw th13;
                            }
                        }
                        updateKey();
                    }
                }
                if (z) {
                    zUndispatch = undispatch();
                    while (!zUndispatch) {
                        LOG.warn("SCEP.run() finally DISPATCHED", new Object[0]);
                        zUndispatch = undispatch();
                    }
                }
                throw th;
            }
            if (!this._ishut && isInputShutdown() && isOpen()) {
                this._ishut = true;
                try {
                    this._connection.onInputShutdown();
                } catch (Throwable th14) {
                    try {
                        LOG.warn("onInputShutdown failed", th14);
                        try {
                            close();
                        } catch (IOException e12) {
                            LOG.ignore(e12);
                        }
                    } catch (Throwable th15) {
                        updateKey();
                        throw th15;
                    }
                }
                updateKey();
            }
            z = !undispatch();
        }
        if (z) {
            boolean zUndispatch2 = undispatch();
            while (!zUndispatch2) {
                LOG.warn("SCEP.run() finally DISPATCHED", new Object[0]);
                zUndispatch2 = undispatch();
            }
        }
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public boolean hasProgressed() {
        return false;
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public boolean isCheckForIdle() {
        return this._idleTimestamp != 0;
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public boolean isWritable() {
        return this._writable;
    }

    public void notIdle() {
        if (this._idleTimestamp != 0) {
            this._idleTimestamp = System.currentTimeMillis();
        }
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public void onIdleExpired(long j) {
        this._connection.onIdleExpired(j);
    }

    public void schedule() {
        synchronized (this) {
            try {
                SelectionKey selectionKey = this._key;
                if (selectionKey != null && selectionKey.isValid()) {
                    boolean z = this._readBlocked;
                    if (!z && !this._writeBlocked) {
                        if ((this._key.readyOps() & 4) == 4 && (this._key.interestOps() & 4) == 4) {
                            int iInterestOps = this._key.interestOps() & (-5);
                            this._interestOps = iInterestOps;
                            this._key.interestOps(iInterestOps);
                            this._writable = true;
                        }
                        if (this._dispatched) {
                            this._key.interestOps(0);
                        } else {
                            dispatch();
                            if (this._dispatched && !this._selectSet.getManager().isDeferringInterestedOps0()) {
                                this._key.interestOps(0);
                            }
                        }
                        return;
                    }
                    if (z && this._key.isReadable()) {
                        this._readBlocked = false;
                    }
                    if (this._writeBlocked && this._key.isWritable()) {
                        this._writeBlocked = false;
                    }
                    notifyAll();
                    this._key.interestOps(0);
                    if (!this._dispatched) {
                        updateKey();
                    }
                    return;
                }
                this._readBlocked = false;
                this._writeBlocked = false;
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public void scheduleTimeout(Timeout.Task task, long j) {
        getSelectSet().scheduleTimeout(task, j);
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public void scheduleWrite() {
        if (this._writable) {
            LOG.debug("Required scheduleWrite {}", this);
        }
        this._writable = false;
        updateKey();
    }

    @Override // org.eclipse.jetty.p004io.AsyncEndPoint
    public void setCheckForIdle(boolean z) {
        this._idleTimestamp = z ? System.currentTimeMillis() : 0L;
    }

    @Override // org.eclipse.jetty.p004io.ConnectedEndPoint
    public void setConnection(Connection connection) {
        AsyncConnection asyncConnection = this._connection;
        this._connection = (AsyncConnection) connection;
        if (asyncConnection == null || asyncConnection == this._connection) {
            return;
        }
        this._manager.endPointUpgraded(this, asyncConnection);
    }

    @Override // org.eclipse.jetty.p004io.nio.ChannelEndPoint, org.eclipse.jetty.p004io.EndPoint
    public void setMaxIdleTime(int i) throws IOException {
        this._maxIdleTime = i;
    }

    public String toString() {
        String strConcat;
        SelectionKey selectionKey = this._key;
        if (selectionKey == null) {
            strConcat = "-";
        } else if (selectionKey.isValid()) {
            strConcat = selectionKey.isReadable() ? "r" : "";
            if (selectionKey.isWritable()) {
                strConcat = strConcat.concat("w");
            }
        } else {
            strConcat = "!";
        }
        return String.format("SCEP@%x{l(%s)<->r(%s),d=%b,open=%b,ishut=%b,oshut=%b,rb=%b,wb=%b,w=%b,i=%d%s}-{%s}", Integer.valueOf(hashCode()), this._socket.getRemoteSocketAddress(), this._socket.getLocalSocketAddress(), Boolean.valueOf(this._dispatched), Boolean.valueOf(isOpen()), Boolean.valueOf(isInputShutdown()), Boolean.valueOf(isOutputShutdown()), Boolean.valueOf(this._readBlocked), Boolean.valueOf(this._writeBlocked), Boolean.valueOf(this._writable), Integer.valueOf(this._interestOps), strConcat, this._connection);
    }

    public boolean undispatch() {
        synchronized (this) {
            try {
                if (this._asyncDispatch) {
                    this._asyncDispatch = false;
                    return false;
                }
                this._dispatched = false;
                updateKey();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.p004io.nio.ChannelEndPoint, org.eclipse.jetty.p004io.EndPoint
    public int flush(Buffer buffer) throws IOException {
        int iFlush = super.flush(buffer);
        if (iFlush != 0 || buffer == null || !buffer.hasContent()) {
            if (iFlush > 0) {
                this._writable = true;
                notIdle();
            }
            return iFlush;
        }
        synchronized (this) {
            try {
                this._writable = false;
                if (!this._dispatched) {
                    updateKey();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iFlush;
    }
}

package org.eclipse.jetty.p127io.nio;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.Channel;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.p127io.AsyncEndPoint;
import org.eclipse.jetty.p127io.ConnectedEndPoint;
import org.eclipse.jetty.p127io.Connection;
import org.eclipse.jetty.p127io.EndPoint;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.Dumpable;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.thread.Timeout;
import p153l.vtq0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SelectorManager extends AbstractLifeCycle implements Dumpable {
    private long _lowResourcesConnections;
    private int _lowResourcesMaxIdleTime;
    private int _maxIdleTime;
    private SelectSet[] _selectSet;
    public static final Logger LOG = Log.getLogger("org.eclipse.jetty.io.nio");
    private static final int __MONITOR_PERIOD = Integer.getInteger("org.eclipse.jetty.io.nio.MONITOR_PERIOD", 1000).intValue();
    private static final int __MAX_SELECTS = Integer.getInteger("org.eclipse.jetty.io.nio.MAX_SELECTS", LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY).intValue();
    private static final int __BUSY_PAUSE = Integer.getInteger("org.eclipse.jetty.io.nio.BUSY_PAUSE", 50).intValue();
    private static final int __IDLE_TICK = Integer.getInteger("org.eclipse.jetty.io.nio.IDLE_TICK", 400).intValue();
    private int _selectSets = 1;
    private volatile int _set = 0;
    private boolean _deferringInterestedOps0 = true;
    private int _selectorPriorityDelta = 0;

    public interface ChangeTask extends Runnable {
    }

    public static class ChannelAndAttachment {
        final Object _attachment;
        final SelectableChannel _channel;

        public ChannelAndAttachment(SelectableChannel selectableChannel, Object obj) {
            this._channel = selectableChannel;
            this._attachment = obj;
        }
    }

    public void connectionFailed(SocketChannel socketChannel, Throwable th, Object obj) {
        Logger logger = LOG;
        logger.warn(th + Constants.SEPARATOR_COMMA + socketChannel + Constants.SEPARATOR_COMMA + obj, new Object[0]);
        logger.debug(th);
    }

    public abstract boolean dispatch(Runnable runnable);

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        this._selectSet = new SelectSet[this._selectSets];
        int i = 0;
        while (true) {
            SelectSet[] selectSetArr = this._selectSet;
            if (i >= selectSetArr.length) {
                break;
            }
            selectSetArr[i] = new SelectSet(i);
            i++;
        }
        super.doStart();
        for (final int i2 = 0; i2 < getSelectSets(); i2++) {
            if (!dispatch(new Runnable() { // from class: org.eclipse.jetty.io.nio.SelectorManager.1
                @Override // java.lang.Runnable
                public void run() {
                    String name = Thread.currentThread().getName();
                    int priority = Thread.currentThread().getPriority();
                    try {
                        SelectSet[] selectSetArr2 = SelectorManager.this._selectSet;
                        if (selectSetArr2 == null) {
                            SelectorManager.LOG.debug("Stopped {} on {}", Thread.currentThread(), this);
                            Thread.currentThread().setName(name);
                            if (SelectorManager.this.getSelectorPriorityDelta() != 0) {
                                Thread.currentThread().setPriority(priority);
                                return;
                            }
                            return;
                        }
                        SelectSet selectSet = selectSetArr2[i2];
                        Thread.currentThread().setName(name + " Selector" + i2);
                        if (SelectorManager.this.getSelectorPriorityDelta() != 0) {
                            Thread.currentThread().setPriority(Thread.currentThread().getPriority() + SelectorManager.this.getSelectorPriorityDelta());
                        }
                        SelectorManager.LOG.debug("Starting {} on {}", Thread.currentThread(), this);
                        while (SelectorManager.this.isRunning()) {
                            try {
                                selectSet.doSelect();
                            } catch (IOException e) {
                                SelectorManager.LOG.ignore(e);
                            } catch (Exception e2) {
                                SelectorManager.LOG.warn(e2);
                            }
                        }
                        SelectorManager.LOG.debug("Stopped {} on {}", Thread.currentThread(), this);
                        Thread.currentThread().setName(name);
                        if (SelectorManager.this.getSelectorPriorityDelta() != 0) {
                            Thread.currentThread().setPriority(priority);
                        }
                    } catch (Throwable th) {
                        SelectorManager.LOG.debug("Stopped {} on {}", Thread.currentThread(), this);
                        Thread.currentThread().setName(name);
                        if (SelectorManager.this.getSelectorPriorityDelta() != 0) {
                            Thread.currentThread().setPriority(priority);
                        }
                        throw th;
                    }
                }
            })) {
                wtq0.m207906a("!Selecting");
                return;
            }
        }
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        SelectSet[] selectSetArr = this._selectSet;
        this._selectSet = null;
        if (selectSetArr != null) {
            for (SelectSet selectSet : selectSetArr) {
                if (selectSet != null) {
                    selectSet.stop();
                }
            }
        }
        super.doStop();
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        AggregateLifeCycle.dumpObject(appendable, this);
        AggregateLifeCycle.dump(appendable, str, TypeUtil.asList(this._selectSet));
    }

    public abstract void endPointClosed(SelectChannelEndPoint selectChannelEndPoint);

    public abstract void endPointOpened(SelectChannelEndPoint selectChannelEndPoint);

    public abstract void endPointUpgraded(ConnectedEndPoint connectedEndPoint, Connection connection);

    public long getLowResourcesConnections() {
        return this._lowResourcesConnections * ((long) this._selectSets);
    }

    public long getLowResourcesMaxIdleTime() {
        return this._lowResourcesMaxIdleTime;
    }

    public long getMaxIdleTime() {
        return this._maxIdleTime;
    }

    public SelectSet getSelectSet(int i) {
        return this._selectSet[i];
    }

    public int getSelectSets() {
        return this._selectSets;
    }

    public int getSelectorPriorityDelta() {
        return this._selectorPriorityDelta;
    }

    public boolean isDeferringInterestedOps0() {
        return this._deferringInterestedOps0;
    }

    public abstract AsyncConnection newConnection(SocketChannel socketChannel, AsyncEndPoint asyncEndPoint, Object obj);

    public abstract SelectChannelEndPoint newEndPoint(SocketChannel socketChannel, SelectSet selectSet, SelectionKey selectionKey) throws IOException;

    public void register(SocketChannel socketChannel, Object obj) {
        int i = this._set;
        this._set = i + 1;
        if (i < 0) {
            i = -i;
        }
        int i2 = i % this._selectSets;
        SelectSet[] selectSetArr = this._selectSet;
        if (selectSetArr != null) {
            SelectSet selectSet = selectSetArr[i2];
            selectSet.addChange(socketChannel, obj);
            selectSet.wakeup();
        }
    }

    public void setDeferringInterestedOps0(boolean z) {
        this._deferringInterestedOps0 = z;
    }

    public void setLowResourcesConnections(long j) {
        int i = this._selectSets;
        this._lowResourcesConnections = ((j + ((long) i)) - 1) / ((long) i);
    }

    public void setLowResourcesMaxIdleTime(long j) {
        this._lowResourcesMaxIdleTime = (int) j;
    }

    public void setMaxIdleTime(long j) {
        this._maxIdleTime = (int) j;
    }

    public void setSelectSets(int i) {
        long j = this._lowResourcesConnections * ((long) this._selectSets);
        this._selectSets = i;
        this._lowResourcesConnections = j / ((long) i);
    }

    public void setSelectorPriorityDelta(int i) {
        this._selectorPriorityDelta = i;
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public String dump() {
        return AggregateLifeCycle.dump(this);
    }

    public class SelectSet implements Dumpable {
        private int _busySelects;
        private final ConcurrentLinkedQueue<Object> _changes = new ConcurrentLinkedQueue<>();
        private ConcurrentMap<SelectChannelEndPoint, Object> _endPoints = new ConcurrentHashMap();
        private volatile long _idleTick = System.currentTimeMillis();
        private long _monitorNext;
        private boolean _paused;
        private boolean _pausing;
        private volatile Thread _selecting;
        private volatile Selector _selector;
        private final int _setID;
        private final Timeout _timeout;

        public SelectSet(int i) throws Exception {
            this._setID = i;
            Timeout timeout = new Timeout(this);
            this._timeout = timeout;
            timeout.setDuration(0L);
            this._selector = Selector.open();
            this._monitorNext = System.currentTimeMillis() + ((long) SelectorManager.__MONITOR_PERIOD);
        }

        private SelectChannelEndPoint createEndPoint(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
            SelectChannelEndPoint selectChannelEndPointNewEndPoint = SelectorManager.this.newEndPoint(socketChannel, this, selectionKey);
            SelectorManager.LOG.debug("created {}", selectChannelEndPointNewEndPoint);
            SelectorManager.this.endPointOpened(selectChannelEndPointNewEndPoint);
            this._endPoints.put(selectChannelEndPointNewEndPoint, this);
            return selectChannelEndPointNewEndPoint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void renewSelector() {
            try {
                synchronized (this) {
                    try {
                        Selector selector = this._selector;
                        if (selector == null) {
                            return;
                        }
                        Selector selectorOpen = Selector.open();
                        for (SelectionKey selectionKey : selector.keys()) {
                            if (selectionKey.isValid() && selectionKey.interestOps() != 0) {
                                SelectableChannel selectableChannelChannel = selectionKey.channel();
                                Object objAttachment = selectionKey.attachment();
                                if (objAttachment == null) {
                                    addChange(selectableChannelChannel);
                                } else {
                                    addChange(selectableChannelChannel, objAttachment);
                                }
                            }
                        }
                        this._selector.close();
                        this._selector = selectorOpen;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IOException e) {
                vtq0.m202761a("recreating selector", e);
            }
        }

        public void addChange(SelectableChannel selectableChannel, Object obj) {
            if (obj == null) {
                addChange(selectableChannel);
            } else if (obj instanceof EndPoint) {
                addChange(obj);
            } else {
                addChange(new ChannelAndAttachment(selectableChannel, obj));
            }
        }

        public void cancelTimeout(Timeout.Task task) {
            task.cancel();
        }

        public void destroyEndPoint(SelectChannelEndPoint selectChannelEndPoint) {
            SelectorManager.LOG.debug("destroyEndPoint {}", selectChannelEndPoint);
            this._endPoints.remove(selectChannelEndPoint);
            SelectorManager.this.endPointClosed(selectChannelEndPoint);
        }

        /* JADX WARN: Code duplicated, block: B:208:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:230:0x00dc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x00b6 A[Catch: all -> 0x00bc, CancelledKeyException -> 0x00bf, ClosedSelectorException -> 0x00c2, TryCatch #16 {CancelledKeyException -> 0x00bf, ClosedSelectorException -> 0x00c2, blocks: (B:3:0x0001, B:7:0x000e, B:8:0x0014, B:10:0x0019, B:52:0x00ae, B:54:0x00b6, B:63:0x00cc, B:66:0x00d1, B:61:0x00c5, B:67:0x00d7, B:69:0x00df, B:71:0x00eb, B:73:0x00f5, B:75:0x00f9, B:79:0x0108, B:80:0x010c, B:82:0x011f, B:94:0x0138, B:96:0x014a, B:98:0x0151, B:100:0x015c, B:102:0x0162, B:78:0x0103, B:103:0x016f, B:105:0x0173, B:108:0x017b, B:109:0x0183, B:111:0x0189, B:150:0x0211, B:152:0x0219, B:155:0x0226, B:160:0x0232, B:162:0x023a, B:164:0x0240, B:158:0x022b, B:153:0x021f, B:165:0x0245, B:166:0x024c, B:168:0x0264, B:170:0x0268, B:171:0x026f, B:172:0x0276, B:174:0x0283, B:176:0x028f, B:178:0x02a2, B:180:0x02b4, B:181:0x02be, B:183:0x02c4, B:185:0x02ca), top: B:220:0x0001, outer: #15 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x00c5 A[Catch: all -> 0x00bc, CancelledKeyException -> 0x00bf, ClosedSelectorException -> 0x00c2, TRY_LEAVE, TryCatch #16 {CancelledKeyException -> 0x00bf, ClosedSelectorException -> 0x00c2, blocks: (B:3:0x0001, B:7:0x000e, B:8:0x0014, B:10:0x0019, B:52:0x00ae, B:54:0x00b6, B:63:0x00cc, B:66:0x00d1, B:61:0x00c5, B:67:0x00d7, B:69:0x00df, B:71:0x00eb, B:73:0x00f5, B:75:0x00f9, B:79:0x0108, B:80:0x010c, B:82:0x011f, B:94:0x0138, B:96:0x014a, B:98:0x0151, B:100:0x015c, B:102:0x0162, B:78:0x0103, B:103:0x016f, B:105:0x0173, B:108:0x017b, B:109:0x0183, B:111:0x0189, B:150:0x0211, B:152:0x0219, B:155:0x0226, B:160:0x0232, B:162:0x023a, B:164:0x0240, B:158:0x022b, B:153:0x021f, B:165:0x0245, B:166:0x024c, B:168:0x0264, B:170:0x0268, B:171:0x026f, B:172:0x0276, B:174:0x0283, B:176:0x028f, B:178:0x02a2, B:180:0x02b4, B:181:0x02be, B:183:0x02c4, B:185:0x02ca), top: B:220:0x0001, outer: #15 }] */
        public void doSelect() throws IOException {
            SocketChannel socketChannel;
            Object objPoll;
            Channel channel;
            try {
                try {
                    this._selecting = Thread.currentThread();
                    Selector selector = this._selector;
                    if (selector == null) {
                        this._selecting = null;
                        return;
                    }
                    int size = this._changes.size();
                    while (true) {
                        int i = size - 1;
                        if (size <= 0 || (objPoll = this._changes.poll()) == null) {
                            break;
                        }
                        try {
                            try {
                                if (objPoll instanceof EndPoint) {
                                    SelectChannelEndPoint selectChannelEndPoint = (SelectChannelEndPoint) objPoll;
                                    channel = selectChannelEndPoint.getChannel();
                                    try {
                                        selectChannelEndPoint.doUpdateKey();
                                    } catch (Throwable th) {
                                        th = th;
                                        if (SelectorManager.this.isRunning()) {
                                            SelectorManager.LOG.warn(th);
                                        } else {
                                            SelectorManager.LOG.debug(th);
                                        }
                                        if (channel != null) {
                                            try {
                                                channel.close();
                                            } catch (IOException e) {
                                                SelectorManager.LOG.debug(e);
                                            }
                                        }
                                    }
                                } else if (objPoll instanceof ChannelAndAttachment) {
                                    ChannelAndAttachment channelAndAttachment = (ChannelAndAttachment) objPoll;
                                    SelectableChannel selectableChannel = channelAndAttachment._channel;
                                    try {
                                        Object obj = channelAndAttachment._attachment;
                                        if ((selectableChannel instanceof SocketChannel) && ((SocketChannel) selectableChannel).isConnected()) {
                                            SelectionKey selectionKeyRegister = selectableChannel.register(selector, 1, obj);
                                            SelectChannelEndPoint selectChannelEndPointCreateEndPoint = createEndPoint((SocketChannel) selectableChannel, selectionKeyRegister);
                                            selectionKeyRegister.attach(selectChannelEndPointCreateEndPoint);
                                            selectChannelEndPointCreateEndPoint.schedule();
                                        } else if (selectableChannel.isOpen()) {
                                            selectableChannel.register(selector, 8, obj);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        channel = selectableChannel;
                                        if (SelectorManager.this.isRunning()) {
                                            SelectorManager.LOG.warn(th);
                                        } else {
                                            SelectorManager.LOG.debug(th);
                                        }
                                        if (channel != null) {
                                            channel.close();
                                        }
                                    }
                                } else if (objPoll instanceof SocketChannel) {
                                    SocketChannel socketChannel2 = (SocketChannel) objPoll;
                                    try {
                                        SelectionKey selectionKeyRegister2 = socketChannel2.register(selector, 1, null);
                                        SelectChannelEndPoint selectChannelEndPointCreateEndPoint2 = createEndPoint(socketChannel2, selectionKeyRegister2);
                                        selectionKeyRegister2.attach(selectChannelEndPointCreateEndPoint2);
                                        selectChannelEndPointCreateEndPoint2.schedule();
                                    } catch (Throwable th3) {
                                        channel = socketChannel2;
                                        th = th3;
                                        if (SelectorManager.this.isRunning()) {
                                            SelectorManager.LOG.warn(th);
                                        } else {
                                            SelectorManager.LOG.debug(th);
                                        }
                                        if (channel != null) {
                                            channel.close();
                                        }
                                    }
                                } else if (objPoll instanceof ChangeTask) {
                                    ((Runnable) objPoll).run();
                                } else {
                                    if (!(objPoll instanceof Runnable)) {
                                        throw new IllegalArgumentException(objPoll.toString());
                                    }
                                    SelectorManager.this.dispatch((Runnable) objPoll);
                                }
                            } catch (CancelledKeyException e2) {
                                SelectorManager.LOG.ignore(e2);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            channel = null;
                        }
                        size = i;
                    }
                    int iSelectNow = selector.selectNow();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (iSelectNow == 0 && selector.selectedKeys().isEmpty()) {
                        if (this._pausing) {
                            try {
                                Thread.sleep(SelectorManager.__BUSY_PAUSE);
                            } catch (InterruptedException e3) {
                                SelectorManager.LOG.ignore(e3);
                            }
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        this._timeout.setNow(jCurrentTimeMillis);
                        long timeToNext = this._timeout.getTimeToNext();
                        long j = this._changes.size() == 0 ? SelectorManager.__IDLE_TICK : 0L;
                        if (j <= 0 || timeToNext < 0 || j <= timeToNext) {
                            timeToNext = j;
                        }
                        if (timeToNext > 0) {
                            selector.select(timeToNext);
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            this._timeout.setNow(jCurrentTimeMillis2);
                            if (SelectorManager.__MONITOR_PERIOD > 0 && jCurrentTimeMillis2 - jCurrentTimeMillis <= 1) {
                                int i2 = this._busySelects + 1;
                                this._busySelects = i2;
                                if (i2 > SelectorManager.__MAX_SELECTS) {
                                    this._pausing = true;
                                    if (!this._paused) {
                                        this._paused = true;
                                        SelectorManager.LOG.warn("Selector {} is too busy, pausing!", this);
                                    }
                                }
                            }
                        }
                    }
                    if (this._selector != null && selector.isOpen()) {
                        for (SelectionKey selectionKey : selector.selectedKeys()) {
                            try {
                                try {
                                    if (selectionKey.isValid()) {
                                        Object objAttachment = selectionKey.attachment();
                                        if (objAttachment instanceof SelectChannelEndPoint) {
                                            if (selectionKey.isReadable() || selectionKey.isWritable()) {
                                                ((SelectChannelEndPoint) objAttachment).schedule();
                                            }
                                        } else if (selectionKey.isConnectable()) {
                                            socketChannel = (SocketChannel) selectionKey.channel();
                                            try {
                                                try {
                                                    if (socketChannel.finishConnect()) {
                                                        try {
                                                            selectionKey.interestOps(1);
                                                            SelectChannelEndPoint selectChannelEndPointCreateEndPoint3 = createEndPoint(socketChannel, selectionKey);
                                                            selectionKey.attach(selectChannelEndPointCreateEndPoint3);
                                                            selectChannelEndPointCreateEndPoint3.schedule();
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            if (SelectorManager.this.isRunning()) {
                                                                SelectorManager.LOG.warn(e);
                                                            } else {
                                                                SelectorManager.LOG.ignore(e);
                                                            }
                                                            if (socketChannel != null) {
                                                                try {
                                                                    socketChannel.close();
                                                                } catch (IOException e5) {
                                                                    SelectorManager.LOG.debug(e5);
                                                                }
                                                            }
                                                            if (selectionKey != null && !(selectionKey.channel() instanceof ServerSocketChannel) && selectionKey.isValid()) {
                                                                selectionKey.cancel();
                                                            }
                                                        }
                                                    } else {
                                                        selectionKey.cancel();
                                                    }
                                                } catch (Exception e6) {
                                                    SelectorManager.this.connectionFailed(socketChannel, e6, objAttachment);
                                                }
                                            } catch (Throwable th5) {
                                                selectionKey.cancel();
                                                throw th5;
                                            }
                                        } else {
                                            SelectChannelEndPoint selectChannelEndPointCreateEndPoint4 = createEndPoint((SocketChannel) selectionKey.channel(), selectionKey);
                                            selectionKey.attach(selectChannelEndPointCreateEndPoint4);
                                            if (selectionKey.isReadable()) {
                                                selectChannelEndPointCreateEndPoint4.schedule();
                                            }
                                        }
                                    } else {
                                        selectionKey.cancel();
                                        SelectChannelEndPoint selectChannelEndPoint2 = (SelectChannelEndPoint) selectionKey.attachment();
                                        if (selectChannelEndPoint2 != null) {
                                            selectChannelEndPoint2.doUpdateKey();
                                        }
                                    }
                                } catch (CancelledKeyException e7) {
                                    SelectorManager.LOG.ignore(e7);
                                }
                            } catch (Exception e8) {
                                e = e8;
                                socketChannel = null;
                            }
                        }
                        selector.selectedKeys().clear();
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        this._timeout.setNow(jCurrentTimeMillis3);
                        Object objExpired = this._timeout.expired();
                        while (objExpired != null) {
                            if (objExpired instanceof Runnable) {
                                SelectorManager.this.dispatch((Runnable) objExpired);
                            }
                            objExpired = this._timeout.expired();
                        }
                        if (jCurrentTimeMillis3 - this._idleTick > SelectorManager.__IDLE_TICK) {
                            this._idleTick = jCurrentTimeMillis3;
                            final long j2 = (SelectorManager.this._lowResourcesConnections <= 0 || ((long) selector.keys().size()) <= SelectorManager.this._lowResourcesConnections) ? jCurrentTimeMillis3 : (((long) SelectorManager.this._maxIdleTime) + jCurrentTimeMillis3) - ((long) SelectorManager.this._lowResourcesMaxIdleTime);
                            SelectorManager.this.dispatch(new Runnable() { // from class: org.eclipse.jetty.io.nio.SelectorManager.SelectSet.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Iterator it = SelectSet.this._endPoints.keySet().iterator();
                                    while (it.hasNext()) {
                                        ((SelectChannelEndPoint) it.next()).checkIdleTimestamp(j2);
                                    }
                                }

                                public String toString() {
                                    return "Idle-" + super.toString();
                                }
                            });
                        }
                        if (SelectorManager.__MONITOR_PERIOD > 0 && jCurrentTimeMillis3 > this._monitorNext) {
                            this._busySelects = 0;
                            this._pausing = false;
                            this._monitorNext = jCurrentTimeMillis3 + ((long) SelectorManager.__MONITOR_PERIOD);
                        }
                        this._selecting = null;
                        return;
                    }
                    this._selecting = null;
                } catch (CancelledKeyException e9) {
                    SelectorManager.LOG.ignore(e9);
                } catch (ClosedSelectorException e10) {
                    if (SelectorManager.this.isRunning()) {
                        SelectorManager.LOG.warn(e10);
                    } else {
                        SelectorManager.LOG.ignore(e10);
                    }
                }
            } catch (Throwable th6) {
                this._selecting = null;
                throw th6;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.StackTraceElement] */
        @Override // org.eclipse.jetty.util.component.Dumpable
        public void dump(Appendable appendable, String str) throws IOException {
            ?? r4;
            appendable.append(String.valueOf(this)).append(" id=").append(String.valueOf(this._setID)).append(SignParameters.NEW_LINE);
            Thread thread = this._selecting;
            ?? stackTrace = thread == null ? 0 : thread.getStackTrace();
            if (stackTrace == 0) {
                r4 = "not selecting";
                break;
            }
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r4 = "not selecting";
                    break;
                }
                r4 = stackTrace[i];
                if (r4.getClassName().startsWith("org.eclipse.jetty.")) {
                    break;
                } else {
                    i++;
                }
            }
            Selector selector = this._selector;
            if (selector != null) {
                final ArrayList arrayList = new ArrayList(selector.keys().size() * 2);
                arrayList.add(r4);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                addChange(new ChangeTask() { // from class: org.eclipse.jetty.io.nio.SelectorManager.SelectSet.3
                    @Override // java.lang.Runnable
                    public void run() {
                        SelectSet.this.dumpKeyState(arrayList);
                        countDownLatch.countDown();
                    }
                });
                try {
                    countDownLatch.await(5L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    SelectorManager.LOG.ignore(e);
                }
                AggregateLifeCycle.dump(appendable, str, arrayList);
            }
        }

        public void dumpKeyState(List<Object> list) {
            Selector selector = this._selector;
            Set<SelectionKey> setKeys = selector.keys();
            list.add(selector + " keys=" + setKeys.size());
            for (SelectionKey selectionKey : setKeys) {
                if (selectionKey.isValid()) {
                    list.add(selectionKey.attachment() + " iOps=" + selectionKey.interestOps() + " rOps=" + selectionKey.readyOps());
                } else {
                    list.add(selectionKey.attachment() + " iOps=-1 rOps=-1");
                }
            }
        }

        public SelectorManager getManager() {
            return SelectorManager.this;
        }

        public long getNow() {
            return this._timeout.getNow();
        }

        public Selector getSelector() {
            return this._selector;
        }

        public void scheduleTimeout(Timeout.Task task, long j) {
            if (task instanceof Runnable) {
                this._timeout.schedule(task, j);
            } else {
                wg3.m206174a("!Runnable");
            }
        }

        public void stop() throws Exception {
            for (int i = 0; i < 100; i++) {
                try {
                    if (this._selecting == null) {
                        break;
                    }
                    wakeup();
                    Thread.sleep(10L);
                } catch (Exception e) {
                    SelectorManager.LOG.ignore(e);
                }
            }
            synchronized (this) {
                for (SelectionKey selectionKey : this._selector.keys()) {
                    if (selectionKey != null) {
                        Object objAttachment = selectionKey.attachment();
                        if (objAttachment instanceof EndPoint) {
                            try {
                                ((EndPoint) objAttachment).close();
                            } catch (IOException e2) {
                                SelectorManager.LOG.ignore(e2);
                            }
                        }
                    }
                }
                this._timeout.cancelAll();
                try {
                    Selector selector = this._selector;
                    if (selector != null) {
                        selector.close();
                    }
                } catch (IOException e3) {
                    SelectorManager.LOG.ignore(e3);
                }
                this._selector = null;
            }
        }

        public String toString() {
            Selector selector = this._selector;
            String string = super.toString();
            int size = -1;
            Integer numValueOf = Integer.valueOf((selector == null || !selector.isOpen()) ? -1 : selector.keys().size());
            if (selector != null && selector.isOpen()) {
                size = selector.selectedKeys().size();
            }
            return String.format("%s keys=%d selected=%d", string, numValueOf, Integer.valueOf(size));
        }

        public void wakeup() {
            try {
                Selector selector = this._selector;
                if (selector != null) {
                    selector.wakeup();
                }
            } catch (Exception unused) {
                addChange(new ChangeTask() { // from class: org.eclipse.jetty.io.nio.SelectorManager.SelectSet.2
                    @Override // java.lang.Runnable
                    public void run() {
                        SelectSet.this.renewSelector();
                    }
                });
                renewSelector();
            }
        }

        public void addChange(Object obj) {
            this._changes.add(obj);
        }

        @Override // org.eclipse.jetty.util.component.Dumpable
        public String dump() {
            return AggregateLifeCycle.dump(this);
        }
    }

    public void register(SocketChannel socketChannel) {
        int i = this._set;
        this._set = i + 1;
        if (i < 0) {
            i = -i;
        }
        int i2 = i % this._selectSets;
        SelectSet[] selectSetArr = this._selectSet;
        if (selectSetArr != null) {
            SelectSet selectSet = selectSetArr[i2];
            selectSet.addChange(socketChannel);
            selectSet.wakeup();
        }
    }

    public void register(ServerSocketChannel serverSocketChannel) {
        int i = this._set;
        this._set = i + 1;
        if (i < 0) {
            i = -i;
        }
        SelectSet selectSet = this._selectSet[i % this._selectSets];
        selectSet.addChange(serverSocketChannel);
        selectSet.wakeup();
    }
}

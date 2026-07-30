package com.cosmos.photon.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.baseim.push.ConnectStateChangeListener;
import com.cosmos.photon.baseim.push.PacketReceiver;
import com.cosmos.photon.baseim.push.PushAuthInfo;
import com.cosmos.photon.baseim.push.PushClient;
import com.cosmos.photon.baseim.push.PushContextHolder;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.referee.Referee;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.NetUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import com.immomo.push.p045pb.BodyType;
import com.immomo.push.p045pb.Disconnect;
import com.immomo.push.p045pb.PbPacketBody;
import com.immomo.push.p045pb.SAuthRet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class PushImManager implements ConnectStateChangeListener, Handler.Callback, NetUtil.NetChangeReceiver {
    public static final int AUTH_STATE_AUTHING = -2;
    public static final int AUTH_STATE_AUTHORIZED = 0;
    public static final int AUTH_STATE_AUTH_FAILED = 403;
    public static final int AUTH_STATE_DECRYPT_ERROR = 400;
    public static final int AUTH_STATE_KICK = 409;
    public static final int AUTH_STATE_REDIRECT = 410;
    public static final int AUTH_STATE_UNAUTHORIZED = -1;
    private static final int CMD_TYPE_AUTH = 2;
    private static final int CMD_TYPE_CONNECT = 1;
    private static volatile PushImManager instance;
    private AuthListener authListener;
    private volatile int authState;
    private Condition condition;
    private volatile int connectRetryCount;
    private volatile int connectState;
    private Address currentAddress;
    private volatile int currentRetryLevel;
    private volatile boolean forbiddenAutoConnect;
    private Handler handler;
    private volatile boolean isNetAvailable;
    private Lock lock;
    private volatile boolean pausedNetAvailable;
    private HandlerThread processThread;
    private PushAuthInfo pushAuthInfo;
    private PushClient pushClient;
    private volatile boolean interrupt = false;
    RETRY_LEVEL[] autoRetryLevelStep = {new RETRY_LEVEL(1, 2, 0), new RETRY_LEVEL(2, 8, 0), new RETRY_LEVEL(4, 32, 0), new RETRY_LEVEL(8, 64, 0), new RETRY_LEVEL(16, 128, 0), new RETRY_LEVEL(32, 0, 0)};

    public interface AuthListener {
        void onAuthEvent(int i);
    }

    public static class RETRY_LEVEL {
        int currentRetryCount;
        int maxRetryCount;
        int waitTime;

        public RETRY_LEVEL(int i, int i2, int i3) {
            this.waitTime = i;
            this.maxRetryCount = i2;
            this.currentRetryCount = i3;
        }
    }

    private PushImManager() {
        PushContextHolder.init(AppContext.getContext());
        PushClient pushClient = new PushClient();
        this.pushClient = pushClient;
        pushClient.setConnectStateChangeListener(this);
        HandlerThread handlerThread = new HandlerThread("mm_push_proc");
        this.processThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.processThread.getLooper(), this);
        this.isNetAvailable = NetUtil.isNetworkAvailable();
        this.pausedNetAvailable = false;
        this.forbiddenAutoConnect = false;
        this.connectRetryCount = 0;
        this.connectRetryCount = 0;
        this.authState = -1;
        this.connectState = 2;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        NetUtil.registerNetChangeReceiver(this);
        this.pushClient.registerPacketReceiver(BodyType.DISCONNECT.getNumber(), new PacketReceiver() { // from class: com.cosmos.photon.push.PushImManager.1
            @Override // com.cosmos.photon.baseim.push.PacketReceiver
            public void onReceivePacket(byte[] bArr) {
                try {
                    Disconnect disconn = PbPacketBody.parseFrom(bArr).getDisconn();
                    int ec = disconn.getEc();
                    if (ec == 409) {
                        PushImManager.this.forbiddenAutoConnect = true;
                        PushImManager.this.handler.post(new Runnable() { // from class: com.cosmos.photon.push.PushImManager.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                PushImManager.this.disconnect();
                                if (PushImManager.this.authListener != null) {
                                    PushImManager.this.authListener.onAuthEvent(409);
                                }
                            }
                        });
                    } else if (ec == 410) {
                        String ap = disconn.getAp();
                        if (TextUtils.isEmpty(ap)) {
                            return;
                        }
                        PushImManager.this.processAp(ap);
                        PushImManager.this.handler.post(new Runnable() { // from class: com.cosmos.photon.push.PushImManager.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                PushImManager.this.disconnect();
                            }
                        });
                    }
                } catch (InvalidProtocolBufferException e) {
                    MDLog.printErrStackTrace(LogTag.COMMON, e);
                }
            }
        });
    }

    public static synchronized void destroy() {
        try {
            if (instance != null) {
                instance.forbiddenAutoConnect = true;
                instance.interruptAuth();
                NetUtil.unregisterNetChangeReceiver(instance);
                instance.pushClient.removeAllPacketReceiver();
                if (instance.pushClient != null) {
                    instance.pushClient.release();
                }
                if (instance.processThread != null) {
                    instance.processThread.quit();
                }
                instance = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static PushImManager getInstance() {
        if (instance == null) {
            synchronized (PushImManager.class) {
                try {
                    if (instance == null) {
                        instance = new PushImManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private void interruptAuth() {
        if (this.interrupt) {
            return;
        }
        this.lock.lock();
        try {
            try {
                this.interrupt = true;
                this.condition.signal();
            } catch (Exception e) {
                MDLog.printErrStackTrace(LogTag.COMMON, e);
            }
        } finally {
            this.lock.unlock();
        }
    }

    private boolean isNetAccessible() {
        MDLog.m7450i(LogTag.f5845IM, "isNetAccessible : %s (%b, %d)", (this.isNetAvailable || this.connectRetryCount <= 3) ? "Available" : "Unavailable", Boolean.valueOf(this.isNetAvailable), Integer.valueOf(this.connectRetryCount));
        return this.isNetAvailable || this.connectRetryCount <= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAp(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            try {
                Referee.getInstance().setRedirectAddress(new Address(str2, Integer.parseInt(strArrSplit[1])));
            } catch (Exception e) {
                MDLog.printErrStackTrace(LogTag.f5845IM, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAutoRetryLevel() {
        this.connectRetryCount = 0;
        this.currentRetryLevel = 0;
        for (RETRY_LEVEL retry_level : this.autoRetryLevelStep) {
            retry_level.currentRetryCount = 0;
        }
    }

    public void addPshLtBlackList(String str) {
        if (this.authState != 0 || str == null) {
            return;
        }
        MDLog.m7444d(LogTag.f5845IM, "addPshLtBlackList %s", str);
        this.pushClient.addPshLtBlackList(str);
    }

    public void connect() {
        if (this.connectState == 0 && this.connectState == 1) {
            return;
        }
        this.handler.sendEmptyMessage(1);
    }

    public void disconnect() {
        if (this.connectState != 2) {
            this.pushClient.disconnect();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.forbiddenAutoConnect) {
            return true;
        }
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                this.authState = -2;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                this.interrupt = false;
                this.pushClient.registerPacketReceiver(BodyType.SAUTH_RET.getNumber(), new PacketReceiver() { // from class: com.cosmos.photon.push.PushImManager.2
                    @Override // com.cosmos.photon.baseim.push.PacketReceiver
                    public void onReceivePacket(byte[] bArr) {
                        if (PushImManager.this.interrupt) {
                            return;
                        }
                        MDLog.m7449i(LogTag.f5845IM, "onReceivePacket");
                        try {
                            PbPacketBody from = PbPacketBody.parseFrom(bArr);
                            if (BodyType.SAUTH_RET.equals(from.getType())) {
                                atomicBoolean.set(true);
                                processAuthResult(from.getSauthRet());
                                PushImManager.this.lock.lock();
                                try {
                                    PushImManager.this.condition.signal();
                                } catch (Exception e) {
                                    MDLog.printErrStackTrace(LogTag.f5845IM, e);
                                } finally {
                                    PushImManager.this.lock.unlock();
                                }
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            MDLog.printErrStackTrace(LogTag.COMMON, e2);
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
                    public void processAuthResult(SAuthRet sAuthRet) {
                        int ec = sAuthRet.getEc();
                        String ap = sAuthRet.getAp();
                        if (!TextUtils.isEmpty(ap)) {
                            PushImManager.this.processAp(ap);
                        }
                        PushImManager.this.authState = ec;
                        if (ec == 0) {
                            MDLog.m7449i(LogTag.f5845IM, "auth success");
                            PushImManager.this.pushClient.startSync();
                            PushImManager.this.pushClient.startKeepAlive();
                            PushImManager.this.resetAutoRetryLevel();
                        } else if (ec == 400) {
                            MDLog.m7449i(LogTag.f5845IM, "auth redirect");
                            PushImManager.this.pushClient.stopSync();
                            PushImManager.this.pushClient.stopKeepAlive();
                            PushImManager.this.handler.post(new Runnable() { // from class: com.cosmos.photon.push.PushImManager.2.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    PushImManager.this.disconnect();
                                }
                            });
                        } else if (ec == 403) {
                            MDLog.m7449i(LogTag.f5845IM, "auth failed");
                            PushImManager.this.forbiddenAutoConnect = true;
                            PushImManager.this.pushClient.stopSync();
                            PushImManager.this.pushClient.stopKeepAlive();
                            PushImManager.this.handler.post(new Runnable() { // from class: com.cosmos.photon.push.PushImManager.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    PushImManager.this.disconnect();
                                }
                            });
                        } else if (ec == 410) {
                            MDLog.m7449i(LogTag.f5845IM, "auth redirect");
                            PushImManager.this.pushClient.stopSync();
                            PushImManager.this.pushClient.stopKeepAlive();
                            PushImManager.this.handler.post(new Runnable() { // from class: com.cosmos.photon.push.PushImManager.2.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    PushImManager.this.disconnect();
                                }
                            });
                        }
                        if (PushImManager.this.authListener != null) {
                            PushImManager.this.authListener.onAuthEvent(ec);
                        }
                    }
                });
                this.lock.lock();
                try {
                    try {
                        this.pushClient.auth(this.pushAuthInfo);
                        long jAwaitNanos = 25000000000L;
                        while (!this.interrupt && !atomicBoolean.get() && jAwaitNanos > 0) {
                            jAwaitNanos = this.condition.awaitNanos(jAwaitNanos);
                        }
                        if (this.authState == 0) {
                            return true;
                        }
                        if (!this.interrupt && !atomicBoolean.get()) {
                            this.handler.post(new Runnable() { // from class: com.cosmos.photon.push.PushImManager.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    PushImManager.this.disconnect();
                                }
                            });
                        }
                    } catch (Exception e) {
                        MDLog.printErrStackTrace(LogTag.f5845IM, e);
                    }
                } finally {
                    this.lock.unlock();
                    this.pushClient.removePacketReceiver(BodyType.SAUTH_RET.getNumber());
                }
            }
        } else if (this.connectState != 0 || this.connectState != 1) {
            this.connectRetryCount++;
            Address imAddress = Referee.getInstance().getImAddress();
            this.currentAddress = imAddress;
            this.pushClient.connect(imAddress.host, imAddress.port);
        }
        return true;
    }

    public boolean isWorking() {
        return this.connectState == 0 && this.authState == 0 && !this.forbiddenAutoConnect;
    }

    public void notifySyncMsgSaved(String str, long j) {
        if (this.authState != 0 || str == null) {
            return;
        }
        this.pushClient.notifyMessageSaved(str, j);
    }

    @Override // com.cosmos.photon.baseim.push.ConnectStateChangeListener
    public void onConnectStateChanged(int i) {
        try {
            this.connectState = i;
            if (i == 0) {
                Referee.getInstance().success(this.currentAddress);
                this.handler.sendEmptyMessage(2);
                return;
            }
            if (2 != i) {
                if (3 == i) {
                    this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.cosmos.photon.push.PushImManager.5
                        @Override // java.lang.Runnable
                        public void run() {
                            PushImManager.this.pushClient.disconnect();
                        }
                    });
                    return;
                }
                return;
            }
            if (!this.forbiddenAutoConnect) {
                Referee.getInstance().failed(this.currentAddress);
            }
            this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.cosmos.photon.push.PushImManager.4
                @Override // java.lang.Runnable
                public void run() {
                    PushImManager.this.pushClient.stopSync();
                    PushImManager.this.pushClient.stopKeepAlive();
                }
            });
            if (this.forbiddenAutoConnect) {
                return;
            }
            if (!isNetAccessible()) {
                MDLog.m7449i(LogTag.f5845IM, "network unavailable, pause reconnect");
                this.pausedNetAvailable = true;
                return;
            }
            this.autoRetryLevelStep[this.currentRetryLevel].currentRetryCount++;
            MDLog.m7446e(LogTag.f5845IM, "Auto Connect retry %d times at level_%d ", Integer.valueOf(this.autoRetryLevelStep[this.currentRetryLevel].currentRetryCount), Integer.valueOf(this.currentRetryLevel));
            if (this.autoRetryLevelStep[this.currentRetryLevel].currentRetryCount >= this.autoRetryLevelStep[this.currentRetryLevel].maxRetryCount) {
                if (this.currentRetryLevel < 5) {
                    this.currentRetryLevel++;
                    MDLog.m7446e(LogTag.f5845IM, "Auto Connect retry level increase to %d", Integer.valueOf(this.currentRetryLevel));
                } else {
                    MDLog.m7445e(LogTag.f5845IM, "Auto Connect at highest level");
                }
            }
            int i2 = this.autoRetryLevelStep[this.currentRetryLevel].waitTime;
            MDLog.m7450i(LogTag.f5845IM, "reconnect delay %d seconds", Integer.valueOf(i2));
            if (this.handler.hasMessages(1)) {
                MDLog.m7445e(LogTag.f5845IM, "already has connect message,no need to repeat send another");
            } else {
                this.handler.sendEmptyMessageDelayed(1, i2 * 1000);
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace(LogTag.f5845IM, th);
        }
    }

    @Override // com.cosmos.photon.push.util.NetUtil.NetChangeReceiver
    public void onNetworkChanged() {
        this.isNetAvailable = NetUtil.isNetworkAvailable();
        if (!this.isNetAvailable) {
            MDLog.m7445e(LogTag.f5845IM, "onNetworkChanged unavailable");
            return;
        }
        MDLog.m7449i(LogTag.f5845IM, "onNetworkChanged available");
        if (!this.pausedNetAvailable || this.forbiddenAutoConnect) {
            return;
        }
        this.pausedNetAvailable = false;
        MDLog.m7449i(LogTag.f5845IM, "reconnect when network restored");
        this.handler.sendEmptyMessage(1);
    }

    public void registerPacketReceiver(int i, PacketReceiver packetReceiver) {
        this.pushClient.registerPacketReceiver(i, packetReceiver);
    }

    public void removePshLtBlackList(String str) {
        if (str != null) {
            MDLog.m7444d(LogTag.f5845IM, "removePshLtBlackList %s", str);
            this.pushClient.removePshLtBlackList(str);
        }
    }

    public void sendProbePacket() {
        this.pushClient.sendProbePacket();
    }

    public void sendSyncRequest(String str) {
        if (this.authState != 0 || str == null) {
            return;
        }
        MDLog.m7444d(LogTag.f5845IM, "sendSyncRequest %s", str);
        this.pushClient.sendSyncRequest(str);
    }

    public void setAuthListener(AuthListener authListener) {
        this.authListener = authListener;
    }

    public void setPushAuthInfo(PushAuthInfo pushAuthInfo) {
        this.pushAuthInfo = pushAuthInfo;
    }
}

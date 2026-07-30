package com.cosmos.photon.push.service;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.baseim.push.PacketReceiver;
import com.cosmos.photon.baseim.push.PushAuthInfo;
import com.cosmos.photon.push.DataProcessor;
import com.cosmos.photon.push.PushImManager;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.channel.inner.FileChannel;
import com.cosmos.photon.push.channel.inner.ReceiverChannel;
import com.cosmos.photon.push.channel.inner.ServerSWorker;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.DeviceUtils;
import com.cosmos.photon.push.util.NetUtil;
import com.cosmos.photon.push.util.ThreadUtils;
import com.google.protobuf.InvalidProtocolBufferException;
import com.immomo.push.p040pb.BodyType;
import com.immomo.push.p040pb.Msg;
import com.immomo.push.p040pb.MsgV2;
import com.immomo.push.p040pb.Notify;
import com.immomo.push.p040pb.NotifyV2;
import com.immomo.push.p040pb.PbPacketBody;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class PushService extends Service {
    public static final String COMMAND_BIND = "bind";
    public static final String COMMAND_CREATE = "create";
    public static final String KEY_ALIAS = "alias";
    public static final String KEY_CHANNEL = "channel";
    public static final String KEY_COMMAND = "cmd";
    public static final String KEY_PACKAGE = "package";
    public static final String KEY_TOKEN = "token";
    private String currentChannelId;
    private boolean hasChannel;
    private String mAlias;
    private String pkgName;
    private ServerSWorker sWorker;
    private String selfToken;
    private volatile boolean isImInited = false;
    private final Map<String, Set<String>> aliasSetMap = new HashMap();
    private boolean channelListening = false;

    public final class MsgSendBinder extends IPushChannel.Stub {
        private MsgSendBinder() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003e  */
        @Override // com.cosmos.photon.push.service.IPushChannel
        public Bundle executeAction(Bundle bundle, String str) throws RemoteException {
            MsgSendBinder msgSendBinder;
            final String str2;
            final String str3;
            MDLog.m7396i(LogTag.CHANNEL, "executeAction %s", str);
            if (bundle != null) {
                final String string = bundle.getString("channel");
                final String string2 = bundle.getString("package");
                if (string2 == null || !string2.equals(AppContext.getPackageName()) || (str3 = PushService.this.currentChannelId) == null || str3.equals(string)) {
                    msgSendBinder = this;
                    str2 = str;
                } else {
                    msgSendBinder = this;
                    str2 = str;
                    ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.service.PushService.MsgSendBinder.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MDLog.m7392e(LogTag.CHANNEL, "MsgSendBinder executeAction[%s] kill due to : fromPkg[%s] savedDeviceId[%s] != channelId[%s]", str2, string2, str3, string);
                            PushService.this.stopSelf();
                        }
                    });
                }
            } else {
                msgSendBinder = this;
                str2 = str;
            }
            str2.getClass();
            switch (str2) {
                case "logout":
                    if (bundle != null && TextUtils.equals(bundle.getString(ChannelConstant.Keys.KEY_TOKEN), PushService.this.selfToken)) {
                        PushService.this.stopSelf();
                    }
                    return null;
                case "check":
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean(ChannelConstant.Keys.KEY_HAS_CHANNEL, PushService.this.hasChannel);
                    return bundle2;
                case "watch":
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean(ChannelConstant.Keys.KEY_HAS_CHANNEL, PushService.this.hasChannel);
                    if (PushService.this.hasChannel) {
                        PushService.this.watchImStatus();
                    }
                    return bundle3;
                case "set_alias":
                    if (bundle == null) {
                        return null;
                    }
                    String string3 = bundle.getString(ChannelConstant.Keys.KEY_ALIAS);
                    String string4 = bundle.getString(ChannelConstant.Keys.KEY_PACKAGE);
                    if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4)) {
                        Set hashSet = (Set) PushService.this.aliasSetMap.get(string4);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            PushService.this.aliasSetMap.put(string4, hashSet);
                        }
                        if (!hashSet.contains(string3)) {
                            hashSet.add(string3);
                            MDLog.m7396i(LogTag.f5808IM, "setAlias %s : sendSyncRequest All", string3);
                            PushImManager.getInstance().sendSyncRequest("*");
                        }
                    }
                    return null;
                case "unset_alias":
                    if (bundle == null) {
                        return null;
                    }
                    String string5 = bundle.getString(ChannelConstant.Keys.KEY_ALIAS);
                    String string6 = bundle.getString(ChannelConstant.Keys.KEY_PACKAGE);
                    if (!TextUtils.isEmpty(string5) && !TextUtils.isEmpty(string6)) {
                        MDLog.m7396i(LogTag.f5808IM, "unsetAlias %s", string5);
                        Set set = (Set) PushService.this.aliasSetMap.get(string6);
                        if (set != null) {
                            set.remove(string5);
                        }
                    }
                    return null;
                case "send_probe_packet":
                    PushImManager.getInstance().sendProbePacket();
                    return null;
                default:
                    return null;
            }
        }
    }

    private void blockLt(String str, String str2) {
    }

    private void checkSyncLt(String str, String str2) {
        DeviceUtils.clearAppInstallCache();
        PushImManager.getInstance().sendSyncRequest("*");
    }

    private void exeCommand(int i, Intent intent, AtomicBoolean atomicBoolean) throws Throwable {
        PushService pushService;
        final String str;
        try {
            final String stringExtra = intent.getStringExtra(KEY_COMMAND);
            final String stringExtra2 = intent.getStringExtra("channel");
            MDLog.m7396i(LogTag.CHANNEL, "exeCommand %s PushService channelId = %s", Integer.valueOf(i), stringExtra2);
            final String stringExtra3 = intent.getStringExtra("package");
            if (stringExtra3 == null || !stringExtra3.equals(AppContext.getPackageName()) || (str = this.currentChannelId) == null || str.equals(stringExtra2)) {
                pushService = this;
            } else {
                if (atomicBoolean != null) {
                    atomicBoolean.set(false);
                }
                pushService = this;
                ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.service.PushService.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MDLog.m7392e(LogTag.CHANNEL, "exeCommand[%s] kill due to : fromPkg[%s] savedDeviceId[%s] != channelId[%s]", stringExtra, stringExtra3, str, stringExtra2);
                        PushService.this.stopSelf();
                    }
                });
            }
            pushService.currentChannelId = stringExtra2;
            pushService.selfToken = intent.getStringExtra("token");
            pushService.mAlias = intent.getStringExtra("alias");
            pushService.pkgName = stringExtra3;
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            MDLog.m7392e(LogTag.CHANNEL, "%s command: %s channelId:%s token:%s alias:%s", i == 1 ? "onStartCommand" : "onBind", stringExtra, pushService.currentChannelId, pushService.selfToken, pushService.mAlias);
            stringExtra.getClass();
            if (stringExtra.equals(COMMAND_CREATE)) {
                pushService.hasChannel = true;
                pushService.listenChannel();
                pushService.watchImStatus();
            }
            pushService.checkSyncLt(pushService.pkgName, !TextUtils.isEmpty(pushService.mAlias) ? pushService.mAlias : pushService.selfToken);
        } catch (Throwable th) {
            MDLog.printErrStackTrace(LogTag.CHANNEL, th);
        }
    }

    private synchronized void initPushImManager() {
        this.isImInited = true;
        PushAuthInfo pushAuthInfo = new PushAuthInfo();
        pushAuthInfo.appId = AppContext.getAppId();
        pushAuthInfo.deviceId = this.currentChannelId;
        pushAuthInfo.token = this.selfToken;
        pushAuthInfo.version = 12310;
        pushAuthInfo.clientType = DeviceUtils.getModle() + "@" + DeviceUtils.getManufacturer();
        PushImManager.getInstance().setPushAuthInfo(pushAuthInfo);
        PushImManager.getInstance().registerPacketReceiver(BodyType.MSG.getNumber(), new PacketReceiver() { // from class: com.cosmos.photon.push.service.PushService.2
            @Override // com.cosmos.photon.baseim.push.PacketReceiver
            public void onReceivePacket(byte[] bArr) {
                try {
                    Msg msg = PbPacketBody.parseFrom(bArr).getMsg();
                    if (!DeviceUtils.isAppInstalled(msg.getToPkg())) {
                        MDLog.m7392e(LogTag.NOTIFY, "pkg[%s] uninstall", msg.getToPkg());
                    } else if (DataProcessor.onMsgArrived(msg)) {
                        PushImManager.getInstance().notifySyncMsgSaved(msg.getLt(), msg.getLv());
                    }
                } catch (InvalidProtocolBufferException e) {
                    MDLog.printErrStackTrace(LogTag.COMMON, e);
                }
            }
        });
        PushImManager.getInstance().registerPacketReceiver(BodyType.MSGV2.getNumber(), new PacketReceiver() { // from class: com.cosmos.photon.push.service.PushService.3
            @Override // com.cosmos.photon.baseim.push.PacketReceiver
            public void onReceivePacket(byte[] bArr) {
                try {
                    MsgV2 msgV2 = PbPacketBody.parseFrom(bArr).getMsgV2();
                    if (DeviceUtils.isAppInstalled(msgV2.getToPkg())) {
                        DataProcessor.onMsgArrived(msgV2);
                    } else {
                        MDLog.m7392e(LogTag.NOTIFY, "pkg[%s] uninstall", msgV2.getToPkg());
                    }
                } catch (InvalidProtocolBufferException e) {
                    MDLog.printErrStackTrace(LogTag.COMMON, e);
                }
            }
        });
        PushImManager.getInstance().registerPacketReceiver(BodyType.NOTIFY.getNumber(), new PacketReceiver() { // from class: com.cosmos.photon.push.service.PushService.4
            @Override // com.cosmos.photon.baseim.push.PacketReceiver
            public void onReceivePacket(byte[] bArr) {
                try {
                    Notify notify = PbPacketBody.parseFrom(bArr).getNotify();
                    if (!DeviceUtils.isAppInstalled(notify.getToPkg())) {
                        MDLog.m7392e(LogTag.NOTIFY, "pkg[%s] uninstall", notify.getToPkg());
                    } else if (DataProcessor.onPushArrived(notify)) {
                        PushImManager.getInstance().notifySyncMsgSaved(notify.getLt(), notify.getLv());
                    }
                } catch (InvalidProtocolBufferException e) {
                    MDLog.printErrStackTrace(LogTag.COMMON, e);
                }
            }
        });
        PushImManager.getInstance().registerPacketReceiver(BodyType.NOTIFYV2.getNumber(), new PacketReceiver() { // from class: com.cosmos.photon.push.service.PushService.5
            @Override // com.cosmos.photon.baseim.push.PacketReceiver
            public void onReceivePacket(byte[] bArr) {
                try {
                    NotifyV2 notifyV2 = PbPacketBody.parseFrom(bArr).getNotifyV2();
                    if (DeviceUtils.isAppInstalled(notifyV2.getToPkg())) {
                        DataProcessor.onPushArrived(notifyV2);
                    } else {
                        MDLog.m7392e(LogTag.NOTIFY, "pkg[%s] uninstall", notifyV2.getToPkg());
                    }
                } catch (InvalidProtocolBufferException e) {
                    MDLog.printErrStackTrace(LogTag.COMMON, e);
                }
            }
        });
        PushImManager.getInstance().setAuthListener(new PushImManager.AuthListener() { // from class: com.cosmos.photon.push.service.PushService.6
            @Override // com.cosmos.photon.push.PushImManager.AuthListener
            public void onAuthEvent(int i) {
                if (i == 409 || i == 403) {
                    MDLog.m7396i(LogTag.f5808IM, "PushService stopSelf onAuthEvent(%d)", Integer.valueOf(i));
                    PushService.this.stopSelf();
                }
            }
        });
    }

    private void listenChannel() throws Throwable {
        if (this.channelListening) {
            return;
        }
        this.channelListening = true;
        if (Build.VERSION.SDK_INT < 28) {
            if (this.sWorker == null) {
                this.sWorker = new ServerSWorker();
            }
            this.sWorker.start(this.currentChannelId);
        }
        ReceiverChannel.registerChannelReceiver(this.currentChannelId);
        FileChannel.writeConfig(this.currentChannelId, getPackageName());
    }

    private void onDispatchFailed(String str, String str2) {
    }

    private void onDispatchSuccess(String str, String str2) {
    }

    private void stopChannel() throws Throwable {
        this.hasChannel = false;
        this.channelListening = false;
        FileChannel.deleteConfig(this.currentChannelId);
        ReceiverChannel.unRegisterChannelReceiver();
        ServerSWorker serverSWorker = this.sWorker;
        if (serverSWorker != null) {
            serverSWorker.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void watchImStatus() {
        if (!this.isImInited) {
            initPushImManager();
        }
        if (PushImManager.getInstance().isWorking()) {
            return;
        }
        PushImManager.getInstance().connect();
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) throws Throwable {
        exeCommand(2, intent, null);
        return new MsgSendBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        MDLog.m7395i(LogTag.CHANNEL, "onCreate");
        NetUtil.init(this);
    }

    @Override // android.app.Service
    public void onDestroy() throws Throwable {
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.service.PushService.7
            @Override // java.lang.Runnable
            public void run() {
                Process.killProcess(Process.myPid());
            }
        });
        this.hasChannel = false;
        stopChannel();
        MDLog.m7391e(LogTag.CHANNEL, "onDestroy");
        PushImManager.destroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) throws Throwable {
        MDLog.m7396i(LogTag.CHANNEL, "onStartCommand %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (intent == null) {
            return 2;
        }
        exeCommand(1, intent, new AtomicBoolean(true));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        MDLog.m7391e(LogTag.CHANNEL, "onUnbind");
        return super.onUnbind(intent);
    }
}

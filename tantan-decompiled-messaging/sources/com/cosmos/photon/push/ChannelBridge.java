package com.cosmos.photon.push;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.channel.IChannelManager;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.ThreadUtils;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.tgw;

/* JADX INFO: loaded from: classes.dex */
public class ChannelBridge {
    private static final int MAX_FAILEDTIMES = 10;
    private static final int MAX_FAILEDTIMES_NO_OPPO = 20;
    private static String deviceId = null;
    private static volatile Handler handler = null;
    private static boolean isOppo = false;
    protected static boolean pushConfigPrivateChannel = false;
    private static volatile String sAlias;
    private static volatile String sToken;
    private static volatile String useDeviceId;
    private static AtomicInteger failedTimes = new AtomicInteger();
    private static final Object handlerLock = new Object();
    private static boolean isRunningInMainProcess = true;
    static IChannelManager.ChannelListener listener = new IChannelManager.ChannelListener() { // from class: com.cosmos.photon.push.ChannelBridge.7
        private IChannelManager.IChannel mChannel;

        @Override // com.cosmos.photon.push.channel.IChannelManager.ChannelListener
        public IChannelManager.IChannel getChannel() {
            return this.mChannel;
        }

        @Override // com.cosmos.photon.push.channel.IChannelManager.ChannelListener
        public void onChannelConnected(IChannelManager.IChannel iChannel) {
            boolean z;
            this.mChannel = iChannel;
            Bundle bundleExecuteAction = null;
            try {
                bundleExecuteAction = iChannel.executeAction(null, "check");
            } catch (Throwable th) {
                MDLog.printErrStackTrace(LogTag.CHANNEL, th);
            }
            if (bundleExecuteAction != null) {
                z = bundleExecuteAction.getBoolean(ChannelConstant.Keys.KEY_HAS_CHANNEL);
                if (!z) {
                }
                MDLog.m7396i(LogTag.CHANNEL, "check result %b  %s", Boolean.valueOf(z), bundleExecuteAction);
            }
            z = false;
            ChannelBridge.checkCreateChannel();
            MDLog.m7396i(LogTag.CHANNEL, "check result %b  %s", Boolean.valueOf(z), bundleExecuteAction);
        }

        @Override // com.cosmos.photon.push.channel.IChannelManager.ChannelListener
        public void onChannelDisConnect() {
            this.mChannel = null;
            if (TextUtils.isEmpty(ChannelBridge.sToken)) {
                return;
            }
            ChannelBridge.start(true);
        }

        @Override // com.cosmos.photon.push.channel.IChannelManager.ChannelListener
        public void onChannelError(int i) {
            MDLog.m7392e(LogTag.CHANNEL, "onChannelError %d", Integer.valueOf(i));
            ChannelBridge.checkCreateChannel();
        }
    };

    private static synchronized void check() {
        if (isRunningInMainProcess) {
            if (TextUtils.isEmpty(deviceId)) {
                initChannel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkCreateChannel() {
        if (!shouldLimit()) {
            createChannel();
            return;
        }
        int iAddAndGet = failedTimes.addAndGet(1);
        if (iAddAndGet >= getMaxFailedtimes()) {
            return;
        }
        if (handler == null) {
            synchronized (handlerLock) {
                try {
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        handler.postDelayed(new Runnable() { // from class: com.cosmos.photon.push.ChannelBridge.8
            @Override // java.lang.Runnable
            public void run() {
                MDLog.m7395i(LogTag.CHANNEL, "createChannel");
                ChannelBridge.createChannel();
            }
        }, iAddAndGet * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void createChannel() {
        if (isRunningInMainProcess) {
            ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.ChannelBridge.5
                @Override // java.lang.Runnable
                public void run() {
                    ChannelManager.getInstance().unBind();
                    ChannelManager.getInstance().create(ChannelBridge.useDeviceId, ChannelBridge.sToken, ChannelBridge.sAlias, ChannelBridge.listener);
                }
            });
        }
    }

    public static String getDeviceId() {
        check();
        return useDeviceId;
    }

    private static int getMaxFailedtimes() {
        return isOppo ? 10 : 20;
    }

    private static void initChannel() {
        isRunningInMainProcess = AppContext.isRunningInMainProcess();
        String strM188826a = tgw.m188826a(AppContext.getContext());
        deviceId = strM188826a;
        MDLog.m7392e(LogTag.CHANNEL, "initChannel gen deviceId : %s", strM188826a);
        useDeviceId = deviceId;
        if (PhotonPushManager.uniqueChannel || pushConfigPrivateChannel) {
            useDeviceId = deviceId + ":+" + AppContext.getPackageName();
        }
        if (isRunningInMainProcess) {
            String deviceId2 = PushPreferenceUtils.getDeviceId();
            if (TextUtils.isEmpty(deviceId2) || deviceId2.equals(useDeviceId)) {
                return;
            }
            PushPreferenceUtils.saveDeviceId(useDeviceId);
            ApiCacheUtil.clearAll();
            MDLog.printErrStackTrace(LogTag.CHANNEL, new Exception("deviceid出现不一致问题"));
            watchFixChannelIdChange();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendProbePacket() {
        if (isRunningInMainProcess) {
            ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.ChannelBridge.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IChannelManager.IChannel channel = ChannelBridge.listener.getChannel();
                        if (channel != null) {
                            channel.executeAction(null, ChannelConstant.Action.AIDL_ACTION_SEND_PROBE);
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static void setAlias(final String str) {
        if (isRunningInMainProcess) {
            ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.ChannelBridge.3
                @Override // java.lang.Runnable
                public void run() {
                    IChannelManager.IChannel channel = ChannelBridge.listener.getChannel();
                    if (channel != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(ChannelConstant.Keys.KEY_ALIAS, str);
                        bundle.putString(ChannelConstant.Keys.KEY_PACKAGE, AppContext.getPackageName());
                        channel.executeAction(bundle, ChannelConstant.Action.AIDL_ACTION_SET_ALIAS);
                    }
                }
            });
        }
    }

    private static boolean shouldLimit() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void start(boolean z) {
        int iNextInt;
        if (isRunningInMainProcess) {
            if (!z || PhotonPushManager.getInstance().isForeGround()) {
                iNextInt = 0;
            } else {
                iNextInt = new Random().nextInt(10);
                MDLog.m7396i(LogTag.CHANNEL, "random sleep %d seconds", Integer.valueOf(iNextInt));
            }
            ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.ChannelBridge.1
                @Override // java.lang.Runnable
                public void run() {
                    Bundle bundleExecuteAction;
                    IChannelManager.IChannel channel = ChannelBridge.listener.getChannel();
                    if (channel != null && (bundleExecuteAction = channel.executeAction(null, ChannelConstant.Action.AIDL_ACTION_WATCH)) != null && bundleExecuteAction.getBoolean(ChannelConstant.Keys.KEY_HAS_CHANNEL)) {
                        MDLog.m7391e(LogTag.CHANNEL, "当前已有通道并可用，无需再绑定或建立");
                        ChannelBridge.sendProbePacket();
                        return;
                    }
                    String strQuery = ChannelManager.getInstance().query(ChannelBridge.useDeviceId);
                    if (TextUtils.isEmpty(strQuery)) {
                        ChannelManager.getInstance().create(ChannelBridge.useDeviceId, ChannelBridge.sToken, ChannelBridge.sAlias, ChannelBridge.listener);
                    } else {
                        ChannelManager.getInstance().bind(ChannelBridge.useDeviceId, ChannelBridge.sToken, ChannelBridge.sAlias, strQuery, ChannelBridge.listener);
                    }
                }
            }, iNextInt, TimeUnit.SECONDS);
        }
    }

    public static void stopSync(String str) {
        if (isRunningInMainProcess) {
            sToken = null;
            sAlias = null;
            IChannelManager.IChannel channel = listener.getChannel();
            if (channel != null) {
                Bundle bundle = new Bundle();
                bundle.putString(ChannelConstant.Keys.KEY_TOKEN, str);
                channel.executeAction(bundle, ChannelConstant.Action.AIDL_ACTION_LOGOUT);
            }
        }
    }

    public static void unsetAlias(final String str) {
        if (isRunningInMainProcess) {
            ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.ChannelBridge.4
                @Override // java.lang.Runnable
                public void run() {
                    IChannelManager.IChannel channel = ChannelBridge.listener.getChannel();
                    if (channel != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(ChannelConstant.Keys.KEY_ALIAS, str);
                        bundle.putString(ChannelConstant.Keys.KEY_PACKAGE, AppContext.getPackageName());
                        channel.executeAction(bundle, ChannelConstant.Action.AIDL_ACTION_UNSET_ALIAS);
                    }
                }
            });
        }
    }

    public static void watchFixChannelIdChange() {
        if (isRunningInMainProcess) {
            ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.ChannelBridge.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MDLog.m7391e(LogTag.CHANNEL, "ChannelBridge watchFixChannelIdChange");
                        IChannelManager.IChannel channel = ChannelBridge.listener.getChannel();
                        if (channel != null) {
                            channel.executeAction(null, ChannelConstant.Action.AIDL_ACTION_WATCH);
                        }
                    } catch (Throwable th) {
                        MDLog.printErrStackTrace(LogTag.CHANNEL, th);
                    }
                    ChannelBridge.start(true);
                }
            }, 2L, TimeUnit.SECONDS);
        }
    }

    public static void start(String str, String str2) {
        if (isRunningInMainProcess) {
            if (TextUtils.isEmpty(str)) {
                MDLog.m7391e(LogTag.CHANNEL, "start failed, self token is null");
                return;
            }
            sToken = str;
            sAlias = str2;
            isOppo = HardwareEarMonitorUtils.MANUFACTURER_OPPO.equalsIgnoreCase(Build.MANUFACTURER);
            failedTimes.getAndSet(0);
            check();
            start(false);
        }
    }
}

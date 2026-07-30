package com.cosmos.photon.push;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.channel.IChannelManager;
import com.cosmos.photon.push.channel.inner.ClientWorker;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.service.IPushChannel;
import com.cosmos.photon.push.service.PushService;
import com.cosmos.photon.push.util.AppContext;

/* JADX INFO: loaded from: classes.dex */
public class ChannelManager implements IChannelManager {
    private String mChannelId;
    private MyServiceConnection myServiceConnection;

    public final class MyServiceConnection implements ServiceConnection {
        IChannelManager.ChannelListener listener;

        private MyServiceConnection(IChannelManager.ChannelListener channelListener) {
            this.listener = channelListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MDLog.m7395i(LogTag.CHANNEL, "onServiceConnected " + iBinder);
            final IPushChannel iPushChannelAsInterface = IPushChannel.Stub.asInterface(iBinder);
            this.listener.onChannelConnected(new IChannelManager.IChannel() { // from class: com.cosmos.photon.push.ChannelManager.MyServiceConnection.1
                @Override // com.cosmos.photon.push.channel.IChannelManager.IChannel
                public Bundle executeAction(Bundle bundle, String str) {
                    if (bundle == null) {
                        try {
                            bundle = new Bundle();
                        } catch (Throwable th) {
                            MDLog.printErrStackTrace(LogTag.CHANNEL, th);
                            return null;
                        }
                    }
                    if (bundle.getString("channel") == null) {
                        bundle.putString("channel", PushPreferenceUtils.getDeviceId());
                    }
                    if (bundle.getString("package") == null) {
                        bundle.putString("package", AppContext.getPackageName());
                    }
                    MDLog.m7396i(LogTag.CHANNEL, "*===* executeAction[%s] channelId=%s", str, bundle.getString("channel"));
                    return iPushChannelAsInterface.executeAction(bundle, str);
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MDLog.m7395i(LogTag.CHANNEL, "onServiceDisconnected");
            this.listener.onChannelDisConnect();
        }
    }

    public static class SingleInstanceHolder {
        private static ChannelManager manager = new ChannelManager();

        private SingleInstanceHolder() {
        }
    }

    private boolean doBindService(String str, String str2, String str3, String str4, String str5, IChannelManager.ChannelListener channelListener) {
        MDLog.m7396i(LogTag.CHANNEL, "*===* doBindService channelId=%s", str5);
        this.mChannelId = str5;
        Intent intent = new Intent(ChannelConstant.getPushServiceAction(str3));
        intent.setPackage(str3);
        intent.setComponent(new ComponentName(str3, PushService.class.getName()));
        intent.putExtra(PushService.KEY_COMMAND, str4);
        intent.putExtra("channel", str5);
        intent.putExtra("token", str);
        intent.putExtra("alias", str2);
        intent.putExtra("package", AppContext.getPackageName());
        this.myServiceConnection = new MyServiceConnection(channelListener);
        try {
            AppContext.getContext().startService(intent);
        } catch (Throwable unused) {
        }
        MDLog.m7396i(LogTag.CHANNEL, "bindService channelId=%s", str5);
        return AppContext.getContext().bindService(intent, this.myServiceConnection, 1);
    }

    public static ChannelManager getInstance() {
        return SingleInstanceHolder.manager;
    }

    private boolean invalid(String str) {
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        MDLog.m7392e(LogTag.CHANNEL, "token is invalid :%s", str);
        return true;
    }

    @Override // com.cosmos.photon.push.channel.IChannelManager
    public synchronized void bind(String str, String str2, String str3, String str4, IChannelManager.ChannelListener channelListener) {
        try {
            try {
                if (invalid(str2)) {
                    return;
                }
                MDLog.m7396i(LogTag.CHANNEL, "exec bind %s", str);
                boolean zDoBindService = doBindService(str2, str3, str4, PushService.COMMAND_BIND, str, channelListener);
                if (!zDoBindService) {
                    channelListener.onChannelError(-2);
                }
                MDLog.m7396i(LogTag.CHANNEL, "bindResult :%b", Boolean.valueOf(zDoBindService));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.cosmos.photon.push.channel.IChannelManager
    public synchronized void create(String str, String str2, String str3, IChannelManager.ChannelListener channelListener) {
        Throwable th;
        try {
            try {
                if (invalid(str2)) {
                    return;
                }
                if (this.myServiceConnection != null) {
                    try {
                        AppContext.getContext().unbindService(this.myServiceConnection);
                        this.myServiceConnection = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                MDLog.m7396i(LogTag.CHANNEL, "exec create %s", str);
                boolean zDoBindService = doBindService(str2, str3, AppContext.getContext().getPackageName(), PushService.COMMAND_CREATE, str, channelListener);
                if (!zDoBindService) {
                    channelListener.onChannelError(-1);
                }
                MDLog.m7396i(LogTag.CHANNEL, "bindResult :%b", Boolean.valueOf(zDoBindService));
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // com.cosmos.photon.push.channel.IChannelManager
    public synchronized String query(String str) {
        String strSendMessageByBR;
        boolean zSendMessage;
        try {
            MDLog.m7396i(LogTag.CHANNEL, "exec query %s", str);
            if (Build.VERSION.SDK_INT < 28) {
                StringBuilder sb = new StringBuilder();
                zSendMessage = ClientWorker.sendMessage(str, ChannelConstant.getChannelCommand(), 1200, sb);
                strSendMessageByBR = sb.toString();
            } else {
                strSendMessageByBR = null;
                zSendMessage = false;
            }
            if (!zSendMessage) {
                strSendMessageByBR = ClientWorker.sendMessageByBR(str, 1200);
                if (TextUtils.isEmpty(strSendMessageByBR)) {
                    strSendMessageByBR = ClientWorker.sendMessageByFile(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return strSendMessageByBR;
    }

    @Override // com.cosmos.photon.push.channel.IChannelManager
    public synchronized void release(String str) {
        MDLog.m7396i(LogTag.CHANNEL, "exec release %s", str);
        if (this.myServiceConnection != null) {
            AppContext.getContext().unbindService(this.myServiceConnection);
            this.myServiceConnection = null;
        }
    }

    @Override // com.cosmos.photon.push.channel.IChannelManager
    public void unBind() {
    }

    private ChannelManager() {
    }
}

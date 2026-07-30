package com.cosmos.photon.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.channel.PushContentHelper;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.msg.MoMessage;
import com.cosmos.photon.push.notification.MoNotify;
import com.cosmos.photon.push.service.PushOVActivity;
import com.cosmos.photon.push.service.SchedulerPushService;
import com.cosmos.photon.push.statistic.EventLogBody;
import com.cosmos.photon.push.statistic.PushEventStatistic;
import com.cosmos.photon.push.util.AlarmTimerUtil;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.IDUtils;
import com.google.android.gms.common.api.Api;
import com.immomo.push.p040pb.Msg;
import com.immomo.push.p040pb.MsgV2;
import com.immomo.push.p040pb.Notify;
import com.immomo.push.p040pb.NotifyV2;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import p149l.nr40;

/* JADX INFO: loaded from: classes.dex */
public class DataProcessor {
    private static Handler handler = null;
    private static HandlerThread handlerThread = null;
    private static volatile boolean needAwake = true;

    public static String getPushSource(int i) {
        if (i == 1) {
            return "push:huawei";
        }
        if (i == 2) {
            return "push:xiaomi";
        }
        if (i == 3) {
            return "push:oppo";
        }
        if (i == 4) {
            return "push:vivo";
        }
        if (i == 6) {
            return "push:meizu";
        }
        if (i == 10) {
            return "push:honor";
        }
        if (i == 11) {
            return "push:self";
        }
        switch (i) {
            case 100:
                return "push:getui";
            case 101:
                return "push:jiguang";
            case 102:
                return "push:ali";
            case 103:
                return "push:xmsilent";
            default:
                return "unknown";
        }
    }

    private static boolean isIntentAvailable(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        return listQueryIntentServices != null && listQueryIntentServices.size() > 0;
    }

    private static boolean onMsgArrived(MoMessage moMessage) {
        MDLog.m7396i(LogTag.NOTIFY, "onMsgArrived %s", moMessage);
        Bundle bundle = new Bundle();
        bundle.putSerializable(ChannelConstant.Keys.KEY_MSG_DATA, moMessage);
        Bundle bundleExecuteAction = PushContentHelper.executeAction(moMessage.toPkg, ChannelConstant.Action.PROVIDER_CHANNEL_MSG, bundle);
        return bundleExecuteAction != null && bundleExecuteAction.getBoolean(ChannelConstant.Keys.KEY_RESULT);
    }

    public static void onMsgArrivedInner(MoMessage moMessage) {
        PhotonPushManager.messageReceiver.onReceivePassThroughMessage(moMessage);
        MDLog.m7396i(LogTag.NOTIFY, "onMsgArrivedInner %s", moMessage);
    }

    private static boolean onPushArrived(MoNotify moNotify) {
        MDLog.m7396i(LogTag.NOTIFY, "onPushArrived %s", moNotify);
        PushEventStatistic.logPushEventInfo(new EventLogBody.Builder().pushSource("push:self").time(moNotify.time).data(moNotify.data).type(EventLogBody.TYPE_ARRIVED).uploadType(moNotify.logType).build());
        if (moNotify.showTime > 0) {
            scheduleNotify(moNotify);
            return true;
        }
        if (moNotify.actionType == 2 && !TextUtils.isEmpty(moNotify.action)) {
            try {
                Intent uri = Intent.parseUri(moNotify.action, 0);
                uri.putExtra("pushType", 11);
                moNotify.action = uri.toUri(0);
            } catch (URISyntaxException e) {
                MDLog.printErrStackTrace(LogTag.STATISTIC, e);
            }
        }
        Bundle bundle = new Bundle();
        if (TextUtils.equals(AppContext.getPackageName(), moNotify.toPkg)) {
            bundle.putInt(ChannelConstant.Keys.KEY_PUSH_DATA_TYPE, 1);
            bundle.putSerializable(ChannelConstant.Keys.KEY_PUSH_DATA, moNotify);
            bundle.putString(ChannelConstant.Keys.KEY_PUSH_JSON_DATA, moNotify.toJson());
        } else {
            bundle.putInt(ChannelConstant.Keys.KEY_PUSH_DATA_TYPE, 0);
            bundle.putString(ChannelConstant.Keys.KEY_PUSH_DATA, moNotify.toJson());
        }
        Bundle bundleExecuteAction = PushContentHelper.executeAction(moNotify.toPkg, ChannelConstant.Action.PROVIDER_CHANNEL_PUSH, bundle);
        if (bundleExecuteAction == null || !bundleExecuteAction.getBoolean(ChannelConstant.Keys.KEY_RESULT)) {
            MDLog.m7391e(LogTag.NOTIFY, "onPushArrived contentUri failed");
            if (needAwake) {
                try {
                    PushOVActivity.transData(moNotify);
                } catch (Exception e2) {
                    MDLog.printErrStackTrace(LogTag.CHANNEL, e2);
                    EventLogBody.Builder builder = new EventLogBody.Builder();
                    builder.pushSource("push:self").time(moNotify.time).data(moNotify.data).uploadType(moNotify.logType).type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(8);
                    PushEventStatistic.logPushEventInfo(builder.build());
                }
            }
            return false;
        }
        return true;
    }

    public static void onPushArrivedInner(final MoNotify moNotify) {
        if (handler == null) {
            HandlerThread handlerThread2 = new HandlerThread("mmpush_msg_proc");
            handlerThread = handlerThread2;
            handlerThread2.start();
            handler = new Handler(handlerThread.getLooper());
        }
        handler.post(new Runnable() { // from class: com.cosmos.photon.push.DataProcessor.1
            @Override // java.lang.Runnable
            public void run() {
                String pushSource;
                MDLog.m7396i(LogTag.NOTIFY, "onPushArrivedInner %s", moNotify);
                MoNotify moNotify2 = moNotify;
                if (moNotify2.multi == 1) {
                    boolean zExists = IDUtils.exists(moNotify2.f5810id);
                    MoNotify moNotify3 = moNotify;
                    if (zExists) {
                        MDLog.m7396i(LogTag.NOTIFY, "onPushArrivedInner duplicate id : %s ", moNotify3.f5810id);
                        EventLogBody.Builder builder = new EventLogBody.Builder();
                        try {
                            pushSource = DataProcessor.getPushSource(Intent.parseUri(moNotify.action, 0));
                        } catch (Throwable unused) {
                            pushSource = "unknown";
                        }
                        builder.pushSource(pushSource).time(moNotify.time).data(moNotify.data).uploadType(moNotify.logType).type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(101);
                        PushEventStatistic.logPushEventInfo(builder.build());
                        return;
                    }
                    IDUtils.saveId(moNotify3.f5810id);
                }
                try {
                    NotifyHelper.sendNotify(AppContext.getContext(), moNotify);
                } catch (Throwable th) {
                    MDLog.printErrStackTrace(LogTag.COMMON, th);
                }
            }
        });
    }

    public static boolean onPushClick(MoNotify moNotify) {
        Intent uri;
        int intExtra;
        try {
            uri = Intent.parseUri(moNotify.action, 0);
        } catch (URISyntaxException unused) {
            uri = null;
        }
        try {
            intExtra = uri.getIntExtra("pushType", -1);
        } catch (Exception e) {
            e.printStackTrace();
            intExtra = -1;
        }
        if (intExtra == -1) {
            try {
                String stringExtra = uri.getStringExtra("pushType");
                if (!TextUtils.isEmpty(stringExtra)) {
                    intExtra = Integer.parseInt(stringExtra);
                }
            } catch (Exception unused2) {
            }
        }
        if (intExtra == 11 || intExtra == 100 || intExtra == 101 || intExtra == 102 || intExtra == 103) {
            String pushSource = getPushSource(intExtra);
            PushEventStatistic.logPushEventInfo(new EventLogBody.Builder().pushSource(pushSource).type(EventLogBody.TYPE_CLICKED).uploadType(moNotify.logType).time(System.currentTimeMillis()).data(moNotify.data).build());
            if (!PhotonPushManager.getInstance().isForeGround) {
                PushEventStatistic.logPushEventInfo(new EventLogBody.Builder().pushSource(pushSource).type(EventLogBody.TYPE_FORGROUND_NOT_SHOWN).uploadType(moNotify.logType).time(System.currentTimeMillis()).data(moNotify.data).build());
            }
        }
        if (TextUtils.equals(moNotify.toPkg, AppContext.getPackageName())) {
            MDLog.m7396i(LogTag.NOTIFY, "onPushClick %s", moNotify);
            return PhotonPushManager.messageReceiver.onNotificationMessageClicked(moNotify);
        }
        MDLog.m7392e(LogTag.NOTIFY, "onPushClick 代其他APP产生的通知被点击了", moNotify);
        return false;
    }

    public static void onPushClickFromBusiness(MoNotify moNotify) {
        int intExtra;
        MDLog.m7392e(LogTag.NOTIFY, "click push from business", moNotify);
        if (moNotify == null) {
            return;
        }
        Intent uri = null;
        try {
            uri = Intent.parseUri(moNotify.action, 0);
            intExtra = uri.getIntExtra("pushType", -1);
        } catch (Exception e) {
            e.printStackTrace();
            intExtra = -1;
        }
        if (uri != null && intExtra == -1) {
            try {
                String stringExtra = uri.getStringExtra("pushType");
                if (!TextUtils.isEmpty(stringExtra)) {
                    intExtra = Integer.parseInt(stringExtra);
                }
            } catch (Exception unused) {
            }
        }
        String pushSource = getPushSource(intExtra);
        PushEventStatistic.logPushEventInfo(new EventLogBody.Builder().pushSource(pushSource).type(EventLogBody.TYPE_CLICKED).uploadType(moNotify.logType).time(System.currentTimeMillis()).data(moNotify.data).clickFromBusiness(true).build());
        if (PhotonPushManager.getInstance().isForeGround) {
            return;
        }
        PushEventStatistic.logPushEventInfo(new EventLogBody.Builder().pushSource(pushSource).type(EventLogBody.TYPE_FORGROUND_NOT_SHOWN).uploadType(moNotify.logType).time(System.currentTimeMillis()).data(moNotify.data).clickFromBusiness(true).build());
    }

    public static void onPushShowFromBusiness(MoNotify moNotify, boolean z) {
        MDLog.m7392e(LogTag.NOTIFY, "onPushShowFromBusiness", moNotify);
        if (moNotify == null) {
            return;
        }
        String pushSource = getPushSource(moNotify);
        EventLogBody.Builder builder = new EventLogBody.Builder();
        builder.pushSource(pushSource).uploadType(moNotify.logType).time(moNotify.time).data(moNotify.data);
        if (!nr40.m160709e(AppContext.getContext()).m160712a()) {
            builder.type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(6);
        } else if (z) {
            builder.type(EventLogBody.TYPE_SHOWN);
        } else {
            builder.type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(1);
        }
        PushEventStatistic.logPushEventInfo(builder.build());
    }

    private static void scheduleNotify(MoNotify moNotify) {
        MDLog.m7396i(LogTag.NOTIFY, "scheduler notify(%s) at %s", moNotify.f5810id, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(moNotify.showTime)));
        try {
            String packageName = AppContext.getPackageName();
            Intent intent = new Intent(ChannelConstant.getSchedulerPushServiceAction(packageName));
            intent.setPackage(packageName);
            intent.setComponent(new ComponentName(packageName, SchedulerPushService.class.getName()));
            intent.putExtra("data", moNotify.toJson());
            if (isIntentAvailable(AppContext.getContext(), intent)) {
                AlarmTimerUtil.setAlarmTimer(AppContext.getContext(), intent, new Random().nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER), moNotify.showTime);
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace(LogTag.NOTIFY, th);
        }
    }

    public static boolean onMsgArrived(Msg msg) {
        return onMsgArrived(MoMessage.create(msg));
    }

    public static boolean onMsgArrived(MsgV2 msgV2) {
        return onMsgArrived(MoMessage.create(msgV2));
    }

    public static String getPushSource(Intent intent) {
        int intExtra;
        try {
            String stringExtra = intent.getStringExtra("pushType");
            intExtra = !TextUtils.isEmpty(stringExtra) ? Integer.parseInt(stringExtra) : -1;
        } catch (Exception unused) {
        }
        if (intExtra == -1) {
            try {
                intExtra = intent.getIntExtra("pushType", -1);
            } catch (Exception unused2) {
            }
        }
        return getPushSource(intExtra);
    }

    public static String getPushSource(MoNotify moNotify) {
        try {
            return getPushSource(Intent.parseUri(moNotify.action, 0));
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static boolean onPushArrived(Notify notify) {
        try {
            return onPushArrived(MoNotify.create(notify));
        } catch (Throwable th) {
            MDLog.printErrStackTrace(LogTag.COMMON, th);
            return false;
        }
    }

    public static boolean onPushArrived(NotifyV2 notifyV2) {
        try {
            return onPushArrived(MoNotify.create(notifyV2));
        } catch (Throwable th) {
            MDLog.printErrStackTrace(LogTag.COMMON, th);
            return false;
        }
    }
}

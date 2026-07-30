package com.cosmos.photon.push;

import android.app.ActivityOptions;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.notification.MoNotify;
import com.cosmos.photon.push.notification.NotificationBuilder;
import com.cosmos.photon.push.statistic.EventLogBody;
import com.cosmos.photon.push.statistic.PushEventStatistic;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.Res;
import com.cosmos.photon.push.util.ThreadUtils;
import com.google.android.gms.common.ConnectionResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p149l.ii5;
import p149l.nr40;

/* JADX INFO: loaded from: classes.dex */
public class NotifyHelper {
    private static Pattern emojiPattern = null;
    private static Handler handler = null;
    private static HandlerThread handlerThread = null;

    /* JADX INFO: renamed from: nm */
    private static NotificationManager f5800nm = null;
    private static long preNotifyTime = 0;
    private static int requestCode = 55;

    public static class NotifyConfig {
        public boolean autoCancel;
        public String channelId;
        public long endMuteTime;
        public String icon;
        public boolean isOpenMuteTime;
        public boolean isSound;
        public boolean isVibrate;
        public boolean popNotify;
        public String sound;
        public long startMuteTime;
    }

    public static class NotifyResult extends Pair<Integer, Intent> {
        public static final int ERROR_ARGUMENT_ILLEGAL = 5;
        public static final int ERROR_INNER = 1;
        public static final int ERROR_INNER_IGNORE = 2;
        public static final int ERROR_NOTIFICATION_CLOSE = 4;
        public static final int ERROR_USER_LOGOUT = 3;
        public static final int NONE = -1;
        public static final int SUCCESS_SHOW = 0;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultType {
        }

        private NotifyResult(Integer num, Intent intent) {
            super(num, intent);
        }

        public static NotifyResult create(int i, Intent intent) {
            return new NotifyResult(Integer.valueOf(i), intent);
        }
    }

    public static void cancelNotify(String str) {
        try {
            f5800nm.cancel(str, 0);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap getIconBitmap(Context context, MoNotify moNotify) {
        return Res.getAppIcon(context, moNotify.toPkg);
    }

    public static String removeEmoji(String str) {
        if (str == null) {
            return "";
        }
        if (emojiPattern == null) {
            emojiPattern = Pattern.compile("([\ue000-\ue5ff])");
        }
        return emojiPattern.matcher(str.trim()).replaceAll("");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0084, please report this as an issue */
    private static NotifyResult sendNotify(Context context, Bitmap bitmap, int i, String str, String str2, String str3, String str4, boolean z, Intent intent, NotifyConfig notifyConfig) {
        PendingIntent activity;
        if (f5800nm == null) {
            f5800nm = (NotificationManager) context.getSystemService("notification");
        }
        NotificationBuilder notificationBuilder = new NotificationBuilder(context);
        if (notifyConfig.isSound || notifyConfig.isVibrate) {
            if (preNotifyTime == 0 || Math.abs(System.currentTimeMillis() - preNotifyTime) >= 2000) {
                cancelNotify(str4);
                preNotifyTime = System.currentTimeMillis();
                if (notifyConfig.isOpenMuteTime) {
                    long j = notifyConfig.startMuteTime;
                    long j2 = notifyConfig.endMuteTime;
                    int i2 = Calendar.getInstance().get(11);
                    if (j < j2) {
                        long j3 = i2;
                        if (j3 < j || j3 >= j2) {
                            if (!notifyConfig.isSound) {
                                notificationBuilder.setSound(null, null);
                            } else if (TextUtils.isEmpty(notifyConfig.sound)) {
                                notificationBuilder.setSound(RingtoneManager.getDefaultUri(2), null);
                            } else {
                                notificationBuilder.setSound(Uri.parse("android.resource://" + context.getPackageName() + "/" + Res.raw(context, notifyConfig.sound)), null);
                            }
                            if (notifyConfig.isVibrate) {
                                notificationBuilder.setVibrate(new long[]{50, 100});
                            }
                            notificationBuilder.setLights(-16776961, 500, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                        }
                    } else {
                        long j4 = i2;
                        if ((j4 < j || i2 >= 24) && (i2 < 0 || j4 >= j2)) {
                            if (!notifyConfig.isSound) {
                                notificationBuilder.setSound(null, null);
                            } else if (TextUtils.isEmpty(notifyConfig.sound)) {
                                notificationBuilder.setSound(Uri.parse("android.resource://" + context.getPackageName() + "/" + Res.raw(context, notifyConfig.sound)), null);
                            } else {
                                notificationBuilder.setSound(RingtoneManager.getDefaultUri(2), null);
                            }
                            if (notifyConfig.isVibrate) {
                                notificationBuilder.setVibrate(new long[]{50, 100});
                            }
                            notificationBuilder.setLights(-16776961, 500, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                        }
                    }
                } else {
                    if (!notifyConfig.isSound) {
                        notificationBuilder.setSound(null, null);
                    } else if (TextUtils.isEmpty(notifyConfig.sound)) {
                        notificationBuilder.setSound(Uri.parse("android.resource://" + context.getPackageName() + "/" + Res.raw(context, notifyConfig.sound)), null);
                    } else {
                        notificationBuilder.setSound(RingtoneManager.getDefaultUri(2), null);
                    }
                    if (notifyConfig.isVibrate) {
                        notificationBuilder.setVibrate(new long[]{50, 100});
                    }
                    notificationBuilder.setLights(-16776961, 500, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                }
            } else {
                notificationBuilder.setSound(null, null);
            }
        }
        if (str != null) {
            notificationBuilder.setTicker(removeEmoji(str));
        }
        String strRemoveEmoji = str3 != null ? removeEmoji(str3) : str3;
        if (i < 1) {
            i = android.R.drawable.stat_notify_chat;
        }
        notificationBuilder.setPopNotify(notifyConfig.popNotify);
        notificationBuilder.setContentTitle(str2);
        notificationBuilder.setContentText(strRemoveEmoji);
        notificationBuilder.setIcon(i);
        notificationBuilder.setAutoCancel(notifyConfig.autoCancel);
        notificationBuilder.setLargeIcon(bitmap);
        notificationBuilder.setChannelId(notifyConfig.channelId);
        if (Build.VERSION.SDK_INT < 34 || PhotonPushManager.getInstance().isForeGround()) {
            int i3 = requestCode;
            requestCode = i3 + 1;
            activity = PendingIntent.getActivity(context, i3, intent, 201326592);
        } else {
            try {
                ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                int i4 = requestCode;
                requestCode = i4 + 1;
                activity = PendingIntent.getActivity(context, i4, intent, 201326592, activityOptionsMakeBasic.toBundle());
            } catch (Exception unused) {
                int i5 = requestCode;
                requestCode = i5 + 1;
                activity = PendingIntent.getActivity(context, i5, intent, 201326592);
            }
        }
        notificationBuilder.setContentIntent(activity);
        Notification notification = notificationBuilder.getNotification();
        if (notification == null) {
            return NotifyResult.create(1, intent);
        }
        if (z) {
            notification.flags = 32;
        }
        try {
            ii5.m136338h(f5800nm, str4, 0, notification);
            return NotifyResult.create(0, intent);
        } catch (Throwable th) {
            th.printStackTrace();
            return NotifyResult.create(1, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendNotifyAndStatistics(Context context, Bitmap bitmap, int i, String str, String str2, String str3, Intent intent, NotifyConfig notifyConfig, long j, Map<String, String> map) {
        NotifyResult notifyResultSendNotify = sendNotify(context, bitmap, i, str2, str, str2, str3, false, intent, notifyConfig);
        EventLogBody.Builder builder = new EventLogBody.Builder();
        MoNotify moNotify = (MoNotify) intent.getSerializableExtra(ChannelConstant.Keys.KEY_PUSH_DATA);
        builder.pushSource(DataProcessor.getPushSource(moNotify)).uploadType(moNotify.logType).time(j).data(map);
        if (!nr40.m160709e(AppContext.getContext()).m160712a()) {
            builder.type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(6);
        } else if (((Integer) ((Pair) notifyResultSendNotify).first).intValue() == 0) {
            builder.type(EventLogBody.TYPE_SHOWN);
        } else {
            builder.type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(((Integer) ((Pair) notifyResultSendNotify).first).intValue());
        }
        PushEventStatistic.logPushEventInfo(builder.build());
    }

    public static void sendNotify(final Context context, final MoNotify moNotify) {
        final Intent intent = new Intent(context, (Class<?>) NotifyClickReceiver.class);
        intent.putExtra(ChannelConstant.Keys.KEY_PUSH_DATA, moNotify);
        intent.putExtra(ChannelConstant.Keys.KEY_PUSH_JSON_DATA, moNotify == null ? null : moNotify.toJson());
        final NotifyConfig notifyConfig = new NotifyConfig();
        notifyConfig.isSound = moNotify.sound == 1;
        notifyConfig.sound = moNotify.soundType;
        notifyConfig.isVibrate = moNotify.vibrate > 0;
        notifyConfig.isOpenMuteTime = false;
        notifyConfig.autoCancel = moNotify.autoCancel;
        notifyConfig.popNotify = moNotify.popNotify;
        notifyConfig.channelId = moNotify.channelId;
        if (TextUtils.isEmpty(moNotify.icon)) {
            sendNotifyAndStatistics(context, getIconBitmap(context, moNotify), PhotonPushManager.messageReceiver.getSmallIcon(moNotify.type), moNotify.title, moNotify.desc, moNotify.type, intent, notifyConfig, moNotify.time, moNotify.data);
            return;
        }
        if (!moNotify.icon.startsWith("http://") && !moNotify.icon.startsWith("https://")) {
            sendNotifyAndStatistics(context, BitmapFactory.decodeResource(context.getResources(), Res.drawable(context, moNotify.icon)), PhotonPushManager.messageReceiver.getSmallIcon(moNotify.type), moNotify.title, moNotify.desc, moNotify.type, intent, notifyConfig, moNotify.time, moNotify.data);
            return;
        }
        if (handler == null) {
            HandlerThread handlerThread2 = new HandlerThread("mmpush_notify_proc");
            handlerThread = handlerThread2;
            handlerThread2.start();
            handler = new Handler(handlerThread.getLooper());
        }
        handler.post(new Runnable() { // from class: com.cosmos.photon.push.NotifyHelper.1
            @Override // java.lang.Runnable
            public void run() {
                Future futureSubmit;
                Bitmap iconBitmap = null;
                try {
                    try {
                        futureSubmit = ThreadUtils.submit(new Callable<Bitmap>() { // from class: com.cosmos.photon.push.NotifyHelper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // java.util.concurrent.Callable
                            public Bitmap call() {
                                try {
                                    return PhotonPushManager.messageReceiver.getLargeIcon(moNotify.icon);
                                } catch (Throwable th) {
                                    MDLog.printErrStackTrace(LogTag.NOTIFY, th);
                                    return null;
                                }
                            }
                        });
                    } catch (Exception e) {
                        MDLog.printErrStackTrace(LogTag.IMAGE, e);
                        futureSubmit = null;
                    }
                    try {
                        iconBitmap = (Bitmap) futureSubmit.get(10L, TimeUnit.SECONDS);
                    } catch (InterruptedException e2) {
                        MDLog.printErrStackTrace(LogTag.NOTIFY, e2);
                    } catch (ExecutionException e3) {
                        MDLog.printErrStackTrace(LogTag.NOTIFY, e3);
                    } catch (TimeoutException e4) {
                        MDLog.printErrStackTrace(LogTag.NOTIFY, e4);
                    }
                } catch (Throwable th) {
                    MDLog.printErrStackTrace(LogTag.IMAGE, th);
                }
                if (iconBitmap == null) {
                    iconBitmap = NotifyHelper.getIconBitmap(context, moNotify);
                }
                Context context2 = context;
                int smallIcon = PhotonPushManager.messageReceiver.getSmallIcon(moNotify.type);
                MoNotify moNotify2 = moNotify;
                NotifyHelper.sendNotifyAndStatistics(context2, iconBitmap, smallIcon, moNotify2.title, moNotify2.desc, moNotify2.type, intent, notifyConfig, moNotify2.time, moNotify2.data);
            }
        });
    }
}

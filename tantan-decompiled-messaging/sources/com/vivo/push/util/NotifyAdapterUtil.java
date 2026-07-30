package com.vivo.push.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.vivo.push.C14608e;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p111b.C14550p;
import com.vivo.push.p112c.C14565d;
import com.vivo.push.p113d.C14599r;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p149l.ii5;
import p149l.iw3;
import p149l.up40;
import p149l.xp40;

/* JADX INFO: loaded from: classes2.dex */
public class NotifyAdapterUtil {
    private static final int HIDE_TITLE = 1;
    public static final int NOTIFY_MULTITERM_STYLE = 1;
    public static final int NOTIFY_SINGLE_STYLE = 0;
    public static final String PRIMARY_CHANNEL = "vivo_push_channel";
    private static final String PUSH_EN = "PUSH";
    private static final String PUSH_ID = "pushId";
    private static final String PUSH_ZH = "推送通知";
    private static final String TAG = "NotifyManager";
    private static NotificationManager sNotificationManager = null;
    private static int sNotifyId = 20000000;

    private static boolean cancelNotify(Context context, int i) {
        initAdapter(context);
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager == null) {
            return false;
        }
        notificationManager.cancel(i);
        return true;
    }

    private static synchronized void initAdapter(Context context) {
        NotificationManager notificationManager;
        try {
            if (sNotificationManager == null) {
                sNotificationManager = (NotificationManager) context.getSystemService("notification");
            }
            if (Build.VERSION.SDK_INT >= 26 && (notificationManager = sNotificationManager) != null) {
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("default");
                if (notificationChannel != null) {
                    CharSequence name = notificationChannel.getName();
                    if (PUSH_ZH.equals(name) || PUSH_EN.equals(name)) {
                        sNotificationManager.deleteNotificationChannel("default");
                    }
                }
                String str = isZh(context) ? PUSH_ZH : PUSH_EN;
                iw3.m138716a();
                NotificationChannel notificationChannelM194605a = up40.m194605a(PRIMARY_CHANNEL, str, 4);
                notificationChannelM194605a.setLightColor(-16711936);
                notificationChannelM194605a.enableVibration(true);
                notificationChannelM194605a.setLockscreenVisibility(1);
                sNotificationManager.createNotificationChannel(notificationChannelM194605a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static boolean isZh(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }

    public static void pushNotification(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, int i, C14599r.a aVar) {
        C14647p.m85021d(TAG, "pushNotification");
        initAdapter(context);
        int notifyMode = NotifyUtil.getNotifyDataAdapter(context).getNotifyMode(insideNotificationItem);
        if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl()) && list != null && list.size() > 1 && list.get(1) != null) {
            notifyMode = 1;
        }
        if (notifyMode == 2) {
            pushNotificationBySystem(context, list, insideNotificationItem, j, i, aVar);
        } else if (notifyMode == 1) {
            pushNotificationByCustom(context, list, insideNotificationItem, j, aVar);
        }
    }

    private static void pushNotificationByCustom(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, C14599r.a aVar) {
        Notification notificationBuild;
        int i;
        Bitmap bitmap;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        int i2 = context.getApplicationInfo().icon;
        Bundle bundle = new Bundle();
        bundle.putLong(PUSH_ID, j);
        if (Build.VERSION.SDK_INT >= 26) {
            Notification.Builder builderM210460a = xp40.m210460a(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
            }
            builderM210460a.setExtras(bundle);
            notificationBuild = builderM210460a.build();
        } else {
            Notification.Builder builder = new Notification.Builder(context);
            builder.setExtras(bundle);
            notificationBuild = builder.build();
        }
        notificationBuild.priority = 2;
        notificationBuild.flags = 16;
        notificationBuild.tickerText = title;
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i2;
        }
        notificationBuild.icon = defaultSmallIconId;
        RemoteViews remoteViews = new RemoteViews(packageName, NotifyUtil.getNotifyLayoutAdapter(context).getNotificationLayout());
        remoteViews.setTextViewText(resources.getIdentifier("notify_title", "id", packageName), title);
        remoteViews.setTextColor(resources.getIdentifier("notify_title", "id", packageName), NotifyUtil.getNotifyLayoutAdapter(context).getTitleColor());
        remoteViews.setTextViewText(resources.getIdentifier("notify_msg", "id", packageName), insideNotificationItem.getContent());
        if (insideNotificationItem.isShowTime()) {
            remoteViews.setTextViewText(resources.getIdentifier("notify_when", "id", packageName), new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date()));
            i = 0;
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 0);
        } else {
            i = 0;
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 8);
        }
        int suitIconId = NotifyUtil.getNotifyLayoutAdapter(context).getSuitIconId();
        remoteViews.setViewVisibility(suitIconId, i);
        if (list == null || list.isEmpty() || (bitmap = list.get(i)) == null) {
            if (defaultNotifyIcon <= 0) {
                defaultNotifyIcon = i2;
            }
            remoteViews.setImageViewResource(suitIconId, defaultNotifyIcon);
        } else {
            remoteViews.setImageViewBitmap(suitIconId, bitmap);
        }
        Bitmap bitmap2 = (list == null || list.size() <= 1) ? null : list.get(1);
        if (bitmap2 == null) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
        } else if (TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_cover", "id", packageName), bitmap2);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_content", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_pure_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_pure_cover", "id", packageName), bitmap2);
        }
        notificationBuild.contentView = remoteViews;
        if (TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            notificationBuild.bigContentView = remoteViews;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int ringerMode = audioManager.getRingerMode();
        int vibrateSetting = audioManager.getVibrateSetting(0);
        C14647p.m85021d(TAG, "ringMode=" + ringerMode + " callVibrateSetting=" + vibrateSetting);
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        notificationBuild.defaults = 1;
                    }
                    if (vibrateSetting == 1) {
                        notificationBuild.defaults |= 2;
                        notificationBuild.vibrate = new long[]{0, 100, 200, 300};
                    }
                }
            } else if (vibrateSetting == 1) {
                notificationBuild.defaults = 2;
                notificationBuild.vibrate = new long[]{0, 100, 200, 300};
            }
        } else if (ringerMode == 2) {
            notificationBuild.defaults = 1;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            intent.putExtra("security_avoid_pull", C14632a.m84952a(context).m84955a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_pull_rsa", C14565d.m84793a(context).m84794a().mo84790a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_rsa_public_key", C14652u.m85042a(C14565d.m84793a(context).m84794a().mo84791a()));
        } catch (Exception e) {
            C14647p.m85008a(TAG, "pushNotificationByCustom encrypt ：" + e.getMessage());
        }
        new C14550p(packageName, j, insideNotificationItem).m84934b(intent);
        notificationBuild.contentIntent = PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, 268435456);
        if (sNotificationManager != null) {
            int iM84901k = C14608e.m84861a().m84901k();
            try {
                if (iM84901k == 0) {
                    ii5.m136337g(sNotificationManager, sNotifyId, notificationBuild);
                    if (aVar != null) {
                        aVar.mo84849a();
                    }
                } else if (iM84901k == 1) {
                    ii5.m136337g(sNotificationManager, (int) j, notificationBuild);
                    if (aVar != null) {
                        aVar.mo84849a();
                    }
                } else {
                    C14647p.m85008a(TAG, "unknow notify style ".concat(String.valueOf(iM84901k)));
                }
            } catch (Exception e2) {
                C14647p.m85010a(TAG, e2);
                if (aVar != null) {
                    aVar.mo84850b();
                }
            }
        }
    }

    private static void pushNotificationBySystem(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, int i, C14599r.a aVar) {
        Bitmap bitmapM84970a;
        Notification.Builder builder;
        Bitmap bitmapDecodeResource;
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        String content = insideNotificationItem.getContent();
        int i2 = context.getApplicationInfo().icon;
        boolean zIsShowTime = insideNotificationItem.isShowTime();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        if (list == null || list.isEmpty()) {
            bitmapM84970a = null;
        } else {
            bitmapM84970a = list.get(0);
            if (bitmapM84970a != null && defaultNotifyIcon > 0 && (bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), defaultNotifyIcon)) != null) {
                int width = bitmapDecodeResource.getWidth();
                int height = bitmapDecodeResource.getHeight();
                bitmapDecodeResource.recycle();
                bitmapM84970a = C14634c.m84970a(bitmapM84970a, width, height);
            }
        }
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            builder = xp40.m210460a(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
            }
            if (bitmapM84970a != null) {
                builder.setLargeIcon(bitmapM84970a);
            }
        } else {
            builder = new Notification.Builder(context);
            if (bitmapM84970a != null) {
                builder.setLargeIcon(bitmapM84970a);
            }
        }
        bundle.putLong(PUSH_ID, j);
        builder.setExtras(bundle);
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i2;
        }
        builder.setSmallIcon(defaultSmallIconId);
        if (insideNotificationItem.getCompatibleType() != 1) {
            builder.setContentTitle(title);
        }
        builder.setPriority(2);
        builder.setContentText(content);
        builder.setWhen(zIsShowTime ? System.currentTimeMillis() : 0L);
        builder.setShowWhen(zIsShowTime);
        builder.setTicker(title);
        int ringerMode = audioManager.getRingerMode();
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        builder.setDefaults(3);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    } else if (ringerMode == 1) {
                        builder.setDefaults(2);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    }
                }
            } else if (ringerMode == 2) {
                builder.setDefaults(2);
                builder.setVibrate(new long[]{0, 100, 200, 300});
            }
        } else if (ringerMode == 2) {
            builder.setDefaults(1);
        }
        Bitmap bitmap = (list == null || list.size() <= 1) ? null : list.get(1);
        if (i != 1) {
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(title);
            bigTextStyle.bigText(content);
            builder.setStyle(bigTextStyle);
        }
        if (bitmap != null) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setBigContentTitle(title);
            bigPictureStyle.setSummaryText(content);
            bigPictureStyle.bigPicture(bitmap);
            builder.setStyle(bigPictureStyle);
        }
        builder.setAutoCancel(true);
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            intent.putExtra("security_avoid_pull", C14632a.m84952a(context).m84955a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_pull_rsa", C14565d.m84793a(context).m84794a().mo84790a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_rsa_public_key", C14652u.m85042a(C14565d.m84793a(context).m84794a().mo84791a()));
        } catch (Exception e) {
            C14647p.m85008a(TAG, "pushNotificationBySystem encrypt ：" + e.getMessage());
        }
        new C14550p(packageName, j, insideNotificationItem).m84934b(intent);
        builder.setContentIntent(PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, 268435456));
        Notification notificationBuild = builder.build();
        int iM84901k = C14608e.m84861a().m84901k();
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager != null) {
            try {
                if (iM84901k == 0) {
                    ii5.m136337g(notificationManager, sNotifyId, notificationBuild);
                    if (aVar != null) {
                        aVar.mo84849a();
                    }
                } else if (iM84901k == 1) {
                    ii5.m136337g(notificationManager, (int) j, notificationBuild);
                    if (aVar != null) {
                        aVar.mo84849a();
                    }
                } else {
                    C14647p.m85008a(TAG, "unknow notify style ".concat(String.valueOf(iM84901k)));
                }
            } catch (Exception e2) {
                C14647p.m85010a(TAG, e2);
                if (aVar != null) {
                    aVar.mo84850b();
                }
            }
        }
    }

    public static boolean repealNotifyById(Context context, long j) {
        int iM84901k = C14608e.m84861a().m84901k();
        if (iM84901k != 0) {
            if (iM84901k == 1) {
                return cancelNotify(context, (int) j);
            }
            C14647p.m85008a(TAG, "unknow cancle notify style ".concat(String.valueOf(iM84901k)));
            return false;
        }
        long jM84967b = C14654w.m85045b().m84967b("com.vivo.push.notify_key", -1L);
        if (jM84967b == j) {
            C14647p.m85021d(TAG, "undo showed message ".concat(String.valueOf(j)));
            C14647p.m85012a(context, "回收已展示的通知： ".concat(String.valueOf(j)));
            return cancelNotify(context, sNotifyId);
        }
        C14647p.m85021d(TAG, "current showing message id " + jM84967b + " not match " + j);
        C14647p.m85012a(context, "与已展示的通知" + jM84967b + "与待回收的通知" + j + "不匹配");
        return false;
    }

    public static void setNotifyId(int i) {
        sNotifyId = i;
    }

    public static void cancelNotify(Context context) {
        cancelNotify(context, sNotifyId);
    }
}

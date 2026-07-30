package com.cosmos.photon.push.notification;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.cosmos.photon.push.PhotonPushManager;
import p149l.xp40;
import p149l.yp40;

/* JADX INFO: loaded from: classes.dex */
public class NotificationBuilder {
    private static final int DEFAULT_NONE = -55;
    private Notification.Builder builder;
    private String channelId;
    private int mAudioStreamType;
    private PendingIntent mContentIntent;
    private CharSequence mContentText;
    private CharSequence mContentTitle;
    private Context mContext;
    private int mFlags;
    private int mIcon;
    private Bitmap mLargeIcon;
    private int mLedArgb;
    private int mLedOffMs;
    private int mLedOnMs;
    private Uri mSound;
    private String mSoundStr;
    private CharSequence mTickerText;
    private long[] mVibrate;
    private boolean popNotify;
    private int mNumber = -1;
    private int mDefaults = DEFAULT_NONE;
    private long mWhen = System.currentTimeMillis();

    public NotificationBuilder(Context context) {
        this.mContext = context;
    }

    private NotificationBuilder setFlag(int i, boolean z) {
        int i2 = this.mFlags;
        if (z) {
            this.mFlags = i | i2;
            return this;
        }
        this.mFlags = (~i) & i2;
        return this;
    }

    @SuppressLint({"NewApi"})
    public Notification getNotification() {
        if (this.builder == null) {
            if (!PhotonPushManager.CHANNEL_MODE || Build.VERSION.SDK_INT < 26) {
                this.builder = new Notification.Builder(this.mContext);
            } else {
                yp40.m215577a();
                this.builder = xp40.m210460a(this.mContext, this.channelId);
            }
        }
        this.builder.setWhen(this.mWhen);
        this.builder.setNumber(this.mNumber);
        this.builder.setContentIntent(this.mContentIntent);
        this.builder.setPriority(this.popNotify ? 2 : 0);
        this.builder.setTicker(this.mTickerText);
        this.builder.setLargeIcon(this.mLargeIcon);
        this.builder.setSound(this.mSound);
        this.builder.setVibrate(this.mVibrate);
        this.builder.setLights(this.mLedArgb, this.mLedOnMs, this.mLedOffMs);
        int i = this.mDefaults;
        if (i != DEFAULT_NONE) {
            this.builder.setDefaults(i);
        }
        this.builder.setContentTitle(this.mContentTitle);
        this.builder.setContentText(this.mContentText);
        this.builder.setSmallIcon(this.mIcon);
        Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
        bigTextStyle.bigText(this.mContentText);
        this.builder.setStyle(bigTextStyle);
        Notification notificationBuild = this.builder.build();
        int i2 = this.mFlags;
        notificationBuild.flags = i2;
        if (this.mLedOnMs != 0 && this.mLedOffMs != 0) {
            notificationBuild.flags = i2 | 1;
        }
        if ((this.mDefaults & 4) != 0) {
            notificationBuild.flags |= 1;
        }
        return notificationBuild;
    }

    public NotificationBuilder setAutoCancel(boolean z) {
        setFlag(16, z);
        return this;
    }

    public NotificationBuilder setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public void setContentIntent(PendingIntent pendingIntent) {
        this.mContentIntent = pendingIntent;
    }

    public NotificationBuilder setContentText(CharSequence charSequence) {
        this.mContentText = charSequence;
        return this;
    }

    public NotificationBuilder setContentTitle(CharSequence charSequence) {
        this.mContentTitle = charSequence;
        return this;
    }

    public NotificationBuilder setDefaults(int i) {
        this.mDefaults = i;
        return this;
    }

    public void setIcon(int i) {
        this.mIcon = i;
    }

    public NotificationBuilder setLargeIcon(Bitmap bitmap) {
        this.mLargeIcon = bitmap;
        return this;
    }

    public NotificationBuilder setLights(int i, int i2, int i3) {
        this.mLedArgb = i;
        this.mLedOnMs = i2;
        this.mLedOffMs = i3;
        return this;
    }

    public NotificationBuilder setNumber(int i) {
        this.mNumber = i;
        return this;
    }

    public NotificationBuilder setPopNotify(boolean z) {
        this.popNotify = z;
        return this;
    }

    public void setRuning(boolean z) {
        setFlag(2, z);
    }

    public NotificationBuilder setSound(Uri uri, String str) {
        this.mSound = uri;
        this.mSoundStr = str;
        return this;
    }

    public NotificationBuilder setTicker(CharSequence charSequence) {
        this.mTickerText = charSequence;
        return this;
    }

    public NotificationBuilder setVibrate(long[] jArr) {
        this.mVibrate = jArr;
        return this;
    }

    public NotificationBuilder setWhen(long j) {
        this.mWhen = j;
        return this;
    }
}

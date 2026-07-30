package com.cosmos.photon.push;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import com.cosmos.photon.push.image.ImageLoader;
import com.cosmos.photon.push.msg.MoMessage;
import com.cosmos.photon.push.notification.MoNotify;
import com.cosmos.photon.push.util.AppContext;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class PushMessageReceiver {
    private ImageLoader imageLoader;

    public Bitmap getLargeIcon(String str) {
        if (this.imageLoader == null) {
            File file = new File(AppContext.getContext().getCacheDir(), "mmpush_disk_cache");
            if (!file.exists()) {
                file.mkdirs();
            }
            this.imageLoader = new ImageLoader.Builder().diskCacheDirectory(file).maxDiskSize(134217728L).maxMemSize(1843200L).build();
            AppContext.getContext().registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.cosmos.photon.push.PushMessageReceiver.1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
                    if (i >= 40) {
                        PushMessageReceiver.this.imageLoader.clearMemCache();
                    }
                }
            });
        }
        return this.imageLoader.syncLoadBitmap(str, 96, 96);
    }

    public int getSmallIcon(String str) {
        return android.R.drawable.stat_notify_chat;
    }

    public abstract boolean isFcmOpen();

    public abstract boolean isHonorPushOpen();

    public abstract boolean isHuaweiPushOpen();

    public abstract boolean isMeizuPushOpen();

    public abstract boolean isMiPushOpen();

    public abstract boolean isOppoPushOpen();

    public abstract boolean isVivoPushOpen();

    public abstract void onCommand(int i, int i2, String str);

    public void onGetTokenResult(boolean z, String str) {
    }

    public boolean onNotificationMessageClicked(MoNotify moNotify) {
        return false;
    }

    public boolean onNotificationShow(MoNotify moNotify) {
        return moNotify.backgroundShow > 0 && PhotonPushManager.getInstance().isForeGround();
    }

    public void onReceivePassThroughMessage(MoMessage moMessage) {
    }

    @Deprecated
    public void onThirdPushRegisterResult(int i, int i2, String str) {
    }

    public abstract void onToken(int i, String str, String str2);
}

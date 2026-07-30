package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1295a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.pushnotification.INotificationRenderer;
import com.clevertap.android.sdk.pushnotification.LaunchPendingIntentFactory;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class w2a implements INotificationRenderer, s81 {

    /* JADX INFO: renamed from: a */
    private String f184118a;

    /* JADX INFO: renamed from: b */
    private String f184119b;

    /* JADX INFO: renamed from: c */
    private int f184120c;

    /* JADX INFO: renamed from: c */
    private void m201081c(NotificationCompat.Style style, Bundle bundle, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !(style instanceof NotificationCompat.BigPictureStyle)) {
            return;
        }
        ((NotificationCompat.BigPictureStyle) style).setContentDescription(bundle.getString(Constants.WZRK_BIG_PICTURE_ALT_TEXT_KEY, context.getString(R$string.f4829g)));
    }

    @SuppressLint({"NotificationTrampoline"})
    /* JADX INFO: renamed from: d */
    private NotificationCompat.Builder m201082d(NotificationCompat.Builder builder, Bundle bundle, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, NotificationCompat.Style style) {
        if (Build.VERSION.SDK_INT >= 26 && bundle.containsKey(Constants.WZRK_SUBTITLE)) {
            builder.setSubText(bundle.getString(Constants.WZRK_SUBTITLE));
        }
        if (bundle.containsKey(Constants.WZRK_COLOR)) {
            builder.setColor(Color.parseColor(bundle.getString(Constants.WZRK_COLOR)));
            builder.setColorized(true);
        }
        String string = bundle.getString(Constants.WZRK_DISMISS);
        if (string != null) {
            try {
                builder.setTimeoutAfter(Long.parseLong(string) * 1000);
            } catch (NumberFormatException e) {
                cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Failed to parse timeout dismiss value", e);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            builder.setOngoing("true".equalsIgnoreCase(bundle.getString(Constants.WZRK_STICKY)));
        }
        builder.setContentTitle(this.f184119b).setContentText(this.f184118a).setContentIntent(LaunchPendingIntentFactory.getLaunchPendingIntent(bundle, context)).setAutoCancel(true).setStyle(style).setSmallIcon(this.f184120c);
        String string2 = bundle.getString(Constants.NOTIF_ICON);
        if (!"true".equalsIgnoreCase(bundle.getString(Constants.NOTIF_HIDE_APP_LARGE_ICON))) {
            builder.setLargeIcon(Utils.m5919p(string2, true, context, cleverTapInstanceConfig, 2000L).getBitmap());
        }
        return builder;
    }

    /* JADX INFO: renamed from: e */
    private NotificationCompat.Style m201083e(Bundle bundle, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Uri uriM201084f;
        String string = bundle.getString(Constants.WZRK_BIG_PICTURE);
        String string2 = bundle.getString(Constants.WZRK_GIF);
        String string3 = bundle.getString(Constants.WZRK_MSG_SUMMARY, this.f184118a);
        try {
            if (Build.VERSION.SDK_INT >= 34 && string2 != null && string2.startsWith("http") && (uriM201084f = m201084f(string2, context, cleverTapInstanceConfig)) != null) {
                NotificationCompat.BigPictureStyle bigPictureStyleBigPicture = new NotificationCompat.BigPictureStyle().setSummaryText(string3).bigPicture(Icon.createWithContentUri(uriM201084f));
                m201081c(bigPictureStyleBigPicture, bundle, context);
                bundle.putString(Constants.WZRK_BPDS, DownloadedBitmap.Status.GIF_SUCCESS.getStatusValue());
                return bigPictureStyleBigPicture;
            }
        } catch (Exception e) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Failed to load GIF, falling back to static big-picture", e);
        }
        DownloadedBitmap downloadedBitmapM201085g = m201085g(string, context, cleverTapInstanceConfig);
        bundle.putString(Constants.WZRK_BPDS, downloadedBitmapM201085g.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().getStatusValue());
        if (downloadedBitmapM201085g.getFailureReason() != null) {
            bundle.putString(Constants.WZRK_BPDS_REASON, downloadedBitmapM201085g.getFailureReason());
        }
        try {
            Bitmap bitmap = downloadedBitmapM201085g.getBitmap();
            if (bitmap != null) {
                NotificationCompat.BigPictureStyle bigPictureStyleBigPicture2 = new NotificationCompat.BigPictureStyle().setSummaryText(string3).bigPicture(bitmap);
                m201081c(bigPictureStyleBigPicture2, bundle, context);
                return bigPictureStyleBigPicture2;
            }
        } catch (Exception e2) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Failed to load Big Picture, falling back to text notification", e2);
        }
        return new NotificationCompat.BigTextStyle().bigText(this.f184118a);
    }

    @RequiresApi(34)
    /* JADX INFO: renamed from: f */
    private Uri m201084f(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        return Utils.m5920q(str, context, cleverTapInstanceConfig, n95.f137721a);
    }

    /* JADX INFO: renamed from: g */
    private DownloadedBitmap m201085g(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (str == null || !str.startsWith("http")) {
            return C1295a.INSTANCE.m6814a(DownloadedBitmap.Status.NO_IMAGE);
        }
        DownloadedBitmap downloadedBitmapM6814a = C1295a.INSTANCE.m6814a(DownloadedBitmap.Status.INIT_ERROR);
        try {
            downloadedBitmapM6814a = Utils.m5919p(str, false, context, cleverTapInstanceConfig, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            if (downloadedBitmapM6814a.getBitmap() == null) {
                return downloadedBitmapM6814a;
            }
            long downloadTime = downloadedBitmapM6814a.getDownloadTime();
            cleverTapInstanceConfig.getLogger().verbose("Fetched big picture in " + downloadTime + " millis");
            return downloadedBitmapM6814a;
        } catch (Throwable th) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Falling back to big text notification, couldn't fetch big picture", th);
            return downloadedBitmapM6814a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    @Override // p149l.s81
    /* JADX INFO: renamed from: a */
    public NotificationCompat.Builder mo182553a(Context context, Bundle bundle, NotificationCompat.Builder builder, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Uri defaultUri;
        try {
            if (bundle.containsKey(Constants.WZRK_SOUND)) {
                Object obj = bundle.get(Constants.WZRK_SOUND);
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                } else if (obj instanceof String) {
                    String strSubstring = (String) obj;
                    if (strSubstring.equals("true")) {
                        defaultUri = RingtoneManager.getDefaultUri(2);
                    } else if (strSubstring.isEmpty()) {
                        defaultUri = null;
                    } else {
                        if (strSubstring.contains(".mp3") || strSubstring.contains(".ogg") || strSubstring.contains(".wav")) {
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 4);
                        }
                        defaultUri = Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + strSubstring);
                    }
                } else {
                    defaultUri = null;
                }
                if (defaultUri != null) {
                    builder.setSound(defaultUri);
                }
            }
            return builder;
        } catch (Throwable th) {
            cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Could not process sound parameter", th);
            return builder;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m201086b(Bundle bundle, Context context, NotificationCompat.Builder builder, CleverTapInstanceConfig cleverTapInstanceConfig, int i) {
        String string = bundle.getString(Constants.WZRK_ACTIONS);
        if (string != null) {
            try {
                setActionButtons(context, bundle, i, builder, new JSONArray(string));
            } catch (Throwable th) {
                cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "error parsing notification actions: " + th.getLocalizedMessage());
            }
        }
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public String getActionButtonIconKey() {
        return Constants.NOTIF_ICON;
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    @Nullable
    public Object getCollapseKey(Bundle bundle) {
        return bundle.get(Constants.WZRK_COLLAPSE);
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public String getMessage(Bundle bundle) {
        String string = bundle.getString(Constants.NOTIF_MSG);
        this.f184118a = string;
        return string;
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public String getTitle(Bundle bundle, Context context) {
        String string = bundle.getString(Constants.NOTIF_TITLE, "");
        if (string.isEmpty()) {
            string = context.getApplicationInfo().name;
        }
        this.f184119b = string;
        return string;
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public NotificationCompat.Builder renderNotification(Bundle bundle, Context context, NotificationCompat.Builder builder, CleverTapInstanceConfig cleverTapInstanceConfig, int i) {
        NotificationCompat.Style styleM201083e = m201083e(bundle, context, cleverTapInstanceConfig);
        m201086b(bundle, context, builder, cleverTapInstanceConfig, i);
        return m201082d(builder, bundle, context, cleverTapInstanceConfig, styleM201083e);
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public void setSmallIcon(int i, Context context) {
        this.f184120c = i;
    }
}

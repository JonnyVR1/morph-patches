package p153l;

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
import com.clevertap.android.sdk.network.C1318a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.pushnotification.INotificationRenderer;
import com.clevertap.android.sdk.pushnotification.LaunchPendingIntentFactory;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class h4a implements INotificationRenderer, z81 {

    /* JADX INFO: renamed from: a */
    private String f107771a;

    /* JADX INFO: renamed from: b */
    private String f107772b;

    /* JADX INFO: renamed from: c */
    private int f107773c;

    /* JADX INFO: renamed from: c */
    private void m133546c(NotificationCompat.Style style, Bundle bundle, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !(style instanceof NotificationCompat.BigPictureStyle)) {
            return;
        }
        ((NotificationCompat.BigPictureStyle) style).setContentDescription(bundle.getString(Constants.WZRK_BIG_PICTURE_ALT_TEXT_KEY, context.getString(R$string.f4866g)));
    }

    @SuppressLint({"NotificationTrampoline"})
    /* JADX INFO: renamed from: d */
    private NotificationCompat.Builder m133547d(NotificationCompat.Builder builder, Bundle bundle, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, NotificationCompat.Style style) {
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
        builder.setContentTitle(this.f107772b).setContentText(this.f107771a).setContentIntent(LaunchPendingIntentFactory.getLaunchPendingIntent(bundle, context)).setAutoCancel(true).setStyle(style).setSmallIcon(this.f107773c);
        String string2 = bundle.getString(Constants.NOTIF_ICON);
        if (!"true".equalsIgnoreCase(bundle.getString(Constants.NOTIF_HIDE_APP_LARGE_ICON))) {
            builder.setLargeIcon(Utils.m5973p(string2, true, context, cleverTapInstanceConfig, 2000L).getBitmap());
        }
        return builder;
    }

    /* JADX INFO: renamed from: e */
    private NotificationCompat.Style m133548e(Bundle bundle, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Uri uriM133549f;
        String string = bundle.getString(Constants.WZRK_BIG_PICTURE);
        String string2 = bundle.getString(Constants.WZRK_GIF);
        String string3 = bundle.getString(Constants.WZRK_MSG_SUMMARY, this.f107771a);
        try {
            if (Build.VERSION.SDK_INT >= 34 && string2 != null && string2.startsWith("http") && (uriM133549f = m133549f(string2, context, cleverTapInstanceConfig)) != null) {
                NotificationCompat.BigPictureStyle bigPictureStyleBigPicture = new NotificationCompat.BigPictureStyle().setSummaryText(string3).bigPicture(Icon.createWithContentUri(uriM133549f));
                m133546c(bigPictureStyleBigPicture, bundle, context);
                bundle.putString(Constants.WZRK_BPDS, DownloadedBitmap.Status.GIF_SUCCESS.getStatusValue());
                return bigPictureStyleBigPicture;
            }
        } catch (Exception e) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Failed to load GIF, falling back to static big-picture", e);
        }
        DownloadedBitmap downloadedBitmapM133550g = m133550g(string, context, cleverTapInstanceConfig);
        bundle.putString(Constants.WZRK_BPDS, downloadedBitmapM133550g.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().getStatusValue());
        if (downloadedBitmapM133550g.getFailureReason() != null) {
            bundle.putString(Constants.WZRK_BPDS_REASON, downloadedBitmapM133550g.getFailureReason());
        }
        try {
            Bitmap bitmap = downloadedBitmapM133550g.getBitmap();
            if (bitmap != null) {
                NotificationCompat.BigPictureStyle bigPictureStyleBigPicture2 = new NotificationCompat.BigPictureStyle().setSummaryText(string3).bigPicture(bitmap);
                m133546c(bigPictureStyleBigPicture2, bundle, context);
                return bigPictureStyleBigPicture2;
            }
        } catch (Exception e2) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Failed to load Big Picture, falling back to text notification", e2);
        }
        return new NotificationCompat.BigTextStyle().bigText(this.f107771a);
    }

    @RequiresApi(34)
    /* JADX INFO: renamed from: f */
    private Uri m133549f(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        return Utils.m5974q(str, context, cleverTapInstanceConfig, oa5.f145660a);
    }

    /* JADX INFO: renamed from: g */
    private DownloadedBitmap m133550g(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (str == null || !str.startsWith("http")) {
            return C1318a.INSTANCE.m6868a(DownloadedBitmap.Status.NO_IMAGE);
        }
        DownloadedBitmap downloadedBitmapM6868a = C1318a.INSTANCE.m6868a(DownloadedBitmap.Status.INIT_ERROR);
        try {
            downloadedBitmapM6868a = Utils.m5973p(str, false, context, cleverTapInstanceConfig, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            if (downloadedBitmapM6868a.getBitmap() == null) {
                return downloadedBitmapM6868a;
            }
            long downloadTime = downloadedBitmapM6868a.getDownloadTime();
            cleverTapInstanceConfig.getLogger().verbose("Fetched big picture in " + downloadTime + " millis");
            return downloadedBitmapM6868a;
        } catch (Throwable th) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Falling back to big text notification, couldn't fetch big picture", th);
            return downloadedBitmapM6868a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    @Override // p153l.z81
    /* JADX INFO: renamed from: a */
    public NotificationCompat.Builder mo133551a(Context context, Bundle bundle, NotificationCompat.Builder builder, CleverTapInstanceConfig cleverTapInstanceConfig) {
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
    public void m133552b(Bundle bundle, Context context, NotificationCompat.Builder builder, CleverTapInstanceConfig cleverTapInstanceConfig, int i) {
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
        this.f107771a = string;
        return string;
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public String getTitle(Bundle bundle, Context context) {
        String string = bundle.getString(Constants.NOTIF_TITLE, "");
        if (string.isEmpty()) {
            string = context.getApplicationInfo().name;
        }
        this.f107772b = string;
        return string;
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public NotificationCompat.Builder renderNotification(Bundle bundle, Context context, NotificationCompat.Builder builder, CleverTapInstanceConfig cleverTapInstanceConfig, int i) {
        NotificationCompat.Style styleM133548e = m133548e(bundle, context, cleverTapInstanceConfig);
        m133552b(bundle, context, builder, cleverTapInstanceConfig, i);
        return m133547d(builder, bundle, context, cleverTapInstanceConfig, styleM133548e);
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public void setSmallIcon(int i, Context context) {
        this.f107773c = i;
    }
}

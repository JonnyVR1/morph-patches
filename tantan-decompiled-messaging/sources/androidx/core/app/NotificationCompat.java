package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R$string;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p149l.e16;
import p149l.e5c0;
import p149l.h2c0;
import p149l.ig3;
import p149l.iwv;
import p149l.jfd0;
import p149l.m1c0;
import p149l.p3c0;
import p149l.qkq0;
import p149l.r6c0;
import p149l.rqc0;
import p149l.v5c0;
import p149l.vye0;
import p149l.ww2;
import p149l.yq40;
import p149l.zp40;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";

    @ColorInt
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";

    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static Icon getIcon(Notification.Action action) {
            return action.getIcon();
        }
    }

    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static boolean getAllowGeneratedReplies(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static int getBadgeIconType(Notification notification) {
            return notification.getBadgeIconType();
        }

        @DoNotInline
        public static String getChannelId(Notification notification) {
            return notification.getChannelId();
        }

        @DoNotInline
        public static int getGroupAlertBehavior(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        @DoNotInline
        public static CharSequence getSettingsText(Notification notification) {
            return notification.getSettingsText();
        }

        @DoNotInline
        public static String getShortcutId(Notification notification) {
            return notification.getShortcutId();
        }

        @DoNotInline
        public static long getTimeoutAfter(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static int getSemanticAction(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        @DoNotInline
        public static Notification.BubbleMetadata getBubbleMetadata(Notification notification) {
            return notification.getBubbleMetadata();
        }

        @DoNotInline
        public static int getEditChoicesBeforeSending(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        @DoNotInline
        public static LocusId getLocusId(Notification notification) {
            return notification.getLocusId();
        }

        @DoNotInline
        public static boolean isContextual(Notification.Action action) {
            return action.isContextual();
        }
    }

    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        public static boolean isAuthenticationRequired(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface BadgeIconType {
    }

    public static class DecoratedCustomViewStyle extends Style {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static Notification.Style createDecoratedCustomViewStyle() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        private RemoteViews createRemoteViews(RemoteViews remoteViews, boolean z) {
            int iMin;
            int i = 0;
            RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(true, r6c0.f157912c, false);
            remoteViewsApplyStandardTemplate.removeAllViews(e5c0.f89373L);
            List<Action> nonContextualActions = getNonContextualActions(this.mBuilder.mActions);
            if (!z || nonContextualActions == null || (iMin = Math.min(nonContextualActions.size(), 3)) <= 0) {
                i = 8;
            } else {
                for (int i2 = 0; i2 < iMin; i2++) {
                    remoteViewsApplyStandardTemplate.addView(e5c0.f89373L, generateActionButton(nonContextualActions.get(i2)));
                }
            }
            remoteViewsApplyStandardTemplate.setViewVisibility(e5c0.f89373L, i);
            remoteViewsApplyStandardTemplate.setViewVisibility(e5c0.f89370I, i);
            buildIntoRemoteViews(remoteViewsApplyStandardTemplate, remoteViews);
            return remoteViewsApplyStandardTemplate;
        }

        private RemoteViews generateActionButton(Action action) {
            boolean z = action.actionIntent == null;
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), z ? r6c0.f157911b : r6c0.f157910a);
            IconCompat iconCompat = action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewBitmap(e5c0.f89371J, createColoredBitmap(iconCompat, m1c0.f130826c));
            }
            remoteViews.setTextViewText(e5c0.f89372K, action.title);
            if (!z) {
                remoteViews.setOnClickPendingIntent(e5c0.f89369H, action.actionIntent);
            }
            remoteViews.setContentDescription(e5c0.f89369H, action.title);
            return remoteViews;
        }

        private static List<Action> getNonContextualActions(List<Action> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Action action : list) {
                if (!action.isContextual()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(zp40 zp40Var) {
            zp40Var.mo1211a().setStyle(Api24Impl.createDecoratedCustomViewStyle());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(zp40 zp40Var) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(zp40 zp40Var) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(zp40 zp40Var) {
            return null;
        }
    }

    public interface Extender {
        @NonNull
        Builder extend(@NonNull Builder builder);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface GroupAlertBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface StreamType {
    }

    @Deprecated
    public NotificationCompat() {
    }

    @Nullable
    public static Action getAction(@NonNull Notification notification, int i) {
        return getActionCompatFromAction(notification.actions[i]);
    }

    @NonNull
    @RequiresApi(20)
    public static Action getActionCompatFromAction(@NonNull Notification.Action action) {
        rqc0[] rqc0VarArr;
        int i;
        RemoteInput[] remoteInputs = Api20Impl.getRemoteInputs(action);
        if (remoteInputs == null) {
            rqc0VarArr = null;
        } else {
            rqc0[] rqc0VarArr2 = new rqc0[remoteInputs.length];
            for (int i2 = 0; i2 < remoteInputs.length; i2++) {
                RemoteInput remoteInput = remoteInputs[i2];
                rqc0VarArr2[i2] = new rqc0(Api20Impl.getResultKey(remoteInput), Api20Impl.getLabel(remoteInput), Api20Impl.getChoices(remoteInput), Api20Impl.getAllowFreeFormInput(remoteInput), Build.VERSION.SDK_INT >= 29 ? Api29Impl.getEditChoicesBeforeSending(remoteInput) : 0, Api20Impl.getExtras(remoteInput), null);
            }
            rqc0VarArr = rqc0VarArr2;
        }
        boolean z = Api20Impl.getExtras(action).getBoolean("android.support.allowGeneratedReplies") || Api24Impl.getAllowGeneratedReplies(action);
        boolean z2 = Api20Impl.getExtras(action).getBoolean("android.support.action.showsUserInterface", true);
        int i3 = Build.VERSION.SDK_INT;
        int semanticAction = i3 >= 28 ? Api28Impl.getSemanticAction(action) : Api20Impl.getExtras(action).getInt("android.support.action.semanticAction", 0);
        boolean zIsContextual = i3 >= 29 ? Api29Impl.isContextual(action) : false;
        boolean zIsAuthenticationRequired = i3 >= 31 ? Api31Impl.isAuthenticationRequired(action) : false;
        if (Api23Impl.getIcon(action) != null || (i = action.icon) == 0) {
            return new Action(Api23Impl.getIcon(action) != null ? IconCompat.m1290d(Api23Impl.getIcon(action)) : null, action.title, action.actionIntent, Api20Impl.getExtras(action), rqc0VarArr, (rqc0[]) null, z, semanticAction, z2, zIsContextual, zIsAuthenticationRequired);
        }
        return new Action(i, action.title, action.actionIntent, Api20Impl.getExtras(action), rqc0VarArr, (rqc0[]) null, z, semanticAction, z2, zIsContextual, zIsAuthenticationRequired);
    }

    public static int getActionCount(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getAllowSystemGeneratedContextualActions(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getBadgeIconType(notification);
        }
        return 0;
    }

    @Nullable
    public static BubbleMetadata getBubbleMetadata(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BubbleMetadata.fromPlatform(Api29Impl.getBubbleMetadata(notification));
        }
        return null;
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getChannelId(notification);
        }
        return null;
    }

    public static int getColor(@NonNull Notification notification) {
        return notification.color;
    }

    @Nullable
    public static CharSequence getContentInfo(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    @Nullable
    public static CharSequence getContentText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    @Nullable
    public static CharSequence getContentTitle(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Nullable
    public static Bundle getExtras(@NonNull Notification notification) {
        return notification.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification) {
        return Api20Impl.getGroup(notification);
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getGroupAlertBehavior(notification);
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static boolean getHighPriority(@NonNull Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @NonNull
    @RequiresApi(21)
    public static List<Action> getInvisibleActions(@NonNull Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(C0244b.m1257c(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @Nullable
    public static iwv getLocusId(@NonNull Notification notification) {
        LocusId locusId;
        if (Build.VERSION.SDK_INT < 29 || (locusId = Api29Impl.getLocusId(notification)) == null) {
            return null;
        }
        return iwv.m138762c(locusId);
    }

    @NonNull
    public static Notification[] getNotificationArrayFromBundle(@NonNull Bundle bundle, @NonNull String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @NonNull
    public static List<C0245c> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C0245c.m1262a(yq40.m215706a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new C0245c.b().m1281g(str).m1275a());
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getSettingsText(notification);
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getShortcutId(notification);
        }
        return null;
    }

    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return Api20Impl.getSortKey(notification);
    }

    @Nullable
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getTimeoutAfter(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @Nullable
    public static Bitmap reduceLargeIconSize(@NonNull Context context, @Nullable Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(h2c0.f105516b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(h2c0.f105515a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    @RequiresApi(20)
    public static class Api20Impl {
        private Api20Impl() {
        }

        @DoNotInline
        public static boolean getAllowFreeFormInput(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        @DoNotInline
        public static CharSequence[] getChoices(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        @DoNotInline
        public static Bundle getExtras(Notification.Action action) {
            return action.getExtras();
        }

        @DoNotInline
        public static String getGroup(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        public static CharSequence getLabel(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        @DoNotInline
        public static RemoteInput[] getRemoteInputs(Notification.Action action) {
            return action.getRemoteInputs();
        }

        @DoNotInline
        public static String getResultKey(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        @DoNotInline
        public static String getSortKey(Notification notification) {
            return notification.getSortKey();
        }

        @DoNotInline
        public static Bundle getExtras(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }
    }

    public static class BigPictureStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private CharSequence mPictureContentDescription;
        private IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        @RequiresApi(23)
        public static class Api23Impl {
            private Api23Impl() {
            }

            @RequiresApi(23)
            public static void setBigLargeIcon(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @RequiresApi(31)
        public static class Api31Impl {
            private Api31Impl() {
            }

            @RequiresApi(31)
            public static void setBigPicture(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi(31)
            public static void setContentDescription(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi(31)
            public static void showBigPictureWhenCollapsed(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public BigPictureStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @Nullable
        private static IconCompat asIconCompat(@Nullable Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.m1289c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.m1294h((Bitmap) parcelable);
            }
            return null;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static IconCompat getPictureIcon(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
            return parcelable != null ? asIconCompat(parcelable) : asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(zp40 zp40Var) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(zp40Var.mo1211a()).setBigContentTitle(this.mBigContentTitle);
            IconCompat iconCompat = this.mPictureIcon;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.setBigPicture(bigContentTitle, this.mPictureIcon.m1313y(zp40Var instanceof C0243a ? ((C0243a) zp40Var).m1215f() : null));
                } else if (iconCompat.m1305q() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.mPictureIcon.m1302m());
                }
            }
            if (this.mBigLargeIconSet) {
                if (this.mBigLargeIcon == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    Api23Impl.setBigLargeIcon(bigContentTitle, this.mBigLargeIcon.m1313y(zp40Var instanceof C0243a ? ((C0243a) zp40Var).m1215f() : null));
                }
            }
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.showBigPictureWhenCollapsed(bigContentTitle, this.mShowBigPictureWhenCollapsed);
                Api31Impl.setContentDescription(bigContentTitle, this.mPictureContentDescription);
            }
        }

        @NonNull
        public BigPictureStyle bigLargeIcon(@Nullable Bitmap bitmap) {
            this.mBigLargeIcon = bitmap == null ? null : IconCompat.m1294h(bitmap);
            this.mBigLargeIconSet = true;
            return this;
        }

        @NonNull
        public BigPictureStyle bigPicture(@Nullable Bitmap bitmap) {
            this.mPictureIcon = bitmap == null ? null : IconCompat.m1294h(bitmap);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(NotificationCompat.EXTRA_PICTURE);
            bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.mBigLargeIcon = asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.mBigLargeIconSet = true;
            }
            this.mPictureIcon = getPictureIcon(bundle);
            this.mShowBigPictureWhenCollapsed = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @NonNull
        public BigPictureStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle setContentDescription(@Nullable CharSequence charSequence) {
            this.mPictureContentDescription = charSequence;
            return this;
        }

        @NonNull
        public BigPictureStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle showBigPictureWhenCollapsed(boolean z) {
            this.mShowBigPictureWhenCollapsed = z;
            return this;
        }

        public BigPictureStyle() {
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle bigPicture(@Nullable Icon icon) {
            this.mPictureIcon = IconCompat.m1289c(icon);
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public BigPictureStyle bigLargeIcon(@Nullable Icon icon) {
            this.mBigLargeIcon = icon == null ? null : IconCompat.m1289c(icon);
            this.mBigLargeIconSet = true;
            return this;
        }
    }

    public static class BigTextStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence mBigText;

        public BigTextStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(zp40 zp40Var) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(zp40Var.mo1211a()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
            if (this.mSummaryTextSet) {
                bigTextStyleBigText.setSummaryText(this.mSummaryText);
            }
        }

        @NonNull
        public BigTextStyle bigText(@Nullable CharSequence charSequence) {
            this.mBigText = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mBigText = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @NonNull
        public BigTextStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public BigTextStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigTextStyle() {
        }
    }

    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        BubbleMetadata mBubbleMetadata;
        String mCategory;
        String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context mContext;
        Bundle mExtras;
        int mFgsDeferBehavior;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList<Action> mInvisibleActions;
        IconCompat mLargeIcon;
        boolean mLocalOnly;
        iwv mLocusId;
        Notification mNotification;
        int mNumber;

        @Deprecated
        public ArrayList<String> mPeople;

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<C0245c> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        CharSequence mSettingsText;
        String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        Object mSmallIcon;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        @RequiresApi(21)
        public static class Api21Impl {
            private Api21Impl() {
            }

            @DoNotInline
            public static AudioAttributes build(AudioAttributes.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static AudioAttributes.Builder createBuilder() {
                return new AudioAttributes.Builder();
            }

            @DoNotInline
            public static AudioAttributes.Builder setContentType(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            @DoNotInline
            public static AudioAttributes.Builder setLegacyStreamType(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            @DoNotInline
            public static AudioAttributes.Builder setUsage(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        @RequiresApi(23)
        public static class Api23Impl {
            private Api23Impl() {
            }

            @DoNotInline
            public static Icon getLargeIcon(Notification notification) {
                return notification.getLargeIcon();
            }

            @DoNotInline
            public static Icon getSmallIcon(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static RemoteViews createBigContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            public static RemoteViews createContentView(Notification.Builder builder) {
                return builder.createContentView();
            }

            @DoNotInline
            public static RemoteViews createHeadsUpContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            public static Notification.Builder recoverBuilder(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public Builder(@NonNull Context context, @NonNull Notification notification) {
            ArrayList parcelableArrayList;
            this(context, NotificationCompat.getChannelId(notification));
            Bundle bundle = notification.extras;
            Style styleExtractStyleFromNotification = Style.extractStyleFromNotification(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(styleExtractStyleFromNotification).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), bundle.getInt(NotificationCompat.EXTRA_PROGRESS), bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getExtrasWithoutDuplicateData(notification, styleExtractStyleFromNotification));
            this.mSmallIcon = Api23Impl.getSmallIcon(notification);
            Icon largeIcon = Api23Impl.getLargeIcon(notification);
            if (largeIcon != null) {
                this.mLargeIcon = IconCompat.m1289c(largeIcon);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    addAction(Action.Builder.fromAndroidAction(action).build());
                }
            }
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                Iterator<Action> it = invisibleActions.iterator();
                while (it.hasNext()) {
                    addInvisibleAction(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    addPerson(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    addPerson(C0245c.m1262a(yq40.m215706a(it2.next())));
                }
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (Build.VERSION.SDK_INT < 26 || !bundle.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                return;
            }
            setColorized(bundle.getBoolean(NotificationCompat.EXTRA_COLORIZED));
        }

        @Nullable
        private static Bundle getExtrasWithoutDuplicateData(@NonNull Notification notification, @Nullable Style style) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(NotificationCompat.EXTRA_TITLE);
            bundle.remove(NotificationCompat.EXTRA_TEXT);
            bundle.remove(NotificationCompat.EXTRA_INFO_TEXT);
            bundle.remove(NotificationCompat.EXTRA_SUB_TEXT);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE);
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (style != null) {
                style.clearCompatExtraKeys(bundle);
            }
            return bundle;
        }

        @Nullable
        public static CharSequence limitCharSequenceLength(@Nullable CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > MAX_CHARSEQUENCE_LENGTH) ? charSequence.subSequence(0, MAX_CHARSEQUENCE_LENGTH) : charSequence;
        }

        private void setFlag(int i, boolean z) {
            Notification notification = this.mNotification;
            if (z) {
                notification.flags = i | notification.flags;
            } else {
                notification.flags = (~i) & notification.flags;
            }
        }

        private boolean useExistingRemoteView() {
            Style style = this.mStyle;
            return style == null || !style.displayCustomViewInline();
        }

        @NonNull
        public Builder addAction(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public Builder addExtras(@Nullable Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public Builder addInvisibleAction(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mInvisibleActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        @Deprecated
        public Builder addPerson(@Nullable String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        @NonNull
        public Notification build() {
            return new C0243a(this).m1213c();
        }

        @NonNull
        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        public Builder clearInvisibleActions() {
            this.mInvisibleActions.clear();
            Bundle bundle = this.mExtras.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.mExtras.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @NonNull
        public Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createBigContentView() {
            RemoteViews remoteViewsMakeBigContentView;
            if (this.mBigContentView != null && useExistingRemoteView()) {
                return this.mBigContentView;
            }
            C0243a c0243a = new C0243a(this);
            Style style = this.mStyle;
            return (style == null || (remoteViewsMakeBigContentView = style.makeBigContentView(c0243a)) == null) ? Api24Impl.createBigContentView(Api24Impl.recoverBuilder(this.mContext, c0243a.m1213c())) : remoteViewsMakeBigContentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createContentView() {
            RemoteViews remoteViewsMakeContentView;
            if (this.mContentView != null && useExistingRemoteView()) {
                return this.mContentView;
            }
            C0243a c0243a = new C0243a(this);
            Style style = this.mStyle;
            return (style == null || (remoteViewsMakeContentView = style.makeContentView(c0243a)) == null) ? Api24Impl.createContentView(Api24Impl.recoverBuilder(this.mContext, c0243a.m1213c())) : remoteViewsMakeContentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createHeadsUpContentView() {
            RemoteViews remoteViewsMakeHeadsUpContentView;
            if (this.mHeadsUpContentView != null && useExistingRemoteView()) {
                return this.mHeadsUpContentView;
            }
            C0243a c0243a = new C0243a(this);
            Style style = this.mStyle;
            return (style == null || (remoteViewsMakeHeadsUpContentView = style.makeHeadsUpContentView(c0243a)) == null) ? Api24Impl.createHeadsUpContentView(Api24Impl.recoverBuilder(this.mContext, c0243a.m1213c())) : remoteViewsMakeHeadsUpContentView;
        }

        @NonNull
        public Builder extend(@NonNull Extender extender) {
            extender.extend(this);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public BubbleMetadata getBubbleMetadata() {
            return this.mBubbleMetadata;
        }

        @ColorInt
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getColor() {
            return this.mColor;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getContentView() {
            return this.mContentView;
        }

        @NonNull
        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getForegroundServiceBehavior() {
            return this.mFgsDeferBehavior;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        @NonNull
        @Deprecated
        public Notification getNotification() {
            return build();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getPriority() {
            return this.mPriority;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0L;
        }

        @NonNull
        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.mAllowSystemGeneratedContextualActions = z;
            return this;
        }

        @NonNull
        public Builder setAutoCancel(boolean z) {
            setFlag(16, z);
            return this;
        }

        @NonNull
        public Builder setBadgeIconType(int i) {
            this.mBadgeIcon = i;
            return this;
        }

        @NonNull
        public Builder setBubbleMetadata(@Nullable BubbleMetadata bubbleMetadata) {
            this.mBubbleMetadata = bubbleMetadata;
            return this;
        }

        @NonNull
        public Builder setCategory(@Nullable String str) {
            this.mCategory = str;
            return this;
        }

        @NonNull
        public Builder setChannelId(@NonNull String str) {
            this.mChannelId = str;
            return this;
        }

        @NonNull
        @RequiresApi(24)
        public Builder setChronometerCountDown(boolean z) {
            this.mChronometerCountDown = z;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z);
            return this;
        }

        @NonNull
        public Builder setColor(@ColorInt int i) {
            this.mColor = i;
            return this;
        }

        @NonNull
        public Builder setColorized(boolean z) {
            this.mColorized = z;
            this.mColorizedSet = true;
            return this;
        }

        @NonNull
        public Builder setContent(@Nullable RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setContentInfo(@Nullable CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentIntent(@Nullable PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setContentText(@Nullable CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentTitle(@Nullable CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setCustomBigContentView(@Nullable RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomContentView(@Nullable RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomHeadsUpContentView(@Nullable RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setDefaults(int i) {
            Notification notification = this.mNotification;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @NonNull
        public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        @NonNull
        public Builder setForegroundServiceBehavior(int i) {
            this.mFgsDeferBehavior = i;
            return this;
        }

        @NonNull
        public Builder setFullScreenIntent(@Nullable PendingIntent pendingIntent, boolean z) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(128, z);
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.mGroupKey = str;
            return this;
        }

        @NonNull
        public Builder setGroupAlertBehavior(int i) {
            this.mGroupAlertBehavior = i;
            return this;
        }

        @NonNull
        public Builder setGroupSummary(boolean z) {
            this.mGroupSummary = z;
            return this;
        }

        @NonNull
        public Builder setLargeIcon(@Nullable Bitmap bitmap) {
            this.mLargeIcon = bitmap == null ? null : IconCompat.m1294h(NotificationCompat.reduceLargeIconSize(this.mContext, bitmap));
            return this;
        }

        @NonNull
        public Builder setLights(@ColorInt int i, int i2, int i3) {
            Notification notification = this.mNotification;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @NonNull
        public Builder setLocalOnly(boolean z) {
            this.mLocalOnly = z;
            return this;
        }

        @NonNull
        public Builder setLocusId(@Nullable iwv iwvVar) {
            this.mLocusId = iwvVar;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        @NonNull
        public Builder setNumber(int i) {
            this.mNumber = i;
            return this;
        }

        @NonNull
        public Builder setOngoing(boolean z) {
            setFlag(2, z);
            return this;
        }

        @NonNull
        public Builder setOnlyAlertOnce(boolean z) {
            setFlag(8, z);
            return this;
        }

        @NonNull
        public Builder setPriority(int i) {
            this.mPriority = i;
            return this;
        }

        @NonNull
        public Builder setProgress(int i, int i2, boolean z) {
            this.mProgressMax = i;
            this.mProgress = i2;
            this.mProgressIndeterminate = z;
            return this;
        }

        @NonNull
        public Builder setPublicVersion(@Nullable Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        @NonNull
        public Builder setRemoteInputHistory(@Nullable CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        @NonNull
        public Builder setSettingsText(@Nullable CharSequence charSequence) {
            this.mSettingsText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setShortcutId(@Nullable String str) {
            this.mShortcutId = str;
            return this;
        }

        @NonNull
        public Builder setShowWhen(boolean z) {
            this.mShowWhen = z;
            return this;
        }

        @NonNull
        public Builder setSilent(boolean z) {
            this.mSilent = z;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public Builder setSmallIcon(@NonNull IconCompat iconCompat) {
            this.mSmallIcon = iconCompat.m1313y(this.mContext);
            return this;
        }

        @NonNull
        public Builder setSortKey(@Nullable String str) {
            this.mSortKey = str;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder usage = Api21Impl.setUsage(Api21Impl.setContentType(Api21Impl.createBuilder(), 4), 5);
            this.mNotification.audioAttributes = Api21Impl.build(usage);
            return this;
        }

        @NonNull
        public Builder setStyle(@Nullable Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        @NonNull
        public Builder setSubText(@Nullable CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTicker(@Nullable CharSequence charSequence, @Nullable RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setTimeoutAfter(long j) {
            this.mTimeout = j;
            return this;
        }

        @NonNull
        public Builder setUsesChronometer(boolean z) {
            this.mUseChronometer = z;
            return this;
        }

        @NonNull
        public Builder setVibrate(@Nullable long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        @NonNull
        public Builder setVisibility(int i) {
            this.mVisibility = i;
            return this;
        }

        @NonNull
        public Builder setWhen(long j) {
            this.mNotification.when = j;
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i) {
            this.mNotification.icon = i;
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i, int i2) {
            Notification notification = this.mNotification;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        @NonNull
        public Builder addAction(@Nullable Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public Builder addInvisibleAction(@Nullable Action action) {
            if (action != null) {
                this.mInvisibleActions.add(action);
            }
            return this;
        }

        @NonNull
        public Builder setTicker(@Nullable CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder addPerson(@Nullable C0245c c0245c) {
            if (c0245c != null) {
                this.mPersonList.add(c0245c);
            }
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public Builder setLargeIcon(@Nullable Icon icon) {
            this.mLargeIcon = icon == null ? null : IconCompat.m1289c(icon);
            return this;
        }

        @NonNull
        public Builder setShortcutInfo(@Nullable vye0 vye0Var) {
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, int i) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = i;
            AudioAttributes.Builder legacyStreamType = Api21Impl.setLegacyStreamType(Api21Impl.setContentType(Api21Impl.createBuilder(), 4), i);
            this.mNotification.audioAttributes = Api21Impl.build(legacyStreamType);
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mFgsDeferBehavior = 0;
            Notification notification = new Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        @Deprecated
        public Builder(@NonNull Context context) {
            this(context, (String) null);
        }
    }

    public static class CallStyle extends Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;
        private static final String KEY_ACTION_PRIORITY = "key_action_priority";
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$CallStyle";
        private Integer mAnswerButtonColor;
        private PendingIntent mAnswerIntent;
        private int mCallType;
        private Integer mDeclineButtonColor;
        private PendingIntent mDeclineIntent;
        private PendingIntent mHangUpIntent;
        private boolean mIsVideo;
        private C0245c mPerson;
        private IconCompat mVerificationIcon;
        private CharSequence mVerificationText;

        @RequiresApi(20)
        public static class Api20Impl {
            private Api20Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            public static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            public static Notification.Action build(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static Notification.Action.Builder createActionBuilder(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }
        }

        @RequiresApi(21)
        public static class Api21Impl {
            private Api21Impl() {
            }

            @DoNotInline
            public static Notification.Builder addPerson(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            @DoNotInline
            public static Notification.Builder setCategory(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        @RequiresApi(23)
        public static class Api23Impl {
            private Api23Impl() {
            }

            @DoNotInline
            public static Parcelable castToParcelable(Icon icon) {
                return icon;
            }

            @DoNotInline
            public static Notification.Action.Builder createActionBuilder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            @DoNotInline
            public static void setLargeIcon(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        @RequiresApi(28)
        public static class Api28Impl {
            private Api28Impl() {
            }

            @DoNotInline
            public static Notification.Builder addPerson(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            @DoNotInline
            public static Parcelable castToParcelable(Person person) {
                return person;
            }
        }

        @RequiresApi(31)
        public static class Api31Impl {
            private Api31Impl() {
            }

            @DoNotInline
            public static Notification.CallStyle forIncomingCall(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            public static Notification.CallStyle forOngoingCall(@NonNull Person person, @NonNull PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            @DoNotInline
            public static Notification.CallStyle forScreeningCall(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            public static Notification.CallStyle setAnswerButtonColorHint(Notification.CallStyle callStyle, @ColorInt int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            @DoNotInline
            public static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }

            @DoNotInline
            public static Notification.CallStyle setDeclineButtonColorHint(Notification.CallStyle callStyle, @ColorInt int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }

            @DoNotInline
            public static Notification.CallStyle setIsVideo(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            @DoNotInline
            public static Notification.CallStyle setVerificationIcon(Notification.CallStyle callStyle, @Nullable Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            @DoNotInline
            public static Notification.CallStyle setVerificationText(Notification.CallStyle callStyle, @Nullable CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface CallType {
        }

        private CallStyle(int i, @NonNull C0245c c0245c, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3) {
            if (c0245c == null || TextUtils.isEmpty(c0245c.m1266e())) {
                ig3.m135964a("person must have a non-empty a name");
                throw null;
            }
            this.mCallType = i;
            this.mPerson = c0245c;
            this.mAnswerIntent = pendingIntent3;
            this.mDeclineIntent = pendingIntent2;
            this.mHangUpIntent = pendingIntent;
        }

        @NonNull
        public static CallStyle forIncomingCall(@NonNull C0245c c0245c, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(1, c0245c, null, pendingIntent, pendingIntent2);
        }

        @NonNull
        public static CallStyle forOngoingCall(@NonNull C0245c c0245c, @NonNull PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new CallStyle(2, c0245c, pendingIntent, null, null);
        }

        @NonNull
        public static CallStyle forScreeningCall(@NonNull C0245c c0245c, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(3, c0245c, pendingIntent, null, pendingIntent2);
        }

        @Nullable
        private String getDefaultText() {
            int i = this.mCallType;
            if (i == 1) {
                return this.mBuilder.mContext.getResources().getString(R$string.f1396e);
            }
            if (i == 2) {
                return this.mBuilder.mContext.getResources().getString(R$string.f1397f);
            }
            if (i != 3) {
                return null;
            }
            return this.mBuilder.mContext.getResources().getString(R$string.f1398g);
        }

        private boolean isActionAddedByCallStyle(Action action) {
            return action != null && action.getExtras().getBoolean(KEY_ACTION_PRIORITY);
        }

        @NonNull
        @RequiresApi(20)
        private Action makeAction(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(e16.m114375c(this.mBuilder.mContext, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mBuilder.mContext.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action actionBuild = new Action.Builder(IconCompat.m1297k(this.mBuilder.mContext, i), spannableStringBuilder, pendingIntent).build();
            actionBuild.getExtras().putBoolean(KEY_ACTION_PRIORITY, true);
            return actionBuild;
        }

        @Nullable
        @RequiresApi(20)
        private Action makeAnswerAction() {
            int i = p3c0.f146978b;
            int i2 = p3c0.f146977a;
            PendingIntent pendingIntent = this.mAnswerIntent;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.mIsVideo;
            return makeAction(z ? i : i2, z ? R$string.f1393b : R$string.f1392a, this.mAnswerButtonColor, m1c0.f130824a, pendingIntent);
        }

        @NonNull
        @RequiresApi(20)
        private Action makeNegativeAction() {
            int i = p3c0.f146979c;
            PendingIntent pendingIntent = this.mDeclineIntent;
            Integer num = this.mDeclineButtonColor;
            return pendingIntent == null ? makeAction(i, R$string.f1395d, num, m1c0.f130825b, this.mHangUpIntent) : makeAction(i, R$string.f1394c, num, m1c0.f130825b, pendingIntent);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.mCallType);
            bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.mIsVideo);
            C0245c c0245c = this.mPerson;
            if (c0245c != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, Api28Impl.castToParcelable(c0245c.m1271j()));
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON_COMPAT, c0245c.m1272k());
                }
            }
            IconCompat iconCompat = this.mVerificationIcon;
            if (iconCompat != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, Api23Impl.castToParcelable(iconCompat.m1313y(this.mBuilder.mContext)));
            }
            bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.mVerificationText);
            bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.mAnswerIntent);
            bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.mDeclineIntent);
            bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.mHangUpIntent);
            Integer num = this.mAnswerButtonColor;
            if (num != null) {
                bundle.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
            }
            Integer num2 = this.mDeclineButtonColor;
            if (num2 != null) {
                bundle.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(zp40 zp40Var) {
            int i = Build.VERSION.SDK_INT;
            CharSequence defaultText = null;
            callStyleForIncomingCall = null;
            Notification.CallStyle callStyleForIncomingCall = null;
            defaultText = null;
            if (i < 31) {
                Notification.Builder builderMo1211a = zp40Var.mo1211a();
                C0245c c0245c = this.mPerson;
                builderMo1211a.setContentTitle(c0245c != null ? c0245c.m1266e() : null);
                Bundle bundle = this.mBuilder.mExtras;
                if (bundle != null && bundle.containsKey(NotificationCompat.EXTRA_TEXT)) {
                    defaultText = this.mBuilder.mExtras.getCharSequence(NotificationCompat.EXTRA_TEXT);
                }
                if (defaultText == null) {
                    defaultText = getDefaultText();
                }
                builderMo1211a.setContentText(defaultText);
                C0245c c0245c2 = this.mPerson;
                if (c0245c2 != null) {
                    if (c0245c2.m1264c() != null) {
                        Api23Impl.setLargeIcon(builderMo1211a, this.mPerson.m1264c().m1313y(this.mBuilder.mContext));
                    }
                    C0245c c0245c3 = this.mPerson;
                    if (i >= 28) {
                        Api28Impl.addPerson(builderMo1211a, c0245c3.m1271j());
                    } else {
                        Api21Impl.addPerson(builderMo1211a, c0245c3.m1267f());
                    }
                }
                Api21Impl.setCategory(builderMo1211a, "call");
                return;
            }
            int i2 = this.mCallType;
            if (i2 == 1) {
                callStyleForIncomingCall = Api31Impl.forIncomingCall(this.mPerson.m1271j(), this.mDeclineIntent, this.mAnswerIntent);
            } else if (i2 == 2) {
                callStyleForIncomingCall = Api31Impl.forOngoingCall(this.mPerson.m1271j(), this.mHangUpIntent);
            } else if (i2 == 3) {
                callStyleForIncomingCall = Api31Impl.forScreeningCall(this.mPerson.m1271j(), this.mHangUpIntent, this.mAnswerIntent);
            } else if (Log.isLoggable(NotificationCompat.TAG, 3)) {
                String.valueOf(this.mCallType);
            }
            if (callStyleForIncomingCall != null) {
                callStyleForIncomingCall.setBuilder(zp40Var.mo1211a());
                Integer num = this.mAnswerButtonColor;
                if (num != null) {
                    Api31Impl.setAnswerButtonColorHint(callStyleForIncomingCall, num.intValue());
                }
                Integer num2 = this.mDeclineButtonColor;
                if (num2 != null) {
                    Api31Impl.setDeclineButtonColorHint(callStyleForIncomingCall, num2.intValue());
                }
                Api31Impl.setVerificationText(callStyleForIncomingCall, this.mVerificationText);
                IconCompat iconCompat = this.mVerificationIcon;
                if (iconCompat != null) {
                    Api31Impl.setVerificationIcon(callStyleForIncomingCall, iconCompat.m1313y(this.mBuilder.mContext));
                }
                Api31Impl.setIsVideo(callStyleForIncomingCall, this.mIsVideo);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @NonNull
        @RequiresApi(20)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> getActionsListWithSystemActions() {
            Action actionMakeNegativeAction = makeNegativeAction();
            Action actionMakeAnswerAction = makeAnswerAction();
            ArrayList<Action> arrayList = new ArrayList<>(3);
            arrayList.add(actionMakeNegativeAction);
            ArrayList<Action> arrayList2 = this.mBuilder.mActions;
            int i = 2;
            if (arrayList2 != null) {
                for (Action action : arrayList2) {
                    if (action.isContextual()) {
                        arrayList.add(action);
                    } else if (!isActionAddedByCallStyle(action) && i > 1) {
                        arrayList.add(action);
                        i--;
                    }
                    if (actionMakeAnswerAction != null && i == 1) {
                        arrayList.add(actionMakeAnswerAction);
                        i--;
                    }
                }
            }
            if (actionMakeAnswerAction != null && i >= 1) {
                arrayList.add(actionMakeAnswerAction);
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mCallType = bundle.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.mIsVideo = bundle.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
                this.mPerson = C0245c.m1262a(yq40.m215706a(bundle.getParcelable(NotificationCompat.EXTRA_CALL_PERSON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.mPerson = C0245c.m1263b(bundle.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.mVerificationIcon = IconCompat.m1289c((Icon) bundle.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.mVerificationIcon = IconCompat.m1288b(bundle.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.mVerificationText = bundle.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.mAnswerIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.mDeclineIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.mHangUpIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            this.mAnswerButtonColor = bundle.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_ANSWER_COLOR)) : null;
            this.mDeclineButtonColor = bundle.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_DECLINE_COLOR)) : null;
        }

        @NonNull
        public CallStyle setAnswerButtonColorHint(@ColorInt int i) {
            this.mAnswerButtonColor = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public CallStyle setDeclineButtonColorHint(@ColorInt int i) {
            this.mDeclineButtonColor = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public CallStyle setIsVideo(boolean z) {
            this.mIsVideo = z;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public CallStyle setVerificationIcon(@Nullable Icon icon) {
            this.mVerificationIcon = icon == null ? null : IconCompat.m1289c(icon);
            return this;
        }

        @NonNull
        public CallStyle setVerificationText(@Nullable CharSequence charSequence) {
            this.mVerificationText = charSequence;
            return this;
        }

        @NonNull
        public CallStyle setVerificationIcon(@Nullable Bitmap bitmap) {
            this.mVerificationIcon = IconCompat.m1294h(bitmap);
            return this;
        }

        public CallStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        public CallStyle() {
        }
    }

    public static class InboxStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> mTexts = new ArrayList<>();

        public InboxStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @NonNull
        public InboxStyle addLine(@Nullable CharSequence charSequence) {
            if (charSequence != null) {
                this.mTexts.add(Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(zp40 zp40Var) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(zp40Var.mo1211a()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            Iterator<CharSequence> it = this.mTexts.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mTexts.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.mTexts, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        @NonNull
        public InboxStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public InboxStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public InboxStyle() {
        }
    }

    public static class MessagingStyle extends Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";

        @Nullable
        private CharSequence mConversationTitle;

        @Nullable
        private Boolean mIsGroupConversation;
        private C0245c mUser;
        private final List<Message> mMessages = new ArrayList();
        private final List<Message> mHistoricMessages = new ArrayList();

        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static Notification.MessagingStyle addMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            @DoNotInline
            public static Notification.MessagingStyle createMessagingStyle(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            @DoNotInline
            public static Notification.MessagingStyle setConversationTitle(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        @RequiresApi(26)
        public static class Api26Impl {
            private Api26Impl() {
            }

            @DoNotInline
            public static Notification.MessagingStyle addHistoricMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        @RequiresApi(28)
        public static class Api28Impl {
            private Api28Impl() {
            }

            @DoNotInline
            public static Notification.MessagingStyle createMessagingStyle(Person person) {
                return new Notification.MessagingStyle(person);
            }

            @DoNotInline
            public static Notification.MessagingStyle setGroupConversation(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        public MessagingStyle(@NonNull C0245c c0245c) {
            if (TextUtils.isEmpty(c0245c.m1266e())) {
                ig3.m135964a("User's name must not be empty.");
                throw null;
            }
            this.mUser = c0245c;
        }

        @Nullable
        public static MessagingStyle extractMessagingStyleFromNotification(@NonNull Notification notification) {
            Style styleExtractStyleFromNotification = Style.extractStyleFromNotification(notification);
            if (styleExtractStyleFromNotification instanceof MessagingStyle) {
                return (MessagingStyle) styleExtractStyleFromNotification;
            }
            return null;
        }

        @Nullable
        private Message findLatestIncomingMessage() {
            int size = this.mMessages.size();
            while (true) {
                size--;
                List<Message> list = this.mMessages;
                if (size < 0) {
                    if (list.isEmpty()) {
                        return null;
                    }
                    List<Message> list2 = this.mMessages;
                    return list2.get(list2.size() - 1);
                }
                Message message = list.get(size);
                if (message.getPerson() != null && !TextUtils.isEmpty(message.getPerson().m1266e())) {
                    return message;
                }
            }
        }

        private boolean hasMessagesWithoutSender() {
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message = this.mMessages.get(size);
                if (message.getPerson() != null && message.getPerson().m1266e() == null) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        private TextAppearanceSpan makeFontColorSpan(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        private CharSequence makeMessageLine(@NonNull Message message) {
            ww2 ww2VarM205821c = ww2.m205821c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequenceM1266e = message.getPerson() == null ? "" : message.getPerson().m1266e();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM1266e);
            int color = RoundedDrawable.DEFAULT_BORDER_COLOR;
            if (zIsEmpty) {
                charSequenceM1266e = this.mUser.m1266e();
                if (this.mBuilder.getColor() != 0) {
                    color = this.mBuilder.getColor();
                }
            }
            CharSequence charSequenceM205826h = ww2VarM205821c.m205826h(charSequenceM1266e);
            spannableStringBuilder.append(charSequenceM205826h);
            spannableStringBuilder.setSpan(makeFontColorSpan(color), spannableStringBuilder.length() - charSequenceM205826h.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(ww2VarM205821c.m205826h(message.getText() != null ? message.getText() : ""));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.mUser.m1266e());
            bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.mUser.m1272k());
            bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.mConversationTitle);
            if (this.mConversationTitle != null && this.mIsGroupConversation.booleanValue()) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.mConversationTitle);
            }
            if (!this.mMessages.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, Message.getBundleArrayForMessages(this.mMessages));
            }
            if (!this.mHistoricMessages.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, Message.getBundleArrayForMessages(this.mHistoricMessages));
            }
            Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @NonNull
        public MessagingStyle addHistoricMessage(@Nullable Message message) {
            if (message != null) {
                this.mHistoricMessages.add(message);
                if (this.mHistoricMessages.size() > 25) {
                    this.mHistoricMessages.remove(0);
                }
            }
            return this;
        }

        @NonNull
        @Deprecated
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j, @Nullable CharSequence charSequence2) {
            this.mMessages.add(new Message(charSequence, j, new C0245c.b().m1280f(charSequence2).m1275a()));
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(zp40 zp40Var) {
            setGroupConversation(isGroupConversation());
            int i = Build.VERSION.SDK_INT;
            C0245c c0245c = this.mUser;
            Notification.MessagingStyle messagingStyleCreateMessagingStyle = i >= 28 ? Api28Impl.createMessagingStyle(c0245c.m1271j()) : Api24Impl.createMessagingStyle(c0245c.m1266e());
            Iterator<Message> it = this.mMessages.iterator();
            while (it.hasNext()) {
                Api24Impl.addMessage(messagingStyleCreateMessagingStyle, it.next().toAndroidMessage());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<Message> it2 = this.mHistoricMessages.iterator();
                while (it2.hasNext()) {
                    Api26Impl.addHistoricMessage(messagingStyleCreateMessagingStyle, it2.next().toAndroidMessage());
                }
            }
            if (this.mIsGroupConversation.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                Api24Impl.setConversationTitle(messagingStyleCreateMessagingStyle, this.mConversationTitle);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Api28Impl.setGroupConversation(messagingStyleCreateMessagingStyle, this.mIsGroupConversation.booleanValue());
            }
            messagingStyleCreateMessagingStyle.setBuilder(zp40Var.mo1211a());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Nullable
        public CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }

        @NonNull
        public List<Message> getHistoricMessages() {
            return this.mHistoricMessages;
        }

        @NonNull
        public List<Message> getMessages() {
            return this.mMessages;
        }

        @NonNull
        public C0245c getUser() {
            return this.mUser;
        }

        @Nullable
        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.mUser.m1266e();
        }

        public boolean isGroupConversation() {
            Builder builder = this.mBuilder;
            if (builder != null && builder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.mIsGroupConversation == null) {
                return this.mConversationTitle != null;
            }
            Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mMessages.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.mUser = C0245c.m1263b(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.mUser = new C0245c.b().m1280f(bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).m1275a();
            }
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.mConversationTitle = charSequence;
            if (charSequence == null) {
                this.mConversationTitle = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.mMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.mHistoricMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray2));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.mIsGroupConversation = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        @NonNull
        public MessagingStyle setConversationTitle(@Nullable CharSequence charSequence) {
            this.mConversationTitle = charSequence;
            return this;
        }

        @NonNull
        public MessagingStyle setGroupConversation(boolean z) {
            this.mIsGroupConversation = Boolean.valueOf(z);
            return this;
        }

        public static final class Message {
            static final String KEY_DATA_MIME_TYPE = "type";
            static final String KEY_DATA_URI = "uri";
            static final String KEY_EXTRAS_BUNDLE = "extras";
            static final String KEY_NOTIFICATION_PERSON = "sender_person";
            static final String KEY_PERSON = "person";
            static final String KEY_SENDER = "sender";
            static final String KEY_TEXT = "text";
            static final String KEY_TIMESTAMP = "time";

            @Nullable
            private String mDataMimeType;

            @Nullable
            private Uri mDataUri;
            private Bundle mExtras;

            @Nullable
            private final C0245c mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            @RequiresApi(24)
            public static class Api24Impl {
                private Api24Impl() {
                }

                @DoNotInline
                public static Notification.MessagingStyle.Message createMessage(CharSequence charSequence, long j, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                @DoNotInline
                public static Notification.MessagingStyle.Message setData(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            @RequiresApi(28)
            public static class Api28Impl {
                private Api28Impl() {
                }

                @DoNotInline
                public static Parcelable castToParcelable(Person person) {
                    return person;
                }

                @DoNotInline
                public static Notification.MessagingStyle.Message createMessage(CharSequence charSequence, long j, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }

            public Message(@Nullable CharSequence charSequence, long j, @Nullable C0245c c0245c) {
                this.mExtras = new Bundle();
                this.mText = charSequence;
                this.mTimestamp = j;
                this.mPerson = c0245c;
            }

            @NonNull
            public static Bundle[] getBundleArrayForMessages(@NonNull List<Message> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).toBundle();
                }
                return bundleArr;
            }

            @Nullable
            public static Message getMessageFromBundle(@NonNull Bundle bundle) {
                C0245c c0245cM1275a;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey(KEY_TIMESTAMP)) {
                        if (bundle.containsKey(KEY_PERSON)) {
                            c0245cM1275a = C0245c.m1263b(bundle.getBundle(KEY_PERSON));
                        } else if (!bundle.containsKey(KEY_NOTIFICATION_PERSON) || Build.VERSION.SDK_INT < 28) {
                            c0245cM1275a = bundle.containsKey("sender") ? new C0245c.b().m1280f(bundle.getCharSequence("sender")).m1275a() : null;
                        } else {
                            c0245cM1275a = C0245c.m1262a(yq40.m215706a(bundle.getParcelable(KEY_NOTIFICATION_PERSON)));
                        }
                        Message message = new Message(bundle.getCharSequence("text"), bundle.getLong(KEY_TIMESTAMP), c0245cM1275a);
                        if (bundle.containsKey("type") && bundle.containsKey(KEY_DATA_URI)) {
                            message.setData(bundle.getString("type"), (Uri) bundle.getParcelable(KEY_DATA_URI));
                        }
                        if (bundle.containsKey(KEY_EXTRAS_BUNDLE)) {
                            message.getExtras().putAll(bundle.getBundle(KEY_EXTRAS_BUNDLE));
                        }
                        return message;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @NonNull
            public static List<Message> getMessagesFromBundleArray(@NonNull Parcelable[] parcelableArr) {
                Message messageFromBundle;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (messageFromBundle = getMessageFromBundle((Bundle) parcelable)) != null) {
                        arrayList.add(messageFromBundle);
                    }
                }
                return arrayList;
            }

            @NonNull
            private Bundle toBundle() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.mText;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong(KEY_TIMESTAMP, this.mTimestamp);
                C0245c c0245c = this.mPerson;
                if (c0245c != null) {
                    bundle.putCharSequence("sender", c0245c.m1266e());
                    int i = Build.VERSION.SDK_INT;
                    C0245c c0245c2 = this.mPerson;
                    if (i >= 28) {
                        bundle.putParcelable(KEY_NOTIFICATION_PERSON, Api28Impl.castToParcelable(c0245c2.m1271j()));
                    } else {
                        bundle.putBundle(KEY_PERSON, c0245c2.m1272k());
                    }
                }
                String str = this.mDataMimeType;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.mDataUri;
                if (uri != null) {
                    bundle.putParcelable(KEY_DATA_URI, uri);
                }
                Bundle bundle2 = this.mExtras;
                if (bundle2 != null) {
                    bundle.putBundle(KEY_EXTRAS_BUNDLE, bundle2);
                }
                return bundle;
            }

            @Nullable
            public String getDataMimeType() {
                return this.mDataMimeType;
            }

            @Nullable
            public Uri getDataUri() {
                return this.mDataUri;
            }

            @NonNull
            public Bundle getExtras() {
                return this.mExtras;
            }

            @Nullable
            public C0245c getPerson() {
                return this.mPerson;
            }

            @Nullable
            @Deprecated
            public CharSequence getSender() {
                C0245c c0245c = this.mPerson;
                if (c0245c == null) {
                    return null;
                }
                return c0245c.m1266e();
            }

            @Nullable
            public CharSequence getText() {
                return this.mText;
            }

            public long getTimestamp() {
                return this.mTimestamp;
            }

            @NonNull
            public Message setData(@Nullable String str, @Nullable Uri uri) {
                this.mDataMimeType = str;
                this.mDataUri = uri;
                return this;
            }

            @NonNull
            @RequiresApi(24)
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public Notification.MessagingStyle.Message toAndroidMessage() {
                Notification.MessagingStyle.Message messageCreateMessage;
                C0245c person = getPerson();
                if (Build.VERSION.SDK_INT >= 28) {
                    messageCreateMessage = Api28Impl.createMessage(getText(), getTimestamp(), person != null ? person.m1271j() : null);
                } else {
                    messageCreateMessage = Api24Impl.createMessage(getText(), getTimestamp(), person != null ? person.m1266e() : null);
                }
                if (getDataMimeType() != null) {
                    Api24Impl.setData(messageCreateMessage, getDataMimeType(), getDataUri());
                }
                return messageCreateMessage;
            }

            @Deprecated
            public Message(@Nullable CharSequence charSequence, long j, @Nullable CharSequence charSequence2) {
                this(charSequence, j, new C0245c.b().m1280f(charSequence2).m1275a());
            }
        }

        @Deprecated
        public MessagingStyle(@NonNull CharSequence charSequence) {
            this.mUser = new C0245c.b().m1280f(charSequence).m1275a();
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j, @Nullable C0245c c0245c) {
            addMessage(new Message(charSequence, j, c0245c));
            return this;
        }

        public MessagingStyle() {
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable Message message) {
            if (message != null) {
                this.mMessages.add(message);
                if (this.mMessages.size() > 25) {
                    this.mMessages.remove(0);
                }
            }
            return this;
        }
    }

    public static abstract class Style {
        CharSequence mBigContentTitle;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static void setChronometerCountDown(RemoteViews remoteViews, int i, boolean z) {
                remoteViews.setChronometerCountDown(i, z);
            }
        }

        private int calculateTopPadding() {
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(h2c0.f105523i);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(h2c0.f105524j);
            float fConstrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - fConstrain) * dimensionPixelSize) + (fConstrain * dimensionPixelSize2));
        }

        private static float constrain(float f, float f2, float f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }

        @Nullable
        public static Style constructCompatStyleByName(@Nullable String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new DecoratedCustomViewStyle();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new BigPictureStyle();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new CallStyle();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new InboxStyle();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new BigTextStyle();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new MessagingStyle();
                default:
                    return null;
            }
        }

        @Nullable
        private static Style constructCompatStyleByPlatformName(@Nullable String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new BigPictureStyle();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new BigTextStyle();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new InboxStyle();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new MessagingStyle();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new DecoratedCustomViewStyle();
            }
            return null;
        }

        @Nullable
        public static Style constructCompatStyleForBundle(@NonNull Bundle bundle) {
            Style styleConstructCompatStyleByName = constructCompatStyleByName(bundle.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            if (styleConstructCompatStyleByName != null) {
                return styleConstructCompatStyleByName;
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                return new MessagingStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_PICTURE) || bundle.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) {
                return new BigPictureStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_BIG_TEXT)) {
                return new BigTextStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                return new InboxStyle();
            }
            return bundle.containsKey(NotificationCompat.EXTRA_CALL_TYPE) ? new CallStyle() : constructCompatStyleByPlatformName(bundle.getString(NotificationCompat.EXTRA_TEMPLATE));
        }

        @Nullable
        public static Style constructStyleForExtras(@NonNull Bundle bundle) {
            Style styleConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (styleConstructCompatStyleForBundle == null) {
                return null;
            }
            try {
                styleConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return styleConstructCompatStyleForBundle;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap createColoredBitmap(@NonNull IconCompat iconCompat, int i, int i2) {
            Drawable drawableM1308t = iconCompat.m1308t(this.mBuilder.mContext);
            int intrinsicWidth = i2 == 0 ? drawableM1308t.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = drawableM1308t.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            drawableM1308t.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                drawableM1308t.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            drawableM1308t.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        private Bitmap createIconWithBackground(int i, int i2, int i3, int i4) {
            int i5 = p3c0.f146980d;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap bitmapCreateColoredBitmap = createColoredBitmap(i5, i4, i2);
            Canvas canvas = new Canvas(bitmapCreateColoredBitmap);
            Drawable drawableMutate = this.mBuilder.mContext.getResources().getDrawable(i).mutate();
            drawableMutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            drawableMutate.setBounds(i6, i6, i7, i7);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapCreateColoredBitmap;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static Style extractStyleFromNotification(@NonNull Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return constructStyleForExtras(extras);
        }

        private void hideNormalContent(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(e5c0.f89405i0, 8);
            remoteViews.setViewVisibility(e5c0.f89401g0, 8);
            remoteViews.setViewVisibility(e5c0.f89399f0, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0108  */
        /* JADX WARN: Code duplicated, block: B:36:0x0113  */
        /* JADX WARN: Code duplicated, block: B:38:0x011f  */
        /* JADX WARN: Code duplicated, block: B:40:0x0135  */
        /* JADX WARN: Code duplicated, block: B:43:0x0146  */
        /* JADX WARN: Code duplicated, block: B:45:0x014c  */
        /* JADX WARN: Code duplicated, block: B:47:0x0175  */
        /* JADX WARN: Code duplicated, block: B:48:0x017b  */
        /* JADX WARN: Code duplicated, block: B:49:0x018e  */
        /* JADX WARN: Code duplicated, block: B:52:0x0193  */
        /* JADX WARN: Code duplicated, block: B:53:0x0195  */
        /* JADX WARN: Code duplicated, block: B:57:0x019e  */
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews applyStandardTemplate(boolean z, int i, boolean z2) {
            boolean z3;
            boolean z4;
            CharSequence charSequence;
            int i2;
            boolean z5;
            CharSequence charSequence2;
            Resources resources = this.mBuilder.mContext.getResources();
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), i);
            this.mBuilder.getPriority();
            Builder builder = this.mBuilder;
            if (builder.mLargeIcon != null) {
                remoteViews.setViewVisibility(e5c0.f89375N, 0);
                remoteViews.setImageViewBitmap(e5c0.f89375N, createColoredBitmap(this.mBuilder.mLargeIcon, 0));
                if (z && this.mBuilder.mNotification.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(h2c0.f105519e);
                    int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(h2c0.f105520f) * 2);
                    Builder builder2 = this.mBuilder;
                    remoteViews.setImageViewBitmap(e5c0.f89381T, createIconWithBackground(builder2.mNotification.icon, dimensionPixelSize, dimensionPixelSize2, builder2.getColor()));
                    remoteViews.setViewVisibility(e5c0.f89381T, 0);
                }
            } else if (z && builder.mNotification.icon != 0) {
                remoteViews.setViewVisibility(e5c0.f89375N, 0);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(h2c0.f105518d) - resources.getDimensionPixelSize(h2c0.f105517c);
                int dimensionPixelSize4 = resources.getDimensionPixelSize(h2c0.f105521g);
                Builder builder3 = this.mBuilder;
                remoteViews.setImageViewBitmap(e5c0.f89375N, createIconWithBackground(builder3.mNotification.icon, dimensionPixelSize3, dimensionPixelSize4, builder3.getColor()));
            }
            CharSequence charSequence3 = this.mBuilder.mContentTitle;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(e5c0.f89405i0, charSequence3);
            }
            CharSequence charSequence4 = this.mBuilder.mContentText;
            boolean z6 = true;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(e5c0.f89399f0, charSequence4);
                z3 = true;
            } else {
                z3 = false;
            }
            Builder builder4 = this.mBuilder;
            CharSequence charSequence5 = builder4.mContentInfo;
            if (charSequence5 == null) {
                if (builder4.mNumber > 0) {
                    if (this.mBuilder.mNumber > resources.getInteger(v5c0.f180021a)) {
                        remoteViews.setTextViewText(e5c0.f89376O, resources.getString(R$string.f1399h));
                    } else {
                        remoteViews.setTextViewText(e5c0.f89376O, NumberFormat.getIntegerInstance().format(this.mBuilder.mNumber));
                    }
                    remoteViews.setViewVisibility(e5c0.f89376O, 0);
                } else {
                    remoteViews.setViewVisibility(e5c0.f89376O, 8);
                    z4 = false;
                }
                charSequence = this.mBuilder.mSubText;
                if (charSequence != null) {
                    remoteViews.setTextViewText(e5c0.f89399f0, charSequence);
                    charSequence2 = this.mBuilder.mContentText;
                    if (charSequence2 != null) {
                        remoteViews.setTextViewText(e5c0.f89401g0, charSequence2);
                        remoteViews.setViewVisibility(e5c0.f89401g0, 0);
                        if (z2) {
                            remoteViews.setTextViewTextSize(e5c0.f89399f0, 0, resources.getDimensionPixelSize(h2c0.f105522h));
                        }
                        remoteViews.setViewPadding(e5c0.f89377P, 0, 0, 0, 0);
                    } else {
                        remoteViews.setViewVisibility(e5c0.f89401g0, 8);
                    }
                }
                if (this.mBuilder.getWhenIfShowing() != 0) {
                    z6 = z4;
                } else if (this.mBuilder.mUseChronometer) {
                    remoteViews.setViewVisibility(e5c0.f89374M, 0);
                    remoteViews.setLong(e5c0.f89374M, "setBase", this.mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                    remoteViews.setBoolean(e5c0.f89374M, "setStarted", true);
                    z5 = this.mBuilder.mChronometerCountDown;
                    if (z5) {
                        Api24Impl.setChronometerCountDown(remoteViews, e5c0.f89374M, z5);
                    }
                } else {
                    remoteViews.setViewVisibility(e5c0.f89403h0, 0);
                    remoteViews.setLong(e5c0.f89403h0, "setTime", this.mBuilder.getWhenIfShowing());
                }
                int i3 = e5c0.f89382U;
                if (z6) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                remoteViews.setViewVisibility(i3, i2);
                remoteViews.setViewVisibility(e5c0.f89378Q, z3 ? 0 : 8);
                return remoteViews;
            }
            remoteViews.setTextViewText(e5c0.f89376O, charSequence5);
            remoteViews.setViewVisibility(e5c0.f89376O, 0);
            z3 = true;
            z4 = true;
            charSequence = this.mBuilder.mSubText;
            if (charSequence != null) {
                remoteViews.setTextViewText(e5c0.f89399f0, charSequence);
                charSequence2 = this.mBuilder.mContentText;
                if (charSequence2 != null) {
                    remoteViews.setTextViewText(e5c0.f89401g0, charSequence2);
                    remoteViews.setViewVisibility(e5c0.f89401g0, 0);
                    if (z2) {
                        remoteViews.setTextViewTextSize(e5c0.f89399f0, 0, resources.getDimensionPixelSize(h2c0.f105522h));
                    }
                    remoteViews.setViewPadding(e5c0.f89377P, 0, 0, 0, 0);
                } else {
                    remoteViews.setViewVisibility(e5c0.f89401g0, 8);
                }
            }
            if (this.mBuilder.getWhenIfShowing() != 0) {
                z6 = z4;
            } else if (this.mBuilder.mUseChronometer) {
                remoteViews.setViewVisibility(e5c0.f89374M, 0);
                remoteViews.setLong(e5c0.f89374M, "setBase", this.mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                remoteViews.setBoolean(e5c0.f89374M, "setStarted", true);
                z5 = this.mBuilder.mChronometerCountDown;
                if (z5) {
                    Api24Impl.setChronometerCountDown(remoteViews, e5c0.f89374M, z5);
                }
            } else {
                remoteViews.setViewVisibility(e5c0.f89403h0, 0);
                remoteViews.setLong(e5c0.f89403h0, "setTime", this.mBuilder.getWhenIfShowing());
            }
            int i4 = e5c0.f89382U;
            if (z6) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            remoteViews.setViewVisibility(i4, i2);
            remoteViews.setViewVisibility(e5c0.f89378Q, z3 ? 0 : 8);
            return remoteViews;
        }

        @Nullable
        public Notification build() {
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            hideNormalContent(remoteViews);
            remoteViews.removeAllViews(e5c0.f89379R);
            remoteViews.addView(e5c0.f89379R, remoteViews2.clone());
            remoteViews.setViewVisibility(e5c0.f89379R, 0);
            remoteViews.setViewPadding(e5c0.f89380S, 0, calculateTopPadding(), 0, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            bundle.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return false;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(zp40 zp40Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(zp40 zp40Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(zp40 zp40Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.mSummaryText = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        public void setBuilder(@Nullable Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(zp40 zp40Var) {
        }

        public Bitmap createColoredBitmap(@NonNull IconCompat iconCompat, int i) {
            return createColoredBitmap(iconCompat, i, 0);
        }

        private Bitmap createColoredBitmap(int i, int i2, int i3) {
            return createColoredBitmap(IconCompat.m1297k(this.mBuilder.mContext, i), i2, i3);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap createColoredBitmap(int i, int i2) {
            return createColoredBitmap(i, i2, 0);
        }
    }

    public static final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private PendingIntent mDeleteIntent;
        private int mDesiredHeight;

        @DimenRes
        private int mDesiredHeightResId;
        private int mFlags;
        private IconCompat mIcon;
        private PendingIntent mPendingIntent;
        private String mShortcutId;

        @RequiresApi(29)
        public static class Api29Impl {
            private Api29Impl() {
            }

            @Nullable
            @RequiresApi(29)
            public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Builder suppressNotification = new Builder(bubbleMetadata.getIntent(), IconCompat.m1289c(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            @Nullable
            @RequiresApi(29)
            public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.getIcon().m1312x()).setIntent(bubbleMetadata.getIntent()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }
        }

        @RequiresApi(30)
        public static class Api30Impl {
            private Api30Impl() {
            }

            @Nullable
            @RequiresApi(30)
            public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Builder builder = bubbleMetadata.getShortcutId() != null ? new Builder(bubbleMetadata.getShortcutId()) : new Builder(bubbleMetadata.getIntent(), IconCompat.m1289c(bubbleMetadata.getIcon()));
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            @Nullable
            @RequiresApi(30)
            public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = bubbleMetadata.getShortcutId() != null ? new Notification.BubbleMetadata.Builder(bubbleMetadata.getShortcutId()) : new Notification.BubbleMetadata.Builder(bubbleMetadata.getIntent(), bubbleMetadata.getIcon().m1312x());
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }
        }

        private BubbleMetadata(@Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable IconCompat iconCompat, int i, @DimenRes int i2, int i3, @Nullable String str) {
            this.mPendingIntent = pendingIntent;
            this.mIcon = iconCompat;
            this.mDesiredHeight = i;
            this.mDesiredHeightResId = i2;
            this.mDeleteIntent = pendingIntent2;
            this.mFlags = i3;
            this.mShortcutId = str;
        }

        @Nullable
        public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return Api30Impl.fromPlatform(bubbleMetadata);
            }
            if (i == 29) {
                return Api29Impl.fromPlatform(bubbleMetadata);
            }
            return null;
        }

        @Nullable
        public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return Api30Impl.toPlatform(bubbleMetadata);
            }
            if (i == 29) {
                return Api29Impl.toPlatform(bubbleMetadata);
            }
            return null;
        }

        public boolean getAutoExpandBubble() {
            return (this.mFlags & 1) != 0;
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        @Dimension(unit = 0)
        public int getDesiredHeight() {
            return this.mDesiredHeight;
        }

        @DimenRes
        public int getDesiredHeightResId() {
            return this.mDesiredHeightResId;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat getIcon() {
            return this.mIcon;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent getIntent() {
            return this.mPendingIntent;
        }

        @Nullable
        public String getShortcutId() {
            return this.mShortcutId;
        }

        public boolean isNotificationSuppressed() {
            return (this.mFlags & 2) != 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void setFlags(int i) {
            this.mFlags = i;
        }

        public static final class Builder {
            private PendingIntent mDeleteIntent;
            private int mDesiredHeight;

            @DimenRes
            private int mDesiredHeightResId;
            private int mFlags;
            private IconCompat mIcon;
            private PendingIntent mPendingIntent;
            private String mShortcutId;

            public Builder(@NonNull PendingIntent pendingIntent, @NonNull IconCompat iconCompat) {
                if (pendingIntent == null) {
                    jfd0.m141176a("Bubble requires non-null pending intent");
                    throw null;
                }
                if (iconCompat == null) {
                    jfd0.m141176a("Bubbles require non-null icon");
                    throw null;
                }
                this.mPendingIntent = pendingIntent;
                this.mIcon = iconCompat;
            }

            @NonNull
            private Builder setFlag(int i, boolean z) {
                int i2 = this.mFlags;
                if (z) {
                    this.mFlags = i | i2;
                    return this;
                }
                this.mFlags = (~i) & i2;
                return this;
            }

            @NonNull
            public BubbleMetadata build() {
                String str = this.mShortcutId;
                if (str == null && this.mPendingIntent == null) {
                    jfd0.m141176a("Must supply pending intent or shortcut to bubble");
                    return null;
                }
                if (str == null && this.mIcon == null) {
                    jfd0.m141176a("Must supply an icon or shortcut for the bubble");
                    return null;
                }
                BubbleMetadata bubbleMetadata = new BubbleMetadata(this.mPendingIntent, this.mDeleteIntent, this.mIcon, this.mDesiredHeight, this.mDesiredHeightResId, this.mFlags, str);
                bubbleMetadata.setFlags(this.mFlags);
                return bubbleMetadata;
            }

            @NonNull
            public Builder setAutoExpandBubble(boolean z) {
                setFlag(1, z);
                return this;
            }

            @NonNull
            public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
                this.mDeleteIntent = pendingIntent;
                return this;
            }

            @NonNull
            public Builder setDesiredHeight(@Dimension(unit = 0) int i) {
                this.mDesiredHeight = Math.max(i, 0);
                this.mDesiredHeightResId = 0;
                return this;
            }

            @NonNull
            public Builder setDesiredHeightResId(@DimenRes int i) {
                this.mDesiredHeightResId = i;
                this.mDesiredHeight = 0;
                return this;
            }

            @NonNull
            public Builder setIcon(@NonNull IconCompat iconCompat) {
                if (this.mShortcutId != null) {
                    qkq0.m175383a("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                    return null;
                }
                if (iconCompat != null) {
                    this.mIcon = iconCompat;
                    return this;
                }
                jfd0.m141176a("Bubbles require non-null icon");
                return null;
            }

            @NonNull
            public Builder setIntent(@NonNull PendingIntent pendingIntent) {
                if (this.mShortcutId != null) {
                    qkq0.m175383a("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                    return null;
                }
                if (pendingIntent != null) {
                    this.mPendingIntent = pendingIntent;
                    return this;
                }
                jfd0.m141176a("Bubble requires non-null pending intent");
                return null;
            }

            @NonNull
            public Builder setSuppressNotification(boolean z) {
                setFlag(2, z);
                return this;
            }

            @RequiresApi(30)
            public Builder(@NonNull String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.mShortcutId = str;
                } else {
                    jfd0.m141176a("Bubble requires a non-null shortcut id");
                    throw null;
                }
            }

            @Deprecated
            public Builder() {
            }
        }
    }

    public static class Action {
        static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;

        @Nullable
        public PendingIntent actionIntent;

        @Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final rqc0[] mDataOnlyRemoteInputs;
        final Bundle mExtras;

        @Nullable
        private IconCompat mIcon;
        private final boolean mIsContextual;
        private final rqc0[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public CharSequence title;

        public interface Extender {
            @NonNull
            Builder extend(@NonNull Builder builder);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable rqc0[] rqc0VarArr, @Nullable rqc0[] rqc0VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.mShowsUserInterface = true;
            this.mIcon = iconCompat;
            if (iconCompat != null && iconCompat.m1305q() == 2) {
                this.icon = iconCompat.m1303n();
            }
            this.title = Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.mExtras = bundle == null ? new Bundle() : bundle;
            this.mRemoteInputs = rqc0VarArr;
            this.mDataOnlyRemoteInputs = rqc0VarArr2;
            this.mAllowGeneratedReplies = z;
            this.mSemanticAction = i;
            this.mShowsUserInterface = z2;
            this.mIsContextual = z3;
            this.mAuthenticationRequired = z4;
        }

        @Nullable
        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.mAllowGeneratedReplies;
        }

        @Nullable
        public rqc0[] getDataOnlyRemoteInputs() {
            return this.mDataOnlyRemoteInputs;
        }

        @NonNull
        public Bundle getExtras() {
            return this.mExtras;
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        @Nullable
        public IconCompat getIconCompat() {
            int i;
            if (this.mIcon == null && (i = this.icon) != 0) {
                this.mIcon = IconCompat.m1298l(null, "", i);
            }
            return this.mIcon;
        }

        @Nullable
        public rqc0[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            return this.mSemanticAction;
        }

        public boolean getShowsUserInterface() {
            return this.mShowsUserInterface;
        }

        @Nullable
        public CharSequence getTitle() {
            return this.title;
        }

        public boolean isAuthenticationRequired() {
            return this.mAuthenticationRequired;
        }

        public boolean isContextual() {
            return this.mIsContextual;
        }

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private final Bundle mExtras;
            private final IconCompat mIcon;
            private final PendingIntent mIntent;
            private boolean mIsContextual;
            private ArrayList<rqc0> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            @RequiresApi(20)
            public static class Api20Impl {
                private Api20Impl() {
                }

                @DoNotInline
                public static Bundle getExtras(Notification.Action action) {
                    return action.getExtras();
                }

                @DoNotInline
                public static RemoteInput[] getRemoteInputs(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            @RequiresApi(23)
            public static class Api23Impl {
                private Api23Impl() {
                }

                @DoNotInline
                public static Icon getIcon(Notification.Action action) {
                    return action.getIcon();
                }
            }

            @RequiresApi(24)
            public static class Api24Impl {
                private Api24Impl() {
                }

                @DoNotInline
                public static boolean getAllowGeneratedReplies(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            @RequiresApi(28)
            public static class Api28Impl {
                private Api28Impl() {
                }

                @DoNotInline
                public static int getSemanticAction(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            @RequiresApi(29)
            public static class Api29Impl {
                private Api29Impl() {
                }

                @DoNotInline
                public static boolean isContextual(Notification.Action action) {
                    return action.isContextual();
                }
            }

            @RequiresApi(31)
            public static class Api31Impl {
                private Api31Impl() {
                }

                @DoNotInline
                public static boolean isAuthenticationRequired(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            private Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @NonNull Bundle bundle, @Nullable rqc0[] rqc0VarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = iconCompat;
                this.mTitle = Builder.limitCharSequenceLength(charSequence);
                this.mIntent = pendingIntent;
                this.mExtras = bundle;
                this.mRemoteInputs = rqc0VarArr == null ? null : new ArrayList<>(Arrays.asList(rqc0VarArr));
                this.mAllowGeneratedReplies = z;
                this.mSemanticAction = i;
                this.mShowsUserInterface = z2;
                this.mIsContextual = z3;
                this.mAuthenticationRequired = z4;
            }

            private void checkContextualActionNullFields() {
                if (this.mIsContextual && this.mIntent == null) {
                    jfd0.m141176a("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @NonNull
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public static Builder fromAndroidAction(@NonNull Notification.Action action) {
                Builder builder = Api23Impl.getIcon(action) != null ? new Builder(IconCompat.m1290d(Api23Impl.getIcon(action)), action.title, action.actionIntent) : new Builder(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputs = Api20Impl.getRemoteInputs(action);
                if (remoteInputs != null && remoteInputs.length != 0) {
                    for (RemoteInput remoteInput : remoteInputs) {
                        builder.addRemoteInput(rqc0.m180413c(remoteInput));
                    }
                }
                builder.mAllowGeneratedReplies = Api24Impl.getAllowGeneratedReplies(action);
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    builder.setSemanticAction(Api28Impl.getSemanticAction(action));
                }
                if (i >= 29) {
                    builder.setContextual(Api29Impl.isContextual(action));
                }
                if (i >= 31) {
                    builder.setAuthenticationRequired(Api31Impl.isAuthenticationRequired(action));
                }
                builder.addExtras(Api20Impl.getExtras(action));
                return builder;
            }

            @NonNull
            public Builder addExtras(@Nullable Bundle bundle) {
                if (bundle != null) {
                    this.mExtras.putAll(bundle);
                }
                return this;
            }

            @NonNull
            public Builder addRemoteInput(@Nullable rqc0 rqc0Var) {
                if (this.mRemoteInputs == null) {
                    this.mRemoteInputs = new ArrayList<>();
                }
                if (rqc0Var != null) {
                    this.mRemoteInputs.add(rqc0Var);
                }
                return this;
            }

            @NonNull
            public Action build() {
                checkContextualActionNullFields();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<rqc0> arrayList3 = this.mRemoteInputs;
                if (arrayList3 != null) {
                    for (rqc0 rqc0Var : arrayList3) {
                        if (rqc0Var.m180422l()) {
                            arrayList.add(rqc0Var);
                        } else {
                            arrayList2.add(rqc0Var);
                        }
                    }
                }
                return new Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, arrayList2.isEmpty() ? null : (rqc0[]) arrayList2.toArray(new rqc0[arrayList2.size()]), arrayList.isEmpty() ? null : (rqc0[]) arrayList.toArray(new rqc0[arrayList.size()]), this.mAllowGeneratedReplies, this.mSemanticAction, this.mShowsUserInterface, this.mIsContextual, this.mAuthenticationRequired);
            }

            @NonNull
            public Builder extend(@NonNull Extender extender) {
                extender.extend(this);
                return this;
            }

            @NonNull
            public Bundle getExtras() {
                return this.mExtras;
            }

            @NonNull
            public Builder setAllowGeneratedReplies(boolean z) {
                this.mAllowGeneratedReplies = z;
                return this;
            }

            @NonNull
            public Builder setAuthenticationRequired(boolean z) {
                this.mAuthenticationRequired = z;
                return this;
            }

            @NonNull
            public Builder setContextual(boolean z) {
                this.mIsContextual = z;
                return this;
            }

            @NonNull
            public Builder setSemanticAction(int i) {
                this.mSemanticAction = i;
                return this;
            }

            @NonNull
            public Builder setShowsUserInterface(boolean z) {
                this.mShowsUserInterface = z;
                return this;
            }

            public Builder(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m1298l(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(@NonNull Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface, action.isContextual(), action.isAuthenticationRequired());
            }

            public Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }
        }

        public static final class WearableExtender implements Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final String KEY_CANCEL_LABEL = "cancelLabel";
            private static final String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final String KEY_FLAGS = "flags";
            private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags;
            private CharSequence mInProgressLabel;

            public WearableExtender(@NonNull Action action) {
                this.mFlags = 1;
                Bundle bundle = action.getExtras().getBundle(EXTRA_WEARABLE_EXTENSIONS);
                if (bundle != null) {
                    this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                    this.mInProgressLabel = bundle.getCharSequence(KEY_IN_PROGRESS_LABEL);
                    this.mConfirmLabel = bundle.getCharSequence(KEY_CONFIRM_LABEL);
                    this.mCancelLabel = bundle.getCharSequence(KEY_CANCEL_LABEL);
                }
            }

            private void setFlag(int i, boolean z) {
                int i2 = this.mFlags;
                if (z) {
                    this.mFlags = i | i2;
                } else {
                    this.mFlags = (~i) & i2;
                }
            }

            @NonNull
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
            public WearableExtender m223786clone() {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.mFlags = this.mFlags;
                wearableExtender.mInProgressLabel = this.mInProgressLabel;
                wearableExtender.mConfirmLabel = this.mConfirmLabel;
                wearableExtender.mCancelLabel = this.mCancelLabel;
                return wearableExtender;
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            @NonNull
            public Builder extend(@NonNull Builder builder) {
                Bundle bundle = new Bundle();
                int i = this.mFlags;
                if (i != 1) {
                    bundle.putInt(KEY_FLAGS, i);
                }
                CharSequence charSequence = this.mInProgressLabel;
                if (charSequence != null) {
                    bundle.putCharSequence(KEY_IN_PROGRESS_LABEL, charSequence);
                }
                CharSequence charSequence2 = this.mConfirmLabel;
                if (charSequence2 != null) {
                    bundle.putCharSequence(KEY_CONFIRM_LABEL, charSequence2);
                }
                CharSequence charSequence3 = this.mCancelLabel;
                if (charSequence3 != null) {
                    bundle.putCharSequence(KEY_CANCEL_LABEL, charSequence3);
                }
                builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
                return builder;
            }

            @Nullable
            @Deprecated
            public CharSequence getCancelLabel() {
                return this.mCancelLabel;
            }

            @Nullable
            @Deprecated
            public CharSequence getConfirmLabel() {
                return this.mConfirmLabel;
            }

            public boolean getHintDisplayActionInline() {
                return (this.mFlags & 4) != 0;
            }

            public boolean getHintLaunchesActivity() {
                return (this.mFlags & 2) != 0;
            }

            @Nullable
            @Deprecated
            public CharSequence getInProgressLabel() {
                return this.mInProgressLabel;
            }

            public boolean isAvailableOffline() {
                return (this.mFlags & 1) != 0;
            }

            @NonNull
            public WearableExtender setAvailableOffline(boolean z) {
                setFlag(1, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setCancelLabel(@Nullable CharSequence charSequence) {
                this.mCancelLabel = charSequence;
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setConfirmLabel(@Nullable CharSequence charSequence) {
                this.mConfirmLabel = charSequence;
                return this;
            }

            @NonNull
            public WearableExtender setHintDisplayActionInline(boolean z) {
                setFlag(4, z);
                return this;
            }

            @NonNull
            public WearableExtender setHintLaunchesActivity(boolean z) {
                setFlag(2, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setInProgressLabel(@Nullable CharSequence charSequence) {
                this.mInProgressLabel = charSequence;
                return this;
            }

            public WearableExtender() {
                this.mFlags = 1;
            }
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (rqc0[]) null, (rqc0[]) null, true, 0, true, false, false);
        }

        public Action(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable rqc0[] rqc0VarArr, @Nullable rqc0[] rqc0VarArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.m1298l(null, "", i) : null, charSequence, pendingIntent, bundle, rqc0VarArr, rqc0VarArr2, z, i2, z2, z3, z4);
        }

        public Action(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m1298l(null, "", i) : null, charSequence, pendingIntent);
        }
    }

    public static final class CarExtender implements Extender {

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        @RequiresApi(20)
        public static class Api20Impl {
            private Api20Impl() {
            }

            @DoNotInline
            public static RemoteInput.Builder addExtras(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            public static RemoteInput build(RemoteInput.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static Parcelable castToParcelable(RemoteInput remoteInput) {
                return remoteInput;
            }

            @DoNotInline
            public static RemoteInput.Builder createBuilder(String str) {
                return new RemoteInput.Builder(str);
            }

            @DoNotInline
            public static boolean getAllowFreeFormInput(RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            @DoNotInline
            public static CharSequence[] getChoices(RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            @DoNotInline
            public static Bundle getExtras(RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            @DoNotInline
            public static CharSequence getLabel(RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            @DoNotInline
            public static String getResultKey(RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            @DoNotInline
            public static RemoteInput.Builder setAllowFreeFormInput(RemoteInput.Builder builder, boolean z) {
                return builder.setAllowFreeFormInput(z);
            }

            @DoNotInline
            public static RemoteInput.Builder setChoices(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            @DoNotInline
            public static RemoteInput.Builder setLabel(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        @RequiresApi(29)
        public static class Api29Impl {
            private Api29Impl() {
            }

            @DoNotInline
            public static int getEditChoicesBeforeSending(RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        @Deprecated
        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final rqc0 mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            public static class Builder {
                private long mLatestTimestamp;
                private final List<String> mMessages = new ArrayList();
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private rqc0 mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public Builder(@NonNull String str) {
                    this.mParticipant = str;
                }

                @NonNull
                public Builder addMessage(@Nullable String str) {
                    if (str != null) {
                        this.mMessages.add(str);
                    }
                    return this;
                }

                @NonNull
                public UnreadConversation build() {
                    List<String> list = this.mMessages;
                    return new UnreadConversation((String[]) list.toArray(new String[list.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, new String[]{this.mParticipant}, this.mLatestTimestamp);
                }

                @NonNull
                public Builder setLatestTimestamp(long j) {
                    this.mLatestTimestamp = j;
                    return this;
                }

                @NonNull
                public Builder setReadPendingIntent(@Nullable PendingIntent pendingIntent) {
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                @NonNull
                public Builder setReplyAction(@Nullable PendingIntent pendingIntent, @Nullable rqc0 rqc0Var) {
                    this.mRemoteInput = rqc0Var;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }
            }

            public UnreadConversation(@Nullable String[] strArr, @Nullable rqc0 rqc0Var, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable String[] strArr2, long j) {
                this.mMessages = strArr;
                this.mRemoteInput = rqc0Var;
                this.mReadPendingIntent = pendingIntent2;
                this.mReplyPendingIntent = pendingIntent;
                this.mParticipants = strArr2;
                this.mLatestTimestamp = j;
            }

            public long getLatestTimestamp() {
                return this.mLatestTimestamp;
            }

            @Nullable
            public String[] getMessages() {
                return this.mMessages;
            }

            @Nullable
            public String getParticipant() {
                String[] strArr = this.mParticipants;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @Nullable
            public String[] getParticipants() {
                return this.mParticipants;
            }

            @Nullable
            public PendingIntent getReadPendingIntent() {
                return this.mReadPendingIntent;
            }

            @Nullable
            public rqc0 getRemoteInput() {
                return this.mRemoteInput;
            }

            @Nullable
            public PendingIntent getReplyPendingIntent() {
                return this.mReplyPendingIntent;
            }
        }

        public CarExtender(@NonNull Notification notification) {
            this.mColor = 0;
            Bundle bundle = NotificationCompat.getExtras(notification) == null ? null : NotificationCompat.getExtras(notification).getBundle(EXTRA_CAR_EXTENDER);
            if (bundle != null) {
                this.mLargeIcon = (Bitmap) bundle.getParcelable(EXTRA_LARGE_ICON);
                this.mColor = bundle.getInt(EXTRA_COLOR, 0);
                this.mUnreadConversation = getUnreadConversationFromBundle(bundle.getBundle(EXTRA_CONVERSATION));
            }
        }

        @RequiresApi(21)
        private static Bundle getBundleForUnreadConversation(@NonNull UnreadConversation unreadConversation) {
            Bundle bundle = new Bundle();
            String str = (unreadConversation.getParticipants() == null || unreadConversation.getParticipants().length <= 1) ? null : unreadConversation.getParticipants()[0];
            int length = unreadConversation.getMessages().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", unreadConversation.getMessages()[i]);
                bundle2.putString(KEY_AUTHOR, str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(KEY_MESSAGES, parcelableArr);
            rqc0 remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                RemoteInput.Builder builderCreateBuilder = Api20Impl.createBuilder(remoteInput.m180421j());
                Api20Impl.setLabel(builderCreateBuilder, remoteInput.m180420i());
                Api20Impl.setChoices(builderCreateBuilder, remoteInput.m180417f());
                Api20Impl.setAllowFreeFormInput(builderCreateBuilder, remoteInput.m180415d());
                Api20Impl.addExtras(builderCreateBuilder, remoteInput.m180419h());
                bundle.putParcelable(KEY_REMOTE_INPUT, Api20Impl.castToParcelable(Api20Impl.build(builderCreateBuilder)));
            }
            bundle.putParcelable(KEY_ON_REPLY, unreadConversation.getReplyPendingIntent());
            bundle.putParcelable(KEY_ON_READ, unreadConversation.getReadPendingIntent());
            bundle.putStringArray(KEY_PARTICIPANTS, unreadConversation.getParticipants());
            bundle.putLong(KEY_TIMESTAMP, unreadConversation.getLatestTimestamp());
            return bundle;
        }

        @RequiresApi(21)
        private static UnreadConversation getUnreadConversationFromBundle(@Nullable Bundle bundle) {
            String[] strArr;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_MESSAGES);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    Parcelable parcelable = parcelableArray[i];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(KEY_ON_READ);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(KEY_ON_REPLY);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(KEY_REMOTE_INPUT);
            String[] stringArray = bundle.getStringArray(KEY_PARTICIPANTS);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new UnreadConversation(strArr, remoteInput != null ? new rqc0(Api20Impl.getResultKey(remoteInput), Api20Impl.getLabel(remoteInput), Api20Impl.getChoices(remoteInput), Api20Impl.getAllowFreeFormInput(remoteInput), Build.VERSION.SDK_INT >= 29 ? Api29Impl.getEditChoicesBeforeSending(remoteInput) : 0, Api20Impl.getExtras(remoteInput), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong(KEY_TIMESTAMP));
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.mLargeIcon;
            if (bitmap != null) {
                bundle.putParcelable(EXTRA_LARGE_ICON, bitmap);
            }
            int i = this.mColor;
            if (i != 0) {
                bundle.putInt(EXTRA_COLOR, i);
            }
            UnreadConversation unreadConversation = this.mUnreadConversation;
            if (unreadConversation != null) {
                bundle.putBundle(EXTRA_CONVERSATION, getBundleForUnreadConversation(unreadConversation));
            }
            builder.getExtras().putBundle(EXTRA_CAR_EXTENDER, bundle);
            return builder;
        }

        @ColorInt
        public int getColor() {
            return this.mColor;
        }

        @Nullable
        public Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }

        @Nullable
        @Deprecated
        public UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }

        @NonNull
        public CarExtender setColor(@ColorInt int i) {
            this.mColor = i;
            return this;
        }

        @NonNull
        public CarExtender setLargeIcon(@Nullable Bitmap bitmap) {
            this.mLargeIcon = bitmap;
            return this;
        }

        @NonNull
        @Deprecated
        public CarExtender setUnreadConversation(@Nullable UnreadConversation unreadConversation) {
            this.mUnreadConversation = unreadConversation;
            return this;
        }

        public CarExtender() {
            this.mColor = 0;
        }
    }

    public static final class TvExtender implements Extender {
        static final String EXTRA_CHANNEL_ID = "channel_id";
        static final String EXTRA_CONTENT_INTENT = "content_intent";
        static final String EXTRA_DELETE_INTENT = "delete_intent";

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        private static final String EXTRA_FLAGS = "flags";
        static final String EXTRA_SUPPRESS_SHOW_OVER_APPS = "suppressShowOverApps";

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String EXTRA_TV_EXTENDER = "android.tv.EXTENSIONS";
        private static final int FLAG_AVAILABLE_ON_TV = 1;
        private static final String TAG = "TvExtender";
        private String mChannelId;
        private PendingIntent mContentIntent;
        private PendingIntent mDeleteIntent;
        private int mFlags;
        private boolean mSuppressShowOverApps;

        public TvExtender(@NonNull Notification notification) {
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle(EXTRA_TV_EXTENDER);
            if (bundle2 != null) {
                this.mFlags = bundle2.getInt(EXTRA_FLAGS);
                this.mChannelId = bundle2.getString(EXTRA_CHANNEL_ID);
                this.mSuppressShowOverApps = bundle2.getBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS);
                this.mContentIntent = (PendingIntent) bundle2.getParcelable(EXTRA_CONTENT_INTENT);
                this.mDeleteIntent = (PendingIntent) bundle2.getParcelable(EXTRA_DELETE_INTENT);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            if (Build.VERSION.SDK_INT < 26) {
                return builder;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(EXTRA_FLAGS, this.mFlags);
            bundle.putString(EXTRA_CHANNEL_ID, this.mChannelId);
            bundle.putBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS, this.mSuppressShowOverApps);
            PendingIntent pendingIntent = this.mContentIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(EXTRA_CONTENT_INTENT, pendingIntent);
            }
            PendingIntent pendingIntent2 = this.mDeleteIntent;
            if (pendingIntent2 != null) {
                bundle.putParcelable(EXTRA_DELETE_INTENT, pendingIntent2);
            }
            builder.getExtras().putBundle(EXTRA_TV_EXTENDER, bundle);
            return builder;
        }

        @Nullable
        public String getChannelId() {
            return this.mChannelId;
        }

        @Nullable
        public PendingIntent getContentIntent() {
            return this.mContentIntent;
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        public boolean isAvailableOnTv() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isSuppressShowOverApps() {
            return this.mSuppressShowOverApps;
        }

        @NonNull
        public TvExtender setChannelId(@Nullable String str) {
            this.mChannelId = str;
            return this;
        }

        @NonNull
        public TvExtender setContentIntent(@Nullable PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        @NonNull
        public TvExtender setDeleteIntent(@Nullable PendingIntent pendingIntent) {
            this.mDeleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public TvExtender setSuppressShowOverApps(boolean z) {
            this.mSuppressShowOverApps = z;
            return this;
        }

        public TvExtender() {
            this.mFlags = 1;
        }
    }

    public static final class WearableExtender implements Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";

        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;

        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;

        @Deprecated
        public static final int SIZE_DEFAULT = 0;

        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;

        @Deprecated
        public static final int SIZE_LARGE = 4;

        @Deprecated
        public static final int SIZE_MEDIUM = 3;

        @Deprecated
        public static final int SIZE_SMALL = 2;

        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList<Action> mActions;
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages;

        @RequiresApi(20)
        public static class Api20Impl {
            private Api20Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            public static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            public static Notification.Action build(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static Notification.Action.Builder createBuilder(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }

            @DoNotInline
            public static Action getActionCompatFromAction(ArrayList<Parcelable> arrayList, int i) {
                return NotificationCompat.getActionCompatFromAction((Notification.Action) arrayList.get(i));
            }
        }

        @RequiresApi(23)
        public static class Api23Impl {
            private Api23Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder createBuilder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        @RequiresApi(31)
        public static class Api31Impl {
            private Api31Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }
        }

        public WearableExtender(@NonNull Notification notification) {
            this.mActions = new ArrayList<>();
            this.mFlags = 1;
            this.mPages = new ArrayList<>();
            this.mContentIconGravity = DEFAULT_CONTENT_ICON_GRAVITY;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
            Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle = extras != null ? extras.getBundle(EXTRA_WEARABLE_EXTENSIONS) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    Action[] actionArr = new Action[size];
                    for (int i = 0; i < size; i++) {
                        actionArr[i] = Api20Impl.getActionCompatFromAction(parcelableArrayList, i);
                    }
                    Collections.addAll(this.mActions, actionArr);
                }
                this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                this.mDisplayIntent = (PendingIntent) bundle.getParcelable(KEY_DISPLAY_INTENT);
                Notification[] notificationArrayFromBundle = NotificationCompat.getNotificationArrayFromBundle(bundle, KEY_PAGES);
                if (notificationArrayFromBundle != null) {
                    Collections.addAll(this.mPages, notificationArrayFromBundle);
                }
                this.mBackground = (Bitmap) bundle.getParcelable("background");
                this.mContentIcon = bundle.getInt(KEY_CONTENT_ICON);
                this.mContentIconGravity = bundle.getInt(KEY_CONTENT_ICON_GRAVITY, DEFAULT_CONTENT_ICON_GRAVITY);
                this.mContentActionIndex = bundle.getInt(KEY_CONTENT_ACTION_INDEX, -1);
                this.mCustomSizePreset = bundle.getInt(KEY_CUSTOM_SIZE_PRESET, 0);
                this.mCustomContentHeight = bundle.getInt(KEY_CUSTOM_CONTENT_HEIGHT);
                this.mGravity = bundle.getInt(KEY_GRAVITY, 80);
                this.mHintScreenTimeout = bundle.getInt(KEY_HINT_SCREEN_TIMEOUT);
                this.mDismissalId = bundle.getString(KEY_DISMISSAL_ID);
                this.mBridgeTag = bundle.getString(KEY_BRIDGE_TAG);
            }
        }

        @RequiresApi(20)
        private static Notification.Action getActionFromActionCompat(Action action) {
            IconCompat iconCompat = action.getIconCompat();
            Notification.Action.Builder builderCreateBuilder = Api23Impl.createBuilder(iconCompat == null ? null : iconCompat.m1312x(), action.getTitle(), action.getActionIntent());
            Bundle bundle = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            Api24Impl.setAllowGeneratedReplies(builderCreateBuilder, action.getAllowGeneratedReplies());
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.setAuthenticationRequired(builderCreateBuilder, action.isAuthenticationRequired());
            }
            Api20Impl.addExtras(builderCreateBuilder, bundle);
            rqc0[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (RemoteInput remoteInput : rqc0.m180412b(remoteInputs)) {
                    Api20Impl.addRemoteInput(builderCreateBuilder, remoteInput);
                }
            }
            return Api20Impl.build(builderCreateBuilder);
        }

        private void setFlag(int i, boolean z) {
            int i2 = this.mFlags;
            if (z) {
                this.mFlags = i | i2;
            } else {
                this.mFlags = (~i) & i2;
            }
        }

        @NonNull
        public WearableExtender addAction(@NonNull Action action) {
            this.mActions.add(action);
            return this;
        }

        @NonNull
        public WearableExtender addActions(@NonNull List<Action> list) {
            this.mActions.addAll(list);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPage(@NonNull Notification notification) {
            this.mPages.add(notification);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPages(@NonNull List<Notification> list) {
            this.mPages.addAll(list);
            return this;
        }

        @NonNull
        public WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public WearableExtender m223787clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.mActions = new ArrayList<>(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mDisplayIntent = this.mDisplayIntent;
            wearableExtender.mPages = new ArrayList<>(this.mPages);
            wearableExtender.mBackground = this.mBackground;
            wearableExtender.mContentIcon = this.mContentIcon;
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mCustomSizePreset = this.mCustomSizePreset;
            wearableExtender.mCustomContentHeight = this.mCustomContentHeight;
            wearableExtender.mGravity = this.mGravity;
            wearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
            wearableExtender.mDismissalId = this.mDismissalId;
            wearableExtender.mBridgeTag = this.mBridgeTag;
            return wearableExtender;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            if (!this.mActions.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.mActions.size());
                Iterator<Action> it = this.mActions.iterator();
                while (it.hasNext()) {
                    arrayList.add(getActionFromActionCompat(it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i = this.mFlags;
            if (i != 1) {
                bundle.putInt(KEY_FLAGS, i);
            }
            PendingIntent pendingIntent = this.mDisplayIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(KEY_DISPLAY_INTENT, pendingIntent);
            }
            if (!this.mPages.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.mPages;
                bundle.putParcelableArray(KEY_PAGES, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.mBackground;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i2 = this.mContentIcon;
            if (i2 != 0) {
                bundle.putInt(KEY_CONTENT_ICON, i2);
            }
            int i3 = this.mContentIconGravity;
            if (i3 != DEFAULT_CONTENT_ICON_GRAVITY) {
                bundle.putInt(KEY_CONTENT_ICON_GRAVITY, i3);
            }
            int i4 = this.mContentActionIndex;
            if (i4 != -1) {
                bundle.putInt(KEY_CONTENT_ACTION_INDEX, i4);
            }
            int i5 = this.mCustomSizePreset;
            if (i5 != 0) {
                bundle.putInt(KEY_CUSTOM_SIZE_PRESET, i5);
            }
            int i6 = this.mCustomContentHeight;
            if (i6 != 0) {
                bundle.putInt(KEY_CUSTOM_CONTENT_HEIGHT, i6);
            }
            int i7 = this.mGravity;
            if (i7 != 80) {
                bundle.putInt(KEY_GRAVITY, i7);
            }
            int i8 = this.mHintScreenTimeout;
            if (i8 != 0) {
                bundle.putInt(KEY_HINT_SCREEN_TIMEOUT, i8);
            }
            String str = this.mDismissalId;
            if (str != null) {
                bundle.putString(KEY_DISMISSAL_ID, str);
            }
            String str2 = this.mBridgeTag;
            if (str2 != null) {
                bundle.putString(KEY_BRIDGE_TAG, str2);
            }
            builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
            return builder;
        }

        @NonNull
        public List<Action> getActions() {
            return this.mActions;
        }

        @Nullable
        @Deprecated
        public Bitmap getBackground() {
            return this.mBackground;
        }

        @Nullable
        public String getBridgeTag() {
            return this.mBridgeTag;
        }

        public int getContentAction() {
            return this.mContentActionIndex;
        }

        @Deprecated
        public int getContentIcon() {
            return this.mContentIcon;
        }

        @Deprecated
        public int getContentIconGravity() {
            return this.mContentIconGravity;
        }

        public boolean getContentIntentAvailableOffline() {
            return (this.mFlags & 1) != 0;
        }

        @Deprecated
        public int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }

        @Deprecated
        public int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }

        @Nullable
        public String getDismissalId() {
            return this.mDismissalId;
        }

        @Nullable
        @Deprecated
        public PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }

        @Deprecated
        public int getGravity() {
            return this.mGravity;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            return (this.mFlags & 32) != 0;
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            return (this.mFlags & 16) != 0;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            return (this.mFlags & 64) != 0;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            return (this.mFlags & 2) != 0;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            return (this.mFlags & 4) != 0;
        }

        @NonNull
        @Deprecated
        public List<Notification> getPages() {
            return this.mPages;
        }

        public boolean getStartScrollBottom() {
            return (this.mFlags & 8) != 0;
        }

        @NonNull
        @Deprecated
        public WearableExtender setBackground(@Nullable Bitmap bitmap) {
            this.mBackground = bitmap;
            return this;
        }

        @NonNull
        public WearableExtender setBridgeTag(@Nullable String str) {
            this.mBridgeTag = str;
            return this;
        }

        @NonNull
        public WearableExtender setContentAction(int i) {
            this.mContentActionIndex = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIcon(int i) {
            this.mContentIcon = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIconGravity(int i) {
            this.mContentIconGravity = i;
            return this;
        }

        @NonNull
        public WearableExtender setContentIntentAvailableOffline(boolean z) {
            setFlag(1, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomContentHeight(int i) {
            this.mCustomContentHeight = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomSizePreset(int i) {
            this.mCustomSizePreset = i;
            return this;
        }

        @NonNull
        public WearableExtender setDismissalId(@Nullable String str) {
            this.mDismissalId = str;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setDisplayIntent(@Nullable PendingIntent pendingIntent) {
            this.mDisplayIntent = pendingIntent;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setGravity(int i) {
            this.mGravity = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean z) {
            setFlag(32, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            setFlag(16, z);
            return this;
        }

        @NonNull
        public WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            setFlag(64, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintHideIcon(boolean z) {
            setFlag(2, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintScreenTimeout(int i) {
            this.mHintScreenTimeout = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean z) {
            setFlag(4, z);
            return this;
        }

        @NonNull
        public WearableExtender setStartScrollBottom(boolean z) {
            setFlag(8, z);
            return this;
        }

        public WearableExtender() {
            this.mActions = new ArrayList<>();
            this.mFlags = 1;
            this.mPages = new ArrayList<>();
            this.mContentIconGravity = DEFAULT_CONTENT_ICON_GRAVITY;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
        }
    }
}

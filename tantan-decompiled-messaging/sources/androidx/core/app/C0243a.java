package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.i01;
import p149l.iwv;
import p149l.rqc0;
import p149l.zp40;

/* JADX INFO: renamed from: androidx.core.app.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C0243a implements zp40 {

    /* JADX INFO: renamed from: a */
    public final Context f1425a;

    /* JADX INFO: renamed from: b */
    public final Notification.Builder f1426b;

    /* JADX INFO: renamed from: c */
    public final NotificationCompat.Builder f1427c;

    /* JADX INFO: renamed from: d */
    public RemoteViews f1428d;

    /* JADX INFO: renamed from: e */
    public RemoteViews f1429e;

    /* JADX INFO: renamed from: f */
    public final List<Bundle> f1430f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final Bundle f1431g = new Bundle();

    /* JADX INFO: renamed from: h */
    public int f1432h;

    /* JADX INFO: renamed from: i */
    public RemoteViews f1433i;

    /* JADX INFO: renamed from: androidx.core.app.a$a */
    @RequiresApi(20)
    public static class a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m1217a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Action.Builder m1218b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Action.Builder m1219c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Action m1220d(Notification.Action.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static String m1221e(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static Notification.Builder m1222f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static Notification.Builder m1223g(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: h */
        public static Notification.Builder m1224h(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: i */
        public static Notification.Builder m1225i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$b */
    @RequiresApi(21)
    public static class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m1226a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1227b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Builder m1228c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Builder m1229d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static Notification.Builder m1230e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static Notification.Builder m1231f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$c */
    @RequiresApi(23)
    public static class c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Action.Builder m1232a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1233b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Builder m1234c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$d */
    @RequiresApi(24)
    public static class d {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Action.Builder m1235a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1236b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Builder m1237c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Builder m1238d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static Notification.Builder m1239e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$e */
    @RequiresApi(26)
    public static class e {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m1240a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1241b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Builder m1242c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Builder m1243d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static Notification.Builder m1244e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static Notification.Builder m1245f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static Notification.Builder m1246g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$f */
    @RequiresApi(28)
    public static class f {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m1247a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Action.Builder m1248b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$g */
    @RequiresApi(29)
    public static class g {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m1249a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1250b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Action.Builder m1251c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Builder m1252d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$h */
    @RequiresApi(31)
    public static class h {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Action.Builder m1253a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1254b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public C0243a(NotificationCompat.Builder builder) {
        int i;
        this.f1427c = builder;
        Context context = builder.mContext;
        this.f1425a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1426b = e.m1240a(context, builder.mChannelId);
        } else {
            this.f1426b = new Notification.Builder(builder.mContext);
        }
        Notification notification = builder.mNotification;
        this.f1426b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        Notification.Builder builder2 = this.f1426b;
        IconCompat iconCompat = builder.mLargeIcon;
        c.m1233b(builder2, iconCompat == null ? null : iconCompat.m1313y(context));
        this.f1426b.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        NotificationCompat.Style style = builder.mStyle;
        if (style instanceof NotificationCompat.CallStyle) {
            Iterator<NotificationCompat.Action> it = ((NotificationCompat.CallStyle) style).getActionsListWithSystemActions().iterator();
            while (it.hasNext()) {
                m1212b(it.next());
            }
        } else {
            Iterator<NotificationCompat.Action> it2 = builder.mActions.iterator();
            while (it2.hasNext()) {
                m1212b(it2.next());
            }
        }
        Bundle bundle = builder.mExtras;
        if (bundle != null) {
            this.f1431g.putAll(bundle);
        }
        this.f1428d = builder.mContentView;
        this.f1429e = builder.mBigContentView;
        this.f1426b.setShowWhen(builder.mShowWhen);
        a.m1224h(this.f1426b, builder.mLocalOnly);
        a.m1222f(this.f1426b, builder.mGroupKey);
        a.m1225i(this.f1426b, builder.mSortKey);
        a.m1223g(this.f1426b, builder.mGroupSummary);
        this.f1432h = builder.mGroupAlertBehavior;
        b.m1227b(this.f1426b, builder.mCategory);
        b.m1228c(this.f1426b, builder.mColor);
        b.m1231f(this.f1426b, builder.mVisibility);
        b.m1229d(this.f1426b, builder.mPublicVersion);
        b.m1230e(this.f1426b, notification.sound, notification.audioAttributes);
        List listM1209e = Build.VERSION.SDK_INT < 28 ? m1209e(m1210g(builder.mPersonList), builder.mPeople) : builder.mPeople;
        if (listM1209e != null && !listM1209e.isEmpty()) {
            Iterator it3 = listM1209e.iterator();
            while (it3.hasNext()) {
                b.m1226a(this.f1426b, (String) it3.next());
            }
        }
        this.f1433i = builder.mHeadsUpContentView;
        if (builder.mInvisibleActions.size() > 0) {
            Bundle bundle2 = builder.getExtras().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i2 = 0; i2 < builder.mInvisibleActions.size(); i2++) {
                bundle4.putBundle(Integer.toString(i2), C0244b.m1259e(builder.mInvisibleActions.get(i2)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1431g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Object obj = builder.mSmallIcon;
        if (obj != null) {
            c.m1234c(this.f1426b, obj);
        }
        this.f1426b.setExtras(builder.mExtras);
        d.m1239e(this.f1426b, builder.mRemoteInputHistory);
        RemoteViews remoteViews = builder.mContentView;
        if (remoteViews != null) {
            d.m1237c(this.f1426b, remoteViews);
        }
        RemoteViews remoteViews2 = builder.mBigContentView;
        if (remoteViews2 != null) {
            d.m1236b(this.f1426b, remoteViews2);
        }
        RemoteViews remoteViews3 = builder.mHeadsUpContentView;
        if (remoteViews3 != null) {
            d.m1238d(this.f1426b, remoteViews3);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            e.m1241b(this.f1426b, builder.mBadgeIcon);
            e.m1244e(this.f1426b, builder.mSettingsText);
            e.m1245f(this.f1426b, builder.mShortcutId);
            e.m1246g(this.f1426b, builder.mTimeout);
            e.m1243d(this.f1426b, builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                e.m1242c(this.f1426b, builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.f1426b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i3 >= 28) {
            Iterator<C0245c> it4 = builder.mPersonList.iterator();
            while (it4.hasNext()) {
                f.m1247a(this.f1426b, it4.next().m1271j());
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            g.m1249a(this.f1426b, builder.mAllowSystemGeneratedContextualActions);
            g.m1250b(this.f1426b, NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            iwv iwvVar = builder.mLocusId;
            if (iwvVar != null) {
                g.m1252d(this.f1426b, iwvVar.m138764b());
            }
        }
        if (i4 >= 31 && (i = builder.mFgsDeferBehavior) != 0) {
            h.m1254b(this.f1426b, i);
        }
        if (builder.mSilent) {
            if (this.f1427c.mGroupSummary) {
                this.f1432h = 2;
            } else {
                this.f1432h = 1;
            }
            this.f1426b.setVibrate(null);
            this.f1426b.setSound(null);
            int i5 = notification.defaults & (-4);
            notification.defaults = i5;
            this.f1426b.setDefaults(i5);
            if (i4 >= 26) {
                if (TextUtils.isEmpty(this.f1427c.mGroupKey)) {
                    a.m1222f(this.f1426b, NotificationCompat.GROUP_KEY_SILENT);
                }
                e.m1243d(this.f1426b, this.f1432h);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static List<String> m1209e(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        i01 i01Var = new i01(list.size() + list2.size());
        i01Var.addAll(list);
        i01Var.addAll(list2);
        return new ArrayList(i01Var);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static List<String> m1210g(@Nullable List<C0245c> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C0245c> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m1270i());
        }
        return arrayList;
    }

    @Override // p149l.zp40
    /* JADX INFO: renamed from: a */
    public Notification.Builder mo1211a() {
        return this.f1426b;
    }

    /* JADX INFO: renamed from: b */
    public final void m1212b(NotificationCompat.Action action) {
        IconCompat iconCompat = action.getIconCompat();
        Notification.Action.Builder builderM1232a = c.m1232a(iconCompat != null ? iconCompat.m1312x() : null, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (RemoteInput remoteInput : rqc0.m180412b(action.getRemoteInputs())) {
                a.m1219c(builderM1232a, remoteInput);
            }
        }
        Bundle bundle = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        d.m1235a(builderM1232a, action.getAllowGeneratedReplies());
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f.m1248b(builderM1232a, action.getSemanticAction());
        }
        if (i >= 29) {
            g.m1251c(builderM1232a, action.isContextual());
        }
        if (i >= 31) {
            h.m1253a(builderM1232a, action.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        a.m1218b(builderM1232a, bundle);
        a.m1217a(this.f1426b, a.m1220d(builderM1232a));
    }

    /* JADX INFO: renamed from: c */
    public Notification m1213c() {
        Bundle extras;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        NotificationCompat.Style style = this.f1427c.mStyle;
        if (style != null) {
            style.apply(this);
        }
        RemoteViews remoteViewsMakeContentView = style != null ? style.makeContentView(this) : null;
        Notification notificationM1214d = m1214d();
        if (remoteViewsMakeContentView != null) {
            notificationM1214d.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = this.f1427c.mContentView;
            if (remoteViews != null) {
                notificationM1214d.contentView = remoteViews;
            }
        }
        if (style != null && (remoteViewsMakeBigContentView = style.makeBigContentView(this)) != null) {
            notificationM1214d.bigContentView = remoteViewsMakeBigContentView;
        }
        if (style != null && (remoteViewsMakeHeadsUpContentView = this.f1427c.mStyle.makeHeadsUpContentView(this)) != null) {
            notificationM1214d.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (style != null && (extras = NotificationCompat.getExtras(notificationM1214d)) != null) {
            style.addCompatExtras(extras);
        }
        return notificationM1214d;
    }

    /* JADX INFO: renamed from: d */
    public Notification m1214d() {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = this.f1426b;
        if (i >= 26) {
            return builder.build();
        }
        Notification notificationBuild = builder.build();
        if (this.f1432h != 0) {
            if (a.m1221e(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f1432h == 2) {
                m1216h(notificationBuild);
            }
            if (a.m1221e(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f1432h == 1) {
                m1216h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: f */
    public Context m1215f() {
        return this.f1425a;
    }

    /* JADX INFO: renamed from: h */
    public final void m1216h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}

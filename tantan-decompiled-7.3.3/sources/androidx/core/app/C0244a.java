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
import p153l.jyv;
import p153l.ny40;
import p153l.p01;
import p153l.wyc0;

/* JADX INFO: renamed from: androidx.core.app.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C0244a implements ny40 {

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
        public static Notification.Builder m1218a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Action.Builder m1219b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Action.Builder m1220c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Action m1221d(Notification.Action.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static String m1222e(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static Notification.Builder m1223f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static Notification.Builder m1224g(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: h */
        public static Notification.Builder m1225h(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: i */
        public static Notification.Builder m1226i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$b */
    @RequiresApi(21)
    public static class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m1227a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1228b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Builder m1229c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Builder m1230d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static Notification.Builder m1231e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static Notification.Builder m1232f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$c */
    @RequiresApi(23)
    public static class c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Action.Builder m1233a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1234b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Builder m1235c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$d */
    @RequiresApi(24)
    public static class d {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Action.Builder m1236a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1237b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Builder m1238c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Builder m1239d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static Notification.Builder m1240e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$e */
    @RequiresApi(26)
    public static class e {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m1241a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1242b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Builder m1243c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Builder m1244d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static Notification.Builder m1245e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static Notification.Builder m1246f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static Notification.Builder m1247g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$f */
    @RequiresApi(28)
    public static class f {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m1248a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Action.Builder m1249b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$g */
    @RequiresApi(29)
    public static class g {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m1250a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1251b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Notification.Action.Builder m1252c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Notification.Builder m1253d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.a$h */
    @RequiresApi(31)
    public static class h {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Notification.Action.Builder m1254a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Notification.Builder m1255b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public C0244a(NotificationCompat.Builder builder) {
        int i;
        this.f1427c = builder;
        Context context = builder.mContext;
        this.f1425a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1426b = e.m1241a(context, builder.mChannelId);
        } else {
            this.f1426b = new Notification.Builder(builder.mContext);
        }
        Notification notification = builder.mNotification;
        this.f1426b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        Notification.Builder builder2 = this.f1426b;
        IconCompat iconCompat = builder.mLargeIcon;
        c.m1234b(builder2, iconCompat == null ? null : iconCompat.m1314y(context));
        this.f1426b.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        NotificationCompat.Style style = builder.mStyle;
        if (style instanceof NotificationCompat.CallStyle) {
            Iterator<NotificationCompat.Action> it = ((NotificationCompat.CallStyle) style).getActionsListWithSystemActions().iterator();
            while (it.hasNext()) {
                m1213b(it.next());
            }
        } else {
            Iterator<NotificationCompat.Action> it2 = builder.mActions.iterator();
            while (it2.hasNext()) {
                m1213b(it2.next());
            }
        }
        Bundle bundle = builder.mExtras;
        if (bundle != null) {
            this.f1431g.putAll(bundle);
        }
        this.f1428d = builder.mContentView;
        this.f1429e = builder.mBigContentView;
        this.f1426b.setShowWhen(builder.mShowWhen);
        a.m1225h(this.f1426b, builder.mLocalOnly);
        a.m1223f(this.f1426b, builder.mGroupKey);
        a.m1226i(this.f1426b, builder.mSortKey);
        a.m1224g(this.f1426b, builder.mGroupSummary);
        this.f1432h = builder.mGroupAlertBehavior;
        b.m1228b(this.f1426b, builder.mCategory);
        b.m1229c(this.f1426b, builder.mColor);
        b.m1232f(this.f1426b, builder.mVisibility);
        b.m1230d(this.f1426b, builder.mPublicVersion);
        b.m1231e(this.f1426b, notification.sound, notification.audioAttributes);
        List listM1210e = Build.VERSION.SDK_INT < 28 ? m1210e(m1211g(builder.mPersonList), builder.mPeople) : builder.mPeople;
        if (listM1210e != null && !listM1210e.isEmpty()) {
            Iterator it3 = listM1210e.iterator();
            while (it3.hasNext()) {
                b.m1227a(this.f1426b, (String) it3.next());
            }
        }
        this.f1433i = builder.mHeadsUpContentView;
        if (builder.mInvisibleActions.size() > 0) {
            Bundle bundle2 = builder.getExtras().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i2 = 0; i2 < builder.mInvisibleActions.size(); i2++) {
                bundle4.putBundle(Integer.toString(i2), C0245b.m1260e(builder.mInvisibleActions.get(i2)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1431g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Object obj = builder.mSmallIcon;
        if (obj != null) {
            c.m1235c(this.f1426b, obj);
        }
        this.f1426b.setExtras(builder.mExtras);
        d.m1240e(this.f1426b, builder.mRemoteInputHistory);
        RemoteViews remoteViews = builder.mContentView;
        if (remoteViews != null) {
            d.m1238c(this.f1426b, remoteViews);
        }
        RemoteViews remoteViews2 = builder.mBigContentView;
        if (remoteViews2 != null) {
            d.m1237b(this.f1426b, remoteViews2);
        }
        RemoteViews remoteViews3 = builder.mHeadsUpContentView;
        if (remoteViews3 != null) {
            d.m1239d(this.f1426b, remoteViews3);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            e.m1242b(this.f1426b, builder.mBadgeIcon);
            e.m1245e(this.f1426b, builder.mSettingsText);
            e.m1246f(this.f1426b, builder.mShortcutId);
            e.m1247g(this.f1426b, builder.mTimeout);
            e.m1244d(this.f1426b, builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                e.m1243c(this.f1426b, builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.f1426b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i3 >= 28) {
            Iterator<C0246c> it4 = builder.mPersonList.iterator();
            while (it4.hasNext()) {
                f.m1248a(this.f1426b, it4.next().m1272j());
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            g.m1250a(this.f1426b, builder.mAllowSystemGeneratedContextualActions);
            g.m1251b(this.f1426b, NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            jyv jyvVar = builder.mLocusId;
            if (jyvVar != null) {
                g.m1253d(this.f1426b, jyvVar.m147626b());
            }
        }
        if (i4 >= 31 && (i = builder.mFgsDeferBehavior) != 0) {
            h.m1255b(this.f1426b, i);
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
                    a.m1223f(this.f1426b, NotificationCompat.GROUP_KEY_SILENT);
                }
                e.m1244d(this.f1426b, this.f1432h);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static List<String> m1210e(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        p01 p01Var = new p01(list.size() + list2.size());
        p01Var.addAll(list);
        p01Var.addAll(list2);
        return new ArrayList(p01Var);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static List<String> m1211g(@Nullable List<C0246c> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C0246c> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m1271i());
        }
        return arrayList;
    }

    @Override // p153l.ny40
    /* JADX INFO: renamed from: a */
    public Notification.Builder mo1212a() {
        return this.f1426b;
    }

    /* JADX INFO: renamed from: b */
    public final void m1213b(NotificationCompat.Action action) {
        IconCompat iconCompat = action.getIconCompat();
        Notification.Action.Builder builderM1233a = c.m1233a(iconCompat != null ? iconCompat.m1313x() : null, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (RemoteInput remoteInput : wyc0.m208584b(action.getRemoteInputs())) {
                a.m1220c(builderM1233a, remoteInput);
            }
        }
        Bundle bundle = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        d.m1236a(builderM1233a, action.getAllowGeneratedReplies());
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f.m1249b(builderM1233a, action.getSemanticAction());
        }
        if (i >= 29) {
            g.m1252c(builderM1233a, action.isContextual());
        }
        if (i >= 31) {
            h.m1254a(builderM1233a, action.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        a.m1219b(builderM1233a, bundle);
        a.m1218a(this.f1426b, a.m1221d(builderM1233a));
    }

    /* JADX INFO: renamed from: c */
    public Notification m1214c() {
        Bundle extras;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        NotificationCompat.Style style = this.f1427c.mStyle;
        if (style != null) {
            style.apply(this);
        }
        RemoteViews remoteViewsMakeContentView = style != null ? style.makeContentView(this) : null;
        Notification notificationM1215d = m1215d();
        if (remoteViewsMakeContentView != null) {
            notificationM1215d.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = this.f1427c.mContentView;
            if (remoteViews != null) {
                notificationM1215d.contentView = remoteViews;
            }
        }
        if (style != null && (remoteViewsMakeBigContentView = style.makeBigContentView(this)) != null) {
            notificationM1215d.bigContentView = remoteViewsMakeBigContentView;
        }
        if (style != null && (remoteViewsMakeHeadsUpContentView = this.f1427c.mStyle.makeHeadsUpContentView(this)) != null) {
            notificationM1215d.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (style != null && (extras = NotificationCompat.getExtras(notificationM1215d)) != null) {
            style.addCompatExtras(extras);
        }
        return notificationM1215d;
    }

    /* JADX INFO: renamed from: d */
    public Notification m1215d() {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = this.f1426b;
        if (i >= 26) {
            return builder.build();
        }
        Notification notificationBuild = builder.build();
        if (this.f1432h != 0) {
            if (a.m1222e(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f1432h == 2) {
                m1217h(notificationBuild);
            }
            if (a.m1222e(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f1432h == 1) {
                m1217h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: f */
    public Context m1216f() {
        return this.f1425a;
    }

    /* JADX INFO: renamed from: h */
    public final void m1217h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}

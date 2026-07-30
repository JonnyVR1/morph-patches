package p009l;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.p000p1.mobile.putong.p004ui.splash.SplashProxyAct;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.regex.Pattern;
import l.e30;
import l.e51;
import l.e6c0;
import l.edb0;
import l.jjb0;
import l.nr40;
import l.qib0;
import l.s4c0;
import l.t100;
import l.v0c0;
import l.w2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mgh0 {

    /* JADX INFO: renamed from: a */
    public static final int f16892a = Color.parseColor("#ffffff");

    /* JADX INFO: renamed from: b */
    public static final int f16893b = Color.parseColor("#212121");

    /* JADX INFO: renamed from: c */
    public static final int f16894c = Color.parseColor("#757575");

    /* JADX INFO: renamed from: d */
    public static nr40 f16895d;

    /* JADX INFO: renamed from: e */
    public static final HashMap<Integer, PushMessage> f16896e;

    /* JADX INFO: renamed from: l.mgh0$a */
    public class C1030a implements e30<Bitmap> {

        /* JADX INFO: renamed from: a */
        public boolean f16897a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f16898b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f16899c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ PushMessage f16900d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ NotificationCompat.Builder f16901e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f16902f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f16903g;

        public C1030a(int i, String str, PushMessage pushMessage, NotificationCompat.Builder builder, int i2, boolean z) {
            this.f16898b = i;
            this.f16899c = str;
            this.f16900d = pushMessage;
            this.f16901e = builder;
            this.f16902f = i2;
            this.f16903g = z;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            String strSubSequence;
            if (!this.f16897a) {
                int i = this.f16898b;
                String str = this.f16899c;
                if (i > 0) {
                    strSubSequence = str;
                    strSubSequence = str.subSequence(0, i);
                }
                strSubSequence = str;
                String str2 = Build.BRAND;
                if ("Meizu".equals(str2) || "Xiaomi".equals(str2)) {
                    RemoteViews remoteViews = new RemoteViews(App.e.getPackageName(), e6c0.P);
                    remoteViews.setTextViewText(s4c0.i0, this.f16900d.title);
                    remoteViews.setTextViewText(s4c0.g0, strSubSequence);
                    remoteViews.setImageViewBitmap(s4c0.h0, bitmap);
                    RemoteViews remoteViews2 = new RemoteViews(App.e.getPackageName(), e6c0.O);
                    remoteViews2.setTextViewText(s4c0.f0, this.f16900d.title);
                    remoteViews2.setTextViewText(s4c0.d0, strSubSequence);
                    remoteViews2.setImageViewBitmap(s4c0.e0, bitmap);
                    if ("Meizu".equals(str2)) {
                        remoteViews.setTextColor(s4c0.i0, mgh0.f16892a);
                        remoteViews.setTextColor(s4c0.g0, mgh0.f16892a);
                        remoteViews2.setTextColor(s4c0.f0, mgh0.f16892a);
                        remoteViews2.setTextColor(s4c0.d0, mgh0.f16892a);
                    } else {
                        remoteViews.setTextColor(s4c0.i0, mgh0.f16893b);
                        remoteViews.setTextColor(s4c0.g0, mgh0.f16894c);
                        remoteViews2.setTextColor(s4c0.f0, mgh0.f16893b);
                        remoteViews2.setTextColor(s4c0.d0, mgh0.f16894c);
                    }
                    this.f16901e.setCustomBigContentView(remoteViews2);
                    this.f16901e.setCustomContentView(remoteViews);
                    this.f16901e.setStyle(new NotificationCompat.DecoratedCustomViewStyle());
                    mgh0.m18459m(this.f16900d, null, this.f16901e, this.f16902f, this.f16903g);
                } else {
                    NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                    bigPictureStyle.bigPicture(bitmap);
                    bigPictureStyle.bigLargeIcon(BitmapFactory.decodeResource(App.e.getResources(), w2c0.h0));
                    this.f16901e.setStyle(bigPictureStyle);
                    mgh0.m18459m(this.f16900d, bitmap, this.f16901e, this.f16902f, this.f16903g);
                }
            }
            this.f16897a = true;
        }
    }

    /* JADX INFO: renamed from: l.mgh0$b */
    public class C1031b implements e30<Bitmap> {

        /* JADX INFO: renamed from: a */
        public boolean f16904a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f16905b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PushMessage f16906c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ NotificationCompat.Builder f16907d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f16908e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f16909f;

        public C1031b(User user, PushMessage pushMessage, NotificationCompat.Builder builder, int i, boolean z) {
            this.f16905b = user;
            this.f16906c = pushMessage;
            this.f16907d = builder;
            this.f16908e = i;
            this.f16909f = z;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            if (this.f16904a) {
                return;
            }
            if (jjb0.e() && NullChecker.a(bitmap) && NullChecker.a(this.f16905b) && this.f16905b.onlineMatchLocked()) {
                bitmap = yij0.m25415o(bitmap, App.e.getResources().getColor(v0c0.j), t100.d(6.0f));
            }
            mgh0.m18459m(this.f16906c, bitmap, this.f16907d, this.f16908e, this.f16909f);
            this.f16904a = true;
        }
    }

    static {
        f16895d = null;
        f16895d = nr40.e(App.e);
        dr40.m13455d();
        f16896e = new HashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static void m18450d(Intent intent, boolean z, boolean z2) {
        intent.putExtra("bundle_from_notification", z);
        intent.putExtra("bundle_is_idle_push", z2);
    }

    /* JADX INFO: renamed from: e */
    public static void m18451e(Intent intent, @Nullable PushTrackData pushTrackData) {
        if (NullChecker.a(pushTrackData)) {
            intent.putExtra("bundle_push_track_info", (Serializable) pushTrackData);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m18452f(PushMessage pushMessage, PendingIntent pendingIntent, Intent intent, NotificationCompat.Action action, NotificationCompat.Action action2) {
        NotificationCompat.Builder builderM13457f;
        NotificationCompat.BigTextStyle bigTextStyleBigText;
        if (pushMessage.silentAggregation && m18456j(pushMessage, f16896e.get(Integer.valueOf(pushMessage.stackId)))) {
            return;
        }
        try {
            int i = pushMessage.stackId;
            HashMap<Integer, PushMessage> map = f16896e;
            synchronized (map) {
                map.put(Integer.valueOf(i), pushMessage);
            }
            Pattern patternCompile = Pattern.compile("<[^>]+>", 2);
            String strReplaceAll = patternCompile.matcher(pushMessage.value).replaceAll("");
            int iIndexOf = strReplaceAll.indexOf(10);
            User userA = null;
            String strReplaceAll2 = NullChecker.a(pushMessage.ticker) ? patternCompile.matcher(pushMessage.ticker).replaceAll("") : null;
            qib0.H.guessedCurrentServerTime();
            boolean z = pushMessage.silent;
            if (z) {
                builderM13457f = dr40.m13458g(App.e);
                z = true;
            } else {
                builderM13457f = dr40.m13457f(App.e);
            }
            NotificationCompat.Builder contentText = builderM13457f.setDefaults(!z ? 2 : 0).setSound(z ? null : m18458l(pushMessage)).setSmallIcon(w2c0.A0).setOnlyAlertOnce(pushMessage.silentAggregation).setAutoCancel(true).setContentTitle(pushMessage.title).setContentText(iIndexOf > 0 ? strReplaceAll.subSequence(0, iIndexOf) : strReplaceAll);
            if (z || TextUtils.isEmpty(strReplaceAll2)) {
                strReplaceAll2 = null;
            }
            contentText.setTicker(strReplaceAll2).setContentIntent(pendingIntent);
            if (NullChecker.a(intent)) {
                builderM13457f.setDeleteIntent(PendingIntent.getBroadcast(App.e, (int) System.currentTimeMillis(), intent, 33554432));
            }
            String str = Build.BRAND;
            if ("OPPO".equals(str) && z) {
                builderM13457f.setVibrate(new long[0]);
            }
            double d = pushMessage.createdTime;
            if (d > 0.0d) {
                builderM13457f.setWhen((long) d);
            }
            if ((str == null || !"oppo".equals(str.toLowerCase())) && pushMessage.counter > 0) {
                builderM13457f.setContentInfo(pushMessage.counter + "");
            }
            if (NullChecker.a(action)) {
                builderM13457f.addAction(action);
            }
            if (NullChecker.a(action2)) {
                builderM13457f.addAction(action2);
            }
            int iM18460n = m18460n(pushMessage.priority);
            if (iM18460n == 99) {
                builderM13457f.setLights(-16711936, 1000, 2500);
            } else {
                builderM13457f.setPriority(iM18460n);
                if (iM18460n == 0 || iM18460n == 1 || iM18460n == 2) {
                    builderM13457f.setLights(-16711936, 1000, 2500);
                }
            }
            if (!edb0.c() || !NullChecker.a(pushMessage.messageCustom) || TextUtils.isEmpty(pushMessage.messageCustom.big_pic_url) || ("Xiaomi".equals(str) && Build.VERSION.SDK_INT < 27)) {
                NotificationCompat.Builder builder = builderM13457f;
                boolean z2 = z;
                if (pushMessage.counter > 1) {
                    bigTextStyleBigText = new NotificationCompat.BigTextStyle().setBigContentTitle(pushMessage.title).setSummaryText(pushMessage.counter + "").bigText(strReplaceAll);
                } else {
                    bigTextStyleBigText = new NotificationCompat.BigTextStyle().bigText(strReplaceAll);
                }
                builder.setStyle(bigTextStyleBigText);
                if (!NullChecker.a(pushMessage.primaryPicture) || pushMessage.primaryPicture.isEmpty() || !qib0.c0.signedIn_()) {
                    m18459m(pushMessage, null, builder, i, z2);
                    return;
                }
                if (!TextUtils.equals("conversation.group", pushMessage.intent)) {
                    if (TantanApp.c.N()) {
                        userA = qib0.c0.a(String.valueOf(pushMessage.stackId - 10000));
                    } else {
                        userA = pushMessage.user;
                    }
                }
                qib0.G.I(pushMessage.primaryPicture, new C1031b(userA, pushMessage, builder, i, z2));
                return;
            }
            qib0.G.I(pushMessage.messageCustom.big_pic_url, new C1030a(iIndexOf, strReplaceAll, pushMessage, builderM13457f, i, z));
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m18453g(int i) {
        HashMap<Integer, PushMessage> map = f16896e;
        synchronized (map) {
            try {
                if (map.containsKey(Integer.valueOf(i))) {
                    map.remove(Integer.valueOf(i));
                    f16895d.b(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m18454h() {
        f16895d.d();
        HashMap<Integer, PushMessage> map = f16896e;
        synchronized (map) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18455i(Intent intent) {
        if (intent == null) {
            return false;
        }
        boolean booleanExtra = intent.getBooleanExtra("bundle_from_notification", false);
        if (booleanExtra) {
            intent.putExtra("bundle_from_notification", false);
        }
        return booleanExtra;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18456j(PushMessage pushMessage, PushMessage pushMessage2) {
        if (!NullChecker.a(pushMessage2)) {
            return pushMessage == null;
        }
        PushMessage pushMessageClone = pushMessage2.clone();
        pushMessageClone.silentAggregation = pushMessage.silentAggregation;
        pushMessageClone.silent = pushMessage.silent;
        if (pushMessage.value.toString().equals(pushMessageClone.value.toString())) {
            pushMessageClone.value = pushMessage.value;
        }
        return pushMessageClone.equals(pushMessage);
    }

    /* JADX INFO: renamed from: k */
    public static <T extends BroadcastReceiver> Intent m18457k(String str, Class<T> cls) {
        Intent intent = new Intent((Context) App.e, (Class<?>) cls);
        intent.setAction(str);
        return intent;
    }

    /* JADX INFO: renamed from: l */
    public static Uri m18458l(PushMessage pushMessage) {
        return RingtoneManager.getDefaultUri(2);
    }

    /* JADX INFO: renamed from: m */
    public static void m18459m(PushMessage pushMessage, Bitmap bitmap, NotificationCompat.Builder builder, int i, boolean z) {
        if (!NullChecker.b(pushMessage) || !pushMessage.isNewUiCustom || !NullChecker.a(bitmap)) {
            m18461o(pushMessage, bitmap, builder, i, "");
            return;
        }
        if ("superLike.received".equals(pushMessage.intent)) {
            m18461o(pushMessage, bitmap, builder, i, pushMessage.messageCustom.nickname);
            return;
        }
        String str = pushMessage.content.id;
        if (str == null || str.isEmpty()) {
            User user = pushMessage.user;
            m18461o(pushMessage, bitmap, builder, i, user != null ? user.name : "");
        } else if (!qib0.c0.signedIn_()) {
            m18461o(pushMessage, bitmap, builder, i, "");
        } else {
            String str2 = pushMessage.content.id;
            m18461o(pushMessage, bitmap, builder, i, (e51.D() ? qib0.c0.a(str2) : qib0.k0.d.query(str2)).name);
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m18460n(int i) {
        if (i == 1) {
            return -2;
        }
        if (i == 2) {
            return -1;
        }
        if (i != 4) {
            return i != 5 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m18461o(PushMessage pushMessage, Bitmap bitmap, NotificationCompat.Builder builder, int i, String str) {
        if (NullChecker.a(str) && !str.isEmpty()) {
            RemoteViews remoteViewsM23752i = vxb.m23752i(pushMessage, str);
            remoteViewsM23752i.setImageViewBitmap(s4c0.Z, r13.m21368a(bitmap, vtd.m23720a(App.e, 44.0f), vtd.m23720a(App.e, 22.0f)));
            builder.setCustomContentView(remoteViewsM23752i);
            builder.setCustomBigContentView(remoteViewsM23752i);
            builder.setStyle(new NotificationCompat.DecoratedCustomViewStyle());
        } else if (!"superLike.received".equals(pushMessage.intent)) {
            builder.setLargeIcon(bitmap);
        }
        Notification notificationBuild = builder.build();
        if (!TextUtils.isEmpty(notificationBuild.tickerText)) {
            "samsung".equals(Build.BRAND);
            f16895d.b(i);
        }
        f16895d.g(i, notificationBuild);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m18462p(int i) {
        return f16896e.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: q */
    public static Collection<Integer> m18463q() {
        return new ArrayList(f16896e.keySet());
    }

    /* JADX INFO: renamed from: r */
    public static Intent m18464r(Intent intent) {
        try {
            return (Intent) intent.getParcelableExtra("wrapped_intent");
        } catch (Throwable th) {
            CrashHelper.c(new Throwable("Sysnotif: e" + th.getMessage()));
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m18465s() {
        AudioManager audioManager = (AudioManager) App.e.getSystemService("audio");
        Vibrator vibrator = (Vibrator) App.e.getSystemService("vibrator");
        if (audioManager.getRingerMode() != 0) {
            vibrator.vibrate(100L);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public static Intent m18466t(Intent intent) {
        Intent intent2 = new Intent(App.e, (Class<?>) SplashProxyAct.class);
        intent2.addFlags(268435456);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }
}

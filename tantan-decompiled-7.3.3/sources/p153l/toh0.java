package p153l;

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
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class toh0 {

    /* JADX INFO: renamed from: a */
    public static final int f175408a = Color.parseColor("#ffffff");

    /* JADX INFO: renamed from: b */
    public static final int f175409b = Color.parseColor("#212121");

    /* JADX INFO: renamed from: c */
    public static final int f175410c = Color.parseColor("#757575");

    /* JADX INFO: renamed from: d */
    public static c050 f175411d;

    /* JADX INFO: renamed from: e */
    public static final HashMap<Integer, PushMessage> f175412e;

    /* JADX INFO: renamed from: l.toh0$a */
    public class C20361a implements y20<Bitmap> {

        /* JADX INFO: renamed from: a */
        public boolean f175413a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f175414b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f175415c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ PushMessage f175416d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ NotificationCompat.Builder f175417e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f175418f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f175419g;

        public C20361a(int i, String str, PushMessage pushMessage, NotificationCompat.Builder builder, int i2, boolean z) {
            this.f175414b = i;
            this.f175415c = str;
            this.f175416d = pushMessage;
            this.f175417e = builder;
            this.f175418f = i2;
            this.f175419g = z;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            String strSubSequence;
            if (!this.f175413a) {
                int i = this.f175414b;
                String str = this.f175415c;
                if (i > 0) {
                    strSubSequence = str;
                    strSubSequence = str.subSequence(0, i);
                }
                strSubSequence = str;
                String str2 = Build.BRAND;
                if ("Meizu".equals(str2) || ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(str2)) {
                    RemoteViews remoteViews = new RemoteViews(App.f16088e.getPackageName(), jec0.f120447P);
                    remoteViews.setTextViewText(ycc0.f198461i0, this.f175416d.title);
                    remoteViews.setTextViewText(ycc0.f198457g0, strSubSequence);
                    remoteViews.setImageViewBitmap(ycc0.f198459h0, bitmap);
                    RemoteViews remoteViews2 = new RemoteViews(App.f16088e.getPackageName(), jec0.f120446O);
                    remoteViews2.setTextViewText(ycc0.f198455f0, this.f175416d.title);
                    remoteViews2.setTextViewText(ycc0.f198451d0, strSubSequence);
                    remoteViews2.setImageViewBitmap(ycc0.f198453e0, bitmap);
                    if ("Meizu".equals(str2)) {
                        remoteViews.setTextColor(ycc0.f198461i0, toh0.f175408a);
                        remoteViews.setTextColor(ycc0.f198457g0, toh0.f175408a);
                        remoteViews2.setTextColor(ycc0.f198455f0, toh0.f175408a);
                        remoteViews2.setTextColor(ycc0.f198451d0, toh0.f175408a);
                    } else {
                        remoteViews.setTextColor(ycc0.f198461i0, toh0.f175409b);
                        remoteViews.setTextColor(ycc0.f198457g0, toh0.f175410c);
                        remoteViews2.setTextColor(ycc0.f198455f0, toh0.f175409b);
                        remoteViews2.setTextColor(ycc0.f198451d0, toh0.f175410c);
                    }
                    this.f175417e.setCustomBigContentView(remoteViews2);
                    this.f175417e.setCustomContentView(remoteViews);
                    this.f175417e.setStyle(new NotificationCompat.DecoratedCustomViewStyle());
                    toh0.m192053m(this.f175416d, null, this.f175417e, this.f175418f, this.f175419g);
                } else {
                    NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                    bigPictureStyle.bigPicture(bitmap);
                    bigPictureStyle.bigLargeIcon(BitmapFactory.decodeResource(App.f16088e.getResources(), cbc0.f80773h0));
                    this.f175417e.setStyle(bigPictureStyle);
                    toh0.m192053m(this.f175416d, bitmap, this.f175417e, this.f175418f, this.f175419g);
                }
            }
            this.f175413a = true;
        }
    }

    /* JADX INFO: renamed from: l.toh0$b */
    public class C20362b implements y20<Bitmap> {

        /* JADX INFO: renamed from: a */
        public boolean f175420a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f175421b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PushMessage f175422c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ NotificationCompat.Builder f175423d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f175424e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f175425f;

        public C20362b(User user, PushMessage pushMessage, NotificationCompat.Builder builder, int i, boolean z) {
            this.f175421b = user;
            this.f175422c = pushMessage;
            this.f175423d = builder;
            this.f175424e = i;
            this.f175425f = z;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            if (this.f175420a) {
                return;
            }
            if (nrb0.m164469e() && NullChecker.m82486a(bitmap) && NullChecker.m82486a(this.f175421b) && this.f175421b.onlineMatchLocked()) {
                bitmap = bsj0.m106279o(bitmap, App.f16088e.getResources().getColor(b9c0.f75564j), qa00.m175859d(6.0f));
            }
            toh0.m192053m(this.f175422c, bitmap, this.f175423d, this.f175424e, this.f175425f);
            this.f175420a = true;
        }
    }

    static {
        f175411d = null;
        f175411d = c050.m107319e(App.f16088e);
        sz40.m188624d();
        f175412e = new HashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static void m192044d(Intent intent, boolean z, boolean z2) {
        intent.putExtra("bundle_from_notification", z);
        intent.putExtra("bundle_is_idle_push", z2);
    }

    /* JADX INFO: renamed from: e */
    public static void m192045e(Intent intent, @Nullable PushTrackData pushTrackData) {
        if (NullChecker.m82486a(pushTrackData)) {
            intent.putExtra("bundle_push_track_info", pushTrackData);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m192046f(PushMessage pushMessage, PendingIntent pendingIntent, Intent intent, NotificationCompat.Action action, NotificationCompat.Action action2) {
        NotificationCompat.Builder builderM188626f;
        NotificationCompat.BigTextStyle bigTextStyleBigText;
        if (pushMessage.silentAggregation && m192050j(pushMessage, f175412e.get(Integer.valueOf(pushMessage.stackId)))) {
            return;
        }
        try {
            int i = pushMessage.stackId;
            HashMap<Integer, PushMessage> map = f175412e;
            synchronized (map) {
                map.put(Integer.valueOf(i), pushMessage);
            }
            Pattern patternCompile = Pattern.compile("<[^>]+>", 2);
            String strReplaceAll = patternCompile.matcher(pushMessage.value).replaceAll("");
            int iIndexOf = strReplaceAll.indexOf(10);
            User userMo105299a = null;
            String strReplaceAll2 = NullChecker.m82486a(pushMessage.ticker) ? patternCompile.matcher(pushMessage.ticker).replaceAll("") : null;
            uqb0.f180376H.guessedCurrentServerTime();
            boolean z = pushMessage.silent;
            if (z) {
                builderM188626f = sz40.m188627g(App.f16088e);
                z = true;
            } else {
                builderM188626f = sz40.m188626f(App.f16088e);
            }
            NotificationCompat.Builder contentText = builderM188626f.setDefaults(!z ? 2 : 0).setSound(z ? null : m192052l(pushMessage)).setSmallIcon(cbc0.f80721A0).setOnlyAlertOnce(pushMessage.silentAggregation).setAutoCancel(true).setContentTitle(pushMessage.title).setContentText(iIndexOf > 0 ? strReplaceAll.subSequence(0, iIndexOf) : strReplaceAll);
            if (z || TextUtils.isEmpty(strReplaceAll2)) {
                strReplaceAll2 = null;
            }
            contentText.setTicker(strReplaceAll2).setContentIntent(pendingIntent);
            if (NullChecker.m82486a(intent)) {
                builderM188626f.setDeleteIntent(PendingIntent.getBroadcast(App.f16088e, (int) System.currentTimeMillis(), intent, 33554432));
            }
            String str = Build.BRAND;
            if (RomUtil.ROM_OPPO.equals(str) && z) {
                builderM188626f.setVibrate(new long[0]);
            }
            double d = pushMessage.createdTime;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                builderM188626f.setWhen((long) d);
            }
            if ((str == null || !HardwareEarMonitorUtils.MANUFACTURER_OPPO.equals(str.toLowerCase())) && pushMessage.counter > 0) {
                builderM188626f.setContentInfo(pushMessage.counter + "");
            }
            if (NullChecker.m82486a(action)) {
                builderM188626f.addAction(action);
            }
            if (NullChecker.m82486a(action2)) {
                builderM188626f.addAction(action2);
            }
            int iM192054n = m192054n(pushMessage.priority);
            if (iM192054n == 99) {
                builderM188626f.setLights(-16711936, 1000, 2500);
            } else {
                builderM188626f.setPriority(iM192054n);
                if (iM192054n == 0 || iM192054n == 1 || iM192054n == 2) {
                    builderM188626f.setLights(-16711936, 1000, 2500);
                }
            }
            if (!ilb0.m140617c() || !NullChecker.m82486a(pushMessage.messageCustom) || TextUtils.isEmpty(pushMessage.messageCustom.big_pic_url) || (ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(str) && Build.VERSION.SDK_INT < 27)) {
                NotificationCompat.Builder builder = builderM188626f;
                boolean z2 = z;
                if (pushMessage.counter > 1) {
                    bigTextStyleBigText = new NotificationCompat.BigTextStyle().setBigContentTitle(pushMessage.title).setSummaryText(pushMessage.counter + "").bigText(strReplaceAll);
                } else {
                    bigTextStyleBigText = new NotificationCompat.BigTextStyle().bigText(strReplaceAll);
                }
                builder.setStyle(bigTextStyleBigText);
                if (!NullChecker.m82486a(pushMessage.primaryPicture) || pushMessage.primaryPicture.isEmpty() || !uqb0.f180397c0.signedIn_()) {
                    m192053m(pushMessage, null, builder, i, z2);
                    return;
                }
                if (!TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent)) {
                    if (TantanApp.f17899c.m111127N()) {
                        userMo105299a = uqb0.f180397c0.mo105299a(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL));
                    } else {
                        userMo105299a = pushMessage.user;
                    }
                }
                uqb0.f180374G.m127108I(pushMessage.primaryPicture, new C20362b(userMo105299a, pushMessage, builder, i, z2));
                return;
            }
            uqb0.f180374G.m127108I(pushMessage.messageCustom.big_pic_url, new C20361a(iIndexOf, strReplaceAll, pushMessage, builderM188626f, i, z));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m192047g(int i) {
        HashMap<Integer, PushMessage> map = f175412e;
        synchronized (map) {
            try {
                if (map.containsKey(Integer.valueOf(i))) {
                    map.remove(Integer.valueOf(i));
                    f175411d.m107323b(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m192048h() {
        f175411d.m107325d();
        HashMap<Integer, PushMessage> map = f175412e;
        synchronized (map) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m192049i(Intent intent) {
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
    public static boolean m192050j(PushMessage pushMessage, PushMessage pushMessage2) {
        if (!NullChecker.m82486a(pushMessage2)) {
            return pushMessage == null;
        }
        PushMessage pushMessageMo225055clone = pushMessage2.mo225055clone();
        pushMessageMo225055clone.silentAggregation = pushMessage.silentAggregation;
        pushMessageMo225055clone.silent = pushMessage.silent;
        if (pushMessage.value.toString().equals(pushMessageMo225055clone.value.toString())) {
            pushMessageMo225055clone.value = pushMessage.value;
        }
        return pushMessageMo225055clone.equals(pushMessage);
    }

    /* JADX INFO: renamed from: k */
    public static <T extends BroadcastReceiver> Intent m192051k(String str, Class<T> cls) {
        Intent intent = new Intent((Context) App.f16088e, (Class<?>) cls);
        intent.setAction(str);
        return intent;
    }

    /* JADX INFO: renamed from: l */
    public static Uri m192052l(PushMessage pushMessage) {
        return RingtoneManager.getDefaultUri(2);
    }

    /* JADX INFO: renamed from: m */
    public static void m192053m(PushMessage pushMessage, Bitmap bitmap, NotificationCompat.Builder builder, int i, boolean z) {
        if (!NullChecker.m82487b(pushMessage) || !pushMessage.isNewUiCustom || !NullChecker.m82486a(bitmap)) {
            m192055o(pushMessage, bitmap, builder, i, "");
            return;
        }
        if (PushMessageIntent.superLike_received.equals(pushMessage.intent)) {
            m192055o(pushMessage, bitmap, builder, i, pushMessage.messageCustom.nickname);
            return;
        }
        String str = pushMessage.content.f39652id;
        if (str == null || str.isEmpty()) {
            User user = pushMessage.user;
            m192055o(pushMessage, bitmap, builder, i, user != null ? user.name : "");
        } else if (!uqb0.f180397c0.signedIn_()) {
            m192055o(pushMessage, bitmap, builder, i, "");
        } else {
            String str2 = pushMessage.content.f39652id;
            m192055o(pushMessage, bitmap, builder, i, (l51.m152884D() ? uqb0.f180397c0.mo105299a(str2) : uqb0.f180405k0.f184355d.query(str2)).name);
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m192054n(int i) {
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
    public static void m192055o(PushMessage pushMessage, Bitmap bitmap, NotificationCompat.Builder builder, int i, String str) {
        if (NullChecker.m82486a(str) && !str.isEmpty()) {
            RemoteViews remoteViewsM147657i = jzb.m147657i(pushMessage, str);
            remoteViewsM147657i.setImageViewBitmap(ycc0.f198443Z, g23.m128584a(bitmap, jvd.m147011a(App.f16088e, 44.0f), jvd.m147011a(App.f16088e, 22.0f)));
            builder.setCustomContentView(remoteViewsM147657i);
            builder.setCustomBigContentView(remoteViewsM147657i);
            builder.setStyle(new NotificationCompat.DecoratedCustomViewStyle());
        } else if (!PushMessageIntent.superLike_received.equals(pushMessage.intent)) {
            builder.setLargeIcon(bitmap);
        }
        Notification notificationBuild = builder.build();
        if (!TextUtils.isEmpty(notificationBuild.tickerText)) {
            "samsung".equals(Build.BRAND);
            f175411d.m107323b(i);
        }
        f175411d.m107326g(i, notificationBuild);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m192056p(int i) {
        return f175412e.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: q */
    public static Collection<Integer> m192057q() {
        return new ArrayList(f175412e.keySet());
    }

    /* JADX INFO: renamed from: r */
    public static Intent m192058r(Intent intent) {
        try {
            return (Intent) intent.getParcelableExtra("wrapped_intent");
        } catch (Throwable th) {
            CrashHelper.m82479c(new Throwable("Sysnotif: e" + th.getMessage()));
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m192059s() {
        AudioManager audioManager = (AudioManager) App.f16088e.getSystemService("audio");
        Vibrator vibrator = (Vibrator) App.f16088e.getSystemService("vibrator");
        if (audioManager.getRingerMode() != 0) {
            vibrator.vibrate(100L);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public static Intent m192060t(Intent intent) {
        Intent intent2 = new Intent(App.f16088e, (Class<?>) SplashProxyAct.class);
        intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }
}

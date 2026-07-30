package p149l;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class mgh0 {

    /* JADX INFO: renamed from: a */
    public static final int f133677a = Color.parseColor("#ffffff");

    /* JADX INFO: renamed from: b */
    public static final int f133678b = Color.parseColor("#212121");

    /* JADX INFO: renamed from: c */
    public static final int f133679c = Color.parseColor("#757575");

    /* JADX INFO: renamed from: d */
    public static nr40 f133680d;

    /* JADX INFO: renamed from: e */
    public static final HashMap<Integer, PushMessage> f133681e;

    /* JADX INFO: renamed from: l.mgh0$a */
    public class C18455a implements e30<Bitmap> {

        /* JADX INFO: renamed from: a */
        public boolean f133682a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f133683b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f133684c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ PushMessage f133685d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ NotificationCompat.Builder f133686e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f133687f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f133688g;

        public C18455a(int i, String str, PushMessage pushMessage, NotificationCompat.Builder builder, int i2, boolean z) {
            this.f133683b = i;
            this.f133684c = str;
            this.f133685d = pushMessage;
            this.f133686e = builder;
            this.f133687f = i2;
            this.f133688g = z;
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
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            String strSubSequence;
            if (!this.f133682a) {
                int i = this.f133683b;
                String str = this.f133684c;
                if (i > 0) {
                    strSubSequence = str;
                    strSubSequence = str.subSequence(0, i);
                }
                strSubSequence = str;
                String str2 = Build.BRAND;
                if ("Meizu".equals(str2) || ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(str2)) {
                    RemoteViews remoteViews = new RemoteViews(App.f15369e.getPackageName(), e6c0.f89534P);
                    remoteViews.setTextViewText(s4c0.f162340i0, this.f133685d.title);
                    remoteViews.setTextViewText(s4c0.f162336g0, strSubSequence);
                    remoteViews.setImageViewBitmap(s4c0.f162338h0, bitmap);
                    RemoteViews remoteViews2 = new RemoteViews(App.f15369e.getPackageName(), e6c0.f89533O);
                    remoteViews2.setTextViewText(s4c0.f162334f0, this.f133685d.title);
                    remoteViews2.setTextViewText(s4c0.f162330d0, strSubSequence);
                    remoteViews2.setImageViewBitmap(s4c0.f162332e0, bitmap);
                    if ("Meizu".equals(str2)) {
                        remoteViews.setTextColor(s4c0.f162340i0, mgh0.f133677a);
                        remoteViews.setTextColor(s4c0.f162336g0, mgh0.f133677a);
                        remoteViews2.setTextColor(s4c0.f162334f0, mgh0.f133677a);
                        remoteViews2.setTextColor(s4c0.f162330d0, mgh0.f133677a);
                    } else {
                        remoteViews.setTextColor(s4c0.f162340i0, mgh0.f133678b);
                        remoteViews.setTextColor(s4c0.f162336g0, mgh0.f133679c);
                        remoteViews2.setTextColor(s4c0.f162334f0, mgh0.f133678b);
                        remoteViews2.setTextColor(s4c0.f162330d0, mgh0.f133679c);
                    }
                    this.f133686e.setCustomBigContentView(remoteViews2);
                    this.f133686e.setCustomContentView(remoteViews);
                    this.f133686e.setStyle(new NotificationCompat.DecoratedCustomViewStyle());
                    mgh0.m154557m(this.f133685d, null, this.f133686e, this.f133687f, this.f133688g);
                } else {
                    NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                    bigPictureStyle.bigPicture(bitmap);
                    bigPictureStyle.bigLargeIcon(BitmapFactory.decodeResource(App.f15369e.getResources(), w2c0.f184177h0));
                    this.f133686e.setStyle(bigPictureStyle);
                    mgh0.m154557m(this.f133685d, bitmap, this.f133686e, this.f133687f, this.f133688g);
                }
            }
            this.f133682a = true;
        }
    }

    /* JADX INFO: renamed from: l.mgh0$b */
    public class C18456b implements e30<Bitmap> {

        /* JADX INFO: renamed from: a */
        public boolean f133689a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f133690b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PushMessage f133691c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ NotificationCompat.Builder f133692d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f133693e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f133694f;

        public C18456b(User user, PushMessage pushMessage, NotificationCompat.Builder builder, int i, boolean z) {
            this.f133690b = user;
            this.f133691c = pushMessage;
            this.f133692d = builder;
            this.f133693e = i;
            this.f133694f = z;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            if (this.f133689a) {
                return;
            }
            if (jjb0.m141787e() && NullChecker.m81303a(bitmap) && NullChecker.m81303a(this.f133690b) && this.f133690b.onlineMatchLocked()) {
                bitmap = yij0.m214959o(bitmap, App.f15369e.getResources().getColor(v0c0.f179103j), t100.m186890d(6.0f));
            }
            mgh0.m154557m(this.f133691c, bitmap, this.f133692d, this.f133693e, this.f133694f);
            this.f133689a = true;
        }
    }

    static {
        f133680d = null;
        f133680d = nr40.m160709e(App.f15369e);
        dr40.m113273d();
        f133681e = new HashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static void m154548d(Intent intent, boolean z, boolean z2) {
        intent.putExtra("bundle_from_notification", z);
        intent.putExtra("bundle_is_idle_push", z2);
    }

    /* JADX INFO: renamed from: e */
    public static void m154549e(Intent intent, @Nullable PushTrackData pushTrackData) {
        if (NullChecker.m81303a(pushTrackData)) {
            intent.putExtra("bundle_push_track_info", pushTrackData);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m154550f(PushMessage pushMessage, PendingIntent pendingIntent, Intent intent, NotificationCompat.Action action, NotificationCompat.Action action2) {
        NotificationCompat.Builder builderM113275f;
        NotificationCompat.BigTextStyle bigTextStyleBigText;
        if (pushMessage.silentAggregation && m154554j(pushMessage, f133681e.get(Integer.valueOf(pushMessage.stackId)))) {
            return;
        }
        try {
            int i = pushMessage.stackId;
            HashMap<Integer, PushMessage> map = f133681e;
            synchronized (map) {
                map.put(Integer.valueOf(i), pushMessage);
            }
            Pattern patternCompile = Pattern.compile("<[^>]+>", 2);
            String strReplaceAll = patternCompile.matcher(pushMessage.value).replaceAll("");
            int iIndexOf = strReplaceAll.indexOf(10);
            User userMo97510a = null;
            String strReplaceAll2 = NullChecker.m81303a(pushMessage.ticker) ? patternCompile.matcher(pushMessage.ticker).replaceAll("") : null;
            qib0.f154693H.guessedCurrentServerTime();
            boolean z = pushMessage.silent;
            if (z) {
                builderM113275f = dr40.m113276g(App.f15369e);
                z = true;
            } else {
                builderM113275f = dr40.m113275f(App.f15369e);
            }
            NotificationCompat.Builder contentText = builderM113275f.setDefaults(!z ? 2 : 0).setSound(z ? null : m154556l(pushMessage)).setSmallIcon(w2c0.f184125A0).setOnlyAlertOnce(pushMessage.silentAggregation).setAutoCancel(true).setContentTitle(pushMessage.title).setContentText(iIndexOf > 0 ? strReplaceAll.subSequence(0, iIndexOf) : strReplaceAll);
            if (z || TextUtils.isEmpty(strReplaceAll2)) {
                strReplaceAll2 = null;
            }
            contentText.setTicker(strReplaceAll2).setContentIntent(pendingIntent);
            if (NullChecker.m81303a(intent)) {
                builderM113275f.setDeleteIntent(PendingIntent.getBroadcast(App.f15369e, (int) System.currentTimeMillis(), intent, 33554432));
            }
            String str = Build.BRAND;
            if (RomUtil.ROM_OPPO.equals(str) && z) {
                builderM113275f.setVibrate(new long[0]);
            }
            double d = pushMessage.createdTime;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                builderM113275f.setWhen((long) d);
            }
            if ((str == null || !HardwareEarMonitorUtils.MANUFACTURER_OPPO.equals(str.toLowerCase())) && pushMessage.counter > 0) {
                builderM113275f.setContentInfo(pushMessage.counter + "");
            }
            if (NullChecker.m81303a(action)) {
                builderM113275f.addAction(action);
            }
            if (NullChecker.m81303a(action2)) {
                builderM113275f.addAction(action2);
            }
            int iM154558n = m154558n(pushMessage.priority);
            if (iM154558n == 99) {
                builderM113275f.setLights(-16711936, 1000, 2500);
            } else {
                builderM113275f.setPriority(iM154558n);
                if (iM154558n == 0 || iM154558n == 1 || iM154558n == 2) {
                    builderM113275f.setLights(-16711936, 1000, 2500);
                }
            }
            if (!edb0.m115794c() || !NullChecker.m81303a(pushMessage.messageCustom) || TextUtils.isEmpty(pushMessage.messageCustom.big_pic_url) || (ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(str) && Build.VERSION.SDK_INT < 27)) {
                NotificationCompat.Builder builder = builderM113275f;
                boolean z2 = z;
                if (pushMessage.counter > 1) {
                    bigTextStyleBigText = new NotificationCompat.BigTextStyle().setBigContentTitle(pushMessage.title).setSummaryText(pushMessage.counter + "").bigText(strReplaceAll);
                } else {
                    bigTextStyleBigText = new NotificationCompat.BigTextStyle().bigText(strReplaceAll);
                }
                builder.setStyle(bigTextStyleBigText);
                if (!NullChecker.m81303a(pushMessage.primaryPicture) || pushMessage.primaryPicture.isEmpty() || !qib0.f154714c0.signedIn_()) {
                    m154557m(pushMessage, null, builder, i, z2);
                    return;
                }
                if (!TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent)) {
                    if (TantanApp.f17180c.m214249N()) {
                        userMo97510a = qib0.f154714c0.mo97510a(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL));
                    } else {
                        userMo97510a = pushMessage.user;
                    }
                }
                qib0.f154691G.m102324I(pushMessage.primaryPicture, new C18456b(userMo97510a, pushMessage, builder, i, z2));
                return;
            }
            qib0.f154691G.m102324I(pushMessage.messageCustom.big_pic_url, new C18455a(iIndexOf, strReplaceAll, pushMessage, builderM113275f, i, z));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m154551g(int i) {
        HashMap<Integer, PushMessage> map = f133681e;
        synchronized (map) {
            try {
                if (map.containsKey(Integer.valueOf(i))) {
                    map.remove(Integer.valueOf(i));
                    f133680d.m160713b(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m154552h() {
        f133680d.m160715d();
        HashMap<Integer, PushMessage> map = f133681e;
        synchronized (map) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m154553i(Intent intent) {
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
    public static boolean m154554j(PushMessage pushMessage, PushMessage pushMessage2) {
        if (!NullChecker.m81303a(pushMessage2)) {
            return pushMessage == null;
        }
        PushMessage pushMessageMo223809clone = pushMessage2.mo223809clone();
        pushMessageMo223809clone.silentAggregation = pushMessage.silentAggregation;
        pushMessageMo223809clone.silent = pushMessage.silent;
        if (pushMessage.value.toString().equals(pushMessageMo223809clone.value.toString())) {
            pushMessageMo223809clone.value = pushMessage.value;
        }
        return pushMessageMo223809clone.equals(pushMessage);
    }

    /* JADX INFO: renamed from: k */
    public static <T extends BroadcastReceiver> Intent m154555k(String str, Class<T> cls) {
        Intent intent = new Intent((Context) App.f15369e, (Class<?>) cls);
        intent.setAction(str);
        return intent;
    }

    /* JADX INFO: renamed from: l */
    public static Uri m154556l(PushMessage pushMessage) {
        return RingtoneManager.getDefaultUri(2);
    }

    /* JADX INFO: renamed from: m */
    public static void m154557m(PushMessage pushMessage, Bitmap bitmap, NotificationCompat.Builder builder, int i, boolean z) {
        if (!NullChecker.m81304b(pushMessage) || !pushMessage.isNewUiCustom || !NullChecker.m81303a(bitmap)) {
            m154559o(pushMessage, bitmap, builder, i, "");
            return;
        }
        if (PushMessageIntent.superLike_received.equals(pushMessage.intent)) {
            m154559o(pushMessage, bitmap, builder, i, pushMessage.messageCustom.nickname);
            return;
        }
        String str = pushMessage.content.f38804id;
        if (str == null || str.isEmpty()) {
            User user = pushMessage.user;
            m154559o(pushMessage, bitmap, builder, i, user != null ? user.name : "");
        } else if (!qib0.f154714c0.signedIn_()) {
            m154559o(pushMessage, bitmap, builder, i, "");
        } else {
            String str2 = pushMessage.content.f38804id;
            m154559o(pushMessage, bitmap, builder, i, (e51.m114739D() ? qib0.f154714c0.mo97510a(str2) : qib0.f154722k0.f176631d.query(str2)).name);
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m154558n(int i) {
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
    public static void m154559o(PushMessage pushMessage, Bitmap bitmap, NotificationCompat.Builder builder, int i, String str) {
        if (NullChecker.m81303a(str) && !str.isEmpty()) {
            RemoteViews remoteViewsM200520i = vxb.m200520i(pushMessage, str);
            remoteViewsM200520i.setImageViewBitmap(s4c0.f162322Z, r13.m177436a(bitmap, vtd.m199996a(App.f15369e, 44.0f), vtd.m199996a(App.f15369e, 22.0f)));
            builder.setCustomContentView(remoteViewsM200520i);
            builder.setCustomBigContentView(remoteViewsM200520i);
            builder.setStyle(new NotificationCompat.DecoratedCustomViewStyle());
        } else if (!PushMessageIntent.superLike_received.equals(pushMessage.intent)) {
            builder.setLargeIcon(bitmap);
        }
        Notification notificationBuild = builder.build();
        if (!TextUtils.isEmpty(notificationBuild.tickerText)) {
            "samsung".equals(Build.BRAND);
            f133680d.m160713b(i);
        }
        f133680d.m160716g(i, notificationBuild);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m154560p(int i) {
        return f133681e.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: q */
    public static Collection<Integer> m154561q() {
        return new ArrayList(f133681e.keySet());
    }

    /* JADX INFO: renamed from: r */
    public static Intent m154562r(Intent intent) {
        try {
            return (Intent) intent.getParcelableExtra("wrapped_intent");
        } catch (Throwable th) {
            CrashHelper.m81296c(new Throwable("Sysnotif: e" + th.getMessage()));
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m154563s() {
        AudioManager audioManager = (AudioManager) App.f15369e.getSystemService("audio");
        Vibrator vibrator = (Vibrator) App.f15369e.getSystemService("vibrator");
        if (audioManager.getRingerMode() != 0) {
            vibrator.vibrate(100L);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public static Intent m154564t(Intent intent) {
        Intent intent2 = new Intent(App.f15369e, (Class<?>) SplashProxyAct.class);
        intent2.addFlags(268435456);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }
}

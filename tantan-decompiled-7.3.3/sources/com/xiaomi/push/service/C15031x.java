package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.google.android.gms.common.api.Api;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14887g;
import com.xiaomi.push.C14901gs;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.EnumC14888gf;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.l4r0;
import p153l.otq0;
import p153l.ouq0;
import p153l.tsq0;
import p153l.tzq0;
import p153l.uzq0;
import p153l.vzq0;
import p153l.w5r0;
import p153l.wzq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.x */
/* JADX INFO: loaded from: classes2.dex */
public class C15031x {

    /* JADX INFO: renamed from: a */
    public static long f63985a;

    /* JADX INFO: renamed from: a */
    private static volatile AbstractC14979ab f63986a;

    /* JADX INFO: renamed from: a */
    private static final LinkedList<Pair<Integer, C14911hb>> f63987a = new LinkedList<>();

    /* JADX INFO: renamed from: a */
    private static ExecutorService f63988a = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: com.xiaomi.push.service.x$a */
    public static class a implements Callable<Bitmap> {

        /* JADX INFO: renamed from: a */
        private Context f63992a;

        /* JADX INFO: renamed from: a */
        private String f63993a;

        /* JADX INFO: renamed from: a */
        private boolean f63994a;

        public a(String str, Context context, boolean z) {
            this.f63992a = context;
            this.f63993a = str;
            this.f63994a = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call() throws Throwable {
            if (TextUtils.isEmpty(this.f63993a)) {
                ouq0.m169393m("Failed get online picture/icon resource cause picUrl is empty");
                return null;
            }
            boolean zStartsWith = this.f63993a.startsWith("http");
            Context context = this.f63992a;
            if (!zStartsWith) {
                Bitmap bitmapM87587a = C14982ae.m87587a(context, this.f63993a);
                if (bitmapM87587a == null) {
                    ouq0.m169393m("Failed get online picture/icon resource");
                }
                return bitmapM87587a;
            }
            C14982ae.b bVarM87589a = C14982ae.m87589a(context, this.f63993a, this.f63994a);
            if (bVarM87589a != null) {
                return bVarM87589a.f63694a;
            }
            ouq0.m169393m("Failed get online picture/icon resource");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.x$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        long f63995a = 0;

        /* JADX INFO: renamed from: a */
        Notification f63996a;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.x$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public String f63998a;

        /* JADX INFO: renamed from: a */
        public long f63997a = 0;

        /* JADX INFO: renamed from: a */
        public boolean f63999a = false;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0342  */
    /* JADX WARN: Code duplicated, block: B:128:0x0345  */
    /* JADX WARN: Code duplicated, block: B:132:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0360  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x013a  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0206  */
    /* JADX WARN: Code duplicated, block: B:87:0x0246  */
    /* JADX WARN: Code duplicated, block: B:88:0x024b  */
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    private static b m88034a(Context context, C14911hb c14911hb, byte[] bArr, RemoteViews remoteViews, PendingIntent pendingIntent, int i) throws Throwable {
        C14911hb c14911hb2;
        byte[] bArr2;
        int i2;
        vzq0 vzq0Var;
        boolean z;
        String strM87584a;
        boolean z2;
        boolean z3;
        long jCurrentTimeMillis;
        boolean z4;
        boolean z5;
        int iM88019a;
        vzq0 vzq0Var2;
        Notification notification;
        int iM204982a;
        int iM204982a2;
        Bitmap bitmapM87587a;
        b bVar = new b();
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        String strM88037a = m88037a(c14911hb);
        Map<String, String> mapM86900a = c14901gsM87077a.m86900a();
        String[] strArrM88057a = m88057a(context, c14901gsM87077a);
        if (remoteViews != null) {
            vzq0Var = new vzq0(context);
            vzq0Var.setCustomContentView(remoteViews);
            c14911hb2 = c14911hb;
            bArr2 = bArr;
            i2 = i;
        } else if (mapM86900a == null || !mapM86900a.containsKey("notification_style_type")) {
            c14911hb2 = c14911hb;
            bArr2 = bArr;
            i2 = i;
            vzq0Var = new vzq0(context);
        } else {
            c14911hb2 = c14911hb;
            bArr2 = bArr;
            i2 = i;
            vzq0Var = m88040a(context, c14911hb2, bArr2, strArrM88057a[1], i2);
        }
        m88049a(vzq0Var, context, c14911hb2.m87092b(), c14911hb2, bArr2, i2);
        vzq0Var.setContentTitle(strArrM88057a[0]);
        vzq0Var.setContentText(strArrM88057a[1]);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        vzq0Var.setWhen(jCurrentTimeMillis2);
        String strM88039a = m88039a(mapM86900a, "notification_show_when");
        if (TextUtils.isEmpty(strM88039a)) {
            vzq0Var.setShowWhen(true);
        } else {
            vzq0Var.setShowWhen(Boolean.parseBoolean(strM88039a));
        }
        vzq0Var.setContentIntent(pendingIntent);
        m88046a(context, strM88037a, vzq0Var, mapM86900a);
        Bitmap bitmapM88031a = mapM86900a == null ? null : m88031a(context, mapM86900a.get("notification_small_icon_uri"), true);
        if (bitmapM88031a != null) {
            Object objM169169g = otq0.m169169g("android.graphics.drawable.Icon", "createWithBitmap", bitmapM88031a);
            if (objM169169g != null) {
                otq0.m169167e(vzq0Var, "setSmallIcon", objM169169g);
                Bundle bundle = new Bundle();
                bundle.putBoolean("miui.isGrayscaleIcon", true);
                vzq0Var.addExtras(bundle);
            } else {
                ouq0.m169393m("failed te get small icon with url:" + mapM86900a.get("notification_small_icon_uri"));
            }
        } else {
            ouq0.m169393m("failed to get small icon url:" + m88039a(mapM86900a, "notification_small_icon_uri"));
        }
        vzq0Var.m204122f(m88039a(mapM86900a, "notification_small_icon_color"));
        String strM88039a2 = m88039a(mapM86900a, "__dynamic_icon_uri");
        boolean z6 = Boolean.parseBoolean(m88039a(mapM86900a, "__adiom")) || !l4r0.m152824i();
        if (TextUtils.isEmpty(strM88039a2) || !z6) {
            z = false;
        } else {
            if (strM88039a2.startsWith("http")) {
                C14982ae.b bVarM87589a = C14982ae.m87589a(context, strM88039a2, true);
                if (bVarM87589a != null) {
                    bitmapM87587a = bVarM87589a.f63694a;
                    bVar.f63995a = bVarM87589a.f63693a;
                } else {
                    bitmapM87587a = null;
                }
            } else {
                bitmapM87587a = C14982ae.m87587a(context, strM88039a2);
            }
            if (bitmapM87587a != null) {
                vzq0Var.setLargeIcon(bitmapM87587a);
                z = true;
            } else {
                z = false;
            }
        }
        Bitmap bitmapM88031a2 = mapM86900a == null ? null : m88031a(context, mapM86900a.get("notification_large_icon_uri"), true);
        if (bitmapM88031a2 != null) {
            vzq0Var.setLargeIcon(bitmapM88031a2);
        }
        if (mapM86900a != null) {
            String strM88037a2 = mapM86900a.get("notification_group");
            z2 = Boolean.parseBoolean(mapM86900a.get("notification_is_summary"));
            boolean z7 = Boolean.parseBoolean(mapM86900a.get("notification_group_disable_default"));
            if (TextUtils.isEmpty(strM88037a2) && (l4r0.m152824i() || !z7)) {
                strM88037a2 = m88037a(c14911hb);
            }
            otq0.m169167e(vzq0Var, "setGroupSummary", Boolean.valueOf(z2));
            String str = mapM86900a.get("notification_style_type");
            if ("com.xiaomi.xmsf".equals(context.getPackageName()) && ("4".equals(str) || "3".equals(str))) {
                strM87584a = m88037a(c14911hb) + "_custom_" + jCurrentTimeMillis2;
                z3 = true;
            } else {
                strM87584a = strM88037a2;
            }
            vzq0Var.setAutoCancel(true);
            jCurrentTimeMillis = System.currentTimeMillis();
            if (mapM86900a != null && mapM86900a.containsKey("ticker")) {
                vzq0Var.setTicker(mapM86900a.get("ticker"));
            }
            if (jCurrentTimeMillis - f63985a > 10000) {
                f63985a = jCurrentTimeMillis;
                iM88019a = c14901gsM87077a.f63026a;
                if (m88065b(context, strM88037a)) {
                    iM88019a = m88019a(context, strM88037a);
                }
                vzq0Var.setDefaults(iM88019a);
                if (mapM86900a != null || (iM88019a & 1) == 0) {
                    z4 = z;
                    z5 = z3;
                } else {
                    String str2 = mapM86900a.get("sound_uri");
                    if (TextUtils.isEmpty(str2)) {
                        z4 = z;
                        z5 = z3;
                    } else {
                        z4 = z;
                        z5 = z3;
                        if (str2.startsWith("android.resource://" + strM88037a)) {
                            vzq0Var.setDefaults(iM88019a ^ 1);
                            vzq0Var.setSound(Uri.parse(str2));
                        }
                    }
                }
            } else {
                z4 = z;
                z5 = z3;
                iM88019a = -100;
            }
            if (mapM86900a != null || Build.VERSION.SDK_INT < 26) {
                vzq0Var2 = vzq0Var;
                if (mapM86900a != null && Build.VERSION.SDK_INT < 26) {
                    otq0.m169167e(vzq0Var2, "setPriority", Integer.valueOf(m88068c(mapM86900a)));
                }
            } else {
                C14983af c14983afM87599a = C14983af.m87599a(context, strM88037a);
                int iM88022a = m88022a(mapM86900a);
                if (iM88022a > 0) {
                    Object[] objArr = {Long.valueOf(iM88022a * 1000)};
                    vzq0Var2 = vzq0Var;
                    otq0.m169167e(vzq0Var2, "setTimeoutAfter", objArr);
                } else {
                    vzq0Var2 = vzq0Var;
                }
                C14980ac.m87560a(c14901gsM87077a);
                String str3 = mapM86900a.get("channel_id");
                if (!TextUtils.isEmpty(str3) || context.getApplicationInfo().targetSdkVersion >= 26) {
                    String strM88036a = m88036a(context, strM88037a, mapM86900a);
                    int iM88059b = m88059b(mapM86900a);
                    int i3 = c14901gsM87077a.f63026a;
                    String str4 = mapM86900a.get("channel_description");
                    String str5 = mapM86900a.get("sound_uri");
                    String str6 = mapM86900a.get("channel_perm");
                    C15006bb.m87792a(context, mapM86900a, vzq0Var2, jCurrentTimeMillis2);
                    otq0.m169167e(vzq0Var2, "setChannelId", C14980ac.m87556a(c14983afM87599a, str3, strM88036a, str4, i3, iM88059b, str5, str6));
                    if (iM88019a == -100 && C14984ag.m87643a(mapM86900a)) {
                        C14984ag.m87640a(vzq0Var2, z2);
                    }
                    if ("pulldown".equals(C14984ag.m87632a((Object) mapM86900a)) && C14984ag.m87643a(mapM86900a) && Objects.equals(mapM86900a.get("pull_down_pop_type"), "0")) {
                        C14984ag.m87640a(vzq0Var2, z2);
                    }
                    if ("tts".equals(C14984ag.m87632a((Object) mapM86900a)) && C14984ag.m87643a(mapM86900a)) {
                        C14984ag.m87640a(vzq0Var2, z2);
                    }
                }
                String str7 = mapM86900a.get("background_color");
                if (!TextUtils.isEmpty(str7)) {
                    try {
                        int i4 = Integer.parseInt(str7);
                        vzq0Var2.setOngoing(true);
                        vzq0Var2.setColor(i4);
                        otq0.m169167e(vzq0Var2, "setColorized", Boolean.TRUE);
                    } catch (Exception e) {
                        ouq0.m169397q(e);
                    }
                }
            }
            if (strM87584a != null) {
                if (!z5) {
                    strM87584a = C14981ad.m87570a().m87584a(context, vzq0Var2, strM87584a);
                }
                otq0.m169167e(vzq0Var2, "setGroup", strM87584a);
            }
            if (l4r0.m152833r() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                otq0.m169169g("miui.util.NotificationHelper", "setTargetPkg", context, vzq0Var2, m88037a(c14911hb));
            }
            notification = vzq0Var2.getNotification();
            if (z4 && l4r0.m152824i()) {
                m88023a(notification);
            }
            if (mapM86900a != null) {
                if (notification.extras == null) {
                    notification.extras = new Bundle();
                }
                if (!TextUtils.isEmpty(mapM86900a.get("enable_keyguard"))) {
                    C14984ag.m87646b(notification, Boolean.parseBoolean(mapM86900a.get("enable_keyguard")));
                }
                if (!TextUtils.isEmpty(mapM86900a.get("enable_float"))) {
                    C14984ag.m87636a(notification, Boolean.parseBoolean(mapM86900a.get("enable_float")));
                }
                if (!TextUtils.isEmpty(mapM86900a.get("float_small_win")) && "0".equals(mapM86900a.get("float_small_win")) && C14887g.m86768q(context, strM88037a)) {
                    C14984ag.m87636a(notification, false);
                }
                iM204982a = w5r0.m204982a(mapM86900a.get("section_is_prr"), -1);
                iM204982a2 = w5r0.m204982a(mapM86900a.get("section_prr_cl"), -1);
                if (iM204982a >= 0 && iM204982a2 >= 0) {
                    C14984ag.m87634a(notification, iM204982a, iM204982a2);
                }
            }
            bVar.f63996a = notification;
            return bVar;
        }
        strM87584a = null;
        z2 = false;
        z3 = false;
        vzq0Var.setAutoCancel(true);
        jCurrentTimeMillis = System.currentTimeMillis();
        if (mapM86900a != null) {
            vzq0Var.setTicker(mapM86900a.get("ticker"));
        }
        if (jCurrentTimeMillis - f63985a > 10000) {
            f63985a = jCurrentTimeMillis;
            iM88019a = c14901gsM87077a.f63026a;
            if (m88065b(context, strM88037a)) {
                iM88019a = m88019a(context, strM88037a);
            }
            vzq0Var.setDefaults(iM88019a);
            if (mapM86900a != null) {
                z4 = z;
                z5 = z3;
            } else {
                z4 = z;
                z5 = z3;
            }
        } else {
            z4 = z;
            z5 = z3;
            iM88019a = -100;
        }
        if (mapM86900a != null) {
            vzq0Var2 = vzq0Var;
            if (mapM86900a != null) {
                otq0.m169167e(vzq0Var2, "setPriority", Integer.valueOf(m88068c(mapM86900a)));
            }
        } else {
            vzq0Var2 = vzq0Var;
            if (mapM86900a != null) {
                otq0.m169167e(vzq0Var2, "setPriority", Integer.valueOf(m88068c(mapM86900a)));
            }
        }
        if (strM87584a != null) {
            if (!z5) {
                strM87584a = C14981ad.m87570a().m87584a(context, vzq0Var2, strM87584a);
            }
            otq0.m169167e(vzq0Var2, "setGroup", strM87584a);
        }
        if (l4r0.m152833r()) {
            otq0.m169169g("miui.util.NotificationHelper", "setTargetPkg", context, vzq0Var2, m88037a(c14911hb));
        }
        notification = vzq0Var2.getNotification();
        if (z4) {
            m88023a(notification);
        }
        if (mapM86900a != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            if (!TextUtils.isEmpty(mapM86900a.get("enable_keyguard"))) {
                C14984ag.m87646b(notification, Boolean.parseBoolean(mapM86900a.get("enable_keyguard")));
            }
            if (!TextUtils.isEmpty(mapM86900a.get("enable_float"))) {
                C14984ag.m87636a(notification, Boolean.parseBoolean(mapM86900a.get("enable_float")));
            }
            if (!TextUtils.isEmpty(mapM86900a.get("float_small_win"))) {
                C14984ag.m87636a(notification, false);
            }
            iM204982a = w5r0.m204982a(mapM86900a.get("section_is_prr"), -1);
            iM204982a2 = w5r0.m204982a(mapM86900a.get("section_prr_cl"), -1);
            if (iM204982a >= 0) {
                C14984ag.m87634a(notification, iM204982a, iM204982a2);
            }
        }
        bVar.f63996a = notification;
        return bVar;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m88060b(Context context, String str, Map<String, String> map, int i) {
        Intent launchIntentForPackage;
        String str2;
        Intent intent;
        Intent uri;
        if (map == null) {
            return null;
        }
        if (i != 0) {
            return m88028a(context, str, map, i);
        }
        if (!map.containsKey("notify_effect")) {
            return null;
        }
        String str3 = map.get("notify_effect");
        String str4 = map.get("intent_flag");
        int i2 = -1;
        try {
            if (!TextUtils.isEmpty(str4)) {
                i2 = Integer.parseInt(str4);
            }
        } catch (NumberFormatException e) {
            ouq0.m169378B("Cause by intent_flag: " + e.getMessage());
        }
        if (AbstractC14991an.f63783a.equals(str3)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e2) {
                ouq0.m169378B("Cause: " + e2.getMessage());
                launchIntentForPackage = null;
            }
        } else if (AbstractC14991an.f63784b.equals(str3)) {
            if (map.containsKey("intent_uri")) {
                String str5 = map.get("intent_uri");
                if (str5 != null) {
                    try {
                        uri = Intent.parseUri(str5, 1);
                        try {
                            uri.setPackage(str);
                        } catch (URISyntaxException e3) {
                            e = e3;
                            ouq0.m169378B("Cause: " + e.getMessage());
                        }
                    } catch (URISyntaxException e4) {
                        e = e4;
                        uri = null;
                    }
                    launchIntentForPackage = uri;
                }
            } else if (map.containsKey("class_name")) {
                String str6 = map.get("class_name");
                intent = new Intent();
                intent.setComponent(new ComponentName(str, str6));
                launchIntentForPackage = intent;
            }
            launchIntentForPackage = null;
        } else {
            if (AbstractC14991an.f63785c.equals(str3) && (str2 = map.get("web_uri")) != null) {
                String strTrim = str2.trim();
                if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                    strTrim = "http://".concat(strTrim);
                }
                try {
                    String protocol = new URL(strTrim).getProtocol();
                    if ("http".equals(protocol) || "https".equals(protocol)) {
                        intent = new Intent("android.intent.action.VIEW");
                        try {
                            intent.setData(Uri.parse(strTrim));
                            C14984ag.m87637a(context, str, intent);
                        } catch (MalformedURLException e5) {
                            e = e5;
                            ouq0.m169378B("Cause: " + e.getMessage());
                        }
                        launchIntentForPackage = intent;
                    }
                } catch (MalformedURLException e6) {
                    e = e6;
                    intent = null;
                }
            }
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage != null) {
            if (i2 >= 0) {
                launchIntentForPackage.setFlags(i2);
            }
            m88048a(launchIntentForPackage);
            launchIntentForPackage.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) == null && (Build.VERSION.SDK_INT < 30 || l4r0.m152825j(context) || !AbstractC14991an.f63785c.equals(str3))) {
                    ouq0.m169393m("not resolve activity:" + launchIntentForPackage);
                }
                return launchIntentForPackage;
            } catch (Exception e7) {
                ouq0.m169378B("Cause: " + e7.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static int m88068c(Map<String, String> map) {
        if (map != null) {
            String str = map.get("notification_priority");
            if (!TextUtils.isEmpty(str)) {
                try {
                    ouq0.m169406z("priority=" + str);
                    return Integer.parseInt(str);
                } catch (Exception e) {
                    ouq0.m169378B("parsing notification priority error: " + e);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m88071d(C14911hb c14911hb) {
        return c14911hb.m87076a() == EnumC14888gf.Registration;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m88072e(C14911hb c14911hb) {
        return m88054a(c14911hb) || m88070c(c14911hb) || m88066b(c14911hb);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m88070c(C14911hb c14911hb) {
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        return m88053a(c14901gsM87077a) && c14901gsM87077a.f63032b == 0 && !m88054a(c14911hb);
    }

    /* JADX INFO: renamed from: c */
    public static void m88069c(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88052a(Context context, String str, boolean z) {
        return l4r0.m152824i() && !z && m88051a(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static c m88035a(Context context, C14911hb c14911hb, byte[] bArr) {
        int iM86914c;
        Map<String, String> mapM86900a;
        int i;
        c cVar = new c();
        C14887g.b bVarM86757f = C14887g.m86757f(context, m88037a(c14911hb), true);
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        if (c14901gsM87077a != null) {
            iM86914c = c14901gsM87077a.m86914c();
            mapM86900a = c14901gsM87077a.m86900a();
        } else {
            iM86914c = 0;
            mapM86900a = null;
        }
        final int iM204986e = w5r0.m204986e(m88037a(c14911hb), iM86914c);
        if (l4r0.m152825j(context) && bVarM86757f == C14887g.b.NOT_ALLOWED) {
            if (c14901gsM87077a != null) {
                tzq0.m193695a(context.getApplicationContext()).m193702g(c14911hb.m87092b(), m88061b(c14911hb), c14901gsM87077a.m86899a(), "10:" + m88037a(c14911hb));
            }
            ouq0.m169393m("Do not notify because user block " + m88037a(c14911hb) + "‘s notification");
            return cVar;
        }
        if (l4r0.m152825j(context) && f63986a != null && f63986a.m87551a(context, iM204986e, m88037a(c14911hb), mapM86900a)) {
            if (c14901gsM87077a != null) {
                tzq0.m193695a(context.getApplicationContext()).m193702g(c14911hb.m87092b(), m88061b(c14911hb), c14901gsM87077a.m86899a(), "14:" + m88037a(c14911hb));
            }
            ouq0.m169393m("Do not notify because card notification is canceled or sequence incorrect");
            return cVar;
        }
        RemoteViews remoteViewsM88033a = m88033a(context, c14911hb, bArr);
        PendingIntent pendingIntentM88024a = m88024a(context, c14911hb, c14911hb.m87092b(), bArr, iM204986e);
        if (pendingIntentM88024a == null) {
            if (c14901gsM87077a != null) {
                tzq0.m193695a(context.getApplicationContext()).m193702g(c14911hb.m87092b(), m88061b(c14911hb), c14901gsM87077a.m86899a(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
            }
            ouq0.m169393m("The click PendingIntent is null. ");
            return cVar;
        }
        b bVarM88034a = m88034a(context, c14911hb, bArr, remoteViewsM88033a, pendingIntentM88024a, iM204986e);
        cVar.f63997a = bVarM88034a.f63995a;
        cVar.f63998a = m88037a(c14911hb);
        Notification notification = bVarM88034a.f63996a;
        if (l4r0.m152824i()) {
            if (!TextUtils.isEmpty(c14901gsM87077a.m86899a())) {
                notification.extras.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, c14901gsM87077a.m86899a());
            }
            notification.extras.putString("local_paid", c14911hb.m87084a());
            C14984ag.m87638a(mapM86900a, notification.extras, "msg_busi_type");
            C14984ag.m87638a(mapM86900a, notification.extras, "disable_notification_flags");
            String str = c14901gsM87077a.m86910b() == null ? null : c14901gsM87077a.m86910b().get("score_info");
            if (!TextUtils.isEmpty(str)) {
                notification.extras.putString("score_info", str);
            }
            notification.extras.putString("pushUid", m88039a(c14901gsM87077a.f63030a, "n_stats_expose"));
            if (m88070c(c14911hb)) {
                i = 1000;
            } else {
                i = m88054a(c14911hb) ? 3000 : -1;
            }
            notification.extras.putString("eventMessageType", String.valueOf(i));
            notification.extras.putString("target_package", m88037a(c14911hb));
        }
        String str2 = c14901gsM87077a.m86900a() != null ? c14901gsM87077a.m86900a().get("message_count") : null;
        if (l4r0.m152824i() && str2 != null) {
            try {
                C14984ag.m87633a(notification, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                tzq0.m193695a(context.getApplicationContext()).m193703i(c14911hb.m87092b(), m88061b(c14911hb), c14901gsM87077a.m86899a(), Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
                ouq0.m169378B("fail to set message count. " + e);
            }
        }
        String strM88037a = m88037a(c14911hb);
        C14984ag.m87635a(notification, strM88037a);
        final C14983af c14983afM87599a = C14983af.m87599a(context, strM88037a);
        if (l4r0.m152825j(context) && f63986a != null) {
            f63986a.m87549a(c14911hb, c14901gsM87077a.m86900a(), iM204986e, notification);
        }
        if (l4r0.m152825j(context) && f63986a != null && f63986a.m87552a(c14901gsM87077a.m86900a(), iM204986e, notification)) {
            ouq0.m169403w("consume this notificaiton by agent");
        } else {
            c14983afM87599a.m87617a(iM204986e, notification);
            cVar.f63999a = true;
            ouq0.m169393m("notification: " + c14901gsM87077a.m86899a() + " is notifyied");
        }
        if (l4r0.m152824i() && l4r0.m152825j(context)) {
            C14981ad.m87570a().m87585a(context, iM204986e, notification);
            C15006bb.m87791a(context, strM88037a, iM204986e, c14901gsM87077a.m86899a(), notification);
        }
        if (m88054a(c14911hb)) {
            tzq0.m193695a(context.getApplicationContext()).m193701f(c14911hb.m87092b(), m88061b(c14911hb), c14901gsM87077a.m86899a(), 3002, null);
        }
        if (m88070c(c14911hb)) {
            tzq0.m193695a(context.getApplicationContext()).m193701f(c14911hb.m87092b(), m88061b(c14911hb), c14901gsM87077a.m86899a(), 1002, null);
        }
        if (Build.VERSION.SDK_INT < 26) {
            String strM86899a = c14901gsM87077a.m86899a();
            tsq0 tsq0VarM192627f = tsq0.m192627f(context);
            int iM88022a = m88022a(c14901gsM87077a.m86900a());
            if (iM88022a > 0 && !TextUtils.isEmpty(strM86899a)) {
                final String str3 = "n_timeout_" + strM86899a;
                tsq0VarM192627f.m192630i(str3);
                tsq0VarM192627f.m192635n(new tsq0.AbstractRunnableC20394c() { // from class: com.xiaomi.push.service.x.1
                    @Override // p153l.tsq0.AbstractRunnableC20394c
                    /* JADX INFO: renamed from: a */
                    public String mo87798a() {
                        return str3;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        c14983afM87599a.m87616a(iM204986e);
                    }
                }, iM88022a);
            }
        }
        Pair<Integer, C14911hb> pair = new Pair<>(Integer.valueOf(iM204986e), c14911hb);
        LinkedList<Pair<Integer, C14911hb>> linkedList = f63987a;
        synchronized (linkedList) {
            try {
                linkedList.add(pair);
                if (linkedList.size() > 100) {
                    linkedList.remove();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: renamed from: a */
    private static PendingIntent m88024a(Context context, C14911hb c14911hb, String str, byte[] bArr, int i) {
        return m88025a(context, c14911hb, str, bArr, i, 0, m88050a(context, c14911hb, str));
    }

    /* JADX INFO: renamed from: a */
    private static PendingIntent m88025a(Context context, C14911hb c14911hb, String str, byte[] bArr, int i, int i2, boolean z) {
        int i3;
        String strM86899a;
        Intent intent;
        if (m88070c(c14911hb)) {
            i3 = 1000;
        } else {
            i3 = m88054a(c14911hb) ? 3000 : -1;
        }
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        if (c14901gsM87077a != null) {
            strM86899a = c14901gsM87077a.m86899a();
        } else {
            strM86899a = "";
        }
        boolean zM88054a = m88054a(c14911hb);
        if (c14901gsM87077a != null && !TextUtils.isEmpty(c14901gsM87077a.f63039e)) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(c14901gsM87077a.f63039e));
            try {
                String protocol = new URL(c14901gsM87077a.f63039e).getProtocol();
                if (!"http".equals(protocol) && !"https".equals(protocol)) {
                    intent2.setPackage(str);
                } else {
                    C14984ag.m87637a(context, str, intent2);
                }
            } catch (MalformedURLException unused) {
                ouq0.m169393m("meet URL exception : " + c14901gsM87077a.f63039e);
                intent2.setPackage(str);
            }
            intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent2.putExtra("messageId", strM86899a);
            intent2.putExtra("eventMessageType", i3);
            if (Build.VERSION.SDK_INT >= 31) {
                return PendingIntent.getActivity(context, 0, intent2, 167772160);
            }
            return PendingIntent.getActivity(context, 0, intent2, 134217728);
        }
        if (zM88054a) {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.xiaomi.xmsf", "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(strM86899a));
        } else {
            intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent.setComponent(new ComponentName(str, "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(strM86899a));
        }
        intent.putExtra("notification_click_button", i2);
        intent.putExtra("messageId", strM86899a);
        intent.putExtra("eventMessageType", i3);
        if (!zM88054a && z) {
            Intent intent3 = new Intent();
            intent3.setComponent(m88027a(str));
            intent3.addFlags(276824064);
            intent3.putExtra("mipush_serviceIntent", intent);
            intent3.addCategory(String.valueOf(i));
            intent3.addCategory(String.valueOf(strM86899a));
            intent3.addCategory(String.valueOf(i2));
            m88041a(context, intent3, c14911hb, c14901gsM87077a, strM86899a, i2);
            if (Build.VERSION.SDK_INT >= 31) {
                return PendingIntent.getActivity(context, 0, intent3, 167772160);
            }
            return PendingIntent.getActivity(context, 0, intent3, 134217728);
        }
        Intent intent4 = intent;
        m88041a(context, intent4, c14911hb, c14901gsM87077a, strM86899a, i2);
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getService(context, 0, intent4, 167772160);
        }
        return PendingIntent.getService(context, 0, intent4, 134217728);
    }

    /* JADX INFO: renamed from: a */
    private static void m88041a(Context context, Intent intent, C14911hb c14911hb, C14901gs c14901gs, String str, int i) {
        if (c14911hb == null || c14901gs == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strM88038a = m88038a(c14901gs.m86900a(), i);
        if (TextUtils.isEmpty(strM88038a)) {
            return;
        }
        if (AbstractC14991an.f63783a.equals(strM88038a) || AbstractC14991an.f63784b.equals(strM88038a) || AbstractC14991an.f63785c.equals(strM88038a)) {
            intent.putExtra("messageId", str);
            intent.putExtra("local_paid", c14911hb.f63196a);
            if (!TextUtils.isEmpty(c14911hb.f63200b)) {
                intent.putExtra("target_package", c14911hb.f63200b);
            }
            intent.putExtra("job_key", m88039a(c14901gs.m86900a(), "jobkey"));
            intent.putExtra(i + "_target_component", m88021a(context, c14911hb.f63200b, c14901gs.m86900a(), i));
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m88050a(Context context, C14911hb c14911hb, String str) {
        if (c14911hb != null && c14911hb.m87077a() != null && c14911hb.m87077a().m86900a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(c14911hb.m87077a().m86900a().get("use_clicked_activity")) && C15016j.m87843a(context, m88027a(str));
        }
        ouq0.m169393m("should clicked activity params are null.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static ComponentName m88027a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[PHI: r0 r3
      0x0072: PHI (r0v4 java.lang.String) = (r0v2 java.lang.String), (r0v5 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r3v14 java.lang.String) = (r3v13 java.lang.String), (r3v20 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    private static String[] m88057a(Context context, C14901gs c14901gs) {
        String str;
        String strM86917c = c14901gs.m86917c();
        String strM86921d = c14901gs.m86921d();
        Map<String, String> mapM86900a = c14901gs.m86900a();
        if (mapM86900a != null) {
            int iIntValue = Float.valueOf((context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density) + 0.5f).intValue();
            if (iIntValue <= 320) {
                String str2 = mapM86900a.get("title_short");
                if (!TextUtils.isEmpty(str2)) {
                    strM86917c = str2;
                }
                str = mapM86900a.get("description_short");
                if (!TextUtils.isEmpty(str)) {
                    strM86921d = str;
                }
            } else if (iIntValue > 360) {
                String str3 = mapM86900a.get("title_long");
                if (!TextUtils.isEmpty(str3)) {
                    strM86917c = str3;
                }
                str = mapM86900a.get("description_long");
                if (!TextUtils.isEmpty(str)) {
                    strM86921d = str;
                }
            }
        }
        return new String[]{strM86917c, strM86921d};
    }

    /* JADX INFO: renamed from: a */
    private static String m88039a(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static int m88021a(Context context, String str, Map<String, String> map, int i) {
        ComponentName componentNameM87842a;
        Intent intentM88060b = m88060b(context, str, map, i);
        if (intentM88060b == null || (componentNameM87842a = C15016j.m87842a(context, intentM88060b)) == null) {
            return 0;
        }
        return componentNameM87842a.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88051a(Context context, String str) {
        return C14887g.m86766o(context, str);
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private static void m88049a(vzq0 vzq0Var, Context context, String str, C14911hb c14911hb, byte[] bArr, int i) {
        PendingIntent pendingIntentM88026a;
        PendingIntent pendingIntentM88026a2;
        PendingIntent pendingIntentM88026a3;
        PendingIntent pendingIntentM88026a4;
        Map<String, String> mapM86900a = c14911hb.m87077a().m86900a();
        if (TextUtils.equals("3", mapM86900a.get("notification_style_type")) || TextUtils.equals("4", mapM86900a.get("notification_style_type"))) {
            return;
        }
        if (m88067b(mapM86900a)) {
            for (int i2 = 1; i2 <= 3; i2++) {
                String str2 = mapM86900a.get(String.format("cust_btn_%s_n", Integer.valueOf(i2)));
                if (!TextUtils.isEmpty(str2) && (pendingIntentM88026a4 = m88026a(context, str, c14911hb, bArr, i, i2)) != null) {
                    vzq0Var.addAction(0, str2, pendingIntentM88026a4);
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(mapM86900a.get("notification_style_button_left_name")) && (pendingIntentM88026a3 = m88026a(context, str, c14911hb, bArr, i, 1)) != null) {
            vzq0Var.addAction(0, mapM86900a.get("notification_style_button_left_name"), pendingIntentM88026a3);
        }
        if (!TextUtils.isEmpty(mapM86900a.get("notification_style_button_mid_name")) && (pendingIntentM88026a2 = m88026a(context, str, c14911hb, bArr, i, 2)) != null) {
            vzq0Var.addAction(0, mapM86900a.get("notification_style_button_mid_name"), pendingIntentM88026a2);
        }
        if (TextUtils.isEmpty(mapM86900a.get("notification_style_button_right_name")) || (pendingIntentM88026a = m88026a(context, str, c14911hb, bArr, i, 3)) == null) {
            return;
        }
        vzq0Var.addAction(0, mapM86900a.get("notification_style_button_right_name"), pendingIntentM88026a);
    }

    /* JADX INFO: renamed from: a */
    private static PendingIntent m88026a(Context context, String str, C14911hb c14911hb, byte[] bArr, int i, int i2) {
        Map<String, String> mapM86900a = c14911hb.m87077a().m86900a();
        if (mapM86900a == null) {
            return null;
        }
        boolean zM88050a = m88050a(context, c14911hb, str);
        if (zM88050a) {
            return m88025a(context, c14911hb, str, bArr, i, i2, zM88050a);
        }
        Intent intentM88028a = m88028a(context, str, mapM86900a, i2);
        if (intentM88028a == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getActivity(context, 0, intentM88028a, 167772160);
        }
        return PendingIntent.getActivity(context, 0, intentM88028a, 134217728);
    }

    /* JADX INFO: renamed from: a */
    public static String m88038a(Map<String, String> map, int i) {
        String str;
        if (i == 0) {
            str = "notify_effect";
        } else if (m88067b(map)) {
            str = String.format("cust_btn_%s_ne", Integer.valueOf(i));
        } else if (i == 1) {
            str = "notification_style_button_left_notify_effect";
        } else if (i == 2) {
            str = "notification_style_button_mid_notify_effect";
        } else if (i == 3) {
            str = "notification_style_button_right_notify_effect";
        } else {
            str = i == 4 ? "notification_colorful_button_notify_effect" : null;
        }
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m88028a(Context context, String str, Map<String, String> map, int i) {
        if (m88067b(map)) {
            return m88029a(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i)), String.format("cust_btn_%s_iu", Integer.valueOf(i)), String.format("cust_btn_%s_ic", Integer.valueOf(i)), String.format("cust_btn_%s_wu", Integer.valueOf(i)));
        }
        if (i == 1) {
            return m88029a(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        }
        if (i == 2) {
            return m88029a(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
        }
        if (i == 3) {
            return m88029a(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
        }
        if (i != 4) {
            return null;
        }
        return m88029a(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
    }

    /* JADX INFO: renamed from: a */
    private static Intent m88029a(Context context, String str, Map<String, String> map, String str2, String str3, String str4, String str5) {
        Intent launchIntentForPackage;
        Intent intent;
        Intent uri;
        String str6 = map.get(str2);
        if (TextUtils.isEmpty(str6)) {
            return null;
        }
        if (AbstractC14991an.f63783a.equals(str6)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e) {
                ouq0.m169378B("Cause: " + e.getMessage());
                launchIntentForPackage = null;
            }
        } else if (AbstractC14991an.f63784b.equals(str6)) {
            if (map.containsKey(str3)) {
                String str7 = map.get(str3);
                if (str7 != null) {
                    try {
                        uri = Intent.parseUri(str7, 1);
                        try {
                            uri.setPackage(str);
                        } catch (URISyntaxException e2) {
                            e = e2;
                            ouq0.m169378B("Cause: " + e.getMessage());
                        }
                    } catch (URISyntaxException e3) {
                        e = e3;
                        uri = null;
                    }
                    launchIntentForPackage = uri;
                }
            } else if (map.containsKey(str4)) {
                String str8 = map.get(str4);
                intent = new Intent();
                intent.setComponent(new ComponentName(str, str8));
                launchIntentForPackage = intent;
            }
            launchIntentForPackage = null;
        } else {
            if (AbstractC14991an.f63785c.equals(str6)) {
                String str9 = map.get(str5);
                if (!TextUtils.isEmpty(str9)) {
                    String strTrim = str9.trim();
                    if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                        strTrim = "http://".concat(strTrim);
                    }
                    try {
                        String protocol = new URL(strTrim).getProtocol();
                        if ("http".equals(protocol) || "https".equals(protocol)) {
                            intent = new Intent("android.intent.action.VIEW");
                            try {
                                intent.setData(Uri.parse(strTrim));
                                C14984ag.m87637a(context, str, intent);
                            } catch (MalformedURLException e4) {
                                e = e4;
                                ouq0.m169378B("Cause: " + e.getMessage());
                            }
                            launchIntentForPackage = intent;
                        }
                    } catch (MalformedURLException e5) {
                        e = e5;
                        intent = null;
                    }
                }
            }
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) == null && (Build.VERSION.SDK_INT < 30 || l4r0.m152825j(context) || !AbstractC14991an.f63785c.equals(str6))) {
                    ouq0.m169393m("not resolve activity:" + launchIntentForPackage + "for buttons");
                }
                return launchIntentForPackage;
            } catch (Exception e6) {
                ouq0.m169378B("Cause: " + e6.getMessage());
            }
        }
        return null;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private static vzq0 m88040a(Context context, C14911hb c14911hb, byte[] bArr, String str, int i) {
        Context context2;
        String strM88037a = m88037a(c14911hb);
        Map<String, String> mapM86900a = c14911hb.m87077a().m86900a();
        String str2 = mapM86900a.get("notification_style_type");
        vzq0 vzq0VarM87548a = (!l4r0.m152825j(context) || f63986a == null) ? null : f63986a.m87548a(context, i, strM88037a, mapM86900a);
        if (vzq0VarM87548a != null) {
            vzq0VarM87548a.mo204123g(mapM86900a);
            return vzq0VarM87548a;
        }
        if ("2".equals(str2)) {
            vzq0 vzq0Var = new vzq0(context);
            Bitmap bitmapM88031a = TextUtils.isEmpty(mapM86900a.get("notification_bigPic_uri")) ? null : m88031a(context, mapM86900a.get("notification_bigPic_uri"), false);
            if (bitmapM88031a == null) {
                ouq0.m169393m("can not get big picture.");
                return vzq0Var;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(vzq0Var);
            bigPictureStyle.bigPicture(bitmapM88031a);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            vzq0Var.setStyle(bigPictureStyle);
            return vzq0Var;
        }
        if ("1".equals(str2)) {
            vzq0 vzq0Var2 = new vzq0(context);
            vzq0Var2.setStyle(new Notification.BigTextStyle().bigText(str));
            return vzq0Var2;
        }
        if ("4".equals(str2) && l4r0.m152824i()) {
            uzq0 uzq0Var = new uzq0(context, strM88037a);
            if (!TextUtils.isEmpty(mapM86900a.get("notification_banner_image_uri"))) {
                uzq0Var.m198852G(m88031a(context, mapM86900a.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(mapM86900a.get("notification_banner_icon_uri"))) {
                uzq0Var.m198854I(m88031a(context, mapM86900a.get("notification_banner_icon_uri"), false));
            }
            uzq0Var.mo204123g(mapM86900a);
            return uzq0Var;
        }
        if ("3".equals(str2) && l4r0.m152824i()) {
            wzq0 wzq0Var = new wzq0(context, i, strM88037a);
            if (TextUtils.isEmpty(mapM86900a.get("notification_colorful_button_text"))) {
                context2 = context;
            } else {
                context2 = context;
                PendingIntent pendingIntentM88026a = m88026a(context2, strM88037a, c14911hb, bArr, i, 4);
                if (pendingIntentM88026a != null) {
                    wzq0Var.m208744I(mapM86900a.get("notification_colorful_button_text"), pendingIntentM88026a).m208745J(mapM86900a.get("notification_colorful_button_bg_color"));
                }
            }
            if (!TextUtils.isEmpty(mapM86900a.get("notification_colorful_bg_color"))) {
                wzq0Var.m208746L(mapM86900a.get("notification_colorful_bg_color"));
            } else if (!TextUtils.isEmpty(mapM86900a.get("notification_colorful_bg_image_uri"))) {
                wzq0Var.m208743H(m88031a(context2, mapM86900a.get("notification_colorful_bg_image_uri"), false));
            }
            wzq0Var.mo204123g(mapM86900a);
            return wzq0Var;
        }
        return new vzq0(context);
    }

    /* JADX INFO: renamed from: b */
    private static int m88058b(Context context, String str) {
        int iM88020a = m88020a(context, str, "mipush_notification");
        int iM88020a2 = m88020a(context, str, "mipush_small_notification");
        if (iM88020a <= 0) {
            iM88020a = iM88020a2 > 0 ? iM88020a2 : context.getApplicationInfo().icon;
        }
        return iM88020a == 0 ? context.getApplicationInfo().logo : iM88020a;
    }

    /* JADX INFO: renamed from: b */
    public static void m88062b(Context context, String str) {
        if (!l4r0.m152825j(context) || f63986a == null || TextUtils.isEmpty(str)) {
            return;
        }
        f63986a.m87550a(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m88065b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m88063b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m88066b(C14911hb c14911hb) {
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        return m88053a(c14901gsM87077a) && c14901gsM87077a.f63032b == 1 && !m88054a(c14911hb);
    }

    /* JADX INFO: renamed from: b */
    public static String m88061b(C14911hb c14911hb) {
        if (m88054a(c14911hb)) {
            return "E100002";
        }
        if (m88070c(c14911hb)) {
            return "E100000";
        }
        if (m88066b(c14911hb)) {
            return "E100001";
        }
        if (m88071d(c14911hb)) {
            return "E100003";
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    private static int m88059b(Map<String, String> map) {
        if (map != null) {
            String str = map.get("channel_importance");
            if (!TextUtils.isEmpty(str)) {
                try {
                    ouq0.m169406z("importance=" + str);
                    return Integer.parseInt(str);
                } catch (Exception e) {
                    ouq0.m169378B("parsing channel importance error: " + e);
                }
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m88067b(Map<String, String> map) {
        if (map == null) {
            ouq0.m169393m("meta extra is null");
            return false;
        }
        return Constants.VIA_SHARE_TYPE_INFO.equals(map.get("notification_style_type"));
    }

    /* JADX INFO: renamed from: b */
    private static void m88064b(Context context, String str, vzq0 vzq0Var, Map<String, String> map) {
        int iM88020a;
        if (!l4r0.m152825j(context)) {
            String strM88039a = m88039a(map, "fcm_icon_uri");
            String strM88039a2 = m88039a(map, "fcm_icon_color");
            if (!TextUtils.isEmpty(strM88039a) && !TextUtils.isEmpty(strM88039a2) && (iM88020a = m88020a(context, str, strM88039a)) > 0) {
                vzq0Var.setSmallIcon(iM88020a);
                vzq0Var.m204122f(strM88039a2);
                return;
            }
        }
        vzq0Var.setSmallIcon(Icon.createWithResource(str, C14984ag.m87625a(context, str)));
    }

    /* JADX INFO: renamed from: a */
    private static int m88022a(Map<String, String> map) {
        String str = map == null ? null : map.get("timeout");
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static RemoteViews m88033a(Context context, C14911hb c14911hb, byte[] bArr) {
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        String strM88037a = m88037a(c14911hb);
        if (c14901gsM87077a != null && c14901gsM87077a.m86900a() != null) {
            Map<String, String> mapM86900a = c14901gsM87077a.m86900a();
            String str = mapM86900a.get("layout_name");
            String str2 = mapM86900a.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(strM88037a);
                    int identifier = resourcesForApplication.getIdentifier(str, "layout", strM88037a);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(strM88037a, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", strM88037a);
                                if (identifier2 > 0) {
                                    remoteViews.setTextViewText(identifier2, string);
                                }
                            }
                        }
                        if (jSONObject.has("image")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                            Iterator<String> itKeys2 = jSONObject3.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                String string2 = jSONObject3.getString(next2);
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", strM88037a);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", strM88037a);
                                if (identifier3 > 0) {
                                    remoteViews.setImageViewResource(identifier3, identifier4);
                                }
                            }
                        }
                        if (jSONObject.has("time")) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                            Iterator<String> itKeys3 = jSONObject4.keys();
                            while (itKeys3.hasNext()) {
                                String next3 = itKeys3.next();
                                String string3 = jSONObject4.getString(next3);
                                if (string3.length() == 0) {
                                    string3 = "yy-MM-dd hh:mm";
                                }
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", strM88037a);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e) {
                        ouq0.m169397q(e);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    ouq0.m169397q(e2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m88030a(Context context, int i) {
        return m88032a(context.getResources().getDrawable(i));
    }

    /* JADX INFO: renamed from: a */
    private static int m88020a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m88032a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: a */
    private static Notification m88023a(Notification notification) {
        Object objM169166d = otq0.m169166d(notification, "extraNotification");
        if (objM169166d != null) {
            otq0.m169167e(objM169166d, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    /* JADX INFO: renamed from: a */
    public static String m88037a(C14911hb c14911hb) {
        C14901gs c14901gsM87077a;
        if ("com.xiaomi.xmsf".equals(c14911hb.f63200b) && (c14901gsM87077a = c14911hb.m87077a()) != null && c14901gsM87077a.m86900a() != null) {
            String str = c14901gsM87077a.m86900a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return c14911hb.f63200b;
    }

    /* JADX INFO: renamed from: a */
    public static void m88042a(Context context, String str) {
        m88043a(context, str, -1);
    }

    /* JADX INFO: renamed from: a */
    public static void m88043a(Context context, String str, int i) {
        m88044a(context, str, i, -1);
    }

    /* JADX INFO: renamed from: a */
    public static void m88044a(Context context, String str, int i, int i2) {
        int iHashCode;
        if (context == null || TextUtils.isEmpty(str) || i < -1) {
            return;
        }
        C14983af c14983afM87599a = C14983af.m87599a(context, str);
        List<StatusBarNotification> listM87622b = c14983afM87599a.m87622b();
        if (w5r0.m204985d(listM87622b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        boolean z = false;
        if (i == -1) {
            z = true;
            iHashCode = 0;
        } else {
            iHashCode = ((str.hashCode() / 10) * 10) + i;
        }
        for (StatusBarNotification statusBarNotification : listM87622b) {
            if (!TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                if (!z) {
                    if (iHashCode == id) {
                        C15010d.m87806a(context, statusBarNotification, i2);
                        linkedList.add(statusBarNotification);
                        c14983afM87599a.m87616a(id);
                        break;
                    }
                } else {
                    linkedList.add(statusBarNotification);
                    c14983afM87599a.m87616a(id);
                }
            }
        }
        m88047a(context, (LinkedList<? extends Object>) linkedList);
    }

    /* JADX INFO: renamed from: a */
    public static void m88045a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        C14983af c14983afM87599a = C14983af.m87599a(context, str);
        List<StatusBarNotification> listM87622b = c14983afM87599a.m87622b();
        if (w5r0.m204985d(listM87622b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : listM87622b) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                String strM87631a = C14984ag.m87631a(notification);
                String strM87645b = C14984ag.m87645b(notification);
                if (!TextUtils.isEmpty(strM87631a) && !TextUtils.isEmpty(strM87645b) && m88055a(strM87631a, str2) && m88055a(strM87645b, str3)) {
                    linkedList.add(statusBarNotification);
                    c14983afM87599a.m87616a(id);
                }
            }
        }
        m88047a(context, (LinkedList<? extends Object>) linkedList);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m88055a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m88047a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        C15003az.m87772a(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
    }

    /* JADX INFO: renamed from: a */
    public static int m88019a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88056a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m88053a(C14901gs c14901gs) {
        if (c14901gs != null) {
            String strM86899a = c14901gs.m86899a();
            if (!TextUtils.isEmpty(strM86899a) && strM86899a.length() == 22 && "satuigmo".indexOf(strM86899a.charAt(0)) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88054a(C14911hb c14911hb) {
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        return m88053a(c14901gsM87077a) && c14901gsM87077a.m86932l();
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m88031a(Context context, String str, boolean z) {
        Future futureSubmit = f63988a.submit(new a(str, context, z));
        try {
            try {
                try {
                    Bitmap bitmap = (Bitmap) futureSubmit.get(180L, TimeUnit.SECONDS);
                    if (bitmap == null) {
                        futureSubmit.cancel(true);
                    }
                    return bitmap;
                } catch (ExecutionException e) {
                    ouq0.m169397q(e);
                    futureSubmit.cancel(true);
                    return null;
                }
            } catch (InterruptedException e2) {
                ouq0.m169397q(e2);
                futureSubmit.cancel(true);
                return null;
            } catch (TimeoutException e3) {
                ouq0.m169397q(e3);
                futureSubmit.cancel(true);
                return null;
            }
        } catch (Throwable th) {
            futureSubmit.cancel(true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m88036a(Context context, String str, Map<String, String> map) {
        if (map != null && !TextUtils.isEmpty(map.get("channel_name"))) {
            return map.get("channel_name");
        }
        return C14887g.m86765n(context, str);
    }

    /* JADX INFO: renamed from: a */
    private static void m88048a(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.setFlags(intent.getFlags() & (-196));
    }

    /* JADX INFO: renamed from: a */
    private static void m88046a(Context context, String str, vzq0 vzq0Var, Map<String, String> map) {
        int iM88020a = m88020a(context, str, "mipush_small_notification");
        int iM88020a2 = m88020a(context, str, "mipush_notification");
        if (l4r0.m152825j(context)) {
            if (iM88020a > 0 && iM88020a2 > 0) {
                vzq0Var.setSmallIcon(iM88020a);
                vzq0Var.setLargeIcon(m88030a(context, iM88020a2));
                return;
            } else {
                m88064b(context, str, vzq0Var, map);
                return;
            }
        }
        if (iM88020a > 0) {
            vzq0Var.setSmallIcon(iM88020a);
        } else {
            m88064b(context, str, vzq0Var, map);
        }
        if (iM88020a2 > 0) {
            vzq0Var.setLargeIcon(m88030a(context, iM88020a2));
        }
    }
}

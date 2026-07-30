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
import com.xiaomi.push.C14739g;
import com.xiaomi.push.C14753gs;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.EnumC14740gf;
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
import p149l.fvq0;
import p149l.ikq0;
import p149l.ilq0;
import p149l.njq0;
import p149l.nqq0;
import p149l.oqq0;
import p149l.pqq0;
import p149l.qqq0;
import p149l.qwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.x */
/* JADX INFO: loaded from: classes2.dex */
public class C14883x {

    /* JADX INFO: renamed from: a */
    public static long f63138a;

    /* JADX INFO: renamed from: a */
    private static volatile AbstractC14831ab f63139a;

    /* JADX INFO: renamed from: a */
    private static final LinkedList<Pair<Integer, C14763hb>> f63140a = new LinkedList<>();

    /* JADX INFO: renamed from: a */
    private static ExecutorService f63141a = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: com.xiaomi.push.service.x$a */
    public static class a implements Callable<Bitmap> {

        /* JADX INFO: renamed from: a */
        private Context f63145a;

        /* JADX INFO: renamed from: a */
        private String f63146a;

        /* JADX INFO: renamed from: a */
        private boolean f63147a;

        public a(String str, Context context, boolean z) {
            this.f63145a = context;
            this.f63146a = str;
            this.f63147a = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call() throws Throwable {
            if (TextUtils.isEmpty(this.f63146a)) {
                ilq0.m137040m("Failed get online picture/icon resource cause picUrl is empty");
                return null;
            }
            boolean zStartsWith = this.f63146a.startsWith("http");
            Context context = this.f63145a;
            if (!zStartsWith) {
                Bitmap bitmapM86416a = C14834ae.m86416a(context, this.f63146a);
                if (bitmapM86416a == null) {
                    ilq0.m137040m("Failed get online picture/icon resource");
                }
                return bitmapM86416a;
            }
            C14834ae.b bVarM86418a = C14834ae.m86418a(context, this.f63146a, this.f63147a);
            if (bVarM86418a != null) {
                return bVarM86418a.f62847a;
            }
            ilq0.m137040m("Failed get online picture/icon resource");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.x$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        long f63148a = 0;

        /* JADX INFO: renamed from: a */
        Notification f63149a;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.x$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public String f63151a;

        /* JADX INFO: renamed from: a */
        public long f63150a = 0;

        /* JADX INFO: renamed from: a */
        public boolean f63152a = false;
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
    private static b m86863a(Context context, C14763hb c14763hb, byte[] bArr, RemoteViews remoteViews, PendingIntent pendingIntent, int i) throws Throwable {
        C14763hb c14763hb2;
        byte[] bArr2;
        int i2;
        pqq0 pqq0Var;
        boolean z;
        String strM86413a;
        boolean z2;
        boolean z3;
        long jCurrentTimeMillis;
        boolean z4;
        boolean z5;
        int iM86848a;
        pqq0 pqq0Var2;
        Notification notification;
        int iM176890a;
        int iM176890a2;
        Bitmap bitmapM86416a;
        b bVar = new b();
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        String strM86866a = m86866a(c14763hb);
        Map<String, String> mapM85729a = c14753gsM85906a.m85729a();
        String[] strArrM86886a = m86886a(context, c14753gsM85906a);
        if (remoteViews != null) {
            pqq0Var = new pqq0(context);
            pqq0Var.setCustomContentView(remoteViews);
            c14763hb2 = c14763hb;
            bArr2 = bArr;
            i2 = i;
        } else if (mapM85729a == null || !mapM85729a.containsKey("notification_style_type")) {
            c14763hb2 = c14763hb;
            bArr2 = bArr;
            i2 = i;
            pqq0Var = new pqq0(context);
        } else {
            c14763hb2 = c14763hb;
            bArr2 = bArr;
            i2 = i;
            pqq0Var = m86869a(context, c14763hb2, bArr2, strArrM86886a[1], i2);
        }
        m86878a(pqq0Var, context, c14763hb2.m85921b(), c14763hb2, bArr2, i2);
        pqq0Var.setContentTitle(strArrM86886a[0]);
        pqq0Var.setContentText(strArrM86886a[1]);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        pqq0Var.setWhen(jCurrentTimeMillis2);
        String strM86868a = m86868a(mapM85729a, "notification_show_when");
        if (TextUtils.isEmpty(strM86868a)) {
            pqq0Var.setShowWhen(true);
        } else {
            pqq0Var.setShowWhen(Boolean.parseBoolean(strM86868a));
        }
        pqq0Var.setContentIntent(pendingIntent);
        m86875a(context, strM86866a, pqq0Var, mapM85729a);
        Bitmap bitmapM86860a = mapM85729a == null ? null : m86860a(context, mapM85729a.get("notification_small_icon_uri"), true);
        if (bitmapM86860a != null) {
            Object objM136884g = ikq0.m136884g("android.graphics.drawable.Icon", "createWithBitmap", bitmapM86860a);
            if (objM136884g != null) {
                ikq0.m136882e(pqq0Var, "setSmallIcon", objM136884g);
                Bundle bundle = new Bundle();
                bundle.putBoolean("miui.isGrayscaleIcon", true);
                pqq0Var.addExtras(bundle);
            } else {
                ilq0.m137040m("failed te get small icon with url:" + mapM85729a.get("notification_small_icon_uri"));
            }
        } else {
            ilq0.m137040m("failed to get small icon url:" + m86868a(mapM85729a, "notification_small_icon_uri"));
        }
        pqq0Var.m170933f(m86868a(mapM85729a, "notification_small_icon_color"));
        String strM86868a2 = m86868a(mapM85729a, "__dynamic_icon_uri");
        boolean z6 = Boolean.parseBoolean(m86868a(mapM85729a, "__adiom")) || !fvq0.m123355i();
        if (TextUtils.isEmpty(strM86868a2) || !z6) {
            z = false;
        } else {
            if (strM86868a2.startsWith("http")) {
                C14834ae.b bVarM86418a = C14834ae.m86418a(context, strM86868a2, true);
                if (bVarM86418a != null) {
                    bitmapM86416a = bVarM86418a.f62847a;
                    bVar.f63148a = bVarM86418a.f62846a;
                } else {
                    bitmapM86416a = null;
                }
            } else {
                bitmapM86416a = C14834ae.m86416a(context, strM86868a2);
            }
            if (bitmapM86416a != null) {
                pqq0Var.setLargeIcon(bitmapM86416a);
                z = true;
            } else {
                z = false;
            }
        }
        Bitmap bitmapM86860a2 = mapM85729a == null ? null : m86860a(context, mapM85729a.get("notification_large_icon_uri"), true);
        if (bitmapM86860a2 != null) {
            pqq0Var.setLargeIcon(bitmapM86860a2);
        }
        if (mapM85729a != null) {
            String strM86866a2 = mapM85729a.get("notification_group");
            z2 = Boolean.parseBoolean(mapM85729a.get("notification_is_summary"));
            boolean z7 = Boolean.parseBoolean(mapM85729a.get("notification_group_disable_default"));
            if (TextUtils.isEmpty(strM86866a2) && (fvq0.m123355i() || !z7)) {
                strM86866a2 = m86866a(c14763hb);
            }
            ikq0.m136882e(pqq0Var, "setGroupSummary", Boolean.valueOf(z2));
            String str = mapM85729a.get("notification_style_type");
            if ("com.xiaomi.xmsf".equals(context.getPackageName()) && ("4".equals(str) || "3".equals(str))) {
                strM86413a = m86866a(c14763hb) + "_custom_" + jCurrentTimeMillis2;
                z3 = true;
            } else {
                strM86413a = strM86866a2;
            }
            pqq0Var.setAutoCancel(true);
            jCurrentTimeMillis = System.currentTimeMillis();
            if (mapM85729a != null && mapM85729a.containsKey("ticker")) {
                pqq0Var.setTicker(mapM85729a.get("ticker"));
            }
            if (jCurrentTimeMillis - f63138a > 10000) {
                f63138a = jCurrentTimeMillis;
                iM86848a = c14753gsM85906a.f62179a;
                if (m86894b(context, strM86866a)) {
                    iM86848a = m86848a(context, strM86866a);
                }
                pqq0Var.setDefaults(iM86848a);
                if (mapM85729a != null || (iM86848a & 1) == 0) {
                    z4 = z;
                    z5 = z3;
                } else {
                    String str2 = mapM85729a.get("sound_uri");
                    if (TextUtils.isEmpty(str2)) {
                        z4 = z;
                        z5 = z3;
                    } else {
                        z4 = z;
                        z5 = z3;
                        if (str2.startsWith("android.resource://" + strM86866a)) {
                            pqq0Var.setDefaults(iM86848a ^ 1);
                            pqq0Var.setSound(Uri.parse(str2));
                        }
                    }
                }
            } else {
                z4 = z;
                z5 = z3;
                iM86848a = -100;
            }
            if (mapM85729a != null || Build.VERSION.SDK_INT < 26) {
                pqq0Var2 = pqq0Var;
                if (mapM85729a != null && Build.VERSION.SDK_INT < 26) {
                    ikq0.m136882e(pqq0Var2, "setPriority", Integer.valueOf(m86897c(mapM85729a)));
                }
            } else {
                C14835af c14835afM86428a = C14835af.m86428a(context, strM86866a);
                int iM86851a = m86851a(mapM85729a);
                if (iM86851a > 0) {
                    Object[] objArr = {Long.valueOf(iM86851a * 1000)};
                    pqq0Var2 = pqq0Var;
                    ikq0.m136882e(pqq0Var2, "setTimeoutAfter", objArr);
                } else {
                    pqq0Var2 = pqq0Var;
                }
                C14832ac.m86389a(c14753gsM85906a);
                String str3 = mapM85729a.get("channel_id");
                if (!TextUtils.isEmpty(str3) || context.getApplicationInfo().targetSdkVersion >= 26) {
                    String strM86865a = m86865a(context, strM86866a, mapM85729a);
                    int iM86888b = m86888b(mapM85729a);
                    int i3 = c14753gsM85906a.f62179a;
                    String str4 = mapM85729a.get("channel_description");
                    String str5 = mapM85729a.get("sound_uri");
                    String str6 = mapM85729a.get("channel_perm");
                    C14858bb.m86621a(context, mapM85729a, pqq0Var2, jCurrentTimeMillis2);
                    ikq0.m136882e(pqq0Var2, "setChannelId", C14832ac.m86385a(c14835afM86428a, str3, strM86865a, str4, i3, iM86888b, str5, str6));
                    if (iM86848a == -100 && C14836ag.m86472a(mapM85729a)) {
                        C14836ag.m86469a(pqq0Var2, z2);
                    }
                    if ("pulldown".equals(C14836ag.m86461a((Object) mapM85729a)) && C14836ag.m86472a(mapM85729a) && Objects.equals(mapM85729a.get("pull_down_pop_type"), "0")) {
                        C14836ag.m86469a(pqq0Var2, z2);
                    }
                    if ("tts".equals(C14836ag.m86461a((Object) mapM85729a)) && C14836ag.m86472a(mapM85729a)) {
                        C14836ag.m86469a(pqq0Var2, z2);
                    }
                }
                String str7 = mapM85729a.get("background_color");
                if (!TextUtils.isEmpty(str7)) {
                    try {
                        int i4 = Integer.parseInt(str7);
                        pqq0Var2.setOngoing(true);
                        pqq0Var2.setColor(i4);
                        ikq0.m136882e(pqq0Var2, "setColorized", Boolean.TRUE);
                    } catch (Exception e) {
                        ilq0.m137044q(e);
                    }
                }
            }
            if (strM86413a != null) {
                if (!z5) {
                    strM86413a = C14833ad.m86399a().m86413a(context, pqq0Var2, strM86413a);
                }
                ikq0.m136882e(pqq0Var2, "setGroup", strM86413a);
            }
            if (fvq0.m123364r() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                ikq0.m136884g("miui.util.NotificationHelper", "setTargetPkg", context, pqq0Var2, m86866a(c14763hb));
            }
            notification = pqq0Var2.getNotification();
            if (z4 && fvq0.m123355i()) {
                m86852a(notification);
            }
            if (mapM85729a != null) {
                if (notification.extras == null) {
                    notification.extras = new Bundle();
                }
                if (!TextUtils.isEmpty(mapM85729a.get("enable_keyguard"))) {
                    C14836ag.m86475b(notification, Boolean.parseBoolean(mapM85729a.get("enable_keyguard")));
                }
                if (!TextUtils.isEmpty(mapM85729a.get("enable_float"))) {
                    C14836ag.m86465a(notification, Boolean.parseBoolean(mapM85729a.get("enable_float")));
                }
                if (!TextUtils.isEmpty(mapM85729a.get("float_small_win")) && "0".equals(mapM85729a.get("float_small_win")) && C14739g.m85597q(context, strM86866a)) {
                    C14836ag.m86465a(notification, false);
                }
                iM176890a = qwq0.m176890a(mapM85729a.get("section_is_prr"), -1);
                iM176890a2 = qwq0.m176890a(mapM85729a.get("section_prr_cl"), -1);
                if (iM176890a >= 0 && iM176890a2 >= 0) {
                    C14836ag.m86463a(notification, iM176890a, iM176890a2);
                }
            }
            bVar.f63149a = notification;
            return bVar;
        }
        strM86413a = null;
        z2 = false;
        z3 = false;
        pqq0Var.setAutoCancel(true);
        jCurrentTimeMillis = System.currentTimeMillis();
        if (mapM85729a != null) {
            pqq0Var.setTicker(mapM85729a.get("ticker"));
        }
        if (jCurrentTimeMillis - f63138a > 10000) {
            f63138a = jCurrentTimeMillis;
            iM86848a = c14753gsM85906a.f62179a;
            if (m86894b(context, strM86866a)) {
                iM86848a = m86848a(context, strM86866a);
            }
            pqq0Var.setDefaults(iM86848a);
            if (mapM85729a != null) {
                z4 = z;
                z5 = z3;
            } else {
                z4 = z;
                z5 = z3;
            }
        } else {
            z4 = z;
            z5 = z3;
            iM86848a = -100;
        }
        if (mapM85729a != null) {
            pqq0Var2 = pqq0Var;
            if (mapM85729a != null) {
                ikq0.m136882e(pqq0Var2, "setPriority", Integer.valueOf(m86897c(mapM85729a)));
            }
        } else {
            pqq0Var2 = pqq0Var;
            if (mapM85729a != null) {
                ikq0.m136882e(pqq0Var2, "setPriority", Integer.valueOf(m86897c(mapM85729a)));
            }
        }
        if (strM86413a != null) {
            if (!z5) {
                strM86413a = C14833ad.m86399a().m86413a(context, pqq0Var2, strM86413a);
            }
            ikq0.m136882e(pqq0Var2, "setGroup", strM86413a);
        }
        if (fvq0.m123364r()) {
            ikq0.m136884g("miui.util.NotificationHelper", "setTargetPkg", context, pqq0Var2, m86866a(c14763hb));
        }
        notification = pqq0Var2.getNotification();
        if (z4) {
            m86852a(notification);
        }
        if (mapM85729a != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            if (!TextUtils.isEmpty(mapM85729a.get("enable_keyguard"))) {
                C14836ag.m86475b(notification, Boolean.parseBoolean(mapM85729a.get("enable_keyguard")));
            }
            if (!TextUtils.isEmpty(mapM85729a.get("enable_float"))) {
                C14836ag.m86465a(notification, Boolean.parseBoolean(mapM85729a.get("enable_float")));
            }
            if (!TextUtils.isEmpty(mapM85729a.get("float_small_win"))) {
                C14836ag.m86465a(notification, false);
            }
            iM176890a = qwq0.m176890a(mapM85729a.get("section_is_prr"), -1);
            iM176890a2 = qwq0.m176890a(mapM85729a.get("section_prr_cl"), -1);
            if (iM176890a >= 0) {
                C14836ag.m86463a(notification, iM176890a, iM176890a2);
            }
        }
        bVar.f63149a = notification;
        return bVar;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m86889b(Context context, String str, Map<String, String> map, int i) {
        Intent launchIntentForPackage;
        String str2;
        Intent intent;
        Intent uri;
        if (map == null) {
            return null;
        }
        if (i != 0) {
            return m86857a(context, str, map, i);
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
            ilq0.m137025B("Cause by intent_flag: " + e.getMessage());
        }
        if (AbstractC14843an.f62936a.equals(str3)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e2) {
                ilq0.m137025B("Cause: " + e2.getMessage());
                launchIntentForPackage = null;
            }
        } else if (AbstractC14843an.f62937b.equals(str3)) {
            if (map.containsKey("intent_uri")) {
                String str5 = map.get("intent_uri");
                if (str5 != null) {
                    try {
                        uri = Intent.parseUri(str5, 1);
                        try {
                            uri.setPackage(str);
                        } catch (URISyntaxException e3) {
                            e = e3;
                            ilq0.m137025B("Cause: " + e.getMessage());
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
            if (AbstractC14843an.f62938c.equals(str3) && (str2 = map.get("web_uri")) != null) {
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
                            C14836ag.m86466a(context, str, intent);
                        } catch (MalformedURLException e5) {
                            e = e5;
                            ilq0.m137025B("Cause: " + e.getMessage());
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
            m86877a(launchIntentForPackage);
            launchIntentForPackage.addFlags(268435456);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) == null && (Build.VERSION.SDK_INT < 30 || fvq0.m123356j(context) || !AbstractC14843an.f62938c.equals(str3))) {
                    ilq0.m137040m("not resolve activity:" + launchIntentForPackage);
                }
                return launchIntentForPackage;
            } catch (Exception e7) {
                ilq0.m137025B("Cause: " + e7.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static int m86897c(Map<String, String> map) {
        if (map != null) {
            String str = map.get("notification_priority");
            if (!TextUtils.isEmpty(str)) {
                try {
                    ilq0.m137053z("priority=" + str);
                    return Integer.parseInt(str);
                } catch (Exception e) {
                    ilq0.m137025B("parsing notification priority error: " + e);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m86900d(C14763hb c14763hb) {
        return c14763hb.m85905a() == EnumC14740gf.Registration;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m86901e(C14763hb c14763hb) {
        return m86883a(c14763hb) || m86899c(c14763hb) || m86895b(c14763hb);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m86899c(C14763hb c14763hb) {
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        return m86882a(c14753gsM85906a) && c14753gsM85906a.f62185b == 0 && !m86883a(c14763hb);
    }

    /* JADX INFO: renamed from: c */
    public static void m86898c(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86881a(Context context, String str, boolean z) {
        return fvq0.m123355i() && !z && m86880a(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static c m86864a(Context context, C14763hb c14763hb, byte[] bArr) {
        int iM85743c;
        Map<String, String> mapM85729a;
        int i;
        c cVar = new c();
        C14739g.b bVarM85586f = C14739g.m85586f(context, m86866a(c14763hb), true);
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        if (c14753gsM85906a != null) {
            iM85743c = c14753gsM85906a.m85743c();
            mapM85729a = c14753gsM85906a.m85729a();
        } else {
            iM85743c = 0;
            mapM85729a = null;
        }
        final int iM176894e = qwq0.m176894e(m86866a(c14763hb), iM85743c);
        if (fvq0.m123356j(context) && bVarM85586f == C14739g.b.NOT_ALLOWED) {
            if (c14753gsM85906a != null) {
                nqq0.m160662a(context.getApplicationContext()).m160669g(c14763hb.m85921b(), m86890b(c14763hb), c14753gsM85906a.m85728a(), "10:" + m86866a(c14763hb));
            }
            ilq0.m137040m("Do not notify because user block " + m86866a(c14763hb) + "‘s notification");
            return cVar;
        }
        if (fvq0.m123356j(context) && f63139a != null && f63139a.m86380a(context, iM176894e, m86866a(c14763hb), mapM85729a)) {
            if (c14753gsM85906a != null) {
                nqq0.m160662a(context.getApplicationContext()).m160669g(c14763hb.m85921b(), m86890b(c14763hb), c14753gsM85906a.m85728a(), "14:" + m86866a(c14763hb));
            }
            ilq0.m137040m("Do not notify because card notification is canceled or sequence incorrect");
            return cVar;
        }
        RemoteViews remoteViewsM86862a = m86862a(context, c14763hb, bArr);
        PendingIntent pendingIntentM86853a = m86853a(context, c14763hb, c14763hb.m85921b(), bArr, iM176894e);
        if (pendingIntentM86853a == null) {
            if (c14753gsM85906a != null) {
                nqq0.m160662a(context.getApplicationContext()).m160669g(c14763hb.m85921b(), m86890b(c14763hb), c14753gsM85906a.m85728a(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
            }
            ilq0.m137040m("The click PendingIntent is null. ");
            return cVar;
        }
        b bVarM86863a = m86863a(context, c14763hb, bArr, remoteViewsM86862a, pendingIntentM86853a, iM176894e);
        cVar.f63150a = bVarM86863a.f63148a;
        cVar.f63151a = m86866a(c14763hb);
        Notification notification = bVarM86863a.f63149a;
        if (fvq0.m123355i()) {
            if (!TextUtils.isEmpty(c14753gsM85906a.m85728a())) {
                notification.extras.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, c14753gsM85906a.m85728a());
            }
            notification.extras.putString("local_paid", c14763hb.m85913a());
            C14836ag.m86467a(mapM85729a, notification.extras, "msg_busi_type");
            C14836ag.m86467a(mapM85729a, notification.extras, "disable_notification_flags");
            String str = c14753gsM85906a.m85739b() == null ? null : c14753gsM85906a.m85739b().get("score_info");
            if (!TextUtils.isEmpty(str)) {
                notification.extras.putString("score_info", str);
            }
            notification.extras.putString("pushUid", m86868a(c14753gsM85906a.f62183a, "n_stats_expose"));
            if (m86899c(c14763hb)) {
                i = 1000;
            } else {
                i = m86883a(c14763hb) ? 3000 : -1;
            }
            notification.extras.putString("eventMessageType", String.valueOf(i));
            notification.extras.putString("target_package", m86866a(c14763hb));
        }
        String str2 = c14753gsM85906a.m85729a() != null ? c14753gsM85906a.m85729a().get("message_count") : null;
        if (fvq0.m123355i() && str2 != null) {
            try {
                C14836ag.m86462a(notification, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                nqq0.m160662a(context.getApplicationContext()).m160670i(c14763hb.m85921b(), m86890b(c14763hb), c14753gsM85906a.m85728a(), Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
                ilq0.m137025B("fail to set message count. " + e);
            }
        }
        String strM86866a = m86866a(c14763hb);
        C14836ag.m86464a(notification, strM86866a);
        final C14835af c14835afM86428a = C14835af.m86428a(context, strM86866a);
        if (fvq0.m123356j(context) && f63139a != null) {
            f63139a.m86378a(c14763hb, c14753gsM85906a.m85729a(), iM176894e, notification);
        }
        if (fvq0.m123356j(context) && f63139a != null && f63139a.m86381a(c14753gsM85906a.m85729a(), iM176894e, notification)) {
            ilq0.m137050w("consume this notificaiton by agent");
        } else {
            c14835afM86428a.m86446a(iM176894e, notification);
            cVar.f63152a = true;
            ilq0.m137040m("notification: " + c14753gsM85906a.m85728a() + " is notifyied");
        }
        if (fvq0.m123355i() && fvq0.m123356j(context)) {
            C14833ad.m86399a().m86414a(context, iM176894e, notification);
            C14858bb.m86620a(context, strM86866a, iM176894e, c14753gsM85906a.m85728a(), notification);
        }
        if (m86883a(c14763hb)) {
            nqq0.m160662a(context.getApplicationContext()).m160668f(c14763hb.m85921b(), m86890b(c14763hb), c14753gsM85906a.m85728a(), 3002, null);
        }
        if (m86899c(c14763hb)) {
            nqq0.m160662a(context.getApplicationContext()).m160668f(c14763hb.m85921b(), m86890b(c14763hb), c14753gsM85906a.m85728a(), 1002, null);
        }
        if (Build.VERSION.SDK_INT < 26) {
            String strM85728a = c14753gsM85906a.m85728a();
            njq0 njq0VarM159772f = njq0.m159772f(context);
            int iM86851a = m86851a(c14753gsM85906a.m85729a());
            if (iM86851a > 0 && !TextUtils.isEmpty(strM85728a)) {
                final String str3 = "n_timeout_" + strM85728a;
                njq0VarM159772f.m159775i(str3);
                njq0VarM159772f.m159780n(new njq0.AbstractRunnableC18717c() { // from class: com.xiaomi.push.service.x.1
                    @Override // p149l.njq0.AbstractRunnableC18717c
                    /* JADX INFO: renamed from: a */
                    public String mo86627a() {
                        return str3;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        c14835afM86428a.m86445a(iM176894e);
                    }
                }, iM86851a);
            }
        }
        Pair<Integer, C14763hb> pair = new Pair<>(Integer.valueOf(iM176894e), c14763hb);
        LinkedList<Pair<Integer, C14763hb>> linkedList = f63140a;
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
    private static PendingIntent m86853a(Context context, C14763hb c14763hb, String str, byte[] bArr, int i) {
        return m86854a(context, c14763hb, str, bArr, i, 0, m86879a(context, c14763hb, str));
    }

    /* JADX INFO: renamed from: a */
    private static PendingIntent m86854a(Context context, C14763hb c14763hb, String str, byte[] bArr, int i, int i2, boolean z) {
        int i3;
        String strM85728a;
        Intent intent;
        if (m86899c(c14763hb)) {
            i3 = 1000;
        } else {
            i3 = m86883a(c14763hb) ? 3000 : -1;
        }
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        if (c14753gsM85906a != null) {
            strM85728a = c14753gsM85906a.m85728a();
        } else {
            strM85728a = "";
        }
        boolean zM86883a = m86883a(c14763hb);
        if (c14753gsM85906a != null && !TextUtils.isEmpty(c14753gsM85906a.f62192e)) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(c14753gsM85906a.f62192e));
            try {
                String protocol = new URL(c14753gsM85906a.f62192e).getProtocol();
                if (!"http".equals(protocol) && !"https".equals(protocol)) {
                    intent2.setPackage(str);
                } else {
                    C14836ag.m86466a(context, str, intent2);
                }
            } catch (MalformedURLException unused) {
                ilq0.m137040m("meet URL exception : " + c14753gsM85906a.f62192e);
                intent2.setPackage(str);
            }
            intent2.addFlags(268435456);
            intent2.putExtra("messageId", strM85728a);
            intent2.putExtra("eventMessageType", i3);
            if (Build.VERSION.SDK_INT >= 31) {
                return PendingIntent.getActivity(context, 0, intent2, 167772160);
            }
            return PendingIntent.getActivity(context, 0, intent2, 134217728);
        }
        if (zM86883a) {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.xiaomi.xmsf", "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(strM85728a));
        } else {
            intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent.setComponent(new ComponentName(str, "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(strM85728a));
        }
        intent.putExtra("notification_click_button", i2);
        intent.putExtra("messageId", strM85728a);
        intent.putExtra("eventMessageType", i3);
        if (!zM86883a && z) {
            Intent intent3 = new Intent();
            intent3.setComponent(m86856a(str));
            intent3.addFlags(276824064);
            intent3.putExtra("mipush_serviceIntent", intent);
            intent3.addCategory(String.valueOf(i));
            intent3.addCategory(String.valueOf(strM85728a));
            intent3.addCategory(String.valueOf(i2));
            m86870a(context, intent3, c14763hb, c14753gsM85906a, strM85728a, i2);
            if (Build.VERSION.SDK_INT >= 31) {
                return PendingIntent.getActivity(context, 0, intent3, 167772160);
            }
            return PendingIntent.getActivity(context, 0, intent3, 134217728);
        }
        Intent intent4 = intent;
        m86870a(context, intent4, c14763hb, c14753gsM85906a, strM85728a, i2);
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getService(context, 0, intent4, 167772160);
        }
        return PendingIntent.getService(context, 0, intent4, 134217728);
    }

    /* JADX INFO: renamed from: a */
    private static void m86870a(Context context, Intent intent, C14763hb c14763hb, C14753gs c14753gs, String str, int i) {
        if (c14763hb == null || c14753gs == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strM86867a = m86867a(c14753gs.m85729a(), i);
        if (TextUtils.isEmpty(strM86867a)) {
            return;
        }
        if (AbstractC14843an.f62936a.equals(strM86867a) || AbstractC14843an.f62937b.equals(strM86867a) || AbstractC14843an.f62938c.equals(strM86867a)) {
            intent.putExtra("messageId", str);
            intent.putExtra("local_paid", c14763hb.f62349a);
            if (!TextUtils.isEmpty(c14763hb.f62353b)) {
                intent.putExtra("target_package", c14763hb.f62353b);
            }
            intent.putExtra("job_key", m86868a(c14753gs.m85729a(), "jobkey"));
            intent.putExtra(i + "_target_component", m86850a(context, c14763hb.f62353b, c14753gs.m85729a(), i));
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86879a(Context context, C14763hb c14763hb, String str) {
        if (c14763hb != null && c14763hb.m85906a() != null && c14763hb.m85906a().m85729a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(c14763hb.m85906a().m85729a().get("use_clicked_activity")) && C14868j.m86672a(context, m86856a(str));
        }
        ilq0.m137040m("should clicked activity params are null.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static ComponentName m86856a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[PHI: r0 r3
      0x0072: PHI (r0v4 java.lang.String) = (r0v2 java.lang.String), (r0v5 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r3v14 java.lang.String) = (r3v13 java.lang.String), (r3v20 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    private static String[] m86886a(Context context, C14753gs c14753gs) {
        String str;
        String strM85746c = c14753gs.m85746c();
        String strM85750d = c14753gs.m85750d();
        Map<String, String> mapM85729a = c14753gs.m85729a();
        if (mapM85729a != null) {
            int iIntValue = Float.valueOf((context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density) + 0.5f).intValue();
            if (iIntValue <= 320) {
                String str2 = mapM85729a.get("title_short");
                if (!TextUtils.isEmpty(str2)) {
                    strM85746c = str2;
                }
                str = mapM85729a.get("description_short");
                if (!TextUtils.isEmpty(str)) {
                    strM85750d = str;
                }
            } else if (iIntValue > 360) {
                String str3 = mapM85729a.get("title_long");
                if (!TextUtils.isEmpty(str3)) {
                    strM85746c = str3;
                }
                str = mapM85729a.get("description_long");
                if (!TextUtils.isEmpty(str)) {
                    strM85750d = str;
                }
            }
        }
        return new String[]{strM85746c, strM85750d};
    }

    /* JADX INFO: renamed from: a */
    private static String m86868a(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static int m86850a(Context context, String str, Map<String, String> map, int i) {
        ComponentName componentNameM86671a;
        Intent intentM86889b = m86889b(context, str, map, i);
        if (intentM86889b == null || (componentNameM86671a = C14868j.m86671a(context, intentM86889b)) == null) {
            return 0;
        }
        return componentNameM86671a.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86880a(Context context, String str) {
        return C14739g.m85595o(context, str);
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private static void m86878a(pqq0 pqq0Var, Context context, String str, C14763hb c14763hb, byte[] bArr, int i) {
        PendingIntent pendingIntentM86855a;
        PendingIntent pendingIntentM86855a2;
        PendingIntent pendingIntentM86855a3;
        PendingIntent pendingIntentM86855a4;
        Map<String, String> mapM85729a = c14763hb.m85906a().m85729a();
        if (TextUtils.equals("3", mapM85729a.get("notification_style_type")) || TextUtils.equals("4", mapM85729a.get("notification_style_type"))) {
            return;
        }
        if (m86896b(mapM85729a)) {
            for (int i2 = 1; i2 <= 3; i2++) {
                String str2 = mapM85729a.get(String.format("cust_btn_%s_n", Integer.valueOf(i2)));
                if (!TextUtils.isEmpty(str2) && (pendingIntentM86855a4 = m86855a(context, str, c14763hb, bArr, i, i2)) != null) {
                    pqq0Var.addAction(0, str2, pendingIntentM86855a4);
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(mapM85729a.get("notification_style_button_left_name")) && (pendingIntentM86855a3 = m86855a(context, str, c14763hb, bArr, i, 1)) != null) {
            pqq0Var.addAction(0, mapM85729a.get("notification_style_button_left_name"), pendingIntentM86855a3);
        }
        if (!TextUtils.isEmpty(mapM85729a.get("notification_style_button_mid_name")) && (pendingIntentM86855a2 = m86855a(context, str, c14763hb, bArr, i, 2)) != null) {
            pqq0Var.addAction(0, mapM85729a.get("notification_style_button_mid_name"), pendingIntentM86855a2);
        }
        if (TextUtils.isEmpty(mapM85729a.get("notification_style_button_right_name")) || (pendingIntentM86855a = m86855a(context, str, c14763hb, bArr, i, 3)) == null) {
            return;
        }
        pqq0Var.addAction(0, mapM85729a.get("notification_style_button_right_name"), pendingIntentM86855a);
    }

    /* JADX INFO: renamed from: a */
    private static PendingIntent m86855a(Context context, String str, C14763hb c14763hb, byte[] bArr, int i, int i2) {
        Map<String, String> mapM85729a = c14763hb.m85906a().m85729a();
        if (mapM85729a == null) {
            return null;
        }
        boolean zM86879a = m86879a(context, c14763hb, str);
        if (zM86879a) {
            return m86854a(context, c14763hb, str, bArr, i, i2, zM86879a);
        }
        Intent intentM86857a = m86857a(context, str, mapM85729a, i2);
        if (intentM86857a == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getActivity(context, 0, intentM86857a, 167772160);
        }
        return PendingIntent.getActivity(context, 0, intentM86857a, 134217728);
    }

    /* JADX INFO: renamed from: a */
    public static String m86867a(Map<String, String> map, int i) {
        String str;
        if (i == 0) {
            str = "notify_effect";
        } else if (m86896b(map)) {
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
    public static Intent m86857a(Context context, String str, Map<String, String> map, int i) {
        if (m86896b(map)) {
            return m86858a(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i)), String.format("cust_btn_%s_iu", Integer.valueOf(i)), String.format("cust_btn_%s_ic", Integer.valueOf(i)), String.format("cust_btn_%s_wu", Integer.valueOf(i)));
        }
        if (i == 1) {
            return m86858a(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        }
        if (i == 2) {
            return m86858a(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
        }
        if (i == 3) {
            return m86858a(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
        }
        if (i != 4) {
            return null;
        }
        return m86858a(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
    }

    /* JADX INFO: renamed from: a */
    private static Intent m86858a(Context context, String str, Map<String, String> map, String str2, String str3, String str4, String str5) {
        Intent launchIntentForPackage;
        Intent intent;
        Intent uri;
        String str6 = map.get(str2);
        if (TextUtils.isEmpty(str6)) {
            return null;
        }
        if (AbstractC14843an.f62936a.equals(str6)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e) {
                ilq0.m137025B("Cause: " + e.getMessage());
                launchIntentForPackage = null;
            }
        } else if (AbstractC14843an.f62937b.equals(str6)) {
            if (map.containsKey(str3)) {
                String str7 = map.get(str3);
                if (str7 != null) {
                    try {
                        uri = Intent.parseUri(str7, 1);
                        try {
                            uri.setPackage(str);
                        } catch (URISyntaxException e2) {
                            e = e2;
                            ilq0.m137025B("Cause: " + e.getMessage());
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
            if (AbstractC14843an.f62938c.equals(str6)) {
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
                                C14836ag.m86466a(context, str, intent);
                            } catch (MalformedURLException e4) {
                                e = e4;
                                ilq0.m137025B("Cause: " + e.getMessage());
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
            launchIntentForPackage.addFlags(268435456);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) == null && (Build.VERSION.SDK_INT < 30 || fvq0.m123356j(context) || !AbstractC14843an.f62938c.equals(str6))) {
                    ilq0.m137040m("not resolve activity:" + launchIntentForPackage + "for buttons");
                }
                return launchIntentForPackage;
            } catch (Exception e6) {
                ilq0.m137025B("Cause: " + e6.getMessage());
            }
        }
        return null;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private static pqq0 m86869a(Context context, C14763hb c14763hb, byte[] bArr, String str, int i) {
        Context context2;
        String strM86866a = m86866a(c14763hb);
        Map<String, String> mapM85729a = c14763hb.m85906a().m85729a();
        String str2 = mapM85729a.get("notification_style_type");
        pqq0 pqq0VarM86377a = (!fvq0.m123356j(context) || f63139a == null) ? null : f63139a.m86377a(context, i, strM86866a, mapM85729a);
        if (pqq0VarM86377a != null) {
            pqq0VarM86377a.mo170934g(mapM85729a);
            return pqq0VarM86377a;
        }
        if ("2".equals(str2)) {
            pqq0 pqq0Var = new pqq0(context);
            Bitmap bitmapM86860a = TextUtils.isEmpty(mapM85729a.get("notification_bigPic_uri")) ? null : m86860a(context, mapM85729a.get("notification_bigPic_uri"), false);
            if (bitmapM86860a == null) {
                ilq0.m137040m("can not get big picture.");
                return pqq0Var;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(pqq0Var);
            bigPictureStyle.bigPicture(bitmapM86860a);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            pqq0Var.setStyle(bigPictureStyle);
            return pqq0Var;
        }
        if ("1".equals(str2)) {
            pqq0 pqq0Var2 = new pqq0(context);
            pqq0Var2.setStyle(new Notification.BigTextStyle().bigText(str));
            return pqq0Var2;
        }
        if ("4".equals(str2) && fvq0.m123355i()) {
            oqq0 oqq0Var = new oqq0(context, strM86866a);
            if (!TextUtils.isEmpty(mapM85729a.get("notification_banner_image_uri"))) {
                oqq0Var.m165476G(m86860a(context, mapM85729a.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(mapM85729a.get("notification_banner_icon_uri"))) {
                oqq0Var.m165478I(m86860a(context, mapM85729a.get("notification_banner_icon_uri"), false));
            }
            oqq0Var.mo170934g(mapM85729a);
            return oqq0Var;
        }
        if ("3".equals(str2) && fvq0.m123355i()) {
            qqq0 qqq0Var = new qqq0(context, i, strM86866a);
            if (TextUtils.isEmpty(mapM85729a.get("notification_colorful_button_text"))) {
                context2 = context;
            } else {
                context2 = context;
                PendingIntent pendingIntentM86855a = m86855a(context2, strM86866a, c14763hb, bArr, i, 4);
                if (pendingIntentM86855a != null) {
                    qqq0Var.m175956I(mapM85729a.get("notification_colorful_button_text"), pendingIntentM86855a).m175957J(mapM85729a.get("notification_colorful_button_bg_color"));
                }
            }
            if (!TextUtils.isEmpty(mapM85729a.get("notification_colorful_bg_color"))) {
                qqq0Var.m175958L(mapM85729a.get("notification_colorful_bg_color"));
            } else if (!TextUtils.isEmpty(mapM85729a.get("notification_colorful_bg_image_uri"))) {
                qqq0Var.m175955H(m86860a(context2, mapM85729a.get("notification_colorful_bg_image_uri"), false));
            }
            qqq0Var.mo170934g(mapM85729a);
            return qqq0Var;
        }
        return new pqq0(context);
    }

    /* JADX INFO: renamed from: b */
    private static int m86887b(Context context, String str) {
        int iM86849a = m86849a(context, str, "mipush_notification");
        int iM86849a2 = m86849a(context, str, "mipush_small_notification");
        if (iM86849a <= 0) {
            iM86849a = iM86849a2 > 0 ? iM86849a2 : context.getApplicationInfo().icon;
        }
        return iM86849a == 0 ? context.getApplicationInfo().logo : iM86849a;
    }

    /* JADX INFO: renamed from: b */
    public static void m86891b(Context context, String str) {
        if (!fvq0.m123356j(context) || f63139a == null || TextUtils.isEmpty(str)) {
            return;
        }
        f63139a.m86379a(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m86894b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m86892b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m86895b(C14763hb c14763hb) {
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        return m86882a(c14753gsM85906a) && c14753gsM85906a.f62185b == 1 && !m86883a(c14763hb);
    }

    /* JADX INFO: renamed from: b */
    public static String m86890b(C14763hb c14763hb) {
        if (m86883a(c14763hb)) {
            return "E100002";
        }
        if (m86899c(c14763hb)) {
            return "E100000";
        }
        if (m86895b(c14763hb)) {
            return "E100001";
        }
        if (m86900d(c14763hb)) {
            return "E100003";
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    private static int m86888b(Map<String, String> map) {
        if (map != null) {
            String str = map.get("channel_importance");
            if (!TextUtils.isEmpty(str)) {
                try {
                    ilq0.m137053z("importance=" + str);
                    return Integer.parseInt(str);
                } catch (Exception e) {
                    ilq0.m137025B("parsing channel importance error: " + e);
                }
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m86896b(Map<String, String> map) {
        if (map == null) {
            ilq0.m137040m("meta extra is null");
            return false;
        }
        return Constants.VIA_SHARE_TYPE_INFO.equals(map.get("notification_style_type"));
    }

    /* JADX INFO: renamed from: b */
    private static void m86893b(Context context, String str, pqq0 pqq0Var, Map<String, String> map) {
        int iM86849a;
        if (!fvq0.m123356j(context)) {
            String strM86868a = m86868a(map, "fcm_icon_uri");
            String strM86868a2 = m86868a(map, "fcm_icon_color");
            if (!TextUtils.isEmpty(strM86868a) && !TextUtils.isEmpty(strM86868a2) && (iM86849a = m86849a(context, str, strM86868a)) > 0) {
                pqq0Var.setSmallIcon(iM86849a);
                pqq0Var.m170933f(strM86868a2);
                return;
            }
        }
        pqq0Var.setSmallIcon(Icon.createWithResource(str, C14836ag.m86454a(context, str)));
    }

    /* JADX INFO: renamed from: a */
    private static int m86851a(Map<String, String> map) {
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
    private static RemoteViews m86862a(Context context, C14763hb c14763hb, byte[] bArr) {
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        String strM86866a = m86866a(c14763hb);
        if (c14753gsM85906a != null && c14753gsM85906a.m85729a() != null) {
            Map<String, String> mapM85729a = c14753gsM85906a.m85729a();
            String str = mapM85729a.get("layout_name");
            String str2 = mapM85729a.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(strM86866a);
                    int identifier = resourcesForApplication.getIdentifier(str, "layout", strM86866a);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(strM86866a, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", strM86866a);
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
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", strM86866a);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", strM86866a);
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
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", strM86866a);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e) {
                        ilq0.m137044q(e);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    ilq0.m137044q(e2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m86859a(Context context, int i) {
        return m86861a(context.getResources().getDrawable(i));
    }

    /* JADX INFO: renamed from: a */
    private static int m86849a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m86861a(Drawable drawable) {
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
    private static Notification m86852a(Notification notification) {
        Object objM136881d = ikq0.m136881d(notification, "extraNotification");
        if (objM136881d != null) {
            ikq0.m136882e(objM136881d, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    /* JADX INFO: renamed from: a */
    public static String m86866a(C14763hb c14763hb) {
        C14753gs c14753gsM85906a;
        if ("com.xiaomi.xmsf".equals(c14763hb.f62353b) && (c14753gsM85906a = c14763hb.m85906a()) != null && c14753gsM85906a.m85729a() != null) {
            String str = c14753gsM85906a.m85729a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return c14763hb.f62353b;
    }

    /* JADX INFO: renamed from: a */
    public static void m86871a(Context context, String str) {
        m86872a(context, str, -1);
    }

    /* JADX INFO: renamed from: a */
    public static void m86872a(Context context, String str, int i) {
        m86873a(context, str, i, -1);
    }

    /* JADX INFO: renamed from: a */
    public static void m86873a(Context context, String str, int i, int i2) {
        int iHashCode;
        if (context == null || TextUtils.isEmpty(str) || i < -1) {
            return;
        }
        C14835af c14835afM86428a = C14835af.m86428a(context, str);
        List<StatusBarNotification> listM86451b = c14835afM86428a.m86451b();
        if (qwq0.m176893d(listM86451b)) {
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
        for (StatusBarNotification statusBarNotification : listM86451b) {
            if (!TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                if (!z) {
                    if (iHashCode == id) {
                        C14862d.m86635a(context, statusBarNotification, i2);
                        linkedList.add(statusBarNotification);
                        c14835afM86428a.m86445a(id);
                        break;
                    }
                } else {
                    linkedList.add(statusBarNotification);
                    c14835afM86428a.m86445a(id);
                }
            }
        }
        m86876a(context, (LinkedList<? extends Object>) linkedList);
    }

    /* JADX INFO: renamed from: a */
    public static void m86874a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        C14835af c14835afM86428a = C14835af.m86428a(context, str);
        List<StatusBarNotification> listM86451b = c14835afM86428a.m86451b();
        if (qwq0.m176893d(listM86451b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : listM86451b) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                String strM86460a = C14836ag.m86460a(notification);
                String strM86474b = C14836ag.m86474b(notification);
                if (!TextUtils.isEmpty(strM86460a) && !TextUtils.isEmpty(strM86474b) && m86884a(strM86460a, str2) && m86884a(strM86474b, str3)) {
                    linkedList.add(statusBarNotification);
                    c14835afM86428a.m86445a(id);
                }
            }
        }
        m86876a(context, (LinkedList<? extends Object>) linkedList);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86884a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m86876a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        C14855az.m86601a(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
    }

    /* JADX INFO: renamed from: a */
    public static int m86848a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86885a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86882a(C14753gs c14753gs) {
        if (c14753gs != null) {
            String strM85728a = c14753gs.m85728a();
            if (!TextUtils.isEmpty(strM85728a) && strM85728a.length() == 22 && "satuigmo".indexOf(strM85728a.charAt(0)) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86883a(C14763hb c14763hb) {
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        return m86882a(c14753gsM85906a) && c14753gsM85906a.m85761l();
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m86860a(Context context, String str, boolean z) {
        Future futureSubmit = f63141a.submit(new a(str, context, z));
        try {
            try {
                try {
                    Bitmap bitmap = (Bitmap) futureSubmit.get(180L, TimeUnit.SECONDS);
                    if (bitmap == null) {
                        futureSubmit.cancel(true);
                    }
                    return bitmap;
                } catch (ExecutionException e) {
                    ilq0.m137044q(e);
                    futureSubmit.cancel(true);
                    return null;
                }
            } catch (InterruptedException e2) {
                ilq0.m137044q(e2);
                futureSubmit.cancel(true);
                return null;
            } catch (TimeoutException e3) {
                ilq0.m137044q(e3);
                futureSubmit.cancel(true);
                return null;
            }
        } catch (Throwable th) {
            futureSubmit.cancel(true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m86865a(Context context, String str, Map<String, String> map) {
        if (map != null && !TextUtils.isEmpty(map.get("channel_name"))) {
            return map.get("channel_name");
        }
        return C14739g.m85594n(context, str);
    }

    /* JADX INFO: renamed from: a */
    private static void m86877a(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.setFlags(intent.getFlags() & (-196));
    }

    /* JADX INFO: renamed from: a */
    private static void m86875a(Context context, String str, pqq0 pqq0Var, Map<String, String> map) {
        int iM86849a = m86849a(context, str, "mipush_small_notification");
        int iM86849a2 = m86849a(context, str, "mipush_notification");
        if (fvq0.m123356j(context)) {
            if (iM86849a > 0 && iM86849a2 > 0) {
                pqq0Var.setSmallIcon(iM86849a);
                pqq0Var.setLargeIcon(m86859a(context, iM86849a2));
                return;
            } else {
                m86893b(context, str, pqq0Var, map);
                return;
            }
        }
        if (iM86849a > 0) {
            pqq0Var.setSmallIcon(iM86849a);
        } else {
            m86893b(context, str, pqq0Var, map);
        }
        if (iM86849a2 > 0) {
            pqq0Var.setLargeIcon(m86859a(context, iM86849a2));
        }
    }
}

package p149l;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzgad;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes6.dex */
public final class k2v0 extends dss0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final Map f120768a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f120769b;

    /* JADX INFO: renamed from: c */
    public final rnu0 f120770c;

    /* JADX INFO: renamed from: d */
    public final b3t0 f120771d;

    /* JADX INFO: renamed from: e */
    public final z1v0 f120772e;

    /* JADX INFO: renamed from: f */
    public final p3w0 f120773f;

    /* JADX INFO: renamed from: g */
    public String f120774g;

    /* JADX INFO: renamed from: h */
    public String f120775h;

    @VisibleForTesting
    public k2v0(Context context, z1v0 z1v0Var, b3t0 b3t0Var, rnu0 rnu0Var, p3w0 p3w0Var) {
        this.f120769b = context;
        this.f120770c = rnu0Var;
        this.f120771d = b3t0Var;
        this.f120772e = z1v0Var;
        this.f120773f = p3w0Var;
    }

    /* JADX INFO: renamed from: p8 */
    public static void m144340p8(Context context, rnu0 rnu0Var, p3w0 p3w0Var, z1v0 z1v0Var, String str, String str2, Map map) {
        String strMo124430b;
        String str3 = true != vny0.m199079q().m212293z(context) ? UserBanAppealSwitch.offline : "online";
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue() || rnu0Var == null) {
            o3w0 o3w0VarM162489b = o3w0.m162489b(str2);
            o3w0VarM162489b.m162491a("gqi", str);
            o3w0VarM162489b.m162491a("device_connectivity", str3);
            o3w0VarM162489b.m162491a("event_timestamp", String.valueOf(vny0.m199064b().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                o3w0VarM162489b.m162491a((String) entry.getKey(), (String) entry.getValue());
            }
            strMo124430b = p3w0Var.mo124430b(o3w0VarM162489b);
        } else {
            qnu0 qnu0VarM180208a = rnu0Var.m180208a();
            qnu0VarM180208a.m175693b("gqi", str);
            qnu0VarM180208a.m175693b("action", str2);
            qnu0VarM180208a.m175693b("device_connectivity", str3);
            qnu0VarM180208a.m175693b("event_timestamp", String.valueOf(vny0.m199064b().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                qnu0VarM180208a.m175693b((String) entry2.getKey(), (String) entry2.getValue());
            }
            strMo124430b = qnu0VarM180208a.m175697f();
        }
        z1v0Var.m216820g(new b2v0(vny0.m199064b().currentTimeMillis(), str, strMo124430b, 2));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: x8 */
    public static final PendingIntent m144341x8(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return jcw0.m140994b(context, 0, intent, jcw0.f117349a | 1073741824, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return jcw0.m140993a(context, 0, intent, 201326592);
    }

    /* JADX INFO: renamed from: y8 */
    public static String m144342y8(int i, String str) {
        Resources resourcesM212276e = vny0.m199079q().m212276e();
        return resourcesM212276e == null ? str : resourcesM212276e.getString(i);
    }

    private final void zzt() {
        boolean zZzg;
        try {
            vny0.m199080r();
            tns0 tns0VarM12307a0 = C2075b.m12307a0(this.f120769b);
            uyl uylVarM181848Y2 = s050.m181848Y2(this.f120769b);
            String str = this.f120775h;
            String str2 = this.f120774g;
            l1v0 l1v0Var = (l1v0) this.f120768a.get(str2);
            zZzg = tns0VarM12307a0.zzg(uylVarM181848Y2, new zza(str, str2, l1v0Var == null ? "" : l1v0Var.mo129081c()));
            if (!zZzg) {
                try {
                    zZzg = tns0VarM12307a0.zzf(s050.m181848Y2(this.f120769b), this.f120775h, this.f120774g);
                } catch (RemoteException e) {
                    e = e;
                    x2t0.m206867e("Failed to schedule offline notification poster.", e);
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            zZzg = false;
        }
        if (zZzg) {
            return;
        }
        this.f120772e.m216819e(this.f120774g);
        m144352z8(this.f120774g, "offline_notification_worker_not_scheduled", zzgad.zzd());
    }

    /* JADX INFO: renamed from: A8 */
    public final void m144343A8(final Activity activity, @Nullable final BinderC2073b binderC2073b) {
        vny0.m199080r();
        if (nr40.m160709e(activity).m160712a()) {
            zzt();
            m144344B8(activity, binderC2073b);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                m144352z8(this.f120774g, "asnpdi", zzgad.zzd());
                return;
            }
            vny0.m199080r();
            AlertDialog.Builder builderM12317j = C2075b.m12317j(activity);
            builderM12317j.setTitle(m144342y8(R$string.f9661f, "Allow app to send you notifications?")).setPositiveButton(m144342y8(R$string.f9659d, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: l.d2v0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f83435a.m144345q8(activity, binderC2073b, dialogInterface, i);
                }
            }).setNegativeButton(m144342y8(R$string.f9660e, "Don't allow"), new DialogInterface.OnClickListener() { // from class: l.e2v0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f88946a.m144346r8(binderC2073b, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.f2v0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f94237a.m144347s8(binderC2073b, dialogInterface);
                }
            });
            builderM12317j.create().show();
            m144352z8(this.f120774g, "rtsdi", zzgad.zzd());
        }
    }

    /* JADX INFO: renamed from: B8 */
    public final void m144344B8(Activity activity, @Nullable final BinderC2073b binderC2073b) {
        AlertDialog alertDialogCreate;
        vny0.m199080r();
        AlertDialog.Builder onCancelListener = C2075b.m12317j(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.c2v0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                BinderC2073b binderC2073b2 = binderC2073b;
                if (binderC2073b2 != null) {
                    binderC2073b2.zzb();
                }
            }
        });
        int i = f7c0.f96237a;
        Resources resourcesM212276e = vny0.m199079q().m212276e();
        XmlResourceParser layout = resourcesM212276e == null ? null : resourcesM212276e.getLayout(i);
        if (layout == null) {
            onCancelListener.setMessage(m144342y8(R$string.f9662g, "You'll get a notification with the link when you're back online"));
            alertDialogCreate = onCancelListener.create();
        } else {
            View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            l1v0 l1v0Var = (l1v0) this.f120768a.get(this.f120774g);
            String strMo129080b = l1v0Var == null ? "" : l1v0Var.mo129080b();
            if (!strMo129080b.isEmpty()) {
                TextView textView = (TextView) viewInflate.findViewById(h4c0.f105823a);
                textView.setVisibility(0);
                textView.setText(strMo129080b);
            }
            l1v0 l1v0Var2 = (l1v0) this.f120768a.get(this.f120774g);
            Drawable drawableMo129079a = l1v0Var2 != null ? l1v0Var2.mo129079a() : null;
            if (drawableMo129079a != null) {
                ((ImageView) viewInflate.findViewById(h4c0.f105824b)).setImageDrawable(drawableMo129079a);
            }
            alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new j2v0(this, alertDialogCreate, timer, binderC2073b), 3000L);
    }

    @Override // p149l.ess0
    /* JADX INFO: renamed from: O0 */
    public final void mo108558O0(String[] strArr, int[] iArr, uyl uylVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                m2v0 m2v0Var = (m2v0) s050.m181847P2(uylVar);
                Activity activityMo144232a = m2v0Var.mo144232a();
                BinderC2073b binderC2073bMo144233b = m2v0Var.mo144233b();
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", BLiveVoiceSingTogehterState.confirm);
                    zzt();
                    m144344B8(activityMo144232a, binderC2073bMo144233b);
                } else {
                    map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
                    if (binderC2073bMo144233b != null) {
                        binderC2073bMo144233b.zzb();
                    }
                }
                m144352z8(this.f120774g, "asnpdc", map);
                return;
            }
        }
    }

    @Override // p149l.ess0
    /* JADX INFO: renamed from: Y */
    public final void mo108559Y(uyl uylVar) {
        m2v0 m2v0Var = (m2v0) s050.m181847P2(uylVar);
        final Activity activityMo144232a = m2v0Var.mo144232a();
        final BinderC2073b binderC2073bMo144233b = m2v0Var.mo144233b();
        this.f120774g = m2v0Var.mo144234c();
        this.f120775h = m2v0Var.mo144235d();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132360p8)).booleanValue()) {
            m144343A8(activityMo144232a, binderC2073bMo144233b);
            return;
        }
        m144352z8(this.f120774g, "dialog_impression", zzgad.zzd());
        vny0.m199080r();
        AlertDialog.Builder builderM12317j = C2075b.m12317j(activityMo144232a);
        builderM12317j.setTitle(m144342y8(R$string.f9667l, "Open ad when you're back online.")).setMessage(m144342y8(R$string.f9666k, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(m144342y8(R$string.f9664i, "OK"), new DialogInterface.OnClickListener() { // from class: l.g2v0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f100307a.m144348t8(activityMo144232a, binderC2073bMo144233b, dialogInterface, i);
            }
        }).setNegativeButton(m144342y8(R$string.f9665j, "No thanks"), new DialogInterface.OnClickListener() { // from class: l.h2v0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f105565a.m144349u8(binderC2073bMo144233b, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.i2v0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f110596a.m144350v8(binderC2073bMo144233b, dialogInterface);
            }
        });
        builderM12317j.create().show();
    }

    @Override // p149l.ess0
    /* JADX INFO: renamed from: p7 */
    public final void mo117956p7(uyl uylVar, String str, String str2) {
        mo108561y3(uylVar, new zza(str, str2, ""));
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m144345q8(Activity activity, BinderC2073b binderC2073b, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", BLiveVoiceSingTogehterState.confirm);
        m144352z8(this.f120774g, "rtsdc", map);
        activity.startActivity(vny0.m199081s().mo138092e(activity));
        zzt();
        if (binderC2073b != null) {
            binderC2073b.zzb();
        }
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m144346r8(BinderC2073b binderC2073b, DialogInterface dialogInterface, int i) {
        this.f120772e.m216819e(this.f120774g);
        HashMap map = new HashMap();
        map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
        m144352z8(this.f120774g, "rtsdc", map);
        if (binderC2073b != null) {
            binderC2073b.zzb();
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m144347s8(BinderC2073b binderC2073b, DialogInterface dialogInterface) {
        this.f120772e.m216819e(this.f120774g);
        HashMap map = new HashMap();
        map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
        m144352z8(this.f120774g, "rtsdc", map);
        if (binderC2073b != null) {
            binderC2073b.zzb();
        }
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m144348t8(Activity activity, BinderC2073b binderC2073b, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", BLiveVoiceSingTogehterState.confirm);
        m144352z8(this.f120774g, "dialog_click", map);
        m144343A8(activity, binderC2073b);
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ void m144349u8(BinderC2073b binderC2073b, DialogInterface dialogInterface, int i) {
        this.f120772e.m216819e(this.f120774g);
        HashMap map = new HashMap();
        map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
        m144352z8(this.f120774g, "dialog_click", map);
        if (binderC2073b != null) {
            binderC2073b.zzb();
        }
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m144350v8(BinderC2073b binderC2073b, DialogInterface dialogInterface) {
        this.f120772e.m216819e(this.f120774g);
        HashMap map = new HashMap();
        map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
        m144352z8(this.f120774g, "dialog_click", map);
        if (binderC2073b != null) {
            binderC2073b.zzb();
        }
    }

    /* JADX INFO: renamed from: w8 */
    public final void m144351w8(String str, ocu0 ocu0Var) {
        String strM163586b;
        String string = "";
        if (TextUtils.isEmpty(ocu0Var.m163604k0())) {
            strM163586b = ocu0Var.m163586b() != null ? ocu0Var.m163586b() : "";
        } else {
            strM163586b = ocu0Var.m163604k0();
        }
        ubs0 ubs0VarM163583Z = ocu0Var.m163583Z();
        if (ubs0VarM163583Z != null) {
            try {
                string = ubs0VarM163583Z.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        ubs0 ubs0VarM163585a0 = ocu0Var.m163585a0();
        Drawable drawable = null;
        if (ubs0VarM163585a0 != null) {
            try {
                uyl uylVarZzf = ubs0VarM163585a0.zzf();
                if (uylVarZzf != null) {
                    drawable = (Drawable) s050.m181847P2(uylVarZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f120768a.put(str, new h1v0(strM163586b, string, drawable));
    }

    @Override // p149l.ess0
    /* JADX INFO: renamed from: x0 */
    public final void mo108560x0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zM212293z = vny0.m199079q().m212293z(this.f120769b);
            HashMap map = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zM212293z ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.f120769b.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.f120769b.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            m144352z8(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.f120772e.getWritableDatabase();
                if (c == 1) {
                    this.f120772e.m216822j(writableDatabase, this.f120771d, stringExtra2);
                } else {
                    z1v0.m216816m(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                x2t0.m206866d("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // p149l.ess0
    /* JADX INFO: renamed from: y3 */
    public final void mo108561y3(uyl uylVar, zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) s050.m181847P2(uylVar);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        vny0.m199081s().mo138093f(context, "offline_notification_channel", "AdMob Offline Notifications");
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(context, "offline_notification_channel").setContentTitle(m144342y8(R$string.f9663h, "View the ad you saved when you were offline")).setAutoCancel(true).setDeleteIntent(m144341x8(context, "offline_notification_dismissed", str3, str2)).setContentIntent(m144341x8(context, "offline_notification_clicked", str3, str2)).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) d1s0.m109677c().m144697a(m7s0.f132373q8)).intValue()).setSmallIcon(context.getApplicationInfo().icon);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132399s8)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                smallIcon.setLargeIcon(bitmapDecodeStream).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapDecodeStream).bigLargeIcon((Bitmap) null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            ii5.m136338h(notificationManager, str3, 54321, smallIcon.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        m144352z8(str3, str, map);
    }

    /* JADX INFO: renamed from: z8 */
    public final void m144352z8(String str, String str2, Map map) {
        m144340p8(this.f120769b, this.f120770c, this.f120773f, this.f120772e, str, str2, map);
    }

    @Override // p149l.ess0
    public final void zzh() {
        final b3t0 b3t0Var = this.f120771d;
        this.f120772e.m216821h(new e2w0() { // from class: l.s1v0
            @Override // p149l.e2w0
            public final Object zza(Object obj) throws Exception {
                z1v0.m216814d(b3t0Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}

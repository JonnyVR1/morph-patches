package p153l;

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
import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzgad;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes6.dex */
public final class qbv0 extends j1t0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final Map f156506a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f156507b;

    /* JADX INFO: renamed from: c */
    public final xwu0 f156508c;

    /* JADX INFO: renamed from: d */
    public final hct0 f156509d;

    /* JADX INFO: renamed from: e */
    public final fbv0 f156510e;

    /* JADX INFO: renamed from: f */
    public final vcw0 f156511f;

    /* JADX INFO: renamed from: g */
    public String f156512g;

    /* JADX INFO: renamed from: h */
    public String f156513h;

    @VisibleForTesting
    public qbv0(Context context, fbv0 fbv0Var, hct0 hct0Var, xwu0 xwu0Var, vcw0 vcw0Var) {
        this.f156507b = context;
        this.f156508c = xwu0Var;
        this.f156509d = hct0Var;
        this.f156510e = fbv0Var;
        this.f156511f = vcw0Var;
    }

    /* JADX INFO: renamed from: p8 */
    public static void m176077p8(Context context, xwu0 xwu0Var, vcw0 vcw0Var, fbv0 fbv0Var, String str, String str2, Map map) {
        String strMo125152b;
        String str3 = true != bxy0.m106933q().m120278z(context) ? UserBanAppealSwitch.offline : "online";
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue() || xwu0Var == null) {
            ucw0 ucw0VarM195443b = ucw0.m195443b(str2);
            ucw0VarM195443b.m195445a("gqi", str);
            ucw0VarM195443b.m195445a("device_connectivity", str3);
            ucw0VarM195443b.m195445a("event_timestamp", String.valueOf(bxy0.m106918b().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                ucw0VarM195443b.m195445a((String) entry.getKey(), (String) entry.getValue());
            }
            strMo125152b = vcw0Var.mo125152b(ucw0VarM195443b);
        } else {
            wwu0 wwu0VarM213443a = xwu0Var.m213443a();
            wwu0VarM213443a.m208307b("gqi", str);
            wwu0VarM213443a.m208307b("action", str2);
            wwu0VarM213443a.m208307b("device_connectivity", str3);
            wwu0VarM213443a.m208307b("event_timestamp", String.valueOf(bxy0.m106918b().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                wwu0VarM213443a.m208307b((String) entry2.getKey(), (String) entry2.getValue());
            }
            strMo125152b = wwu0VarM213443a.m208311f();
        }
        fbv0Var.m124959g(new hbv0(bxy0.m106918b().currentTimeMillis(), str, strMo125152b, 2));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: x8 */
    public static final PendingIntent m176078x8(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return plw0.m172886b(context, 0, intent, plw0.f153096a | 1073741824, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return plw0.m172885a(context, 0, intent, 201326592);
    }

    /* JADX INFO: renamed from: y8 */
    public static String m176079y8(int i, String str) {
        Resources resourcesM120261e = bxy0.m106933q().m120261e();
        return resourcesM120261e == null ? str : resourcesM120261e.getString(i);
    }

    private final void zzt() {
        boolean zZzg;
        try {
            bxy0.m106934r();
            zws0 zws0VarM12361a0 = C2098b.m12361a0(this.f156507b);
            p1m p1mVarM134038Y2 = h950.m134038Y2(this.f156507b);
            String str = this.f156513h;
            String str2 = this.f156512g;
            rav0 rav0Var = (rav0) this.f156506a.get(str2);
            zZzg = zws0VarM12361a0.zzg(p1mVarM134038Y2, new zza(str, str2, rav0Var == null ? "" : rav0Var.mo162100c()));
            if (!zZzg) {
                try {
                    zZzg = zws0VarM12361a0.zzf(h950.m134038Y2(this.f156507b), this.f156513h, this.f156512g);
                } catch (RemoteException e) {
                    e = e;
                    dct0.m115296e("Failed to schedule offline notification poster.", e);
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            zZzg = false;
        }
        if (zZzg) {
            return;
        }
        this.f156510e.m124958e(this.f156512g);
        m176089z8(this.f156512g, "offline_notification_worker_not_scheduled", zzgad.zzd());
    }

    /* JADX INFO: renamed from: A8 */
    public final void m176080A8(final Activity activity, @Nullable final BinderC2096b binderC2096b) {
        bxy0.m106934r();
        if (c050.m107319e(activity).m107322a()) {
            zzt();
            m176081B8(activity, binderC2096b);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                m176089z8(this.f156512g, "asnpdi", zzgad.zzd());
                return;
            }
            bxy0.m106934r();
            AlertDialog.Builder builderM12371j = C2098b.m12371j(activity);
            builderM12371j.setTitle(m176079y8(R$string.f9698f, "Allow app to send you notifications?")).setPositiveButton(m176079y8(R$string.f9696d, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: l.jbv0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f119996a.m176082q8(activity, binderC2096b, dialogInterface, i);
                }
            }).setNegativeButton(m176079y8(R$string.f9697e, "Don't allow"), new DialogInterface.OnClickListener() { // from class: l.kbv0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f124994a.m176083r8(binderC2096b, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.lbv0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f131230a.m176084s8(binderC2096b, dialogInterface);
                }
            });
            builderM12371j.create().show();
            m176089z8(this.f156512g, "rtsdi", zzgad.zzd());
        }
    }

    /* JADX INFO: renamed from: B8 */
    public final void m176081B8(Activity activity, @Nullable final BinderC2096b binderC2096b) {
        AlertDialog alertDialogCreate;
        bxy0.m106934r();
        AlertDialog.Builder onCancelListener = C2098b.m12371j(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.ibv0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                BinderC2096b binderC2096b2 = binderC2096b;
                if (binderC2096b2 != null) {
                    binderC2096b2.zzb();
                }
            }
        });
        int i = jfc0.f120580a;
        Resources resourcesM120261e = bxy0.m106933q().m120261e();
        XmlResourceParser layout = resourcesM120261e == null ? null : resourcesM120261e.getLayout(i);
        if (layout == null) {
            onCancelListener.setMessage(m176079y8(R$string.f9699g, "You'll get a notification with the link when you're back online"));
            alertDialogCreate = onCancelListener.create();
        } else {
            View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            rav0 rav0Var = (rav0) this.f156506a.get(this.f156512g);
            String strMo162099b = rav0Var == null ? "" : rav0Var.mo162099b();
            if (!strMo162099b.isEmpty()) {
                TextView textView = (TextView) viewInflate.findViewById(ncc0.f141333a);
                textView.setVisibility(0);
                textView.setText(strMo162099b);
            }
            rav0 rav0Var2 = (rav0) this.f156506a.get(this.f156512g);
            Drawable drawableMo162098a = rav0Var2 != null ? rav0Var2.mo162098a() : null;
            if (drawableMo162098a != null) {
                ((ImageView) viewInflate.findViewById(ncc0.f141334b)).setImageDrawable(drawableMo162098a);
            }
            alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new pbv0(this, alertDialogCreate, timer, binderC2096b), 3000L);
    }

    @Override // p153l.k1t0
    /* JADX INFO: renamed from: O0 */
    public final void mo138150O0(String[] strArr, int[] iArr, p1m p1mVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                sbv0 sbv0Var = (sbv0) h950.m134037P2(p1mVar);
                Activity activityMo175995a = sbv0Var.mo175995a();
                BinderC2096b binderC2096bMo175996b = sbv0Var.mo175996b();
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", BLiveVoiceSingTogehterState.confirm);
                    zzt();
                    m176081B8(activityMo175995a, binderC2096bMo175996b);
                } else {
                    map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
                    if (binderC2096bMo175996b != null) {
                        binderC2096bMo175996b.zzb();
                    }
                }
                m176089z8(this.f156512g, "asnpdc", map);
                return;
            }
        }
    }

    @Override // p153l.k1t0
    /* JADX INFO: renamed from: Y */
    public final void mo138151Y(p1m p1mVar) {
        sbv0 sbv0Var = (sbv0) h950.m134037P2(p1mVar);
        final Activity activityMo175995a = sbv0Var.mo175995a();
        final BinderC2096b binderC2096bMo175996b = sbv0Var.mo175996b();
        this.f156512g = sbv0Var.mo175997c();
        this.f156513h = sbv0Var.mo175998d();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168431p8)).booleanValue()) {
            m176080A8(activityMo175995a, binderC2096bMo175996b);
            return;
        }
        m176089z8(this.f156512g, "dialog_impression", zzgad.zzd());
        bxy0.m106934r();
        AlertDialog.Builder builderM12371j = C2098b.m12371j(activityMo175995a);
        builderM12371j.setTitle(m176079y8(R$string.f9704l, "Open ad when you're back online.")).setMessage(m176079y8(R$string.f9703k, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(m176079y8(R$string.f9701i, "OK"), new DialogInterface.OnClickListener() { // from class: l.mbv0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f135767a.m176085t8(activityMo175995a, binderC2096bMo175996b, dialogInterface, i);
            }
        }).setNegativeButton(m176079y8(R$string.f9702j, "No thanks"), new DialogInterface.OnClickListener() { // from class: l.nbv0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f141264a.m176086u8(binderC2096bMo175996b, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.obv0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f146629a.m176087v8(binderC2096bMo175996b, dialogInterface);
            }
        });
        builderM12371j.create().show();
    }

    @Override // p153l.k1t0
    /* JADX INFO: renamed from: p7 */
    public final void mo147925p7(p1m p1mVar, String str, String str2) {
        mo138153y3(p1mVar, new zza(str, str2, ""));
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m176082q8(Activity activity, BinderC2096b binderC2096b, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", BLiveVoiceSingTogehterState.confirm);
        m176089z8(this.f156512g, "rtsdc", map);
        activity.startActivity(bxy0.m106935s().mo109053e(activity));
        zzt();
        if (binderC2096b != null) {
            binderC2096b.zzb();
        }
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m176083r8(BinderC2096b binderC2096b, DialogInterface dialogInterface, int i) {
        this.f156510e.m124958e(this.f156512g);
        HashMap map = new HashMap();
        map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
        m176089z8(this.f156512g, "rtsdc", map);
        if (binderC2096b != null) {
            binderC2096b.zzb();
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m176084s8(BinderC2096b binderC2096b, DialogInterface dialogInterface) {
        this.f156510e.m124958e(this.f156512g);
        HashMap map = new HashMap();
        map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
        m176089z8(this.f156512g, "rtsdc", map);
        if (binderC2096b != null) {
            binderC2096b.zzb();
        }
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m176085t8(Activity activity, BinderC2096b binderC2096b, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", BLiveVoiceSingTogehterState.confirm);
        m176089z8(this.f156512g, "dialog_click", map);
        m176080A8(activity, binderC2096b);
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ void m176086u8(BinderC2096b binderC2096b, DialogInterface dialogInterface, int i) {
        this.f156510e.m124958e(this.f156512g);
        HashMap map = new HashMap();
        map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
        m176089z8(this.f156512g, "dialog_click", map);
        if (binderC2096b != null) {
            binderC2096b.zzb();
        }
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m176087v8(BinderC2096b binderC2096b, DialogInterface dialogInterface) {
        this.f156510e.m124958e(this.f156512g);
        HashMap map = new HashMap();
        map.put("dialog_action", SysnotifListener.ACTION_DISMISS);
        m176089z8(this.f156512g, "dialog_click", map);
        if (binderC2096b != null) {
            binderC2096b.zzb();
        }
    }

    /* JADX INFO: renamed from: w8 */
    public final void m176088w8(String str, ulu0 ulu0Var) {
        String strM196593b;
        String string = "";
        if (TextUtils.isEmpty(ulu0Var.m196611k0())) {
            strM196593b = ulu0Var.m196593b() != null ? ulu0Var.m196593b() : "";
        } else {
            strM196593b = ulu0Var.m196611k0();
        }
        als0 als0VarM196590Z = ulu0Var.m196590Z();
        if (als0VarM196590Z != null) {
            try {
                string = als0VarM196590Z.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        als0 als0VarM196592a0 = ulu0Var.m196592a0();
        Drawable drawable = null;
        if (als0VarM196592a0 != null) {
            try {
                p1m p1mVarZzf = als0VarM196592a0.zzf();
                if (p1mVarZzf != null) {
                    drawable = (Drawable) h950.m134037P2(p1mVarZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f156506a.put(str, new nav0(strM196593b, string, drawable));
    }

    @Override // p153l.k1t0
    /* JADX INFO: renamed from: x0 */
    public final void mo138152x0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zM120278z = bxy0.m106933q().m120278z(this.f156507b);
            HashMap map = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zM120278z ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.f156507b.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    this.f156507b.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            m176089z8(stringExtra2, "offline_notification_action", map);
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.f156510e.getWritableDatabase();
                if (c == 1) {
                    this.f156510e.m124961j(writableDatabase, this.f156509d, stringExtra2);
                } else {
                    fbv0.m124955m(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                dct0.m115295d("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // p153l.k1t0
    /* JADX INFO: renamed from: y3 */
    public final void mo138153y3(p1m p1mVar, zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) h950.m134037P2(p1mVar);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        bxy0.m106935s().mo109054f(context, "offline_notification_channel", "AdMob Offline Notifications");
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(context, "offline_notification_channel").setContentTitle(m176079y8(R$string.f9700h, "View the ad you saved when you were offline")).setAutoCancel(true).setDeleteIntent(m176078x8(context, "offline_notification_dismissed", str3, str2)).setContentIntent(m176078x8(context, "offline_notification_clicked", str3, str2)).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) jas0.m144075c().m176505a(sgs0.f168444q8)).intValue()).setSmallIcon(context.getApplicationInfo().icon);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168470s8)).booleanValue() || str4.isEmpty()) {
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
            jj5.m145014h(notificationManager, str3, 54321, smallIcon.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        m176089z8(str3, str, map);
    }

    /* JADX INFO: renamed from: z8 */
    public final void m176089z8(String str, String str2, Map map) {
        m176077p8(this.f156507b, this.f156508c, this.f156511f, this.f156510e, str, str2, map);
    }

    @Override // p153l.k1t0
    public final void zzh() {
        final hct0 hct0Var = this.f156509d;
        this.f156510e.m124960h(new kbw0() { // from class: l.yav0
            @Override // p153l.kbw0
            public final Object zza(Object obj) throws Exception {
                fbv0.m124953d(hct0Var, (android.database.sqlite.SQLiteDatabase) obj);
                return null;
            }
        });
    }
}

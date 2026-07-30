package p149l;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzgad;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class ghs0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final q0s0 f102704a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final rnu0 f102705b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final p3w0 f102706c;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final grs0 f102708e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final z1v0 f102709f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final xkt0 f102710g;

    /* JADX INFO: renamed from: h */
    public pvy0 f102711h = null;

    /* JADX INFO: renamed from: i */
    public final rmw0 f102712i = i3t0.f111377f;

    /* JADX INFO: renamed from: d */
    public final b3t0 f102707d = new b3t0(null);

    public ghs0(q0s0 q0s0Var, grs0 grs0Var, z1v0 z1v0Var, rnu0 rnu0Var, p3w0 p3w0Var, xkt0 xkt0Var) {
        this.f102704a = q0s0Var;
        this.f102708e = grs0Var;
        this.f102709f = z1v0Var;
        this.f102705b = rnu0Var;
        this.f102706c = p3w0Var;
        this.f102710g = xkt0Var;
    }

    /* JADX INFO: renamed from: b */
    public static int m126210b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if (BLiveStormDanmakuGiftResourceType.f44444l.equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static Uri m126211c(Context context, ptr0 ptr0Var, Uri uri, View view, @Nullable Activity activity, @Nullable myv0 myv0Var) {
        if (ptr0Var != null) {
            try {
                if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132389rb)).booleanValue() || myv0Var == null) {
                    if (ptr0Var.m171380e(uri)) {
                        return ptr0Var.m171376a(uri, context, view, activity);
                    }
                } else if (ptr0Var.m171380e(uri)) {
                    return myv0Var.m157092a(uri, context, view, activity);
                }
            } catch (zzavj unused) {
            } catch (Exception e) {
                vny0.m199079q().m212290w(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static Uri m126212d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            x2t0.m206867e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
            return uri;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m126214f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        b1r0 b1r0Var = (b1r0) obj;
        String strM162169c = o0t0.m162169c((String) map.get("u"), ((q9t0) b1r0Var).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            x2t0.m206869g("Action missing from an open GMSG.");
            return;
        }
        q0s0 q0s0Var = this.f102704a;
        if (q0s0Var == null || q0s0Var.m172358c()) {
            jmw0.m142245r((((Boolean) d1s0.m109677c().m144697a(m7s0.f131986L9)).booleanValue() && this.f102710g != null && xkt0.m209826h(strM162169c)) ? this.f102710g.m209827b(strM162169c, exr0.m118706e()) : jmw0.m142235h(strM162169c), new chs0(this, b1r0Var, map, str), this.f102712i);
        } else {
            q0s0Var.m172357b(strM162169c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX INFO: renamed from: h */
    public final void m126216h(String str, b1r0 b1r0Var, Map map, String str2) {
        boolean z;
        Map map2 = map;
        q9t0 q9t0Var = (q9t0) b1r0Var;
        kxv0 kxv0VarMo13679c = q9t0Var.mo13679c();
        nxv0 nxv0VarMo13689h = q9t0Var.mo13689h();
        boolean z2 = false;
        String str3 = "";
        if (kxv0VarMo13679c == null || nxv0VarMo13689h == null) {
            z = false;
        } else {
            str3 = nxv0VarMo13689h.f141055b;
            z = kxv0VarMo13679c.f125202j0;
        }
        boolean z3 = (((Boolean) d1s0.m109677c().m144697a(m7s0.f132297ka)).booleanValue() && map2.containsKey(Constants.INAPP_NOTIF_SHOW_CLOSE) && ((String) map2.get(Constants.INAPP_NOTIF_SHOW_CLOSE)).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (q9t0Var.mo13676a0()) {
                x2t0.m206869g("Cannot expand WebView that is already expanded.");
                return;
            } else {
                m126219k(false);
                ((zat0) b1r0Var).mo13715v0(m126214f(map2), m126210b(map2), z3);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            m126219k(false);
            boolean z4 = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132324mb)).booleanValue() && Objects.equals(map2.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zat0) b1r0Var).mo13666R(m126214f(map2), m126210b(map2), str, z3, z4);
                return;
            } else {
                ((zat0) b1r0Var).mo13717w0(m126214f(map2), m126210b(map2), (String) map2.get(Constants.INAPP_HTML_TAG), (String) map2.get("baseurl"), z3);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            q9t0Var.getContext();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132443w4)).booleanValue()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131849A4)).booleanValue()) {
                    xsu0.m210834k("User opt out chrome custom tab.");
                } else {
                    z2 = true;
                }
            }
            boolean zM197514g = v8s0.m197514g(q9t0Var.getContext());
            if (z2) {
                if (zM197514g) {
                    m126219k(true);
                    if (TextUtils.isEmpty(str)) {
                        x2t0.m206869g("Cannot open browser with null or empty url");
                        m126221m(7);
                        return;
                    }
                    Uri uriM126212d = m126212d(m126211c(q9t0Var.getContext(), q9t0Var.mo13703p(), Uri.parse(str), q9t0Var.zzF(), q9t0Var.zzi(), q9t0Var.mo13685f()));
                    if (z && this.f102709f != null && m126220l(b1r0Var, q9t0Var.getContext(), uriM126212d.toString(), str3)) {
                        return;
                    }
                    this.f102711h = new dhs0(this);
                    ((zat0) b1r0Var).mo13667S(new zzc(null, uriM126212d.toString(), null, null, null, null, null, null, s050.m181848Y2(this.f102711h).asBinder(), true), z3);
                    return;
                }
                m126221m(4);
            }
            map2.put("use_first_package", "true");
            map2.put("use_running_process", "true");
            m126218j(b1r0Var, map2, z, str3, z3);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
            m126218j(b1r0Var, map2, z, str3, z3);
            return;
        }
        b1r0 b1r0Var2 = b1r0Var;
        String str4 = str3;
        boolean z5 = z3;
        boolean z6 = z;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132204d8)).booleanValue()) {
                m126219k(true);
                String str5 = (String) map2.get("p");
                if (str5 == null) {
                    x2t0.m206869g("Package name missing from open app action.");
                    return;
                }
                if (z6 && this.f102709f != null && m126220l(b1r0Var2, q9t0Var.getContext(), str5, str4)) {
                    return;
                }
                PackageManager packageManager = q9t0Var.getContext().getPackageManager();
                if (packageManager == null) {
                    x2t0.m206869g("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zat0) b1r0Var2).mo13667S(new zzc(launchIntentForPackage, this.f102711h), z5);
                    return;
                }
                return;
            }
            return;
        }
        m126219k(true);
        String str6 = (String) map2.get("intent_url");
        Intent uri = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                x2t0.m206867e("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriM126212d2 = m126212d(m126211c(q9t0Var.getContext(), q9t0Var.mo13703p(), data, q9t0Var.zzF(), q9t0Var.zzi(), q9t0Var.mo13685f()));
                if (TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriM126212d2);
                } else {
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132217e8)).booleanValue()) {
                        intent.setDataAndType(uriM126212d2, intent.getType());
                    } else {
                        intent.setData(uriM126212d2);
                    }
                }
            }
        }
        boolean z7 = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132435v8)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        HashMap map3 = new HashMap();
        if (z7) {
            ehs0 ehs0Var = new ehs0(this, z5, b1r0Var2, map3, map2);
            b1r0Var2 = b1r0Var2;
            map2 = map2;
            this.f102711h = ehs0Var;
        } else {
            z2 = z5;
        }
        if (intent != null) {
            if (!z6 || this.f102709f == null || !m126220l(b1r0Var2, q9t0Var.getContext(), intent.getData().toString(), str4)) {
                ((zat0) b1r0Var2).mo13667S(new zzc(intent, this.f102711h), z2);
                return;
            } else {
                if (z7) {
                    map3.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((eks0) b1r0Var2).mo13674Z("openIntentAsync", map3);
                    return;
                }
                return;
            }
        }
        String string = !TextUtils.isEmpty(str) ? m126212d(m126211c(q9t0Var.getContext(), q9t0Var.mo13703p(), Uri.parse(str), q9t0Var.zzF(), q9t0Var.zzi(), q9t0Var.mo13685f())).toString() : str;
        if (!z6 || this.f102709f == null || !m126220l(b1r0Var2, q9t0Var.getContext(), string, str4)) {
            ((zat0) b1r0Var2).mo13667S(new zzc((String) map2.get(RXScreenCaptureService.KEY_INDEX), string, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.f102711h), z2);
        } else if (z7) {
            map3.put((String) map2.get("event_id"), Boolean.TRUE);
            ((eks0) b1r0Var2).mo13674Z("openIntentAsync", map3);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m126217i(Context context, String str, String str2) {
        this.f102709f.m216819e(str);
        rnu0 rnu0Var = this.f102705b;
        if (rnu0Var != null) {
            k2v0.m144340p8(context, rnu0Var, this.f102706c, this.f102709f, str, "dialog_not_shown", zzgad.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:48:0x0152  */
    /* JADX INFO: renamed from: j */
    public final void m126218j(b1r0 b1r0Var, Map map, boolean z, String str, boolean z2) {
        Uri uriBuild;
        Intent intentM121447b;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoM121448c;
        boolean z3 = true;
        m126219k(true);
        q9t0 q9t0Var = (q9t0) b1r0Var;
        Context context = q9t0Var.getContext();
        ptr0 ptr0VarMo13703p = q9t0Var.mo13703p();
        View viewZzF = q9t0Var.zzF();
        myv0 myv0VarMo13685f = q9t0Var.mo13685f();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intentM121447b = null;
        } else {
            Uri uriM126212d = m126212d(m126211c(context, ptr0VarMo13703p, Uri.parse(str2), viewZzF, null, myv0VarMo13685f));
            boolean z4 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132419u4)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriM126212d.getScheme())) {
                uriBuild = uriM126212d.buildUpon().scheme("https").build();
            } else {
                uriBuild = "https".equalsIgnoreCase(uriM126212d.getScheme()) ? uriM126212d.buildUpon().scheme("http").build() : null;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM121446a = fhs0.m121446a(uriM126212d, context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
            Intent intentM121446a2 = fhs0.m121446a(uriBuild, context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
            if (z3) {
                vny0.m199080r();
                C2075b.m12296Q(context, intentM121446a);
                vny0.m199080r();
                C2075b.m12296Q(context, intentM121446a2);
            }
            ResolveInfo resolveInfoM121449d = fhs0.m121449d(intentM121446a, arrayList, context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
            if (resolveInfoM121449d != null) {
                intentM121447b = fhs0.m121447b(intentM121446a, resolveInfoM121449d, context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
            } else if (intentM121446a2 != null && (resolveInfoM121448c = fhs0.m121448c(intentM121446a2, context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f)) != null) {
                intentM121447b = fhs0.m121447b(intentM121446a, resolveInfoM121448c, context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
                if (fhs0.m121448c(intentM121447b, context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f) == null) {
                    if (!arrayList.isEmpty()) {
                        intentM121447b = intentM121446a;
                    } else if (!z5) {
                        if (z4) {
                            intentM121447b = fhs0.m121447b(intentM121446a, (ResolveInfo) arrayList.get(0), context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
                        } else {
                            intentM121447b = intentM121446a;
                        }
                    } else if (z4) {
                        intentM121447b = fhs0.m121447b(intentM121446a, (ResolveInfo) arrayList.get(0), context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
                    } else {
                        intentM121447b = intentM121446a;
                    }
                }
            } else if (!arrayList.isEmpty()) {
                intentM121447b = intentM121446a;
            } else if (!z5 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            int i2 = i + 1;
                            if (it.hasNext()) {
                                List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
                                if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                    intentM121447b = fhs0.m121447b(intentM121446a, resolveInfo, context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
                                } else {
                                    runningAppProcesses = list;
                                }
                            } else {
                                i = i2;
                            }
                        }
                    } else if (z4) {
                        intentM121447b = fhs0.m121447b(intentM121446a, (ResolveInfo) arrayList.get(0), context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
                    } else {
                        intentM121447b = intentM121446a;
                    }
                }
            } else if (z4) {
                intentM121447b = fhs0.m121447b(intentM121446a, (ResolveInfo) arrayList.get(0), context, ptr0VarMo13703p, viewZzF, myv0VarMo13685f);
            } else {
                intentM121447b = intentM121446a;
            }
        }
        if (!z || this.f102709f == null || intentM121447b == null || !m126220l(b1r0Var, q9t0Var.getContext(), intentM121447b.getData().toString(), str)) {
            try {
                ((zat0) b1r0Var).mo13667S(new zzc(intentM121447b, this.f102711h), z2);
            } catch (ActivityNotFoundException e) {
                x2t0.m206869g(e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m126219k(boolean z) {
        grs0 grs0Var = this.f102708e;
        if (grs0Var != null) {
            grs0Var.m127766h(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r0 != false) goto L28;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m126220l(p149l.b1r0 r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.ghs0.m126220l(l.b1r0, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: m */
    public final void m126221m(int i) {
        if (this.f102705b == null) {
            return;
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue()) {
            qnu0 qnu0VarM180208a = this.f102705b.m180208a();
            qnu0VarM180208a.m175693b("action", "cct_action");
            qnu0VarM180208a.m175693b("cct_open_status", u8s0.m192216a(i));
            qnu0VarM180208a.m175698g();
            return;
        }
        p3w0 p3w0Var = this.f102706c;
        String strM192216a = u8s0.m192216a(i);
        o3w0 o3w0VarM162489b = o3w0.m162489b("cct_action");
        o3w0VarM162489b.m162491a("cct_open_status", strM192216a);
        p3w0Var.mo124429a(o3w0VarM162489b);
    }
}

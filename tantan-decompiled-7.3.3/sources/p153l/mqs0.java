package p153l;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzgad;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class mqs0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final w9s0 f138162a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final xwu0 f138163b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final vcw0 f138164c;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final m0t0 f138166e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final fbv0 f138167f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final dut0 f138168g;

    /* JADX INFO: renamed from: h */
    public v4z0 f138169h = null;

    /* JADX INFO: renamed from: i */
    public final xvw0 f138170i = oct0.f146738f;

    /* JADX INFO: renamed from: d */
    public final hct0 f138165d = new hct0(null);

    public mqs0(w9s0 w9s0Var, m0t0 m0t0Var, fbv0 fbv0Var, xwu0 xwu0Var, vcw0 vcw0Var, dut0 dut0Var) {
        this.f138162a = w9s0Var;
        this.f138166e = m0t0Var;
        this.f138167f = fbv0Var;
        this.f138163b = xwu0Var;
        this.f138164c = vcw0Var;
        this.f138168g = dut0Var;
    }

    /* JADX INFO: renamed from: b */
    public static int m159599b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if (BLiveStormDanmakuGiftResourceType.f45292l.equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static Uri m159600c(Context context, v2s0 v2s0Var, Uri uri, View view, @Nullable Activity activity, @Nullable s7w0 s7w0Var) {
        if (v2s0Var != null) {
            try {
                if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168460rb)).booleanValue() || s7w0Var == null) {
                    if (v2s0Var.m199149e(uri)) {
                        return v2s0Var.m199145a(uri, context, view, activity);
                    }
                } else if (v2s0Var.m199149e(uri)) {
                    return s7w0Var.m185039a(uri, context, view, activity);
                }
            } catch (zzavj unused) {
            } catch (Exception e) {
                bxy0.m106933q().m120275w(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static Uri m159601d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            dct0.m115296e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
            return uri;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m159603f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        har0 har0Var = (har0) obj;
        String strM195119c = u9t0.m195119c((String) map.get("u"), ((wit0) har0Var).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            dct0.m115298g("Action missing from an open GMSG.");
            return;
        }
        w9s0 w9s0Var = this.f138162a;
        if (w9s0Var == null || w9s0Var.m205627c()) {
            pvw0.m173991r((((Boolean) jas0.m144075c().m176505a(sgs0.f168057L9)).booleanValue() && this.f138168g != null && dut0.m118172h(strM195119c)) ? this.f138168g.m118173b(strM195119c, k6s0.m148572e()) : pvw0.m173981h(strM195119c), new iqs0(this, har0Var, map, str), this.f138170i);
        } else {
            w9s0Var.m205626b(strM195119c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX INFO: renamed from: h */
    public final void m159605h(String str, har0 har0Var, Map map, String str2) {
        boolean z;
        Map map2 = map;
        wit0 wit0Var = (wit0) har0Var;
        q6w0 q6w0VarMo13733c = wit0Var.mo13733c();
        t6w0 t6w0VarMo13743h = wit0Var.mo13743h();
        boolean z2 = false;
        String str3 = "";
        if (q6w0VarMo13733c == null || t6w0VarMo13743h == null) {
            z = false;
        } else {
            str3 = t6w0VarMo13743h.f172368b;
            z = q6w0VarMo13733c.f155892j0;
        }
        boolean z3 = (((Boolean) jas0.m144075c().m176505a(sgs0.f168368ka)).booleanValue() && map2.containsKey(Constants.INAPP_NOTIF_SHOW_CLOSE) && ((String) map2.get(Constants.INAPP_NOTIF_SHOW_CLOSE)).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (wit0Var.mo13730a0()) {
                dct0.m115298g("Cannot expand WebView that is already expanded.");
                return;
            } else {
                m159608k(false);
                ((fkt0) har0Var).mo13769v0(m159603f(map2), m159599b(map2), z3);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            m159608k(false);
            boolean z4 = ((Boolean) jas0.m144075c().m176505a(sgs0.f168395mb)).booleanValue() && Objects.equals(map2.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((fkt0) har0Var).mo13720R(m159603f(map2), m159599b(map2), str, z3, z4);
                return;
            } else {
                ((fkt0) har0Var).mo13771w0(m159603f(map2), m159599b(map2), (String) map2.get(Constants.INAPP_HTML_TAG), (String) map2.get("baseurl"), z3);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            wit0Var.getContext();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168514w4)).booleanValue()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167920A4)).booleanValue()) {
                    d2v0.m113737k("User opt out chrome custom tab.");
                } else {
                    z2 = true;
                }
            }
            boolean zM104509g = bis0.m104509g(wit0Var.getContext());
            if (z2) {
                if (zM104509g) {
                    m159608k(true);
                    if (TextUtils.isEmpty(str)) {
                        dct0.m115298g("Cannot open browser with null or empty url");
                        m159610m(7);
                        return;
                    }
                    Uri uriM159601d = m159601d(m159600c(wit0Var.getContext(), wit0Var.mo13757p(), Uri.parse(str), wit0Var.zzF(), wit0Var.zzi(), wit0Var.mo13739f()));
                    if (z && this.f138167f != null && m159609l(har0Var, wit0Var.getContext(), uriM159601d.toString(), str3)) {
                        return;
                    }
                    this.f138169h = new jqs0(this);
                    ((fkt0) har0Var).mo13721S(new zzc(null, uriM159601d.toString(), null, null, null, null, null, null, h950.m134038Y2(this.f138169h).asBinder(), true), z3);
                    return;
                }
                m159610m(4);
            }
            map2.put("use_first_package", "true");
            map2.put("use_running_process", "true");
            m159607j(har0Var, map2, z, str3, z3);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
            m159607j(har0Var, map2, z, str3, z3);
            return;
        }
        har0 har0Var2 = har0Var;
        String str4 = str3;
        boolean z5 = z3;
        boolean z6 = z;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168275d8)).booleanValue()) {
                m159608k(true);
                String str5 = (String) map2.get("p");
                if (str5 == null) {
                    dct0.m115298g("Package name missing from open app action.");
                    return;
                }
                if (z6 && this.f138167f != null && m159609l(har0Var2, wit0Var.getContext(), str5, str4)) {
                    return;
                }
                PackageManager packageManager = wit0Var.getContext().getPackageManager();
                if (packageManager == null) {
                    dct0.m115298g("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((fkt0) har0Var2).mo13721S(new zzc(launchIntentForPackage, this.f138169h), z5);
                    return;
                }
                return;
            }
            return;
        }
        m159608k(true);
        String str6 = (String) map2.get("intent_url");
        Intent uri = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                dct0.m115296e("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriM159601d2 = m159601d(m159600c(wit0Var.getContext(), wit0Var.mo13757p(), data, wit0Var.zzF(), wit0Var.zzi(), wit0Var.mo13739f()));
                if (TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriM159601d2);
                } else {
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168288e8)).booleanValue()) {
                        intent.setDataAndType(uriM159601d2, intent.getType());
                    } else {
                        intent.setData(uriM159601d2);
                    }
                }
            }
        }
        boolean z7 = ((Boolean) jas0.m144075c().m176505a(sgs0.f168506v8)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        HashMap map3 = new HashMap();
        if (z7) {
            kqs0 kqs0Var = new kqs0(this, z5, har0Var2, map3, map2);
            har0Var2 = har0Var2;
            map2 = map2;
            this.f138169h = kqs0Var;
        } else {
            z2 = z5;
        }
        if (intent != null) {
            if (!z6 || this.f138167f == null || !m159609l(har0Var2, wit0Var.getContext(), intent.getData().toString(), str4)) {
                ((fkt0) har0Var2).mo13721S(new zzc(intent, this.f138169h), z2);
                return;
            } else {
                if (z7) {
                    map3.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((kts0) har0Var2).mo13728Z("openIntentAsync", map3);
                    return;
                }
                return;
            }
        }
        String string = !TextUtils.isEmpty(str) ? m159601d(m159600c(wit0Var.getContext(), wit0Var.mo13757p(), Uri.parse(str), wit0Var.zzF(), wit0Var.zzi(), wit0Var.mo13739f())).toString() : str;
        if (!z6 || this.f138167f == null || !m159609l(har0Var2, wit0Var.getContext(), string, str4)) {
            ((fkt0) har0Var2).mo13721S(new zzc((String) map2.get(RXScreenCaptureService.KEY_INDEX), string, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.f138169h), z2);
        } else if (z7) {
            map3.put((String) map2.get("event_id"), Boolean.TRUE);
            ((kts0) har0Var2).mo13728Z("openIntentAsync", map3);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m159606i(Context context, String str, String str2) {
        this.f138167f.m124958e(str);
        xwu0 xwu0Var = this.f138163b;
        if (xwu0Var != null) {
            qbv0.m176077p8(context, xwu0Var, this.f138164c, this.f138167f, str, "dialog_not_shown", zzgad.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:48:0x0152  */
    /* JADX INFO: renamed from: j */
    public final void m159607j(har0 har0Var, Map map, boolean z, String str, boolean z2) {
        Uri uriBuild;
        Intent intentM155505b;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoM155506c;
        boolean z3 = true;
        m159608k(true);
        wit0 wit0Var = (wit0) har0Var;
        Context context = wit0Var.getContext();
        v2s0 v2s0VarMo13757p = wit0Var.mo13757p();
        View viewZzF = wit0Var.zzF();
        s7w0 s7w0VarMo13739f = wit0Var.mo13739f();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intentM155505b = null;
        } else {
            Uri uriM159601d = m159601d(m159600c(context, v2s0VarMo13757p, Uri.parse(str2), viewZzF, null, s7w0VarMo13739f));
            boolean z4 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168490u4)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriM159601d.getScheme())) {
                uriBuild = uriM159601d.buildUpon().scheme("https").build();
            } else {
                uriBuild = "https".equalsIgnoreCase(uriM159601d.getScheme()) ? uriM159601d.buildUpon().scheme("http").build() : null;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM155504a = lqs0.m155504a(uriM159601d, context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
            Intent intentM155504a2 = lqs0.m155504a(uriBuild, context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
            if (z3) {
                bxy0.m106934r();
                C2098b.m12350Q(context, intentM155504a);
                bxy0.m106934r();
                C2098b.m12350Q(context, intentM155504a2);
            }
            ResolveInfo resolveInfoM155507d = lqs0.m155507d(intentM155504a, arrayList, context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
            if (resolveInfoM155507d != null) {
                intentM155505b = lqs0.m155505b(intentM155504a, resolveInfoM155507d, context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
            } else if (intentM155504a2 != null && (resolveInfoM155506c = lqs0.m155506c(intentM155504a2, context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f)) != null) {
                intentM155505b = lqs0.m155505b(intentM155504a, resolveInfoM155506c, context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
                if (lqs0.m155506c(intentM155505b, context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f) == null) {
                    if (!arrayList.isEmpty()) {
                        intentM155505b = intentM155504a;
                    } else if (!z5) {
                        if (z4) {
                            intentM155505b = lqs0.m155505b(intentM155504a, (ResolveInfo) arrayList.get(0), context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
                        } else {
                            intentM155505b = intentM155504a;
                        }
                    } else if (z4) {
                        intentM155505b = lqs0.m155505b(intentM155504a, (ResolveInfo) arrayList.get(0), context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
                    } else {
                        intentM155505b = intentM155504a;
                    }
                }
            } else if (!arrayList.isEmpty()) {
                intentM155505b = intentM155504a;
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
                                    intentM155505b = lqs0.m155505b(intentM155504a, resolveInfo, context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
                                } else {
                                    runningAppProcesses = list;
                                }
                            } else {
                                i = i2;
                            }
                        }
                    } else if (z4) {
                        intentM155505b = lqs0.m155505b(intentM155504a, (ResolveInfo) arrayList.get(0), context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
                    } else {
                        intentM155505b = intentM155504a;
                    }
                }
            } else if (z4) {
                intentM155505b = lqs0.m155505b(intentM155504a, (ResolveInfo) arrayList.get(0), context, v2s0VarMo13757p, viewZzF, s7w0VarMo13739f);
            } else {
                intentM155505b = intentM155504a;
            }
        }
        if (!z || this.f138167f == null || intentM155505b == null || !m159609l(har0Var, wit0Var.getContext(), intentM155505b.getData().toString(), str)) {
            try {
                ((fkt0) har0Var).mo13721S(new zzc(intentM155505b, this.f138169h), z2);
            } catch (ActivityNotFoundException e) {
                dct0.m115298g(e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m159608k(boolean z) {
        m0t0 m0t0Var = this.f138166e;
        if (m0t0Var != null) {
            m0t0Var.m156534h(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r0 != false) goto L28;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m159609l(har0 har0Var, Context context, String str, String str2) {
        Context context2;
        String str3;
        boolean zBooleanValue;
        xwu0 xwu0Var = this.f138163b;
        if (xwu0Var != null) {
            context2 = context;
            str3 = str2;
            qbv0.m176077p8(context2, xwu0Var, this.f138164c, this.f138167f, str3, "offline_open", new HashMap());
        } else {
            context2 = context;
            str3 = str2;
        }
        if (bxy0.m106933q().m120278z(context2)) {
            this.f138167f.m124962k(this.f138165d, str3);
            return false;
        }
        bxy0.m106934r();
        zws0 zws0VarM12361a0 = C2098b.m12361a0(context2);
        bxy0.m106934r();
        boolean zM107322a = c050.m107319e(context2).m107322a();
        boolean zMo109055g = bxy0.m106935s().mo109055g(context2, "offline_notification_channel");
        wit0 wit0Var = (wit0) har0Var;
        boolean z = wit0Var.zzO().m211423i() && wit0Var.zzi() == null;
        if (!zM107322a) {
            bxy0.m106934r();
            if (!c050.m107319e(context2).m107322a()) {
                if (Build.VERSION.SDK_INT < 33) {
                    zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168418o8)).booleanValue();
                } else {
                    zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168405n8)).booleanValue();
                }
            }
            m159606i(context2, str3, "notifications_disabled");
            return false;
        }
        if (zMo109055g) {
            m159606i(context2, str3, "notification_channel_disabled");
            return false;
        }
        if (zws0VarM12361a0 == null) {
            m159606i(context2, str3, "work_manager_unavailable");
            return false;
        }
        if (z) {
            m159606i(context2, str3, "ad_no_activity");
            return false;
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168379l8)).booleanValue()) {
            m159606i(context2, str3, "notification_flow_disabled");
            return false;
        }
        if (wit0Var.zzL() == null || wit0Var.zzi() == null) {
            ((fkt0) har0Var).mo13776z(str3, str, 14);
        } else {
            rbv0 rbv0VarM185334e = sbv0.m185334e();
            rbv0VarM185334e.mo166853a(wit0Var.zzi());
            rbv0VarM185334e.mo166854b(null);
            rbv0VarM185334e.mo166855c(str3);
            rbv0VarM185334e.mo166856d(str);
            try {
                wit0Var.zzL().m12332w8(rbv0VarM185334e.mo166857e());
            } catch (Exception e) {
                m159606i(context2, str3, e.getMessage());
                return false;
            }
        }
        har0Var.onAdClicked();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m159610m(int i) {
        if (this.f138163b == null) {
            return;
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue()) {
            wwu0 wwu0VarM213443a = this.f138163b.m213443a();
            wwu0VarM213443a.m208307b("action", "cct_action");
            wwu0VarM213443a.m208307b("cct_open_status", ais0.m98025a(i));
            wwu0VarM213443a.m208312g();
            return;
        }
        vcw0 vcw0Var = this.f138164c;
        String strM98025a = ais0.m98025a(i);
        ucw0 ucw0VarM195443b = ucw0.m195443b("cct_action");
        ucw0VarM195443b.m195445a("cct_open_status", strM98025a);
        vcw0Var.mo125151a(ucw0VarM195443b);
    }
}

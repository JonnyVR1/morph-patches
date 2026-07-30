package p149l;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.profile.ProfileCommand;
import com.clevertap.android.sdk.profile.traversal.ProfileOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wk0 extends pe2 {

    /* JADX INFO: renamed from: a */
    private final ov3 f186698a;

    /* JADX INFO: renamed from: c */
    private final ak2 f186700c;

    /* JADX INFO: renamed from: d */
    private final vg2 f186701d;

    /* JADX INFO: renamed from: e */
    private final CleverTapInstanceConfig f186702e;

    /* JADX INFO: renamed from: f */
    private final Context f186703f;

    /* JADX INFO: renamed from: g */
    private final r26 f186704g;

    /* JADX INFO: renamed from: h */
    private final qs9 f186705h;

    /* JADX INFO: renamed from: i */
    private final hyd f186706i;

    /* JADX INFO: renamed from: j */
    private final krk0 f186707j;

    /* JADX INFO: renamed from: k */
    private final crk0 f186708k;

    /* JADX INFO: renamed from: l */
    private final n95 f186709l;

    /* JADX INFO: renamed from: m */
    private final tt3 f186710m;

    /* JADX INFO: renamed from: o */
    private final csv f186712o;

    /* JADX INFO: renamed from: p */
    private final npm f186713p;

    /* JADX INFO: renamed from: b */
    private final HashMap<String, Integer> f186699b = new HashMap<>(8);

    /* JADX INFO: renamed from: n */
    private final Object f186711n = new Object();

    /* JADX INFO: renamed from: q */
    private final x4f f186714q = new x4f(2000);

    /* JADX INFO: renamed from: r */
    private final x4f f186715r = new x4f(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);

    /* JADX INFO: renamed from: s */
    private final HashMap<String, Long> f186716s = new HashMap<>();

    /* JADX INFO: renamed from: t */
    private final HashMap<String, Long> f186717t = new HashMap<>();

    public wk0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, ak2 ak2Var, krk0 krk0Var, crk0 crk0Var, qs9 qs9Var, hyd hydVar, vg2 vg2Var, r26 r26Var, ov3 ov3Var, n95 n95Var, tt3 tt3Var, csv csvVar, npm npmVar) {
        this.f186703f = context;
        this.f186702e = cleverTapInstanceConfig;
        this.f186700c = ak2Var;
        this.f186707j = krk0Var;
        this.f186708k = crk0Var;
        this.f186705h = qs9Var;
        this.f186706i = hydVar;
        this.f186701d = vg2Var;
        this.f186698a = ov3Var;
        this.f186704g = r26Var;
        this.f186709l = n95Var;
        this.f186710m = tt3Var;
        this.f186712o = csvVar;
        this.f186713p = npmVar;
    }

    /* JADX INFO: renamed from: B */
    private boolean m203595B(String str) {
        fv3 fv3VarM177570e;
        return (str == null || (fv3VarM177570e = this.f186704g.m177570e()) == null || !fv3VarM177570e.m123265n(str)) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    private ypi.C21469c m203596C(String str, Object obj, ProfileOperation profileOperation) {
        return new ypi.C21469c(this.f186712o.m108591D(str, obj, profileOperation));
    }

    /* JADX INFO: renamed from: D */
    private ypi.C21469c m203597D(JSONObject jSONObject, ProfileOperation profileOperation) {
        return new ypi.C21469c(this.f186712o.m108592E(jSONObject, profileOperation));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m203598b(wk0 wk0Var, Map map) {
        wk0Var.m203610n(map);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m203599c(wk0 wk0Var, ArrayList arrayList, String str) throws IOException {
        wk0Var.getClass();
        wk0Var.m203609m(arrayList, str, ProfileCommand.ADD);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m203600d(wk0 wk0Var, String str) {
        wk0Var.m203614r(str);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Void m203601e(wk0 wk0Var, ArrayList arrayList, String str) throws IOException {
        wk0Var.getClass();
        wk0Var.m203609m(arrayList, str, ProfileCommand.REMOVE);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Void m203602f(wk0 wk0Var, String str, Map map) {
        wk0Var.m203612p(str, map);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Void m203603g(wk0 wk0Var, ArrayList arrayList, String str) throws IOException {
        wk0Var.getClass();
        wk0Var.m203609m(arrayList, str, ProfileCommand.SET);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Void m203604h(wk0 wk0Var, Bundle bundle) {
        wk0Var.getClass();
        try {
            Logger.m5873v("Received inbox via push payload: " + bundle.getString(Constants.INBOX_PREVIEW_PUSH_PAYLOAD_KEY));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(Constants.INBOX_JSON_RESPONSE_KEY, jSONArray);
            JSONObject jSONObject2 = new JSONObject(bundle.getString(Constants.INBOX_PREVIEW_PUSH_PAYLOAD_KEY));
            jSONObject2.put("_id", String.valueOf(System.currentTimeMillis() / 1000));
            jSONArray.put(jSONObject2);
            new arm(wk0Var.f186702e, wk0Var.f186698a, wk0Var.f186701d, wk0Var.f186704g).mo98525a(jSONObject, null, wk0Var.f186703f);
            return null;
        } catch (Throwable th) {
            Logger.m5876v("Failed to process inbox message from push notification payload", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Void m203605i(wk0 wk0Var, Number number, String str) {
        wk0Var.getClass();
        wk0Var.m203608l(number, str, ProfileCommand.DECREMENT);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Void m203606j(wk0 wk0Var, HashMap map, ArrayList arrayList) {
        wk0Var.m203611o(map, arrayList);
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Void m203607k(wk0 wk0Var, Number number, String str) {
        wk0Var.getClass();
        wk0Var.m203608l(number, str, ProfileCommand.INCREMENT);
        return null;
    }

    /* JADX INFO: renamed from: l */
    private void m203608l(Number number, String str, ProfileCommand profileCommand) {
        if (number == null) {
            return;
        }
        try {
            vya0 vya0VarM134341a = this.f186707j.m147002j().m134341a(str, this.f186708k);
            if (vya0VarM134341a.m200619c()) {
                return;
            }
            str = vya0VarM134341a.getCleanedKey();
            this.f186700c.mo97098e(new JSONObject().put(str, new JSONObject().put(profileCommand.getCommandString(), number)), false, m203596C(str, number, profileCommand.getOperation()));
        } catch (Throwable th) {
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Failed to update profile value for key " + str, th);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m203609m(ArrayList<String> arrayList, String str, ProfileCommand profileCommand) throws IOException {
        if (str == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(str, arrayList);
        a3f a3fVarMo216962a = this.f186707j.m147001i().mo216962a(map, this.f186708k);
        if (a3fVarMo216962a.m94690e()) {
            return;
        }
        try {
            m203613q(a3fVarMo216962a.getCleanedData().getJSONArray(str), str, profileCommand);
        } catch (JSONException e) {
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Failed to handle Multi Values for key".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m203610n(Map<String, Object> map) {
        try {
            a3f a3fVarMo216962a = this.f186707j.m146999g().mo216962a(map, this.f186708k);
            if (a3fVarMo216962a.m94690e()) {
                return;
            }
            JSONObject cleanedData = a3fVarMo216962a.getCleanedData();
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Constructed custom profile: " + cleanedData);
            this.f186700c.mo97098e(cleanedData, false, m203597D(cleanedData, ProfileOperation.UPDATE));
        } catch (Throwable th) {
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Failed to push profile", th);
        }
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
    @WorkerThread
    /* JADX INFO: renamed from: o */
    private void m203611o(HashMap<String, Object> map, ArrayList<HashMap<String, Object>> arrayList) {
        if (map == null || arrayList == null) {
            this.f186702e.getLogger().debug(this.f186702e.getAccountId(), "Invalid Charged event: details and or items is null");
            return;
        }
        if (this.f186707j.m146998f().m108477a(arrayList, this.f186708k).m113378b()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            a3f a3fVarMo216962a = this.f186707j.m146999g().mo216962a(map, this.f186708k);
            if (a3fVarMo216962a.m94690e()) {
                return;
            }
            JSONObject cleanedData = a3fVarMo216962a.getCleanedData();
            JSONArray jSONArray = new JSONArray();
            Iterator<HashMap<String, Object>> it = arrayList.iterator();
            while (it.hasNext()) {
                a3f a3fVarMo216962a2 = this.f186707j.m146999g().mo216962a(it.next(), this.f186708k);
                if (!a3fVarMo216962a2.m94690e()) {
                    jSONArray.put(a3fVarMo216962a2.getCleanedData());
                }
            }
            cleanedData.put(Constants.KEY_ITEMS, jSONArray);
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.CHARGED_EVENT);
            jSONObject.put(Constants.KEY_EVT_DATA, cleanedData);
            this.f186700c.mo97101h(this.f186703f, jSONObject, 4, m203616x(cleanedData));
        } catch (Throwable unused) {
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: p */
    private void m203612p(String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            d4f d4fVarM105215a = this.f186707j.m147000h().m105215a(str, this.f186708k);
            if (d4fVarM105215a.m109984c()) {
                return;
            }
            a3f a3fVarMo216962a = this.f186707j.m146999g().mo216962a(map, new crk0.C16228a().m108413o(this.f186708k).m108416r(Collections.EMPTY_SET).m108412n());
            if (a3fVarMo216962a.m94690e()) {
                return;
            }
            JSONObject cleanedData = a3fVarMo216962a.getCleanedData();
            ypi ypiVarM203616x = m203616x(cleanedData);
            jSONObject.put(Constants.KEY_EVT_NAME, d4fVarM105215a.getCleanedName());
            jSONObject.put(Constants.KEY_EVT_DATA, cleanedData);
            this.f186700c.mo97101h(this.f186703f, jSONObject, 4, ypiVarM203616x);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    private void m203613q(JSONArray jSONArray, String str, ProfileCommand profileCommand) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(profileCommand.getCommandString(), jSONArray);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, jSONObject);
            this.f186700c.mo97098e(jSONObject2, false, m203596C(str, jSONArray, profileCommand.getOperation()));
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Constructed multi-value profile push: " + jSONObject2);
        } catch (Throwable th) {
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Error pushing multiValue for key " + str, th);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m203614r(String str) {
        try {
            vya0 vya0VarM134341a = this.f186707j.m147002j().m134341a(str, this.f186708k);
            if (vya0VarM134341a.m200619c()) {
                return;
            }
            String cleanedKey = vya0VarM134341a.getCleanedKey();
            if (cleanedKey.toLowerCase().contains("identity")) {
                this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Cannot remove value for key " + cleanedKey + " from user profile");
                return;
            }
            ProfileCommand profileCommand = ProfileCommand.DELETE;
            this.f186700c.mo97098e(new JSONObject().put(cleanedKey, new JSONObject().put(profileCommand.getCommandString(), true)), true, m203596C(cleanedKey, Constants.DELETE_MARKER, profileCommand.getOperation()));
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "removing value for key " + cleanedKey + " from user profile");
        } catch (Throwable th) {
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Failed to remove profile value for key " + str, th);
        }
    }

    /* JADX INFO: renamed from: t */
    private boolean m203615t(String str, HashMap<String, Long> map, int i) {
        boolean z;
        synchronized (this.f186711n) {
            z = false;
            try {
                long jCurrentTimeMillis = this.f186709l.currentTimeMillis();
                if (map.containsKey(str) && jCurrentTimeMillis - map.get(str).longValue() < i) {
                    z = true;
                }
                map.put(str, Long.valueOf(jCurrentTimeMillis));
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: x */
    private ypi m203616x(JSONObject jSONObject) {
        return new ypi.C21467a(ppq.m170756a(jSONObject));
    }

    /* JADX INFO: renamed from: y */
    private void m203617y(final Bundle bundle) {
        this.f186710m.m190592d().m6946g("testInboxNotification", new Callable() { // from class: l.vk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203604h(this.f181757a, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    private void m203618z(Bundle bundle) {
        try {
            new h4e(this.f186702e, this.f186701d, this.f186704g).mo98525a(mv3.m156462a(bundle), null, this.f186703f);
        } catch (Throwable th) {
            Logger.m5876v("Failed to process Display Unit from push notification payload", th);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m203619A(final String str, final Number number) {
        this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "incrementValue: key=" + str + ", value=" + number);
        this.f186710m.m190592d().m6946g("incrementValue", new Callable() { // from class: l.rk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203607k(this.f159766a, number, str);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m203620E() {
        boolean zIsDisableAppLaunchedEvent = this.f186702e.isDisableAppLaunchedEvent();
        qs9 qs9Var = this.f186705h;
        if (zIsDisableAppLaunchedEvent) {
            qs9Var.m176186O(true);
            this.f186702e.getLogger().debug(this.f186702e.getAccountId(), "App Launched Events disabled in the Android Manifest file");
            return;
        }
        boolean zM176225y = qs9Var.m176225y();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f186702e;
        if (zM176225y) {
            cleverTapInstanceConfig.getLogger().verbose(this.f186702e.getAccountId(), "App Launched has already been triggered. Will not trigger it ");
            return;
        }
        cleverTapInstanceConfig.getLogger().verbose(this.f186702e.getAccountId(), "Firing App Launched event");
        this.f186705h.m176186O(true);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.APP_LAUNCHED_EVENT);
            jSONObject.put(Constants.KEY_EVT_DATA, this.f186706i.m133569u());
        } catch (Throwable unused) {
        }
        this.f186700c.mo97101h(this.f186703f, jSONObject, 4, new ypi.C21467a(Collections.EMPTY_MAP));
    }

    /* JADX INFO: renamed from: F */
    public void m203621F(final HashMap<String, Object> map, final ArrayList<HashMap<String, Object>> arrayList) {
        this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "pushChargedEvent: chargeDetails=" + map + ", items=" + arrayList);
        this.f186710m.m190592d().m6946g("pushChargedEvent", new Callable() { // from class: l.nk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203606j(this.f139366a, map, arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public synchronized void m203622G(Uri uri, boolean z) {
        if (uri == null) {
            return;
        }
        try {
            JSONObject jSONObjectM99194b = avj0.m99194b(uri);
            if (jSONObjectM99194b.has("us")) {
                this.f186705h.m176212j0(jSONObjectM99194b.get("us").toString());
            }
            if (jSONObjectM99194b.has("um")) {
                this.f186705h.m176206f0(jSONObjectM99194b.get("um").toString());
            }
            if (jSONObjectM99194b.has("uc")) {
                this.f186705h.m176188Q(jSONObjectM99194b.get("uc").toString());
            }
            jSONObjectM99194b.put("referrer", uri.toString());
            if (z) {
                jSONObjectM99194b.put("install", true);
            }
            m203630O(jSONObjectM99194b);
        } catch (Throwable th) {
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Failed to push deep link", th);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m203623H(final String str, final Map<String, Object> map) {
        this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "pushEvent: eventName=" + str + ", eventActions=" + map);
        this.f186710m.m190592d().m6946g("pushEvent", new Callable() { // from class: l.mk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203602f(this.f134271a, str, map);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public void m203624I(boolean z, CTInAppNotification cTInAppNotification, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectM156465d = mv3.m156465d(cTInAppNotification);
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        jSONObjectM156465d.put(str, obj);
                    }
                }
            }
            if (z) {
                try {
                    this.f186705h.m176214k0(jSONObjectM156465d);
                } catch (Throwable unused) {
                }
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_CLICKED_EVENT_NAME);
            } else {
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME);
            }
            jSONObject.put(Constants.KEY_EVT_DATA, jSONObjectM156465d);
            this.f186700c.mo97101h(this.f186703f, jSONObject, 4, m203616x(jSONObjectM156465d));
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: J */
    public void m203625J(boolean z, CTInboxMessage cTInboxMessage, Bundle bundle) {
        String strM6683e = cTInboxMessage.m6683e();
        if (!z && cTInboxMessage.m6688k() && m203595B(strM6683e)) {
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Inbox: Skipping Viewed for " + strM6683e + " — already read on another device (V2)");
            return;
        }
        x4f x4fVar = z ? this.f186715r : this.f186714q;
        if (strM6683e != null && x4fVar.m206973a(strM6683e)) {
            Logger logger = this.f186702e.getLogger();
            String accountId = this.f186702e.getAccountId();
            StringBuilder sb = new StringBuilder("Inbox: ");
            sb.append(z ? "Clicked" : "Viewed");
            sb.append(" suppressed for ");
            sb.append(strM6683e);
            logger.verbose(accountId, sb.toString());
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectM156466e = mv3.m156466e(cTInboxMessage);
            if (m203595B(strM6683e)) {
                jSONObjectM156466e.put(Constants.WZRK_MID, strM6683e);
            }
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        jSONObjectM156466e.put(str, obj);
                    }
                }
            }
            if (z) {
                try {
                    this.f186705h.m176214k0(jSONObjectM156466e);
                } catch (Throwable unused) {
                }
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_CLICKED_EVENT_NAME);
            } else {
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME);
            }
            jSONObject.put(Constants.KEY_EVT_DATA, jSONObjectM156466e);
            this.f186700c.mo97101h(this.f186703f, jSONObject, 4, m203616x(jSONObjectM156466e));
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: K */
    public void m203626K(String str) {
        try {
            this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Referrer received: " + str);
            if (str == null) {
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (this.f186699b.containsKey(str) && iCurrentTimeMillis - this.f186699b.get(str).intValue() < 10) {
                this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "Skipping install referrer due to duplicate within 10 seconds");
            } else {
                this.f186699b.put(str, Integer.valueOf(iCurrentTimeMillis));
                m203622G(Uri.parse("wzrk://track?install=true&".concat(str)), true);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: L */
    public void m203627L(Bundle bundle) {
        String string;
        if (this.f186702e.isAnalyticsOnly()) {
            this.f186702e.getLogger().debug(this.f186702e.getAccountId(), "is Analytics Only - will not process Notification Clicked event.");
            return;
        }
        if (bundle == null || bundle.isEmpty() || bundle.get(Constants.NOTIFICATION_TAG) == null) {
            this.f186702e.getLogger().debug(this.f186702e.getAccountId(), "Push notification not from CleverTap - will not process Notification Clicked event.");
            return;
        }
        try {
            string = bundle.getString(Constants.WZRK_ACCT_ID_KEY);
        } catch (Throwable unused) {
            string = null;
        }
        if ((string != null || !this.f186702e.isDefaultInstance()) && !this.f186702e.getAccountId().equals(string)) {
            this.f186702e.getLogger().debug(this.f186702e.getAccountId(), "Push notification not targeted at this instance, not processing Notification Clicked Event");
            return;
        }
        if (bundle.containsKey(Constants.INAPP_PREVIEW_PUSH_PAYLOAD_TYPE_KEY)) {
            this.f186713p.m160528d(bundle);
            return;
        }
        if (bundle.containsKey(Constants.INBOX_PREVIEW_PUSH_PAYLOAD_KEY)) {
            m203617y(bundle);
            return;
        }
        if (bundle.containsKey(Constants.DISPLAY_UNIT_PREVIEW_PUSH_PAYLOAD_KEY)) {
            m203618z(bundle);
            return;
        }
        if (!bundle.containsKey(Constants.NOTIFICATION_ID_TAG) || bundle.getString(Constants.NOTIFICATION_ID_TAG) == null) {
            this.f186702e.getLogger().debug(this.f186702e.getAccountId(), "Push notification ID Tag is null, not processing Notification Clicked event for:  " + bundle);
            return;
        }
        if (m203615t(m203639v(bundle), this.f186716s, 5000)) {
            this.f186702e.getLogger().debug(this.f186702e.getAccountId(), "Already processed Notification Clicked event for " + bundle + ", dropping duplicate.");
            return;
        }
        try {
            JSONObject jSONObjectM209766c = xk0.m209766c(bundle);
            this.f186700c.mo97101h(this.f186703f, xk0.m209764a(jSONObjectM209766c), 4, m203616x(jSONObjectM209766c));
            this.f186705h.m176214k0(jSONObjectM209766c);
        } catch (Throwable unused2) {
        }
        if (this.f186701d.mo100742p() != null) {
            this.f186701d.mo100742p().mo197393a(Utils.m5907d(bundle));
        } else {
            Logger.m5865d("CTPushNotificationListener is not set");
        }
    }

    /* JADX INFO: renamed from: M */
    public void m203628M(Bundle bundle) {
        if (bundle == null || bundle.isEmpty() || bundle.get(Constants.NOTIFICATION_TAG) == null) {
            Logger logger = this.f186702e.getLogger();
            String accountId = this.f186702e.getAccountId();
            StringBuilder sb = new StringBuilder("Push notification: ");
            sb.append(bundle == null ? "NULL" : bundle.toString());
            sb.append(" not from CleverTap - will not process Notification Viewed event.");
            logger.debug(accountId, sb.toString());
            return;
        }
        if (!bundle.containsKey(Constants.NOTIFICATION_ID_TAG) || bundle.getString(Constants.NOTIFICATION_ID_TAG) == null) {
            this.f186702e.getLogger().debug(this.f186702e.getAccountId(), "Push notification ID Tag is null, not processing Notification Viewed event for:  " + bundle);
            return;
        }
        boolean zM203615t = m203615t(m203639v(bundle), this.f186717t, 2000);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f186702e;
        if (zM203615t) {
            cleverTapInstanceConfig.getLogger().debug(this.f186702e.getAccountId(), "Already processed Notification Viewed event for " + bundle + ", dropping duplicate.");
            return;
        }
        cleverTapInstanceConfig.getLogger().debug("Recording Notification Viewed event for notification:  " + bundle);
        try {
            JSONObject jSONObjectM209766c = xk0.m209766c(bundle);
            this.f186700c.mo97101h(this.f186703f, xk0.m209765b(jSONObjectM209766c), 6, m203616x(jSONObjectM209766c));
        } catch (JSONException e) {
            this.f186702e.getLogger().debug("Failed to recording Notification Viewed " + e);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m203629N(final Map<String, Object> map) {
        this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "pushProfile: profile=" + map);
        if (map == null || map.isEmpty() || this.f186706i.m133539E() == null) {
            return;
        }
        this.f186710m.m190592d().m6946g("profilePush", new Callable() { // from class: l.pk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203598b(this.f149924a, map);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m203630O(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.getString(next));
                    } catch (ClassCastException unused) {
                    }
                }
            }
            this.f186700c.mo97100g(this.f186703f, jSONObject2, 1);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: P */
    public void m203631P(final String str, final ArrayList<String> arrayList) {
        this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "removeMultiValuesForKey: key=" + str + ", values=" + arrayList);
        this.f186710m.m190592d().m6946g("removeMultiValuesForKey", new Callable() { // from class: l.qk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203601e(this.f155017a, arrayList, str);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m203632Q(final String str) {
        this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "removeValueForKey: key=" + str);
        this.f186710m.m190592d().m6946g("removeValueForKey", new Callable() { // from class: l.ok0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203600d(this.f144389a, str);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m203633R(JSONObject jSONObject) {
        this.f186700c.mo97100g(this.f186703f, jSONObject, 5);
    }

    /* JADX INFO: renamed from: S */
    public void m203634S(JSONObject jSONObject) {
        this.f186700c.mo97100g(this.f186703f, jSONObject, 7);
    }

    /* JADX INFO: renamed from: T */
    public void m203635T(JSONObject jSONObject) {
        this.f186700c.mo97100g(this.f186703f, jSONObject, 2);
    }

    /* JADX INFO: renamed from: U */
    public void m203636U(final String str, final ArrayList<String> arrayList) {
        this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "setMultiValuesForKey: key=" + str + ", values=" + arrayList);
        this.f186710m.m190592d().m6946g("setMultiValuesForKey", new Callable() { // from class: l.sk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203603g(this.f164926a, arrayList, str);
            }
        });
    }

    @Override // p149l.pe2
    /* JADX INFO: renamed from: a */
    public void mo168499a() {
        if (this.f186702e.isAnalyticsOnly()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Constants.KEY_T, 1);
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.WZRK_FETCH);
            jSONObject.put(Constants.KEY_EVT_DATA, jSONObject2);
        } catch (JSONException unused) {
        }
        m203634S(jSONObject);
    }

    /* JADX INFO: renamed from: s */
    public void m203637s(final String str, final ArrayList<String> arrayList) {
        this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "addMultiValuesForKey: key=" + str + ", values=" + arrayList);
        this.f186710m.m190592d().m6946g("addMultiValuesForKey", new Callable() { // from class: l.uk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203599c(this.f176893a, arrayList, str);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m203638u(final String str, final Number number) {
        this.f186702e.getLogger().verbose(this.f186702e.getAccountId(), "decrementValue: key=" + str + ", value=" + number);
        this.f186710m.m190592d().m6946g("decrementValue", new Callable() { // from class: l.tk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wk0.m203605i(this.f170809a, number, str);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public String m203639v(Bundle bundle) {
        Object obj = bundle.get(Constants.WZRK_DEDUPE);
        boolean zEqualsIgnoreCase = false;
        if (obj != null) {
            zEqualsIgnoreCase = obj instanceof String ? "true".equalsIgnoreCase((String) obj) : false;
            if (obj instanceof Boolean) {
                zEqualsIgnoreCase = ((Boolean) obj).booleanValue();
            }
        }
        return zEqualsIgnoreCase ? bundle.getString(Constants.WZRK_PUSH_ID) : bundle.getString(Constants.NOTIFICATION_ID_TAG);
    }

    /* JADX INFO: renamed from: w */
    public void m203640w() {
        this.f186705h.m176186O(false);
        m203620E();
    }
}

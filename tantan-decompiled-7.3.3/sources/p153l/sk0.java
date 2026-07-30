package p153l;

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
public class sk0 extends xe2 {

    /* JADX INFO: renamed from: a */
    private final nw3 f169204a;

    /* JADX INFO: renamed from: c */
    private final ik2 f169206c;

    /* JADX INFO: renamed from: d */
    private final ch2 f169207d;

    /* JADX INFO: renamed from: e */
    private final CleverTapInstanceConfig f169208e;

    /* JADX INFO: renamed from: f */
    private final Context f169209f;

    /* JADX INFO: renamed from: g */
    private final w36 f169210g;

    /* JADX INFO: renamed from: h */
    private final bu9 f169211h;

    /* JADX INFO: renamed from: i */
    private final uzd f169212i;

    /* JADX INFO: renamed from: j */
    private final q0l0 f169213j;

    /* JADX INFO: renamed from: k */
    private final i0l0 f169214k;

    /* JADX INFO: renamed from: l */
    private final oa5 f169215l;

    /* JADX INFO: renamed from: m */
    private final su3 f169216m;

    /* JADX INFO: renamed from: o */
    private final duv f169218o;

    /* JADX INFO: renamed from: p */
    private final prm f169219p;

    /* JADX INFO: renamed from: b */
    private final HashMap<String, Integer> f169205b = new HashMap<>(8);

    /* JADX INFO: renamed from: n */
    private final Object f169217n = new Object();

    /* JADX INFO: renamed from: q */
    private final b6f f169220q = new b6f(2000);

    /* JADX INFO: renamed from: r */
    private final b6f f169221r = new b6f(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);

    /* JADX INFO: renamed from: s */
    private final HashMap<String, Long> f169222s = new HashMap<>();

    /* JADX INFO: renamed from: t */
    private final HashMap<String, Long> f169223t = new HashMap<>();

    public sk0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, ik2 ik2Var, q0l0 q0l0Var, i0l0 i0l0Var, bu9 bu9Var, uzd uzdVar, ch2 ch2Var, w36 w36Var, nw3 nw3Var, oa5 oa5Var, su3 su3Var, duv duvVar, prm prmVar) {
        this.f169209f = context;
        this.f169208e = cleverTapInstanceConfig;
        this.f169206c = ik2Var;
        this.f169213j = q0l0Var;
        this.f169214k = i0l0Var;
        this.f169211h = bu9Var;
        this.f169212i = uzdVar;
        this.f169207d = ch2Var;
        this.f169204a = nw3Var;
        this.f169210g = w36Var;
        this.f169215l = oa5Var;
        this.f169216m = su3Var;
        this.f169218o = duvVar;
        this.f169219p = prmVar;
    }

    /* JADX INFO: renamed from: B */
    private boolean m186351B(String str) {
        ew3 ew3VarM204742e;
        return (str == null || (ew3VarM204742e = this.f169210g.m204742e()) == null || !ew3VarM204742e.m122878n(str)) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    private usi.C20660c m186352C(String str, Object obj, ProfileOperation profileOperation) {
        return new usi.C20660c(this.f169218o.m118207D(str, obj, profileOperation));
    }

    /* JADX INFO: renamed from: D */
    private usi.C20660c m186353D(JSONObject jSONObject, ProfileOperation profileOperation) {
        return new usi.C20660c(this.f169218o.m118208E(jSONObject, profileOperation));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m186354b(sk0 sk0Var, Map map) {
        sk0Var.m186366n(map);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m186355c(sk0 sk0Var, ArrayList arrayList, String str) throws IOException {
        sk0Var.getClass();
        sk0Var.m186365m(arrayList, str, ProfileCommand.ADD);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m186356d(sk0 sk0Var, String str) {
        sk0Var.m186370r(str);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Void m186357e(sk0 sk0Var, ArrayList arrayList, String str) throws IOException {
        sk0Var.getClass();
        sk0Var.m186365m(arrayList, str, ProfileCommand.REMOVE);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Void m186358f(sk0 sk0Var, String str, Map map) {
        sk0Var.m186368p(str, map);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Void m186359g(sk0 sk0Var, ArrayList arrayList, String str) throws IOException {
        sk0Var.getClass();
        sk0Var.m186365m(arrayList, str, ProfileCommand.SET);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Void m186360h(sk0 sk0Var, Bundle bundle) {
        sk0Var.getClass();
        try {
            Logger.m5927v("Received inbox via push payload: " + bundle.getString(Constants.INBOX_PREVIEW_PUSH_PAYLOAD_KEY));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(Constants.INBOX_JSON_RESPONSE_KEY, jSONArray);
            JSONObject jSONObject2 = new JSONObject(bundle.getString(Constants.INBOX_PREVIEW_PUSH_PAYLOAD_KEY));
            jSONObject2.put("_id", String.valueOf(System.currentTimeMillis() / 1000));
            jSONArray.put(jSONObject2);
            new ctm(sk0Var.f169208e, sk0Var.f169204a, sk0Var.f169207d, sk0Var.f169210g).mo98656a(jSONObject, null, sk0Var.f169209f);
            return null;
        } catch (Throwable th) {
            Logger.m5930v("Failed to process inbox message from push notification payload", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Void m186361i(sk0 sk0Var, Number number, String str) {
        sk0Var.getClass();
        sk0Var.m186364l(number, str, ProfileCommand.DECREMENT);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Void m186362j(sk0 sk0Var, HashMap map, ArrayList arrayList) {
        sk0Var.m186367o(map, arrayList);
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Void m186363k(sk0 sk0Var, Number number, String str) {
        sk0Var.getClass();
        sk0Var.m186364l(number, str, ProfileCommand.INCREMENT);
        return null;
    }

    /* JADX INFO: renamed from: l */
    private void m186364l(Number number, String str, ProfileCommand profileCommand) {
        if (number == null) {
            return;
        }
        try {
            z6b0 z6b0VarM157104a = this.f169213j.m174725j().m157104a(str, this.f169214k);
            if (z6b0VarM157104a.m218777c()) {
                return;
            }
            str = z6b0VarM157104a.getCleanedKey();
            this.f169206c.mo140247e(new JSONObject().put(str, new JSONObject().put(profileCommand.getCommandString(), number)), false, m186352C(str, number, profileCommand.getOperation()));
        } catch (Throwable th) {
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Failed to update profile value for key " + str, th);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m186365m(ArrayList<String> arrayList, String str, ProfileCommand profileCommand) throws IOException {
        if (str == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(str, arrayList);
        f4f f4fVarMo119416a = this.f169213j.m174724i().mo119416a(map, this.f169214k);
        if (f4fVarMo119416a.m123986e()) {
            return;
        }
        try {
            m186369q(f4fVarMo119416a.getCleanedData().getJSONArray(str), str, profileCommand);
        } catch (JSONException e) {
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Failed to handle Multi Values for key".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m186366n(Map<String, Object> map) {
        try {
            f4f f4fVarMo119416a = this.f169213j.m174722g().mo119416a(map, this.f169214k);
            if (f4fVarMo119416a.m123986e()) {
                return;
            }
            JSONObject cleanedData = f4fVarMo119416a.getCleanedData();
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Constructed custom profile: " + cleanedData);
            this.f169206c.mo140247e(cleanedData, false, m186353D(cleanedData, ProfileOperation.UPDATE));
        } catch (Throwable th) {
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Failed to push profile", th);
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
    private void m186367o(HashMap<String, Object> map, ArrayList<HashMap<String, Object>> arrayList) {
        if (map == null || arrayList == null) {
            this.f169208e.getLogger().debug(this.f169208e.getAccountId(), "Invalid Charged event: details and or items is null");
            return;
        }
        if (this.f169213j.m174721f().m106319a(arrayList, this.f169214k).m112443b()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            f4f f4fVarMo119416a = this.f169213j.m174722g().mo119416a(map, this.f169214k);
            if (f4fVarMo119416a.m123986e()) {
                return;
            }
            JSONObject cleanedData = f4fVarMo119416a.getCleanedData();
            JSONArray jSONArray = new JSONArray();
            Iterator<HashMap<String, Object>> it = arrayList.iterator();
            while (it.hasNext()) {
                f4f f4fVarMo119416a2 = this.f169213j.m174722g().mo119416a(it.next(), this.f169214k);
                if (!f4fVarMo119416a2.m123986e()) {
                    jSONArray.put(f4fVarMo119416a2.getCleanedData());
                }
            }
            cleanedData.put(Constants.KEY_ITEMS, jSONArray);
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.CHARGED_EVENT);
            jSONObject.put(Constants.KEY_EVT_DATA, cleanedData);
            this.f169206c.mo140250h(this.f169209f, jSONObject, 4, m186372x(cleanedData));
        } catch (Throwable unused) {
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: p */
    private void m186368p(String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            h5f h5fVarM129049a = this.f169213j.m174723h().m129049a(str, this.f169214k);
            if (h5fVarM129049a.m133656c()) {
                return;
            }
            f4f f4fVarMo119416a = this.f169213j.m174722g().mo119416a(map, new i0l0.C17611a().m138011o(this.f169214k).m138014r(Collections.EMPTY_SET).m138010n());
            if (f4fVarMo119416a.m123986e()) {
                return;
            }
            JSONObject cleanedData = f4fVarMo119416a.getCleanedData();
            usi usiVarM186372x = m186372x(cleanedData);
            jSONObject.put(Constants.KEY_EVT_NAME, h5fVarM129049a.getCleanedName());
            jSONObject.put(Constants.KEY_EVT_DATA, cleanedData);
            this.f169206c.mo140250h(this.f169209f, jSONObject, 4, usiVarM186372x);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    private void m186369q(JSONArray jSONArray, String str, ProfileCommand profileCommand) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(profileCommand.getCommandString(), jSONArray);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, jSONObject);
            this.f169206c.mo140247e(jSONObject2, false, m186352C(str, jSONArray, profileCommand.getOperation()));
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Constructed multi-value profile push: " + jSONObject2);
        } catch (Throwable th) {
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Error pushing multiValue for key " + str, th);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m186370r(String str) {
        try {
            z6b0 z6b0VarM157104a = this.f169213j.m174725j().m157104a(str, this.f169214k);
            if (z6b0VarM157104a.m218777c()) {
                return;
            }
            String cleanedKey = z6b0VarM157104a.getCleanedKey();
            if (cleanedKey.toLowerCase().contains("identity")) {
                this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Cannot remove value for key " + cleanedKey + " from user profile");
                return;
            }
            ProfileCommand profileCommand = ProfileCommand.DELETE;
            this.f169206c.mo140247e(new JSONObject().put(cleanedKey, new JSONObject().put(profileCommand.getCommandString(), true)), true, m186352C(cleanedKey, Constants.DELETE_MARKER, profileCommand.getOperation()));
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "removing value for key " + cleanedKey + " from user profile");
        } catch (Throwable th) {
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Failed to remove profile value for key " + str, th);
        }
    }

    /* JADX INFO: renamed from: t */
    private boolean m186371t(String str, HashMap<String, Long> map, int i) {
        boolean z;
        synchronized (this.f169217n) {
            z = false;
            try {
                long jCurrentTimeMillis = this.f169215l.currentTimeMillis();
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
    private usi m186372x(JSONObject jSONObject) {
        return new usi.C20658a(prq.m173540a(jSONObject));
    }

    /* JADX INFO: renamed from: y */
    private void m186373y(final Bundle bundle) {
        this.f169216m.m187990d().m7000g("testInboxNotification", new Callable() { // from class: l.rk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186360h(this.f163532a, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    private void m186374z(Bundle bundle) {
        try {
            new v5e(this.f169208e, this.f169207d, this.f169210g).mo98656a(lw3.m156020a(bundle), null, this.f169209f);
        } catch (Throwable th) {
            Logger.m5930v("Failed to process Display Unit from push notification payload", th);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m186375A(final String str, final Number number) {
        this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "incrementValue: key=" + str + ", value=" + number);
        this.f169216m.m187990d().m7000g("incrementValue", new Callable() { // from class: l.nk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186363k(this.f142371a, number, str);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m186376E() {
        boolean zIsDisableAppLaunchedEvent = this.f169208e.isDisableAppLaunchedEvent();
        bu9 bu9Var = this.f169211h;
        if (zIsDisableAppLaunchedEvent) {
            bu9Var.m106453O(true);
            this.f169208e.getLogger().debug(this.f169208e.getAccountId(), "App Launched Events disabled in the Android Manifest file");
            return;
        }
        boolean zM106492y = bu9Var.m106492y();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f169208e;
        if (zM106492y) {
            cleverTapInstanceConfig.getLogger().verbose(this.f169208e.getAccountId(), "App Launched has already been triggered. Will not trigger it ");
            return;
        }
        cleverTapInstanceConfig.getLogger().verbose(this.f169208e.getAccountId(), "Firing App Launched event");
        this.f169211h.m106453O(true);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.APP_LAUNCHED_EVENT);
            jSONObject.put(Constants.KEY_EVT_DATA, this.f169212i.m198792u());
        } catch (Throwable unused) {
        }
        this.f169206c.mo140250h(this.f169209f, jSONObject, 4, new usi.C20658a(Collections.EMPTY_MAP));
    }

    /* JADX INFO: renamed from: F */
    public void m186377F(final HashMap<String, Object> map, final ArrayList<HashMap<String, Object>> arrayList) {
        this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "pushChargedEvent: chargeDetails=" + map + ", items=" + arrayList);
        this.f169216m.m187990d().m7000g("pushChargedEvent", new Callable() { // from class: l.jk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186362j(this.f121255a, map, arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public synchronized void m186378G(Uri uri, boolean z) {
        if (uri == null) {
            return;
        }
        try {
            JSONObject jSONObjectM114207b = d4k0.m114207b(uri);
            if (jSONObjectM114207b.has("us")) {
                this.f169211h.m106479j0(jSONObjectM114207b.get("us").toString());
            }
            if (jSONObjectM114207b.has("um")) {
                this.f169211h.m106473f0(jSONObjectM114207b.get("um").toString());
            }
            if (jSONObjectM114207b.has("uc")) {
                this.f169211h.m106455Q(jSONObjectM114207b.get("uc").toString());
            }
            jSONObjectM114207b.put("referrer", uri.toString());
            if (z) {
                jSONObjectM114207b.put("install", true);
            }
            m186386O(jSONObjectM114207b);
        } catch (Throwable th) {
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Failed to push deep link", th);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m186379H(final String str, final Map<String, Object> map) {
        this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "pushEvent: eventName=" + str + ", eventActions=" + map);
        this.f169216m.m187990d().m7000g("pushEvent", new Callable() { // from class: l.ik0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186358f(this.f115313a, str, map);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public void m186380I(boolean z, CTInAppNotification cTInAppNotification, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectM156023d = lw3.m156023d(cTInAppNotification);
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        jSONObjectM156023d.put(str, obj);
                    }
                }
            }
            if (z) {
                try {
                    this.f169211h.m106481k0(jSONObjectM156023d);
                } catch (Throwable unused) {
                }
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_CLICKED_EVENT_NAME);
            } else {
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME);
            }
            jSONObject.put(Constants.KEY_EVT_DATA, jSONObjectM156023d);
            this.f169206c.mo140250h(this.f169209f, jSONObject, 4, m186372x(jSONObjectM156023d));
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: J */
    public void m186381J(boolean z, CTInboxMessage cTInboxMessage, Bundle bundle) {
        String strM6737e = cTInboxMessage.m6737e();
        if (!z && cTInboxMessage.m6742k() && m186351B(strM6737e)) {
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Inbox: Skipping Viewed for " + strM6737e + " — already read on another device (V2)");
            return;
        }
        b6f b6fVar = z ? this.f169221r : this.f169220q;
        if (strM6737e != null && b6fVar.m102735a(strM6737e)) {
            Logger logger = this.f169208e.getLogger();
            String accountId = this.f169208e.getAccountId();
            StringBuilder sb = new StringBuilder("Inbox: ");
            sb.append(z ? "Clicked" : "Viewed");
            sb.append(" suppressed for ");
            sb.append(strM6737e);
            logger.verbose(accountId, sb.toString());
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectM156024e = lw3.m156024e(cTInboxMessage);
            if (m186351B(strM6737e)) {
                jSONObjectM156024e.put(Constants.WZRK_MID, strM6737e);
            }
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        jSONObjectM156024e.put(str, obj);
                    }
                }
            }
            if (z) {
                try {
                    this.f169211h.m106481k0(jSONObjectM156024e);
                } catch (Throwable unused) {
                }
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_CLICKED_EVENT_NAME);
            } else {
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME);
            }
            jSONObject.put(Constants.KEY_EVT_DATA, jSONObjectM156024e);
            this.f169206c.mo140250h(this.f169209f, jSONObject, 4, m186372x(jSONObjectM156024e));
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: K */
    public void m186382K(String str) {
        try {
            this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Referrer received: " + str);
            if (str == null) {
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (this.f169205b.containsKey(str) && iCurrentTimeMillis - this.f169205b.get(str).intValue() < 10) {
                this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "Skipping install referrer due to duplicate within 10 seconds");
            } else {
                this.f169205b.put(str, Integer.valueOf(iCurrentTimeMillis));
                m186378G(Uri.parse("wzrk://track?install=true&".concat(str)), true);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: L */
    public void m186383L(Bundle bundle) {
        String string;
        if (this.f169208e.isAnalyticsOnly()) {
            this.f169208e.getLogger().debug(this.f169208e.getAccountId(), "is Analytics Only - will not process Notification Clicked event.");
            return;
        }
        if (bundle == null || bundle.isEmpty() || bundle.get(Constants.NOTIFICATION_TAG) == null) {
            this.f169208e.getLogger().debug(this.f169208e.getAccountId(), "Push notification not from CleverTap - will not process Notification Clicked event.");
            return;
        }
        try {
            string = bundle.getString(Constants.WZRK_ACCT_ID_KEY);
        } catch (Throwable unused) {
            string = null;
        }
        if ((string != null || !this.f169208e.isDefaultInstance()) && !this.f169208e.getAccountId().equals(string)) {
            this.f169208e.getLogger().debug(this.f169208e.getAccountId(), "Push notification not targeted at this instance, not processing Notification Clicked Event");
            return;
        }
        if (bundle.containsKey(Constants.INAPP_PREVIEW_PUSH_PAYLOAD_TYPE_KEY)) {
            this.f169219p.m173504d(bundle);
            return;
        }
        if (bundle.containsKey(Constants.INBOX_PREVIEW_PUSH_PAYLOAD_KEY)) {
            m186373y(bundle);
            return;
        }
        if (bundle.containsKey(Constants.DISPLAY_UNIT_PREVIEW_PUSH_PAYLOAD_KEY)) {
            m186374z(bundle);
            return;
        }
        if (!bundle.containsKey(Constants.NOTIFICATION_ID_TAG) || bundle.getString(Constants.NOTIFICATION_ID_TAG) == null) {
            this.f169208e.getLogger().debug(this.f169208e.getAccountId(), "Push notification ID Tag is null, not processing Notification Clicked event for:  " + bundle);
            return;
        }
        if (m186371t(m186396v(bundle), this.f169222s, 5000)) {
            this.f169208e.getLogger().debug(this.f169208e.getAccountId(), "Already processed Notification Clicked event for " + bundle + ", dropping duplicate.");
            return;
        }
        try {
            JSONObject jSONObjectM191473c = tk0.m191473c(bundle);
            this.f169206c.mo140250h(this.f169209f, tk0.m191471a(jSONObjectM191473c), 4, m186372x(jSONObjectM191473c));
            this.f169211h.m106481k0(jSONObjectM191473c);
        } catch (Throwable unused2) {
        }
        if (this.f169207d.mo96522p() != null) {
            this.f169207d.mo96522p().mo205558a(Utils.m5961d(bundle));
        } else {
            Logger.m5919d("CTPushNotificationListener is not set");
        }
    }

    /* JADX INFO: renamed from: M */
    public void m186384M(Bundle bundle) {
        if (bundle == null || bundle.isEmpty() || bundle.get(Constants.NOTIFICATION_TAG) == null) {
            Logger logger = this.f169208e.getLogger();
            String accountId = this.f169208e.getAccountId();
            StringBuilder sb = new StringBuilder("Push notification: ");
            sb.append(bundle == null ? "NULL" : bundle.toString());
            sb.append(" not from CleverTap - will not process Notification Viewed event.");
            logger.debug(accountId, sb.toString());
            return;
        }
        if (!bundle.containsKey(Constants.NOTIFICATION_ID_TAG) || bundle.getString(Constants.NOTIFICATION_ID_TAG) == null) {
            this.f169208e.getLogger().debug(this.f169208e.getAccountId(), "Push notification ID Tag is null, not processing Notification Viewed event for:  " + bundle);
            return;
        }
        boolean zM186371t = m186371t(m186396v(bundle), this.f169223t, 2000);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f169208e;
        if (zM186371t) {
            cleverTapInstanceConfig.getLogger().debug(this.f169208e.getAccountId(), "Already processed Notification Viewed event for " + bundle + ", dropping duplicate.");
            return;
        }
        cleverTapInstanceConfig.getLogger().debug("Recording Notification Viewed event for notification:  " + bundle);
        try {
            JSONObject jSONObjectM191473c = tk0.m191473c(bundle);
            this.f169206c.mo140250h(this.f169209f, tk0.m191472b(jSONObjectM191473c), 6, m186372x(jSONObjectM191473c));
        } catch (JSONException e) {
            this.f169208e.getLogger().debug("Failed to recording Notification Viewed " + e);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m186385N(final Map<String, Object> map) {
        this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "pushProfile: profile=" + map);
        if (map == null || map.isEmpty() || this.f169212i.m198762E() == null) {
            return;
        }
        this.f169216m.m187990d().m7000g("profilePush", new Callable() { // from class: l.lk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186354b(this.f132424a, map);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m186386O(JSONObject jSONObject) {
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
            this.f169206c.mo140249g(this.f169209f, jSONObject2, 1);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: P */
    public void m186387P(final String str, final ArrayList<String> arrayList) {
        this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "removeMultiValuesForKey: key=" + str + ", values=" + arrayList);
        this.f169216m.m187990d().m7000g("removeMultiValuesForKey", new Callable() { // from class: l.mk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186357e(this.f137187a, arrayList, str);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m186388Q(final String str) {
        this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "removeValueForKey: key=" + str);
        this.f169216m.m187990d().m7000g("removeValueForKey", new Callable() { // from class: l.kk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186356d(this.f127156a, str);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m186389R(JSONObject jSONObject) {
        this.f169206c.mo140249g(this.f169209f, jSONObject, 5);
    }

    /* JADX INFO: renamed from: S */
    public void m186390S(JSONObject jSONObject) {
        this.f169206c.mo140249g(this.f169209f, jSONObject, 7);
    }

    /* JADX INFO: renamed from: T */
    public void m186391T(JSONObject jSONObject) {
        this.f169206c.mo140249g(this.f169209f, jSONObject, 2);
    }

    /* JADX INFO: renamed from: U */
    public void m186392U(final String str, final ArrayList<String> arrayList) {
        this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "setMultiValuesForKey: key=" + str + ", values=" + arrayList);
        this.f169216m.m187990d().m7000g("setMultiValuesForKey", new Callable() { // from class: l.ok0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186359g(this.f147728a, arrayList, str);
            }
        });
    }

    @Override // p153l.xe2
    /* JADX INFO: renamed from: a */
    public void mo186393a() {
        if (this.f169208e.isAnalyticsOnly()) {
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
        m186390S(jSONObject);
    }

    /* JADX INFO: renamed from: s */
    public void m186394s(final String str, final ArrayList<String> arrayList) {
        this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "addMultiValuesForKey: key=" + str + ", values=" + arrayList);
        this.f169216m.m187990d().m7000g("addMultiValuesForKey", new Callable() { // from class: l.qk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186355c(this.f158069a, arrayList, str);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m186395u(final String str, final Number number) {
        this.f169208e.getLogger().verbose(this.f169208e.getAccountId(), "decrementValue: key=" + str + ", value=" + number);
        this.f169216m.m187990d().m7000g("decrementValue", new Callable() { // from class: l.pk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sk0.m186361i(this.f152765a, number, str);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public String m186396v(Bundle bundle) {
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
    public void m186397w() {
        this.f169211h.m106453O(false);
        m186376E();
    }
}

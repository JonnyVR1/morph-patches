package p149l;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.clevertap.android.sdk.inbox.InboxMessageSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class pv3 {

    /* JADX INFO: renamed from: a */
    private String f151384a;

    /* JADX INFO: renamed from: b */
    private long f151385b;

    /* JADX INFO: renamed from: c */
    private long f151386c;

    /* JADX INFO: renamed from: d */
    private String f151387d;

    /* JADX INFO: renamed from: e */
    private JSONObject f151388e;

    /* JADX INFO: renamed from: f */
    private boolean f151389f;

    /* JADX INFO: renamed from: g */
    private List<String> f151390g;

    /* JADX INFO: renamed from: h */
    private String f151391h;

    /* JADX INFO: renamed from: i */
    private JSONObject f151392i;

    /* JADX INFO: renamed from: j */
    private InboxMessageSource f151393j;

    /* JADX INFO: renamed from: k */
    private String f151394k;

    private pv3(String str, JSONObject jSONObject, boolean z, long j, long j2, String str2, List<String> list, String str3, JSONObject jSONObject2, InboxMessageSource inboxMessageSource) {
        new ArrayList();
        this.f151394k = "PENDING_INDEXING";
        this.f151387d = str;
        this.f151388e = jSONObject;
        this.f151389f = z;
        this.f151385b = j;
        this.f151386c = j2;
        this.f151391h = str2;
        this.f151390g = list;
        this.f151384a = str3;
        this.f151392i = jSONObject2;
        this.f151393j = inboxMessageSource;
    }

    /* JADX INFO: renamed from: k */
    private static JSONObject m171496k(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.startsWith(Constants.WZRK_PREFIX)) {
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: m */
    public static pv3 m171497m(JSONObject jSONObject, String str, InboxMessageSource inboxMessageSource) {
        try {
            String string = jSONObject.has("_id") ? jSONObject.getString("_id") : null;
            long j = jSONObject.has("date") ? jSONObject.getInt("date") : System.currentTimeMillis() / 1000;
            long j2 = jSONObject.has("wzrk_ttl") ? jSONObject.getInt("wzrk_ttl") : (System.currentTimeMillis() + 86400000) / 1000;
            JSONObject jSONObject2 = jSONObject.has("msg") ? jSONObject.getJSONObject("msg") : null;
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null) {
                JSONArray jSONArray = jSONObject2.has("tags") ? jSONObject2.getJSONArray("tags") : null;
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                }
            }
            String string2 = jSONObject.has(Constants.NOTIFICATION_ID_TAG) ? jSONObject.getString(Constants.NOTIFICATION_ID_TAG) : Constants.TEST_IDENTIFIER;
            if (string2.equalsIgnoreCase(Constants.TEST_IDENTIFIER)) {
                jSONObject.put(Constants.NOTIFICATION_ID_TAG, string2);
            }
            JSONObject jSONObjectM171496k = m171496k(jSONObject);
            boolean zOptBoolean = jSONObject.optBoolean("isRead", false);
            if (string == null) {
                return null;
            }
            return new pv3(string, jSONObject2, zOptBoolean, j, j2, str, arrayList, string2, jSONObjectM171496k, inboxMessageSource);
        } catch (JSONException e) {
            Logger.m5865d("Unable to parse Notification inbox message to CTMessageDao - " + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m171498a() {
        Logger.m5865d("CTMessageDAO:containsVideoOrAudio() called");
        CTInboxMessageContent cTInboxMessageContent = new CTInboxMessage(m171521z()).m6682d().get(0);
        return cTInboxMessageContent.m6693B() || cTInboxMessageContent.m6715x();
    }

    /* JADX INFO: renamed from: b */
    public String m171499b() {
        return this.f151384a;
    }

    /* JADX INFO: renamed from: c */
    public long m171500c() {
        return this.f151385b;
    }

    /* JADX INFO: renamed from: d */
    public long m171501d() {
        return this.f151386c;
    }

    /* JADX INFO: renamed from: e */
    public String m171502e() {
        return this.f151387d;
    }

    /* JADX INFO: renamed from: f */
    public String m171503f() {
        return this.f151394k;
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m171504g() {
        return this.f151388e;
    }

    /* JADX INFO: renamed from: h */
    public InboxMessageSource m171505h() {
        return this.f151393j;
    }

    /* JADX INFO: renamed from: i */
    public String m171506i() {
        return TextUtils.join(Constants.SEPARATOR_COMMA, this.f151390g);
    }

    /* JADX INFO: renamed from: j */
    public String m171507j() {
        return this.f151391h;
    }

    /* JADX INFO: renamed from: l */
    public JSONObject m171508l() {
        return this.f151392i;
    }

    /* JADX INFO: renamed from: n */
    public int m171509n() {
        return this.f151389f ? 1 : 0;
    }

    /* JADX INFO: renamed from: o */
    public void m171510o(String str) {
        this.f151384a = str;
    }

    /* JADX INFO: renamed from: p */
    public void m171511p(long j) {
        this.f151385b = j;
    }

    /* JADX INFO: renamed from: q */
    public void m171512q(long j) {
        this.f151386c = j;
    }

    /* JADX INFO: renamed from: r */
    public void m171513r(String str) {
        this.f151387d = str;
    }

    /* JADX INFO: renamed from: s */
    public void m171514s(String str) {
        this.f151394k = str;
    }

    /* JADX INFO: renamed from: t */
    public void m171515t(JSONObject jSONObject) {
        this.f151388e = jSONObject;
    }

    /* JADX INFO: renamed from: u */
    public void m171516u(int i) {
        this.f151389f = i == 1;
    }

    /* JADX INFO: renamed from: v */
    public void m171517v(InboxMessageSource inboxMessageSource) {
        this.f151393j = inboxMessageSource;
    }

    /* JADX INFO: renamed from: w */
    public void m171518w(String str) {
        this.f151390g.addAll(Arrays.asList(str.split(Constants.SEPARATOR_COMMA)));
    }

    /* JADX INFO: renamed from: x */
    public void m171519x(String str) {
        this.f151391h = str;
    }

    /* JADX INFO: renamed from: y */
    public void m171520y(JSONObject jSONObject) {
        this.f151392i = jSONObject;
    }

    /* JADX INFO: renamed from: z */
    public JSONObject m171521z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f151387d);
            jSONObject.put("msg", this.f151388e);
            jSONObject.put("isRead", this.f151389f);
            jSONObject.put("date", this.f151385b);
            jSONObject.put("wzrk_ttl", this.f151386c);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f151390g.size(); i++) {
                jSONArray.put(this.f151390g.get(i));
            }
            jSONObject.put("tags", jSONArray);
            jSONObject.put(Constants.NOTIFICATION_ID_TAG, this.f151384a);
            jSONObject.put(Constants.KEY_WZRK_PARAMS, this.f151392i);
            return jSONObject;
        } catch (JSONException e) {
            Logger.m5873v("Unable to convert CTMessageDao to JSON - " + e.getLocalizedMessage());
            return jSONObject;
        }
    }

    public pv3() {
        this.f151390g = new ArrayList();
        this.f151394k = "PENDING_INDEXING";
    }
}

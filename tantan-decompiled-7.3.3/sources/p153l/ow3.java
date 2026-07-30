package p153l;

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
public class ow3 {

    /* JADX INFO: renamed from: a */
    private String f149420a;

    /* JADX INFO: renamed from: b */
    private long f149421b;

    /* JADX INFO: renamed from: c */
    private long f149422c;

    /* JADX INFO: renamed from: d */
    private String f149423d;

    /* JADX INFO: renamed from: e */
    private JSONObject f149424e;

    /* JADX INFO: renamed from: f */
    private boolean f149425f;

    /* JADX INFO: renamed from: g */
    private List<String> f149426g;

    /* JADX INFO: renamed from: h */
    private String f149427h;

    /* JADX INFO: renamed from: i */
    private JSONObject f149428i;

    /* JADX INFO: renamed from: j */
    private InboxMessageSource f149429j;

    /* JADX INFO: renamed from: k */
    private String f149430k;

    private ow3(String str, JSONObject jSONObject, boolean z, long j, long j2, String str2, List<String> list, String str3, JSONObject jSONObject2, InboxMessageSource inboxMessageSource) {
        new ArrayList();
        this.f149430k = "PENDING_INDEXING";
        this.f149423d = str;
        this.f149424e = jSONObject;
        this.f149425f = z;
        this.f149421b = j;
        this.f149422c = j2;
        this.f149427h = str2;
        this.f149426g = list;
        this.f149420a = str3;
        this.f149428i = jSONObject2;
        this.f149429j = inboxMessageSource;
    }

    /* JADX INFO: renamed from: k */
    private static JSONObject m169490k(JSONObject jSONObject) throws JSONException {
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
    public static ow3 m169491m(JSONObject jSONObject, String str, InboxMessageSource inboxMessageSource) {
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
            JSONObject jSONObjectM169490k = m169490k(jSONObject);
            boolean zOptBoolean = jSONObject.optBoolean("isRead", false);
            if (string == null) {
                return null;
            }
            return new ow3(string, jSONObject2, zOptBoolean, j, j2, str, arrayList, string2, jSONObjectM169490k, inboxMessageSource);
        } catch (JSONException e) {
            Logger.m5919d("Unable to parse Notification inbox message to CTMessageDao - " + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m169492a() {
        Logger.m5919d("CTMessageDAO:containsVideoOrAudio() called");
        CTInboxMessageContent cTInboxMessageContent = new CTInboxMessage(m169515z()).m6736d().get(0);
        return cTInboxMessageContent.m6747B() || cTInboxMessageContent.m6769x();
    }

    /* JADX INFO: renamed from: b */
    public String m169493b() {
        return this.f149420a;
    }

    /* JADX INFO: renamed from: c */
    public long m169494c() {
        return this.f149421b;
    }

    /* JADX INFO: renamed from: d */
    public long m169495d() {
        return this.f149422c;
    }

    /* JADX INFO: renamed from: e */
    public String m169496e() {
        return this.f149423d;
    }

    /* JADX INFO: renamed from: f */
    public String m169497f() {
        return this.f149430k;
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m169498g() {
        return this.f149424e;
    }

    /* JADX INFO: renamed from: h */
    public InboxMessageSource m169499h() {
        return this.f149429j;
    }

    /* JADX INFO: renamed from: i */
    public String m169500i() {
        return TextUtils.join(Constants.SEPARATOR_COMMA, this.f149426g);
    }

    /* JADX INFO: renamed from: j */
    public String m169501j() {
        return this.f149427h;
    }

    /* JADX INFO: renamed from: l */
    public JSONObject m169502l() {
        return this.f149428i;
    }

    /* JADX INFO: renamed from: n */
    public int m169503n() {
        return this.f149425f ? 1 : 0;
    }

    /* JADX INFO: renamed from: o */
    public void m169504o(String str) {
        this.f149420a = str;
    }

    /* JADX INFO: renamed from: p */
    public void m169505p(long j) {
        this.f149421b = j;
    }

    /* JADX INFO: renamed from: q */
    public void m169506q(long j) {
        this.f149422c = j;
    }

    /* JADX INFO: renamed from: r */
    public void m169507r(String str) {
        this.f149423d = str;
    }

    /* JADX INFO: renamed from: s */
    public void m169508s(String str) {
        this.f149430k = str;
    }

    /* JADX INFO: renamed from: t */
    public void m169509t(JSONObject jSONObject) {
        this.f149424e = jSONObject;
    }

    /* JADX INFO: renamed from: u */
    public void m169510u(int i) {
        this.f149425f = i == 1;
    }

    /* JADX INFO: renamed from: v */
    public void m169511v(InboxMessageSource inboxMessageSource) {
        this.f149429j = inboxMessageSource;
    }

    /* JADX INFO: renamed from: w */
    public void m169512w(String str) {
        this.f149426g.addAll(Arrays.asList(str.split(Constants.SEPARATOR_COMMA)));
    }

    /* JADX INFO: renamed from: x */
    public void m169513x(String str) {
        this.f149427h = str;
    }

    /* JADX INFO: renamed from: y */
    public void m169514y(JSONObject jSONObject) {
        this.f149428i = jSONObject;
    }

    /* JADX INFO: renamed from: z */
    public JSONObject m169515z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f149423d);
            jSONObject.put("msg", this.f149424e);
            jSONObject.put("isRead", this.f149425f);
            jSONObject.put("date", this.f149421b);
            jSONObject.put("wzrk_ttl", this.f149422c);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f149426g.size(); i++) {
                jSONArray.put(this.f149426g.get(i));
            }
            jSONObject.put("tags", jSONArray);
            jSONObject.put(Constants.NOTIFICATION_ID_TAG, this.f149420a);
            jSONObject.put(Constants.KEY_WZRK_PARAMS, this.f149428i);
            return jSONObject;
        } catch (JSONException e) {
            Logger.m5927v("Unable to convert CTMessageDao to JSON - " + e.getLocalizedMessage());
            return jSONObject;
        }
    }

    public ow3() {
        this.f149426g = new ArrayList();
        this.f149430k = "PENDING_INDEXING";
    }
}

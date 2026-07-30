package p153l;

import android.util.JsonWriter;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.heytap.mcssdk.mode.CommandMessage;
import com.tencent.liteav.TXLiteAVCode;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
public final class cct0 {

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static boolean f81031c = false;

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static boolean f81032d = false;

    /* JADX INFO: renamed from: a */
    public final List f81035a;

    /* JADX INFO: renamed from: b */
    public static final Object f81030b = new Object();

    /* JADX INFO: renamed from: e */
    public static final Clock f81033e = DefaultClock.getInstance();

    /* JADX INFO: renamed from: f */
    public static final Set f81034f = new HashSet(Arrays.asList(new String[0]));

    public cct0(@Nullable String str) {
        this.f81035a = !m109067k() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m109063a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name(CommandMessage.PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m109070r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m109064b(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name(CommandMessage.PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        m109070r(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: i */
    public static void m109065i() {
        synchronized (f81030b) {
            f81031c = false;
            f81032d = false;
            dct0.m115298g("Ad debug logging enablement is out of date.");
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m109066j(boolean z) {
        synchronized (f81030b) {
            f81031c = true;
            f81032d = z;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m109067k() {
        boolean z;
        synchronized (f81030b) {
            try {
                z = false;
                if (f81031c && f81032d) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m109068l() {
        boolean z;
        synchronized (f81030b) {
            z = f81031c;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public static synchronized void m109069m(String str) {
        try {
            dct0.m115297f("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
                dct0.m115297f("GMA Debug CONTENT ".concat(str.substring(i, Math.min(i2, str.length()))));
                i = i2;
            }
            dct0.m115297f("GMA Debug FINISH");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m109070r(JsonWriter jsonWriter, @Nullable Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!f81034f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        dct0.m115295d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(AuthenticationTokenClaims.JSON_KEY_NAME).value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AuthenticationTokenClaims.JSON_KEY_NAME).value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    /* JADX INFO: renamed from: c */
    public final void m109071c(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        if (m109067k()) {
            m109079p(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m109072d(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) {
        if (m109067k()) {
            m109079p(str, "GET", map, bArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m109073e(HttpURLConnection httpURLConnection, int i) {
        if (m109067k()) {
            String responseMessage = null;
            m109080q(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    dct0.m115298g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                m109078o(responseMessage);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m109074f(@Nullable Map map, int i) {
        if (m109067k()) {
            m109080q(map, i);
            if (i < 200 || i >= 300) {
                m109078o(null);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m109075g(@Nullable String str) {
        if (m109067k() && str != null) {
            m109076h(str.getBytes());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m109076h(final byte[] bArr) {
        m109077n("onNetworkResponseBody", new bct0() { // from class: l.qbt0
            @Override // p153l.bct0
            /* JADX INFO: renamed from: a */
            public final void mo103552a(JsonWriter jsonWriter) throws IOException {
                Object obj = cct0.f81030b;
                jsonWriter.name(CommandMessage.PARAMS).beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strEncode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncode);
                } else {
                    String strM167038g = obt0.m167038g(strEncode);
                    if (strM167038g != null) {
                        jsonWriter.name("bodydigest").value(strM167038g);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m109077n(String str, bct0 bct0Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f81033e.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f81035a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            bct0Var.mo103552a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            dct0.m115296e("unable to log", e);
        }
        m109069m(stringWriter.toString());
    }

    /* JADX INFO: renamed from: o */
    public final void m109078o(@Nullable final String str) {
        m109077n("onNetworkRequestError", new bct0() { // from class: l.rbt0
            @Override // p153l.bct0
            /* JADX INFO: renamed from: a */
            public final void mo103552a(JsonWriter jsonWriter) throws IOException {
                Object obj = cct0.f81030b;
                jsonWriter.name(CommandMessage.PARAMS).beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m109079p(final String str, final String str2, @Nullable final Map map, @Nullable final byte[] bArr) {
        m109077n("onNetworkRequest", new bct0() { // from class: l.pbt0
            @Override // p153l.bct0
            /* JADX INFO: renamed from: a */
            public final void mo103552a(JsonWriter jsonWriter) throws IOException {
                cct0.m109063a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m109080q(@Nullable final Map map, final int i) {
        m109077n("onNetworkResponse", new bct0() { // from class: l.sbt0
            @Override // p153l.bct0
            /* JADX INFO: renamed from: a */
            public final void mo103552a(JsonWriter jsonWriter) throws IOException {
                cct0.m109064b(i, map, jsonWriter);
            }
        });
    }

    public cct0() {
        this(null);
    }
}

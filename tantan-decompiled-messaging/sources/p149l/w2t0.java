package p149l;

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
public final class w2t0 {

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static boolean f184285c = false;

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public static boolean f184286d = false;

    /* JADX INFO: renamed from: a */
    public final List f184289a;

    /* JADX INFO: renamed from: b */
    public static final Object f184284b = new Object();

    /* JADX INFO: renamed from: e */
    public static final Clock f184287e = DefaultClock.getInstance();

    /* JADX INFO: renamed from: f */
    public static final Set f184288f = new HashSet(Arrays.asList(new String[0]));

    public w2t0(@Nullable String str) {
        this.f184289a = !m201220k() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m201216a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name(CommandMessage.PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m201223r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m201217b(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name(CommandMessage.PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        m201223r(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: i */
    public static void m201218i() {
        synchronized (f184284b) {
            f184285c = false;
            f184286d = false;
            x2t0.m206869g("Ad debug logging enablement is out of date.");
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m201219j(boolean z) {
        synchronized (f184284b) {
            f184285c = true;
            f184286d = z;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m201220k() {
        boolean z;
        synchronized (f184284b) {
            try {
                z = false;
                if (f184285c && f184286d) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m201221l() {
        boolean z;
        synchronized (f184284b) {
            z = f184285c;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public static synchronized void m201222m(String str) {
        try {
            x2t0.m206868f("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
                x2t0.m206868f("GMA Debug CONTENT ".concat(str.substring(i, Math.min(i2, str.length()))));
                i = i2;
            }
            x2t0.m206868f("GMA Debug FINISH");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m201223r(JsonWriter jsonWriter, @Nullable Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!f184288f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        x2t0.m206866d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
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
    public final void m201224c(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        if (m201220k()) {
            m201232p(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m201225d(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) {
        if (m201220k()) {
            m201232p(str, "GET", map, bArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m201226e(HttpURLConnection httpURLConnection, int i) {
        if (m201220k()) {
            String responseMessage = null;
            m201233q(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    x2t0.m206869g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                m201231o(responseMessage);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m201227f(@Nullable Map map, int i) {
        if (m201220k()) {
            m201233q(map, i);
            if (i < 200 || i >= 300) {
                m201231o(null);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m201228g(@Nullable String str) {
        if (m201220k() && str != null) {
            m201229h(str.getBytes());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m201229h(final byte[] bArr) {
        m201230n("onNetworkResponseBody", new v2t0() { // from class: l.k2t0
            @Override // p149l.v2t0
            /* JADX INFO: renamed from: a */
            public final void mo139496a(JsonWriter jsonWriter) throws IOException {
                Object obj = w2t0.f184284b;
                jsonWriter.name(CommandMessage.PARAMS).beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strEncode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncode);
                } else {
                    String strM134085g = i2t0.m134085g(strEncode);
                    if (strM134085g != null) {
                        jsonWriter.name("bodydigest").value(strM134085g);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m201230n(String str, v2t0 v2t0Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f184287e.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f184289a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            v2t0Var.mo139496a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            x2t0.m206867e("unable to log", e);
        }
        m201222m(stringWriter.toString());
    }

    /* JADX INFO: renamed from: o */
    public final void m201231o(@Nullable final String str) {
        m201230n("onNetworkRequestError", new v2t0() { // from class: l.l2t0
            @Override // p149l.v2t0
            /* JADX INFO: renamed from: a */
            public final void mo139496a(JsonWriter jsonWriter) throws IOException {
                Object obj = w2t0.f184284b;
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
    public final void m201232p(final String str, final String str2, @Nullable final Map map, @Nullable final byte[] bArr) {
        m201230n("onNetworkRequest", new v2t0() { // from class: l.j2t0
            @Override // p149l.v2t0
            /* JADX INFO: renamed from: a */
            public final void mo139496a(JsonWriter jsonWriter) throws IOException {
                w2t0.m201216a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m201233q(@Nullable final Map map, final int i) {
        m201230n("onNetworkResponse", new v2t0() { // from class: l.m2t0
            @Override // p149l.v2t0
            /* JADX INFO: renamed from: a */
            public final void mo139496a(JsonWriter jsonWriter) throws IOException {
                w2t0.m201217b(i, map, jsonWriter);
            }
        });
    }

    public w2t0() {
        this(null);
    }
}

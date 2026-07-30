package com.immomo.momosec.network;

import android.text.TextUtils;
import com.immomo.momosec.Coded;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.net.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.ekl;
import p149l.exc0;
import p149l.gkl;
import p149l.k850;
import p149l.qyi;
import p149l.rjw;
import p149l.stc0;

/* JADX INFO: renamed from: com.immomo.momosec.network.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3917a {

    /* JADX INFO: renamed from: e */
    private static volatile k850 f13975e;

    /* JADX INFO: renamed from: f */
    private static volatile k850 f13976f;

    /* JADX INFO: renamed from: a */
    private final String f13977a;

    /* JADX INFO: renamed from: b */
    private final String f13978b;

    /* JADX INFO: renamed from: d */
    private int f13980d = 0;

    /* JADX INFO: renamed from: c */
    private final long f13979c = System.currentTimeMillis();

    public C3917a(String str, String str2) {
        this.f13977a = str;
        this.f13978b = str2;
    }

    /* JADX INFO: renamed from: a */
    private long m19319a() {
        return ((long) Math.pow(2.0d, this.f13980d)) * 1000;
    }

    /* JADX INFO: renamed from: b */
    private static k850.C17954b m19320b() {
        k850.C17954b c17954b = new k850.C17954b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return c17954b.m144885f(15L, timeUnit).m144899t(15L, timeUnit).m144896q(Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_1_1, Protocol.HTTP_2))).m144897r(Proxy.NO_PROXY);
    }

    /* JADX INFO: renamed from: c */
    private HttpBaseException m19321c(Exception exc) {
        return new HttpBaseException.C3916a().m19311l(HttpBaseException.ErrorType.NETWORK).m19312m(rjw.m179664a(new byte[]{98, 3, 64, 66, 4, 21, 68, 70, 87, 86, 8, 10, 85, 2, 17, 83, 20, 3, Tnaf.POW_2_WIDTH, 18, 94, 23, 21, 15, 93, 3, 94, 66, 21, 70, 95, 20, 17, 90, 0, 30, Tnaf.POW_2_WIDTH, 20, 84, 67, 19, 15, 85, 21})).m19310k(exc).m19318s(this.f13977a).m19314o(this.f13978b).m19315p(this.f13980d).m19317r(System.currentTimeMillis() - this.f13979c).m19309j();
    }

    /* JADX INFO: renamed from: d */
    private String m19322d(String str) throws HttpBaseException {
        Exception exc = null;
        for (int i = 0; i < 2; i++) {
            try {
                String str2 = new String(Coded.doCommand(str.getBytes(), 103));
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            } catch (Throwable th) {
                exc = new Exception(th);
            }
        }
        throw new HttpBaseException.C3916a().m19311l(HttpBaseException.ErrorType.DECRYPTION).m19312m(rjw.m179664a(new byte[]{116, 3, 82, 69, 24, 22, 68, 15, 94, 89, 65, 0, 81, 15, 93, 82, 5, 70, 81, 0, 69, 82, 19, 70, 66, 3, 69, 69, 8, 3, 67})).m19310k(exc).m19318s(this.f13977a).m19314o(this.f13978b).m19315p(this.f13980d).m19317r(System.currentTimeMillis() - this.f13979c).m19313n(str).m19309j();
    }

    /* JADX INFO: renamed from: f */
    private exc0 m19323f(boolean z) throws Exception {
        qyi qyiVarM177041b = new qyi.C19606a().m177040a(rjw.m179664a(new byte[]{93, 28, 88, 71}), this.f13978b).m177041b();
        return m19325h(z).mo144849a(new stc0.C20027a().m185898q(this.f13977a).m185889h(rjw.m179664a(new byte[]{115, 9, 95, 89, 4, 5, 68, 15, 94, 89}), rjw.m179664a(new byte[]{83, 10, 94, 68, 4})).m185889h(rjw.m179664a(new byte[]{115, 14, 80, 69, 18, 3, 68}), rjw.m179664a(new byte[]{101, 50, 119, 26, 89})).m185889h(rjw.m179664a(new byte[]{113, 5, 82, 82, 17, 18, 29, 42, 80, 89, 6, 19, 81, 1, 84}), rjw.m179664a(new byte[]{74, 14, 28, 116, 47})).m185889h(rjw.m179664a(new byte[]{115, 9, 95, 67, 4, 8, 68, 75, 101, 78, 17, 3}), rjw.m179664a(new byte[]{81, 22, 65, 91, 8, 5, 81, 18, 88, 88, 15, 73, 72, 75, 70, 64, 22, 75, 86, 9, 67, 90, 76, 19, 66, 10, 84, 89, 2, 9, 84, 3, 85})).m185889h(rjw.m179664a(new byte[]{115, 9, 95, 67, 4, 8, 68, 75, 125, 82, 15, 1, 68, 14}), String.valueOf(qyiVarM177041b.contentLength())).m185893l(qyiVarM177041b).m185883b()).execute();
    }

    /* JADX INFO: renamed from: g */
    private String m19324g() throws HttpBaseException {
        Exception exc = null;
        AutoCloseable autoCloseable = null;
        AutoCloseable autoCloseable2 = null;
        while (this.f13980d < 3 && System.currentTimeMillis() - this.f13979c <= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            try {
                try {
                    exc0 exc0VarM19323f = m19323f(this.f13980d != 0);
                    int iM118609q = exc0VarM19323f.m118609q();
                    if (iM118609q < 200 || iM118609q > 299) {
                        throw new HttpBaseException.C3916a().m19311l(HttpBaseException.ErrorType.NETWORK).m19312m(rjw.m179664a(new byte[]{121, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84, 70, 121, 99, 53, 54, Tnaf.POW_2_WIDTH, 21, 69, 86, 21, 19, 67, 70, 82, 88, 5, 3, 10, 70}) + iM118609q).m19318s(this.f13977a).m19314o(this.f13978b).m19316q(iM118609q).m19315p(this.f13980d).m19317r(System.currentTimeMillis() - this.f13979c).m19309j();
                    }
                    if (exc0VarM19323f.m118606k() == null) {
                        throw new HttpBaseException.C3916a().m19311l(HttpBaseException.ErrorType.NETWORK).m19312m(rjw.m179664a(new byte[]{117, 11, 65, 67, 24, 70, 66, 3, 66, 71, 14, 8, 67, 3, 17, 85, 14, 2, 73})).m19318s(this.f13977a).m19314o(this.f13978b).m19316q(iM118609q).m19315p(this.f13980d).m19317r(System.currentTimeMillis() - this.f13979c).m19309j();
                    }
                    String strString = exc0VarM19323f.m118606k().string();
                    exc0VarM19323f.close();
                    this.f13980d++;
                    return strString;
                } catch (HttpBaseException e) {
                    throw e;
                }
            } catch (Exception e2) {
                try {
                    try {
                        Thread.sleep(m19319a());
                    } catch (InterruptedException unused) {
                    }
                    if (0 != 0) {
                        autoCloseable2.close();
                    }
                    this.f13980d++;
                    exc = e2;
                } catch (Throwable th) {
                    if (0 != 0) {
                        autoCloseable.close();
                    }
                    this.f13980d++;
                    throw th;
                }
            }
        }
        throw m19321c(exc);
    }

    /* JADX INFO: renamed from: h */
    private static k850 m19325h(boolean z) {
        return z ? m19327j() : m19326i();
    }

    /* JADX INFO: renamed from: i */
    private static k850 m19326i() {
        if (f13975e == null) {
            synchronized (C3917a.class) {
                try {
                    if (f13975e == null) {
                        f13975e = m19320b().m144882c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13975e;
    }

    /* JADX INFO: renamed from: j */
    private static k850 m19327j() {
        if (f13976f == null) {
            synchronized (C3917a.class) {
                try {
                    if (f13976f == null) {
                        f13976f = m19320b().m144890k(new ekl()).m144889j(new gkl()).m144882c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13976f;
    }

    /* JADX INFO: renamed from: k */
    private String m19328k(String str) throws HttpBaseException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(rjw.m179664a(new byte[]{85, 5}), -99999);
            if (iOptInt == 0) {
                String strOptString = jSONObject.optString(rjw.m179664a(new byte[]{84, 7, 69, 86}));
                if (strOptString.isEmpty()) {
                    throw new HttpBaseException.C3916a().m19311l(HttpBaseException.ErrorType.SERVER_ERROR).m19312m(rjw.m179664a(new byte[]{99, 3, 67, 65, 4, 20, Tnaf.POW_2_WIDTH, 20, 84, 67, 20, 20, 94, 3, 85, 23, 4, 11, 64, 18, 72, 23, 5, 7, 68, 7})).m19318s(this.f13977a).m19314o(this.f13978b).m19315p(this.f13980d).m19317r(System.currentTimeMillis() - this.f13979c).m19313n(str).m19316q(iOptInt).m19309j();
                }
                return strOptString;
            }
            throw new HttpBaseException.C3916a().m19311l(HttpBaseException.ErrorType.SERVER_ERROR).m19312m(rjw.m179664a(new byte[]{99, 3, 67, 65, 4, 20, Tnaf.POW_2_WIDTH, 20, 84, 67, 20, 20, 94, 3, 85, 23, 4, 20, 66, 9, 67, 23, 18, 18, 81, 18, 68, 68, 91, 70, 85, 5, 17, 10, 65}) + iOptInt).m19318s(this.f13977a).m19314o(this.f13978b).m19315p(this.f13980d).m19317r(System.currentTimeMillis() - this.f13979c).m19313n(str).m19316q(iOptInt).m19309j();
        } catch (JSONException e) {
            throw new HttpBaseException.C3916a().m19311l(HttpBaseException.ErrorType.JSON_PARSE).m19312m(rjw.m179664a(new byte[]{117, 20, 67, 88, 19, 70, 64, 7, 67, 68, 8, 8, 87, 70, 123, 100, 46, 40, Tnaf.POW_2_WIDTH, 20, 84, 68, 17, 9, 94, 21, 84})).m19310k(e).m19318s(this.f13977a).m19314o(this.f13978b).m19315p(this.f13980d).m19317r(System.currentTimeMillis() - this.f13979c).m19313n(str).m19309j();
        }
    }

    /* JADX INFO: renamed from: e */
    public String m19329e() throws HttpBaseException {
        return m19328k(m19322d(m19324g()));
    }
}

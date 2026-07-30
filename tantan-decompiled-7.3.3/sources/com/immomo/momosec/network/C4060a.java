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
import org.spongycastle.math.p135ec.Tnaf;
import p153l.i5d0;
import p153l.l1j;
import p153l.qmw;
import p153l.rg50;
import p153l.sml;
import p153l.uml;
import p153l.x1d0;

/* JADX INFO: renamed from: com.immomo.momosec.network.a */
/* JADX INFO: loaded from: classes7.dex */
public class C4060a {

    /* JADX INFO: renamed from: e */
    private static volatile rg50 f14669e;

    /* JADX INFO: renamed from: f */
    private static volatile rg50 f14670f;

    /* JADX INFO: renamed from: a */
    private final String f14671a;

    /* JADX INFO: renamed from: b */
    private final String f14672b;

    /* JADX INFO: renamed from: d */
    private int f14674d = 0;

    /* JADX INFO: renamed from: c */
    private final long f14673c = System.currentTimeMillis();

    public C4060a(String str, String str2) {
        this.f14671a = str;
        this.f14672b = str2;
    }

    /* JADX INFO: renamed from: a */
    private long m20299a() {
        return ((long) Math.pow(2.0d, this.f14674d)) * 1000;
    }

    /* JADX INFO: renamed from: b */
    private static rg50.C19837b m20300b() {
        rg50.C19837b c19837b = new rg50.C19837b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return c19837b.m181368f(15L, timeUnit).m181383u(15L, timeUnit).m181380r(Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_1_1, Protocol.HTTP_2))).m181381s(Proxy.NO_PROXY);
    }

    /* JADX INFO: renamed from: c */
    private HttpBaseException m20301c(Exception exc) {
        return new HttpBaseException.C4059a().m20291l(HttpBaseException.ErrorType.NETWORK).m20292m(qmw.m177151a(new byte[]{98, 3, 64, 66, 4, 21, 68, 70, 87, 86, 8, 10, 85, 2, 17, 83, 20, 3, Tnaf.POW_2_WIDTH, 18, 94, 23, 21, 15, 93, 3, 94, 66, 21, 70, 95, 20, 17, 90, 0, 30, Tnaf.POW_2_WIDTH, 20, 84, 67, 19, 15, 85, 21})).m20290k(exc).m20298s(this.f14671a).m20294o(this.f14672b).m20295p(this.f14674d).m20297r(System.currentTimeMillis() - this.f14673c).m20289j();
    }

    /* JADX INFO: renamed from: d */
    private String m20302d(String str) throws HttpBaseException {
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
        throw new HttpBaseException.C4059a().m20291l(HttpBaseException.ErrorType.DECRYPTION).m20292m(qmw.m177151a(new byte[]{116, 3, 82, 69, 24, 22, 68, 15, 94, 89, 65, 0, 81, 15, 93, 82, 5, 70, 81, 0, 69, 82, 19, 70, 66, 3, 69, 69, 8, 3, 67})).m20290k(exc).m20298s(this.f14671a).m20294o(this.f14672b).m20295p(this.f14674d).m20297r(System.currentTimeMillis() - this.f14673c).m20293n(str).m20289j();
    }

    /* JADX INFO: renamed from: f */
    private i5d0 m20303f(boolean z) throws Exception {
        l1j l1jVarM152498b = new l1j.C18332a().m152497a(qmw.m177151a(new byte[]{93, 28, 88, 71}), this.f14672b).m152498b();
        return m20305h(z).mo181341a(new x1d0.C21228a().m209043q(this.f14671a).m209034h(qmw.m177151a(new byte[]{115, 9, 95, 89, 4, 5, 68, 15, 94, 89}), qmw.m177151a(new byte[]{83, 10, 94, 68, 4})).m209034h(qmw.m177151a(new byte[]{115, 14, 80, 69, 18, 3, 68}), qmw.m177151a(new byte[]{101, 50, 119, 26, 89})).m209034h(qmw.m177151a(new byte[]{113, 5, 82, 82, 17, 18, 29, 42, 80, 89, 6, 19, 81, 1, 84}), qmw.m177151a(new byte[]{74, 14, 28, 116, 47})).m209034h(qmw.m177151a(new byte[]{115, 9, 95, 67, 4, 8, 68, 75, 101, 78, 17, 3}), qmw.m177151a(new byte[]{81, 22, 65, 91, 8, 5, 81, 18, 88, 88, 15, 73, 72, 75, 70, 64, 22, 75, 86, 9, 67, 90, 76, 19, 66, 10, 84, 89, 2, 9, 84, 3, 85})).m209034h(qmw.m177151a(new byte[]{115, 9, 95, 67, 4, 8, 68, 75, 125, 82, 15, 1, 68, 14}), String.valueOf(l1jVarM152498b.contentLength())).m209038l(l1jVarM152498b).m209028b()).execute();
    }

    /* JADX INFO: renamed from: g */
    private String m20304g() throws HttpBaseException {
        Exception exc = null;
        AutoCloseable autoCloseable = null;
        AutoCloseable autoCloseable2 = null;
        while (this.f14674d < 3 && System.currentTimeMillis() - this.f14673c <= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            try {
                try {
                    i5d0 i5d0VarM20303f = m20303f(this.f14674d != 0);
                    int iM138673q = i5d0VarM20303f.m138673q();
                    if (iM138673q < 200 || iM138673q > 299) {
                        throw new HttpBaseException.C4059a().m20291l(HttpBaseException.ErrorType.NETWORK).m20292m(qmw.m177151a(new byte[]{121, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84, 70, 121, 99, 53, 54, Tnaf.POW_2_WIDTH, 21, 69, 86, 21, 19, 67, 70, 82, 88, 5, 3, 10, 70}) + iM138673q).m20298s(this.f14671a).m20294o(this.f14672b).m20296q(iM138673q).m20295p(this.f14674d).m20297r(System.currentTimeMillis() - this.f14673c).m20289j();
                    }
                    if (i5d0VarM20303f.m138670k() == null) {
                        throw new HttpBaseException.C4059a().m20291l(HttpBaseException.ErrorType.NETWORK).m20292m(qmw.m177151a(new byte[]{117, 11, 65, 67, 24, 70, 66, 3, 66, 71, 14, 8, 67, 3, 17, 85, 14, 2, 73})).m20298s(this.f14671a).m20294o(this.f14672b).m20296q(iM138673q).m20295p(this.f14674d).m20297r(System.currentTimeMillis() - this.f14673c).m20289j();
                    }
                    String strString = i5d0VarM20303f.m138670k().string();
                    i5d0VarM20303f.close();
                    this.f14674d++;
                    return strString;
                } catch (HttpBaseException e) {
                    throw e;
                }
            } catch (Exception e2) {
                try {
                    try {
                        Thread.sleep(m20299a());
                    } catch (InterruptedException unused) {
                    }
                    if (0 != 0) {
                        autoCloseable2.close();
                    }
                    this.f14674d++;
                    exc = e2;
                } catch (Throwable th) {
                    if (0 != 0) {
                        autoCloseable.close();
                    }
                    this.f14674d++;
                    throw th;
                }
            }
        }
        throw m20301c(exc);
    }

    /* JADX INFO: renamed from: h */
    private static rg50 m20305h(boolean z) {
        return z ? m20307j() : m20306i();
    }

    /* JADX INFO: renamed from: i */
    private static rg50 m20306i() {
        if (f14669e == null) {
            synchronized (C4060a.class) {
                try {
                    if (f14669e == null) {
                        f14669e = m20300b().m181365c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14669e;
    }

    /* JADX INFO: renamed from: j */
    private static rg50 m20307j() {
        if (f14670f == null) {
            synchronized (C4060a.class) {
                try {
                    if (f14670f == null) {
                        f14670f = m20300b().m181373k(new sml()).m181372j(new uml()).m181365c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14670f;
    }

    /* JADX INFO: renamed from: k */
    private String m20308k(String str) throws HttpBaseException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(qmw.m177151a(new byte[]{85, 5}), -99999);
            if (iOptInt == 0) {
                String strOptString = jSONObject.optString(qmw.m177151a(new byte[]{84, 7, 69, 86}));
                if (strOptString.isEmpty()) {
                    throw new HttpBaseException.C4059a().m20291l(HttpBaseException.ErrorType.SERVER_ERROR).m20292m(qmw.m177151a(new byte[]{99, 3, 67, 65, 4, 20, Tnaf.POW_2_WIDTH, 20, 84, 67, 20, 20, 94, 3, 85, 23, 4, 11, 64, 18, 72, 23, 5, 7, 68, 7})).m20298s(this.f14671a).m20294o(this.f14672b).m20295p(this.f14674d).m20297r(System.currentTimeMillis() - this.f14673c).m20293n(str).m20296q(iOptInt).m20289j();
                }
                return strOptString;
            }
            throw new HttpBaseException.C4059a().m20291l(HttpBaseException.ErrorType.SERVER_ERROR).m20292m(qmw.m177151a(new byte[]{99, 3, 67, 65, 4, 20, Tnaf.POW_2_WIDTH, 20, 84, 67, 20, 20, 94, 3, 85, 23, 4, 20, 66, 9, 67, 23, 18, 18, 81, 18, 68, 68, 91, 70, 85, 5, 17, 10, 65}) + iOptInt).m20298s(this.f14671a).m20294o(this.f14672b).m20295p(this.f14674d).m20297r(System.currentTimeMillis() - this.f14673c).m20293n(str).m20296q(iOptInt).m20289j();
        } catch (JSONException e) {
            throw new HttpBaseException.C4059a().m20291l(HttpBaseException.ErrorType.JSON_PARSE).m20292m(qmw.m177151a(new byte[]{117, 20, 67, 88, 19, 70, 64, 7, 67, 68, 8, 8, 87, 70, 123, 100, 46, 40, Tnaf.POW_2_WIDTH, 20, 84, 68, 17, 9, 94, 21, 84})).m20290k(e).m20298s(this.f14671a).m20294o(this.f14672b).m20295p(this.f14674d).m20297r(System.currentTimeMillis() - this.f14673c).m20293n(str).m20289j();
        }
    }

    /* JADX INFO: renamed from: e */
    public String m20309e() throws HttpBaseException {
        return m20308k(m20302d(m20304g()));
    }
}

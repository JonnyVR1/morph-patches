package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzead;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class n8v0 implements kbw0 {

    /* JADX INFO: renamed from: a */
    public final Context f140715a;

    /* JADX INFO: renamed from: b */
    public final String f140716b;

    /* JADX INFO: renamed from: c */
    public final b5t0 f140717c;

    public n8v0(Context context, String str, b5t0 b5t0Var, int i) {
        this.f140715a = context;
        this.f140716b = str;
        this.f140717c = b5t0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // p153l.kbw0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h8v0 zza(g8v0 g8v0Var) throws zzead {
        h8v0 h8v0Var;
        InputStreamReader inputStreamReader;
        String str = g8v0Var.f102715a;
        int i = g8v0Var.f102716b;
        Map map = g8v0Var.f102717c;
        byte[] bArr = g8v0Var.f102718d;
        String str2 = g8v0Var.f102719e;
        long jElapsedRealtime = bxy0.m106918b().elapsedRealtime();
        ?? r6 = 1;
        try {
            h8v0 h8v0Var2 = new h8v0();
            dct0.m115297f("SDK version: " + this.f140716b);
            dct0.m115293b("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i2 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                ?? r3 = r6;
                try {
                    try {
                        C2098b c2098bM106934r = bxy0.m106934r();
                        h8v0 h8v0Var3 = h8v0Var2;
                        try {
                            Context context = this.f140715a;
                            try {
                                String str3 = this.f140716b;
                                int i3 = i2;
                                boolean z = r3 == true ? 1 : 0;
                                h8v0Var = h8v0Var3;
                                try {
                                    c2098bM106934r.m12390H(context, str3, false, httpURLConnection, false, i);
                                    for (Map.Entry entry : map.entrySet()) {
                                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    if (!TextUtils.isEmpty(str2)) {
                                        httpURLConnection.setRequestProperty("Content-Type", str2);
                                    }
                                    int length = bArr.length;
                                    BufferedOutputStream bufferedOutputStream = null;
                                    if (length > 0) {
                                        httpURLConnection.setDoOutput(z);
                                        httpURLConnection.setFixedLengthStreamingMode(length);
                                        try {
                                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                            try {
                                                bufferedOutputStream2.write(bArr);
                                                IOUtils.closeQuietly(bufferedOutputStream2);
                                            } catch (Throwable th) {
                                                th = th;
                                                bufferedOutputStream = bufferedOutputStream2;
                                                IOUtils.closeQuietly(bufferedOutputStream);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    cct0 cct0Var = new cct0(null);
                                    cct0Var.m109071c(httpURLConnection, bArr);
                                    int responseCode = httpURLConnection.getResponseCode();
                                    for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                        try {
                                            String key = entry2.getKey();
                                            List<String> value = entry2.getValue();
                                            if (map2.containsKey(key)) {
                                                ((List) map2.get(key)).addAll(value);
                                            } else {
                                                ?? r17 = z ? 1 : 0;
                                                map2.put(key, new ArrayList(value));
                                                z = r17 == true ? 1 : 0;
                                            }
                                        } catch (zzead e) {
                                            e = e;
                                            ?? r5 = z ? 1 : 0;
                                            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168327h8)).booleanValue()) {
                                                throw e;
                                            }
                                            h8v0Var.f108278d = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime;
                                            httpURLConnection.disconnect();
                                            return h8v0Var;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            ?? r7 = z ? 1 : 0;
                                            httpURLConnection.disconnect();
                                            throw th;
                                        }
                                    }
                                    ?? r18 = z ? 1 : 0;
                                    cct0Var.m109073e(httpURLConnection, responseCode);
                                    h8v0Var.f108275a = responseCode;
                                    h8v0Var.f108276b = map2;
                                    h8v0Var.f108277c = "";
                                    if (responseCode >= 200 && responseCode < 300) {
                                        try {
                                            InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                            try {
                                                bxy0.m106934r();
                                                String strM12374m = C2098b.m12374m(inputStreamReader2);
                                                IOUtils.closeQuietly(inputStreamReader2);
                                                cct0Var.m109075g(strM12374m);
                                                h8v0Var.f108277c = strM12374m;
                                                if (TextUtils.isEmpty(strM12374m)) {
                                                    if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168479t5)).booleanValue()) {
                                                        throw new zzead(3);
                                                    }
                                                }
                                                h8v0Var.f108278d = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime;
                                                httpURLConnection.disconnect();
                                                return h8v0Var;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                inputStreamReader = inputStreamReader2;
                                                IOUtils.closeQuietly(inputStreamReader);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStreamReader = null;
                                        }
                                    } else {
                                        if (responseCode < 300 || responseCode >= 400) {
                                            dct0.m115298g("Received error HTTP response code: " + responseCode);
                                            throw new zzead(1, "Received error HTTP response code: " + responseCode);
                                        }
                                        String headerField = httpURLConnection.getHeaderField("Location");
                                        if (TextUtils.isEmpty(headerField)) {
                                            dct0.m115298g("No location header to follow redirect.");
                                            throw new zzead(1, "No location header to follow redirect");
                                        }
                                        URL url2 = new URL(headerField);
                                        i2 = i3 + 1;
                                        if (i2 > ((Integer) jas0.m144075c().m176505a(sgs0.f168148T4)).intValue()) {
                                            dct0.m115298g("Too many redirects.");
                                            throw new zzead(r18 == true ? 1 : 0, "Too many redirects");
                                        }
                                        httpURLConnection.disconnect();
                                        h8v0Var2 = h8v0Var;
                                        url = url2;
                                        r6 = r18 == true ? 1 : 0;
                                    }
                                } catch (zzead e2) {
                                    e = e2;
                                }
                            } catch (zzead e3) {
                                e = e3;
                                h8v0Var = h8v0Var3;
                            }
                        } catch (zzead e4) {
                            e = e4;
                            h8v0Var = h8v0Var3;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (zzead e5) {
                    e = e5;
                    h8v0Var = h8v0Var2;
                }
            }
        } catch (IOException e6) {
            String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e6.getMessage()));
            dct0.m115298g(strConcat);
            throw new zzead(1, strConcat, e6);
        }
    }
}

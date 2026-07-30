package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C2075b;
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
public final class hzu0 implements e2w0 {

    /* JADX INFO: renamed from: a */
    public final Context f110232a;

    /* JADX INFO: renamed from: b */
    public final String f110233b;

    /* JADX INFO: renamed from: c */
    public final vvs0 f110234c;

    public hzu0(Context context, String str, vvs0 vvs0Var, int i) {
        this.f110232a = context;
        this.f110233b = str;
        this.f110234c = vvs0Var;
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
    @Override // p149l.e2w0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bzu0 zza(azu0 azu0Var) throws zzead {
        bzu0 bzu0Var;
        InputStreamReader inputStreamReader;
        String str = azu0Var.f72381a;
        int i = azu0Var.f72382b;
        Map map = azu0Var.f72383c;
        byte[] bArr = azu0Var.f72384d;
        String str2 = azu0Var.f72385e;
        long jElapsedRealtime = vny0.m199064b().elapsedRealtime();
        ?? r6 = 1;
        try {
            bzu0 bzu0Var2 = new bzu0();
            x2t0.m206868f("SDK version: " + this.f110233b);
            x2t0.m206864b("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i2 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                ?? r3 = r6;
                try {
                    try {
                        C2075b c2075bM199080r = vny0.m199080r();
                        bzu0 bzu0Var3 = bzu0Var2;
                        try {
                            Context context = this.f110232a;
                            try {
                                String str3 = this.f110233b;
                                int i3 = i2;
                                boolean z = r3 == true ? 1 : 0;
                                bzu0Var = bzu0Var3;
                                try {
                                    c2075bM199080r.m12336H(context, str3, false, httpURLConnection, false, i);
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
                                    w2t0 w2t0Var = new w2t0(null);
                                    w2t0Var.m201224c(httpURLConnection, bArr);
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
                                            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132256h8)).booleanValue()) {
                                                throw e;
                                            }
                                            bzu0Var.f78065d = vny0.m199064b().elapsedRealtime() - jElapsedRealtime;
                                            httpURLConnection.disconnect();
                                            return bzu0Var;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            ?? r7 = z ? 1 : 0;
                                            httpURLConnection.disconnect();
                                            throw th;
                                        }
                                    }
                                    ?? r18 = z ? 1 : 0;
                                    w2t0Var.m201226e(httpURLConnection, responseCode);
                                    bzu0Var.f78062a = responseCode;
                                    bzu0Var.f78063b = map2;
                                    bzu0Var.f78064c = "";
                                    if (responseCode >= 200 && responseCode < 300) {
                                        try {
                                            InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                            try {
                                                vny0.m199080r();
                                                String strM12320m = C2075b.m12320m(inputStreamReader2);
                                                IOUtils.closeQuietly(inputStreamReader2);
                                                w2t0Var.m201228g(strM12320m);
                                                bzu0Var.f78064c = strM12320m;
                                                if (TextUtils.isEmpty(strM12320m)) {
                                                    if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132408t5)).booleanValue()) {
                                                        throw new zzead(3);
                                                    }
                                                }
                                                bzu0Var.f78065d = vny0.m199064b().elapsedRealtime() - jElapsedRealtime;
                                                httpURLConnection.disconnect();
                                                return bzu0Var;
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
                                            x2t0.m206869g("Received error HTTP response code: " + responseCode);
                                            throw new zzead(1, "Received error HTTP response code: " + responseCode);
                                        }
                                        String headerField = httpURLConnection.getHeaderField("Location");
                                        if (TextUtils.isEmpty(headerField)) {
                                            x2t0.m206869g("No location header to follow redirect.");
                                            throw new zzead(1, "No location header to follow redirect");
                                        }
                                        URL url2 = new URL(headerField);
                                        i2 = i3 + 1;
                                        if (i2 > ((Integer) d1s0.m109677c().m144697a(m7s0.f132077T4)).intValue()) {
                                            x2t0.m206869g("Too many redirects.");
                                            throw new zzead(r18 == true ? 1 : 0, "Too many redirects");
                                        }
                                        httpURLConnection.disconnect();
                                        bzu0Var2 = bzu0Var;
                                        url = url2;
                                        r6 = r18 == true ? 1 : 0;
                                    }
                                } catch (zzead e2) {
                                    e = e2;
                                }
                            } catch (zzead e3) {
                                e = e3;
                                bzu0Var = bzu0Var3;
                            }
                        } catch (zzead e4) {
                            e = e4;
                            bzu0Var = bzu0Var3;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (zzead e5) {
                    e = e5;
                    bzu0Var = bzu0Var2;
                }
            }
        } catch (IOException e6) {
            String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e6.getMessage()));
            x2t0.m206869g(strConcat);
            throw new zzead(1, strConcat, e6);
        }
    }
}

package p149l;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzapn;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaqj;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes6.dex */
public class pnr0 implements nmr0 {

    /* JADX INFO: renamed from: a */
    public final onr0 f150410a;

    /* JADX INFO: renamed from: b */
    public final rnr0 f150411b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final onr0 f150412c;

    public pnr0(onr0 onr0Var) {
        rnr0 rnr0Var = new rnr0(4096);
        this.f150410a = onr0Var;
        this.f150412c = onr0Var;
        this.f150411b = rnr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:151:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:170:0x0325  */
    /* JADX WARN: Code duplicated, block: B:187:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0370 A[SYNTHETIC] */
    @Override // p149l.nmr0
    /* JADX INFO: renamed from: a */
    public pmr0 mo104509a(dnr0 dnr0Var) throws Throwable {
        ynr0 ynr0Var;
        byte[] bArr;
        byte[] bArr2;
        int iM215439b;
        por0 por0Var;
        pmr0 pmr0Var;
        por0 por0Var2;
        int iM112656a;
        Map map;
        byte[] byteArray;
        byte[] bArrM180154b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                emr0 emr0VarM112658f = dnr0Var.m112658f();
                if (emr0VarM112658f == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str = emr0VarM112658f.f92237b;
                    if (str != null) {
                        map2.put("If-None-Match", str);
                    }
                    long j = emr0VarM112658f.f92239d;
                    if (j > 0) {
                        map2.put("If-Modified-Since", xnr0.m210208c(j));
                    }
                    map = map2;
                }
                String strM112664o = dnr0Var.m112664o();
                HashMap map3 = new HashMap();
                map3.putAll(map);
                map3.putAll(dnr0Var.mo112665p());
                URL url = new URL(strM112664o);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int iM112656a2 = dnr0Var.m112656a();
                httpURLConnection.setConnectTimeout(iM112656a2);
                httpURLConnection.setReadTimeout(iM112656a2);
                boolean z = false;
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str2 : map3.keySet()) {
                        httpURLConnection.setRequestProperty(str2, (String) map3.get(str2));
                    }
                    if (dnr0Var.zza() != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] bArrMo112654B = dnr0Var.mo112654B();
                        if (bArrMo112654B != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(bArrMo112654B);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            if (!z) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    dnr0Var.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        ynr0Var = new ynr0(responseCode, nor0.m160416a(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            ynr0Var = new ynr0(responseCode, nor0.m160416a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new znr0(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    ynr0Var = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        por0Var = new por0("socket", new zzaqi(), null);
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            pkq0.m170054a("Bad URL ".concat(String.valueOf(dnr0Var.m112664o())), e);
                                            return null;
                                        }
                                        if (ynr0Var == null) {
                                            throw new zzapx(e);
                                        }
                                        iM215439b = ynr0Var.m215439b();
                                        mnr0.m155558b("Unexpected response code %d for %s", Integer.valueOf(iM215439b), dnr0Var.m112664o());
                                        if (bArr != null) {
                                            bArr2 = null;
                                            pmr0Var = new pmr0(iM215439b, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, ynr0Var.m215441d());
                                            if (iM215439b == 401) {
                                            }
                                            por0Var = new por0("auth", new zzapi(pmr0Var), null);
                                        } else {
                                            por0Var = new por0("network", new zzapv(), null);
                                        }
                                    }
                                    por0Var2 = por0Var;
                                    imr0 imr0VarM112655C = dnr0Var.m112655C();
                                    iM112656a = dnr0Var.m112656a();
                                    try {
                                        imr0VarM112655C.m137087c(por0Var2.f150558b);
                                        dnr0Var.m112666q(String.format("%s-retry [timeout=%s]", por0Var2.f150557a, Integer.valueOf(iM112656a)));
                                    } catch (zzaqj e2) {
                                        dnr0Var.m112666q(String.format("%s-timeout-giveup [timeout=%s]", por0Var2.f150557a, Integer.valueOf(iM112656a)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int iM215439b2 = ynr0Var.m215439b();
                        List listM215441d = ynr0Var.m215441d();
                        if (iM215439b2 == 304) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            emr0 emr0VarM112658f2 = dnr0Var.m112658f();
                            if (emr0VarM112658f2 == null) {
                                return new pmr0(HttpStatus.NOT_MODIFIED_304, (byte[]) null, true, jElapsedRealtime2, listM215441d);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!listM215441d.isEmpty()) {
                                Iterator it = listM215441d.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((mmr0) it.next()).m155486a());
                                }
                            }
                            ArrayList arrayList = new ArrayList(listM215441d);
                            List list = emr0VarM112658f2.f92243h;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (mmr0 mmr0Var : emr0VarM112658f2.f92243h) {
                                        if (!treeSet.contains(mmr0Var.m155486a())) {
                                            arrayList.add(mmr0Var);
                                        }
                                    }
                                }
                            } else if (!emr0VarM112658f2.f92242g.isEmpty()) {
                                for (Map.Entry entry : emr0VarM112658f2.f92242g.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new mmr0((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new pmr0(HttpStatus.NOT_MODIFIED_304, emr0VarM112658f2.f92236a, true, jElapsedRealtime2, (List) arrayList);
                        }
                        InputStream inputStreamM215440c = ynr0Var.m215440c();
                        if (inputStreamM215440c != null) {
                            int iM215438a = ynr0Var.m215438a();
                            try {
                                rnr0 rnr0Var = this.f150411b;
                                qor0 qor0Var = new qor0(rnr0Var, iM215438a);
                                try {
                                    bArrM180154b = rnr0Var.m180154b(1024);
                                    while (true) {
                                        try {
                                            int i = inputStreamM215440c.read(bArrM180154b);
                                            if (i == -1) {
                                                break;
                                            }
                                            qor0Var.write(bArrM180154b, 0, i);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                inputStreamM215440c.close();
                                            } catch (IOException unused) {
                                                mnr0.m155560d("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            rnr0Var.m180153a(bArrM180154b);
                                            qor0Var.close();
                                            throw th;
                                        }
                                        if (e instanceof SocketTimeoutException) {
                                            por0Var = new por0("socket", new zzaqi(), null);
                                        } else {
                                            if (e instanceof MalformedURLException) {
                                                pkq0.m170054a("Bad URL ".concat(String.valueOf(dnr0Var.m112664o())), e);
                                                return null;
                                            }
                                            if (ynr0Var == null) {
                                                throw new zzapx(e);
                                            }
                                            iM215439b = ynr0Var.m215439b();
                                            mnr0.m155558b("Unexpected response code %d for %s", Integer.valueOf(iM215439b), dnr0Var.m112664o());
                                            if (bArr != null) {
                                                bArr2 = null;
                                                pmr0Var = new pmr0(iM215439b, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, ynr0Var.m215441d());
                                                if (iM215439b == 401 && iM215439b != 403) {
                                                    if (iM215439b < 400 || iM215439b > 499) {
                                                        throw new zzaqh(pmr0Var);
                                                    }
                                                    throw new zzapn(pmr0Var);
                                                }
                                                por0Var = new por0("auth", new zzapi(pmr0Var), null);
                                            } else {
                                                por0Var = new por0("network", new zzapv(), null);
                                            }
                                        }
                                        por0Var2 = por0Var;
                                        imr0 imr0VarM112655C2 = dnr0Var.m112655C();
                                        iM112656a = dnr0Var.m112656a();
                                        imr0VarM112655C2.m137087c(por0Var2.f150558b);
                                        dnr0Var.m112666q(String.format("%s-retry [timeout=%s]", por0Var2.f150557a, Integer.valueOf(iM112656a)));
                                    }
                                    byteArray = qor0Var.toByteArray();
                                    try {
                                        inputStreamM215440c.close();
                                    } catch (IOException unused2) {
                                        mnr0.m155560d("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    rnr0Var.m180153a(bArrM180154b);
                                    qor0Var.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArrM180154b = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                            }
                        } else {
                            byteArray = new byte[0];
                        }
                        byte[] bArr3 = byteArray;
                        try {
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (mnr0.f134787b || jElapsedRealtime3 > 3000) {
                                mnr0.m155557a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", dnr0Var, Long.valueOf(jElapsedRealtime3), bArr3 != null ? Integer.valueOf(bArr3.length) : "null", Integer.valueOf(iM215439b2), Integer.valueOf(dnr0Var.m112655C().m137085a()));
                            }
                            try {
                                if (iM215439b2 < 200 || iM215439b2 > 299) {
                                    throw new IOException();
                                }
                                return new pmr0(iM215439b2, bArr3, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listM215441d);
                            } catch (IOException e4) {
                                e = e4;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            bArr2 = bArr3;
                        }
                        bArr = bArr2;
                        if (e instanceof SocketTimeoutException) {
                            por0Var = new por0("socket", new zzaqi(), null);
                        } else {
                            if (e instanceof MalformedURLException) {
                                pkq0.m170054a("Bad URL ".concat(String.valueOf(dnr0Var.m112664o())), e);
                                return null;
                            }
                            if (ynr0Var == null) {
                                throw new zzapx(e);
                            }
                            iM215439b = ynr0Var.m215439b();
                            mnr0.m155558b("Unexpected response code %d for %s", Integer.valueOf(iM215439b), dnr0Var.m112664o());
                            if (bArr != null) {
                                bArr2 = null;
                                pmr0Var = new pmr0(iM215439b, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, ynr0Var.m215441d());
                                if (iM215439b == 401) {
                                }
                                por0Var = new por0("auth", new zzapi(pmr0Var), null);
                            } else {
                                por0Var = new por0("network", new zzapv(), null);
                            }
                        }
                        por0Var2 = por0Var;
                        imr0 imr0VarM112655C3 = dnr0Var.m112655C();
                        iM112656a = dnr0Var.m112656a();
                        imr0VarM112655C3.m137087c(por0Var2.f150558b);
                        dnr0Var.m112666q(String.format("%s-retry [timeout=%s]", por0Var2.f150557a, Integer.valueOf(iM112656a)));
                    } catch (IOException e6) {
                        e = e6;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e7) {
                e = e7;
            }
        }
    }
}

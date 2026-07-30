package p153l;

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
public class vwr0 implements tvr0 {

    /* JADX INFO: renamed from: a */
    public final uwr0 f186164a;

    /* JADX INFO: renamed from: b */
    public final xwr0 f186165b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final uwr0 f186166c;

    public vwr0(uwr0 uwr0Var) {
        xwr0 xwr0Var = new xwr0(4096);
        this.f186164a = uwr0Var;
        this.f186166c = uwr0Var;
        this.f186165b = xwr0Var;
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
    @Override // p153l.tvr0
    /* JADX INFO: renamed from: a */
    public vvr0 mo122393a(jwr0 jwr0Var) throws Throwable {
        exr0 exr0Var;
        byte[] bArr;
        byte[] bArr2;
        int iM123098b;
        vxr0 vxr0Var;
        vvr0 vvr0Var;
        vxr0 vxr0Var2;
        int iM147194a;
        Map map;
        byte[] byteArray;
        byte[] bArrM213437b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                kvr0 kvr0VarM147196f = jwr0Var.m147196f();
                if (kvr0VarM147196f == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str = kvr0VarM147196f.f128987b;
                    if (str != null) {
                        map2.put("If-None-Match", str);
                    }
                    long j = kvr0VarM147196f.f128989d;
                    if (j > 0) {
                        map2.put("If-Modified-Since", dxr0.m118510c(j));
                    }
                    map = map2;
                }
                String strM147202o = jwr0Var.m147202o();
                HashMap map3 = new HashMap();
                map3.putAll(map);
                map3.putAll(jwr0Var.mo147203p());
                URL url = new URL(strM147202o);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int iM147194a2 = jwr0Var.m147194a();
                httpURLConnection.setConnectTimeout(iM147194a2);
                httpURLConnection.setReadTimeout(iM147194a2);
                boolean z = false;
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str2 : map3.keySet()) {
                        httpURLConnection.setRequestProperty(str2, (String) map3.get(str2));
                    }
                    if (jwr0Var.zza() != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] bArrMo147192B = jwr0Var.mo147192B();
                        if (bArrMo147192B != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(bArrMo147192B);
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
                    jwr0Var.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        exr0Var = new exr0(responseCode, txr0.m193531a(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            exr0Var = new exr0(responseCode, txr0.m193531a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new fxr0(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    exr0Var = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        vxr0Var = new vxr0("socket", new zzaqi(), null);
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            vtq0.m202761a("Bad URL ".concat(String.valueOf(jwr0Var.m147202o())), e);
                                            return null;
                                        }
                                        if (exr0Var == null) {
                                            throw new zzapx(e);
                                        }
                                        iM123098b = exr0Var.m123098b();
                                        swr0.m188358b("Unexpected response code %d for %s", Integer.valueOf(iM123098b), jwr0Var.m147202o());
                                        if (bArr != null) {
                                            bArr2 = null;
                                            vvr0Var = new vvr0(iM123098b, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, exr0Var.m123100d());
                                            if (iM123098b == 401) {
                                            }
                                            vxr0Var = new vxr0("auth", new zzapi(vvr0Var), null);
                                        } else {
                                            vxr0Var = new vxr0("network", new zzapv(), null);
                                        }
                                    }
                                    vxr0Var2 = vxr0Var;
                                    ovr0 ovr0VarM147193C = jwr0Var.m147193C();
                                    iM147194a = jwr0Var.m147194a();
                                    try {
                                        ovr0VarM147193C.m169485c(vxr0Var2.f186298b);
                                        jwr0Var.m147204q(String.format("%s-retry [timeout=%s]", vxr0Var2.f186297a, Integer.valueOf(iM147194a)));
                                    } catch (zzaqj e2) {
                                        jwr0Var.m147204q(String.format("%s-timeout-giveup [timeout=%s]", vxr0Var2.f186297a, Integer.valueOf(iM147194a)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int iM123098b2 = exr0Var.m123098b();
                        List listM123100d = exr0Var.m123100d();
                        if (iM123098b2 == 304) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            kvr0 kvr0VarM147196f2 = jwr0Var.m147196f();
                            if (kvr0VarM147196f2 == null) {
                                return new vvr0(HttpStatus.NOT_MODIFIED_304, (byte[]) null, true, jElapsedRealtime2, listM123100d);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!listM123100d.isEmpty()) {
                                Iterator it = listM123100d.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((svr0) it.next()).m188224a());
                                }
                            }
                            ArrayList arrayList = new ArrayList(listM123100d);
                            List list = kvr0VarM147196f2.f128993h;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (svr0 svr0Var : kvr0VarM147196f2.f128993h) {
                                        if (!treeSet.contains(svr0Var.m188224a())) {
                                            arrayList.add(svr0Var);
                                        }
                                    }
                                }
                            } else if (!kvr0VarM147196f2.f128992g.isEmpty()) {
                                for (Map.Entry entry : kvr0VarM147196f2.f128992g.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new svr0((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new vvr0(HttpStatus.NOT_MODIFIED_304, kvr0VarM147196f2.f128986a, true, jElapsedRealtime2, (List) arrayList);
                        }
                        InputStream inputStreamM123099c = exr0Var.m123099c();
                        if (inputStreamM123099c != null) {
                            int iM123097a = exr0Var.m123097a();
                            try {
                                xwr0 xwr0Var = this.f186165b;
                                wxr0 wxr0Var = new wxr0(xwr0Var, iM123097a);
                                try {
                                    bArrM213437b = xwr0Var.m213437b(1024);
                                    while (true) {
                                        try {
                                            int i = inputStreamM123099c.read(bArrM213437b);
                                            if (i == -1) {
                                                break;
                                            }
                                            wxr0Var.write(bArrM213437b, 0, i);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                inputStreamM123099c.close();
                                            } catch (IOException unused) {
                                                swr0.m188360d("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            xwr0Var.m213436a(bArrM213437b);
                                            wxr0Var.close();
                                            throw th;
                                        }
                                        if (e instanceof SocketTimeoutException) {
                                            vxr0Var = new vxr0("socket", new zzaqi(), null);
                                        } else {
                                            if (e instanceof MalformedURLException) {
                                                vtq0.m202761a("Bad URL ".concat(String.valueOf(jwr0Var.m147202o())), e);
                                                return null;
                                            }
                                            if (exr0Var == null) {
                                                throw new zzapx(e);
                                            }
                                            iM123098b = exr0Var.m123098b();
                                            swr0.m188358b("Unexpected response code %d for %s", Integer.valueOf(iM123098b), jwr0Var.m147202o());
                                            if (bArr != null) {
                                                bArr2 = null;
                                                vvr0Var = new vvr0(iM123098b, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, exr0Var.m123100d());
                                                if (iM123098b == 401 && iM123098b != 403) {
                                                    if (iM123098b < 400 || iM123098b > 499) {
                                                        throw new zzaqh(vvr0Var);
                                                    }
                                                    throw new zzapn(vvr0Var);
                                                }
                                                vxr0Var = new vxr0("auth", new zzapi(vvr0Var), null);
                                            } else {
                                                vxr0Var = new vxr0("network", new zzapv(), null);
                                            }
                                        }
                                        vxr0Var2 = vxr0Var;
                                        ovr0 ovr0VarM147193C2 = jwr0Var.m147193C();
                                        iM147194a = jwr0Var.m147194a();
                                        ovr0VarM147193C2.m169485c(vxr0Var2.f186298b);
                                        jwr0Var.m147204q(String.format("%s-retry [timeout=%s]", vxr0Var2.f186297a, Integer.valueOf(iM147194a)));
                                    }
                                    byteArray = wxr0Var.toByteArray();
                                    try {
                                        inputStreamM123099c.close();
                                    } catch (IOException unused2) {
                                        swr0.m188360d("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    xwr0Var.m213436a(bArrM213437b);
                                    wxr0Var.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArrM213437b = null;
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
                            if (swr0.f171002b || jElapsedRealtime3 > 3000) {
                                swr0.m188357a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", jwr0Var, Long.valueOf(jElapsedRealtime3), bArr3 != null ? Integer.valueOf(bArr3.length) : "null", Integer.valueOf(iM123098b2), Integer.valueOf(jwr0Var.m147193C().m169483a()));
                            }
                            try {
                                if (iM123098b2 < 200 || iM123098b2 > 299) {
                                    throw new IOException();
                                }
                                return new vvr0(iM123098b2, bArr3, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listM123100d);
                            } catch (IOException e4) {
                                e = e4;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            bArr2 = bArr3;
                        }
                        bArr = bArr2;
                        if (e instanceof SocketTimeoutException) {
                            vxr0Var = new vxr0("socket", new zzaqi(), null);
                        } else {
                            if (e instanceof MalformedURLException) {
                                vtq0.m202761a("Bad URL ".concat(String.valueOf(jwr0Var.m147202o())), e);
                                return null;
                            }
                            if (exr0Var == null) {
                                throw new zzapx(e);
                            }
                            iM123098b = exr0Var.m123098b();
                            swr0.m188358b("Unexpected response code %d for %s", Integer.valueOf(iM123098b), jwr0Var.m147202o());
                            if (bArr != null) {
                                bArr2 = null;
                                vvr0Var = new vvr0(iM123098b, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, exr0Var.m123100d());
                                if (iM123098b == 401) {
                                }
                                vxr0Var = new vxr0("auth", new zzapi(vvr0Var), null);
                            } else {
                                vxr0Var = new vxr0("network", new zzapv(), null);
                            }
                        }
                        vxr0Var2 = vxr0Var;
                        ovr0 ovr0VarM147193C3 = jwr0Var.m147193C();
                        iM147194a = jwr0Var.m147194a();
                        ovr0VarM147193C3.m169485c(vxr0Var2.f186298b);
                        jwr0Var.m147204q(String.format("%s-retry [timeout=%s]", vxr0Var2.f186297a, Integer.valueOf(iM147194a)));
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

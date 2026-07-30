package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.tencent.connect.common.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mnq0 {

    /* JADX INFO: renamed from: a */
    public String f134771a;

    /* JADX INFO: renamed from: b */
    private long f134772b;

    /* JADX INFO: renamed from: d */
    public String f134774d;

    /* JADX INFO: renamed from: e */
    public String f134775e;

    /* JADX INFO: renamed from: f */
    public String f134776f;

    /* JADX INFO: renamed from: g */
    public String f134777g;

    /* JADX INFO: renamed from: h */
    public String f134778h;

    /* JADX INFO: renamed from: i */
    public String f134779i;

    /* JADX INFO: renamed from: j */
    protected String f134780j;

    /* JADX INFO: renamed from: k */
    private String f134781k;

    /* JADX INFO: renamed from: c */
    private ArrayList<unq0> f134773c = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    private double f134782l = 0.1d;

    /* JADX INFO: renamed from: m */
    private String f134783m = "s.mi1.cc";

    /* JADX INFO: renamed from: n */
    private long f134784n = 86400000;

    public mnq0(String str) {
        this.f134771a = "";
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("the host is empty");
            throw null;
        }
        this.f134772b = System.currentTimeMillis();
        this.f134773c.add(new unq0(str, -1));
        this.f134771a = rnq0.m180123a();
        this.f134774d = str;
    }

    /* JADX INFO: renamed from: v */
    private synchronized void m155533v(String str) {
        Iterator<unq0> it = this.f134773c.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f177422b, str)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m155534a() {
        if (!TextUtils.isEmpty(this.f134781k)) {
            return this.f134781k;
        }
        if (TextUtils.isEmpty(this.f134777g)) {
            return "hardcode_isp";
        }
        String strM198844g = vlq0.m198844g(new String[]{this.f134777g, this.f134775e, this.f134776f, this.f134779i, this.f134778h}, "_");
        this.f134781k = strM198844g;
        return strM198844g;
    }

    /* JADX INFO: renamed from: b */
    public synchronized ArrayList<String> m155535b() {
        return mo155537d(false);
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<String> m155536c(String str) {
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("the url is empty.");
            return null;
        }
        URL url = new URL(str);
        if (!TextUtils.equals(url.getHost(), this.f134774d)) {
            ig3.m135964a("the url is not supported by the fallback");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = mo155537d(true).iterator();
        while (it.hasNext()) {
            onq0 onq0VarM165225d = onq0.m165225d(it.next(), url.getPort());
            arrayList.add(new URL(url.getProtocol(), onq0VarM165225d.m165227b(), onq0VarM165225d.m165226a(), url.getFile()).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public synchronized ArrayList<String> mo155537d(boolean z) {
        ArrayList<String> arrayList;
        try {
            int size = this.f134773c.size();
            unq0[] unq0VarArr = new unq0[size];
            this.f134773c.toArray(unq0VarArr);
            Arrays.sort(unq0VarArr);
            arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                unq0 unq0Var = unq0VarArr[i];
                if (z) {
                    arrayList.add(unq0Var.f177422b);
                } else {
                    int iIndexOf = unq0Var.f177422b.indexOf(":");
                    String str = unq0Var.f177422b;
                    if (iIndexOf != -1) {
                        arrayList.add(str.substring(0, iIndexOf));
                    } else {
                        arrayList.add(str);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public synchronized mnq0 m155538e(JSONObject jSONObject) {
        this.f134771a = jSONObject.optString("net");
        this.f134784n = jSONObject.getLong("ttl");
        this.f134782l = jSONObject.getDouble("pct");
        this.f134772b = jSONObject.getLong(Constants.f57189TS);
        this.f134776f = jSONObject.optString(RankLevel.city);
        this.f134775e = jSONObject.optString("prv");
        this.f134779i = jSONObject.optString("cty");
        this.f134777g = jSONObject.optString("isp");
        this.f134778h = jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        this.f134774d = jSONObject.optString("host");
        this.f134780j = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            m155547n(new unq0().m194477b(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public synchronized JSONObject m155539f() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("net", this.f134771a);
            jSONObject.put("ttl", this.f134784n);
            jSONObject.put("pct", this.f134782l);
            jSONObject.put(Constants.f57189TS, this.f134772b);
            jSONObject.put(RankLevel.city, this.f134776f);
            jSONObject.put("prv", this.f134775e);
            jSONObject.put("cty", this.f134779i);
            jSONObject.put("isp", this.f134777g);
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f134778h);
            jSONObject.put("host", this.f134774d);
            jSONObject.put("xf", this.f134780j);
            JSONArray jSONArray = new JSONArray();
            Iterator<unq0> it = this.f134773c.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m194478f());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public void m155540g(double d) {
        this.f134782l = d;
    }

    /* JADX INFO: renamed from: h */
    public void m155541h(long j) {
        if (j > 0) {
            this.f134784n = j;
        } else {
            y3g0.m212802a("the duration is invalid ", j);
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m155542i(String str) {
        m155547n(new unq0(str));
    }

    /* JADX INFO: renamed from: j */
    public void m155543j(String str, int i, long j, long j2, Exception exc) {
        mo155546m(str, new lnq0(i, j, j2, exc));
    }

    /* JADX INFO: renamed from: k */
    public void m155544k(String str, long j, long j2) {
        try {
            m155552s(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public void m155545l(String str, long j, long j2, Exception exc) {
        try {
            m155553t(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized void mo155546m(String str, lnq0 lnq0Var) {
        for (unq0 unq0Var : this.f134773c) {
            if (TextUtils.equals(str, unq0Var.f177422b)) {
                unq0Var.m194479g(lnq0Var);
                break;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m155547n(unq0 unq0Var) {
        m155533v(unq0Var.f177422b);
        this.f134773c.add(unq0Var);
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m155548o(String[] strArr) {
        int i;
        try {
            int size = this.f134773c.size() - 1;
            while (true) {
                i = 0;
                if (size < 0) {
                    break;
                }
                int length = strArr.length;
                while (i < length) {
                    if (TextUtils.equals(this.f134773c.get(size).f177422b, strArr[i])) {
                        this.f134773c.remove(size);
                        break;
                    }
                    i++;
                }
                size--;
            }
            Iterator<unq0> it = this.f134773c.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = it.next().f177424d;
                if (i3 > i2) {
                    i2 = i3;
                }
            }
            while (i < strArr.length) {
                m155547n(new unq0(strArr[i], (strArr.length + i2) - i));
                i++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m155549p() {
        return TextUtils.equals(this.f134771a, rnq0.m180123a());
    }

    /* JADX INFO: renamed from: q */
    public boolean m155550q(mnq0 mnq0Var) {
        return TextUtils.equals(this.f134771a, mnq0Var.f134771a);
    }

    /* JADX INFO: renamed from: r */
    public void m155551r(String str) {
        this.f134783m = str;
    }

    /* JADX INFO: renamed from: s */
    public void m155552s(String str, long j, long j2) {
        m155543j(str, 0, j, j2, null);
    }

    /* JADX INFO: renamed from: t */
    public void m155553t(String str, long j, long j2, Exception exc) {
        m155543j(str, -1, j, j2, exc);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f134771a);
        sb.append(SignParameters.NEW_LINE);
        sb.append(m155534a());
        for (unq0 unq0Var : this.f134773c) {
            sb.append(SignParameters.NEW_LINE);
            sb.append(unq0Var.toString());
        }
        sb.append(SignParameters.NEW_LINE);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean mo155554u() {
        return System.currentTimeMillis() - this.f134772b < this.f134784n;
    }

    /* JADX INFO: renamed from: w */
    public boolean m155555w() {
        long j = this.f134784n;
        if (864000000 >= j) {
            j = 864000000;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f134772b;
        if (jCurrentTimeMillis - j2 <= j) {
            return jCurrentTimeMillis - j2 > this.f134784n && this.f134771a.startsWith("WIFI-");
        }
        return true;
    }
}

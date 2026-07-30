package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.core.data.RankLevel;
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
public class swq0 {

    /* JADX INFO: renamed from: a */
    public String f170987a;

    /* JADX INFO: renamed from: b */
    private long f170988b;

    /* JADX INFO: renamed from: d */
    public String f170990d;

    /* JADX INFO: renamed from: e */
    public String f170991e;

    /* JADX INFO: renamed from: f */
    public String f170992f;

    /* JADX INFO: renamed from: g */
    public String f170993g;

    /* JADX INFO: renamed from: h */
    public String f170994h;

    /* JADX INFO: renamed from: i */
    public String f170995i;

    /* JADX INFO: renamed from: j */
    protected String f170996j;

    /* JADX INFO: renamed from: k */
    private String f170997k;

    /* JADX INFO: renamed from: c */
    private ArrayList<axq0> f170989c = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    private double f170998l = 0.1d;

    /* JADX INFO: renamed from: m */
    private String f170999m = "s.mi1.cc";

    /* JADX INFO: renamed from: n */
    private long f171000n = 86400000;

    public swq0(String str) {
        this.f170987a = "";
        if (TextUtils.isEmpty(str)) {
            wg3.m206174a("the host is empty");
            throw null;
        }
        this.f170988b = System.currentTimeMillis();
        this.f170989c.add(new axq0(str, -1));
        this.f170987a = xwq0.m213392a();
        this.f170990d = str;
    }

    /* JADX INFO: renamed from: v */
    private synchronized void m188333v(String str) {
        Iterator<axq0> it = this.f170989c.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f73882b, str)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m188334a() {
        if (!TextUtils.isEmpty(this.f170997k)) {
            return this.f170997k;
        }
        if (TextUtils.isEmpty(this.f170993g)) {
            return "hardcode_isp";
        }
        String strM106593g = bvq0.m106593g(new String[]{this.f170993g, this.f170991e, this.f170992f, this.f170995i, this.f170994h}, "_");
        this.f170997k = strM106593g;
        return strM106593g;
    }

    /* JADX INFO: renamed from: b */
    public synchronized ArrayList<String> m188335b() {
        return mo188337d(false);
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<String> m188336c(String str) {
        if (TextUtils.isEmpty(str)) {
            wg3.m206174a("the url is empty.");
            return null;
        }
        URL url = new URL(str);
        if (!TextUtils.equals(url.getHost(), this.f170990d)) {
            wg3.m206174a("the url is not supported by the fallback");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = mo188337d(true).iterator();
        while (it.hasNext()) {
            uwq0 uwq0VarM198388d = uwq0.m198388d(it.next(), url.getPort());
            arrayList.add(new URL(url.getProtocol(), uwq0VarM198388d.m198390b(), uwq0VarM198388d.m198389a(), url.getFile()).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public synchronized ArrayList<String> mo188337d(boolean z) {
        ArrayList<String> arrayList;
        try {
            int size = this.f170989c.size();
            axq0[] axq0VarArr = new axq0[size];
            this.f170989c.toArray(axq0VarArr);
            Arrays.sort(axq0VarArr);
            arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                axq0 axq0Var = axq0VarArr[i];
                if (z) {
                    arrayList.add(axq0Var.f73882b);
                } else {
                    int iIndexOf = axq0Var.f73882b.indexOf(":");
                    String str = axq0Var.f73882b;
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
    public synchronized swq0 m188338e(JSONObject jSONObject) {
        this.f170987a = jSONObject.optString("net");
        this.f171000n = jSONObject.getLong("ttl");
        this.f170998l = jSONObject.getDouble("pct");
        this.f170988b = jSONObject.getLong(Constants.f58037TS);
        this.f170992f = jSONObject.optString(RankLevel.city);
        this.f170991e = jSONObject.optString("prv");
        this.f170995i = jSONObject.optString("cty");
        this.f170993g = jSONObject.optString("isp");
        this.f170994h = jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        this.f170990d = jSONObject.optString("host");
        this.f170996j = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            m188347n(new axq0().m100784b(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public synchronized JSONObject m188339f() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("net", this.f170987a);
            jSONObject.put("ttl", this.f171000n);
            jSONObject.put("pct", this.f170998l);
            jSONObject.put(Constants.f58037TS, this.f170988b);
            jSONObject.put(RankLevel.city, this.f170992f);
            jSONObject.put("prv", this.f170991e);
            jSONObject.put("cty", this.f170995i);
            jSONObject.put("isp", this.f170993g);
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f170994h);
            jSONObject.put("host", this.f170990d);
            jSONObject.put("xf", this.f170996j);
            JSONArray jSONArray = new JSONArray();
            Iterator<axq0> it = this.f170989c.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m100785f());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public void m188340g(double d) {
        this.f170998l = d;
    }

    /* JADX INFO: renamed from: h */
    public void m188341h(long j) {
        if (j > 0) {
            this.f171000n = j;
        } else {
            fcg0.m125008a("the duration is invalid ", j);
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m188342i(String str) {
        m188347n(new axq0(str));
    }

    /* JADX INFO: renamed from: j */
    public void m188343j(String str, int i, long j, long j2, Exception exc) {
        mo188346m(str, new rwq0(i, j, j2, exc));
    }

    /* JADX INFO: renamed from: k */
    public void m188344k(String str, long j, long j2) {
        try {
            m188352s(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public void m188345l(String str, long j, long j2, Exception exc) {
        try {
            m188353t(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized void mo188346m(String str, rwq0 rwq0Var) {
        for (axq0 axq0Var : this.f170989c) {
            if (TextUtils.equals(str, axq0Var.f73882b)) {
                axq0Var.m100786g(rwq0Var);
                break;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m188347n(axq0 axq0Var) {
        m188333v(axq0Var.f73882b);
        this.f170989c.add(axq0Var);
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m188348o(String[] strArr) {
        int i;
        try {
            int size = this.f170989c.size() - 1;
            while (true) {
                i = 0;
                if (size < 0) {
                    break;
                }
                int length = strArr.length;
                while (i < length) {
                    if (TextUtils.equals(this.f170989c.get(size).f73882b, strArr[i])) {
                        this.f170989c.remove(size);
                        break;
                    }
                    i++;
                }
                size--;
            }
            Iterator<axq0> it = this.f170989c.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = it.next().f73884d;
                if (i3 > i2) {
                    i2 = i3;
                }
            }
            while (i < strArr.length) {
                m188347n(new axq0(strArr[i], (strArr.length + i2) - i));
                i++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m188349p() {
        return TextUtils.equals(this.f170987a, xwq0.m213392a());
    }

    /* JADX INFO: renamed from: q */
    public boolean m188350q(swq0 swq0Var) {
        return TextUtils.equals(this.f170987a, swq0Var.f170987a);
    }

    /* JADX INFO: renamed from: r */
    public void m188351r(String str) {
        this.f170999m = str;
    }

    /* JADX INFO: renamed from: s */
    public void m188352s(String str, long j, long j2) {
        m188343j(str, 0, j, j2, null);
    }

    /* JADX INFO: renamed from: t */
    public void m188353t(String str, long j, long j2, Exception exc) {
        m188343j(str, -1, j, j2, exc);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f170987a);
        sb.append(SignParameters.NEW_LINE);
        sb.append(m188334a());
        for (axq0 axq0Var : this.f170989c) {
            sb.append(SignParameters.NEW_LINE);
            sb.append(axq0Var.toString());
        }
        sb.append(SignParameters.NEW_LINE);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean mo188354u() {
        return System.currentTimeMillis() - this.f170988b < this.f171000n;
    }

    /* JADX INFO: renamed from: w */
    public boolean m188355w() {
        long j = this.f171000n;
        if (864000000 >= j) {
            j = 864000000;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f170988b;
        if (jCurrentTimeMillis - j2 <= j) {
            return jCurrentTimeMillis - j2 > this.f171000n && this.f170987a.startsWith("WIFI-");
        }
        return true;
    }
}

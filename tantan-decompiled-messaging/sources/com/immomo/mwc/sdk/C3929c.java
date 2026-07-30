package com.immomo.mwc.sdk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.quickjs.QuickJSException;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.immomo.mwc.sdk.c */
/* JADX INFO: loaded from: classes7.dex */
public class C3929c {

    /* JADX INFO: renamed from: a */
    private String f14025a;

    /* JADX INFO: renamed from: b */
    private String f14026b;

    /* JADX INFO: renamed from: c */
    private MWCEngine.CodeType f14027c;

    /* JADX INFO: renamed from: d */
    private String f14028d;

    /* JADX INFO: renamed from: e */
    private JSONObject f14029e;

    /* JADX INFO: renamed from: f */
    private String f14030f;

    /* JADX INFO: renamed from: g */
    private String f14031g;

    /* JADX INFO: renamed from: h */
    private String f14032h;

    /* JADX INFO: renamed from: j */
    private String m19437j(String str) {
        String host;
        if (TextUtils.isEmpty(str)) {
            host = "";
        } else {
            try {
                host = new URL(str).getHost();
            } catch (MalformedURLException e) {
                MWCEngine.m19382m("MWCWorker", this.f14026b, "parse MWCWorker.data.url=`%s` to MWCWorker.originHost exception @url=%s, @error=%s", str, e);
                host = "";
            }
        }
        if (TextUtils.isEmpty(host)) {
            MWCEngine.m19382m("MWCWorker", this.f14026b, "parse MWCWorker.data.url=`%s` to empty MWCWorker.originHost", str);
        }
        return host;
    }

    /* JADX INFO: renamed from: a */
    public boolean m19438a(MWCEngine.CodeType codeType) {
        return codeType == this.f14027c;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public MWCEngine.CodeType m19439b() {
        return this.f14027c;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public JSONObject m19440c() {
        return this.f14029e;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m19441d() {
        return this.f14032h;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public String m19442e() {
        return this.f14025a;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public String m19443f() {
        return this.f14028d;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public String m19444g() {
        return this.f14031g;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public String m19445h() {
        return this.f14030f;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public String m19446i() {
        return this.f14026b;
    }

    /* JADX INFO: renamed from: k */
    public C3929c m19447k(@NonNull MWCEngine.CodeType codeType) {
        this.f14027c = codeType;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C3929c m19448l(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f14029e = jSONObject;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C3929c m19449m(@NonNull String str) {
        this.f14025a = str;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C3929c m19450n(String str) {
        this.f14028d = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C3929c m19451o(@NonNull String str) {
        this.f14031g = str;
        this.f14032h = m19437j(str);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C3929c m19452p(@Nullable String str) {
        this.f14030f = str;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C3929c m19453q(@NonNull String str) {
        this.f14026b = str;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m19454r() throws QuickJSException {
        return Boolean.TRUE.equals(MWCEngine.m19386q().mo19398c(String.format("cs$%s('%s', %s);", this.f14025a, this.f14026b, this.f14029e.toString()), String.format("cs$%s.js", this.f14025a)));
    }

    public String toString() {
        return "MWCWorker{serviceId='" + this.f14025a + "', workerId='" + this.f14026b + "', codeType=" + this.f14027c + ", servicePath='" + this.f14028d + "', data=" + this.f14029e + ", version='" + this.f14030f + "', url='" + this.f14031g + "', originHost='" + this.f14032h + "'}";
    }
}

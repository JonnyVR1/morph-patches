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
public class C4072c {

    /* JADX INFO: renamed from: a */
    private String f14719a;

    /* JADX INFO: renamed from: b */
    private String f14720b;

    /* JADX INFO: renamed from: c */
    private MWCEngine.CodeType f14721c;

    /* JADX INFO: renamed from: d */
    private String f14722d;

    /* JADX INFO: renamed from: e */
    private JSONObject f14723e;

    /* JADX INFO: renamed from: f */
    private String f14724f;

    /* JADX INFO: renamed from: g */
    private String f14725g;

    /* JADX INFO: renamed from: h */
    private String f14726h;

    /* JADX INFO: renamed from: j */
    private String m20417j(String str) {
        String host;
        if (TextUtils.isEmpty(str)) {
            host = "";
        } else {
            try {
                host = new URL(str).getHost();
            } catch (MalformedURLException e) {
                MWCEngine.m20362m("MWCWorker", this.f14720b, "parse MWCWorker.data.url=`%s` to MWCWorker.originHost exception @url=%s, @error=%s", str, e);
                host = "";
            }
        }
        if (TextUtils.isEmpty(host)) {
            MWCEngine.m20362m("MWCWorker", this.f14720b, "parse MWCWorker.data.url=`%s` to empty MWCWorker.originHost", str);
        }
        return host;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20418a(MWCEngine.CodeType codeType) {
        return codeType == this.f14721c;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public MWCEngine.CodeType m20419b() {
        return this.f14721c;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public JSONObject m20420c() {
        return this.f14723e;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m20421d() {
        return this.f14726h;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public String m20422e() {
        return this.f14719a;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public String m20423f() {
        return this.f14722d;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public String m20424g() {
        return this.f14725g;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public String m20425h() {
        return this.f14724f;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public String m20426i() {
        return this.f14720b;
    }

    /* JADX INFO: renamed from: k */
    public C4072c m20427k(@NonNull MWCEngine.CodeType codeType) {
        this.f14721c = codeType;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C4072c m20428l(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f14723e = jSONObject;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C4072c m20429m(@NonNull String str) {
        this.f14719a = str;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C4072c m20430n(String str) {
        this.f14722d = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C4072c m20431o(@NonNull String str) {
        this.f14725g = str;
        this.f14726h = m20417j(str);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C4072c m20432p(@Nullable String str) {
        this.f14724f = str;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C4072c m20433q(@NonNull String str) {
        this.f14720b = str;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m20434r() throws QuickJSException {
        return Boolean.TRUE.equals(MWCEngine.m20366q().mo20378c(String.format("cs$%s('%s', %s);", this.f14719a, this.f14720b, this.f14723e.toString()), String.format("cs$%s.js", this.f14719a)));
    }

    public String toString() {
        return "MWCWorker{serviceId='" + this.f14719a + "', workerId='" + this.f14720b + "', codeType=" + this.f14721c + ", servicePath='" + this.f14722d + "', data=" + this.f14723e + ", version='" + this.f14724f + "', url='" + this.f14725g + "', originHost='" + this.f14726h + "'}";
    }
}

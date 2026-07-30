package com.immomo.android.network.metrics;

import android.app.Application;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p153l.d7e;
import p153l.o4f0;
import p153l.ok20;
import p153l.vv5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010-\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u00100\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u00101R(\u00108\u001a\b\u0012\u0004\u0012\u00020\u0004038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u001bR\"\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010;R\"\u0010?\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010%\u001a\u0004\b=\u0010'\"\u0004\b>\u0010)R\u0011\u0010A\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b@\u0010\f¨\u0006B"}, m88121d2 = {"Lcom/immomo/android/network/metrics/Strategy;", "", "<init>", "()V", "", "paramStr", "(Ljava/lang/String;)V", "", "n", Constants.INAPP_DATA_TAG, "e", "f", "()Ljava/lang/String;", "u", "c", "(Ljava/lang/String;)Ljava/lang/String;", "json", "g", "(Ljava/lang/String;)Lcom/immomo/android/network/metrics/Strategy;", "domain", "Lkotlin/Pair;", "", "o", "(Ljava/lang/String;)Lkotlin/Pair;", "", "newDomains", "p", "(Ljava/util/Set;)V", "a", "Z", RXScreenCaptureService.KEY_INDEX, "()Z", "q", "(Z)V", "enabled", "", "b", "I", "m", "()I", Constants.KEY_T, "(I)V", "successRate", "k", BLiveStormDanmakuGiftResourceType.f45294s, "errorRate", "j", "r", "errorMaxTime", "Ljava/lang/String;", "defaultHost", "", "Ljava/util/Set;", "h", "()Ljava/util/Set;", "setConfigDomains", "configDomains", "", "Ll/d7e;", "Ljava/util/Map;", "domainMatchers", "getErrorCount", "setErrorCount", "errorCount", BLiveStormDanmakuGiftResourceType.f45292l, "HOST", "sdk_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class Strategy {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int successRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int errorRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int errorMaxTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String defaultHost;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private Set<String> configDomains;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Map<String, d7e> domainMatchers;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private volatile int errorCount;

    public Strategy() {
        String strM166000a;
        this.successRate = 5;
        this.errorRate = 100;
        this.errorMaxTime = 10000;
        this.defaultHost = "app-monitor.spacecape.com";
        this.configDomains = new LinkedHashSet();
        this.domainMatchers = new LinkedHashMap();
        m19319n();
        Application applicationM19252c = NetworkMetricsStatistics.INSTANCE.m19252c();
        if (applicationM19252c == null || (strM166000a = o4f0.INSTANCE.m166000a(applicationM19252c, "MMNetworkMetrics4Android_STRATEGY", "")) == null || StringsKt.m94329e0(strM166000a)) {
            return;
        }
        m19323g(strM166000a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m19318d() {
        this.configDomains.remove(m19328l());
        Set<String> setMutableSetOf = SetsKt.mutableSetOf(m19328l());
        setMutableSetOf.addAll(this.configDomains);
        this.configDomains = setMutableSetOf;
    }

    /* JADX INFO: renamed from: n */
    private final void m19319n() {
        this.configDomains = SetsKt.mutableSetOf(m19328l());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m19320c(@NotNull String str) {
        str.getClass();
        if (C15493d.m94374J(str, "http://", false, 2, null) || C15493d.m94374J(str, "https://", false, 2, null)) {
            return str;
        }
        return "https://" + str;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m19321e() {
        try {
            if (this.errorCount >= this.configDomains.size()) {
                this.errorCount = 0;
            } else {
                this.errorCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m19322f() {
        if (this.errorCount >= this.configDomains.size()) {
            return m19320c(m19328l()) + "/v1/appconfig";
        }
        return m19320c((String) CollectionsKt.elementAt(this.configDomains, this.errorCount % this.configDomains.size())) + "/v1/appconfig";
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Strategy m19323g(@NotNull final String json) {
        json.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.Strategy$fromJson$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                JSONObject jSONObject = new JSONObject(json);
                this.this$0.m19332q(jSONObject.optBoolean("enabled", false));
                this.this$0.m19335t(jSONObject.optInt("success_rate", 0));
                this.this$0.m19334s(jSONObject.optInt("error_rate", 0));
                this.this$0.m19333r(jSONObject.optInt("error_max_time", 0));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("config_domains");
                if (jSONArrayOptJSONArray != null) {
                    this.this$0.m19324h().clear();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Set<String> setM19324h = this.this$0.m19324h();
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        strOptString.getClass();
                        setM19324h.add(strOptString);
                    }
                }
                this.this$0.m19318d();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("domains");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    itKeys.getClass();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object objOpt = jSONObjectOptJSONObject.opt(next);
                        if (objOpt instanceof JSONArray) {
                            ArrayList arrayList = new ArrayList();
                            JSONArray jSONArray = (JSONArray) objOpt;
                            int length2 = jSONArray.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                String strOptString2 = jSONArray.optString(i2);
                                strOptString2.getClass();
                                if (!StringsKt.m94329e0(strOptString2)) {
                                    arrayList.add(strOptString2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                next.getClass();
                                linkedHashMap.put(next, new d7e(arrayList, CollectionsKt.emptyList()));
                            }
                        }
                    }
                }
                this.this$0.domainMatchers = linkedHashMap;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Set<String> m19324h() {
        return this.configDomains;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getErrorMaxTime() {
        return this.errorMaxTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getErrorRate() {
        return this.errorRate;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final String m19328l() {
        String host;
        vv5 vv5VarM19253d = NetworkMetricsStatistics.INSTANCE.m19253d();
        return (vv5VarM19253d == null || (host = vv5VarM19253d.getHost()) == null) ? this.defaultHost : host;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getSuccessRate() {
        return this.successRate;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final Pair<Boolean, String> m19330o(@NotNull String domain) {
        domain.getClass();
        for (Map.Entry<String, d7e> entry : this.domainMatchers.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().m114726a(domain)) {
                return new Pair<>(Boolean.TRUE, key);
            }
        }
        return new Pair<>(Boolean.FALSE, "");
    }

    /* JADX INFO: renamed from: p */
    public final void m19331p(@NotNull Set<String> newDomains) {
        newDomains.getClass();
        this.configDomains = CollectionsKt.toMutableSet(newDomains);
    }

    /* JADX INFO: renamed from: q */
    public final void m19332q(boolean z) {
        this.enabled = z;
    }

    /* JADX INFO: renamed from: r */
    public final void m19333r(int i) {
        this.errorMaxTime = i;
    }

    /* JADX INFO: renamed from: s */
    public final void m19334s(int i) {
        this.errorRate = i;
    }

    /* JADX INFO: renamed from: t */
    public final void m19335t(int i) {
        this.successRate = i;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final String m19336u() {
        if (this.errorCount >= this.configDomains.size()) {
            return m19320c(m19328l()) + "/v1/monitor";
        }
        return m19320c((String) CollectionsKt.elementAt(this.configDomains, this.errorCount % this.configDomains.size())) + "/v1/monitor";
    }

    public Strategy(@NotNull String str) {
        str.getClass();
        this.successRate = 5;
        this.errorRate = 100;
        this.errorMaxTime = 10000;
        this.defaultHost = "app-monitor.spacecape.com";
        this.configDomains = new LinkedHashSet();
        this.domainMatchers = new LinkedHashMap();
        m19319n();
        m19323g(str);
    }
}

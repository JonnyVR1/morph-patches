package com.facebook.appevents;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.internal.AttributionIdentifiers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.sse0;

/* JADX INFO: renamed from: com.facebook.appevents.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Lcom/facebook/appevents/b;", "", "<init>", "()V", "Lcom/facebook/appevents/PersistedEvents;", "persistedEvents", "", "b", "(Lcom/facebook/appevents/PersistedEvents;)V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppIdPair", "Lcom/facebook/appevents/AppEvent;", "appEvent", "a", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/AppEvent;)V", "", "f", "()Ljava/util/Set;", "Ll/sse0;", "c", "(Lcom/facebook/appevents/AccessTokenAppIdPair;)Ll/sse0;", "accessTokenAppId", "e", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "stateMap", "", Constants.INAPP_DATA_TAG, "()I", "eventCount", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class C1560b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HashMap<AccessTokenAppIdPair, sse0> stateMap = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final synchronized void m7712a(@NotNull AccessTokenAppIdPair accessTokenAppIdPair, @NotNull AppEvent appEvent) {
        accessTokenAppIdPair.getClass();
        appEvent.getClass();
        sse0 sse0VarM7716e = m7716e(accessTokenAppIdPair);
        if (sse0VarM7716e != null) {
            sse0VarM7716e.m187701a(appEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7713b(@Nullable PersistedEvents persistedEvents) {
        if (persistedEvents == null) {
            return;
        }
        for (Map.Entry<AccessTokenAppIdPair, List<AppEvent>> entry : persistedEvents.entrySet()) {
            sse0 sse0VarM7716e = m7716e(entry.getKey());
            if (sse0VarM7716e != null) {
                Iterator<AppEvent> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    sse0VarM7716e.m187701a(it.next());
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized sse0 m7714c(@NotNull AccessTokenAppIdPair accessTokenAppIdPair) {
        accessTokenAppIdPair.getClass();
        return this.stateMap.get(accessTokenAppIdPair);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m7715d() {
        int iM187703c;
        Iterator<sse0> it = this.stateMap.values().iterator();
        iM187703c = 0;
        while (it.hasNext()) {
            iM187703c += it.next().m187703c();
        }
        return iM187703c;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized sse0 m7716e(AccessTokenAppIdPair accessTokenAppId) {
        Context contextM8101l;
        AttributionIdentifiers attributionIdentifiersM8706e;
        sse0 sse0Var = this.stateMap.get(accessTokenAppId);
        if (sse0Var == null && (attributionIdentifiersM8706e = AttributionIdentifiers.INSTANCE.m8706e((contextM8101l = C1600c.m8101l()))) != null) {
            sse0Var = new sse0(attributionIdentifiersM8706e, AppEventsLogger.INSTANCE.m7702c(contextM8101l));
        }
        if (sse0Var == null) {
            return null;
        }
        this.stateMap.put(accessTokenAppId, sse0Var);
        return sse0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final synchronized Set<AccessTokenAppIdPair> m7717f() {
        Set<AccessTokenAppIdPair> setKeySet;
        setKeySet = this.stateMap.keySet();
        setKeySet.getClass();
        return setKeySet;
    }
}

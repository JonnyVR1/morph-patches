package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ztb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000  2\u00020\u0001:\u0002!\"B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0016\u0012.\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b¢\u0006\u0004\b\u0002\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00110\u000e¢\u0006\u0004\b\u0012\u0010\u0010J \u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0004\b\u001c\u0010\u001dR<\u0010\u001e\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m88121d2 = {"Lcom/facebook/appevents/PersistedEvents;", "Ljava/io/Serializable;", "<init>", "()V", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "", "Lcom/facebook/appevents/AppEvent;", "Lkotlin/collections/HashMap;", "appEventMap", "(Ljava/util/HashMap;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "keySet", "()Ljava/util/Set;", "", "entrySet", "accessTokenAppIdPair", "", "get", "(Lcom/facebook/appevents/AccessTokenAppIdPair;)Ljava/util/List;", "", "containsKey", "(Lcom/facebook/appevents/AccessTokenAppIdPair;)Z", "appEvents", "", "addEvents", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Ljava/util/List;)V", "events", "Ljava/util/HashMap;", "Companion", "a", "SerializationProxyV1", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class PersistedEvents implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    @NotNull
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB7\u0012.\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR<\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0010"}, m88121d2 = {"Lcom/facebook/appevents/PersistedEvents$SerializationProxyV1;", "Ljava/io/Serializable;", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "", "Lcom/facebook/appevents/AppEvent;", "Lkotlin/collections/HashMap;", "proxyEvents", "<init>", "(Ljava/util/HashMap;)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/util/HashMap;", "Companion", "a", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = 20160629001L;

        @NotNull
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        public SerializationProxyV1(@NotNull HashMap<AccessTokenAppIdPair, List<AppEvent>> map) {
            map.getClass();
            this.proxyEvents = map;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    public PersistedEvents(@NotNull HashMap<AccessTokenAppIdPair, List<AppEvent>> map) {
        map.getClass();
        HashMap<AccessTokenAppIdPair, List<AppEvent>> map2 = new HashMap<>();
        this.events = map2;
        map2.putAll(map);
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.events);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    public final void addEvents(@NotNull AccessTokenAppIdPair accessTokenAppIdPair, @NotNull List<AppEvent> appEvents) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            appEvents.getClass();
            boolean zContainsKey = this.events.containsKey(accessTokenAppIdPair);
            HashMap<AccessTokenAppIdPair, List<AppEvent>> map = this.events;
            if (!zContainsKey) {
                map.put(accessTokenAppIdPair, CollectionsKt.toMutableList((Collection) appEvents));
                return;
            }
            List<AppEvent> list = map.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public final boolean containsKey(@NotNull AccessTokenAppIdPair accessTokenAppIdPair) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            accessTokenAppIdPair.getClass();
            return this.events.containsKey(accessTokenAppIdPair);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    @NotNull
    public final Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> setEntrySet = this.events.entrySet();
            setEntrySet.getClass();
            return setEntrySet;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @Nullable
    public final List<AppEvent> get(@NotNull AccessTokenAppIdPair accessTokenAppIdPair) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            accessTokenAppIdPair.getClass();
            return this.events.get(accessTokenAppIdPair);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @NotNull
    public final Set<AccessTokenAppIdPair> keySet() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            Set<AccessTokenAppIdPair> setKeySet = this.events.keySet();
            setKeySet.getClass();
            return setKeySet;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }
}

package androidx.datastore.preferences.core;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hq80;
import p153l.p7f;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001c\u001a\u00020\n2\u001a\u0010\u001b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0019\"\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001e\u0010\u0011J\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010\u0014R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,¨\u0006."}, m88121d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Ll/hq80;", "", "Ll/hq80$a;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "", "e", "()V", "g", p7f.GPS_DIRECTION_TRUE, Constants.KEY_KEY, "b", "(Ll/hq80$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "value", "j", "(Ll/hq80$a;Ljava/lang/Object;)V", "k", "", "Ll/hq80$b;", "pairs", "h", "([Ll/hq80$b;)V", RXScreenCaptureService.KEY_INDEX, "f", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "frozen", "datastore-preferences-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class MutablePreferences extends hq80 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<hq80.C17536a<?>, Object> preferencesMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean frozen;

    public /* synthetic */ MutablePreferences(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    @Override // p153l.hq80
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<hq80.C17536a<?>, Object> mo1480a() {
        Map<hq80.C17536a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.preferencesMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    @Override // p153l.hq80
    @Nullable
    /* JADX INFO: renamed from: b */
    public <T> T mo1481b(@NotNull hq80.C17536a<T> key) {
        key.getClass();
        return (T) this.preferencesMap.get(key);
    }

    /* JADX INFO: renamed from: e */
    public final void m1482e() {
        if (this.frozen.get()) {
            wtq0.m207906a("Do mutate preferences once returned to DataStore.");
        }
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof MutablePreferences) {
            return Intrinsics.m88377d(this.preferencesMap, ((MutablePreferences) other).preferencesMap);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m1483f() {
        m1482e();
        this.preferencesMap.clear();
    }

    /* JADX INFO: renamed from: g */
    public final void m1484g() {
        this.frozen.set(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m1485h(@NotNull hq80.C17537b<?>... pairs) {
        pairs.getClass();
        m1482e();
        for (hq80.C17537b<?> c17537b : pairs) {
            m1488k(c17537b.m136607a(), c17537b.m136608b());
        }
    }

    public int hashCode() {
        return this.preferencesMap.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final <T> T m1486i(@NotNull hq80.C17536a<T> key) {
        key.getClass();
        m1482e();
        return (T) this.preferencesMap.remove(key);
    }

    /* JADX INFO: renamed from: j */
    public final <T> void m1487j(@NotNull hq80.C17536a<T> key, T value) {
        key.getClass();
        m1488k(key, value);
    }

    /* JADX INFO: renamed from: k */
    public final void m1488k(@NotNull hq80.C17536a<?> key, @Nullable Object value) {
        key.getClass();
        m1482e();
        if (value == null) {
            m1486i(key);
            return;
        }
        boolean z = value instanceof Set;
        Map<hq80.C17536a<?>, Object> map = this.preferencesMap;
        if (!z) {
            map.put(key, value);
            return;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.toSet((Iterable) value));
        setUnmodifiableSet.getClass();
        map.put(key, setUnmodifiableSet);
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, new Function1<Map.Entry<hq80.C17536a<?>, Object>, CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences.toString.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Map.Entry<hq80.C17536a<?>, Object> entry) {
                entry.getClass();
                return "  " + entry.getKey().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() + " = " + entry.getValue();
            }
        }, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public MutablePreferences(@NotNull Map<hq80.C17536a<?>, Object> map, boolean z) {
        map.getClass();
        this.preferencesMap = map;
        this.frozen = new AtomicBoolean(z);
    }
}

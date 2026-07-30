package com.tantanapp.sharelib.workmanager;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006 "}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Data;", "", "Lcom/tantanapp/sharelib/workmanager/Data$Builder;", "builder", "<init>", "(Lcom/tantanapp/sharelib/workmanager/Data$Builder;)V", "", Constants.KEY_KEY, "", "defaultValue", "b", "(Ljava/lang/String;Z)Z", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", j6f.GPS_DIRECTION_TRUE, "c", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "data", "", "e", "(Lcom/tantanapp/sharelib/workmanager/Data;)V", "toString", "()Ljava/lang/String;", "a", "Lcom/tantanapp/sharelib/workmanager/Data$Builder;", "getBuilder", "()Lcom/tantanapp/sharelib/workmanager/Data$Builder;", "", "Ljava/util/Map;", "values", "Companion", "Builder", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class Data {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Builder builder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> values;

    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Data$Builder;", "", "<init>", "()V", "", Constants.KEY_KEY, "obj", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/Object;)Lcom/tantanapp/sharelib/workmanager/Data$Builder;", "value", "e", "(Ljava/lang/String;Ljava/lang/String;)Lcom/tantanapp/sharelib/workmanager/Data$Builder;", "Lcom/tantanapp/sharelib/workmanager/Data;", "data", "c", "(Lcom/tantanapp/sharelib/workmanager/Data;)Lcom/tantanapp/sharelib/workmanager/Data$Builder;", "a", "()Lcom/tantanapp/sharelib/workmanager/Data;", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "values", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Object> values = new LinkedHashMap();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Data m81538a() {
            return new Data(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Map<String, Object> m81539b() {
            return this.values;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Builder m81540c(@NotNull Data data) {
            data.getClass();
            this.values.putAll(data.values);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Builder m81541d(@NotNull String key, @NotNull Object obj) {
            key.getClass();
            obj.getClass();
            this.values.put(key, obj);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Builder m81542e(@NotNull String key, @NotNull String value) {
            key.getClass();
            value.getClass();
            this.values.put(key, value);
            return this;
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Data$Companion;", "", "<init>", "()V", "Lcom/tantanapp/sharelib/workmanager/Data;", "a", "()Lcom/tantanapp/sharelib/workmanager/Data;", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Data m81543a() {
            return new Builder().m81538a();
        }

        private Companion() {
        }
    }

    public Data(Builder builder) {
        this.builder = builder;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(builder.m81539b());
        this.values = linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m81534b(@NotNull String key, boolean defaultValue) {
        key.getClass();
        Object obj = this.values.get(key);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return bool != null ? bool.booleanValue() : defaultValue;
    }

    /* JADX INFO: renamed from: c */
    public final <T> T m81535c(@NotNull String key, T defaultValue) {
        key.getClass();
        T t = (T) this.values.get(key);
        if (t == null) {
            t = null;
        }
        return t == null ? defaultValue : t;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m81536d(@NotNull String key) {
        key.getClass();
        Object obj = this.values.get(key);
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: e */
    public final void m81537e(@NotNull Data data) {
        data.getClass();
        this.values.putAll(data.values);
    }

    @NotNull
    public String toString() {
        return "Data(values=" + this.values + ')';
    }

    public /* synthetic */ Data(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}

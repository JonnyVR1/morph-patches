package com.p051p1.mobile.putong.api.api;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Meta;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.l4k;
import p153l.r5e;
import p153l.xh3;
import p153l.xi5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u00020\t20\u0010\n\u001a,\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m88121d2 = {"Lcom/p1/mobile/putong/api/api/ClevertapApi;", "Ll/xi5;", "<init>", "()V", "Lkotlin/Function2;", "", "", "", "", "", "call", BaseSei.f14624X, "(Lkotlin/jvm/functions/Function2;)V", "CleverTapProfileInfo", "CleverTapProfileInfoBean", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ClevertapApi extends xi5 {

    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lcom/p1/mobile/putong/api/api/ClevertapApi$CleverTapProfileInfo;", "Ljava/io/Serializable;", "meta", "Lcom/p1/mobile/putong/data/Meta;", "data", "Lcom/p1/mobile/putong/api/api/ClevertapApi$CleverTapProfileInfoBean;", "<init>", "(Lcom/p1/mobile/putong/data/Meta;Lcom/p1/mobile/putong/api/api/ClevertapApi$CleverTapProfileInfoBean;)V", "getMeta", "()Lcom/p1/mobile/putong/data/Meta;", "getData", "()Lcom/p1/mobile/putong/api/api/ClevertapApi$CleverTapProfileInfoBean;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class CleverTapProfileInfo implements Serializable {

        @Nullable
        private final CleverTapProfileInfoBean data;

        @Nullable
        private final Meta meta;

        public CleverTapProfileInfo(@Nullable Meta meta, @Nullable CleverTapProfileInfoBean cleverTapProfileInfoBean) {
            this.meta = meta;
            this.data = cleverTapProfileInfoBean;
        }

        @Nullable
        public final CleverTapProfileInfoBean getData() {
            return this.data;
        }

        @Nullable
        public final Meta getMeta() {
            return this.meta;
        }
    }

    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lcom/p1/mobile/putong/api/api/ClevertapApi$CleverTapProfileInfoBean;", "Ljava/io/Serializable;", "profile", "", "", "", "removedKeys", "", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getProfile", "()Ljava/util/Map;", "getRemovedKeys", "()Ljava/util/List;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class CleverTapProfileInfoBean implements Serializable {

        @Nullable
        private final Map<String, Object> profile;

        @Nullable
        private final List<String> removedKeys;

        public CleverTapProfileInfoBean(@Nullable Map<String, Object> map, @Nullable List<String> list) {
            this.profile = map;
            this.removedKeys = list;
        }

        @Nullable
        public final Map<String, Object> getProfile() {
            return this.profile;
        }

        @Nullable
        public final List<String> getRemovedKeys() {
            return this.removedKeys;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m30516x(@NotNull Function2<? super Map<String, ? extends Object>, ? super List<String>, Unit> call) {
        call.getClass();
        xh3.m210980d(l4k.INSTANCE, r5e.m179861b(), null, new ClevertapApi$fetchProfile$1(call, null), 2, null);
    }
}

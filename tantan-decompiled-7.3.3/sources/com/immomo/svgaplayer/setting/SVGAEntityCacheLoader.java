package com.immomo.svgaplayer.setting;

import com.clevertap.android.sdk.Constants;
import com.immomo.svgaplayer.SVGAVideoEntity;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0005R6\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m88121d2 = {"Lcom/immomo/svgaplayer/setting/SVGAEntityCacheLoader;", "", "()V", "mCache", "Ljava/util/LinkedHashMap;", "", "Ljava/lang/ref/WeakReference;", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "Lkotlin/collections/LinkedHashMap;", "mMaxSize", "", "addCache", "", Constants.KEY_KEY, "entity", "getEntity", "Companion", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public final class SVGAEntityCacheLoader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static SVGAEntityCacheLoader instance;
    private LinkedHashMap<String, WeakReference<SVGAVideoEntity>> mCache;
    private int mMaxSize;

    private SVGAEntityCacheLoader() {
        this.mCache = new LinkedHashMap<>(11, 0.75f, true);
        this.mMaxSize = SVGAAdapterContainer.INSTANCE.getMMaxSize();
    }

    public final synchronized void addCache(@NotNull String key, @NotNull SVGAVideoEntity entity) {
        key.getClass();
        entity.getClass();
        this.mCache.put(key, new WeakReference<>(entity));
        if (this.mCache.size() >= this.mMaxSize) {
            this.mCache.remove(this.mCache.entrySet().iterator().next().getKey());
        }
    }

    @Nullable
    public final synchronized SVGAVideoEntity getEntity(@NotNull String key) {
        key.getClass();
        if (this.mCache.size() != 0 && this.mCache.get(key) != null) {
            WeakReference<SVGAVideoEntity> weakReference = this.mCache.get(key);
            return weakReference != null ? weakReference.get() : null;
        }
        return null;
    }

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m88121d2 = {"Lcom/immomo/svgaplayer/setting/SVGAEntityCacheLoader$Companion;", "", "()V", "instance", "Lcom/immomo/svgaplayer/setting/SVGAEntityCacheLoader;", "get", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final SVGAEntityCacheLoader get() {
            if (SVGAEntityCacheLoader.instance == null) {
                synchronized (Reflection.m88396b(SVGAEntityCacheLoader.class)) {
                    try {
                        if (SVGAEntityCacheLoader.instance == null) {
                            SVGAEntityCacheLoader.instance = new SVGAEntityCacheLoader(null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            SVGAEntityCacheLoader sVGAEntityCacheLoader = SVGAEntityCacheLoader.instance;
            if (sVGAEntityCacheLoader == null) {
                Intrinsics.m88386m();
            }
            return sVGAEntityCacheLoader;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SVGAEntityCacheLoader(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

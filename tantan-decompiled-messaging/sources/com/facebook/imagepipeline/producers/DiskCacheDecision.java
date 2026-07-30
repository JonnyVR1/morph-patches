package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.yg3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Lcom/facebook/imagepipeline/producers/DiskCacheDecision;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/yg3;", "smallDiskCache", "defaultDiskCache", "", "", "dynamicDiskCaches", "a", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ll/yg3;Ll/yg3;Ljava/util/Map;)Ll/yg3;", "DiskCacheDecisionNoDiskCacheChosenException", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class DiskCacheDecision {

    @NotNull
    public static final DiskCacheDecision INSTANCE = new DiskCacheDecision();

    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/facebook/imagepipeline/producers/DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class DiskCacheDecisionNoDiskCacheChosenException extends Exception {
        public DiskCacheDecisionNoDiskCacheChosenException(@Nullable String str) {
            super(str);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final yg3 m8468a(@NotNull ImageRequest imageRequest, @Nullable yg3 smallDiskCache, @Nullable yg3 defaultDiskCache, @Nullable Map<String, yg3> dynamicDiskCaches) {
        String strM8569g;
        imageRequest.getClass();
        if (imageRequest.m8566d() == ImageRequest.CacheChoice.SMALL) {
            return smallDiskCache;
        }
        if (imageRequest.m8566d() == ImageRequest.CacheChoice.DEFAULT) {
            return defaultDiskCache;
        }
        if (imageRequest.m8566d() != ImageRequest.CacheChoice.DYNAMIC || dynamicDiskCaches == null || (strM8569g = imageRequest.m8569g()) == null) {
            return null;
        }
        return dynamicDiskCaches.get(strM8569g);
    }
}

package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.mh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Lcom/facebook/imagepipeline/producers/DiskCacheDecision;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/mh3;", "smallDiskCache", "defaultDiskCache", "", "", "dynamicDiskCaches", "a", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ll/mh3;Ll/mh3;Ljava/util/Map;)Ll/mh3;", "DiskCacheDecisionNoDiskCacheChosenException", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class DiskCacheDecision {

    @NotNull
    public static final DiskCacheDecision INSTANCE = new DiskCacheDecision();

    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/facebook/imagepipeline/producers/DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class DiskCacheDecisionNoDiskCacheChosenException extends Exception {
        public DiskCacheDecisionNoDiskCacheChosenException(@Nullable String str) {
            super(str);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final mh3 m8522a(@NotNull ImageRequest imageRequest, @Nullable mh3 smallDiskCache, @Nullable mh3 defaultDiskCache, @Nullable Map<String, mh3> dynamicDiskCaches) {
        String strM8623g;
        imageRequest.getClass();
        if (imageRequest.m8620d() == ImageRequest.CacheChoice.SMALL) {
            return smallDiskCache;
        }
        if (imageRequest.m8620d() == ImageRequest.CacheChoice.DEFAULT) {
            return defaultDiskCache;
        }
        if (imageRequest.m8620d() != ImageRequest.CacheChoice.DYNAMIC || dynamicDiskCaches == null || (strM8623g = imageRequest.m8623g()) == null) {
            return null;
        }
        return dynamicDiskCaches.get(strM8623g);
    }
}

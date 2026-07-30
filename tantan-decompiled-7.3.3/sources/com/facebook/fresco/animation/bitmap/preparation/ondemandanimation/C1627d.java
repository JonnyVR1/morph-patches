package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.f23;
import p153l.h4j;
import p153l.kr0;
import p153l.oyj0;
import p153l.xc80;

/* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, m88121d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/d;", "", "Ll/xc80;", "platformBitmapFactory", "", "maxFpsRender", "bufferLengthMilliseconds", "<init>", "(Ll/xc80;II)V", "", "cacheKey", "Ll/f23;", "bitmapFrameRenderer", "Ll/kr0;", "animationInformation", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "b", "(Ljava/lang/String;Ll/f23;Ll/kr0;)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "a", "Ll/xc80;", "I", "c", "Companion", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C1627d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ConcurrentHashMap<String, oyj0> f6431d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final xc80 platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int maxFpsRender;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int bufferLengthMilliseconds;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.d$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/d$a;", "", "<init>", "()V", "", "cacheKey", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "frameLoader", "", "b", "(Ljava/lang/String;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;)V", "Ljava/util/Date;", "until", "a", "(Ljava/util/Date;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Ll/oyj0;", "UNUSED_FRAME_LOADERS", "Ljava/util/concurrent/ConcurrentHashMap;", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m8415a(@NotNull Date until) {
            until.getClass();
            synchronized (C1627d.f6431d) {
                try {
                    ConcurrentHashMap concurrentHashMap = C1627d.f6431d;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((oyj0) entry.getValue()).getInsertedTime().compareTo(until) < 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        ((oyj0) entry2.getValue()).getFrameLoader().clear();
                        C1627d.f6431d.remove(entry2.getKey());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m8416b(@NotNull String cacheKey, @NotNull InterfaceC1626c frameLoader) {
            cacheKey.getClass();
            frameLoader.getClass();
            C1627d.f6431d.put(cacheKey, new oyj0(frameLoader, new Date()));
        }

        public Companion() {
        }
    }

    public C1627d(@NotNull xc80 xc80Var, int i, int i2) {
        xc80Var.getClass();
        this.platformBitmapFactory = xc80Var;
        this.maxFpsRender = i;
        this.bufferLengthMilliseconds = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC1626c m8414b(@NotNull String cacheKey, @NotNull f23 bitmapFrameRenderer, @NotNull kr0 animationInformation) {
        cacheKey.getClass();
        bitmapFrameRenderer.getClass();
        animationInformation.getClass();
        ConcurrentHashMap<String, oyj0> concurrentHashMap = f6431d;
        synchronized (concurrentHashMap) {
            oyj0 oyj0Var = concurrentHashMap.get(cacheKey);
            if (oyj0Var == null) {
                Unit unit = Unit.INSTANCE;
                return new C1625b(this.platformBitmapFactory, bitmapFrameRenderer, new h4j(this.maxFpsRender), animationInformation, this.bufferLengthMilliseconds);
            }
            concurrentHashMap.remove(cacheKey);
            return oyj0Var.getFrameLoader();
        }
    }
}

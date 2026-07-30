package com.hellogroup.p036mk.core.pkg;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a6k0;
import p153l.jzv;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b\u0016\u0010\u0017R'\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Lcom/hellogroup/mk/core/pkg/WebViewPkgInfoCache;", "", "<init>", "()V", "", "url", "bid", "baseVersion", "Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;", "checkPolicy", "Ll/zgi;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;)Ll/zgi;", "b", "(Ljava/lang/String;Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;)Ll/zgi;", "c", "", Constants.INAPP_DATA_TAG, "()Ljava/util/List;", "", "deletePkgs", "", "a", "(Ljava/util/List;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Lazy;", "e", "()Ljava/util/concurrent/ConcurrentHashMap;", "pkgInfoCache", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class WebViewPkgInfoCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy pkgInfoCache = LazyKt__LazyJVMKt.m88118b(new Function0<ConcurrentHashMap<String, zgi>>() { // from class: com.hellogroup.mk.core.pkg.WebViewPkgInfoCache$pkgInfoCache$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ConcurrentHashMap<String, zgi> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    /* JADX INFO: renamed from: e */
    private final ConcurrentHashMap<String, zgi> m18484e() {
        return (ConcurrentHashMap) this.pkgInfoCache.getValue();
    }

    /* JADX INFO: renamed from: f */
    private final zgi m18485f(String url, String bid, String baseVersion, CheckPolicy checkPolicy) {
        Pair<String, String> pairM96330b = a6k0.m96330b(url, bid);
        String first = pairM96330b.getFirst();
        String second = pairM96330b.getSecond();
        if (second != null) {
            baseVersion = second;
        }
        if (baseVersion == null || StringsKt.m94329e0(baseVersion)) {
            baseVersion = "default";
        }
        if (first != null && !StringsKt.m94329e0(first)) {
            zgi zgiVar = m18484e().get(first + baseVersion);
            if (zgiVar != null) {
                return zgiVar;
            }
            zgi zgiVarM17592n = FepManager.INSTANCE.m17610a().m17592n(first, baseVersion, url, checkPolicy);
            if (zgiVarM17592n != null) {
                m18484e().put(first + baseVersion, zgiVarM17592n);
                return zgiVarM17592n;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ zgi m18486g(WebViewPkgInfoCache webViewPkgInfoCache, String str, String str2, String str3, CheckPolicy checkPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            checkPolicy = CheckPolicy.LOCAL_ONLY;
        }
        return webViewPkgInfoCache.m18485f(str, str2, str3, checkPolicy);
    }

    /* JADX INFO: renamed from: a */
    public final void m18487a(@NotNull List<zgi> deletePkgs) {
        deletePkgs.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            for (zgi zgiVar : deletePkgs) {
                m18484e().remove(zgiVar.getBid() + zgiVar.getBaseVersion());
                jzv.m147734g("WebViewPkgInfoCache", "delete bid=" + zgiVar.getBid() + "  baseVersion=" + zgiVar.getBaseVersion());
            }
            Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final zgi m18488b(@Nullable String url, @NotNull CheckPolicy checkPolicy) {
        checkPolicy.getClass();
        if (url != null) {
            return m18486g(this, url, null, null, checkPolicy, 6, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final zgi m18489c(@Nullable String url, @Nullable String bid, @Nullable String baseVersion, @NotNull CheckPolicy checkPolicy) {
        checkPolicy.getClass();
        return m18485f(url, bid, baseVersion, checkPolicy);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<zgi> m18490d() {
        Collection<zgi> collectionValues = m18484e().values();
        collectionValues.getClass();
        return CollectionsKt.toMutableList((Collection) collectionValues);
    }
}

package com.hellogroup.fep.base.core;

import com.hellogroup.fep.feppkg.core.FepPackageManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jgi;
import p153l.zgi;

/* JADX INFO: renamed from: com.hellogroup.fep.base.core.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lcom/hellogroup/fep/base/core/b;", "Ll/jgi;", "<init>", "()V", "", "bid", "baseVersion", "urlString", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
final class C3493b implements jgi {
    @Override // p153l.jgi
    @Nullable
    /* JADX INFO: renamed from: a */
    public Long mo17612a(@NotNull String bid, @Nullable String baseVersion, @NotNull String urlString) {
        bid.getClass();
        urlString.getClass();
        zgi zgiVarM17665m = FepPackageManager.INSTANCE.m17673a().m17665m(urlString, CheckPolicy.LOCAL_ONLY);
        if (zgiVarM17665m != null) {
            return Long.valueOf(zgiVarM17665m.m219624g());
        }
        return null;
    }
}

package com.hellogroup.fep.base.core;

import com.heytap.mcssdk.mode.CommandMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.agi;
import p153l.rk20;

/* JADX INFO: renamed from: com.hellogroup.fep.base.core.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, m88121d2 = {"Lcom/hellogroup/fep/base/core/a;", "Ll/agi;", "Ll/rk20;", "provider", "<init>", "(Ll/rk20;)V", "", "url", "", CommandMessage.PARAMS, "a", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Ll/rk20;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
final class C3492a implements agi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final rk20 provider;

    public C3492a(@NotNull rk20 rk20Var) {
        rk20Var.getClass();
        this.provider = rk20Var;
    }

    @Override // p153l.agi
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo17611a(@NotNull String url, @Nullable Map<String, String> params) {
        url.getClass();
        rk20 rk20Var = this.provider;
        if (params == null) {
            params = MapsKt.emptyMap();
        }
        return rk20Var.mo130066a(url, params, null);
    }
}

package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\b"}, m87232d2 = {"Lcom/appsflyer/internal/AFj1uSDK;", "", "", "", "getMediationNetwork", "()Ljava/util/Map;", "", "getRevenue", "()V", "getCurrencyIso4217Code", "AFa1zSDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public interface AFj1uSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1uSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion getMonetizationNetwork = new Companion();

        private Companion() {
        }
    }

    void getCurrencyIso4217Code();

    @NotNull
    Map<String, Object> getMediationNetwork();

    void getRevenue();
}
